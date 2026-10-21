package com.bbva.tohu.android.product.valkyria.sdk.payments.paywave;

import com.bbva.tohu.android.product.valkyria.sdk.auth.DeviceAuth;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.pojo.IccCrtPrivateKey;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.pojo.VtsCardProfile;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.utils.FileUtils;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.utils.HexUtils;
import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.interfaces.RSAPrivateKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.RSAPrivateCrtKeySpec;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class PaymentApplicationContext {
    private static boolean CDCVM_Verified = false;
    private static final String DEFAULT_PUBLIC_EXPONENT_HEX = "03";
    private static String api = null;
    public static ApplicationStatus applicationStatus = null;
    private static short atc = 1;
    public static VtsCardProfile cardProfile;
    private static String consumerVerificationType;
    private static String cvmVerifyingEntity;
    private static String dki;
    public static List returnedPartialAids;

    /* JADX INFO: renamed from: sc, reason: collision with root package name */
    private static int f36929sc;
    private static String testCvr_CDCVM;
    private static String transactionCredentialId;

    public static String getApi() {
        return api;
    }

    public static short getAtc() {
        return atc;
    }

    @Deprecated
    public static String getCvmVerifiedType() {
        return consumerVerificationType;
    }

    @Deprecated
    public static String getCvmVerifyingEntity() {
        return cvmVerifyingEntity;
    }

    public static String getDki() {
        return dki;
    }

    public static String getPan() {
        return cardProfile.getToken();
    }

    public static RSAPrivateKey getRsaKey() {
        IccCrtPrivateKey iccCRTPrivateKey = cardProfile.getIccCRTPrivateKey();
        try {
            return (RSAPrivateKey) KeyFactory.getInstance("RSA").generatePrivate(new RSAPrivateCrtKeySpec(new BigInteger(iccCRTPrivateKey.getModulus(), 16), new BigInteger(DEFAULT_PUBLIC_EXPONENT_HEX, 16), new BigInteger(iccCRTPrivateKey.getExponent(), 16), new BigInteger(iccCRTPrivateKey.getPrimeP(), 16), new BigInteger(iccCRTPrivateKey.getPrimeQ(), 16), new BigInteger(iccCRTPrivateKey.getCoefDmodP(), 16), new BigInteger(iccCRTPrivateKey.getCoefDmodQ(), 16), new BigInteger(iccCRTPrivateKey.getCoefQinvModP(), 16)));
        } catch (NoSuchAlgorithmException e5) {
            e5.printStackTrace();
            return null;
        } catch (InvalidKeySpecException e7) {
            e7.printStackTrace();
            return null;
        }
    }

    public static int getSc() {
        return f36929sc;
    }

    public static String getTestCvr_CDCVM() {
        return testCvr_CDCVM;
    }

    public static String getTransactionCredentialId() {
        return transactionCredentialId;
    }

    public static void incAtc() {
        atc = (short) (atc + 1);
    }

    private static boolean isBitActive(byte b10, byte b11) {
        return (b10 & b11) == b11;
    }

    @Deprecated
    public static boolean isCDCVM_Verified() {
        return CDCVM_Verified;
    }

    public static void reset() {
        new FileUtils();
        atc = (short) 1;
        applicationStatus.setStatus(ApplicationStatus.STATUS_READY_TO_PAY);
        returnedPartialAids = new ArrayList();
        f36929sc = 1;
        api = null;
    }

    public static void setApi(String str) {
        api = str;
    }

    public static void setAtc(short s4) {
        atc = s4;
    }

    public static void setCDCVM_Verified(boolean z10) {
        CDCVM_Verified = z10;
    }

    @Deprecated
    public static void setConsumerVerificationType(String str) {
        consumerVerificationType = str;
    }

    @Deprecated
    public static void setCvmVerifyingEntity(String str) {
        cvmVerifyingEntity = str;
    }

    public static void setDki(String str) {
        dki = str;
    }

    public static void setSc(int i10) {
        f36929sc = i10;
    }

    public static void setTestCvr_CDCVM(String str) {
        testCvr_CDCVM = str;
        if (str != null) {
            byte b10 = HexUtils.byteArrayFromHexString(str)[0];
            if (isBitActive(b10, (byte) 3)) {
                setConsumerVerificationType(DeviceAuth.CVM_VERIFIED_TYPE_MOBILE_DEVICE_PATTERN);
            } else if (isBitActive(b10, (byte) 2)) {
                setConsumerVerificationType(DeviceAuth.CVM_VERIFIED_TYPE_BIOMETRIC_FINGERPRINT);
            } else if (isBitActive(b10, (byte) 1)) {
                setConsumerVerificationType(DeviceAuth.CVM_VERIFIED_TYPE_PASSCODE);
            } else {
                setConsumerVerificationType(DeviceAuth.CVM_VERIFIED_TYPE_NO_CDCVM);
            }
            if (isBitActive(b10, (byte) -128)) {
                setCvmVerifyingEntity(DeviceAuth.CVM_VERIFYING_ENTITY_VERIFIED_IN_MOBILE_DEVICE_OS);
            } else if (isBitActive(b10, Constants.CVR_B1b85_0111_VERIFIED_CLOUD)) {
                setCvmVerifyingEntity(DeviceAuth.CVM_VERIFYING_ENTITY_VERIFIED_IN_CLOUD);
            } else if (isBitActive(b10, Constants.CVR_B1b85_0110_TERMINAL)) {
                setCvmVerifyingEntity(DeviceAuth.CVM_VERIFYING_ENTITY_TERMINAL);
            } else if (isBitActive(b10, Constants.CVR_B1b85_0101_MOBILE_APP)) {
                setCvmVerifyingEntity(DeviceAuth.CVM_VERIFYING_ENTITY_MOBILE_APPLICATION);
            } else if (isBitActive(b10, (byte) 64)) {
                setCvmVerifyingEntity(DeviceAuth.CVM_VERIFYING_ENTITY_TEE_APP);
            } else if (isBitActive(b10, (byte) 48)) {
                setCvmVerifyingEntity(DeviceAuth.CVM_VERIFYING_ENTITY_CO_RESIDING_SE_APP);
            } else if (isBitActive(b10, (byte) 32)) {
                setCvmVerifyingEntity(DeviceAuth.CVM_VERIFYING_ENTITY_MG);
            } else if (isBitActive(b10, (byte) 16)) {
                setCvmVerifyingEntity(DeviceAuth.CVM_VERIFYING_ENTITY_VMPA);
            } else {
                setCvmVerifyingEntity(DeviceAuth.CVM_VERIFYING_ENTITY_NO_CDCVM_VERIFIED);
            }
        }
        testCvr_CDCVM = null;
    }

    public static void setTransactionCredentialId(String str) {
        transactionCredentialId = str;
    }
}
