package androidx.recyclerview.widget;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.collection.LongSparseArray;
import androidx.collection.SimpleArrayMap;
import androidx.core.util.Pools;

/* JADX INFO: compiled from: ViewInfoStore.java */
/* JADX INFO: loaded from: classes2.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @VisibleForTesting
    public final SimpleArrayMap<RecyclerView.ViewHolder, a> f23088a = new SimpleArrayMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @VisibleForTesting
    public final LongSparseArray<RecyclerView.ViewHolder> f23089b = new LongSparseArray<>();

    /* JADX INFO: compiled from: ViewInfoStore.java */
    public static class a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final Pools.SimplePool f23090d = new Pools.SimplePool(20);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f23091a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public RecyclerView.ItemAnimator.ItemHolderInfo f23092b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public RecyclerView.ItemAnimator.ItemHolderInfo f23093c;

        /* JADX WARN: Multi-variable type inference failed */
        public static a a() {
            a aVar = (a) f23090d.acquire();
            return aVar == null ? new a() : aVar;
        }
    }

    public final void a(RecyclerView.ViewHolder viewHolder, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo) {
        SimpleArrayMap<RecyclerView.ViewHolder, a> simpleArrayMap = this.f23088a;
        a aVarA = simpleArrayMap.get(viewHolder);
        if (aVarA == null) {
            aVarA = a.a();
            simpleArrayMap.put(viewHolder, aVarA);
        }
        aVarA.f23093c = itemHolderInfo;
        aVarA.f23091a |= 8;
    }

    public final RecyclerView.ItemAnimator.ItemHolderInfo b(RecyclerView.ViewHolder viewHolder, int i10) {
        a aVarValueAt;
        RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo;
        SimpleArrayMap<RecyclerView.ViewHolder, a> simpleArrayMap = this.f23088a;
        int iIndexOfKey = simpleArrayMap.indexOfKey(viewHolder);
        if (iIndexOfKey >= 0 && (aVarValueAt = simpleArrayMap.valueAt(iIndexOfKey)) != null) {
            int i11 = aVarValueAt.f23091a;
            if ((i11 & i10) != 0) {
                int i12 = i11 & (~i10);
                aVarValueAt.f23091a = i12;
                if (i10 == 4) {
                    itemHolderInfo = aVarValueAt.f23092b;
                } else {
                    if (i10 != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    itemHolderInfo = aVarValueAt.f23093c;
                }
                if ((i12 & 12) == 0) {
                    simpleArrayMap.removeAt(iIndexOfKey);
                    aVarValueAt.f23091a = 0;
                    aVarValueAt.f23092b = null;
                    aVarValueAt.f23093c = null;
                    a.f23090d.release(aVarValueAt);
                }
                return itemHolderInfo;
            }
        }
        return null;
    }

    public final void c(RecyclerView.ViewHolder viewHolder) {
        a aVar = this.f23088a.get(viewHolder);
        if (aVar == null) {
            return;
        }
        aVar.f23091a &= -2;
    }

    public final void d(RecyclerView.ViewHolder viewHolder) {
        LongSparseArray<RecyclerView.ViewHolder> longSparseArray = this.f23089b;
        for (int size = longSparseArray.size() - 1; size >= 0; size--) {
            if (viewHolder == longSparseArray.valueAt(size)) {
                longSparseArray.removeAt(size);
                break;
            }
        }
        a aVarRemove = this.f23088a.remove(viewHolder);
        if (aVarRemove != null) {
            aVarRemove.f23091a = 0;
            aVarRemove.f23092b = null;
            aVarRemove.f23093c = null;
            a.f23090d.release(aVarRemove);
        }
    }
}
