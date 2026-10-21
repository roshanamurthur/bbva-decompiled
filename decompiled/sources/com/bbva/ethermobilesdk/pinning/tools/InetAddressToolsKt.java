package com.bbva.ethermobilesdk.pinning.tools;

import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: InetAddressTools.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0003H\u0000\u001a\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0003H\u0000\u001a\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0003H\u0000\u001a\u0010\u0010\u0011\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0003H\u0002\u001a\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0003H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0016\u0010\b\u001a\n \t*\u0004\u0018\u00010\u00050\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"COLON_CHAR", "", "IPV4_BASIC_PATTERN_STRING", "", "IPV4_MAPPED_IPV6_PATTERN", "Ljava/util/regex/Pattern;", "IPV4_PATTERN", "IPV6_HEX_COMPRESSED_PATTERN", "IPV6_STD_PATTERN", "kotlin.jvm.PlatformType", "MAX_COLON_COUNT", "", "isIPv4Address", "", "input", "isIPv4MappedIPv6Address", "isIPv6Address", "isIPv6HexCompressedAddress", "isIPv6StdAddress", "pinning_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nInetAddressTools.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InetAddressTools.kt\ncom/bbva/ethermobilesdk/pinning/tools/InetAddressToolsKt\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,57:1\n1099#2,3:58\n*S KotlinDebug\n*F\n+ 1 InetAddressTools.kt\ncom/bbva/ethermobilesdk/pinning/tools/InetAddressToolsKt\n*L\n54#1:58,3\n*E\n"})
public final class InetAddressToolsKt {
    private static final char COLON_CHAR = ':';

    @NotNull
    private static final String IPV4_BASIC_PATTERN_STRING = "(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])";

    @NotNull
    private static final Pattern IPV4_MAPPED_IPV6_PATTERN;

    @NotNull
    private static final Pattern IPV4_PATTERN;

    @NotNull
    private static final Pattern IPV6_HEX_COMPRESSED_PATTERN;
    private static final Pattern IPV6_STD_PATTERN;
    private static final int MAX_COLON_COUNT = 7;

    static {
        Pattern patternCompile = Pattern.compile("^(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$");
        Intrinsics.checkNotNullExpressionValue(patternCompile, "compile(\"^$IPV4_BASIC_PATTERN_STRING$\")");
        IPV4_PATTERN = patternCompile;
        Pattern patternCompile2 = Pattern.compile("^::[fF]{4}:(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$");
        Intrinsics.checkNotNullExpressionValue(patternCompile2, "compile(\"^::[fF]{4}:$IPV4_BASIC_PATTERN_STRING$\")");
        IPV4_MAPPED_IPV6_PATTERN = patternCompile2;
        IPV6_STD_PATTERN = Pattern.compile("^[0-9a-fA-F]{1,4}(:[0-9a-fA-F]{1,4}){7}$");
        Pattern patternCompile3 = Pattern.compile("^(([0-9A-Fa-f]{1,4}(:[0-9A-Fa-f]{1,4}){0,5})?)::(([0-9A-Fa-f]{1,4}(:[0-9A-Fa-f]{1,4}){0,5})?)$");
        Intrinsics.checkNotNullExpressionValue(patternCompile3, "compile(\n    \"^(([0-9A-F…A-Fa-f]{1,4}){0,5})?)$\"\n)");
        IPV6_HEX_COMPRESSED_PATTERN = patternCompile3;
    }

    public static final boolean isIPv4Address(@NotNull String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        return IPV4_PATTERN.matcher(input).matches();
    }

    public static final boolean isIPv4MappedIPv6Address(@NotNull String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        return IPV4_MAPPED_IPV6_PATTERN.matcher(input).matches();
    }

    public static final boolean isIPv6Address(@NotNull String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        return isIPv6StdAddress(input) || isIPv6HexCompressedAddress(input);
    }

    private static final boolean isIPv6HexCompressedAddress(String str) {
        int i10 = 0;
        for (int i11 = 0; i11 < str.length(); i11++) {
            if (str.charAt(i11) == ':') {
                i10++;
            }
        }
        return i10 <= 7 && IPV6_HEX_COMPRESSED_PATTERN.matcher(str).matches();
    }

    private static final boolean isIPv6StdAddress(String str) {
        return IPV6_STD_PATTERN.matcher(str).matches();
    }
}
