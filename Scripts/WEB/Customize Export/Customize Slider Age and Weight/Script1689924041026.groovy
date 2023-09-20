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

WebUI.click(findTestObject('Object Repository/Customize slider Age and Weight/Page_QuentPreUserTrail/img'))

WebUI.click(findTestObject('Object Repository/Customize slider Age and Weight/Page_QuentPreUserTrail/span_91'))

WebUI.setText(findTestObject('Object Repository/Customize slider Age and Weight/Page_QuentPreUserTrail/input__login-phonenumber'), 
    '8217603935')

WebUI.setEncryptedText(findTestObject('Object Repository/Customize slider Age and Weight/Page_QuentPreUserTrail/input__login-password'), 
    'cvW8qx4B2o3F4VwP/kNsqA==')

WebUI.click(findTestObject('Object Repository/Customize slider Age and Weight/Page_QuentPreUserTrail/button_Login'))

WebUI.click(findTestObject('Object Repository/Customize slider Age and Weight/Page_QuentPreUserTrail/p_Customize Export'))

WebUI.click(findTestObject('Object Repository/Customize slider Age and Weight/Page_QuentPreUserTrail/span_HR Predicate Reading Image_mat-checkbo_9fc3fc'))

WebUI.click(findTestObject('Object Repository/Customize slider Age and Weight/Page_QuentPreUserTrail/span_Height_mat-checkbox-inner-container'))

WebUI.click(findTestObject('Object Repository/Customize slider Age and Weight/Page_QuentPreUserTrail/button_Add'))

WebUI.setText(findTestObject('Object Repository/Customize slider Age and Weight/Page_QuentPreUserTrail/input_Available Columns(101)_mat-input-5'), 
    'HR')

WebUI.click(findTestObject('Object Repository/Customize slider Age and Weight/Page_QuentPreUserTrail/span_Available Columns(10)_mat-checkbox-inn_9820e9'))

WebUI.click(findTestObject('Object Repository/Customize slider Age and Weight/Page_QuentPreUserTrail/span_HR Predicate Reading Image_mat-checkbo_9fc3fc'))

WebUI.click(findTestObject('Object Repository/Customize slider Age and Weight/Page_QuentPreUserTrail/span_HR Quent Image_mat-checkbox-inner-container'))

WebUI.click(findTestObject('Object Repository/Customize slider Age and Weight/Page_QuentPreUserTrail/span_HR Quent time stamp_mat-checkbox-inner_b7d569'))

WebUI.click(findTestObject('Object Repository/Customize slider Age and Weight/Page_QuentPreUserTrail/button_Add'))

WebUI.click(findTestObject('Object Repository/Customize slider Age and Weight/Page_QuentPreUserTrail/mat-label_Heart Rate Lower and Higher Limits (bpm)'))

WebUI.click(findTestObject('Object Repository/Customize slider Age and Weight/Page_QuentPreUserTrail/span_Heart Rate Lower and Higher Limits (bpm)'))

WebUI.click(findTestObject('Object Repository/Customize slider Age and Weight/Page_QuentPreUserTrail/span_HR Predicate Reading Image_mat-checkbo_9fc3fc'))

WebUI.click(findTestObject('Object Repository/Customize slider Age and Weight/Page_QuentPreUserTrail/span_Heart Rate Lower and Higher Limits (bp_b2db80'))

WebUI.click(findTestObject('Object Repository/Customize slider Age and Weight/Page_QuentPreUserTrail/span_Heart Rate Lower and Higher Limits (bp_b2db80'))

WebUI.click(findTestObject('Object Repository/Customize slider Age and Weight/Page_QuentPreUserTrail/span_Heart Rate Lower and Higher Limits (bp_6c2fc0'))

WebUI.click(findTestObject('Object Repository/Customize slider Age and Weight/Page_QuentPreUserTrail/span_Heart Rate Lower and Higher Limits (bp_b2db80'))

WebUI.click(findTestObject('Object Repository/Customize slider Age and Weight/Page_QuentPreUserTrail/span_Heart Rate Lower and Higher Limits (bp_b2db80'))

WebUI.click(findTestObject('Object Repository/Customize slider Age and Weight/Page_QuentPreUserTrail/div_Age and Weight'))

WebUI.click(findTestObject('Object Repository/Customize slider Age and Weight/Page_QuentPreUserTrail/mat-label_Age'))

WebUI.click(findTestObject('Object Repository/Customize slider Age and Weight/Page_QuentPreUserTrail/span_HR Predicate Reading Image_mat-checkbo_9fc3fc'))

WebUI.click(findTestObject('Object Repository/Customize slider Age and Weight/Page_QuentPreUserTrail/span_Heart Rate Lower and Higher Limits (bp_b2db80'))

WebUI.click(findTestObject('Object Repository/Customize slider Age and Weight/Page_QuentPreUserTrail/span_Heart Rate Lower and Higher Limits (bp_b2db80'))

WebUI.click(findTestObject('Object Repository/Customize slider Age and Weight/Page_QuentPreUserTrail/span_Heart Rate Lower and Higher Limits (bp_b2db80'))

WebUI.click(findTestObject('Object Repository/Customize slider Age and Weight/Page_QuentPreUserTrail/mat-label_Weight (Kg)'))

WebUI.click(findTestObject('Object Repository/Customize slider Age and Weight/Page_QuentPreUserTrail/span_Weight (Kg)'))

WebUI.click(findTestObject('Object Repository/Customize slider Age and Weight/Page_QuentPreUserTrail/span_Heart Rate Lower and Higher Limits (bp_b2db80'))

WebUI.click(findTestObject('Object Repository/Customize slider Age and Weight/Page_QuentPreUserTrail/span_Heart Rate Lower and Higher Limits (bp_b2db80'))

WebUI.click(findTestObject('Object Repository/Customize slider Age and Weight/Page_QuentPreUserTrail/span_Heart Rate Lower and Higher Limits (bp_b2db80'))

WebUI.click(findTestObject('Object Repository/Customize slider Age and Weight/Page_QuentPreUserTrail/mat-label_Watch Mac ID'))

WebUI.click(findTestObject('Object Repository/Customize slider Age and Weight/Page_QuentPreUserTrail/mat-label_Date range'))

WebUI.click(findTestObject('Object Repository/Customize slider Age and Weight/Page_QuentPreUserTrail/img_Date range_ng-tns-c113-24'))

WebUI.doubleClick(findTestObject('Object Repository/Customize slider Age and Weight/Page_QuentPreUserTrail/button_SEP 2023_mat-focus-indicator mat-cal_68ebee'))

WebUI.click(findTestObject('Object Repository/Customize slider Age and Weight/Page_QuentPreUserTrail/button_SEP 2023_mat-focus-indicator mat-cal_68ebee'))

WebUI.click(findTestObject('Object Repository/Customize slider Age and Weight/Page_QuentPreUserTrail/button_SEP 2023_mat-focus-indicator mat-cal_68ebee'))

WebUI.click(findTestObject('Object Repository/Customize slider Age and Weight/Page_QuentPreUserTrail/button_SEP 2023_mat-focus-indicator mat-cal_68ebee'))

WebUI.click(findTestObject('Object Repository/Customize slider Age and Weight/Page_QuentPreUserTrail/button_SEP 2023_mat-focus-indicator mat-cal_68ebee'))

WebUI.click(findTestObject('Object Repository/Customize slider Age and Weight/Page_QuentPreUserTrail/div_12'))

WebUI.click(findTestObject('Object Repository/Customize slider Age and Weight/Page_QuentPreUserTrail/div_Date range_mat-form-field-suffix ng-tns_0f7f6f'))

WebUI.click(findTestObject('Object Repository/Customize slider Age and Weight/Page_QuentPreUserTrail/img_Date range_ng-tns-c113-24'))

WebUI.click(findTestObject('Object Repository/Customize slider Age and Weight/Page_QuentPreUserTrail/div_12'))

WebUI.click(findTestObject('Object Repository/Customize slider Age and Weight/Page_QuentPreUserTrail/span_WIFI_mat-checkbox-inner-container mat-_980e94'))

WebUI.click(findTestObject('Object Repository/Customize slider Age and Weight/Page_QuentPreUserTrail/span_HR Predicate Reading Image_mat-checkbo_9fc3fc'))

WebUI.click(findTestObject('Object Repository/Customize slider Age and Weight/Page_QuentPreUserTrail/button_Download'))

WebUI.click(findTestObject('Object Repository/Customize slider Age and Weight/Page_QuentPreUserTrail/button_CSV'))

WebUI.click(findTestObject('Object Repository/Customize slider Age and Weight/Page_QuentPreUserTrail/img_1'))

WebUI.click(findTestObject('Object Repository/Customize slider Age and Weight/Page_QuentPreUserTrail/div_Logout'))

WebUI.closeBrowser()

