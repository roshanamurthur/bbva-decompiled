package com.dasnano.vdvideoselfiecapture;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.dasnano.vdvideoselfiecapture.activities.VideoSelfieActivity;
import com.dasnano.vdvideoselfiecapture.activities.VideoTutorialActivity;
import com.dasnano.vdvideoselfiecapture.config.VDVideoSelfieConfiguration;
import com.dasnano.vdvideoselfiecapture.other.VDVideoEnums;
import com.veridas.config.Configuration;
import com.veridas.config.PropertyNameNotFoundException;
import com.veridas.di.CommonLibraryDepInjector;
import com.veridas.lib.entities.resources.Document;
import com.veridas.lifecycle.VeridasPackageBroadcastHelper;
import com.veridas.log.Log;
import com.veridas.logger.Logger;
import com.veridas.logger.VDLogger;
import com.veridas.logger.VDLoggerException;
import com.veridas.logger.android.AndroidLoggerFactory;
import com.veridas.resource.LegacyIdUtil;
import com.veridas.util.Util;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes9.dex */
@Keep
public final class VDVideoSelfieCapture {
    private static final String AT_DRIVINGLICENSE_2004_ID = "AT_DrivingLicense_2004";
    private static final String EXCEPTION_CONTEXT_NOT_NULL = "Context must not be null";
    private static final String EXCEPTION_DELEGATE_NOT_NULL = "Delegate must not be null";
    private static final String EXCEPTION_METHOD_AFTER_START = "This method can't be executed while the SDK is running.";
    private static final int FINISH_SDK_DELAY_MILLIS = 200;
    private static final String INVALID_DOCUMENT_ID = "%s is not a valid document ID";
    private static final String TAG = "VDVideoSelfieCapture";
    private static IVDVideoSelfieCapture mDelegate;
    private static final AtomicBoolean started = new AtomicBoolean(false);
    private static BroadcastReceiver broadcastReceiver = null;
    private static String mDocumentType = "";
    private static String mToken = "";
    private static boolean mSmartVideo = false;

    @Keep
    public interface IVDVideoSelfieCapture {
        void VDVideoSelfieCaptured(byte[] bArr);

        void VDVideoSelfieFinished(boolean z10);
    }

    public class a extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            boolean zExists;
            String action = intent.getAction();
            action.getClass();
            switch (action) {
                case "com.veridas.videoSelfieCapture.videoTutorialActivity.TUTORIAL_FINISHED":
                    VDVideoSelfieCapture.finishSdk(context, intent.getBooleanExtra("com.veridas.videoSelfieCapture.videoTutorialActivity.TUTORIAL_FINISHED", false));
                    return;
                case "com.veridas.videoSelfieCapture.videoActivity.VIDEO_CAPTURED":
                    File file = new File(intent.getStringExtra(VideoSelfieActivity.VIDEO_CAPTURED));
                    if (!file.exists()) {
                        Log.e(VDVideoSelfieCapture.TAG, "Capture file does not exist..!");
                        VDVideoSelfieCapture.finishSdk(context, false);
                        return;
                    }
                    try {
                        VDVideoSelfieCapture.mDelegate.VDVideoSelfieCaptured(Util.fileToByteArray(file));
                        VDVideoSelfieCapture.finishSdk(context, true);
                        if (!zExists) {
                            return;
                        }
                    } catch (IOException e5) {
                        Log.e(VDVideoSelfieCapture.TAG, e5);
                        VDVideoSelfieCapture.finishSdk(context, false);
                        if (!zExists) {
                            return;
                        }
                    } finally {
                        if (file.exists()) {
                            file.delete();
                        }
                    }
                    return;
                case "com.veridas.videoSelfieCapture.videoActivity.CAPTURE_FINISHED":
                    VDVideoSelfieCapture.finishSdk(context, intent.getBooleanExtra(VideoSelfieActivity.CAPTURE_FINISHED, false));
                    return;
                default:
                    return;
            }
        }
    }

    private VDVideoSelfieCapture() {
    }

    private static void assertNotRunning() {
        if (started.get()) {
            throw new IllegalStateException(EXCEPTION_METHOD_AFTER_START);
        }
    }

    private static boolean checkSmartVideoIsPossible(Context context, String str) {
        Document documentById = CommonLibraryDepInjector.getBlockingResourcesDatabase(context).getDocumentById(str);
        return (documentById == null || documentById.getObverse() == null || !documentById.getObverse().isIntelligent() || str.equalsIgnoreCase(AT_DRIVINGLICENSE_2004_ID)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void finishSdk(Context context, boolean z10) {
        if (started.getAndSet(false)) {
            if (broadcastReceiver != null) {
                VeridasPackageBroadcastHelper.INSTANCE.unregister(context, broadcastReceiver);
            }
            VDLogger.log(Logger.Tag.FINISH_SDK, "Successfully: %b", Boolean.valueOf(z10));
            VDLogger.endSession(z10);
            mDelegate.VDVideoSelfieFinished(z10);
            reInitializeValues();
        }
    }

    public static ArrayList<String> getConfigurationKeys(Context context) {
        return new VDVideoSelfieConfiguration(context.getResources()).getKeys();
    }

    public static String getVersion() {
        return BuildConfig.VERSION_NAME;
    }

    public static boolean isStarted() {
        return started.get();
    }

    private static void reInitializeValues() {
        mDocumentType = "";
        mSmartVideo = false;
        mDelegate = null;
        mToken = "";
    }

    private static void registerAndProcessBroadcasts() {
        broadcastReceiver = new a();
    }

    private static void registerReceivers(Context context) {
        VeridasPackageBroadcastHelper.INSTANCE.register(context, broadcastReceiver, Arrays.asList(VideoSelfieActivity.CAPTURE_FINISHED, "com.veridas.videoSelfieCapture.videoTutorialActivity.TUTORIAL_FINISHED", VideoSelfieActivity.VIDEO_CAPTURED));
    }

    public static void setDocumentType(@NonNull VDVideoEnums.VDVideoDocumentType vDVideoDocumentType, Context context) {
        assertNotRunning();
        mDocumentType = LegacyIdUtil.getDocumentIdFromLegacyId(vDVideoDocumentType.getOrdinal());
    }

    @Deprecated
    public static void setToken(String str) {
        assertNotRunning();
        mToken = str;
    }

    public static void start(@NonNull IVDVideoSelfieCapture iVDVideoSelfieCapture, @NonNull Context context) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        start(iVDVideoSelfieCapture, context, null);
    }

    private static void startLogger(Context context, Configuration configuration) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        try {
            VDLogger.addLogger(AndroidLoggerFactory.class);
            String string = configuration.getString("loggerfactoryclass");
            if (string != null && !string.isEmpty()) {
                VDLogger.addLogger(string);
            }
            VDLogger.startSession(context);
        } catch (PropertyNameNotFoundException e5) {
            e = e5;
            Log.e(TAG, e);
        } catch (VDLoggerException e7) {
            e = e7;
            Log.e(TAG, e);
        }
    }

    public static void stop(@NonNull Context context) {
        if (context == null) {
            throw new NullPointerException(EXCEPTION_CONTEXT_NOT_NULL);
        }
        boolean zIsStarted = isStarted();
        VDLogger.log(Logger.Tag.STOP_SDK, "Have we started? %b", Boolean.valueOf(zIsStarted));
        if (zIsStarted) {
            context.getApplicationContext().sendBroadcast(new Intent("com.dasnano.videoFinish"));
            finishSdk(context, false);
        }
    }

    public static void start(@NonNull IVDVideoSelfieCapture iVDVideoSelfieCapture, @NonNull Context context, Map<String, String> map) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        if (iVDVideoSelfieCapture == null) {
            throw new NullPointerException(EXCEPTION_DELEGATE_NOT_NULL);
        }
        if (context == null) {
            throw new NullPointerException(EXCEPTION_CONTEXT_NOT_NULL);
        }
        mDelegate = iVDVideoSelfieCapture;
        if (started.getAndSet(true)) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        CommonLibraryDepInjector.warmup(applicationContext);
        VDVideoSelfieConfiguration vDVideoSelfieConfiguration = new VDVideoSelfieConfiguration(applicationContext.getResources());
        if (map != null) {
            if (!TextUtils.isEmpty(mToken) && !map.containsKey("token")) {
                map.put("token", mToken);
            }
            vDVideoSelfieConfiguration.load(map);
        }
        startLogger(applicationContext, vDVideoSelfieConfiguration);
        if (CommonLibraryDepInjector.getBlockingResourcesDatabase(applicationContext).getDocumentById(mDocumentType) == null) {
            Log.e(TAG, INVALID_DOCUMENT_ID, mDocumentType);
            mDocumentType = "";
        } else {
            mSmartVideo = checkSmartVideoIsPossible(applicationContext, mDocumentType);
        }
        registerAndProcessBroadcasts();
        registerReceivers(applicationContext);
        try {
            if (vDVideoSelfieConfiguration.getBoolean("showtutorial")) {
                VideoTutorialActivity.start(applicationContext, vDVideoSelfieConfiguration, mDocumentType, mSmartVideo);
            } else {
                VideoSelfieActivity.start(applicationContext, vDVideoSelfieConfiguration, mDocumentType, mSmartVideo);
            }
        } catch (PropertyNameNotFoundException e5) {
            Log.e(TAG, e5);
        }
    }

    public static void setDocumentType(@NonNull String str, Context context) {
        assertNotRunning();
        mDocumentType = str;
    }
}
