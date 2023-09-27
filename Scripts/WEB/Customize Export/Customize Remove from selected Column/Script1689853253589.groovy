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

WebUI.click(findTestObject('Object Repository/Customize Remove/Page_QuentPreUserTrail/img'))

WebUI.click(findTestObject('Object Repository/Customize Remove/Page_QuentPreUserTrail/span_91'))

WebUI.setText(findTestObject('Object Repository/Customize Remove/Page_QuentPreUserTrail/input__login-phonenumber'), '8217603935')

WebUI.setEncryptedText(findTestObject('Object Repository/Customize Remove/Page_QuentPreUserTrail/input__login-password'), 
    'cvW8qx4B2o3F4VwP/kNsqA==')

WebUI.click(findTestObject('Object Repository/Customize Remove/Page_QuentPreUserTrail/button_Login'))

WebUI.click(findTestObject('Object Repository/Customize Remove/Page_QuentPreUserTrail/p_Customize Export'))

WebUI.click(findTestObject('Object Repository/Customize Remove/Page_QuentPreUserTrail/span_Gender_mat-checkbox-inner-container'))

WebUI.click(findTestObject('Object Repository/Customize Remove/Page_QuentPreUserTrail/span_DOB_mat-checkbox-inner-container'))

WebUI.click(findTestObject('Object Repository/Customize Remove/Page_QuentPreUserTrail/button_Add'))

WebUI.click(findTestObject('Object Repository/Customize Remove/Page_QuentPreUserTrail/span_Hip Size_mat-checkbox-inner-container'))

WebUI.click(findTestObject('Object Repository/Customize Remove/Page_QuentPreUserTrail/span_Wrist Direction_mat-checkbox-inner-container'))

WebUI.click(findTestObject('Object Repository/Customize Remove/Page_QuentPreUserTrail/button_Add'))

WebUI.click(findTestObject('Object Repository/Customize Remove/Page_QuentPreUserTrail/span_Wrist Observation_mat-checkbox-inner-c_fcb4ef'))

WebUI.click(findTestObject('Object Repository/Customize Remove/Page_QuentPreUserTrail/span_Firmware Version_mat-checkbox-inner-container'))

WebUI.click(findTestObject('Object Repository/Customize Remove/Page_QuentPreUserTrail/button_Add'))

WebUI.click(findTestObject('Object Repository/Customize Remove/Page_QuentPreUserTrail/span_SpO2 Predicate Reading Image_mat-check_830856'))

WebUI.click(findTestObject('Object Repository/Customize Remove/Page_QuentPreUserTrail/span_BP Predicate Reading SYS_mat-checkbox-_9babe3'))

WebUI.click(findTestObject('Object Repository/Customize Remove/Page_QuentPreUserTrail/span_EKG Quent QT Interval_mat-checkbox-inn_3342ef'))

WebUI.click(findTestObject('Object Repository/Customize Remove/Page_QuentPreUserTrail/span_Predicate Device PR interval_mat-check_eb8b49'))

WebUI.click(findTestObject('Object Repository/Customize Remove/Page_QuentPreUserTrail/span_Watch Manufacturer Name_mat-checkbox-i_877e66'))

WebUI.click(findTestObject('Object Repository/Customize Remove/Page_QuentPreUserTrail/button_Add'))

WebUI.click(findTestObject('Object Repository/Customize Remove/Page_QuentPreUserTrail/span_Age_mat-checkbox-inner-container'))

WebUI.click(findTestObject('Object Repository/Customize Remove/Page_QuentPreUserTrail/span_Country Code_mat-checkbox-inner-container'))

WebUI.click(findTestObject('Object Repository/Customize Remove/Page_QuentPreUserTrail/button_Remove'))

WebUI.click(findTestObject('Object Repository/Customize Remove/Page_QuentPreUserTrail/span_BP Predicate Reading DIA_mat-checkbox-_312310'))

WebUI.click(findTestObject('Object Repository/Customize Remove/Page_QuentPreUserTrail/span_Country Code_mat-checkbox-inner-container_1'))

WebUI.click(findTestObject('Object Repository/Customize Remove/Page_QuentPreUserTrail/button_Remove'))

WebUI.click(findTestObject('Object Repository/Customize Remove/Page_QuentPreUserTrail/span_Vital set ID_mat-checkbox-inner-container'))

WebUI.click(findTestObject('Object Repository/Customize Remove/Page_QuentPreUserTrail/div_Watch Model Number'))

WebUI.click(findTestObject('Object Repository/Customize Remove/Page_QuentPreUserTrail/span_Predicate Device QT interval_mat-check_94b70a'))

WebUI.click(findTestObject('Object Repository/Customize Remove/Page_QuentPreUserTrail/button_Remove'))

WebUI.click(findTestObject('Object Repository/Customize Remove/Page_QuentPreUserTrail/span_Vital set ID_mat-checkbox-inner-container_1'))

WebUI.click(findTestObject('Object Repository/Customize Remove/Page_QuentPreUserTrail/span_SpO2 Golden Apparatus Reading_mat-chec_c5a977'))

WebUI.click(findTestObject('Object Repository/Customize Remove/Page_QuentPreUserTrail/span_Wrist Size_mat-checkbox-inner-container'))

WebUI.click(findTestObject('Object Repository/Customize Remove/Page_QuentPreUserTrail/span_Country Code_mat-checkbox-inner-container_1_2'))

WebUI.click(findTestObject('Object Repository/Customize Remove/Page_QuentPreUserTrail/span_BP Predicate Reading DIA_mat-checkbox-_312310_1'))

WebUI.click(findTestObject('Object Repository/Customize Remove/Page_QuentPreUserTrail/button_Remove'))

WebUI.closeBrowser()

