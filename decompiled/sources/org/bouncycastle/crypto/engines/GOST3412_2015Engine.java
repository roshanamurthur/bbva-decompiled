package org.bouncycastle.crypto.engines;

import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.ComputeCcCommandApdu;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.GenerateAcResponseApdu;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.GetProcessingOptionsCommandApdu;
import com.noknok.android.client.asm.authenticator.KSUtils;
import com.vasco.digipass.sdk.DigipassSDKConstants;
import com.vasco.digipass.sdk.utils.utilities.UtilitiesSDKConstants;
import com.vierge.pinpadsdk.message.base.MessageUtils;
import kotlin.io.encoding.Base64;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class GOST3412_2015Engine implements BlockCipher {
    protected static final int BLOCK_SIZE = 16;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final byte[] f88432g = {-4, -18, -35, 17, Constants.CVR_B2b65_CLEAR_BITS, 110, 49, 22, -5, -60, -6, -38, 35, -59, 4, 77, -23, Constants.RESP_MSG_TEMPLATE_FORMAT_2, Constants.CVR_B2b8765_1111_APP_DISABLED, -37, -109, 46, -103, -70, 23, 54, -15, -69, 20, -51, Constants.STATE_ERROR, -63, -7, 24, 101, 90, -30, 92, ByteSourceJsonBootstrapper.UTF8_BOM_1, 33, KSUtils.PLAIN_BUFFER, 28, 60, 66, -117, 1, ComputeCcCommandApdu.EXPECTED_P1, 79, 5, -124, 2, -82, -29, GenerateAcResponseApdu.DDA_HEADER, -113, -96, 6, 11, -19, -104, 127, -44, -45, 31, -21, 52, 44, 81, -22, -56, 72, -85, -14, 42, 104, -94, -3, 58, -50, -52, -75, Constants.CVR_B1b85_0111_VERIFIED_CLOUD, Constants.CVR_B1b41_1110_ONLINE_PIN, 86, 8, 12, 118, MessageUtils.MESSAGE_18_DC2, ByteSourceJsonBootstrapper.UTF8_BOM_3, 114, 19, 71, -100, -73, 93, -121, MessageUtils.MESSAGE_21_NAK, -95, -106, 41, 16, 123, -102, -57, -13, -111, 120, Constants.FCI_TEMPLATE, -99, -98, UtilitiesSDKConstants.SRP_LABEL_MAC, -79, 50, 117, 25, Base64.padSymbol, -1, 53, -118, 126, 109, 84, -58, -128, -61, -67, 13, 87, -33, -11, DigipassSDKConstants.SECURE_CHANNEL_MESSAGE_TYPE_INFORMATION_MESSAGE, -87, 62, -88, 67, -55, -41, 121, -42, -10, 124, 34, -71, 3, -32, 15, -20, -34, 122, -108, UtilitiesSDKConstants.SRP_LABEL_ENC, -68, -36, -24, 40, Constants.CVR_B1b85_0101_MOBILE_APP, 78, 51, 10, 74, -89, -105, Constants.CVR_B1b85_0110_TERMINAL, 115, MessageUtils.MESSAGE_30_RS, 0, 98, 68, MessageUtils.MESSAGE_26_SUB, -72, 56, -126, 100, -97, GenerateAcResponseApdu.DAD_ICC_DYNAMIC_DATA_LENGTH, 65, -83, 69, 70, -110, 39, 94, 85, 47, -116, -93, -91, 125, 105, -43, -107, 59, 7, 88, -77, 64, -122, -84, 29, -9, 48, 55, 107, -28, -120, -39, -25, -119, -31, 27, GetProcessingOptionsCommandApdu.COMMAND_TEMPLATE_TAG, 73, 76, 63, -8, -2, -115, 83, -86, -112, -54, -40, -123, Constants.DIRECTORY_ENTRY, 32, 113, 103, -92, 45, 43, 9, 91, -53, -101, 37, -48, -66, -27, 108, 82, 89, -90, 116, -46, -26, -12, -76, Constants.CVR_B2b87_11_RFU, -47, 102, -81, -62, 57, 75, 99, -74};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final byte[] f88433h = {-91, 45, 50, -113, Constants.CVR_B1b41_1110_ONLINE_PIN, 48, 56, Constants.CVR_B2b87_11_RFU, 84, -26, -98, 57, 85, 126, 82, -111, 100, 3, 87, 90, 28, Constants.CVR_B1b85_0110_TERMINAL, 7, 24, 33, 114, -88, -47, 41, -58, -92, 63, -32, 39, -115, 12, -126, -22, -82, -76, -102, 99, 73, -27, 66, -28, MessageUtils.MESSAGE_21_NAK, -73, -56, 6, Constants.CVR_B1b85_0111_VERIFIED_CLOUD, -99, 65, 117, 25, -55, -86, -4, 77, ByteSourceJsonBootstrapper.UTF8_BOM_3, 42, 115, -124, -43, -61, -81, 43, -122, -89, -79, UtilitiesSDKConstants.SRP_LABEL_MAC, 91, 70, -45, -97, -3, -44, 15, -100, 47, -101, 67, ByteSourceJsonBootstrapper.UTF8_BOM_1, -39, 121, -74, 83, 127, -63, Constants.CVR_B2b8765_1111_APP_DISABLED, 35, -25, 37, 94, -75, MessageUtils.MESSAGE_30_RS, -94, -33, -90, -2, -84, 34, -7, -30, 74, -68, 53, -54, -18, 120, 5, 107, 81, -31, 89, -93, -14, 113, 86, 17, GenerateAcResponseApdu.DDA_HEADER, -119, -108, 101, -116, -69, Constants.RESP_MSG_TEMPLATE_FORMAT_2, 60, 123, 40, -85, -46, 49, -34, -60, Constants.STATE_ERROR, -52, Constants.CVR_B2b65_CLEAR_BITS, 118, 44, -72, -40, 46, 54, -37, 105, -77, 20, -107, -66, 98, -95, 59, 22, 102, -23, 92, 108, 109, -83, 55, Constants.DIRECTORY_ENTRY, 75, -71, -29, -70, -15, -96, -123, GetProcessingOptionsCommandApdu.COMMAND_TEMPLATE_TAG, -38, 71, -59, UtilitiesSDKConstants.SRP_LABEL_ENC, 51, -6, -106, Constants.FCI_TEMPLATE, 110, -62, -10, Constants.CVR_B1b85_0101_MOBILE_APP, -1, 93, -87, ComputeCcCommandApdu.EXPECTED_P1, 23, 27, -105, 125, -20, 88, -9, 31, -5, 124, 9, 13, 122, 103, 69, -121, -36, -24, 79, 29, 78, 4, -21, -8, -13, 62, Base64.padSymbol, -67, -118, -120, -35, -51, 11, 19, -104, 2, -109, -128, -112, -48, DigipassSDKConstants.SECURE_CHANNEL_MESSAGE_TYPE_INFORMATION_MESSAGE, 52, -53, -19, -12, -50, -103, 16, 68, 64, -110, 58, 1, GenerateAcResponseApdu.DAD_ICC_DYNAMIC_DATA_LENGTH, MessageUtils.MESSAGE_18_DC2, MessageUtils.MESSAGE_26_SUB, 72, 104, -11, KSUtils.PLAIN_BUFFER, -117, -57, -42, 32, 10, 8, 0, 76, -41, 116};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f88434a = {-108, 32, -123, 16, -62, Constants.CVR_B2b87_11_RFU, 1, -5, 1, Constants.CVR_B2b87_11_RFU, -62, 16, -123, 32, -108, 1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f88435b = 32;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f88436c = 32 / 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[][] f88437d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f88438e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[][] f88439f;

    public GOST3412_2015Engine() {
        byte[][] bArr = new byte[256][];
        for (int i10 = 0; i10 < 256; i10++) {
            bArr[i10] = new byte[256];
            for (int i11 = 0; i11 < 256; i11++) {
                byte[] bArr2 = bArr[i10];
                byte b10 = (byte) i10;
                byte b11 = (byte) i11;
                byte b12 = 0;
                for (byte b13 = 0; b13 < 8 && b10 != 0 && b11 != 0; b13 = (byte) (b13 + 1)) {
                    b12 = (b11 & 1) != 0 ? (byte) (b12 ^ b10) : b12;
                    byte b14 = (byte) (b10 & 128);
                    b10 = (byte) (b10 << 1);
                    if (b14 != 0) {
                        b10 = (byte) (b10 ^ 195);
                    }
                    b11 = (byte) (b11 >> 1);
                }
                bArr2[i11] = b12;
            }
        }
        this.f88439f = bArr;
    }

    public static void b(byte[] bArr, byte[] bArr2) {
        for (int i10 = 0; i10 < bArr.length; i10++) {
            bArr[i10] = (byte) (bArr[i10] ^ bArr2[i10]);
        }
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        b(bArrCopyOf, bArr2);
        for (int i10 = 0; i10 < bArrCopyOf.length; i10++) {
            bArrCopyOf[i10] = f88432g[bArrCopyOf[i10] & 255];
        }
        for (int i11 = 0; i11 < 16; i11++) {
            byte bC = c(bArrCopyOf);
            System.arraycopy(bArrCopyOf, 0, bArrCopyOf, 1, 15);
            bArrCopyOf[0] = bC;
        }
        return bArrCopyOf;
    }

    public final byte c(byte[] bArr) {
        byte b10 = bArr[15];
        for (int i10 = 14; i10 >= 0; i10--) {
            b10 = (byte) (b10 ^ this.f88439f[bArr[i10] & 255][this.f88434a[i10] & 255]);
        }
        return b10;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "GOST3412_2015";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z10, CipherParameters cipherParameters) throws IllegalArgumentException {
        int i10;
        if (!(cipherParameters instanceof KeyParameter)) {
            if (cipherParameters != null) {
                throw new IllegalArgumentException(com.google.android.gms.measurement.internal.a.b(cipherParameters, "invalid parameter passed to GOST3412_2015 init - "));
            }
            return;
        }
        this.f88438e = z10;
        byte[] key = ((KeyParameter) cipherParameters).getKey();
        if (key.length != this.f88435b) {
            throw new IllegalArgumentException("Key length invalid. Key needs to be 32 byte - 256 bit!!!");
        }
        this.f88437d = new byte[10][];
        int i11 = 0;
        while (true) {
            i10 = this.f88436c;
            if (i11 >= 10) {
                break;
            }
            this.f88437d[i11] = new byte[i10];
            i11++;
        }
        byte[] bArr = new byte[i10];
        byte[] bArr2 = new byte[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            byte[][] bArr3 = this.f88437d;
            byte[] bArr4 = bArr3[0];
            byte b10 = key[i12];
            bArr[i12] = b10;
            bArr4[i12] = b10;
            byte[] bArr5 = bArr3[1];
            byte b11 = key[i12 + i10];
            bArr2[i12] = b11;
            bArr5[i12] = b11;
        }
        byte[] bArr6 = new byte[i10];
        for (int i13 = 1; i13 < 5; i13++) {
            for (int i14 = 1; i14 <= 8; i14++) {
                Arrays.clear(bArr6);
                bArr6[15] = (byte) (((i13 - 1) * 8) + i14);
                for (int i15 = 0; i15 < 16; i15++) {
                    byte bC = c(bArr6);
                    System.arraycopy(bArr6, 0, bArr6, 1, 15);
                    bArr6[0] = bC;
                }
                byte[] bArrA = a(bArr6, bArr);
                b(bArrA, bArr2);
                System.arraycopy(bArr, 0, bArr2, 0, i10);
                System.arraycopy(bArrA, 0, bArr, 0, i10);
            }
            int i16 = i13 * 2;
            System.arraycopy(bArr, 0, this.f88437d[i16], 0, i10);
            System.arraycopy(bArr2, 0, this.f88437d[i16 + 1], 0, i10);
        }
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i10, byte[] bArr2, int i11) throws IllegalStateException, DataLengthException {
        if (this.f88437d == null) {
            throw new IllegalStateException("GOST3412_2015 engine not initialised");
        }
        if (i10 + 16 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i11 + 16 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        byte[] bArrCopyOf = new byte[16];
        System.arraycopy(bArr, i10, bArrCopyOf, 0, 16);
        if (this.f88438e) {
            for (int i12 = 0; i12 < 9; i12++) {
                bArrCopyOf = Arrays.copyOf(a(this.f88437d[i12], bArrCopyOf), 16);
            }
            b(bArrCopyOf, this.f88437d[9]);
        } else {
            for (int i13 = 9; i13 > 0; i13--) {
                byte[] bArr3 = this.f88437d[i13];
                byte[] bArrCopyOf2 = Arrays.copyOf(bArr3, bArr3.length);
                b(bArrCopyOf2, bArrCopyOf);
                for (int i14 = 0; i14 < 16; i14++) {
                    byte[] bArr4 = new byte[16];
                    System.arraycopy(bArrCopyOf2, 1, bArr4, 0, 15);
                    bArr4[15] = bArrCopyOf2[0];
                    byte bC = c(bArr4);
                    System.arraycopy(bArrCopyOf2, 1, bArrCopyOf2, 0, 15);
                    bArrCopyOf2[15] = bC;
                }
                for (int i15 = 0; i15 < bArrCopyOf2.length; i15++) {
                    bArrCopyOf2[i15] = f88433h[bArrCopyOf2[i15] & 255];
                }
                bArrCopyOf = Arrays.copyOf(bArrCopyOf2, 16);
            }
            b(bArrCopyOf, this.f88437d[0]);
        }
        System.arraycopy(bArrCopyOf, 0, bArr2, i11, 16);
        return 16;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }
}
