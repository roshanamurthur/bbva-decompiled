package net.lingala.zip4j.crypto.engine;

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
import net.lingala.zip4j.exception.ZipException;

/* JADX INFO: loaded from: classes12.dex */
public class AESEngine {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final byte[] f84923g = {99, 124, Constants.RESP_MSG_TEMPLATE_FORMAT_2, 123, -14, 107, Constants.FCI_TEMPLATE, -59, 48, 1, 103, 43, -2, -41, -85, 118, -54, -126, -55, 125, -6, 89, 71, Constants.CVR_B2b8765_1111_APP_DISABLED, -83, -44, -94, -81, -100, -92, 114, Constants.CVR_B2b87_11_RFU, -73, -3, -109, GenerateAcResponseApdu.DAD_ICC_DYNAMIC_DATA_LENGTH, 54, 63, -9, -52, 52, -91, -27, -15, 113, -40, 49, MessageUtils.MESSAGE_21_NAK, 4, -57, 35, -61, 24, -106, 5, -102, 7, MessageUtils.MESSAGE_18_DC2, -128, -30, -21, 39, UtilitiesSDKConstants.SRP_LABEL_MAC, 117, 9, GetProcessingOptionsCommandApdu.COMMAND_TEMPLATE_TAG, 44, MessageUtils.MESSAGE_26_SUB, 27, 110, 90, -96, 82, 59, -42, -77, 41, -29, 47, -124, 83, -47, 0, -19, 32, -4, -79, 91, GenerateAcResponseApdu.DDA_HEADER, -53, -66, 57, 74, 76, 88, Constants.CVR_B2b65_CLEAR_BITS, -48, ByteSourceJsonBootstrapper.UTF8_BOM_1, -86, -5, 67, 77, 51, -123, 69, -7, 2, 127, Constants.CVR_B1b85_0101_MOBILE_APP, 60, -97, -88, 81, -93, 64, -113, -110, -99, 56, -11, -68, -74, -38, 33, 16, -1, -13, -46, -51, 12, 19, -20, Constants.STATE_ERROR, -105, 68, 23, -60, -89, 126, Base64.padSymbol, 100, 93, 25, 115, Constants.CVR_B1b85_0110_TERMINAL, KSUtils.PLAIN_BUFFER, 79, -36, 34, 42, -112, -120, 70, -18, -72, 20, -34, 94, 11, -37, -32, 50, 58, 10, 73, 6, DigipassSDKConstants.SECURE_CHANNEL_MESSAGE_TYPE_INFORMATION_MESSAGE, 92, -62, -45, -84, 98, -111, -107, -28, 121, -25, -56, 55, 109, -115, -43, 78, -87, 108, 86, -12, -22, 101, 122, -82, 8, -70, 120, 37, 46, 28, -90, -76, -58, -24, -35, 116, 31, 75, -67, -117, -118, Constants.CVR_B1b85_0111_VERIFIED_CLOUD, 62, -75, 102, 72, 3, -10, Constants.CVR_B1b41_1110_ONLINE_PIN, Constants.DIRECTORY_ENTRY, 53, 87, -71, -122, -63, 29, -98, -31, -8, -104, 17, 105, -39, ComputeCcCommandApdu.EXPECTED_P1, -108, -101, MessageUtils.MESSAGE_30_RS, -121, -23, -50, 85, 40, -33, -116, -95, -119, 13, ByteSourceJsonBootstrapper.UTF8_BOM_3, -26, 66, 104, 65, -103, 45, 15, UtilitiesSDKConstants.SRP_LABEL_ENC, 84, -69, 22};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int[] f84924h = {1, 2, 4, 8, 16, 32, 64, 128, 27, 54, 108, 216, 171, 77, 154, 47, 94, 188, 99, Opcodes.IFNULL, 151, 53, 106, ErrorCodes.ERR_CRY_BAD_BLOCK_SIZE, 179, 125, 250, 239, Opcodes.MULTIANEWARRAY, 145};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int[] f84925i = {-1520213050, -2072216328, -1720223762, -1921287178, 234025727, -1117033514, -1318096930, 1422247313, 1345335392, 50397442, -1452841010, 2099981142, 436141799, 1658312629, -424957107, -1703512340, 1170918031, -1652391393, 1086966153, -2021818886, 368769775, -346465870, -918075506, 200339707, -324162239, 1742001331, -39673249, -357585083, -1080255453, -140204973, -1770884380, 1539358875, -1028147339, 486407649, -1366060227, 1780885068, 1513502316, 1094664062, 49805301, 1338821763, 1546925160, -190470831, 887481809, 150073849, -1821281822, 1943591083, 1395732834, 1058346282, 201589768, 1388824469, 1696801606, 1589887901, 672667696, -1583966665, 251987210, -1248159185, 151455502, 907153956, -1686077413, 1038279391, 652995533, 1764173646, -843926913, -1619692054, 453576978, -1635548387, 1949051992, 773462580, 756751158, -1301385508, -296068428, -73359269, -162377052, 1295727478, 1641469623, -827083907, 2066295122, 1055122397, 1898917726, -1752923117, -179088474, 1758581177, 0, 753790401, 1612718144, 536673507, -927878791, -312779850, -1100322092, 1187761037, -641810841, 1262041458, -565556588, -733197160, -396863312, 1255133061, 1808847035, 720367557, -441800113, 385612781, -985447546, -682799718, 1429418854, -1803188975, -817543798, 284817897, 100794884, -2122350594, -263171936, 1144798328, -1163944155, -475486133, -212774494, -22830243, -1069531008, -1970303227, -1382903233, -1130521311, 1211644016, 83228145, -541279133, -1044990345, 1977277103, 1663115586, 806359072, 452984805, 250868733, 1842533055, 1288555905, 336333848, 890442534, 804056259, -513843266, -1567123659, -867941240, 957814574, 1472513171, -223893675, -2105639172, 1195195770, -1402706744, -413311558, 723065138, -1787595802, -1604296512, -1736343271, -783331426, 2145180835, 1713513028, 2116692564, -1416589253, -2088204277, -901364084, 703524551, -742868885, 1007948840, 2044649127, -497131844, 487262998, 1994120109, 1004593371, 1446130276, 1312438900, 503974420, -615954030, 168166924, 1814307912, -463709000, 1573044895, 1859376061, -273896381, -1503501628, -1466855111, -1533700815, 937747667, -1954973198, 854058965, 1137232011, 1496790894, -1217565222, -1936880383, 1691735473, -766620004, -525751991, -1267962664, -95005012, 133494003, 636152527, -1352309302, -1904575756, -374428089, 403179536, -709182865, -2005370640, 1864705354, 1915629148, 605822008, -240736681, -944458637, 1371981463, 602466507, 2094914977, -1670089496, 555687742, -582268010, -591544991, -2037675251, -2054518257, -1871679264, 1111375484, -994724495, -1436129588, -666351472, 84083462, 32962295, 302911004, -1553899070, 1597322602, -111716434, -793134743, -1853454825, 1489093017, 656219450, -1180787161, 954327513, 335083755, -1281845205, 856756514, -1150719534, 1893325225, -1987146233, -1483434957, -1231316179, 572399164, -1836611819, 552200649, 1238290055, -11184726, 2015897680, 2061492133, -1886614525, -123625127, -2138470135, 386731290, -624967835, 837215959, -968736124, -1201116976, -1019133566, -1332111063, 1999449434, 286199582, -877612933, -61582168, -692339859, 974525996};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f84926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[][] f84927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f84928c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f84929d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f84930e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f84931f;

    public AESEngine(byte[] bArr) throws ZipException {
        this.f84927b = null;
        int length = bArr.length / 4;
        if ((length != 4 && length != 6 && length != 8) || length * 4 != bArr.length) {
            throw new ZipException("invalid key length (not 128/192/256)");
        }
        this.f84926a = length + 6;
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, length + 7, 4);
        int i10 = 0;
        int i11 = 0;
        while (i10 < bArr.length) {
            iArr[i11 >> 2][i11 & 3] = (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | (bArr[i10 + 3] << 24);
            i10 += 4;
            i11++;
        }
        int i12 = (this.f84926a + 1) << 2;
        for (int i13 = length; i13 < i12; i13++) {
            int i14 = i13 - 1;
            int iB = iArr[i14 >> 2][i14 & 3];
            int i15 = i13 % length;
            if (i15 == 0) {
                iB = b(a(iB, 8)) ^ f84924h[(i13 / length) - 1];
            } else if (length > 6 && i15 == 4) {
                iB = b(iB);
            }
            int i16 = i13 - length;
            iArr[i13 >> 2][i13 & 3] = iB ^ iArr[i16 >> 2][i16 & 3];
        }
        this.f84927b = iArr;
    }

    public static int a(int i10, int i11) {
        return (i10 << (-i11)) | (i10 >>> i11);
    }

    public static int b(int i10) {
        byte[] bArr = f84923g;
        return (bArr[(i10 >> 24) & 255] << 24) | (bArr[i10 & 255] & 255) | ((bArr[(i10 >> 8) & 255] & 255) << 8) | ((bArr[(i10 >> 16) & 255] & 255) << 16);
    }

    public int processBlock(byte[] bArr, byte[] bArr2) throws ZipException {
        return processBlock(bArr, 0, bArr2, 0);
    }

    public int processBlock(byte[] bArr, int i10, byte[] bArr2, int i11) throws ZipException {
        int[][] iArr = this.f84927b;
        if (iArr == null) {
            throw new ZipException("AES engine not initialised");
        }
        if (i10 + 16 > bArr.length) {
            throw new ZipException("input buffer too short");
        }
        if (i11 + 16 > bArr2.length) {
            throw new ZipException("output buffer too short");
        }
        int i12 = ((bArr[i10 + 1] & 255) << 8) | (bArr[i10] & 255) | ((bArr[i10 + 2] & 255) << 16) | (bArr[i10 + 3] << 24);
        int i13 = ((bArr[i10 + 5] & 255) << 8) | (bArr[i10 + 4] & 255) | ((bArr[i10 + 6] & 255) << 16) | (bArr[i10 + 7] << 24);
        int i14 = ((bArr[i10 + 9] & 255) << 8) | (bArr[i10 + 8] & 255) | ((bArr[i10 + 10] & 255) << 16) | (bArr[i10 + 11] << 24);
        int i15 = (bArr[i10 + 15] << 24) | ((bArr[i10 + 13] & 255) << 8) | (bArr[i10 + 12] & 255) | ((bArr[i10 + 14] & 255) << 16);
        int[] iArr2 = iArr[0];
        this.f84928c = i12 ^ iArr2[0];
        int i16 = 1;
        this.f84929d = i13 ^ iArr2[1];
        char c10 = 2;
        this.f84930e = i14 ^ iArr2[2];
        char c11 = 3;
        this.f84931f = i15 ^ iArr2[3];
        int i17 = 1;
        while (true) {
            int i18 = this.f84926a - i16;
            int[] iArr3 = f84925i;
            if (i17 >= i18) {
                int iA = (((iArr3[this.f84928c & 255] ^ a(iArr3[(this.f84929d >> 8) & 255], 24)) ^ a(iArr3[(this.f84930e >> 16) & 255], 16)) ^ a(iArr3[(this.f84931f >> 24) & 255], 8)) ^ iArr[i17][0];
                int iA2 = (((iArr3[this.f84929d & 255] ^ a(iArr3[(this.f84930e >> 8) & 255], 24)) ^ a(iArr3[(this.f84931f >> 16) & 255], 16)) ^ a(iArr3[(this.f84928c >> 24) & 255], 8)) ^ iArr[i17][1];
                int iA3 = (((iArr3[this.f84930e & 255] ^ a(iArr3[(this.f84931f >> 8) & 255], 24)) ^ a(iArr3[(this.f84928c >> 16) & 255], 16)) ^ a(iArr3[(this.f84929d >> 24) & 255], 8)) ^ iArr[i17][2];
                int iA4 = ((iArr3[this.f84931f & 255] ^ a(iArr3[(this.f84928c >> 8) & 255], 24)) ^ a(iArr3[(this.f84929d >> 16) & 255], 16)) ^ a(iArr3[(this.f84930e >> 24) & 255], 8);
                int i19 = i17 + 1;
                int i20 = iArr[i17][3] ^ iA4;
                byte[] bArr3 = f84923g;
                int i21 = (((bArr3[iA & 255] & 255) ^ ((bArr3[(iA2 >> 8) & 255] & 255) << 8)) ^ ((bArr3[(iA3 >> 16) & 255] & 255) << 16)) ^ (bArr3[(i20 >> 24) & 255] << 24);
                int[] iArr4 = iArr[i19];
                int i22 = iArr4[0] ^ i21;
                this.f84928c = i22;
                int i23 = ((((bArr3[iA2 & 255] & 255) ^ ((bArr3[(iA3 >> 8) & 255] & 255) << 8)) ^ ((bArr3[(i20 >> 16) & 255] & 255) << 16)) ^ (bArr3[(iA >> 24) & 255] << 24)) ^ iArr4[1];
                this.f84929d = i23;
                int i24 = ((((bArr3[iA3 & 255] & 255) ^ ((bArr3[(i20 >> 8) & 255] & 255) << 8)) ^ ((bArr3[(iA >> 16) & 255] & 255) << 16)) ^ (bArr3[(iA2 >> 24) & 255] << 24)) ^ iArr4[2];
                this.f84930e = i24;
                int i25 = ((((bArr3[i20 & 255] & 255) ^ ((bArr3[(iA >> 8) & 255] & 255) << 8)) ^ ((bArr3[(iA2 >> 16) & 255] & 255) << 16)) ^ (bArr3[(iA3 >> 24) & 255] << 24)) ^ iArr4[3];
                this.f84931f = i25;
                bArr2[i11] = (byte) i22;
                bArr2[i11 + 1] = (byte) (i22 >> 8);
                bArr2[i11 + 2] = (byte) (i22 >> 16);
                bArr2[i11 + 3] = (byte) (i22 >> 24);
                bArr2[i11 + 4] = (byte) i23;
                bArr2[i11 + 5] = (byte) (i23 >> 8);
                bArr2[i11 + 6] = (byte) (i23 >> 16);
                bArr2[i11 + 7] = (byte) (i23 >> 24);
                bArr2[i11 + 8] = (byte) i24;
                bArr2[i11 + 9] = (byte) (i24 >> 8);
                bArr2[i11 + 10] = (byte) (i24 >> 16);
                bArr2[i11 + 11] = (byte) (i24 >> 24);
                bArr2[i11 + 12] = (byte) i25;
                bArr2[i11 + 13] = (byte) (i25 >> 8);
                bArr2[i11 + 14] = (byte) (i25 >> 16);
                bArr2[i11 + 15] = (byte) (i25 >> 24);
                return 16;
            }
            int iA5 = (((iArr3[this.f84928c & 255] ^ a(iArr3[(this.f84929d >> 8) & 255], 24)) ^ a(iArr3[(this.f84930e >> 16) & 255], 16)) ^ a(iArr3[(this.f84931f >> 24) & 255], 8)) ^ iArr[i17][0];
            int iA6 = (((iArr3[this.f84929d & 255] ^ a(iArr3[(this.f84930e >> 8) & 255], 24)) ^ a(iArr3[(this.f84931f >> 16) & 255], 16)) ^ a(iArr3[(this.f84928c >> 24) & 255], 8)) ^ iArr[i17][i16];
            int iA7 = (((iArr3[this.f84930e & 255] ^ a(iArr3[(this.f84931f >> 8) & 255], 24)) ^ a(iArr3[(this.f84928c >> 16) & 255], 16)) ^ a(iArr3[(this.f84929d >> 24) & 255], 8)) ^ iArr[i17][c10];
            int i26 = i17 + 1;
            int iA8 = (((a(iArr3[(this.f84928c >> 8) & 255], 24) ^ iArr3[this.f84931f & 255]) ^ a(iArr3[(this.f84929d >> 16) & 255], 16)) ^ a(iArr3[(this.f84930e >> 24) & 255], 8)) ^ iArr[i17][c11];
            this.f84928c = (((a(iArr3[(iA6 >> 8) & 255], 24) ^ iArr3[iA5 & 255]) ^ a(iArr3[(iA7 >> 16) & 255], 16)) ^ a(iArr3[(iA8 >> 24) & 255], 8)) ^ iArr[i26][0];
            this.f84929d = (((iArr3[iA6 & 255] ^ a(iArr3[(iA7 >> 8) & 255], 24)) ^ a(iArr3[(iA8 >> 16) & 255], 16)) ^ a(iArr3[(iA5 >> 24) & 255], 8)) ^ iArr[i26][1];
            this.f84930e = (((iArr3[iA7 & 255] ^ a(iArr3[(iA8 >> 8) & 255], 24)) ^ a(iArr3[(iA5 >> 16) & 255], 16)) ^ a(iArr3[(iA6 >> 24) & 255], 8)) ^ iArr[i26][2];
            i17 += 2;
            this.f84931f = (((iArr3[iA8 & 255] ^ a(iArr3[(iA5 >> 8) & 255], 24)) ^ a(iArr3[(iA6 >> 16) & 255], 16)) ^ a(iArr3[(iA7 >> 24) & 255], 8)) ^ iArr[i26][3];
            i16 = 1;
            c10 = 2;
            c11 = 3;
        }
    }
}
