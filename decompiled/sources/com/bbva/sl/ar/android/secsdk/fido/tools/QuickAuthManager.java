package com.bbva.sl.ar.android.secsdk.fido.tools;

import android.content.Context;
import android.util.Base64;
import androidx.annotation.Nullable;
import com.bbva.sl.ar.android.secsdk.fido.client.FidoSdkClient;
import com.bbva.sl.ar.android.secsdk.fido.exception.FidoException;
import com.bbva.sl.ar.android.secsdk.fido.model.DeleteOperationType;
import com.bbva.sl.ar.android.secsdk.fido.model.FidoAuthenticatorType;
import com.bbva.sl.ar.android.secsdk.fido.model.FidoAuthenticatorTypeValue;
import com.bbva.sl.ar.android.secsdk.fido.model.FidoSession;
import com.bbva.sl.ar.android.secsdk.fido.model.QuickData;
import com.google.gson.Gson;
import java.util.Arrays;
import java.util.Locale;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes8.dex */
public class QuickAuthManager {
    private final String TAG = "QuickAuthManager";
    private final FidoSdkClient fidoSdkClient;
    private final StorageManager storageManager;

    /* JADX INFO: renamed from: com.bbva.sl.ar.android.secsdk.fido.tools.QuickAuthManager$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
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

    public QuickAuthManager(Context context, FidoSdkClient fidoSdkClient) {
        this.fidoSdkClient = fidoSdkClient;
        this.storageManager = new StorageManager("QuickAuths", context);
    }

    @Nullable
    private FidoAuthenticatorType authenticatorTypeFrom(String str) {
        try {
            String strReplace = new String(Base64.decode(str, 2)).split(",")[1].replace("\"", "");
            FidoAuthenticatorTypeValue fidoAuthenticatorTypeValue = new FidoAuthenticatorTypeValue();
            if (Arrays.asList(fidoAuthenticatorTypeValue.biometricsAndroid).contains(strReplace)) {
                return FidoAuthenticatorType.BIOMETRICS;
            }
            if (Arrays.asList(fidoAuthenticatorTypeValue.transparentAndroid).contains(strReplace)) {
                return FidoAuthenticatorType.TRANSPARENT;
            }
            return null;
        } catch (Exception unused) {
        }
    }

    @Nullable
    private String getQuickAuthKey(FidoSession fidoSession, @Nullable FidoAuthenticatorType fidoAuthenticatorType) {
        try {
            String strStringToHexSha256 = Crypto.stringToHexSha256(this.fidoSdkClient.getFacetId());
            String userId = fidoSession.getUserId();
            String policy = fidoAuthenticatorType == null ? fidoSession.getPolicy() : fidoAuthenticatorType.getName();
            if (strStringToHexSha256 != null && userId != null && policy != null) {
                return (strStringToHexSha256 + Constant.DOT_STRING + userId + Constant.DOT_STRING + policy).toLowerCase(Locale.getDefault());
            }
        } catch (FidoException unused) {
        }
        return null;
    }

    public void deleteQuickAuth(FidoSession fidoSession, DeleteOperationType deleteOperationType, @Nullable String str) {
        FidoAuthenticatorType fidoAuthenticatorTypeAuthenticatorTypeFrom;
        int i10 = AnonymousClass1.$SwitchMap$com$bbva$sl$ar$android$secsdk$fido$model$DeleteOperationType[deleteOperationType.ordinal()];
        if (i10 == 1) {
            if (str == null || (fidoAuthenticatorTypeAuthenticatorTypeFrom = authenticatorTypeFrom(str)) == null) {
                return;
            }
            fidoAuthenticatorTypeAuthenticatorTypeFrom.toString();
            this.storageManager.removePreferenceValue(getQuickAuthKey(fidoSession, fidoAuthenticatorTypeAuthenticatorTypeFrom));
            return;
        }
        if (i10 == 2 || i10 == 3) {
            this.storageManager.removePreferenceValue(getQuickAuthKey(fidoSession, FidoAuthenticatorType.BIOMETRICS));
            this.storageManager.removePreferenceValue(getQuickAuthKey(fidoSession, FidoAuthenticatorType.TRANSPARENT));
            this.storageManager.removePreferenceValue(getQuickAuthKey(fidoSession, null));
        }
    }

    @Nullable
    public String getQuickAuth(FidoSession fidoSession) {
        String quickAuthKey = getQuickAuthKey(fidoSession, FidoAuthenticatorType.BIOMETRICS);
        if (quickAuthKey != null) {
            return this.storageManager.getPreferenceValue(quickAuthKey, (String) null);
        }
        String quickAuthKey2 = getQuickAuthKey(fidoSession, FidoAuthenticatorType.TRANSPARENT);
        return quickAuthKey2 != null ? this.storageManager.getPreferenceValue(quickAuthKey2, (String) null) : getQuickAuthKey(fidoSession, null);
    }

    public void setQuickAuth(FidoSession fidoSession, String str) {
        String quickAuthKey = getQuickAuthKey(fidoSession, FidoAuthenticatorType.authenticatorTypeFromAaid(((QuickData) new Gson().fromJson(str, QuickData.class)).getAaid()));
        if (quickAuthKey != null) {
            this.storageManager.setPreferenceValue(quickAuthKey, str);
        }
    }
}
