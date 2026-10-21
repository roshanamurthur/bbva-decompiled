package org.bouncycastle.crypto.engines;

import com.bbva.sl.ar.core.libmcrypt.exception.ErrorCodes;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import com.esotericsoftware.asm.Opcodes;
import com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.ComputeCcCommandApdu;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.GenerateAcResponseApdu;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.GetProcessingOptionsCommandApdu;
import com.noknok.android.client.asm.authenticator.KSUtils;
import com.vasco.digipass.sdk.DigipassSDKConstants;
import com.vasco.digipass.sdk.utils.utilities.UtilitiesSDKConstants;
import com.vierge.pinpadsdk.message.base.MessageUtils;
import java.lang.reflect.Array;
import kotlin.io.encoding.Base64;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.params.KeyParameter;

/* JADX INFO: loaded from: classes3.dex */
public class RijndaelEngine implements BlockCipher {
    public static final byte[] m = {0, 0, 25, 1, 50, 2, MessageUtils.MESSAGE_26_SUB, -58, 75, -57, 27, 104, 51, -18, -33, 3, 100, 4, -32, Constants.CVR_B1b41_1110_ONLINE_PIN, 52, -115, KSUtils.PLAIN_BUFFER, ByteSourceJsonBootstrapper.UTF8_BOM_1, 76, 113, 8, -56, -8, 105, 28, -63, 125, -62, 29, -75, -7, -71, 39, GenerateAcResponseApdu.DDA_HEADER, 77, -28, -90, 114, -102, -55, 9, 120, 101, 47, -118, 5, 33, 15, -31, DigipassSDKConstants.SECURE_CHANNEL_MESSAGE_TYPE_INFORMATION_MESSAGE, MessageUtils.MESSAGE_18_DC2, Constants.CVR_B2b8765_1111_APP_DISABLED, -126, 69, 53, -109, -38, ComputeCcCommandApdu.EXPECTED_P1, -106, -113, -37, -67, 54, -48, -50, -108, 19, 92, -46, -15, 64, 70, GetProcessingOptionsCommandApdu.COMMAND_TEMPLATE_TAG, 56, 102, -35, -3, 48, ByteSourceJsonBootstrapper.UTF8_BOM_3, 6, -117, 98, -77, 37, -30, -104, 34, -120, -111, 16, 126, 110, 72, -61, -93, -74, MessageUtils.MESSAGE_30_RS, 66, 58, 107, 40, 84, -6, -123, Base64.padSymbol, -70, 43, 121, 10, MessageUtils.MESSAGE_21_NAK, -101, -97, 94, -54, 78, -44, -84, -27, -13, 115, -89, 87, -81, 88, -88, Constants.CVR_B1b85_0101_MOBILE_APP, -12, -22, -42, 116, 79, -82, -23, -43, -25, -26, -83, -24, 44, -41, 117, 122, -21, 22, 11, -11, 89, -53, Constants.STATE_ERROR, UtilitiesSDKConstants.SRP_LABEL_ENC, -100, -87, 81, -96, 127, 12, -10, Constants.FCI_TEMPLATE, 23, -60, 73, -20, -40, 67, 31, 45, -92, 118, 123, -73, -52, -69, 62, 90, -5, Constants.CVR_B1b85_0110_TERMINAL, -79, -122, 59, 82, -95, 108, -86, 85, 41, -99, -105, UtilitiesSDKConstants.SRP_LABEL_MAC, -121, -112, Constants.DIRECTORY_ENTRY, -66, -36, -4, -68, -107, Constants.CVR_B2b65_CLEAR_BITS, -51, 55, 63, 91, -47, 83, 57, -124, 60, 65, -94, 109, 71, 20, 42, -98, 93, 86, -14, -45, -85, 68, 17, -110, -39, 35, 32, 46, -119, -76, 124, -72, GenerateAcResponseApdu.DAD_ICC_DYNAMIC_DATA_LENGTH, Constants.RESP_MSG_TEMPLATE_FORMAT_2, -103, -29, -91, 103, 74, -19, -34, -59, 49, -2, 24, 13, 99, -116, -128, Constants.CVR_B2b87_11_RFU, -9, Constants.CVR_B1b85_0111_VERIFIED_CLOUD, 7};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final byte[] f88557n = {0, 3, 5, 15, 17, 51, 85, -1, MessageUtils.MESSAGE_26_SUB, 46, 114, -106, -95, -8, 19, 53, Constants.STATE_ERROR, -31, 56, 72, -40, 115, -107, -92, -9, 2, 6, 10, MessageUtils.MESSAGE_30_RS, 34, 102, -86, -27, 52, 92, -28, 55, 89, -21, GenerateAcResponseApdu.DAD_ICC_DYNAMIC_DATA_LENGTH, GenerateAcResponseApdu.DDA_HEADER, -66, -39, Constants.CVR_B1b85_0111_VERIFIED_CLOUD, -112, -85, -26, 49, 83, -11, 4, 12, 20, 60, 68, -52, 79, -47, 104, -72, -45, 110, UtilitiesSDKConstants.SRP_LABEL_MAC, -51, 76, -44, 103, -87, -32, 59, 77, -41, 98, -90, -15, 8, 24, 40, 120, -120, GetProcessingOptionsCommandApdu.COMMAND_TEMPLATE_TAG, -98, -71, -48, 107, -67, -36, 127, KSUtils.PLAIN_BUFFER, -104, -77, -50, 73, -37, 118, -102, -75, -60, 87, -7, 16, 48, Constants.CVR_B1b85_0101_MOBILE_APP, Constants.CVR_B2b8765_1111_APP_DISABLED, 11, 29, 39, 105, -69, -42, Constants.DIRECTORY_ENTRY, -93, -2, 25, 43, 125, -121, -110, -83, -20, 47, 113, -109, -82, -23, 32, Constants.CVR_B1b85_0110_TERMINAL, -96, -5, 22, 58, 78, -46, 109, -73, -62, 93, -25, 50, 86, -6, MessageUtils.MESSAGE_21_NAK, 63, 65, -61, 94, -30, Base64.padSymbol, 71, -55, 64, Constants.CVR_B2b87_11_RFU, 91, -19, 44, 116, -100, ByteSourceJsonBootstrapper.UTF8_BOM_3, -38, 117, -97, -70, -43, 100, -84, ByteSourceJsonBootstrapper.UTF8_BOM_1, 42, 126, -126, -99, -68, -33, 122, ComputeCcCommandApdu.EXPECTED_P1, -119, -128, -101, -74, -63, 88, -24, 35, 101, -81, -22, 37, Constants.FCI_TEMPLATE, -79, -56, 67, -59, 84, -4, 31, 33, 99, -91, -12, 7, 9, 27, 45, Constants.RESP_MSG_TEMPLATE_FORMAT_2, -103, UtilitiesSDKConstants.SRP_LABEL_ENC, -53, 70, -54, 69, Constants.CVR_B2b65_CLEAR_BITS, 74, -34, 121, -117, -122, -111, -88, -29, 62, 66, -58, 81, -13, Constants.CVR_B1b41_1110_ONLINE_PIN, MessageUtils.MESSAGE_18_DC2, 54, 90, -18, 41, 123, -115, -116, -113, -118, -123, -108, -89, -14, 13, 23, 57, 75, -35, 124, -124, -105, -94, -3, 28, DigipassSDKConstants.SECURE_CHANNEL_MESSAGE_TYPE_INFORMATION_MESSAGE, 108, -76, -57, 82, -10, 1, 3, 5, 15, 17, 51, 85, -1, MessageUtils.MESSAGE_26_SUB, 46, 114, -106, -95, -8, 19, 53, Constants.STATE_ERROR, -31, 56, 72, -40, 115, -107, -92, -9, 2, 6, 10, MessageUtils.MESSAGE_30_RS, 34, 102, -86, -27, 52, 92, -28, 55, 89, -21, GenerateAcResponseApdu.DAD_ICC_DYNAMIC_DATA_LENGTH, GenerateAcResponseApdu.DDA_HEADER, -66, -39, Constants.CVR_B1b85_0111_VERIFIED_CLOUD, -112, -85, -26, 49, 83, -11, 4, 12, 20, 60, 68, -52, 79, -47, 104, -72, -45, 110, UtilitiesSDKConstants.SRP_LABEL_MAC, -51, 76, -44, 103, -87, -32, 59, 77, -41, 98, -90, -15, 8, 24, 40, 120, -120, GetProcessingOptionsCommandApdu.COMMAND_TEMPLATE_TAG, -98, -71, -48, 107, -67, -36, 127, KSUtils.PLAIN_BUFFER, -104, -77, -50, 73, -37, 118, -102, -75, -60, 87, -7, 16, 48, Constants.CVR_B1b85_0101_MOBILE_APP, Constants.CVR_B2b8765_1111_APP_DISABLED, 11, 29, 39, 105, -69, -42, Constants.DIRECTORY_ENTRY, -93, -2, 25, 43, 125, -121, -110, -83, -20, 47, 113, -109, -82, -23, 32, Constants.CVR_B1b85_0110_TERMINAL, -96, -5, 22, 58, 78, -46, 109, -73, -62, 93, -25, 50, 86, -6, MessageUtils.MESSAGE_21_NAK, 63, 65, -61, 94, -30, Base64.padSymbol, 71, -55, 64, Constants.CVR_B2b87_11_RFU, 91, -19, 44, 116, -100, ByteSourceJsonBootstrapper.UTF8_BOM_3, -38, 117, -97, -70, -43, 100, -84, ByteSourceJsonBootstrapper.UTF8_BOM_1, 42, 126, -126, -99, -68, -33, 122, ComputeCcCommandApdu.EXPECTED_P1, -119, -128, -101, -74, -63, 88, -24, 35, 101, -81, -22, 37, Constants.FCI_TEMPLATE, -79, -56, 67, -59, 84, -4, 31, 33, 99, -91, -12, 7, 9, 27, 45, Constants.RESP_MSG_TEMPLATE_FORMAT_2, -103, UtilitiesSDKConstants.SRP_LABEL_ENC, -53, 70, -54, 69, Constants.CVR_B2b65_CLEAR_BITS, 74, -34, 121, -117, -122, -111, -88, -29, 62, 66, -58, 81, -13, Constants.CVR_B1b41_1110_ONLINE_PIN, MessageUtils.MESSAGE_18_DC2, 54, 90, -18, 41, 123, -115, -116, -113, -118, -123, -108, -89, -14, 13, 23, 57, 75, -35, 124, -124, -105, -94, -3, 28, DigipassSDKConstants.SECURE_CHANNEL_MESSAGE_TYPE_INFORMATION_MESSAGE, 108, -76, -57, 82, -10, 1};

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final byte[] f88558o = {99, 124, Constants.RESP_MSG_TEMPLATE_FORMAT_2, 123, -14, 107, Constants.FCI_TEMPLATE, -59, 48, 1, 103, 43, -2, -41, -85, 118, -54, -126, -55, 125, -6, 89, 71, Constants.CVR_B2b8765_1111_APP_DISABLED, -83, -44, -94, -81, -100, -92, 114, Constants.CVR_B2b87_11_RFU, -73, -3, -109, GenerateAcResponseApdu.DAD_ICC_DYNAMIC_DATA_LENGTH, 54, 63, -9, -52, 52, -91, -27, -15, 113, -40, 49, MessageUtils.MESSAGE_21_NAK, 4, -57, 35, -61, 24, -106, 5, -102, 7, MessageUtils.MESSAGE_18_DC2, -128, -30, -21, 39, UtilitiesSDKConstants.SRP_LABEL_MAC, 117, 9, GetProcessingOptionsCommandApdu.COMMAND_TEMPLATE_TAG, 44, MessageUtils.MESSAGE_26_SUB, 27, 110, 90, -96, 82, 59, -42, -77, 41, -29, 47, -124, 83, -47, 0, -19, 32, -4, -79, 91, GenerateAcResponseApdu.DDA_HEADER, -53, -66, 57, 74, 76, 88, Constants.CVR_B2b65_CLEAR_BITS, -48, ByteSourceJsonBootstrapper.UTF8_BOM_1, -86, -5, 67, 77, 51, -123, 69, -7, 2, 127, Constants.CVR_B1b85_0101_MOBILE_APP, 60, -97, -88, 81, -93, 64, -113, -110, -99, 56, -11, -68, -74, -38, 33, 16, -1, -13, -46, -51, 12, 19, -20, Constants.STATE_ERROR, -105, 68, 23, -60, -89, 126, Base64.padSymbol, 100, 93, 25, 115, Constants.CVR_B1b85_0110_TERMINAL, KSUtils.PLAIN_BUFFER, 79, -36, 34, 42, -112, -120, 70, -18, -72, 20, -34, 94, 11, -37, -32, 50, 58, 10, 73, 6, DigipassSDKConstants.SECURE_CHANNEL_MESSAGE_TYPE_INFORMATION_MESSAGE, 92, -62, -45, -84, 98, -111, -107, -28, 121, -25, -56, 55, 109, -115, -43, 78, -87, 108, 86, -12, -22, 101, 122, -82, 8, -70, 120, 37, 46, 28, -90, -76, -58, -24, -35, 116, 31, 75, -67, -117, -118, Constants.CVR_B1b85_0111_VERIFIED_CLOUD, 62, -75, 102, 72, 3, -10, Constants.CVR_B1b41_1110_ONLINE_PIN, Constants.DIRECTORY_ENTRY, 53, 87, -71, -122, -63, 29, -98, -31, -8, -104, 17, 105, -39, ComputeCcCommandApdu.EXPECTED_P1, -108, -101, MessageUtils.MESSAGE_30_RS, -121, -23, -50, 85, 40, -33, -116, -95, -119, 13, ByteSourceJsonBootstrapper.UTF8_BOM_3, -26, 66, 104, 65, -103, 45, 15, UtilitiesSDKConstants.SRP_LABEL_ENC, 84, -69, 22};

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final byte[] f88559p = {82, 9, GenerateAcResponseApdu.DDA_HEADER, -43, 48, 54, -91, 56, ByteSourceJsonBootstrapper.UTF8_BOM_3, 64, -93, -98, KSUtils.PLAIN_BUFFER, -13, -41, -5, 124, -29, 57, -126, -101, 47, -1, -121, 52, ComputeCcCommandApdu.EXPECTED_P1, 67, 68, -60, -34, -23, -53, 84, 123, -108, 50, -90, -62, 35, Base64.padSymbol, -18, 76, -107, 11, 66, -6, -61, 78, 8, 46, -95, 102, 40, -39, DigipassSDKConstants.SECURE_CHANNEL_MESSAGE_TYPE_INFORMATION_MESSAGE, UtilitiesSDKConstants.SRP_LABEL_MAC, 118, 91, -94, 73, 109, -117, -47, 37, 114, -8, -10, 100, -122, 104, -104, 22, -44, -92, 92, -52, 93, 101, -74, -110, 108, Constants.CVR_B1b85_0111_VERIFIED_CLOUD, 72, Constants.CVR_B1b85_0101_MOBILE_APP, -3, -19, -71, -38, 94, MessageUtils.MESSAGE_21_NAK, 70, 87, -89, -115, -99, -124, -112, -40, -85, 0, -116, -68, -45, 10, -9, -28, 88, 5, -72, -77, 69, 6, -48, 44, MessageUtils.MESSAGE_30_RS, -113, -54, 63, 15, 2, -63, -81, -67, 3, 1, 19, -118, 107, 58, -111, 17, 65, 79, 103, -36, -22, -105, -14, Constants.CVR_B2b65_CLEAR_BITS, -50, Constants.CVR_B2b8765_1111_APP_DISABLED, -76, -26, 115, -106, -84, 116, 34, -25, -83, 53, -123, -30, -7, 55, -24, 28, 117, -33, 110, 71, -15, MessageUtils.MESSAGE_26_SUB, 113, 29, 41, -59, -119, Constants.FCI_TEMPLATE, -73, 98, Constants.CVR_B1b41_1110_ONLINE_PIN, -86, 24, -66, 27, -4, 86, 62, 75, -58, -46, 121, 32, -102, -37, Constants.CVR_B2b87_11_RFU, -2, 120, -51, 90, -12, 31, -35, -88, 51, -120, 7, -57, 49, -79, MessageUtils.MESSAGE_18_DC2, 16, 89, 39, -128, -20, Constants.STATE_ERROR, Constants.CVR_B1b85_0110_TERMINAL, 81, 127, -87, 25, -75, 74, 13, 45, -27, 122, -97, -109, -55, -100, ByteSourceJsonBootstrapper.UTF8_BOM_1, -96, -32, 59, 77, -82, 42, -11, UtilitiesSDKConstants.SRP_LABEL_ENC, -56, -21, -69, 60, GetProcessingOptionsCommandApdu.COMMAND_TEMPLATE_TAG, 83, -103, Constants.DIRECTORY_ENTRY, 23, 43, 4, 126, -70, Constants.RESP_MSG_TEMPLATE_FORMAT_2, -42, GenerateAcResponseApdu.DAD_ICC_DYNAMIC_DATA_LENGTH, -31, 105, 20, 99, 85, 33, 12, 125};

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int[] f88560q = {1, 2, 4, 8, 16, 32, 64, 128, 27, 54, 108, 216, 171, 77, 154, 47, 94, 188, 99, Opcodes.IFNULL, 151, 53, 106, ErrorCodes.ERR_CRY_BAD_BLOCK_SIZE, 179, 125, 250, 239, Opcodes.MULTIANEWARRAY, 145};

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final byte[][] f88561r = {new byte[]{0, 8, 16, 24}, new byte[]{0, 8, 16, 24}, new byte[]{0, 8, 16, 24}, new byte[]{0, 8, 16, 32}, new byte[]{0, 8, 24, 32}};

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final byte[][] f88562s = {new byte[]{0, 24, 16, 8}, new byte[]{0, 32, 24, 16}, new byte[]{0, 40, 32, 24}, new byte[]{0, 48, 40, 24}, new byte[]{0, 56, 40, 32}};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f88563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f88564b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f88565c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f88566d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long[][] f88567e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f88568f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f88569g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f88570h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f88571i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f88572j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final byte[] f88573k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final byte[] f88574l;

    public RijndaelEngine() {
        this(128);
    }

    public static byte e(int i10) {
        if (i10 != 0) {
            return f88557n[(m[i10] & 255) + 25];
        }
        return (byte) 0;
    }

    public static byte f(int i10) {
        if (i10 != 0) {
            return f88557n[(m[i10] & 255) + 1];
        }
        return (byte) 0;
    }

    public static byte g(int i10) {
        if (i10 >= 0) {
            return f88557n[i10 + Opcodes.IFNONNULL];
        }
        return (byte) 0;
    }

    public static byte h(int i10) {
        if (i10 >= 0) {
            return f88557n[i10 + 104];
        }
        return (byte) 0;
    }

    public static byte i(int i10) {
        if (i10 >= 0) {
            return f88557n[i10 + 238];
        }
        return (byte) 0;
    }

    public static byte j(int i10) {
        if (i10 >= 0) {
            return f88557n[i10 + 223];
        }
        return (byte) 0;
    }

    public final void a(long[] jArr) {
        this.f88568f ^= jArr[0];
        this.f88569g ^= jArr[1];
        this.f88570h ^= jArr[2];
        this.f88571i ^= jArr[3];
    }

    public final void b(byte[] bArr) {
        long j10 = this.f88569g;
        byte b10 = bArr[1];
        int i10 = this.f88563a;
        long j11 = (j10 << (i10 - b10)) | (j10 >>> b10);
        long j12 = this.f88564b;
        this.f88569g = j11 & j12;
        long j13 = this.f88570h;
        byte b11 = bArr[2];
        this.f88570h = ((j13 << (i10 - b11)) | (j13 >>> b11)) & j12;
        long j14 = this.f88571i;
        byte b12 = bArr[3];
        this.f88571i = ((j14 << (i10 - b12)) | (j14 >>> b12)) & j12;
    }

    public final void c(byte[] bArr) {
        this.f88568f = d(this.f88568f, bArr);
        this.f88569g = d(this.f88569g, bArr);
        this.f88570h = d(this.f88570h, bArr);
        this.f88571i = d(this.f88571i, bArr);
    }

    public final long d(long j10, byte[] bArr) {
        long j11 = 0;
        for (int i10 = 0; i10 < this.f88563a; i10 += 8) {
            j11 |= ((long) (bArr[(int) ((j10 >> i10) & 255)] & 255)) << i10;
        }
        return j11;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "Rijndael";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return this.f88563a / 2;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z10, CipherParameters cipherParameters) {
        int i10;
        byte[] bArr;
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException(com.google.android.gms.measurement.internal.a.b(cipherParameters, "invalid parameter passed to Rijndael init - "));
        }
        byte[] key = ((KeyParameter) cipherParameters).getKey();
        int i11 = 8;
        int length = key.length * 8;
        byte[][] bArr2 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 4, 64);
        long[][] jArr = (long[][]) Array.newInstance((Class<?>) Long.TYPE, 15, 4);
        int i12 = 6;
        if (length == 128) {
            i11 = 4;
        } else if (length == 160) {
            i11 = 5;
        } else if (length == 192) {
            i11 = 6;
        } else if (length == 224) {
            i11 = 7;
        } else if (length != 256) {
            throw new IllegalArgumentException("Key length not 128/160/192/224/256 bits.");
        }
        int i13 = this.f88566d;
        int i14 = this.f88563a;
        this.f88565c = length >= i13 ? i11 + 6 : (i14 / 8) + 6;
        int i15 = 0;
        int i16 = 0;
        while (i15 < key.length) {
            bArr2[i15 % 4][i15 / 4] = key[i16];
            i15++;
            i16++;
        }
        int i17 = 0;
        int i18 = 0;
        while (true) {
            i10 = 1;
            if (i17 >= i11) {
                break;
            }
            int i19 = i14 / 8;
            if (i18 >= (this.f88565c + 1) * i19) {
                break;
            }
            int i20 = 0;
            while (i20 < 4) {
                long[] jArr2 = jArr[i18 / i19];
                jArr2[i20] = (((long) (bArr2[i20][i17] & 255)) << ((i18 * 8) % i14)) | jArr2[i20];
                i20++;
                i11 = i11;
            }
            i17++;
            i18++;
        }
        int i21 = i11;
        int i22 = 0;
        while (true) {
            int i23 = i14 / 8;
            if (i18 >= (this.f88565c + i10) * i23) {
                this.f88567e = jArr;
                this.f88572j = z10;
                return;
            }
            int i24 = 0;
            while (true) {
                bArr = f88558o;
                if (i24 >= 4) {
                    break;
                }
                byte[] bArr3 = bArr2[i24];
                i24++;
                bArr3[0] = (byte) (bArr[bArr2[i24 % 4][i21 - 1] & 255] ^ bArr3[0]);
            }
            byte[] bArr4 = bArr2[0];
            int i25 = i22 + 1;
            bArr4[0] = (byte) (f88560q[i22] ^ bArr4[0]);
            int i26 = i21;
            int i27 = i10;
            if (i26 <= i12) {
                while (i27 < i26) {
                    for (int i28 = 0; i28 < 4; i28++) {
                        byte[] bArr5 = bArr2[i28];
                        bArr5[i27] = (byte) (bArr5[i27] ^ bArr5[i27 - 1]);
                    }
                    i27++;
                }
            } else {
                while (i27 < 4) {
                    for (int i29 = 0; i29 < 4; i29++) {
                        byte[] bArr6 = bArr2[i29];
                        bArr6[i27] = (byte) (bArr6[i27] ^ bArr6[i27 - 1]);
                    }
                    i27++;
                }
                for (int i30 = 0; i30 < 4; i30++) {
                    byte[] bArr7 = bArr2[i30];
                    bArr7[4] = (byte) (bArr7[4] ^ bArr[bArr7[3] & 255]);
                }
                for (int i31 = 5; i31 < i26; i31++) {
                    for (int i32 = 0; i32 < 4; i32++) {
                        byte[] bArr8 = bArr2[i32];
                        bArr8[i31] = (byte) (bArr8[i31] ^ bArr8[i31 - 1]);
                    }
                }
            }
            int i33 = 0;
            while (i33 < i26 && i18 < (this.f88565c + i10) * i23) {
                for (int i34 = 0; i34 < 4; i34++) {
                    long[] jArr3 = jArr[i18 / i23];
                    jArr3[i34] = jArr3[i34] | (((long) (bArr2[i34][i33] & 255)) << ((i18 * 8) % i14));
                }
                i33++;
                i18++;
                i10 = 1;
            }
            i21 = i26;
            i22 = i25;
            i12 = 6;
            i10 = 1;
        }
    }

    public final void k(int i10, byte[] bArr) {
        for (int i11 = 0; i11 != this.f88563a; i11 += 8) {
            bArr[i10] = (byte) (this.f88568f >> i11);
            bArr[i10 + 1] = (byte) (this.f88569g >> i11);
            int i12 = i10 + 3;
            bArr[i10 + 2] = (byte) (this.f88570h >> i11);
            i10 += 4;
            bArr[i12] = (byte) (this.f88571i >> i11);
        }
    }

    public final void l(int i10, byte[] bArr) {
        this.f88568f = bArr[i10] & 255;
        this.f88569g = bArr[i10 + 1] & 255;
        int i11 = i10 + 3;
        this.f88570h = bArr[i10 + 2] & 255;
        int i12 = i10 + 4;
        this.f88571i = bArr[i11] & 255;
        for (int i13 = 8; i13 != this.f88563a; i13 += 8) {
            this.f88568f |= ((long) (bArr[i12] & 255)) << i13;
            this.f88569g |= ((long) (bArr[i12 + 1] & 255)) << i13;
            int i14 = i12 + 3;
            this.f88570h |= ((long) (bArr[i12 + 2] & 255)) << i13;
            i12 += 4;
            this.f88571i |= ((long) (bArr[i14] & 255)) << i13;
        }
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i10, byte[] bArr2, int i11) {
        if (this.f88567e == null) {
            throw new IllegalStateException("Rijndael engine not initialised");
        }
        int i12 = this.f88563a;
        int i13 = i12 / 2;
        if (i13 + i10 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i13 + i11 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        int i14 = 1;
        long j10 = 255;
        int i15 = 0;
        if (!this.f88572j) {
            int i16 = i12;
            l(i10, bArr);
            long[][] jArr = this.f88567e;
            a(jArr[this.f88565c]);
            byte[] bArr3 = f88559p;
            c(bArr3);
            byte[] bArr4 = this.f88574l;
            b(bArr4);
            int i17 = this.f88565c - 1;
            while (i17 > 0) {
                a(jArr[i17]);
                int i18 = i16;
                long jI = 0;
                int i19 = 0;
                long j11 = 0;
                long j12 = 0;
                long j13 = 0;
                while (i19 < i18) {
                    int i20 = i17;
                    int i21 = i18;
                    int i22 = (int) ((this.f88568f >> i19) & 255);
                    long[][] jArr2 = jArr;
                    byte[] bArr5 = bArr3;
                    int i23 = (int) ((this.f88569g >> i19) & 255);
                    long j14 = jI;
                    int i24 = (int) ((this.f88570h >> i19) & 255);
                    int i25 = (int) ((this.f88571i >> i19) & 255);
                    byte[] bArr6 = m;
                    int i26 = -1;
                    int i27 = i22 != 0 ? bArr6[i22 & 255] & 255 : -1;
                    int i28 = i23 != 0 ? bArr6[i23 & 255] & 255 : -1;
                    int i29 = i24 != 0 ? bArr6[i24 & 255] & 255 : -1;
                    if (i25 != 0) {
                        i26 = bArr6[i25 & 255] & 255;
                    }
                    j11 |= ((long) ((((j(i27) ^ h(i28)) ^ i(i29)) ^ g(i26)) & 255)) << i19;
                    j12 |= ((long) ((((j(i28) ^ h(i29)) ^ i(i26)) ^ g(i27)) & 255)) << i19;
                    j13 |= ((long) ((((j(i29) ^ h(i26)) ^ i(i27)) ^ g(i28)) & 255)) << i19;
                    jI = j14 | (((long) (((i(i28) ^ (j(i26) ^ h(i27))) ^ g(i29)) & 255)) << i19);
                    i19 += 8;
                    i17 = i20;
                    bArr3 = bArr5;
                    jArr = jArr2;
                    i18 = i21;
                }
                byte[] bArr7 = bArr3;
                i16 = i18;
                this.f88568f = j11;
                this.f88569g = j12;
                this.f88570h = j13;
                this.f88571i = jI;
                c(bArr7);
                b(bArr4);
                i17--;
                bArr3 = bArr7;
                jArr = jArr;
            }
            a(jArr[0]);
            k(i11, bArr2);
            return i13;
        }
        l(i10, bArr);
        long[][] jArr3 = this.f88567e;
        a(jArr3[0]);
        while (true) {
            int i30 = this.f88565c;
            byte[] bArr8 = f88558o;
            byte[] bArr9 = this.f88573k;
            if (i14 >= i30) {
                int i31 = i13;
                c(bArr8);
                b(bArr9);
                a(jArr3[this.f88565c]);
                k(i11, bArr2);
                return i31;
            }
            c(bArr8);
            b(bArr9);
            int i32 = i15;
            long j15 = 0;
            long j16 = 0;
            long jE = 0;
            long jE2 = 0;
            while (i32 < i12) {
                long j17 = j16;
                int i33 = (int) ((this.f88568f >> i32) & j10);
                int i34 = (int) ((this.f88569g >> i32) & j10);
                int i35 = (int) ((this.f88570h >> i32) & j10);
                int i36 = i12;
                int i37 = (int) ((this.f88571i >> i32) & j10);
                long jE3 = j17 | (((long) ((((e(i33) ^ f(i34)) ^ i35) ^ i37) & 255)) << i32);
                long jE4 = j15 | (((long) ((((e(i34) ^ f(i35)) ^ i37) ^ i33) & 255)) << i32);
                jE |= ((long) ((((e(i35) ^ f(i37)) ^ i33) ^ i34) & 255)) << i32;
                jE2 |= ((long) ((((e(i37) ^ f(i33)) ^ i34) ^ i35) & 255)) << i32;
                i32 += 8;
                j15 = jE4;
                i12 = i36;
                i13 = i13;
                j10 = 255;
                j16 = jE3;
            }
            this.f88568f = j16;
            this.f88569g = j15;
            this.f88570h = jE;
            this.f88571i = jE2;
            a(jArr3[i14]);
            i14++;
            i12 = i12;
            i13 = i13;
            j10 = 255;
            i15 = 0;
        }
    }

    public RijndaelEngine(int i10) {
        byte[][] bArr = f88562s;
        byte[][] bArr2 = f88561r;
        if (i10 == 128) {
            this.f88563a = 32;
            this.f88564b = 4294967295L;
            this.f88573k = bArr2[0];
            this.f88574l = bArr[0];
        } else if (i10 == 160) {
            this.f88563a = 40;
            this.f88564b = 1099511627775L;
            this.f88573k = bArr2[1];
            this.f88574l = bArr[1];
        } else if (i10 == 192) {
            this.f88563a = 48;
            this.f88564b = 281474976710655L;
            this.f88573k = bArr2[2];
            this.f88574l = bArr[2];
        } else if (i10 == 224) {
            this.f88563a = 56;
            this.f88564b = 72057594037927935L;
            this.f88573k = bArr2[3];
            this.f88574l = bArr[3];
        } else {
            if (i10 != 256) {
                throw new IllegalArgumentException("unknown blocksize to Rijndael");
            }
            this.f88563a = 64;
            this.f88564b = -1L;
            this.f88573k = bArr2[4];
            this.f88574l = bArr[4];
        }
        this.f88566d = i10;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }
}
