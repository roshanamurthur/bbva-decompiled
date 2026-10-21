package okio;

import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: NioFileSystemFileHandle.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0002H\u0014J(\u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0014J(\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0014J\b\u0010\u000f\u001a\u00020\u0004H\u0014J\b\u0010\u0010\u001a\u00020\u0004H\u0014¨\u0006\u0017"}, d2 = {"Lokio/NioFileSystemFileHandle;", "Lokio/FileHandle;", "", "size", "", "protectedResize", "protectedSize", "fileOffset", "", "array", "", "arrayOffset", "byteCount", "protectedRead", "protectedWrite", "protectedFlush", "protectedClose", "", "readWrite", "Ljava/nio/channels/FileChannel;", "fileChannel", "<init>", "(ZLjava/nio/channels/FileChannel;)V", "okio"}, k = 1, mv = {1, 9, 0})
public final class NioFileSystemFileHandle extends FileHandle {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @NotNull
    public final FileChannel f86397t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NioFileSystemFileHandle(boolean z10, @NotNull FileChannel fileChannel) {
        super(z10);
        Intrinsics.checkNotNullParameter(fileChannel, "fileChannel");
        this.f86397t0 = fileChannel;
    }

    @Override // okio.FileHandle
    public synchronized void protectedClose() {
        this.f86397t0.close();
    }

    @Override // okio.FileHandle
    public synchronized void protectedFlush() {
        this.f86397t0.force(true);
    }

    @Override // okio.FileHandle
    public synchronized int protectedRead(long fileOffset, @NotNull byte[] array, int arrayOffset, int byteCount) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.f86397t0.position(fileOffset);
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(array, arrayOffset, byteCount);
        int i10 = 0;
        while (i10 < byteCount) {
            int i11 = this.f86397t0.read(byteBufferWrap);
            if (i11 == -1) {
                if (i10 != 0) {
                    break;
                }
                return -1;
            }
            i10 += i11;
        }
        return i10;
    }

    @Override // okio.FileHandle
    public synchronized void protectedResize(long size) {
        try {
            long size2 = size();
            long j10 = size - size2;
            if (j10 > 0) {
                int i10 = (int) j10;
                protectedWrite(size2, new byte[i10], 0, i10);
            } else {
                this.f86397t0.truncate(size);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // okio.FileHandle
    public synchronized long protectedSize() {
        return this.f86397t0.size();
    }

    @Override // okio.FileHandle
    public synchronized void protectedWrite(long fileOffset, @NotNull byte[] array, int arrayOffset, int byteCount) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.f86397t0.position(fileOffset);
        this.f86397t0.write(ByteBuffer.wrap(array, arrayOffset, byteCount));
    }
}
