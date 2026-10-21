package androidx.collection;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: LongFloatMap.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u0006\u0010\u0002\u001a\u00020\u0000\u001a\u0016\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005\u001a&\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0005\u001a6\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0005\u001aF\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0005\u001aV\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0005\u001a\u0006\u0010\u0010\u001a\u00020\u000f\u001a\u0016\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005\u001a&\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0005\u001a6\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0005\u001aF\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0005\u001aV\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0005¨\u0006\u0011"}, d2 = {"Landroidx/collection/LongFloatMap;", "emptyLongFloatMap", "longFloatMapOf", "", "key1", "", "value1", "key2", "value2", "key3", "value3", "key4", "value4", "key5", "value5", "Landroidx/collection/MutableLongFloatMap;", "mutableLongFloatMapOf", "collection"}, k = 2, mv = {1, 8, 0})
public final class LongFloatMapKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final MutableLongFloatMap f2383a = new MutableLongFloatMap(0);

    @NotNull
    public static final LongFloatMap emptyLongFloatMap() {
        return f2383a;
    }

    @NotNull
    public static final LongFloatMap longFloatMapOf() {
        return f2383a;
    }

    @NotNull
    public static final MutableLongFloatMap mutableLongFloatMapOf() {
        return new MutableLongFloatMap(0, 1, null);
    }

    @NotNull
    public static final LongFloatMap longFloatMapOf(long j10, float f6) {
        MutableLongFloatMap mutableLongFloatMap = new MutableLongFloatMap(0, 1, null);
        mutableLongFloatMap.set(j10, f6);
        return mutableLongFloatMap;
    }

    @NotNull
    public static final MutableLongFloatMap mutableLongFloatMapOf(long j10, float f6) {
        MutableLongFloatMap mutableLongFloatMap = new MutableLongFloatMap(0, 1, null);
        mutableLongFloatMap.set(j10, f6);
        return mutableLongFloatMap;
    }

    @NotNull
    public static final LongFloatMap longFloatMapOf(long j10, float f6, long j11, float f10) {
        MutableLongFloatMap mutableLongFloatMap = new MutableLongFloatMap(0, 1, null);
        mutableLongFloatMap.set(j10, f6);
        mutableLongFloatMap.set(j11, f10);
        return mutableLongFloatMap;
    }

    @NotNull
    public static final MutableLongFloatMap mutableLongFloatMapOf(long j10, float f6, long j11, float f10) {
        MutableLongFloatMap mutableLongFloatMap = new MutableLongFloatMap(0, 1, null);
        mutableLongFloatMap.set(j10, f6);
        mutableLongFloatMap.set(j11, f10);
        return mutableLongFloatMap;
    }

    @NotNull
    public static final LongFloatMap longFloatMapOf(long j10, float f6, long j11, float f10, long j12, float f11) {
        MutableLongFloatMap mutableLongFloatMap = new MutableLongFloatMap(0, 1, null);
        mutableLongFloatMap.set(j10, f6);
        mutableLongFloatMap.set(j11, f10);
        mutableLongFloatMap.set(j12, f11);
        return mutableLongFloatMap;
    }

    @NotNull
    public static final MutableLongFloatMap mutableLongFloatMapOf(long j10, float f6, long j11, float f10, long j12, float f11) {
        MutableLongFloatMap mutableLongFloatMap = new MutableLongFloatMap(0, 1, null);
        mutableLongFloatMap.set(j10, f6);
        mutableLongFloatMap.set(j11, f10);
        mutableLongFloatMap.set(j12, f11);
        return mutableLongFloatMap;
    }

    @NotNull
    public static final LongFloatMap longFloatMapOf(long j10, float f6, long j11, float f10, long j12, float f11, long j13, float f12) {
        MutableLongFloatMap mutableLongFloatMap = new MutableLongFloatMap(0, 1, null);
        mutableLongFloatMap.set(j10, f6);
        mutableLongFloatMap.set(j11, f10);
        mutableLongFloatMap.set(j12, f11);
        mutableLongFloatMap.set(j13, f12);
        return mutableLongFloatMap;
    }

    @NotNull
    public static final MutableLongFloatMap mutableLongFloatMapOf(long j10, float f6, long j11, float f10, long j12, float f11, long j13, float f12) {
        MutableLongFloatMap mutableLongFloatMap = new MutableLongFloatMap(0, 1, null);
        mutableLongFloatMap.set(j10, f6);
        mutableLongFloatMap.set(j11, f10);
        mutableLongFloatMap.set(j12, f11);
        mutableLongFloatMap.set(j13, f12);
        return mutableLongFloatMap;
    }

    @NotNull
    public static final LongFloatMap longFloatMapOf(long j10, float f6, long j11, float f10, long j12, float f11, long j13, float f12, long j14, float f13) {
        MutableLongFloatMap mutableLongFloatMap = new MutableLongFloatMap(0, 1, null);
        mutableLongFloatMap.set(j10, f6);
        mutableLongFloatMap.set(j11, f10);
        mutableLongFloatMap.set(j12, f11);
        mutableLongFloatMap.set(j13, f12);
        mutableLongFloatMap.set(j14, f13);
        return mutableLongFloatMap;
    }

    @NotNull
    public static final MutableLongFloatMap mutableLongFloatMapOf(long j10, float f6, long j11, float f10, long j12, float f11, long j13, float f12, long j14, float f13) {
        MutableLongFloatMap mutableLongFloatMap = new MutableLongFloatMap(0, 1, null);
        mutableLongFloatMap.set(j10, f6);
        mutableLongFloatMap.set(j11, f10);
        mutableLongFloatMap.set(j12, f11);
        mutableLongFloatMap.set(j13, f12);
        mutableLongFloatMap.set(j14, f13);
        return mutableLongFloatMap;
    }
}
