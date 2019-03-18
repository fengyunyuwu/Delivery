package com.example.delivery.utils;

import android.util.Log;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * author:Ken
 * time:2019/3/7
 */
public class CrashHandler {
//    private final static String TAG = "全局异常拦截器";
//    private static boolean sHandleOutOfMemoryError = false;
//    private static boolean sHandleNullPointerException = false;
//    /** 用来存储设备信息和异常信息 */
//    private static Map<String, String> infos = new HashMap<>();
//
//    private static final UncaughtExceptionHandler S_UNCAUGHT_EXCEPTION_HANDLER = new UncaughtExceptionHandler();
//
//    public static void makeDumpHprofData() {
//        try {
//            String path = FileManager.getDiskCacheDir() + "/" + getDateFormatter().format(new Date()) + ".hprof";
//            android.os.Debug.dumpHprofData(path);
//            Log.i(TAG, "生成内存快照=" + path);
//        } catch (IOException e) {
//            Log.i(TAG,"dumpHprofData",e);
//        }
//    }
//
//    /**
//     * 拦截所有线程的所有异常。作该操作的主要原因：如果想在某个特定的时刻对某些线程进行拦截，
//     * 很有可能无法在设置完handler的时刻立即拦截到。因此通常进行全局的拦截
//     */
//    public static void startCaughtAllException(boolean currentThread, boolean handle) {
//        CatchOutOfMemoryError.start(currentThread, handle);
//        CatchNullPointerException.start(currentThread, handle);
//        setDefaultHandler(false);//
//    }
//
//    public static class CatchOutOfMemoryError extends OutOfMemoryError{
//        public static void start(boolean currentThread, boolean handle) {
//            sHandleOutOfMemoryError = handle;
//            setDefaultHandler(currentThread);//给所有线程设置
//        }
//    }
//
//    public static class CatchNullPointerException extends NullPointerException{
//        public static void start(boolean currentThread, boolean handle) {
//            sHandleNullPointerException = handle;
//            setDefaultHandler(currentThread);
//        }
//    }
//
//    public static void setDefaultHandler(boolean currentThread) {
//        if(currentThread) {
//            Thread.currentThread().setUncaughtExceptionHandler(S_UNCAUGHT_EXCEPTION_HANDLER);
//        }else {
//            Thread.setDefaultUncaughtExceptionHandler(S_UNCAUGHT_EXCEPTION_HANDLER);
//        }
//    }
//
//    private static class UncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {
//        @Override
//        public void uncaughtException(Thread thread, Throwable e) {
//            Class<?> clazz = e.getClass();
//            if (Log.isDebug()){
//                Log.e(TAG, "异常信息=\t" + e.getMessage());
//                Log.i(TAG,clazz.equals(OutOfMemoryError.class) + "\t" + clazz.equals(NullPointerException.class)
//                        + "\t" + clazz.isInstance(OutOfMemoryError.class) + "\t" + clazz.isInstance(NullPointerException.class));
//                Log.e(TAG, "拦截异常=" + clazz.getName() + "\t线程="+thread.getName(), e);
//            }
//
//            if(sHandleOutOfMemoryError && clazz.equals(OutOfMemoryError.class)) {
//                makeDumpHprofData();
//            }else if(sHandleNullPointerException && clazz.equals(NullPointerException.class)) {
//            }
//            saveCrashInfo2File(e);
//            if (!Log.isDebug()){
//                android.os.Process.killProcess(android.os.Process.myPid());
//            }else {
//                try {
//                    Thread.sleep(30*1000);
//                } catch (InterruptedException e1) {
//                    Log.e(TAG,"Thread.sleep",e1);
//                }
//            }
//            ActivityStackManager.getInstance().killAllActivity();
//            //System.exit(2);
//        }
//    }
//
//    private static SimpleDateFormat sDateFormatter;
//    private static SimpleDateFormat getDateFormatter() {
//        if(sDateFormatter == null) sDateFormatter = new SimpleDateFormat("yyyyMMdd-HH:mm:ss-SSS");
//        return sDateFormatter;
//    }
//    /**保存错误信息到文件中*/
//    private static String saveCrashInfo2File(Throwable ex) {
//
//        StringBuilder sb = new StringBuilder();
//        for (Map.Entry<String, String> entry : infos.entrySet()) {
//            String key = entry.getKey();
//            String value = entry.getValue();
//            sb.append(key + "=" + value + "\n");
//        }
//
//        Writer writer = new StringWriter();
//        PrintWriter printWriter = new PrintWriter(writer);
//        ex.printStackTrace(printWriter);
//        Throwable cause = ex.getCause();
//        while (cause != null) {
//            cause.printStackTrace(printWriter);
//            cause = cause.getCause();
//        }
//        printWriter.close();
//
//        String result = writer.toString();
//        sb.append(result);
//        try {
//            long timestamp = System.currentTimeMillis();
//            String time = getDateFormatter().format(new Date());
//            String fileName = "crash_" + time + ".log";
//
//            String path  = FileManager.getDiskCacheDir() + "/errorLog/";
//            Log.d(TAG,"保存的文件路径"+path);
//            File dir = new File(path);
//            if (!dir.exists()) {
//                dir.mkdirs();
//            }
//            FileOutputStream fos = new FileOutputStream(path + fileName);
//            fos.write(sb.toString().getBytes());
//            fos.close();
//            // sendToHost(fileName);
//
//            return fileName;
//        } catch (Exception e) {
//            Log.e(TAG, "保存错误日志错误！", e);
//        }
//
//        return null;
//    }
}
