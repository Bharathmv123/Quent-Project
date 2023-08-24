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

Mobile.startApplication('/Users/apple/Downloads/Quent_V2023.14 V1.1.91_070720231029_staging.apk', true)

Mobile.switchToNative()

Mobile.tap(findTestObject('Object Repository/Login with valid credentials/android.widget.CheckBox - User Trial (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Login with valid credentials/android.widget.CheckBox (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Login with valid credentials/android.widget.Button - Next (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Login with valid credentials/android.widget.ImageButton (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Login with valid credentials/android.widget.RelativeLayout'), 0)

Mobile.sendKeys(findTestObject('Object Repository/Login with valid credentials/android.widget.EditText - Phone number (1)'), 
    '8217603935')

Mobile.sendKeys(findTestObject('Object Repository/Login with valid credentials/android.widget.EditText - Password (1)'), 
    'Test@123')

Mobile.tap(findTestObject('Object Repository/Login with valid credentials/android.widget.Button - Sign In (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Login with valid credentials/android.widget.ImageView (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Login with valid credentials/android.widget.TextView - Signout (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Login with valid credentials/android.widget.Button - YES (1)'), 0)

Mobile.closeApplication()

