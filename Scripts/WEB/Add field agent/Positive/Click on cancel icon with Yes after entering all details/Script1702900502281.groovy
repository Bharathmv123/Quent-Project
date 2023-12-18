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

WebUI.click(findTestObject('Object Repository/Page_QuentPreUserTrail/img (11)'))

WebUI.click(findTestObject('Object Repository/Page_QuentPreUserTrail/span_91 (11)'))

WebUI.setText(findTestObject('Object Repository/Page_QuentPreUserTrail/input__login-phonenumber (11)'), '9022351287')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_QuentPreUserTrail/input__login-password (11)'), 'cvW8qx4B2o3F4VwP/kNsqA==')

WebUI.click(findTestObject('Object Repository/Page_QuentPreUserTrail/button_Login (11)'))

WebUI.click(findTestObject('Object Repository/Page_QuentPreUserTrail/p_Field Agent (3)'))

WebUI.click(findTestObject('Object Repository/Page_QuentPreUserTrail/button_Add Fieldagent (3)'))

WebUI.setText(findTestObject('Object Repository/Page_QuentPreUserTrail/input__mat-input-6 (4)'), 'Disha')

WebUI.setText(findTestObject('Object Repository/Page_QuentPreUserTrail/input__mat-input-9 (4)'), 'Tembhare')

WebUI.setText(findTestObject('Object Repository/Page_QuentPreUserTrail/input__agent-phonenumber (1)'), '9022351287')

WebUI.setText(findTestObject('Object Repository/Page_QuentPreUserTrail/input__mat-input-8 (4)'), 'Test@123')

WebUI.setText(findTestObject('Object Repository/Page_QuentPreUserTrail/input__mat-input-11 (1)'), 'Test@123')

WebUI.click(findTestObject('Object Repository/Page_QuentPreUserTrail/img_1 (7)'))

WebUI.click(findTestObject('Object Repository/Page_QuentPreUserTrail/button_No (2)'))

WebUI.click(findTestObject('Object Repository/Page_QuentPreUserTrail/img_1 (7)'))

WebUI.click(findTestObject('Object Repository/Page_QuentPreUserTrail/button_Yes (1)'))

WebUI.closeBrowser()

