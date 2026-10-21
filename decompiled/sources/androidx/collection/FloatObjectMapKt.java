package androidx.collection;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FloatObjectMap.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0012\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000\u001a\u0012\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000\u001a)\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\u0003\u0010\u0007\u001a9\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00028\u0000¢\u0006\u0004\b\u0003\u0010\n\u001aI\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00028\u0000¢\u0006\u0004\b\u0003\u0010\r\u001aY\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00028\u0000¢\u0006\u0004\b\u0003\u0010\u0010\u001ai\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00028\u0000¢\u0006\u0004\b\u0003\u0010\u0013\u001a\u0012\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014\"\u0004\b\u0000\u0010\u0000\u001a)\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a9\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00028\u0000¢\u0006\u0004\b\u0015\u0010\u0017\u001aI\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00028\u0000¢\u0006\u0004\b\u0015\u0010\u0018\u001aY\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00028\u0000¢\u0006\u0004\b\u0015\u0010\u0019\u001ai\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00028\u0000¢\u0006\u0004\b\u0015\u0010\u001a¨\u0006\u001b"}, d2 = {ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/collection/FloatObjectMap;", "emptyFloatObjectMap", "floatObjectMapOf", "", "key1", "value1", "(FLjava/lang/Object;)Landroidx/collection/FloatObjectMap;", "key2", "value2", "(FLjava/lang/Object;FLjava/lang/Object;)Landroidx/collection/FloatObjectMap;", "key3", "value3", "(FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;)Landroidx/collection/FloatObjectMap;", "key4", "value4", "(FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;)Landroidx/collection/FloatObjectMap;", "key5", "value5", "(FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;)Landroidx/collection/FloatObjectMap;", "Landroidx/collection/MutableFloatObjectMap;", "mutableFloatObjectMapOf", "(FLjava/lang/Object;)Landroidx/collection/MutableFloatObjectMap;", "(FLjava/lang/Object;FLjava/lang/Object;)Landroidx/collection/MutableFloatObjectMap;", "(FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;)Landroidx/collection/MutableFloatObjectMap;", "(FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;)Landroidx/collection/MutableFloatObjectMap;", "(FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;)Landroidx/collection/MutableFloatObjectMap;", "collection"}, k = 2, mv = {1, 8, 0})
public final class FloatObjectMapKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final MutableFloatObjectMap f2370a = new MutableFloatObjectMap(0);

    @NotNull
    public static final <V> FloatObjectMap<V> emptyFloatObjectMap() {
        MutableFloatObjectMap mutableFloatObjectMap = f2370a;
        Intrinsics.checkNotNull(mutableFloatObjectMap, "null cannot be cast to non-null type androidx.collection.FloatObjectMap<V of androidx.collection.FloatObjectMapKt.emptyFloatObjectMap>");
        return mutableFloatObjectMap;
    }

    @NotNull
    public static final <V> FloatObjectMap<V> floatObjectMapOf() {
        MutableFloatObjectMap mutableFloatObjectMap = f2370a;
        Intrinsics.checkNotNull(mutableFloatObjectMap, "null cannot be cast to non-null type androidx.collection.FloatObjectMap<V of androidx.collection.FloatObjectMapKt.floatObjectMapOf>");
        return mutableFloatObjectMap;
    }

    @NotNull
    public static final <V> MutableFloatObjectMap<V> mutableFloatObjectMapOf() {
        return new MutableFloatObjectMap<>(0, 1, null);
    }

    @NotNull
    public static final <V> FloatObjectMap<V> floatObjectMapOf(float f6, V v3) {
        MutableFloatObjectMap mutableFloatObjectMap = new MutableFloatObjectMap(0, 1, null);
        mutableFloatObjectMap.set(f6, v3);
        return mutableFloatObjectMap;
    }

    @NotNull
    public static final <V> MutableFloatObjectMap<V> mutableFloatObjectMapOf(float f6, V v3) {
        MutableFloatObjectMap<V> mutableFloatObjectMap = new MutableFloatObjectMap<>(0, 1, null);
        mutableFloatObjectMap.set(f6, v3);
        return mutableFloatObjectMap;
    }

    @NotNull
    public static final <V> FloatObjectMap<V> floatObjectMapOf(float f6, V v3, float f10, V v6) {
        MutableFloatObjectMap mutableFloatObjectMap = new MutableFloatObjectMap(0, 1, null);
        mutableFloatObjectMap.set(f6, v3);
        mutableFloatObjectMap.set(f10, v6);
        return mutableFloatObjectMap;
    }

    @NotNull
    public static final <V> MutableFloatObjectMap<V> mutableFloatObjectMapOf(float f6, V v3, float f10, V v6) {
        MutableFloatObjectMap<V> mutableFloatObjectMap = new MutableFloatObjectMap<>(0, 1, null);
        mutableFloatObjectMap.set(f6, v3);
        mutableFloatObjectMap.set(f10, v6);
        return mutableFloatObjectMap;
    }

    @NotNull
    public static final <V> FloatObjectMap<V> floatObjectMapOf(float f6, V v3, float f10, V v6, float f11, V v10) {
        MutableFloatObjectMap mutableFloatObjectMap = new MutableFloatObjectMap(0, 1, null);
        mutableFloatObjectMap.set(f6, v3);
        mutableFloatObjectMap.set(f10, v6);
        mutableFloatObjectMap.set(f11, v10);
        return mutableFloatObjectMap;
    }

    @NotNull
    public static final <V> MutableFloatObjectMap<V> mutableFloatObjectMapOf(float f6, V v3, float f10, V v6, float f11, V v10) {
        MutableFloatObjectMap<V> mutableFloatObjectMap = new MutableFloatObjectMap<>(0, 1, null);
        mutableFloatObjectMap.set(f6, v3);
        mutableFloatObjectMap.set(f10, v6);
        mutableFloatObjectMap.set(f11, v10);
        return mutableFloatObjectMap;
    }

    @NotNull
    public static final <V> FloatObjectMap<V> floatObjectMapOf(float f6, V v3, float f10, V v6, float f11, V v10, float f12, V v11) {
        MutableFloatObjectMap mutableFloatObjectMap = new MutableFloatObjectMap(0, 1, null);
        mutableFloatObjectMap.set(f6, v3);
        mutableFloatObjectMap.set(f10, v6);
        mutableFloatObjectMap.set(f11, v10);
        mutableFloatObjectMap.set(f12, v11);
        return mutableFloatObjectMap;
    }

    @NotNull
    public static final <V> MutableFloatObjectMap<V> mutableFloatObjectMapOf(float f6, V v3, float f10, V v6, float f11, V v10, float f12, V v11) {
        MutableFloatObjectMap<V> mutableFloatObjectMap = new MutableFloatObjectMap<>(0, 1, null);
        mutableFloatObjectMap.set(f6, v3);
        mutableFloatObjectMap.set(f10, v6);
        mutableFloatObjectMap.set(f11, v10);
        mutableFloatObjectMap.set(f12, v11);
        return mutableFloatObjectMap;
    }

    @NotNull
    public static final <V> FloatObjectMap<V> floatObjectMapOf(float f6, V v3, float f10, V v6, float f11, V v10, float f12, V v11, float f13, V v12) {
        MutableFloatObjectMap mutableFloatObjectMap = new MutableFloatObjectMap(0, 1, null);
        mutableFloatObjectMap.set(f6, v3);
        mutableFloatObjectMap.set(f10, v6);
        mutableFloatObjectMap.set(f11, v10);
        mutableFloatObjectMap.set(f12, v11);
        mutableFloatObjectMap.set(f13, v12);
        return mutableFloatObjectMap;
    }

    @NotNull
    public static final <V> MutableFloatObjectMap<V> mutableFloatObjectMapOf(float f6, V v3, float f10, V v6, float f11, V v10, float f12, V v11, float f13, V v12) {
        MutableFloatObjectMap<V> mutableFloatObjectMap = new MutableFloatObjectMap<>(0, 1, null);
        mutableFloatObjectMap.set(f6, v3);
        mutableFloatObjectMap.set(f10, v6);
        mutableFloatObjectMap.set(f11, v10);
        mutableFloatObjectMap.set(f12, v11);
        mutableFloatObjectMap.set(f13, v12);
        return mutableFloatObjectMap;
    }
}
