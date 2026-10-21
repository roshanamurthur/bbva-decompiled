package okio;

import androidx.camera.core.impl.v;
import com.bbva.glomohybrid.cellsweb.presentation.verishow.constants.HearingDisabilitiesConstants;
import java.io.IOException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.ShortBufferException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CipherSource.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016R\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0015"}, d2 = {"Lokio/CipherSource;", "Lokio/Source;", "Lokio/Buffer;", "sink", "", "byteCount", "read", "Lokio/Timeout;", "timeout", "", HearingDisabilitiesConstants.CLOSE_MODAL, "Ljavax/crypto/Cipher;", "q0", "Ljavax/crypto/Cipher;", "getCipher", "()Ljavax/crypto/Cipher;", "cipher", "Lokio/BufferedSource;", "source", "<init>", "(Lokio/BufferedSource;Ljavax/crypto/Cipher;)V", "okio"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nCipherSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CipherSource.kt\nokio/CipherSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,120:1\n1#2:121\n*E\n"})
public final class CipherSource implements Source {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final BufferedSource f86346p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Cipher cipher;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final int f86348r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public final Buffer f86349s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public boolean f86350t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public boolean f86351u0;

    public CipherSource(@NotNull BufferedSource source, @NotNull Cipher cipher) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(cipher, "cipher");
        this.f86346p0 = source;
        this.cipher = cipher;
        int blockSize = cipher.getBlockSize();
        this.f86348r0 = blockSize;
        this.f86349s0 = new Buffer();
        if (blockSize > 0) {
            return;
        }
        throw new IllegalArgumentException(("Block cipher required " + cipher).toString());
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f86351u0 = true;
        this.f86346p0.close();
    }

    @NotNull
    public final Cipher getCipher() {
        return this.cipher;
    }

    @Override // okio.Source
    public long read(@NotNull Buffer sink, long byteCount) throws BadPaddingException, IllegalBlockSizeException, IOException, ShortBufferException {
        Buffer buffer;
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (byteCount < 0) {
            throw new IllegalArgumentException(v.c("byteCount < 0: ", byteCount).toString());
        }
        if (!(!this.f86351u0)) {
            throw new IllegalStateException("closed".toString());
        }
        if (byteCount == 0) {
            return 0L;
        }
        while (true) {
            buffer = this.f86349s0;
            if (buffer.size() == 0 && !this.f86350t0) {
                BufferedSource bufferedSource = this.f86346p0;
                boolean zExhausted = bufferedSource.exhausted();
                Cipher cipher = this.cipher;
                if (!zExhausted) {
                    Segment segment = bufferedSource.getBuffer().head;
                    Intrinsics.checkNotNull(segment);
                    int i10 = segment.limit - segment.pos;
                    int outputSize = cipher.getOutputSize(i10);
                    while (true) {
                        if (outputSize <= 8192) {
                            Segment segmentWritableSegment$okio = buffer.writableSegment$okio(outputSize);
                            int iUpdate = this.cipher.update(segment.data, segment.pos, i10, segmentWritableSegment$okio.data, segmentWritableSegment$okio.pos);
                            bufferedSource.skip(i10);
                            segmentWritableSegment$okio.limit += iUpdate;
                            buffer.setSize$okio(buffer.size() + ((long) iUpdate));
                            if (segmentWritableSegment$okio.pos != segmentWritableSegment$okio.limit) {
                                break;
                            }
                            buffer.head = segmentWritableSegment$okio.pop();
                            SegmentPool.recycle(segmentWritableSegment$okio);
                            break;
                        }
                        int i11 = this.f86348r0;
                        if (i10 <= i11) {
                            this.f86350t0 = true;
                            byte[] bArrDoFinal = cipher.doFinal(bufferedSource.readByteArray());
                            Intrinsics.checkNotNullExpressionValue(bArrDoFinal, "doFinal(...)");
                            buffer.write(bArrDoFinal);
                            break;
                        }
                        i10 -= i11;
                        outputSize = cipher.getOutputSize(i10);
                    }
                } else {
                    this.f86350t0 = true;
                    int outputSize2 = cipher.getOutputSize(0);
                    if (outputSize2 == 0) {
                        break;
                    }
                    Segment segmentWritableSegment$okio2 = buffer.writableSegment$okio(outputSize2);
                    int iDoFinal = cipher.doFinal(segmentWritableSegment$okio2.data, segmentWritableSegment$okio2.pos);
                    segmentWritableSegment$okio2.limit += iDoFinal;
                    buffer.setSize$okio(buffer.size() + ((long) iDoFinal));
                    if (segmentWritableSegment$okio2.pos != segmentWritableSegment$okio2.limit) {
                        break;
                    }
                    buffer.head = segmentWritableSegment$okio2.pop();
                    SegmentPool.recycle(segmentWritableSegment$okio2);
                    break;
                }
            } else {
                break;
            }
        }
        return buffer.read(sink, byteCount);
    }

    @Override // okio.Source
    @NotNull
    /* JADX INFO: renamed from: timeout */
    public Timeout getF86333p0() {
        return this.f86346p0.getF86333p0();
    }
}
