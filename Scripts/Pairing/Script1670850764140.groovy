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

Mobile.startApplication('C:\\Users\\Linus\\Downloads\\Quent_V2022.22 V1.1.51_101120220834_staging.apk', true)

Mobile.tap(findTestObject('Object Repository/Pairing/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/Pairing/android.widget.CheckBox - User Trial'), 0)

Mobile.switchToNative()

Mobile.tap(findTestObject('Object Repository/Pairing/android.widget.CheckBox'), 0)

Mobile.tap(findTestObject('Object Repository/Pairing/android.widget.Button - Next'), 0)

Mobile.switchToNative()

Mobile.tap(findTestObject('Object Repository/Pairing/android.widget.ImageButton'), 0)

Mobile.tap(findTestObject('Object Repository/Pairing/android.widget.ImageView (1)'), 0)

Mobile.sendKeys(findTestObject('Object Repository/Pairing/android.widget.EditText - Phone number'), '8050694262')

Mobile.sendKeys(findTestObject('Object Repository/Pairing/android.widget.EditText - Password'), 'Test@123')

Mobile.tap(findTestObject('Object Repository/Pairing/android.widget.Button - Sign In'), 0)

Mobile.switchToNative()

Mobile.scrollToText('measure')

Mobile.tap(findTestObject('Object Repository/Pairing/android.widget.Button - Pair Watch'), 0)

Mobile.tap(findTestObject('Object Repository/Pairing/android.widget.Button - Scan for Watch'), 0)

Mobile.tap(findTestObject('Object Repository/Pairing/android.widget.TextView - QT0113Rssi Value -71'), 0)

Mobile.tap(findTestObject('Object Repository/Pairing/android.widget.Button - Pair'), 0)

Mobile.switchToNative()

Mobile.sendKeys(findTestObject('Object Repository/Pairing/android.widget.EditText - Usually 0000 or 1234'), '832868')

Mobile.tap(findTestObject('Object Repository/Pairing/android.widget.Button - Pair (1)'), 0)

Mobile.sendKeys(findTestObject(''), '960377')

Mobile.tap(findTestObject(''), 0)

Mobile.closeApplication()

