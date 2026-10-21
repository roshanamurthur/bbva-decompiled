package com.bbva.ethermobilesdk.deviceinfo.utils.extension;

import androidx.room.a;
import com.bbva.ethermobilesdk.deviceinfo.utils.InetAddressToolsKt;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: String.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0002*\u00020\u0002H\u0000¨\u0006\u0004"}, d2 = {"isAnIPAddress", "", "", "normaliseIPV6Address", "deviceinfo_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class StringKt {
    public static final boolean isAnIPAddress(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return InetAddressToolsKt.isIPv4Address(str) || InetAddressToolsKt.isIPv6Address(str);
    }

    @NotNull
    public static final String normaliseIPV6Address(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String string = StringsKt__StringsKt.trim((CharSequence) str).toString();
        Locale locale = Locale.US;
        String strD = a.d(locale, "US", string, locale, "this as java.lang.String).toLowerCase(locale)");
        if (InetAddressToolsKt.isIPv6Address(str)) {
            try {
                strD = InetAddress.getByName(strD).getHostAddress();
            } catch (UnknownHostException unused) {
            }
            Intrinsics.checkNotNullExpressionValue(strD, "{\n        try {\n        …  trimmed\n        }\n    }");
        }
        return strD;
    }
}
