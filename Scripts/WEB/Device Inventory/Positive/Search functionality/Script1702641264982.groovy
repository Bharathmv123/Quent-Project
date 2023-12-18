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

WebUI.click(findTestObject('Object Repository/Device inventory positive/Page_QuentPreUserTrail/img'))

WebUI.click(findTestObject('Object Repository/Device inventory positive/Page_QuentPreUserTrail/span_91'))

WebUI.click(findTestObject('Object Repository/Device inventory positive/Page_QuentPreUserTrail/div_91'))

WebUI.setText(findTestObject('Object Repository/Device inventory positive/Page_QuentPreUserTrail/input__login-phonenumber'), 
    '9022351287')

WebUI.setEncryptedText(findTestObject('Object Repository/Device inventory positive/Page_QuentPreUserTrail/input__login-password'), 
    'cvW8qx4B2o3F4VwP/kNsqA==')

WebUI.click(findTestObject('Object Repository/Device inventory positive/Page_QuentPreUserTrail/button_Login'))

WebUI.click(findTestObject('Object Repository/Device inventory positive/Page_QuentPreUserTrail/p_Device Inventory'))

WebUI.setText(findTestObject('Object Repository/Device inventory positive/Page_QuentPreUserTrail/input_Search_mat-input-5'), 
    'WIFI')

WebUI.click(findTestObject('Object Repository/Device inventory positive/Page_QuentPreUserTrail/button_Search'))

WebUI.click(findTestObject('Object Repository/Device inventory positive/Page_QuentPreUserTrail/span_Clear'))

WebUI.setText(findTestObject('Object Repository/Device inventory positive/Page_QuentPreUserTrail/input_Search_mat-input-5'), 
    'BLE')

WebUI.click(findTestObject('Object Repository/Device inventory positive/Page_QuentPreUserTrail/span_Search'))

WebUI.setText(findTestObject('Object Repository/Device inventory positive/Page_QuentPreUserTrail/input_Search_mat-input-5'), 
    '')

WebUI.click(findTestObject('Object Repository/Device inventory positive/Page_QuentPreUserTrail/span_Clear'))

WebUI.setText(findTestObject('Object Repository/Device inventory positive/Page_QuentPreUserTrail/input_Search_mat-input-5'), 
    'NST')

WebUI.click(findTestObject('Object Repository/Device inventory positive/Page_QuentPreUserTrail/span_Search'))

WebUI.click(findTestObject('Object Repository/Device inventory positive/Page_QuentPreUserTrail/span_Clear'))

WebUI.setText(findTestObject('Object Repository/Device inventory positive/Page_QuentPreUserTrail/input_Search_mat-input-5'), 
    'Andriod')

WebUI.click(findTestObject('Object Repository/Device inventory positive/Page_QuentPreUserTrail/span_Search'))

WebUI.click(findTestObject('Object Repository/Device inventory positive/Page_QuentPreUserTrail/span_Clear'))

//WebUI.click(findTestObject('Object Repository/Device inventory positive/Page_QuentPreUserTrail/div_Android_mat-slide-toggle-bar mat-slide-_49a835'))

//WebUI.click(findTestObject('Object Repository/Device inventory positive/Page_QuentPreUserTrail/div_Staging Environment for PUT_ngx-spinner_02cdf8'))

//WebUI.click(findTestObject('Object Repository/Device inventory positive/Page_QuentPreUserTrail/div_Android_mat-slide-toggle-bar mat-slide-_49a835_1'))

//WebUI.click(findTestObject('Object Repository/Device inventory positive/Page_QuentPreUserTrail/button_Clear'))

WebUI.click(findTestObject('Object Repository/Device inventory positive/Page_QuentPreUserTrail/img_1'))

WebUI.click(findTestObject('Object Repository/Device inventory positive/Page_QuentPreUserTrail/div_Logout'))

WebUI.closeBrowser()

