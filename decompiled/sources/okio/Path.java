package okio;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mx.openpay.library.domain.util.Constant;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Path.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\f\n\u0002\b\u000b\u0018\u0000 42\b\u0012\u0004\u0012\u00020\u00000\u0001:\u00014B\u0011\b\u0000\u0012\u0006\u0010\u001d\u001a\u00020\u0007¢\u0006\u0004\b2\u00103J\u0018\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0007H\u0087\u0002¢\u0006\u0004\b\u0004\u0010\bJ\u0018\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0087\u0002¢\u0006\u0004\b\u0004\u0010\tJ\u0018\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\nJ\u0018\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\nJ\u0018\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\nJ\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0000J\u0006\u0010\u000e\u001a\u00020\u0000J\u0006\u0010\u0010\u001a\u00020\u000fJ\u0006\u0010\u0012\u001a\u00020\u0011J\u0011\u0010\u0014\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u0000H\u0096\u0002J\u0013\u0010\u0016\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0013H\u0016J\b\u0010\u0018\u001a\u00020\u0002H\u0016R\u001a\u0010\u001d\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010 \u001a\u0004\u0018\u00010\u00008F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00020!8F¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00070!8F¢\u0006\u0006\u001a\u0004\b%\u0010#R\u0011\u0010'\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0011\u0010)\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b)\u0010(R\u0013\u0010+\u001a\u0004\u0018\u00010*8G¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0011\u0010-\u001a\u00020\u00078G¢\u0006\u0006\u001a\u0004\b-\u0010\u001cR\u0011\u0010.\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0013\u00100\u001a\u0004\u0018\u00010\u00008G¢\u0006\u0006\u001a\u0004\b0\u0010\u001fR\u0011\u00101\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b1\u0010(¨\u00065"}, d2 = {"Lokio/Path;", "", "", "child", "resolve", "(Ljava/lang/String;)Lokio/Path;", "div", "Lokio/ByteString;", "(Lokio/ByteString;)Lokio/Path;", "(Lokio/Path;)Lokio/Path;", "", "normalize", "other", "relativeTo", "normalized", "Ljava/io/File;", "toFile", "Ljava/nio/file/Path;", "toNioPath", "", "compareTo", "", "equals", GenerateActivationFormCommand.HASH_CODE, "toString", "p0", "Lokio/ByteString;", "getBytes$okio", "()Lokio/ByteString;", "bytes", "getRoot", "()Lokio/Path;", "root", "", "getSegments", "()Ljava/util/List;", "segments", "getSegmentsBytes", "segmentsBytes", "isAbsolute", "()Z", "isRelative", "", "volumeLetter", "()Ljava/lang/Character;", "nameBytes", "name", "()Ljava/lang/String;", "parent", "isRoot", "<init>", "(Lokio/ByteString;)V", "Companion", "okio"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nPath.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Path.kt\nokio/Path\n+ 2 Path.kt\nokio/internal/-Path\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,132:1\n45#2,3:133\n53#2,28:136\n59#2,22:168\n112#2:190\n117#2:191\n122#2,6:192\n139#2,5:198\n149#2:203\n154#2,25:204\n194#2:229\n199#2,11:230\n204#2,6:241\n199#2,11:247\n204#2,6:258\n228#2,36:264\n268#2:300\n282#2:301\n287#2:302\n292#2:303\n297#2:304\n1549#3:164\n1620#3,3:165\n*S KotlinDebug\n*F\n+ 1 Path.kt\nokio/Path\n*L\n44#1:133,3\n47#1:136,28\n50#1:168,22\n53#1:190\n56#1:191\n60#1:192,6\n64#1:198,5\n68#1:203\n72#1:204,25\n75#1:229\n78#1:230,11\n81#1:241,6\n87#1:247,11\n90#1:258,6\n95#1:264,36\n97#1:300\n104#1:301\n106#1:302\n108#1:303\n110#1:304\n47#1:164\n47#1:165,3\n*E\n"})
public final class Path implements Comparable<Path> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    @NotNull
    public static final String DIRECTORY_SEPARATOR;

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ByteString bytes;

    /* JADX INFO: compiled from: Path.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001b\u0010\u0005\u001a\u00020\u0006*\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\b\nJ\u001b\u0010\u0005\u001a\u00020\u0006*\u00020\u000b2\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\b\nJ\u001b\u0010\f\u001a\u00020\u0006*\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\b\nR\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lokio/Path$Companion;", "", "()V", "DIRECTORY_SEPARATOR", "", "toOkioPath", "Lokio/Path;", "Ljava/io/File;", "normalize", "", "get", "Ljava/nio/file/Path;", "toPath", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Path get$default(Companion companion, String str, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            return companion.get(str, z10);
        }

        @JvmStatic
        @JvmName(name = "get")
        @NotNull
        @JvmOverloads
        public final Path get(@NotNull File file) {
            Intrinsics.checkNotNullParameter(file, "<this>");
            return get$default(this, file, false, 1, (Object) null);
        }

        public static /* synthetic */ Path get$default(Companion companion, File file, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            return companion.get(file, z10);
        }

        @JvmStatic
        @JvmName(name = "get")
        @NotNull
        @JvmOverloads
        public final Path get(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            return get$default(this, str, false, 1, (Object) null);
        }

        public static /* synthetic */ Path get$default(Companion companion, java.nio.file.Path path, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            return companion.get(path, z10);
        }

        @JvmStatic
        @JvmName(name = "get")
        @NotNull
        @JvmOverloads
        public final Path get(@NotNull java.nio.file.Path path) {
            Intrinsics.checkNotNullParameter(path, "<this>");
            return get$default(this, path, false, 1, (Object) null);
        }

        @JvmStatic
        @JvmName(name = "get")
        @NotNull
        @JvmOverloads
        public final Path get(@NotNull String str, boolean z10) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            return okio.internal.Path.commonToPath(str, z10);
        }

        @JvmStatic
        @JvmName(name = "get")
        @NotNull
        @JvmOverloads
        public final Path get(@NotNull File file, boolean z10) {
            Intrinsics.checkNotNullParameter(file, "<this>");
            String string = file.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return get(string, z10);
        }

        @JvmStatic
        @JvmName(name = "get")
        @NotNull
        @JvmOverloads
        public final Path get(@NotNull java.nio.file.Path path, boolean z10) {
            Intrinsics.checkNotNullParameter(path, "<this>");
            return get(path.toString(), z10);
        }
    }

    static {
        String separator = File.separator;
        Intrinsics.checkNotNullExpressionValue(separator, "separator");
        DIRECTORY_SEPARATOR = separator;
    }

    public Path(@NotNull ByteString bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        this.bytes = bytes;
    }

    @JvmStatic
    @JvmName(name = "get")
    @NotNull
    @JvmOverloads
    public static final Path get(@NotNull File file) {
        return INSTANCE.get(file);
    }

    public static /* synthetic */ Path resolve$default(Path path, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return path.resolve(str, z10);
    }

    public boolean equals(@Nullable Object other) {
        return (other instanceof Path) && Intrinsics.areEqual(((Path) other).getBytes(), getBytes());
    }

    @NotNull
    /* JADX INFO: renamed from: getBytes$okio, reason: from getter */
    public final ByteString getBytes() {
        return this.bytes;
    }

    @Nullable
    public final Path getRoot() {
        int iAccess$rootLength = okio.internal.Path.access$rootLength(this);
        if (iAccess$rootLength == -1) {
            return null;
        }
        return new Path(getBytes().substring(0, iAccess$rootLength));
    }

    @NotNull
    public final List<String> getSegments() {
        ArrayList arrayList = new ArrayList();
        int iAccess$rootLength = okio.internal.Path.access$rootLength(this);
        if (iAccess$rootLength == -1) {
            iAccess$rootLength = 0;
        } else if (iAccess$rootLength < getBytes().size() && getBytes().getByte(iAccess$rootLength) == 92) {
            iAccess$rootLength++;
        }
        int size = getBytes().size();
        int i10 = iAccess$rootLength;
        while (iAccess$rootLength < size) {
            if (getBytes().getByte(iAccess$rootLength) == 47 || getBytes().getByte(iAccess$rootLength) == 92) {
                arrayList.add(getBytes().substring(i10, iAccess$rootLength));
                i10 = iAccess$rootLength + 1;
            }
            iAccess$rootLength++;
        }
        if (i10 < getBytes().size()) {
            arrayList.add(getBytes().substring(i10, getBytes().size()));
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((ByteString) it.next()).utf8());
        }
        return arrayList2;
    }

    @NotNull
    public final List<ByteString> getSegmentsBytes() {
        ArrayList arrayList = new ArrayList();
        int iAccess$rootLength = okio.internal.Path.access$rootLength(this);
        if (iAccess$rootLength == -1) {
            iAccess$rootLength = 0;
        } else if (iAccess$rootLength < getBytes().size() && getBytes().getByte(iAccess$rootLength) == 92) {
            iAccess$rootLength++;
        }
        int size = getBytes().size();
        int i10 = iAccess$rootLength;
        while (iAccess$rootLength < size) {
            if (getBytes().getByte(iAccess$rootLength) == 47 || getBytes().getByte(iAccess$rootLength) == 92) {
                arrayList.add(getBytes().substring(i10, iAccess$rootLength));
                i10 = iAccess$rootLength + 1;
            }
            iAccess$rootLength++;
        }
        if (i10 < getBytes().size()) {
            arrayList.add(getBytes().substring(i10, getBytes().size()));
        }
        return arrayList;
    }

    public int hashCode() {
        return getBytes().hashCode();
    }

    public final boolean isAbsolute() {
        return okio.internal.Path.access$rootLength(this) != -1;
    }

    public final boolean isRelative() {
        return okio.internal.Path.access$rootLength(this) == -1;
    }

    public final boolean isRoot() {
        return okio.internal.Path.access$rootLength(this) == getBytes().size();
    }

    @JvmName(name = "name")
    @NotNull
    public final String name() {
        return nameBytes().utf8();
    }

    @JvmName(name = "nameBytes")
    @NotNull
    public final ByteString nameBytes() {
        int iAccess$getIndexOfLastSlash = okio.internal.Path.access$getIndexOfLastSlash(this);
        if (iAccess$getIndexOfLastSlash != -1) {
            return ByteString.substring$default(getBytes(), iAccess$getIndexOfLastSlash + 1, 0, 2, null);
        }
        return (volumeLetter() == null || getBytes().size() != 2) ? getBytes() : ByteString.EMPTY;
    }

    @NotNull
    public final Path normalized() {
        return INSTANCE.get(toString(), true);
    }

    @JvmName(name = "parent")
    @Nullable
    public final Path parent() {
        Path path;
        if (Intrinsics.areEqual(getBytes(), okio.internal.Path.f86468d) || Intrinsics.areEqual(getBytes(), okio.internal.Path.f86465a) || Intrinsics.areEqual(getBytes(), okio.internal.Path.f86466b) || okio.internal.Path.access$lastSegmentIsDotDot(this)) {
            return null;
        }
        int iAccess$getIndexOfLastSlash = okio.internal.Path.access$getIndexOfLastSlash(this);
        if (iAccess$getIndexOfLastSlash != 2 || volumeLetter() == null) {
            if (iAccess$getIndexOfLastSlash == 1 && getBytes().startsWith(okio.internal.Path.f86466b)) {
                return null;
            }
            if (iAccess$getIndexOfLastSlash != -1 || volumeLetter() == null) {
                if (iAccess$getIndexOfLastSlash == -1) {
                    return new Path(okio.internal.Path.f86468d);
                }
                if (iAccess$getIndexOfLastSlash != 0) {
                    return new Path(ByteString.substring$default(getBytes(), 0, iAccess$getIndexOfLastSlash, 1, null));
                }
                path = new Path(ByteString.substring$default(getBytes(), 0, 1, 1, null));
            } else {
                if (getBytes().size() == 2) {
                    return null;
                }
                path = new Path(ByteString.substring$default(getBytes(), 0, 2, 1, null));
            }
        } else {
            if (getBytes().size() == 3) {
                return null;
            }
            path = new Path(ByteString.substring$default(getBytes(), 0, 3, 1, null));
        }
        return path;
    }

    @NotNull
    public final Path relativeTo(@NotNull Path other) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (!Intrinsics.areEqual(getRoot(), other.getRoot())) {
            throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + this + " and " + other).toString());
        }
        List<ByteString> segmentsBytes = getSegmentsBytes();
        List<ByteString> segmentsBytes2 = other.getSegmentsBytes();
        int iMin = Math.min(segmentsBytes.size(), segmentsBytes2.size());
        int i10 = 0;
        while (i10 < iMin && Intrinsics.areEqual(segmentsBytes.get(i10), segmentsBytes2.get(i10))) {
            i10++;
        }
        if (i10 == iMin && getBytes().size() == other.getBytes().size()) {
            return Companion.get$default(INSTANCE, Constant.DOT_STRING, false, 1, (Object) null);
        }
        if (segmentsBytes2.subList(i10, segmentsBytes2.size()).indexOf(okio.internal.Path.f86469e) != -1) {
            throw new IllegalArgumentException(("Impossible relative path to resolve: " + this + " and " + other).toString());
        }
        Buffer buffer = new Buffer();
        ByteString byteStringA = okio.internal.Path.a(other);
        if (byteStringA == null && (byteStringA = okio.internal.Path.a(this)) == null) {
            byteStringA = okio.internal.Path.c(DIRECTORY_SEPARATOR);
        }
        int size = segmentsBytes2.size();
        for (int i11 = i10; i11 < size; i11++) {
            buffer.write(okio.internal.Path.f86469e);
            buffer.write(byteStringA);
        }
        int size2 = segmentsBytes.size();
        while (i10 < size2) {
            buffer.write(segmentsBytes.get(i10));
            buffer.write(byteStringA);
            i10++;
        }
        return okio.internal.Path.toPath(buffer, false);
    }

    @JvmName(name = "resolve")
    @NotNull
    public final Path resolve(@NotNull Path child) {
        Intrinsics.checkNotNullParameter(child, "child");
        return okio.internal.Path.commonResolve(this, child, false);
    }

    @NotNull
    public final File toFile() {
        return new File(toString());
    }

    @NotNull
    public final java.nio.file.Path toNioPath() {
        java.nio.file.Path path = Paths.get(toString(), new String[0]);
        Intrinsics.checkNotNullExpressionValue(path, "get(...)");
        return path;
    }

    @NotNull
    public String toString() {
        return getBytes().utf8();
    }

    @JvmName(name = "volumeLetter")
    @Nullable
    public final Character volumeLetter() {
        if (ByteString.indexOf$default(getBytes(), okio.internal.Path.f86465a, 0, 2, (Object) null) != -1 || getBytes().size() < 2 || getBytes().getByte(1) != 58) {
            return null;
        }
        char c10 = (char) getBytes().getByte(0);
        if (('a' > c10 || c10 >= '{') && ('A' > c10 || c10 >= '[')) {
            return null;
        }
        return Character.valueOf(c10);
    }

    @JvmStatic
    @JvmName(name = "get")
    @NotNull
    @JvmOverloads
    public static final Path get(@NotNull File file, boolean z10) {
        return INSTANCE.get(file, z10);
    }

    public static /* synthetic */ Path resolve$default(Path path, ByteString byteString, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return path.resolve(byteString, z10);
    }

    @Override // java.lang.Comparable
    public int compareTo(@NotNull Path other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return getBytes().compareTo(other.getBytes());
    }

    @NotNull
    public final Path resolve(@NotNull Path child, boolean normalize) {
        Intrinsics.checkNotNullParameter(child, "child");
        return okio.internal.Path.commonResolve(this, child, normalize);
    }

    @JvmStatic
    @JvmName(name = "get")
    @NotNull
    @JvmOverloads
    public static final Path get(@NotNull String str) {
        return INSTANCE.get(str);
    }

    public static /* synthetic */ Path resolve$default(Path path, Path path2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return path.resolve(path2, z10);
    }

    @JvmName(name = "resolve")
    @NotNull
    public final Path resolve(@NotNull String child) {
        Intrinsics.checkNotNullParameter(child, "child");
        return okio.internal.Path.commonResolve(this, okio.internal.Path.toPath(new Buffer().writeUtf8(child), false), false);
    }

    @JvmStatic
    @JvmName(name = "get")
    @NotNull
    @JvmOverloads
    public static final Path get(@NotNull String str, boolean z10) {
        return INSTANCE.get(str, z10);
    }

    @JvmStatic
    @JvmName(name = "get")
    @NotNull
    @JvmOverloads
    public static final Path get(@NotNull java.nio.file.Path path) {
        return INSTANCE.get(path);
    }

    @JvmName(name = "resolve")
    @NotNull
    public final Path resolve(@NotNull ByteString child) {
        Intrinsics.checkNotNullParameter(child, "child");
        return okio.internal.Path.commonResolve(this, okio.internal.Path.toPath(new Buffer().write(child), false), false);
    }

    @JvmStatic
    @JvmName(name = "get")
    @NotNull
    @JvmOverloads
    public static final Path get(@NotNull java.nio.file.Path path, boolean z10) {
        return INSTANCE.get(path, z10);
    }

    @NotNull
    public final Path resolve(@NotNull String child, boolean normalize) {
        Intrinsics.checkNotNullParameter(child, "child");
        return okio.internal.Path.commonResolve(this, okio.internal.Path.toPath(new Buffer().writeUtf8(child), false), normalize);
    }

    @NotNull
    public final Path resolve(@NotNull ByteString child, boolean normalize) {
        Intrinsics.checkNotNullParameter(child, "child");
        return okio.internal.Path.commonResolve(this, okio.internal.Path.toPath(new Buffer().write(child), false), normalize);
    }
}
