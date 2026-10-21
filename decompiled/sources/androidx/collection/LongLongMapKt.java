package androidx.collection;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: LongLongMap.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u0006\u0010\u0002\u001a\u00020\u0000\u001a\u0016\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003\u001a&\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003\u001a6\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003\u001aF\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003\u001aV\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003\u001a\u0006\u0010\u000f\u001a\u00020\u000e\u001a\u0016\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003\u001a&\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003\u001a6\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003\u001aF\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003\u001aV\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003¨\u0006\u0010"}, d2 = {"Landroidx/collection/LongLongMap;", "emptyLongLongMap", "longLongMapOf", "", "key1", "value1", "key2", "value2", "key3", "value3", "key4", "value4", "key5", "value5", "Landroidx/collection/MutableLongLongMap;", "mutableLongLongMapOf", "collection"}, k = 2, mv = {1, 8, 0})
public final class LongLongMapKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final MutableLongLongMap f2386a = new MutableLongLongMap(0);

    @NotNull
    public static final LongLongMap emptyLongLongMap() {
        return f2386a;
    }

    @NotNull
    public static final LongLongMap longLongMapOf() {
        return f2386a;
    }

    @NotNull
    public static final MutableLongLongMap mutableLongLongMapOf() {
        return new MutableLongLongMap(0, 1, null);
    }

    @NotNull
    public static final LongLongMap longLongMapOf(long j10, long j11) {
        MutableLongLongMap mutableLongLongMap = new MutableLongLongMap(0, 1, null);
        mutableLongLongMap.set(j10, j11);
        return mutableLongLongMap;
    }

    @NotNull
    public static final MutableLongLongMap mutableLongLongMapOf(long j10, long j11) {
        MutableLongLongMap mutableLongLongMap = new MutableLongLongMap(0, 1, null);
        mutableLongLongMap.set(j10, j11);
        return mutableLongLongMap;
    }

    @NotNull
    public static final LongLongMap longLongMapOf(long j10, long j11, long j12, long j13) {
        MutableLongLongMap mutableLongLongMap = new MutableLongLongMap(0, 1, null);
        mutableLongLongMap.set(j10, j11);
        mutableLongLongMap.set(j12, j13);
        return mutableLongLongMap;
    }

    @NotNull
    public static final MutableLongLongMap mutableLongLongMapOf(long j10, long j11, long j12, long j13) {
        MutableLongLongMap mutableLongLongMap = new MutableLongLongMap(0, 1, null);
        mutableLongLongMap.set(j10, j11);
        mutableLongLongMap.set(j12, j13);
        return mutableLongLongMap;
    }

    @NotNull
    public static final LongLongMap longLongMapOf(long j10, long j11, long j12, long j13, long j14, long j15) {
        MutableLongLongMap mutableLongLongMap = new MutableLongLongMap(0, 1, null);
        mutableLongLongMap.set(j10, j11);
        mutableLongLongMap.set(j12, j13);
        mutableLongLongMap.set(j14, j15);
        return mutableLongLongMap;
    }

    @NotNull
    public static final MutableLongLongMap mutableLongLongMapOf(long j10, long j11, long j12, long j13, long j14, long j15) {
        MutableLongLongMap mutableLongLongMap = new MutableLongLongMap(0, 1, null);
        mutableLongLongMap.set(j10, j11);
        mutableLongLongMap.set(j12, j13);
        mutableLongLongMap.set(j14, j15);
        return mutableLongLongMap;
    }

    @NotNull
    public static final LongLongMap longLongMapOf(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17) {
        MutableLongLongMap mutableLongLongMap = new MutableLongLongMap(0, 1, null);
        mutableLongLongMap.set(j10, j11);
        mutableLongLongMap.set(j12, j13);
        mutableLongLongMap.set(j14, j15);
        mutableLongLongMap.set(j16, j17);
        return mutableLongLongMap;
    }

    @NotNull
    public static final MutableLongLongMap mutableLongLongMapOf(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17) {
        MutableLongLongMap mutableLongLongMap = new MutableLongLongMap(0, 1, null);
        mutableLongLongMap.set(j10, j11);
        mutableLongLongMap.set(j12, j13);
        mutableLongLongMap.set(j14, j15);
        mutableLongLongMap.set(j16, j17);
        return mutableLongLongMap;
    }

    @NotNull
    public static final LongLongMap longLongMapOf(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19) {
        MutableLongLongMap mutableLongLongMap = new MutableLongLongMap(0, 1, null);
        mutableLongLongMap.set(j10, j11);
        mutableLongLongMap.set(j12, j13);
        mutableLongLongMap.set(j14, j15);
        mutableLongLongMap.set(j16, j17);
        mutableLongLongMap.set(j18, j19);
        return mutableLongLongMap;
    }

    @NotNull
    public static final MutableLongLongMap mutableLongLongMapOf(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19) {
        MutableLongLongMap mutableLongLongMap = new MutableLongLongMap(0, 1, null);
        mutableLongLongMap.set(j10, j11);
        mutableLongLongMap.set(j12, j13);
        mutableLongLongMap.set(j14, j15);
        mutableLongLongMap.set(j16, j17);
        mutableLongLongMap.set(j18, j19);
        return mutableLongLongMap;
    }
}
