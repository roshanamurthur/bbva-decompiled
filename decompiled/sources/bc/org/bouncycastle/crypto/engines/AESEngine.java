package bc.org.bouncycastle.crypto.engines;

import bc.org.bouncycastle.crypto.BlockCipher;
import bc.org.bouncycastle.crypto.CipherParameters;
import bc.org.bouncycastle.crypto.DataLengthException;
import bc.org.bouncycastle.crypto.params.KeyParameter;
import bc.org.bouncycastle.util.Arrays;
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
import com.vasco.digipass.sdk.utils.utilities.obfuscated.h4;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.k4;
import com.vierge.pinpadsdk.message.base.MessageUtils;
import java.lang.reflect.Array;
import kotlin.io.encoding.Base64;

/* JADX INFO: loaded from: classes2.dex */
public class AESEngine implements BlockCipher {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final byte[] f24939i = {99, 124, Constants.RESP_MSG_TEMPLATE_FORMAT_2, 123, -14, 107, Constants.FCI_TEMPLATE, -59, 48, 1, 103, 43, -2, -41, -85, 118, -54, -126, -55, 125, -6, 89, 71, Constants.CVR_B2b8765_1111_APP_DISABLED, -83, -44, -94, -81, -100, -92, 114, Constants.CVR_B2b87_11_RFU, -73, -3, -109, GenerateAcResponseApdu.DAD_ICC_DYNAMIC_DATA_LENGTH, 54, 63, -9, -52, 52, -91, -27, -15, 113, -40, 49, MessageUtils.MESSAGE_21_NAK, 4, -57, 35, -61, 24, -106, 5, -102, 7, MessageUtils.MESSAGE_18_DC2, -128, -30, -21, 39, UtilitiesSDKConstants.SRP_LABEL_MAC, 117, 9, GetProcessingOptionsCommandApdu.COMMAND_TEMPLATE_TAG, 44, MessageUtils.MESSAGE_26_SUB, 27, 110, 90, -96, 82, 59, -42, -77, 41, -29, 47, -124, 83, -47, 0, -19, 32, -4, -79, 91, GenerateAcResponseApdu.DDA_HEADER, -53, -66, 57, 74, 76, 88, Constants.CVR_B2b65_CLEAR_BITS, -48, ByteSourceJsonBootstrapper.UTF8_BOM_1, -86, -5, 67, 77, 51, -123, 69, -7, 2, 127, Constants.CVR_B1b85_0101_MOBILE_APP, 60, -97, -88, 81, -93, 64, -113, -110, -99, 56, -11, -68, -74, -38, 33, 16, -1, -13, -46, -51, 12, 19, -20, Constants.STATE_ERROR, -105, 68, 23, -60, -89, 126, Base64.padSymbol, 100, 93, 25, 115, Constants.CVR_B1b85_0110_TERMINAL, KSUtils.PLAIN_BUFFER, 79, -36, 34, 42, -112, -120, 70, -18, -72, 20, -34, 94, 11, -37, -32, 50, 58, 10, 73, 6, DigipassSDKConstants.SECURE_CHANNEL_MESSAGE_TYPE_INFORMATION_MESSAGE, 92, -62, -45, -84, 98, -111, -107, -28, 121, -25, -56, 55, 109, -115, -43, 78, -87, 108, 86, -12, -22, 101, 122, -82, 8, -70, 120, 37, 46, 28, -90, -76, -58, -24, -35, 116, 31, 75, -67, -117, -118, Constants.CVR_B1b85_0111_VERIFIED_CLOUD, 62, -75, 102, 72, 3, -10, Constants.CVR_B1b41_1110_ONLINE_PIN, Constants.DIRECTORY_ENTRY, 53, 87, -71, -122, -63, 29, -98, -31, -8, -104, 17, 105, -39, ComputeCcCommandApdu.EXPECTED_P1, -108, -101, MessageUtils.MESSAGE_30_RS, -121, -23, -50, 85, 40, -33, -116, -95, -119, 13, ByteSourceJsonBootstrapper.UTF8_BOM_3, -26, 66, 104, 65, -103, 45, 15, UtilitiesSDKConstants.SRP_LABEL_ENC, 84, -69, 22};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final byte[] f24940j = {82, 9, GenerateAcResponseApdu.DDA_HEADER, -43, 48, 54, -91, 56, ByteSourceJsonBootstrapper.UTF8_BOM_3, 64, -93, -98, KSUtils.PLAIN_BUFFER, -13, -41, -5, 124, -29, 57, -126, -101, 47, -1, -121, 52, ComputeCcCommandApdu.EXPECTED_P1, 67, 68, -60, -34, -23, -53, 84, 123, -108, 50, -90, -62, 35, Base64.padSymbol, -18, 76, -107, 11, 66, -6, -61, 78, 8, 46, -95, 102, 40, -39, DigipassSDKConstants.SECURE_CHANNEL_MESSAGE_TYPE_INFORMATION_MESSAGE, UtilitiesSDKConstants.SRP_LABEL_MAC, 118, 91, -94, 73, 109, -117, -47, 37, 114, -8, -10, 100, -122, 104, -104, 22, -44, -92, 92, -52, 93, 101, -74, -110, 108, Constants.CVR_B1b85_0111_VERIFIED_CLOUD, 72, Constants.CVR_B1b85_0101_MOBILE_APP, -3, -19, -71, -38, 94, MessageUtils.MESSAGE_21_NAK, 70, 87, -89, -115, -99, -124, -112, -40, -85, 0, -116, -68, -45, 10, -9, -28, 88, 5, -72, -77, 69, 6, -48, 44, MessageUtils.MESSAGE_30_RS, -113, -54, 63, 15, 2, -63, -81, -67, 3, 1, 19, -118, 107, 58, -111, 17, 65, 79, 103, -36, -22, -105, -14, Constants.CVR_B2b65_CLEAR_BITS, -50, Constants.CVR_B2b8765_1111_APP_DISABLED, -76, -26, 115, -106, -84, 116, 34, -25, -83, 53, -123, -30, -7, 55, -24, 28, 117, -33, 110, 71, -15, MessageUtils.MESSAGE_26_SUB, 113, 29, 41, -59, -119, Constants.FCI_TEMPLATE, -73, 98, Constants.CVR_B1b41_1110_ONLINE_PIN, -86, 24, -66, 27, -4, 86, 62, 75, -58, -46, 121, 32, -102, -37, Constants.CVR_B2b87_11_RFU, -2, 120, -51, 90, -12, 31, -35, -88, 51, -120, 7, -57, 49, -79, MessageUtils.MESSAGE_18_DC2, 16, 89, 39, -128, -20, Constants.STATE_ERROR, Constants.CVR_B1b85_0110_TERMINAL, 81, 127, -87, 25, -75, 74, 13, 45, -27, 122, -97, -109, -55, -100, ByteSourceJsonBootstrapper.UTF8_BOM_1, -96, -32, 59, 77, -82, 42, -11, UtilitiesSDKConstants.SRP_LABEL_ENC, -56, -21, -69, 60, GetProcessingOptionsCommandApdu.COMMAND_TEMPLATE_TAG, 83, -103, Constants.DIRECTORY_ENTRY, 23, 43, 4, 126, -70, Constants.RESP_MSG_TEMPLATE_FORMAT_2, -42, GenerateAcResponseApdu.DAD_ICC_DYNAMIC_DATA_LENGTH, -31, 105, 20, 99, 85, 33, 12, 125};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f24941k = {1, 2, 4, 8, 16, 32, 64, 128, 27, 54, 108, 216, 171, 77, 154, 47, 94, 188, 99, Opcodes.IFNULL, 151, 53, 106, ErrorCodes.ERR_CRY_BAD_BLOCK_SIZE, 179, 125, 250, 239, Opcodes.MULTIANEWARRAY, 145};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int[] f24942l = {-1520213050, -2072216328, -1720223762, -1921287178, 234025727, -1117033514, -1318096930, 1422247313, 1345335392, 50397442, -1452841010, 2099981142, 436141799, 1658312629, -424957107, -1703512340, 1170918031, -1652391393, 1086966153, -2021818886, 368769775, -346465870, -918075506, 200339707, -324162239, 1742001331, -39673249, -357585083, -1080255453, -140204973, -1770884380, 1539358875, -1028147339, 486407649, -1366060227, 1780885068, 1513502316, 1094664062, 49805301, 1338821763, 1546925160, -190470831, 887481809, 150073849, -1821281822, 1943591083, 1395732834, 1058346282, 201589768, 1388824469, 1696801606, 1589887901, 672667696, -1583966665, 251987210, -1248159185, 151455502, 907153956, -1686077413, 1038279391, 652995533, 1764173646, -843926913, -1619692054, 453576978, -1635548387, 1949051992, 773462580, 756751158, -1301385508, -296068428, -73359269, -162377052, 1295727478, 1641469623, -827083907, 2066295122, 1055122397, 1898917726, -1752923117, -179088474, 1758581177, 0, 753790401, 1612718144, 536673507, -927878791, -312779850, -1100322092, 1187761037, -641810841, 1262041458, -565556588, -733197160, -396863312, 1255133061, 1808847035, 720367557, -441800113, 385612781, -985447546, -682799718, 1429418854, -1803188975, -817543798, 284817897, 100794884, -2122350594, -263171936, 1144798328, -1163944155, -475486133, -212774494, -22830243, -1069531008, -1970303227, -1382903233, -1130521311, 1211644016, 83228145, -541279133, -1044990345, 1977277103, 1663115586, 806359072, 452984805, 250868733, 1842533055, 1288555905, 336333848, 890442534, 804056259, -513843266, -1567123659, -867941240, 957814574, 1472513171, -223893675, -2105639172, 1195195770, -1402706744, -413311558, 723065138, -1787595802, -1604296512, -1736343271, -783331426, 2145180835, 1713513028, 2116692564, -1416589253, -2088204277, -901364084, 703524551, -742868885, 1007948840, 2044649127, -497131844, 487262998, 1994120109, 1004593371, 1446130276, 1312438900, 503974420, -615954030, 168166924, 1814307912, -463709000, 1573044895, 1859376061, -273896381, -1503501628, -1466855111, -1533700815, 937747667, -1954973198, 854058965, 1137232011, 1496790894, -1217565222, -1936880383, 1691735473, -766620004, -525751991, -1267962664, -95005012, 133494003, 636152527, -1352309302, -1904575756, -374428089, 403179536, -709182865, -2005370640, 1864705354, 1915629148, 605822008, -240736681, -944458637, 1371981463, 602466507, 2094914977, -1670089496, 555687742, -582268010, -591544991, -2037675251, -2054518257, -1871679264, 1111375484, -994724495, -1436129588, -666351472, 84083462, 32962295, 302911004, -1553899070, 1597322602, -111716434, -793134743, -1853454825, 1489093017, 656219450, -1180787161, 954327513, 335083755, -1281845205, 856756514, -1150719534, 1893325225, -1987146233, -1483434957, -1231316179, 572399164, -1836611819, 552200649, 1238290055, -11184726, 2015897680, 2061492133, -1886614525, -123625127, -2138470135, 386731290, -624967835, 837215959, -968736124, -1201116976, -1019133566, -1332111063, 1999449434, 286199582, -877612933, -61582168, -692339859, 974525996};
    public static final int[] m = {1353184337, 1399144830, -1012656358, -1772214470, -882136261, -247096033, -1420232020, -1828461749, 1442459680, -160598355, -1854485368, 625738485, -52959921, -674551099, -2143013594, -1885117771, 1230680542, 1729870373, -1743852987, -507445667, 41234371, 317738113, -1550367091, -956705941, -413167869, -1784901099, -344298049, -631680363, 763608788, -752782248, 694804553, 1154009486, 1787413109, 2021232372, 1799248025, -579749593, -1236278850, 397248752, 1722556617, -1271214467, 407560035, -2110711067, 1613975959, 1165972322, -529046351, -2068943941, 480281086, -1809118983, 1483229296, 436028815, -2022908268, -1208452270, 601060267, -503166094, 1468997603, 715871590, 120122290, 63092015, -1703164538, -1526188077, -226023376, -1297760477, -1167457534, 1552029421, 723308426, -1833666137, -252573709, -1578997426, -839591323, -708967162, 526529745, -1963022652, -1655493068, -1604979806, 853641733, 1978398372, 971801355, -1427152832, 111112542, 1360031421, -108388034, 1023860118, -1375387939, 1186850381, -1249028975, 90031217, 1876166148, -15380384, 620468249, -1746289194, -868007799, 2006899047, -1119688528, -2004121337, 945494503, -605108103, 1191869601, -384875908, -920746760, 0, -2088337399, 1223502642, -1401941730, 1316117100, -67170563, 1446544655, 517320253, 658058550, 1691946762, 564550760, -783000677, 976107044, -1318647284, 266819475, -761860428, -1634624741, 1338359936, -1574904735, 1766553434, 370807324, 179999714, -450191168, 1138762300, 488053522, 185403662, -1379431438, -1180125651, -928440812, -2061897385, 1275557295, -1143105042, -44007517, -1624899081, -1124765092, -985962940, 880737115, 1982415755, -590994485, 1761406390, 1676797112, -891538985, 277177154, 1076008723, 538035844, 2099530373, -130171950, 288553390, 1839278535, 1261411869, -214912292, -330136051, -790380169, 1813426987, -1715900247, -95906799, 577038663, -997393240, 440397984, -668172970, -275762398, -951170681, -1043253031, -22885748, 906744984, -813566554, 685669029, 646887386, -1530942145, -459458004, 227702864, -1681105046, 1648787028, -1038905866, -390539120, 1593260334, -173030526, -1098883681, 2090061929, -1456614033, -1290656305, 999926984, -1484974064, 1852021992, 2075868123, 158869197, -199730834, 28809964, -1466282109, 1701746150, 2129067946, 147831841, -420997649, -644094022, -835293366, -737566742, -696471511, -1347247055, 824393514, 815048134, -1067015627, 935087732, -1496677636, -1328508704, 366520115, 1251476721, -136647615, 240176511, 804688151, -1915335306, 1303441219, 1414376140, -553347356, -474623586, 461924940, -1205916479, 2136040774, 82468509, 1563790337, 1937016826, 776014843, 1511876531, 1389550482, 861278441, 323475053, -1939744870, 2047648055, -1911228327, -1992551445, -299390514, 902390199, -303751967, 1018251130, 1507840668, 1064563285, 2043548696, -1086863501, -355600557, 1537932639, 342834655, -2032450440, -2114736182, 1053059257, 741614648, 1598071746, 1925389590, 203809468, -1958134744, 1100287487, 1895934009, -558691320, -1662733096, -1866377628, 1636092795, 1890988757, 1952214088, 1113045200};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f24943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[][] f24944b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f24945c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f24946d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f24947e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f24948f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f24949g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public byte[] f24950h;

    public static int a(int i10, int i11) {
        return (i10 << (-i11)) | (i10 >>> i11);
    }

    public static int d(int i10) {
        byte[] bArr = f24939i;
        return (bArr[(i10 >> 24) & 255] << 24) | (bArr[i10 & 255] & 255) | ((bArr[(i10 >> 8) & 255] & 255) << 8) | ((bArr[(i10 >> 16) & 255] & 255) << 16);
    }

    public final void b(byte[] bArr, int i10) {
        int i11 = this.f24945c;
        bArr[i10] = (byte) i11;
        bArr[i10 + 1] = (byte) (i11 >> 8);
        bArr[i10 + 2] = (byte) (i11 >> 16);
        bArr[i10 + 3] = (byte) (i11 >> 24);
        int i12 = this.f24946d;
        bArr[i10 + 4] = (byte) i12;
        bArr[i10 + 5] = (byte) (i12 >> 8);
        bArr[i10 + 6] = (byte) (i12 >> 16);
        bArr[i10 + 7] = (byte) (i12 >> 24);
        int i13 = this.f24947e;
        bArr[i10 + 8] = (byte) i13;
        bArr[i10 + 9] = (byte) (i13 >> 8);
        bArr[i10 + 10] = (byte) (i13 >> 16);
        bArr[i10 + 11] = (byte) (i13 >> 24);
        int i14 = this.f24948f;
        bArr[i10 + 12] = (byte) i14;
        bArr[i10 + 13] = (byte) (i14 >> 8);
        bArr[i10 + 14] = (byte) (i14 >> 16);
        bArr[i10 + 15] = (byte) (i14 >> 24);
    }

    public final void c(byte[] bArr, int i10) {
        this.f24945c = ((bArr[i10 + 1] & 255) << 8) | (bArr[i10] & 255) | ((bArr[i10 + 2] & 255) << 16) | (bArr[i10 + 3] << 24);
        this.f24946d = ((bArr[i10 + 5] & 255) << 8) | (bArr[i10 + 4] & 255) | ((bArr[i10 + 6] & 255) << 16) | (bArr[i10 + 7] << 24);
        this.f24947e = ((bArr[i10 + 9] & 255) << 8) | (bArr[i10 + 8] & 255) | ((bArr[i10 + 10] & 255) << 16) | (bArr[i10 + 11] << 24);
        int i11 = ((bArr[i10 + 13] & 255) << 8) | (bArr[i10 + 12] & 255);
        this.f24948f = (bArr[i10 + 15] << 24) | i11 | ((bArr[i10 + 14] & 255) << 16);
    }

    @Override // bc.org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "AES";
    }

    @Override // bc.org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 16;
    }

    @Override // bc.org.bouncycastle.crypto.BlockCipher
    public void init(boolean z10, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException("invalid parameter passed to AES init - ".concat(cipherParameters.getClass().getName()));
        }
        byte[] key = ((KeyParameter) cipherParameters).getKey();
        int length = key.length;
        if (length < 16 || length > 32 || (length & 7) != 0) {
            throw new IllegalArgumentException("Key length not 128/192/256 bits.");
        }
        int i10 = length >>> 2;
        this.f24943a = i10 + 6;
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i10 + 7, 4);
        if (i10 == 4) {
            int iC = k4.c(key, 0);
            iArr[0][0] = iC;
            int iC2 = k4.c(key, 4);
            iArr[0][1] = iC2;
            int iC3 = k4.c(key, 8);
            iArr[0][2] = iC3;
            int iC4 = k4.c(key, 12);
            iArr[0][3] = iC4;
            for (int i11 = 1; i11 <= 10; i11++) {
                iC ^= d(a(iC4, 8)) ^ f24941k[i11 - 1];
                int[] iArr2 = iArr[i11];
                iArr2[0] = iC;
                iC2 ^= iC;
                iArr2[1] = iC2;
                iC3 ^= iC2;
                iArr2[2] = iC3;
                iC4 ^= iC3;
                iArr2[3] = iC4;
            }
        } else if (i10 == 6) {
            int iC5 = k4.c(key, 0);
            iArr[0][0] = iC5;
            int iC6 = k4.c(key, 4);
            iArr[0][1] = iC6;
            int iC7 = k4.c(key, 8);
            iArr[0][2] = iC7;
            int iC8 = k4.c(key, 12);
            iArr[0][3] = iC8;
            int iC9 = k4.c(key, 16);
            iArr[1][0] = iC9;
            int iC10 = k4.c(key, 20);
            iArr[1][1] = iC10;
            int iD = iC5 ^ (d(a(iC10, 8)) ^ 1);
            int[] iArr3 = iArr[1];
            iArr3[2] = iD;
            int i12 = iC6 ^ iD;
            iArr3[3] = i12;
            int i13 = iC7 ^ i12;
            int[] iArr4 = iArr[2];
            iArr4[0] = i13;
            int i14 = iC8 ^ i13;
            iArr4[1] = i14;
            int i15 = iC9 ^ i14;
            iArr4[2] = i15;
            int i16 = iC10 ^ i15;
            iArr4[3] = i16;
            int i17 = 2;
            for (int i18 = 3; i18 < 12; i18 += 3) {
                int iD2 = iD ^ (d(a(i16, 8)) ^ i17);
                int[] iArr5 = iArr[i18];
                iArr5[0] = iD2;
                int i19 = i12 ^ iD2;
                iArr5[1] = i19;
                int i20 = i13 ^ i19;
                iArr5[2] = i20;
                int i21 = i14 ^ i20;
                iArr5[3] = i21;
                int i22 = i15 ^ i21;
                int i23 = i18 + 1;
                int[] iArr6 = iArr[i23];
                iArr6[0] = i22;
                int i24 = i16 ^ i22;
                iArr6[1] = i24;
                int iD3 = d(a(i24, 8)) ^ (i17 << 1);
                i17 <<= 2;
                iD = iD2 ^ iD3;
                int[] iArr7 = iArr[i23];
                iArr7[2] = iD;
                i12 = i19 ^ iD;
                iArr7[3] = i12;
                i13 = i20 ^ i12;
                int[] iArr8 = iArr[i18 + 2];
                iArr8[0] = i13;
                i14 = i21 ^ i13;
                iArr8[1] = i14;
                i15 = i22 ^ i14;
                iArr8[2] = i15;
                i16 = i24 ^ i15;
                iArr8[3] = i16;
            }
            int iD4 = (d(a(i16, 8)) ^ i17) ^ iD;
            int[] iArr9 = iArr[12];
            iArr9[0] = iD4;
            int i25 = iD4 ^ i12;
            iArr9[1] = i25;
            int i26 = i25 ^ i13;
            iArr9[2] = i26;
            iArr9[3] = i26 ^ i14;
        } else {
            if (i10 != 8) {
                throw new IllegalStateException("Should never get here");
            }
            int iC11 = k4.c(key, 0);
            iArr[0][0] = iC11;
            int iC12 = k4.c(key, 4);
            iArr[0][1] = iC12;
            int iC13 = k4.c(key, 8);
            iArr[0][2] = iC13;
            int iC14 = k4.c(key, 12);
            iArr[0][3] = iC14;
            int iC15 = k4.c(key, 16);
            iArr[1][0] = iC15;
            int iC16 = k4.c(key, 20);
            iArr[1][1] = iC16;
            int iC17 = k4.c(key, 24);
            iArr[1][2] = iC17;
            int iC18 = k4.c(key, 28);
            iArr[1][3] = iC18;
            int i27 = 1;
            for (int i28 = 2; i28 < 14; i28 += 2) {
                int iD5 = d(a(iC18, 8)) ^ i27;
                i27 <<= 1;
                iC11 ^= iD5;
                int[] iArr10 = iArr[i28];
                iArr10[0] = iC11;
                iC12 ^= iC11;
                iArr10[1] = iC12;
                iC13 ^= iC12;
                iArr10[2] = iC13;
                iC14 ^= iC13;
                iArr10[3] = iC14;
                iC15 ^= d(iC14);
                int[] iArr11 = iArr[i28 + 1];
                iArr11[0] = iC15;
                iC16 ^= iC15;
                iArr11[1] = iC16;
                iC17 ^= iC16;
                iArr11[2] = iC17;
                iC18 ^= iC17;
                iArr11[3] = iC18;
            }
            int iD6 = (d(a(iC18, 8)) ^ i27) ^ iC11;
            int[] iArr12 = iArr[14];
            iArr12[0] = iD6;
            int i29 = iD6 ^ iC12;
            iArr12[1] = i29;
            int i30 = i29 ^ iC13;
            iArr12[2] = i30;
            iArr12[3] = i30 ^ iC14;
        }
        if (!z10) {
            for (int i31 = 1; i31 < this.f24943a; i31++) {
                for (int i32 = 0; i32 < 4; i32++) {
                    int[] iArr13 = iArr[i31];
                    int i33 = iArr13[i32];
                    int iA = a(i33, 8) ^ i33;
                    int i34 = i33 ^ (((2139062143 & iA) << 1) ^ ((((-2139062144) & iA) >>> 7) * 27));
                    int i35 = (-1061109568) & i34;
                    int i36 = i35 ^ (i35 >>> 1);
                    int i37 = iA ^ ((((1061109567 & i34) << 2) ^ (i36 >>> 2)) ^ (i36 >>> 5));
                    iArr13[i32] = i34 ^ (i37 ^ a(i37, 16));
                }
            }
        }
        this.f24944b = iArr;
        this.f24949g = z10;
        if (z10) {
            this.f24950h = Arrays.clone(f24939i);
        } else {
            this.f24950h = Arrays.clone(f24940j);
        }
    }

    @Override // bc.org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i10, byte[] bArr2, int i11) {
        if (this.f24944b == null) {
            throw new IllegalStateException("AES engine not initialised");
        }
        if (i10 + 16 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i11 + 16 > bArr2.length) {
            throw new h4("output buffer too short");
        }
        char c10 = 0;
        int i12 = 1;
        int i13 = 8;
        int i14 = 24;
        int i15 = 16;
        if (this.f24949g) {
            c(bArr, i10);
            int[][] iArr = this.f24944b;
            int i16 = this.f24945c;
            int[] iArr2 = iArr[0];
            int i17 = i16 ^ iArr2[0];
            int iA = this.f24946d ^ iArr2[1];
            int iA2 = this.f24947e ^ iArr2[2];
            int i18 = iArr2[3] ^ this.f24948f;
            int i19 = 1;
            while (true) {
                int i20 = this.f24943a - i12;
                int[] iArr3 = f24942l;
                if (i19 >= i20) {
                    int iA3 = (((iArr3[i17 & 255] ^ a(iArr3[(iA >> 8) & 255], 24)) ^ a(iArr3[(iA2 >> 16) & 255], 16)) ^ a(iArr3[(i18 >> 24) & 255], 8)) ^ iArr[i19][0];
                    int iA4 = (((iArr3[iA & 255] ^ a(iArr3[(iA2 >> 8) & 255], 24)) ^ a(iArr3[(i18 >> 16) & 255], 16)) ^ a(iArr3[(i17 >> 24) & 255], 8)) ^ iArr[i19][1];
                    int iA5 = (((iArr3[iA2 & 255] ^ a(iArr3[(i18 >> 8) & 255], 24)) ^ a(iArr3[(i17 >> 16) & 255], 16)) ^ a(iArr3[(iA >> 24) & 255], 8)) ^ iArr[i19][2];
                    int iA6 = (((a(iArr3[(i17 >> 8) & 255], 24) ^ iArr3[i18 & 255]) ^ a(iArr3[(iA >> 16) & 255], 16)) ^ a(iArr3[(iA2 >> 24) & 255], 8)) ^ iArr[i19][3];
                    byte[] bArr3 = f24939i;
                    int i21 = (bArr3[iA3 & 255] & 255) ^ ((bArr3[(iA4 >> 8) & 255] & 255) << 8);
                    byte[] bArr4 = this.f24950h;
                    int i22 = (i21 ^ ((bArr4[(iA5 >> 16) & 255] & 255) << 16)) ^ (bArr4[(iA6 >> 24) & 255] << 24);
                    int[] iArr4 = iArr[i19 + 1];
                    this.f24945c = iArr4[0] ^ i22;
                    this.f24946d = ((((bArr4[iA4 & 255] & 255) ^ ((bArr3[(iA5 >> 8) & 255] & 255) << 8)) ^ ((bArr3[(iA6 >> 16) & 255] & 255) << 16)) ^ (bArr4[(iA3 >> 24) & 255] << 24)) ^ iArr4[1];
                    this.f24947e = ((((bArr4[iA5 & 255] & 255) ^ ((bArr3[(iA6 >> 8) & 255] & 255) << 8)) ^ ((bArr3[(iA3 >> 16) & 255] & 255) << 16)) ^ (bArr3[(iA4 >> 24) & 255] << 24)) ^ iArr4[2];
                    this.f24948f = iArr4[3] ^ ((((bArr4[iA6 & 255] & 255) ^ ((bArr4[(iA3 >> 8) & 255] & 255) << 8)) ^ ((bArr4[(iA4 >> 16) & 255] & 255) << 16)) ^ (bArr3[(iA5 >> 24) & 255] << 24));
                    b(bArr2, i11);
                    return 16;
                }
                int iA7 = (((iArr3[i17 & 255] ^ a(iArr3[(iA >> 8) & 255], 24)) ^ a(iArr3[(iA2 >> 16) & 255], i15)) ^ a(iArr3[(i18 >> 24) & 255], i13)) ^ iArr[i19][c10];
                int iA8 = (((a(iArr3[(iA2 >> 8) & 255], 24) ^ iArr3[iA & 255]) ^ a(iArr3[(i18 >> 16) & 255], i15)) ^ a(iArr3[(i17 >> 24) & 255], i13)) ^ iArr[i19][i12];
                int iA9 = (((iArr3[iA2 & 255] ^ a(iArr3[(i18 >> 8) & 255], 24)) ^ a(iArr3[(i17 >> 16) & 255], i15)) ^ a(iArr3[(iA >> 24) & 255], i13)) ^ iArr[i19][2];
                int i23 = i19 + 1;
                int iA10 = (((a(iArr3[(i17 >> 8) & 255], 24) ^ iArr3[i18 & 255]) ^ a(iArr3[(iA >> 16) & 255], i15)) ^ a(iArr3[(iA2 >> 24) & 255], i13)) ^ iArr[i19][3];
                int iA11 = (((iArr3[iA7 & 255] ^ a(iArr3[(iA8 >> 8) & 255], 24)) ^ a(iArr3[(iA9 >> 16) & 255], i15)) ^ a(iArr3[(iA10 >> 24) & 255], i13)) ^ iArr[i23][0];
                iA = (((iArr3[iA8 & 255] ^ a(iArr3[(iA9 >> 8) & 255], 24)) ^ a(iArr3[(iA10 >> 16) & 255], i15)) ^ a(iArr3[(iA7 >> 24) & 255], i13)) ^ iArr[i23][1];
                iA2 = iArr[i23][2] ^ (((a(iArr3[(iA10 >> 8) & 255], 24) ^ iArr3[iA9 & 255]) ^ a(iArr3[(iA7 >> 16) & 255], i15)) ^ a(iArr3[(iA8 >> 24) & 255], 8));
                i19 += 2;
                int iA12 = (((iArr3[iA10 & 255] ^ a(iArr3[(iA7 >> 8) & 255], 24)) ^ a(iArr3[(iA8 >> 16) & 255], 16)) ^ a(iArr3[(iA9 >> 24) & 255], 8)) ^ iArr[i23][3];
                c10 = 0;
                i12 = 1;
                i13 = 8;
                i15 = 16;
                i18 = iA12;
                i17 = iA11;
            }
        } else {
            c(bArr, i10);
            int[][] iArr5 = this.f24944b;
            int i24 = this.f24945c;
            int i25 = this.f24943a;
            int[] iArr6 = iArr5[i25];
            int i26 = i24 ^ iArr6[0];
            int i27 = 1;
            int i28 = this.f24946d ^ iArr6[1];
            int i29 = this.f24947e ^ iArr6[2];
            int i30 = i25 - 1;
            int iA13 = iArr6[3] ^ this.f24948f;
            while (true) {
                int[] iArr7 = m;
                if (i30 <= i27) {
                    int iA14 = (((iArr7[i26 & 255] ^ a(iArr7[(iA13 >> 8) & 255], 24)) ^ a(iArr7[(i29 >> 16) & 255], 16)) ^ a(iArr7[(i28 >> 24) & 255], 8)) ^ iArr5[i30][0];
                    int iA15 = (((iArr7[i28 & 255] ^ a(iArr7[(i26 >> 8) & 255], 24)) ^ a(iArr7[(iA13 >> 16) & 255], 16)) ^ a(iArr7[(i29 >> 24) & 255], 8)) ^ iArr5[i30][1];
                    int iA16 = (((iArr7[i29 & 255] ^ a(iArr7[(i28 >> 8) & 255], 24)) ^ a(iArr7[(i26 >> 16) & 255], 16)) ^ a(iArr7[(iA13 >> 24) & 255], 8)) ^ iArr5[i30][2];
                    int iA17 = (a(iArr7[(i26 >> 24) & 255], 8) ^ ((iArr7[iA13 & 255] ^ a(iArr7[(i29 >> 8) & 255], 24)) ^ a(iArr7[(i28 >> 16) & 255], 16))) ^ iArr5[i30][3];
                    byte[] bArr5 = f24940j;
                    int i31 = bArr5[iA14 & 255] & 255;
                    byte[] bArr6 = this.f24950h;
                    int i32 = ((i31 ^ ((bArr6[(iA17 >> 8) & 255] & 255) << 8)) ^ ((bArr6[(iA16 >> 16) & 255] & 255) << 16)) ^ (bArr5[(iA15 >> 24) & 255] << 24);
                    int[] iArr8 = iArr5[0];
                    this.f24945c = i32 ^ iArr8[0];
                    this.f24946d = ((((bArr6[iA15 & 255] & 255) ^ ((bArr6[(iA14 >> 8) & 255] & 255) << 8)) ^ ((bArr5[(iA17 >> 16) & 255] & 255) << 16)) ^ (bArr6[(iA16 >> 24) & 255] << 24)) ^ iArr8[1];
                    this.f24947e = ((((bArr6[iA16 & 255] & 255) ^ ((bArr5[(iA15 >> 8) & 255] & 255) << 8)) ^ ((bArr5[(iA14 >> 16) & 255] & 255) << 16)) ^ (bArr6[(iA17 >> 24) & 255] << 24)) ^ iArr8[2];
                    this.f24948f = iArr8[3] ^ ((((bArr5[iA17 & 255] & 255) ^ ((bArr6[(iA16 >> 8) & 255] & 255) << 8)) ^ ((bArr6[(iA15 >> 16) & 255] & 255) << 16)) ^ (bArr6[(iA14 >> 24) & 255] << 24));
                    b(bArr2, i11);
                    return 16;
                }
                int iA18 = (((iArr7[i26 & 255] ^ a(iArr7[(iA13 >> 8) & 255], i14)) ^ a(iArr7[(i29 >> 16) & 255], 16)) ^ a(iArr7[(i28 >> 24) & 255], 8)) ^ iArr5[i30][0];
                int iA19 = (((iArr7[i28 & 255] ^ a(iArr7[(i26 >> 8) & 255], i14)) ^ a(iArr7[(iA13 >> 16) & 255], 16)) ^ a(iArr7[(i29 >> 24) & 255], 8)) ^ iArr5[i30][1];
                int iA20 = (((iArr7[i29 & 255] ^ a(iArr7[(i28 >> 8) & 255], i14)) ^ a(iArr7[(i26 >> 16) & 255], 16)) ^ a(iArr7[(iA13 >> 24) & 255], 8)) ^ iArr5[i30][2];
                int iA21 = a(iArr7[(i26 >> 24) & 255], 8) ^ ((iArr7[iA13 & 255] ^ a(iArr7[(i29 >> 8) & 255], i14)) ^ a(iArr7[(i28 >> 16) & 255], 16));
                int i33 = i30 - 1;
                int i34 = iA21 ^ iArr5[i30][3];
                int iA22 = (((iArr7[iA18 & 255] ^ a(iArr7[(i34 >> 8) & 255], i14)) ^ a(iArr7[(iA20 >> 16) & 255], 16)) ^ a(iArr7[(iA19 >> 24) & 255], 8)) ^ iArr5[i33][0];
                int iA23 = (((iArr7[iA19 & 255] ^ a(iArr7[(iA18 >> 8) & 255], i14)) ^ a(iArr7[(i34 >> 16) & 255], 16)) ^ a(iArr7[(iA20 >> 24) & 255], 8)) ^ iArr5[i33][1];
                int iA24 = (((iArr7[iA20 & 255] ^ a(iArr7[(iA19 >> 8) & 255], i14)) ^ a(iArr7[(iA18 >> 16) & 255], 16)) ^ a(iArr7[(i34 >> 24) & 255], 8)) ^ iArr5[i33][2];
                i30 -= 2;
                iA13 = iArr5[i33][3] ^ (((iArr7[i34 & 255] ^ a(iArr7[(iA20 >> 8) & 255], 24)) ^ a(iArr7[(iA19 >> 16) & 255], 16)) ^ a(iArr7[(iA18 >> 24) & 255], 8));
                i26 = iA22;
                i28 = iA23;
                i29 = iA24;
                i27 = 1;
                i14 = 24;
            }
        }
    }

    @Override // bc.org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }
}
