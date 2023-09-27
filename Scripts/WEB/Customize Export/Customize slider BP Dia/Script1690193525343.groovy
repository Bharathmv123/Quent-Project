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

WebUI.click(findTestObject('Object Repository/Customize BP Dia/Page_QuentPreUserTrail/img'))

WebUI.click(findTestObject('Object Repository/Customize BP Dia/Page_QuentPreUserTrail/span_91'))

WebUI.setText(findTestObject('Object Repository/Customize BP Dia/Page_QuentPreUserTrail/input__login-phonenumber'), '8217603935')

WebUI.setEncryptedText(findTestObject('Object Repository/Customize BP Dia/Page_QuentPreUserTrail/input__login-password'), 
    'cvW8qx4B2o3F4VwP/kNsqA==')

WebUI.click(findTestObject('Object Repository/Customize BP Dia/Page_QuentPreUserTrail/button_Login'))

WebUI.click(findTestObject('Object Repository/Customize BP Dia/Page_QuentPreUserTrail/p_Customize Export'))

WebUI.setText(findTestObject('Object Repository/Customize BP Dia/Page_QuentPreUserTrail/input_Available Columns(103)_mat-input-5'), 
    'DIa')

WebUI.click(findTestObject('Object Repository/Customize BP Dia/Page_QuentPreUserTrail/span_Available Columns(3)_mat-checkbox-inne_223b7e'))

WebUI.click(findTestObject('Object Repository/Customize BP Dia/Page_QuentPreUserTrail/div_BP Predicate Reading DIA'))

WebUI.click(findTestObject('Object Repository/Customize BP Dia/Page_QuentPreUserTrail/span_BP Quent DIA_mat-checkbox-inner-container'))

WebUI.click(findTestObject('Object Repository/Customize BP Dia/Page_QuentPreUserTrail/span_BP Predicate Reading DIA_mat-checkbox-_312310'))

WebUI.click(findTestObject('Object Repository/Customize BP Dia/Page_QuentPreUserTrail/div_Watch Device ID'))

//WebUI.doubleClick(findTestObject('Object Repository/Customize BP Dia/Page_QuentPreUserTrail/span_Blood Pressure Diastolic Lower and Hig_a83a58'))
//WebUI.click(findTestObject('Object Repository/Customize BP Dia/Page_QuentPreUserTrail/span_Blood Pressure Diastolic Lower and Hig_a83a58'))
//WebUI.click(findTestObject('Object Repository/Customize BP Dia/Page_QuentPreUserTrail/span_Blood Pressure Diastolic Lower and Hig_a83a58'))
WebUI.click(findTestObject('Object Repository/Customize BP Dia/Page_QuentPreUserTrail/button_Add'))

WebUI.click(findTestObject('Object Repository/Customize BP Dia/Page_QuentPreUserTrail/div_Watch Device ID'))

WebUI.click(findTestObject('Object Repository/Customize BP Dia/Page_QuentPreUserTrail/span_Blood Pressure Diastolic Lower and Hig_a83a58'))

WebUI.click(findTestObject('Object Repository/Customize BP Dia/Page_QuentPreUserTrail/input_Date range_mat-input-9'))

WebUI.click(findTestObject('Object Repository/Customize BP Dia/Page_QuentPreUserTrail/img_Date range_ng-tns-c113-12'))

WebUI.doubleClick(findTestObject('Object Repository/Customize BP Dia/Page_QuentPreUserTrail/button_JUL 2023_mat-focus-indicator mat-cal_e49532'))

WebUI.doubleClick(findTestObject('Object Repository/Customize BP Dia/Page_QuentPreUserTrail/button_JUL 2023_mat-focus-indicator mat-cal_e49532'))

WebUI.click(findTestObject('Object Repository/Customize BP Dia/Page_QuentPreUserTrail/div_23'))

//WebUI.click(findTestObject('Object Repository/Customize BP Dia/Page_QuentPreUserTrail/input_Date range_mat-input-10'))
//WebUI.click(findTestObject('Object Repository/Customize BP Dia/Page_QuentPreUserTrail/div_Date range_mat-form-field-suffix ng-tns_55d080'))
//WebUI.click(findTestObject('Object Repository/Customize BP Dia/Page_QuentPreUserTrail/img_Date range_ng-tns-c113-12'))
//WebUI.doubleClick(findTestObject('Object Repository/Customize BP Dia/Page_QuentPreUserTrail/button_JUL 2023_mat-focus-indicator mat-cal_e49532'))
//WebUI.doubleClick(findTestObject('Object Repository/Customize BP Dia/Page_QuentPreUserTrail/button_JUL 2023_mat-focus-indicator mat-cal_e49532'))
//WebUI.click(findTestObject('Object Repository/Customize BP Dia/Page_QuentPreUserTrail/div_23'))
WebUI.click(findTestObject('Object Repository/Customize BP Dia/Page_QuentPreUserTrail/span_WIFI_mat-checkbox-inner-container mat-_980e94'))

WebUI.click(findTestObject('Object Repository/Customize BP Dia/Page_QuentPreUserTrail/span_Data Export_mat-checkbox-inner-contain_b9e8c1'))

WebUI.click(findTestObject('Object Repository/Customize BP Dia/Page_QuentPreUserTrail/button_Download'))

WebUI.click(findTestObject('Object Repository/Customize BP Dia/Page_QuentPreUserTrail/button_CSV'))

WebUI.delay(10)

WebUI.closeBrowser()

