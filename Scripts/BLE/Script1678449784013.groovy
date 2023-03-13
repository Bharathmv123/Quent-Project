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

Mobile.startApplication('C:\\Users\\Linus\\Downloads\\Quent_V2023.4 V1.1.70_220220231627_staging.apk', true)

Mobile.switchToNative()

Mobile.scrollToText('Wrist Size')

Mobile.switchToNative()

Mobile.scrollToText('Additional Info')

Mobile.tap(findTestObject('Object Repository/BLE/android.widget.CompoundButton - BLE'), 0)

Mobile.tap(findTestObject('Object Repository/BLE/android.widget.Button - Connect'), 0)

Mobile.tap(findTestObject('Object Repository/BLE/android.widget.Button - Scan for Watch'), 0)

Mobile.switchToNative()

Mobile.tap(findTestObject('Object Repository/BLE/android.widget.Button - Measure'), 0)

Mobile.closeApplication()

