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

Mobile.startApplication('C:\\Users\\Linus\\Downloads\\Quent_V2023.11 V1.1.87_290520230953_staging(3).apk', true)

Mobile.tap(findTestObject('Object Repository/User flow 1.1.87/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/User flow 1.1.87/android.widget.CheckBox - User Trial'), 0)

Mobile.tap(findTestObject('Object Repository/User flow 1.1.87/android.widget.CheckBox'), 0)

Mobile.tap(findTestObject('Object Repository/User flow 1.1.87/android.widget.Button - Next'), 0)

Mobile.tap(findTestObject('Object Repository/User flow 1.1.87/android.widget.ImageButton'), 0)

Mobile.tap(findTestObject('Object Repository/User flow 1.1.87/android.widget.ImageView (1)'), 0)

Mobile.sendKeys(findTestObject('Object Repository/User flow 1.1.87/android.widget.EditText - Phone number'), '8050694262')

Mobile.sendKeys(findTestObject('Object Repository/User flow 1.1.87/android.widget.EditText - Password'), 'Test@123')

Mobile.tap(findTestObject('Object Repository/User flow 1.1.87/android.widget.Button - Sign In'), 0)

Mobile.switchToNative()

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Trial Batch'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Trail Batch 1'), 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Name'), 'Kish', 0)

Mobile.tap(findTestObject('Object Repository/android.widget.ImageButton (2)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - OK'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.ImageButton (3)'), 0)

Mobile.delay(10)

Mobile.scrollToText('Blood Group')

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject('Object Repository/User flow 1.1.87/android.widget.LinearLayout'), 0)

Mobile.tap(findTestObject('Object Repository/User flow 1.1.87/android.widget.ImageButton (3)'), 0)

Mobile.tap(findTestObject('Object Repository/User flow 1.1.87/android.widget.EditText - Hip Size'), 0)

Mobile.sendKeys(findTestObject('Object Repository/User flow 1.1.87/android.widget.EditText - Height'), '164')

Mobile.sendKeys(findTestObject('Object Repository/User flow 1.1.87/android.widget.EditText - Weight'), '73')

Mobile.tap(findTestObject('Object Repository/User flow 1.1.87/android.widget.ImageButton (4)'), 0)

Mobile.tap(findTestObject('Object Repository/User flow 1.1.87/android.widget.AutoCompleteTextView - Skin Color'), 0)

Mobile.tap(findTestObject('Object Repository/User flow 1.1.87/android.widget.ImageButton (5)'), 0)

Mobile.tap(findTestObject('Object Repository/User flow 1.1.87/android.widget.AutoCompleteTextView - Flat'), 0)

Mobile.tap(findTestObject('Object Repository/User flow 1.1.87/android.widget.ImageButton (6)'), 0)

Mobile.tap(findTestObject('Object Repository/User flow 1.1.87/android.widget.LinearLayout (1)'), 0)

Mobile.scrollToText('Wrist Observation')

Mobile.tap(findTestObject('Object Repository/User flow 1.1.87/android.widget.ImageButton (8)'), 0)

Mobile.tap(findTestObject('Object Repository/User flow 1.1.87/android.widget.FrameLayout'), 0)

Mobile.sendKeys(findTestObject('Object Repository/User flow 1.1.87/android.widget.EditText - 27'), '33')

Mobile.sendKeys(findTestObject('Object Repository/User flow 1.1.87/android.widget.EditText - 30'), '33')

Mobile.tap(findTestObject('Object Repository/User flow 1.1.87/android.widget.CompoundButton - BLE'), 0)

Mobile.scrollToText('Connect')

Mobile.tap(findTestObject('Object Repository/User flow 1.1.87/android.widget.Button - Connect'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - Scan for Watch'), 0)

Mobile.delay(50)

Mobile.switchToNative()

Mobile.tap(findTestObject('Object Repository/android.widget.Button - Go to Dashboard'), 0)

Mobile.scrollToText('Measure')

Mobile.delay(15)

Mobile.tap(findTestObject('Object Repository/android.widget.ImageView (4)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Measure'), 0)

Mobile.delay(40)

Mobile.switchToNative()

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Heart Rate'), 0)

Mobile.delay(2)

Mobile.tap(findTestObject('Object Repository/android.widget.ImageView (5)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Measure (1)'), 0)

Mobile.delay(180)

Mobile.switchToNative()

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Blood Oxygen'), 0)

Mobile.tap(findTestObject('Object Repository/BP ECG CBT/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/BP ECG CBT/android.widget.TextView - Measure'), 0)

Mobile.delay(110)

Mobile.tap(findTestObject('Object Repository/BP ECG CBT/android.widget.TextView - Blood Pressure'), 0)

Mobile.delay(3)

Mobile.tap(findTestObject('Object Repository/BP ECG CBT/android.widget.ImageView (1)'), 0)

Mobile.tap(findTestObject('Object Repository/BP ECG CBT/android.widget.TextView - Measure (1)'), 0)

Mobile.delay(130)

Mobile.tap(findTestObject('Object Repository/BP ECG CBT/android.widget.TextView - Electrocardiography'), 0)

Mobile.delay(3)

Mobile.tap(findTestObject('Object Repository/BP ECG CBT/android.widget.ImageView (2)'), 0)

Mobile.scrollToText('Save')

Mobile.tap(findTestObject('Object Repository/BP ECG CBT/android.widget.TextView - Measure (2)'), 0)

Mobile.delay(30)

Mobile.switchToNative()

Mobile.tap(findTestObject('Object Repository/BP ECG CBT/android.widget.TextView - Body Temperature'), 0)

Mobile.tap(findTestObject('Object Repository/BP ECG CBT/android.widget.Button - Save'), 0)

Mobile.tap(findTestObject('Object Repository/BP ECG CBT/android.widget.Button - YES'), 0)

Mobile.switchToNative()

Mobile.closeApplication()