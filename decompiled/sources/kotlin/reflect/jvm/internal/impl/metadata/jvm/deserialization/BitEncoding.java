package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public class BitEncoding {
    static {
        String property;
        try {
            property = System.getProperty("kotlin.jvm.serialization.use8to7");
        } catch (SecurityException unused) {
            property = null;
        }
        "true".equals(property);
    }

    public static /* synthetic */ void a(int i10) {
        String str = (i10 == 1 || i10 == 3 || i10 == 6 || i10 == 8 || i10 == 10 || i10 == 12 || i10 == 14) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 1 || i10 == 3 || i10 == 6 || i10 == 8 || i10 == 10 || i10 == 12 || i10 == 14) ? 2 : 3];
        if (i10 == 1 || i10 == 3 || i10 == 6 || i10 == 8 || i10 == 10 || i10 == 12 || i10 == 14) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/BitEncoding";
        } else {
            objArr[0] = "data";
        }
        if (i10 == 1) {
            objArr[1] = "encodeBytes";
        } else if (i10 == 3) {
            objArr[1] = "encode8to7";
        } else if (i10 == 6) {
            objArr[1] = "splitBytesToStringArray";
        } else if (i10 == 8) {
            objArr[1] = "decodeBytes";
        } else if (i10 == 10) {
            objArr[1] = "dropMarker";
        } else if (i10 == 12) {
            objArr[1] = "combineStringArrayIntoBytes";
        } else if (i10 != 14) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/BitEncoding";
        } else {
            objArr[1] = "decode7to8";
        }
        switch (i10) {
            case 1:
            case 3:
            case 6:
            case 8:
            case 10:
            case 12:
            case 14:
                break;
            case 2:
                objArr[2] = "encode8to7";
                break;
            case 4:
                objArr[2] = "addModuloByte";
                break;
            case 5:
                objArr[2] = "splitBytesToStringArray";
                break;
            case 7:
                objArr[2] = "decodeBytes";
                break;
            case 9:
                objArr[2] = "dropMarker";
                break;
            case 11:
                objArr[2] = "combineStringArrayIntoBytes";
                break;
            case 13:
                objArr[2] = "decode7to8";
                break;
            default:
                objArr[2] = "encodeBytes";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 1 && i10 != 3 && i10 != 6 && i10 != 8 && i10 != 10 && i10 != 12 && i10 != 14) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @NotNull
    public static byte[] decodeBytes(@NotNull String[] strArr) {
        if (strArr == null) {
            a(7);
            throw null;
        }
        if (strArr.length > 0 && !strArr[0].isEmpty()) {
            char cCharAt = strArr[0].charAt(0);
            if (cCharAt == 0) {
                String[] strArr2 = (String[]) strArr.clone();
                strArr2[0] = strArr2[0].substring(1);
                byte[] bArrStringsToBytes = UtfEncodingKt.stringsToBytes(strArr2);
                if (bArrStringsToBytes != null) {
                    return bArrStringsToBytes;
                }
                a(8);
                throw null;
            }
            if (cCharAt == 65535) {
                strArr = (String[]) strArr.clone();
                strArr[0] = strArr[0].substring(1);
            }
        }
        int length = 0;
        for (String str : strArr) {
            length += str.length();
        }
        byte[] bArr = new byte[length];
        int i10 = 0;
        for (String str2 : strArr) {
            int length2 = str2.length();
            int i11 = 0;
            while (i11 < length2) {
                bArr[i10] = (byte) str2.charAt(i11);
                i11++;
                i10++;
            }
        }
        for (int i12 = 0; i12 < length; i12++) {
            bArr[i12] = (byte) ((bArr[i12] + 127) & 127);
        }
        int i13 = (length * 7) / 8;
        byte[] bArr2 = new byte[i13];
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < i13; i16++) {
            int i17 = i14 + 1;
            int i18 = i15 + 1;
            bArr2[i16] = (byte) (((bArr[i14] & 255) >>> i15) + ((bArr[i17] & ((1 << i18) - 1)) << (7 - i15)));
            if (i15 == 6) {
                i14 += 2;
                i15 = 0;
            } else {
                i14 = i17;
                i15 = i18;
            }
        }
        return bArr2;
    }
}
