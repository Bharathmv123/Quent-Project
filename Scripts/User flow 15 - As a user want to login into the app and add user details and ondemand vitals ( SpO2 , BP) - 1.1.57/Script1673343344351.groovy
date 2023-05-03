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

Mobile.startApplication('C:\\Users\\Linus\\Downloads\\Quent_V2022.25 V1.1.57_271220221740_staging.apk', true)

Mobile.tap(findTestObject('Object Repository/Pairing/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/Pairing/android.widget.CheckBox - User Trial'), 0)

Mobile.switchToNative()

Mobile.tap(findTestObject('Object Repository/Pairing/android.widget.CheckBox'), 0)

Mobile.tap(findTestObject('Object Repository/Pairing/android.widget.Button - Next'), 0)

Mobile.tap(findTestObject('Object Repository/Pairing/android.widget.ImageButton'), 0)

Mobile.tap(findTestObject('Object Repository/Pairing/android.widget.ImageView (1)'), 0)

Mobile.sendKeys(findTestObject('Object Repository/Pairing/android.widget.EditText - Phone number'), '8050694262')

Mobile.tap(findTestObject('Object Repository/Pairing/android.widget.EditText - Password'), 0)

Mobile.sendKeys(findTestObject('Object Repository/Pairing/android.widget.EditText - Password (1)'), 'Test@123')

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Pairing/android.widget.Button - Sign In'), 0)

Mobile.switchToNative()

Mobile.tap(findTestObject('Object Repository/Pairing/android.widget.TextView - User Category'), 0)

Mobile.tap(findTestObject('Object Repository/Pairing/android.widget.TextView - Trail Batch 1'), 0)

Mobile.scrollToText('measure')

Mobile.delay(40)

Mobile.waitForElementPresent(findTestObject('Object Repository/Pairing/android.widget.Button - Go to Dashboard'), 20)

Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/Pairing/android.widget.Button - Go to Dashboard'), 0)

Mobile.sendKeys(findTestObject('Object Repository/Pairing/android.widget.EditText - First name'), 'kish')

Mobile.sendKeys(findTestObject('Object Repository/Pairing/android.widget.EditText - Last name'), 'kum')

Mobile.delay(20)

Mobile.tap(findTestObject('Object Repository/Pairing/android.widget.ImageButton (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Pairing/android.widget.LinearLayout'), 0)

Mobile.scrollToText('additional')

Mobile.tap(findTestObject('Object Repository/Pairing/android.widget.ImageButton (2)'), 0)

Mobile.tap(findTestObject('Object Repository/Pairing/android.view.View - 5'), 0)

Mobile.tap(findTestObject('Object Repository/Pairing/android.view.View - 5 (1)'), 0)

Mobile.switchToNative()

Mobile.tap(findTestObject('Object Repository/Pairing/android.widget.Button - OK'), 0)

Mobile.tap(findTestObject('Object Repository/Pairing/android.widget.ImageButton (4)'), 0)

Mobile.tap(findTestObject('Object Repository/Pairing/android.widget.EditText - Hip Size'), 0)

Mobile.sendKeys(findTestObject('Object Repository/Pairing/android.widget.EditText - Weight'), '73')

Mobile.sendKeys(findTestObject('Object Repository/Pairing/android.widget.EditText - Height'), '165')

Mobile.scrollToText('measure')

Mobile.tap(findTestObject('Object Repository/Pairing/android.widget.Button - Measure'), 0)

Mobile.delay(10)

Mobile.scrollToText('Blood oxygen')

Mobile.tap(findTestObject('Object Repository/New 1/android.widget.ImageView (4)'), 0)

Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/New 1/android.widget.TextView - Measure (1)'), 0)

Mobile.delay(130)

Mobile.tap(findTestObject('Object Repository/New scr/android.widget.TextView - Blood Oxygen'), 0)

Mobile.switchToNative()

Mobile.scrollToText('Blood pressure')

Mobile.tap(findTestObject('Object Repository/BP 1.1.57/android.widget.ImageView (2)'), 0)

Mobile.tap(findTestObject('Object Repository/BP 1.1.57/android.widget.TextView - Measure'), 0)

Mobile.delay(150)

Mobile.switchToNative()

Mobile.scrollToText('save')

Mobile.tap(findTestObject('Object Repository/New 1/android.widget.Button - Save'), 0)

Mobile.tap(findTestObject('Object Repository/New 1/android.widget.Button - YES'), 0)

Mobile.switchToNative()

Mobile.closeApplication()