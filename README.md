# recorder_wav

[![pub package](https://img.shields.io/pub/v/recorder_wav.svg)](https://pub.dartlang.org/packages/recorder_wav)

## Usage
To use this plugin, add `recorder_wav` as a [dependency in your pubspec.yaml file](https://flutter.io/platform-plugins/).



### Android
Make sure you add the following permissions to your Android Manifest
```
<uses-permission android:name="android.permission.RECORD_AUDIO" />
<uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE" />
```


### iOS
Make sure you add the following key to Info.plist for iOS
```
<key>NSMicrophoneUsageDescription</key>
<string>Record audio for playback</string>
```

## Example
``` dart
// Import package
import 'package:recorder_wav/recorder_wav.dart';

//Start recorder
RecorderWav.startRecorder();

//Stop recorder & get filepath
String filePath = await RecorderWav.StopRecorder();

//Remove wav file
RecorderWav.removeRecorderFile(filePath);

```

### Encoding format
Only wav.



## Getting Started

For help getting started with Flutter, view our online
[documentation](https://flutter.io/).

For help on editing plugin code, view the [documentation](https://flutter.io/developing-packages/#edit-plugin-package).
