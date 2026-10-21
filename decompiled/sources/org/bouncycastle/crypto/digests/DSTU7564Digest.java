package org.bouncycastle.crypto.digests;

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
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.bouncycastle.crypto.ExtendedDigest;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Memoable;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes2.dex */
public class DSTU7564Digest implements ExtendedDigest, Memoable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final byte[] f88019k = {-88, 67, Constants.STATE_ERROR, 6, 107, 117, 108, 89, 113, -33, -121, -107, 23, Constants.CVR_B2b8765_1111_APP_DISABLED, -40, 9, 109, -13, 29, -53, -55, 77, 44, -81, 121, -32, -105, -3, Constants.FCI_TEMPLATE, 75, 69, 57, 62, -35, -93, 79, -76, -74, -102, Constants.CVR_B1b41_1110_ONLINE_PIN, 31, ByteSourceJsonBootstrapper.UTF8_BOM_3, MessageUtils.MESSAGE_21_NAK, -31, 73, -46, -109, -58, -110, 114, -98, Constants.DIRECTORY_ENTRY, -47, 99, -6, -18, -12, 25, -43, -83, 88, -92, -69, -95, -36, -14, GetProcessingOptionsCommandApdu.COMMAND_TEMPLATE_TAG, 55, 66, -28, 122, 50, -100, -52, -85, 74, -113, 110, 4, 39, 46, -25, -30, 90, -106, 22, 35, 43, -62, 101, 102, 15, -68, -87, 71, 65, 52, 72, -4, -73, GenerateAcResponseApdu.DDA_HEADER, -120, -91, 83, -122, -7, 91, -37, 56, 123, -61, MessageUtils.MESSAGE_30_RS, 34, 51, DigipassSDKConstants.SECURE_CHANNEL_MESSAGE_TYPE_INFORMATION_MESSAGE, 40, 54, -57, UtilitiesSDKConstants.SRP_LABEL_MAC, 59, ComputeCcCommandApdu.EXPECTED_P1, Constants.RESP_MSG_TEMPLATE_FORMAT_2, -70, -11, 20, -97, 8, 85, -101, 76, -2, Constants.CVR_B1b85_0110_TERMINAL, 92, -38, 24, 70, -51, 125, 33, UtilitiesSDKConstants.SRP_LABEL_ENC, 63, 27, -119, -1, -21, -124, 105, 58, -99, -41, -45, Constants.CVR_B1b85_0111_VERIFIED_CLOUD, 103, 64, -75, -34, 93, 48, -111, -79, 120, 17, 1, -27, 0, 104, -104, -96, -59, 2, -90, 116, 45, 11, -94, 118, -77, -66, -50, -67, -82, -23, -118, 49, 28, -20, -15, -103, -108, -86, -10, GenerateAcResponseApdu.DAD_ICC_DYNAMIC_DATA_LENGTH, 47, ByteSourceJsonBootstrapper.UTF8_BOM_1, -24, -116, 53, 3, -44, 127, -5, 5, -63, 94, -112, 32, Base64.padSymbol, -126, -9, -22, 10, 13, 126, -8, Constants.CVR_B1b85_0101_MOBILE_APP, MessageUtils.MESSAGE_26_SUB, -60, 7, 87, -72, 60, 98, -29, -56, -84, 82, 100, 16, -48, -39, 19, 12, MessageUtils.MESSAGE_18_DC2, 41, 81, -71, Constants.CVR_B2b65_CLEAR_BITS, -42, 115, -115, KSUtils.PLAIN_BUFFER, 84, Constants.CVR_B2b87_11_RFU, -19, 78, 68, -89, 42, -123, 37, -26, -54, 124, -117, 86, -128};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final byte[] f88020l = {-50, -69, -21, -110, -22, -53, 19, -63, -23, 58, -42, UtilitiesSDKConstants.SRP_LABEL_MAC, -46, -112, 23, -8, 66, MessageUtils.MESSAGE_21_NAK, 86, -76, 101, 28, -120, 67, -59, 92, 54, -70, -11, 87, 103, -115, 49, -10, 100, 88, -98, -12, 34, -86, 117, 15, 2, -79, -33, 109, 115, 77, 124, GenerateAcResponseApdu.DAD_ICC_DYNAMIC_DATA_LENGTH, 46, -9, 8, 93, 68, 62, -97, 20, -56, -82, 84, 16, -40, -68, MessageUtils.MESSAGE_26_SUB, 107, 105, -13, -67, 51, -85, -6, -47, -101, 104, 78, 22, -107, -111, -18, 76, 99, ComputeCcCommandApdu.EXPECTED_P1, 91, -52, 60, 25, -95, KSUtils.PLAIN_BUFFER, 73, 123, -39, Constants.FCI_TEMPLATE, 55, Constants.CVR_B1b85_0110_TERMINAL, -54, -25, 43, 72, -3, -106, 69, -4, 65, MessageUtils.MESSAGE_18_DC2, 13, 121, -27, -119, -116, -29, 32, 48, -36, -73, 108, 74, -75, 63, -105, -44, 98, 45, 6, -92, -91, GetProcessingOptionsCommandApdu.COMMAND_TEMPLATE_TAG, Constants.STATE_ERROR, 42, -38, -55, 0, 126, -94, 85, ByteSourceJsonBootstrapper.UTF8_BOM_3, 17, -43, -100, Constants.CVR_B2b65_CLEAR_BITS, Constants.CVR_B1b41_1110_ONLINE_PIN, 10, Base64.padSymbol, 81, 125, -109, 27, -2, -60, 71, 9, -122, 11, -113, -99, GenerateAcResponseApdu.DDA_HEADER, 7, -71, UtilitiesSDKConstants.SRP_LABEL_ENC, -104, 24, 50, 113, 75, ByteSourceJsonBootstrapper.UTF8_BOM_1, 59, Constants.CVR_B1b85_0111_VERIFIED_CLOUD, -96, -28, 64, -1, -61, -87, -26, 120, -7, -117, 70, -128, MessageUtils.MESSAGE_30_RS, 56, -31, -72, -88, -32, 12, 35, 118, 29, 37, DigipassSDKConstants.SECURE_CHANNEL_MESSAGE_TYPE_INFORMATION_MESSAGE, 5, -15, 110, -108, 40, -102, -124, -24, -93, 79, Constants.RESP_MSG_TEMPLATE_FORMAT_2, -45, -123, -30, 82, -14, -126, Constants.CVR_B1b85_0101_MOBILE_APP, 122, 47, 116, 83, -77, Constants.DIRECTORY_ENTRY, -81, 57, 53, -34, -51, 31, -103, -84, -83, 114, 44, -35, -48, -121, -66, 94, -90, -20, 4, -58, 3, 52, -5, -37, 89, -74, -62, 1, Constants.CVR_B2b8765_1111_APP_DISABLED, 90, -19, -89, 102, 33, 127, -118, 39, -57, Constants.CVR_B2b87_11_RFU, 41, -41};
    public static final byte[] m = {-109, -39, -102, -75, -104, 34, 69, -4, -70, GenerateAcResponseApdu.DDA_HEADER, -33, 2, -97, -36, 81, 89, 74, 23, 43, -62, -108, -12, -69, -93, 98, -28, 113, -44, -51, Constants.CVR_B1b85_0111_VERIFIED_CLOUD, 22, -31, 73, 60, Constants.CVR_B2b87_11_RFU, -40, 92, -101, -83, -123, 83, -95, 122, -56, 45, -32, -47, 114, -90, 44, -60, -29, 118, 120, -73, -76, 9, 59, Constants.CVR_B1b41_1110_ONLINE_PIN, 65, 76, -34, UtilitiesSDKConstants.SRP_LABEL_MAC, -112, 37, -91, -41, 3, 17, 0, -61, 46, -110, ByteSourceJsonBootstrapper.UTF8_BOM_1, 78, MessageUtils.MESSAGE_18_DC2, -99, 125, -53, 53, 16, -43, 79, -98, 77, -87, 85, -58, -48, 123, 24, -105, -45, 54, -26, 72, 86, KSUtils.PLAIN_BUFFER, -113, Constants.RESP_MSG_TEMPLATE_FORMAT_2, -52, -100, -71, -30, -84, -72, 47, MessageUtils.MESSAGE_21_NAK, -92, 124, -38, 56, MessageUtils.MESSAGE_30_RS, 11, 5, -42, 20, 110, 108, 126, 102, -3, -79, -27, Constants.CVR_B1b85_0110_TERMINAL, -81, 94, 51, -121, -55, Constants.CVR_B2b8765_1111_APP_DISABLED, 93, 109, 63, -120, -115, -57, -9, 29, -23, -20, -19, -128, 41, 39, Constants.CVR_B2b65_CLEAR_BITS, -103, -88, Constants.CVR_B1b85_0101_MOBILE_APP, 15, 55, DigipassSDKConstants.SECURE_CHANNEL_MESSAGE_TYPE_INFORMATION_MESSAGE, 40, 48, -107, -46, 62, 91, 64, GetProcessingOptionsCommandApdu.COMMAND_TEMPLATE_TAG, -77, 105, 87, 31, 7, 28, -118, -68, 32, -21, -50, ComputeCcCommandApdu.EXPECTED_P1, -85, -18, 49, -94, 115, -7, -54, 58, MessageUtils.MESSAGE_26_SUB, -5, 13, -63, -2, -6, -14, Constants.FCI_TEMPLATE, -67, -106, -35, 67, 82, -74, 8, -13, -82, -66, 25, -119, 50, GenerateAcResponseApdu.DAD_ICC_DYNAMIC_DATA_LENGTH, UtilitiesSDKConstants.SRP_LABEL_ENC, -22, 75, 100, -124, -126, 107, -11, 121, ByteSourceJsonBootstrapper.UTF8_BOM_3, 1, Constants.STATE_ERROR, 117, 99, 27, 35, Base64.padSymbol, 104, 42, 101, -24, -111, -10, -1, 19, 88, -15, 71, 10, 127, -59, -89, -25, Constants.DIRECTORY_ENTRY, 90, 6, 70, 68, 66, 4, -96, -37, 57, -122, 84, -86, -116, 52, 33, -117, -8, 12, 116, 103};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final byte[] f88021n = {104, -115, -54, 77, 115, 75, 78, 42, -44, 82, GenerateAcResponseApdu.DAD_ICC_DYNAMIC_DATA_LENGTH, -77, 84, MessageUtils.MESSAGE_30_RS, 25, 31, 34, 3, 70, Base64.padSymbol, 45, 74, 83, GetProcessingOptionsCommandApdu.COMMAND_TEMPLATE_TAG, 19, -118, -73, -43, 37, 121, -11, -67, 88, 47, 13, 2, -19, 81, -98, 17, -14, 62, 85, 94, -47, 22, 60, 102, Constants.CVR_B1b85_0111_VERIFIED_CLOUD, 93, -13, 69, 64, -52, -24, -108, 86, 8, -50, MessageUtils.MESSAGE_26_SUB, 58, -46, -31, -33, -75, 56, 110, Constants.CVR_B1b41_1110_ONLINE_PIN, -27, -12, -7, -122, -23, 79, -42, -123, 35, Constants.CVR_B2b65_CLEAR_BITS, 50, -103, 49, 20, -82, -18, -56, 72, -45, 48, -95, -110, 65, -79, 24, -60, 44, 113, 114, 68, MessageUtils.MESSAGE_21_NAK, -3, 55, -66, Constants.STATE_ERROR, -86, -101, -120, -40, -85, -119, -100, -6, Constants.CVR_B1b85_0110_TERMINAL, -22, -68, 98, 12, DigipassSDKConstants.SECURE_CHANNEL_MESSAGE_TYPE_INFORMATION_MESSAGE, -90, -88, -20, 103, 32, -37, 124, 40, -35, -84, 91, 52, 126, 16, -15, 123, -113, 99, -96, 5, -102, 67, Constants.RESP_MSG_TEMPLATE_FORMAT_2, 33, ByteSourceJsonBootstrapper.UTF8_BOM_3, 39, 9, -61, -97, -74, -41, 41, -62, -21, Constants.CVR_B2b87_11_RFU, -92, -117, -116, 29, -5, -1, -63, UtilitiesSDKConstants.SRP_LABEL_MAC, -105, 46, -8, 101, -10, 117, 7, 4, 73, 51, -28, -39, -71, -48, 66, -57, 108, -112, 0, ComputeCcCommandApdu.EXPECTED_P1, Constants.FCI_TEMPLATE, Constants.CVR_B1b85_0101_MOBILE_APP, 1, -59, -38, 71, 63, -51, 105, -94, -30, 122, -89, -58, -109, 15, 10, 6, -26, 43, -106, -93, 28, -81, GenerateAcResponseApdu.DDA_HEADER, MessageUtils.MESSAGE_18_DC2, -124, 57, -25, UtilitiesSDKConstants.SRP_LABEL_ENC, -126, -9, -2, -99, -121, 92, KSUtils.PLAIN_BUFFER, 53, -34, -76, -91, -4, -128, ByteSourceJsonBootstrapper.UTF8_BOM_1, -53, -69, 107, 118, -70, 90, 125, 120, 11, -107, -29, -83, 116, -104, 59, 54, 100, 109, -36, Constants.CVR_B2b8765_1111_APP_DISABLED, 89, -87, 76, 23, 127, -111, -72, -55, 87, 27, -32, Constants.DIRECTORY_ENTRY};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f88022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f88023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f88024c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f88025d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long[] f88026e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long[] f88027f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long[] f88028g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f88029h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f88030i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public byte[] f88031j;

    public DSTU7564Digest(int i10) {
        int i11;
        if (i10 != 256 && i10 != 384 && i10 != 512) {
            throw new IllegalArgumentException("Hash size is not recommended. Use 256/384/512 instead");
        }
        this.f88022a = i10 >>> 3;
        if (i10 > 256) {
            this.f88024c = 16;
            i11 = 14;
        } else {
            this.f88024c = 8;
            i11 = 10;
        }
        this.f88025d = i11;
        int i12 = this.f88024c;
        int i13 = i12 << 3;
        this.f88023b = i13;
        long[] jArr = new long[i12];
        this.f88026e = jArr;
        jArr[0] = i13;
        this.f88027f = new long[i12];
        this.f88028g = new long[i12];
        this.f88031j = new byte[i13];
    }

    public static long e(int i10, long j10) {
        return (j10 << (-i10)) | (j10 >>> i10);
    }

    public final void a(long[] jArr) {
        for (int i10 = 0; i10 < this.f88025d; i10++) {
            long j10 = i10;
            for (int i11 = 0; i11 < this.f88024c; i11++) {
                jArr[i11] = jArr[i11] ^ j10;
                j10 += 16;
            }
            f(jArr);
            g(jArr);
            c(jArr);
        }
    }

    public final void b(DSTU7564Digest dSTU7564Digest) {
        this.f88022a = dSTU7564Digest.f88022a;
        this.f88023b = dSTU7564Digest.f88023b;
        this.f88025d = dSTU7564Digest.f88025d;
        int i10 = this.f88024c;
        if (i10 <= 0 || i10 != dSTU7564Digest.f88024c) {
            this.f88024c = dSTU7564Digest.f88024c;
            this.f88026e = Arrays.clone(dSTU7564Digest.f88026e);
            int i11 = this.f88024c;
            this.f88027f = new long[i11];
            this.f88028g = new long[i11];
            this.f88031j = Arrays.clone(dSTU7564Digest.f88031j);
        } else {
            System.arraycopy(dSTU7564Digest.f88026e, 0, this.f88026e, 0, i10);
            System.arraycopy(dSTU7564Digest.f88031j, 0, this.f88031j, 0, this.f88023b);
        }
        this.f88029h = dSTU7564Digest.f88029h;
        this.f88030i = dSTU7564Digest.f88030i;
    }

    public final void c(long[] jArr) {
        for (int i10 = 0; i10 < this.f88024c; i10++) {
            long j10 = jArr[i10];
            long j11 = ((9187201950435737471L & j10) << 1) ^ (((j10 & (-9187201950435737472L)) >>> 7) * 29);
            long jE = e(8, j10) ^ j10;
            long jE2 = (jE ^ e(16, jE)) ^ e(48, j10);
            long j12 = (j10 ^ jE2) ^ j11;
            jArr[i10] = ((e(32, (((j12 & 4629771061636907072L) >>> 6) * 29) ^ (((((-9187201950435737472L) & j12) >>> 6) * 29) ^ ((4557430888798830399L & j12) << 2))) ^ jE2) ^ e(40, j11)) ^ e(48, j11);
        }
    }

    @Override // org.bouncycastle.util.Memoable
    public Memoable copy() {
        return new DSTU7564Digest(this);
    }

    public final void d(int i10, byte[] bArr) {
        for (int i11 = 0; i11 < this.f88024c; i11++) {
            long jLittleEndianToLong = Pack.littleEndianToLong(bArr, i10);
            i10 += 8;
            this.f88027f[i11] = this.f88026e[i11] ^ jLittleEndianToLong;
            this.f88028g[i11] = jLittleEndianToLong;
        }
        a(this.f88027f);
        long[] jArr = this.f88028g;
        for (int i12 = 0; i12 < this.f88025d; i12++) {
            long j10 = (((long) (((this.f88024c - 1) << 4) ^ i12)) << 56) | 67818912035696883L;
            for (int i13 = 0; i13 < this.f88024c; i13++) {
                jArr[i13] = jArr[i13] + j10;
                j10 -= LockFreeTaskQueueCore.FROZEN_MASK;
            }
            f(jArr);
            g(jArr);
            c(jArr);
        }
        for (int i14 = 0; i14 < this.f88024c; i14++) {
            long[] jArr2 = this.f88026e;
            jArr2[i14] = jArr2[i14] ^ (this.f88027f[i14] ^ this.f88028g[i14]);
        }
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i10) {
        int i11;
        int i12;
        int i13 = this.f88030i;
        byte[] bArr2 = this.f88031j;
        int i14 = i13 + 1;
        this.f88030i = i14;
        bArr2[i13] = -128;
        int i15 = this.f88023b - 12;
        int i16 = 0;
        if (i14 > i15) {
            while (true) {
                int i17 = this.f88030i;
                if (i17 >= this.f88023b) {
                    break;
                }
                byte[] bArr3 = this.f88031j;
                this.f88030i = i17 + 1;
                bArr3[i17] = 0;
            }
            this.f88030i = 0;
            d(0, this.f88031j);
        }
        while (true) {
            i11 = this.f88030i;
            if (i11 >= i15) {
                break;
            }
            byte[] bArr4 = this.f88031j;
            this.f88030i = i11 + 1;
            bArr4[i11] = 0;
        }
        long j10 = (((this.f88029h & 4294967295L) * ((long) this.f88023b)) + ((long) i13)) << 3;
        Pack.intToLittleEndian((int) j10, this.f88031j, i11);
        int i18 = this.f88030i + 4;
        this.f88030i = i18;
        Pack.longToLittleEndian((j10 >>> 32) + (((this.f88029h >>> 32) * ((long) this.f88023b)) << 3), this.f88031j, i18);
        d(0, this.f88031j);
        System.arraycopy(this.f88026e, 0, this.f88027f, 0, this.f88024c);
        a(this.f88027f);
        while (true) {
            i12 = this.f88024c;
            if (i16 >= i12) {
                break;
            }
            long[] jArr = this.f88026e;
            jArr[i16] = jArr[i16] ^ this.f88027f[i16];
            i16++;
        }
        for (int i19 = i12 - (this.f88022a >>> 3); i19 < this.f88024c; i19++) {
            Pack.longToLittleEndian(this.f88026e[i19], bArr, i10);
            i10 += 8;
        }
        reset();
        return this.f88022a;
    }

    public final void f(long[] jArr) {
        int i10 = this.f88024c;
        if (i10 == 8) {
            long j10 = jArr[0];
            long j11 = jArr[1];
            long j12 = jArr[2];
            long j13 = jArr[3];
            long j14 = jArr[4];
            long j15 = jArr[5];
            long j16 = jArr[6];
            long j17 = jArr[7];
            long j18 = (j10 ^ j14) & (-4294967296L);
            long j19 = j10 ^ j18;
            long j20 = j14 ^ j18;
            long j21 = (j11 ^ j15) & 72057594021150720L;
            long j22 = j11 ^ j21;
            long j23 = j15 ^ j21;
            long j24 = (j12 ^ j16) & 281474976645120L;
            long j25 = j12 ^ j24;
            long j26 = j16 ^ j24;
            long j27 = (j13 ^ j17) & 1099511627520L;
            long j28 = j13 ^ j27;
            long j29 = j17 ^ j27;
            long j30 = (j19 ^ j25) & (-281470681808896L);
            long j31 = j19 ^ j30;
            long j32 = j25 ^ j30;
            long j33 = (j22 ^ j28) & 72056494543077120L;
            long j34 = j22 ^ j33;
            long j35 = j28 ^ j33;
            long j36 = (j20 ^ j26) & (-281470681808896L);
            long j37 = j20 ^ j36;
            long j38 = j26 ^ j36;
            long j39 = (j23 ^ j29) & 72056494543077120L;
            long j40 = j23 ^ j39;
            long j41 = j29 ^ j39;
            long j42 = (j31 ^ j34) & (-71777214294589696L);
            long j43 = j31 ^ j42;
            long j44 = j34 ^ j42;
            long j45 = (j32 ^ j35) & (-71777214294589696L);
            long j46 = j32 ^ j45;
            long j47 = j35 ^ j45;
            long j48 = (j37 ^ j40) & (-71777214294589696L);
            long j49 = (j38 ^ j41) & (-71777214294589696L);
            jArr[0] = j43;
            jArr[1] = j44;
            jArr[2] = j46;
            jArr[3] = j47;
            jArr[4] = j37 ^ j48;
            jArr[5] = j40 ^ j48;
            jArr[6] = j38 ^ j49;
            jArr[7] = j41 ^ j49;
            return;
        }
        if (i10 != 16) {
            throw new IllegalStateException("unsupported state size: only 512/1024 are allowed");
        }
        long j50 = jArr[0];
        long j51 = jArr[1];
        long j52 = jArr[2];
        long j53 = jArr[3];
        long j54 = jArr[4];
        long j55 = jArr[5];
        long j56 = jArr[6];
        long j57 = jArr[7];
        long j58 = jArr[8];
        long j59 = jArr[9];
        long j60 = jArr[10];
        long j61 = jArr[11];
        long j62 = jArr[12];
        long j63 = jArr[13];
        long j64 = jArr[14];
        long j65 = jArr[15];
        long j66 = (j50 ^ j58) & (-72057594037927936L);
        long j67 = j50 ^ j66;
        long j68 = j58 ^ j66;
        long j69 = (j51 ^ j59) & (-72057594037927936L);
        long j70 = j51 ^ j69;
        long j71 = j59 ^ j69;
        long j72 = (j52 ^ j60) & (-281474976710656L);
        long j73 = j52 ^ j72;
        long j74 = j60 ^ j72;
        long j75 = (j53 ^ j61) & (-1099511627776L);
        long j76 = j53 ^ j75;
        long j77 = j61 ^ j75;
        long j78 = (j54 ^ j62) & (-4294967296L);
        long j79 = j54 ^ j78;
        long j80 = j62 ^ j78;
        long j81 = (j55 ^ j63) & 72057594021150720L;
        long j82 = j55 ^ j81;
        long j83 = j63 ^ j81;
        long j84 = (j56 ^ j64) & 72057594037862400L;
        long j85 = j56 ^ j84;
        long j86 = j64 ^ j84;
        long j87 = (j57 ^ j65) & 72057594037927680L;
        long j88 = j57 ^ j87;
        long j89 = j65 ^ j87;
        long j90 = (j67 ^ j79) & 72057589742960640L;
        long j91 = j67 ^ j90;
        long j92 = j79 ^ j90;
        long j93 = (j70 ^ j82) & (-16777216);
        long j94 = j70 ^ j93;
        long j95 = j82 ^ j93;
        long j96 = (j73 ^ j85) & (-71776119061282816L);
        long j97 = j73 ^ j96;
        long j98 = j85 ^ j96;
        long j99 = (j76 ^ j88) & (-72056494526300416L);
        long j100 = j76 ^ j99;
        long j101 = j88 ^ j99;
        long j102 = (j68 ^ j80) & 72057589742960640L;
        long j103 = j68 ^ j102;
        long j104 = j80 ^ j102;
        long j105 = (j71 ^ j83) & (-16777216);
        long j106 = j71 ^ j105;
        long j107 = j83 ^ j105;
        long j108 = (j74 ^ j86) & (-71776119061282816L);
        long j109 = j74 ^ j108;
        long j110 = j86 ^ j108;
        long j111 = (j77 ^ j89) & (-72056494526300416L);
        long j112 = j77 ^ j111;
        long j113 = j89 ^ j111;
        long j114 = (j91 ^ j97) & (-281470681808896L);
        long j115 = j91 ^ j114;
        long j116 = j97 ^ j114;
        long j117 = (j94 ^ j100) & 72056494543077120L;
        long j118 = j94 ^ j117;
        long j119 = j100 ^ j117;
        long j120 = (j92 ^ j98) & (-281470681808896L);
        long j121 = j92 ^ j120;
        long j122 = j98 ^ j120;
        long j123 = (j95 ^ j101) & 72056494543077120L;
        long j124 = j95 ^ j123;
        long j125 = j101 ^ j123;
        long j126 = (j103 ^ j109) & (-281470681808896L);
        long j127 = j103 ^ j126;
        long j128 = j109 ^ j126;
        long j129 = (j106 ^ j112) & 72056494543077120L;
        long j130 = j106 ^ j129;
        long j131 = j112 ^ j129;
        long j132 = (j104 ^ j110) & (-281470681808896L);
        long j133 = j104 ^ j132;
        long j134 = j110 ^ j132;
        long j135 = (j107 ^ j113) & 72056494543077120L;
        long j136 = j107 ^ j135;
        long j137 = j113 ^ j135;
        long j138 = (j115 ^ j118) & (-71777214294589696L);
        long j139 = j115 ^ j138;
        long j140 = j118 ^ j138;
        long j141 = (j116 ^ j119) & (-71777214294589696L);
        long j142 = j116 ^ j141;
        long j143 = j119 ^ j141;
        long j144 = (j121 ^ j124) & (-71777214294589696L);
        long j145 = j121 ^ j144;
        long j146 = j124 ^ j144;
        long j147 = (j122 ^ j125) & (-71777214294589696L);
        long j148 = j122 ^ j147;
        long j149 = j125 ^ j147;
        long j150 = (j127 ^ j130) & (-71777214294589696L);
        long j151 = j127 ^ j150;
        long j152 = j130 ^ j150;
        long j153 = (j128 ^ j131) & (-71777214294589696L);
        long j154 = j128 ^ j153;
        long j155 = j131 ^ j153;
        long j156 = (j133 ^ j136) & (-71777214294589696L);
        long j157 = (j134 ^ j137) & (-71777214294589696L);
        jArr[0] = j139;
        jArr[1] = j140;
        jArr[2] = j142;
        jArr[3] = j143;
        jArr[4] = j145;
        jArr[5] = j146;
        jArr[6] = j148;
        jArr[7] = j149;
        jArr[8] = j151;
        jArr[9] = j152;
        jArr[10] = j154;
        jArr[11] = j155;
        jArr[12] = j133 ^ j156;
        jArr[13] = j136 ^ j156;
        jArr[14] = j134 ^ j157;
        jArr[15] = j137 ^ j157;
    }

    public final void g(long[] jArr) {
        for (int i10 = 0; i10 < this.f88024c; i10++) {
            long j10 = jArr[i10];
            int i11 = (int) j10;
            int i12 = (int) (j10 >>> 32);
            byte[] bArr = f88019k;
            byte b10 = bArr[i11 & 255];
            byte[] bArr2 = f88020l;
            byte b11 = bArr2[(i11 >>> 8) & 255];
            byte[] bArr3 = m;
            byte b12 = bArr3[(i11 >>> 16) & 255];
            byte[] bArr4 = f88021n;
            int i13 = (bArr4[i11 >>> 24] << 24) | (b10 & 255) | ((b11 & 255) << 8) | ((b12 & 255) << 16);
            byte b13 = bArr[i12 & 255];
            byte b14 = bArr2[(i12 >>> 8) & 255];
            byte b15 = bArr3[(i12 >>> 16) & 255];
            jArr[i10] = (((long) i13) & 4294967295L) | (((long) ((bArr4[i12 >>> 24] << 24) | (((b13 & 255) | ((b14 & 255) << 8)) | ((b15 & 255) << 16)))) << 32);
        }
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return "DSTU7564";
    }

    @Override // org.bouncycastle.crypto.ExtendedDigest
    public int getByteLength() {
        return this.f88023b;
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return this.f88022a;
    }

    @Override // org.bouncycastle.crypto.Digest
    public void reset() {
        Arrays.fill(this.f88026e, 0L);
        this.f88026e[0] = this.f88023b;
        this.f88029h = 0L;
        this.f88030i = 0;
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte b10) {
        byte[] bArr = this.f88031j;
        int i10 = this.f88030i;
        int i11 = i10 + 1;
        this.f88030i = i11;
        bArr[i10] = b10;
        if (i11 == this.f88023b) {
            d(0, bArr);
            this.f88030i = 0;
            this.f88029h++;
        }
    }

    public DSTU7564Digest(DSTU7564Digest dSTU7564Digest) {
        b(dSTU7564Digest);
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(Memoable memoable) {
        b((DSTU7564Digest) memoable);
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte[] bArr, int i10, int i11) {
        while (this.f88030i != 0 && i11 > 0) {
            update(bArr[i10]);
            i11--;
            i10++;
        }
        if (i11 > 0) {
            while (i11 >= this.f88023b) {
                d(i10, bArr);
                int i12 = this.f88023b;
                i10 += i12;
                i11 -= i12;
                this.f88029h++;
            }
            while (i11 > 0) {
                update(bArr[i10]);
                i11--;
                i10++;
            }
        }
    }
}
