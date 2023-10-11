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

Mobile.startApplication('/Users/apple/Downloads/Quent_V2023.16 V1.1.94_040920231653_staging.apk', true)

Mobile.switchToNative()

Mobile.tap(findTestObject('Object Repository/User Trial End to End/android.widget.CheckBox - User Trial'), 0)

Mobile.tap(findTestObject('Object Repository/User Trial End to End/android.widget.CheckBox'), 0)

Mobile.tap(findTestObject('Object Repository/User Trial End to End/android.widget.Button - Next'), 0)

Mobile.tap(findTestObject('Object Repository/User Trial End to End/android.widget.ImageButton'), 0)

Mobile.tap(findTestObject('Object Repository/User Trial End to End/android.widget.TextView - 91'), 0)

Mobile.sendKeys(findTestObject('Object Repository/User Trial End to End/android.widget.EditText - Phone number'), '8217603935')

Mobile.sendKeys(findTestObject('Object Repository/User Trial End to End/android.widget.EditText - Password'), 'Test@123')

Mobile.tap(findTestObject('Object Repository/User Trial End to End/android.widget.Button - Sign In'), 0)

Mobile.scrollToText('Room Temp')

Mobile.sendKeys(findTestObject('Object Repository/User Trial End to End/android.widget.EditText - Room Temp (1)'), '37.1')

Mobile.delay(10)

Mobile.closeApplication()
