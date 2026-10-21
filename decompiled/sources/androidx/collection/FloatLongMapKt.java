package androidx.collection;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FloatLongMap.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u0006\u0010\u0002\u001a\u00020\u0000\u001a\u0016\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005\u001a&\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0005\u001a6\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0005\u001aF\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0005\u001aV\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0005\u001a\u0006\u0010\u0010\u001a\u00020\u000f\u001a\u0016\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005\u001a&\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0005\u001a6\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0005\u001aF\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0005\u001aV\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0005¨\u0006\u0011"}, d2 = {"Landroidx/collection/FloatLongMap;", "emptyFloatLongMap", "floatLongMapOf", "", "key1", "", "value1", "key2", "value2", "key3", "value3", "key4", "value4", "key5", "value5", "Landroidx/collection/MutableFloatLongMap;", "mutableFloatLongMapOf", "collection"}, k = 2, mv = {1, 8, 0})
public final class FloatLongMapKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final MutableFloatLongMap f2369a = new MutableFloatLongMap(0);

    @NotNull
    public static final FloatLongMap emptyFloatLongMap() {
        return f2369a;
    }

    @NotNull
    public static final FloatLongMap floatLongMapOf() {
        return f2369a;
    }

    @NotNull
    public static final MutableFloatLongMap mutableFloatLongMapOf() {
        return new MutableFloatLongMap(0, 1, null);
    }

    @NotNull
    public static final FloatLongMap floatLongMapOf(float f6, long j10) {
        MutableFloatLongMap mutableFloatLongMap = new MutableFloatLongMap(0, 1, null);
        mutableFloatLongMap.set(f6, j10);
        return mutableFloatLongMap;
    }

    @NotNull
    public static final MutableFloatLongMap mutableFloatLongMapOf(float f6, long j10) {
        MutableFloatLongMap mutableFloatLongMap = new MutableFloatLongMap(0, 1, null);
        mutableFloatLongMap.set(f6, j10);
        return mutableFloatLongMap;
    }

    @NotNull
    public static final FloatLongMap floatLongMapOf(float f6, long j10, float f10, long j11) {
        MutableFloatLongMap mutableFloatLongMap = new MutableFloatLongMap(0, 1, null);
        mutableFloatLongMap.set(f6, j10);
        mutableFloatLongMap.set(f10, j11);
        return mutableFloatLongMap;
    }

    @NotNull
    public static final MutableFloatLongMap mutableFloatLongMapOf(float f6, long j10, float f10, long j11) {
        MutableFloatLongMap mutableFloatLongMap = new MutableFloatLongMap(0, 1, null);
        mutableFloatLongMap.set(f6, j10);
        mutableFloatLongMap.set(f10, j11);
        return mutableFloatLongMap;
    }

    @NotNull
    public static final FloatLongMap floatLongMapOf(float f6, long j10, float f10, long j11, float f11, long j12) {
        MutableFloatLongMap mutableFloatLongMap = new MutableFloatLongMap(0, 1, null);
        mutableFloatLongMap.set(f6, j10);
        mutableFloatLongMap.set(f10, j11);
        mutableFloatLongMap.set(f11, j12);
        return mutableFloatLongMap;
    }

    @NotNull
    public static final MutableFloatLongMap mutableFloatLongMapOf(float f6, long j10, float f10, long j11, float f11, long j12) {
        MutableFloatLongMap mutableFloatLongMap = new MutableFloatLongMap(0, 1, null);
        mutableFloatLongMap.set(f6, j10);
        mutableFloatLongMap.set(f10, j11);
        mutableFloatLongMap.set(f11, j12);
        return mutableFloatLongMap;
    }

    @NotNull
    public static final FloatLongMap floatLongMapOf(float f6, long j10, float f10, long j11, float f11, long j12, float f12, long j13) {
        MutableFloatLongMap mutableFloatLongMap = new MutableFloatLongMap(0, 1, null);
        mutableFloatLongMap.set(f6, j10);
        mutableFloatLongMap.set(f10, j11);
        mutableFloatLongMap.set(f11, j12);
        mutableFloatLongMap.set(f12, j13);
        return mutableFloatLongMap;
    }

    @NotNull
    public static final MutableFloatLongMap mutableFloatLongMapOf(float f6, long j10, float f10, long j11, float f11, long j12, float f12, long j13) {
        MutableFloatLongMap mutableFloatLongMap = new MutableFloatLongMap(0, 1, null);
        mutableFloatLongMap.set(f6, j10);
        mutableFloatLongMap.set(f10, j11);
        mutableFloatLongMap.set(f11, j12);
        mutableFloatLongMap.set(f12, j13);
        return mutableFloatLongMap;
    }

    @NotNull
    public static final FloatLongMap floatLongMapOf(float f6, long j10, float f10, long j11, float f11, long j12, float f12, long j13, float f13, long j14) {
        MutableFloatLongMap mutableFloatLongMap = new MutableFloatLongMap(0, 1, null);
        mutableFloatLongMap.set(f6, j10);
        mutableFloatLongMap.set(f10, j11);
        mutableFloatLongMap.set(f11, j12);
        mutableFloatLongMap.set(f12, j13);
        mutableFloatLongMap.set(f13, j14);
        return mutableFloatLongMap;
    }

    @NotNull
    public static final MutableFloatLongMap mutableFloatLongMapOf(float f6, long j10, float f10, long j11, float f11, long j12, float f12, long j13, float f13, long j14) {
        MutableFloatLongMap mutableFloatLongMap = new MutableFloatLongMap(0, 1, null);
        mutableFloatLongMap.set(f6, j10);
        mutableFloatLongMap.set(f10, j11);
        mutableFloatLongMap.set(f11, j12);
        mutableFloatLongMap.set(f12, j13);
        mutableFloatLongMap.set(f13, j14);
        return mutableFloatLongMap;
    }
}
