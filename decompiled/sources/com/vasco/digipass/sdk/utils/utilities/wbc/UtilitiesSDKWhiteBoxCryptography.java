package com.vasco.digipass.sdk.utils.utilities.wbc;

import com.vasco.digipass.sdk.utils.utilities.UtilitiesSDKCryptoResponse;
import com.vasco.digipass.sdk.utils.utilities.UtilitiesSDKException;
import com.vasco.digipass.sdk.utils.utilities.UtilitiesSDKReturnCodes;
import cz.muni.fi.xklinex.whiteboxAES.AES;
import cz.muni.fi.xklinex.whiteboxAES.State;
import cz.muni.fi.xklinex.whiteboxAES.generator.ExternalBijections;
import java.util.Arrays;

/* JADX INFO: loaded from: classes9.dex */
public class UtilitiesSDKWhiteBoxCryptography {
    private UtilitiesSDKWhiteBoxCryptography() {
    }

    private static void a(byte[] bArr) throws UtilitiesSDKException {
        if (bArr == null) {
            throw new UtilitiesSDKException(UtilitiesSDKReturnCodes.INPUT_DATA_NULL);
        }
        if (bArr.length == 0) {
            throw new UtilitiesSDKException(UtilitiesSDKReturnCodes.INPUT_DATA_INCORRECT_LENGTH);
        }
    }

    private static void b(byte[] bArr) throws UtilitiesSDKException {
        if (bArr == null) {
            throw new UtilitiesSDKException(UtilitiesSDKReturnCodes.INITIAL_VECTOR_NULL);
        }
        if (bArr.length != 16) {
            throw new UtilitiesSDKException(UtilitiesSDKReturnCodes.INITIAL_VECTOR_INCORRECT_LENGTH);
        }
    }

    public static UtilitiesSDKCryptoResponse decryptAESCTR(WBCTable wBCTable, byte[] bArr, byte[] bArr2) {
        return encryptAESCTR(wBCTable, bArr, bArr2);
    }

    public static UtilitiesSDKCryptoResponse decryptAESCTRWithMasterKey(byte[] bArr, byte[] bArr2) {
        return encryptAESCTRWithMasterKey(bArr, bArr2);
    }

    public static UtilitiesSDKCryptoResponse encryptAESBlock(WBCTable wBCTable, byte[] bArr) {
        try {
            a(bArr);
            if (bArr.length != 16) {
                return new UtilitiesSDKCryptoResponse(UtilitiesSDKReturnCodes.INPUT_DATA_INCORRECT_LENGTH);
            }
            a(wBCTable);
            return new UtilitiesSDKCryptoResponse(0, a(wBCTable, true, bArr));
        } catch (UtilitiesSDKException e5) {
            return new UtilitiesSDKCryptoResponse(e5.getReturnErrorCode());
        } catch (Exception unused) {
            return new UtilitiesSDKCryptoResponse(UtilitiesSDKReturnCodes.UNKNOWN_ERROR);
        }
    }

    public static UtilitiesSDKCryptoResponse encryptAESCTR(WBCTable wBCTable, byte[] bArr, byte[] bArr2) {
        try {
            a(bArr2);
            b(bArr);
            a(wBCTable);
            AES aes = new AES();
            aes.setEncrypt(true);
            aes.init(wBCTable);
            byte[] bArr3 = new byte[bArr2.length];
            byte[] bArrCopyOf = Arrays.copyOf(bArr, 16);
            for (int i10 = 0; i10 < bArr2.length; i10 += 16) {
                byte[] bArrA = a(aes, wBCTable.getExternalBijections(), bArrCopyOf);
                for (int i11 = 0; i11 < Math.min(16, bArr2.length - i10); i11++) {
                    int i12 = i10 + i11;
                    bArr3[i12] = (byte) (bArr2[i12] ^ bArrA[i11]);
                }
                for (int i13 = 15; i13 >= 0; i13--) {
                    byte b10 = (byte) (bArrCopyOf[i13] + 1);
                    bArrCopyOf[i13] = b10;
                    if (b10 != 0) {
                        break;
                    }
                }
            }
            return new UtilitiesSDKCryptoResponse(0, bArr3);
        } catch (UtilitiesSDKException e5) {
            return new UtilitiesSDKCryptoResponse(e5.getReturnErrorCode());
        } catch (Exception unused) {
            return new UtilitiesSDKCryptoResponse(UtilitiesSDKReturnCodes.UNKNOWN_ERROR);
        }
    }

    public static UtilitiesSDKCryptoResponse encryptAESCTRWithMasterKey(byte[] bArr, byte[] bArr2) {
        try {
            return encryptAESCTR(new Serializer().deserializeResource("/encrypt_master_key_tables.dat"), bArr, bArr2);
        } catch (UtilitiesSDKException e5) {
            return new UtilitiesSDKCryptoResponse(e5.getReturnErrorCode());
        }
    }

    private static void a(WBCTable wBCTable) throws UtilitiesSDKException {
        if (wBCTable != null) {
            return;
        }
        try {
            throw new UtilitiesSDKException(UtilitiesSDKReturnCodes.WBC_INPUT_ARRAY_INVALID);
        } catch (Exception unused) {
            throw new UtilitiesSDKException(UtilitiesSDKReturnCodes.WBC_INPUT_ARRAY_INVALID);
        }
    }

    private static void a(State state, AES aes, ExternalBijections externalBijections) {
        state.transpose();
        AES.applyExternalEnc(state, externalBijections, true);
        aes.crypt(state);
        AES.applyExternalEnc(state, externalBijections, false);
    }

    private static byte[] a(AES aes, ExternalBijections externalBijections, byte[] bArr) {
        State state = new State(bArr, true, false);
        a(state, aes, externalBijections);
        return state.getState();
    }

    private static byte[] a(WBCTable wBCTable, boolean z10, byte[] bArr) {
        AES aes = new AES();
        aes.setEncrypt(z10);
        aes.init(wBCTable);
        return a(aes, wBCTable.getExternalBijections(), bArr);
    }
}
