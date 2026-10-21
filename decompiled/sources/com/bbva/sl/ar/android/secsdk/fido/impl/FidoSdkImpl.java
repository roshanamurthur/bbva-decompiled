package com.bbva.sl.ar.android.secsdk.fido.impl;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.bbva.sl.ar.android.secsdk.fido.FidoNetworkManager;
import com.bbva.sl.ar.android.secsdk.fido.FidoSdk;
import com.bbva.sl.ar.android.secsdk.fido.cache.FidoPayloadManager;
import com.bbva.sl.ar.android.secsdk.fido.client.FidoSdkClient;
import com.bbva.sl.ar.android.secsdk.fido.client.Operation;
import com.bbva.sl.ar.android.secsdk.fido.client.Protocol;
import com.bbva.sl.ar.android.secsdk.fido.client.impl.NokNokClient;
import com.bbva.sl.ar.android.secsdk.fido.error.FidoError;
import com.bbva.sl.ar.android.secsdk.fido.exception.FidoException;
import com.bbva.sl.ar.android.secsdk.fido.model.AuthenticateBundle;
import com.bbva.sl.ar.android.secsdk.fido.model.DeleteOperationType;
import com.bbva.sl.ar.android.secsdk.fido.model.FidoAttributes;
import com.bbva.sl.ar.android.secsdk.fido.model.FidoAuthenticator;
import com.bbva.sl.ar.android.secsdk.fido.model.FidoAuthenticatorType;
import com.bbva.sl.ar.android.secsdk.fido.model.FidoDevice;
import com.bbva.sl.ar.android.secsdk.fido.model.FidoPayload;
import com.bbva.sl.ar.android.secsdk.fido.model.FidoQuickAuthData;
import com.bbva.sl.ar.android.secsdk.fido.model.FidoResult;
import com.bbva.sl.ar.android.secsdk.fido.model.FidoSession;
import com.bbva.sl.ar.android.secsdk.fido.model.FidoTransaction;
import com.bbva.sl.ar.android.secsdk.fido.model.QuickData;
import com.bbva.sl.ar.android.secsdk.fido.model.RegisterAuthenticatorBundle;
import com.bbva.sl.ar.android.secsdk.fido.tools.FidoConfig;
import com.bbva.sl.ar.android.secsdk.fido.tools.QuickAuthManager;
import com.bbva.sl.ar.android.secsdk.fido.ui.FidoSelectionUIHandler;
import com.bbva.sl.ar.android.secsdk.fido.ui.FidoTransactionUIHandler;
import com.google.gson.Gson;
import com.noknok.android.client.appsdk.AsmSelectionUI;
import com.noknok.android.client.appsdk.AsmSelectionUIFactory;
import com.noknok.android.client.utils.ITransactionUI;
import com.noknok.android.client.utils.TransactionUIFactory;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes8.dex */
public class FidoSdkImpl implements FidoSdk, FidoNetworkManager.FidoNetworkRegisterCallback, FidoNetworkManager.OobRegisterCallback, FidoNetworkManager.FidoNetworkAuthenticateCallback, FidoNetworkManager.OobAuthenticateCallback {
    private static final String TAG = "FidoSdkImpl";
    private FidoPayloadManager authPayloadManager;
    private AuthenticateBundle authenticateBundle;
    private Handler authenticateCallingHandler;
    private Handler deleteCallingHandler;
    private final ExecutorService executor = Executors.newSingleThreadExecutor();
    private String externalDeviceId;
    private String facetsUrl;
    private final FidoSdkClient fidoSdkClient;
    private Handler listingCallingHandler;
    private final FidoNetworkManager networkManager;
    private boolean nkSdkInitialized;
    private boolean quickAuthEnabled;
    private final QuickAuthManager quickAuthManager;
    private RegisterAuthenticatorBundle registerAuthenticatorBundle;
    private Handler registerCallingHandler;
    private Handler signCallingHandler;

    /* JADX INFO: renamed from: com.bbva.sl.ar.android.secsdk.fido.impl.FidoSdkImpl$43, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass43 {
        static final /* synthetic */ int[] $SwitchMap$com$bbva$sl$ar$android$secsdk$fido$model$DeleteOperationType;

        static {
            int[] iArr = new int[DeleteOperationType.values().length];
            $SwitchMap$com$bbva$sl$ar$android$secsdk$fido$model$DeleteOperationType = iArr;
            try {
                iArr[DeleteOperationType.DELETE_ONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$bbva$sl$ar$android$secsdk$fido$model$DeleteOperationType[DeleteOperationType.DELETE_ALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$bbva$sl$ar$android$secsdk$fido$model$DeleteOperationType[DeleteOperationType.DELETE_ALL_IN_A_DEVICE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public FidoSdkImpl(@NonNull Context context, @NonNull FidoNetworkManager fidoNetworkManager, String str, Integer num) throws FidoException {
        if (context == null) {
            throw new FidoException.Builder(FidoError.SDK_SETUP).errorInfo("Context can not be null").build().log(TAG);
        }
        if (fidoNetworkManager == null) {
            throw new FidoException.Builder(FidoError.SDK_SETUP).errorInfo("FidoNetworkManager can not be null").build().log(TAG);
        }
        this.networkManager = fidoNetworkManager;
        HashMap map = new HashMap();
        map.put("tenant", str);
        map.put("selectionTimeout", num);
        FidoConfig.setProperties(map);
        NokNokClient nokNokClient = new NokNokClient(context);
        this.fidoSdkClient = nokNokClient;
        this.quickAuthManager = new QuickAuthManager(context, nokNokClient);
        this.nkSdkInitialized = false;
        initializeCache();
    }

    private void applyValidations(@Nullable Activity activity, Operation operation, FidoSession fidoSession, FidoError fidoError) throws FidoException {
        validateInitialize(operation);
        if (isActivityRequired(operation)) {
            validateActivity(activity, operation, fidoError);
        }
        validateSessionData(operation, fidoSession);
        validateNonUIThread(operation);
    }

    private void callAuthenticateCallback(@NonNull final FidoSdk.FidoAuthenticateCallback fidoAuthenticateCallback, @NonNull final FidoSession fidoSession) {
        if (fidoAuthenticateCallback == null) {
            return;
        }
        this.authenticateCallingHandler.post(new Runnable() { // from class: com.bbva.sl.ar.android.secsdk.fido.impl.FidoSdkImpl.19
            @Override // java.lang.Runnable
            public void run() {
                fidoAuthenticateCallback.authenticateCompleted(fidoSession);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void callCheckAuthenticateCallback(@NonNull final FidoSdk.FidoCheckAuthenticateCallback fidoCheckAuthenticateCallback, @NonNull final FidoSession fidoSession, final boolean z10) {
        this.authenticateCallingHandler.post(new Runnable() { // from class: com.bbva.sl.ar.android.secsdk.fido.impl.FidoSdkImpl.17
            @Override // java.lang.Runnable
            public void run() {
                fidoCheckAuthenticateCallback.checkCompleted(fidoSession, z10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void callCheckRegisterCallback(@NonNull final FidoSdk.FidoCheckRegisterCallback fidoCheckRegisterCallback, @NonNull final FidoSession fidoSession, final boolean z10) {
        this.registerCallingHandler.post(new Runnable() { // from class: com.bbva.sl.ar.android.secsdk.fido.impl.FidoSdkImpl.5
            @Override // java.lang.Runnable
            public void run() {
                fidoCheckRegisterCallback.checkCompleted(fidoSession, z10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void callDeleteCallback(@NonNull final FidoSdk.FidoDeleteCallback fidoDeleteCallback, @NonNull final FidoSession fidoSession, @NonNull final String str) {
        this.deleteCallingHandler.post(new Runnable() { // from class: com.bbva.sl.ar.android.secsdk.fido.impl.FidoSdkImpl.31
            @Override // java.lang.Runnable
            public void run() {
                fidoDeleteCallback.deleteOneCompleted(fidoSession, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void callListingCallback(@NonNull final FidoSdk.FidoListingCallback fidoListingCallback, @NonNull final FidoSession fidoSession, final List<FidoDevice> list, boolean z10) {
        if (z10) {
            fidoListingCallback.listingCompleted(fidoSession, list);
        } else {
            this.listingCallingHandler.post(new Runnable() { // from class: com.bbva.sl.ar.android.secsdk.fido.impl.FidoSdkImpl.13
                @Override // java.lang.Runnable
                public void run() {
                    fidoListingCallback.listingCompleted(fidoSession, list);
                }
            });
        }
    }

    private void callRegisterCallback(@NonNull final FidoSdk.FidoRegisterCallback fidoRegisterCallback, @NonNull final FidoSession fidoSession) {
        if (fidoRegisterCallback == null) {
            return;
        }
        this.registerCallingHandler.post(new Runnable() { // from class: com.bbva.sl.ar.android.secsdk.fido.impl.FidoSdkImpl.7
            @Override // java.lang.Runnable
            public void run() {
                fidoRegisterCallback.registerCompleted(fidoSession);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void callSignCallback(@NonNull final FidoSdk.FidoSignCallback fidoSignCallback, @NonNull final FidoSession fidoSession) {
        this.signCallingHandler.post(new Runnable() { // from class: com.bbva.sl.ar.android.secsdk.fido.impl.FidoSdkImpl.26
            @Override // java.lang.Runnable
            public void run() {
                fidoSignCallback.signCompleted(fidoSession);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkAuthenticateOp(@Nullable Activity activity, @NonNull FidoSession fidoSession, FidoSdk.FidoCheckAuthenticateCallback fidoCheckAuthenticateCallback) throws FidoException {
        applyValidations(activity, Operation.AUTH, fidoSession, FidoError.SDK_AUTHENTICATE_OPERATION);
        doCheckAuthentication(activity, fidoSession, fidoCheckAuthenticateCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkRegisterOp(@Nullable Activity activity, @NonNull FidoSession fidoSession, FidoSdk.FidoCheckRegisterCallback fidoCheckRegisterCallback) throws FidoException {
        applyValidations(activity, Operation.REG, fidoSession, FidoError.SDK_REGISTER_OPERATION);
        doCheckRegister(activity, fidoSession, fidoCheckRegisterCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAuthenticateBundle() {
        AuthenticateBundle authenticateBundle = this.authenticateBundle;
        if (authenticateBundle != null) {
            authenticateBundle.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLocalAllAuthenticators(@NonNull Activity activity, @NonNull String str) throws FidoException {
        clearLocalAuthenticators(activity, str, null);
    }

    private void clearLocalAuthenticators(@NonNull Activity activity, @NonNull String str, String str2) throws FidoException {
        if (str == null) {
            throw new FidoException.Builder(str2 == null ? FidoError.SDK_DELETE_ALL_OPERATION : FidoError.SDK_DELETE_ONE_OPERATION).operation(Operation.DEL_REG).errorInfo("App Id can not be null or empty").build().log(TAG);
        }
        validateNonUIThread(Operation.DEL_REG);
        this.fidoSdkClient.clearLocalRegistrations(activity, str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLocalOneAuthenticator(@NonNull Activity activity, @NonNull String str, @NonNull String str2) throws FidoException {
        clearLocalAuthenticators(activity, str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRegisterAuthenticatorBundle() {
        RegisterAuthenticatorBundle registerAuthenticatorBundle = this.registerAuthenticatorBundle;
        if (registerAuthenticatorBundle != null) {
            registerAuthenticatorBundle.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void deleteAllOp(@Nullable String str, @NonNull Activity activity, @NonNull FidoSession fidoSession, DeleteOperationType deleteOperationType, FidoSdk.FidoDeleteCallback fidoDeleteCallback) throws FidoException {
        applyValidations(activity, Operation.DEL_REG, fidoSession, FidoError.SDK_DELETE_ALL_OPERATION);
        doDelete(activity, fidoSession, null, str, deleteOperationType, fidoDeleteCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void deleteOp(@NonNull Activity activity, @NonNull FidoSession fidoSession, @NonNull String str, String str2, FidoSdk.FidoDeleteCallback fidoDeleteCallback) throws FidoException {
        Operation operation = Operation.DEL_REG;
        FidoError fidoError = FidoError.SDK_DELETE_ONE_OPERATION;
        applyValidations(activity, operation, fidoSession, fidoError);
        if (str == null || str.isEmpty()) {
            throw new FidoException.Builder(fidoError).operation(operation).errorInfo("FidoAuthenticator Handle can not be null or empty").build().log(TAG);
        }
        doDelete(activity, fidoSession, str, str2, DeleteOperationType.DELETE_ONE, fidoDeleteCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doAuthentication(@Nullable Activity activity, @NonNull Operation operation, @NonNull FidoSession fidoSession, @Nullable String str, FidoSdk.FidoAuthenticateCallback fidoAuthenticateCallback, boolean z10) throws FidoException {
        applyValidations(activity, operation, fidoSession, FidoError.SDK_AUTHENTICATE_OPERATION);
        String quickAuth = this.quickAuthManager.getQuickAuth(fidoSession);
        boolean z11 = (quickAuth == null || quickAuth.isEmpty()) ? false : true;
        this.authenticateBundle = new AuthenticateBundle(activity, fidoSession, z10, str, fidoAuthenticateCallback);
        if (this.authPayloadManager.isCachedPayloadValid(fidoSession)) {
            didInitAuthentication(new FidoResult(this.authPayloadManager.get()));
            return;
        }
        if (this.quickAuthEnabled && z11 && operation == Operation.AUTH) {
            didInitAuthentication(new FidoResult(getFidoPayload(fidoSession, "")));
            return;
        }
        String strInitOperation = this.fidoSdkClient.initOperation(activity, operation, false, str);
        Objects.toString(operation);
        FidoPayload fidoPayload = getFidoPayload(fidoSession, strInitOperation);
        if (operation == Operation.AUTH) {
            this.networkManager.initAuthentication(fidoPayload, this);
        } else if (operation == Operation.OOB_AUTH) {
            this.networkManager.initOobAuthentication(fidoPayload, this);
        }
    }

    private void doCheckAuthentication(@Nullable final Activity activity, @NonNull final FidoSession fidoSession, @NonNull final FidoSdk.FidoCheckAuthenticateCallback fidoCheckAuthenticateCallback) throws FidoException {
        this.networkManager.initAuthentication(getFidoPayload(fidoSession, this.fidoSdkClient.initOperation(activity, Operation.AUTH, true, null)), new FidoNetworkManager.FidoNetworkAuthenticateCallback() { // from class: com.bbva.sl.ar.android.secsdk.fido.impl.FidoSdkImpl.25
            @Override // com.bbva.sl.ar.android.secsdk.fido.FidoNetworkManager.FidoNetworkAuthenticateCallback
            public void didInitAuthentication(FidoResult fidoResult) {
                if (!fidoResult.isSuccess()) {
                    FidoSdkImpl.this.processException(activity, Operation.AUTH, fidoResult.getFidoException());
                    FidoSdkImpl.this.callCheckAuthenticateCallback(fidoCheckAuthenticateCallback, fidoSession, fidoResult.getFidoException());
                    return;
                }
                try {
                    fidoResult.getMessage();
                    FidoSdkImpl.this.fidoSdkClient.process(activity, Operation.AUTH, fidoResult.getMessage(), true, false, null, fidoSession);
                    FidoSdkImpl.this.authPayloadManager.put(fidoResult.getFidoPayload());
                    FidoSdkImpl.this.callCheckAuthenticateCallback(fidoCheckAuthenticateCallback, fidoSession, true);
                } catch (FidoException unused) {
                    FidoSdkImpl.this.callCheckAuthenticateCallback(fidoCheckAuthenticateCallback, fidoSession, false);
                }
            }

            @Override // com.bbva.sl.ar.android.secsdk.fido.FidoNetworkManager.FidoNetworkAuthenticateCallback
            public void didFinishAuthentication(FidoResult fidoResult) {
            }
        });
    }

    private void doCheckRegister(@Nullable final Activity activity, @NonNull final FidoSession fidoSession, @NonNull final FidoSdk.FidoCheckRegisterCallback fidoCheckRegisterCallback) throws FidoException {
        this.networkManager.initRegistration(getFidoPayload(fidoSession, this.fidoSdkClient.initOperation(activity, Operation.REG, true, null)), new FidoNetworkManager.FidoNetworkRegisterCallback() { // from class: com.bbva.sl.ar.android.secsdk.fido.impl.FidoSdkImpl.12
            @Override // com.bbva.sl.ar.android.secsdk.fido.FidoNetworkManager.FidoNetworkRegisterCallback
            public void didInitRegistration(FidoResult fidoResult) {
                if (!fidoResult.isSuccess()) {
                    FidoSdkImpl.this.processException(activity, Operation.REG, fidoResult.getFidoException());
                    FidoSdkImpl.this.callCheckRegisterCallback(fidoCheckRegisterCallback, fidoSession, fidoResult.getFidoException());
                    return;
                }
                try {
                    fidoResult.getMessage();
                    FidoSdkImpl.this.fidoSdkClient.process(activity, Operation.REG, fidoResult.getMessage(), true, false, null, fidoSession);
                    FidoSdkImpl.this.callCheckRegisterCallback(fidoCheckRegisterCallback, fidoSession, true);
                } catch (FidoException unused) {
                    FidoSdkImpl.this.callCheckRegisterCallback(fidoCheckRegisterCallback, fidoSession, false);
                }
            }

            @Override // com.bbva.sl.ar.android.secsdk.fido.FidoNetworkManager.FidoNetworkRegisterCallback
            public void didFinishRegistration(FidoResult fidoResult) {
            }
        });
    }

    private void doDelete(@NonNull final Activity activity, @NonNull final FidoSession fidoSession, @Nullable final String str, @Nullable final String str2, DeleteOperationType deleteOperationType, final FidoSdk.FidoDeleteCallback fidoDeleteCallback) throws FidoException {
        FidoPayload fidoPayload = getFidoPayload(fidoSession, this.fidoSdkClient.initOperation(activity, Operation.DEL_REG, false, null));
        FidoNetworkManager.FidoNetworkDeleteAuthenticatorsCallback fidoNetworkDeleteAuthenticatorsCallback = new FidoNetworkManager.FidoNetworkDeleteAuthenticatorsCallback() { // from class: com.bbva.sl.ar.android.secsdk.fido.impl.FidoSdkImpl.40
            @Override // com.bbva.sl.ar.android.secsdk.fido.FidoNetworkManager.FidoNetworkDeleteAuthenticatorsCallback
            public void didDelete(String str3, FidoResult fidoResult) {
                if (!fidoResult.isSuccess()) {
                    FidoSdkImpl.this.processException(activity, Operation.DEL_REG, fidoResult.getFidoException());
                    FidoSdkImpl.this.callDeleteCallback(fidoDeleteCallback, fidoSession, fidoResult.getFidoException(), str);
                    return;
                }
                FidoSdkImpl.this.quickAuthManager.deleteQuickAuth(fidoSession, DeleteOperationType.DELETE_ONE, str3);
                if (FidoSdkImpl.this.getDeviceId() != null && !FidoSdkImpl.this.getDeviceId().equals(str2)) {
                    FidoSdkImpl.this.callDeleteCallback(fidoDeleteCallback, fidoSession, str3);
                    return;
                }
                String message = fidoResult.getMessage();
                if (TextUtils.isEmpty(message)) {
                    FidoSdkImpl.this.authPayloadManager.clearCache();
                    FidoSdkImpl.this.callDeleteCallback(fidoDeleteCallback, fidoSession);
                } else {
                    try {
                        FidoSdkImpl.this.fidoSdkClient.process(activity, Operation.DEL_REG, message, false, false, null, fidoSession);
                    } catch (FidoException unused) {
                    } finally {
                        FidoSdkImpl.this.authPayloadManager.clearCache();
                        FidoSdkImpl.this.callDeleteCallback(fidoDeleteCallback, fidoSession, str3);
                    }
                }
            }

            @Override // com.bbva.sl.ar.android.secsdk.fido.FidoNetworkManager.FidoNetworkDeleteAuthenticatorsCallback
            public void didDeleteAll(FidoResult fidoResult) {
                if (!fidoResult.isSuccess()) {
                    FidoSdkImpl.this.processException(activity, Operation.DEL_REG, fidoResult.getFidoException());
                    FidoSdkImpl.this.callDeleteCallback(fidoDeleteCallback, fidoSession, fidoResult.getFidoException());
                    return;
                }
                FidoSdkImpl.this.quickAuthManager.deleteQuickAuth(fidoSession, DeleteOperationType.DELETE_ALL, null);
                if (FidoSdkImpl.this.getDeviceId() != null && !FidoSdkImpl.this.getDeviceId().equals(str2)) {
                    FidoSdkImpl.this.callDeleteCallback(fidoDeleteCallback, fidoSession);
                    return;
                }
                String message = fidoResult.getMessage();
                if (TextUtils.isEmpty(message)) {
                    FidoSdkImpl.this.authPayloadManager.clearCache();
                    FidoSdkImpl.this.callDeleteCallback(fidoDeleteCallback, fidoSession);
                } else {
                    try {
                        FidoSdkImpl.this.fidoSdkClient.process(activity, Operation.DEL_REG, message, false, false, null, fidoSession);
                    } catch (FidoException unused) {
                    } finally {
                        FidoSdkImpl.this.authPayloadManager.clearCache();
                        FidoSdkImpl.this.callDeleteCallback(fidoDeleteCallback, fidoSession);
                    }
                }
            }
        };
        int i10 = AnonymousClass43.$SwitchMap$com$bbva$sl$ar$android$secsdk$fido$model$DeleteOperationType[deleteOperationType.ordinal()];
        if (i10 == 1) {
            this.networkManager.deleteAuthenticator(str, str2, fidoPayload, fidoNetworkDeleteAuthenticatorsCallback);
        } else if (i10 == 2) {
            this.networkManager.deleteAllAuthenticators(fidoPayload, fidoNetworkDeleteAuthenticatorsCallback);
        } else {
            if (i10 != 3) {
                return;
            }
            this.networkManager.deleteAllAuthenticatorsFromDevice(str2, fidoPayload, fidoNetworkDeleteAuthenticatorsCallback);
        }
    }

    private void doListing(@NonNull final Activity activity, @NonNull final FidoSession fidoSession, final FidoSdk.FidoListingCallback fidoListingCallback, FidoPayload fidoPayload, final boolean z10) {
        this.networkManager.listRegisteredAuthenticators(fidoPayload, new FidoNetworkManager.FidoNetworkListRegisteredAuthenticatorsCallback() { // from class: com.bbva.sl.ar.android.secsdk.fido.impl.FidoSdkImpl.16
            @Override // com.bbva.sl.ar.android.secsdk.fido.FidoNetworkManager.FidoNetworkListRegisteredAuthenticatorsCallback
            public void didListRegisteredAuthenticators(List<FidoDevice> list) {
                FidoSdkImpl.this.callListingCallback(fidoListingCallback, fidoSession, list, z10);
            }

            @Override // com.bbva.sl.ar.android.secsdk.fido.FidoNetworkManager.FidoNetworkListRegisteredAuthenticatorsCallback
            public void listRegisteredAuthenticatorsFailed(FidoException fidoException) {
                FidoSdkImpl.this.processException(activity, null, fidoException);
                FidoSdkImpl.this.callListingCallback(fidoListingCallback, fidoSession, fidoException, z10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doRegister(@Nullable Activity activity, @NonNull Operation operation, @NonNull FidoSession fidoSession, @Nullable String str, @NonNull FidoSdk.FidoRegisterCallback fidoRegisterCallback, boolean z10) throws FidoException {
        applyValidations(activity, operation, fidoSession, FidoError.SDK_REGISTER_OPERATION);
        String strInitOperation = this.fidoSdkClient.initOperation(activity, operation, false, str);
        Objects.toString(operation);
        FidoPayload fidoPayload = getFidoPayload(fidoSession, strInitOperation);
        this.registerAuthenticatorBundle = new RegisterAuthenticatorBundle(activity, fidoSession, z10, str, fidoRegisterCallback);
        if (operation == Operation.REG) {
            this.networkManager.initRegistration(fidoPayload, this);
        } else if (operation == Operation.OOB_REG) {
            this.networkManager.initOobRegistration(fidoPayload, this);
        }
    }

    private void doSign(@NonNull final Activity activity, @NonNull final FidoSession fidoSession, final FidoSdk.FidoSignCallback fidoSignCallback, FidoTransaction fidoTransaction) throws FidoException {
        final FidoPayload fidoPayload = getFidoPayload(fidoSession, this.fidoSdkClient.initOperation(activity, Operation.AUTH, false, null), fidoTransaction);
        this.networkManager.initSign(fidoPayload, new FidoNetworkManager.FidoNetworkSignCallback() { // from class: com.bbva.sl.ar.android.secsdk.fido.impl.FidoSdkImpl.30
            @Override // com.bbva.sl.ar.android.secsdk.fido.FidoNetworkManager.FidoNetworkSignCallback
            public void didFinishSign(FidoResult fidoResult) {
                if (!fidoResult.isSuccess()) {
                    FidoSdkImpl.this.processException(activity, Operation.AUTH, fidoResult.getFidoException());
                    FidoSdkImpl.this.callSignCallback(fidoSignCallback, fidoSession, fidoResult.getFidoException());
                    return;
                }
                try {
                    fidoResult.getMessage();
                    FidoSdkImpl.this.fidoSdkClient.process(activity, Operation.AUTH, fidoResult.getMessage(), false, false, null, fidoSession);
                    FidoSdkImpl.this.callSignCallback(fidoSignCallback, fidoSession);
                } catch (FidoException e5) {
                    FidoSdkImpl.this.callSignCallback(fidoSignCallback, fidoSession, e5);
                }
            }

            @Override // com.bbva.sl.ar.android.secsdk.fido.FidoNetworkManager.FidoNetworkSignCallback
            public void didInitSign(FidoResult fidoResult) {
                if (!fidoResult.isSuccess()) {
                    FidoSdkImpl.this.processException(activity, Operation.AUTH, fidoResult.getFidoException());
                    FidoSdkImpl.this.callSignCallback(fidoSignCallback, fidoSession, fidoResult.getFidoException());
                    return;
                }
                try {
                    fidoResult.getMessage();
                    FidoSdkImpl.this.networkManager.finishSign(fidoPayload.m4970clone().setMessage(FidoSdkImpl.this.fidoSdkClient.process(activity, Operation.AUTH, fidoResult.getMessage(), false, false, null, fidoSession)), this);
                } catch (FidoException e5) {
                    FidoSdkImpl.this.callSignCallback(fidoSignCallback, fidoSession, e5);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public String getBase64UrlOrEmpty(@Nullable String str) {
        return str != null ? new String(Base64.encode(str.getBytes(), 11)) : "";
    }

    private FidoPayload getFidoPayload(FidoSession fidoSession, String str) throws FidoException {
        return new FidoPayload(str, new FidoAttributes(this.fidoSdkClient.getFacetId(), this.fidoSdkClient.getDeviceId(), this.externalDeviceId), fidoSession);
    }

    private FidoException getTooManyRequestsException(Operation operation) {
        return new FidoException.Builder(FidoError.SDK_TOO_MANY_REQUESTS).operation(operation).errorInfo("SDK is already processing one " + operation + " operation.").build();
    }

    private void handleFinishAuthResult(@Nullable Activity activity, @NonNull Operation operation, @NonNull FidoResult fidoResult, @NonNull FidoSession fidoSession, boolean z10, @Nullable String str, @NonNull FidoSdk.FidoAuthenticateCallback fidoAuthenticateCallback) {
        clearAuthenticateBundle();
        if (!fidoResult.isSuccess()) {
            processException(activity, operation, fidoResult.getFidoException());
            callAuthenticateCallback(fidoAuthenticateCallback, fidoSession, fidoResult.getFidoException());
            return;
        }
        try {
            Objects.toString(operation);
            fidoResult.getMessage();
            this.fidoSdkClient.process(activity, operation, fidoResult.getMessage(), false, z10, str, fidoSession);
            this.fidoSdkClient.processQuickAuth(operation, fidoResult.getMessage(), fidoSession);
            Objects.toString(operation);
            callAuthenticateCallback(fidoAuthenticateCallback, fidoResult.getFidoPayload().getFidoSession());
        } catch (FidoException e5) {
            callAuthenticateCallback(fidoAuthenticateCallback, fidoSession, e5);
        }
    }

    private void handleFinishRegistrationResult(@Nullable Activity activity, @NonNull Operation operation, @NonNull FidoResult fidoResult, @NonNull FidoSession fidoSession, boolean z10, @Nullable String str, @NonNull FidoSdk.FidoRegisterCallback fidoRegisterCallback) {
        clearRegisterAuthenticatorBundle();
        if (!fidoResult.isSuccess()) {
            processException(activity, operation, fidoResult.getFidoException());
            callRegisterCallback(fidoRegisterCallback, fidoSession, fidoResult.getFidoException());
            return;
        }
        try {
            Objects.toString(operation);
            fidoResult.getMessage();
            this.fidoSdkClient.process(activity, operation, fidoResult.getMessage(), false, z10, str, fidoSession);
            Objects.toString(operation);
            this.fidoSdkClient.processQuickAuth(operation, fidoResult.getMessage(), fidoSession);
            callRegisterCallback(fidoRegisterCallback, fidoResult.getFidoPayload().getFidoSession());
        } catch (FidoException e5) {
            callRegisterCallback(fidoRegisterCallback, fidoSession, e5);
        }
    }

    private void handleInitAuthResult(@Nullable Activity activity, @NonNull Operation operation, @NonNull FidoResult fidoResult, @NonNull FidoSession fidoSession, boolean z10, @Nullable String str, @NonNull FidoSdk.FidoAuthenticateCallback fidoAuthenticateCallback) {
        if (!fidoResult.isSuccess()) {
            clearAuthenticateBundle();
            processException(activity, operation, fidoResult.getFidoException());
            callAuthenticateCallback(fidoAuthenticateCallback, fidoSession, fidoResult.getFidoException());
            return;
        }
        try {
            Objects.toString(operation);
            fidoResult.getMessage();
            String strProcess = this.fidoSdkClient.process(activity, operation, fidoResult.getMessage(), false, z10, str, fidoSession);
            Objects.toString(operation);
            fidoResult.getFidoPayload().setMessage(strProcess);
            String quickAuth = this.quickAuthManager.getQuickAuth(fidoSession);
            boolean z11 = (quickAuth == null || quickAuth.isEmpty()) ? false : true;
            if (this.quickAuthEnabled && z11 && operation == Operation.AUTH) {
                this.networkManager.quickAuthentication(fidoResult.getFidoPayload(), this);
            } else if (operation == Operation.AUTH) {
                this.networkManager.finishAuthentication(fidoResult.getFidoPayload(), this);
            } else {
                this.networkManager.finishOobAuthentication(fidoResult.getFidoPayload(), this);
            }
        } catch (FidoException e5) {
            clearAuthenticateBundle();
            callAuthenticateCallback(fidoAuthenticateCallback, fidoSession, e5);
        }
    }

    private void handleInitRegistrationResult(@Nullable Activity activity, @NonNull Operation operation, @NonNull FidoResult fidoResult, @NonNull FidoSession fidoSession, boolean z10, @Nullable String str, @NonNull FidoSdk.FidoRegisterCallback fidoRegisterCallback) {
        if (!fidoResult.isSuccess()) {
            clearRegisterAuthenticatorBundle();
            processException(activity, operation, fidoResult.getFidoException());
            callRegisterCallback(fidoRegisterCallback, fidoSession, fidoResult.getFidoException());
            return;
        }
        try {
            Objects.toString(operation);
            fidoResult.getMessage();
            String strProcess = this.fidoSdkClient.process(activity, operation, fidoResult.getMessage(), false, z10, str, fidoSession);
            Objects.toString(operation);
            fidoResult.getFidoPayload().setMessage(strProcess);
            if (operation == Operation.REG) {
                this.networkManager.finishRegistration(fidoResult.getFidoPayload(), this);
            } else {
                this.networkManager.finishOobRegistration(fidoResult.getFidoPayload(), this);
            }
        } catch (FidoException e5) {
            clearRegisterAuthenticatorBundle();
            callRegisterCallback(fidoRegisterCallback, fidoSession, e5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void init() throws FidoException {
        validateNonUIThread(null);
        this.fidoSdkClient.initClient(Protocol.UAF);
        this.nkSdkInitialized = true;
    }

    private void initializeCache() {
        this.authPayloadManager = new FidoPayloadManager();
    }

    private boolean isActivityRequired(Operation operation) {
        return (operation == Operation.REG || operation == Operation.OOB_REG || operation == Operation.AUTH || operation == Operation.OOB_AUTH) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$quickAuthData$0(FidoSdk.FidoQuickAuthDataCallback fidoQuickAuthDataCallback, FidoSession fidoSession) {
        if (this.fidoSdkClient == null) {
            fidoQuickAuthDataCallback.failure(new FidoException.Builder(FidoError.SDK_INITIALIZATION).build());
            return;
        }
        try {
            String quickAuth = this.quickAuthManager.getQuickAuth(fidoSession);
            if (quickAuth == null) {
                fidoQuickAuthDataCallback.success(null);
            } else {
                QuickData quickData = (QuickData) new Gson().fromJson(quickAuth, QuickData.class);
                fidoQuickAuthDataCallback.success(new FidoQuickAuthData(quickData.getAaid(), FidoAuthenticatorType.authenticatorTypeFromAaid(quickData.getAaid()), fidoSession.getCountry(), fidoSession.getUserId()));
            }
        } catch (Throwable unused) {
            fidoQuickAuthDataCallback.failure(new FidoException.Builder(FidoError.SDK_QUICK_AUTH_DATA).build());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void listOp(@NonNull Activity activity, @NonNull FidoSession fidoSession, FidoSdk.FidoListingCallback fidoListingCallback, boolean z10) throws FidoException {
        validateSessionData(null, fidoSession);
        validateNonUIThread(null);
        doListing(activity, fidoSession, fidoListingCallback, getFidoPayload(fidoSession, null), z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processException(Activity activity, Operation operation, FidoException fidoException) {
        if (fidoException == null || fidoException.getProcessMessage() == null) {
            return;
        }
        try {
            this.fidoSdkClient.process(activity, operation, fidoException.getProcessMessage(), false, false, null, null);
        } catch (FidoException e5) {
            e5.log(TAG).print();
        }
    }

    private static void validateActivity(Activity activity, Operation operation, FidoError fidoError) throws FidoException {
        if (activity == null) {
            throw new FidoException.Builder(fidoError).operation(operation).errorInfo("Activity can not be null").build().log(TAG);
        }
    }

    private void validateInitialize(Operation operation) throws FidoException {
        if (!this.nkSdkInitialized) {
            throw new FidoException.Builder(FidoError.SDK_INITIALIZATION).operation(operation).errorInfo("The SDK must be initialized before executing any other operation").build().log(TAG);
        }
    }

    private static void validateNonUIThread(Operation operation) throws FidoException {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new FidoException.Builder(FidoError.SDK_BAD_THREAD).operation(operation).errorInfo("This operation can not be performed in the main thread").build().log(TAG);
        }
    }

    private static void validateSessionData(Operation operation, FidoSession fidoSession) throws FidoException {
        if (fidoSession == null || !fidoSession.isFilled()) {
            throw new FidoException.Builder(FidoError.SDK_BAD_SESSION).operation(operation).errorInfo("FidoSession fields can not be null or empty").build().log(TAG);
        }
    }

    @Override // com.bbva.sl.ar.android.secsdk.fido.FidoSdk
    public void authenticate(@Nullable final Activity activity, @NonNull final FidoSession fidoSession, @NonNull final FidoSdk.FidoAuthenticateCallback fidoAuthenticateCallback, final boolean z10) {
        AuthenticateBundle authenticateBundle = this.authenticateBundle;
        if (authenticateBundle != null && authenticateBundle.isInitialized()) {
            fidoAuthenticateCallback.authenticateFailed(fidoSession, getTooManyRequestsException(Operation.AUTH));
        } else {
            final Handler handler = new Handler(Looper.myLooper());
            this.executor.execute(new Runnable() { // from class: com.bbva.sl.ar.android.secsdk.fido.impl.FidoSdkImpl.23
                @Override // java.lang.Runnable
                public void run() {
                    FidoSdkImpl.this.authenticateCallingHandler = handler;
                    try {
                        FidoSdkImpl.this.doAuthentication(activity, Operation.AUTH, fidoSession, null, fidoAuthenticateCallback, z10);
                    } catch (FidoException e5) {
                        FidoSdkImpl.this.clearAuthenticateBundle();
                        FidoSdkImpl.this.callAuthenticateCallback(fidoAuthenticateCallback, fidoSession, e5);
                    }
                }
            });
        }
    }

    @Override // com.bbva.sl.ar.android.secsdk.fido.FidoSdk
    public void checkAuthenticationPossible(@Nullable final Activity activity, @NonNull final FidoSession fidoSession, @NonNull final FidoSdk.FidoCheckAuthenticateCallback fidoCheckAuthenticateCallback) {
        final Handler handler = new Handler(Looper.myLooper());
        this.executor.execute(new Runnable() { // from class: com.bbva.sl.ar.android.secsdk.fido.impl.FidoSdkImpl.21
            @Override // java.lang.Runnable
            public void run() {
                FidoSdkImpl.this.authenticateCallingHandler = handler;
                try {
                    FidoSdkImpl.this.checkAuthenticateOp(activity, fidoSession, fidoCheckAuthenticateCallback);
                } catch (FidoException e5) {
                    FidoSdkImpl.this.callCheckAuthenticateCallback(fidoCheckAuthenticateCallback, fidoSession, e5);
                }
            }
        });
    }

    @Override // com.bbva.sl.ar.android.secsdk.fido.FidoSdk
    public void checkLocalAuthPossible(@Nullable final Activity activity, @NonNull final String str, @Nullable final String str2, @NonNull final FidoSdk.FidoCheckLocalAuthCallback fidoCheckLocalAuthCallback) {
        new Handler(Looper.myLooper());
        this.executor.execute(new Runnable() { // from class: com.bbva.sl.ar.android.secsdk.fido.impl.FidoSdkImpl.22
            @Override // java.lang.Runnable
            public void run() {
                try {
                    fidoCheckLocalAuthCallback.checkCompleted(FidoSdkImpl.this.fidoSdkClient.checkAuthPossible(activity, str, str2));
                } catch (Throwable unused) {
                    fidoCheckLocalAuthCallback.checkCompleted(false);
                }
            }
        });
    }

    @Override // com.bbva.sl.ar.android.secsdk.fido.FidoSdk
    public void checkRegistrationPossible(@Nullable final Activity activity, @NonNull final FidoSession fidoSession, @NonNull final FidoSdk.FidoCheckRegisterCallback fidoCheckRegisterCallback) {
        final Handler handler = new Handler(Looper.myLooper());
        this.executor.execute(new Runnable() { // from class: com.bbva.sl.ar.android.secsdk.fido.impl.FidoSdkImpl.9
            @Override // java.lang.Runnable
            public void run() {
                FidoSdkImpl.this.registerCallingHandler = handler;
                try {
                    FidoSdkImpl.this.checkRegisterOp(activity, fidoSession, fidoCheckRegisterCallback);
                } catch (FidoException e5) {
                    FidoSdkImpl.this.callCheckRegisterCallback(fidoCheckRegisterCallback, fidoSession, e5);
                }
            }
        });
    }

    @Override // com.bbva.sl.ar.android.secsdk.fido.FidoSdk
    public void createAuthMessage(@NonNull final Activity activity, @NonNull final FidoSdk.FidoOperationListener fidoOperationListener) {
        final Handler handler = new Handler(Looper.myLooper());
        this.executor.execute(new Runnable() { // from class: com.bbva.sl.ar.android.secsdk.fido.impl.FidoSdkImpl.41
            @Override // java.lang.Runnable
            public void run() {
                try {
                    final String strInitOperation = FidoSdkImpl.this.fidoSdkClient.initOperation(activity, Operation.AUTH, false, null);
                    handler.post(new Runnable() { // from class: com.bbva.sl.ar.android.secsdk.fido.impl.FidoSdkImpl.41.1
                        @Override // java.lang.Runnable
                        public void run() {
                            fidoOperationListener.success(strInitOperation);
                        }
                    });
                } catch (FidoException e5) {
                    if (fidoOperationListener != null) {
                        handler.post(new Runnable() { // from class: com.bbva.sl.ar.android.secsdk.fido.impl.FidoSdkImpl.41.2
                            @Override // java.lang.Runnable
                            public void run() {
                                fidoOperationListener.failure(e5);
                            }
                        });
                    }
                }
            }
        });
    }

    @Override // com.bbva.sl.ar.android.secsdk.fido.FidoSdk
    public void deleteAllAuthenticators(@NonNull final Activity activity, @NonNull final FidoSession fidoSession, @NonNull final FidoSdk.FidoDeleteCallback fidoDeleteCallback) {
        final Handler handler = new Handler(Looper.myLooper());
        this.executor.execute(new Runnable() { // from class: com.bbva.sl.ar.android.secsdk.fido.impl.FidoSdkImpl.36
            @Override // java.lang.Runnable
            public void run() {
                FidoSdkImpl.this.deleteCallingHandler = handler;
                try {
                    FidoSdkImpl.this.deleteAllOp(null, activity, fidoSession, DeleteOperationType.DELETE_ALL, fidoDeleteCallback);
                } catch (FidoException e5) {
                    FidoSdkImpl.this.callDeleteCallback(fidoDeleteCallback, fidoSession, e5);
                }
            }
        });
    }

    @Override // com.bbva.sl.ar.android.secsdk.fido.FidoSdk
    public void deleteAllAuthenticatorsFromDevice(@NonNull final String str, @NonNull final Activity activity, @NonNull final FidoSession fidoSession, @NonNull final FidoSdk.FidoDeleteCallback fidoDeleteCallback) {
        final Handler handler = new Handler(Looper.myLooper());
        this.executor.execute(new Runnable() { // from class: com.bbva.sl.ar.android.secsdk.fido.impl.FidoSdkImpl.39
            @Override // java.lang.Runnable
            public void run() {
                FidoSdkImpl.this.deleteCallingHandler = handler;
                try {
                    FidoSdkImpl.this.deleteAllOp(str, activity, fidoSession, DeleteOperationType.DELETE_ALL_IN_A_DEVICE, fidoDeleteCallback);
                } catch (FidoException e5) {
                    FidoSdkImpl.this.callDeleteCallback(fidoDeleteCallback, fidoSession, e5);
                }
            }
        });
    }

    @Override // com.bbva.sl.ar.android.secsdk.fido.FidoSdk
    public void deleteAllAuthenticatorsLocally(@NonNull final Activity activity, @NonNull final FidoSession fidoSession, @NonNull final FidoSdk.FidoDeleteCallback fidoDeleteCallback) {
        final Handler handler = new Handler(Looper.myLooper());
        this.executor.execute(new Runnable() { // from class: com.bbva.sl.ar.android.secsdk.fido.impl.FidoSdkImpl.38
            @Override // java.lang.Runnable
            public void run() {
                FidoSdkImpl.this.deleteCallingHandler = handler;
                try {
                    String facetId = FidoSdkImpl.this.fidoSdkClient.getFacetId();
                    if (FidoSdkImpl.this.facetsUrl != null) {
                        facetId = FidoSdkImpl.this.facetsUrl;
                    }
                    FidoSdkImpl.this.clearLocalAllAuthenticators(activity, facetId);
                    FidoSdkImpl.this.authPayloadManager.clearCache();
                    FidoSdkImpl.this.quickAuthManager.deleteQuickAuth(fidoSession, DeleteOperationType.DELETE_ALL, null);
                    FidoSdkImpl.this.callDeleteCallback(fidoDeleteCallback, fidoSession);
                } catch (FidoException e5) {
                    FidoSdkImpl.this.callDeleteCallback(fidoDeleteCallback, fidoSession, e5);
                }
            }
        });
    }

    @Override // com.bbva.sl.ar.android.secsdk.fido.FidoSdk
    public void deleteAuthenticator(@NonNull final String str, @NonNull final String str2, @NonNull final Activity activity, @NonNull final FidoSession fidoSession, @NonNull final FidoSdk.FidoDeleteCallback fidoDeleteCallback) {
        final Handler handler = new Handler(Looper.myLooper());
        this.executor.execute(new Runnable() { // from class: com.bbva.sl.ar.android.secsdk.fido.impl.FidoSdkImpl.35
            @Override // java.lang.Runnable
            public void run() {
                FidoSdkImpl.this.deleteCallingHandler = handler;
                try {
                    FidoSdkImpl.this.deleteOp(activity, fidoSession, str, str2, fidoDeleteCallback);
                } catch (FidoException e5) {
                    FidoSdkImpl.this.callDeleteCallback(fidoDeleteCallback, fidoSession, e5, str);
                }
            }
        });
    }

    @Override // com.bbva.sl.ar.android.secsdk.fido.FidoSdk
    public void deleteAuthenticatorLocally(@NonNull final String str, @NonNull final Activity activity, @NonNull final FidoSession fidoSession, @NonNull final FidoSdk.FidoDeleteCallback fidoDeleteCallback) {
        final Handler handler = new Handler(Looper.myLooper());
        this.executor.execute(new Runnable() { // from class: com.bbva.sl.ar.android.secsdk.fido.impl.FidoSdkImpl.37
            @Override // java.lang.Runnable
            public void run() {
                FidoSdkImpl.this.deleteCallingHandler = handler;
                try {
                    String str2 = str;
                    if (str2 == null || str2.isEmpty()) {
                        FidoSdkImpl.this.callDeleteCallback(fidoDeleteCallback, fidoSession, new FidoException.Builder(FidoError.SDK_DELETE_ONE_OPERATION).operation(Operation.DEL_REG).errorInfo("FidoAuthenticator Handle can not be null or empty").build().log(FidoSdkImpl.TAG), str);
                    }
                    FidoAuthenticator fidoAuthenticator = new FidoAuthenticator(0L, null, str);
                    String facetId = FidoSdkImpl.this.fidoSdkClient.getFacetId();
                    if (FidoSdkImpl.this.facetsUrl != null) {
                        facetId = FidoSdkImpl.this.facetsUrl;
                    }
                    FidoSdkImpl.this.clearLocalOneAuthenticator(activity, facetId, fidoAuthenticator.getAaid());
                    FidoSdkImpl.this.authPayloadManager.clearCache();
                    FidoSdkImpl.this.quickAuthManager.deleteQuickAuth(fidoSession, DeleteOperationType.DELETE_ONE, str);
                    FidoSdkImpl.this.callDeleteCallback(fidoDeleteCallback, fidoSession, str);
                } catch (FidoException e5) {
                    FidoSdkImpl.this.callDeleteCallback(fidoDeleteCallback, fidoSession, e5, str);
                }
            }
        });
    }

    @Override // com.bbva.sl.ar.android.secsdk.fido.FidoNetworkManager.FidoNetworkAuthenticateCallback
    public void didFinishAuthentication(FidoResult fidoResult) {
        handleFinishAuthResult(this.authenticateBundle.getActivityWeakReference().get(), Operation.AUTH, fidoResult, this.authenticateBundle.getFidoSession(), this.authenticateBundle.isConfirmationRequired(), null, this.authenticateBundle.getAuthenticateCallback());
    }

    @Override // com.bbva.sl.ar.android.secsdk.fido.FidoNetworkManager.OobAuthenticateCallback
    public void didFinishOobAuthentication(FidoResult fidoResult) {
        handleFinishAuthResult(this.authenticateBundle.getActivityWeakReference().get(), Operation.OOB_AUTH, fidoResult, this.authenticateBundle.getFidoSession(), this.authenticateBundle.isConfirmationRequired(), this.authenticateBundle.getOobData(), this.authenticateBundle.getAuthenticateCallback());
    }

    @Override // com.bbva.sl.ar.android.secsdk.fido.FidoNetworkManager.OobRegisterCallback
    public void didFinishOobRegistration(FidoResult fidoResult) {
        handleFinishRegistrationResult(this.registerAuthenticatorBundle.getActivityWeakReference().get(), Operation.OOB_REG, fidoResult, this.registerAuthenticatorBundle.getFidoSession(), this.registerAuthenticatorBundle.isConfirmationRequired(), this.registerAuthenticatorBundle.getOobData(), this.registerAuthenticatorBundle.getRegisterCallback());
    }

    @Override // com.bbva.sl.ar.android.secsdk.fido.FidoNetworkManager.FidoNetworkRegisterCallback
    public void didFinishRegistration(FidoResult fidoResult) {
        handleFinishRegistrationResult(this.registerAuthenticatorBundle.getActivityWeakReference().get(), Operation.REG, fidoResult, this.registerAuthenticatorBundle.getFidoSession(), this.registerAuthenticatorBundle.isConfirmationRequired(), null, this.registerAuthenticatorBundle.getRegisterCallback());
    }

    @Override // com.bbva.sl.ar.android.secsdk.fido.FidoNetworkManager.FidoNetworkAuthenticateCallback
    public void didInitAuthentication(FidoResult fidoResult) {
        handleInitAuthResult(this.authenticateBundle.getActivityWeakReference().get(), Operation.AUTH, fidoResult, this.authenticateBundle.getFidoSession(), this.authenticateBundle.isConfirmationRequired(), null, this.authenticateBundle.getAuthenticateCallback());
    }

    @Override // com.bbva.sl.ar.android.secsdk.fido.FidoNetworkManager.OobAuthenticateCallback
    public void didInitOobAuthentication(FidoResult fidoResult) {
        handleInitAuthResult(this.authenticateBundle.getActivityWeakReference().get(), Operation.OOB_AUTH, fidoResult, this.authenticateBundle.getFidoSession(), this.authenticateBundle.isConfirmationRequired(), this.authenticateBundle.getOobData(), this.authenticateBundle.getAuthenticateCallback());
    }

    @Override // com.bbva.sl.ar.android.secsdk.fido.FidoNetworkManager.OobRegisterCallback
    public void didInitOobRegistration(FidoResult fidoResult) {
        handleInitRegistrationResult(this.registerAuthenticatorBundle.getActivityWeakReference().get(), Operation.OOB_REG, fidoResult, this.registerAuthenticatorBundle.getFidoSession(), this.registerAuthenticatorBundle.isConfirmationRequired(), this.registerAuthenticatorBundle.getOobData(), this.registerAuthenticatorBundle.getRegisterCallback());
    }

    @Override // com.bbva.sl.ar.android.secsdk.fido.FidoNetworkManager.FidoNetworkRegisterCallback
    public void didInitRegistration(FidoResult fidoResult) {
        handleInitRegistrationResult(this.registerAuthenticatorBundle.getActivityWeakReference().get(), Operation.REG, fidoResult, this.registerAuthenticatorBundle.getFidoSession(), this.registerAuthenticatorBundle.isConfirmationRequired(), null, this.registerAuthenticatorBundle.getRegisterCallback());
    }

    @Override // com.bbva.sl.ar.android.secsdk.fido.FidoSdk
    public void discoverBiometricCapabilities(@NonNull final Activity activity, @NonNull final FidoSdk.FidoDiscoverBiometricCapabilitiesCallback fidoDiscoverBiometricCapabilitiesCallback) {
        this.executor.execute(new Runnable() { // from class: com.bbva.sl.ar.android.secsdk.fido.impl.FidoSdkImpl.1
            @Override // java.lang.Runnable
            public void run() {
                if (FidoSdkImpl.this.fidoSdkClient == null) {
                    fidoDiscoverBiometricCapabilitiesCallback.failure(new FidoException.Builder(FidoError.SDK_INITIALIZATION).build());
                    return;
                }
                try {
                    fidoDiscoverBiometricCapabilitiesCallback.success(FidoSdkImpl.this.fidoSdkClient.getBiometricCapabilities(activity));
                } catch (Throwable unused) {
                    fidoDiscoverBiometricCapabilitiesCallback.failure(new FidoException.Builder(FidoError.SDK_DISCOVER_CAPABILITIES).build());
                }
            }
        });
    }

    @Override // com.bbva.sl.ar.android.secsdk.fido.FidoSdk
    public void discoverCapabilities(@NonNull final Activity activity, @NonNull final FidoSdk.FidoDiscoverCapabilitiesCallback fidoDiscoverCapabilitiesCallback) {
        this.executor.execute(new Runnable() { // from class: com.bbva.sl.ar.android.secsdk.fido.impl.FidoSdkImpl.2
            @Override // java.lang.Runnable
            public void run() {
                if (FidoSdkImpl.this.fidoSdkClient == null) {
                    fidoDiscoverCapabilitiesCallback.failure(new FidoException.Builder(FidoError.SDK_INITIALIZATION).build());
                    return;
                }
                try {
                    fidoDiscoverCapabilitiesCallback.success(FidoSdkImpl.this.fidoSdkClient.getCapabilities(activity));
                } catch (Throwable unused) {
                    fidoDiscoverCapabilitiesCallback.failure(new FidoException.Builder(FidoError.SDK_DISCOVER_GENERIC_CAPABILITIES).build());
                }
            }
        });
    }

    @Override // com.bbva.sl.ar.android.secsdk.fido.FidoSdk
    @Nullable
    public String getDeviceId() {
        FidoSdkClient fidoSdkClient = this.fidoSdkClient;
        if (fidoSdkClient != null) {
            return fidoSdkClient.getDeviceId();
        }
        return null;
    }

    @Override // com.bbva.sl.ar.android.secsdk.fido.FidoSdk
    @Nullable
    public String getFacetId() {
        try {
            return this.fidoSdkClient.getFacetId();
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bbva.sl.ar.android.secsdk.fido.FidoSdk
    @Nullable
    public String getFacetsUrl() {
        return this.facetsUrl;
    }

    @Override // com.bbva.sl.ar.android.secsdk.fido.FidoSdk
    public void initialize(@NonNull Activity activity, @NonNull FidoSdk.FidoInitializeCallback fidoInitializeCallback) {
        initialize(fidoInitializeCallback);
    }

    @Override // com.bbva.sl.ar.android.secsdk.fido.FidoSdk
    public boolean isQuickAuthEnabled() {
        return this.quickAuthEnabled;
    }

    @Override // com.bbva.sl.ar.android.secsdk.fido.FidoSdk
    public void listAuthenticators(@NonNull final Activity activity, @NonNull final FidoSession fidoSession, @NonNull final FidoSdk.FidoListingCallback fidoListingCallback) {
        final Handler handler = new Handler(Looper.myLooper());
        this.executor.execute(new Runnable() { // from class: com.bbva.sl.ar.android.secsdk.fido.impl.FidoSdkImpl.15
            @Override // java.lang.Runnable
            public void run() {
                FidoSdkImpl.this.listingCallingHandler = handler;
                try {
                    FidoSdkImpl.this.listOp(activity, fidoSession, new FidoSdk.FidoListingCallback() { // from class: com.bbva.sl.ar.android.secsdk.fido.impl.FidoSdkImpl.15.1
                        @Override // com.bbva.sl.ar.android.secsdk.fido.FidoSdk.FidoListingCallback
                        public void listingCompleted(FidoSession fidoSession2, List<FidoDevice> list) {
                            fidoListingCallback.listingCompleted(fidoSession2, list);
                        }

                        @Override // com.bbva.sl.ar.android.secsdk.fido.FidoSdk.FidoListingCallback
                        public void listingFailed(FidoSession fidoSession2, FidoException fidoException) {
                            fidoListingCallback.listingFailed(fidoSession2, fidoException);
                        }
                    }, false);
                } catch (FidoException e5) {
                    FidoSdkImpl.this.callListingCallback(fidoListingCallback, fidoSession, e5, false);
                }
            }
        });
    }

    @Override // com.bbva.sl.ar.android.secsdk.fido.FidoSdk
    public void oobAuthenticate(@Nullable final Activity activity, @NonNull final FidoSession fidoSession, @NonNull final String str, @NonNull final FidoSdk.FidoOobAuthenticateCallback fidoOobAuthenticateCallback, final boolean z10) {
        AuthenticateBundle authenticateBundle = this.authenticateBundle;
        if (authenticateBundle != null && authenticateBundle.isInitialized()) {
            fidoOobAuthenticateCallback.authenticateFailed(fidoSession, getTooManyRequestsException(Operation.OOB_AUTH));
        } else {
            final Handler handler = new Handler(Looper.myLooper());
            this.executor.execute(new Runnable() { // from class: com.bbva.sl.ar.android.secsdk.fido.impl.FidoSdkImpl.24
                @Override // java.lang.Runnable
                public void run() {
                    FidoSdkImpl.this.authenticateCallingHandler = handler;
                    try {
                        FidoSdkImpl.this.doAuthentication(activity, Operation.OOB_AUTH, fidoSession, str, fidoOobAuthenticateCallback, z10);
                    } catch (FidoException e5) {
                        FidoSdkImpl.this.clearAuthenticateBundle();
                        FidoSdkImpl.this.callAuthenticateCallback(fidoOobAuthenticateCallback, fidoSession, e5);
                    }
                }
            });
        }
    }

    @Override // com.bbva.sl.ar.android.secsdk.fido.FidoSdk
    public void oobRegisterAuthenticator(@Nullable final Activity activity, @NonNull final FidoSession fidoSession, @NonNull final String str, @NonNull final FidoSdk.FidoOobRegisterCallback fidoOobRegisterCallback, final boolean z10) {
        RegisterAuthenticatorBundle registerAuthenticatorBundle = this.registerAuthenticatorBundle;
        if (registerAuthenticatorBundle != null && registerAuthenticatorBundle.isInitialized()) {
            fidoOobRegisterCallback.registerFailed(fidoSession, getTooManyRequestsException(Operation.OOB_REG));
        } else {
            final Handler handler = new Handler(Looper.myLooper());
            this.executor.execute(new Runnable() { // from class: com.bbva.sl.ar.android.secsdk.fido.impl.FidoSdkImpl.11
                @Override // java.lang.Runnable
                public void run() {
                    FidoSdkImpl.this.registerCallingHandler = handler;
                    try {
                        FidoSdkImpl.this.doRegister(activity, Operation.OOB_REG, fidoSession, str, fidoOobRegisterCallback, z10);
                    } catch (FidoException e5) {
                        FidoSdkImpl.this.clearRegisterAuthenticatorBundle();
                        FidoSdkImpl.this.callRegisterCallback(fidoOobRegisterCallback, fidoSession, e5);
                    }
                }
            });
        }
    }

    @Override // com.bbva.sl.ar.android.secsdk.fido.FidoSdk
    public void processAuthMessage(@NonNull final Activity activity, @NonNull final String str, @NonNull final FidoSdk.FidoOperationListener fidoOperationListener) {
        final Handler handler = new Handler(Looper.myLooper());
        this.executor.execute(new Runnable() { // from class: com.bbva.sl.ar.android.secsdk.fido.impl.FidoSdkImpl.42
            @Override // java.lang.Runnable
            public void run() {
                try {
                    final String strProcess = FidoSdkImpl.this.fidoSdkClient.process(activity, Operation.AUTH, str, false, false, null, null);
                    handler.post(new Runnable() { // from class: com.bbva.sl.ar.android.secsdk.fido.impl.FidoSdkImpl.42.1
                        @Override // java.lang.Runnable
                        public void run() {
                            fidoOperationListener.success(strProcess);
                        }
                    });
                } catch (FidoException e5) {
                    if (fidoOperationListener != null) {
                        handler.post(new Runnable() { // from class: com.bbva.sl.ar.android.secsdk.fido.impl.FidoSdkImpl.42.2
                            @Override // java.lang.Runnable
                            public void run() {
                                fidoOperationListener.failure(e5);
                            }
                        });
                    }
                }
            }
        });
    }

    @Override // com.bbva.sl.ar.android.secsdk.fido.FidoSdk
    public void quickAuthData(@NonNull FidoSession fidoSession, @NonNull FidoSdk.FidoQuickAuthDataCallback fidoQuickAuthDataCallback) {
        this.executor.execute(new a(this, fidoQuickAuthDataCallback, 0, fidoSession));
    }

    @Override // com.bbva.sl.ar.android.secsdk.fido.FidoSdk
    public void registerAuthenticator(@Nullable final Activity activity, @NonNull final FidoSession fidoSession, @NonNull final FidoSdk.FidoRegisterCallback fidoRegisterCallback, final boolean z10) {
        RegisterAuthenticatorBundle registerAuthenticatorBundle = this.registerAuthenticatorBundle;
        if (registerAuthenticatorBundle != null && registerAuthenticatorBundle.isInitialized()) {
            fidoRegisterCallback.registerFailed(fidoSession, getTooManyRequestsException(Operation.REG));
        } else {
            final Handler handler = new Handler(Looper.myLooper());
            this.executor.execute(new Runnable() { // from class: com.bbva.sl.ar.android.secsdk.fido.impl.FidoSdkImpl.10
                @Override // java.lang.Runnable
                public void run() {
                    FidoSdkImpl.this.registerCallingHandler = handler;
                    try {
                        FidoSdkImpl.this.doRegister(activity, Operation.REG, fidoSession, null, fidoRegisterCallback, z10);
                    } catch (FidoException e5) {
                        FidoSdkImpl.this.clearRegisterAuthenticatorBundle();
                        FidoSdkImpl.this.callRegisterCallback(fidoRegisterCallback, fidoSession, e5);
                    }
                }
            });
        }
    }

    @Override // com.bbva.sl.ar.android.secsdk.fido.FidoSdk
    public void registerSelectionUIListener(@NonNull FidoSdk.FidoUISelectionListener fidoUISelectionListener) {
        final FidoSelectionUIHandler fidoSelectionUIHandler = new FidoSelectionUIHandler(fidoUISelectionListener);
        AsmSelectionUIFactory.setInstance(new AsmSelectionUIFactory() { // from class: com.bbva.sl.ar.android.secsdk.fido.impl.FidoSdkImpl.4
            @Override // com.noknok.android.client.appsdk.AsmSelectionUIFactory
            public AsmSelectionUI createAsmSelectionUIInstance() {
                return fidoSelectionUIHandler;
            }
        });
    }

    @Override // com.bbva.sl.ar.android.secsdk.fido.FidoSdk
    public void setExternalDeviceId(@Nullable String str) {
        this.externalDeviceId = str;
    }

    @Override // com.bbva.sl.ar.android.secsdk.fido.FidoSdk
    public void setFacetsUrl(@NonNull String str) {
        this.facetsUrl = str;
    }

    @Override // com.bbva.sl.ar.android.secsdk.fido.FidoSdk
    public void setQuickAuthEnabled(boolean z10) {
        this.quickAuthEnabled = z10;
        this.fidoSdkClient.setQuickAuthEnabled(z10);
    }

    @Override // com.bbva.sl.ar.android.secsdk.fido.FidoSdk
    public void setTransactionUIListener(@NonNull final FidoSdk.FidoUITransactionListener fidoUITransactionListener) {
        TransactionUIFactory.setInstance(new TransactionUIFactory() { // from class: com.bbva.sl.ar.android.secsdk.fido.impl.FidoSdkImpl.29
            @Override // com.noknok.android.client.utils.TransactionUIFactory
            public ITransactionUI createTransactionUIInstance() {
                return new FidoTransactionUIHandler(fidoUITransactionListener);
            }
        });
    }

    @Override // com.bbva.sl.ar.android.secsdk.fido.FidoSdk
    public void signTransaction(@NonNull final Activity activity, @NonNull final FidoSession fidoSession, @NonNull final String str, @NonNull final String str2, @NonNull final FidoSdk.FidoSignCallback fidoSignCallback) {
        final Handler handler = new Handler(Looper.myLooper());
        this.executor.execute(new Runnable() { // from class: com.bbva.sl.ar.android.secsdk.fido.impl.FidoSdkImpl.28
            @Override // java.lang.Runnable
            public void run() {
                FidoSdkImpl.this.signCallingHandler = handler;
                try {
                    FidoSdkImpl.this.signTransaction(activity, fidoSession, fidoSignCallback, new FidoTransaction(str, FidoSdkImpl.this.getBase64UrlOrEmpty(str2)));
                } catch (FidoException e5) {
                    FidoSdkImpl.this.callSignCallback(fidoSignCallback, fidoSession, e5);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void callAuthenticateCallback(@NonNull final FidoSdk.FidoAuthenticateCallback fidoAuthenticateCallback, @NonNull final FidoSession fidoSession, final FidoException fidoException) {
        if (fidoAuthenticateCallback == null) {
            return;
        }
        this.authenticateCallingHandler.post(new Runnable() { // from class: com.bbva.sl.ar.android.secsdk.fido.impl.FidoSdkImpl.20
            @Override // java.lang.Runnable
            public void run() {
                fidoAuthenticateCallback.authenticateFailed(fidoSession, fidoException);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void callCheckAuthenticateCallback(@NonNull final FidoSdk.FidoCheckAuthenticateCallback fidoCheckAuthenticateCallback, @NonNull final FidoSession fidoSession, @NonNull final FidoException fidoException) {
        this.authenticateCallingHandler.post(new Runnable() { // from class: com.bbva.sl.ar.android.secsdk.fido.impl.FidoSdkImpl.18
            @Override // java.lang.Runnable
            public void run() {
                fidoCheckAuthenticateCallback.checkFailed(fidoSession, fidoException);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void callCheckRegisterCallback(@NonNull final FidoSdk.FidoCheckRegisterCallback fidoCheckRegisterCallback, @NonNull final FidoSession fidoSession, @NonNull final FidoException fidoException) {
        this.registerCallingHandler.post(new Runnable() { // from class: com.bbva.sl.ar.android.secsdk.fido.impl.FidoSdkImpl.6
            @Override // java.lang.Runnable
            public void run() {
                fidoCheckRegisterCallback.checkFailed(fidoSession, fidoException);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void callDeleteCallback(@NonNull final FidoSdk.FidoDeleteCallback fidoDeleteCallback, @NonNull final FidoSession fidoSession) {
        this.deleteCallingHandler.post(new Runnable() { // from class: com.bbva.sl.ar.android.secsdk.fido.impl.FidoSdkImpl.32
            @Override // java.lang.Runnable
            public void run() {
                fidoDeleteCallback.deleteAllCompleted(fidoSession);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void callRegisterCallback(@NonNull final FidoSdk.FidoRegisterCallback fidoRegisterCallback, @NonNull final FidoSession fidoSession, @NonNull final FidoException fidoException) {
        if (fidoRegisterCallback == null) {
            return;
        }
        this.registerCallingHandler.post(new Runnable() { // from class: com.bbva.sl.ar.android.secsdk.fido.impl.FidoSdkImpl.8
            @Override // java.lang.Runnable
            public void run() {
                fidoRegisterCallback.registerFailed(fidoSession, fidoException);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void callSignCallback(@NonNull final FidoSdk.FidoSignCallback fidoSignCallback, @NonNull final FidoSession fidoSession, final FidoException fidoException) {
        this.signCallingHandler.post(new Runnable() { // from class: com.bbva.sl.ar.android.secsdk.fido.impl.FidoSdkImpl.27
            @Override // java.lang.Runnable
            public void run() {
                fidoSignCallback.signFailed(fidoSession, fidoException);
            }
        });
    }

    @Override // com.bbva.sl.ar.android.secsdk.fido.FidoSdk
    public void initialize(@NonNull final FidoSdk.FidoInitializeCallback fidoInitializeCallback) {
        final Handler handler = new Handler(Looper.myLooper());
        this.executor.execute(new Runnable() { // from class: com.bbva.sl.ar.android.secsdk.fido.impl.FidoSdkImpl.3
            @Override // java.lang.Runnable
            public void run() {
                try {
                    FidoSdkImpl.this.init();
                    handler.post(new Runnable() { // from class: com.bbva.sl.ar.android.secsdk.fido.impl.FidoSdkImpl.3.1
                        @Override // java.lang.Runnable
                        public void run() {
                            fidoInitializeCallback.initCompleted();
                        }
                    });
                } catch (FidoException e5) {
                    handler.post(new Runnable() { // from class: com.bbva.sl.ar.android.secsdk.fido.impl.FidoSdkImpl.3.2
                        @Override // java.lang.Runnable
                        public void run() {
                            fidoInitializeCallback.initFailed(e5);
                        }
                    });
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void callDeleteCallback(@NonNull final FidoSdk.FidoDeleteCallback fidoDeleteCallback, @NonNull final FidoSession fidoSession, @NonNull final FidoException fidoException) {
        this.deleteCallingHandler.post(new Runnable() { // from class: com.bbva.sl.ar.android.secsdk.fido.impl.FidoSdkImpl.33
            @Override // java.lang.Runnable
            public void run() {
                fidoDeleteCallback.deleteAllFailed(fidoSession, fidoException);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void callListingCallback(@NonNull final FidoSdk.FidoListingCallback fidoListingCallback, @NonNull final FidoSession fidoSession, @NonNull final FidoException fidoException, boolean z10) {
        if (z10) {
            fidoListingCallback.listingFailed(fidoSession, fidoException);
        } else {
            this.listingCallingHandler.post(new Runnable() { // from class: com.bbva.sl.ar.android.secsdk.fido.impl.FidoSdkImpl.14
                @Override // java.lang.Runnable
                public void run() {
                    fidoListingCallback.listingFailed(fidoSession, fidoException);
                }
            });
        }
    }

    private FidoPayload getFidoPayload(FidoSession fidoSession, String str, FidoTransaction fidoTransaction) throws FidoException {
        return new FidoPayload(str, new FidoAttributes(this.fidoSdkClient.getFacetId(), this.fidoSdkClient.getDeviceId(), this.externalDeviceId), fidoSession, fidoTransaction);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void signTransaction(@NonNull Activity activity, @NonNull FidoSession fidoSession, @NonNull FidoSdk.FidoSignCallback fidoSignCallback, FidoTransaction fidoTransaction) throws FidoException {
        applyValidations(activity, Operation.AUTH, fidoSession, FidoError.SDK_AUTHENTICATE_OPERATION);
        doSign(activity, fidoSession, fidoSignCallback, fidoTransaction);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void callDeleteCallback(@NonNull final FidoSdk.FidoDeleteCallback fidoDeleteCallback, @NonNull final FidoSession fidoSession, @NonNull final FidoException fidoException, @NonNull final String str) {
        this.deleteCallingHandler.post(new Runnable() { // from class: com.bbva.sl.ar.android.secsdk.fido.impl.FidoSdkImpl.34
            @Override // java.lang.Runnable
            public void run() {
                fidoDeleteCallback.deleteOneFailed(fidoSession, fidoException, str);
            }
        });
    }

    @VisibleForTesting(otherwise = 5)
    public FidoSdkImpl(@NonNull Context context, @NonNull FidoNetworkManager fidoNetworkManager, FidoSdkClient fidoSdkClient) throws FidoException {
        if (context == null) {
            throw new FidoException.Builder(FidoError.SDK_SETUP).errorInfo("Context can not be null").build().log(TAG);
        }
        if (fidoNetworkManager != null) {
            this.networkManager = fidoNetworkManager;
            this.nkSdkInitialized = false;
            this.fidoSdkClient = fidoSdkClient;
            this.quickAuthManager = new QuickAuthManager(context, fidoSdkClient);
            initializeCache();
            return;
        }
        throw new FidoException.Builder(FidoError.SDK_SETUP).errorInfo("FidoNetworkManager can not be null").build().log(TAG);
    }
}
