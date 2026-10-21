package okio.internal;

import androidx.appcompat.widget.g0;
import androidx.camera.core.processing.f;
import bk.g;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mx.openpay.library.domain.util.Constant;
import okio.Buffer;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: okio.internal.-Path, reason: invalid class name */
/* JADX INFO: compiled from: Path.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\u001a\u000f\u0010\u0001\u001a\u0004\u0018\u00010\u0000*\u00020\u0000H\u0080\b\u001a\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\u00020\u0000H\u0080\b\u001a\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002*\u00020\u0000H\u0080\b\u001a\r\u0010\b\u001a\u00020\u0007*\u00020\u0000H\u0080\b\u001a\r\u0010\t\u001a\u00020\u0007*\u00020\u0000H\u0080\b\u001a\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n*\u00020\u0000H\u0080\b¢\u0006\u0004\b\u000b\u0010\f\u001a\r\u0010\r\u001a\u00020\u0005*\u00020\u0000H\u0080\b\u001a\r\u0010\u000e\u001a\u00020\u0003*\u00020\u0000H\u0080\b\u001a\u000f\u0010\u000f\u001a\u0004\u0018\u00010\u0000*\u00020\u0000H\u0080\b\u001a\r\u0010\u0010\u001a\u00020\u0007*\u00020\u0000H\u0080\b\u001a\u001d\u0010\u0013\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0007H\u0080\b\u001a\u001d\u0010\u0013\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0007H\u0080\b\u001a\u001d\u0010\u0013\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u0007H\u0080\b\u001a\u001c\u0010\u0013\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0007H\u0000\u001a\u0015\u0010\u0016\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0000H\u0080\b\u001a\r\u0010\u0017\u001a\u00020\u0000*\u00020\u0000H\u0080\b\u001a\u0015\u0010\u0019\u001a\u00020\u0018*\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0000H\u0080\b\u001a\u0017\u0010\u001b\u001a\u00020\u0007*\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u001aH\u0080\b\u001a\r\u0010\u001c\u001a\u00020\u0018*\u00020\u0000H\u0080\b\u001a\r\u0010\u001d\u001a\u00020\u0003*\u00020\u0000H\u0080\b\u001a\u0014\u0010\u001e\u001a\u00020\u0000*\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0007H\u0000\u001a\u0014\u0010\u001f\u001a\u00020\u0000*\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u0007H\u0000¨\u0006 "}, d2 = {"Lokio/Path;", "commonRoot", "", "", "commonSegments", "Lokio/ByteString;", "commonSegmentsBytes", "", "commonIsAbsolute", "commonIsRelative", "", "commonVolumeLetter", "(Lokio/Path;)Ljava/lang/Character;", "commonNameBytes", "commonName", "commonParent", "commonIsRoot", "child", "normalize", "commonResolve", "Lokio/Buffer;", "other", "commonRelativeTo", "commonNormalized", "", "commonCompareTo", "", "commonEquals", "commonHashCode", "commonToString", "commonToPath", "toPath", "okio"}, k = 2, mv = {1, 9, 0})
@JvmName(name = "-Path")
@SourceDebugExtension({"SMAP\nPath.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Path.kt\nokio/internal/-Path\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,406:1\n59#1,22:407\n209#1:433\n209#1:434\n1549#2:429\n1620#2,3:430\n*S KotlinDebug\n*F\n+ 1 Path.kt\nokio/internal/-Path\n*L\n53#1:407,22\n199#1:433\n204#1:434\n53#1:429\n53#1:430,3\n*E\n"})
public final class Path {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final ByteString f86465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final ByteString f86466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final ByteString f86467c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final ByteString f86468d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final ByteString f86469e;

    static {
        ByteString.Companion companion = ByteString.INSTANCE;
        f86465a = companion.encodeUtf8("/");
        f86466b = companion.encodeUtf8("\\");
        f86467c = companion.encodeUtf8("/\\");
        f86468d = companion.encodeUtf8(Constant.DOT_STRING);
        f86469e = companion.encodeUtf8("..");
    }

    public static final ByteString a(okio.Path path) {
        ByteString bytes = path.getBytes();
        ByteString byteString = f86465a;
        if (ByteString.indexOf$default(bytes, byteString, 0, 2, (Object) null) != -1) {
            return byteString;
        }
        ByteString bytes2 = path.getBytes();
        ByteString byteString2 = f86466b;
        if (ByteString.indexOf$default(bytes2, byteString2, 0, 2, (Object) null) != -1) {
            return byteString2;
        }
        return null;
    }

    public static final int access$getIndexOfLastSlash(okio.Path path) {
        int iLastIndexOf$default = ByteString.lastIndexOf$default(path.getBytes(), f86465a, 0, 2, (Object) null);
        return iLastIndexOf$default != -1 ? iLastIndexOf$default : ByteString.lastIndexOf$default(path.getBytes(), f86466b, 0, 2, (Object) null);
    }

    public static final boolean access$lastSegmentIsDotDot(okio.Path path) {
        if (path.getBytes().endsWith(f86469e)) {
            return path.getBytes().size() == 2 || path.getBytes().rangeEquals(path.getBytes().size() + (-3), f86465a, 0, 1) || path.getBytes().rangeEquals(path.getBytes().size() + (-3), f86466b, 0, 1);
        }
        return false;
    }

    public static final int access$rootLength(okio.Path path) {
        if (path.getBytes().size() == 0) {
            return -1;
        }
        if (path.getBytes().getByte(0) != 47) {
            if (path.getBytes().getByte(0) != 92) {
                if (path.getBytes().size() <= 2 || path.getBytes().getByte(1) != 58 || path.getBytes().getByte(2) != 92) {
                    return -1;
                }
                char c10 = (char) path.getBytes().getByte(0);
                return (('a' > c10 || c10 >= '{') && ('A' > c10 || c10 >= '[')) ? -1 : 3;
            }
            if (path.getBytes().size() > 2 && path.getBytes().getByte(1) == 92) {
                int iIndexOf = path.getBytes().indexOf(f86466b, 2);
                return iIndexOf == -1 ? path.getBytes().size() : iIndexOf;
            }
        }
        return 1;
    }

    public static final ByteString b(byte b10) {
        if (b10 == 47) {
            return f86465a;
        }
        if (b10 == 92) {
            return f86466b;
        }
        throw new IllegalArgumentException(g0.c("not a directory separator: ", b10));
    }

    public static final ByteString c(String str) {
        if (Intrinsics.areEqual(str, "/")) {
            return f86465a;
        }
        if (Intrinsics.areEqual(str, "\\")) {
            return f86466b;
        }
        throw new IllegalArgumentException(f.d("not a directory separator: ", str));
    }

    public static final int commonCompareTo(@NotNull okio.Path path, @NotNull okio.Path other) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return path.getBytes().compareTo(other.getBytes());
    }

    public static final boolean commonEquals(@NotNull okio.Path path, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        return (obj instanceof okio.Path) && Intrinsics.areEqual(((okio.Path) obj).getBytes(), path.getBytes());
    }

    public static final int commonHashCode(@NotNull okio.Path path) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        return path.getBytes().hashCode();
    }

    public static final boolean commonIsAbsolute(@NotNull okio.Path path) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        return access$rootLength(path) != -1;
    }

    public static final boolean commonIsRelative(@NotNull okio.Path path) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        return access$rootLength(path) == -1;
    }

    public static final boolean commonIsRoot(@NotNull okio.Path path) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        return access$rootLength(path) == path.getBytes().size();
    }

    @NotNull
    public static final String commonName(@NotNull okio.Path path) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        return path.nameBytes().utf8();
    }

    @NotNull
    public static final ByteString commonNameBytes(@NotNull okio.Path path) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        int iAccess$getIndexOfLastSlash = access$getIndexOfLastSlash(path);
        if (iAccess$getIndexOfLastSlash != -1) {
            return ByteString.substring$default(path.getBytes(), iAccess$getIndexOfLastSlash + 1, 0, 2, null);
        }
        return (path.volumeLetter() == null || path.getBytes().size() != 2) ? path.getBytes() : ByteString.EMPTY;
    }

    @NotNull
    public static final okio.Path commonNormalized(@NotNull okio.Path path) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        return okio.Path.INSTANCE.get(path.toString(), true);
    }

    @Nullable
    public static final okio.Path commonParent(@NotNull okio.Path path) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        if (Intrinsics.areEqual(path.getBytes(), f86468d) || Intrinsics.areEqual(path.getBytes(), f86465a) || Intrinsics.areEqual(path.getBytes(), f86466b) || access$lastSegmentIsDotDot(path)) {
            return null;
        }
        int iAccess$getIndexOfLastSlash = access$getIndexOfLastSlash(path);
        if (iAccess$getIndexOfLastSlash == 2 && path.volumeLetter() != null) {
            if (path.getBytes().size() == 3) {
                return null;
            }
            return new okio.Path(ByteString.substring$default(path.getBytes(), 0, 3, 1, null));
        }
        if (iAccess$getIndexOfLastSlash == 1 && path.getBytes().startsWith(f86466b)) {
            return null;
        }
        if (iAccess$getIndexOfLastSlash != -1 || path.volumeLetter() == null) {
            if (iAccess$getIndexOfLastSlash == -1) {
                return new okio.Path(f86468d);
            }
            return iAccess$getIndexOfLastSlash == 0 ? new okio.Path(ByteString.substring$default(path.getBytes(), 0, 1, 1, null)) : new okio.Path(ByteString.substring$default(path.getBytes(), 0, iAccess$getIndexOfLastSlash, 1, null));
        }
        if (path.getBytes().size() == 2) {
            return null;
        }
        return new okio.Path(ByteString.substring$default(path.getBytes(), 0, 2, 1, null));
    }

    @NotNull
    public static final okio.Path commonRelativeTo(@NotNull okio.Path path, @NotNull okio.Path other) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        if (!Intrinsics.areEqual(path.getRoot(), other.getRoot())) {
            throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + path + " and " + other).toString());
        }
        List<ByteString> segmentsBytes = path.getSegmentsBytes();
        List<ByteString> segmentsBytes2 = other.getSegmentsBytes();
        int iMin = Math.min(segmentsBytes.size(), segmentsBytes2.size());
        int i10 = 0;
        while (i10 < iMin && Intrinsics.areEqual(segmentsBytes.get(i10), segmentsBytes2.get(i10))) {
            i10++;
        }
        if (i10 == iMin && path.getBytes().size() == other.getBytes().size()) {
            return okio.Path.Companion.get$default(okio.Path.INSTANCE, Constant.DOT_STRING, false, 1, (Object) null);
        }
        if (segmentsBytes2.subList(i10, segmentsBytes2.size()).indexOf(f86469e) != -1) {
            throw new IllegalArgumentException(("Impossible relative path to resolve: " + path + " and " + other).toString());
        }
        Buffer buffer = new Buffer();
        ByteString byteStringA = a(other);
        if (byteStringA == null && (byteStringA = a(path)) == null) {
            byteStringA = c(okio.Path.DIRECTORY_SEPARATOR);
        }
        int size = segmentsBytes2.size();
        for (int i11 = i10; i11 < size; i11++) {
            buffer.write(f86469e);
            buffer.write(byteStringA);
        }
        int size2 = segmentsBytes.size();
        while (i10 < size2) {
            buffer.write(segmentsBytes.get(i10));
            buffer.write(byteStringA);
            i10++;
        }
        return toPath(buffer, false);
    }

    @NotNull
    public static final okio.Path commonResolve(@NotNull okio.Path path, @NotNull String child, boolean z10) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(child, "child");
        return commonResolve(path, toPath(new Buffer().writeUtf8(child), false), z10);
    }

    @Nullable
    public static final okio.Path commonRoot(@NotNull okio.Path path) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        int iAccess$rootLength = access$rootLength(path);
        if (iAccess$rootLength == -1) {
            return null;
        }
        return new okio.Path(path.getBytes().substring(0, iAccess$rootLength));
    }

    @NotNull
    public static final List<String> commonSegments(@NotNull okio.Path path) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        ArrayList arrayList = new ArrayList();
        int iAccess$rootLength = access$rootLength(path);
        if (iAccess$rootLength == -1) {
            iAccess$rootLength = 0;
        } else if (iAccess$rootLength < path.getBytes().size() && path.getBytes().getByte(iAccess$rootLength) == 92) {
            iAccess$rootLength++;
        }
        int size = path.getBytes().size();
        int i10 = iAccess$rootLength;
        while (iAccess$rootLength < size) {
            if (path.getBytes().getByte(iAccess$rootLength) == 47 || path.getBytes().getByte(iAccess$rootLength) == 92) {
                arrayList.add(path.getBytes().substring(i10, iAccess$rootLength));
                i10 = iAccess$rootLength + 1;
            }
            iAccess$rootLength++;
        }
        if (i10 < path.getBytes().size()) {
            arrayList.add(path.getBytes().substring(i10, path.getBytes().size()));
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((ByteString) it.next()).utf8());
        }
        return arrayList2;
    }

    @NotNull
    public static final List<ByteString> commonSegmentsBytes(@NotNull okio.Path path) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        ArrayList arrayList = new ArrayList();
        int iAccess$rootLength = access$rootLength(path);
        if (iAccess$rootLength == -1) {
            iAccess$rootLength = 0;
        } else if (iAccess$rootLength < path.getBytes().size() && path.getBytes().getByte(iAccess$rootLength) == 92) {
            iAccess$rootLength++;
        }
        int size = path.getBytes().size();
        int i10 = iAccess$rootLength;
        while (iAccess$rootLength < size) {
            if (path.getBytes().getByte(iAccess$rootLength) == 47 || path.getBytes().getByte(iAccess$rootLength) == 92) {
                arrayList.add(path.getBytes().substring(i10, iAccess$rootLength));
                i10 = iAccess$rootLength + 1;
            }
            iAccess$rootLength++;
        }
        if (i10 < path.getBytes().size()) {
            arrayList.add(path.getBytes().substring(i10, path.getBytes().size()));
        }
        return arrayList;
    }

    @NotNull
    public static final okio.Path commonToPath(@NotNull String str, boolean z10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return toPath(new Buffer().writeUtf8(str), z10);
    }

    @NotNull
    public static final String commonToString(@NotNull okio.Path path) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        return path.getBytes().utf8();
    }

    @Nullable
    public static final Character commonVolumeLetter(@NotNull okio.Path path) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        if (ByteString.indexOf$default(path.getBytes(), f86465a, 0, 2, (Object) null) != -1 || path.getBytes().size() < 2 || path.getBytes().getByte(1) != 58) {
            return null;
        }
        char c10 = (char) path.getBytes().getByte(0);
        if (('a' > c10 || c10 >= '{') && ('A' > c10 || c10 >= '[')) {
            return null;
        }
        return Character.valueOf(c10);
    }

    @NotNull
    public static final okio.Path toPath(@NotNull Buffer buffer, boolean z10) throws EOFException {
        ByteString byteString;
        char c10;
        ByteString byteString2;
        ByteString byteString3;
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Buffer buffer2 = new Buffer();
        ByteString byteStringB = null;
        int i10 = 0;
        while (true) {
            if (!buffer.rangeEquals(0L, f86465a)) {
                byteString = f86466b;
                if (!buffer.rangeEquals(0L, byteString)) {
                    break;
                }
            }
            byte b10 = buffer.readByte();
            if (byteStringB == null) {
                byteStringB = b(b10);
            }
            i10++;
        }
        boolean z11 = i10 >= 2 && Intrinsics.areEqual(byteStringB, byteString);
        ByteString byteString4 = f86467c;
        if (z11) {
            Intrinsics.checkNotNull(byteStringB);
            buffer2.write(byteStringB);
            buffer2.write(byteStringB);
        } else if (i10 > 0) {
            Intrinsics.checkNotNull(byteStringB);
            buffer2.write(byteStringB);
        } else {
            long jIndexOfElement = buffer.indexOfElement(byteString4);
            if (byteStringB == null) {
                byteStringB = jIndexOfElement == -1 ? c(okio.Path.DIRECTORY_SEPARATOR) : b(buffer.getByte(jIndexOfElement));
            }
            if (Intrinsics.areEqual(byteStringB, byteString) && buffer.size() >= 2 && buffer.getByte(1L) == 58 && (('a' <= (c10 = (char) buffer.getByte(0L)) && c10 < '{') || ('A' <= c10 && c10 < '['))) {
                if (jIndexOfElement == 2) {
                    buffer2.write(buffer, 3L);
                } else {
                    buffer2.write(buffer, 2L);
                }
            }
        }
        boolean z12 = buffer2.size() > 0;
        ArrayList arrayList = new ArrayList();
        while (true) {
            boolean zExhausted = buffer.exhausted();
            byteString2 = f86468d;
            if (zExhausted) {
                break;
            }
            long jIndexOfElement2 = buffer.indexOfElement(byteString4);
            if (jIndexOfElement2 == -1) {
                byteString3 = buffer.readByteString();
            } else {
                byteString3 = buffer.readByteString(jIndexOfElement2);
                buffer.readByte();
            }
            ByteString byteString5 = f86469e;
            if (Intrinsics.areEqual(byteString3, byteString5)) {
                if (!z12 || !arrayList.isEmpty()) {
                    if (!z10 || (!z12 && (arrayList.isEmpty() || Intrinsics.areEqual(CollectionsKt___CollectionsKt.last((List) arrayList), byteString5)))) {
                        arrayList.add(byteString3);
                    } else if (!z11 || arrayList.size() != 1) {
                        g.removeLastOrNull(arrayList);
                    }
                }
            } else if (!Intrinsics.areEqual(byteString3, byteString2) && !Intrinsics.areEqual(byteString3, ByteString.EMPTY)) {
                arrayList.add(byteString3);
            }
        }
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (i11 > 0) {
                buffer2.write(byteStringB);
            }
            buffer2.write((ByteString) arrayList.get(i11));
        }
        if (buffer2.size() == 0) {
            buffer2.write(byteString2);
        }
        return new okio.Path(buffer2.readByteString());
    }

    @NotNull
    public static final okio.Path commonResolve(@NotNull okio.Path path, @NotNull ByteString child, boolean z10) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(child, "child");
        return commonResolve(path, toPath(new Buffer().write(child), false), z10);
    }

    @NotNull
    public static final okio.Path commonResolve(@NotNull okio.Path path, @NotNull Buffer child, boolean z10) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(child, "child");
        return commonResolve(path, toPath(child, false), z10);
    }

    @NotNull
    public static final okio.Path commonResolve(@NotNull okio.Path path, @NotNull okio.Path child, boolean z10) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(child, "child");
        if (child.isAbsolute() || child.volumeLetter() != null) {
            return child;
        }
        ByteString byteStringA = a(path);
        if (byteStringA == null && (byteStringA = a(child)) == null) {
            byteStringA = c(okio.Path.DIRECTORY_SEPARATOR);
        }
        Buffer buffer = new Buffer();
        buffer.write(path.getBytes());
        if (buffer.size() > 0) {
            buffer.write(byteStringA);
        }
        buffer.write(child.getBytes());
        return toPath(buffer, z10);
    }
}
