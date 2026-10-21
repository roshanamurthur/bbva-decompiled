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
import org.bouncycastle.crypto.ExtendedDigest;
import org.bouncycastle.util.Memoable;

/* JADX INFO: loaded from: classes2.dex */
public class MD2Digest implements ExtendedDigest, Memoable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte[] f88080f = {41, 46, 67, -55, -94, -40, 124, 1, Base64.padSymbol, 54, 84, -95, -20, Constants.CVR_B2b8765_1111_APP_DISABLED, 6, 19, 98, -89, 5, -13, Constants.CVR_B2b87_11_RFU, -57, 115, -116, -104, -109, 43, -39, -68, 76, -126, -54, MessageUtils.MESSAGE_30_RS, -101, 87, 60, -3, -44, -32, 22, 103, 66, Constants.FCI_TEMPLATE, 24, -118, 23, -27, MessageUtils.MESSAGE_18_DC2, -66, 78, -60, -42, -38, -98, -34, 73, -96, -5, -11, ComputeCcCommandApdu.EXPECTED_P1, -69, 47, -18, 122, -87, 104, 121, -111, MessageUtils.MESSAGE_21_NAK, UtilitiesSDKConstants.SRP_LABEL_MAC, 7, 63, -108, -62, 16, -119, 11, 34, Constants.STATE_ERROR, 33, -128, 127, 93, -102, 90, -112, 50, 39, 53, 62, -52, -25, ByteSourceJsonBootstrapper.UTF8_BOM_3, -9, -105, 3, -1, 25, 48, -77, 72, -91, -75, -47, -41, 94, -110, 42, -84, 86, -86, -58, 79, -72, 56, -46, -106, -92, 125, -74, 118, -4, 107, -30, -100, 116, 4, -15, 69, -99, Constants.CVR_B1b85_0111_VERIFIED_CLOUD, 89, 100, 113, -121, 32, -122, 91, Constants.CVR_B2b65_CLEAR_BITS, 101, -26, 45, -88, 2, 27, Constants.CVR_B1b85_0110_TERMINAL, 37, -83, -82, UtilitiesSDKConstants.SRP_LABEL_ENC, -71, -10, 28, 70, Constants.DIRECTORY_ENTRY, 105, 52, 64, 126, 15, 85, 71, -93, 35, -35, 81, -81, 58, -61, 92, -7, -50, -70, -59, -22, GenerateAcResponseApdu.DAD_ICC_DYNAMIC_DATA_LENGTH, 44, 83, 13, 110, -123, 40, -124, 9, -45, -33, -51, -12, 65, KSUtils.PLAIN_BUFFER, 77, 82, GenerateAcResponseApdu.DDA_HEADER, -36, 55, -56, 108, -63, -85, -6, DigipassSDKConstants.SECURE_CHANNEL_MESSAGE_TYPE_INFORMATION_MESSAGE, -31, 123, 8, 12, -67, -79, 74, 120, -120, -107, -117, -29, 99, -24, 109, -23, -53, -43, -2, 59, 0, 29, 57, -14, ByteSourceJsonBootstrapper.UTF8_BOM_1, -73, Constants.CVR_B1b41_1110_ONLINE_PIN, 102, 88, -48, -28, -90, Constants.RESP_MSG_TEMPLATE_FORMAT_2, 114, -8, -21, 117, 75, 10, 49, 68, Constants.CVR_B1b85_0101_MOBILE_APP, -76, -113, -19, 31, MessageUtils.MESSAGE_26_SUB, -37, -103, -115, 51, -97, 17, GetProcessingOptionsCommandApdu.COMMAND_TEMPLATE_TAG, 20};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f88081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f88082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f88083c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f88084d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f88085e;

    public MD2Digest() {
        this.f88081a = new byte[48];
        this.f88083c = new byte[16];
        this.f88085e = new byte[16];
        reset();
    }

    public final void a(MD2Digest mD2Digest) {
        byte[] bArr = mD2Digest.f88081a;
        System.arraycopy(bArr, 0, this.f88081a, 0, bArr.length);
        this.f88082b = mD2Digest.f88082b;
        byte[] bArr2 = this.f88083c;
        byte[] bArr3 = mD2Digest.f88083c;
        System.arraycopy(bArr3, 0, bArr2, 0, bArr3.length);
        this.f88084d = mD2Digest.f88084d;
        byte[] bArr4 = this.f88085e;
        byte[] bArr5 = mD2Digest.f88085e;
        System.arraycopy(bArr5, 0, bArr4, 0, bArr5.length);
    }

    @Override // org.bouncycastle.util.Memoable
    public Memoable copy() {
        return new MD2Digest(this);
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i10) {
        byte[] bArr2 = this.f88083c;
        int length = bArr2.length;
        int i11 = this.f88084d;
        byte b10 = (byte) (length - i11);
        while (i11 < bArr2.length) {
            bArr2[i11] = b10;
            i11++;
        }
        processCheckSum(bArr2);
        processBlock(bArr2);
        processBlock(this.f88085e);
        System.arraycopy(this.f88081a, this.f88082b, bArr, i10, 16);
        reset();
        return 16;
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return "MD2";
    }

    @Override // org.bouncycastle.crypto.ExtendedDigest
    public int getByteLength() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return 16;
    }

    public void processBlock(byte[] bArr) {
        byte[] bArr2;
        int i10 = 0;
        while (true) {
            bArr2 = this.f88081a;
            if (i10 >= 16) {
                break;
            }
            bArr2[i10 + 16] = bArr[i10];
            bArr2[i10 + 32] = (byte) (bArr[i10] ^ bArr2[i10]);
            i10++;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < 18; i12++) {
            for (int i13 = 0; i13 < 48; i13++) {
                byte b10 = (byte) (f88080f[i11] ^ bArr2[i13]);
                bArr2[i13] = b10;
                i11 = b10 & 255;
            }
            i11 = (i11 + i12) % 256;
        }
    }

    public void processCheckSum(byte[] bArr) {
        byte[] bArr2 = this.f88085e;
        byte b10 = bArr2[15];
        for (int i10 = 0; i10 < 16; i10++) {
            b10 = (byte) (f88080f[(b10 ^ bArr[i10]) & 255] ^ bArr2[i10]);
            bArr2[i10] = b10;
        }
    }

    @Override // org.bouncycastle.crypto.Digest
    public void reset() {
        this.f88082b = 0;
        int i10 = 0;
        while (true) {
            byte[] bArr = this.f88081a;
            if (i10 == bArr.length) {
                break;
            }
            bArr[i10] = 0;
            i10++;
        }
        this.f88084d = 0;
        int i11 = 0;
        while (true) {
            byte[] bArr2 = this.f88083c;
            if (i11 == bArr2.length) {
                break;
            }
            bArr2[i11] = 0;
            i11++;
        }
        int i12 = 0;
        while (true) {
            byte[] bArr3 = this.f88085e;
            if (i12 == bArr3.length) {
                return;
            }
            bArr3[i12] = 0;
            i12++;
        }
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte b10) {
        int i10 = this.f88084d;
        int i11 = i10 + 1;
        this.f88084d = i11;
        byte[] bArr = this.f88083c;
        bArr[i10] = b10;
        if (i11 == 16) {
            processCheckSum(bArr);
            processBlock(bArr);
            this.f88084d = 0;
        }
    }

    public MD2Digest(MD2Digest mD2Digest) {
        this.f88081a = new byte[48];
        this.f88083c = new byte[16];
        this.f88085e = new byte[16];
        a(mD2Digest);
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(Memoable memoable) {
        a((MD2Digest) memoable);
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte[] bArr, int i10, int i11) {
        while (this.f88084d != 0 && i11 > 0) {
            update(bArr[i10]);
            i10++;
            i11--;
        }
        while (i11 > 16) {
            byte[] bArr2 = this.f88083c;
            System.arraycopy(bArr, i10, bArr2, 0, 16);
            processCheckSum(bArr2);
            processBlock(bArr2);
            i11 -= 16;
            i10 += 16;
        }
        while (i11 > 0) {
            update(bArr[i10]);
            i10++;
            i11--;
        }
    }
}
