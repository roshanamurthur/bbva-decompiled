package com.bbva.ethermobilesdk.cipher.utils;

import android.os.Build;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import java.util.Base64;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntProgression;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: EncodingUtils.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001\u001a\u0014\u0010\u0005\u001a\u00020\u0000*\u00020\u00032\b\b\u0002\u0010\u0002\u001a\u00020\u0001\u001a\n\u0010\u0006\u001a\u00020\u0003*\u00020\u0000\u001a\n\u0010\u0007\u001a\u00020\u0003*\u00020\u0000\u001a\n\u0010\b\u001a\u00020\u0003*\u00020\u0000\u001a\n\u0010\t\u001a\u00020\u0000*\u00020\u0003\u001a\n\u0010\n\u001a\u00020\u0000*\u00020\u0003¨\u0006\u000b"}, d2 = {"", "Lcom/bbva/ethermobilesdk/cipher/utils/HexadecimalCharacters;", "hexadecimalCharacters", "", "toHex", "hexStringToByteArray", "toSimpleString", "toBase64", "toBase64UrlSafe", "base64ToByteArray", "base64UrlSafeToByteArray", "cipher_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nEncodingUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EncodingUtils.kt\ncom/bbva/ethermobilesdk/cipher/utils/EncodingUtilsKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,88:1\n13316#2,2:89\n*S KotlinDebug\n*F\n+ 1 EncodingUtils.kt\ncom/bbva/ethermobilesdk/cipher/utils/EncodingUtilsKt\n*L\n21#1:89,2\n*E\n"})
public final class EncodingUtilsKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final char[] f29388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final char[] f29389b;

    static {
        char[] charArray = "0123456789ABCDEF".toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "this as java.lang.String).toCharArray()");
        f29388a = charArray;
        char[] charArray2 = "0123456789abcdef".toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray2, "this as java.lang.String).toCharArray()");
        f29389b = charArray2;
    }

    @NotNull
    public static final byte[] base64ToByteArray(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (Build.VERSION.SDK_INT >= 26) {
            byte[] bArrDecode = Base64.getDecoder().decode(str);
            Intrinsics.checkNotNullExpressionValue(bArrDecode, "{\n        Base64.getDecoder().decode(this)\n    }");
            return bArrDecode;
        }
        byte[] bArrDecode2 = android.util.Base64.decode(str, 2);
        Intrinsics.checkNotNullExpressionValue(bArrDecode2, "{\n        android.util.B…til.Base64.NO_WRAP)\n    }");
        return bArrDecode2;
    }

    @NotNull
    public static final byte[] base64UrlSafeToByteArray(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (Build.VERSION.SDK_INT >= 26) {
            byte[] bArrDecode = Base64.getUrlDecoder().decode(str);
            Intrinsics.checkNotNullExpressionValue(bArrDecode, "{\n        Base64.getUrlD…oder().decode(this)\n    }");
            return bArrDecode;
        }
        byte[] bArrDecode2 = android.util.Base64.decode(str, 8);
        Intrinsics.checkNotNullExpressionValue(bArrDecode2, "{\n        android.util.B…il.Base64.URL_SAFE)\n    }");
        return bArrDecode2;
    }

    @NotNull
    public static final byte[] hexStringToByteArray(@NotNull String str, @NotNull HexadecimalCharacters hexadecimalCharacters) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(hexadecimalCharacters, "hexadecimalCharacters");
        byte[] bArr = new byte[str.length() / 2];
        IntProgression intProgressionStep = c.step(c.until(0, str.length()), 2);
        int first = intProgressionStep.getFirst();
        int last = intProgressionStep.getLast();
        int step = intProgressionStep.getStep();
        if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
            while (true) {
                bArr[first >> 1] = (byte) ((ArraysKt___ArraysKt.indexOf(hexadecimalCharacters.getChars(), str.charAt(first)) << 4) | ArraysKt___ArraysKt.indexOf(hexadecimalCharacters.getChars(), str.charAt(first + 1)));
                if (first == last) {
                    break;
                }
                first += step;
            }
        }
        return bArr;
    }

    public static /* synthetic */ byte[] hexStringToByteArray$default(String str, HexadecimalCharacters hexadecimalCharacters, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            hexadecimalCharacters = HexadecimalCharacters.UPPERCASE;
        }
        return hexStringToByteArray(str, hexadecimalCharacters);
    }

    @NotNull
    public static final String toBase64(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (Build.VERSION.SDK_INT >= 26) {
            String strEncodeToString = Base64.getEncoder().encodeToString(bArr);
            Intrinsics.checkNotNullExpressionValue(strEncodeToString, "{\n        Base64.getEnco…ncodeToString(this)\n    }");
            return strEncodeToString;
        }
        String strEncodeToString2 = android.util.Base64.encodeToString(bArr, 2);
        Intrinsics.checkNotNullExpressionValue(strEncodeToString2, "{\n        android.util.B…til.Base64.NO_WRAP)\n    }");
        return strEncodeToString2;
    }

    @NotNull
    public static final String toBase64UrlSafe(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (Build.VERSION.SDK_INT >= 26) {
            String strEncodeToString = Base64.getUrlEncoder().encodeToString(bArr);
            Intrinsics.checkNotNullExpressionValue(strEncodeToString, "{\n        Base64.getUrlE…ncodeToString(this)\n    }");
            return strEncodeToString;
        }
        String strEncodeToString2 = android.util.Base64.encodeToString(bArr, 8);
        Intrinsics.checkNotNullExpressionValue(strEncodeToString2, "{\n        android.util.B…il.Base64.URL_SAFE)\n    }");
        return strEncodeToString2;
    }

    @NotNull
    public static final String toHex(@NotNull byte[] bArr, @NotNull HexadecimalCharacters hexadecimalCharacters) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(hexadecimalCharacters, "hexadecimalCharacters");
        StringBuilder sb2 = new StringBuilder();
        for (byte b10 : bArr) {
            sb2.append(hexadecimalCharacters.getChars()[(b10 & Constants.CVR_B2b8765_1111_APP_DISABLED) >>> 4]);
            sb2.append(hexadecimalCharacters.getChars()[b10 & 15]);
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "result.toString()");
        return string;
    }

    public static /* synthetic */ String toHex$default(byte[] bArr, HexadecimalCharacters hexadecimalCharacters, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            hexadecimalCharacters = HexadecimalCharacters.UPPERCASE;
        }
        return toHex(bArr, hexadecimalCharacters);
    }

    @NotNull
    public static final String toSimpleString(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        StringBuilder sb2 = new StringBuilder();
        for (byte b10 : bArr) {
            sb2.append((char) b10);
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "stringBuffer.toString()");
        return string;
    }
}
