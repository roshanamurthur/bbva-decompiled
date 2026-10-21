package okhttp3.internal.cache2;

import java.io.IOException;
import java.nio.channels.FileChannel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FileOperator.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u001e\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002¨\u0006\u000f"}, d2 = {"Lokhttp3/internal/cache2/FileOperator;", "", "", "pos", "Lokio/Buffer;", "source", "byteCount", "", "write", "sink", "read", "Ljava/nio/channels/FileChannel;", "fileChannel", "<init>", "(Ljava/nio/channels/FileChannel;)V", "okhttp"}, k = 1, mv = {1, 8, 0})
public final class FileOperator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final FileChannel f85746a;

    public FileOperator(@NotNull FileChannel fileChannel) {
        Intrinsics.checkNotNullParameter(fileChannel, "fileChannel");
        this.f85746a = fileChannel;
    }

    public final void read(long pos, @NotNull Buffer sink, long byteCount) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (byteCount < 0) {
            throw new IndexOutOfBoundsException();
        }
        while (byteCount > 0) {
            long jTransferTo = this.f85746a.transferTo(pos, byteCount, sink);
            pos += jTransferTo;
            byteCount -= jTransferTo;
        }
    }

    public final void write(long pos, @NotNull Buffer source, long byteCount) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        if (byteCount < 0 || byteCount > source.size()) {
            throw new IndexOutOfBoundsException();
        }
        while (byteCount > 0) {
            long jTransferFrom = this.f85746a.transferFrom(source, pos, byteCount);
            pos += jTransferFrom;
            byteCount -= jTransferFrom;
        }
    }
}
