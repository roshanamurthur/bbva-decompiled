package okio;

import com.bbva.glomohybrid.cellsweb.presentation.verishow.constants.HearingDisabilitiesConstants;
import java.io.IOException;
import javax.crypto.Cipher;
import javax.crypto.ShortBufferException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CipherSink.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u000b\u001a\u00020\u0006H\u0016R\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0016"}, d2 = {"Lokio/CipherSink;", "Lokio/Sink;", "Lokio/Buffer;", "source", "", "byteCount", "", "write", "flush", "Lokio/Timeout;", "timeout", HearingDisabilitiesConstants.CLOSE_MODAL, "Ljavax/crypto/Cipher;", "q0", "Ljavax/crypto/Cipher;", "getCipher", "()Ljavax/crypto/Cipher;", "cipher", "Lokio/BufferedSink;", "sink", "<init>", "(Lokio/BufferedSink;Ljavax/crypto/Cipher;)V", "okio"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nCipherSink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CipherSink.kt\nokio/CipherSink\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,148:1\n1#2:149\n86#3:150\n*S KotlinDebug\n*F\n+ 1 CipherSink.kt\nokio/CipherSink\n*L\n47#1:150\n*E\n"})
public final class CipherSink implements Sink {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final BufferedSink f86342p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Cipher cipher;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final int f86344r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public boolean f86345s0;

    public CipherSink(@NotNull BufferedSink sink, @NotNull Cipher cipher) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        Intrinsics.checkNotNullParameter(cipher, "cipher");
        this.f86342p0 = sink;
        this.cipher = cipher;
        int blockSize = cipher.getBlockSize();
        this.f86344r0 = blockSize;
        if (blockSize > 0) {
            return;
        }
        throw new IllegalArgumentException(("Block cipher required " + cipher).toString());
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        if (this.f86345s0) {
            return;
        }
        this.f86345s0 = true;
        Cipher cipher = this.cipher;
        int outputSize = cipher.getOutputSize(0);
        BufferedSink bufferedSink = this.f86342p0;
        Throwable th2 = null;
        if (outputSize != 0) {
            if (outputSize > 8192) {
                try {
                    byte[] bArrDoFinal = cipher.doFinal();
                    Intrinsics.checkNotNullExpressionValue(bArrDoFinal, "doFinal(...)");
                    bufferedSink.write(bArrDoFinal);
                } catch (Throwable th3) {
                    th2 = th3;
                }
            } else {
                Buffer buffer = bufferedSink.getBuffer();
                Segment segmentWritableSegment$okio = buffer.writableSegment$okio(outputSize);
                try {
                    int iDoFinal = cipher.doFinal(segmentWritableSegment$okio.data, segmentWritableSegment$okio.limit);
                    segmentWritableSegment$okio.limit += iDoFinal;
                    buffer.setSize$okio(buffer.size() + ((long) iDoFinal));
                } catch (Throwable th4) {
                    th2 = th4;
                }
                if (segmentWritableSegment$okio.pos == segmentWritableSegment$okio.limit) {
                    buffer.head = segmentWritableSegment$okio.pop();
                    SegmentPool.recycle(segmentWritableSegment$okio);
                }
            }
        }
        try {
            bufferedSink.close();
        } catch (Throwable th5) {
            if (th2 == null) {
                th2 = th5;
            }
        }
        if (th2 != null) {
            throw th2;
        }
    }

    @Override // okio.Sink, java.io.Flushable
    public void flush() throws IOException {
        this.f86342p0.flush();
    }

    @NotNull
    public final Cipher getCipher() {
        return this.cipher;
    }

    @Override // okio.Sink
    @NotNull
    /* JADX INFO: renamed from: timeout */
    public Timeout getF86331p0() {
        return this.f86342p0.getF86331p0();
    }

    @Override // okio.Sink
    public void write(@NotNull Buffer source, long byteCount) throws IOException, ShortBufferException {
        Intrinsics.checkNotNullParameter(source, "source");
        SegmentedByteString.checkOffsetAndCount(source.size(), 0L, byteCount);
        if (!(!this.f86345s0)) {
            throw new IllegalStateException("closed".toString());
        }
        while (byteCount > 0) {
            Segment segment = source.head;
            Intrinsics.checkNotNull(segment);
            int iMin = (int) Math.min(byteCount, segment.limit - segment.pos);
            BufferedSink bufferedSink = this.f86342p0;
            Buffer buffer = bufferedSink.getBuffer();
            Cipher cipher = this.cipher;
            int outputSize = cipher.getOutputSize(iMin);
            while (true) {
                if (outputSize <= 8192) {
                    Segment segmentWritableSegment$okio = buffer.writableSegment$okio(outputSize);
                    int iUpdate = this.cipher.update(segment.data, segment.pos, iMin, segmentWritableSegment$okio.data, segmentWritableSegment$okio.limit);
                    segmentWritableSegment$okio.limit += iUpdate;
                    buffer.setSize$okio(buffer.size() + ((long) iUpdate));
                    if (segmentWritableSegment$okio.pos == segmentWritableSegment$okio.limit) {
                        buffer.head = segmentWritableSegment$okio.pop();
                        SegmentPool.recycle(segmentWritableSegment$okio);
                    }
                    bufferedSink.emitCompleteSegments();
                    source.setSize$okio(source.size() - ((long) iMin));
                    int i10 = segment.pos + iMin;
                    segment.pos = i10;
                    if (i10 != segment.limit) {
                        break;
                    }
                    source.head = segment.pop();
                    SegmentPool.recycle(segment);
                    break;
                }
                int i11 = this.f86344r0;
                if (iMin <= i11) {
                    byte[] bArrUpdate = cipher.update(source.readByteArray(byteCount));
                    Intrinsics.checkNotNullExpressionValue(bArrUpdate, "update(...)");
                    bufferedSink.write(bArrUpdate);
                    iMin = (int) byteCount;
                    break;
                }
                iMin -= i11;
                outputSize = cipher.getOutputSize(iMin);
            }
            byteCount -= (long) iMin;
        }
    }
}
