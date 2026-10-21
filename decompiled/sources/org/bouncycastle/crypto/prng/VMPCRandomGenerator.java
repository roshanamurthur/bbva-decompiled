package org.bouncycastle.crypto.prng;

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
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes5.dex */
public class VMPCRandomGenerator implements RandomGenerator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte f89438a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f89439b = {-69, 44, 98, 127, -75, -86, -44, 13, KSUtils.PLAIN_BUFFER, -2, UtilitiesSDKConstants.SRP_LABEL_MAC, -126, -53, -96, -95, 8, 24, 113, 86, -24, 73, 2, 16, -60, -34, 53, -91, -20, -128, MessageUtils.MESSAGE_18_DC2, -72, 105, -38, 47, 117, -52, -94, 9, 54, 3, Constants.DIRECTORY_ENTRY, 45, -3, -32, -35, 5, 67, -112, -83, -56, -31, -81, 87, -101, 76, -40, 81, -82, Constants.CVR_B1b85_0101_MOBILE_APP, -123, 60, 10, -28, -13, -100, GenerateAcResponseApdu.DAD_ICC_DYNAMIC_DATA_LENGTH, 35, 83, -55, GetProcessingOptionsCommandApdu.COMMAND_TEMPLATE_TAG, -105, 70, -79, -103, 100, 49, Constants.RESP_MSG_TEMPLATE_FORMAT_2, -43, 29, -42, 120, -67, 94, UtilitiesSDKConstants.SRP_LABEL_ENC, -118, 34, 56, -8, 104, 43, 42, -59, -45, -9, -68, Constants.FCI_TEMPLATE, -33, 4, -27, -107, 62, 37, -122, -90, 11, -113, -15, DigipassSDKConstants.SECURE_CHANNEL_MESSAGE_TYPE_INFORMATION_MESSAGE, Constants.CVR_B1b41_1110_ONLINE_PIN, -41, 64, -77, Constants.CVR_B2b65_CLEAR_BITS, 126, 6, MessageUtils.MESSAGE_21_NAK, -102, 77, 28, -93, -37, 50, -110, 88, 17, 39, -12, 89, -48, 78, GenerateAcResponseApdu.DDA_HEADER, 23, 91, -84, -1, 7, Constants.CVR_B2b87_11_RFU, 101, 121, -4, -57, -51, 118, 66, 93, -25, 58, 52, 122, 48, 40, 15, 115, 1, -7, -47, -46, 25, -23, -111, -71, 90, -19, 65, 109, -76, -61, -98, ByteSourceJsonBootstrapper.UTF8_BOM_3, 99, -6, 31, 51, Constants.CVR_B1b85_0110_TERMINAL, 71, -119, Constants.CVR_B2b8765_1111_APP_DISABLED, -106, MessageUtils.MESSAGE_26_SUB, Constants.STATE_ERROR, -109, Base64.padSymbol, 55, 75, -39, -88, -63, 27, -10, 57, -117, -73, 12, 32, -50, -120, 110, -74, 116, ComputeCcCommandApdu.EXPECTED_P1, -115, 22, 41, -14, -121, -11, -21, Constants.CVR_B1b85_0111_VERIFIED_CLOUD, -29, -5, 85, -97, -58, 68, 74, 69, 125, -30, 107, 92, 108, 102, -87, -116, -18, -124, 19, -89, MessageUtils.MESSAGE_30_RS, -99, -36, 103, 72, -70, 46, -26, -92, -85, 124, -108, 0, 33, ByteSourceJsonBootstrapper.UTF8_BOM_1, -22, -66, -54, 114, 79, 82, -104, 63, -62, 20, 123, 59, 84};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte f89440c = -66;

    @Override // org.bouncycastle.crypto.prng.RandomGenerator
    public void addSeedMaterial(long j10) {
        addSeedMaterial(Pack.longToBigEndian(j10));
    }

    @Override // org.bouncycastle.crypto.prng.RandomGenerator
    public void nextBytes(byte[] bArr) {
        nextBytes(bArr, 0, bArr.length);
    }

    @Override // org.bouncycastle.crypto.prng.RandomGenerator
    public void addSeedMaterial(byte[] bArr) {
        for (byte b10 : bArr) {
            byte b11 = this.f89440c;
            byte b12 = this.f89438a;
            byte[] bArr2 = this.f89439b;
            byte b13 = bArr2[(b11 + bArr2[b12 & 255] + b10) & 255];
            this.f89440c = b13;
            byte b14 = bArr2[b12 & 255];
            bArr2[b12 & 255] = bArr2[b13 & 255];
            bArr2[b13 & 255] = b14;
            this.f89438a = (byte) ((b12 + 1) & 255);
        }
    }

    @Override // org.bouncycastle.crypto.prng.RandomGenerator
    public void nextBytes(byte[] bArr, int i10, int i11) {
        synchronized (this.f89439b) {
            int i12 = i11 + i10;
            while (i10 != i12) {
                try {
                    byte[] bArr2 = this.f89439b;
                    byte b10 = this.f89440c;
                    byte b11 = this.f89438a;
                    byte b12 = bArr2[(b10 + bArr2[b11 & 255]) & 255];
                    this.f89440c = b12;
                    bArr[i10] = bArr2[(bArr2[bArr2[b12 & 255] & 255] + 1) & 255];
                    byte b13 = bArr2[b11 & 255];
                    bArr2[b11 & 255] = bArr2[b12 & 255];
                    bArr2[b12 & 255] = b13;
                    this.f89438a = (byte) ((b11 + 1) & 255);
                    i10++;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}
