package okio.internal;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okio.Path;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ZipEntry.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010!\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\u0012\u001a\u00020\r\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0013\u0012\b\b\u0002\u0010$\u001a\u00020\u001f\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010,\u001a\u00020\u0013¢\u0006\u0004\b3\u00104R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u000b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0018\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001b\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017R\u0017\u0010\u001e\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0015\u001a\u0004\b\u001d\u0010\u0017R\u0017\u0010$\u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010)\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010,\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b*\u0010\u0015\u001a\u0004\b+\u0010\u0017R\u001d\u00102\u001a\b\u0012\u0004\u0012\u00020\u00020-8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101¨\u00065"}, d2 = {"Lokio/internal/ZipEntry;", "", "Lokio/Path;", "a", "Lokio/Path;", "getCanonicalPath", "()Lokio/Path;", "canonicalPath", "", "b", "Z", "isDirectory", "()Z", "", "c", "Ljava/lang/String;", "getComment", "()Ljava/lang/String;", "comment", "", "d", "J", "getCrc", "()J", "crc", "e", "getCompressedSize", "compressedSize", "f", "getSize", "size", "", "g", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getCompressionMethod", "()I", "compressionMethod", "h", "Ljava/lang/Long;", "getLastModifiedAtMillis", "()Ljava/lang/Long;", "lastModifiedAtMillis", "i", "getOffset", TypedValues.CycleType.S_WAVE_OFFSET, "", "j", "Ljava/util/List;", "getChildren", "()Ljava/util/List;", "children", "<init>", "(Lokio/Path;ZLjava/lang/String;JJJILjava/lang/Long;J)V", "okio"}, k = 1, mv = {1, 9, 0})
public final class ZipEntry {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Path canonicalPath;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final boolean isDirectory;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String comment;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final long crc;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final long compressedSize;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final long size;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final int compressionMethod;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Long lastModifiedAtMillis;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public final long offset;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final ArrayList f86488j;

    public ZipEntry(@NotNull Path canonicalPath, boolean z10, @NotNull String comment, long j10, long j11, long j12, int i10, @Nullable Long l6, long j13) {
        Intrinsics.checkNotNullParameter(canonicalPath, "canonicalPath");
        Intrinsics.checkNotNullParameter(comment, "comment");
        this.canonicalPath = canonicalPath;
        this.isDirectory = z10;
        this.comment = comment;
        this.crc = j10;
        this.compressedSize = j11;
        this.size = j12;
        this.compressionMethod = i10;
        this.lastModifiedAtMillis = l6;
        this.offset = j13;
        this.f86488j = new ArrayList();
    }

    @NotNull
    public final Path getCanonicalPath() {
        return this.canonicalPath;
    }

    @NotNull
    public final List<Path> getChildren() {
        return this.f86488j;
    }

    @NotNull
    public final String getComment() {
        return this.comment;
    }

    public final long getCompressedSize() {
        return this.compressedSize;
    }

    public final int getCompressionMethod() {
        return this.compressionMethod;
    }

    public final long getCrc() {
        return this.crc;
    }

    @Nullable
    public final Long getLastModifiedAtMillis() {
        return this.lastModifiedAtMillis;
    }

    public final long getOffset() {
        return this.offset;
    }

    public final long getSize() {
        return this.size;
    }

    /* JADX INFO: renamed from: isDirectory, reason: from getter */
    public final boolean getIsDirectory() {
        return this.isDirectory;
    }

    public /* synthetic */ ZipEntry(Path path, boolean z10, String str, long j10, long j11, long j12, int i10, Long l6, long j13, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(path, (i11 & 2) != 0 ? false : z10, (i11 & 4) != 0 ? "" : str, (i11 & 8) != 0 ? -1L : j10, (i11 & 16) != 0 ? -1L : j11, (i11 & 32) != 0 ? -1L : j12, (i11 & 64) != 0 ? -1 : i10, (i11 & 128) != 0 ? null : l6, (i11 & 256) == 0 ? j13 : -1L);
    }
}
