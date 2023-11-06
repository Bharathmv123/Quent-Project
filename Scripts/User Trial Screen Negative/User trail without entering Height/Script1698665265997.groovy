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

Mobile.startApplication('/Users/apple/Downloads/Quent_V2023.21 V1.1.100_191020230921_staging.apk', true)

Mobile.switchToNative()

Mobile.tap(findTestObject('Object Repository/User trail without entering weight/android.widget.CheckBox - User Trial (1)'), 
    0)

Mobile.switchToNative()

Mobile.tap(findTestObject('Object Repository/User trail without entering weight/android.widget.CheckBox (1)'), 0)

Mobile.tap(findTestObject('Object Repository/User trail without entering weight/android.widget.Button - Next (1)'), 0)

Mobile.tap(findTestObject('Object Repository/User trail without entering weight/android.widget.ImageButton (2)'), 0)

Mobile.tap(findTestObject('Object Repository/User trail without entering weight/android.widget.TextView - 91 (1)'), 0)

Mobile.sendKeys(findTestObject('Object Repository/User trail without entering weight/android.widget.EditText - Phone number (1)'), 
    '9022351287')

Mobile.sendKeys(findTestObject('Object Repository/User trail without entering weight/android.widget.EditText - Password (1)'), 
    'Test@123')

Mobile.tap(findTestObject('Object Repository/User trail without entering weight/android.widget.Button - Sign In (1)'), 0)

Mobile.switchToNative()

Mobile.tap(findTestObject('Object Repository/User trail without entering weight/android.widget.ImageButton (3)'), 0)

Mobile.switchToNative()

Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/User trail without entering weight/android.widget.TextView - Trial Batch (1)'), 
    0)

Mobile.tap(findTestObject('Object Repository/User trail without entering weight/android.widget.TextView - Trail Batch 1'), 
    0)

Mobile.sendKeys(findTestObject('Object Repository/User trail without entering weight/android.widget.EditText - Name'), 'Deepak')

Mobile.tap(findTestObject('Object Repository/User trail without entering weight/android.widget.ImageButton (4)'), 0)

Mobile.tap(findTestObject('Object Repository/User trail without entering weight/android.widget.Button - OK'), 0)

Mobile.scrollToText('Gender')

Mobile.tap(findTestObject('Object Repository/User trail without entering weight/android.widget.ImageButton (5)'), 0)

Mobile.tap(findTestObject('Object Repository/User trail without entering weight/android.widget.AutoCompleteTextView - Blood Group'), 
    0)

Mobile.tap(findTestObject('Object Repository/User trail without entering weight/android.widget.ImageButton (6)'), 0)

Mobile.tap(findTestObject('Object Repository/User trail without entering weight/android.widget.EditText - Height'), 0)

Mobile.sendKeys(findTestObject('Object Repository/User trail without entering weight/android.widget.EditText - Weight'), 
    '45')

Mobile.scrollToText('Wrist Type')

Mobile.tap(findTestObject('Object Repository/User trail without entering weight/android.widget.ImageButton (7)'), 0)

Mobile.tap(findTestObject('Object Repository/User trail without entering weight/android.widget.AutoCompleteTextView - Skin Color'), 
    0)

Mobile.tap(findTestObject('Object Repository/User trail without entering weight/android.widget.AutoCompleteTextView - Skin Color (1)'), 
    0)

Mobile.tap(findTestObject('Object Repository/User trail without entering weight/android.widget.EditText - Hip Size'), 0)

Mobile.tap(findTestObject('Object Repository/User trail without entering weight/android.widget.AutoCompleteTextView - Skin Nature'), 
    0)

Mobile.tap(findTestObject('Object Repository/User trail without entering weight/android.widget.LinearLayout'), 0)

Mobile.scrollToText('Room Temp')

Mobile.tap(findTestObject('Object Repository/User trail without entering weight/android.widget.EditText - Room Temp (1)'), 
    0)

Mobile.hideKeyboard()

Mobile.sendKeys(findTestObject('Object Repository/User trail without entering weight/android.widget.EditText - Room Temp (2)'), 
    '35')

Mobile.sendKeys(findTestObject('Object Repository/User trail without entering weight/android.widget.EditText - Body Temp (1)'), 
    '35')

Mobile.scrollToText('Measure')

Mobile.tap(findTestObject('Object Repository/User trail without entering weight/android.widget.CompoundButton - BLE (1)'), 
    0)

Mobile.tap(findTestObject('Object Repository/User trail without entering weight/android.widget.Button - Connect (1)'), 0)

Mobile.tap(findTestObject('Object Repository/User trail without entering weight/android.widget.Button - Scan for Watch (1)'), 
    0)

Mobile.switchToNative()

Mobile.delay(40)

Mobile.tap(findTestObject('Object Repository/User trail without entering weight/android.widget.Button - Go to Dashboard (2)'), 
    0)

Mobile.scrollToText('Measure')

Mobile.tap(findTestObject('Object Repository/User trail without entering weight/android.widget.Button - Measure (1)'), 0)

Mobile.getText(findTestObject('Object Repository/User trail without entering weight/android.widget.TextView - Height is mandatory'), 
    0)

Mobile.delay(5)

Mobile.closeApplication()

