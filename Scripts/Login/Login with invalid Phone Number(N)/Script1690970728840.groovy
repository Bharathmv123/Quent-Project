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

Mobile.startApplication(GlobalVariable.url, true)

Mobile.switchToNative()

Mobile.tap(findTestObject('Object Repository/Login for Invalid Phone Number/android.widget.CheckBox - User Trial (2)'), 
    0)

Mobile.switchToNative()

Mobile.tap(findTestObject('Object Repository/Login for Invalid Phone Number/android.widget.CheckBox (2)'), 0)

Mobile.tap(findTestObject('Object Repository/Login for Invalid Phone Number/android.widget.Button - Next (2)'), 0)

Mobile.tap(findTestObject('Object Repository/Login for Invalid Phone Number/android.widget.ImageButton (2)'), 0)

Mobile.tap(findTestObject('Object Repository/Login for Invalid Phone Number/android.widget.TextView - 91 (1)'), 0)

Mobile.sendKeys(findTestObject('Object Repository/Login for Invalid Phone Number/android.widget.EditText - Phone number (2)'), 
    '6789876789')

Mobile.sendKeys(findTestObject('Object Repository/Login for Invalid Phone Number/android.widget.EditText - Password (2)'), 
    'Test@123')

Mobile.tap(findTestObject('Object Repository/Login for Invalid Phone Number/android.widget.Button - Sign In (2)'), 0)

Mobile.switchToNative()

Mobile.getText(findTestObject('Object Repository/Login for Invalid Phone Number/android.widget.TextView - ERROR'), 0)

Mobile.tap(findTestObject('Object Repository/Login for Invalid Phone Number/android.widget.Button - Close'), 0)

Mobile.closeApplication()
