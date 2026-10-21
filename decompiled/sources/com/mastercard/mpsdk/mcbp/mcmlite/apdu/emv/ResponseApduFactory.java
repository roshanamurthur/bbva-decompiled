package com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv;

import com.mastercard.mpsdk.mcbp.mcmlite.apdu.Iso7816;
import com.mastercard.mpsdk.mcbp.mcmlite.exceptions.McmLiteInvalidInput;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class ResponseApduFactory {
    private static final /* synthetic */ ResponseApduFactory[] $VALUES;
    public static final ResponseApduFactory INSTANCE;

    static {
        ResponseApduFactory responseApduFactory = new ResponseApduFactory("INSTANCE", 0);
        INSTANCE = responseApduFactory;
        $VALUES = new ResponseApduFactory[]{responseApduFactory};
    }

    public ResponseApduFactory() {
        throw null;
    }

    public static byte[] classNotSupported() {
        return of(Iso7816.SW_CLA_NOT_SUPPORTED);
    }

    public static byte[] conditionsOfUseNotSatisfied() {
        return of(Iso7816.SW_CONDITIONS_NOT_SATISFIED);
    }

    public static byte[] fileNotFound() {
        return of(Iso7816.SW_FILE_NOT_FOUND);
    }

    public static byte[] instructionCodeNotSupported() {
        return of(Iso7816.SW_INS_NOT_SUPPORTED);
    }

    public static byte[] of(char c10) {
        return new byte[]{(byte) ((65280 & c10) >> 8), (byte) (c10 & 255)};
    }

    public static byte[] recordNotFound() {
        return of(Iso7816.SW_RECORD_NOT_FOUND);
    }

    public static byte[] securityStatusNotSatisfied() {
        return of(Iso7816.SW_SECURITY_STATUS_NOT_SATISFIED);
    }

    public static byte[] softwareUnknown() {
        return of(Iso7816.SW_UNKNOWN);
    }

    public static byte[] successfulProcessing(byte[] bArr) throws McmLiteInvalidInput {
        return of(bArr, Iso7816.SW_NO_ERROR);
    }

    public static ResponseApduFactory valueOf(String str) {
        return (ResponseApduFactory) Enum.valueOf(ResponseApduFactory.class, str);
    }

    public static ResponseApduFactory[] values() {
        return (ResponseApduFactory[]) $VALUES.clone();
    }

    public static byte[] wrongDataLength() {
        return of(Iso7816.SW_WRONG_LENGTH);
    }

    public static byte[] wrongParameterP1P2() {
        return of(Iso7816.SW_INCORRECT_P1P2);
    }

    public static byte[] of(byte[] bArr, byte[] bArr2) throws McmLiteInvalidInput {
        if (bArr == null || bArr2 == null || bArr2.length != 2) {
            throw new McmLiteInvalidInput("Invalid APDU value or statusWord");
        }
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }

    public static byte[] of(byte[] bArr, char c10) throws McmLiteInvalidInput {
        return of(bArr, new byte[]{(byte) ((65280 & c10) >> 8), (byte) (c10 & 255)});
    }
}
