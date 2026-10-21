package com.bbva.io.file;

import android.util.Base64;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.io.ByteStreamsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Source.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a\u0018\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0000\u001a\u0018\u0010\t\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0000¨\u0006\f"}, d2 = {"writeByteArray", "", "file", "Ljava/io/File;", "byteArray", "", "writeSource", "source", "Lcom/bbva/io/file/Source;", "writeStream", "stream", "Ljava/io/InputStream;", "io_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class SourceKt {
    public static final void writeByteArray(@NotNull File file, @NotNull byte[] byteArray) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(byteArray, "byteArray");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            fileOutputStream.write(byteArray);
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(fileOutputStream, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                CloseableKt.closeFinally(fileOutputStream, th2);
                throw th3;
            }
        }
    }

    public static final void writeSource(@NotNull File file, @NotNull Source source) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(source, "source");
        if (source instanceof Source.InputStreamSource) {
            writeStream(file, ((Source.InputStreamSource) source).getValue());
            return;
        }
        if (source instanceof Source.Base64Source) {
            byte[] bArrDecode = Base64.decode(((Source.Base64Source) source).getValue(), 0);
            Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(source.value, Base64.DEFAULT)");
            writeByteArray(file, bArrDecode);
        } else if (source instanceof Source.ByteArraySource) {
            writeByteArray(file, ((Source.ByteArraySource) source).getValue());
        } else {
            if (!(source instanceof Source.StringSource)) {
                throw new NoWhenBranchMatchedException();
            }
            byte[] bytes = ((Source.StringSource) source).getValue().getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            writeByteArray(file, bytes);
        }
    }

    public static final void writeStream(@NotNull File file, @NotNull InputStream stream) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(stream, "stream");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                ByteStreamsKt.copyTo$default(stream, fileOutputStream, 0, 2, null);
                CloseableKt.closeFinally(fileOutputStream, null);
                CloseableKt.closeFinally(stream, null);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    CloseableKt.closeFinally(fileOutputStream, th2);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                CloseableKt.closeFinally(stream, th4);
                throw th5;
            }
        }
    }
}
