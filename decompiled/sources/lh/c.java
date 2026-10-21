package lh;

import com.google.zxing.FormatException;
import com.google.zxing.common.BitSource;
import com.google.zxing.common.StringUtils;
import com.google.zxing.qrcode.decoder.Mode;
import java.io.UnsupportedEncodingException;

/* JADX INFO: compiled from: DecodedBitStreamParser.java */
/* JADX INFO: loaded from: classes10.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f83216a = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ $%*+-./:".toCharArray();

    /* JADX INFO: compiled from: DecodedBitStreamParser.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f83217a;

        static {
            int[] iArr = new int[Mode.values().length];
            f83217a = iArr;
            try {
                iArr[Mode.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f83217a[Mode.ALPHANUMERIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f83217a[Mode.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f83217a[Mode.KANJI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f83217a[Mode.TERMINATOR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f83217a[Mode.FNC1_FIRST_POSITION.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f83217a[Mode.FNC1_SECOND_POSITION.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f83217a[Mode.STRUCTURED_APPEND.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f83217a[Mode.ECI.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f83217a[Mode.HANZI.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006a  */
    public static void a(BitSource bitSource, StringBuilder sb2, int i10, boolean z10) throws FormatException {
        while (i10 > 1) {
            if (bitSource.available() < 11) {
                throw FormatException.getFormatInstance();
            }
            int bits = bitSource.readBits(11);
            sb2.append(e(bits / 45));
            sb2.append(e(bits % 45));
            i10 -= 2;
        }
        if (i10 == 1) {
            if (bitSource.available() < 6) {
                throw FormatException.getFormatInstance();
            }
            sb2.append(e(bitSource.readBits(6)));
        }
        if (z10) {
            for (int length = sb2.length(); length < sb2.length(); length++) {
                if (sb2.charAt(length) == '%') {
                    if (length < sb2.length() - 1) {
                        int i11 = length + 1;
                        if (sb2.charAt(i11) == '%') {
                            sb2.deleteCharAt(i11);
                        } else {
                            sb2.setCharAt(length, (char) 29);
                        }
                    } else {
                        sb2.setCharAt(length, (char) 29);
                    }
                }
            }
        }
    }

    public static void b(BitSource bitSource, StringBuilder sb2, int i10) throws FormatException {
        if (i10 * 13 > bitSource.available()) {
            throw FormatException.getFormatInstance();
        }
        byte[] bArr = new byte[i10 * 2];
        int i11 = 0;
        while (i10 > 0) {
            int bits = bitSource.readBits(13);
            int i12 = (bits % 96) | ((bits / 96) << 8);
            int i13 = i12 + (i12 < 959 ? 41377 : 42657);
            bArr[i11] = (byte) (i13 >> 8);
            bArr[i11 + 1] = (byte) i13;
            i11 += 2;
            i10--;
        }
        try {
            sb2.append(new String(bArr, StringUtils.GB2312));
        } catch (UnsupportedEncodingException unused) {
            throw FormatException.getFormatInstance();
        }
    }

    public static void c(BitSource bitSource, StringBuilder sb2, int i10) throws FormatException {
        if (i10 * 13 > bitSource.available()) {
            throw FormatException.getFormatInstance();
        }
        byte[] bArr = new byte[i10 * 2];
        int i11 = 0;
        while (i10 > 0) {
            int bits = bitSource.readBits(13);
            int i12 = (bits % 192) | ((bits / 192) << 8);
            int i13 = i12 + (i12 < 7936 ? 33088 : 49472);
            bArr[i11] = (byte) (i13 >> 8);
            bArr[i11 + 1] = (byte) i13;
            i11 += 2;
            i10--;
        }
        try {
            sb2.append(new String(bArr, StringUtils.SHIFT_JIS));
        } catch (UnsupportedEncodingException unused) {
            throw FormatException.getFormatInstance();
        }
    }

    public static void d(BitSource bitSource, StringBuilder sb2, int i10) throws FormatException {
        while (i10 >= 3) {
            if (bitSource.available() < 10) {
                throw FormatException.getFormatInstance();
            }
            int bits = bitSource.readBits(10);
            if (bits >= 1000) {
                throw FormatException.getFormatInstance();
            }
            sb2.append(e(bits / 100));
            sb2.append(e((bits / 10) % 10));
            sb2.append(e(bits % 10));
            i10 -= 3;
        }
        if (i10 == 2) {
            if (bitSource.available() < 7) {
                throw FormatException.getFormatInstance();
            }
            int bits2 = bitSource.readBits(7);
            if (bits2 >= 100) {
                throw FormatException.getFormatInstance();
            }
            sb2.append(e(bits2 / 10));
            sb2.append(e(bits2 % 10));
            return;
        }
        if (i10 == 1) {
            if (bitSource.available() < 4) {
                throw FormatException.getFormatInstance();
            }
            int bits3 = bitSource.readBits(4);
            if (bits3 >= 10) {
                throw FormatException.getFormatInstance();
            }
            sb2.append(e(bits3));
        }
    }

    public static char e(int i10) throws FormatException {
        char[] cArr = f83216a;
        if (i10 < cArr.length) {
            return cArr[i10];
        }
        throw FormatException.getFormatInstance();
    }
}
