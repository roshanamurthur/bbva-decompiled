package androidx.collection;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ObjectIntMap.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0012\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000\u001a\u0012\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000\u001a)\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b\u001a9\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\u000b\u001aI\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\u000e\u001aY\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\u0011\u001ai\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\u0014\u001a\u0012\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015\"\u0004\b\u0000\u0010\u0000\u001a)\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0016\u0010\u0017\u001a9\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u0016\u0010\u0018\u001aI\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\u0005¢\u0006\u0004\b\u0016\u0010\u0019\u001aY\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\u0005¢\u0006\u0004\b\u0016\u0010\u001a\u001ai\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00020\u0005¢\u0006\u0004\b\u0016\u0010\u001b¨\u0006\u001c"}, d2 = {"K", "Landroidx/collection/ObjectIntMap;", "emptyObjectIntMap", "objectIntMap", "key1", "", "value1", "objectIntMapOf", "(Ljava/lang/Object;I)Landroidx/collection/ObjectIntMap;", "key2", "value2", "(Ljava/lang/Object;ILjava/lang/Object;I)Landroidx/collection/ObjectIntMap;", "key3", "value3", "(Ljava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;I)Landroidx/collection/ObjectIntMap;", "key4", "value4", "(Ljava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;I)Landroidx/collection/ObjectIntMap;", "key5", "value5", "(Ljava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;I)Landroidx/collection/ObjectIntMap;", "Landroidx/collection/MutableObjectIntMap;", "mutableObjectIntMapOf", "(Ljava/lang/Object;I)Landroidx/collection/MutableObjectIntMap;", "(Ljava/lang/Object;ILjava/lang/Object;I)Landroidx/collection/MutableObjectIntMap;", "(Ljava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;I)Landroidx/collection/MutableObjectIntMap;", "(Ljava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;I)Landroidx/collection/MutableObjectIntMap;", "(Ljava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;I)Landroidx/collection/MutableObjectIntMap;", "collection"}, k = 2, mv = {1, 8, 0})
public final class ObjectIntMapKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final MutableObjectIntMap<Object> f2479a = new MutableObjectIntMap<>(0);

    @NotNull
    public static final <K> ObjectIntMap<K> emptyObjectIntMap() {
        MutableObjectIntMap<Object> mutableObjectIntMap = f2479a;
        Intrinsics.checkNotNull(mutableObjectIntMap, "null cannot be cast to non-null type androidx.collection.ObjectIntMap<K of androidx.collection.ObjectIntMapKt.emptyObjectIntMap>");
        return mutableObjectIntMap;
    }

    @NotNull
    public static final <K> MutableObjectIntMap<K> mutableObjectIntMapOf() {
        return new MutableObjectIntMap<>(0, 1, null);
    }

    @NotNull
    public static final <K> ObjectIntMap<K> objectIntMap() {
        MutableObjectIntMap<Object> mutableObjectIntMap = f2479a;
        Intrinsics.checkNotNull(mutableObjectIntMap, "null cannot be cast to non-null type androidx.collection.ObjectIntMap<K of androidx.collection.ObjectIntMapKt.objectIntMap>");
        return mutableObjectIntMap;
    }

    @NotNull
    public static final <K> ObjectIntMap<K> objectIntMapOf(K k10, int i10) {
        MutableObjectIntMap mutableObjectIntMap = new MutableObjectIntMap(0, 1, null);
        mutableObjectIntMap.set(k10, i10);
        return mutableObjectIntMap;
    }

    @NotNull
    public static final <K> MutableObjectIntMap<K> mutableObjectIntMapOf(K k10, int i10) {
        MutableObjectIntMap<K> mutableObjectIntMap = new MutableObjectIntMap<>(0, 1, null);
        mutableObjectIntMap.set(k10, i10);
        return mutableObjectIntMap;
    }

    @NotNull
    public static final <K> ObjectIntMap<K> objectIntMapOf(K k10, int i10, K k11, int i11) {
        MutableObjectIntMap mutableObjectIntMap = new MutableObjectIntMap(0, 1, null);
        mutableObjectIntMap.set(k10, i10);
        mutableObjectIntMap.set(k11, i11);
        return mutableObjectIntMap;
    }

    @NotNull
    public static final <K> MutableObjectIntMap<K> mutableObjectIntMapOf(K k10, int i10, K k11, int i11) {
        MutableObjectIntMap<K> mutableObjectIntMap = new MutableObjectIntMap<>(0, 1, null);
        mutableObjectIntMap.set(k10, i10);
        mutableObjectIntMap.set(k11, i11);
        return mutableObjectIntMap;
    }

    @NotNull
    public static final <K> ObjectIntMap<K> objectIntMapOf(K k10, int i10, K k11, int i11, K k12, int i12) {
        MutableObjectIntMap mutableObjectIntMap = new MutableObjectIntMap(0, 1, null);
        mutableObjectIntMap.set(k10, i10);
        mutableObjectIntMap.set(k11, i11);
        mutableObjectIntMap.set(k12, i12);
        return mutableObjectIntMap;
    }

    @NotNull
    public static final <K> MutableObjectIntMap<K> mutableObjectIntMapOf(K k10, int i10, K k11, int i11, K k12, int i12) {
        MutableObjectIntMap<K> mutableObjectIntMap = new MutableObjectIntMap<>(0, 1, null);
        mutableObjectIntMap.set(k10, i10);
        mutableObjectIntMap.set(k11, i11);
        mutableObjectIntMap.set(k12, i12);
        return mutableObjectIntMap;
    }

    @NotNull
    public static final <K> ObjectIntMap<K> objectIntMapOf(K k10, int i10, K k11, int i11, K k12, int i12, K k13, int i13) {
        MutableObjectIntMap mutableObjectIntMap = new MutableObjectIntMap(0, 1, null);
        mutableObjectIntMap.set(k10, i10);
        mutableObjectIntMap.set(k11, i11);
        mutableObjectIntMap.set(k12, i12);
        mutableObjectIntMap.set(k13, i13);
        return mutableObjectIntMap;
    }

    @NotNull
    public static final <K> MutableObjectIntMap<K> mutableObjectIntMapOf(K k10, int i10, K k11, int i11, K k12, int i12, K k13, int i13) {
        MutableObjectIntMap<K> mutableObjectIntMap = new MutableObjectIntMap<>(0, 1, null);
        mutableObjectIntMap.set(k10, i10);
        mutableObjectIntMap.set(k11, i11);
        mutableObjectIntMap.set(k12, i12);
        mutableObjectIntMap.set(k13, i13);
        return mutableObjectIntMap;
    }

    @NotNull
    public static final <K> ObjectIntMap<K> objectIntMapOf(K k10, int i10, K k11, int i11, K k12, int i12, K k13, int i13, K k14, int i14) {
        MutableObjectIntMap mutableObjectIntMap = new MutableObjectIntMap(0, 1, null);
        mutableObjectIntMap.set(k10, i10);
        mutableObjectIntMap.set(k11, i11);
        mutableObjectIntMap.set(k12, i12);
        mutableObjectIntMap.set(k13, i13);
        mutableObjectIntMap.set(k14, i14);
        return mutableObjectIntMap;
    }

    @NotNull
    public static final <K> MutableObjectIntMap<K> mutableObjectIntMapOf(K k10, int i10, K k11, int i11, K k12, int i12, K k13, int i13, K k14, int i14) {
        MutableObjectIntMap<K> mutableObjectIntMap = new MutableObjectIntMap<>(0, 1, null);
        mutableObjectIntMap.set(k10, i10);
        mutableObjectIntMap.set(k11, i11);
        mutableObjectIntMap.set(k12, i12);
        mutableObjectIntMap.set(k13, i13);
        mutableObjectIntMap.set(k14, i14);
        return mutableObjectIntMap;
    }
}
