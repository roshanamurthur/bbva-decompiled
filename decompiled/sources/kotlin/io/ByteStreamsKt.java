package kotlin.io;

import com.mastercard.sonic.androidsvg.SvgConstantsKt;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.NoSuchElementException;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.SinceKotlin;
import kotlin.collections.ByteIterator;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: IOStreams.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\u001a\r\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0086\u0002\u001a\u001c\u0010\t\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u001a\u0016\u0010\f\u001a\u00020\u000b*\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0006H\u0007\u001a\f\u0010\f\u001a\u00020\u000b*\u00020\u0003H\u0007¨\u0006\r"}, d2 = {"Ljava/io/BufferedInputStream;", "Lkotlin/collections/ByteIterator;", "iterator", "Ljava/io/InputStream;", "Ljava/io/OutputStream;", "out", "", "bufferSize", "", "copyTo", "estimatedSize", "", "readBytes", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0})
@JvmName(name = "ByteStreamsKt")
public final class ByteStreamsKt {
    public static final long copyTo(@NotNull InputStream inputStream, @NotNull OutputStream out, int i10) throws IOException {
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        Intrinsics.checkNotNullParameter(out, "out");
        byte[] bArr = new byte[i10];
        int i11 = inputStream.read(bArr);
        long j10 = 0;
        while (i11 >= 0) {
            out.write(bArr, 0, i11);
            j10 += (long) i11;
            i11 = inputStream.read(bArr);
        }
        return j10;
    }

    public static /* synthetic */ long copyTo$default(InputStream inputStream, OutputStream outputStream, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 8192;
        }
        return copyTo(inputStream, outputStream, i10);
    }

    @NotNull
    public static final ByteIterator iterator(@NotNull final BufferedInputStream bufferedInputStream) {
        Intrinsics.checkNotNullParameter(bufferedInputStream, "<this>");
        return new ByteIterator() { // from class: kotlin.io.ByteStreamsKt.iterator.1

            /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
            public int nextByte = -1;

            /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
            public boolean nextPrepared;

            /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
            public boolean finished;

            public final void a() throws IOException {
                if (this.nextPrepared || this.finished) {
                    return;
                }
                int i10 = bufferedInputStream.read();
                this.nextByte = i10;
                this.nextPrepared = true;
                this.finished = i10 == -1;
            }

            public final boolean getFinished() {
                return this.finished;
            }

            public final int getNextByte() {
                return this.nextByte;
            }

            public final boolean getNextPrepared() {
                return this.nextPrepared;
            }

            @Override // java.util.Iterator
            public boolean hasNext() throws IOException {
                a();
                return !this.finished;
            }

            @Override // kotlin.collections.ByteIterator
            public byte nextByte() throws IOException {
                a();
                if (this.finished) {
                    throw new NoSuchElementException("Input stream is over.");
                }
                byte b10 = (byte) this.nextByte;
                this.nextPrepared = false;
                return b10;
            }

            public final void setFinished(boolean z10) {
                this.finished = z10;
            }

            public final void setNextByte(int i10) {
                this.nextByte = i10;
            }

            public final void setNextPrepared(boolean z10) {
                this.nextPrepared = z10;
            }
        };
    }

    @Deprecated(message = "Use readBytes() overload without estimatedSize parameter", replaceWith = @ReplaceWith(expression = "readBytes()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = SvgConstantsKt.VERSION, warningSince = "1.3")
    @NotNull
    public static final byte[] readBytes(@NotNull InputStream inputStream, int i10) {
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(i10, inputStream.available()));
        copyTo$default(inputStream, byteArrayOutputStream, 0, 2, null);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
        return byteArray;
    }

    public static /* synthetic */ byte[] readBytes$default(InputStream inputStream, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 8192;
        }
        return readBytes(inputStream, i10);
    }

    @SinceKotlin(version = "1.3")
    @NotNull
    public static final byte[] readBytes(@NotNull InputStream inputStream) {
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        copyTo$default(inputStream, byteArrayOutputStream, 0, 2, null);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
        return byteArray;
    }
}
