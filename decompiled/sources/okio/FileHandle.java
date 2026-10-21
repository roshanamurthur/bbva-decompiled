package okio;

import androidx.camera.core.impl.v;
import com.bbva.glomohybrid.cellsweb.presentation.verishow.constants.HearingDisabilitiesConstants;
import java.io.Closeable;
import java.io.IOException;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FileHandle.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b&\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002./B\u000f\u0012\u0006\u0010$\u001a\u00020\u001f¢\u0006\u0004\b,\u0010-J&\u0010\n\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007J\u001e\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u0003J\u0006\u0010\r\u001a\u00020\u0003J\u000e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0003J&\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007J\u001e\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u0003J\u0006\u0010\u0012\u001a\u00020\u000eJ\u0010\u0010\u0011\u001a\u00020\u00132\b\b\u0002\u0010\u0004\u001a\u00020\u0003J\u000e\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0013J\u0016\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0003J\u0010\u0010\f\u001a\u00020\u00162\b\b\u0002\u0010\u0004\u001a\u00020\u0003J\u0006\u0010\u0017\u001a\u00020\u0016J\u000e\u0010\u0014\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0016J\u0016\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u0003J\u0006\u0010\u0018\u001a\u00020\u000eJ(\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H$J(\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H$J\b\u0010\u001b\u001a\u00020\u000eH$J\u0010\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0003H$J\b\u0010\u001d\u001a\u00020\u0003H$J\b\u0010\u001e\u001a\u00020\u000eH$R\u0017\u0010$\u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001b\u0010+\u001a\u00060%j\u0002`&8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u00060"}, d2 = {"Lokio/FileHandle;", "Ljava/io/Closeable;", "Lokio/Closeable;", "", "fileOffset", "", "array", "", "arrayOffset", "byteCount", "read", "Lokio/Buffer;", "sink", "size", "", "resize", "write", "source", "flush", "Lokio/Source;", "position", "reposition", "Lokio/Sink;", "appendingSink", HearingDisabilitiesConstants.CLOSE_MODAL, "protectedRead", "protectedWrite", "protectedFlush", "protectedResize", "protectedSize", "protectedClose", "", "p0", "Z", "getReadWrite", "()Z", "readWrite", "Ljava/util/concurrent/locks/ReentrantLock;", "Lokio/Lock;", "s0", "Ljava/util/concurrent/locks/ReentrantLock;", "getLock", "()Ljava/util/concurrent/locks/ReentrantLock;", "lock", "<init>", "(Z)V", "a", "b", "okio"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nFileHandle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileHandle.kt\nokio/FileHandle\n+ 2 -JvmPlatform.kt\nokio/_JvmPlatformKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 RealBufferedSource.kt\nokio/RealBufferedSource\n+ 5 RealBufferedSink.kt\nokio/RealBufferedSink\n+ 6 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,444:1\n33#2:445\n33#2:447\n33#2:448\n33#2:449\n33#2:450\n33#2:451\n33#2:452\n33#2:453\n33#2:457\n33#2:459\n1#3:446\n62#4:454\n62#4:455\n62#4:456\n51#5:458\n86#6:460\n86#6:461\n*S KotlinDebug\n*F\n+ 1 FileHandle.kt\nokio/FileHandle\n*L\n69#1:445\n81#1:447\n92#1:448\n105#1:449\n119#1:450\n129#1:451\n139#1:452\n151#1:453\n221#1:457\n287#1:459\n169#1:454\n195#1:455\n202#1:456\n248#1:458\n345#1:460\n374#1:461\n*E\n"})
public abstract class FileHandle implements Closeable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    public final boolean readWrite;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public boolean f86356q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f86357r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ReentrantLock lock = _JvmPlatformKt.newLock();

    /* JADX INFO: compiled from: FileHandle.kt */
    @SourceDebugExtension({"SMAP\nFileHandle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileHandle.kt\nokio/FileHandle$FileHandleSink\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 -JvmPlatform.kt\nokio/_JvmPlatformKt\n*L\n1#1,444:1\n1#2:445\n33#3:446\n*S KotlinDebug\n*F\n+ 1 FileHandle.kt\nokio/FileHandle$FileHandleSink\n*L\n410#1:446\n*E\n"})
    public static final class a implements Sink {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        @NotNull
        public final FileHandle f86359p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public long f86360q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public boolean f86361r0;

        public a(@NotNull FileHandle fileHandle, long j10) {
            Intrinsics.checkNotNullParameter(fileHandle, "fileHandle");
            this.f86359p0 = fileHandle;
            this.f86360q0 = j10;
        }

        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            if (this.f86361r0) {
                return;
            }
            this.f86361r0 = true;
            FileHandle fileHandle = this.f86359p0;
            ReentrantLock lock = fileHandle.getLock();
            lock.lock();
            try {
                fileHandle.f86357r0--;
                if (fileHandle.f86357r0 == 0 && fileHandle.f86356q0) {
                    Unit unit = Unit.INSTANCE;
                    lock.unlock();
                    fileHandle.protectedClose();
                    return;
                }
                lock.unlock();
            } catch (Throwable th2) {
                lock.unlock();
                throw th2;
            }
        }

        @Override // okio.Sink, java.io.Flushable
        public final void flush() throws IOException {
            if (!(!this.f86361r0)) {
                throw new IllegalStateException("closed".toString());
            }
            this.f86359p0.protectedFlush();
        }

        @Override // okio.Sink
        @NotNull
        public final Timeout timeout() {
            return Timeout.NONE;
        }

        @Override // okio.Sink
        public final void write(@NotNull Buffer source, long j10) throws IOException {
            Intrinsics.checkNotNullParameter(source, "source");
            if (!(!this.f86361r0)) {
                throw new IllegalStateException("closed".toString());
            }
            this.f86359p0.b(this.f86360q0, source, j10);
            this.f86360q0 += j10;
        }
    }

    /* JADX INFO: compiled from: FileHandle.kt */
    @SourceDebugExtension({"SMAP\nFileHandle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileHandle.kt\nokio/FileHandle$FileHandleSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 -JvmPlatform.kt\nokio/_JvmPlatformKt\n*L\n1#1,444:1\n1#2:445\n33#3:446\n*S KotlinDebug\n*F\n+ 1 FileHandle.kt\nokio/FileHandle$FileHandleSource\n*L\n436#1:446\n*E\n"})
    public static final class b implements Source {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        @NotNull
        public final FileHandle f86362p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public long f86363q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public boolean f86364r0;

        public b(@NotNull FileHandle fileHandle, long j10) {
            Intrinsics.checkNotNullParameter(fileHandle, "fileHandle");
            this.f86362p0 = fileHandle;
            this.f86363q0 = j10;
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            if (this.f86364r0) {
                return;
            }
            this.f86364r0 = true;
            FileHandle fileHandle = this.f86362p0;
            ReentrantLock lock = fileHandle.getLock();
            lock.lock();
            try {
                fileHandle.f86357r0--;
                if (fileHandle.f86357r0 == 0 && fileHandle.f86356q0) {
                    Unit unit = Unit.INSTANCE;
                    lock.unlock();
                    fileHandle.protectedClose();
                    return;
                }
                lock.unlock();
            } catch (Throwable th2) {
                lock.unlock();
                throw th2;
            }
        }

        @Override // okio.Source
        public final long read(@NotNull Buffer sink, long j10) throws IOException {
            Intrinsics.checkNotNullParameter(sink, "sink");
            if (!(!this.f86364r0)) {
                throw new IllegalStateException("closed".toString());
            }
            long jA = this.f86362p0.a(this.f86363q0, sink, j10);
            if (jA != -1) {
                this.f86363q0 += jA;
            }
            return jA;
        }

        @Override // okio.Source
        @NotNull
        public final Timeout timeout() {
            return Timeout.NONE;
        }
    }

    public FileHandle(boolean z10) {
        this.readWrite = z10;
    }

    public static /* synthetic */ Sink sink$default(FileHandle fileHandle, long j10, int i10, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sink");
        }
        if ((i10 & 1) != 0) {
            j10 = 0;
        }
        return fileHandle.sink(j10);
    }

    public static /* synthetic */ Source source$default(FileHandle fileHandle, long j10, int i10, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: source");
        }
        if ((i10 & 1) != 0) {
            j10 = 0;
        }
        return fileHandle.source(j10);
    }

    public final long a(long j10, Buffer buffer, long j11) throws IOException {
        if (j11 < 0) {
            throw new IllegalArgumentException(v.c("byteCount < 0: ", j11).toString());
        }
        long j12 = j11 + j10;
        long j13 = j10;
        while (j13 < j12) {
            Segment segmentWritableSegment$okio = buffer.writableSegment$okio(1);
            byte[] bArr = segmentWritableSegment$okio.data;
            int i10 = segmentWritableSegment$okio.limit;
            int iProtectedRead = protectedRead(j13, bArr, i10, (int) Math.min(j12 - j13, 8192 - i10));
            if (iProtectedRead == -1) {
                if (segmentWritableSegment$okio.pos == segmentWritableSegment$okio.limit) {
                    buffer.head = segmentWritableSegment$okio.pop();
                    SegmentPool.recycle(segmentWritableSegment$okio);
                }
                if (j10 != j13) {
                    break;
                }
                return -1L;
            }
            segmentWritableSegment$okio.limit += iProtectedRead;
            long j14 = iProtectedRead;
            j13 += j14;
            buffer.setSize$okio(buffer.size() + j14);
        }
        return j13 - j10;
    }

    @NotNull
    public final Sink appendingSink() throws IOException {
        return sink(size());
    }

    public final void b(long j10, Buffer buffer, long j11) throws IOException {
        SegmentedByteString.checkOffsetAndCount(buffer.size(), 0L, j11);
        long j12 = j11 + j10;
        while (j10 < j12) {
            Segment segment = buffer.head;
            Intrinsics.checkNotNull(segment);
            int iMin = (int) Math.min(j12 - j10, segment.limit - segment.pos);
            protectedWrite(j10, segment.data, segment.pos, iMin);
            segment.pos += iMin;
            long j13 = iMin;
            j10 += j13;
            buffer.setSize$okio(buffer.size() - j13);
            if (segment.pos == segment.limit) {
                buffer.head = segment.pop();
                SegmentPool.recycle(segment);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.f86356q0) {
                reentrantLock.unlock();
                return;
            }
            this.f86356q0 = true;
            if (this.f86357r0 != 0) {
                reentrantLock.unlock();
                return;
            }
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            protectedClose();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final void flush() throws IOException {
        if (!this.readWrite) {
            throw new IllegalStateException("file handle is read-only".toString());
        }
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (!(!this.f86356q0)) {
                throw new IllegalStateException("closed".toString());
            }
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            protectedFlush();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @NotNull
    public final ReentrantLock getLock() {
        return this.lock;
    }

    public final boolean getReadWrite() {
        return this.readWrite;
    }

    public final long position(@NotNull Source source) throws IOException {
        long size;
        Intrinsics.checkNotNullParameter(source, "source");
        if (source instanceof RealBufferedSource) {
            RealBufferedSource realBufferedSource = (RealBufferedSource) source;
            size = realBufferedSource.bufferField.size();
            source = realBufferedSource.source;
        } else {
            size = 0;
        }
        if (!(source instanceof b) || ((b) source).f86362p0 != this) {
            throw new IllegalArgumentException("source was not created by this FileHandle".toString());
        }
        b bVar = (b) source;
        if (!bVar.f86364r0) {
            return bVar.f86363q0 - size;
        }
        throw new IllegalStateException("closed".toString());
    }

    public abstract void protectedClose() throws IOException;

    public abstract void protectedFlush() throws IOException;

    public abstract int protectedRead(long fileOffset, @NotNull byte[] array, int arrayOffset, int byteCount) throws IOException;

    public abstract void protectedResize(long size) throws IOException;

    public abstract long protectedSize() throws IOException;

    public abstract void protectedWrite(long fileOffset, @NotNull byte[] array, int arrayOffset, int byteCount) throws IOException;

    public final int read(long fileOffset, @NotNull byte[] array, int arrayOffset, int byteCount) throws IOException {
        Intrinsics.checkNotNullParameter(array, "array");
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (!(!this.f86356q0)) {
                throw new IllegalStateException("closed".toString());
            }
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            return protectedRead(fileOffset, array, arrayOffset, byteCount);
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final void reposition(@NotNull Source source, long position) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        if (!(source instanceof RealBufferedSource)) {
            if (!(source instanceof b) || ((b) source).f86362p0 != this) {
                throw new IllegalArgumentException("source was not created by this FileHandle".toString());
            }
            b bVar = (b) source;
            if (!(!bVar.f86364r0)) {
                throw new IllegalStateException("closed".toString());
            }
            bVar.f86363q0 = position;
            return;
        }
        RealBufferedSource realBufferedSource = (RealBufferedSource) source;
        Source source2 = realBufferedSource.source;
        if (!(source2 instanceof b) || ((b) source2).f86362p0 != this) {
            throw new IllegalArgumentException("source was not created by this FileHandle".toString());
        }
        b bVar2 = (b) source2;
        if (!(!bVar2.f86364r0)) {
            throw new IllegalStateException("closed".toString());
        }
        long size = realBufferedSource.bufferField.size();
        long j10 = position - (bVar2.f86363q0 - size);
        if (0 <= j10 && j10 < size) {
            realBufferedSource.skip(j10);
        } else {
            realBufferedSource.bufferField.clear();
            bVar2.f86363q0 = position;
        }
    }

    public final void resize(long size) throws IOException {
        if (!this.readWrite) {
            throw new IllegalStateException("file handle is read-only".toString());
        }
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (!(!this.f86356q0)) {
                throw new IllegalStateException("closed".toString());
            }
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            protectedResize(size);
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @NotNull
    public final Sink sink(long fileOffset) throws IOException {
        if (!this.readWrite) {
            throw new IllegalStateException("file handle is read-only".toString());
        }
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (!(!this.f86356q0)) {
                throw new IllegalStateException("closed".toString());
            }
            this.f86357r0++;
            reentrantLock.unlock();
            return new a(this, fileOffset);
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final long size() throws IOException {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (!(!this.f86356q0)) {
                throw new IllegalStateException("closed".toString());
            }
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            return protectedSize();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @NotNull
    public final Source source(long fileOffset) throws IOException {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (!(!this.f86356q0)) {
                throw new IllegalStateException("closed".toString());
            }
            this.f86357r0++;
            reentrantLock.unlock();
            return new b(this, fileOffset);
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final void write(long fileOffset, @NotNull byte[] array, int arrayOffset, int byteCount) throws IOException {
        Intrinsics.checkNotNullParameter(array, "array");
        if (!this.readWrite) {
            throw new IllegalStateException("file handle is read-only".toString());
        }
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (!(!this.f86356q0)) {
                throw new IllegalStateException("closed".toString());
            }
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            protectedWrite(fileOffset, array, arrayOffset, byteCount);
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final long read(long fileOffset, @NotNull Buffer sink, long byteCount) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (!this.f86356q0) {
                Unit unit = Unit.INSTANCE;
                reentrantLock.unlock();
                return a(fileOffset, sink, byteCount);
            }
            throw new IllegalStateException("closed".toString());
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final void write(long fileOffset, @NotNull Buffer source, long byteCount) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        if (this.readWrite) {
            ReentrantLock reentrantLock = this.lock;
            reentrantLock.lock();
            try {
                if (!this.f86356q0) {
                    Unit unit = Unit.INSTANCE;
                    reentrantLock.unlock();
                    b(fileOffset, source, byteCount);
                    return;
                }
                throw new IllegalStateException("closed".toString());
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        }
        throw new IllegalStateException("file handle is read-only".toString());
    }

    public final long position(@NotNull Sink sink) throws IOException {
        long size;
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (sink instanceof RealBufferedSink) {
            RealBufferedSink realBufferedSink = (RealBufferedSink) sink;
            size = realBufferedSink.bufferField.size();
            sink = realBufferedSink.sink;
        } else {
            size = 0;
        }
        if ((sink instanceof a) && ((a) sink).f86359p0 == this) {
            a aVar = (a) sink;
            if (!aVar.f86361r0) {
                return aVar.f86360q0 + size;
            }
            throw new IllegalStateException("closed".toString());
        }
        throw new IllegalArgumentException("sink was not created by this FileHandle".toString());
    }

    public final void reposition(@NotNull Sink sink, long position) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (sink instanceof RealBufferedSink) {
            RealBufferedSink realBufferedSink = (RealBufferedSink) sink;
            Sink sink2 = realBufferedSink.sink;
            if ((sink2 instanceof a) && ((a) sink2).f86359p0 == this) {
                a aVar = (a) sink2;
                if (!aVar.f86361r0) {
                    realBufferedSink.emit();
                    aVar.f86360q0 = position;
                    return;
                }
                throw new IllegalStateException("closed".toString());
            }
            throw new IllegalArgumentException("sink was not created by this FileHandle".toString());
        }
        if ((sink instanceof a) && ((a) sink).f86359p0 == this) {
            a aVar2 = (a) sink;
            if (!aVar2.f86361r0) {
                aVar2.f86360q0 = position;
                return;
            }
            throw new IllegalStateException("closed".toString());
        }
        throw new IllegalArgumentException("sink was not created by this FileHandle".toString());
    }
}
