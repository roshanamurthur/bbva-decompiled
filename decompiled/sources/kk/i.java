package kk;

import com.mastercard.sonic.androidsvg.SvgConstantsKt;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.io.CloseableKt;
import kotlin.io.TextStreamsKt;
import kotlin.io.path.ExperimentalPathApi;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PathReadWrite.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nPathReadWrite.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathReadWrite.kt\nkotlin/io/path/PathsKt__PathReadWriteKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ReadWrite.kt\nkotlin/io/TextStreamsKt\n+ 4 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,326:1\n1#2:327\n1#2:329\n52#3:328\n1313#4,2:330\n*S KotlinDebug\n*F\n+ 1 PathReadWrite.kt\nkotlin/io/path/PathsKt__PathReadWriteKt\n*L\n202#1:329\n202#1:328\n202#1:330,2\n*E\n"})
public class i {
    @SinceKotlin(version = SvgConstantsKt.VERSION)
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    public static final void appendText(@NotNull Path path, @NotNull CharSequence text, @NotNull Charset charset) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(charset, "charset");
        OutputStream outputStreamNewOutputStream = Files.newOutputStream(path, StandardOpenOption.APPEND);
        Intrinsics.checkNotNullExpressionValue(outputStreamNewOutputStream, "newOutputStream(...)");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStreamNewOutputStream, charset);
        try {
            outputStreamWriter.append(text);
            CloseableKt.closeFinally(outputStreamWriter, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                CloseableKt.closeFinally(outputStreamWriter, th2);
                throw th3;
            }
        }
    }

    public static /* synthetic */ void appendText$default(Path path, CharSequence charSequence, Charset charset, int i10, Object obj) throws IOException {
        if ((i10 & 2) != 0) {
            charset = Charsets.UTF_8;
        }
        appendText(path, charSequence, charset);
    }

    @SinceKotlin(version = SvgConstantsKt.VERSION)
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    @NotNull
    public static final String readText(@NotNull Path path, @NotNull Charset charset) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        InputStreamReader inputStreamReader = new InputStreamReader(Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(new OpenOption[0], 0)), charset);
        try {
            String text = TextStreamsKt.readText(inputStreamReader);
            CloseableKt.closeFinally(inputStreamReader, null);
            return text;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                CloseableKt.closeFinally(inputStreamReader, th2);
                throw th3;
            }
        }
    }

    public static /* synthetic */ String readText$default(Path path, Charset charset, int i10, Object obj) throws IOException {
        if ((i10 & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        return readText(path, charset);
    }

    @SinceKotlin(version = SvgConstantsKt.VERSION)
    @WasExperimental(markerClass = {ExperimentalPathApi.class})
    public static final void writeText(@NotNull Path path, @NotNull CharSequence text, @NotNull Charset charset, @NotNull OpenOption... options) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(charset, "charset");
        Intrinsics.checkNotNullParameter(options, "options");
        OutputStream outputStreamNewOutputStream = Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(options, options.length));
        Intrinsics.checkNotNullExpressionValue(outputStreamNewOutputStream, "newOutputStream(...)");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStreamNewOutputStream, charset);
        try {
            outputStreamWriter.append(text);
            CloseableKt.closeFinally(outputStreamWriter, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                CloseableKt.closeFinally(outputStreamWriter, th2);
                throw th3;
            }
        }
    }

    public static /* synthetic */ void writeText$default(Path path, CharSequence charSequence, Charset charset, OpenOption[] openOptionArr, int i10, Object obj) throws IOException {
        if ((i10 & 2) != 0) {
            charset = Charsets.UTF_8;
        }
        writeText(path, charSequence, charset, openOptionArr);
    }
}
