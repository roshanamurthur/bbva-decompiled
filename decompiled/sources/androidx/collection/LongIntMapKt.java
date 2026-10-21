package androidx.collection;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: LongIntMap.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u0006\u0010\u0002\u001a\u00020\u0000\u001a\u0016\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005\u001a&\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0005\u001a6\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0005\u001aF\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0005\u001aV\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0005\u001a\u0006\u0010\u0010\u001a\u00020\u000f\u001a\u0016\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005\u001a&\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0005\u001a6\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0005\u001aF\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0005\u001aV\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0005¨\u0006\u0011"}, d2 = {"Landroidx/collection/LongIntMap;", "emptyLongIntMap", "longIntMapOf", "", "key1", "", "value1", "key2", "value2", "key3", "value3", "key4", "value4", "key5", "value5", "Landroidx/collection/MutableLongIntMap;", "mutableLongIntMapOf", "collection"}, k = 2, mv = {1, 8, 0})
public final class LongIntMapKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final MutableLongIntMap f2384a = new MutableLongIntMap(0);

    @NotNull
    public static final LongIntMap emptyLongIntMap() {
        return f2384a;
    }

    @NotNull
    public static final LongIntMap longIntMapOf() {
        return f2384a;
    }

    @NotNull
    public static final MutableLongIntMap mutableLongIntMapOf() {
        return new MutableLongIntMap(0, 1, null);
    }

    @NotNull
    public static final LongIntMap longIntMapOf(long j10, int i10) {
        MutableLongIntMap mutableLongIntMap = new MutableLongIntMap(0, 1, null);
        mutableLongIntMap.set(j10, i10);
        return mutableLongIntMap;
    }

    @NotNull
    public static final MutableLongIntMap mutableLongIntMapOf(long j10, int i10) {
        MutableLongIntMap mutableLongIntMap = new MutableLongIntMap(0, 1, null);
        mutableLongIntMap.set(j10, i10);
        return mutableLongIntMap;
    }

    @NotNull
    public static final LongIntMap longIntMapOf(long j10, int i10, long j11, int i11) {
        MutableLongIntMap mutableLongIntMap = new MutableLongIntMap(0, 1, null);
        mutableLongIntMap.set(j10, i10);
        mutableLongIntMap.set(j11, i11);
        return mutableLongIntMap;
    }

    @NotNull
    public static final MutableLongIntMap mutableLongIntMapOf(long j10, int i10, long j11, int i11) {
        MutableLongIntMap mutableLongIntMap = new MutableLongIntMap(0, 1, null);
        mutableLongIntMap.set(j10, i10);
        mutableLongIntMap.set(j11, i11);
        return mutableLongIntMap;
    }

    @NotNull
    public static final LongIntMap longIntMapOf(long j10, int i10, long j11, int i11, long j12, int i12) {
        MutableLongIntMap mutableLongIntMap = new MutableLongIntMap(0, 1, null);
        mutableLongIntMap.set(j10, i10);
        mutableLongIntMap.set(j11, i11);
        mutableLongIntMap.set(j12, i12);
        return mutableLongIntMap;
    }

    @NotNull
    public static final MutableLongIntMap mutableLongIntMapOf(long j10, int i10, long j11, int i11, long j12, int i12) {
        MutableLongIntMap mutableLongIntMap = new MutableLongIntMap(0, 1, null);
        mutableLongIntMap.set(j10, i10);
        mutableLongIntMap.set(j11, i11);
        mutableLongIntMap.set(j12, i12);
        return mutableLongIntMap;
    }

    @NotNull
    public static final LongIntMap longIntMapOf(long j10, int i10, long j11, int i11, long j12, int i12, long j13, int i13) {
        MutableLongIntMap mutableLongIntMap = new MutableLongIntMap(0, 1, null);
        mutableLongIntMap.set(j10, i10);
        mutableLongIntMap.set(j11, i11);
        mutableLongIntMap.set(j12, i12);
        mutableLongIntMap.set(j13, i13);
        return mutableLongIntMap;
    }

    @NotNull
    public static final MutableLongIntMap mutableLongIntMapOf(long j10, int i10, long j11, int i11, long j12, int i12, long j13, int i13) {
        MutableLongIntMap mutableLongIntMap = new MutableLongIntMap(0, 1, null);
        mutableLongIntMap.set(j10, i10);
        mutableLongIntMap.set(j11, i11);
        mutableLongIntMap.set(j12, i12);
        mutableLongIntMap.set(j13, i13);
        return mutableLongIntMap;
    }

    @NotNull
    public static final LongIntMap longIntMapOf(long j10, int i10, long j11, int i11, long j12, int i12, long j13, int i13, long j14, int i14) {
        MutableLongIntMap mutableLongIntMap = new MutableLongIntMap(0, 1, null);
        mutableLongIntMap.set(j10, i10);
        mutableLongIntMap.set(j11, i11);
        mutableLongIntMap.set(j12, i12);
        mutableLongIntMap.set(j13, i13);
        mutableLongIntMap.set(j14, i14);
        return mutableLongIntMap;
    }

    @NotNull
    public static final MutableLongIntMap mutableLongIntMapOf(long j10, int i10, long j11, int i11, long j12, int i12, long j13, int i13, long j14, int i14) {
        MutableLongIntMap mutableLongIntMap = new MutableLongIntMap(0, 1, null);
        mutableLongIntMap.set(j10, i10);
        mutableLongIntMap.set(j11, i11);
        mutableLongIntMap.set(j12, i12);
        mutableLongIntMap.set(j13, i13);
        mutableLongIntMap.set(j14, i14);
        return mutableLongIntMap;
    }
}
