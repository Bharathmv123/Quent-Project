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

Mobile.startApplication('C:\\Users\\Linus\\Downloads\\Quent-1.70-Staging.apk', true)

Mobile.tap(findTestObject('Object Repository/New Android 13/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/New Android 13/android.widget.CheckBox - User Trial'), 0)

Mobile.switchToNative()

Mobile.tap(findTestObject('Object Repository/New Android 13/android.widget.CheckBox'), 0)

Mobile.tap(findTestObject('Object Repository/New Android 13/android.widget.Button - Next'), 0)

Mobile.switchToNative()

Mobile.tap(findTestObject('Object Repository/New Android 13/android.widget.ImageButton'), 0)

Mobile.tap(findTestObject('Object Repository/New Android 13/android.widget.ImageView (1)'), 0)

Mobile.sendKeys(findTestObject('Object Repository/New Android 13/android.widget.EditText - Phone number'), '8050694262')

Mobile.sendKeys(findTestObject('Object Repository/New Android 13/android.widget.EditText - Password'), 'Test@123')

Mobile.tap(findTestObject('Object Repository/New Android 13/android.widget.ImageButton (1)'), 0)

Mobile.tap(findTestObject('Object Repository/New Android 13/android.widget.ImageButton (2)'), 0)

Mobile.tap(findTestObject('Object Repository/New Android 13/android.widget.Button - Sign In'), 0)

Mobile.switchToNative()

Mobile.tap(findTestObject('Object Repository/New Android 13/android.widget.TextView - Trial Batch'), 0)

Mobile.tap(findTestObject('Object Repository/New Android 13/android.widget.TextView - Trail Batch 1'), 0)

Mobile.sendKeys(findTestObject('Object Repository/New Android 13/android.widget.EditText - Name'), 'Kish')

Mobile.tap(findTestObject('Object Repository/New Android 13/android.widget.ImageButton (3)'), 0)

Mobile.tap(findTestObject('Object Repository/New Android 13/android.view.View - 5'), 0)

Mobile.tap(findTestObject('Object Repository/New Android 13/android.widget.Button - OK'), 0)

Mobile.tap(findTestObject('Object Repository/New Android 13/android.widget.ImageButton (4)'), 0)

Mobile.switchToNative()

Mobile.tap(findTestObject('Object Repository/New Android 13/android.widget.ImageButton (5)'), 0)

Mobile.tap(findTestObject('Object Repository/New Android 13/android.widget.FrameLayout'), 0)

Mobile.scrollToText('Age')

Mobile.sendKeys(findTestObject('Object Repository/New Android 13/android.widget.EditText - Age'), '32')

Mobile.tap(findTestObject('Object Repository/New Android 13/android.widget.ImageButton (6)'), 0)

Mobile.tap(findTestObject('Object Repository/New Android 13/android.widget.EditText - Hip Size'), 0)

Mobile.sendKeys(findTestObject('Object Repository/New Android 13/android.widget.EditText - Weight'), '73')

Mobile.sendKeys(findTestObject('Object Repository/New Android 13/android.widget.EditText - Height'), '164')

Mobile.tap(findTestObject('Object Repository/New Android 13/android.widget.ImageButton (7)'), 0)

Mobile.tap(findTestObject('Object Repository/New Android 13/android.widget.AutoCompleteTextView - Skin Color'), 0)

Mobile.tap(findTestObject('Object Repository/New Android 13/android.widget.ImageButton (8)'), 0)

Mobile.tap(findTestObject('Object Repository/New Android 13/android.widget.AutoCompleteTextView - Flat'), 0)

Mobile.tap(findTestObject('Object Repository/New Android 13/android.widget.ImageButton (9)'), 0)

Mobile.tap(findTestObject('Object Repository/New Android 13/android.widget.FrameLayout (1)'), 0)

Mobile.scrollToText('BLE')

Mobile.tap(findTestObject('Object Repository/New Android 13/android.widget.ImageButton (10)'), 0)

Mobile.tap(findTestObject('Object Repository/New Android 13/android.widget.EditText - Room Temp'), 0)

Mobile.sendKeys(findTestObject('Object Repository/New Android 13/android.widget.EditText - Room Temp (1)'), '25')

Mobile.sendKeys(findTestObject('Object Repository/New Android 13/android.widget.EditText - Body Temp'), '30')

Mobile.tap(findTestObject('Object Repository/New Android 13/android.widget.CompoundButton - BLE'), 0)

Mobile.delay(5)

Mobile.tap(findTestObject('Object Repository/Connect/android.widget.Button - Connect'), 0)

Mobile.tap(findTestObject('Object Repository/Connect/android.widget.Button - Scan for Watch'), 0)

Mobile.delay(40)

Mobile.switchToNative()

Mobile.tap(findTestObject('Object Repository/Connect/android.widget.Button - Go to Dashboard'), 0)

Mobile.scrollToText('Measure')

Mobile.tap(findTestObject('Object Repository/Connect/android.widget.Button - Measure'), 0)

Mobile.delay(5)

Mobile.tap(findTestObject('Object Repository/Connect/android.widget.ImageView (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Connect/android.widget.TextView - Measure'), 0)

Mobile.delay(130)

Mobile.switchToNative()

Mobile.tap(findTestObject('Object Repository/Connect/android.widget.TextView - Heart Rate'), 0)

Mobile.delay(2)

Mobile.tap(findTestObject('Object Repository/Connect/android.widget.ImageView (2)'), 0)

Mobile.tap(findTestObject('Object Repository/Connect/android.widget.TextView - Measure (1)'), 0)

Mobile.delay(190)

Mobile.switchToNative()

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Blood Oxygen'), 0)

Mobile.tap(findTestObject('Object Repository/BP ECG CBT/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/BP ECG CBT/android.widget.TextView - Measure'), 0)

Mobile.delay(60)

Mobile.tap(findTestObject('Object Repository/BP ECG CBT/android.widget.TextView - Blood Pressure'), 0)

Mobile.delay(3)

Mobile.tap(findTestObject('Object Repository/BP ECG CBT/android.widget.ImageView (1)'), 0)

Mobile.tap(findTestObject('Object Repository/BP ECG CBT/android.widget.TextView - Measure (1)'), 0)

Mobile.delay(80)

Mobile.tap(findTestObject('Object Repository/BP ECG CBT/android.widget.TextView - Electrocardiography'), 0)

Mobile.delay(3)

Mobile.tap(findTestObject('Object Repository/BP ECG CBT/android.widget.ImageView (2)'), 0)

Mobile.scrollToText('Save')

Mobile.tap(findTestObject('Object Repository/BP ECG CBT/android.widget.TextView - Measure (2)'), 0)

Mobile.delay(40)

Mobile.switchToNative()

Mobile.tap(findTestObject('Object Repository/BP ECG CBT/android.widget.TextView - Body Temperature'), 0)

Mobile.tap(findTestObject('Object Repository/BP ECG CBT/android.widget.Button - Save'), 0)

Mobile.tap(findTestObject('Object Repository/BP ECG CBT/android.widget.Button - YES'), 0)

Mobile.switchToNative()

Mobile.closeApplication()