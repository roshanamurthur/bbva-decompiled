package androidx.collection;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ObjectFloatMap.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0012\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000\u001a\u0012\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000\u001a)\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b\u001a9\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\u000b\u001aI\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\u000e\u001aY\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\u0011\u001ai\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\u0014\u001a\u0012\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015\"\u0004\b\u0000\u0010\u0000\u001a)\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0016\u0010\u0017\u001a9\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u0016\u0010\u0018\u001aI\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\u0005¢\u0006\u0004\b\u0016\u0010\u0019\u001aY\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\u0005¢\u0006\u0004\b\u0016\u0010\u001a\u001ai\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00020\u0005¢\u0006\u0004\b\u0016\u0010\u001b¨\u0006\u001c"}, d2 = {"K", "Landroidx/collection/ObjectFloatMap;", "emptyObjectFloatMap", "objectFloatMap", "key1", "", "value1", "objectFloatMapOf", "(Ljava/lang/Object;F)Landroidx/collection/ObjectFloatMap;", "key2", "value2", "(Ljava/lang/Object;FLjava/lang/Object;F)Landroidx/collection/ObjectFloatMap;", "key3", "value3", "(Ljava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;F)Landroidx/collection/ObjectFloatMap;", "key4", "value4", "(Ljava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;F)Landroidx/collection/ObjectFloatMap;", "key5", "value5", "(Ljava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;F)Landroidx/collection/ObjectFloatMap;", "Landroidx/collection/MutableObjectFloatMap;", "mutableObjectFloatMapOf", "(Ljava/lang/Object;F)Landroidx/collection/MutableObjectFloatMap;", "(Ljava/lang/Object;FLjava/lang/Object;F)Landroidx/collection/MutableObjectFloatMap;", "(Ljava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;F)Landroidx/collection/MutableObjectFloatMap;", "(Ljava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;F)Landroidx/collection/MutableObjectFloatMap;", "(Ljava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;F)Landroidx/collection/MutableObjectFloatMap;", "collection"}, k = 2, mv = {1, 8, 0})
public final class ObjectFloatMapKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final MutableObjectFloatMap<Object> f2478a = new MutableObjectFloatMap<>(0);

    @NotNull
    public static final <K> ObjectFloatMap<K> emptyObjectFloatMap() {
        MutableObjectFloatMap<Object> mutableObjectFloatMap = f2478a;
        Intrinsics.checkNotNull(mutableObjectFloatMap, "null cannot be cast to non-null type androidx.collection.ObjectFloatMap<K of androidx.collection.ObjectFloatMapKt.emptyObjectFloatMap>");
        return mutableObjectFloatMap;
    }

    @NotNull
    public static final <K> MutableObjectFloatMap<K> mutableObjectFloatMapOf() {
        return new MutableObjectFloatMap<>(0, 1, null);
    }

    @NotNull
    public static final <K> ObjectFloatMap<K> objectFloatMap() {
        MutableObjectFloatMap<Object> mutableObjectFloatMap = f2478a;
        Intrinsics.checkNotNull(mutableObjectFloatMap, "null cannot be cast to non-null type androidx.collection.ObjectFloatMap<K of androidx.collection.ObjectFloatMapKt.objectFloatMap>");
        return mutableObjectFloatMap;
    }

    @NotNull
    public static final <K> ObjectFloatMap<K> objectFloatMapOf(K k10, float f6) {
        MutableObjectFloatMap mutableObjectFloatMap = new MutableObjectFloatMap(0, 1, null);
        mutableObjectFloatMap.set(k10, f6);
        return mutableObjectFloatMap;
    }

    @NotNull
    public static final <K> MutableObjectFloatMap<K> mutableObjectFloatMapOf(K k10, float f6) {
        MutableObjectFloatMap<K> mutableObjectFloatMap = new MutableObjectFloatMap<>(0, 1, null);
        mutableObjectFloatMap.set(k10, f6);
        return mutableObjectFloatMap;
    }

    @NotNull
    public static final <K> ObjectFloatMap<K> objectFloatMapOf(K k10, float f6, K k11, float f10) {
        MutableObjectFloatMap mutableObjectFloatMap = new MutableObjectFloatMap(0, 1, null);
        mutableObjectFloatMap.set(k10, f6);
        mutableObjectFloatMap.set(k11, f10);
        return mutableObjectFloatMap;
    }

    @NotNull
    public static final <K> MutableObjectFloatMap<K> mutableObjectFloatMapOf(K k10, float f6, K k11, float f10) {
        MutableObjectFloatMap<K> mutableObjectFloatMap = new MutableObjectFloatMap<>(0, 1, null);
        mutableObjectFloatMap.set(k10, f6);
        mutableObjectFloatMap.set(k11, f10);
        return mutableObjectFloatMap;
    }

    @NotNull
    public static final <K> ObjectFloatMap<K> objectFloatMapOf(K k10, float f6, K k11, float f10, K k12, float f11) {
        MutableObjectFloatMap mutableObjectFloatMap = new MutableObjectFloatMap(0, 1, null);
        mutableObjectFloatMap.set(k10, f6);
        mutableObjectFloatMap.set(k11, f10);
        mutableObjectFloatMap.set(k12, f11);
        return mutableObjectFloatMap;
    }

    @NotNull
    public static final <K> MutableObjectFloatMap<K> mutableObjectFloatMapOf(K k10, float f6, K k11, float f10, K k12, float f11) {
        MutableObjectFloatMap<K> mutableObjectFloatMap = new MutableObjectFloatMap<>(0, 1, null);
        mutableObjectFloatMap.set(k10, f6);
        mutableObjectFloatMap.set(k11, f10);
        mutableObjectFloatMap.set(k12, f11);
        return mutableObjectFloatMap;
    }

    @NotNull
    public static final <K> ObjectFloatMap<K> objectFloatMapOf(K k10, float f6, K k11, float f10, K k12, float f11, K k13, float f12) {
        MutableObjectFloatMap mutableObjectFloatMap = new MutableObjectFloatMap(0, 1, null);
        mutableObjectFloatMap.set(k10, f6);
        mutableObjectFloatMap.set(k11, f10);
        mutableObjectFloatMap.set(k12, f11);
        mutableObjectFloatMap.set(k13, f12);
        return mutableObjectFloatMap;
    }

    @NotNull
    public static final <K> MutableObjectFloatMap<K> mutableObjectFloatMapOf(K k10, float f6, K k11, float f10, K k12, float f11, K k13, float f12) {
        MutableObjectFloatMap<K> mutableObjectFloatMap = new MutableObjectFloatMap<>(0, 1, null);
        mutableObjectFloatMap.set(k10, f6);
        mutableObjectFloatMap.set(k11, f10);
        mutableObjectFloatMap.set(k12, f11);
        mutableObjectFloatMap.set(k13, f12);
        return mutableObjectFloatMap;
    }

    @NotNull
    public static final <K> ObjectFloatMap<K> objectFloatMapOf(K k10, float f6, K k11, float f10, K k12, float f11, K k13, float f12, K k14, float f13) {
        MutableObjectFloatMap mutableObjectFloatMap = new MutableObjectFloatMap(0, 1, null);
        mutableObjectFloatMap.set(k10, f6);
        mutableObjectFloatMap.set(k11, f10);
        mutableObjectFloatMap.set(k12, f11);
        mutableObjectFloatMap.set(k13, f12);
        mutableObjectFloatMap.set(k14, f13);
        return mutableObjectFloatMap;
    }

    @NotNull
    public static final <K> MutableObjectFloatMap<K> mutableObjectFloatMapOf(K k10, float f6, K k11, float f10, K k12, float f11, K k13, float f12, K k14, float f13) {
        MutableObjectFloatMap<K> mutableObjectFloatMap = new MutableObjectFloatMap<>(0, 1, null);
        mutableObjectFloatMap.set(k10, f6);
        mutableObjectFloatMap.set(k11, f10);
        mutableObjectFloatMap.set(k12, f11);
        mutableObjectFloatMap.set(k13, f12);
        mutableObjectFloatMap.set(k14, f13);
        return mutableObjectFloatMap;
    }
}
