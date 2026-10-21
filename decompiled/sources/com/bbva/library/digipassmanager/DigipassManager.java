package com.bbva.library.digipassmanager;

import android.app.Activity;
import android.content.Intent;
import androidx.activity.result.ActivityResultLauncher;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.bbva.ethermobilesdk.securesharing.SecureSharing;
import com.bbva.library.digipassmanager.callbacks.OnDeleteTokenCronto;
import com.bbva.library.digipassmanager.callbacks.OnDigipassOperation;
import com.bbva.library.digipassmanager.callbacks.OnGenerateOtpOperation;
import com.bbva.library.digipassmanager.constants.DigipassManagerConstants;
import com.bbva.library.digipassmanager.utils.VectorConverter;
import com.google.android.gms.fido.u2f.api.common.ClientData;
import com.vasco.digipass.sdk.DigipassSDK;
import com.vasco.digipass.sdk.models.SecureChannelMessage;
import com.vasco.digipass.sdk.responses.ActivationResponse;
import com.vasco.digipass.sdk.responses.GenerationResponse;
import com.vasco.digipass.sdk.responses.MultiDeviceLicenseActivationResponse;
import com.vasco.digipass.sdk.responses.SecureChannelParseResponse;
import com.vasco.digipass.sdk.utils.qrcodescanner.QRCodeScannerSDKActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: DigipassManager.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0005\u0010\u0011\u0012\u0013\u0014B\u0005¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bJ&\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000eJ&\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b¨\u0006\u0015"}, d2 = {"Lcom/bbva/library/digipassmanager/DigipassManager;", "", "()V", "activateTokenCrontoHash", "", "storage", "Lcom/bbva/ethermobilesdk/securesharing/SecureSharing;", "secureChannelMessage", "", "deviceId", "callback", "Lcom/bbva/library/digipassmanager/callbacks/OnDigipassOperation;", "generateOtpTokenCronto", ClientData.KEY_CHALLENGE, "Lcom/bbva/library/digipassmanager/callbacks/OnGenerateOtpOperation;", "validateTokenCrontoHash", "Companion", "TokenCrontoActivation", "TokenCrontoGenerate", "TokenCrontoMaintenance", "TokenCrontoQRScanner", "digipassmanager-library_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DigipassManager {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final DigipassManager f34918a = new DigipassManager();

    /* JADX INFO: compiled from: DigipassManager.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/bbva/library/digipassmanager/DigipassManager$Companion;", "", "()V", "<set-?>", "Lcom/bbva/library/digipassmanager/DigipassManager;", "instance", "getInstance", "()Lcom/bbva/library/digipassmanager/DigipassManager;", "digipassmanager-library_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final DigipassManager getInstance() {
            return DigipassManager.f34918a;
        }
    }

    /* JADX INFO: compiled from: DigipassManager.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002¨\u0006\u000e"}, d2 = {"Lcom/bbva/library/digipassmanager/DigipassManager$TokenCrontoActivation;", "", "", "validateTokenCronto", "activateTokenCronto", "Lcom/bbva/ethermobilesdk/securesharing/SecureSharing;", "currentStorage", "", "secureChannelMessage", "deviceId", "Lcom/bbva/library/digipassmanager/callbacks/OnDigipassOperation;", "callback", "<init>", "(Lcom/bbva/library/digipassmanager/DigipassManager;Lcom/bbva/ethermobilesdk/securesharing/SecureSharing;Ljava/lang/String;Ljava/lang/String;Lcom/bbva/library/digipassmanager/callbacks/OnDigipassOperation;)V", "digipassmanager-library_release"}, k = 1, mv = {1, 8, 0})
    public final class TokenCrontoActivation {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final SecureSharing f34919a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final String f34920b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final String f34921c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final OnDigipassOperation f34922d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f34923e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f34924f;

        public TokenCrontoActivation(@NotNull DigipassManager digipassManager, @NotNull SecureSharing currentStorage, @NotNull String secureChannelMessage, @NotNull String deviceId, OnDigipassOperation callback) {
            Intrinsics.checkNotNullParameter(currentStorage, "currentStorage");
            Intrinsics.checkNotNullParameter(secureChannelMessage, "secureChannelMessage");
            Intrinsics.checkNotNullParameter(deviceId, "deviceId");
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.f34919a = currentStorage;
            this.f34920b = secureChannelMessage;
            this.f34921c = deviceId;
            this.f34922d = callback;
        }

        public final void activateTokenCronto() throws JSONException {
            String str = this.f34920b;
            OnDigipassOperation onDigipassOperation = this.f34922d;
            SecureSharing secureSharing = this.f34919a;
            String value = secureSharing.getValue(DigipassManagerConstants.STORAGE_STATIC_VECTOR);
            if (value == null) {
                value = "";
            }
            this.f34923e = value;
            String str2 = DigipassManagerConstants.STORAGE_DYNAMIC_VECTOR;
            String value2 = secureSharing.getValue(DigipassManagerConstants.STORAGE_DYNAMIC_VECTOR);
            this.f34924f = value2 != null ? value2 : "";
            try {
                SecureChannelParseResponse secureChannelMessage = DigipassSDK.parseSecureChannelMessage(str);
                try {
                    if (secureChannelMessage.getReturnCode() == 0) {
                        VectorConverter vectorConverter = VectorConverter.INSTANCE;
                        String str3 = this.f34923e;
                        if (str3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("staticVector");
                            str3 = null;
                        }
                        byte[] bArrStringToByteArray = vectorConverter.stringToByteArray(str3);
                        String str4 = this.f34924f;
                        if (str4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("dynamicVector");
                            str4 = null;
                        }
                        try {
                            ActivationResponse activationResponseMultiDeviceActivateInstance = DigipassSDK.multiDeviceActivateInstance(bArrStringToByteArray, vectorConverter.stringToByteArray(str4), secureChannelMessage.getMessage(), "", this.f34921c);
                            if (activationResponseMultiDeviceActivateInstance.getReturnCode() == 0) {
                                byte[] dynamicVector = activationResponseMultiDeviceActivateInstance.getDynamicVector();
                                Intrinsics.checkNotNullExpressionValue(dynamicVector, "activationResponse.dynamicVector");
                                String strByteArrayToString = vectorConverter.byteArrayToString(dynamicVector);
                                this.f34924f = strByteArrayToString;
                                if (strByteArrayToString == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("dynamicVector");
                                    strByteArrayToString = null;
                                }
                                byte[] bArrStringToByteArray2 = vectorConverter.stringToByteArray(strByteArrayToString);
                                String str5 = this.f34924f;
                                if (str5 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("dynamicVector");
                                    str5 = null;
                                }
                                secureSharing.putValue(DigipassManagerConstants.STORAGE_DYNAMIC_VECTOR, str5);
                                GenerationResponse generationResponseGenerateSignatureFromSecureChannelMessage = DigipassSDK.generateSignatureFromSecureChannelMessage(bArrStringToByteArray, bArrStringToByteArray2, DigipassSDK.parseSecureChannelMessage(str).getMessage(), "", 0L, 4, this.f34921c);
                                byte[] dynamicVector2 = generationResponseGenerateSignatureFromSecureChannelMessage.getDynamicVector();
                                Intrinsics.checkNotNullExpressionValue(dynamicVector2, "generationResponse.dynamicVector");
                                secureSharing.putValue(DigipassManagerConstants.STORAGE_DYNAMIC_VECTOR, vectorConverter.byteArrayToString(dynamicVector2));
                                JSONObject jSONObject = new JSONObject();
                                if (generationResponseGenerateSignatureFromSecureChannelMessage.getReturnCode() == 0) {
                                    jSONObject.put(DigipassManagerConstants.KEY_OPERATION_CODE, DigipassManagerConstants.OPERATION_CODE_ACTIVATE_TOKEN_HASH);
                                    jSONObject.put(DigipassManagerConstants.TOKEN_CODE, generationResponseGenerateSignatureFromSecureChannelMessage.getResponse());
                                    onDigipassOperation.onOperationComplete(jSONObject);
                                } else {
                                    jSONObject.put(DigipassManagerConstants.KEY_OPERATION_CODE, DigipassManagerConstants.OPERATION_CODE_ACTIVATE_TOKEN_HASH);
                                    jSONObject.put(DigipassManagerConstants.KEY_TYPE_ERROR, DigipassManagerConstants.DIGIPASS_LIBRARY_ERROR);
                                    String messageForReturnCode = DigipassSDK.getMessageForReturnCode(secureChannelMessage.getReturnCode());
                                    str2 = DigipassManagerConstants.KEY_INFO_ERROR;
                                    jSONObject.put(str2, messageForReturnCode);
                                    onDigipassOperation.onOperationFailure(jSONObject);
                                }
                            } else {
                                str2 = DigipassManagerConstants.KEY_INFO_ERROR;
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put(DigipassManagerConstants.KEY_OPERATION_CODE, DigipassManagerConstants.OPERATION_CODE_ACTIVATE_TOKEN_HASH);
                                jSONObject2.put(DigipassManagerConstants.KEY_TYPE_ERROR, DigipassManagerConstants.DIGIPASS_LIBRARY_ERROR);
                                jSONObject2.put(str2, DigipassSDK.getMessageForReturnCode(secureChannelMessage.getReturnCode()));
                                onDigipassOperation.onOperationFailure(jSONObject2);
                            }
                        } catch (NoClassDefFoundError unused) {
                            str2 = DigipassManagerConstants.KEY_INFO_ERROR;
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put(DigipassManagerConstants.KEY_OPERATION_CODE, DigipassManagerConstants.OPERATION_CODE_ACTIVATE_TOKEN_HASH);
                            jSONObject3.put(DigipassManagerConstants.KEY_TYPE_ERROR, DigipassManagerConstants.DIGIPASS_IMPLEMENTATION_ERROR);
                            jSONObject3.put(str2, DigipassManagerConstants.MESSAGE_DIGIPASS_IMPLEMENTATION_ERROR);
                            onDigipassOperation.onOperationFailure(jSONObject3);
                        }
                    } else {
                        str2 = DigipassManagerConstants.KEY_INFO_ERROR;
                        JSONObject jSONObject4 = new JSONObject();
                        jSONObject4.put(DigipassManagerConstants.KEY_OPERATION_CODE, DigipassManagerConstants.OPERATION_CODE_ACTIVATE_TOKEN_HASH);
                        jSONObject4.put(DigipassManagerConstants.KEY_TYPE_ERROR, DigipassManagerConstants.DIGIPASS_LIBRARY_ERROR);
                        jSONObject4.put(str2, DigipassSDK.getMessageForReturnCode(secureChannelMessage.getReturnCode()));
                        onDigipassOperation.onOperationFailure(jSONObject4);
                    }
                } catch (NoClassDefFoundError unused2) {
                }
            } catch (NoClassDefFoundError unused3) {
                str2 = DigipassManagerConstants.KEY_INFO_ERROR;
            }
        }

        public final void validateTokenCronto() throws JSONException {
            SecureSharing secureSharing = this.f34919a;
            OnDigipassOperation onDigipassOperation = this.f34922d;
            try {
                SecureChannelParseResponse secureChannelMessage = DigipassSDK.parseSecureChannelMessage(this.f34920b);
                if (secureChannelMessage.getReturnCode() != 0) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(DigipassManagerConstants.KEY_OPERATION_CODE, DigipassManagerConstants.OPERATION_CODE_VALIDATE_TOKEN_HASH);
                    jSONObject.put(DigipassManagerConstants.KEY_TYPE_ERROR, DigipassManagerConstants.DIGIPASS_LIBRARY_ERROR);
                    jSONObject.put(DigipassManagerConstants.KEY_INFO_ERROR, DigipassSDK.getMessageForReturnCode(secureChannelMessage.getReturnCode()));
                    onDigipassOperation.onOperationFailure(jSONObject);
                    return;
                }
                this.f34923e = DigipassManagerConstants.STATIC_VECTOR_BASE;
                try {
                    SecureChannelMessage message = secureChannelMessage.getMessage();
                    String str = this.f34923e;
                    if (str == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("staticVector");
                        str = null;
                    }
                    MultiDeviceLicenseActivationResponse multiDeviceLicenseActivationResponseMultiDeviceActivateLicense = DigipassSDK.multiDeviceActivateLicense(message, str, this.f34921c, (byte) 0, 0L);
                    int returnCode = multiDeviceLicenseActivationResponseMultiDeviceActivateLicense.getReturnCode();
                    JSONObject jSONObject2 = new JSONObject();
                    if (returnCode != 0) {
                        jSONObject2.put(DigipassManagerConstants.KEY_OPERATION_CODE, DigipassManagerConstants.OPERATION_CODE_VALIDATE_TOKEN_HASH);
                        jSONObject2.put(DigipassManagerConstants.KEY_TYPE_ERROR, DigipassManagerConstants.DIGIPASS_LIBRARY_ERROR);
                        jSONObject2.put(DigipassManagerConstants.KEY_INFO_ERROR, DigipassSDK.getMessageForReturnCode(multiDeviceLicenseActivationResponseMultiDeviceActivateLicense.getReturnCode()));
                        onDigipassOperation.onOperationFailure(jSONObject2);
                        return;
                    }
                    jSONObject2.put(DigipassManagerConstants.KEY_OPERATION_CODE, DigipassManagerConstants.OPERATION_CODE_VALIDATE_TOKEN_HASH);
                    jSONObject2.put(DigipassManagerConstants.KEY_DEVICE_CODE, multiDeviceLicenseActivationResponseMultiDeviceActivateLicense.getDeviceCode());
                    VectorConverter vectorConverter = VectorConverter.INSTANCE;
                    byte[] staticVector = multiDeviceLicenseActivationResponseMultiDeviceActivateLicense.getStaticVector();
                    Intrinsics.checkNotNullExpressionValue(staticVector, "multiDeviceActivateLicenseResponse.staticVector");
                    secureSharing.putValue(DigipassManagerConstants.STORAGE_STATIC_VECTOR, vectorConverter.byteArrayToString(staticVector));
                    byte[] dynamicVector = multiDeviceLicenseActivationResponseMultiDeviceActivateLicense.getDynamicVector();
                    Intrinsics.checkNotNullExpressionValue(dynamicVector, "multiDeviceActivateLicenseResponse.dynamicVector");
                    secureSharing.putValue(DigipassManagerConstants.STORAGE_DYNAMIC_VECTOR, vectorConverter.byteArrayToString(dynamicVector));
                    onDigipassOperation.onOperationComplete(jSONObject2);
                } catch (NoClassDefFoundError unused) {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put(DigipassManagerConstants.KEY_OPERATION_CODE, DigipassManagerConstants.OPERATION_CODE_VALIDATE_TOKEN_HASH);
                    jSONObject3.put(DigipassManagerConstants.KEY_TYPE_ERROR, DigipassManagerConstants.DIGIPASS_IMPLEMENTATION_ERROR);
                    jSONObject3.put(DigipassManagerConstants.KEY_INFO_ERROR, DigipassManagerConstants.MESSAGE_DIGIPASS_IMPLEMENTATION_ERROR);
                    onDigipassOperation.onOperationFailure(jSONObject3);
                }
            } catch (Exception unused2) {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put(DigipassManagerConstants.KEY_OPERATION_CODE, DigipassManagerConstants.OPERATION_CODE_VALIDATE_TOKEN_HASH);
                jSONObject4.put(DigipassManagerConstants.KEY_TYPE_ERROR, DigipassManagerConstants.DIGIPASS_INTERNAL_ERROR);
                jSONObject4.put(DigipassManagerConstants.KEY_INFO_ERROR, "Internal error");
                onDigipassOperation.onOperationFailure(jSONObject4);
            }
        }
    }

    /* JADX INFO: compiled from: DigipassManager.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\r"}, d2 = {"Lcom/bbva/library/digipassmanager/DigipassManager$TokenCrontoGenerate;", "", "", "generateOtp", "", "deviceId", ClientData.KEY_CHALLENGE, "Lcom/bbva/ethermobilesdk/securesharing/SecureSharing;", "currentStorage", "Lcom/bbva/library/digipassmanager/callbacks/OnGenerateOtpOperation;", "callback", "<init>", "(Lcom/bbva/library/digipassmanager/DigipassManager;Ljava/lang/String;Ljava/lang/String;Lcom/bbva/ethermobilesdk/securesharing/SecureSharing;Lcom/bbva/library/digipassmanager/callbacks/OnGenerateOtpOperation;)V", "digipassmanager-library_release"}, k = 1, mv = {1, 8, 0})
    public final class TokenCrontoGenerate {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f34925a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final String f34926b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final SecureSharing f34927c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final OnGenerateOtpOperation f34928d;

        public TokenCrontoGenerate(@NotNull DigipassManager digipassManager, @NotNull String deviceId, @NotNull String challenge, @NotNull SecureSharing currentStorage, OnGenerateOtpOperation callback) {
            Intrinsics.checkNotNullParameter(deviceId, "deviceId");
            Intrinsics.checkNotNullParameter(challenge, "challenge");
            Intrinsics.checkNotNullParameter(currentStorage, "currentStorage");
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.f34925a = deviceId;
            this.f34926b = challenge;
            this.f34927c = currentStorage;
            this.f34928d = callback;
        }

        /* JADX WARN: Code duplicated, block: B:30:0x008b A[PHI: r10
          0x008b: PHI (r10v10 int) = (r10v9 int), (r10v13 int) binds: [B:25:0x0067, B:27:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
        public final void generateOtp() throws JSONException {
            int returnCode;
            GenerationResponse generationResponseGenerateSignatureFromSecureChannelMessage;
            String str = this.f34926b;
            OnGenerateOtpOperation onGenerateOtpOperation = this.f34928d;
            VectorConverter vectorConverter = VectorConverter.INSTANCE;
            SecureSharing secureSharing = this.f34927c;
            String value = secureSharing.getValue(DigipassManagerConstants.STORAGE_STATIC_VECTOR);
            if (value == null) {
                value = "";
            }
            byte[] bArrStringToByteArray = vectorConverter.stringToByteArray(value);
            String value2 = secureSharing.getValue(DigipassManagerConstants.STORAGE_DYNAMIC_VECTOR);
            byte[] bArrStringToByteArray2 = vectorConverter.stringToByteArray(value2 != null ? value2 : "");
            try {
                if (!(bArrStringToByteArray.length == 0)) {
                    if (!(bArrStringToByteArray2.length == 0)) {
                        if (str.length() == 0) {
                            generationResponseGenerateSignatureFromSecureChannelMessage = DigipassSDK.generateResponseOnly(bArrStringToByteArray, bArrStringToByteArray2, "", 0L, 1, this.f34925a);
                            returnCode = generationResponseGenerateSignatureFromSecureChannelMessage.getReturnCode();
                        } else {
                            SecureChannelParseResponse secureChannelMessage = DigipassSDK.parseSecureChannelMessage(str);
                            returnCode = secureChannelMessage.getReturnCode();
                            if (returnCode == 0) {
                                SecureChannelMessage message = secureChannelMessage.getMessage();
                                returnCode = DigipassSDK.decryptSecureChannelMessageBody(bArrStringToByteArray, bArrStringToByteArray2, message, this.f34925a).getReturnCode();
                                if (returnCode == 0) {
                                    generationResponseGenerateSignatureFromSecureChannelMessage = DigipassSDK.generateSignatureFromSecureChannelMessage(bArrStringToByteArray, bArrStringToByteArray2, message, "", 0L, 4, this.f34925a);
                                    returnCode = generationResponseGenerateSignatureFromSecureChannelMessage.getReturnCode();
                                } else {
                                    generationResponseGenerateSignatureFromSecureChannelMessage = null;
                                }
                            } else {
                                generationResponseGenerateSignatureFromSecureChannelMessage = null;
                            }
                        }
                        if (returnCode != 0) {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put(DigipassManagerConstants.KEY_OPERATION_CODE, DigipassManagerConstants.OPERATION_CODE_GENERATE_OTP);
                            jSONObject.put(DigipassManagerConstants.KEY_RESPONSE, DigipassSDK.getMessageForReturnCode(returnCode));
                            onGenerateOtpOperation.onGenerationFailure(jSONObject);
                            return;
                        }
                        if (generationResponseGenerateSignatureFromSecureChannelMessage != null) {
                            byte[] dynamicVector = generationResponseGenerateSignatureFromSecureChannelMessage.getDynamicVector();
                            Intrinsics.checkNotNullExpressionValue(dynamicVector, "generationResponse.dynamicVector");
                            secureSharing.putValue(DigipassManagerConstants.STORAGE_DYNAMIC_VECTOR, vectorConverter.byteArrayToString(dynamicVector));
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put(DigipassManagerConstants.KEY_OPERATION_CODE, DigipassManagerConstants.OPERATION_CODE_GENERATE_OTP);
                            jSONObject2.put(DigipassManagerConstants.KEY_RESPONSE, generationResponseGenerateSignatureFromSecureChannelMessage.getResponse());
                            onGenerateOtpOperation.onGenerationComplete(jSONObject2);
                            return;
                        }
                        return;
                    }
                }
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put(DigipassManagerConstants.KEY_OPERATION_CODE, DigipassManagerConstants.OPERATION_CODE_GENERATE_OTP);
                jSONObject3.put(DigipassManagerConstants.KEY_TYPE_ERROR, DigipassManagerConstants.DIGIPASS_NOT_ACTIVATED);
                jSONObject3.put(DigipassManagerConstants.KEY_INFO_ERROR, DigipassManagerConstants.MESSAGE_DIGIPASS_NOT_ACTIVATED);
                onGenerateOtpOperation.onGenerationFailure(jSONObject3);
            } catch (Exception unused) {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put(DigipassManagerConstants.KEY_OPERATION_CODE, DigipassManagerConstants.OPERATION_CODE_GENERATE_OTP);
                jSONObject4.put(DigipassManagerConstants.KEY_TYPE_ERROR, DigipassManagerConstants.DIGIPASS_INTERNAL_ERROR);
                jSONObject4.put(DigipassManagerConstants.KEY_INFO_ERROR, "Internal error");
                onGenerateOtpOperation.onGenerationFailure(jSONObject4);
            }
        }
    }

    /* JADX INFO: compiled from: DigipassManager.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\n"}, d2 = {"Lcom/bbva/library/digipassmanager/DigipassManager$TokenCrontoMaintenance;", "", "", "delete", "Lcom/bbva/ethermobilesdk/securesharing/SecureSharing;", "currentStorage", "Lcom/bbva/library/digipassmanager/callbacks/OnDeleteTokenCronto;", "callback", "<init>", "(Lcom/bbva/library/digipassmanager/DigipassManager;Lcom/bbva/ethermobilesdk/securesharing/SecureSharing;Lcom/bbva/library/digipassmanager/callbacks/OnDeleteTokenCronto;)V", "digipassmanager-library_release"}, k = 1, mv = {1, 8, 0})
    public final class TokenCrontoMaintenance {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final SecureSharing f34929a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final OnDeleteTokenCronto f34930b;

        public TokenCrontoMaintenance(@NotNull DigipassManager digipassManager, @NotNull SecureSharing currentStorage, OnDeleteTokenCronto callback) {
            Intrinsics.checkNotNullParameter(currentStorage, "currentStorage");
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.f34929a = currentStorage;
            this.f34930b = callback;
        }

        public final void delete() {
            OnDeleteTokenCronto onDeleteTokenCronto = this.f34930b;
            SecureSharing secureSharing = this.f34929a;
            try {
                secureSharing.removeKey(DigipassManagerConstants.STORAGE_STATIC_VECTOR);
                secureSharing.removeKey(DigipassManagerConstants.STORAGE_DYNAMIC_VECTOR);
                onDeleteTokenCronto.onComplete(true);
            } catch (Exception unused) {
                onDeleteTokenCronto.onComplete(false);
            }
        }
    }

    /* JADX INFO: compiled from: DigipassManager.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\u001c\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¨\u0006\r"}, d2 = {"Lcom/bbva/library/digipassmanager/DigipassManager$TokenCrontoQRScanner;", "", "(Lcom/bbva/library/digipassmanager/DigipassManager;)V", "getQRCodeScannerTarget", "Ljava/lang/Class;", "Lcom/vasco/digipass/sdk/utils/qrcodescanner/QRCodeScannerSDKActivity;", "openScanner", "", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "Landroid/app/Activity;", "activityResultLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "digipassmanager-library_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class TokenCrontoQRScanner {
        public TokenCrontoQRScanner(DigipassManager digipassManager) {
        }

        @NotNull
        public final Class<QRCodeScannerSDKActivity> getQRCodeScannerTarget() {
            return QRCodeScannerSDKActivity.class;
        }

        public final void openScanner(@NotNull Activity activity, @NotNull ActivityResultLauncher<Intent> activityResultLauncher) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(activityResultLauncher, "activityResultLauncher");
            Intent intent = new Intent(activity, (Class<?>) QRCodeScannerSDKActivity.class);
            intent.putExtra("extra_vibrate", true);
            intent.putExtra("extra_code_type", 3);
            activityResultLauncher.launch(intent);
        }
    }

    public final void activateTokenCrontoHash(@NotNull SecureSharing storage, @NotNull String secureChannelMessage, @NotNull String deviceId, @NotNull OnDigipassOperation callback) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(secureChannelMessage, "secureChannelMessage");
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(callback, "callback");
        new TokenCrontoActivation(this, storage, secureChannelMessage, deviceId, callback).activateTokenCronto();
    }

    public final void generateOtpTokenCronto(@NotNull String deviceId, @NotNull String challenge, @NotNull SecureSharing storage, @NotNull OnGenerateOtpOperation callback) {
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(challenge, "challenge");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(callback, "callback");
        new TokenCrontoGenerate(this, deviceId, challenge, storage, callback).generateOtp();
    }

    public final void validateTokenCrontoHash(@NotNull SecureSharing storage, @NotNull String secureChannelMessage, @NotNull String deviceId, @NotNull OnDigipassOperation callback) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(secureChannelMessage, "secureChannelMessage");
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(callback, "callback");
        new TokenCrontoActivation(this, storage, secureChannelMessage, deviceId, callback).validateTokenCronto();
    }
}
