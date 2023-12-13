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

WebUI.click(findTestObject('Object Repository/Page_QuentPreUserTrail/img (3)'))

WebUI.click(findTestObject('Object Repository/Page_QuentPreUserTrail/span_91 (3)'))

WebUI.setText(findTestObject('Object Repository/Page_QuentPreUserTrail/input__login-phonenumber (3)'), '9022351287')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_QuentPreUserTrail/input__login-password (3)'), 'cvW8qx4B2o3F4VwP/kNsqA==')

WebUI.click(findTestObject('Object Repository/Page_QuentPreUserTrail/button_Login (3)'))

WebUI.click(findTestObject('Object Repository/Page_QuentPreUserTrail/p_Device Inventory (2)'))

WebUI.click(findTestObject('Object Repository/Page_QuentPreUserTrail/button_Add Device (2)'))

WebUI.setText(findTestObject('Object Repository/Page_QuentPreUserTrail/input_BLE MAC ID_mat-input-13 (1)'), '3D:4D:56:3G:77:90')
WebUI.delay(30)

WebUI.setText(findTestObject('Object Repository/Page_QuentPreUserTrail/input__mat-input-6 (1)'), 'SF00345')

WebUI.setText(findTestObject('Object Repository/Page_QuentPreUserTrail/input__mat-input-7 (1)'), 'Quent')

WebUI.setText(findTestObject('Object Repository/Page_QuentPreUserTrail/input__mat-input-8 (1)'), 'NST')

WebUI.setText(findTestObject('Object Repository/Page_QuentPreUserTrail/input__mat-input-9 (1)'), '1.93')

WebUI.setText(findTestObject('Object Repository/Page_QuentPreUserTrail/input__mat-input-10 (1)'), '916')

WebUI.setText(findTestObject('Object Repository/Page_QuentPreUserTrail/input_Software App Version_mat-input-11 (1)'), '1.1.94')

WebUI.click(findTestObject('Object Repository/Page_QuentPreUserTrail/div_--Select--'))

WebUI.click(findTestObject('Object Repository/Page_QuentPreUserTrail/span_IOS (1)'))

WebUI.click(findTestObject('Object Repository/Page_QuentPreUserTrail/button_Cancel'))

WebUI.click(findTestObject('Object Repository/Page_QuentPreUserTrail/button_No'))

//WebUI.click(findTestObject('Object Repository/Page_QuentPreUserTrail/span_Cancel (1)'))

//WebUI.click(findTestObject('Object Repository/Page_QuentPreUserTrail/span_Yes'))

//WebUI.click(findTestObject('Object Repository/Page_QuentPreUserTrail/img_1 (3)'))

//WebUI.click(findTestObject('Object Repository/Page_QuentPreUserTrail/div_Logout (3)'))

WebUI.closeBrowser()


