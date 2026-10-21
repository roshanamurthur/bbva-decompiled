package androidx.collection;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: IntIntMap.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u0006\u0010\u0002\u001a\u00020\u0000\u001a\u0016\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003\u001a&\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003\u001a6\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003\u001aF\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003\u001aV\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003\u001a\u0006\u0010\u000f\u001a\u00020\u000e\u001a\u0016\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003\u001a&\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003\u001a6\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003\u001aF\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003\u001aV\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003¨\u0006\u0010"}, d2 = {"Landroidx/collection/IntIntMap;", "emptyIntIntMap", "intIntMapOf", "", "key1", "value1", "key2", "value2", "key3", "value3", "key4", "value4", "key5", "value5", "Landroidx/collection/MutableIntIntMap;", "mutableIntIntMapOf", "collection"}, k = 2, mv = {1, 8, 0})
public final class IntIntMapKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final MutableIntIntMap f2377a = new MutableIntIntMap(0);

    @NotNull
    public static final IntIntMap emptyIntIntMap() {
        return f2377a;
    }

    @NotNull
    public static final IntIntMap intIntMapOf() {
        return f2377a;
    }

    @NotNull
    public static final MutableIntIntMap mutableIntIntMapOf() {
        return new MutableIntIntMap(0, 1, null);
    }

    @NotNull
    public static final IntIntMap intIntMapOf(int i10, int i11) {
        MutableIntIntMap mutableIntIntMap = new MutableIntIntMap(0, 1, null);
        mutableIntIntMap.set(i10, i11);
        return mutableIntIntMap;
    }

    @NotNull
    public static final MutableIntIntMap mutableIntIntMapOf(int i10, int i11) {
        MutableIntIntMap mutableIntIntMap = new MutableIntIntMap(0, 1, null);
        mutableIntIntMap.set(i10, i11);
        return mutableIntIntMap;
    }

    @NotNull
    public static final IntIntMap intIntMapOf(int i10, int i11, int i12, int i13) {
        MutableIntIntMap mutableIntIntMap = new MutableIntIntMap(0, 1, null);
        mutableIntIntMap.set(i10, i11);
        mutableIntIntMap.set(i12, i13);
        return mutableIntIntMap;
    }

    @NotNull
    public static final MutableIntIntMap mutableIntIntMapOf(int i10, int i11, int i12, int i13) {
        MutableIntIntMap mutableIntIntMap = new MutableIntIntMap(0, 1, null);
        mutableIntIntMap.set(i10, i11);
        mutableIntIntMap.set(i12, i13);
        return mutableIntIntMap;
    }

    @NotNull
    public static final IntIntMap intIntMapOf(int i10, int i11, int i12, int i13, int i14, int i15) {
        MutableIntIntMap mutableIntIntMap = new MutableIntIntMap(0, 1, null);
        mutableIntIntMap.set(i10, i11);
        mutableIntIntMap.set(i12, i13);
        mutableIntIntMap.set(i14, i15);
        return mutableIntIntMap;
    }

    @NotNull
    public static final MutableIntIntMap mutableIntIntMapOf(int i10, int i11, int i12, int i13, int i14, int i15) {
        MutableIntIntMap mutableIntIntMap = new MutableIntIntMap(0, 1, null);
        mutableIntIntMap.set(i10, i11);
        mutableIntIntMap.set(i12, i13);
        mutableIntIntMap.set(i14, i15);
        return mutableIntIntMap;
    }

    @NotNull
    public static final IntIntMap intIntMapOf(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        MutableIntIntMap mutableIntIntMap = new MutableIntIntMap(0, 1, null);
        mutableIntIntMap.set(i10, i11);
        mutableIntIntMap.set(i12, i13);
        mutableIntIntMap.set(i14, i15);
        mutableIntIntMap.set(i16, i17);
        return mutableIntIntMap;
    }

    @NotNull
    public static final MutableIntIntMap mutableIntIntMapOf(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        MutableIntIntMap mutableIntIntMap = new MutableIntIntMap(0, 1, null);
        mutableIntIntMap.set(i10, i11);
        mutableIntIntMap.set(i12, i13);
        mutableIntIntMap.set(i14, i15);
        mutableIntIntMap.set(i16, i17);
        return mutableIntIntMap;
    }

    @NotNull
    public static final IntIntMap intIntMapOf(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        MutableIntIntMap mutableIntIntMap = new MutableIntIntMap(0, 1, null);
        mutableIntIntMap.set(i10, i11);
        mutableIntIntMap.set(i12, i13);
        mutableIntIntMap.set(i14, i15);
        mutableIntIntMap.set(i16, i17);
        mutableIntIntMap.set(i18, i19);
        return mutableIntIntMap;
    }

    @NotNull
    public static final MutableIntIntMap mutableIntIntMapOf(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        MutableIntIntMap mutableIntIntMap = new MutableIntIntMap(0, 1, null);
        mutableIntIntMap.set(i10, i11);
        mutableIntIntMap.set(i12, i13);
        mutableIntIntMap.set(i14, i15);
        mutableIntIntMap.set(i16, i17);
        mutableIntIntMap.set(i18, i19);
        return mutableIntIntMap;
    }
}
