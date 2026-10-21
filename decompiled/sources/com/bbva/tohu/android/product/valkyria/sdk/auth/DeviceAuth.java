package com.bbva.tohu.android.product.valkyria.sdk.auth;

import com.bbva.tohu.android.core.utils.DeviceInfo;

/* JADX INFO: loaded from: classes6.dex */
public class DeviceAuth {
    public static final String CVM_VERIFIED_TYPE_BIOMETRIC_FINGERPRINT = "CVM_VERIFIED_TYPE_BIOMETRIC_FINGERPRINT";
    public static final String CVM_VERIFIED_TYPE_MOBILE_DEVICE_PATTERN = "CVM_VERIFIED_TYPE_MOBILE_DEVICE_PATTERN";
    public static final String CVM_VERIFIED_TYPE_NO_CDCVM = "CVM.VERIFIED_TYPE.NO_CDCVM";
    public static final String CVM_VERIFIED_TYPE_PASSCODE = "CVM_VERIFIED_TYPE_PASSCODE";
    public static final String CVM_VERIFYING_ENTITY_CO_RESIDING_SE_APP = "CVM_VERIFYING_ENTITY_CO_RESIDING_SE_APP";
    public static final String CVM_VERIFYING_ENTITY_MG = "CVM_VERIFYING_ENTITY_MG";
    public static final String CVM_VERIFYING_ENTITY_MOBILE_APPLICATION = "CVM_VERIFYING_ENTITY_MOBILE_APPLICATION";
    public static final String CVM_VERIFYING_ENTITY_NO_CDCVM_VERIFIED = "CVM_VERIFYING_ENTITY_NO_CDCVM_VERIFIED";
    public static final String CVM_VERIFYING_ENTITY_TEE_APP = "CVM_VERIFYING_ENTITY_TEE_APP";
    public static final String CVM_VERIFYING_ENTITY_TERMINAL = "CVM_VERIFYING_ENTITY_TERMINAL";
    public static final String CVM_VERIFYING_ENTITY_VERIFIED_IN_CLOUD = "CVM_VERIFYING_ENTITY_VERIFIED_IN_CLOUD";
    public static final String CVM_VERIFYING_ENTITY_VERIFIED_IN_MOBILE_DEVICE_OS = "CVM_VERIFYING_ENTITY_VERIFIED_IN_MOBILE_DEVICE_OS";
    public static final String CVM_VERIFYING_ENTITY_VMPA = "CVM_VERIFYING_ENTITY_VMPA";
    private static final String TAG = "DeviceAuth";
    private final DeviceInfo deviceInfo;

    public DeviceAuth(DeviceInfo deviceInfo) {
        this.deviceInfo = deviceInfo;
    }

    public String getConsumerVerificationType() {
        return !this.deviceInfo.isDeviceLocked() ? CVM_VERIFIED_TYPE_MOBILE_DEVICE_PATTERN : CVM_VERIFIED_TYPE_NO_CDCVM;
    }

    public String getVerifyingEntity() {
        return !this.deviceInfo.isDeviceLocked() ? CVM_VERIFYING_ENTITY_VERIFIED_IN_MOBILE_DEVICE_OS : CVM_VERIFYING_ENTITY_NO_CDCVM_VERIFIED;
    }
}
