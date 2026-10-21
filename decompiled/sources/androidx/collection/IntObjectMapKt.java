package androidx.collection;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: IntObjectMap.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0012\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000\u001a\u0012\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000\u001a)\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\u0003\u0010\u0007\u001a9\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00028\u0000¢\u0006\u0004\b\u0003\u0010\n\u001aI\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00028\u0000¢\u0006\u0004\b\u0003\u0010\r\u001aY\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00028\u0000¢\u0006\u0004\b\u0003\u0010\u0010\u001ai\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00028\u0000¢\u0006\u0004\b\u0003\u0010\u0013\u001a\u0012\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014\"\u0004\b\u0000\u0010\u0000\u001a)\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a9\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00028\u0000¢\u0006\u0004\b\u0015\u0010\u0017\u001aI\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00028\u0000¢\u0006\u0004\b\u0015\u0010\u0018\u001aY\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00028\u0000¢\u0006\u0004\b\u0015\u0010\u0019\u001ai\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00028\u0000¢\u0006\u0004\b\u0015\u0010\u001a¨\u0006\u001b"}, d2 = {ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/collection/IntObjectMap;", "emptyIntObjectMap", "intObjectMapOf", "", "key1", "value1", "(ILjava/lang/Object;)Landroidx/collection/IntObjectMap;", "key2", "value2", "(ILjava/lang/Object;ILjava/lang/Object;)Landroidx/collection/IntObjectMap;", "key3", "value3", "(ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;)Landroidx/collection/IntObjectMap;", "key4", "value4", "(ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;)Landroidx/collection/IntObjectMap;", "key5", "value5", "(ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;)Landroidx/collection/IntObjectMap;", "Landroidx/collection/MutableIntObjectMap;", "mutableIntObjectMapOf", "(ILjava/lang/Object;)Landroidx/collection/MutableIntObjectMap;", "(ILjava/lang/Object;ILjava/lang/Object;)Landroidx/collection/MutableIntObjectMap;", "(ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;)Landroidx/collection/MutableIntObjectMap;", "(ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;)Landroidx/collection/MutableIntObjectMap;", "(ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;)Landroidx/collection/MutableIntObjectMap;", "collection"}, k = 2, mv = {1, 8, 0})
public final class IntObjectMapKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final MutableIntObjectMap f2380a = new MutableIntObjectMap(0);

    @NotNull
    public static final <V> IntObjectMap<V> emptyIntObjectMap() {
        MutableIntObjectMap mutableIntObjectMap = f2380a;
        Intrinsics.checkNotNull(mutableIntObjectMap, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.emptyIntObjectMap>");
        return mutableIntObjectMap;
    }

    @NotNull
    public static final <V> IntObjectMap<V> intObjectMapOf() {
        MutableIntObjectMap mutableIntObjectMap = f2380a;
        Intrinsics.checkNotNull(mutableIntObjectMap, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        return mutableIntObjectMap;
    }

    @NotNull
    public static final <V> MutableIntObjectMap<V> mutableIntObjectMapOf() {
        return new MutableIntObjectMap<>(0, 1, null);
    }

    @NotNull
    public static final <V> IntObjectMap<V> intObjectMapOf(int i10, V v3) {
        MutableIntObjectMap mutableIntObjectMap = new MutableIntObjectMap(0, 1, null);
        mutableIntObjectMap.set(i10, v3);
        return mutableIntObjectMap;
    }

    @NotNull
    public static final <V> MutableIntObjectMap<V> mutableIntObjectMapOf(int i10, V v3) {
        MutableIntObjectMap<V> mutableIntObjectMap = new MutableIntObjectMap<>(0, 1, null);
        mutableIntObjectMap.set(i10, v3);
        return mutableIntObjectMap;
    }

    @NotNull
    public static final <V> IntObjectMap<V> intObjectMapOf(int i10, V v3, int i11, V v6) {
        MutableIntObjectMap mutableIntObjectMap = new MutableIntObjectMap(0, 1, null);
        mutableIntObjectMap.set(i10, v3);
        mutableIntObjectMap.set(i11, v6);
        return mutableIntObjectMap;
    }

    @NotNull
    public static final <V> MutableIntObjectMap<V> mutableIntObjectMapOf(int i10, V v3, int i11, V v6) {
        MutableIntObjectMap<V> mutableIntObjectMap = new MutableIntObjectMap<>(0, 1, null);
        mutableIntObjectMap.set(i10, v3);
        mutableIntObjectMap.set(i11, v6);
        return mutableIntObjectMap;
    }

    @NotNull
    public static final <V> IntObjectMap<V> intObjectMapOf(int i10, V v3, int i11, V v6, int i12, V v10) {
        MutableIntObjectMap mutableIntObjectMap = new MutableIntObjectMap(0, 1, null);
        mutableIntObjectMap.set(i10, v3);
        mutableIntObjectMap.set(i11, v6);
        mutableIntObjectMap.set(i12, v10);
        return mutableIntObjectMap;
    }

    @NotNull
    public static final <V> MutableIntObjectMap<V> mutableIntObjectMapOf(int i10, V v3, int i11, V v6, int i12, V v10) {
        MutableIntObjectMap<V> mutableIntObjectMap = new MutableIntObjectMap<>(0, 1, null);
        mutableIntObjectMap.set(i10, v3);
        mutableIntObjectMap.set(i11, v6);
        mutableIntObjectMap.set(i12, v10);
        return mutableIntObjectMap;
    }

    @NotNull
    public static final <V> IntObjectMap<V> intObjectMapOf(int i10, V v3, int i11, V v6, int i12, V v10, int i13, V v11) {
        MutableIntObjectMap mutableIntObjectMap = new MutableIntObjectMap(0, 1, null);
        mutableIntObjectMap.set(i10, v3);
        mutableIntObjectMap.set(i11, v6);
        mutableIntObjectMap.set(i12, v10);
        mutableIntObjectMap.set(i13, v11);
        return mutableIntObjectMap;
    }

    @NotNull
    public static final <V> MutableIntObjectMap<V> mutableIntObjectMapOf(int i10, V v3, int i11, V v6, int i12, V v10, int i13, V v11) {
        MutableIntObjectMap<V> mutableIntObjectMap = new MutableIntObjectMap<>(0, 1, null);
        mutableIntObjectMap.set(i10, v3);
        mutableIntObjectMap.set(i11, v6);
        mutableIntObjectMap.set(i12, v10);
        mutableIntObjectMap.set(i13, v11);
        return mutableIntObjectMap;
    }

    @NotNull
    public static final <V> IntObjectMap<V> intObjectMapOf(int i10, V v3, int i11, V v6, int i12, V v10, int i13, V v11, int i14, V v12) {
        MutableIntObjectMap mutableIntObjectMap = new MutableIntObjectMap(0, 1, null);
        mutableIntObjectMap.set(i10, v3);
        mutableIntObjectMap.set(i11, v6);
        mutableIntObjectMap.set(i12, v10);
        mutableIntObjectMap.set(i13, v11);
        mutableIntObjectMap.set(i14, v12);
        return mutableIntObjectMap;
    }

    @NotNull
    public static final <V> MutableIntObjectMap<V> mutableIntObjectMapOf(int i10, V v3, int i11, V v6, int i12, V v10, int i13, V v11, int i14, V v12) {
        MutableIntObjectMap<V> mutableIntObjectMap = new MutableIntObjectMap<>(0, 1, null);
        mutableIntObjectMap.set(i10, v3);
        mutableIntObjectMap.set(i11, v6);
        mutableIntObjectMap.set(i12, v10);
        mutableIntObjectMap.set(i13, v11);
        mutableIntObjectMap.set(i14, v12);
        return mutableIntObjectMap;
    }
}
