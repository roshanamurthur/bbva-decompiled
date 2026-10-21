package jk;

import java.io.InputStream;
import java.io.OutputStream;
import kotlin.SinceKotlin;
import kotlin.io.encoding.Base64;
import kotlin.io.encoding.ExperimentalEncodingApi;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Base64IOStream.kt */
/* JADX INFO: loaded from: classes12.dex */
public class b {
    @ExperimentalEncodingApi
    @SinceKotlin(version = "1.8")
    @NotNull
    public static final InputStream decodingWith(@NotNull InputStream inputStream, @NotNull Base64 base64) {
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        Intrinsics.checkNotNullParameter(base64, "base64");
        return new a(inputStream, base64);
    }

    @ExperimentalEncodingApi
    @SinceKotlin(version = "1.8")
    @NotNull
    public static final OutputStream encodingWith(@NotNull OutputStream outputStream, @NotNull Base64 base64) {
        Intrinsics.checkNotNullParameter(outputStream, "<this>");
        Intrinsics.checkNotNullParameter(base64, "base64");
        return new kotlin.io.encoding.a(outputStream, base64);
    }
}
