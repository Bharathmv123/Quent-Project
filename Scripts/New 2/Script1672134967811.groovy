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

Mobile.startApplication('C:\\Users\\Linus\\Downloads\\Quent_V2022.24 V1.1.55_131220220959_staging.apk', true)

Mobile.tap(findTestObject('Object Repository/New 1/android.widget.ImageView (5)'), 0)

Mobile.tap(findTestObject('Object Repository/New 1/android.widget.CheckBox - User Trial (1)'), 0)

Mobile.switchToNative()

Mobile.tap(findTestObject('Object Repository/New 1/android.widget.CheckBox (1)'), 0)

Mobile.tap(findTestObject('Object Repository/New 1/android.widget.Button - Next (1)'), 0)

Mobile.switchToNative()

Mobile.tap(findTestObject('Object Repository/New 1/android.widget.ImageButton (2)'), 0)

Mobile.tap(findTestObject('Object Repository/New 1/android.widget.ImageView (6)'), 0)

Mobile.sendKeys(findTestObject('Object Repository/New 1/android.widget.EditText - Phone number (1)'), '8050694262')

Mobile.sendKeys(findTestObject('Object Repository/New 1/android.widget.EditText - Password (1)'), 'Test@123')

Mobile.tap(findTestObject('Object Repository/New 1/android.widget.Button - Sign In (1)'), 0)

Mobile.switchToNative()

Mobile.tap(findTestObject('Object Repository/New 1/android.widget.TextView - User Category (1)'), 0)

Mobile.tap(findTestObject('Object Repository/New 1/android.widget.TextView - Trail Batch 1 (1)'), 0)

Mobile.scrollToText('measure')

Mobile.tap(findTestObject('Object Repository/New 1/android.widget.Button - Connect (1)'), 0)

Mobile.tap(findTestObject('Object Repository/New 1/android.widget.Button - Scan for Watch (1)'), 0)

Mobile.tap(findTestObject('Object Repository/New 1/android.widget.ImageView (7)'), 0)

Mobile.sendKeys(findTestObject('Object Repository/New 1/android.widget.EditText - First name (1)'), 'kish')

Mobile.sendKeys(findTestObject('Object Repository/New 1/android.widget.EditText - Last name (1)'), 'kum')

Mobile.tap(findTestObject('Object Repository/New 1/android.widget.ImageButton (3)'), 0)

Mobile.tap(findTestObject('Object Repository/New 1/android.widget.FrameLayout'), 0)

Mobile.scrollToText('measure')

Mobile.tap(findTestObject('Object Repository/New 1/android.widget.Button - Measure (2)'), 0)

Mobile.switchToNative()

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject('Object Repository/New 1/android.widget.ImageView (8)'), 0)

Mobile.tap(findTestObject('Object Repository/New 1/android.widget.TextView - Measure (2)'), 0)

Mobile.switchToNative()

Mobile.scrollToText('Blood oxygen')

Mobile.tap(findTestObject('Object Repository/New 1/android.widget.ImageView (9)'), 0)

Mobile.tap(findTestObject('Object Repository/New 1/android.widget.TextView - Measure (3)'), 0)

Mobile.switchToNative()

Mobile.scrollToText('Body Temperature')

Mobile.tap(findTestObject('Object Repository/New 1/android.widget.ImageView (10)'), 0)

Mobile.tap(findTestObject('Object Repository/New 1/android.widget.TextView - Measure (4)'), 0)

Mobile.switchToNative()

Mobile.closeApplication()

