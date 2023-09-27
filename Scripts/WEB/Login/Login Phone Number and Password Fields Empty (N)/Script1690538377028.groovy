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

WebUI.click(findTestObject('Object Repository/Login Phone number and Password Field empty/Page_QuentPreUserTrail/button_Login'))

WebUI.click(findTestObject('Object Repository/Login Phone number and Password Field empty/Page_QuentPreUserTrail/mat-error_Phone number is required'))

WebUI.click(findTestObject('Object Repository/Login Phone number and Password Field empty/Page_QuentPreUserTrail/div_Phone number is required'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Login Phone number and Password Field empty/Page_QuentPreUserTrail/mat-error_Phone number is required'), 
    0)

WebUI.click(findTestObject('Object Repository/Login Phone number and Password Field empty/Page_QuentPreUserTrail/mat-error_Password is required'))

WebUI.getAttribute(findTestObject('Object Repository/Login Phone number and Password Field empty/Page_QuentPreUserTrail/mat-error_Password is required'), 
    '')

WebUI.closeBrowser()

