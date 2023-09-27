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

WebUI.click(findTestObject('Object Repository/HR/Page_QuentPreUserTrail/img'))

WebUI.click(findTestObject('Object Repository/HR/Page_QuentPreUserTrail/span_91'))

WebUI.setText(findTestObject('Object Repository/HR/Page_QuentPreUserTrail/input__login-phonenumber'), '8217603935')

WebUI.setEncryptedText(findTestObject('Object Repository/HR/Page_QuentPreUserTrail/input__login-password'), 'cvW8qx4B2o3F4VwP/kNsqA==')

WebUI.click(findTestObject('Object Repository/HR/Page_QuentPreUserTrail/button_Login'))

WebUI.click(findTestObject('Object Repository/HR/Page_QuentPreUserTrail/p_Customize Export'))

WebUI.click(findTestObject('Object Repository/HR/Page_QuentPreUserTrail/button_Add All'))

WebUI.click(findTestObject('Object Repository/HR/Page_QuentPreUserTrail/div_Vital Range'))

//WebUI.click(findTestObject('Object Repository/HR/Page_QuentPreUserTrail/span_Heart Rate Lower and Higher Limits (bpm)'))
//WebUI.click(findTestObject('Object Repository/HR/Page_QuentPreUserTrail/span_Heart Rate Lower and Higher Limits (bpm)'))
WebUI.click(findTestObject('Object Repository/HR/Page_QuentPreUserTrail/div_Heart Rate Lower and Higher Limits (bpm_8aa5ac'))

WebUI.click(findTestObject('Object Repository/HR/Page_QuentPreUserTrail/span_Heart Rate Lower and Higher Limits (bp_e81614'))

WebUI.click(findTestObject('Object Repository/HR/Page_QuentPreUserTrail/span_Heart Rate Lower and Higher Limits (bp_b2db80'))

WebUI.click(findTestObject('Object Repository/HR/Page_QuentPreUserTrail/span_Heart Rate Lower and Higher Limits (bp_6c2fc0'))

WebUI.click(findTestObject('Object Repository/HR/Page_QuentPreUserTrail/span_Heart Rate Lower and Higher Limits (bp_6c2fc0'))

WebUI.click(findTestObject('Object Repository/HR/Page_QuentPreUserTrail/span_Heart Rate Lower and Higher Limits (bp_6c2fc0'))

WebUI.click(findTestObject('Object Repository/HR/Page_QuentPreUserTrail/div_Age and Weight'))

WebUI.click(findTestObject('Object Repository/HR/Page_QuentPreUserTrail/span_Age'))

WebUI.click(findTestObject('Object Repository/HR/Page_QuentPreUserTrail/mat-label_Date range'))

WebUI.click(findTestObject('Object Repository/HR/Page_QuentPreUserTrail/span_Age_ngx-slider-span ngx-slider-bar ngx_564366'))

WebUI.click(findTestObject('Object Repository/HR/Page_QuentPreUserTrail/span_Heart Rate Lower and Higher Limits (bp_6c2fc0'))

WebUI.click(findTestObject('Object Repository/HR/Page_QuentPreUserTrail/span_Heart Rate Lower and Higher Limits (bp_6c2fc0'))

WebUI.click(findTestObject('Object Repository/HR/Page_QuentPreUserTrail/span_Weight (Kg)'))

WebUI.click(findTestObject('Object Repository/HR/Page_QuentPreUserTrail/span_Age_ngx-slider-span ngx-slider-bar ngx_564366'))

WebUI.click(findTestObject('Object Repository/HR/Page_QuentPreUserTrail/mat-label_Date range'))

WebUI.click(findTestObject('Object Repository/HR/Page_QuentPreUserTrail/img_Date range_ng-tns-c113-12'))

WebUI.doubleClick(findTestObject('Object Repository/HR/Page_QuentPreUserTrail/button_JUL 2023_mat-focus-indicator mat-cal_e49532'))

WebUI.doubleClick(findTestObject('Object Repository/HR/Page_QuentPreUserTrail/button_JUL 2023_mat-focus-indicator mat-cal_e49532'))

WebUI.click(findTestObject('Object Repository/HR/Page_QuentPreUserTrail/button_JUL 2023_mat-focus-indicator mat-cal_e49532'))

WebUI.click(findTestObject('Object Repository/HR/Page_QuentPreUserTrail/div_19'))

WebUI.click(findTestObject('Object Repository/HR/Page_QuentPreUserTrail/input_Date range_mat-input-10'))

WebUI.click(findTestObject('Object Repository/HR/Page_QuentPreUserTrail/img_Date range_ng-tns-c113-12'))

WebUI.click(findTestObject('Object Repository/HR/Page_QuentPreUserTrail/button_JUL 2023_mat-focus-indicator mat-cal_e49532'))

WebUI.click(findTestObject('Object Repository/HR/Page_QuentPreUserTrail/div_15'))

WebUI.click(findTestObject('Object Repository/HR/Page_QuentPreUserTrail/span_WIFI_mat-checkbox-inner-container mat-_980e94'))

WebUI.click(findTestObject('Object Repository/HR/Page_QuentPreUserTrail/span_BLE_mat-checkbox-inner-container mat-c_1e695a'))

WebUI.click(findTestObject('Object Repository/HR/Page_QuentPreUserTrail/button_Download'))

WebUI.click(findTestObject('Object Repository/HR/Page_QuentPreUserTrail/button_CSV'))

WebUI.closeBrowser()

