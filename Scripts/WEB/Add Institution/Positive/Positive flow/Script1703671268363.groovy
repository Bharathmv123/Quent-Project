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

WebUI.click(findTestObject('Object Repository/Page_QuentPreUserTrail/img (25)'))

WebUI.click(findTestObject('Object Repository/Page_QuentPreUserTrail/span_91 (24)'))

WebUI.setText(findTestObject('Object Repository/Page_QuentPreUserTrail/input__login-phonenumber (25)'), '9022351287')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_QuentPreUserTrail/input__login-password (25)'), 'cvW8qx4B2o3F4VwP/kNsqA==')

WebUI.click(findTestObject('Object Repository/Page_QuentPreUserTrail/button_Login (25)'))

WebUI.click(findTestObject('Object Repository/Page_QuentPreUserTrail/p_Institution (1)'))

WebUI.click(findTestObject('Object Repository/Page_QuentPreUserTrail/button_Add Institution (1)'))

WebUI.setText(findTestObject('Object Repository/Page_QuentPreUserTrail/input__mat-input-6 (9)'), 'Nsqrd')

WebUI.click(findTestObject('Object Repository/Page_QuentPreUserTrail/div__mat-select-arrow ng-tns-c121-37'))

WebUI.click(findTestObject('Object Repository/Page_QuentPreUserTrail/span_Afghanistan'))

WebUI.setText(findTestObject('Object Repository/Page_QuentPreUserTrail/input__mat-input-7 (4)'), 'diksha')

WebUI.click(findTestObject('Object Repository/Page_QuentPreUserTrail/div__mat-select-arrow-wrapper ng-tns-c121-41'))

WebUI.click(findTestObject('Object Repository/Page_QuentPreUserTrail/span_Balkh'))

WebUI.setText(findTestObject('Object Repository/Page_QuentPreUserTrail/input__mat-input-8 (8)'), '9022351287')

WebUI.click(findTestObject('Object Repository/Page_QuentPreUserTrail/div__mat-select-arrow-wrapper ng-tns-c121-43'))

WebUI.click(findTestObject('Object Repository/Page_QuentPreUserTrail/span_Qarchi Gak'))

WebUI.setText(findTestObject('Object Repository/Page_QuentPreUserTrail/textarea__mat-input-9 (1)'), 'nil')

WebUI.click(findTestObject('Object Repository/Page_QuentPreUserTrail/div__mat-form-field-infix ng-tns-c113-38'))

WebUI.setText(findTestObject('Object Repository/Page_QuentPreUserTrail/textarea__mat-input-10 (1)'), 'divum')

WebUI.setText(findTestObject('Object Repository/Page_QuentPreUserTrail/textarea_Address Line2_mat-input-11 (1)'), 'near accord')

WebUI.click(findTestObject('Object Repository/Page_QuentPreUserTrail/button_Save (6)'))

WebUI.click(findTestObject('Object Repository/Page_QuentPreUserTrail/img_1 (11)'))

WebUI.click(findTestObject('Object Repository/Page_QuentPreUserTrail/div_Logout (7)'))

WebUI.closeBrowser()

