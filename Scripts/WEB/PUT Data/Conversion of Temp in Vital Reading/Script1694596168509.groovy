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

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Conversion of Temp in Vital Reading/Page_QuentPreUserTrail/img'))

WebUI.click(findTestObject('Object Repository/Conversion of Temp in Vital Reading/Page_QuentPreUserTrail/span_91'))

WebUI.setText(findTestObject('Object Repository/Conversion of Temp in Vital Reading/Page_QuentPreUserTrail/input__login-phonenumber'), 
    '8217603935')

WebUI.setEncryptedText(findTestObject('Object Repository/Conversion of Temp in Vital Reading/Page_QuentPreUserTrail/input__login-password'), 
    'gfWxrCfpox/P3rrochC/0Q==')

WebUI.click(findTestObject('Object Repository/Conversion of Temp in Vital Reading/Page_QuentPreUserTrail/img__mat-tooltip-trigger ng-star-inserted'))

WebUI.setText(findTestObject('Object Repository/Conversion of Temp in Vital Reading/Page_QuentPreUserTrail/input__login-password_1'), 
    'Test@123')

WebUI.click(findTestObject('Object Repository/Conversion of Temp in Vital Reading/Page_QuentPreUserTrail/button_Login'))

WebUI.click(findTestObject('Object Repository/Conversion of Temp in Vital Reading/Page_QuentPreUserTrail/span_--Select--'))

WebUI.click(findTestObject('Object Repository/Conversion of Temp in Vital Reading/Page_QuentPreUserTrail/div_CBT'))

WebUI.click(findTestObject('Object Repository/Conversion of Temp in Vital Reading/Page_QuentPreUserTrail/img_Start Date_date-picker ng-tns-c113-8'))

WebUI.doubleClick(findTestObject('Object Repository/Conversion of Temp in Vital Reading/Page_QuentPreUserTrail/button_QT Interval_mat-focus-indicator mat-_25192e'))

WebUI.click(findTestObject('Object Repository/Conversion of Temp in Vital Reading/Page_QuentPreUserTrail/button_QT Interval_mat-focus-indicator mat-_25192e'))

WebUI.click(findTestObject('Object Repository/Conversion of Temp in Vital Reading/Page_QuentPreUserTrail/button_QT Interval_mat-focus-indicator mat-_25192e'))

WebUI.click(findTestObject('Object Repository/Conversion of Temp in Vital Reading/Page_QuentPreUserTrail/button_QT Interval_mat-focus-indicator mat-_25192e'))

WebUI.click(findTestObject('Object Repository/Conversion of Temp in Vital Reading/Page_QuentPreUserTrail/div_15'))

WebUI.click(findTestObject('Object Repository/Conversion of Temp in Vital Reading/Page_QuentPreUserTrail/mat-icon_search'))

WebUI.click(findTestObject('Object Repository/Conversion of Temp in Vital Reading/Page_QuentPreUserTrail/span_C'))

WebUI.click(findTestObject('Object Repository/Conversion of Temp in Vital Reading/Page_QuentPreUserTrail/span_F'))

WebUI.click(findTestObject('Object Repository/Conversion of Temp in Vital Reading/Page_QuentPreUserTrail/span_C'))

WebUI.click(findTestObject('Object Repository/Conversion of Temp in Vital Reading/Page_QuentPreUserTrail/span_F'))

WebUI.click(findTestObject('Object Repository/Conversion of Temp in Vital Reading/Page_QuentPreUserTrail/span_C'))

WebUI.click(findTestObject('Object Repository/Conversion of Temp in Vital Reading/Page_QuentPreUserTrail/span_F'))

WebUI.click(findTestObject('Object Repository/Conversion of Temp in Vital Reading/Page_QuentPreUserTrail/img_1'))

WebUI.click(findTestObject('Object Repository/Conversion of Temp in Vital Reading/Page_QuentPreUserTrail/div_Logout'))

WebUI.closeBrowser()

