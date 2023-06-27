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

Mobile.tap(findTestObject('Object Repository/New android 13 Folder/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/New android 13 Folder/android.widget.CheckBox - User Trial'), 0)

Mobile.switchToNative()

Mobile.tap(findTestObject('Object Repository/New android 13 Folder/android.widget.CheckBox'), 0)

Mobile.tap(findTestObject('Object Repository/New android 13 Folder/android.widget.Button - Next'), 0)

Mobile.tap(findTestObject('Object Repository/New android 13 Folder/android.widget.ImageButton'), 0)

Mobile.tap(findTestObject('Object Repository/New android 13 Folder/android.widget.ImageView (1)'), 0)

Mobile.setText(findTestObject('Object Repository/New android 13 Folder/android.widget.EditText - Phone number'), '8050694262', 
    0)

Mobile.setText(findTestObject('Object Repository/New android 13 Folder/android.widget.EditText - Password'), 'Test@123', 
    0)

Mobile.tap(findTestObject('Object Repository/New android 13 Folder/android.widget.Button - Sign In'), 0)

Mobile.switchToNative()

Mobile.tap(findTestObject('Object Repository/New android 13 Folder/android.widget.TextView - Trial Batch'), 0)

Mobile.tap(findTestObject('Object Repository/New android 13 Folder/android.widget.TextView - Trail Batch 1'), 0)

Mobile.setText(findTestObject('Object Repository/New android 13 Folder/android.widget.EditText - Name'), 'Kish', 0)

Mobile.tap(findTestObject('Object Repository/New android 13 Folder/android.widget.ImageButton (1)'), 0)

Mobile.tap(findTestObject('Object Repository/New android 13 Folder/android.widget.TextView - 2005'), 0)

Mobile.tap(findTestObject('Object Repository/New android 13 Folder/android.widget.TextView - 1999'), 0)

Mobile.tap(findTestObject('Object Repository/New android 13 Folder/android.view.View - 1'), 0)

Mobile.tap(findTestObject('Object Repository/New android 13 Folder/android.widget.Button - OK'), 0)

Mobile.tap(findTestObject('Object Repository/New android 13 Folder/android.widget.ImageButton (2)'), 0)

Mobile.switchToNative()

Mobile.scrollToText('Gender')

Mobile.tap(findTestObject('Object Repository/New android 13 Folder/android.widget.ImageButton (3)'), 0)

Mobile.tap(findTestObject('Object Repository/New android 13 Folder/android.widget.FrameLayout'), 0)

Mobile.tap(findTestObject('Object Repository/New android 13 Folder/android.widget.ImageButton (4)'), 0)

Mobile.tap(findTestObject('Object Repository/New android 13 Folder/android.widget.EditText - Hip Size'), 0)

Mobile.setText(findTestObject('Object Repository/New android 13 Folder/android.widget.EditText - Height'), '164', 0)

Mobile.setText(findTestObject('Object Repository/New android 13 Folder/android.widget.EditText - Weight'), '73', 0)

Mobile.tap(findTestObject('Object Repository/New android 13 Folder/android.widget.ImageButton (5)'), 0)

Mobile.tap(findTestObject('Object Repository/New android 13 Folder/android.widget.AutoCompleteTextView - Skin Color'), 0)

Mobile.tap(findTestObject('Object Repository/New android 13 Folder/android.widget.ImageButton (6)'), 0)

Mobile.tap(findTestObject('Object Repository/New android 13 Folder/android.widget.AutoCompleteTextView - Flat'), 0)

Mobile.tap(findTestObject('Object Repository/New android 13 Folder/android.widget.ImageButton (7)'), 0)

Mobile.tap(findTestObject('Object Repository/New android 13 Folder/android.widget.AutoCompleteTextView - Brown Dark Brown'), 
    0)

Mobile.scrollToText('Wrist Observation')

Mobile.tap(findTestObject('Object Repository/New android 13 Folder/android.widget.ImageButton (8)'), 0)

Mobile.tap(findTestObject('Object Repository/New android 13 Folder/android.widget.EditText - Room Temp'), 0)

Mobile.setText(findTestObject('Object Repository/New android 13 Folder/android.widget.EditText - Room Temp (1)'), '33', 
    0)

Mobile.setText(findTestObject('Object Repository/New android 13 Folder/android.widget.EditText - Body Temp'), '33', 0)

Mobile.scrollToText('BLE')

Mobile.tap(findTestObject('Object Repository/New android 13 Folder/android.widget.CompoundButton - BLE'), 0)

Mobile.scrollToText('Connect')

Mobile.tap(findTestObject('Object Repository/New android 13 Folder/android.widget.Button - Connect'), 0)

Mobile.tap(findTestObject('Object Repository/New android 13 Folder/android.widget.Button - Scan for Watch'), 0)

Mobile.delay(50)

Mobile.switchToNative()

Mobile.tap(findTestObject('Object Repository/New android 13 Folder/android.widget.Button - Go to Dashboard'), 0)

Mobile.switchToNative()

Mobile.scrollToText('Measure')

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject('Object Repository/New android 13 Folder/android.widget.ImageView (2)'), 0)

Mobile.tap(findTestObject('Object Repository/New android 13 Folder/android.widget.TextView - Measure'), 0)

Mobile.switchToNative()

Mobile.tap(findTestObject('Object Repository/New android 13 Folder/android.widget.TextView - Heart Rate'), 0)

Mobile.tap(findTestObject('Object Repository/New android 13 Folder/android.widget.ImageView (3)'), 0)

Mobile.delay(80)

Mobile.tap(findTestObject('Object Repository/New android 13 Folder/androidx.appcompat.widget.LinearLayoutCompat'), 0)

Mobile.switchToNative()

Mobile.tap(findTestObject('Object Repository/New android 13 Folder/android.widget.TextView - Blood Oxygen'), 0)

Mobile.tap(findTestObject('Object Repository/New android 13 Folder/android.widget.ImageView (4)'), 0)

Mobile.delay(80)

Mobile.scrollToText('Golden')

Mobile.tap(findTestObject('Object Repository/New android 13 Folder/android.widget.TextView - Measure (1)'), 0)

Mobile.delay(80)

Mobile.switchToNative()

Mobile.scrollToText('Blood Pressure')

Mobile.tap(findTestObject('Object Repository/New android 13 Folder/android.widget.TextView - Blood Pressure'), 0)

Mobile.tap(findTestObject('Object Repository/New android 13 Folder/android.widget.ImageView (5)'), 0)

Mobile.delay(20)

Mobile.scrollToText('Predicate')

Mobile.tap(findTestObject('Object Repository/New android 13 Folder/android.widget.TextView - Measure (2)'), 0)

Mobile.delay(20)

Mobile.switchToNative()

Mobile.tap(findTestObject('Object Repository/New android 13 Folder/android.widget.TextView - EKG'), 0)

Mobile.tap(findTestObject('Object Repository/New android 13 Folder/android.widget.ImageView (6)'), 0)

Mobile.delay(40)

Mobile.switchToNative()

Mobile.tap(findTestObject('Object Repository/New android 13 Folder/android.widget.TextView - Measure (3)'), 0)

Mobile.delay(40)

Mobile.switchToNative()

Mobile.tap(findTestObject('Object Repository/New android 13 Folder/android.widget.TextView - Body Temperature'), 0)

Mobile.delay(30)

Mobile.tap(findTestObject('Object Repository/New android 13 Folder/android.widget.Button - Save'), 0)

Mobile.tap(findTestObject('Object Repository/New android 13 Folder/android.widget.Button - YES'), 0)

Mobile.switchToNative()

Mobile.closeApplication()