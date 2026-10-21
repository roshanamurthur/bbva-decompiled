package com.mastercard.mpsdk.mcbp.mcmlite.impl.output;

import com.mastercard.mpsdk.mcbp.mcmlite.exceptions.McmLiteInvalidInput;
import com.mastercard.mpsdk.mcbp.mcmlite.utils.McmLiteUtils;
import java.nio.charset.Charset;
import java.security.NoSuchAlgorithmException;
import java.util.LinkedList;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class TransactionIdentifier {
    private static final /* synthetic */ TransactionIdentifier[] $VALUES;
    public static final TransactionIdentifier INSTANCE;

    static {
        TransactionIdentifier transactionIdentifier = new TransactionIdentifier("INSTANCE", 0);
        INSTANCE = transactionIdentifier;
        $VALUES = new TransactionIdentifier[]{transactionIdentifier};
    }

    public TransactionIdentifier() {
        throw null;
    }

    public static byte[] a(byte[] bArr) {
        byte[] bArrSha256;
        try {
            bArrSha256 = McmLiteUtils.sha256(bArr);
        } catch (NoSuchAlgorithmException unused) {
            bArrSha256 = null;
        }
        if (bArrSha256 == null) {
            return null;
        }
        byte[] bArr2 = new byte[16];
        System.arraycopy(bArrSha256, bArrSha256.length - 16, bArr2, 0, 16);
        return bArr2;
    }

    public static byte[] generateDsrpWithUcafTransactionIdentifier(byte[] bArr, byte[] bArr2) throws McmLiteInvalidInput {
        if (bArr == null) {
            throw new McmLiteInvalidInput("Pan is null");
        }
        if (bArr2 == null) {
            throw new McmLiteInvalidInput("Ucaf is null");
        }
        if (bArr.length < 9 || bArr.length > 19) {
            throw new McmLiteInvalidInput("Pan length should be in between 9 to 19");
        }
        boolean z10 = bArr.length % 2 != 0;
        byte[] bArr3 = z10 ? new byte[(bArr.length / 2) + 1] : new byte[bArr.length / 2];
        int i10 = 0;
        for (int i11 = 0; i11 < bArr.length; i11 += 2) {
            byte b10 = (byte) ((bArr[i11] << 4) & 240);
            bArr3[i10] = (byte) ((z10 && bArr.length - i11 == 1) ? b10 | 15 : b10 | ((byte) (bArr[i11 + 1] & 15)));
            i10++;
        }
        byte[] bArrByteArrayFromHexString = McmLiteUtils.byteArrayFromHexString(McmLiteUtils.byteArrayToHexString(McmLiteUtils.byteArrayFromBase64String(new String(bArr2, Charset.defaultCharset()))));
        byte[] bArr4 = new byte[bArr3.length + bArrByteArrayFromHexString.length];
        System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
        System.arraycopy(bArrByteArrayFromHexString, 0, bArr4, bArr3.length, bArrByteArrayFromHexString.length);
        try {
            return McmLiteUtils.sha256(bArr4);
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public static byte[] getMChip(byte[] bArr, byte[] bArr2, byte[] bArr3) throws McmLiteInvalidInput {
        if (bArr == null) {
            throw new McmLiteInvalidInput("Pan is null");
        }
        if (bArr2 == null) {
            throw new McmLiteInvalidInput("Atc is null");
        }
        if (bArr3 == null) {
            throw new McmLiteInvalidInput("Application Cryptogram is null");
        }
        if (bArr.length < 9 || bArr.length > 19) {
            throw new McmLiteInvalidInput("Pan length should be in between 9 to 19");
        }
        boolean z10 = bArr.length % 2 != 0;
        byte[] bArr4 = z10 ? new byte[(bArr.length / 2) + 1] : new byte[bArr.length / 2];
        int i10 = 0;
        for (int i11 = 0; i11 < bArr.length; i11 += 2) {
            byte b10 = (byte) ((bArr[i11] << 4) & 240);
            bArr4[i10] = (byte) ((z10 && bArr.length - i11 == 1) ? b10 | 15 : b10 | ((byte) (bArr[i11 + 1] & 15)));
            i10++;
        }
        LinkedList linkedList = new LinkedList();
        linkedList.add(bArr4);
        linkedList.add(bArr2);
        linkedList.add(bArr3);
        try {
            return McmLiteUtils.sha256(McmLiteUtils.concatenateArrays(linkedList));
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public static byte[] getMagstripe(byte[] bArr, byte[] bArr2) throws McmLiteInvalidInput {
        if ((bArr == null || bArr.length == 0) && (bArr2 == null || bArr2.length == 0)) {
            return null;
        }
        if (bArr == null || bArr.length == 0) {
            byte[] bArrA = a(bArr2);
            byte[] bArr3 = new byte[32];
            System.arraycopy(bArrA, 0, bArr3, 16, 16);
            return bArr3;
        }
        if (bArr2 == null || bArr2.length == 0) {
            byte[] bArr4 = new byte[32];
            System.arraycopy(a(bArr), 0, bArr4, 0, 16);
            return bArr4;
        }
        byte[] bArrA2 = a(bArr);
        byte[] bArrA3 = a(bArr2);
        if (bArrA2 == null || bArrA3 == null) {
            return null;
        }
        byte[] bArr5 = new byte[bArrA2.length + bArrA3.length];
        System.arraycopy(bArrA2, 0, bArr5, 0, bArrA2.length);
        System.arraycopy(bArrA3, 0, bArr5, bArrA2.length, bArrA3.length);
        return bArr5;
    }

    public static TransactionIdentifier valueOf(String str) {
        return (TransactionIdentifier) Enum.valueOf(TransactionIdentifier.class, str);
    }

    public static TransactionIdentifier[] values() {
        return (TransactionIdentifier[]) $VALUES.clone();
    }
}
