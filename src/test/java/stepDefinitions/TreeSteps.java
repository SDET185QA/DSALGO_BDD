package stepDefinitions;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.TreePOF;
import utilities.ConfigReader;
import utilities.ExcelReader;
import utilities.LoggerLoad;

public class TreeSteps {

	TreePOF TPOF = new TreePOF();
	String TreeHomePageTitle = "NumpyNinja";
	String PythonCode;
	String Output;
	String ExpectedResult,ExpectedError,ExpectedMsg;
	String Excelpath=ConfigReader.getexcelfilepath();


	@Given("The user is on the home page of DS-ALGO Portal")
	public void the_user_is_on_the_home_page_of_ds_algo_portal() {
		LoggerLoad.info("The user is on user ds-algo page and click on the drop down menu");
		TPOF.dropDownClick();
	}
	@When("The user select the drop down option and select the tree option")
	public void the_user_select_the_drop_down_option_and_select_the_tree_option() {
		TPOF.treeDropClick();
		LoggerLoad.info("The user succesfully clicked on the dropdown for data structures");
	}
	@Then("The user lands in the Trees Datastructure page with title {string}")
	public void the_user_lands_in_the_trees_datastructure_page_with_title(String expectedArrayPageTitle) {
		LoggerLoad.info("The user succesfully clicked on the Array option for data structures dropdown");

		String actualTitle =TPOF.getpageTitle();
		LoggerLoad.info("Page Title is " +actualTitle);

		assertEquals(actualTitle,expectedArrayPageTitle,"User is redirected to another page");
		LoggerLoad.info("The user succesfully clicked on the Tree option for data structures dropdown");
	}

	@Given("The user is on the DSAlgo Home page")
	public void the_user_is_on_the_ds_algo_home_page() {
		LoggerLoad.info("The user on home page after successfully logged inn");
	}

	@When("User click on the Tree Get Started button")
	public void user_click_on_the_tree_get_started_button() {
		TPOF.ClickTreeGS(); 
	}

	@Then("User is on Tree page and verify tittle as {string}")
	public void user_is_on_tree_page_and_verify_tittle_as(String ExpectedPageTitle) {
		String actualPageTitle = TPOF.getpageTitle();
		LoggerLoad.info("-----User is redirected to the Tree page----");
		Assert.assertEquals(ExpectedPageTitle, actualPageTitle);

	}

	@Given("The user is on {string} page")
	public void the_user_is_on_page(String ExpectedTitle) {
		TPOF.ClickTreeGS(); 
		String actualPageTitle = TPOF.getpageTitle();
		LoggerLoad.info("-----User is on the Tree page----");
		Assert.assertEquals(ExpectedTitle, actualPageTitle);
	}


	@When("The user clicks on the Overview of Trees link")
	public void the_user_clicks_on_the_overview_of_trees_link() {
		LoggerLoad.info("-----User clicks on the Overview of Trees link----");
		TPOF.ClickOverview();
	}

	@Then("The user is redirected to the {string}  Page")
	public void the_user_is_redirected_to_the_page(String ExpectedPageTitle) {
		String actualPageTitle = TPOF.getpageTitle();
		LoggerLoad.info("-----User is redirected to the Tree page----");
		Assert.assertEquals(ExpectedPageTitle, actualPageTitle);
	}

	@Given("The user is on the Overview of Trees page")
	public void the_user_is_on_the_overview_of_trees_page() {
		LoggerLoad.info("-----User is on the Overview of Trees page----");
		TPOF.ClickTreeGS(); 
		TPOF.ClickOverview();
	}

	@When("The user clicks tryhere button on Overview of Trees page")
	public void the_user_clicks__tryhere_button_on_overview_of_trees_page() {
		LoggerLoad.info("-----User clicks on TryHere button----");
		TPOF.ClickTryhereLink();;
	}


	@Then("The user is redirected to tryEditor page with Run button")
	public void the_user_is_redirected_to_try_editor_page_with_run_button() {
		LoggerLoad.info("-----User is redirected to the TryEditor page----");
	}

	@Given("User is on the {string} of Overview of Trees page")
	public void user_is_on_the_of_overview_of_trees_page(String pagename) {
		String page_name=pagename.replaceAll("\\s+", "");
		TPOF.navigateTo(page_name);
		LoggerLoad.info("User is on the "+pagename + " after logged in");
	}

	@When("User enters valid Python code from the sheet {string} and {int}")
	public void user_enters_valid_python_code_from_the_sheet_and(String SheetName, Integer RowNumber) throws InvalidFormatException, IOException {
		LoggerLoad.info("User is on Try Editor page");
		ExcelReader reader = new ExcelReader();

		List<Map<String, String>> testdata = reader.getData(Excelpath, SheetName);
		LoggerLoad.info(SheetName);
		PythonCode = testdata.get(RowNumber).get("PythonCode");
		ExpectedResult=testdata.get(RowNumber).get("Output");
		LoggerLoad.info("Expected Result is "+ExpectedResult);
		LoggerLoad.info("User enters PythonCode as \" " + PythonCode);

		if ( PythonCode!= null )
			TPOF.fetchPythonCode(PythonCode);
	}

	@When("User clicks on the Run button")
	public void user_clicks_on_the_run_button() throws InterruptedException {
		LoggerLoad.info("User clicks on Run Button");
		TPOF.clickRunBtn();
	}

	@Then("User should be able to see the valid output")
	public void user_should_be_able_to_see_the_valid_output() {
		LoggerLoad.info("User gets the Result of entered Python Code");
		String fetchOutput = TPOF.fetchOutput();

		LoggerLoad.info("Displayed Result is "+fetchOutput);
		assertEquals(fetchOutput,ExpectedResult,"Expected and actual result  matches");
	}
	@When("User enters invalid Python code from the sheet {string} and {int}")
	public void user_enters_invalid_python_code_from_the_sheet_and(String SheetName, Integer RowNumber) throws InvalidFormatException, IOException, InterruptedException {

		LoggerLoad.info("User is on Try Editor page");
		ExcelReader reader = new ExcelReader();

		List<Map<String, String>> testdata = reader.getData(Excelpath, SheetName);
		PythonCode = testdata.get(RowNumber).get("PythonCode");
		ExpectedResult=testdata.get(RowNumber).get("Output");
		LoggerLoad.info("Expected Result is "+ExpectedResult);

		LoggerLoad.info("User enters PythonCode as \" " + PythonCode);
		if ( PythonCode!= null )
			TPOF.fetchPythonCode(PythonCode);

	}


	@Then("User should be able to see the error message")
	public void user_should_be_able_to_see_the_error_message() {

		LoggerLoad.info("User gets the error message in an Alert");
		String actualError = TPOF.fetchErrorMessage();
		String ExpectedError="NameError: name 'hello' is not defined on line 1";
		LoggerLoad.info("Displayed Error Message  is "+actualError);
		assertEquals(actualError,ExpectedError,"Invalid Syntax error message");


	}
	@When("The user clicks on the Terminologies link")
	public void the_user_clicks_on_the_terminologies_link() {
		TPOF.ClickTerminology();
	}

	@Given("The user is on Terminologies of Tree page")
	public void the_user_is_the_terminologies_of_tree_page() {
		LoggerLoad.info("-----User is on the Terminologies page----");
		TPOF.ClickTreeGS(); 
		TPOF.ClickTerminology();
	}

	@When("The user clicks tryhere button on Terminologies page")
	public void the_user_clicks_tryhere_button_on_terminologies_page() {

		TPOF.ClickTryhereLink();
	}
	@Given("User is on the {string} of Terminologies page")
	public void user_is_on_the_of_terminologies_page(String pagename) {
		String page_name=pagename.replaceAll("\\s+", "");
		TPOF.navigateTo(page_name);
		LoggerLoad.info("User is on the "+pagename + " after logged in");
	}

	@When("The user clicks on the Types of Trees link")
	public void the_user_clicks_on_the_types_of_trees_link() {
		TPOF.ClickTypesOFTree();
	}

	@Given("The user is on the Types of Trees of Tree page")
	public void the_user_is_on_the_types_of_trees_of_tree_page() {
		LoggerLoad.info("-----User is on the  Types Trees of Tree page----");
		TPOF.ClickTreeGS(); 
		TPOF.ClickTypesOFTree();
	}

	@When("The user clicks tryhere button on Types of Trees page")
	public void the_user_clicks_tryhere_button_on_types_of_trees_page() {

		TPOF.ClickTryhereLink();
	}

	@Given("User is on the {string} of Types of Trees page")
	public void user_is_on_the_of_types_of_trees_page(String pagename) {
		String page_name=pagename.replaceAll("\\s+", "");
		TPOF.navigateTo(page_name);
		LoggerLoad.info("User is on the "+pagename + " after logged in");
	}

	@When("The user clicks on the Tree Traversals link")
	public void the_user_clicks_on_the_tree_traversals_link() {
		TPOF.ClickTreeTraversal();
	}

	@Given("The user is on the Tree Traversals of Tree page")
	public void the_user_is_on_the_tree_traversals_of_tree_page() {
		LoggerLoad.info("-----User is on the  Tree Traversals of Tree page----");
		TPOF.ClickTreeGS(); 
		TPOF.ClickTreeTraversal();
	}

	@When("The user clicks tryhere button on Tree Traversals page")
	public void the_user_clicks_tryhere_button_on_tree_traversalspage() {

		TPOF.ClickTryhereLink();
	}


	@Given("User is on the {string} of Tree Traversals page")
	public void user_is_on_the_of_tree_traversals_page(String pagename) {
		String page_name=pagename.replaceAll("\\s+", "");
		TPOF.navigateTo(page_name);
		LoggerLoad.info("User is on the "+pagename + " after logged in");
	}

	@When("The user clicks on the Traversal illustration link")
	public void the_user_clicks_on_the_traversal_illustration_link() {
		TPOF.ClickTraveIllustrate();;
	}
	@Given("The user is on the Traversals-Illustration of Tree page")
	public void the_user_is_on_the_traversals_illustration_of_tree_page() {
		TPOF.ClickTreeGS(); 
		TPOF.ClickTraveIllustrate();
		LoggerLoad.info("-----User is on the  Traversals-Illustration of Tree page----");
	}
	@When("The user clicks tryhere button on Tree traversal illustration page")
	public void the_user_clicks_tryhere_button_on_tree_traversal_illustration_page() {
		TPOF.ClickTryhereLink();
	}

	@Given("User is on the {string} of Traversals-Illustration page")
	public void user_is_on_the_of_traversals_illustration_page(String pagename) {
		String page_name=pagename.replaceAll("\\s+", "");
		TPOF.navigateTo(page_name);
		LoggerLoad.info("User is on the "+pagename + " after logged in");
	}
	@When("The user clicks on the Binary Trees link")
	public void the_user_clicks_on_the_binary_trees_link() {
		TPOF.ClickBinaryTree();
	}

	@Given("The user is on the Binary Trees of Tree page")
	public void the_user_is_on_the_binary_trees_of_tree_page() {
		LoggerLoad.info("-----User is on the  Binary Trees of Tree page----");
		TPOF.ClickTreeGS(); 
		TPOF.ClickBinaryTree();
	}
	@When("The user clicks tryhere button on Binary Trees  page")
	public void the_user_clicks_tryhere_button_on_binary_trees_page() {

		TPOF.ClickTryhereLink();
	}
	@Given("User is on the {string} of Binary Trees page")
	public void user_is_on_the_of_binary_trees_page(String pagename) {
		String page_name=pagename.replaceAll("\\s+", "");
		TPOF.navigateTo(page_name);
		LoggerLoad.info("User is on the "+pagename + " after logged in");
	}

	@When("The user clicks on theTypes of Binary trees link")
	public void the_user_clicks_on_the_types_of_binary_trees_link() {
		TPOF.ClickTypesOfBinary();
	}

	@Given("The user is on the Types of Binary trees of Tree page")
	public void the_user_is_on_the_types_of_binary_trees_of_tree_page() {
		LoggerLoad.info("-----User is on the Types of Binary Trees of Tree page----");
		TPOF.ClickTreeGS(); 
		TPOF.ClickTypesOfBinary();
	}

	@When("The user clicks tryhere button on Types of Binary trees page")
	public void the_user_clicks_tryhere_button_on_types_of_binary_trees_page() {

		TPOF.ClickTryhereLink();
	}

	@Given("User is on the {string} of Types of Binary trees page")
	public void user_is_on_the_of_types_of_binary_trees_page(String pagename) {
		String page_name=pagename.replaceAll("\\s+", "");
		TPOF.navigateTo(page_name);
		LoggerLoad.info("User is on the "+pagename + " after logged in");
	}

	@When("The user clicks on the Implementation in Python link")
	public void the_user_clicks_on_the_implementation_in_python_link() {
		TPOF.ClickImplementPython();
	}

	@Given("The user is on the Implementation in Python of Tree page")
	public void the_user_is_on_the_implementation_in_python_of_tree_page() {
		LoggerLoad.info("-----User is on the Implementation in Python of Tree page----");
		TPOF.ClickTreeGS(); 
		TPOF.ClickImplementPython();
	}
	@When("The user clicks tryhere button on Implementation in Python page")
	public void the_user_clicks_tryhere_button_on_implementation_in_python_page() {

		TPOF.ClickTryhereLink();
	}

	@Given("User is on the {string} of Implementation in Python page")
	public void user_is_on_the_of_implementation_in_python_page(String pagename) {
		String page_name=pagename.replaceAll("\\s+", "");
		TPOF.navigateTo(page_name);
		LoggerLoad.info("User is on the "+pagename + " after logged in");
	}

	@When("The user clicks on the Binary Tree Traversals link")
	public void the_user_clicks_on_the_binary_tree_traversals_link() {
		TPOF.ClickBTTraverse();
	}

	@Given("The user is on the Binary Tree Traversals of Tree page")
	public void the_user_is_on_the_binary_tree_traversals_of_tree_page() {
		LoggerLoad.info("-----User is on the Binary Tree Traversals of Tree page----");
		TPOF.ClickTreeGS(); 
		TPOF.ClickBTTraverse();
	}
	@When("The user clicks tryhere button on Binary Tree Traversals page")
	public void the_user_clicks_tryhere_button_on_binary_tree_traversals_page() {

		TPOF.ClickTryhereLink();
	}

	@Given("User is on the {string} of Binary Tree Traversals  page")
	public void user_is_on_the_of_binary_tree_traversals_page(String pagename) {
		String page_name=pagename.replaceAll("\\s+", "");
		TPOF.navigateTo(page_name);
		LoggerLoad.info("User is on the "+pagename + " after logged in");
	}

	@When("The user clicks on the Implementation of Binary Trees link")
	public void the_user_clicks_on_the_implementation_of_binary_trees_link() {
		TPOF.ClickImplementBT();
	}
	@Given("The user is on the Implementation of Binary Trees of Tree page")
	public void the_user_is_on_the_implementation_of_binary_trees_of_tree_page() {
		TPOF.ClickTreeGS(); 
		TPOF.ClickImplementBT();

	}
	@When("The user clicks tryhere button on Implementation of Binary Trees page")
	public void the_user_clicks_tryhere_button_on_implementation_of_binary_trees_page() {
		LoggerLoad.info("-----User is on the Implementation of Binary Trees of Tree page----");
		TPOF.ClickTryhereLink();
	}

	@Given("User is on the {string} of Implementation of Binary Trees  page")
	public void user_is_on_the_of_implementation_of_binary_trees_page(String pagename) {
		String page_name=pagename.replaceAll("\\s+", "");
		TPOF.navigateTo(page_name);
		LoggerLoad.info("User is on the "+pagename + " after logged in");
	}

	@When("The user clicks on the Applications of Binary Trees link")
	public void the_user_clicks_on_the_applications_of_binary_trees_link() {
		TPOF.ClickAppsOfBT();
	}

	@Given("The user is on the Applications of Binary Trees of Tree page")
	public void the_user_is_on_the_applications_of_binary_trees_of_tree_page() {
		LoggerLoad.info("-----User is on the Applications of Binary Trees of Tree page----");
		TPOF.ClickTreeGS(); 
		TPOF.ClickAppsOfBT();
	}
	@When("The user clicks tryhere button on Applications of Binary Trees page")
	public void the_user_clicks_tryhere_button_on_applications_of_binary_trees_page() {

		TPOF.ClickTryhereLink();
	}
	@Given("User is on the {string} of Applications of Binary Trees  page")
	public void user_is_on_the_of_applications_of_binary_trees_page(String pagename) {
		String page_name=pagename.replaceAll("\\s+", "");
		TPOF.navigateTo(page_name);
		LoggerLoad.info("User is on the "+pagename + " after logged in");
	}

	@When("The user clicks on the Binary Search Trees link")
	public void the_user_clicks_on_the_binary_search_trees_link() {
		TPOF.ClickBinarySearchTree();;

	}

	@Given("The user is on the Binary Search Trees of Tree page")
	public void the_user_is_on_the_binary_search_trees_of_tree_page() {
		LoggerLoad.info("-----User is on the Binary Search Trees of Tree page----");
		TPOF.ClickTreeGS(); 
		TPOF.ClickBinarySearchTree();;
	}
	@When("The user clicks tryhere button on Binary Search Trees page")
	public void the_user_clicks_tryhere_button_on_binary_search_trees_page() {

		TPOF.ClickTryhereLink();
	}
	@Given("User is on the {string} of Binary Search Trees  page")
	public void user_is_on_the_of_binary_search_trees_page(String pagename) {
		String page_name=pagename.replaceAll("\\s+", "");
		TPOF.navigateTo(page_name);
		LoggerLoad.info("User is on the "+pagename + " after logged in");
	}

	@When("The user clicks on the Implementation of BST link")
	public void the_user_clicks_on_the_implementation_of_bst_link() {
		TPOF.ClickImplementBST();;
	}
	@Given("The user is on the Implementation of BST of Tree page")
	public void the_user_is_on_the_implementation_of_bst_of_tree_page() {
		LoggerLoad.info("-----User is on the Implementation of BST of Tree page----");
		TPOF.ClickTreeGS(); 
		TPOF.ClickImplementBST();
	}
	@When("The user clicks tryhere button on Implementation of BST page")
	public void the_user_clicks_tryhere_button_on_implementation_of_bst_page() {

		TPOF.ClickTryhereLink();
	}
	@Given("User is on the {string} of Implementation of BST  page")
	public void user_is_on_the_of_implementation_of_bst_page(String pagename) {
		String page_name=pagename.replaceAll("\\s+", "");
		TPOF.navigateTo(page_name);
		LoggerLoad.info("User is on the "+pagename + " after logged in");
	}



}