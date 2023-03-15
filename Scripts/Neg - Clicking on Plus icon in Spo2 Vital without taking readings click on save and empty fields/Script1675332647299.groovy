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

Mobile.startApplication('C:\\Users\\Linus\\Downloads\\Quent_V2023.2 V1.1.64_230120231951_staging (1).apk', true)

Mobile.tap(findTestObject('Object Repository/Neg - Clicking on Plus icon in HR Vital without taking readings click on save and leaving empty/android.widget.ImageView'),
	0)

Mobile.tap(findTestObject('Object Repository/Neg - Clicking on Plus icon in HR Vital without taking readings click on save and leaving empty/android.widget.CheckBox - User Trial'),
	0)

Mobile.switchToNative()

Mobile.tap(findTestObject('Object Repository/Neg - Clicking on Plus icon in HR Vital without taking readings click on save and leaving empty/android.widget.CheckBox'),
	0)

Mobile.tap(findTestObject('Object Repository/Neg - Clicking on Plus icon in HR Vital without taking readings click on save and leaving empty/android.widget.Button - Next'),
	0)

Mobile.switchToNative()

Mobile.switchToNative()

Mobile.tap(findTestObject('Object Repository/Neg - Clicking on Plus icon in HR Vital without taking readings click on save and leaving empty/android.widget.ImageButton'),
	0)

Mobile.tap(findTestObject('Object Repository/Neg - Clicking on Plus icon in HR Vital without taking readings click on save and leaving empty/android.widget.ImageView (1)'),
	0)

Mobile.sendKeys(findTestObject('Object Repository/Neg - Clicking on Plus icon in HR Vital without taking readings click on save and leaving empty/android.widget.EditText - Phone number'),
	'8050694262')

Mobile.sendKeys(findTestObject('Object Repository/Neg - Clicking on Plus icon in HR Vital without taking readings click on save and leaving empty/android.widget.EditText - Password'),
	'Test@123')

Mobile.tap(findTestObject('Object Repository/Neg - Clicking on Plus icon in HR Vital without taking readings click on save and leaving empty/android.widget.Button - Sign In'),
	0)

Mobile.switchToNative()

Mobile.switchToNative()

Mobile.tap(findTestObject('Object Repository/Neg - Clicking on Plus icon in HR Vital without taking readings click on save and leaving empty/android.widget.TextView - User Category'),
	0)

Mobile.scrollToText('measure')

Mobile.tap(findTestObject('Object Repository/Neg - Clicking on Plus icon in HR Vital without taking readings click on save and leaving empty/android.widget.Button - Connect'),
	0)

Mobile.tap(findTestObject('Object Repository/Neg - Clicking on Plus icon in HR Vital without taking readings click on save and leaving empty/android.widget.Button - Scan for Watch'),
	0)

Mobile.delay(30)

Mobile.switchToNative()

Mobile.tap(findTestObject('Object Repository/Neg - Clicking on Plus icon in HR Vital without taking readings click on save and leaving empty/android.widget.Button - Go to Dashboard'),
	0)

Mobile.sendKeys(findTestObject('Object Repository/Neg - Clicking on Plus icon in HR Vital without taking readings click on save and leaving empty/android.widget.EditText - First name'),
	'kish')

Mobile.sendKeys(findTestObject('Object Repository/Neg - Clicking on Plus icon in HR Vital without taking readings click on save and leaving empty/android.widget.EditText - Last name'),
	'kum')

Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/Neg - Clicking on Plus icon in HR Vital without taking readings click on save and leaving empty/android.widget.ImageButton (1)'),
	0)

Mobile.tap(findTestObject('Object Repository/Neg - Clicking on Plus icon in HR Vital without taking readings click on save and leaving empty/android.widget.FrameLayout'),
	0)

Mobile.scrollToText('Additional')

Mobile.tap(findTestObject('Object Repository/Neg - Clicking on Plus icon in HR Vital without taking readings click on save and leaving empty/android.widget.ImageButton (2)'),
	0)

Mobile.tap(findTestObject('Object Repository/Neg - Clicking on Plus icon in HR Vital without taking readings click on save and leaving empty/android.view.View - 1'),
	0)

Mobile.tap(findTestObject('Object Repository/Neg - Clicking on Plus icon in HR Vital without taking readings click on save and leaving empty/android.widget.Button - OK'),
	0)

Mobile.tap(findTestObject('Object Repository/Neg - Clicking on Plus icon in HR Vital without taking readings click on save and leaving empty/android.widget.ImageButton (3)'),
	0)

Mobile.tap(findTestObject('Object Repository/Neg - Clicking on Plus icon in HR Vital without taking readings click on save and leaving empty/android.widget.EditText - Hip Size'),
	0)

Mobile.sendKeys(findTestObject('Object Repository/Neg - Clicking on Plus icon in HR Vital without taking readings click on save and leaving empty/android.widget.EditText - Weight'),
	'73')

Mobile.sendKeys(findTestObject('Object Repository/Neg - Clicking on Plus icon in HR Vital without taking readings click on save and leaving empty/android.widget.EditText - Height'),
	'164')

Mobile.scrollToText('measure')

Mobile.delay(5)

Mobile.switchToNative()

Mobile.tap(findTestObject('Object Repository/SpO2/android.widget.ImageView (1)'), 0)

Mobile.scrollToText('Save')

Mobile.tap(findTestObject('Object Repository/Save/android.widget.Button - Save'), 0)

Mobile.tap(findTestObject('Object Repository/Save/android.widget.Button - YES'), 0)

Mobile.closeApplication()