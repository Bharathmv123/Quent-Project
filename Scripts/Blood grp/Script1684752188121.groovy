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

Mobile.tap(findTestObject('Object Repository/Android 13/android.widget.ImageView (1)'), 0)

Mobile.switchToNative()

Mobile.tap(findTestObject('Object Repository/Android 13/android.widget.ImageButton (5)'), 0)

Mobile.tap(findTestObject('Object Repository/Android 13/android.widget.FrameLayout (2)'), 0)

Mobile.delay(2)

Mobile.sendKeys(findTestObject('Object Repository/Android 13/android.widget.EditText - Weight (1)'), '72')

Mobile.sendKeys(findTestObject('Object Repository/Android 13/android.widget.EditText - Height (1)'), '164')

Mobile.scrollToText('Wrist Type')

Mobile.tap(findTestObject('Object Repository/Android 13/android.widget.ImageButton (6)'), 0)

Mobile.delay(1)

Mobile.tap(findTestObject('Object Repository/Android 13/android.widget.AutoCompleteTextView - Skin Color (1)'), 0)

Mobile.delay(1)

Mobile.tap(findTestObject('Object Repository/Android 13/android.widget.ImageButton (7)'), 0)

Mobile.tap(findTestObject('Object Repository/Android 13/android.widget.EditText - Hip Size'), 0)

Mobile.delay(1)

Mobile.tap(findTestObject('Object Repository/Android 13/android.widget.ImageButton (8)'), 0)

Mobile.tap(findTestObject('Object Repository/Android 13/android.widget.FrameLayout (3)'), 0)

Mobile.scrollToText('Body Temp')

Mobile.tap(findTestObject('Object Repository/Android 13/android.widget.ImageButton (9)'), 0)

Mobile.tap(findTestObject('Object Repository/Android 13/android.widget.AutoCompleteTextView - Light Pale White'), 0)

Mobile.delay(1)

Mobile.sendKeys(findTestObject('Object Repository/Android 13/android.widget.EditText - Room Temp (1)'), '25')

Mobile.scrollToText('BLE')

Mobile.sendKeys(findTestObject('Object Repository/Android 13/android.widget.EditText - Body Temp (1)'), '30')

Mobile.tap(findTestObject('Object Repository/Android 13/android.widget.CompoundButton - BLE (1)'), 0)

Mobile.scrollToText('Connect')

Mobile.tap(findTestObject('Object Repository/Android 13/android.widget.Button - Connect (1)'), 0)

Mobile.switchToNative()

Mobile.tap(findTestObject('Object Repository/Android 13/android.widget.Button - Measure (1)'), 0)

Mobile.closeApplication()