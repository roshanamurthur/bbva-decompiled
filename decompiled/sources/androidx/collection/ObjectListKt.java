package androidx.collection;

import androidx.exifinterface.media.ExifInterface;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ObjectList.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0012\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000\u001a\u0012\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000\u001a!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0003\u0010\u0005\u001a)\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\u0003\u0010\u0007\u001a1\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\u0003\u0010\t\u001a-\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\n\"\u00028\u0000¢\u0006\u0004\b\u0003\u0010\f\u001a\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\u0004\b\u0000\u0010\u0000H\u0086\b\u001a!\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a)\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\u000e\u0010\u0010\u001a1\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\u000e\u0010\u0011\u001a0\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\n\"\u00028\u0000H\u0086\b¢\u0006\u0004\b\u000e\u0010\u0012¨\u0006\u0013"}, d2 = {ExifInterface.LONGITUDE_EAST, "Landroidx/collection/ObjectList;", "emptyObjectList", "objectListOf", "element1", "(Ljava/lang/Object;)Landroidx/collection/ObjectList;", "element2", "(Ljava/lang/Object;Ljava/lang/Object;)Landroidx/collection/ObjectList;", "element3", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Landroidx/collection/ObjectList;", "", "elements", "([Ljava/lang/Object;)Landroidx/collection/ObjectList;", "Landroidx/collection/MutableObjectList;", "mutableObjectListOf", "(Ljava/lang/Object;)Landroidx/collection/MutableObjectList;", "(Ljava/lang/Object;Ljava/lang/Object;)Landroidx/collection/MutableObjectList;", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Landroidx/collection/MutableObjectList;", "([Ljava/lang/Object;)Landroidx/collection/MutableObjectList;", "collection"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nObjectList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ObjectList.kt\nandroidx/collection/ObjectListKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ObjectList.kt\nandroidx/collection/MutableObjectList\n*L\n1#1,1618:1\n1#2:1619\n948#3,2:1620\n948#3,2:1622\n948#3,2:1624\n948#3,2:1626\n948#3,2:1628\n948#3,2:1630\n*S KotlinDebug\n*F\n+ 1 ObjectList.kt\nandroidx/collection/ObjectListKt\n*L\n1587#1:1620,2\n1596#1:1622,2\n1597#1:1624,2\n1607#1:1626,2\n1608#1:1628,2\n1609#1:1630,2\n*E\n"})
public final class ObjectListKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Object[] f2481a = new Object[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final MutableObjectList f2482b = new MutableObjectList(0);

    public static final void access$checkIndex(List list, int i10) {
        int size = list.size();
        if (i10 < 0 || i10 >= size) {
            throw new IndexOutOfBoundsException(k.c("Index ", i10, " is out of bounds. The list has ", size, " elements."));
        }
    }

    public static final void access$checkSubIndex(List list, int i10, int i11) {
        int size = list.size();
        if (i10 > i11) {
            throw new IllegalArgumentException(k.c("Indices are out of order. fromIndex (", i10, ") is greater than toIndex (", i11, ")."));
        }
        if (i10 < 0) {
            throw new IndexOutOfBoundsException(androidx.camera.core.impl.utils.b.a("fromIndex (", i10, ") is less than 0."));
        }
        if (i11 > size) {
            throw new IndexOutOfBoundsException(g.b("toIndex (", i11, ") is more than than the list size (", size, RootService.CLOSE_BRACKET));
        }
    }

    @NotNull
    public static final <E> ObjectList<E> emptyObjectList() {
        MutableObjectList mutableObjectList = f2482b;
        Intrinsics.checkNotNull(mutableObjectList, "null cannot be cast to non-null type androidx.collection.ObjectList<E of androidx.collection.ObjectListKt.emptyObjectList>");
        return mutableObjectList;
    }

    @NotNull
    public static final <E> MutableObjectList<E> mutableObjectListOf() {
        return new MutableObjectList<>(0, 1, null);
    }

    @NotNull
    public static final <E> ObjectList<E> objectListOf() {
        MutableObjectList mutableObjectList = f2482b;
        Intrinsics.checkNotNull(mutableObjectList, "null cannot be cast to non-null type androidx.collection.ObjectList<E of androidx.collection.ObjectListKt.objectListOf>");
        return mutableObjectList;
    }

    @NotNull
    public static final <E> MutableObjectList<E> mutableObjectListOf(E e5) {
        MutableObjectList<E> mutableObjectList = new MutableObjectList<>(1);
        mutableObjectList.add(e5);
        return mutableObjectList;
    }

    @NotNull
    public static final <E> ObjectList<E> objectListOf(E e5) {
        return mutableObjectListOf(e5);
    }

    @NotNull
    public static final <E> ObjectList<E> objectListOf(E e5, E e7) {
        return mutableObjectListOf(e5, e7);
    }

    @NotNull
    public static final <E> MutableObjectList<E> mutableObjectListOf(E e5, E e7) {
        MutableObjectList<E> mutableObjectList = new MutableObjectList<>(2);
        mutableObjectList.add(e5);
        mutableObjectList.add(e7);
        return mutableObjectList;
    }

    @NotNull
    public static final <E> ObjectList<E> objectListOf(E e5, E e7, E e10) {
        return mutableObjectListOf(e5, e7, e10);
    }

    @NotNull
    public static final <E> ObjectList<E> objectListOf(@NotNull E... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        MutableObjectList mutableObjectList = new MutableObjectList(elements.length);
        mutableObjectList.plusAssign((Object[]) elements);
        return mutableObjectList;
    }

    @NotNull
    public static final <E> MutableObjectList<E> mutableObjectListOf(E e5, E e7, E e10) {
        MutableObjectList<E> mutableObjectList = new MutableObjectList<>(3);
        mutableObjectList.add(e5);
        mutableObjectList.add(e7);
        mutableObjectList.add(e10);
        return mutableObjectList;
    }

    @NotNull
    public static final <E> MutableObjectList<E> mutableObjectListOf(@NotNull E... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        MutableObjectList<E> mutableObjectList = new MutableObjectList<>(elements.length);
        mutableObjectList.plusAssign((Object[]) elements);
        return mutableObjectList;
    }
}
