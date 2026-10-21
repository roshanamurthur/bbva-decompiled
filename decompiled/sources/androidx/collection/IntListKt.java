package androidx.collection;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: IntList.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u0006\u0010\u0002\u001a\u00020\u0000\u001a\u000e\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003\u001a\u0016\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003\u001a\u001e\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003\u001a\u0012\u0010\u0002\u001a\u00020\u00002\n\u0010\b\u001a\u00020\u0007\"\u00020\u0003\u001a\t\u0010\n\u001a\u00020\tH\u0086\b\u001a\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0003\u001a\u0016\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003\u001a\u001e\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003\u001a\u0015\u0010\n\u001a\u00020\t2\n\u0010\b\u001a\u00020\u0007\"\u00020\u0003H\u0086\b¨\u0006\u000b"}, d2 = {"Landroidx/collection/IntList;", "emptyIntList", "intListOf", "", "element1", "element2", "element3", "", "elements", "Landroidx/collection/MutableIntList;", "mutableIntListOf", "collection"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nIntList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntList.kt\nandroidx/collection/IntListKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 IntList.kt\nandroidx/collection/MutableIntList\n*L\n1#1,969:1\n1#2:970\n713#3,2:971\n713#3,2:973\n713#3,2:975\n713#3,2:977\n713#3,2:979\n713#3,2:981\n*S KotlinDebug\n*F\n+ 1 IntList.kt\nandroidx/collection/IntListKt\n*L\n938#1:971,2\n947#1:973,2\n948#1:975,2\n958#1:977,2\n959#1:979,2\n960#1:981,2\n*E\n"})
public final class IntListKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final MutableIntList f2378a = new MutableIntList(0);

    @NotNull
    public static final IntList emptyIntList() {
        return f2378a;
    }

    @NotNull
    public static final IntList intListOf() {
        return f2378a;
    }

    @NotNull
    public static final MutableIntList mutableIntListOf() {
        return new MutableIntList(0, 1, null);
    }

    @NotNull
    public static final IntList intListOf(int i10) {
        return mutableIntListOf(i10);
    }

    @NotNull
    public static final MutableIntList mutableIntListOf(int i10) {
        MutableIntList mutableIntList = new MutableIntList(1);
        mutableIntList.add(i10);
        return mutableIntList;
    }

    @NotNull
    public static final IntList intListOf(int i10, int i11) {
        return mutableIntListOf(i10, i11);
    }

    @NotNull
    public static final IntList intListOf(int i10, int i11, int i12) {
        return mutableIntListOf(i10, i11, i12);
    }

    @NotNull
    public static final MutableIntList mutableIntListOf(int i10, int i11) {
        MutableIntList mutableIntList = new MutableIntList(2);
        mutableIntList.add(i10);
        mutableIntList.add(i11);
        return mutableIntList;
    }

    @NotNull
    public static final IntList intListOf(@NotNull int... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        MutableIntList mutableIntList = new MutableIntList(elements.length);
        mutableIntList.plusAssign(elements);
        return mutableIntList;
    }

    @NotNull
    public static final MutableIntList mutableIntListOf(int i10, int i11, int i12) {
        MutableIntList mutableIntList = new MutableIntList(3);
        mutableIntList.add(i10);
        mutableIntList.add(i11);
        mutableIntList.add(i12);
        return mutableIntList;
    }

    @NotNull
    public static final MutableIntList mutableIntListOf(@NotNull int... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        MutableIntList mutableIntList = new MutableIntList(elements.length);
        mutableIntList.plusAssign(elements);
        return mutableIntList;
    }
}
