package org.bouncycastle.crypto.digests;

import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.GenerateAcResponseApdu;
import com.noknok.android.client.asm.authenticator.KSUtils;
import com.vasco.digipass.sdk.DigipassSDKConstants;
import com.vasco.digipass.sdk.utils.utilities.UtilitiesSDKConstants;
import com.vierge.pinpadsdk.message.base.MessageUtils;
import java.lang.reflect.Array;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class Haraka256Digest extends HarakaBase {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[][] f88065d = {new byte[]{6, -124, Constants.CVR_B1b85_0111_VERIFIED_CLOUD, 76, -26, 32, Constants.CVR_B2b87_11_RFU, 10, UtilitiesSDKConstants.SRP_LABEL_MAC, -59, -2, Constants.CVR_B2b8765_1111_APP_DISABLED, 117, KSUtils.PLAIN_BUFFER, 123, -99}, new byte[]{-117, 102, -76, -31, -120, -13, -96, 107, 100, 15, 107, -92, 47, 8, -9, 23}, new byte[]{52, 2, -34, 45, 83, -14, -124, -104, Constants.CVR_B2b65_CLEAR_BITS, 2, -99, Constants.CVR_B1b85_0110_TERMINAL, -97, 2, -111, 20}, new byte[]{Constants.CVR_B1b41_1110_ONLINE_PIN, -42, -22, -26, 46, 123, 79, 8, -69, -13, -68, -81, -3, 91, 79, 121}, new byte[]{-53, Constants.CVR_B2b65_CLEAR_BITS, UtilitiesSDKConstants.SRP_LABEL_ENC, -53, 72, 114, 68, -117, 121, -18, -51, 28, -66, 57, Constants.CVR_B1b85_0111_VERIFIED_CLOUD, 68}, new byte[]{126, -22, -51, -18, 110, -112, 50, -73, -115, 83, 53, -19, 43, -118, 5, 123}, new byte[]{103, -62, -113, 67, 94, 46, 124, -48, -30, 65, 39, Constants.DIRECTORY_ENTRY, -38, 79, ByteSourceJsonBootstrapper.UTF8_BOM_1, 27}, new byte[]{41, DigipassSDKConstants.SECURE_CHANNEL_MESSAGE_TYPE_INFORMATION_MESSAGE, -39, UtilitiesSDKConstants.SRP_LABEL_ENC, -81, -54, -52, 7, 103, Constants.STATE_ERROR, -3, -30, 31, -57, 11, 59}, new byte[]{-85, 77, 99, -15, -26, -122, 127, -23, -20, -37, -113, -54, -71, -44, 101, -18}, new byte[]{28, 48, ByteSourceJsonBootstrapper.UTF8_BOM_3, -124, -44, -73, -51, 100, 91, 42, 64, 79, -83, 3, 126, 51}, new byte[]{UtilitiesSDKConstants.SRP_LABEL_MAC, -52, 11, -71, -108, 23, 35, ByteSourceJsonBootstrapper.UTF8_BOM_3, 105, 2, -117, 46, -115, -10, -104, 0}, new byte[]{-6, 4, 120, -90, -34, Constants.FCI_TEMPLATE, 85, 114, 74, -86, -98, -56, 92, -99, 45, -118}, new byte[]{-33, -76, -97, 43, 107, Constants.RESP_MSG_TEMPLATE_FORMAT_2, 42, MessageUtils.MESSAGE_18_DC2, Constants.CVR_B1b41_1110_ONLINE_PIN, -6, 79, 46, 41, MessageUtils.MESSAGE_18_DC2, -97, -44}, new byte[]{MessageUtils.MESSAGE_30_RS, -95, 3, 68, -12, 73, -94, 54, 50, -42, 17, -82, -69, GenerateAcResponseApdu.DDA_HEADER, MessageUtils.MESSAGE_18_DC2, -18}, new byte[]{-81, 4, 73, -120, 75, 5, 0, -124, Constants.STATE_ERROR, -106, 0, -55, -100, -88, -20, -90}, new byte[]{33, 2, 94, -40, -99, 25, -100, 79, 120, -94, -57, -29, 39, -27, -109, -20}, new byte[]{ByteSourceJsonBootstrapper.UTF8_BOM_3, 58, -86, -8, -89, 89, -55, -73, -71, 40, 46, -51, -126, -44, 1, 115}, new byte[]{98, Constants.CVR_B1b85_0110_TERMINAL, Constants.CVR_B1b85_0111_VERIFIED_CLOUD, 13, Constants.DIRECTORY_ENTRY, -122, UtilitiesSDKConstants.SRP_LABEL_ENC, 23, 55, -14, ByteSourceJsonBootstrapper.UTF8_BOM_1, -39, 16, 48, 125, 107}, new byte[]{90, -54, 69, -62, 33, 48, 4, 67, KSUtils.PLAIN_BUFFER, -62, -111, 83, -10, -4, -102, -58}, new byte[]{-110, 35, -105, 60, 34, 107, 104, -69, 44, -81, -110, -24, 54, -47, -108, 58}};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f88066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f88067c;

    public Haraka256Digest() {
        this.f88066b = new byte[32];
    }

    public static void e(byte[][] bArr, byte[][] bArr2) {
        System.arraycopy(bArr[0], 0, bArr2[0], 0, 4);
        System.arraycopy(bArr[1], 0, bArr2[0], 4, 4);
        System.arraycopy(bArr[0], 4, bArr2[0], 8, 4);
        System.arraycopy(bArr[1], 4, bArr2[0], 12, 4);
        System.arraycopy(bArr[0], 8, bArr2[1], 0, 4);
        System.arraycopy(bArr[1], 8, bArr2[1], 4, 4);
        System.arraycopy(bArr[0], 12, bArr2[1], 8, 4);
        System.arraycopy(bArr[1], 12, bArr2[1], 12, 4);
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i10) {
        if (this.f88067c != 32) {
            throw new IllegalStateException("input must be exactly 32 bytes");
        }
        if (bArr.length - i10 < 32) {
            throw new IllegalArgumentException("output too short to receive digest");
        }
        Class cls = Byte.TYPE;
        byte[][] bArr2 = (byte[][]) Array.newInstance((Class<?>) cls, 2, 16);
        byte[][] bArr3 = (byte[][]) Array.newInstance((Class<?>) cls, 2, 16);
        byte[] bArr4 = bArr2[0];
        byte[] bArr5 = this.f88066b;
        System.arraycopy(bArr5, 0, bArr4, 0, 16);
        System.arraycopy(bArr5, 16, bArr2[1], 0, 16);
        byte[] bArr6 = bArr2[0];
        byte[][] bArr7 = f88065d;
        bArr2[0] = HarakaBase.a(bArr6, bArr7[0]);
        bArr2[1] = HarakaBase.a(bArr2[1], bArr7[1]);
        bArr2[0] = HarakaBase.a(bArr2[0], bArr7[2]);
        bArr2[1] = HarakaBase.a(bArr2[1], bArr7[3]);
        e(bArr2, bArr3);
        bArr2[0] = HarakaBase.a(bArr3[0], bArr7[4]);
        bArr2[1] = HarakaBase.a(bArr3[1], bArr7[5]);
        bArr2[0] = HarakaBase.a(bArr2[0], bArr7[6]);
        bArr2[1] = HarakaBase.a(bArr2[1], bArr7[7]);
        e(bArr2, bArr3);
        bArr2[0] = HarakaBase.a(bArr3[0], bArr7[8]);
        bArr2[1] = HarakaBase.a(bArr3[1], bArr7[9]);
        bArr2[0] = HarakaBase.a(bArr2[0], bArr7[10]);
        bArr2[1] = HarakaBase.a(bArr2[1], bArr7[11]);
        e(bArr2, bArr3);
        bArr2[0] = HarakaBase.a(bArr3[0], bArr7[12]);
        bArr2[1] = HarakaBase.a(bArr3[1], bArr7[13]);
        bArr2[0] = HarakaBase.a(bArr2[0], bArr7[14]);
        bArr2[1] = HarakaBase.a(bArr2[1], bArr7[15]);
        e(bArr2, bArr3);
        bArr2[0] = HarakaBase.a(bArr3[0], bArr7[16]);
        bArr2[1] = HarakaBase.a(bArr3[1], bArr7[17]);
        bArr2[0] = HarakaBase.a(bArr2[0], bArr7[18]);
        bArr2[1] = HarakaBase.a(bArr2[1], bArr7[19]);
        e(bArr2, bArr3);
        bArr2[0] = HarakaBase.d(0, bArr3[0], bArr5);
        bArr2[1] = HarakaBase.d(16, bArr3[1], bArr5);
        System.arraycopy(bArr2[0], 0, bArr, i10, 16);
        System.arraycopy(bArr2[1], 0, bArr, i10 + 16, 16);
        reset();
        return 32;
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return "Haraka-256";
    }

    @Override // org.bouncycastle.crypto.Digest
    public void reset() {
        this.f88067c = 0;
        Arrays.clear(this.f88066b);
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte b10) {
        int i10 = this.f88067c;
        if (i10 + 1 > 32) {
            throw new IllegalArgumentException("total input cannot be more than 32 bytes");
        }
        this.f88067c = i10 + 1;
        this.f88066b[i10] = b10;
    }

    public Haraka256Digest(Haraka256Digest haraka256Digest) {
        this.f88066b = Arrays.clone(haraka256Digest.f88066b);
        this.f88067c = haraka256Digest.f88067c;
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte[] bArr, int i10, int i11) {
        int i12 = this.f88067c;
        if (i12 + i11 > 32) {
            throw new IllegalArgumentException("total input cannot be more than 32 bytes");
        }
        System.arraycopy(bArr, i10, this.f88066b, i12, i11);
        this.f88067c += i11;
    }
}
