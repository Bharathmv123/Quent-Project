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

Mobile.startApplication('C:\\Users\\Linus\\Downloads\\Quent_V2022.22 V1.1.51_101120220834_staging.apk', true)

Mobile.tap(findTestObject('Object Repository/E to E/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/E to E/android.widget.CheckBox - User Trial'), 0)

Mobile.switchToNative()

Mobile.tap(findTestObject('Object Repository/E to E/android.widget.CheckBox'), 0)

Mobile.tap(findTestObject('Object Repository/E to E/android.widget.Button - Next'), 0)

Mobile.tap(findTestObject('Object Repository/E to E/android.widget.ImageButton'), 0)

Mobile.tap(findTestObject('Object Repository/E to E/android.widget.TextView - 91'), 0)

Mobile.sendKeys(findTestObject('Object Repository/E to E/android.widget.EditText - Phone number'), '8050694262')

Mobile.sendKeys(findTestObject('Object Repository/E to E/android.widget.EditText - Password'), 'Test@123')

Mobile.tap(findTestObject('Object Repository/E to E/android.widget.Button - Sign In'), 0)

Mobile.switchToNative()

Mobile.tap(findTestObject('Object Repository/E to E/android.widget.TextView - User Category'), 0)

Mobile.tap(findTestObject('Object Repository/E to E/android.widget.TextView - Trail Batch 1'), 0)

Mobile.sendKeys(findTestObject('Object Repository/E to E/android.widget.EditText - First name'), 'Kish')

Mobile.sendKeys(findTestObject('Object Repository/E to E/android.widget.EditText - Last name'), 'Kum')

Mobile.tap(findTestObject('Object Repository/E to E/android.widget.ImageButton (1)'), 0)

Mobile.tap(findTestObject('Object Repository/E to E/android.widget.FrameLayout'), 0)

Mobile.scrollToText('Additional info')

Mobile.tap(findTestObject('Object Repository/E to E/android.widget.ImageButton (2)'), 0)

Mobile.tap(findTestObject('Object Repository/E to E/android.widget.EditText - Hip Size'), 0)

Mobile.tap(findTestObject('Object Repository/E to E/android.widget.EditText - Weight'), 0)

Mobile.sendKeys(findTestObject('Object Repository/E to E/android.widget.EditText - Weight (1)'), '76')

Mobile.sendKeys(findTestObject('Object Repository/E to E/android.widget.EditText - Height'), '164')

Mobile.pressBack()

Mobile.sendKeys(findTestObject('Object Repository/E to E/android.widget.EditText - Hip Size (1)'), '36')

Mobile.sendKeys(findTestObject('Object Repository/E to E/android.widget.EditText - Wrist Size'), '18')

Mobile.tap(findTestObject('Object Repository/E to E/android.widget.ImageButton (3)'), 0)

Mobile.tap(findTestObject('Object Repository/E to E/android.widget.ImageView (1)'), 0)

Mobile.sendKeys(findTestObject('Object Repository/E to E/android.widget.EditText - Phone number (1)'), '8050694262')

Mobile.sendKeys(findTestObject('Object Repository/E to E/android.widget.EditText - Email'), 'nhfeh@gd.com')

Mobile.sendKeys(findTestObject('Object Repository/E to E/android.widget.EditText - Additional Info'), 'gygjh')

Mobile.scrollToText('User')

Mobile.tap(findTestObject('Object Repository/E to E/android.widget.ImageView (2)'), 0)

Mobile.tap(findTestObject('Object Repository/E to E/android.widget.TextView - Signout'), 0)

Mobile.tap(findTestObject('Object Repository/E to E/android.widget.Button - YES'), 0)

Mobile.switchToNative()

Mobile.closeApplication()

