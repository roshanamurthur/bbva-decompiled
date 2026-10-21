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
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes3.dex */
public class AESEngine implements BlockCipher {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final byte[] f88264i = {99, 124, Constants.RESP_MSG_TEMPLATE_FORMAT_2, 123, -14, 107, Constants.FCI_TEMPLATE, -59, 48, 1, 103, 43, -2, -41, -85, 118, -54, -126, -55, 125, -6, 89, 71, Constants.CVR_B2b8765_1111_APP_DISABLED, -83, -44, -94, -81, -100, -92, 114, Constants.CVR_B2b87_11_RFU, -73, -3, -109, GenerateAcResponseApdu.DAD_ICC_DYNAMIC_DATA_LENGTH, 54, 63, -9, -52, 52, -91, -27, -15, 113, -40, 49, MessageUtils.MESSAGE_21_NAK, 4, -57, 35, -61, 24, -106, 5, -102, 7, MessageUtils.MESSAGE_18_DC2, -128, -30, -21, 39, UtilitiesSDKConstants.SRP_LABEL_MAC, 117, 9, GetProcessingOptionsCommandApdu.COMMAND_TEMPLATE_TAG, 44, MessageUtils.MESSAGE_26_SUB, 27, 110, 90, -96, 82, 59, -42, -77, 41, -29, 47, -124, 83, -47, 0, -19, 32, -4, -79, 91, GenerateAcResponseApdu.DDA_HEADER, -53, -66, 57, 74, 76, 88, Constants.CVR_B2b65_CLEAR_BITS, -48, ByteSourceJsonBootstrapper.UTF8_BOM_1, -86, -5, 67, 77, 51, -123, 69, -7, 2, 127, Constants.CVR_B1b85_0101_MOBILE_APP, 60, -97, -88, 81, -93, 64, -113, -110, -99, 56, -11, -68, -74, -38, 33, 16, -1, -13, -46, -51, 12, 19, -20, Constants.STATE_ERROR, -105, 68, 23, -60, -89, 126, Base64.padSymbol, 100, 93, 25, 115, Constants.CVR_B1b85_0110_TERMINAL, KSUtils.PLAIN_BUFFER, 79, -36, 34, 42, -112, -120, 70, -18, -72, 20, -34, 94, 11, -37, -32, 50, 58, 10, 73, 6, DigipassSDKConstants.SECURE_CHANNEL_MESSAGE_TYPE_INFORMATION_MESSAGE, 92, -62, -45, -84, 98, -111, -107, -28, 121, -25, -56, 55, 109, -115, -43, 78, -87, 108, 86, -12, -22, 101, 122, -82, 8, -70, 120, 37, 46, 28, -90, -76, -58, -24, -35, 116, 31, 75, -67, -117, -118, Constants.CVR_B1b85_0111_VERIFIED_CLOUD, 62, -75, 102, 72, 3, -10, Constants.CVR_B1b41_1110_ONLINE_PIN, Constants.DIRECTORY_ENTRY, 53, 87, -71, -122, -63, 29, -98, -31, -8, -104, 17, 105, -39, ComputeCcCommandApdu.EXPECTED_P1, -108, -101, MessageUtils.MESSAGE_30_RS, -121, -23, -50, 85, 40, -33, -116, -95, -119, 13, ByteSourceJsonBootstrapper.UTF8_BOM_3, -26, 66, 104, 65, -103, 45, 15, UtilitiesSDKConstants.SRP_LABEL_ENC, 84, -69, 22};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final byte[] f88265j = {82, 9, GenerateAcResponseApdu.DDA_HEADER, -43, 48, 54, -91, 56, ByteSourceJsonBootstrapper.UTF8_BOM_3, 64, -93, -98, KSUtils.PLAIN_BUFFER, -13, -41, -5, 124, -29, 57, -126, -101, 47, -1, -121, 52, ComputeCcCommandApdu.EXPECTED_P1, 67, 68, -60, -34, -23, -53, 84, 123, -108, 50, -90, -62, 35, Base64.padSymbol, -18, 76, -107, 11, 66, -6, -61, 78, 8, 46, -95, 102, 40, -39, DigipassSDKConstants.SECURE_CHANNEL_MESSAGE_TYPE_INFORMATION_MESSAGE, UtilitiesSDKConstants.SRP_LABEL_MAC, 118, 91, -94, 73, 109, -117, -47, 37, 114, -8, -10, 100, -122, 104, -104, 22, -44, -92, 92, -52, 93, 101, -74, -110, 108, Constants.CVR_B1b85_0111_VERIFIED_CLOUD, 72, Constants.CVR_B1b85_0101_MOBILE_APP, -3, -19, -71, -38, 94, MessageUtils.MESSAGE_21_NAK, 70, 87, -89, -115, -99, -124, -112, -40, -85, 0, -116, -68, -45, 10, -9, -28, 88, 5, -72, -77, 69, 6, -48, 44, MessageUtils.MESSAGE_30_RS, -113, -54, 63, 15, 2, -63, -81, -67, 3, 1, 19, -118, 107, 58, -111, 17, 65, 79, 103, -36, -22, -105, -14, Constants.CVR_B2b65_CLEAR_BITS, -50, Constants.CVR_B2b8765_1111_APP_DISABLED, -76, -26, 115, -106, -84, 116, 34, -25, -83, 53, -123, -30, -7, 55, -24, 28, 117, -33, 110, 71, -15, MessageUtils.MESSAGE_26_SUB, 113, 29, 41, -59, -119, Constants.FCI_TEMPLATE, -73, 98, Constants.CVR_B1b41_1110_ONLINE_PIN, -86, 24, -66, 27, -4, 86, 62, 75, -58, -46, 121, 32, -102, -37, Constants.CVR_B2b87_11_RFU, -2, 120, -51, 90, -12, 31, -35, -88, 51, -120, 7, -57, 49, -79, MessageUtils.MESSAGE_18_DC2, 16, 89, 39, -128, -20, Constants.STATE_ERROR, Constants.CVR_B1b85_0110_TERMINAL, 81, 127, -87, 25, -75, 74, 13, 45, -27, 122, -97, -109, -55, -100, ByteSourceJsonBootstrapper.UTF8_BOM_1, -96, -32, 59, 77, -82, 42, -11, UtilitiesSDKConstants.SRP_LABEL_ENC, -56, -21, -69, 60, GetProcessingOptionsCommandApdu.COMMAND_TEMPLATE_TAG, 83, -103, Constants.DIRECTORY_ENTRY, 23, 43, 4, 126, -70, Constants.RESP_MSG_TEMPLATE_FORMAT_2, -42, GenerateAcResponseApdu.DAD_ICC_DYNAMIC_DATA_LENGTH, -31, 105, 20, 99, 85, 33, 12, 125};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f88266k = {1, 2, 4, 8, 16, 32, 64, 128, 27, 54, 108, 216, 171, 77, 154, 47, 94, 188, 99, Opcodes.IFNULL, 151, 53, 106, ErrorCodes.ERR_CRY_BAD_BLOCK_SIZE, 179, 125, 250, 239, Opcodes.MULTIANEWARRAY, 145};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int[] f88267l = {-1520213050, -2072216328, -1720223762, -1921287178, 234025727, -1117033514, -1318096930, 1422247313, 1345335392, 50397442, -1452841010, 2099981142, 436141799, 1658312629, -424957107, -1703512340, 1170918031, -1652391393, 1086966153, -2021818886, 368769775, -346465870, -918075506, 200339707, -324162239, 1742001331, -39673249, -357585083, -1080255453, -140204973, -1770884380, 1539358875, -1028147339, 486407649, -1366060227, 1780885068, 1513502316, 1094664062, 49805301, 1338821763, 1546925160, -190470831, 887481809, 150073849, -1821281822, 1943591083, 1395732834, 1058346282, 201589768, 1388824469, 1696801606, 1589887901, 672667696, -1583966665, 251987210, -1248159185, 151455502, 907153956, -1686077413, 1038279391, 652995533, 1764173646, -843926913, -1619692054, 453576978, -1635548387, 1949051992, 773462580, 756751158, -1301385508, -296068428, -73359269, -162377052, 1295727478, 1641469623, -827083907, 2066295122, 1055122397, 1898917726, -1752923117, -179088474, 1758581177, 0, 753790401, 1612718144, 536673507, -927878791, -312779850, -1100322092, 1187761037, -641810841, 1262041458, -565556588, -733197160, -396863312, 1255133061, 1808847035, 720367557, -441800113, 385612781, -985447546, -682799718, 1429418854, -1803188975, -817543798, 284817897, 100794884, -2122350594, -263171936, 1144798328, -1163944155, -475486133, -212774494, -22830243, -1069531008, -1970303227, -1382903233, -1130521311, 1211644016, 83228145, -541279133, -1044990345, 1977277103, 1663115586, 806359072, 452984805, 250868733, 1842533055, 1288555905, 336333848, 890442534, 804056259, -513843266, -1567123659, -867941240, 957814574, 1472513171, -223893675, -2105639172, 1195195770, -1402706744, -413311558, 723065138, -1787595802, -1604296512, -1736343271, -783331426, 2145180835, 1713513028, 2116692564, -1416589253, -2088204277, -901364084, 703524551, -742868885, 1007948840, 2044649127, -497131844, 487262998, 1994120109, 1004593371, 1446130276, 1312438900, 503974420, -615954030, 168166924, 1814307912, -463709000, 1573044895, 1859376061, -273896381, -1503501628, -1466855111, -1533700815, 937747667, -1954973198, 854058965, 1137232011, 1496790894, -1217565222, -1936880383, 1691735473, -766620004, -525751991, -1267962664, -95005012, 133494003, 636152527, -1352309302, -1904575756, -374428089, 403179536, -709182865, -2005370640, 1864705354, 1915629148, 605822008, -240736681, -944458637, 1371981463, 602466507, 2094914977, -1670089496, 555687742, -582268010, -591544991, -2037675251, -2054518257, -1871679264, 1111375484, -994724495, -1436129588, -666351472, 84083462, 32962295, 302911004, -1553899070, 1597322602, -111716434, -793134743, -1853454825, 1489093017, 656219450, -1180787161, 954327513, 335083755, -1281845205, 856756514, -1150719534, 1893325225, -1987146233, -1483434957, -1231316179, 572399164, -1836611819, 552200649, 1238290055, -11184726, 2015897680, 2061492133, -1886614525, -123625127, -2138470135, 386731290, -624967835, 837215959, -968736124, -1201116976, -1019133566, -1332111063, 1999449434, 286199582, -877612933, -61582168, -692339859, 974525996};
    public static final int[] m = {1353184337, 1399144830, -1012656358, -1772214470, -882136261, -247096033, -1420232020, -1828461749, 1442459680, -160598355, -1854485368, 625738485, -52959921, -674551099, -2143013594, -1885117771, 1230680542, 1729870373, -1743852987, -507445667, 41234371, 317738113, -1550367091, -956705941, -413167869, -1784901099, -344298049, -631680363, 763608788, -752782248, 694804553, 1154009486, 1787413109, 2021232372, 1799248025, -579749593, -1236278850, 397248752, 1722556617, -1271214467, 407560035, -2110711067, 1613975959, 1165972322, -529046351, -2068943941, 480281086, -1809118983, 1483229296, 436028815, -2022908268, -1208452270, 601060267, -503166094, 1468997603, 715871590, 120122290, 63092015, -1703164538, -1526188077, -226023376, -1297760477, -1167457534, 1552029421, 723308426, -1833666137, -252573709, -1578997426, -839591323, -708967162, 526529745, -1963022652, -1655493068, -1604979806, 853641733, 1978398372, 971801355, -1427152832, 111112542, 1360031421, -108388034, 1023860118, -1375387939, 1186850381, -1249028975, 90031217, 1876166148, -15380384, 620468249, -1746289194, -868007799, 2006899047, -1119688528, -2004121337, 945494503, -605108103, 1191869601, -384875908, -920746760, 0, -2088337399, 1223502642, -1401941730, 1316117100, -67170563, 1446544655, 517320253, 658058550, 1691946762, 564550760, -783000677, 976107044, -1318647284, 266819475, -761860428, -1634624741, 1338359936, -1574904735, 1766553434, 370807324, 179999714, -450191168, 1138762300, 488053522, 185403662, -1379431438, -1180125651, -928440812, -2061897385, 1275557295, -1143105042, -44007517, -1624899081, -1124765092, -985962940, 880737115, 1982415755, -590994485, 1761406390, 1676797112, -891538985, 277177154, 1076008723, 538035844, 2099530373, -130171950, 288553390, 1839278535, 1261411869, -214912292, -330136051, -790380169, 1813426987, -1715900247, -95906799, 577038663, -997393240, 440397984, -668172970, -275762398, -951170681, -1043253031, -22885748, 906744984, -813566554, 685669029, 646887386, -1530942145, -459458004, 227702864, -1681105046, 1648787028, -1038905866, -390539120, 1593260334, -173030526, -1098883681, 2090061929, -1456614033, -1290656305, 999926984, -1484974064, 1852021992, 2075868123, 158869197, -199730834, 28809964, -1466282109, 1701746150, 2129067946, 147831841, -420997649, -644094022, -835293366, -737566742, -696471511, -1347247055, 824393514, 815048134, -1067015627, 935087732, -1496677636, -1328508704, 366520115, 1251476721, -136647615, 240176511, 804688151, -1915335306, 1303441219, 1414376140, -553347356, -474623586, 461924940, -1205916479, 2136040774, 82468509, 1563790337, 1937016826, 776014843, 1511876531, 1389550482, 861278441, 323475053, -1939744870, 2047648055, -1911228327, -1992551445, -299390514, 902390199, -303751967, 1018251130, 1507840668, 1064563285, 2043548696, -1086863501, -355600557, 1537932639, 342834655, -2032450440, -2114736182, 1053059257, 741614648, 1598071746, 1925389590, 203809468, -1958134744, 1100287487, 1895934009, -558691320, -1662733096, -1866377628, 1636092795, 1890988757, 1952214088, 1113045200};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f88268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[][] f88269b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f88270c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f88271d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f88272e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f88273f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f88274g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public byte[] f88275h;

    public static int b(int i10, int i11) {
        return (i10 << (-i11)) | (i10 >>> i11);
    }

    public static int c(int i10) {
        byte[] bArr = f88264i;
        return (bArr[(i10 >> 24) & 255] << 24) | (bArr[i10 & 255] & 255) | ((bArr[(i10 >> 8) & 255] & 255) << 8) | ((bArr[(i10 >> 16) & 255] & 255) << 16);
    }

    public final void a(int i10, byte[] bArr) {
        int i11 = this.f88270c;
        bArr[i10] = (byte) i11;
        bArr[i10 + 1] = (byte) (i11 >> 8);
        bArr[i10 + 2] = (byte) (i11 >> 16);
        bArr[i10 + 3] = (byte) (i11 >> 24);
        int i12 = this.f88271d;
        bArr[i10 + 4] = (byte) i12;
        bArr[i10 + 5] = (byte) (i12 >> 8);
        bArr[i10 + 6] = (byte) (i12 >> 16);
        bArr[i10 + 7] = (byte) (i12 >> 24);
        int i13 = this.f88272e;
        bArr[i10 + 8] = (byte) i13;
        bArr[i10 + 9] = (byte) (i13 >> 8);
        bArr[i10 + 10] = (byte) (i13 >> 16);
        bArr[i10 + 11] = (byte) (i13 >> 24);
        int i14 = this.f88273f;
        bArr[i10 + 12] = (byte) i14;
        bArr[i10 + 13] = (byte) (i14 >> 8);
        bArr[i10 + 14] = (byte) (i14 >> 16);
        bArr[i10 + 15] = (byte) (i14 >> 24);
    }

    public final void d(int i10, byte[] bArr) {
        this.f88270c = ((bArr[i10 + 1] & 255) << 8) | (bArr[i10] & 255) | ((bArr[i10 + 2] & 255) << 16) | (bArr[i10 + 3] << 24);
        this.f88271d = ((bArr[i10 + 5] & 255) << 8) | (bArr[i10 + 4] & 255) | ((bArr[i10 + 6] & 255) << 16) | (bArr[i10 + 7] << 24);
        this.f88272e = ((bArr[i10 + 9] & 255) << 8) | (bArr[i10 + 8] & 255) | ((bArr[i10 + 10] & 255) << 16) | (bArr[i10 + 11] << 24);
        int i11 = ((bArr[i10 + 13] & 255) << 8) | (bArr[i10 + 12] & 255);
        this.f88273f = (bArr[i10 + 15] << 24) | i11 | ((bArr[i10 + 14] & 255) << 16);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "AES";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z10, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException(com.google.android.gms.measurement.internal.a.b(cipherParameters, "invalid parameter passed to AES init - "));
        }
        byte[] key = ((KeyParameter) cipherParameters).getKey();
        int length = key.length;
        if (length < 16 || length > 32 || (length & 7) != 0) {
            throw new IllegalArgumentException("Key length not 128/192/256 bits.");
        }
        int i10 = length >>> 2;
        this.f88268a = i10 + 6;
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i10 + 7, 4);
        if (i10 == 4) {
            int iLittleEndianToInt = Pack.littleEndianToInt(key, 0);
            iArr[0][0] = iLittleEndianToInt;
            int iLittleEndianToInt2 = Pack.littleEndianToInt(key, 4);
            iArr[0][1] = iLittleEndianToInt2;
            int iLittleEndianToInt3 = Pack.littleEndianToInt(key, 8);
            iArr[0][2] = iLittleEndianToInt3;
            int iLittleEndianToInt4 = Pack.littleEndianToInt(key, 12);
            iArr[0][3] = iLittleEndianToInt4;
            for (int i11 = 1; i11 <= 10; i11++) {
                iLittleEndianToInt ^= c(b(iLittleEndianToInt4, 8)) ^ f88266k[i11 - 1];
                int[] iArr2 = iArr[i11];
                iArr2[0] = iLittleEndianToInt;
                iLittleEndianToInt2 ^= iLittleEndianToInt;
                iArr2[1] = iLittleEndianToInt2;
                iLittleEndianToInt3 ^= iLittleEndianToInt2;
                iArr2[2] = iLittleEndianToInt3;
                iLittleEndianToInt4 ^= iLittleEndianToInt3;
                iArr2[3] = iLittleEndianToInt4;
            }
        } else if (i10 == 6) {
            int iLittleEndianToInt5 = Pack.littleEndianToInt(key, 0);
            iArr[0][0] = iLittleEndianToInt5;
            int iLittleEndianToInt6 = Pack.littleEndianToInt(key, 4);
            iArr[0][1] = iLittleEndianToInt6;
            int iLittleEndianToInt7 = Pack.littleEndianToInt(key, 8);
            iArr[0][2] = iLittleEndianToInt7;
            int iLittleEndianToInt8 = Pack.littleEndianToInt(key, 12);
            iArr[0][3] = iLittleEndianToInt8;
            int iLittleEndianToInt9 = Pack.littleEndianToInt(key, 16);
            iArr[1][0] = iLittleEndianToInt9;
            int iLittleEndianToInt10 = Pack.littleEndianToInt(key, 20);
            iArr[1][1] = iLittleEndianToInt10;
            int iC = iLittleEndianToInt5 ^ (c(b(iLittleEndianToInt10, 8)) ^ 1);
            int[] iArr3 = iArr[1];
            iArr3[2] = iC;
            int i12 = iLittleEndianToInt6 ^ iC;
            iArr3[3] = i12;
            int i13 = iLittleEndianToInt7 ^ i12;
            int[] iArr4 = iArr[2];
            iArr4[0] = i13;
            int i14 = iLittleEndianToInt8 ^ i13;
            iArr4[1] = i14;
            int i15 = iLittleEndianToInt9 ^ i14;
            iArr4[2] = i15;
            int i16 = iLittleEndianToInt10 ^ i15;
            iArr4[3] = i16;
            int i17 = 2;
            for (int i18 = 3; i18 < 12; i18 += 3) {
                int iC2 = iC ^ (c(b(i16, 8)) ^ i17);
                int[] iArr5 = iArr[i18];
                iArr5[0] = iC2;
                int i19 = i12 ^ iC2;
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
                int iC3 = c(b(i24, 8)) ^ (i17 << 1);
                i17 <<= 2;
                iC = iC2 ^ iC3;
                int[] iArr7 = iArr[i23];
                iArr7[2] = iC;
                i12 = i19 ^ iC;
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
            int iC4 = (c(b(i16, 8)) ^ i17) ^ iC;
            int[] iArr9 = iArr[12];
            iArr9[0] = iC4;
            int i25 = iC4 ^ i12;
            iArr9[1] = i25;
            int i26 = i25 ^ i13;
            iArr9[2] = i26;
            iArr9[3] = i26 ^ i14;
        } else {
            if (i10 != 8) {
                throw new IllegalStateException("Should never get here");
            }
            int iLittleEndianToInt11 = Pack.littleEndianToInt(key, 0);
            iArr[0][0] = iLittleEndianToInt11;
            int iLittleEndianToInt12 = Pack.littleEndianToInt(key, 4);
            iArr[0][1] = iLittleEndianToInt12;
            int iLittleEndianToInt13 = Pack.littleEndianToInt(key, 8);
            iArr[0][2] = iLittleEndianToInt13;
            int iLittleEndianToInt14 = Pack.littleEndianToInt(key, 12);
            iArr[0][3] = iLittleEndianToInt14;
            int iLittleEndianToInt15 = Pack.littleEndianToInt(key, 16);
            iArr[1][0] = iLittleEndianToInt15;
            int iLittleEndianToInt16 = Pack.littleEndianToInt(key, 20);
            iArr[1][1] = iLittleEndianToInt16;
            int iLittleEndianToInt17 = Pack.littleEndianToInt(key, 24);
            iArr[1][2] = iLittleEndianToInt17;
            int iLittleEndianToInt18 = Pack.littleEndianToInt(key, 28);
            iArr[1][3] = iLittleEndianToInt18;
            int i27 = 1;
            for (int i28 = 2; i28 < 14; i28 += 2) {
                int iC5 = c(b(iLittleEndianToInt18, 8)) ^ i27;
                i27 <<= 1;
                iLittleEndianToInt11 ^= iC5;
                int[] iArr10 = iArr[i28];
                iArr10[0] = iLittleEndianToInt11;
                iLittleEndianToInt12 ^= iLittleEndianToInt11;
                iArr10[1] = iLittleEndianToInt12;
                iLittleEndianToInt13 ^= iLittleEndianToInt12;
                iArr10[2] = iLittleEndianToInt13;
                iLittleEndianToInt14 ^= iLittleEndianToInt13;
                iArr10[3] = iLittleEndianToInt14;
                iLittleEndianToInt15 ^= c(iLittleEndianToInt14);
                int[] iArr11 = iArr[i28 + 1];
                iArr11[0] = iLittleEndianToInt15;
                iLittleEndianToInt16 ^= iLittleEndianToInt15;
                iArr11[1] = iLittleEndianToInt16;
                iLittleEndianToInt17 ^= iLittleEndianToInt16;
                iArr11[2] = iLittleEndianToInt17;
                iLittleEndianToInt18 ^= iLittleEndianToInt17;
                iArr11[3] = iLittleEndianToInt18;
            }
            int iC6 = (c(b(iLittleEndianToInt18, 8)) ^ i27) ^ iLittleEndianToInt11;
            int[] iArr12 = iArr[14];
            iArr12[0] = iC6;
            int i29 = iC6 ^ iLittleEndianToInt12;
            iArr12[1] = i29;
            int i30 = i29 ^ iLittleEndianToInt13;
            iArr12[2] = i30;
            iArr12[3] = i30 ^ iLittleEndianToInt14;
        }
        if (!z10) {
            for (int i31 = 1; i31 < this.f88268a; i31++) {
                for (int i32 = 0; i32 < 4; i32++) {
                    int[] iArr13 = iArr[i31];
                    int i33 = iArr13[i32];
                    int iB = b(i33, 8) ^ i33;
                    int i34 = i33 ^ (((2139062143 & iB) << 1) ^ ((((-2139062144) & iB) >>> 7) * 27));
                    int i35 = (-1061109568) & i34;
                    int i36 = i35 ^ (i35 >>> 1);
                    int i37 = iB ^ ((((1061109567 & i34) << 2) ^ (i36 >>> 2)) ^ (i36 >>> 5));
                    iArr13[i32] = i34 ^ (i37 ^ b(i37, 16));
                }
            }
        }
        this.f88269b = iArr;
        this.f88274g = z10;
        if (z10) {
            this.f88275h = Arrays.clone(f88264i);
        } else {
            this.f88275h = Arrays.clone(f88265j);
        }
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i10, byte[] bArr2, int i11) {
        int[] iArr;
        int[] iArr2;
        if (this.f88269b == null) {
            throw new IllegalStateException("AES engine not initialised");
        }
        if (i10 + 16 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i11 + 16 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        char c10 = 0;
        int i12 = 1;
        int i13 = 8;
        int i14 = 24;
        int i15 = 16;
        if (this.f88274g) {
            d(i10, bArr);
            int[][] iArr3 = this.f88269b;
            int i16 = this.f88270c;
            int[] iArr4 = iArr3[0];
            int i17 = i16 ^ iArr4[0];
            int iB = this.f88271d ^ iArr4[1];
            int iB2 = this.f88272e ^ iArr4[2];
            int iB3 = iArr4[3] ^ this.f88273f;
            int i18 = 1;
            while (true) {
                int i19 = this.f88268a - i12;
                iArr2 = f88267l;
                if (i18 >= i19) {
                    break;
                }
                int iB4 = (((iArr2[i17 & 255] ^ b(iArr2[(iB >> 8) & 255], 24)) ^ b(iArr2[(iB2 >> 16) & 255], i15)) ^ b(iArr2[(iB3 >> 24) & 255], i13)) ^ iArr3[i18][c10];
                int iB5 = (((b(iArr2[(iB2 >> 8) & 255], 24) ^ iArr2[iB & 255]) ^ b(iArr2[(iB3 >> 16) & 255], i15)) ^ b(iArr2[(i17 >> 24) & 255], i13)) ^ iArr3[i18][i12];
                int iB6 = (((iArr2[iB2 & 255] ^ b(iArr2[(iB3 >> 8) & 255], 24)) ^ b(iArr2[(i17 >> 16) & 255], i15)) ^ b(iArr2[(iB >> 24) & 255], i13)) ^ iArr3[i18][2];
                int iB7 = ((b(iArr2[(i17 >> 8) & 255], 24) ^ iArr2[iB3 & 255]) ^ b(iArr2[(iB >> 16) & 255], i15)) ^ b(iArr2[(iB2 >> 24) & 255], i13);
                int i20 = i18 + 1;
                int i21 = iB7 ^ iArr3[i18][3];
                int iB8 = (((iArr2[iB4 & 255] ^ b(iArr2[(iB5 >> 8) & 255], 24)) ^ b(iArr2[(iB6 >> 16) & 255], i15)) ^ b(iArr2[(i21 >> 24) & 255], i13)) ^ iArr3[i20][0];
                iB = (((iArr2[iB5 & 255] ^ b(iArr2[(iB6 >> 8) & 255], 24)) ^ b(iArr2[(i21 >> 16) & 255], i15)) ^ b(iArr2[(iB4 >> 24) & 255], i13)) ^ iArr3[i20][1];
                iB2 = iArr3[i20][2] ^ (((b(iArr2[(i21 >> 8) & 255], 24) ^ iArr2[iB6 & 255]) ^ b(iArr2[(iB4 >> 16) & 255], i15)) ^ b(iArr2[(iB5 >> 24) & 255], 8));
                i18 += 2;
                iB3 = iArr3[i20][3] ^ (((iArr2[i21 & 255] ^ b(iArr2[(iB4 >> 8) & 255], 24)) ^ b(iArr2[(iB5 >> 16) & 255], 16)) ^ b(iArr2[(iB6 >> 24) & 255], 8));
                i17 = iB8;
                c10 = 0;
                i12 = 1;
                i13 = 8;
                i15 = 16;
            }
            int iB9 = (((iArr2[i17 & 255] ^ b(iArr2[(iB >> 8) & 255], 24)) ^ b(iArr2[(iB2 >> 16) & 255], 16)) ^ b(iArr2[(iB3 >> 24) & 255], 8)) ^ iArr3[i18][0];
            int iB10 = (((iArr2[iB & 255] ^ b(iArr2[(iB2 >> 8) & 255], 24)) ^ b(iArr2[(iB3 >> 16) & 255], 16)) ^ b(iArr2[(i17 >> 24) & 255], 8)) ^ iArr3[i18][1];
            int iB11 = (((iArr2[iB2 & 255] ^ b(iArr2[(iB3 >> 8) & 255], 24)) ^ b(iArr2[(i17 >> 16) & 255], 16)) ^ b(iArr2[(iB >> 24) & 255], 8)) ^ iArr3[i18][2];
            int iB12 = (((b(iArr2[(i17 >> 8) & 255], 24) ^ iArr2[iB3 & 255]) ^ b(iArr2[(iB >> 16) & 255], 16)) ^ b(iArr2[(iB2 >> 24) & 255], 8)) ^ iArr3[i18][3];
            byte[] bArr3 = f88264i;
            int i22 = (bArr3[iB9 & 255] & 255) ^ ((bArr3[(iB10 >> 8) & 255] & 255) << 8);
            byte[] bArr4 = this.f88275h;
            int i23 = (i22 ^ ((bArr4[(iB11 >> 16) & 255] & 255) << 16)) ^ (bArr4[(iB12 >> 24) & 255] << 24);
            int[] iArr5 = iArr3[i18 + 1];
            this.f88270c = iArr5[0] ^ i23;
            this.f88271d = ((((bArr4[iB10 & 255] & 255) ^ ((bArr3[(iB11 >> 8) & 255] & 255) << 8)) ^ ((bArr3[(iB12 >> 16) & 255] & 255) << 16)) ^ (bArr4[(iB9 >> 24) & 255] << 24)) ^ iArr5[1];
            this.f88272e = ((((bArr4[iB11 & 255] & 255) ^ ((bArr3[(iB12 >> 8) & 255] & 255) << 8)) ^ ((bArr3[(iB9 >> 16) & 255] & 255) << 16)) ^ (bArr3[(iB10 >> 24) & 255] << 24)) ^ iArr5[2];
            this.f88273f = iArr5[3] ^ ((((bArr4[iB12 & 255] & 255) ^ ((bArr4[(iB9 >> 8) & 255] & 255) << 8)) ^ ((bArr4[(iB10 >> 16) & 255] & 255) << 16)) ^ (bArr3[(iB11 >> 24) & 255] << 24));
        } else {
            d(i10, bArr);
            int[][] iArr6 = this.f88269b;
            int i24 = this.f88270c;
            int i25 = this.f88268a;
            int[] iArr7 = iArr6[i25];
            int i26 = i24 ^ iArr7[0];
            int i27 = 1;
            int i28 = this.f88271d ^ iArr7[1];
            int i29 = this.f88272e ^ iArr7[2];
            int i30 = i25 - 1;
            int iB13 = iArr7[3] ^ this.f88273f;
            while (true) {
                iArr = m;
                if (i30 <= i27) {
                    break;
                }
                int iB14 = (((iArr[i26 & 255] ^ b(iArr[(iB13 >> 8) & 255], i14)) ^ b(iArr[(i29 >> 16) & 255], 16)) ^ b(iArr[(i28 >> 24) & 255], 8)) ^ iArr6[i30][0];
                int iB15 = (((iArr[i28 & 255] ^ b(iArr[(i26 >> 8) & 255], i14)) ^ b(iArr[(iB13 >> 16) & 255], 16)) ^ b(iArr[(i29 >> 24) & 255], 8)) ^ iArr6[i30][1];
                int iB16 = (((iArr[i29 & 255] ^ b(iArr[(i28 >> 8) & 255], i14)) ^ b(iArr[(i26 >> 16) & 255], 16)) ^ b(iArr[(iB13 >> 24) & 255], 8)) ^ iArr6[i30][2];
                int iB17 = b(iArr[(i26 >> 24) & 255], 8) ^ ((iArr[iB13 & 255] ^ b(iArr[(i29 >> 8) & 255], i14)) ^ b(iArr[(i28 >> 16) & 255], 16));
                int i31 = i30 - 1;
                int i32 = iB17 ^ iArr6[i30][3];
                int iB18 = (((iArr[iB14 & 255] ^ b(iArr[(i32 >> 8) & 255], i14)) ^ b(iArr[(iB16 >> 16) & 255], 16)) ^ b(iArr[(iB15 >> 24) & 255], 8)) ^ iArr6[i31][0];
                int iB19 = (((iArr[iB15 & 255] ^ b(iArr[(iB14 >> 8) & 255], i14)) ^ b(iArr[(i32 >> 16) & 255], 16)) ^ b(iArr[(iB16 >> 24) & 255], 8)) ^ iArr6[i31][1];
                int iB20 = (((iArr[iB16 & 255] ^ b(iArr[(iB15 >> 8) & 255], i14)) ^ b(iArr[(iB14 >> 16) & 255], 16)) ^ b(iArr[(i32 >> 24) & 255], 8)) ^ iArr6[i31][2];
                i30 -= 2;
                iB13 = iArr6[i31][3] ^ (((iArr[i32 & 255] ^ b(iArr[(iB16 >> 8) & 255], 24)) ^ b(iArr[(iB15 >> 16) & 255], 16)) ^ b(iArr[(iB14 >> 24) & 255], 8));
                i26 = iB18;
                i28 = iB19;
                i29 = iB20;
                i27 = 1;
                i14 = 24;
            }
            int iB21 = (((iArr[i26 & 255] ^ b(iArr[(iB13 >> 8) & 255], 24)) ^ b(iArr[(i29 >> 16) & 255], 16)) ^ b(iArr[(i28 >> 24) & 255], 8)) ^ iArr6[i30][0];
            int iB22 = (((iArr[i28 & 255] ^ b(iArr[(i26 >> 8) & 255], 24)) ^ b(iArr[(iB13 >> 16) & 255], 16)) ^ b(iArr[(i29 >> 24) & 255], 8)) ^ iArr6[i30][1];
            int iB23 = (((iArr[i29 & 255] ^ b(iArr[(i28 >> 8) & 255], 24)) ^ b(iArr[(i26 >> 16) & 255], 16)) ^ b(iArr[(iB13 >> 24) & 255], 8)) ^ iArr6[i30][2];
            int iB24 = (b(iArr[(i26 >> 24) & 255], 8) ^ ((iArr[iB13 & 255] ^ b(iArr[(i29 >> 8) & 255], 24)) ^ b(iArr[(i28 >> 16) & 255], 16))) ^ iArr6[i30][3];
            byte[] bArr5 = f88265j;
            int i33 = bArr5[iB21 & 255] & 255;
            byte[] bArr6 = this.f88275h;
            int i34 = ((i33 ^ ((bArr6[(iB24 >> 8) & 255] & 255) << 8)) ^ ((bArr6[(iB23 >> 16) & 255] & 255) << 16)) ^ (bArr5[(iB22 >> 24) & 255] << 24);
            int[] iArr8 = iArr6[0];
            this.f88270c = i34 ^ iArr8[0];
            this.f88271d = ((((bArr6[iB22 & 255] & 255) ^ ((bArr6[(iB21 >> 8) & 255] & 255) << 8)) ^ ((bArr5[(iB24 >> 16) & 255] & 255) << 16)) ^ (bArr6[(iB23 >> 24) & 255] << 24)) ^ iArr8[1];
            this.f88272e = ((((bArr6[iB23 & 255] & 255) ^ ((bArr5[(iB22 >> 8) & 255] & 255) << 8)) ^ ((bArr5[(iB21 >> 16) & 255] & 255) << 16)) ^ (bArr6[(iB24 >> 24) & 255] << 24)) ^ iArr8[2];
            this.f88273f = iArr8[3] ^ ((((bArr5[iB24 & 255] & 255) ^ ((bArr6[(iB23 >> 8) & 255] & 255) << 8)) ^ ((bArr6[(iB22 >> 16) & 255] & 255) << 16)) ^ (bArr6[(iB21 >> 24) & 255] << 24));
        }
        a(i11, bArr2);
        return 16;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }
}
