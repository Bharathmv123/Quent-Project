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

Mobile.tap(findTestObject('Object Repository/User Trial Select Blood Group/android.widget.CheckBox - User Trial (1)'), 0)

Mobile.switchToNative()

Mobile.tap(findTestObject('Object Repository/User Trial Select Blood Group/android.widget.CheckBox (1)'), 0)

Mobile.tap(findTestObject('Object Repository/User Trial Select Blood Group/android.widget.Button - Next (1)'), 0)

Mobile.tap(findTestObject('Object Repository/User Trial Select Blood Group/android.widget.ImageButton (3)'), 0)

Mobile.tap(findTestObject('Object Repository/User Trial Select Blood Group/android.widget.TextView - 91'), 0)

Mobile.sendKeys(findTestObject('Object Repository/User Trial Select Blood Group/android.widget.EditText - Phone number (1)'), 
    '9022351287')

Mobile.sendKeys(findTestObject('Object Repository/User Trial Select Blood Group/android.widget.EditText - Password (1)'), 
    'Test@123')

Mobile.tap(findTestObject('Object Repository/User Trial Select Blood Group/android.widget.Button - Sign In (1)'), 0)

Mobile.switchToNative()

Mobile.tap(findTestObject('Object Repository/User Trial Select Blood Group/android.widget.TextView - Trial Batch'), 0)

Mobile.tap(findTestObject('Object Repository/User Trial Select Blood Group/android.widget.TextView - Trail Batch 1'), 0)

Mobile.sendKeys(findTestObject('Object Repository/User Trial Select Blood Group/android.widget.EditText - Name'), 'Diksha')

Mobile.tap(findTestObject('Object Repository/User Trial Select Blood Group/android.widget.ImageButton (4)'), 0)

Mobile.tap(findTestObject('Object Repository/User Trial Select Blood Group/android.view.View - 13'), 0)

Mobile.tap(findTestObject('Object Repository/User Trial Select Blood Group/android.widget.Button - OK'), 0)

Mobile.scrollToText('Gender')

Mobile.tap(findTestObject('Object Repository/User Trial Select Blood Group/android.widget.ImageButton (5)'), 0)

Mobile.tap(findTestObject('Object Repository/User Trial Select Blood Group/android.widget.AutoCompleteTextView - Blood Group'), 
    0)

Mobile.tap(findTestObject('Object Repository/User Trial Select Blood Group/android.widget.EditText - Height'), 0)

Mobile.hideKeyboard()

Mobile.sendKeys(findTestObject('Object Repository/User Trial Select Blood Group/android.widget.EditText - Height (1)'), 
    '165')

Mobile.sendKeys(findTestObject('Object Repository/User Trial Select Blood Group/android.widget.EditText - Weight'), '76')

Mobile.tap(findTestObject('Object Repository/User Trial Select Blood Group/android.widget.AutoCompleteTextView - Wrist Type'), 
    0)

Mobile.tap(findTestObject('Object Repository/User Trial Select Blood Group/android.widget.AutoCompleteTextView - Skin Color'), 
    0)

Mobile.tap(findTestObject('Object Repository/User Trial Select Blood Group/android.widget.ImageButton (6)'), 0)

Mobile.scrollToText('Room Temp')

Mobile.sendKeys(findTestObject('Object Repository/User Trial Select Blood Group/android.widget.EditText - Room Temp'), '32')

Mobile.sendKeys(findTestObject('Object Repository/User Trial Select Blood Group/android.widget.EditText - Body Temp'), '32')

Mobile.scrollToText('Measure')

Mobile.tap(findTestObject('Object Repository/User Trial Select Blood Group/android.widget.CompoundButton - BLE'), 0)

Mobile.tap(findTestObject('Object Repository/User Trial Select Blood Group/android.widget.Button - Connect'), 0)

Mobile.tap(findTestObject('Object Repository/User Trial Select Blood Group/android.widget.Button - Scan for Watch'), 0)

Mobile.switchToNative()

Mobile.delay(30)

Mobile.switchToNative()

Mobile.tap(findTestObject('Object Repository/User Trial Select Blood Group/android.widget.Button - Go to Dashboard'), 0)

Mobile.scrollToText('Measure')

Mobile.tap(findTestObject('Object Repository/User Trial Select Blood Group/android.widget.Button - Measure'), 0)

Mobile.scrollToText('Blood group')

Mobile.scrollToText('User Reference id')

Mobile.tap(findTestObject('Object Repository/User Trial Select Blood Group/android.widget.ImageButton (7)'), 0)

Mobile.delay(10)

Mobile.switchToNative()

Mobile.scrollToText('Measure')

Mobile.getText(findTestObject('Object Repository/User Trial Select Blood Group/android.widget.Button - Measure (1)'), 0)

Mobile.closeApplication()

