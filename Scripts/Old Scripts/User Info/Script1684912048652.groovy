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

Mobile.startApplication('/Users/apple/Downloads/IRIS_STA.ipa', true)

Mobile.tap(findTestObject('Object Repository/User Info/XCUIElementTypeButton - ic uncheckedCheckbox3'), 0)

Mobile.tap(findTestObject('Object Repository/User Info/XCUIElementTypeOther'), 0)

Mobile.tap(findTestObject('Object Repository/User Info/XCUIElementTypeStaticText - Next'), 0)

Mobile.switchToNative()

Mobile.delay(100)

Mobile.sendKeys(findTestObject('Object Repository/User Info/XCUIElementTypeTextField -   Phone number'), '8217603935')

Mobile.sendKeys(findTestObject('Object Repository/User Info/XCUIElementTypeSecureTextField - Password'), 'Test@123')

Mobile.tap(findTestObject('Object Repository/User Info/XCUIElementTypeOther (1)'), 0)

Mobile.switchToNative()

Mobile.tap(findTestObject('Object Repository/User Info/XCUIElementTypeButton - Sign In'), 0)

Mobile.tap(findTestObject('Object Repository/User Info/XCUIElementTypeButton - Allow Once'), 0)

Mobile.switchToNative()

Mobile.tap(findTestObject('Object Repository/User Info/XCUIElementTypeButton - ic put qrcode'), 0)

Mobile.switchToNative()

Mobile.delay(50)

Mobile.sendKeys(findTestObject('Object Repository/User Info/XCUIElementTypeTextField - Weight'), '45')

Mobile.sendKeys(findTestObject('Object Repository/User Info/XCUIElementTypeTextField - Wrist Size (1)'), '16')

Mobile.sendKeys(findTestObject('Object Repository/User Info/XCUIElementTypeTextField - Room Temp'), '37')

Mobile.sendKeys(findTestObject('Object Repository/User Info/XCUIElementTypeTextField - Body Temp'), '37.1')

Mobile.switchToNative()

Mobile.tap(findTestObject('Object Repository/User Info/XCUIElementTypeButton - BLE (1)'), 0)

Mobile.tap(findTestObject('Object Repository/User Info/XCUIElementTypeStaticText - Connect'), 0)

Mobile.tap(findTestObject('Object Repository/User Info/XCUIElementTypeButton - Connect'), 0)

Mobile.tap(findTestObject('Object Repository/User Info/XCUIElementTypeButton - Scan for Watch'), 0)

Mobile.delay(100)

Mobile.tap(findTestObject('Object Repository/User Info/XCUIElementTypeButton - Measure (1)'), 0)

Mobile.closeApplication()

