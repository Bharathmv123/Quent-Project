import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://ec2-34-194-6-57.compute-1.amazonaws.com/quent-pre-user-trail/#/auth-flow/auth/login')

WebUI.click(findTestObject('Object Repository/Institution - Positive/Page_QuentPreUserTrail/img'))

WebUI.click(findTestObject('Object Repository/Institution - Positive/Page_QuentPreUserTrail/span_91'))

WebUI.setText(findTestObject('Object Repository/Institution - Positive/Page_QuentPreUserTrail/input__login-phonenumber'), 
    '9022351287')

WebUI.setEncryptedText(findTestObject('Object Repository/Institution - Positive/Page_QuentPreUserTrail/input__login-password'), 
    'cvW8qx4B2o3F4VwP/kNsqA==')

WebUI.click(findTestObject('Object Repository/Institution - Positive/Page_QuentPreUserTrail/button_Login'))

WebUI.click(findTestObject('Object Repository/Institution - Positive/Page_QuentPreUserTrail/p_Institution'))

WebUI.setText(findTestObject('Object Repository/Institution - Positive/Page_QuentPreUserTrail/input_Search_mat-input-5'), 
    'nst')

WebUI.click(findTestObject('Object Repository/Institution - Positive/Page_QuentPreUserTrail/button_Search'))

WebUI.click(findTestObject('Object Repository/Institution - Positive/Page_QuentPreUserTrail/button_Clear'))

WebUI.setText(findTestObject('Object Repository/Institution - Positive/Page_QuentPreUserTrail/input_Search_mat-input-5'), 
    'chetan')

WebUI.click(findTestObject('Object Repository/Institution - Positive/Page_QuentPreUserTrail/button_Search'))

WebUI.click(findTestObject('Object Repository/Institution - Positive/Page_QuentPreUserTrail/button_Clear'))

WebUI.setText(findTestObject('Object Repository/Institution - Positive/Page_QuentPreUserTrail/input_Search_mat-input-5'), 
    'albania')

WebUI.click(findTestObject('Object Repository/Institution - Positive/Page_QuentPreUserTrail/button_Search'))

WebUI.click(findTestObject('Object Repository/Institution - Positive/Page_QuentPreUserTrail/span_Clear'))

WebUI.click(findTestObject('Object Repository/Institution - Positive/Page_QuentPreUserTrail/div_ALL_mat-select-arrow-wrapper ng-tns-c121-21'))

WebUI.click(findTestObject('Object Repository/Institution - Positive/Page_QuentPreUserTrail/span_ACTIVE'))

WebUI.click(findTestObject('Object Repository/Institution - Positive/Page_QuentPreUserTrail/span_Search'))

WebUI.click(findTestObject('Object Repository/Institution - Positive/Page_QuentPreUserTrail/div_ALL_mat-select-arrow-wrapper ng-tns-c121-21'))

WebUI.click(findTestObject('Object Repository/Institution - Positive/Page_QuentPreUserTrail/span_INACTIVE'))

WebUI.click(findTestObject('Object Repository/Institution - Positive/Page_QuentPreUserTrail/button_Search'))

WebUI.click(findTestObject('Object Repository/Institution - Positive/Page_QuentPreUserTrail/div_ALL_mat-select-arrow-wrapper ng-tns-c121-21'))

WebUI.click(findTestObject('Object Repository/Institution - Positive/Page_QuentPreUserTrail/span_ALL'))

WebUI.click(findTestObject('Object Repository/Institution - Positive/Page_QuentPreUserTrail/button_Search'))

WebUI.click(findTestObject('Object Repository/Institution - Positive/Page_QuentPreUserTrail/div_Select Country_mat-select-arrow-wrapper_2d8b83'))

WebUI.click(findTestObject('Object Repository/Institution - Positive/Page_QuentPreUserTrail/span_Albania'))

WebUI.click(findTestObject('Object Repository/Institution - Positive/Page_QuentPreUserTrail/button_Search'))

WebUI.click(findTestObject('Object Repository/Institution - Positive/Page_QuentPreUserTrail/button_Clear'))

//WebUI.click(findTestObject('Object Repository/Institution - Positive/Page_QuentPreUserTrail/div_Select State_mat-select-arrow-wrapper n_ae98ce'))

//WebUI.click(findTestObject('Object Repository/Institution - Positive/Page_QuentPreUserTrail/div_page_cdk-overlay-backdrop cdk-overlay-t_bba1d9'))

WebUI.click(findTestObject('Object Repository/Institution - Positive/Page_QuentPreUserTrail/div_Select City_mat-select-arrow-wrapper ng_ffc4bd'))

WebUI.click(findTestObject('Object Repository/Institution - Positive/Page_QuentPreUserTrail/div_Select City_mat-select-arrow ng-tns-c121-27'))

WebUI.click(findTestObject('Object Repository/Institution - Positive/Page_QuentPreUserTrail/div_Select City_mat-select-arrow ng-tns-c121-27'))

WebUI.click(findTestObject('Object Repository/Institution - Positive/Page_QuentPreUserTrail/div_Select City_mat-select-arrow-wrapper ng_ffc4bd'))

WebUI.click(findTestObject('Object Repository/Institution - Positive/Page_QuentPreUserTrail/span_Clear'))

WebUI.click(findTestObject('Object Repository/Institution - Positive/Page_QuentPreUserTrail/img_1'))

WebUI.click(findTestObject('Object Repository/Institution - Positive/Page_QuentPreUserTrail/div_Logout'))

WebUI.closeBrowser()

