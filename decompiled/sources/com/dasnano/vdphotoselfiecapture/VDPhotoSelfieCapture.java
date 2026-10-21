package com.dasnano.vdphotoselfiecapture;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.dasnano.vdphotoselfiecapture.activities.LandscapeSelfieActivity;
import com.dasnano.vdphotoselfiecapture.activities.PortraitSelfieActivity;
import com.dasnano.vdphotoselfiecapture.activities.SelfieActivity;
import com.dasnano.vdphotoselfiecapture.activities.SelfieTutorialActivity;
import com.dasnano.vdphotoselfiecapture.config.VDPhotoSelfieConfiguration;
import com.veridas.activity.DasActivity;
import com.veridas.config.Configuration;
import com.veridas.config.PropertyNameNotFoundException;
import com.veridas.di.CommonLibraryDepInjector;
import com.veridas.lifecycle.VeridasPackageBroadcastHelper;
import com.veridas.log.Log;
import com.veridas.logger.Logger;
import com.veridas.logger.VDLogger;
import com.veridas.logger.VDLoggerException;
import com.veridas.logger.android.AndroidLoggerFactory;
import com.veridas.util.Util;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes9.dex */
@Keep
public final class VDPhotoSelfieCapture {
    private static final String EXCEPTION_CONTEXT_NOT_NULL = "Context must not be null";
    private static final String EXCEPTION_DELEGATE_NOT_NULL = "Delegate must not be null";
    public static final String FORCE_STOP = "com.dasnano.selfieCapture.forceStop";
    private static final String LOG_TAG = "VDPhotoSelfieCapture";
    public static final String LOG_TAG_FALSE = "False";
    public static final String LOG_TAG_FINISH_SDK = "Successfully: %s";
    public static final String LOG_TAG_ON_BACK_PRESSED = "ON_BACK_PRESSED";
    public static final String LOG_TAG_REPEAT = "repeat";
    public static final String LOG_TAG_STOP_SDK = "Stopping SDK";
    public static final String LOG_TAG_TRUE = "True";
    private static IVDPhotoSelfieCapture mDelegate;
    private static String nextToken;
    private static final AtomicBoolean started = new AtomicBoolean(false);
    private static BroadcastReceiver receiver = null;

    @Keep
    public interface IVDPhotoSelfieCapture {
        @Deprecated
        void VDPhotoSelfieAndChallengeVideoCaptured(ByteArrayInputStream byteArrayInputStream, String str);

        void VDPhotoSelfieAndChallengeVideoCaptured(byte[] bArr, String str);

        @Deprecated
        void VDPhotoSelfieAndFaceCaptured(ByteArrayInputStream byteArrayInputStream, ByteArrayInputStream byteArrayInputStream2);

        void VDPhotoSelfieAndFaceCaptured(byte[] bArr, byte[] bArr2);

        @Deprecated
        void VDPhotoSelfieAndFaceCapturedWithLiveDetection(ByteArrayInputStream byteArrayInputStream, ByteArrayInputStream byteArrayInputStream2);

        void VDPhotoSelfieAndFaceCapturedWithLiveDetection(byte[] bArr, byte[] bArr2);

        void VDPhotoSelfieChallengeFinishedWithError();

        void VDPhotoSelfieFinished(boolean z10);
    }

    public class a extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Configuration f39532a;

        public a(Configuration configuration) {
            this.f39532a = configuration;
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            action.getClass();
            byte b10 = -1;
            switch (action.hashCode()) {
                case -1787719410:
                    if (action.equals("com.veridas.selfieCapture.selfieTutorialActivity.tutorialFinished")) {
                        b10 = 0;
                    }
                    break;
                case -1460735640:
                    if (action.equals(SelfieActivity.SELFIE_FINISHED)) {
                        b10 = 1;
                    }
                    break;
                case -1223856016:
                    if (action.equals("com.dasnano.selfieCapture.selfieActivity.repeated")) {
                        b10 = 2;
                    }
                    break;
                case -40998150:
                    if (action.equals(SelfieActivity.PHOTO_CAPTURED)) {
                        b10 = 3;
                    }
                    break;
                case 186224839:
                    if (action.equals(SelfieActivity.CHALLENGE_TO_BE_REPEATED)) {
                        b10 = 4;
                    }
                    break;
                case 573272875:
                    if (action.equals(SelfieActivity.CHALLENGE_CAPTURED)) {
                        b10 = 5;
                    }
                    break;
                case 1546677045:
                    if (action.equals(SelfieActivity.FRAME_CAPTURED)) {
                        b10 = 6;
                    }
                    break;
                case 2058666316:
                    if (action.equals(VDPhotoSelfieCapture.FORCE_STOP)) {
                        b10 = 7;
                    }
                    break;
            }
            Configuration configuration = this.f39532a;
            switch (b10) {
                case 0:
                    boolean booleanExtra = intent.getBooleanExtra("com.veridas.selfieCapture.selfieTutorialActivity.tutorialFinished", true);
                    if (!booleanExtra) {
                        VDPhotoSelfieCapture.finishSdk(context, booleanExtra);
                    } else if (VDPhotoSelfieCapture.isStarted()) {
                        VDPhotoSelfieCapture.startPhotoSelfieCaptureActivity(context, configuration);
                    }
                    break;
                case 1:
                    VDPhotoSelfieCapture.finishSdk(context, intent.getBooleanExtra(SelfieActivity.SELFIE_FINISHED, true));
                    break;
                case 2:
                    VDPhotoSelfieCapture.startPhotoSelfieCaptureActivity(context, configuration);
                    break;
                case 3:
                    VDPhotoSelfieCapture.processImagesAndDelegate(intent.getStringExtra(SelfieActivity.PHOTO_SELFIE_PATH), intent.getStringExtra(SelfieActivity.PHOTO_FACE_PATH), false);
                    break;
                case 4:
                    VDPhotoSelfieCapture.mDelegate.VDPhotoSelfieChallengeFinishedWithError();
                    break;
                case 5:
                    VDPhotoSelfieCapture.processChallengeAndDelegate(intent.getStringExtra(SelfieActivity.CHALLENGE_VIDEO_PATH), intent.getStringExtra(SelfieActivity.CHALLENGE_VTT));
                    break;
                case 6:
                    VDPhotoSelfieCapture.processImagesAndDelegate(intent.getStringExtra(SelfieActivity.FRAME_SELFIE_PATH), intent.getStringExtra(SelfieActivity.FRAME_FACE_PATH), true);
                    break;
                case 7:
                    VDPhotoSelfieCapture.finishSdk(context, false);
                    break;
            }
        }
    }

    private VDPhotoSelfieCapture() {
    }

    private static void cleanPrivateVariables() {
        if (mDelegate != null) {
            mDelegate = null;
        }
        if (receiver != null) {
            receiver = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void finishSdk(Context context, boolean z10) {
        if (started.getAndSet(false)) {
            unregisterReceivers(context);
            Logger.Tag tag = Logger.Tag.FINISH_SDK;
            Object[] objArr = new Object[1];
            objArr[0] = z10 ? LOG_TAG_TRUE : LOG_TAG_FALSE;
            VDLogger.log(tag, LOG_TAG_FINISH_SDK, objArr);
            VDLogger.endSession(z10);
            mDelegate.VDPhotoSelfieFinished(z10);
            cleanPrivateVariables();
        }
    }

    public static ArrayList<String> getConfigurationKeys(Context context) {
        return new VDPhotoSelfieConfiguration(context.getResources()).getKeys();
    }

    public static String getNextChallenge() {
        return nextToken;
    }

    public static String getVersion() {
        return BuildConfig.VERSION_NAME;
    }

    public static boolean isStarted() {
        return started.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void processChallengeAndDelegate(String str, String str2) {
        File file = new File(str);
        try {
            try {
                if (file.exists()) {
                    byte[] bArrFileToByteArray = Util.fileToByteArray(file);
                    mDelegate.VDPhotoSelfieAndChallengeVideoCaptured(new ByteArrayInputStream(bArrFileToByteArray), str2);
                    mDelegate.VDPhotoSelfieAndChallengeVideoCaptured(bArrFileToByteArray, str2);
                }
            } catch (IOException e5) {
                Log.e(LOG_TAG, e5);
            }
        } finally {
            Util.deleteRecursive(file);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void processImagesAndDelegate(String str, String str2, boolean z10) {
        File file = new File(str);
        File file2 = new File(str2);
        try {
            try {
                if (file.exists() && file2.exists()) {
                    byte[] bArrFileToByteArray = Util.fileToByteArray(file);
                    byte[] bArrFileToByteArray2 = Util.fileToByteArray(file2);
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrFileToByteArray);
                    ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrFileToByteArray2);
                    if (z10) {
                        mDelegate.VDPhotoSelfieAndFaceCapturedWithLiveDetection(byteArrayInputStream, byteArrayInputStream2);
                        mDelegate.VDPhotoSelfieAndFaceCapturedWithLiveDetection(bArrFileToByteArray, bArrFileToByteArray2);
                    } else {
                        mDelegate.VDPhotoSelfieAndFaceCaptured(byteArrayInputStream, byteArrayInputStream2);
                        mDelegate.VDPhotoSelfieAndFaceCaptured(bArrFileToByteArray, bArrFileToByteArray2);
                    }
                }
            } catch (IOException e5) {
                Log.e(LOG_TAG, e5);
            }
        } finally {
            Util.deleteRecursive(file);
            Util.deleteRecursive(file2);
        }
    }

    private static void registerAndProcessBroadcasts(Configuration configuration) {
        receiver = new a(configuration);
    }

    private static void registerReceivers(Context context) {
        VeridasPackageBroadcastHelper.INSTANCE.register(context, receiver, Arrays.asList(FORCE_STOP, "com.veridas.selfieCapture.selfieTutorialActivity.tutorialFinished", "com.dasnano.selfieCapture.selfieActivity.repeated", SelfieActivity.FRAME_CAPTURED, SelfieActivity.PHOTO_CAPTURED, SelfieActivity.CHALLENGE_TO_BE_REPEATED, SelfieActivity.CHALLENGE_CAPTURED, SelfieActivity.SELFIE_FINISHED));
    }

    public static void start(@NonNull IVDPhotoSelfieCapture iVDPhotoSelfieCapture, @NonNull Context context, Map<String, String> map) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        if (iVDPhotoSelfieCapture == null) {
            throw new NullPointerException(EXCEPTION_DELEGATE_NOT_NULL);
        }
        if (context == null) {
            throw new NullPointerException(EXCEPTION_CONTEXT_NOT_NULL);
        }
        if (started.getAndSet(true)) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        mDelegate = iVDPhotoSelfieCapture;
        nextToken = null;
        CommonLibraryDepInjector.warmup(applicationContext);
        VDPhotoSelfieConfiguration vDPhotoSelfieConfiguration = new VDPhotoSelfieConfiguration(applicationContext.getResources());
        if (map != null) {
            vDPhotoSelfieConfiguration.load(map);
        } else {
            Log.e(LOG_TAG, "No configuration");
        }
        startLogger(applicationContext, vDPhotoSelfieConfiguration);
        registerAndProcessBroadcasts(vDPhotoSelfieConfiguration);
        registerReceivers(applicationContext);
        try {
            if (vDPhotoSelfieConfiguration.getBoolean("showtutorial")) {
                startPhotoSelfieCaptureTutorialActivity(applicationContext, vDPhotoSelfieConfiguration);
            } else {
                startPhotoSelfieCaptureActivity(applicationContext, vDPhotoSelfieConfiguration);
            }
        } catch (PropertyNameNotFoundException e5) {
            Log.e(LOG_TAG, e5);
        }
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
            Log.e(LOG_TAG, e);
        } catch (VDLoggerException e7) {
            e = e7;
            Log.e(LOG_TAG, e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void startPhotoSelfieCaptureActivity(Context context, Configuration configuration) {
        Class cls;
        try {
            cls = configuration.getString("screenorientation").equalsIgnoreCase("portrait") ? PortraitSelfieActivity.class : LandscapeSelfieActivity.class;
        } catch (PropertyNameNotFoundException e5) {
            Log.e(LOG_TAG, e5);
            cls = null;
        }
        DasActivity.startActivity(context, (Class<?>) cls, configuration);
    }

    private static void startPhotoSelfieCaptureTutorialActivity(Context context, Configuration configuration) {
        DasActivity.startActivity(context, (Class<?>) SelfieTutorialActivity.class, configuration);
    }

    public static void stop(@NonNull Context context) {
        if (context == null) {
            throw new NullPointerException(EXCEPTION_CONTEXT_NOT_NULL);
        }
        if (isStarted()) {
            VeridasPackageBroadcastHelper.INSTANCE.send(context, new Intent(FORCE_STOP));
            VDLogger.log(Logger.Tag.STOP_SDK, LOG_TAG_STOP_SDK);
            finishSdk(context, false);
        }
    }

    private static void unregisterReceivers(Context context) {
        if (receiver != null) {
            VeridasPackageBroadcastHelper.INSTANCE.unregister(context, receiver);
            receiver = null;
        }
    }

    public static void updateChallenge(String str) {
        nextToken = str;
    }

    public static void start(@NonNull IVDPhotoSelfieCapture iVDPhotoSelfieCapture, @NonNull Context context) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        start(iVDPhotoSelfieCapture, context, null);
    }
}
