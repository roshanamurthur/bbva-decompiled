package okio;

import bk.f;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.plugin.naturalauthentication.NaturalAuthenticationCommandFactory;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ForwardingFileSystem.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010(\u001a\u00020\u0001¢\u0006\u0004\b*\u0010+J \u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H\u0016J\u0018\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u0002H\u0016J\u001e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u00122\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0002H\u0016J \u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0010H\u0016J\u0010\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u0002H\u0016J\u0018\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0010H\u0016J\u0018\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0010H\u0016J\u0018\u0010 \u001a\u00020\u001f2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0010H\u0016J\u0018\u0010\"\u001a\u00020\u001f2\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u0002H\u0016J\u0018\u0010#\u001a\u00020\u001f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0010H\u0016J\u0018\u0010$\u001a\u00020\u001f2\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u0002H\u0016J\b\u0010%\u001a\u00020\u0004H\u0016R\u0017\u0010(\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006,"}, d2 = {"Lokio/ForwardingFileSystem;", "Lokio/FileSystem;", "Lokio/Path;", "path", "", "functionName", "parameterName", "onPathParameter", "onPathResult", "canonicalize", "Lokio/FileMetadata;", "metadataOrNull", "dir", "", NaturalAuthenticationCommandFactory.ACTION_LIST_AUTHENTICATORS, "listOrNull", "", "followSymlinks", "Lkotlin/sequences/Sequence;", "listRecursively", "file", "Lokio/FileHandle;", "openReadOnly", "mustCreate", "mustExist", "openReadWrite", "Lokio/Source;", "source", "Lokio/Sink;", "sink", "appendingSink", "", "createDirectory", "target", "atomicMove", "delete", "createSymlink", "toString", "a", "Lokio/FileSystem;", "delegate", "()Lokio/FileSystem;", "<init>", "(Lokio/FileSystem;)V", "okio"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nForwardingFileSystem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ForwardingFileSystem.kt\nokio/ForwardingFileSystem\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,243:1\n1620#2,3:244\n1620#2,3:247\n*S KotlinDebug\n*F\n+ 1 ForwardingFileSystem.kt\nokio/ForwardingFileSystem\n*L\n166#1:244,3\n174#1:247,3\n*E\n"})
public abstract class ForwardingFileSystem extends FileSystem {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final FileSystem delegate;

    /* JADX INFO: compiled from: ForwardingFileSystem.kt */
    public static final class a extends Lambda implements Function1<Path, Path> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Path invoke(Path path) {
            Path it = path;
            Intrinsics.checkNotNullParameter(it, "it");
            return ForwardingFileSystem.this.onPathResult(it, "listRecursively");
        }
    }

    public ForwardingFileSystem(@NotNull FileSystem delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
    }

    @Override // okio.FileSystem
    @NotNull
    public Sink appendingSink(@NotNull Path file, boolean mustExist) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        return this.delegate.appendingSink(onPathParameter(file, "appendingSink", "file"), mustExist);
    }

    @Override // okio.FileSystem
    public void atomicMove(@NotNull Path source, @NotNull Path target) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        this.delegate.atomicMove(onPathParameter(source, "atomicMove", "source"), onPathParameter(target, "atomicMove", "target"));
    }

    @Override // okio.FileSystem
    @NotNull
    public Path canonicalize(@NotNull Path path) throws IOException {
        Intrinsics.checkNotNullParameter(path, "path");
        return onPathResult(this.delegate.canonicalize(onPathParameter(path, "canonicalize", "path")), "canonicalize");
    }

    @Override // okio.FileSystem
    public void createDirectory(@NotNull Path dir, boolean mustCreate) throws IOException {
        Intrinsics.checkNotNullParameter(dir, "dir");
        this.delegate.createDirectory(onPathParameter(dir, "createDirectory", "dir"), mustCreate);
    }

    @Override // okio.FileSystem
    public void createSymlink(@NotNull Path source, @NotNull Path target) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        this.delegate.createSymlink(onPathParameter(source, "createSymlink", "source"), onPathParameter(target, "createSymlink", "target"));
    }

    @JvmName(name = "delegate")
    @NotNull
    /* JADX INFO: renamed from: delegate, reason: from getter */
    public final FileSystem getDelegate() {
        return this.delegate;
    }

    @Override // okio.FileSystem
    public void delete(@NotNull Path path, boolean mustExist) throws IOException {
        Intrinsics.checkNotNullParameter(path, "path");
        this.delegate.delete(onPathParameter(path, "delete", "path"), mustExist);
    }

    @Override // okio.FileSystem
    @NotNull
    public List<Path> list(@NotNull Path dir) throws IOException {
        Intrinsics.checkNotNullParameter(dir, "dir");
        List<Path> list = this.delegate.list(onPathParameter(dir, NaturalAuthenticationCommandFactory.ACTION_LIST_AUTHENTICATORS, "dir"));
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(onPathResult((Path) it.next(), NaturalAuthenticationCommandFactory.ACTION_LIST_AUTHENTICATORS));
        }
        f.sort(arrayList);
        return arrayList;
    }

    @Override // okio.FileSystem
    @Nullable
    public List<Path> listOrNull(@NotNull Path dir) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        List<Path> listListOrNull = this.delegate.listOrNull(onPathParameter(dir, "listOrNull", "dir"));
        if (listListOrNull == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listListOrNull.iterator();
        while (it.hasNext()) {
            arrayList.add(onPathResult((Path) it.next(), "listOrNull"));
        }
        f.sort(arrayList);
        return arrayList;
    }

    @Override // okio.FileSystem
    @NotNull
    public Sequence<Path> listRecursively(@NotNull Path dir, boolean followSymlinks) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        return SequencesKt___SequencesKt.map(this.delegate.listRecursively(onPathParameter(dir, "listRecursively", "dir"), followSymlinks), new a());
    }

    @Override // okio.FileSystem
    @Nullable
    public FileMetadata metadataOrNull(@NotNull Path path) throws IOException {
        Intrinsics.checkNotNullParameter(path, "path");
        FileMetadata fileMetadataMetadataOrNull = this.delegate.metadataOrNull(onPathParameter(path, "metadataOrNull", "path"));
        if (fileMetadataMetadataOrNull == null) {
            return null;
        }
        return fileMetadataMetadataOrNull.getSymlinkTarget() == null ? fileMetadataMetadataOrNull : fileMetadataMetadataOrNull.copy((251 & 1) != 0 ? fileMetadataMetadataOrNull.isRegularFile : false, (251 & 2) != 0 ? fileMetadataMetadataOrNull.isDirectory : false, (251 & 4) != 0 ? fileMetadataMetadataOrNull.symlinkTarget : onPathResult(fileMetadataMetadataOrNull.getSymlinkTarget(), "metadataOrNull"), (251 & 8) != 0 ? fileMetadataMetadataOrNull.size : null, (251 & 16) != 0 ? fileMetadataMetadataOrNull.createdAtMillis : null, (251 & 32) != 0 ? fileMetadataMetadataOrNull.lastModifiedAtMillis : null, (251 & 64) != 0 ? fileMetadataMetadataOrNull.lastAccessedAtMillis : null, (251 & 128) != 0 ? fileMetadataMetadataOrNull.extras : null);
    }

    @NotNull
    public Path onPathParameter(@NotNull Path path, @NotNull String functionName, @NotNull String parameterName) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(functionName, "functionName");
        Intrinsics.checkNotNullParameter(parameterName, "parameterName");
        return path;
    }

    @NotNull
    public Path onPathResult(@NotNull Path path, @NotNull String functionName) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(functionName, "functionName");
        return path;
    }

    @Override // okio.FileSystem
    @NotNull
    public FileHandle openReadOnly(@NotNull Path file) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        return this.delegate.openReadOnly(onPathParameter(file, "openReadOnly", "file"));
    }

    @Override // okio.FileSystem
    @NotNull
    public FileHandle openReadWrite(@NotNull Path file, boolean mustCreate, boolean mustExist) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        return this.delegate.openReadWrite(onPathParameter(file, "openReadWrite", "file"), mustCreate, mustExist);
    }

    @Override // okio.FileSystem
    @NotNull
    public Sink sink(@NotNull Path file, boolean mustCreate) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        return this.delegate.sink(onPathParameter(file, "sink", "file"), mustCreate);
    }

    @Override // okio.FileSystem
    @NotNull
    public Source source(@NotNull Path file) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        return this.delegate.source(onPathParameter(file, "source", "file"));
    }

    @NotNull
    public String toString() {
        return Reflection.getOrCreateKotlinClass(getClass()).getSimpleName() + RootService.OPEN_BRACKET + this.delegate + RootService.CLOSE_BRACKET;
    }
}
