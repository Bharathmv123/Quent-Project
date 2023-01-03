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

WebUI.click(findTestObject('Object Repository/Web - Login to ECG/Page_QuentPreUserTrail/div_1'))

WebUI.click(findTestObject('Object Repository/Web - Login to ECG/Page_QuentPreUserTrail/span_91'))

WebUI.setText(findTestObject('Object Repository/Web - Login to ECG/Page_QuentPreUserTrail/input__login-phonenumber'), '8050694262')

WebUI.setEncryptedText(findTestObject('Object Repository/Web - Login to ECG/Page_QuentPreUserTrail/input__login-password'), 
    'cvW8qx4B2o3F4VwP/kNsqA==')

WebUI.click(findTestObject('Object Repository/Web - Login to ECG/Page_QuentPreUserTrail/img__mat-tooltip-trigger ng-star-inserted'))

WebUI.click(findTestObject('Object Repository/Web - Login to ECG/Page_QuentPreUserTrail/img__mat-tooltip-trigger ng-star-inserted_1'))

WebUI.click(findTestObject('Object Repository/Web - Login to ECG/Page_QuentPreUserTrail/button_Login'))

WebUI.setText(findTestObject('Object Repository/Web - Login to ECG/Page_QuentPreUserTrail/input_PUT Data_mat-input-2'), 
    'ECG')

WebUI.click(findTestObject('Object Repository/Web - Login to ECG/Page_QuentPreUserTrail/button_Search'))

WebUI.click(findTestObject('Object Repository/Web - Login to ECG/Page_QuentPreUserTrail/button_View'))

WebUI.click(findTestObject('Object Repository/Web - Login to ECG/Page_QuentPreUserTrail/button_concat(id(, , close, , ))_close'))

WebUI.click(findTestObject('Object Repository/Web - Login to ECG/Page_QuentPreUserTrail/img_Staging Environment for PUT_profile-squ_d1abe6'))

WebUI.click(findTestObject('Object Repository/Web - Login to ECG/Page_QuentPreUserTrail/button_Download'))

WebUI.setText(findTestObject('Object Repository/Web - Login to ECG/Page_QuentPreUserTrail/input_PUT Data_mat-input-2'), 
    '')

WebUI.click(findTestObject('Object Repository/Web - Login to ECG/Page_QuentPreUserTrail/button_Clear'))

WebUI.click(findTestObject('Object Repository/Web - Login to ECG/Page_QuentPreUserTrail/button_Staging Environment for PUT_mat-focu_bb4164'))

WebUI.click(findTestObject('Object Repository/Web - Login to ECG/Page_QuentPreUserTrail/button_Logout'))

WebUI.closeBrowser()

