package androidx.collection;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ScatterSet.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0012\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000\u001a\u0012\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000\u001a!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0003\u0010\u0005\u001a)\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\u0003\u0010\u0007\u001a1\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\u0003\u0010\t\u001a-\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\n\"\u00028\u0000¢\u0006\u0004\b\u0003\u0010\f\u001a\u0012\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\u0004\b\u0000\u0010\u0000\u001a!\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a)\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\u000e\u0010\u0010\u001a1\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\u000e\u0010\u0011\u001a-\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\n\"\u00028\u0000¢\u0006\u0004\b\u000e\u0010\u0012¨\u0006\u0013"}, d2 = {ExifInterface.LONGITUDE_EAST, "Landroidx/collection/ScatterSet;", "emptyScatterSet", "scatterSetOf", "element1", "(Ljava/lang/Object;)Landroidx/collection/ScatterSet;", "element2", "(Ljava/lang/Object;Ljava/lang/Object;)Landroidx/collection/ScatterSet;", "element3", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Landroidx/collection/ScatterSet;", "", "elements", "([Ljava/lang/Object;)Landroidx/collection/ScatterSet;", "Landroidx/collection/MutableScatterSet;", "mutableScatterSetOf", "(Ljava/lang/Object;)Landroidx/collection/MutableScatterSet;", "(Ljava/lang/Object;Ljava/lang/Object;)Landroidx/collection/MutableScatterSet;", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Landroidx/collection/MutableScatterSet;", "([Ljava/lang/Object;)Landroidx/collection/MutableScatterSet;", "collection"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nScatterSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterSet.kt\nandroidx/collection/ScatterSetKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1084:1\n1#2:1085\n*E\n"})
public final class ScatterSetKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final MutableScatterSet<Object> f2527a = new MutableScatterSet<>(0);

    @NotNull
    public static final <E> ScatterSet<E> emptyScatterSet() {
        MutableScatterSet<Object> mutableScatterSet = f2527a;
        Intrinsics.checkNotNull(mutableScatterSet, "null cannot be cast to non-null type androidx.collection.ScatterSet<E of androidx.collection.ScatterSetKt.emptyScatterSet>");
        return mutableScatterSet;
    }

    @NotNull
    public static final <E> MutableScatterSet<E> mutableScatterSetOf() {
        return new MutableScatterSet<>(0, 1, null);
    }

    @NotNull
    public static final <E> ScatterSet<E> scatterSetOf() {
        MutableScatterSet<Object> mutableScatterSet = f2527a;
        Intrinsics.checkNotNull(mutableScatterSet, "null cannot be cast to non-null type androidx.collection.ScatterSet<E of androidx.collection.ScatterSetKt.scatterSetOf>");
        return mutableScatterSet;
    }

    @NotNull
    public static final <E> MutableScatterSet<E> mutableScatterSetOf(E e5) {
        MutableScatterSet<E> mutableScatterSet = new MutableScatterSet<>(1);
        mutableScatterSet.plusAssign(e5);
        return mutableScatterSet;
    }

    @NotNull
    public static final <E> ScatterSet<E> scatterSetOf(E e5) {
        return mutableScatterSetOf(e5);
    }

    @NotNull
    public static final <E> ScatterSet<E> scatterSetOf(E e5, E e7) {
        return mutableScatterSetOf(e5, e7);
    }

    @NotNull
    public static final <E> MutableScatterSet<E> mutableScatterSetOf(E e5, E e7) {
        MutableScatterSet<E> mutableScatterSet = new MutableScatterSet<>(2);
        mutableScatterSet.plusAssign(e5);
        mutableScatterSet.plusAssign(e7);
        return mutableScatterSet;
    }

    @NotNull
    public static final <E> ScatterSet<E> scatterSetOf(E e5, E e7, E e10) {
        return mutableScatterSetOf(e5, e7, e10);
    }

    @NotNull
    public static final <E> ScatterSet<E> scatterSetOf(@NotNull E... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        MutableScatterSet mutableScatterSet = new MutableScatterSet(elements.length);
        mutableScatterSet.plusAssign((Object[]) elements);
        return mutableScatterSet;
    }

    @NotNull
    public static final <E> MutableScatterSet<E> mutableScatterSetOf(E e5, E e7, E e10) {
        MutableScatterSet<E> mutableScatterSet = new MutableScatterSet<>(3);
        mutableScatterSet.plusAssign(e5);
        mutableScatterSet.plusAssign(e7);
        mutableScatterSet.plusAssign(e10);
        return mutableScatterSet;
    }

    @NotNull
    public static final <E> MutableScatterSet<E> mutableScatterSetOf(@NotNull E... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        MutableScatterSet<E> mutableScatterSet = new MutableScatterSet<>(elements.length);
        mutableScatterSet.plusAssign((Object[]) elements);
        return mutableScatterSet;
    }
}
