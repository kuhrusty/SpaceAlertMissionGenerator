SpaceAlertMissionGenerator
==========================

Mission Generator For Space Alert Board Game On Android

Project uses Gradle and Android Studio formats.

Current Modules:
  * app - Application code for project.
  * wear - current prototype for android wear usage.  **To enable this,**
    uncomment the `include` line in `settings.gradle`.

To Participate in Beta:
 - follow the directions from this post (must use google+): https://plus.google.com/112605284870086271590/posts/3A9Kk3gzVPc

Play Store:
https://play.google.com/store/apps/details?id=com.boarbeard&hl=en

## Running multiple versions

When you build a debug version, the `applicationId` is
**com.boarbeard.debug** instead of **com.boarbeard**; this is so that
you can keep the Play Store version *and* your own development version
installed at the same time.  (This is done by `applicationIdSuffix` in
`app/build.gradle`, which can be commented out.)  In this case, the app
name comes from `app/src/debug/res/values/strings.xml` instead of
`app/src/main/res/values/strings.xml`.  If you want the names to be the
same, you can edit or remove the debug `strings.xml`.
