package okio.internal;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.tokencompat.storage.local.SharedPrefsStorage;
import com.mastercard.sonic.androidsvg.SvgConstantsKt;
import java.io.EOFException;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.Buffer;
import okio.BufferedSink;
import okio.ByteString;
import okio.Sink;
import okio.Source;
import okio.Timeout;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: okio.internal.-RealBufferedSink, reason: invalid class name */
/* JADX INFO: compiled from: RealBufferedSink.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0080\b\u001a\r\u0010\u0003\u001a\u00020\u0004*\u00020\u0002H\u0080\b\u001a\r\u0010\u0005\u001a\u00020\u0004*\u00020\u0002H\u0080\b\u001a\r\u0010\u0006\u001a\u00020\u0001*\u00020\u0002H\u0080\b\u001a\r\u0010\u0007\u001a\u00020\b*\u00020\u0002H\u0080\b\u001a\r\u0010\t\u001a\u00020\n*\u00020\u0002H\u0080\b\u001a\u0015\u0010\u000b\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\f\u001a\u00020\rH\u0080\b\u001a%\u0010\u000b\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0080\b\u001a\u001d\u0010\u000b\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\f\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0012H\u0080\b\u001a\u0015\u0010\u000b\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0014H\u0080\b\u001a%\u0010\u000b\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0080\b\u001a\u001d\u0010\u000b\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\f\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u0012H\u0080\b\u001a\u0015\u0010\u0016\u001a\u00020\u0012*\u00020\u00022\u0006\u0010\f\u001a\u00020\u0015H\u0080\b\u001a\u0015\u0010\u0017\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u000fH\u0080\b\u001a\u0015\u0010\u0019\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0012H\u0080\b\u001a\u0015\u0010\u001b\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0012H\u0080\b\u001a\u0015\u0010\u001c\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u000fH\u0080\b\u001a\u0015\u0010\u001e\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u000fH\u0080\b\u001a\u0015\u0010\u001f\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0012H\u0080\b\u001a\u0015\u0010 \u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0012H\u0080\b\u001a\u0015\u0010!\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\"\u001a\u00020\u000fH\u0080\b\u001a\u0015\u0010#\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\"\u001a\u00020\u000fH\u0080\b\u001a\u0015\u0010$\u001a\u00020\u0004*\u00020\u00022\u0006\u0010%\u001a\u00020\nH\u0080\b\u001a%\u0010$\u001a\u00020\u0004*\u00020\u00022\u0006\u0010%\u001a\u00020\n2\u0006\u0010&\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020\u000fH\u0080\b\u001a\u0015\u0010(\u001a\u00020\u0004*\u00020\u00022\u0006\u0010)\u001a\u00020\u000fH\u0080\b¨\u0006*"}, d2 = {"commonClose", "", "Lokio/RealBufferedSink;", "commonEmit", "Lokio/BufferedSink;", "commonEmitCompleteSegments", "commonFlush", "commonTimeout", "Lokio/Timeout;", "commonToString", "", "commonWrite", "source", "", TypedValues.CycleType.S_WAVE_OFFSET, "", "byteCount", "Lokio/Buffer;", "", "byteString", "Lokio/ByteString;", "Lokio/Source;", "commonWriteAll", "commonWriteByte", "b", "commonWriteDecimalLong", SharedPrefsStorage.VERSION_KEY, "commonWriteHexadecimalUnsignedLong", "commonWriteInt", "i", "commonWriteIntLe", "commonWriteLong", "commonWriteLongLe", "commonWriteShort", "s", "commonWriteShortLe", "commonWriteUtf8", "string", "beginIndex", "endIndex", "commonWriteUtf8CodePoint", "codePoint", "okio"}, k = 2, mv = {1, 9, 0}, xi = 48)
@JvmName(name = "-RealBufferedSink")
@SourceDebugExtension({"SMAP\nRealBufferedSink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealBufferedSink.kt\nokio/internal/-RealBufferedSink\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 RealBufferedSink.kt\nokio/RealBufferedSink\n*L\n1#1,219:1\n1#2:220\n51#3:221\n51#3:222\n51#3:223\n51#3:224\n51#3:225\n51#3:226\n51#3:227\n51#3:228\n51#3:229\n51#3:230\n51#3:231\n51#3:232\n51#3:233\n51#3:234\n51#3:235\n51#3:236\n51#3:237\n51#3:238\n51#3:239\n51#3:240\n51#3:241\n51#3:242\n51#3:243\n51#3:244\n51#3:245\n51#3:246\n51#3:247\n*S KotlinDebug\n*F\n+ 1 RealBufferedSink.kt\nokio/internal/-RealBufferedSink\n*L\n35#1:221\n41#1:222\n51#1:223\n57#1:224\n67#1:225\n73#1:226\n79#1:227\n89#1:228\n96#1:229\n107#1:230\n117#1:231\n123#1:232\n129#1:233\n135#1:234\n141#1:235\n147#1:236\n153#1:237\n159#1:238\n165#1:239\n171#1:240\n172#1:241\n178#1:242\n179#1:243\n185#1:244\n186#1:245\n198#1:246\n199#1:247\n*E\n"})
public final class RealBufferedSink {
    public static final void commonClose(@NotNull okio.RealBufferedSink realBufferedSink) throws Throwable {
        Intrinsics.checkNotNullParameter(realBufferedSink, "<this>");
        if (realBufferedSink.closed) {
            return;
        }
        if (realBufferedSink.bufferField.size() > 0) {
            Sink sink = realBufferedSink.sink;
            Buffer buffer = realBufferedSink.bufferField;
            sink.write(buffer, buffer.size());
        }
        th = null;
        try {
            realBufferedSink.sink.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        realBufferedSink.closed = true;
        if (th != null) {
            throw th;
        }
    }

    @NotNull
    public static final BufferedSink commonEmit(@NotNull okio.RealBufferedSink realBufferedSink) throws IOException {
        Intrinsics.checkNotNullParameter(realBufferedSink, "<this>");
        if (!(!realBufferedSink.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        long size = realBufferedSink.bufferField.size();
        if (size > 0) {
            realBufferedSink.sink.write(realBufferedSink.bufferField, size);
        }
        return realBufferedSink;
    }

    @NotNull
    public static final BufferedSink commonEmitCompleteSegments(@NotNull okio.RealBufferedSink realBufferedSink) throws IOException {
        Intrinsics.checkNotNullParameter(realBufferedSink, "<this>");
        if (!(!realBufferedSink.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        long jCompleteSegmentByteCount = realBufferedSink.bufferField.completeSegmentByteCount();
        if (jCompleteSegmentByteCount > 0) {
            realBufferedSink.sink.write(realBufferedSink.bufferField, jCompleteSegmentByteCount);
        }
        return realBufferedSink;
    }

    public static final void commonFlush(@NotNull okio.RealBufferedSink realBufferedSink) throws IOException {
        Intrinsics.checkNotNullParameter(realBufferedSink, "<this>");
        if (!(!realBufferedSink.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        if (realBufferedSink.bufferField.size() > 0) {
            Sink sink = realBufferedSink.sink;
            Buffer buffer = realBufferedSink.bufferField;
            sink.write(buffer, buffer.size());
        }
        realBufferedSink.sink.flush();
    }

    @NotNull
    public static final Timeout commonTimeout(@NotNull okio.RealBufferedSink realBufferedSink) {
        Intrinsics.checkNotNullParameter(realBufferedSink, "<this>");
        return realBufferedSink.sink.getF86418p0();
    }

    @NotNull
    public static final String commonToString(@NotNull okio.RealBufferedSink realBufferedSink) {
        Intrinsics.checkNotNullParameter(realBufferedSink, "<this>");
        return "buffer(" + realBufferedSink.sink + RootService.CLOSE_BRACKET;
    }

    public static final void commonWrite(@NotNull okio.RealBufferedSink realBufferedSink, @NotNull Buffer source, long j10) throws IOException {
        Intrinsics.checkNotNullParameter(realBufferedSink, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        if (!(!realBufferedSink.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        realBufferedSink.bufferField.write(source, j10);
        realBufferedSink.emitCompleteSegments();
    }

    public static final long commonWriteAll(@NotNull okio.RealBufferedSink realBufferedSink, @NotNull Source source) throws IOException {
        Intrinsics.checkNotNullParameter(realBufferedSink, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        long j10 = 0;
        while (true) {
            long j11 = source.read(realBufferedSink.bufferField, SvgConstantsKt.SPECIFIED_FONT_FAMILY);
            if (j11 == -1) {
                return j10;
            }
            j10 += j11;
            realBufferedSink.emitCompleteSegments();
        }
    }

    @NotNull
    public static final BufferedSink commonWriteByte(@NotNull okio.RealBufferedSink realBufferedSink, int i10) {
        Intrinsics.checkNotNullParameter(realBufferedSink, "<this>");
        if (!(!realBufferedSink.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        realBufferedSink.bufferField.writeByte(i10);
        return realBufferedSink.emitCompleteSegments();
    }

    @NotNull
    public static final BufferedSink commonWriteDecimalLong(@NotNull okio.RealBufferedSink realBufferedSink, long j10) {
        Intrinsics.checkNotNullParameter(realBufferedSink, "<this>");
        if (!(!realBufferedSink.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        realBufferedSink.bufferField.writeDecimalLong(j10);
        return realBufferedSink.emitCompleteSegments();
    }

    @NotNull
    public static final BufferedSink commonWriteHexadecimalUnsignedLong(@NotNull okio.RealBufferedSink realBufferedSink, long j10) {
        Intrinsics.checkNotNullParameter(realBufferedSink, "<this>");
        if (!(!realBufferedSink.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        realBufferedSink.bufferField.writeHexadecimalUnsignedLong(j10);
        return realBufferedSink.emitCompleteSegments();
    }

    @NotNull
    public static final BufferedSink commonWriteInt(@NotNull okio.RealBufferedSink realBufferedSink, int i10) {
        Intrinsics.checkNotNullParameter(realBufferedSink, "<this>");
        if (!(!realBufferedSink.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        realBufferedSink.bufferField.writeInt(i10);
        return realBufferedSink.emitCompleteSegments();
    }

    @NotNull
    public static final BufferedSink commonWriteIntLe(@NotNull okio.RealBufferedSink realBufferedSink, int i10) {
        Intrinsics.checkNotNullParameter(realBufferedSink, "<this>");
        if (!(!realBufferedSink.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        realBufferedSink.bufferField.writeIntLe(i10);
        return realBufferedSink.emitCompleteSegments();
    }

    @NotNull
    public static final BufferedSink commonWriteLong(@NotNull okio.RealBufferedSink realBufferedSink, long j10) {
        Intrinsics.checkNotNullParameter(realBufferedSink, "<this>");
        if (!(!realBufferedSink.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        realBufferedSink.bufferField.writeLong(j10);
        return realBufferedSink.emitCompleteSegments();
    }

    @NotNull
    public static final BufferedSink commonWriteLongLe(@NotNull okio.RealBufferedSink realBufferedSink, long j10) {
        Intrinsics.checkNotNullParameter(realBufferedSink, "<this>");
        if (!(!realBufferedSink.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        realBufferedSink.bufferField.writeLongLe(j10);
        return realBufferedSink.emitCompleteSegments();
    }

    @NotNull
    public static final BufferedSink commonWriteShort(@NotNull okio.RealBufferedSink realBufferedSink, int i10) {
        Intrinsics.checkNotNullParameter(realBufferedSink, "<this>");
        if (!(!realBufferedSink.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        realBufferedSink.bufferField.writeShort(i10);
        return realBufferedSink.emitCompleteSegments();
    }

    @NotNull
    public static final BufferedSink commonWriteShortLe(@NotNull okio.RealBufferedSink realBufferedSink, int i10) {
        Intrinsics.checkNotNullParameter(realBufferedSink, "<this>");
        if (!(!realBufferedSink.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        realBufferedSink.bufferField.writeShortLe(i10);
        return realBufferedSink.emitCompleteSegments();
    }

    @NotNull
    public static final BufferedSink commonWriteUtf8(@NotNull okio.RealBufferedSink realBufferedSink, @NotNull String string) {
        Intrinsics.checkNotNullParameter(realBufferedSink, "<this>");
        Intrinsics.checkNotNullParameter(string, "string");
        if (!(!realBufferedSink.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        realBufferedSink.bufferField.writeUtf8(string);
        return realBufferedSink.emitCompleteSegments();
    }

    @NotNull
    public static final BufferedSink commonWriteUtf8CodePoint(@NotNull okio.RealBufferedSink realBufferedSink, int i10) {
        Intrinsics.checkNotNullParameter(realBufferedSink, "<this>");
        if (!(!realBufferedSink.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        realBufferedSink.bufferField.writeUtf8CodePoint(i10);
        return realBufferedSink.emitCompleteSegments();
    }

    @NotNull
    public static final BufferedSink commonWrite(@NotNull okio.RealBufferedSink realBufferedSink, @NotNull ByteString byteString) {
        Intrinsics.checkNotNullParameter(realBufferedSink, "<this>");
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        if (!realBufferedSink.closed) {
            realBufferedSink.bufferField.write(byteString);
            return realBufferedSink.emitCompleteSegments();
        }
        throw new IllegalStateException("closed".toString());
    }

    @NotNull
    public static final BufferedSink commonWriteUtf8(@NotNull okio.RealBufferedSink realBufferedSink, @NotNull String string, int i10, int i11) {
        Intrinsics.checkNotNullParameter(realBufferedSink, "<this>");
        Intrinsics.checkNotNullParameter(string, "string");
        if (!realBufferedSink.closed) {
            realBufferedSink.bufferField.writeUtf8(string, i10, i11);
            return realBufferedSink.emitCompleteSegments();
        }
        throw new IllegalStateException("closed".toString());
    }

    @NotNull
    public static final BufferedSink commonWrite(@NotNull okio.RealBufferedSink realBufferedSink, @NotNull ByteString byteString, int i10, int i11) {
        Intrinsics.checkNotNullParameter(realBufferedSink, "<this>");
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        if (!realBufferedSink.closed) {
            realBufferedSink.bufferField.write(byteString, i10, i11);
            return realBufferedSink.emitCompleteSegments();
        }
        throw new IllegalStateException("closed".toString());
    }

    @NotNull
    public static final BufferedSink commonWrite(@NotNull okio.RealBufferedSink realBufferedSink, @NotNull byte[] source) {
        Intrinsics.checkNotNullParameter(realBufferedSink, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        if (!realBufferedSink.closed) {
            realBufferedSink.bufferField.write(source);
            return realBufferedSink.emitCompleteSegments();
        }
        throw new IllegalStateException("closed".toString());
    }

    @NotNull
    public static final BufferedSink commonWrite(@NotNull okio.RealBufferedSink realBufferedSink, @NotNull byte[] source, int i10, int i11) {
        Intrinsics.checkNotNullParameter(realBufferedSink, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        if (!realBufferedSink.closed) {
            realBufferedSink.bufferField.write(source, i10, i11);
            return realBufferedSink.emitCompleteSegments();
        }
        throw new IllegalStateException("closed".toString());
    }

    @NotNull
    public static final BufferedSink commonWrite(@NotNull okio.RealBufferedSink realBufferedSink, @NotNull Source source, long j10) throws IOException {
        Intrinsics.checkNotNullParameter(realBufferedSink, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        while (j10 > 0) {
            long j11 = source.read(realBufferedSink.bufferField, j10);
            if (j11 != -1) {
                j10 -= j11;
                realBufferedSink.emitCompleteSegments();
            } else {
                throw new EOFException();
            }
        }
        return realBufferedSink;
    }
}
