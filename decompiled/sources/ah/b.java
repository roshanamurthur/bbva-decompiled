package ah;

import com.bbva.cellswidgets.MaskTextWatcher;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.sl.ar.android.libkeymanagement.exception.ReturnCode;
import com.fasterxml.jackson.core.JsonPointer;
import kotlin.text.Typography;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.bouncycastle.pqc.math.linearalgebra.Matrix;

/* JADX INFO: compiled from: DecodedBitStreamParser.java */
/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f248a = {'*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', Matrix.MATRIX_TYPE_RANDOM_LT, 'M', 'N', 'O', 'P', 'Q', Matrix.MATRIX_TYPE_RANDOM_REGULAR, 'S', 'T', Matrix.MATRIX_TYPE_RANDOM_UT, 'V', 'W', 'X', 'Y', Matrix.MATRIX_TYPE_ZERO};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final char[] f249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final char[] f250c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final char[] f251d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final char[] f252e;

    /* JADX INFO: compiled from: DecodedBitStreamParser.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f253a;

        static {
            int[] iArr = new int[EnumC0000b.values().length];
            f253a = iArr;
            try {
                iArr[EnumC0000b.C40_ENCODE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f253a[EnumC0000b.TEXT_ENCODE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f253a[EnumC0000b.ANSIX12_ENCODE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f253a[EnumC0000b.EDIFACT_ENCODE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f253a[EnumC0000b.BASE256_ENCODE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: ah.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DecodedBitStreamParser.java */
    public static final class EnumC0000b {
        private static final /* synthetic */ EnumC0000b[] $VALUES;
        public static final EnumC0000b ANSIX12_ENCODE;
        public static final EnumC0000b ASCII_ENCODE;
        public static final EnumC0000b BASE256_ENCODE;
        public static final EnumC0000b C40_ENCODE;
        public static final EnumC0000b EDIFACT_ENCODE;
        public static final EnumC0000b PAD_ENCODE;
        public static final EnumC0000b TEXT_ENCODE;

        static {
            EnumC0000b enumC0000b = new EnumC0000b("PAD_ENCODE", 0);
            PAD_ENCODE = enumC0000b;
            EnumC0000b enumC0000b2 = new EnumC0000b("ASCII_ENCODE", 1);
            ASCII_ENCODE = enumC0000b2;
            EnumC0000b enumC0000b3 = new EnumC0000b("C40_ENCODE", 2);
            C40_ENCODE = enumC0000b3;
            EnumC0000b enumC0000b4 = new EnumC0000b("TEXT_ENCODE", 3);
            TEXT_ENCODE = enumC0000b4;
            EnumC0000b enumC0000b5 = new EnumC0000b("ANSIX12_ENCODE", 4);
            ANSIX12_ENCODE = enumC0000b5;
            EnumC0000b enumC0000b6 = new EnumC0000b("EDIFACT_ENCODE", 5);
            EDIFACT_ENCODE = enumC0000b6;
            EnumC0000b enumC0000b7 = new EnumC0000b("BASE256_ENCODE", 6);
            BASE256_ENCODE = enumC0000b7;
            $VALUES = new EnumC0000b[]{enumC0000b, enumC0000b2, enumC0000b3, enumC0000b4, enumC0000b5, enumC0000b6, enumC0000b7};
        }

        public EnumC0000b() {
            throw null;
        }

        public static EnumC0000b valueOf(String str) {
            return (EnumC0000b) Enum.valueOf(EnumC0000b.class, str);
        }

        public static EnumC0000b[] values() {
            return (EnumC0000b[]) $VALUES.clone();
        }
    }

    static {
        char[] cArr = {'!', '\"', MaskTextWatcher.WILDCARD, Typography.dollar, '%', Typography.amp, '\'', RootService.OPEN_BRACKET, RootService.CLOSE_BRACKET, '*', '+', AbstractJsonLexerKt.COMMA, '-', '.', JsonPointer.SEPARATOR, AbstractJsonLexerKt.COLON, ';', Typography.less, '=', Typography.greater, '?', '@', AbstractJsonLexerKt.BEGIN_LIST, AbstractJsonLexerKt.STRING_ESC, AbstractJsonLexerKt.END_LIST, '^', '_'};
        f249b = cArr;
        f250c = new char[]{'*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', AbstractJsonLexerKt.UNICODE_ESC, 'v', 'w', 'x', 'y', 'z'};
        f251d = cArr;
        f252e = new char[]{'`', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', Matrix.MATRIX_TYPE_RANDOM_LT, 'M', 'N', 'O', 'P', 'Q', Matrix.MATRIX_TYPE_RANDOM_REGULAR, 'S', 'T', Matrix.MATRIX_TYPE_RANDOM_UT, 'V', 'W', 'X', 'Y', Matrix.MATRIX_TYPE_ZERO, AbstractJsonLexerKt.BEGIN_OBJ, '|', AbstractJsonLexerKt.END_OBJ, '~', 127};
    }

    public static void a(int i10, int i11, int[] iArr) {
        int i12 = ((i10 << 8) + i11) - 1;
        int i13 = i12 / ReturnCode.ERR_STORAGE;
        iArr[0] = i13;
        int i14 = i12 - (i13 * ReturnCode.ERR_STORAGE);
        int i15 = i14 / 40;
        iArr[1] = i15;
        iArr[2] = i14 - (i15 * 40);
    }

    public static int b(int i10, int i11) {
        int i12 = i10 - (((i11 * 149) % 255) + 1);
        return i12 >= 0 ? i12 : i12 + 256;
    }
}
