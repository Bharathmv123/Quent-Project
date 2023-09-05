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

Mobile.startApplication('/Users/apple/Desktop/IRIS_STA (1).ipa', true)

Mobile.tap(findTestObject('Object Repository/Login New/Login without selecting country in Select country page/XCUIElementTypeButton - Allow'),
	0)


Mobile.tap(findTestObject('Object Repository/User Trial End to End/XCUIElementTypeButton - ic uncheckedCheckbox3'), 0)

Mobile.tap(findTestObject('Object Repository/User Trial End to End/XCUIElementTypeOther'), 0)

Mobile.tap(findTestObject('Object Repository/User Trial End to End/XCUIElementTypeButton - Next'), 0)

Mobile.delay(20)

Mobile.sendKeys(findTestObject('Object Repository/User Trial End to End/XCUIElementTypeTextField -   Phone number'), '8217603935')

Mobile.sendKeys(findTestObject('Object Repository/User Trial End to End/XCUIElementTypeSecureTextField - Password'), 'Test@123')

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/User Trial End to End/XCUIElementTypeButton - Sign In'), 0)

Mobile.tap(findTestObject('Object Repository/Login with Valid credential/XCUIElementTypeButton - Allow Once'), 0)

Mobile.tap(findTestObject('Object Repository/User Trial End to End/XCUIElementTypeButton - OK'), 0)

Mobile.tap(findTestObject('Object Repository/User Trial End to End/XCUIElementTypeButton - OK'), 0)

Mobile.tap(findTestObject('Object Repository/User Trial User Reference ID/XCUIElementTypeTextField - Date of Birth'), 0)

Mobile.delay(20)

Mobile.closeApplication()



