package com.bbva.ethermobilesdk.deviceinfo.utils;

import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: InetAddressTools.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u001a\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u001a\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¨\u0006\u0006"}, d2 = {"", "input", "", "isIPv4Address", "isIPv4MappedIPv6Address", "isIPv6Address", "deviceinfo_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nInetAddressTools.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InetAddressTools.kt\ncom/bbva/ethermobilesdk/deviceinfo/utils/InetAddressToolsKt\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,56:1\n1099#2,3:57\n*S KotlinDebug\n*F\n+ 1 InetAddressTools.kt\ncom/bbva/ethermobilesdk/deviceinfo/utils/InetAddressToolsKt\n*L\n53#1:57,3\n*E\n"})
public final class InetAddressToolsKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Pattern f29603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final Pattern f29604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f29605c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final Pattern f29606d;

    static {
        Pattern patternCompile = Pattern.compile("^(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$");
        Intrinsics.checkNotNullExpressionValue(patternCompile, "compile(\"^$IPV4_BASIC_PATTERN_STRING$\")");
        f29603a = patternCompile;
        Pattern patternCompile2 = Pattern.compile("^::[fF]{4}:(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$");
        Intrinsics.checkNotNullExpressionValue(patternCompile2, "compile(\"^::[fF]{4}:$IPV4_BASIC_PATTERN_STRING$\")");
        f29604b = patternCompile2;
        f29605c = Pattern.compile("^[0-9a-fA-F]{1,4}(:[0-9a-fA-F]{1,4}){7}$");
        Pattern patternCompile3 = Pattern.compile("^(([0-9A-Fa-f]{1,4}(:[0-9A-Fa-f]{1,4}){0,5})?)::(([0-9A-Fa-f]{1,4}(:[0-9A-Fa-f]{1,4}){0,5})?)$");
        Intrinsics.checkNotNullExpressionValue(patternCompile3, "compile(\n        \"^(([0-…f]{1,4}){0,5})?)$\",\n    )");
        f29606d = patternCompile3;
    }

    public static final boolean isIPv4Address(@NotNull String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        return f29603a.matcher(input).matches();
    }

    public static final boolean isIPv4MappedIPv6Address(@NotNull String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        return f29604b.matcher(input).matches();
    }

    public static final boolean isIPv6Address(@NotNull String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        if (!f29605c.matcher(input).matches()) {
            int i10 = 0;
            for (int i11 = 0; i11 < input.length(); i11++) {
                if (input.charAt(i11) == ':') {
                    i10++;
                }
            }
            if (i10 > 7 || !f29606d.matcher(input).matches()) {
                return false;
            }
        }
        return true;
    }
}
