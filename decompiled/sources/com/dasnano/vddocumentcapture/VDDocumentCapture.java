package com.dasnano.vddocumentcapture;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.dasnano.vddocumentcapture.activities.DocumentCaptureTutorialActivity;
import com.dasnano.vddocumentcapture.activities.DocumentClassificationActivity;
import com.dasnano.vddocumentcapture.config.VDDocumentConfiguration;
import com.dasnano.vddocumentcapture.other.DocumentUtils;
import com.dasnano.vddocumentcapture.other.VDDocument;
import com.dasnano.vddocumentcapture.other.VDEnums;
import com.veridas.config.Configuration;
import com.veridas.config.PropertyNameNotFoundException;
import com.veridas.di.CommonLibraryDepInjector;
import com.veridas.lifecycle.VeridasPackageBroadcastHelper;
import com.veridas.log.Log;
import com.veridas.logger.Logger;
import com.veridas.logger.VDLogger;
import com.veridas.logger.VDLoggerException;
import com.veridas.logger.android.AndroidLoggerFactory;
import com.veridas.resource.database.IBlockingResourcesDatabase;
import com.veridas.util.Util;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes9.dex */
@Keep
public final class VDDocumentCapture {
    public static final String FORCE_STOP = "com.veridas.documentCapture.stopSdk";
    public static final String TAG = "VDDocumentCapture";
    private static List<String> mDocuments;
    private static final List<String> RECEIVER_LIST = Arrays.asList(DocumentClassificationActivity.FINISH_SDK, "com.veridas.documentCapture.documentTutorialFragment.tutorialFinished", DocumentClassificationActivity.TIME_WITHOUT_CAPTURE, DocumentClassificationActivity.IMAGE_CAPTURE);
    private static IVDDocumentCapture mDelegate = null;
    private static final AtomicBoolean started = new AtomicBoolean(false);
    private static BroadcastReceiver receiver = null;

    @Keep
    public interface IVDDocumentCapture {
        void VDDocumentCaptureFinished(boolean z10);

        @Deprecated
        void VDDocumentCaptured(ByteArrayInputStream byteArrayInputStream, VDEnums.VDCaptureType vDCaptureType, List<VDEnums.VDDocumentType> list);

        @Deprecated
        void VDDocumentCaptured(byte[] bArr, VDEnums.VDCaptureType vDCaptureType, List<VDDocument> list);

        @Deprecated
        void VDDocumentCutCaptured(ByteArrayInputStream byteArrayInputStream, VDEnums.VDCaptureType vDCaptureType, List<VDEnums.VDDocumentType> list);

        @Deprecated
        void VDDocumentCutCaptured(byte[] bArr, VDEnums.VDCaptureType vDCaptureType, List<VDDocument> list);

        void VDTimeWithoutPhotoTaken(int i10, VDEnums.VDCaptureType vDCaptureType);
    }

    public class a extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Configuration f39293a;

        public a(Configuration configuration) {
            this.f39293a = configuration;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            action.getClass();
            switch (action) {
                case "com.veridas.documentCapture.documentTutorialFragment.tutorialFinished":
                    if (!intent.getBooleanExtra("com.veridas.documentCapture.documentTutorialFragment.tutorialFinished", true)) {
                        VDDocumentCapture.finishSdk(context, false);
                        return;
                    } else {
                        if (VDDocumentCapture.isStarted()) {
                            DocumentClassificationActivity.start(context, this.f39293a, VDDocumentCapture.mDocuments);
                            return;
                        }
                        return;
                    }
                case "com.veridas.documentCapture.documentClassificationActivity.finishSdk":
                    VDDocumentCapture.finishSdk(context, intent.getBooleanExtra(DocumentClassificationActivity.FINISH_SDK, false));
                    return;
                case "com.veridas.documentCapture.documentClassificationActivity.imageCapture":
                    IBlockingResourcesDatabase blockingResourcesDatabase = CommonLibraryDepInjector.getBlockingResourcesDatabase(context);
                    String stringExtra = intent.getStringExtra(DocumentClassificationActivity.IMAGE_CAPTURE);
                    VDEnums.VDCaptureType vDCaptureType = (VDEnums.VDCaptureType) intent.getSerializableExtra(DocumentClassificationActivity.CAPTURE_TYPE);
                    ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra(DocumentClassificationActivity.DOCUMENTS);
                    List<VDEnums.VDDocumentType> idsToEnumList = DocumentUtils.parseIdsToEnumList(stringArrayListExtra);
                    List<VDDocument> idsToVDDocumentList = DocumentUtils.parseIdsToVDDocumentList(blockingResourcesDatabase, stringArrayListExtra);
                    boolean booleanExtra = intent.getBooleanExtra(DocumentClassificationActivity.CUT, false);
                    File file = new File(stringExtra);
                    try {
                        try {
                            if (file.exists()) {
                                byte[] bArrFileToByteArray = Util.fileToByteArray(file);
                                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrFileToByteArray);
                                if (booleanExtra) {
                                    VDDocumentCapture.mDelegate.VDDocumentCutCaptured(byteArrayInputStream, vDCaptureType, idsToEnumList);
                                    VDDocumentCapture.mDelegate.VDDocumentCutCaptured(bArrFileToByteArray, vDCaptureType, idsToVDDocumentList);
                                } else {
                                    VDDocumentCapture.mDelegate.VDDocumentCaptured(byteArrayInputStream, vDCaptureType, idsToEnumList);
                                    VDDocumentCapture.mDelegate.VDDocumentCaptured(bArrFileToByteArray, vDCaptureType, idsToVDDocumentList);
                                }
                            }
                            break;
                        } catch (IOException e5) {
                            Log.e(VDDocumentCapture.TAG, e5);
                        }
                        return;
                    } finally {
                        Util.deleteRecursive(file);
                    }
                case "com.veridas.documentCapture.documentClassificationActivity.timeWithoutCapture":
                    VDDocumentCapture.mDelegate.VDTimeWithoutPhotoTaken(intent.getIntExtra(DocumentClassificationActivity.SECONDS, 0), (VDEnums.VDCaptureType) intent.getSerializableExtra(DocumentClassificationActivity.TYPE));
                    return;
                default:
                    return;
            }
        }
    }

    private VDDocumentCapture() {
    }

    private static void cleanPrivateVariables() {
        mDelegate = null;
        receiver = null;
        List<String> list = mDocuments;
        if (list != null) {
            try {
                list.clear();
            } catch (UnsupportedOperationException unused) {
            }
            mDocuments = null;
        }
    }

    private static BroadcastReceiver createBroadcastReceiver(Configuration configuration) {
        return new a(configuration);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void finishSdk(Context context, boolean z10) {
        if (started.getAndSet(false)) {
            if (receiver != null) {
                VeridasPackageBroadcastHelper.INSTANCE.unregister(context, receiver);
            }
            VDLogger.log(Logger.Tag.FINISH_SDK, "Successfully: %b", Boolean.valueOf(z10));
            VDLogger.endSession(z10);
            mDelegate.VDDocumentCaptureFinished(z10);
            cleanPrivateVariables();
        }
    }

    public static ArrayList<String> getConfigurationKeys(Context context) {
        return new VDDocumentConfiguration(context.getResources()).getKeys();
    }

    public static Map<String, List<String>> getCountryDocuments(Context context) {
        CommonLibraryDepInjector.warmup(context);
        return CommonLibraryDepInjector.getBlockingResourcesDatabase(context).getDocumentIdsByCountryMap();
    }

    public static String getVersion() {
        return BuildConfig.VERSION_NAME;
    }

    public static boolean isStarted() {
        return started.get();
    }

    private static void registerReceivers(Context context) {
        VeridasPackageBroadcastHelper.INSTANCE.register(context, receiver, RECEIVER_LIST);
    }

    @Deprecated
    public static void start(@NonNull IVDDocumentCapture iVDDocumentCapture, @NonNull Context context, @NonNull List<VDEnums.VDDocumentType> list) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        startWithDocumentIDs(iVDDocumentCapture, context, DocumentUtils.parseEnumToIdlist(list), null);
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

    public static void startWithDocumentIDs(@NonNull IVDDocumentCapture iVDDocumentCapture, @NonNull Context context, List<String> list, Map<String, String> map) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        if (iVDDocumentCapture == null) {
            throw new NullPointerException("Delegate must not be null");
        }
        if (context == null) {
            throw new NullPointerException("Context must not be null");
        }
        if (list == null || list.isEmpty()) {
            throw new NullPointerException("Documents list must not be null or empty");
        }
        mDelegate = iVDDocumentCapture;
        if (started.getAndSet(true)) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        CommonLibraryDepInjector.warmup(applicationContext);
        VDDocumentConfiguration vDDocumentConfiguration = new VDDocumentConfiguration(applicationContext.getResources());
        if (map != null) {
            vDDocumentConfiguration.load(map);
        }
        startLogger(applicationContext, vDDocumentConfiguration);
        mDocuments = DocumentUtils.filterDocumentsThatMustBePassedAlone(list, CommonLibraryDepInjector.getBlockingResourcesDatabase(applicationContext));
        receiver = createBroadcastReceiver(vDDocumentConfiguration);
        registerReceivers(applicationContext);
        try {
            if (vDDocumentConfiguration.getBoolean("showtutorial")) {
                DocumentCaptureTutorialActivity.start(applicationContext, vDDocumentConfiguration);
            } else {
                DocumentClassificationActivity.start(applicationContext, vDDocumentConfiguration, mDocuments);
            }
        } catch (PropertyNameNotFoundException e5) {
            Log.e(TAG, e5);
        }
    }

    public static void stop(@NonNull Context context) {
        if (isStarted()) {
            VeridasPackageBroadcastHelper.INSTANCE.send(context, new Intent(FORCE_STOP));
            finishSdk(context, false);
        }
    }

    @Deprecated
    public static void start(@NonNull IVDDocumentCapture iVDDocumentCapture, @NonNull Context context, @NonNull List<VDEnums.VDDocumentType> list, Map<String, String> map) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        startWithDocumentIDs(iVDDocumentCapture, context, DocumentUtils.parseEnumToIdlist(list), map);
    }
}
