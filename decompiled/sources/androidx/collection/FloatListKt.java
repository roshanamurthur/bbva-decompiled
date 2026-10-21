package androidx.collection;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FloatList.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u0006\u0010\u0002\u001a\u00020\u0000\u001a\u000e\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003\u001a\u0016\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003\u001a\u001e\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003\u001a\u0012\u0010\u0002\u001a\u00020\u00002\n\u0010\b\u001a\u00020\u0007\"\u00020\u0003\u001a\t\u0010\n\u001a\u00020\tH\u0086\b\u001a\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0003\u001a\u0016\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003\u001a\u001e\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003\u001a\u0015\u0010\n\u001a\u00020\t2\n\u0010\b\u001a\u00020\u0007\"\u00020\u0003H\u0086\b¨\u0006\u000b"}, d2 = {"Landroidx/collection/FloatList;", "emptyFloatList", "floatListOf", "", "element1", "element2", "element3", "", "elements", "Landroidx/collection/MutableFloatList;", "mutableFloatListOf", "collection"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFloatList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatList.kt\nandroidx/collection/FloatListKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 FloatList.kt\nandroidx/collection/MutableFloatList\n*L\n1#1,969:1\n1#2:970\n713#3,2:971\n713#3,2:973\n713#3,2:975\n713#3,2:977\n713#3,2:979\n713#3,2:981\n*S KotlinDebug\n*F\n+ 1 FloatList.kt\nandroidx/collection/FloatListKt\n*L\n938#1:971,2\n947#1:973,2\n948#1:975,2\n958#1:977,2\n959#1:979,2\n960#1:981,2\n*E\n"})
public final class FloatListKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final MutableFloatList f2368a = new MutableFloatList(0);

    @NotNull
    public static final FloatList emptyFloatList() {
        return f2368a;
    }

    @NotNull
    public static final FloatList floatListOf() {
        return f2368a;
    }

    @NotNull
    public static final MutableFloatList mutableFloatListOf() {
        return new MutableFloatList(0, 1, null);
    }

    @NotNull
    public static final FloatList floatListOf(float f6) {
        return mutableFloatListOf(f6);
    }

    @NotNull
    public static final MutableFloatList mutableFloatListOf(float f6) {
        MutableFloatList mutableFloatList = new MutableFloatList(1);
        mutableFloatList.add(f6);
        return mutableFloatList;
    }

    @NotNull
    public static final FloatList floatListOf(float f6, float f10) {
        return mutableFloatListOf(f6, f10);
    }

    @NotNull
    public static final FloatList floatListOf(float f6, float f10, float f11) {
        return mutableFloatListOf(f6, f10, f11);
    }

    @NotNull
    public static final MutableFloatList mutableFloatListOf(float f6, float f10) {
        MutableFloatList mutableFloatList = new MutableFloatList(2);
        mutableFloatList.add(f6);
        mutableFloatList.add(f10);
        return mutableFloatList;
    }

    @NotNull
    public static final FloatList floatListOf(@NotNull float... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        MutableFloatList mutableFloatList = new MutableFloatList(elements.length);
        mutableFloatList.plusAssign(elements);
        return mutableFloatList;
    }

    @NotNull
    public static final MutableFloatList mutableFloatListOf(float f6, float f10, float f11) {
        MutableFloatList mutableFloatList = new MutableFloatList(3);
        mutableFloatList.add(f6);
        mutableFloatList.add(f10);
        mutableFloatList.add(f11);
        return mutableFloatList;
    }

    @NotNull
    public static final MutableFloatList mutableFloatListOf(@NotNull float... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        MutableFloatList mutableFloatList = new MutableFloatList(elements.length);
        mutableFloatList.plusAssign(elements);
        return mutableFloatList;
    }
}
