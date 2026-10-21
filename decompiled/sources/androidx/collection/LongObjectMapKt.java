package androidx.collection;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: LongObjectMap.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0012\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000\u001a\u0012\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000\u001a)\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\u0003\u0010\u0007\u001a9\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00028\u0000¢\u0006\u0004\b\u0003\u0010\n\u001aI\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00028\u0000¢\u0006\u0004\b\u0003\u0010\r\u001aY\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00028\u0000¢\u0006\u0004\b\u0003\u0010\u0010\u001ai\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00028\u0000¢\u0006\u0004\b\u0003\u0010\u0013\u001a\u0012\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014\"\u0004\b\u0000\u0010\u0000\u001a)\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a9\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00028\u0000¢\u0006\u0004\b\u0015\u0010\u0017\u001aI\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00028\u0000¢\u0006\u0004\b\u0015\u0010\u0018\u001aY\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00028\u0000¢\u0006\u0004\b\u0015\u0010\u0019\u001ai\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00028\u0000¢\u0006\u0004\b\u0015\u0010\u001a¨\u0006\u001b"}, d2 = {ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/collection/LongObjectMap;", "emptyLongObjectMap", "longObjectMapOf", "", "key1", "value1", "(JLjava/lang/Object;)Landroidx/collection/LongObjectMap;", "key2", "value2", "(JLjava/lang/Object;JLjava/lang/Object;)Landroidx/collection/LongObjectMap;", "key3", "value3", "(JLjava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;)Landroidx/collection/LongObjectMap;", "key4", "value4", "(JLjava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;)Landroidx/collection/LongObjectMap;", "key5", "value5", "(JLjava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;)Landroidx/collection/LongObjectMap;", "Landroidx/collection/MutableLongObjectMap;", "mutableLongObjectMapOf", "(JLjava/lang/Object;)Landroidx/collection/MutableLongObjectMap;", "(JLjava/lang/Object;JLjava/lang/Object;)Landroidx/collection/MutableLongObjectMap;", "(JLjava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;)Landroidx/collection/MutableLongObjectMap;", "(JLjava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;)Landroidx/collection/MutableLongObjectMap;", "(JLjava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;)Landroidx/collection/MutableLongObjectMap;", "collection"}, k = 2, mv = {1, 8, 0})
public final class LongObjectMapKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final MutableLongObjectMap f2389a = new MutableLongObjectMap(0);

    @NotNull
    public static final <V> LongObjectMap<V> emptyLongObjectMap() {
        MutableLongObjectMap mutableLongObjectMap = f2389a;
        Intrinsics.checkNotNull(mutableLongObjectMap, "null cannot be cast to non-null type androidx.collection.LongObjectMap<V of androidx.collection.LongObjectMapKt.emptyLongObjectMap>");
        return mutableLongObjectMap;
    }

    @NotNull
    public static final <V> LongObjectMap<V> longObjectMapOf() {
        MutableLongObjectMap mutableLongObjectMap = f2389a;
        Intrinsics.checkNotNull(mutableLongObjectMap, "null cannot be cast to non-null type androidx.collection.LongObjectMap<V of androidx.collection.LongObjectMapKt.longObjectMapOf>");
        return mutableLongObjectMap;
    }

    @NotNull
    public static final <V> MutableLongObjectMap<V> mutableLongObjectMapOf() {
        return new MutableLongObjectMap<>(0, 1, null);
    }

    @NotNull
    public static final <V> LongObjectMap<V> longObjectMapOf(long j10, V v3) {
        MutableLongObjectMap mutableLongObjectMap = new MutableLongObjectMap(0, 1, null);
        mutableLongObjectMap.set(j10, v3);
        return mutableLongObjectMap;
    }

    @NotNull
    public static final <V> MutableLongObjectMap<V> mutableLongObjectMapOf(long j10, V v3) {
        MutableLongObjectMap<V> mutableLongObjectMap = new MutableLongObjectMap<>(0, 1, null);
        mutableLongObjectMap.set(j10, v3);
        return mutableLongObjectMap;
    }

    @NotNull
    public static final <V> LongObjectMap<V> longObjectMapOf(long j10, V v3, long j11, V v6) {
        MutableLongObjectMap mutableLongObjectMap = new MutableLongObjectMap(0, 1, null);
        mutableLongObjectMap.set(j10, v3);
        mutableLongObjectMap.set(j11, v6);
        return mutableLongObjectMap;
    }

    @NotNull
    public static final <V> MutableLongObjectMap<V> mutableLongObjectMapOf(long j10, V v3, long j11, V v6) {
        MutableLongObjectMap<V> mutableLongObjectMap = new MutableLongObjectMap<>(0, 1, null);
        mutableLongObjectMap.set(j10, v3);
        mutableLongObjectMap.set(j11, v6);
        return mutableLongObjectMap;
    }

    @NotNull
    public static final <V> LongObjectMap<V> longObjectMapOf(long j10, V v3, long j11, V v6, long j12, V v10) {
        MutableLongObjectMap mutableLongObjectMap = new MutableLongObjectMap(0, 1, null);
        mutableLongObjectMap.set(j10, v3);
        mutableLongObjectMap.set(j11, v6);
        mutableLongObjectMap.set(j12, v10);
        return mutableLongObjectMap;
    }

    @NotNull
    public static final <V> MutableLongObjectMap<V> mutableLongObjectMapOf(long j10, V v3, long j11, V v6, long j12, V v10) {
        MutableLongObjectMap<V> mutableLongObjectMap = new MutableLongObjectMap<>(0, 1, null);
        mutableLongObjectMap.set(j10, v3);
        mutableLongObjectMap.set(j11, v6);
        mutableLongObjectMap.set(j12, v10);
        return mutableLongObjectMap;
    }

    @NotNull
    public static final <V> LongObjectMap<V> longObjectMapOf(long j10, V v3, long j11, V v6, long j12, V v10, long j13, V v11) {
        MutableLongObjectMap mutableLongObjectMap = new MutableLongObjectMap(0, 1, null);
        mutableLongObjectMap.set(j10, v3);
        mutableLongObjectMap.set(j11, v6);
        mutableLongObjectMap.set(j12, v10);
        mutableLongObjectMap.set(j13, v11);
        return mutableLongObjectMap;
    }

    @NotNull
    public static final <V> MutableLongObjectMap<V> mutableLongObjectMapOf(long j10, V v3, long j11, V v6, long j12, V v10, long j13, V v11) {
        MutableLongObjectMap<V> mutableLongObjectMap = new MutableLongObjectMap<>(0, 1, null);
        mutableLongObjectMap.set(j10, v3);
        mutableLongObjectMap.set(j11, v6);
        mutableLongObjectMap.set(j12, v10);
        mutableLongObjectMap.set(j13, v11);
        return mutableLongObjectMap;
    }

    @NotNull
    public static final <V> LongObjectMap<V> longObjectMapOf(long j10, V v3, long j11, V v6, long j12, V v10, long j13, V v11, long j14, V v12) {
        MutableLongObjectMap mutableLongObjectMap = new MutableLongObjectMap(0, 1, null);
        mutableLongObjectMap.set(j10, v3);
        mutableLongObjectMap.set(j11, v6);
        mutableLongObjectMap.set(j12, v10);
        mutableLongObjectMap.set(j13, v11);
        mutableLongObjectMap.set(j14, v12);
        return mutableLongObjectMap;
    }

    @NotNull
    public static final <V> MutableLongObjectMap<V> mutableLongObjectMapOf(long j10, V v3, long j11, V v6, long j12, V v10, long j13, V v11, long j14, V v12) {
        MutableLongObjectMap<V> mutableLongObjectMap = new MutableLongObjectMap<>(0, 1, null);
        mutableLongObjectMap.set(j10, v3);
        mutableLongObjectMap.set(j11, v6);
        mutableLongObjectMap.set(j12, v10);
        mutableLongObjectMap.set(j13, v11);
        mutableLongObjectMap.set(j14, v12);
        return mutableLongObjectMap;
    }
}
