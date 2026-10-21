package androidx.collection;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: IntFloatMap.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u0006\u0010\u0002\u001a\u00020\u0000\u001a\u0016\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005\u001a&\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0005\u001a6\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0005\u001aF\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0005\u001aV\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0005\u001a\u0006\u0010\u0010\u001a\u00020\u000f\u001a\u0016\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005\u001a&\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0005\u001a6\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0005\u001aF\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0005\u001aV\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0005¨\u0006\u0011"}, d2 = {"Landroidx/collection/IntFloatMap;", "emptyIntFloatMap", "intFloatMapOf", "", "key1", "", "value1", "key2", "value2", "key3", "value3", "key4", "value4", "key5", "value5", "Landroidx/collection/MutableIntFloatMap;", "mutableIntFloatMapOf", "collection"}, k = 2, mv = {1, 8, 0})
public final class IntFloatMapKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final MutableIntFloatMap f2376a = new MutableIntFloatMap(0);

    @NotNull
    public static final IntFloatMap emptyIntFloatMap() {
        return f2376a;
    }

    @NotNull
    public static final IntFloatMap intFloatMapOf() {
        return f2376a;
    }

    @NotNull
    public static final MutableIntFloatMap mutableIntFloatMapOf() {
        return new MutableIntFloatMap(0, 1, null);
    }

    @NotNull
    public static final IntFloatMap intFloatMapOf(int i10, float f6) {
        MutableIntFloatMap mutableIntFloatMap = new MutableIntFloatMap(0, 1, null);
        mutableIntFloatMap.set(i10, f6);
        return mutableIntFloatMap;
    }

    @NotNull
    public static final MutableIntFloatMap mutableIntFloatMapOf(int i10, float f6) {
        MutableIntFloatMap mutableIntFloatMap = new MutableIntFloatMap(0, 1, null);
        mutableIntFloatMap.set(i10, f6);
        return mutableIntFloatMap;
    }

    @NotNull
    public static final IntFloatMap intFloatMapOf(int i10, float f6, int i11, float f10) {
        MutableIntFloatMap mutableIntFloatMap = new MutableIntFloatMap(0, 1, null);
        mutableIntFloatMap.set(i10, f6);
        mutableIntFloatMap.set(i11, f10);
        return mutableIntFloatMap;
    }

    @NotNull
    public static final MutableIntFloatMap mutableIntFloatMapOf(int i10, float f6, int i11, float f10) {
        MutableIntFloatMap mutableIntFloatMap = new MutableIntFloatMap(0, 1, null);
        mutableIntFloatMap.set(i10, f6);
        mutableIntFloatMap.set(i11, f10);
        return mutableIntFloatMap;
    }

    @NotNull
    public static final IntFloatMap intFloatMapOf(int i10, float f6, int i11, float f10, int i12, float f11) {
        MutableIntFloatMap mutableIntFloatMap = new MutableIntFloatMap(0, 1, null);
        mutableIntFloatMap.set(i10, f6);
        mutableIntFloatMap.set(i11, f10);
        mutableIntFloatMap.set(i12, f11);
        return mutableIntFloatMap;
    }

    @NotNull
    public static final MutableIntFloatMap mutableIntFloatMapOf(int i10, float f6, int i11, float f10, int i12, float f11) {
        MutableIntFloatMap mutableIntFloatMap = new MutableIntFloatMap(0, 1, null);
        mutableIntFloatMap.set(i10, f6);
        mutableIntFloatMap.set(i11, f10);
        mutableIntFloatMap.set(i12, f11);
        return mutableIntFloatMap;
    }

    @NotNull
    public static final IntFloatMap intFloatMapOf(int i10, float f6, int i11, float f10, int i12, float f11, int i13, float f12) {
        MutableIntFloatMap mutableIntFloatMap = new MutableIntFloatMap(0, 1, null);
        mutableIntFloatMap.set(i10, f6);
        mutableIntFloatMap.set(i11, f10);
        mutableIntFloatMap.set(i12, f11);
        mutableIntFloatMap.set(i13, f12);
        return mutableIntFloatMap;
    }

    @NotNull
    public static final MutableIntFloatMap mutableIntFloatMapOf(int i10, float f6, int i11, float f10, int i12, float f11, int i13, float f12) {
        MutableIntFloatMap mutableIntFloatMap = new MutableIntFloatMap(0, 1, null);
        mutableIntFloatMap.set(i10, f6);
        mutableIntFloatMap.set(i11, f10);
        mutableIntFloatMap.set(i12, f11);
        mutableIntFloatMap.set(i13, f12);
        return mutableIntFloatMap;
    }

    @NotNull
    public static final IntFloatMap intFloatMapOf(int i10, float f6, int i11, float f10, int i12, float f11, int i13, float f12, int i14, float f13) {
        MutableIntFloatMap mutableIntFloatMap = new MutableIntFloatMap(0, 1, null);
        mutableIntFloatMap.set(i10, f6);
        mutableIntFloatMap.set(i11, f10);
        mutableIntFloatMap.set(i12, f11);
        mutableIntFloatMap.set(i13, f12);
        mutableIntFloatMap.set(i14, f13);
        return mutableIntFloatMap;
    }

    @NotNull
    public static final MutableIntFloatMap mutableIntFloatMapOf(int i10, float f6, int i11, float f10, int i12, float f11, int i13, float f12, int i14, float f13) {
        MutableIntFloatMap mutableIntFloatMap = new MutableIntFloatMap(0, 1, null);
        mutableIntFloatMap.set(i10, f6);
        mutableIntFloatMap.set(i11, f10);
        mutableIntFloatMap.set(i12, f11);
        mutableIntFloatMap.set(i13, f12);
        mutableIntFloatMap.set(i14, f13);
        return mutableIntFloatMap;
    }
}
