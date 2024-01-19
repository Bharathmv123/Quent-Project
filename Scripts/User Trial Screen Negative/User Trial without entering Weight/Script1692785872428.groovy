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

Mobile.tap(findTestObject('Object Repository/User trail without entering weight/android.widget.CheckBox - User Trial'), 
    0)

Mobile.tap(findTestObject('Object Repository/User trail without entering weight/android.widget.CheckBox'), 0)

Mobile.tap(findTestObject('Object Repository/User trail without entering weight/android.widget.Button - Next'), 0)

Mobile.switchToNative()

Mobile.tap(findTestObject('Object Repository/User trail without entering weight/android.widget.ImageButton'), 0)

Mobile.tap(findTestObject('Object Repository/User trail without entering weight/android.widget.TextView - 91'), 0)

Mobile.sendKeys(findTestObject('Object Repository/User trail without entering weight/android.widget.EditText - Phone number'), 
    '9022351287')

Mobile.sendKeys(findTestObject('Object Repository/User trail without entering weight/android.widget.EditText - Password'), 
    'Test@123')

Mobile.tap(findTestObject('Object Repository/User trail without entering weight/android.widget.Button - Sign In'), 0)

Mobile.switchToNative()

Mobile.tap(findTestObject('Object Repository/User trail without entering weight/android.widget.ImageButton (1)'), 0)

Mobile.switchToNative()

Mobile.delay(20)

Mobile.tap(findTestObject('Object Repository/User trail without entering weight/android.widget.TextView - Trial Batch'), 
    0)

Mobile.tap(findTestObject('Object Repository/User trail without entering weight/android.view.ViewGroup'), 0)

Mobile.scrollToText('Room Temp')

Mobile.sendKeys(findTestObject('Object Repository/User trail without entering weight/android.widget.EditText - Room Temp'), 
    '32')

Mobile.sendKeys(findTestObject('Object Repository/User trail without entering weight/android.widget.EditText - Body Temp'), 
    '32')

Mobile.scrollToText('Measure')

Mobile.switchToNative()

Mobile.tap(findTestObject('Object Repository/User trail without entering weight/android.widget.CompoundButton - BLE'), 0)

Mobile.tap(findTestObject('Object Repository/User trail without entering weight/android.widget.Button - Connect'), 0)

Mobile.tap(findTestObject('Object Repository/User trail without entering weight/android.widget.Button - Scan for Watch'), 
    0)

Mobile.switchToNative()

Mobile.delay(30)

Mobile.tap(findTestObject('Object Repository/User trail without entering weight/android.widget.Button - Go to Dashboard (1)'), 
    0)

Mobile.switchToNative()

Mobile.scrollToText('Measure')

Mobile.tap(findTestObject('Object Repository/User trail without entering weight/android.widget.Button - Measure'), 0)

Mobile.getText(findTestObject('Object Repository/User trail without entering weight/android.widget.TextView - Weight is mandatory'), 
    0)

Mobile.closeApplication()
