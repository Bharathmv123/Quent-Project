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

WebUI.click(findTestObject('Object Repository/Customize Add/Page_QuentPreUserTrail/img'))

WebUI.click(findTestObject('Object Repository/Customize Add/Page_QuentPreUserTrail/span_91'))

WebUI.click(findTestObject('Object Repository/Customize Add/Page_QuentPreUserTrail/input__login-phonenumber'))

WebUI.setText(findTestObject('Object Repository/Customize Add/Page_QuentPreUserTrail/input__login-phonenumber'), '8217603935')

WebUI.setEncryptedText(findTestObject('Object Repository/Customize Add/Page_QuentPreUserTrail/input__login-password'), 'cvW8qx4B2o3F4VwP/kNsqA==')

WebUI.click(findTestObject('Object Repository/Customize Add/Page_QuentPreUserTrail/button_Login'))

WebUI.click(findTestObject('Object Repository/Customize Add/Page_QuentPreUserTrail/p_Customize Export'))

WebUI.click(findTestObject('Object Repository/Customize Add/Page_QuentPreUserTrail/span_Gender_mat-checkbox-inner-container'))

WebUI.click(findTestObject('Object Repository/Customize Add/Page_QuentPreUserTrail/span_DOB_mat-checkbox-inner-container'))

WebUI.click(findTestObject('Object Repository/Customize Add/Page_QuentPreUserTrail/span_Height_mat-checkbox-inner-container'))

WebUI.click(findTestObject('Object Repository/Customize Add/Page_QuentPreUserTrail/button_Add'))

WebUI.click(findTestObject('Object Repository/Customize Add/Page_QuentPreUserTrail/span_Previous Illness_mat-checkbox-inner-container'))

WebUI.click(findTestObject('Object Repository/Customize Add/Page_QuentPreUserTrail/span_Skin Nature_mat-checkbox-inner-container'))

WebUI.click(findTestObject('Object Repository/Customize Add/Page_QuentPreUserTrail/button_Add'))

WebUI.click(findTestObject('Object Repository/Customize Add/Page_QuentPreUserTrail/span_HR Predicate Reading_mat-checkbox-inne_a8e428'))

WebUI.click(findTestObject('Object Repository/Customize Add/Page_QuentPreUserTrail/span_SpO2 Quent time stamp_mat-checkbox-inn_ab4117'))

WebUI.click(findTestObject('Object Repository/Customize Add/Page_QuentPreUserTrail/span_CBT Quent_mat-checkbox-inner-container'))

WebUI.click(findTestObject('Object Repository/Customize Add/Page_QuentPreUserTrail/span_CBT Golden Apparatus Reading Image_mat_c3ec05'))

WebUI.click(findTestObject('Object Repository/Customize Add/Page_QuentPreUserTrail/span_BP Quent time stamp_mat-checkbox-inner_87a943'))

WebUI.click(findTestObject('Object Repository/Customize Add/Page_QuentPreUserTrail/button_Add'))

WebUI.closeBrowser()

