WebView App Documentation
=========================


## Intro

This is a documentation for WebView App created by [Robo Templates](http://robotemplates.com/). WebView App is a native Android application. You can find here useful info about configuring, customizing, building and publishing the app.

* [WebView App on Codecanyon](https://codecanyon.net/item/universal-android-webview-app/8431507)
* [Video preview on YouTube](https://www.youtube.com/watch?v=mcEXzYXvC94)
* [Live demo on Google Play](https://play.google.com/store/apps/details?id=com.robotemplates.webviewapp)


## Features

* Support for Ice Cream Sandwich (Android 4.0.3) and newer
* Developed with Android Studio & Gradle
* Material design following Android Design Guidelines
* Ten color themes (blue, brown, gray, green, lime, orange, purple, red, teal, violet)
* Thirty menu icons
* Action bar (optional)
* Navigation drawer menu with optional categories (easily customizable)
* Pull-to-Refresh (optional)
* Share dialog (optional)
* Intents for opening external apps (e-mail, sms, phone call, map, store)
* Geolocation (optional)
* Download manager
* File picker for uploading files
* Upload photo from camera
* Fast and powerful webview engine based on the Chromium
* WebView supports HTML5, JavaScript, Cookies, CSS, images, videos and other standard web tools and technologies
* HTML5 videos, YouTube, Vimeo, JW Player
* Fullscreen video
* Support for opening links in external browser (customizable rules)
* Local pages (available in offline)
* Error handling
* Offline handling
* Progress bar when loading the page
* Action bar title based on HTML title or custom text
* Rate my app prompt (optional)
* Confirmation dialog when user tries to exit the app (optional)
* Runtime permissions
* Google Analytics
* AdMob (banner and interstitial ad)
* Push notifications (OneSignal.com, FCM or GCM)
* RTL
* Customization (enable/disable action bar, navigation drawer menu, pull-to-refresh etc.)
* Responsive design (portrait, landscape, handling orientation change)
* Support for high-resolution displays (xxxhdpi)
* Multi-language support
* Easy configuration
* Well documented
* Top quality clean code created by experienced senior Android developer
* Free support


## Android Studio & SDK

This chapter describes how to install Android Studio and Android SDK. You don't have to install Android Studio, but it's better. The project can be built without Android Studio, using Gradle and Android SDK. Gradle is a build system used for building a final APK file.

1. Install [Java JDK](http://www.oracle.com/technetwork/java/javase/downloads/index.html)
2. Install [Android Studio with Android SDK](https://developer.android.com/studio/index.html)
3. Run Android SDK Manager and [download necessary SDK packages](https://developer.android.com/studio/intro/update.html#sdk-manager), make sure that you have installed Android SDK Tools, Android SDK Platform-Tools, Android SDK Build-Tools, Support Repository, Android Support Library, Google Play services and Google USB Driver
4. Now you should be able to open/edit the Android project and build an APK
5. You can also install [Genymotion](http://www.genymotion.com/) - fast Android emulator


## Project Structure

Project has the following structure (directories are marked by square braces):

- [doc] - documentation
- [extras] - contains extras
- [extras]/[keystore]
- [extras]/[keystore]/webviewapp.jks - keystore certificate for signing APK
- [extras]/[keystore]/webviewapp.properties - alias and password for keystore
- [gradle]
- [gradle]/[wrapper] - Gradle Wrapper
- [mobile] - main module
- [mobile]/[libs] - contains 3rd party libraries
- [mobile]/[src] - contains source code
- [mobile]/[src]/[main]
- [mobile]/[src]/[main]/[assets] - asset files (local html pages)
- [mobile]/[src]/[main]/[java] - java sources
- [mobile]/[src]/[main]/[res] - xml resources, drawables
- [mobile]/[src]/[main]/AndroidManifest.xml - manifest file
- [mobile]/build.gradle - main build script
- [mobile]/proguard-rules.pro - Proguard config (not used)
- .gitignore - Gitignore file
- build.gradle - parent build script
- gradle.properties - build script properties containing path to keystore
- gradlew - Gradle Wrapper (Unix)
- gradlew.bat - Gradle Wrapper (Windows)
- README.md - readme file
- settings.gradle - build settings containing list of modules

Java packages:

- com.robotemplates.webviewapp - contains application class and main config class
- com.robotemplates.webviewapp.activity - contains activities representing screens
- com.robotemplates.webviewapp.fragment - contains fragments with main application logic
- com.robotemplates.webviewapp.listener - contains event listeners
- com.robotemplates.webviewapp.utility - contains utilities
- com.robotemplates.webviewapp.view - contains custom views and layouts
- im.delight.android.webview - implementation of advanced webview component
- name.cpr - implementation of video enabled webview component


## Configuration

This chapter describes how to configure the project to be ready for publishing. All these steps are very important!


### 1. Import

Unzip the package and import/open the project in Android Studio. Choose "Import project" on Quick Start screen and select "webviewapp-x.y.z" directory.

You can [switch to Project view](https://developer.android.com/studio/projects/index.html#ProjectView) in the Project window on left if you want to see the actual file structure of the project including all files hidden from the Android view. Just select Project from the dropdown at the top of the Project window.

If you want, you can build and run the app right away to test it. Connect your device or [emulator](https://developer.android.com/studio/run/managing-avds.html) to your computer. Make sure you have installed all necessary [drivers](https://developer.android.com/studio/run/oem-usb.html) for your Android device and you also enabled [USB debugging in Developer options](https://developer.android.com/studio/run/device.html). To build and run the app in Android Studio, just click on Main menu -> Run -> Run 'mobile'. Choose a connected device and confirm.


### 2. Set Purchase Code

Open configuration file _mobile/src/main/java/com/robotemplates/webviewapp/WebViewAppConfig.java_ and set value of `PURCHASE_CODE` constant to your own [Envato purchase code](https://help.market.envato.com/hc/en-us/articles/202822600-Where-Is-My-Purchase-Code-).


### 3. Rename Application ID

Every Android app has a unique [application ID](https://developer.android.com/studio/build/application-id.html). This ID uniquely identifies your app on the device and in Google Play Store. If you want to upload a new version of your app, the application ID (and the [certificate you sign it with](https://developer.android.com/studio/publish/app-signing.html)) must be the same as the original APK. If you change the application ID, Google Play Store treats the APK as a completely different app. So once you publish your app, you should never change the application ID. Default application ID is "com.robotemplates.webviewapp" so you have to rename it to something else.

1. Open the main build script _mobile/build.gradle_ and rename the value of `applicationId`. Just rewrite it to your own application ID, e.g. "com.mycompany.myapp".
2. Synchronize the project. Main menu -> Tools -> Android -> Sync Project with Gradle Files.


### 4. Rename Application Name

Open _mobile/src/main/res/values/strings.xml_ and change "WebView App" to your own name. Change _app\_name_ and _navigation\_header\_title_ strings.


### 5. Create Launcher Icon

Right click on _mobile/src/main/res_ directory -> New -> Image Asset -> Icon Type "Launcher Icons", Name "ic\_launcher", create the icon as you wish, you can set clipart, text, shape, color etc. -> Next -> Finish.

You can also change the icon by replacing _ic\_launcher.png_ file in _mipmap-mdpi_, _mipmap-hdpi_, _mipmap-xhdpi_, _mipmap-xxhdpi_, _mipmap-xxxhdpi_ directories. See [summary of launcher icon dimensions](https://developer.android.com/guide/practices/ui_guidelines/icon_design_launcher.html#size).

Don't forget to change also the icon for a push notification by replacing _ic\_stat\_onesignal\_default.png_ file in _drawable-mdpi_, _drawable-hdpi_, _drawable-xhdpi_, _drawable-xxhdpi_, _drawable-xxxhdpi_ directories.

You can also change the logo shown in the navigation drawer header. It is stored in _mobile/src/main/res/drawable-xxxhdpi/navigation\_header\_logo.png_.

**Tip:** Another possibility is to create the launcher icons using [Android Asset Studio](http://romannurik.github.io/AndroidAssetStudio/icons-launcher.html).


### 6. Choose Color Theme

Open _mobile/src/main/AndroidManifest.xml_ and change the value of `application.android:theme` attribute. There are 10 themes you can use:

* Theme.WebViewApp.Blue
* Theme.WebViewApp.Brown
* Theme.WebViewApp.Gray
* Theme.WebViewApp.Green
* Theme.WebViewApp.Lime
* Theme.WebViewApp.Orange
* Theme.WebViewApp.Purple
* Theme.WebViewApp.Red
* Theme.WebViewApp.Teal
* Theme.WebViewApp.Violet


### 7. Setup Navigation and Web Pages

Open _mobile/src/main/res/values/navigation.xml_. There are 4 string arrays:

* List of titles in the navigation drawer menu.
* List of webview URLs. You can specify URL link to a web page on the Internet or URL link to a local page stored in _assets_ directory. Local page does not require Internet connection. URL to the local page must be in this format: `file:///android_asset/example.html`. If you want to add a category, leave the item empty. Menu item without URL is considered as a category item.
* List of icons in the navigation drawer menu.
* List of share messages. Each webview page can be shared via e-mail, sms, social networks etc. Share button is in the action bar. You can specify a message which will be posted. Use `{TITLE}` or `{URL}` tags if you want to insert a title or a URL link of the page. If you don't want to share the page, keep the item empty.

You can add/remove/modify menu items as you need. If you want to use local pages, copy HTML files to _mobile/src/main/assets_ directory and set proper paths in _navigation\_url\_list_ array. See the path format above.

**Important:** Each of these 4 arrays must contain the same number of items.


### 8. Setup Google Analytics

Open configuration file _mobile/src/main/java/com/robotemplates/webviewapp/WebViewAppConfig.java_ and set value of `ANALYTICS_TRACKING_ID` constant to your own UA tracking id. Leave the constant empty if you don't want to use Google Analytics.


### 9. Setup AdMob

Open configuration file _mobile/src/main/java/com/robotemplates/webviewapp/WebViewAppConfig.java_ and set values of `ADMOB_UNIT_ID_BANNER` and `ADMOB_UNIT_ID_INTERSTITIAL` constants to your own unit ids (banner id and interstitial id). Leave these constants empty if you don't want to use AdMob.

Interstitial ad will be shown after each x url loadings or clicks on the navigation drawer menu. Frequency of showing AdMob interstitial ad can be set in `ADMOB_INTERSTITIAL_FREQUENCY` constant.

You can also specify your test device id in `ADMOB_TEST_DEVICE_ID` constant and use test mode when you are debugging the app. Requesting test ads is recommended when you are testing your application on a real device so you do not request invalid impressions. You can find your hashed device id in Android Monitor (Logcat) output by requesting an ad when debugging on your device. Open Android Monitor (Logcat) in Android Studio and look for "To get test ads on this device, call adRequest.addTestDevice("XXXXXX…");". You can use filter/search to find this information in the log. That XXX string is the hashed device id. This applies only to real devices, not emulators. Emulators are considered as test devices by default so you don't have to care about it.


### 10. Setup Push Notifications

Application uses [OneSignal.com](https://onesignal.com/) for push notifications. You need to create a new OneSignal account if you don't have one. You have to create a new project in [OneSignal admin](https://onesignal.com/) and also create a new project in [Firebase Console](https://console.firebase.google.com/), because OneSignal uses Google's [FCM technology](https://firebase.google.com/docs/cloud-messaging/) (Firebase Cloud Messaging). Follow [OneSignal documentation](https://documentation.onesignal.com/docs/generate-a-google-server-api-key) to setup the project. You need to get a "Sender ID" (project number) and "Server key" in the Firebase Console. Everything is described step by step in the OneSignal documentation. When you are done, just paste the "Server key" and the "Project number" in OneSignal admin in configuration wizard. Then open _mobile/build.gradle_ and setup `onesignal_app_id` and `onesignal_google_project_number` constants. You can find these constants in android -> defaultConfig -> manifestPlaceholders list. You can get `onesignal_app_id` value from OneSignal admin and `onesignal_google_project_number` value from Firebase Console. Leave these constants empty if you don't want to use push notifications.

When user taps on a notification, the app is opened and home page is loaded. If you want to load a specific page, you have to send the notification with additional data. Open [OneSignal admin](https://onesignal.com/) -> New Message -> Options -> Launch URL -> Yes and set the link. Other alternative is New Message -> Options -> Include Additional Data -> Yes and set "url" as a key and the link as a value. Both variants have the same result - the app will be opened with the specified URL.

**Tip:** _ic\_stat\_onesignal\_default.png_ is the icon for a push notification. You can change it if you want.


### 11. Create Signing Keystore

You need to create your own keystore to [sign an APK file](https://developer.android.com/studio/publish/app-signing.html) before [publishing the app on Google Play](http://developer.android.com/distribute/googleplay/start.html). You can create the keystore in [Android Studio](https://developer.android.com/studio/publish/app-signing.html#release-mode) or via [keytool utility](http://docs.oracle.com/javase/7/docs/technotes/tools/solaris/keytool.html).

1. Easiest way is to create the keystore directly in Android Studio. Main menu -> Build -> Generate Signed APK -> Create new. Keystore file name has to be _webviewapp.jks_ and must be stored in _extras/keystore_ directory. After you create the keystore file, you can just close the Generate Signed APK dialog.
2. Make sure that newly created _webviewapp.jks_ is stored in _extras/keystore_ directory.
3. Open _extras/keystore/webviewapp.properties_ and set keystore alias and passwords which you chose in step 1.
4. Done. Remember that _webviewapp.jks_ and _webviewapp.properties_ are automatically read by Gradle script when creating a release APK via _assembleRelease_ command. Paths to these files are defined in _gradle.properties_.

**Note:** If you want to create the keystore via keytool utility, run following command: `keytool -genkey -v -keystore webviewapp.jks -alias <your_alias> -keyalg RSA -keysize 2048 -validity 36500` where `<your_alias>` is your alias name. For example your company name or app name. Keytool utility is part of Java JDK. On Windows, you can find it usually in _C:\Program Files\Java\jdkX.Y.Z\bin_. On Mac, you can find it usually in _/Library/Java/JavaVirtualMachines/jdkX.Y.Z/Contents/Home/bin_. If you create the keystore this way, don't forget for step 2 and 3 above.

**Important:** Don't lose the keystore file, otherwise you will not be able to publish new updates on Google Play. You must use the same certificate throughout the lifespan of your app in order for users to be able to install new versions as updates to the app.


## Customization

This chapter describes optional customizations of the app.


### Action Bar and Pull-to-Refresh Gesture

You can enable/disable action bar (toolbar) or pull-to-refresh gesture in the configuration file. Just open _mobile/src/main/java/com/robotemplates/webviewapp/WebViewAppConfig.java_ and set `ACTION_BAR` or `PULL_TO_REFRESH` constants to true/false.

Title in the action bar is loaded from _mobile/src/main/res/values/navigation.xml_ file. If you want to show an HTML title rather than a navigation title in the action bar, then set `ACTION_BAR_HTML_TITLE` constant in the configuration file to true.


### Navigation Drawer Menu

You can enable/disable navigation drawer menu in the configuration file. Just open _mobile/src/main/java/com/robotemplates/webviewapp/WebViewAppConfig.java_ and set `NAVIGATION_DRAWER` constant to true/false.

You can enable/disable background image in the header of the navigation drawer menu. Just open _mobile/src/main/java/com/robotemplates/webviewapp/WebViewAppConfig.java_ and set `NAVIGATION_DRAWER_HEADER_IMAGE` constant to true/false. If it is disabled, accent color will be used for the background. Background image is stored in _mobile/src/main/res/drawable-xxxhdpi/navigation\_header\_bg.png_. Logo shown in the header is stored in _mobile/src/main/res/drawable-xxxhdpi/navigation\_header\_logo.png_.

You can also enable/disable menu icon tint. Just open _mobile/src/main/java/com/robotemplates/webviewapp/WebViewAppConfig.java_ and set `NAVIGATION_DRAWER_ICON_TINT` constant to true/false. Only transparent PNG icons can be tinted so if you don't use transparent icons, it is recommended to disable icon tint. Tint color is defined in _@color/navigation\_icon\_tint_ attribute in _mobile/src/main/res/values/colors.xml_.


### Exit Confirmation

You can enable/disable exit confirmation dialog (when user tries to exit the app by pressing the back button) in the configuration file. Just open _mobile/src/main/java/com/robotemplates/webviewapp/WebViewAppConfig.java_ and set `EXIT_CONFIRMATION` constant to true/false.


### Geolocation

Application supports geolocation. Keep in mind, that some users might have geolocation disabled on their device. Geolocation requires a permission to access GPS. Permission request is shown on start of the app. If user decides to reject the permission, geolocation will not work. If you don't use geolocation on your web, it is better to disable it, because permission request will not be shown. You can enable/disable geolocation in the configuration file. Just open _mobile/src/main/java/com/robotemplates/webviewapp/WebViewAppConfig.java_ and set `GEOLOCATION` constant to true/false.

Also keep in mind, that HTML5 geolocation is not allowed anymore with insecure HTTP protocol for security reasons. It is recommended to use secure HTTPS protocol. See [Deprecating Powerful Features on Insecure Origins](https://sites.google.com/a/chromium.org/dev/Home/chromium-security/deprecating-powerful-features-on-insecure-origins) for more info.


### Rate App Prompt

Rate my app prompt dialog is shown after each x launches of the app. Open _mobile/src/main/java/com/robotemplates/webviewapp/WebViewAppConfig.java_ file if you want to configure the rate app prompt. Frequency of showing the prompt can be set in `RATE_APP_PROMPT_FREQUENCY` constant. Set frequency to 0 if you don't want to show the rate app prompt. Duration of showing the prompt (in milliseconds) can be set in `RATE_APP_PROMPT_DURATION` constant.


### Open Links in External Browser

If you click on some link in the webview, web page is opened directly in the webview by default. Pages can be opened in external browser. If you need this behavior, just open configuration file _mobile/src/main/java/com/robotemplates/webviewapp/WebViewAppConfig.java_ and set `OPEN_LINKS_IN_EXTERNAL_BROWSER = true`.

You can also set rules which links will be opened in an external browser and which ones will be loaded in an internal webview. Open configuration file _mobile/src/main/java/com/robotemplates/webviewapp/WebViewAppConfig.java_ and add/remove rules in `LINKS_OPENED_IN_EXTERNAL_BROWSER` or `LINKS_OPENED_IN_INTERNAL_WEBVIEW` arrays. If a URL link of a page contains a string from the array, it will be opened in external browser/internal webview. These rules have higher priority than `OPEN_LINKS_IN_EXTERNAL_BROWSER` option. For example "http://www.example.com/?target=blank" will be opened externally and "http://www.example.com/?target=webview" will be opened internally.


### Download Manager

This feature allows to download files from web into a device. Just click on a download link and the file will be automatically downloaded into the DOWNLOAD directory. File URL must have a specific format so the download manager can recognize it is a downloadable file. You can see progress of downloading in the notification panel.

By the default configuration, URL must ends with a supported extension (zip, pdf, mp3, avi etc.), e.g. _http://www.example.com/path/mediafile.mp3_. The default configuration also supports Google Drive and Dropbox links.

You can modify supported file extensions or expressions in the configuration file. Just open _mobile/src/main/java/com/robotemplates/webviewapp/WebViewAppConfig.java_ and add/remove file types or expressions in `DOWNLOAD_FILE_TYPES` array as you need. Entries in this array are [regular expressions](https://en.wikipedia.org/wiki/Regular_expression). If the webview URL matches with the regular expression, the file will be downloaded via download manager. Keep the array empty if you don't want to use the download manager.


### Intents in HTML

Application supports [Android Intents](http://developer.android.com/guide/components/intents-filters.html). You can add a special link to your HTML file and you will be able to run appropriate external app to perform some action. For example send an e-mail or call somebody. Following intents are supported (example URI):

* HTTP web page: http://android.com
* HTTPS web page: https://google.com
* E-mail: mailto:someone@example.com?subject=Hello
* Phone call: tel:+0123456789
* SMS: sms:+0123456789
* Map point: geo:50.087474,14.421206
* Map search: geo:0,0?q=Czech+Republic

These intents are also supported in the navigation menu.


### Custom Colors and Icons

You can customize colors in _mobile/src/main/res/values/colors.xml_.

There are 30 icons which you can use for navigation drawer menu. If you need to create an icon for navigation drawer menu, it is recommended to use [Android Asset Studio](http://romannurik.github.io/AndroidAssetStudio/index.html).


### Multi-Language Support

Create a new directory _mobile/src/main/res/values-xx_ where _xx_ is an [ISO 639-1 code](http://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) of the language you want to translate. For example "values-es" for Spanish, "values-fr" for French, "values-de" for German etc. Copy strings.xml and navigation.xml from _mobile/src/main/res/values_ into the new directory. Now you can translate texts or use different URL links for specific languages. Language is automatically determined by the system device settings. If there is no match with _values-xx_ language, default language in _mobile/src/main/res/values_ is selected. See [Localizing with Resources](http://developer.android.com/guide/topics/resources/localization.html) for more info.


### Uploading Files

Application supports uploading files from storage or camera. File picker requires a permission to access storage. Permission request is shown when some file is chose. If user decides to reject the permission, file upload will not work.

There is a known bug on Android 4.4 so the upload might not work properly on this version of Android. See official [Android Issue Tracker](https://code.google.com/p/android/issues/detail?id=62220) for more info.


### Video in HTML

Application supports HTML5 video, YouTube, Vimeo, JW Player etc. in fullscreen mode.


## Building & Publishing

This chapter describes how to build an APK file using Gradle and prepare the app for publishing. Android Studio uses Gradle for building Android applications.

You don't need to install Gradle on your system, because there is a [Gradle Wrapper](https://docs.gradle.org/current/userguide/gradle_wrapper.html). The Wrapper is a batch script on Windows, and a shell script for other operating systems. When you start a Gradle build via the Wrapper, Gradle will be automatically downloaded and used to run the build.

1. Open the project in Android Studio.
2. Open the configuration file _mobile/src/main/java/com/robotemplates/webviewapp/WebViewAppConfig.java_ and check if everything is setup correctly.
3. Open the main build script _mobile/build.gradle_ and check version constants.
4. Run `gradlew assemble` in Android Studio terminal. Make sure you are running the command from the root directory of the project.
5. After the build is finished, the APK file should be available in _mobile/build/outputs/apk_ directory.

**Note:** You can also [create the APK file](https://developer.android.com/studio/publish/app-signing.html#release-mode) via Main menu -> Build -> Generate Signed APK. If you want to do it this way, just choose your keystore, enter your alias, passwords and generate the APK.

**Note:** You will also need a "local.properties" file to set the location of the SDK in the same way that the existing SDK requires, using the "sdk.dir" property. Example of "local.properties" on Windows: `sdk.dir=C:\\adt-bundle-windows\\sdk`. Alternatively, you can set an environment variable called "ANDROID\_HOME". Android Studio will take care of it.

**Tip:** Command `gradlew assemble` builds both - debug and release APK. You can use `gradlew assembleDebug` to build debug APK. You can use `gradlew assembleRelease` to build release APK. Debug APK is signed by a debug keystore. Release APK is signed by your own keystore, stored in _/extras/keystore_ directory.

**Signing process:** Keystore passwords are automatically loaded from property file during building the release APK. Path to this file is defined in "keystore.properties" property in "gradle.properties" file. If this property or the file does not exist, user is asked for passwords explicitly.


### Versioning

Open the main build script _mobile/build.gradle_. There are 4 important constants for defining version code and version name.

* VERSION\_MAJOR
* VERSION\_MINOR
* VERSION\_PATCH
* VERSION\_BUILD

Keep in mind that versions have to be incremental. See [Version Your App](https://developer.android.com/studio/publish/versioning.html) in Android documentation for more info.


## Dependencies

* [AdvancedWebView](https://github.com/delight-im/Android-AdvancedWebView)
* [Android Support Library](http://developer.android.com/tools/support-library/index.html)
* [Google Play Services](http://developer.android.com/google/play-services/index.html)
* [OneSignal](https://onesignal.com/)
* [VideoEnabledWebView](https://github.com/cprcrack/VideoEnabledWebView)


## Changelog

* Version 1.0.0
	* Initial release
* Version 1.1.0
	* AdMob support
	* Configuration for opening links in webview
* Version 1.2.0
	* Update Gradle script to be compatible with Android Studio 1.0
	* Download manager
	* Open links directly in the webview by default
	* Show progress bar when loading nested link
	* Fix refreshing of the current page
	* Fix text color of the HTML select
	* Fix Google Play intent
* Version 1.3.0
	* Material design
	* New color themes
	* New set of menu icons
	* Rules for opening links in external browser or internal webview
	* Support for uploading files
* Version 1.4.0
	* Push notifications
	* Launcher icon as a mipmap
	* Fix empty placeholder
* Version 2.0.0
	* Better webview performance with faster loading and caching
	* Geolocation
	* Fullscreen video
	* Better design
	* Navigation drawer menu with optional categories
	* Interstitial ads
	* Runtime permissions
	* Title and URL link of the page in share message
	* Pull-to-Refresh gesture on offline and empty screen
	* RTL
	* One config file for everything (Google Analytics, AdMob, Parse, enable/disable extra features)
	* Update SDK and libraries
	* Huge refactoring of the code with many improvements and optimizations
* Version 2.1.0
	* OneSignal.com push notification service (Parse.com is shutting down)
	* Configuration for navigation drawer menu icon tint
* Version 2.2.0
	* Uploading photos directly from camera
	* Rate my app prompt
	* Exit confirmation
	* Intents in the navigation menu
	* Action bar title based on HTML title
	* Download manager uses regular expressions to detect a downloadable file
	* Interstitial ad frequency counter based on URL loadings
	* Fix handling back button on video view
	* Update SDK and libraries
	* Refactoring of the code and optimizations


## Developed by

[Robo Templates](http://robotemplates.com/)


## License

[Codecanyon license](http://codecanyon.net/licenses/standard)
