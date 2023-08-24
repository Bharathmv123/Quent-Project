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

Mobile.switchToNative()

Mobile.tap(findTestObject('Object Repository/End to End vitals/XCUIElementTypeButton - ic uncheckedCheckbox3'), 0)

Mobile.tap(findTestObject('Object Repository/End to End vitals/XCUIElementTypeOther'), 0)

Mobile.tap(findTestObject('Object Repository/End to End vitals/XCUIElementTypeButton - Next'), 0)

Mobile.switchToNative()

Mobile.setText(findTestObject(''), '8050694262', 0)

Mobile.setText(findTestObject('Object Repository/End to End vitals/XCUIElementTypeSecureTextField - Password'), 'Test@123', 
    0)

Mobile.switchToNative()

Mobile.switchToNative()

Mobile.tap(findTestObject('Object Repository/End to End vitals/XCUIElementTypeTextField - Trail Batch'), 0)

Mobile.tap(findTestObject('Object Repository/End to End vitals/XCUIElementTypeTextField - Gender'), 0)

Mobile.switchToNative()

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject('Object Repository/End to End vitals/XCUIElementTypeTextField - Golden Apparatus Device ID'), 
    0)

Mobile.sendKeys(findTestObject('Object Repository/End to End vitals/XCUIElementTypeTextField - Name'), 'Kish')

Mobile.switchToNative()

Mobile.tap(findTestObject('Object Repository/End to End vitals/XCUIElementTypeTextField - Date of Birth'), 0)

Mobile.switchToNative()

Mobile.tap(findTestObject('Object Repository/End to End vitals/XCUIElementTypeButton - ic put qrcode'), 0)

Mobile.switchToNative()

Mobile.setText(findTestObject('Object Repository/End to End vitals/XCUIElementTypeTextField - Age'), '33', 0)

Mobile.tap(findTestObject('Object Repository/End to End vitals/XCUIElementTypeButton - Done'), 0)

Mobile.tap(findTestObject('Object Repository/End to End vitals/XCUIElementTypeTextField - Blood Group'), 0)

Mobile.tap(findTestObject('Object Repository/End to End vitals/XCUIElementTypeTextField - Weight'), 0)

Mobile.switchToNative()

Mobile.tap(findTestObject('Object Repository/End to End vitals/XCUIElementTypeTextField - Wrist Observation'), 0)

Mobile.tap(findTestObject('Object Repository/End to End vitals/XCUIElementTypeTextField - Firmware Version'), 0)

Mobile.switchToNative()

Mobile.sendKeys(findTestObject('Object Repository/End to End vitals/XCUIElementTypeTextField - Room Temp'), '33')

Mobile.setText(findTestObject('Object Repository/End to End vitals/XCUIElementTypeTextField - Body Temp'), '33', 0)

Mobile.switchToNative()

Mobile.scrollToText('Additional Info')

Mobile.tap(findTestObject('Object Repository/End to End vitals/XCUIElementTypeButton - BLE'), 0)

Mobile.tap(findTestObject('Object Repository/End to End vitals/XCUIElementTypeButton - Connect'), 0)

Mobile.tap(findTestObject('Object Repository/End to End vitals/XCUIElementTypeButton - Scan for Watch'), 0)

Mobile.switchToNative()

Mobile.switchToNative()

Mobile.tap(findTestObject(''), 0)

Mobile.switchToNative()

Mobile.switchToNative()

Mobile.tap(findTestObject('Object Repository/End to End vitals/XCUIElementTypeButton'), 0)

Mobile.tap(findTestObject('Object Repository/End to End vitals/XCUIElementTypeOther - Horizontal scroll bar, 1 page'), 0)

Mobile.switchToNative()

Mobile.tap(findTestObject(''), 0)

Mobile.switchToNative()

Mobile.switchToNative()

Mobile.closeApplication()

