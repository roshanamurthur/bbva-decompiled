package androidx.collection;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FloatIntMap.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u0006\u0010\u0002\u001a\u00020\u0000\u001a\u0016\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005\u001a&\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0005\u001a6\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0005\u001aF\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0005\u001aV\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0005\u001a\u0006\u0010\u0010\u001a\u00020\u000f\u001a\u0016\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005\u001a&\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0005\u001a6\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0005\u001aF\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0005\u001aV\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0005¨\u0006\u0011"}, d2 = {"Landroidx/collection/FloatIntMap;", "emptyFloatIntMap", "floatIntMapOf", "", "key1", "", "value1", "key2", "value2", "key3", "value3", "key4", "value4", "key5", "value5", "Landroidx/collection/MutableFloatIntMap;", "mutableFloatIntMapOf", "collection"}, k = 2, mv = {1, 8, 0})
public final class FloatIntMapKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final MutableFloatIntMap f2367a = new MutableFloatIntMap(0);

    @NotNull
    public static final FloatIntMap emptyFloatIntMap() {
        return f2367a;
    }

    @NotNull
    public static final FloatIntMap floatIntMapOf() {
        return f2367a;
    }

    @NotNull
    public static final MutableFloatIntMap mutableFloatIntMapOf() {
        return new MutableFloatIntMap(0, 1, null);
    }

    @NotNull
    public static final FloatIntMap floatIntMapOf(float f6, int i10) {
        MutableFloatIntMap mutableFloatIntMap = new MutableFloatIntMap(0, 1, null);
        mutableFloatIntMap.set(f6, i10);
        return mutableFloatIntMap;
    }

    @NotNull
    public static final MutableFloatIntMap mutableFloatIntMapOf(float f6, int i10) {
        MutableFloatIntMap mutableFloatIntMap = new MutableFloatIntMap(0, 1, null);
        mutableFloatIntMap.set(f6, i10);
        return mutableFloatIntMap;
    }

    @NotNull
    public static final FloatIntMap floatIntMapOf(float f6, int i10, float f10, int i11) {
        MutableFloatIntMap mutableFloatIntMap = new MutableFloatIntMap(0, 1, null);
        mutableFloatIntMap.set(f6, i10);
        mutableFloatIntMap.set(f10, i11);
        return mutableFloatIntMap;
    }

    @NotNull
    public static final MutableFloatIntMap mutableFloatIntMapOf(float f6, int i10, float f10, int i11) {
        MutableFloatIntMap mutableFloatIntMap = new MutableFloatIntMap(0, 1, null);
        mutableFloatIntMap.set(f6, i10);
        mutableFloatIntMap.set(f10, i11);
        return mutableFloatIntMap;
    }

    @NotNull
    public static final FloatIntMap floatIntMapOf(float f6, int i10, float f10, int i11, float f11, int i12) {
        MutableFloatIntMap mutableFloatIntMap = new MutableFloatIntMap(0, 1, null);
        mutableFloatIntMap.set(f6, i10);
        mutableFloatIntMap.set(f10, i11);
        mutableFloatIntMap.set(f11, i12);
        return mutableFloatIntMap;
    }

    @NotNull
    public static final MutableFloatIntMap mutableFloatIntMapOf(float f6, int i10, float f10, int i11, float f11, int i12) {
        MutableFloatIntMap mutableFloatIntMap = new MutableFloatIntMap(0, 1, null);
        mutableFloatIntMap.set(f6, i10);
        mutableFloatIntMap.set(f10, i11);
        mutableFloatIntMap.set(f11, i12);
        return mutableFloatIntMap;
    }

    @NotNull
    public static final FloatIntMap floatIntMapOf(float f6, int i10, float f10, int i11, float f11, int i12, float f12, int i13) {
        MutableFloatIntMap mutableFloatIntMap = new MutableFloatIntMap(0, 1, null);
        mutableFloatIntMap.set(f6, i10);
        mutableFloatIntMap.set(f10, i11);
        mutableFloatIntMap.set(f11, i12);
        mutableFloatIntMap.set(f12, i13);
        return mutableFloatIntMap;
    }

    @NotNull
    public static final MutableFloatIntMap mutableFloatIntMapOf(float f6, int i10, float f10, int i11, float f11, int i12, float f12, int i13) {
        MutableFloatIntMap mutableFloatIntMap = new MutableFloatIntMap(0, 1, null);
        mutableFloatIntMap.set(f6, i10);
        mutableFloatIntMap.set(f10, i11);
        mutableFloatIntMap.set(f11, i12);
        mutableFloatIntMap.set(f12, i13);
        return mutableFloatIntMap;
    }

    @NotNull
    public static final FloatIntMap floatIntMapOf(float f6, int i10, float f10, int i11, float f11, int i12, float f12, int i13, float f13, int i14) {
        MutableFloatIntMap mutableFloatIntMap = new MutableFloatIntMap(0, 1, null);
        mutableFloatIntMap.set(f6, i10);
        mutableFloatIntMap.set(f10, i11);
        mutableFloatIntMap.set(f11, i12);
        mutableFloatIntMap.set(f12, i13);
        mutableFloatIntMap.set(f13, i14);
        return mutableFloatIntMap;
    }

    @NotNull
    public static final MutableFloatIntMap mutableFloatIntMapOf(float f6, int i10, float f10, int i11, float f11, int i12, float f12, int i13, float f13, int i14) {
        MutableFloatIntMap mutableFloatIntMap = new MutableFloatIntMap(0, 1, null);
        mutableFloatIntMap.set(f6, i10);
        mutableFloatIntMap.set(f10, i11);
        mutableFloatIntMap.set(f11, i12);
        mutableFloatIntMap.set(f12, i13);
        mutableFloatIntMap.set(f13, i14);
        return mutableFloatIntMap;
    }
}
