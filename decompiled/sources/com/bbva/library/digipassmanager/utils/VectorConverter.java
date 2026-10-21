package com.bbva.library.digipassmanager.utils;

import java.io.UnsupportedEncodingException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: VectorConverter.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\b"}, d2 = {"Lcom/bbva/library/digipassmanager/utils/VectorConverter;", "", "()V", "byteArrayToString", "", "value", "", "stringToByteArray", "digipassmanager-library_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class VectorConverter {

    @NotNull
    public static final VectorConverter INSTANCE = new VectorConverter();

    @NotNull
    public final String byteArrayToString(@NotNull byte[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
        try {
            return new String(value, Charsets.ISO_8859_1);
        } catch (UnsupportedEncodingException unused) {
            return "";
        }
    }

    @NotNull
    public final byte[] stringToByteArray(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        try {
            byte[] bytes = value.getBytes(Charsets.ISO_8859_1);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            return bytes;
        } catch (UnsupportedEncodingException unused) {
            return new byte[0];
        } catch (NullPointerException unused2) {
            return new byte[0];
        }
    }
}
