Cordova Croutons Plugin
======

Cordova Croutons Plugin is allowing to show native crouton notification. Ideal solution to show internal notifications / toasts.

======

iOS Plugin is based on Swift Messages library
https://github.com/SwiftKickMobile/SwiftMessages

Library is installed as CocoaPods dependency using cordova-plugin-cocoapod-support
https://github.com/blakgeek/cordova-plugin-cocoapods-support

Methods are exposed inside swift file, which was possible due to:
https://www.npmjs.com/package/cordova-plugin-add-swift-support

======

Android Plugin is based on Crouton library
https://github.com/keyboardsurfer/Crouton

Library is installed as Gradle dependency using cordova native framework declaration

Plugins is exposing following methods:
+ (void)showAlert(msg:String);
+ (void)showConfirm(msg:String);
+ (void)showInfo(msg:String);
+ (void)cancelAll;
