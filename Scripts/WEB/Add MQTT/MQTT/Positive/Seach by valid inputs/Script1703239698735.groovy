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

WebUI.click(findTestObject('Object Repository/Page_QuentPreUserTrail/img (23)'))

WebUI.click(findTestObject('Object Repository/Page_QuentPreUserTrail/span_91 (22)'))

WebUI.setText(findTestObject('Object Repository/Page_QuentPreUserTrail/input__login-phonenumber (23)'), '9022351287')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_QuentPreUserTrail/input__login-password (23)'), 'cvW8qx4B2o3F4VwP/kNsqA==')

WebUI.click(findTestObject('Object Repository/Page_QuentPreUserTrail/button_Login (23)'))

WebUI.click(findTestObject('Object Repository/Page_QuentPreUserTrail/p_MQTT (5)'))

WebUI.setText(findTestObject('Object Repository/Page_QuentPreUserTrail/input_Search_mat-input-5 (2)'), 'Quent')

WebUI.click(findTestObject('Object Repository/Page_QuentPreUserTrail/button_Search (3)'))

WebUI.click(findTestObject('Object Repository/Page_QuentPreUserTrail/button_Clear (3)'))

WebUI.setText(findTestObject('Object Repository/Page_QuentPreUserTrail/input_Search_mat-input-5 (2)'), 'Test@123')

WebUI.click(findTestObject('Object Repository/Page_QuentPreUserTrail/button_Search (3)'))

WebUI.click(findTestObject('Object Repository/Page_QuentPreUserTrail/div_SearchALL Search  Clear (1)'))

WebUI.click(findTestObject('Object Repository/Page_QuentPreUserTrail/button_Clear (3)'))

WebUI.setText(findTestObject('Object Repository/Page_QuentPreUserTrail/input_Search_mat-input-5 (2)'), 'Diksha')

WebUI.click(findTestObject('Object Repository/Page_QuentPreUserTrail/button_Search (3)'))

WebUI.click(findTestObject('Object Repository/Page_QuentPreUserTrail/button_Clear (3)'))

WebUI.setText(findTestObject('Object Repository/Page_QuentPreUserTrail/input_Search_mat-input-5 (2)'), 'Nsqrd')

WebUI.click(findTestObject('Object Repository/Page_QuentPreUserTrail/button_Search (3)'))

WebUI.click(findTestObject('Object Repository/Page_QuentPreUserTrail/button_Clear (3)'))

WebUI.setText(findTestObject('Object Repository/Page_QuentPreUserTrail/input_Search_mat-input-5 (2)'), '80')

WebUI.click(findTestObject('Object Repository/Page_QuentPreUserTrail/button_Search (3)'))

WebUI.click(findTestObject('Object Repository/Page_QuentPreUserTrail/button_Clear (3)'))

WebUI.click(findTestObject('Object Repository/Page_QuentPreUserTrail/div_ALL_mat-select-arrow ng-tns-c121-21'))

WebUI.click(findTestObject('Object Repository/Page_QuentPreUserTrail/span_ACTIVE'))

WebUI.click(findTestObject('Object Repository/Page_QuentPreUserTrail/button_Search (3)'))

WebUI.click(findTestObject('Object Repository/Page_QuentPreUserTrail/button_Clear (3)'))

WebUI.click(findTestObject('Object Repository/Page_QuentPreUserTrail/div_ALL_mat-select-arrow-wrapper ng-tns-c121-21'))

WebUI.click(findTestObject('Object Repository/Page_QuentPreUserTrail/span_INACTIVE'))

WebUI.click(findTestObject('Object Repository/Page_QuentPreUserTrail/span_Search'))

WebUI.click(findTestObject('Object Repository/Page_QuentPreUserTrail/button_Clear (3)'))

WebUI.closeBrowser()

