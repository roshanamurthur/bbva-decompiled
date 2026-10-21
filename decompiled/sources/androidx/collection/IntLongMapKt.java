package androidx.collection;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: IntLongMap.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u0006\u0010\u0002\u001a\u00020\u0000\u001a\u0016\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005\u001a&\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0005\u001a6\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0005\u001aF\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0005\u001aV\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0005\u001a\u0006\u0010\u0010\u001a\u00020\u000f\u001a\u0016\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005\u001a&\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0005\u001a6\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0005\u001aF\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0005\u001aV\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0005¨\u0006\u0011"}, d2 = {"Landroidx/collection/IntLongMap;", "emptyIntLongMap", "intLongMapOf", "", "key1", "", "value1", "key2", "value2", "key3", "value3", "key4", "value4", "key5", "value5", "Landroidx/collection/MutableIntLongMap;", "mutableIntLongMapOf", "collection"}, k = 2, mv = {1, 8, 0})
public final class IntLongMapKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final MutableIntLongMap f2379a = new MutableIntLongMap(0);

    @NotNull
    public static final IntLongMap emptyIntLongMap() {
        return f2379a;
    }

    @NotNull
    public static final IntLongMap intLongMapOf() {
        return f2379a;
    }

    @NotNull
    public static final MutableIntLongMap mutableIntLongMapOf() {
        return new MutableIntLongMap(0, 1, null);
    }

    @NotNull
    public static final IntLongMap intLongMapOf(int i10, long j10) {
        MutableIntLongMap mutableIntLongMap = new MutableIntLongMap(0, 1, null);
        mutableIntLongMap.set(i10, j10);
        return mutableIntLongMap;
    }

    @NotNull
    public static final MutableIntLongMap mutableIntLongMapOf(int i10, long j10) {
        MutableIntLongMap mutableIntLongMap = new MutableIntLongMap(0, 1, null);
        mutableIntLongMap.set(i10, j10);
        return mutableIntLongMap;
    }

    @NotNull
    public static final IntLongMap intLongMapOf(int i10, long j10, int i11, long j11) {
        MutableIntLongMap mutableIntLongMap = new MutableIntLongMap(0, 1, null);
        mutableIntLongMap.set(i10, j10);
        mutableIntLongMap.set(i11, j11);
        return mutableIntLongMap;
    }

    @NotNull
    public static final MutableIntLongMap mutableIntLongMapOf(int i10, long j10, int i11, long j11) {
        MutableIntLongMap mutableIntLongMap = new MutableIntLongMap(0, 1, null);
        mutableIntLongMap.set(i10, j10);
        mutableIntLongMap.set(i11, j11);
        return mutableIntLongMap;
    }

    @NotNull
    public static final IntLongMap intLongMapOf(int i10, long j10, int i11, long j11, int i12, long j12) {
        MutableIntLongMap mutableIntLongMap = new MutableIntLongMap(0, 1, null);
        mutableIntLongMap.set(i10, j10);
        mutableIntLongMap.set(i11, j11);
        mutableIntLongMap.set(i12, j12);
        return mutableIntLongMap;
    }

    @NotNull
    public static final MutableIntLongMap mutableIntLongMapOf(int i10, long j10, int i11, long j11, int i12, long j12) {
        MutableIntLongMap mutableIntLongMap = new MutableIntLongMap(0, 1, null);
        mutableIntLongMap.set(i10, j10);
        mutableIntLongMap.set(i11, j11);
        mutableIntLongMap.set(i12, j12);
        return mutableIntLongMap;
    }

    @NotNull
    public static final IntLongMap intLongMapOf(int i10, long j10, int i11, long j11, int i12, long j12, int i13, long j13) {
        MutableIntLongMap mutableIntLongMap = new MutableIntLongMap(0, 1, null);
        mutableIntLongMap.set(i10, j10);
        mutableIntLongMap.set(i11, j11);
        mutableIntLongMap.set(i12, j12);
        mutableIntLongMap.set(i13, j13);
        return mutableIntLongMap;
    }

    @NotNull
    public static final MutableIntLongMap mutableIntLongMapOf(int i10, long j10, int i11, long j11, int i12, long j12, int i13, long j13) {
        MutableIntLongMap mutableIntLongMap = new MutableIntLongMap(0, 1, null);
        mutableIntLongMap.set(i10, j10);
        mutableIntLongMap.set(i11, j11);
        mutableIntLongMap.set(i12, j12);
        mutableIntLongMap.set(i13, j13);
        return mutableIntLongMap;
    }

    @NotNull
    public static final IntLongMap intLongMapOf(int i10, long j10, int i11, long j11, int i12, long j12, int i13, long j13, int i14, long j14) {
        MutableIntLongMap mutableIntLongMap = new MutableIntLongMap(0, 1, null);
        mutableIntLongMap.set(i10, j10);
        mutableIntLongMap.set(i11, j11);
        mutableIntLongMap.set(i12, j12);
        mutableIntLongMap.set(i13, j13);
        mutableIntLongMap.set(i14, j14);
        return mutableIntLongMap;
    }

    @NotNull
    public static final MutableIntLongMap mutableIntLongMapOf(int i10, long j10, int i11, long j11, int i12, long j12, int i13, long j13, int i14, long j14) {
        MutableIntLongMap mutableIntLongMap = new MutableIntLongMap(0, 1, null);
        mutableIntLongMap.set(i10, j10);
        mutableIntLongMap.set(i11, j11);
        mutableIntLongMap.set(i12, j12);
        mutableIntLongMap.set(i13, j13);
        mutableIntLongMap.set(i14, j14);
        return mutableIntLongMap;
    }
}
