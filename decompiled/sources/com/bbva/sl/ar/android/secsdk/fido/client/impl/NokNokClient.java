package com.bbva.sl.ar.android.secsdk.fido.client.impl;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.g;
import com.bbva.sl.ar.android.secsdk.fido.BiometricCapability;
import com.bbva.sl.ar.android.secsdk.fido.client.FidoSdkClient;
import com.bbva.sl.ar.android.secsdk.fido.client.Operation;
import com.bbva.sl.ar.android.secsdk.fido.client.Protocol;
import com.bbva.sl.ar.android.secsdk.fido.error.FidoError;
import com.bbva.sl.ar.android.secsdk.fido.exception.FidoException;
import com.bbva.sl.ar.android.secsdk.fido.model.DiscoverData;
import com.bbva.sl.ar.android.secsdk.fido.model.FidoSession;
import com.bbva.sl.ar.android.secsdk.fido.tools.EtherTimeProviderManager;
import com.bbva.sl.ar.android.secsdk.fido.tools.QuickAuthManager;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.noknok.android.client.appsdk.AppSDK2;
import com.noknok.android.client.appsdk.AppSDKException;
import com.noknok.android.client.appsdk.AppSDKFactory;
import com.noknok.android.client.appsdk.ExtensionList;
import com.noknok.android.client.appsdk.IAppSDK;
import com.noknok.android.client.appsdk.ProtocolType;
import com.noknok.android.client.appsdk.ResultType;
import com.noknok.android.client.appsdk.jsonapi.QuickData;
import com.noknok.android.client.extension.ExtensionManager;
import com.noknok.android.client.utils.TimeProviderManager;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class NokNokClient implements FidoSdkClient {
    private static final String ANDROID_APK_ID_PREFIX = "android:apk-key-hash:";
    private static final String EXTENSION_PROPERTY_CONFIRMATION_REQUIRED = "confirmationRequired";
    private static final String TAG = "NokNokClient";
    private static final String cid_pubkey = "cid_pubkey";
    private static final String serverEndPoint = "serverEndPoint";
    private static final String tlsServerCertificate = "tlsServerCertificate";
    private static final String tlsUnique = "tlsUnique";
    private final Context context;
    private boolean isQuickAuthEnabled;
    private AppSDK2 mAppSDK2;
    private final QuickAuthManager quickAuthManager;
    private final EtherTimeProviderManager timeProviderManager = new EtherTimeProviderManager();

    /* JADX INFO: renamed from: com.bbva.sl.ar.android.secsdk.fido.client.impl.NokNokClient$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$bbva$sl$ar$android$secsdk$fido$client$Operation;
        static final /* synthetic */ int[] $SwitchMap$com$bbva$sl$ar$android$secsdk$fido$client$Protocol;
        static final /* synthetic */ int[] $SwitchMap$com$noknok$android$client$appsdk$AppSDK2$Operation;

        static {
            int[] iArr = new int[AppSDK2.Operation.values().length];
            $SwitchMap$com$noknok$android$client$appsdk$AppSDK2$Operation = iArr;
            try {
                iArr[AppSDK2.Operation.REG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$noknok$android$client$appsdk$AppSDK2$Operation[AppSDK2.Operation.AUTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$noknok$android$client$appsdk$AppSDK2$Operation[AppSDK2.Operation.DELETE_REG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[Operation.values().length];
            $SwitchMap$com$bbva$sl$ar$android$secsdk$fido$client$Operation = iArr2;
            try {
                iArr2[Operation.REG.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$bbva$sl$ar$android$secsdk$fido$client$Operation[Operation.OOB_REG.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$bbva$sl$ar$android$secsdk$fido$client$Operation[Operation.AUTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$bbva$sl$ar$android$secsdk$fido$client$Operation[Operation.OOB_AUTH.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$bbva$sl$ar$android$secsdk$fido$client$Operation[Operation.DEL_REG.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr3 = new int[Protocol.values().length];
            $SwitchMap$com$bbva$sl$ar$android$secsdk$fido$client$Protocol = iArr3;
            try {
                iArr3[Protocol.UAF.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public NokNokClient(Context context) {
        this.context = context;
        this.quickAuthManager = new QuickAuthManager(context, this);
    }

    @TargetApi(28)
    private String getApkCertificateDigestsAndroidP() throws FidoException {
        try {
            PackageInfo packageInfo = this.context.getPackageManager().getPackageInfo(this.context.getPackageName(), 134217728);
            Signature[] apkContentsSigners = packageInfo.signingInfo.hasMultipleSigners() ? packageInfo.signingInfo.getApkContentsSigners() : packageInfo.signingInfo.getSigningCertificateHistory();
            if (apkContentsSigners == null || apkContentsSigners.length < 1) {
                throw new FidoException.Builder(FidoError.CLIENT_APPID_EXTRACTION).build();
            }
            try {
                Signature signature = apkContentsSigners[0];
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                messageDigest.update(signature.toByteArray());
                return ANDROID_APK_ID_PREFIX.concat(new String(Base64.encode(messageDigest.digest(), 3)));
            } catch (NoSuchAlgorithmException e5) {
                throw new FidoException.Builder(FidoError.CLIENT_APPID_EXTRACTION).cause(e5).build();
            }
        } catch (PackageManager.NameNotFoundException e7) {
            throw new FidoException.Builder(FidoError.CLIENT_APPID_EXTRACTION).cause(e7).build();
        }
    }

    @TargetApi(26)
    private String getApkCertificateDigestsAndroidUnderP() throws FidoException {
        try {
            Signature[] signatureArr = this.context.getPackageManager().getPackageInfo(this.context.getPackageName(), 64).signatures;
            if (signatureArr.length <= 0) {
                throw new FidoException.Builder(FidoError.CLIENT_APPID_EXTRACTION).build();
            }
            Signature signature = signatureArr[0];
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(signature.toByteArray());
            return ANDROID_APK_ID_PREFIX.concat(new String(Base64.encode(messageDigest.digest(), 3)));
        } catch (Exception unused) {
            throw new FidoException.Builder(FidoError.CLIENT_APPID_EXTRACTION).build();
        }
    }

    private Map<String, String> getChannelBindings() {
        HashMap map = new HashMap();
        map.put(serverEndPoint, null);
        map.put(tlsServerCertificate, null);
        map.put("cid_pubkey", null);
        map.put(tlsUnique, null);
        return map;
    }

    private DiscoverData getDiscoverData(Activity activity) {
        return (DiscoverData) new Gson().fromJson(this.mAppSDK2.discover(activity).toString(), DiscoverData.class);
    }

    private ExtensionList getExtensions(boolean z10) {
        ExtensionList extensionList = new ExtensionList();
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty(EXTENSION_PROPERTY_CONFIRMATION_REQUIRED, Boolean.valueOf(z10));
        extensionList.addExtension(ExtensionManager.BIOMETRIC_OPTIONS_EXT_ID, jsonObject.toString(), false);
        return extensionList;
    }

    @Nullable
    private static ProtocolType map(Protocol protocol) {
        if (AnonymousClass1.$SwitchMap$com$bbva$sl$ar$android$secsdk$fido$client$Protocol[protocol.ordinal()] != 1) {
            return null;
        }
        return ProtocolType.UAF;
    }

    private boolean processCheckAuthPossibleResponse(ResultType resultType) {
        return resultType == ResultType.SUCCESS;
    }

    @Override // com.bbva.sl.ar.android.secsdk.fido.client.FidoSdkClient
    public boolean checkAuthPossible(Activity activity, String str, String str2) {
        return (str2 == null || str2.isEmpty()) ? processCheckAuthPossibleResponse(this.mAppSDK2.checkAuthPossible(activity, str)) : processCheckAuthPossibleResponse(this.mAppSDK2.checkAuthPossible(activity, str, str2));
    }

    @Override // com.bbva.sl.ar.android.secsdk.fido.client.FidoSdkClient
    public void clearLocalRegistrations(Activity activity, String str, String str2) {
        this.mAppSDK2.clearLocalRegistrations(activity, str, str2);
    }

    @Override // com.bbva.sl.ar.android.secsdk.fido.client.FidoSdkClient
    public Set<BiometricCapability> getBiometricCapabilities(@NonNull Activity activity) {
        HashSet hashSet = new HashSet();
        DiscoverData discoverData = getDiscoverData(activity);
        BiometricCapability biometricCapability = BiometricCapability.BIOMETRIC_STRONG;
        if (discoverData.contains(biometricCapability)) {
            hashSet.add(biometricCapability);
        }
        BiometricCapability biometricCapability2 = BiometricCapability.BIOMETRIC_WEAK;
        if (discoverData.contains(biometricCapability2)) {
            hashSet.add(biometricCapability2);
        }
        return hashSet;
    }

    @Override // com.bbva.sl.ar.android.secsdk.fido.client.FidoSdkClient
    public DiscoverData getCapabilities(@NonNull Activity activity) {
        return getDiscoverData(activity);
    }

    @Override // com.bbva.sl.ar.android.secsdk.fido.client.FidoSdkClient
    public String getDeviceId() {
        return this.mAppSDK2.getDeviceId();
    }

    @Override // com.bbva.sl.ar.android.secsdk.fido.client.FidoSdkClient
    public String getFacetId() throws FidoException {
        return Build.VERSION.SDK_INT >= 28 ? getApkCertificateDigestsAndroidP() : getApkCertificateDigestsAndroidUnderP();
    }

    @Override // com.bbva.sl.ar.android.secsdk.fido.client.FidoSdkClient
    public void initClient(Protocol protocol) throws FidoException {
        ProtocolType map;
        if (this.mAppSDK2 == null && (map = map(protocol)) != null) {
            IAppSDK iAppSDKCreateInstance = AppSDKFactory.createInstance(map, this.context);
            if (iAppSDKCreateInstance == null) {
                throw new FidoException.Builder(FidoError.CLIENT_INITIALIZATION).errorInfo("Failed for protocol " + map.name()).build().log(TAG);
            }
            ResultType resultTypeInit = iAppSDKCreateInstance.init(this.context);
            if (resultTypeInit == ResultType.ALREADY_INITIALIZED) {
                return;
            }
            if (resultTypeInit != ResultType.SUCCESS) {
                throw new FidoException.Builder(FidoError.CLIENT_INITIALIZATION).sdkClientCode(resultTypeInit.name()).errorInfo("Failed for context " + this.context).build().log(TAG);
            }
            this.mAppSDK2 = new AppSDK2(this.context, map);
            EtherTimeProviderManager etherTimeProviderManager = this.timeProviderManager;
            Objects.requireNonNull(etherTimeProviderManager);
            TimeProviderManager.setInstance(new g(etherTimeProviderManager));
        }
    }

    @Override // com.bbva.sl.ar.android.secsdk.fido.client.FidoSdkClient
    public String initOperation(Activity activity, Operation operation, boolean z10, @Nullable String str) throws FidoException {
        AppSDK2.RPData rPData = new AppSDK2.RPData();
        rPData.setCallerActivity(activity);
        rPData.checkPolicy = z10;
        rPData.OOBData = str;
        try {
            AppSDK2.ResponseData responseDataInitOperation = this.mAppSDK2.initOperation(map(operation), rPData);
            String str2 = TAG;
            Objects.toString(responseDataInitOperation.status);
            if (responseDataInitOperation.status == ResultType.SUCCESS) {
                return responseDataInitOperation.message;
            }
            throw new FidoException.Builder(FidoError.CLIENT_INIT_OPERATION).operation(operation).sdkClientCode(responseDataInitOperation.status.name()).errorInfo(responseDataInitOperation.message + ": " + responseDataInitOperation.additionalData).build().log(str2);
        } catch (AppSDKException e5) {
            throw new FidoException.Builder(FidoError.CLIENT_INIT_OPERATION).operation(operation).sdkClientCode(e5.getResultType().name()).cause(e5).build().log(TAG).print();
        } catch (Exception e7) {
            throw new FidoException.Builder(FidoError.CLIENT_INIT_OPERATION).operation(operation).errorInfo(e7.getClass().getSimpleName()).cause(e7).build().log(TAG).print();
        }
    }

    @Override // com.bbva.sl.ar.android.secsdk.fido.client.FidoSdkClient
    public String process(Activity activity, Operation operation, String str, boolean z10, boolean z11, @Nullable String str2, @Nullable FidoSession fidoSession) throws Throwable {
        boolean z12 = false;
        boolean z13 = (operation == Operation.REG || operation == Operation.OOB_REG) && this.isQuickAuthEnabled;
        boolean z14 = (operation == Operation.AUTH || operation == Operation.OOB_AUTH) && this.isQuickAuthEnabled;
        String quickAuth = fidoSession != null ? this.quickAuthManager.getQuickAuth(fidoSession) : null;
        if (quickAuth != null && !quickAuth.isEmpty()) {
            z12 = true;
        }
        try {
            AppSDK2.RPData rPData = new AppSDK2.RPData();
            rPData.setCallerActivity(activity);
            rPData.checkPolicy = z10;
            rPData.channelBindings = getChannelBindings();
            rPData.extensions = getExtensions(z11);
            rPData.OOBData = str2;
            if (z14 && z12) {
                rPData.quickData = QuickData.fromJson(quickAuth);
            } else if ((z13 || z14) && !z12) {
                rPData.quickData = new QuickData();
            }
            AppSDK2.ResponseData responseDataProcess = this.mAppSDK2.process(rPData, str);
            String str3 = TAG;
            Objects.toString(responseDataProcess.status);
            if (responseDataProcess.status == ResultType.SUCCESS) {
                return responseDataProcess.message;
            }
            throw new FidoException.Builder(FidoError.CLIENT_PROCESS_OPERATION).operation(operation).sdkClientCode(responseDataProcess.status.name()).errorInfo(responseDataProcess.message + ": " + responseDataProcess.additionalData).processMessage(str).build().log(str3);
        } catch (AppSDKException e5) {
            throw new FidoException.Builder(FidoError.CLIENT_PROCESS_OPERATION).operation(operation).sdkClientCode(e5.getResultType().name()).errorInfo(e5.getResultType().getMessage(activity)).processMessage(str).cause(e5).build().log(TAG).print();
        } catch (Exception e7) {
            throw new FidoException.Builder(FidoError.CLIENT_PROCESS_OPERATION).operation(operation).errorInfo(e7.getClass().getSimpleName()).processMessage(str).cause(e7).build().log(TAG).print();
        }
    }

    @Override // com.bbva.sl.ar.android.secsdk.fido.client.FidoSdkClient
    public void processQuickAuth(Operation operation, String str, FidoSession fidoSession) {
        String strFromServer;
        boolean z10 = false;
        boolean z11 = (operation == Operation.REG || operation == Operation.OOB_REG) && this.isQuickAuthEnabled;
        if ((operation == Operation.AUTH || operation == Operation.OOB_AUTH) && this.isQuickAuthEnabled) {
            z10 = true;
        }
        if ((!z11 && !z10) || (strFromServer = QuickData.fromServer(str, this.context)) == null || strFromServer.isEmpty()) {
            return;
        }
        this.quickAuthManager.setQuickAuth(fidoSession, strFromServer);
    }

    @Override // com.bbva.sl.ar.android.secsdk.fido.client.FidoSdkClient
    public void setQuickAuthEnabled(boolean z10) {
        this.isQuickAuthEnabled = z10;
    }

    private static AppSDK2.Operation map(Operation operation) throws FidoException {
        int i10 = AnonymousClass1.$SwitchMap$com$bbva$sl$ar$android$secsdk$fido$client$Operation[operation.ordinal()];
        if (i10 == 1) {
            return AppSDK2.Operation.REG;
        }
        if (i10 == 2) {
            return AppSDK2.Operation.OOB_REG;
        }
        if (i10 == 3) {
            return AppSDK2.Operation.AUTH;
        }
        if (i10 == 4) {
            return AppSDK2.Operation.OOB_AUTH;
        }
        if (i10 == 5) {
            return AppSDK2.Operation.DELETE_REG;
        }
        throw new FidoException.Builder(FidoError.CLIENT_INIT_OPERATION).operation(operation).errorInfo("Should not manually init this kind of operation").build();
    }

    private static Operation map(AppSDK2.Operation operation) {
        int i10 = AnonymousClass1.$SwitchMap$com$noknok$android$client$appsdk$AppSDK2$Operation[operation.ordinal()];
        if (i10 == 1) {
            return Operation.REG;
        }
        if (i10 == 2) {
            return Operation.AUTH;
        }
        if (i10 != 3) {
            return null;
        }
        return Operation.DEL_REG;
    }
}
