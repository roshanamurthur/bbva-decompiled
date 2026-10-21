package okio;

import dm.a;
import dm.b;
import dm.c;
import dm.d;
import dm.e;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.file.OpenOption;
import java.security.MessageDigest;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import okio.internal.ResourceFileSystem;
import okio.internal.ZipFilesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"dm/c"}, d2 = {}, k = 4, mv = {1, 9, 0})
public final class Okio {
    @NotNull
    public static final Sink appendingSink(@NotNull File file) throws FileNotFoundException {
        Logger logger = c.f68204a;
        Intrinsics.checkNotNullParameter(file, "<this>");
        return sink(new FileOutputStream(file, true));
    }

    @NotNull
    public static final FileSystem asResourceFileSystem(@NotNull ClassLoader classLoader) {
        Logger logger = c.f68204a;
        Intrinsics.checkNotNullParameter(classLoader, "<this>");
        return new ResourceFileSystem(classLoader, true, null, 4, null);
    }

    @JvmName(name = "blackhole")
    @NotNull
    public static final Sink blackhole() {
        return new a();
    }

    @NotNull
    public static final BufferedSink buffer(@NotNull Sink sink) {
        Intrinsics.checkNotNullParameter(sink, "<this>");
        return new RealBufferedSink(sink);
    }

    @NotNull
    public static final CipherSink cipherSink(@NotNull Sink sink, @NotNull Cipher cipher) {
        Logger logger = c.f68204a;
        Intrinsics.checkNotNullParameter(sink, "<this>");
        Intrinsics.checkNotNullParameter(cipher, "cipher");
        return new CipherSink(buffer(sink), cipher);
    }

    @NotNull
    public static final CipherSource cipherSource(@NotNull Source source, @NotNull Cipher cipher) {
        Logger logger = c.f68204a;
        Intrinsics.checkNotNullParameter(source, "<this>");
        Intrinsics.checkNotNullParameter(cipher, "cipher");
        return new CipherSource(buffer(source), cipher);
    }

    @NotNull
    public static final HashingSink hashingSink(@NotNull Sink sink, @NotNull MessageDigest digest) {
        Logger logger = c.f68204a;
        Intrinsics.checkNotNullParameter(sink, "<this>");
        Intrinsics.checkNotNullParameter(digest, "digest");
        return new HashingSink(sink, digest);
    }

    @NotNull
    public static final HashingSource hashingSource(@NotNull Source source, @NotNull MessageDigest digest) {
        Logger logger = c.f68204a;
        Intrinsics.checkNotNullParameter(source, "<this>");
        Intrinsics.checkNotNullParameter(digest, "digest");
        return new HashingSource(source, digest);
    }

    public static final boolean isAndroidGetsocknameError(@NotNull AssertionError assertionError) {
        String message;
        Logger logger = c.f68204a;
        Intrinsics.checkNotNullParameter(assertionError, "<this>");
        return (assertionError.getCause() == null || (message = assertionError.getMessage()) == null || !StringsKt__StringsKt.contains$default((CharSequence) message, (CharSequence) "getsockname failed", false, 2, (Object) null)) ? false : true;
    }

    @NotNull
    public static final FileSystem openZip(@NotNull FileSystem fileSystem, @NotNull Path zipPath) throws IOException {
        Logger logger = c.f68204a;
        Intrinsics.checkNotNullParameter(fileSystem, "<this>");
        Intrinsics.checkNotNullParameter(zipPath, "zipPath");
        return ZipFilesKt.openZip$default(zipPath, fileSystem, null, 4, null);
    }

    @JvmOverloads
    @NotNull
    public static final Sink sink(@NotNull File file) throws FileNotFoundException {
        Logger logger = c.f68204a;
        Intrinsics.checkNotNullParameter(file, "<this>");
        return sink$default(file, false, 1, null);
    }

    public static /* synthetic */ Sink sink$default(File file, boolean z10, int i10, Object obj) throws FileNotFoundException {
        Logger logger = c.f68204a;
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return sink(file, z10);
    }

    @NotNull
    public static final Source source(@NotNull File file) throws FileNotFoundException {
        Logger logger = c.f68204a;
        Intrinsics.checkNotNullParameter(file, "<this>");
        return new b(new FileInputStream(file), Timeout.NONE);
    }

    public static final <T extends Closeable, R> R use(T t10, @NotNull Function1<? super T, ? extends R> block) throws Throwable {
        R rInvoke;
        Intrinsics.checkNotNullParameter(block, "block");
        Throwable th2 = null;
        try {
            rInvoke = block.invoke(t10);
            InlineMarker.finallyStart(1);
            if (t10 != null) {
                try {
                    t10.close();
                } catch (Throwable th3) {
                    th2 = th3;
                }
            }
            InlineMarker.finallyEnd(1);
        } catch (Throwable th4) {
            InlineMarker.finallyStart(1);
            if (t10 != null) {
                try {
                    t10.close();
                } catch (Throwable th5) {
                    ak.b.addSuppressed(th4, th5);
                }
            }
            InlineMarker.finallyEnd(1);
            th2 = th4;
            rInvoke = null;
        }
        if (th2 != null) {
            throw th2;
        }
        Intrinsics.checkNotNull(rInvoke);
        return rInvoke;
    }

    @NotNull
    public static final BufferedSource buffer(@NotNull Source source) {
        Intrinsics.checkNotNullParameter(source, "<this>");
        return new RealBufferedSource(source);
    }

    @JvmOverloads
    @NotNull
    public static final Sink sink(@NotNull File file, boolean z10) throws FileNotFoundException {
        Logger logger = c.f68204a;
        Intrinsics.checkNotNullParameter(file, "<this>");
        return sink(new FileOutputStream(file, z10));
    }

    @NotNull
    public static final HashingSink hashingSink(@NotNull Sink sink, @NotNull Mac mac) {
        Logger logger = c.f68204a;
        Intrinsics.checkNotNullParameter(sink, "<this>");
        Intrinsics.checkNotNullParameter(mac, "mac");
        return new HashingSink(sink, mac);
    }

    @NotNull
    public static final HashingSource hashingSource(@NotNull Source source, @NotNull Mac mac) {
        Logger logger = c.f68204a;
        Intrinsics.checkNotNullParameter(source, "<this>");
        Intrinsics.checkNotNullParameter(mac, "mac");
        return new HashingSource(source, mac);
    }

    @NotNull
    public static final Source source(@NotNull InputStream inputStream) {
        Logger logger = c.f68204a;
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        return new b(inputStream, new Timeout());
    }

    @NotNull
    public static final Sink sink(@NotNull OutputStream outputStream) {
        Logger logger = c.f68204a;
        Intrinsics.checkNotNullParameter(outputStream, "<this>");
        return new d(outputStream, new Timeout());
    }

    @NotNull
    public static final Source source(@NotNull Socket socket) throws IOException {
        Logger logger = c.f68204a;
        Intrinsics.checkNotNullParameter(socket, "<this>");
        e eVar = new e(socket);
        InputStream inputStream = socket.getInputStream();
        Intrinsics.checkNotNullExpressionValue(inputStream, "getInputStream(...)");
        return eVar.source(new b(inputStream, eVar));
    }

    @NotNull
    public static final Sink sink(@NotNull Socket socket) throws IOException {
        Logger logger = c.f68204a;
        Intrinsics.checkNotNullParameter(socket, "<this>");
        e eVar = new e(socket);
        OutputStream outputStream = socket.getOutputStream();
        Intrinsics.checkNotNullExpressionValue(outputStream, "getOutputStream(...)");
        return eVar.sink(new d(outputStream, eVar));
    }

    @NotNull
    public static final Source source(@NotNull java.nio.file.Path path, @NotNull OpenOption... openOptionArr) throws IOException {
        return c.b(path, openOptionArr);
    }

    @NotNull
    public static final Sink sink(@NotNull java.nio.file.Path path, @NotNull OpenOption... openOptionArr) throws IOException {
        return c.a(path, openOptionArr);
    }
}
