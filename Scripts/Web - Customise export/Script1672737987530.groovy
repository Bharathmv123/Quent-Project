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

WebUI.click(findTestObject('Object Repository/Web - CE/Page_QuentPreUserTrail/div_1'))

WebUI.click(findTestObject('Object Repository/Web - CE/Page_QuentPreUserTrail/span_91'))

WebUI.setText(findTestObject('Object Repository/Web - CE/Page_QuentPreUserTrail/input__login-phonenumber'), '8050694262')

WebUI.setEncryptedText(findTestObject('Object Repository/Web - CE/Page_QuentPreUserTrail/input__login-password'), 'cvW8qx4B2o3F4VwP/kNsqA==')

WebUI.click(findTestObject('Object Repository/Web - CE/Page_QuentPreUserTrail/button_Login'))

WebUI.click(findTestObject('Object Repository/Web - CE/Page_QuentPreUserTrail/p_Customize Export'))

WebUI.setText(findTestObject('Object Repository/Web - CE/Page_QuentPreUserTrail/input_Available Columns(90)_mat-input-5'), 
    'Age')

WebUI.click(findTestObject('Object Repository/Web - CE/Page_QuentPreUserTrail/span_Available Columns(19)_mat-checkbox-inn_a9f9a0'))

WebUI.click(findTestObject('Object Repository/Web - CE/Page_QuentPreUserTrail/button_Add'))

WebUI.click(findTestObject('Object Repository/Web - CE/Page_QuentPreUserTrail/button_Remove All'))

WebUI.click(findTestObject('Object Repository/Web - CE/Page_QuentPreUserTrail/button_Add All'))

WebUI.click(findTestObject('Object Repository/Web - CE/Page_QuentPreUserTrail/span_Vital set ID_mat-checkbox-inner-container'))

WebUI.click(findTestObject('Object Repository/Web - CE/Page_QuentPreUserTrail/span_First Name_mat-checkbox-inner-container'))

WebUI.click(findTestObject('Object Repository/Web - CE/Page_QuentPreUserTrail/button_Remove'))

WebUI.click(findTestObject('Object Repository/Web - CE/Page_QuentPreUserTrail/button_Remove All'))

WebUI.click(findTestObject('Object Repository/Web - CE/Page_QuentPreUserTrail/span_Data Export_mat-checkbox-inner-contain_b9e8c1'))

WebUI.setText(findTestObject('Object Repository/Web - CE/Page_QuentPreUserTrail/input_User Reference ID_mat-input-6'), 'hrhhr')

WebUI.click(findTestObject('Object Repository/Web - CE/Page_QuentPreUserTrail/input_Agent ID_mat-input-7'))

WebUI.click(findTestObject('Object Repository/Web - CE/Page_QuentPreUserTrail/input_Agent ID_mat-input-7'))

WebUI.setText(findTestObject('Object Repository/Web - CE/Page_QuentPreUserTrail/input_User Reference ID_mat-input-6'), 'HJJ233')

WebUI.click(findTestObject('Object Repository/Web - CE/Page_QuentPreUserTrail/input_Agent ID_mat-input-7'))

WebUI.click(findTestObject('Object Repository/Web - CE/Page_QuentPreUserTrail/button_Staging Environment for PUT_mat-focu_bb4164'))

WebUI.click(findTestObject('Object Repository/Web - CE/Page_QuentPreUserTrail/button_Logout'))

WebUI.closeBrowser()