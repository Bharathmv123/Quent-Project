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

WebUI.navigateToUrl('http://ec2-34-194-6-57.compute-1.amazonaws.com/quent-pre-user-trail/')

WebUI.click(findTestObject('Object Repository/Web - New PUT Data/Page_QuentPreUserTrail/div_1'))

WebUI.click(findTestObject('Object Repository/Web - New PUT Data/Page_QuentPreUserTrail/span_91'))

WebUI.setText(findTestObject('Object Repository/Web - New PUT Data/Page_QuentPreUserTrail/input__login-phonenumber'), '8050694262')

WebUI.click(findTestObject('Object Repository/Web - New PUT Data/Page_QuentPreUserTrail/div__mat-form-field-infix ng-tns-c113-2'))

WebUI.setEncryptedText(findTestObject('Object Repository/Web - New PUT Data/Page_QuentPreUserTrail/input__login-password'), 
    'cvW8qx4B2o3F4VwP/kNsqA==')

WebUI.click(findTestObject('Object Repository/Web - New PUT Data/Page_QuentPreUserTrail/img__mat-tooltip-trigger ng-star-inserted'))

WebUI.click(findTestObject('Object Repository/Web - New PUT Data/Page_QuentPreUserTrail/img__mat-tooltip-trigger ng-star-inserted_1'))

WebUI.click(findTestObject('Object Repository/Web - New PUT Data/Page_QuentPreUserTrail/button_Login'))

WebUI.click(findTestObject('Object Repository/Web - New PUT Data/Page_QuentPreUserTrail/input_First Name_mat-input-5'))

WebUI.setText(findTestObject('Object Repository/Web - New PUT Data/Page_QuentPreUserTrail/input_First Name_mat-input-5'), 
    'Diksha')

WebUI.sendKeys(findTestObject('Object Repository/Web - New PUT Data/Page_QuentPreUserTrail/input_First Name_mat-input-5'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Web - New PUT Data/Page_QuentPreUserTrail/mat-header-row_Agent Id  User Refrence Id  _d30763'))

WebUI.setText(findTestObject('Object Repository/Web - New PUT Data/Page_QuentPreUserTrail/input_First Name_mat-input-5'), 
    '')

WebUI.click(findTestObject('Object Repository/Web - New PUT Data/Page_QuentPreUserTrail/span_CM'))

WebUI.click(findTestObject('Object Repository/Web - New PUT Data/Page_QuentPreUserTrail/div_5 4'))

WebUI.click(findTestObject('Object Repository/Web - New PUT Data/Page_QuentPreUserTrail/span_Feet'))

WebUI.click(findTestObject('Object Repository/Web - New PUT Data/Page_QuentPreUserTrail/span_Kg'))

WebUI.click(findTestObject('Object Repository/Web - New PUT Data/Page_QuentPreUserTrail/span_lbs'))

WebUI.click(findTestObject('Object Repository/Web - New PUT Data/Page_QuentPreUserTrail/input_Channel_mat-input-6'))

WebUI.setText(findTestObject('Object Repository/Web - New PUT Data/Page_QuentPreUserTrail/input_Channel_mat-input-6'), 'BLE')

WebUI.sendKeys(findTestObject('Object Repository/Web - New PUT Data/Page_QuentPreUserTrail/input_Channel_mat-input-6'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Web - New PUT Data/Page_QuentPreUserTrail/input_Channel_mat-input-6'), '')

WebUI.setText(findTestObject('Object Repository/Web - New PUT Data/Page_QuentPreUserTrail/input_Vital Type_mat-input-7'), 
    'HR')

WebUI.click(findTestObject('Object Repository/Web - New PUT Data/Page_QuentPreUserTrail/div_HR'))

WebUI.setText(findTestObject('Object Repository/Web - New PUT Data/Page_QuentPreUserTrail/input_Vital Type_mat-input-7'), 
    'CBT')

WebUI.click(findTestObject('Object Repository/Web - New PUT Data/Page_QuentPreUserTrail/span_C'))

WebUI.click(findTestObject('Object Repository/Web - New PUT Data/Page_QuentPreUserTrail/span_F'))

WebUI.click(findTestObject('Object Repository/Web - New PUT Data/Page_QuentPreUserTrail/span_C'))

WebUI.click(findTestObject('Object Repository/Web - New PUT Data/Page_QuentPreUserTrail/span_F'))

WebUI.setText(findTestObject('Object Repository/Web - New PUT Data/Page_QuentPreUserTrail/input_Vital Type_mat-input-7'), 
    '')

WebUI.click(findTestObject('Object Repository/Web - New PUT Data/Page_QuentPreUserTrail/span_24 hour'))

WebUI.click(findTestObject('Object Repository/Web - New PUT Data/Page_QuentPreUserTrail/span_12 hour'))

WebUI.click(findTestObject('Object Repository/Web - New PUT Data/Page_QuentPreUserTrail/span_24 hour'))

WebUI.click(findTestObject('Object Repository/Web - New PUT Data/Page_QuentPreUserTrail/button_12 hour'))

WebUI.click(findTestObject('Object Repository/Web - New PUT Data/Page_QuentPreUserTrail/span_24 hour'))

WebUI.click(findTestObject('Object Repository/Web - New PUT Data/Page_QuentPreUserTrail/span_12 hour'))

WebUI.click(findTestObject('Object Repository/Web - New PUT Data/Page_QuentPreUserTrail/p_OTA'))

WebUI.click(findTestObject('Object Repository/Web - New PUT Data/Page_QuentPreUserTrail/p_Customize Export'))

WebUI.click(findTestObject('Object Repository/Web - New PUT Data/Page_QuentPreUserTrail/p_PUT Data'))

WebUI.click(findTestObject('Object Repository/Web - New PUT Data/Page_QuentPreUserTrail/button_Staging Environment for PUT_mat-focu_bb4164'))

WebUI.click(findTestObject('Object Repository/Web - New PUT Data/Page_QuentPreUserTrail/button_Logout'))

WebUI.closeBrowser()

