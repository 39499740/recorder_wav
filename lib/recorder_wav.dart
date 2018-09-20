import 'dart:async';

import 'package:flutter/services.dart';

class RecorderWav {
  static const MethodChannel _channel =
      const MethodChannel('recorder_wav');

  static Future<String> get platformVersion async {
    final String version = await _channel.invokeMethod('getPlatformVersion');
    return version;
  }
}
