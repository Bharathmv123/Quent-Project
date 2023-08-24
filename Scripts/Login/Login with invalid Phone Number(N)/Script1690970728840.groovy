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

Mobile.tap(findTestObject('Object Repository/Login for Invalid Phone Number/android.widget.CheckBox - User Trial (1)'), 
    0)

Mobile.tap(findTestObject('Object Repository/Login for Invalid Phone Number/android.widget.CheckBox (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Login for Invalid Phone Number/android.widget.Button - Next (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Login for Invalid Phone Number/android.widget.ImageButton (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Login for Invalid Phone Number/android.widget.RelativeLayout'), 0)

Mobile.sendKeys(findTestObject('Object Repository/Login for Invalid Phone Number/android.widget.EditText - Phone number (1)'), 
    '8217603947')

Mobile.sendKeys(findTestObject('Object Repository/Login for Invalid Phone Number/android.widget.EditText - Password (1)'), 
    'Test@123')

Mobile.tap(findTestObject('Object Repository/Login for Invalid Phone Number/android.widget.Button - Sign In (1)'), 0)

Mobile.getText(findTestObject('Object Repository/Login for Invalid Phone Number/android.widget.TextView - Please contact customer support (1)'), 
    0)

Mobile.closeApplication()
