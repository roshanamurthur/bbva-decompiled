package kotlinx.serialization.internal;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Platform.common.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006J\u0018\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u000bJ\u000e\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0004¨\u0006\u0012"}, d2 = {"Lkotlinx/serialization/internal/InternalHexConverter;", "", "", "ch", "", "hexToInt", "", "s", "", "parseHexBinary", "data", "", "lowerCase", "printHexBinary", "n", "toHexString", "<init>", "()V", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nPlatform.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Platform.common.kt\nkotlinx/serialization/internal/InternalHexConverter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,182:1\n1#2:183\n*E\n"})
public final class InternalHexConverter {

    @NotNull
    public static final InternalHexConverter INSTANCE = new InternalHexConverter();

    private InternalHexConverter() {
    }

    private final int hexToInt(char ch2) {
        if ('0' <= ch2 && ch2 < ':') {
            return ch2 - '0';
        }
        if ('A' <= ch2 && ch2 < 'G') {
            return ch2 - '7';
        }
        if ('a' > ch2 || ch2 >= 'g') {
            return -1;
        }
        return ch2 - 'W';
    }

    public static /* synthetic */ String printHexBinary$default(InternalHexConverter internalHexConverter, byte[] bArr, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return internalHexConverter.printHexBinary(bArr, z10);
    }

    @NotNull
    public final byte[] parseHexBinary(@NotNull String s4) {
        Intrinsics.checkNotNullParameter(s4, "s");
        int length = s4.length();
        if (length % 2 != 0) {
            throw new IllegalArgumentException("HexBinary string must be even length".toString());
        }
        byte[] bArr = new byte[length / 2];
        for (int i10 = 0; i10 < length; i10 += 2) {
            int iHexToInt = hexToInt(s4.charAt(i10));
            int i11 = i10 + 1;
            int iHexToInt2 = hexToInt(s4.charAt(i11));
            if (iHexToInt == -1 || iHexToInt2 == -1) {
                throw new IllegalArgumentException(("Invalid hex chars: " + s4.charAt(i10) + s4.charAt(i11)).toString());
            }
            bArr[i10 / 2] = (byte) ((iHexToInt << 4) + iHexToInt2);
        }
        return bArr;
    }

    @NotNull
    public final String printHexBinary(@NotNull byte[] data, boolean lowerCase) {
        Intrinsics.checkNotNullParameter(data, "data");
        StringBuilder sb2 = new StringBuilder(data.length * 2);
        for (byte b10 : data) {
            sb2.append("0123456789ABCDEF".charAt((b10 >> 4) & 15));
            sb2.append("0123456789ABCDEF".charAt(b10 & 15));
        }
        if (!lowerCase) {
            String string = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return string;
        }
        String string2 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        String lowerCase2 = string2.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
        return lowerCase2;
    }

    @NotNull
    public final String toHexString(int n7) {
        byte[] bArr = new byte[4];
        for (int i10 = 0; i10 < 4; i10++) {
            bArr[i10] = (byte) (n7 >> (24 - (i10 * 8)));
        }
        String strTrimStart = StringsKt__StringsKt.trimStart(printHexBinary(bArr, true), '0');
        if (strTrimStart.length() <= 0) {
            strTrimStart = null;
        }
        return strTrimStart == null ? "0" : strTrimStart;
    }
}
