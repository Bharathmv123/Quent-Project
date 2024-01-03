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

WebUI.click(findTestObject('Object Repository/Add institution/Page_QuentPreUserTrail/img (3)'))

WebUI.click(findTestObject('Object Repository/Add institution/Page_QuentPreUserTrail/span_91 (3)'))

WebUI.setText(findTestObject('Object Repository/Add institution/Page_QuentPreUserTrail/input__login-phonenumber (4)'), '9022351287')

WebUI.setEncryptedText(findTestObject('Object Repository/Add institution/Page_QuentPreUserTrail/input__login-password (4)'),
	'cvW8qx4B2o3F4VwP/kNsqA==')

WebUI.click(findTestObject('Object Repository/Add institution/Page_QuentPreUserTrail/button_Login (4)'))

WebUI.click(findTestObject('Object Repository/Add institution/Page_QuentPreUserTrail/p_Institution (4)'))

WebUI.click(findTestObject('Object Repository/Add institution/Page_QuentPreUserTrail/button_Add Institution (4)'))

WebUI.setText(findTestObject('Object Repository/Add institution/Page_QuentPreUserTrail/input__mat-input-6 (2)'), 'nst')

WebUI.click(findTestObject('Object Repository/Add institution/Page_QuentPreUserTrail/div__mat-select-arrow-wrapper ng-tns-c121-37'))

WebUI.click(findTestObject('Object Repository/Add institution/Page_QuentPreUserTrail/span_Anguilla'))

WebUI.setText(findTestObject('Object Repository/Add institution/Page_QuentPreUserTrail/input__mat-input-7 (1)'), 'chetan')

WebUI.click(findTestObject('Object Repository/Add institution/Page_QuentPreUserTrail/div__mat-select-arrow-wrapper ng-tns-c121-41 (1)'))

WebUI.click(findTestObject('Object Repository/Add institution/Page_QuentPreUserTrail/span_Other Provinces'))

WebUI.setText(findTestObject('Object Repository/Add institution/Page_QuentPreUserTrail/input__mat-input-8 (1)'), '9022351287')

WebUI.setText(findTestObject('Object Repository/Add institution/Page_QuentPreUserTrail/input__mat-input-12'), 'bang')

WebUI.setText(findTestObject('Object Repository/Add institution/Page_QuentPreUserTrail/textarea__mat-input-9 (1)'), 'nil')

WebUI.setText(findTestObject('Object Repository/Add institution/Page_QuentPreUserTrail/textarea__mat-input-10 (1)'), 'Divum')

WebUI.setText(findTestObject('Object Repository/Add institution/Page_QuentPreUserTrail/textarea_Address Line2_mat-input-11 (1)'),
	'3rd floor')

//WebUI.click(findTestObject('Object Repository/Add institution/Page_QuentPreUserTrail/button_Cancel (2)'))

//WebUI.click(findTestObject('Object Repository/Add institution/Page_QuentPreUserTrail/button_No (1)'))

WebUI.click(findTestObject('Object Repository/Add institution/Page_QuentPreUserTrail/button_Cancel (2)'))

WebUI.click(findTestObject('Object Repository/Add institution/Page_QuentPreUserTrail/button_Yes (1)'))

WebUI.click(findTestObject('Object Repository/Add institution/Page_QuentPreUserTrail/img_1 (3)'))

WebUI.click(findTestObject('Object Repository/Add institution/Page_QuentPreUserTrail/div_Logout (4)'))

WebUI.closeBrowser()

