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

Mobile.switchToNative()

Mobile.tap(findTestObject('Object Repository/Trial/android.widget.CheckBox - User Trial'), 0)

Mobile.switchToNative()

Mobile.tap(findTestObject('Object Repository/Trial/android.widget.CheckBox'), 0)

Mobile.tap(findTestObject('Object Repository/Trial/android.widget.Button - Next'), 0)

Mobile.switchToNative()

Mobile.tap(findTestObject('Object Repository/Trial/android.widget.ImageButton'), 0)

Mobile.tap(findTestObject('Object Repository/Trial/android.widget.TextView - 91'), 0)

Mobile.sendKeys(findTestObject('Object Repository/Trial/android.widget.EditText - Phone number'), '8217603935')

Mobile.sendKeys(findTestObject('Object Repository/Trial/android.widget.EditText - Password'), 'Test@123')

Mobile.tap(findTestObject('Object Repository/Trial/android.widget.Button - Sign In'), 0)

Mobile.tap(findTestObject('Object Repository/Trial/android.widget.ImageButton (2)'), 0)

Mobile.switchToNative()

Mobile.tap(findTestObject('Object Repository/Trial/android.widget.TextView - Trial Batch'), 0)

Mobile.tap(findTestObject('Object Repository/Trial/android.widget.TextView - Trail Batch 1'), 0)

Mobile.scrollToText('Weight')

Mobile.sendKeys(findTestObject('Object Repository/Trial/android.widget.EditText - Weight'), '49')

Mobile.sendKeys(findTestObject('Object Repository/Trial/android.widget.EditText - Wrist Size'), '16')

Mobile.scrollToText('Room Temp')

Mobile.sendKeys(findTestObject('Object Repository/Trial/android.widget.EditText - Room Temp'), '37.2')

Mobile.sendKeys(findTestObject('Object Repository/Trial/android.widget.EditText - Body Temp'), '37')

Mobile.scrollToText('BLE')

Mobile.switchToNative()

Mobile.tap(findTestObject('Object Repository/Trial/android.widget.CompoundButton - BLE'), 0)

Mobile.tap(findTestObject('Object Repository/Trial/android.widget.Button - Connect'), 0)

Mobile.tap(findTestObject('Object Repository/Trial/android.widget.Button - Scan for Watch'), 0)

Mobile.delay(30)

Mobile.tap(findTestObject('Object Repository/Trial/android.widget.Button - Go to Dashboard'), 0)

Mobile.scrollToText('Measure')

Mobile.tap(findTestObject('Object Repository/Trial/android.widget.Button - Measure'), 0)

Mobile.tap(findTestObject('Object Repository/Trial/android.widget.Button - Confirm'), 0)

Mobile.delay(10)

//First Reading

Mobile.tap(findTestObject('Object Repository/Trial/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/Trial/androidx.appcompat.widget.LinearLayoutCompat'), 0)

Mobile.delay(30)

Mobile.tap(findTestObject('Object Repository/HR/android.widget.ImageView (1)'), 0)

Mobile.tap(findTestObject('Object Repository/HR/android.widget.TextView - Take Photo'), 0)

Moile.delay(5)

//Mobile.tap(findTestObject('Object Repository/HR/android.widget.ImageView'), 0)

//Mobile.tap(findTestObject('Object Repository/HR/android.widget.ImageView (2)'), 0)

//Mobile.tap(findTestObject('Object Repository/HR/android.widget.Button - Yes'), 0)

//Second Reading 

Mobile.tap(findTestObject('Object Repository/Trial/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/Trial/androidx.appcompat.widget.LinearLayoutCompat'), 0)

Mobile.delay(30)

Mobile.tap(findTestObject('Object Repository/HR/android.widget.ImageView (1)'), 0)

Mobile.tap(findTestObject('Object Repository/HR/android.widget.TextView - Take Photo'), 0)

//delete 3 rd Reading

Mobile.tap(findTestObject('Object Repository/HR/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/HR/android.widget.ImageView (2)'), 0)

Mobile.tap(findTestObject('Object Repository/HR/android.widget.Button - Yes'), 0)

Mobile.tap(findTestObject('Object Repository/HR/android.widget.TextView - Heart Rate'), 0)

Mobile.scrollToText('Save')

Mobile.tap(findTestObject('Object Repository/HR/android.widget.Button - Save'), 0)

Mobile.tap(findTestObject('Object Repository/HR/android.widget.Button - YES (1)'), 0)

Mobile.closeApplication()

