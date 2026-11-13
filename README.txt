PhoneReseller Android project

ONLINE APK BUILD (no Android Studio needed):
1. Create/sign in to a GitHub account at https://github.com
2. Create a new repository. You can set it to Private.
3. Upload the CONTENTS of this folder to the repository (not the ZIP itself).
4. Open the repository's Actions tab.
5. Select "Build Android APK" on the left, click "Run workflow", then click the green button.
6. Wait for the workflow to finish. Open the completed run and download the artifact named "PhoneReseller-APK".
7. Unzip the downloaded artifact. Install app-debug.apk on your Android phone. If Android asks, allow installing apps from that browser/file manager.

The workflow builds a debug APK for testing. It uses GitHub Actions with Java 17 and Gradle 8.9. No Android Studio or local Android SDK is needed.

LOCAL BUILD (optional): Open this folder in Android Studio and build the app.
