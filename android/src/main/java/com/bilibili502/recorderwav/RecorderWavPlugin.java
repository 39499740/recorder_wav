package com.bilibili502.recorderwav;





import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.MethodChannel.MethodCallHandler;
import io.flutter.plugin.common.MethodChannel.Result;
import io.flutter.plugin.common.PluginRegistry.Registrar;



/**
 * RecorderWavPlugin
 */
public class RecorderWavPlugin implements MethodCallHandler {


    AudioUtil au = new AudioUtil();

    /**
     * Plugin registration.
     */
    public static void registerWith(Registrar registrar) {
        final MethodChannel channel = new MethodChannel(registrar.messenger(), "recorder_wav");
        channel.setMethodCallHandler(new RecorderWavPlugin());
    }

    @Override
    public void onMethodCall(MethodCall call, Result result) {
        if (call.method.equals("getPlatformVersion")) {
            result.success("Android " + android.os.Build.VERSION.RELEASE);
        } else if (call.method.equals("stopRecorder")) {
            System.out.println("结束录制");
            au.stopRecord();
            au.convertWaveFile();
            result.success(au.filePath);
            return;
        } else if (call.method.equals("startRecorder")) {
            System.out.println("开始录制");
            au.startRecord();
            return;
        } else if (call.method.equals("removeFile")) {
            String fileName = call.argument("fileName");
            au.deleteFile(fileName);
        } else {
            result.notImplemented();
        }
    }





}