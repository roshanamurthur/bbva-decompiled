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
import kotlin.UShort;
import kotlin.io.encoding.Base64;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.StreamCipher;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Memoable;

/* JADX INFO: loaded from: classes3.dex */
public class Zuc128CoreEngine implements StreamCipher, Memoable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final byte[] f88648h = {62, 114, 91, 71, -54, -32, 0, 51, 4, -47, 84, -104, 9, -71, 109, -53, 123, 27, -7, 50, -81, -99, GenerateAcResponseApdu.DDA_HEADER, -91, -72, 45, -4, 29, 8, 83, 3, -112, 77, 78, -124, -103, -28, -50, -39, -111, -35, -74, -123, 72, -117, 41, 110, -84, -51, -63, -8, MessageUtils.MESSAGE_30_RS, 115, 67, 105, -58, -75, -67, -3, 57, 99, 32, -44, 56, 118, 125, UtilitiesSDKConstants.SRP_LABEL_MAC, -89, Constants.CVR_B2b65_CLEAR_BITS, -19, 87, -59, -13, 44, -69, 20, 33, 6, 85, -101, -29, ByteSourceJsonBootstrapper.UTF8_BOM_1, 94, 49, 79, 127, 90, -92, 13, -126, 81, 73, Constants.STATE_ERROR, -70, 88, 28, 74, 22, -43, 23, -88, -110, DigipassSDKConstants.SECURE_CHANNEL_MESSAGE_TYPE_INFORMATION_MESSAGE, 31, -116, -1, -40, -82, 46, 1, -45, -83, 59, 75, -38, 70, -21, -55, -34, -102, -113, -121, -41, 58, -128, Constants.FCI_TEMPLATE, 47, -56, -79, -76, 55, -9, 10, 34, 19, 40, 124, -52, 60, -119, -57, -61, -106, 86, 7, ByteSourceJsonBootstrapper.UTF8_BOM_3, 126, Constants.CVR_B2b8765_1111_APP_DISABLED, 11, 43, -105, 82, 53, 65, 121, Constants.DIRECTORY_ENTRY, -90, 76, 16, -2, -68, GenerateAcResponseApdu.DAD_ICC_DYNAMIC_DATA_LENGTH, -107, -120, -118, UtilitiesSDKConstants.SRP_LABEL_ENC, -93, -5, Constants.CVR_B2b87_11_RFU, 24, -108, -14, -31, -27, -23, 93, -48, -36, 17, 102, 100, 92, -20, 89, 66, 117, MessageUtils.MESSAGE_18_DC2, -11, 116, -100, -86, 35, Constants.CVR_B1b41_1110_ONLINE_PIN, -122, -85, -66, 42, 2, -25, 103, -26, 68, -94, 108, -62, -109, -97, -15, -10, -6, 54, -46, Constants.CVR_B1b85_0101_MOBILE_APP, 104, -98, 98, 113, MessageUtils.MESSAGE_21_NAK, Base64.padSymbol, -42, 64, -60, -30, 15, ComputeCcCommandApdu.EXPECTED_P1, GetProcessingOptionsCommandApdu.COMMAND_TEMPLATE_TAG, Constants.RESP_MSG_TEMPLATE_FORMAT_2, 107, 37, 5, 63, 12, 48, -22, Constants.CVR_B1b85_0111_VERIFIED_CLOUD, -73, -95, -24, -87, 101, -115, 39, MessageUtils.MESSAGE_26_SUB, -37, KSUtils.PLAIN_BUFFER, -77, -96, -12, 69, 122, 25, -33, -18, 120, 52, Constants.CVR_B1b85_0110_TERMINAL};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final byte[] f88649i = {85, -62, 99, 113, 59, -56, 71, -122, -97, 60, -38, 91, 41, -86, -3, Constants.RESP_MSG_TEMPLATE_FORMAT_2, -116, -59, -108, 12, -90, MessageUtils.MESSAGE_26_SUB, 19, 0, -29, -88, 22, 114, 64, -7, -8, 66, 68, GenerateAcResponseApdu.DAD_ICC_DYNAMIC_DATA_LENGTH, 104, -106, KSUtils.PLAIN_BUFFER, -39, 69, 62, 16, 118, -58, -89, -117, 57, 67, -31, 58, -75, 86, 42, Constants.CVR_B2b87_11_RFU, 109, -77, 5, 34, 102, ByteSourceJsonBootstrapper.UTF8_BOM_3, -36, 11, -6, 98, 72, -35, 32, 17, 6, 54, -55, -63, Constants.CVR_B2b65_CLEAR_BITS, -10, 39, 82, -69, 105, -11, -44, -121, 127, -124, 76, -46, -100, 87, -92, -68, 79, -102, -33, -2, -42, -115, 122, -21, 43, 83, -40, 92, -95, 20, 23, -5, 35, -43, 125, 48, 103, 115, 8, 9, -18, -73, Constants.CVR_B1b85_0111_VERIFIED_CLOUD, 63, Constants.DIRECTORY_ENTRY, UtilitiesSDKConstants.SRP_LABEL_MAC, 25, ComputeCcCommandApdu.EXPECTED_P1, 78, -27, 75, -109, -113, 93, -37, -87, -83, -15, -82, 46, -53, 13, -4, -12, 45, 70, 110, 29, -105, -24, -47, -23, 77, 55, -91, 117, 94, GetProcessingOptionsCommandApdu.COMMAND_TEMPLATE_TAG, -98, -85, -126, -99, -71, 28, -32, -51, 73, -119, 1, -74, -67, 88, DigipassSDKConstants.SECURE_CHANNEL_MESSAGE_TYPE_INFORMATION_MESSAGE, -94, Constants.STATE_ERROR, 56, 120, -103, MessageUtils.MESSAGE_21_NAK, -112, Constants.CVR_B1b85_0101_MOBILE_APP, -72, -107, -28, -48, -111, -57, -50, -19, 15, -76, Constants.FCI_TEMPLATE, -96, -52, Constants.CVR_B2b8765_1111_APP_DISABLED, 2, 74, 121, -61, -34, -93, ByteSourceJsonBootstrapper.UTF8_BOM_1, -22, 81, -26, 107, 24, -20, 27, 44, -128, -9, 116, -25, -1, 33, 90, GenerateAcResponseApdu.DDA_HEADER, 84, MessageUtils.MESSAGE_30_RS, 65, 49, -110, 53, -60, 51, 7, 10, -70, 126, Constants.CVR_B1b41_1110_ONLINE_PIN, 52, -120, -79, -104, 124, -13, Base64.padSymbol, Constants.CVR_B1b85_0110_TERMINAL, 108, 123, -54, -45, 31, 50, 101, 4, 40, 100, -66, -123, -101, 47, 89, -118, -41, UtilitiesSDKConstants.SRP_LABEL_ENC, 37, -84, -81, MessageUtils.MESSAGE_18_DC2, 3, -30, -14};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final short[] f88650j = {17623, 9916, 25195, 4958, 22409, 13794, 28981, 2479, 19832, 12051, 27588, 6897, 24102, 15437, 30874, 18348};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f88651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f88652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f88653c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f88654d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f88655e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f88656f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Zuc128CoreEngine f88657g;

    public Zuc128CoreEngine() {
        this.f88651a = new int[16];
        this.f88652b = new int[2];
        this.f88653c = new int[4];
        this.f88655e = new byte[4];
    }

    public static int a(int i10, int i11) {
        int i12 = i10 + i11;
        return (Integer.MAX_VALUE & i12) + (i12 >>> 31);
    }

    public static int e(byte b10, short s4, byte b11) {
        return ((b10 & 255) << 23) | ((s4 & UShort.MAX_VALUE) << 8) | (b11 & 255);
    }

    public static void encode32be(int i10, byte[] bArr, int i11) {
        bArr[i11] = (byte) (i10 >> 24);
        bArr[i11 + 1] = (byte) (i10 >> 16);
        bArr[i11 + 2] = (byte) (i10 >> 8);
        bArr[i11 + 3] = (byte) i10;
    }

    public static int f(byte b10, byte b11, byte b12, byte b13) {
        return ((b10 & 255) << 24) | ((b11 & 255) << 16) | ((b12 & 255) << 8) | (b13 & 255);
    }

    public static int g(int i10, int i11) {
        return ((i10 >>> (31 - i11)) | (i10 << i11)) & Integer.MAX_VALUE;
    }

    public static int h(int i10, int i11) {
        return (i10 >>> (32 - i11)) | (i10 << i11);
    }

    public final void b() {
        int[] iArr = this.f88651a;
        int i10 = ((iArr[15] & 2147450880) << 1) | (iArr[14] & 65535);
        int[] iArr2 = this.f88653c;
        iArr2[0] = i10;
        iArr2[1] = ((iArr[11] & 65535) << 16) | (iArr[9] >>> 15);
        iArr2[2] = ((iArr[7] & 65535) << 16) | (iArr[5] >>> 15);
        iArr2[3] = (iArr[0] >>> 15) | ((iArr[2] & 65535) << 16);
    }

    public final int c() {
        int[] iArr = this.f88653c;
        int i10 = iArr[0];
        int[] iArr2 = this.f88652b;
        int i11 = iArr2[0];
        int i12 = iArr2[1];
        int i13 = (i10 ^ i11) + i12;
        int i14 = i11 + iArr[1];
        int i15 = iArr[2] ^ i12;
        int i16 = (i14 << 16) | (i15 >>> 16);
        int iH = h(i16, 24) ^ (((h(i16, 2) ^ i16) ^ h(i16, 10)) ^ h(i16, 18));
        int i17 = (i15 << 16) | (i14 >>> 16);
        int iH2 = h(i17, 30) ^ (((h(i17, 8) ^ i17) ^ h(i17, 14)) ^ h(i17, 22));
        byte[] bArr = f88648h;
        byte b10 = bArr[iH >>> 24];
        byte[] bArr2 = f88649i;
        iArr2[0] = f(b10, bArr2[(iH >>> 16) & 255], bArr[(iH >>> 8) & 255], bArr2[iH & 255]);
        iArr2[1] = f(bArr[iH2 >>> 24], bArr2[(iH2 >>> 16) & 255], bArr[(iH2 >>> 8) & 255], bArr2[iH2 & 255]);
        return i13;
    }

    @Override // org.bouncycastle.util.Memoable
    public Memoable copy() {
        return new Zuc128CoreEngine(this);
    }

    public final void d() {
        int[] iArr = this.f88651a;
        int i10 = iArr[0];
        int iA = a(a(a(a(a(i10, g(i10, 8)), g(iArr[4], 20)), g(iArr[10], 21)), g(iArr[13], 17)), g(iArr[15], 15));
        iArr[0] = iArr[1];
        iArr[1] = iArr[2];
        iArr[2] = iArr[3];
        iArr[3] = iArr[4];
        iArr[4] = iArr[5];
        iArr[5] = iArr[6];
        iArr[6] = iArr[7];
        iArr[7] = iArr[8];
        iArr[8] = iArr[9];
        iArr[9] = iArr[10];
        iArr[10] = iArr[11];
        iArr[11] = iArr[12];
        iArr[12] = iArr[13];
        iArr[13] = iArr[14];
        iArr[14] = iArr[15];
        iArr[15] = iA;
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public String getAlgorithmName() {
        return "Zuc-128";
    }

    public int getMaxIterations() {
        return 2047;
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public void init(boolean z10, CipherParameters cipherParameters) {
        byte[] iv;
        if (cipherParameters instanceof ParametersWithIV) {
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            iv = parametersWithIV.getIV();
            cipherParameters = parametersWithIV.getParameters();
        } else {
            iv = null;
        }
        byte[] key = cipherParameters instanceof KeyParameter ? ((KeyParameter) cipherParameters).getKey() : null;
        this.f88654d = 0;
        this.f88656f = 0;
        int[] iArr = this.f88651a;
        setKeyAndIV(iArr, key, iv);
        int[] iArr2 = this.f88652b;
        iArr2[0] = 0;
        iArr2[1] = 0;
        for (int i10 = 32; i10 > 0; i10--) {
            b();
            int iC = c() >>> 1;
            int i11 = iArr[0];
            int iA = a(a(a(a(a(a(i11, g(i11, 8)), g(iArr[4], 20)), g(iArr[10], 21)), g(iArr[13], 17)), g(iArr[15], 15)), iC);
            iArr[0] = iArr[1];
            iArr[1] = iArr[2];
            iArr[2] = iArr[3];
            iArr[3] = iArr[4];
            iArr[4] = iArr[5];
            iArr[5] = iArr[6];
            iArr[6] = iArr[7];
            iArr[7] = iArr[8];
            iArr[8] = iArr[9];
            iArr[9] = iArr[10];
            iArr[10] = iArr[11];
            iArr[11] = iArr[12];
            iArr[12] = iArr[13];
            iArr[13] = iArr[14];
            iArr[14] = iArr[15];
            iArr[15] = iA;
        }
        b();
        c();
        d();
        this.f88657g = (Zuc128CoreEngine) copy();
    }

    public int makeKeyStreamWord() {
        int i10 = this.f88656f;
        this.f88656f = i10 + 1;
        if (i10 >= getMaxIterations()) {
            throw new IllegalStateException("Too much data processed by singleKey/IV");
        }
        b();
        int iC = c() ^ this.f88653c[3];
        d();
        return iC;
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public int processBytes(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        if (this.f88657g == null) {
            throw new IllegalStateException(getAlgorithmName() + " not initialised");
        }
        if (i10 + i11 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i12 + i11 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        for (int i13 = 0; i13 < i11; i13++) {
            bArr2[i13 + i12] = returnByte(bArr[i13 + i10]);
        }
        return i11;
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public void reset() {
        Zuc128CoreEngine zuc128CoreEngine = this.f88657g;
        if (zuc128CoreEngine != null) {
            reset(zuc128CoreEngine);
        }
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public byte returnByte(byte b10) {
        int i10 = this.f88654d;
        byte[] bArr = this.f88655e;
        if (i10 == 0) {
            encode32be(makeKeyStreamWord(), bArr, 0);
        }
        int i11 = this.f88654d;
        byte b11 = (byte) (b10 ^ bArr[i11]);
        this.f88654d = (i11 + 1) % 4;
        return b11;
    }

    public void setKeyAndIV(int[] iArr, byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr.length != 16) {
            throw new IllegalArgumentException("A key of 16 bytes is needed");
        }
        if (bArr2 == null || bArr2.length != 16) {
            throw new IllegalArgumentException("An IV of 16 bytes is needed");
        }
        byte b10 = bArr[0];
        short[] sArr = f88650j;
        int iE = e(b10, sArr[0], bArr2[0]);
        int[] iArr2 = this.f88651a;
        iArr2[0] = iE;
        iArr2[1] = e(bArr[1], sArr[1], bArr2[1]);
        iArr2[2] = e(bArr[2], sArr[2], bArr2[2]);
        iArr2[3] = e(bArr[3], sArr[3], bArr2[3]);
        iArr2[4] = e(bArr[4], sArr[4], bArr2[4]);
        iArr2[5] = e(bArr[5], sArr[5], bArr2[5]);
        iArr2[6] = e(bArr[6], sArr[6], bArr2[6]);
        iArr2[7] = e(bArr[7], sArr[7], bArr2[7]);
        iArr2[8] = e(bArr[8], sArr[8], bArr2[8]);
        iArr2[9] = e(bArr[9], sArr[9], bArr2[9]);
        iArr2[10] = e(bArr[10], sArr[10], bArr2[10]);
        iArr2[11] = e(bArr[11], sArr[11], bArr2[11]);
        iArr2[12] = e(bArr[12], sArr[12], bArr2[12]);
        iArr2[13] = e(bArr[13], sArr[13], bArr2[13]);
        iArr2[14] = e(bArr[14], sArr[14], bArr2[14]);
        iArr2[15] = e(bArr[15], sArr[15], bArr2[15]);
    }

    public Zuc128CoreEngine(Zuc128CoreEngine zuc128CoreEngine) {
        this.f88651a = new int[16];
        this.f88652b = new int[2];
        this.f88653c = new int[4];
        this.f88655e = new byte[4];
        reset(zuc128CoreEngine);
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(Memoable memoable) {
        Zuc128CoreEngine zuc128CoreEngine = (Zuc128CoreEngine) memoable;
        int[] iArr = zuc128CoreEngine.f88651a;
        int[] iArr2 = this.f88651a;
        System.arraycopy(iArr, 0, iArr2, 0, iArr2.length);
        int[] iArr3 = this.f88652b;
        System.arraycopy(zuc128CoreEngine.f88652b, 0, iArr3, 0, iArr3.length);
        int[] iArr4 = this.f88653c;
        System.arraycopy(zuc128CoreEngine.f88653c, 0, iArr4, 0, iArr4.length);
        byte[] bArr = this.f88655e;
        System.arraycopy(zuc128CoreEngine.f88655e, 0, bArr, 0, bArr.length);
        this.f88654d = zuc128CoreEngine.f88654d;
        this.f88656f = zuc128CoreEngine.f88656f;
        this.f88657g = zuc128CoreEngine;
    }
}
