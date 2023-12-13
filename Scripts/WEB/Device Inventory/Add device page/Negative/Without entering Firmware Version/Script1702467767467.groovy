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

WebUI.click(findTestObject('Object Repository/Device Inventory/Page_QuentPreUserTrail/img'))

WebUI.click(findTestObject('Object Repository/Device Inventory/Page_QuentPreUserTrail/span_91'))

WebUI.setText(findTestObject('Object Repository/Device Inventory/Page_QuentPreUserTrail/input__login-phonenumber'), '9022351287')

WebUI.click(findTestObject('Object Repository/Device Inventory/Page_QuentPreUserTrail/div__mat-form-field-infix ng-tns-c113-3'))

WebUI.setEncryptedText(findTestObject('Object Repository/Device Inventory/Page_QuentPreUserTrail/input__login-password'),
	'cvW8qx4B2o3F4VwP/kNsqA==')

WebUI.click(findTestObject('Object Repository/Device Inventory/Page_QuentPreUserTrail/button_Login'))

WebUI.click(findTestObject('Object Repository/Device Inventory/Page_QuentPreUserTrail/p_Device Inventory'))

WebUI.click(findTestObject('Object Repository/Device Inventory/Page_QuentPreUserTrail/button_Add Device'))

WebUI.click(findTestObject('Object Repository/Device Inventory/Page_QuentPreUserTrail/input__mat-input-12'))

WebUI.setText(findTestObject('Object Repository/Device Inventory/Page_QuentPreUserTrail/input_BLE  WiFi MACID is required_mat-input-13'),
	'D4:3D:39:ED:4E:50')
WebUI.delay(30)

WebUI.setText(findTestObject('Object Repository/Device Inventory/Page_QuentPreUserTrail/input__mat-input-6'), 'QNT01922')

WebUI.setText(findTestObject('Object Repository/Device Inventory/Page_QuentPreUserTrail/input__mat-input-7'), '')

WebUI.click(findTestObject('Object Repository/Device Inventory/Page_QuentPreUserTrail/input__mat-input-7'))

WebUI.setText(findTestObject('Object Repository/Device Inventory/Page_QuentPreUserTrail/input__mat-input-7'), 'QUENT')


WebUI.setText(findTestObject('Object Repository/Device Inventory/Page_QuentPreUserTrail/input__mat-input-8'), 'NST')

WebUI.setText(findTestObject('Object Repository/Device Inventory/Page_QuentPreUserTrail/input__mat-input-9'), '1.93')

//WebUI.setText(findTestObject('Object Repository/Device Inventory/Page_QuentPreUserTrail/input__mat-input-10'), '916')

WebUI.setText(findTestObject('Object Repository/Device Inventory/Page_QuentPreUserTrail/input_Software App Version_mat-input-11'),
	'1.1.94')

WebUI.click(findTestObject('Object Repository/Device Inventory/Page_QuentPreUserTrail/div_--Select--_mat-select-arrow-wrapper ng-_36f9cc'))

WebUI.click(findTestObject('Object Repository/Device Inventory/Page_QuentPreUserTrail/span_Android'))



WebUI.click(findTestObject('Object Repository/Device Inventory/Page_QuentPreUserTrail/button_Save'))

WebUI.delay(5)


WebUI.closeBrowser()


