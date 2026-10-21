package androidx.collection;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FloatFloatMap.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u0006\u0010\u0002\u001a\u00020\u0000\u001a\u0016\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003\u001a&\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003\u001a6\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003\u001aF\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003\u001aV\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003\u001a\u0006\u0010\u000f\u001a\u00020\u000e\u001a\u0016\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003\u001a&\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003\u001a6\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003\u001aF\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003\u001aV\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003¨\u0006\u0010"}, d2 = {"Landroidx/collection/FloatFloatMap;", "emptyFloatFloatMap", "floatFloatMapOf", "", "key1", "value1", "key2", "value2", "key3", "value3", "key4", "value4", "key5", "value5", "Landroidx/collection/MutableFloatFloatMap;", "mutableFloatFloatMapOf", "collection"}, k = 2, mv = {1, 8, 0})
public final class FloatFloatMapKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final MutableFloatFloatMap f2366a = new MutableFloatFloatMap(0);

    @NotNull
    public static final FloatFloatMap emptyFloatFloatMap() {
        return f2366a;
    }

    @NotNull
    public static final FloatFloatMap floatFloatMapOf() {
        return f2366a;
    }

    @NotNull
    public static final MutableFloatFloatMap mutableFloatFloatMapOf() {
        return new MutableFloatFloatMap(0, 1, null);
    }

    @NotNull
    public static final FloatFloatMap floatFloatMapOf(float f6, float f10) {
        MutableFloatFloatMap mutableFloatFloatMap = new MutableFloatFloatMap(0, 1, null);
        mutableFloatFloatMap.set(f6, f10);
        return mutableFloatFloatMap;
    }

    @NotNull
    public static final MutableFloatFloatMap mutableFloatFloatMapOf(float f6, float f10) {
        MutableFloatFloatMap mutableFloatFloatMap = new MutableFloatFloatMap(0, 1, null);
        mutableFloatFloatMap.set(f6, f10);
        return mutableFloatFloatMap;
    }

    @NotNull
    public static final FloatFloatMap floatFloatMapOf(float f6, float f10, float f11, float f12) {
        MutableFloatFloatMap mutableFloatFloatMap = new MutableFloatFloatMap(0, 1, null);
        mutableFloatFloatMap.set(f6, f10);
        mutableFloatFloatMap.set(f11, f12);
        return mutableFloatFloatMap;
    }

    @NotNull
    public static final MutableFloatFloatMap mutableFloatFloatMapOf(float f6, float f10, float f11, float f12) {
        MutableFloatFloatMap mutableFloatFloatMap = new MutableFloatFloatMap(0, 1, null);
        mutableFloatFloatMap.set(f6, f10);
        mutableFloatFloatMap.set(f11, f12);
        return mutableFloatFloatMap;
    }

    @NotNull
    public static final FloatFloatMap floatFloatMapOf(float f6, float f10, float f11, float f12, float f13, float f14) {
        MutableFloatFloatMap mutableFloatFloatMap = new MutableFloatFloatMap(0, 1, null);
        mutableFloatFloatMap.set(f6, f10);
        mutableFloatFloatMap.set(f11, f12);
        mutableFloatFloatMap.set(f13, f14);
        return mutableFloatFloatMap;
    }

    @NotNull
    public static final MutableFloatFloatMap mutableFloatFloatMapOf(float f6, float f10, float f11, float f12, float f13, float f14) {
        MutableFloatFloatMap mutableFloatFloatMap = new MutableFloatFloatMap(0, 1, null);
        mutableFloatFloatMap.set(f6, f10);
        mutableFloatFloatMap.set(f11, f12);
        mutableFloatFloatMap.set(f13, f14);
        return mutableFloatFloatMap;
    }

    @NotNull
    public static final FloatFloatMap floatFloatMapOf(float f6, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        MutableFloatFloatMap mutableFloatFloatMap = new MutableFloatFloatMap(0, 1, null);
        mutableFloatFloatMap.set(f6, f10);
        mutableFloatFloatMap.set(f11, f12);
        mutableFloatFloatMap.set(f13, f14);
        mutableFloatFloatMap.set(f15, f16);
        return mutableFloatFloatMap;
    }

    @NotNull
    public static final MutableFloatFloatMap mutableFloatFloatMapOf(float f6, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        MutableFloatFloatMap mutableFloatFloatMap = new MutableFloatFloatMap(0, 1, null);
        mutableFloatFloatMap.set(f6, f10);
        mutableFloatFloatMap.set(f11, f12);
        mutableFloatFloatMap.set(f13, f14);
        mutableFloatFloatMap.set(f15, f16);
        return mutableFloatFloatMap;
    }

    @NotNull
    public static final FloatFloatMap floatFloatMapOf(float f6, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        MutableFloatFloatMap mutableFloatFloatMap = new MutableFloatFloatMap(0, 1, null);
        mutableFloatFloatMap.set(f6, f10);
        mutableFloatFloatMap.set(f11, f12);
        mutableFloatFloatMap.set(f13, f14);
        mutableFloatFloatMap.set(f15, f16);
        mutableFloatFloatMap.set(f17, f18);
        return mutableFloatFloatMap;
    }

    @NotNull
    public static final MutableFloatFloatMap mutableFloatFloatMapOf(float f6, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        MutableFloatFloatMap mutableFloatFloatMap = new MutableFloatFloatMap(0, 1, null);
        mutableFloatFloatMap.set(f6, f10);
        mutableFloatFloatMap.set(f11, f12);
        mutableFloatFloatMap.set(f13, f14);
        mutableFloatFloatMap.set(f15, f16);
        mutableFloatFloatMap.set(f17, f18);
        return mutableFloatFloatMap;
    }
}
