
import 'dart:async';
import 'dart:io';

import 'package:flutter/services.dart';

class RecorderWav {
  static const MethodChannel _channel =
      const MethodChannel('recorder_wav');

  static Future<String> get platformVersion async {
    final String version = await _channel.invokeMethod('getPlatformVersion');
    return version;
  }

  static Future<String> StopRecorder() async {
    var file = await _channel.invokeMethod("stopRecorder");
    return file;
  }

  static startRecorder() {
    _channel.invokeMethod("startRecorder");
  }

  static removeRecorderFile(String fileName) {
    _channel.invokeMethod("removeFile", {'file': fileName});
  }
}
