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

Mobile.startApplication('/Users/apple/Downloads/Quent_V2023.14 V1.1.91_070720231029_staging.apk', true)

Mobile.tap(findTestObject('Object Repository/User Trial Scan User Reference ID/android.widget.CheckBox - User Trial'), 0)

Mobile.tap(findTestObject('Object Repository/User Trial Scan User Reference ID/android.widget.CheckBox'), 0)

Mobile.tap(findTestObject('Object Repository/User Trial Scan User Reference ID/android.widget.Button - Next'), 0)

Mobile.tap(findTestObject('Object Repository/User Trial Scan User Reference ID/android.widget.ImageButton'), 0)

Mobile.tap(findTestObject('Object Repository/User Trial Scan User Reference ID/android.widget.RelativeLayout'), 0)

Mobile.sendKeys(findTestObject('Object Repository/User Trial Scan User Reference ID/android.widget.EditText - Phone number'),
	'8217603935')

Mobile.sendKeys(findTestObject('Object Repository/User Trial Scan User Reference ID/android.widget.EditText - Password'),
	'Test@123')

Mobile.tap(findTestObject('Object Repository/User Trial Scan User Reference ID/android.widget.Button - Sign In'), 0)

Mobile.tap(findTestObject('Object Repository/User Trial without entering Name/android.widget.TextView - Trial Batch'), 0)

Mobile.tap(findTestObject('Object Repository/User Trial without entering Name/android.widget.TextView - Trail Batch 1'),
	0)

Mobile.sendKeys(findTestObject('Object Repository/User Trial without entering User Reference ID/android.widget.EditText - Name'),
	'Sirisha')

Mobile.tap(findTestObject('Object Repository/User Trial without entering User Reference ID/android.widget.ImageButton'),
	0)

Mobile.tap(findTestObject('Object Repository/User Trial without entering User Reference ID/android.widget.TextView - 2005'),
	0)

Mobile.scrollToText('1997')

Mobile.tap(findTestObject('Object Repository/User Trial without entering User Reference ID/android.widget.TextView - 1997'),
	0)

Mobile.tap(findTestObject('Object Repository/User Trial without entering User Reference ID/android.view.View - 19'), 0)

Mobile.tap(findTestObject('Object Repository/User Trial without entering User Reference ID/android.widget.Button - OK'),
	0)

Mobile.tap(findTestObject('Object Repository/User Trial Scan User Reference ID/android.widget.ImageButton (1)'), 0)

Mobile.delay(5) //Scan User Reference ID " QUENTUSERDIVUM1 "

Mobile.scrollToText('Gender')

Mobile.tap(findTestObject('Object Repository/User Trial Select Blood Group/android.widget.ImageButton (1)'), 0)

Mobile.delay(5)//Select Gender from the dropdown field 'Gender'

Mobile.scrollToText('Blood Group')

Mobile.tap(findTestObject('Object Repository/du/android.widget.ImageButton'), 0)

Mobile.delay(5)//Select Blood Group from dropdown Field 'Blood Group'

Mobile.scrollToText('Height')

Mobile.sendKeys(findTestObject('Object Repository/User Trial Enter Height/android.widget.EditText - Height'), '154')

Mobile.sendKeys(findTestObject('Object Repository/User Trial Enter Weight/android.widget.EditText - Weight'), '49')

Mobile.sendKeys(findTestObject('Object Repository/User Trial without entering Wrist Size/android.widget.EditText - Wrist Size'),
	'16')

Mobile.scrollToText('Wrist Type')

Mobile.tap(findTestObject('Object Repository/User Trial Wrist Size dropdown/android.widget.ImageButton (1)'), 0)

Mobile.delay(5)

Mobile.scrollToText('Skin color')

Mobile.tap(findTestObject('Object Repository/User Trial Skin Color dropdown/android.widget.ImageButton (1)'), 0)

Mobile.delay(5)

Mobile.scrollToText('Skin Nature')

Mobile.tap(findTestObject('Object Repository/User Trial Skin Nature dropdown/android.widget.ImageButton (1)'), 0)

Mobile.delay(5)

Mobile.scrollToText('Room')

Mobile.tap(findTestObject('Object Repository/Signout by Clicking NO/android.widget.ImageButton'), 0)

Mobile.delay(10) // Select Wrist observation as Normal

Mobile.scrollToText('Measure')

Mobile.tap(findTestObject('Object Repository/User Trial Toggle WIFI and BLE/android.widget.CompoundButton - BLE'), 0)

Mobile.tap(findTestObject('Object Repository/User Trial End to End/android.widget.Button - Connect'), 0)

Mobile.tap(findTestObject('Object Repository/User Trial End to End/android.widget.Button - Scan for Watch'), 0)

Mobile.delay(30) // Pair the  watch wit the Application by clicking on respective Watch ID

Mobile.tap(findTestObject('Object Repository/User Trial End to End/android.widget.Button - Go to Dashboard'), 0)

Mobile.scrollToText('Measure')

Mobile.tap(findTestObject('Object Repository/User Trial without entering Wrist Size/android.widget.Button - Measure'), 0)

Mobile.scrollToText('Reference')

Mobile.delay(10)

Mobile.closeApplication()