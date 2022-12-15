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

Mobile.tap(findTestObject('Object Repository/New build end to end 1.1.55/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/New build end to end 1.1.55/android.widget.CheckBox - User Trial'), 0)

Mobile.switchToNative()

Mobile.tap(findTestObject('Object Repository/New build end to end 1.1.55/android.widget.CheckBox'), 0)

Mobile.tap(findTestObject('Object Repository/New build end to end 1.1.55/android.widget.Button - Next'), 0)

Mobile.switchToNative()

Mobile.tap(findTestObject('Object Repository/New build end to end 1.1.55/android.widget.ImageButton'), 0)

Mobile.tap(findTestObject('Object Repository/New build end to end 1.1.55/android.widget.TextView - 91'), 0)

Mobile.sendKeys(findTestObject('Object Repository/New build end to end 1.1.55/android.widget.EditText - Phone number'), 
    '8050694262')

Mobile.sendKeys(findTestObject('Object Repository/New build end to end 1.1.55/android.widget.EditText - Password'), 'Test@123')

Mobile.tap(findTestObject('Object Repository/New build end to end 1.1.55/android.widget.Button - Sign In'), 0)

Mobile.switchToNative()

Mobile.tap(findTestObject('Object Repository/New build end to end 1.1.55/android.widget.TextView - User Category'), 0)

Mobile.tap(findTestObject('Object Repository/New build end to end 1.1.55/android.widget.TextView - Trail Batch 1'), 0)

Mobile.scrollToText('measure')

Mobile.tap(findTestObject('Object Repository/New build end to end 1.1.55/android.widget.Button - Connect'), 0)

Mobile.tap(findTestObject('Object Repository/New build end to end 1.1.55/android.widget.Button - Scan for Watch'), 0)

Mobile.delay(25)

Mobile.sendKeys(findTestObject('Object Repository/New build end to end 1.1.55/android.widget.EditText - First name'), 'kish')

Mobile.sendKeys(findTestObject('Object Repository/New build end to end 1.1.55/android.widget.EditText - Last name'), 'kum')

Mobile.delay(20)

Mobile.tap(findTestObject('Object Repository/New build end to end 1.1.55/android.widget.LinearLayout'), 0)

Mobile.scrollToText('height')

Mobile.tap(findTestObject('Object Repository/New build end to end 1.1.55/android.widget.ImageButton (2)'), 0)

Mobile.tap(findTestObject('Object Repository/New build end to end 1.1.55/android.widget.Button - OK'), 0)

Mobile.tap(findTestObject('Object Repository/New build end to end 1.1.55/android.widget.ImageButton (3)'), 0)

Mobile.tap(findTestObject('Object Repository/New build end to end 1.1.55/android.widget.EditText - Hip Size'), 0)

Mobile.sendKeys(findTestObject('Object Repository/New build end to end 1.1.55/android.widget.EditText - Weight'), '74')

Mobile.sendKeys(findTestObject('Object Repository/New build end to end 1.1.55/android.widget.EditText - Height'), '164')

Mobile.scrollToText('measure')

Mobile.tap(findTestObject('Object Repository/New build end to end 1.1.55/android.widget.Button - Measure'), 0)

Mobile.tap(findTestObject('Object Repository/New build end to end 1.1.55/android.widget.ImageView (2)'), 0)

Mobile.tap(findTestObject('Object Repository/New build end to end 1.1.55/android.widget.TextView - Measure'), 0)

Mobile.switchToNative()

Mobile.scrollToText('Blood')

Mobile.tap(findTestObject('Object Repository/New build end to end 1.1.55/android.widget.ImageView (3)'), 0)

Mobile.tap(findTestObject('Object Repository/New build end to end 1.1.55/android.widget.TextView - Measure (1)'), 0)

Mobile.switchToNative()

Mobile.tap(findTestObject('Object Repository/New build end to end 1.1.55/android.widget.Button - OK (1)'), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.switchToNative()

Mobile.scrollToText('body')

Mobile.tap(findTestObject('Object Repository/New build end to end 1.1.55/android.widget.ImageView (4)'), 0)

Mobile.tap(findTestObject('Object Repository/New build end to end 1.1.55/android.widget.TextView - Measure (2)'), 0)

Mobile.switchToNative()

Mobile.closeApplication()

