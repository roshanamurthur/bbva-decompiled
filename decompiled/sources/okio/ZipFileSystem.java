package okio;

import androidx.core.graphics.b;
import com.bbva.plugin.naturalauthentication.NaturalAuthenticationCommandFactory;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.zip.Inflater;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.internal.FixedLengthSource;
import okio.internal.ZipEntry;
import okio.internal.ZipFilesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ZipFileSystem.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B7\b\u0000\u0012\u0006\u0010\u001d\u001a\u00020\u0002\u0012\u0006\u0010\u001e\u001a\u00020\u0001\u0012\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020 0\u001f\u0012\b\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b$\u0010%J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J \u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016J\u0018\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0018\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\nH\u0016J\u0018\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0018\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0002H\u0016J\u0018\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\nH\u0016J\u0018\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0002H\u0016¨\u0006&"}, d2 = {"Lokio/ZipFileSystem;", "Lokio/FileSystem;", "Lokio/Path;", "path", "canonicalize", "Lokio/FileMetadata;", "metadataOrNull", "file", "Lokio/FileHandle;", "openReadOnly", "", "mustCreate", "mustExist", "openReadWrite", "dir", "", NaturalAuthenticationCommandFactory.ACTION_LIST_AUTHENTICATORS, "listOrNull", "Lokio/Source;", "source", "Lokio/Sink;", "sink", "appendingSink", "", "createDirectory", "target", "atomicMove", "delete", "createSymlink", "zipPath", "fileSystem", "", "Lokio/internal/ZipEntry;", "entries", "", "comment", "<init>", "(Lokio/Path;Lokio/FileSystem;Ljava/util/Map;Ljava/lang/String;)V", "okio"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nZipFileSystem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ZipFileSystem.kt\nokio/ZipFileSystem\n+ 2 Okio.kt\nokio/Okio__OkioKt\n*L\n1#1,175:1\n52#2,5:176\n52#2,21:181\n60#2,10:202\n57#2,2:212\n71#2,2:214\n52#2,21:216\n*S KotlinDebug\n*F\n+ 1 ZipFileSystem.kt\nokio/ZipFileSystem\n*L\n102#1:176,5\n103#1:181,21\n102#1:202,10\n102#1:212,2\n102#1:214,2\n132#1:216,21\n*E\n"})
public final class ZipFileSystem extends FileSystem {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final Path f86441d = Path.Companion.get$default(Path.INSTANCE, "/", false, 1, (Object) null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Path f86442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final FileSystem f86443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Map<Path, ZipEntry> f86444c;

    public ZipFileSystem(@NotNull Path zipPath, @NotNull FileSystem fileSystem, @NotNull Map<Path, ZipEntry> entries, @Nullable String str) {
        Intrinsics.checkNotNullParameter(zipPath, "zipPath");
        Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        Intrinsics.checkNotNullParameter(entries, "entries");
        this.f86442a = zipPath;
        this.f86443b = fileSystem;
        this.f86444c = entries;
    }

    public final List<Path> a(Path path, boolean z10) throws IOException {
        ZipEntry zipEntry = this.f86444c.get(f86441d.resolve(path, true));
        if (zipEntry != null) {
            return CollectionsKt___CollectionsKt.toList(zipEntry.getChildren());
        }
        if (z10) {
            throw new IOException(b.c("not a directory: ", path));
        }
        return null;
    }

    @Override // okio.FileSystem
    @NotNull
    public Sink appendingSink(@NotNull Path file, boolean mustExist) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        throw new IOException("zip file systems are read-only");
    }

    @Override // okio.FileSystem
    public void atomicMove(@NotNull Path source, @NotNull Path target) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        throw new IOException("zip file systems are read-only");
    }

    @Override // okio.FileSystem
    @NotNull
    public Path canonicalize(@NotNull Path path) throws FileNotFoundException {
        Intrinsics.checkNotNullParameter(path, "path");
        Path pathResolve = f86441d.resolve(path, true);
        if (this.f86444c.containsKey(pathResolve)) {
            return pathResolve;
        }
        throw new FileNotFoundException(String.valueOf(path));
    }

    @Override // okio.FileSystem
    public void createDirectory(@NotNull Path dir, boolean mustCreate) throws IOException {
        Intrinsics.checkNotNullParameter(dir, "dir");
        throw new IOException("zip file systems are read-only");
    }

    @Override // okio.FileSystem
    public void createSymlink(@NotNull Path source, @NotNull Path target) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        throw new IOException("zip file systems are read-only");
    }

    @Override // okio.FileSystem
    public void delete(@NotNull Path path, boolean mustExist) throws IOException {
        Intrinsics.checkNotNullParameter(path, "path");
        throw new IOException("zip file systems are read-only");
    }

    @Override // okio.FileSystem
    @NotNull
    public List<Path> list(@NotNull Path dir) throws IOException {
        Intrinsics.checkNotNullParameter(dir, "dir");
        List<Path> listA = a(dir, true);
        Intrinsics.checkNotNull(listA);
        return listA;
    }

    @Override // okio.FileSystem
    @Nullable
    public List<Path> listOrNull(@NotNull Path dir) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        return a(dir, false);
    }

    @Override // okio.FileSystem
    @Nullable
    public FileMetadata metadataOrNull(@NotNull Path path) throws Throwable {
        FileMetadata localHeader;
        Throwable th2;
        Intrinsics.checkNotNullParameter(path, "path");
        ZipEntry zipEntry = this.f86444c.get(f86441d.resolve(path, true));
        Throwable th3 = null;
        if (zipEntry == null) {
            return null;
        }
        FileMetadata fileMetadata = new FileMetadata(!zipEntry.getIsDirectory(), zipEntry.getIsDirectory(), null, zipEntry.getIsDirectory() ? null : Long.valueOf(zipEntry.getSize()), null, zipEntry.getLastModifiedAtMillis(), null, null, 128, null);
        if (zipEntry.getAndroidx.constraintlayout.core.motion.utils.TypedValues.CycleType.S_WAVE_OFFSET java.lang.String() == -1) {
            return fileMetadata;
        }
        FileHandle fileHandleOpenReadOnly = this.f86443b.openReadOnly(this.f86442a);
        try {
            BufferedSource bufferedSourceBuffer = Okio.buffer(fileHandleOpenReadOnly.source(zipEntry.getAndroidx.constraintlayout.core.motion.utils.TypedValues.CycleType.S_WAVE_OFFSET java.lang.String()));
            try {
                localHeader = ZipFilesKt.readLocalHeader(bufferedSourceBuffer, fileMetadata);
                if (bufferedSourceBuffer != null) {
                    try {
                        bufferedSourceBuffer.close();
                    } catch (Throwable th4) {
                        th2 = th4;
                    }
                }
                th2 = null;
            } catch (Throwable th5) {
                if (bufferedSourceBuffer != null) {
                    try {
                        bufferedSourceBuffer.close();
                    } catch (Throwable th6) {
                        ak.b.addSuppressed(th5, th6);
                    }
                }
                th2 = th5;
                localHeader = null;
            }
            if (th2 != null) {
                throw th2;
            }
            Intrinsics.checkNotNull(localHeader);
            try {
                fileHandleOpenReadOnly.close();
            } catch (Throwable th7) {
                th3 = th7;
            }
            if (th3 != null) {
                throw th3;
            }
            Intrinsics.checkNotNull(localHeader);
            return localHeader;
        } catch (Throwable th8) {
            if (fileHandleOpenReadOnly != null) {
                try {
                    fileHandleOpenReadOnly.close();
                } catch (Throwable th9) {
                    ak.b.addSuppressed(th8, th9);
                }
            }
            localHeader = null;
            th3 = th8;
        }
    }

    @Override // okio.FileSystem
    @NotNull
    public FileHandle openReadOnly(@NotNull Path file) {
        Intrinsics.checkNotNullParameter(file, "file");
        throw new UnsupportedOperationException("not implemented yet!");
    }

    @Override // okio.FileSystem
    @NotNull
    public FileHandle openReadWrite(@NotNull Path file, boolean mustCreate, boolean mustExist) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        throw new IOException("zip entries are not writable");
    }

    @Override // okio.FileSystem
    @NotNull
    public Sink sink(@NotNull Path file, boolean mustCreate) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        throw new IOException("zip file systems are read-only");
    }

    @Override // okio.FileSystem
    @NotNull
    public Source source(@NotNull Path file) throws Throwable {
        BufferedSource bufferedSourceBuffer;
        Intrinsics.checkNotNullParameter(file, "file");
        ZipEntry zipEntry = this.f86444c.get(f86441d.resolve(file, true));
        if (zipEntry == null) {
            throw new FileNotFoundException(b.c("no such file: ", file));
        }
        FileHandle fileHandleOpenReadOnly = this.f86443b.openReadOnly(this.f86442a);
        Throwable th2 = null;
        try {
            bufferedSourceBuffer = Okio.buffer(fileHandleOpenReadOnly.source(zipEntry.getAndroidx.constraintlayout.core.motion.utils.TypedValues.CycleType.S_WAVE_OFFSET java.lang.String()));
            try {
                fileHandleOpenReadOnly.close();
            } catch (Throwable th3) {
                th2 = th3;
            }
        } catch (Throwable th4) {
            if (fileHandleOpenReadOnly != null) {
                try {
                    fileHandleOpenReadOnly.close();
                } catch (Throwable th5) {
                    ak.b.addSuppressed(th4, th5);
                }
            }
            bufferedSourceBuffer = null;
            th2 = th4;
        }
        if (th2 != null) {
            throw th2;
        }
        Intrinsics.checkNotNull(bufferedSourceBuffer);
        ZipFilesKt.skipLocalHeader(bufferedSourceBuffer);
        return zipEntry.getCompressionMethod() == 0 ? new FixedLengthSource(bufferedSourceBuffer, zipEntry.getSize(), true) : new FixedLengthSource(new InflaterSource(new FixedLengthSource(bufferedSourceBuffer, zipEntry.getCompressedSize(), true), new Inflater(true)), zipEntry.getSize(), false);
    }
}
