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

Mobile.tap(findTestObject('Object Repository/App - Data saving/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/App - Data saving/android.widget.CheckBox - User Trial'), 0)

Mobile.tap(findTestObject('Object Repository/App - Data saving/android.widget.CheckBox'), 0)

Mobile.tap(findTestObject('Object Repository/App - Data saving/android.widget.Button - Next'), 0)

Mobile.tap(findTestObject('Object Repository/App - Data saving/android.widget.ImageButton'), 0)

Mobile.tap(findTestObject('Object Repository/App - Data saving/android.widget.ImageView (1)'), 0)

Mobile.sendKeys(findTestObject('Object Repository/App - Data saving/android.widget.EditText - Phone number'), '8050694262')

Mobile.sendKeys(findTestObject('Object Repository/App - Data saving/android.widget.EditText - Password'), 'Test@123')

Mobile.tap(findTestObject('Object Repository/App - Data saving/android.widget.Button - Sign In'), 0)

Mobile.switchToNative()

Mobile.switchToNative()

Mobile.tap(findTestObject('Object Repository/App - Data saving/android.widget.ImageView (2)'), 0)

Mobile.switchToNative()

Mobile.tap(findTestObject('Object Repository/App - Data saving/android.widget.ImageView (3)'), 0)

Mobile.switchToNative()

Mobile.tap(findTestObject('Object Repository/App - Data saving/android.widget.TextView - Signout'), 0)

Mobile.tap(findTestObject('Object Repository/App - Data saving/android.widget.Button - YES'), 0)

Mobile.closeApplication()

