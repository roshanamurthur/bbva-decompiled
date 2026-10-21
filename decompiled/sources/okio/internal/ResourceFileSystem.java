package okio.internal;

import bk.g;
import com.bbva.plugin.naturalauthentication.NaturalAuthenticationCommandFactory;
import com.fasterxml.jackson.core.JsonPointer;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.l;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import mx.openpay.library.data.util.CommandConstants;
import okio.FileHandle;
import okio.FileMetadata;
import okio.FileSystem;
import okio.Okio;
import okio.Path;
import okio.Sink;
import okio.Source;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ResourceFileSystem.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0001#B#\b\u0000\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010\u001f\u001a\u00020\f\u0012\b\b\u0002\u0010 \u001a\u00020\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016J \u0010\u000f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0016J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0018\u0010\u0015\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016J\u0018\u0010\u0016\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\fH\u0016J\u0018\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016J\u0018\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0002H\u0016J\u0018\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\fH\u0016J\u0018\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0002H\u0016¨\u0006$"}, d2 = {"Lokio/internal/ResourceFileSystem;", "Lokio/FileSystem;", "Lokio/Path;", "path", "canonicalize", "dir", "", NaturalAuthenticationCommandFactory.ACTION_LIST_AUTHENTICATORS, "listOrNull", "file", "Lokio/FileHandle;", "openReadOnly", "", "mustCreate", "mustExist", "openReadWrite", "Lokio/FileMetadata;", "metadataOrNull", "Lokio/Source;", "source", "Lokio/Sink;", "sink", "appendingSink", "", "createDirectory", "target", "atomicMove", "delete", "createSymlink", "Ljava/lang/ClassLoader;", "classLoader", "indexEagerly", "systemFileSystem", "<init>", "(Ljava/lang/ClassLoader;ZLokio/FileSystem;)V", "a", "okio"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nResourceFileSystem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResourceFileSystem.kt\nokio/internal/ResourceFileSystem\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,210:1\n766#2:211\n857#2,2:212\n1549#2:214\n1620#2,3:215\n766#2:218\n857#2,2:219\n1549#2:221\n1620#2,3:222\n1603#2,9:225\n1855#2:234\n1856#2:236\n1612#2:237\n1603#2,9:238\n1855#2:247\n1856#2:249\n1612#2:250\n1#3:235\n1#3:248\n*S KotlinDebug\n*F\n+ 1 ResourceFileSystem.kt\nokio/internal/ResourceFileSystem\n*L\n74#1:211\n74#1:212,2\n75#1:214\n75#1:215,3\n90#1:218\n90#1:219,2\n91#1:221\n91#1:222,3\n173#1:225,9\n173#1:234\n173#1:236\n173#1:237\n174#1:238,9\n174#1:247\n174#1:249\n174#1:250\n173#1:235\n174#1:248\n*E\n"})
public final class ResourceFileSystem extends FileSystem {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f86473d = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final Path f86474e = Path.Companion.get$default(Path.INSTANCE, "/", false, 1, (Object) null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ClassLoader f86475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final FileSystem f86476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Lazy f86477c;

    /* JADX INFO: compiled from: ResourceFileSystem.kt */
    public static final class a {
        public static final boolean a(a aVar, Path path) {
            aVar.getClass();
            return !l.endsWith(path.name(), ".class", true);
        }

        @NotNull
        public static Path b(@NotNull Path path, @NotNull Path base) {
            Intrinsics.checkNotNullParameter(path, "<this>");
            Intrinsics.checkNotNullParameter(base, "base");
            return ResourceFileSystem.f86474e.resolve(l.replace$default(StringsKt__StringsKt.removePrefix(path.toString(), (CharSequence) base.toString()), AbstractJsonLexerKt.STRING_ESC, JsonPointer.SEPARATOR, false, 4, (Object) null));
        }
    }

    /* JADX INFO: compiled from: ResourceFileSystem.kt */
    public static final class b extends Lambda implements Function0<List<? extends Pair<? extends FileSystem, ? extends Path>>> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends Pair<? extends FileSystem, ? extends Path>> invoke() {
            ResourceFileSystem resourceFileSystem = ResourceFileSystem.this;
            return ResourceFileSystem.access$toClasspathRoots(resourceFileSystem, resourceFileSystem.f86475a);
        }
    }

    public /* synthetic */ ResourceFileSystem(ClassLoader classLoader, boolean z10, FileSystem fileSystem, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(classLoader, z10, (i10 & 4) != 0 ? FileSystem.SYSTEM : fileSystem);
    }

    public static final List access$toClasspathRoots(ResourceFileSystem resourceFileSystem, ClassLoader classLoader) throws IOException {
        FileSystem fileSystem;
        int iLastIndexOf$default;
        Pair pair;
        resourceFileSystem.getClass();
        Enumeration<URL> resources = classLoader.getResources("");
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        ArrayList list = Collections.list(resources);
        Intrinsics.checkNotNullExpressionValue(list, "list(this)");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            fileSystem = resourceFileSystem.f86476b;
            if (!zHasNext) {
                break;
            }
            URL url = (URL) it.next();
            Intrinsics.checkNotNull(url);
            Pair pair2 = Intrinsics.areEqual(url.getProtocol(), "file") ? TuplesKt.to(fileSystem, Path.Companion.get$default(Path.INSTANCE, new File(url.toURI()), false, 1, (Object) null)) : null;
            if (pair2 != null) {
                arrayList.add(pair2);
            }
        }
        Enumeration<URL> resources2 = classLoader.getResources("META-INF/MANIFEST.MF");
        Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
        ArrayList<URL> list2 = Collections.list(resources2);
        Intrinsics.checkNotNullExpressionValue(list2, "list(this)");
        ArrayList arrayList2 = new ArrayList();
        for (URL url2 : list2) {
            Intrinsics.checkNotNull(url2);
            String string = url2.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            if (l.startsWith$default(string, "jar:file:", false, 2, null) && (iLastIndexOf$default = StringsKt__StringsKt.lastIndexOf$default((CharSequence) string, CommandConstants.Z11_EXCLAMATION_MARK, 0, false, 6, (Object) null)) != -1) {
                Path.Companion companion = Path.INSTANCE;
                String strSubstring = string.substring(4, iLastIndexOf$default);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                pair = TuplesKt.to(ZipFilesKt.openZip(Path.Companion.get$default(companion, new File(URI.create(strSubstring)), false, 1, (Object) null), fileSystem, okio.internal.a.f86500p0), f86474e);
            } else {
                pair = null;
            }
            if (pair != null) {
                arrayList2.add(pair);
            }
        }
        return CollectionsKt___CollectionsKt.plus((Collection) arrayList, (Iterable) arrayList2);
    }

    @Override // okio.FileSystem
    @NotNull
    public Sink appendingSink(@NotNull Path file, boolean mustExist) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        throw new IOException(this + " is read-only");
    }

    @Override // okio.FileSystem
    public void atomicMove(@NotNull Path source, @NotNull Path target) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        throw new IOException(this + " is read-only");
    }

    @Override // okio.FileSystem
    @NotNull
    public Path canonicalize(@NotNull Path path) {
        Intrinsics.checkNotNullParameter(path, "path");
        return f86474e.resolve(path, true);
    }

    @Override // okio.FileSystem
    public void createDirectory(@NotNull Path dir, boolean mustCreate) throws IOException {
        Intrinsics.checkNotNullParameter(dir, "dir");
        throw new IOException(this + " is read-only");
    }

    @Override // okio.FileSystem
    public void createSymlink(@NotNull Path source, @NotNull Path target) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        throw new IOException(this + " is read-only");
    }

    @Override // okio.FileSystem
    public void delete(@NotNull Path path, boolean mustExist) throws IOException {
        Intrinsics.checkNotNullParameter(path, "path");
        throw new IOException(this + " is read-only");
    }

    @Override // okio.FileSystem
    @NotNull
    public List<Path> list(@NotNull Path dir) throws FileNotFoundException {
        Intrinsics.checkNotNullParameter(dir, "dir");
        Path path = f86474e;
        String string = path.resolve(dir, true).relativeTo(path).toString();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z10 = false;
        for (Pair pair : (List) this.f86477c.getValue()) {
            FileSystem fileSystem = (FileSystem) pair.component1();
            Path path2 = (Path) pair.component2();
            try {
                List<Path> list = fileSystem.list(path2.resolve(string));
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = list.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    a aVar = f86473d;
                    if (!zHasNext) {
                        break;
                    }
                    Object next = it.next();
                    if (a.a(aVar, (Path) next)) {
                        arrayList.add(next);
                    }
                }
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(a.b((Path) it2.next(), path2));
                }
                g.addAll(linkedHashSet, arrayList2);
                z10 = true;
            } catch (IOException unused) {
            }
        }
        if (z10) {
            return CollectionsKt___CollectionsKt.toList(linkedHashSet);
        }
        throw new FileNotFoundException(androidx.core.graphics.b.c("file not found: ", dir));
    }

    @Override // okio.FileSystem
    @Nullable
    public List<Path> listOrNull(@NotNull Path dir) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        Path path = f86474e;
        String string = path.resolve(dir, true).relativeTo(path).toString();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = ((List) this.f86477c.getValue()).iterator();
        boolean z10 = false;
        while (true) {
            ArrayList arrayList = null;
            if (!it.hasNext()) {
                break;
            }
            Pair pair = (Pair) it.next();
            FileSystem fileSystem = (FileSystem) pair.component1();
            Path path2 = (Path) pair.component2();
            List<Path> listListOrNull = fileSystem.listOrNull(path2.resolve(string));
            if (listListOrNull != null) {
                ArrayList arrayList2 = new ArrayList();
                Iterator<T> it2 = listListOrNull.iterator();
                while (true) {
                    boolean zHasNext = it2.hasNext();
                    a aVar = f86473d;
                    if (!zHasNext) {
                        break;
                    }
                    Object next = it2.next();
                    if (a.a(aVar, (Path) next)) {
                        arrayList2.add(next);
                    }
                }
                ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(a.b((Path) it3.next(), path2));
                }
                arrayList = arrayList3;
            }
            if (arrayList != null) {
                g.addAll(linkedHashSet, arrayList);
                z10 = true;
            }
        }
        if (z10) {
            return CollectionsKt___CollectionsKt.toList(linkedHashSet);
        }
        return null;
    }

    @Override // okio.FileSystem
    @Nullable
    public FileMetadata metadataOrNull(@NotNull Path path) throws IOException {
        Intrinsics.checkNotNullParameter(path, "path");
        if (!a.a(f86473d, path)) {
            return null;
        }
        Path path2 = f86474e;
        String string = path2.resolve(path, true).relativeTo(path2).toString();
        for (Pair pair : (List) this.f86477c.getValue()) {
            FileMetadata fileMetadataMetadataOrNull = ((FileSystem) pair.component1()).metadataOrNull(((Path) pair.component2()).resolve(string));
            if (fileMetadataMetadataOrNull != null) {
                return fileMetadataMetadataOrNull;
            }
        }
        return null;
    }

    @Override // okio.FileSystem
    @NotNull
    public FileHandle openReadOnly(@NotNull Path file) throws FileNotFoundException {
        Intrinsics.checkNotNullParameter(file, "file");
        if (!a.a(f86473d, file)) {
            throw new FileNotFoundException(androidx.core.graphics.b.c("file not found: ", file));
        }
        Path path = f86474e;
        String string = path.resolve(file, true).relativeTo(path).toString();
        for (Pair pair : (List) this.f86477c.getValue()) {
            try {
                return ((FileSystem) pair.component1()).openReadOnly(((Path) pair.component2()).resolve(string));
            } catch (FileNotFoundException unused) {
            }
        }
        throw new FileNotFoundException(androidx.core.graphics.b.c("file not found: ", file));
    }

    @Override // okio.FileSystem
    @NotNull
    public FileHandle openReadWrite(@NotNull Path file, boolean mustCreate, boolean mustExist) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        throw new IOException("resources are not writable");
    }

    @Override // okio.FileSystem
    @NotNull
    public Sink sink(@NotNull Path file, boolean mustCreate) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        throw new IOException(this + " is read-only");
    }

    @Override // okio.FileSystem
    @NotNull
    public Source source(@NotNull Path file) throws FileNotFoundException {
        Source source;
        Intrinsics.checkNotNullParameter(file, "file");
        if (!a.a(f86473d, file)) {
            throw new FileNotFoundException(androidx.core.graphics.b.c("file not found: ", file));
        }
        Path path = f86474e;
        InputStream resourceAsStream = this.f86475a.getResourceAsStream(Path.resolve$default(path, file, false, 2, (Object) null).relativeTo(path).toString());
        if (resourceAsStream == null || (source = Okio.source(resourceAsStream)) == null) {
            throw new FileNotFoundException(androidx.core.graphics.b.c("file not found: ", file));
        }
        return source;
    }

    public ResourceFileSystem(@NotNull ClassLoader classLoader, boolean z10, @NotNull FileSystem systemFileSystem) {
        Intrinsics.checkNotNullParameter(classLoader, "classLoader");
        Intrinsics.checkNotNullParameter(systemFileSystem, "systemFileSystem");
        this.f86475a = classLoader;
        this.f86476b = systemFileSystem;
        Lazy lazy = LazyKt__LazyJVMKt.lazy(new b());
        this.f86477c = lazy;
        if (z10) {
            ((List) lazy.getValue()).size();
        }
    }
}
