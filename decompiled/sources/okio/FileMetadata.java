package okio;

import androidx.exifinterface.media.ExifInterface;
import bk.q;
import com.bbva.notifications.extensions.SalesforceDeepLinkModelExtensionsKt;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KClasses;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: FileMetadata.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u001a\u0018\u00002\u00020\u0001Bq\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\f\u0012\u0018\b\u0002\u0010\u0012\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u00010\u0011¢\u0006\u0004\b-\u0010.J)\u0010\u0005\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006Jw\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\f2\u0018\b\u0002\u0010\u0012\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0016\u001a\u00020\u0015H\u0016R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\b\u0010\u0019R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\t\u0010\u0019R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b$\u0010\"R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b%\u0010 \u001a\u0004\b&\u0010\"R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b'\u0010 \u001a\u0004\b(\u0010\"R'\u0010\u0012\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u00010\u00118\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,¨\u0006/"}, d2 = {"Lokio/FileMetadata;", "", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/reflect/KClass;", "type", SalesforceDeepLinkModelExtensionsKt.EXTRA_KEY, "(Lkotlin/reflect/KClass;)Ljava/lang/Object;", "", "isRegularFile", "isDirectory", "Lokio/Path;", "symlinkTarget", "", "size", "createdAtMillis", "lastModifiedAtMillis", "lastAccessedAtMillis", "", "extras", "copy", "(ZZLokio/Path;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/Map;)Lokio/FileMetadata;", "", "toString", "a", "Z", "()Z", "b", "c", "Lokio/Path;", "getSymlinkTarget", "()Lokio/Path;", "d", "Ljava/lang/Long;", "getSize", "()Ljava/lang/Long;", "e", "getCreatedAtMillis", "f", "getLastModifiedAtMillis", "g", "getLastAccessedAtMillis", "h", "Ljava/util/Map;", "getExtras", "()Ljava/util/Map;", "<init>", "(ZZLokio/Path;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/Map;)V", "okio"}, k = 1, mv = {1, 9, 0})
public final class FileMetadata {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final boolean isRegularFile;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final boolean isDirectory;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Path symlinkTarget;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Long size;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Long createdAtMillis;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Long lastModifiedAtMillis;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Long lastAccessedAtMillis;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Map<KClass<?>, Object> extras;

    public FileMetadata() {
        this(false, false, null, null, null, null, null, null, 255, null);
    }

    @NotNull
    public final FileMetadata copy(boolean isRegularFile, boolean isDirectory, @Nullable Path symlinkTarget, @Nullable Long size, @Nullable Long createdAtMillis, @Nullable Long lastModifiedAtMillis, @Nullable Long lastAccessedAtMillis, @NotNull Map<KClass<?>, ? extends Object> extras) {
        Intrinsics.checkNotNullParameter(extras, "extras");
        return new FileMetadata(isRegularFile, isDirectory, symlinkTarget, size, createdAtMillis, lastModifiedAtMillis, lastAccessedAtMillis, extras);
    }

    @Nullable
    public final <T> T extra(@NotNull KClass<? extends T> type) {
        Intrinsics.checkNotNullParameter(type, "type");
        Object obj = this.extras.get(type);
        if (obj == null) {
            return null;
        }
        return (T) KClasses.cast(type, obj);
    }

    @Nullable
    public final Long getCreatedAtMillis() {
        return this.createdAtMillis;
    }

    @NotNull
    public final Map<KClass<?>, Object> getExtras() {
        return this.extras;
    }

    @Nullable
    public final Long getLastAccessedAtMillis() {
        return this.lastAccessedAtMillis;
    }

    @Nullable
    public final Long getLastModifiedAtMillis() {
        return this.lastModifiedAtMillis;
    }

    @Nullable
    public final Long getSize() {
        return this.size;
    }

    @Nullable
    public final Path getSymlinkTarget() {
        return this.symlinkTarget;
    }

    /* JADX INFO: renamed from: isDirectory, reason: from getter */
    public final boolean getIsDirectory() {
        return this.isDirectory;
    }

    /* JADX INFO: renamed from: isRegularFile, reason: from getter */
    public final boolean getIsRegularFile() {
        return this.isRegularFile;
    }

    @NotNull
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.isRegularFile) {
            arrayList.add("isRegularFile");
        }
        if (this.isDirectory) {
            arrayList.add("isDirectory");
        }
        Long l6 = this.size;
        if (l6 != null) {
            arrayList.add("byteCount=" + l6);
        }
        Long l7 = this.createdAtMillis;
        if (l7 != null) {
            arrayList.add("createdAt=" + l7);
        }
        Long l10 = this.lastModifiedAtMillis;
        if (l10 != null) {
            arrayList.add("lastModifiedAt=" + l10);
        }
        Long l11 = this.lastAccessedAtMillis;
        if (l11 != null) {
            arrayList.add("lastAccessedAt=" + l11);
        }
        Map<KClass<?>, Object> map = this.extras;
        if (!map.isEmpty()) {
            arrayList.add("extras=" + map);
        }
        return CollectionsKt___CollectionsKt.joinToString$default(arrayList, ", ", "FileMetadata(", ")", 0, null, null, 56, null);
    }

    public FileMetadata(boolean z10, boolean z11, @Nullable Path path, @Nullable Long l6, @Nullable Long l7, @Nullable Long l10, @Nullable Long l11, @NotNull Map<KClass<?>, ? extends Object> extras) {
        Intrinsics.checkNotNullParameter(extras, "extras");
        this.isRegularFile = z10;
        this.isDirectory = z11;
        this.symlinkTarget = path;
        this.size = l6;
        this.createdAtMillis = l7;
        this.lastModifiedAtMillis = l10;
        this.lastAccessedAtMillis = l11;
        this.extras = q.toMap(extras);
    }

    public /* synthetic */ FileMetadata(boolean z10, boolean z11, Path path, Long l6, Long l7, Long l10, Long l11, Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) == 0 ? z11 : false, (i10 & 4) != 0 ? null : path, (i10 & 8) != 0 ? null : l6, (i10 & 16) != 0 ? null : l7, (i10 & 32) != 0 ? null : l10, (i10 & 64) == 0 ? l11 : null, (i10 & 128) != 0 ? q.emptyMap() : map);
    }
}
