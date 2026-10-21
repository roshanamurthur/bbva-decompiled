package com.bbva.ethermobilesdk.tokencompat.extension;

import com.bbva.ethermobilesdk.cipher.utils.EncodingUtilsKt;
import com.bbva.notifications.constants.PushConstants;
import java.util.zip.CRC32;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.CharsKt;
import kotlin.text.Charsets;
import kotlin.text.l;
import mx.openpay.library.domain.util.Constant;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: String.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u0000\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0001H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0001*\u00020\u0001H\u0000\u001a\f\u0010\u0004\u001a\u00020\u0001*\u00020\u0001H\u0000¨\u0006\u0005"}, d2 = {"base64toBase64Url", "", "crc32", "unwrapped", "wrapped", "ethertoken-compat_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 String.kt\ncom/bbva/ethermobilesdk/tokencompat/extension/StringKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,22:1\n1#2:23\n*E\n"})
public final class StringKt {
    @NotNull
    public static final String base64toBase64Url(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return l.replace$default(l.replace$default(l.replace$default(str, "+", Constant.DASH_STRING, false, 4, (Object) null), "/", PushConstants.GE_PARAMS_SEPARATOR, false, 4, (Object) null), "=", "", false, 4, (Object) null);
    }

    @NotNull
    public static final String crc32(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        CRC32 crc32 = new CRC32();
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        crc32.update(bytes);
        String string = Long.toString(crc32.getValue(), CharsKt.checkRadix(16));
        Intrinsics.checkNotNullExpressionValue(string, "toString(this, checkRadix(radix))");
        return string;
    }

    @NotNull
    public static final String unwrapped(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return EncodingUtilsKt.toSimpleString(EncodingUtilsKt.hexStringToByteArray$default(str, null, 1, null));
    }

    @NotNull
    public static final String wrapped(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        return EncodingUtilsKt.toHex$default(bytes, null, 1, null);
    }
}
