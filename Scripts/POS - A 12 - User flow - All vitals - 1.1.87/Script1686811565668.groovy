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

Mobile.startApplication('/Users/apple/Downloads/Quent_V2023.11_V1.1.87_290520230953_staging.apk', true)

Mobile.tap(findTestObject('Object Repository/New test script Andriod 12/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/New test script Andriod 12/android.widget.CheckBox - User Trial'), 0)

Mobile.switchToNative()

Mobile.tap(findTestObject('Object Repository/New test script Andriod 12/android.widget.CheckBox'), 0)

Mobile.tap(findTestObject('Object Repository/New test script Andriod 12/android.widget.Button - Next'), 0)

Mobile.switchToNative()

Mobile.tap(findTestObject('Object Repository/New test script Andriod 12/android.widget.ImageButton'), 0)

Mobile.tap(findTestObject('Object Repository/New test script Andriod 12/android.widget.ImageView (1)'), 0)

Mobile.sendKeys(findTestObject('Object Repository/New test script Andriod 12/android.widget.EditText - Phone number'), '8050694262')

Mobile.sendKeys(findTestObject('Object Repository/New test script Andriod 12/android.widget.EditText - Password'), 'Test@123')

Mobile.tap(findTestObject('Object Repository/New test script Andriod 12/android.widget.Button - Sign In'), 0)

Mobile.switchToNative()

Mobile.tap(findTestObject('Object Repository/New test script Andriod 12/android.widget.TextView - Trial Batch'), 0)

Mobile.tap(findTestObject('Object Repository/New test script Andriod 12/android.widget.TextView - Trail Batch 1'), 0)

Mobile.sendKeys(findTestObject('Object Repository/New test script Andriod 12/android.widget.EditText - Name'), 'Kishore')

Mobile.tap(findTestObject('Object Repository/New test script Andriod 12/android.widget.ImageButton (1)'), 0)

Mobile.tap(findTestObject('Object Repository/New test script Andriod 12/android.widget.TextView - 2005'), 0)

Mobile.tap(findTestObject('Object Repository/New test script Andriod 12/android.widget.TextView - 1999'), 0)

Mobile.tap(findTestObject('Object Repository/New test script Andriod 12/android.view.View - 1'), 0)

Mobile.tap(findTestObject('Object Repository/New test script Andriod 12/android.widget.Button - OK'), 0)

Mobile.tap(findTestObject('Object Repository/New test script Andriod 12/android.widget.ImageButton (2)'), 0)

Mobile.switchToNative()

Mobile.scrollToText('Gender')

Mobile.tap(findTestObject('Object Repository/New test script Andriod 12/android.widget.ImageButton (3)'), 0)

Mobile.tap(findTestObject('Object Repository/New test script Andriod 12/android.widget.AutoCompleteTextView - Blood Group'), 
    0)

Mobile.tap(findTestObject('Object Repository/New test script Andriod 12/android.widget.ImageButton (4)'), 0)

Mobile.tap(findTestObject('Object Repository/New test script Andriod 12/android.widget.EditText - Hip Size'), 0)

Mobile.sendKeys(findTestObject('Object Repository/New test script Andriod 12/android.widget.EditText - Height'), '164')

Mobile.sendKeys(findTestObject('Object Repository/New test script Andriod 12/android.widget.EditText - Weight'), '73')

Mobile.tap(findTestObject('Object Repository/New test script Andriod 12/android.widget.ImageButton (5)'), 0)

Mobile.tap(findTestObject('Object Repository/New test script Andriod 12/android.widget.AutoCompleteTextView - Skin Color'), 
    0)

Mobile.tap(findTestObject('Object Repository/New test script Andriod 12/android.widget.ImageButton (6)'), 0)

Mobile.tap(findTestObject('Object Repository/New test script Andriod 12/android.widget.FrameLayout'), 0)

Mobile.tap(findTestObject('Object Repository/New test script Andriod 12/android.widget.ImageButton (7)'), 0)

Mobile.tap(findTestObject('Object Repository/New test script Andriod 12/android.widget.EditText - Previous Illness'), 0)

Mobile.tap(findTestObject('Object Repository/New test script Andriod 12/android.widget.ImageButton (8)'), 0)

Mobile.tap(findTestObject('Object Repository/New test script Andriod 12/android.widget.AutoCompleteTextView - Brown Dark Brown'), 
    0)

Mobile.scrollToText('Room Temp*')

Mobile.sendKeys(findTestObject('Object Repository/New test script Andriod 12/android.widget.EditText - Room Temp'), '33')

Mobile.sendKeys(findTestObject('Object Repository/New test script Andriod 12/android.widget.EditText - Body Temp'), '33')

Mobile.scrollToText('Measure')

Mobile.tap(findTestObject('Object Repository/New test script Andriod 12/android.widget.CompoundButton - BLE'), 0)

Mobile.switchToNative()

Mobile.tap(findTestObject('Object Repository/Android 11/android.widget.Button - Connect'), 0)

Mobile.switchToNative()

Mobile.delay(40)

Mobile.tap(findTestObject('Object Repository/Android 11/android.widget.Button - Go to Dashboard'), 0)

Mobile.scrollToText('Measure')

Mobile.tap(findTestObject('Object Repository/Android 11/android.widget.Button - Measure'), 0)

Mobile.delay(5)

Mobile.tap(findTestObject('Object Repository/Connect/android.widget.ImageView (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Connect/android.widget.TextView - Measure'), 0)

Mobile.delay(80)

Mobile.switchToNative()

Mobile.tap(findTestObject('Object Repository/Connect/android.widget.TextView - Heart Rate'), 0)

Mobile.delay(2)

Mobile.tap(findTestObject('Object Repository/Connect/android.widget.ImageView (2)'), 0)

Mobile.tap(findTestObject('Object Repository/Connect/android.widget.TextView - Measure (1)'), 0)

Mobile.delay(120)

Mobile.switchToNative()

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Blood Oxygen'), 0)

Mobile.tap(findTestObject('Object Repository/BP ECG CBT/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/BP ECG CBT/android.widget.TextView - Measure'), 0)

Mobile.delay(100)

Mobile.tap(findTestObject('Object Repository/BP ECG CBT/android.widget.TextView - Blood Pressure'), 0)

Mobile.delay(3)

Mobile.tap(findTestObject('Object Repository/BP ECG CBT/android.widget.ImageView (1)'), 0)

Mobile.tap(findTestObject('Object Repository/BP ECG CBT/android.widget.TextView - Measure (1)'), 0)

Mobile.delay(130)

Mobile.delay(3)

Mobile.tap(findTestObject('Object Repository/BP ECG CBT/android.widget.ImageView (2)'), 0)

Mobile.scrollToText('Save')

Mobile.tap(findTestObject('Object Repository/BP ECG CBT/android.widget.TextView - Measure (2)'), 0)

Mobile.delay(30)

Mobile.switchToNative()

Mobile.tap(findTestObject('Object Repository/BP ECG CBT/android.widget.TextView - Body Temperature'), 0)

Mobile.tap(findTestObject('Object Repository/BP ECG CBT/android.widget.Button - Save'), 0)

Mobile.tap(findTestObject('Object Repository/BP ECG CBT/android.widget.Button - YES'), 0)

Mobile.delay(10)

Mobile.closeApplication()