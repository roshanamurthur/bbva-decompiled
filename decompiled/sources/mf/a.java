package mf;

import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper;
import com.google.crypto.tink.annotations.Alpha;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.ComputeCcCommandApdu;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.GenerateAcResponseApdu;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.GetProcessingOptionsCommandApdu;
import com.vasco.digipass.sdk.DigipassSDKConstants;

/* JADX INFO: compiled from: Curve25519.java */
/* JADX INFO: loaded from: classes10.dex */
@Alpha
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[][] f83398a = {new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new byte[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new byte[]{-32, -21, 122, 124, 59, 65, -72, -82, 22, 86, -29, -6, -15, -97, -60, GenerateAcResponseApdu.DDA_HEADER, -38, 9, -115, -21, -100, 50, -79, -3, -122, 98, 5, 22, Constants.STATE_ERROR, 73, -72, 0}, new byte[]{Constants.STATE_ERROR, -100, -107, -68, -93, Constants.CVR_B1b85_0101_MOBILE_APP, -116, DigipassSDKConstants.SECURE_CHANNEL_MESSAGE_TYPE_INFORMATION_MESSAGE, -79, -48, -79, 85, -100, GetProcessingOptionsCommandApdu.COMMAND_TEMPLATE_TAG, ByteSourceJsonBootstrapper.UTF8_BOM_1, 91, 4, 68, 92, -60, 88, 28, ComputeCcCommandApdu.EXPECTED_P1, -122, -40, 34, 78, -35, -48, -97, 17, 87}, new byte[]{-20, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 127}, new byte[]{-19, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 127}, new byte[]{-18, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 127}};

    public static void a(int i10, long[] jArr, long[] jArr2) {
        int i11 = -i10;
        for (int i12 = 0; i12 < 10; i12++) {
            long j10 = jArr[i12];
            jArr[i12] = ((int) j10) ^ ((((int) j10) ^ ((int) jArr2[i12])) & i11);
        }
    }

    public static void b(int i10, long[] jArr, long[] jArr2) {
        int i11 = -i10;
        for (int i12 = 0; i12 < 10; i12++) {
            int i13 = (int) jArr[i12];
            int i14 = (((int) jArr2[i12]) ^ i13) & i11;
            jArr[i12] = i13 ^ i14;
            jArr2[i12] = ((int) jArr2[i12]) ^ i14;
        }
    }
}
