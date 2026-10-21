package com.bbva.semaas.extension;

import com.bbva.androidtoolkit.utils.StringUtils;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: String.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0001¨\u0006\u0002"}, d2 = {"sha256", "", "semaas_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 String.kt\ncom/bbva/semaas/extension/StringKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,12:1\n1#2:13\n*E\n"})
public final class StringKt {
    @NotNull
    public static final String sha256(@NotNull String str) throws NoSuchAlgorithmException {
        Intrinsics.checkNotNullParameter(str, "<this>");
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        String hexString = StringUtils.toHexString(messageDigest.digest(bytes));
        Intrinsics.checkNotNullExpressionValue(hexString, "getInstance(\"SHA-256\")\n …ngUtils.toHexString(it) }");
        return hexString;
    }
}
