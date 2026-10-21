package kotlin.io;

import java.io.InputStream;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Console.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\b\u0010\u0001\u001a\u00020\u0000H\u0007\u001a\n\u0010\u0002\u001a\u0004\u0018\u00010\u0000H\u0007\u001a\b\u0010\u0003\u001a\u0004\u0018\u00010\u0000¨\u0006\u0004"}, d2 = {"", "readln", "readlnOrNull", "readLine", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0})
@JvmName(name = "ConsoleKt")
public final class ConsoleKt {
    @Nullable
    public static final String readLine() {
        LineReader lineReader = LineReader.INSTANCE;
        InputStream in2 = System.in;
        Intrinsics.checkNotNullExpressionValue(in2, "in");
        Charset charsetDefaultCharset = Charset.defaultCharset();
        Intrinsics.checkNotNullExpressionValue(charsetDefaultCharset, "defaultCharset(...)");
        return lineReader.readLine(in2, charsetDefaultCharset);
    }

    @SinceKotlin(version = "1.6")
    @NotNull
    public static final String readln() {
        String str = readlnOrNull();
        if (str != null) {
            return str;
        }
        throw new ReadAfterEOFException("EOF has already been reached");
    }

    @SinceKotlin(version = "1.6")
    @Nullable
    public static final String readlnOrNull() {
        return readLine();
    }
}
