package com.google.zxing.aztec.decoder;

import androidx.exifinterface.media.ExifInterface;
import androidx.webkit.ProxyConfig;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.tokencompat.model.StorageTokenBuilder;
import com.bbva.ethermobilesdk.tokencompat.storage.local.SharedPrefsStorage;
import com.bbva.glomohybrid.base.deeplink.extensions.DeepLinkExtensionsKt;
import com.bbva.notifications.constants.PushConstants;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.bbva.tohu.android.product.valkyria.sdk.logic.ReplenishLogic;
import com.google.zxing.FormatException;
import com.google.zxing.aztec.AztecDetectorResult;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.DecoderResult;
import com.google.zxing.common.reedsolomon.GenericGF;
import com.google.zxing.common.reedsolomon.ReedSolomonDecoder;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import java.util.Arrays;
import mx.openpay.library.data.util.CommandConstants;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes10.dex */
public final class Decoder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f49675b = {"CTRL_PS", " ", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "B", "C", "D", ExifInterface.LONGITUDE_EAST, "F", "G", "H", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "J", "K", "L", "M", "N", "O", "P", TransactionType.TRANSACTION_TYPE_CONTACTLESS_CODE, "R", ExifInterface.LATITUDE_SOUTH, ExifInterface.GPS_DIRECTION_TRUE, "U", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, ExifInterface.LONGITUDE_WEST, "X", "Y", "Z", "CTRL_LL", "CTRL_ML", "CTRL_DL", "CTRL_BS"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f49676c = {"CTRL_PS", " ", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", SharedPrefsStorage.VERSION_KEY, "w", "x", "y", "z", "CTRL_US", "CTRL_ML", "CTRL_DL", "CTRL_BS"};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String[] f49677d = {"CTRL_PS", " ", "\u0001", "\u0002", "\u0003", "\u0004", "\u0005", "\u0006", "\u0007", "\b", "\t", RootService.LINE_BREAK, "\u000b", "\f", "\r", "\u001b", "\u001c", "\u001d", "\u001e", "\u001f", "@", "\\", "^", PushConstants.GE_PARAMS_SEPARATOR, "`", "|", "~", "\u007f", "CTRL_LL", "CTRL_UL", "CTRL_PL", "CTRL_BS"};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String[] f49678e = {"", "\r", "\r\n", ". ", ", ", ": ", CommandConstants.Z11_EXCLAMATION_MARK, "\"", "#", Constant.MXN_SYMBOL, "%", "&", "'", "(", ")", ProxyConfig.MATCH_ALL_SCHEMES, "+", ",", Constant.DASH_STRING, Constant.DOT_STRING, "/", DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER, ReplenishLogic.ID_SEPARATOR, "<", "=", ">", "?", Constant.BRACKET_OPEN, Constant.BRACKET_CLOSE, "{", "}", "CTRL_UL"};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String[] f49679f = {"CTRL_PS", " ", "0", "1", "2", ExifInterface.GPS_MEASUREMENT_3D, "4", "5", StorageTokenBuilder.OTP_LENGTH, "7", "8", "9", ",", Constant.DOT_STRING, "CTRL_UL", "CTRL_US"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AztecDetectorResult f49680a;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f49681a;

        static {
            int[] iArr = new int[b.values().length];
            f49681a = iArr;
            try {
                iArr[b.UPPER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f49681a[b.LOWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f49681a[b.MIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f49681a[b.PUNCT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f49681a[b.DIGIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        private static final /* synthetic */ b[] $VALUES;
        public static final b BINARY;
        public static final b DIGIT;
        public static final b LOWER;
        public static final b MIXED;
        public static final b PUNCT;
        public static final b UPPER;

        static {
            b bVar = new b("UPPER", 0);
            UPPER = bVar;
            b bVar2 = new b("LOWER", 1);
            LOWER = bVar2;
            b bVar3 = new b("MIXED", 2);
            MIXED = bVar3;
            b bVar4 = new b("DIGIT", 3);
            DIGIT = bVar4;
            b bVar5 = new b("PUNCT", 4);
            PUNCT = bVar5;
            b bVar6 = new b("BINARY", 5);
            BINARY = bVar6;
            $VALUES = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6};
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    public static String a(boolean[] zArr) {
        String str;
        int length = zArr.length;
        b bVar = b.UPPER;
        StringBuilder sb2 = new StringBuilder(20);
        b bVar2 = bVar;
        int i10 = 0;
        while (i10 < length) {
            b bVar3 = b.BINARY;
            if (bVar != bVar3) {
                b bVar4 = b.DIGIT;
                int i11 = bVar == bVar4 ? 4 : 5;
                if (length - i10 < i11) {
                    break;
                }
                int iB = b(zArr, i10, i11);
                i10 += i11;
                int i12 = a.f49681a[bVar.ordinal()];
                if (i12 == 1) {
                    str = f49675b[iB];
                } else if (i12 == 2) {
                    str = f49676c[iB];
                } else if (i12 == 3) {
                    str = f49677d[iB];
                } else if (i12 == 4) {
                    str = f49678e[iB];
                } else {
                    if (i12 != 5) {
                        throw new IllegalStateException("Bad table");
                    }
                    str = f49679f[iB];
                }
                if (str.startsWith("CTRL_")) {
                    char cCharAt = str.charAt(5);
                    if (cCharAt == 'B') {
                        bVar2 = bVar3;
                    } else if (cCharAt == 'D') {
                        bVar2 = bVar4;
                    } else if (cCharAt == 'P') {
                        bVar2 = b.PUNCT;
                    } else if (cCharAt != 'L') {
                        bVar2 = cCharAt != 'M' ? b.UPPER : b.MIXED;
                    } else {
                        bVar2 = b.LOWER;
                    }
                    if (str.charAt(6) != 'L') {
                        b bVar5 = bVar2;
                        bVar2 = bVar;
                        bVar = bVar5;
                    }
                } else {
                    sb2.append(str);
                }
                bVar = bVar2;
            } else {
                if (length - i10 < 5) {
                    break;
                }
                int iB2 = b(zArr, i10, 5);
                int i13 = i10 + 5;
                if (iB2 == 0) {
                    if (length - i13 < 11) {
                        break;
                    }
                    iB2 = b(zArr, i13, 11) + 31;
                    i13 = i10 + 16;
                }
                int i14 = 0;
                while (true) {
                    if (i14 >= iB2) {
                        i10 = i13;
                        break;
                    }
                    if (length - i13 < 8) {
                        i10 = length;
                        break;
                    }
                    sb2.append((char) b(zArr, i13, 8));
                    i13 += 8;
                    i14++;
                }
                bVar = bVar2;
            }
        }
        return sb2.toString();
    }

    public static int b(boolean[] zArr, int i10, int i11) {
        int i12 = 0;
        for (int i13 = i10; i13 < i10 + i11; i13++) {
            i12 <<= 1;
            if (zArr[i13]) {
                i12 |= 1;
            }
        }
        return i12;
    }

    public static String highLevelDecode(boolean[] zArr) {
        return a(zArr);
    }

    public DecoderResult decode(AztecDetectorResult aztecDetectorResult) throws FormatException {
        int i10;
        GenericGF genericGF;
        this.f49680a = aztecDetectorResult;
        BitMatrix bits = aztecDetectorResult.getBits();
        boolean zIsCompact = this.f49680a.isCompact();
        int nbLayers = this.f49680a.getNbLayers();
        int i11 = (zIsCompact ? 11 : 14) + (nbLayers << 2);
        int[] iArr = new int[i11];
        int i12 = ((zIsCompact ? 88 : 112) + (nbLayers << 4)) * nbLayers;
        boolean[] zArr = new boolean[i12];
        int i13 = 2;
        if (zIsCompact) {
            for (int i14 = 0; i14 < i11; i14++) {
                iArr[i14] = i14;
            }
        } else {
            int i15 = i11 / 2;
            int i16 = ((((i15 - 1) / 15) * 2) + (i11 + 1)) / 2;
            for (int i17 = 0; i17 < i15; i17++) {
                int i18 = (i17 / 15) + i17;
                iArr[(i15 - i17) - 1] = (i16 - i18) - 1;
                iArr[i15 + i17] = i18 + i16 + 1;
            }
        }
        int i19 = 0;
        int i20 = 0;
        while (true) {
            i10 = 12;
            if (i19 >= nbLayers) {
                break;
            }
            int i21 = ((nbLayers - i19) << i13) + (zIsCompact ? 9 : 12);
            int i22 = i19 << 1;
            int i23 = (i11 - 1) - i22;
            int i24 = 0;
            while (i24 < i21) {
                int i25 = i24 << 1;
                int i26 = 0;
                while (i26 < i13) {
                    int i27 = i22 + i26;
                    int i28 = i22 + i24;
                    zArr[i20 + i25 + i26] = bits.get(iArr[i27], iArr[i28]);
                    int i29 = i23 - i26;
                    zArr[(i21 * 2) + i20 + i25 + i26] = bits.get(iArr[i28], iArr[i29]);
                    int i30 = i23 - i24;
                    zArr[(i21 * 4) + i20 + i25 + i26] = bits.get(iArr[i29], iArr[i30]);
                    zArr[(i21 * 6) + i20 + i25 + i26] = bits.get(iArr[i30], iArr[i27]);
                    i26++;
                    i11 = i11;
                    nbLayers = nbLayers;
                    zIsCompact = zIsCompact;
                    i13 = 2;
                }
                i24++;
                i13 = 2;
            }
            i20 += i21 << 3;
            i19++;
            zIsCompact = zIsCompact;
            i13 = 2;
        }
        if (this.f49680a.getNbLayers() <= 2) {
            genericGF = GenericGF.AZTEC_DATA_6;
            i10 = 6;
        } else if (this.f49680a.getNbLayers() <= 8) {
            genericGF = GenericGF.AZTEC_DATA_8;
            i10 = 8;
        } else if (this.f49680a.getNbLayers() <= 22) {
            genericGF = GenericGF.AZTEC_DATA_10;
            i10 = 10;
        } else {
            genericGF = GenericGF.AZTEC_DATA_12;
        }
        int nbDatablocks = this.f49680a.getNbDatablocks();
        int i31 = i12 / i10;
        if (i31 < nbDatablocks) {
            throw FormatException.getFormatInstance();
        }
        int i32 = i12 % i10;
        int[] iArr2 = new int[i31];
        int i33 = 0;
        while (i33 < i31) {
            iArr2[i33] = b(zArr, i32, i10);
            i33++;
            i32 += i10;
        }
        try {
            new ReedSolomonDecoder(genericGF).decode(iArr2, i31 - nbDatablocks);
            int i34 = 1;
            int i35 = 1 << i10;
            int i36 = i35 - 1;
            int i37 = 0;
            int i38 = 0;
            while (i37 < nbDatablocks) {
                int i39 = iArr2[i37];
                if (i39 == 0 || i39 == i36) {
                    throw FormatException.getFormatInstance();
                }
                if (i39 == i34 || i39 == i35 - 2) {
                    i38++;
                }
                i37++;
                i34 = 1;
            }
            int i40 = (nbDatablocks * i10) - i38;
            boolean[] zArr2 = new boolean[i40];
            int i41 = 0;
            for (int i42 = 0; i42 < nbDatablocks; i42++) {
                int i43 = iArr2[i42];
                int i44 = 1;
                if (i43 == 1 || i43 == i35 - 2) {
                    Arrays.fill(zArr2, i41, (i41 + i10) - 1, i43 > 1);
                    i41 = (i10 - 1) + i41;
                } else {
                    int i45 = i10 - 1;
                    while (i45 >= 0) {
                        int i46 = i41 + 1;
                        zArr2[i41] = (i43 & (i44 << i45)) != 0;
                        i45--;
                        i41 = i46;
                        i44 = 1;
                    }
                }
            }
            int i47 = (i40 + 7) / 8;
            byte[] bArr = new byte[i47];
            for (int i48 = 0; i48 < i47; i48++) {
                int i49 = i48 << 3;
                int i50 = i40 - i49;
                bArr[i48] = (byte) (i50 >= 8 ? b(zArr2, i49, 8) : b(zArr2, i49, i50) << (8 - i50));
            }
            DecoderResult decoderResult = new DecoderResult(bArr, a(zArr2), null, null);
            decoderResult.setNumBits(i40);
            return decoderResult;
        } catch (ReedSolomonException e5) {
            throw FormatException.getFormatInstance(e5);
        }
    }
}
