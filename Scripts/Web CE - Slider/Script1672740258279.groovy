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

WebUI.click(findTestObject('Object Repository/Web - slider/Page_QuentPreUserTrail/div_1'))

WebUI.click(findTestObject('Object Repository/Web - slider/Page_QuentPreUserTrail/span_91'))

WebUI.setText(findTestObject('Object Repository/Web - slider/Page_QuentPreUserTrail/input__login-phonenumber'), '8050694262')

WebUI.setEncryptedText(findTestObject('Object Repository/Web - slider/Page_QuentPreUserTrail/input__login-password'), 'cvW8qx4B2o3F4VwP/kNsqA==')

WebUI.click(findTestObject('Object Repository/Web - slider/Page_QuentPreUserTrail/img__mat-tooltip-trigger ng-star-inserted'))

WebUI.click(findTestObject('Object Repository/Web - slider/Page_QuentPreUserTrail/button_Login'))

WebUI.click(findTestObject('Object Repository/Web - slider/Page_QuentPreUserTrail/p_Customize Export'))

WebUI.click(findTestObject('Object Repository/Web - slider/Page_QuentPreUserTrail/span_Add All'))

WebUI.click(findTestObject('Object Repository/Web - slider/Page_QuentPreUserTrail/div_Heart Rate Lower and Higher Limits (bpm_676642'))

WebUI.click(findTestObject('Object Repository/Web - slider/Page_QuentPreUserTrail/ngx-slider_5010050100'))

WebUI.click(findTestObject('Object Repository/Web - slider/Page_QuentPreUserTrail/div_Heart Rate Lower and Higher Limits (bpm_676642'))

WebUI.click(findTestObject('Object Repository/Web - slider/Page_QuentPreUserTrail/div_Heart Rate Lower and Higher Limits (bpm_676642'))

WebUI.click(findTestObject('Object Repository/Web - slider/Page_QuentPreUserTrail/div_Heart Rate Lower and Higher Limits (bpm_676642'))

WebUI.click(findTestObject('Object Repository/Web - slider/Page_QuentPreUserTrail/ngx-slider_1812018120'))

WebUI.click(findTestObject('Object Repository/Web - slider/Page_QuentPreUserTrail/div_Age1812018120Weight (Kg)4025040250'))

WebUI.setText(findTestObject('Object Repository/Web - slider/Page_QuentPreUserTrail/input_Watch Device ID_mat-input-8'), 
    'SF0041')

WebUI.click(findTestObject('Object Repository/Web - slider/Page_QuentPreUserTrail/img_Date range_ng-tns-c106-16'))

WebUI.click(findTestObject('Object Repository/Web - slider/Page_QuentPreUserTrail/td_2'))

WebUI.click(findTestObject('Object Repository/Web - slider/Page_QuentPreUserTrail/div_Date range_mat-form-field-suffix ng-tns_00eb03'))

WebUI.click(findTestObject('Object Repository/Web - slider/Page_QuentPreUserTrail/div_2'))

WebUI.click(findTestObject('Object Repository/Web - slider/Page_QuentPreUserTrail/button_Download'))

WebUI.click(findTestObject('Object Repository/Web - slider/Page_QuentPreUserTrail/button_CSV'))

WebUI.click(findTestObject('Object Repository/Web - slider/Page_QuentPreUserTrail/button_Close'))

WebUI.closeBrowser()

