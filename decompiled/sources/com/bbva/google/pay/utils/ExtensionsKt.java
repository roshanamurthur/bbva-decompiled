package com.bbva.google.pay.utils;

import android.util.Base64;
import com.bbva.tohu.android.product.valkyria.sdk.constants.ProviderType;
import java.nio.charset.Charset;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Extensions.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0001\u001a\n\u0010\u0002\u001a\u00020\u0003*\u00020\u0001\u001a\n\u0010\u0004\u001a\u00020\u0003*\u00020\u0001\u001a\n\u0010\u0005\u001a\u00020\u0003*\u00020\u0001\u001a\n\u0010\u0006\u001a\u00020\u0003*\u00020\u0001\u001a\n\u0010\u0007\u001a\u00020\u0003*\u00020\u0001\u001a\n\u0010\b\u001a\u00020\u0001*\u00020\u0001¨\u0006\t"}, d2 = {"decode", "", "isAmex", "", "isValidBrand", "isValidPan", "isValidPanTruncated", "isVisaOrMc", "lastFourDigits", "google-pay_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ExtensionsKt {
    @NotNull
    public static final String decode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        byte[] bArrDecode = Base64.decode(str, 0);
        Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(this, Base64.DEFAULT)");
        Charset charsetForName = Charset.forName("UTF-8");
        Intrinsics.checkNotNullExpressionValue(charsetForName, "forName(charsetName)");
        return new String(bArrDecode, charsetForName);
    }

    public static final boolean isAmex(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return str.length() == 15;
    }

    public static final boolean isValidBrand(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (str.length() > 0) {
            Locale locale = Locale.ROOT;
            String upperCase = str.toUpperCase(locale);
            Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            if (Intrinsics.areEqual(upperCase, ProviderType.PROVIDER_ID_VISA)) {
                String upperCase2 = str.toUpperCase(locale);
                Intrinsics.checkNotNullExpressionValue(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                if (Intrinsics.areEqual(upperCase2, "MASTER_CARD")) {
                    String upperCase3 = str.toUpperCase(locale);
                    Intrinsics.checkNotNullExpressionValue(upperCase3, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                    if (Intrinsics.areEqual(upperCase3, "AMERICAN_EXPRESS")) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final boolean isValidPan(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return isVisaOrMc(str) || isAmex(str);
    }

    public static final boolean isValidPanTruncated(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return str.length() > 0 && str.length() == 4;
    }

    public static final boolean isVisaOrMc(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return str.length() == 16;
    }

    @NotNull
    public static final String lastFourDigits(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String strSubstring = str.substring(str.length() - 4);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
        return strSubstring;
    }
}
