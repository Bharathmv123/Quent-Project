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

Mobile.switchToNative()

Mobile.switchToNative()

Mobile.switchToNative()

Mobile.tap(findTestObject('Object Repository/EKG Golden and Pred/XCUIElementTypeStaticText - Golden Apparatus Reading'), 
    0)

Mobile.sendKeys(findTestObject('Object Repository/EKG Golden and Pred/XCUIElementTypeTextField - PR interval'), '76')

Mobile.sendKeys(findTestObject(''), '92')

Mobile.sendKeys(findTestObject('Object Repository/EKG Golden and Pred/XCUIElementTypeTextField - QRS Duration'), '112')

Mobile.sendKeys(findTestObject('Object Repository/EKG Golden and Pred/XCUIElementTypeTextField - RR interval'), '239')

Mobile.tap(findTestObject('Object Repository/EKG Golden and Pred/XCUIElementTypeTextField - Inference'), 0)

Mobile.switchToNative()

Mobile.sendKeys(findTestObject('Object Repository/EKG Golden and Pred/XCUIElementTypeTextField - bpm'), '88')

Mobile.switchToNative()

Mobile.sendKeys(findTestObject('Object Repository/EKG Golden and Pred/XCUIElementTypeTextField - Description (1)'), 'ECG')

Mobile.tap(findTestObject('Object Repository/EKG Golden and Pred/XCUIElementTypeButton - Save'), 0)

Mobile.tap(findTestObject('Object Repository/EKG Golden and Pred/XCUIElementTypeStaticText - Predicate Reading'), 0)

Mobile.sendKeys(findTestObject('Object Repository/EKG Golden and Pred/XCUIElementTypeTextField - PR interval'), '76')

Mobile.sendKeys(findTestObject(''), '101')

Mobile.sendKeys(findTestObject('Object Repository/EKG Golden and Pred/XCUIElementTypeTextField - QRS Duration'), '112')

Mobile.sendKeys(findTestObject('Object Repository/EKG Golden and Pred/XCUIElementTypeTextField - RR interval'), '239')

Mobile.tap(findTestObject('Object Repository/EKG Golden and Pred/XCUIElementTypeTextField - Inference'), 0)

Mobile.sendKeys(findTestObject('Object Repository/EKG Golden and Pred/XCUIElementTypeTextField - bpm (1)'), '88')

Mobile.sendKeys(findTestObject('Object Repository/EKG Golden and Pred/XCUIElementTypeTextField - Description (1)'), 'ECG')

Mobile.tap(findTestObject('Object Repository/EKG Golden and Pred/XCUIElementTypeButton - Save'), 0)

Mobile.tap(findTestObject('Object Repository/EKG Golden and Pred/XCUIElementTypeButton - ic put attachment'), 0)

Mobile.tap(findTestObject('Object Repository/EKG Golden and Pred/XCUIElementTypeButton - Take Photo'), 0)

Mobile.switchToNative()

Mobile.switchToNative()

Mobile.tap(findTestObject(''), 0)

Mobile.closeApplication()

