package androidx.recyclerview.widget;

import android.util.Pair;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ConcatAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final c f22583p0;

    public static final class Config {

        @NonNull
        public static final Config DEFAULT = new Config(true, StableIdMode.NO_STABLE_IDS);
        public final boolean isolateViewTypes;

        @NonNull
        public final StableIdMode stableIdMode;

        public static final class Builder {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public boolean f22584a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public StableIdMode f22585b;

            public Builder() {
                Config config = Config.DEFAULT;
                this.f22584a = config.isolateViewTypes;
                this.f22585b = config.stableIdMode;
            }

            @NonNull
            public Config build() {
                return new Config(this.f22584a, this.f22585b);
            }

            @NonNull
            public Builder setIsolateViewTypes(boolean z10) {
                this.f22584a = z10;
                return this;
            }

            @NonNull
            public Builder setStableIdMode(@NonNull StableIdMode stableIdMode) {
                this.f22585b = stableIdMode;
                return this;
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class StableIdMode {
            private static final /* synthetic */ StableIdMode[] $VALUES;
            public static final StableIdMode ISOLATED_STABLE_IDS;
            public static final StableIdMode NO_STABLE_IDS;
            public static final StableIdMode SHARED_STABLE_IDS;

            static {
                StableIdMode stableIdMode = new StableIdMode("NO_STABLE_IDS", 0);
                NO_STABLE_IDS = stableIdMode;
                StableIdMode stableIdMode2 = new StableIdMode("ISOLATED_STABLE_IDS", 1);
                ISOLATED_STABLE_IDS = stableIdMode2;
                StableIdMode stableIdMode3 = new StableIdMode("SHARED_STABLE_IDS", 2);
                SHARED_STABLE_IDS = stableIdMode3;
                $VALUES = new StableIdMode[]{stableIdMode, stableIdMode2, stableIdMode3};
            }

            public StableIdMode() {
                throw null;
            }

            public static StableIdMode valueOf(String str) {
                return (StableIdMode) Enum.valueOf(StableIdMode.class, str);
            }

            public static StableIdMode[] values() {
                return (StableIdMode[]) $VALUES.clone();
            }
        }

        public Config(boolean z10, @NonNull StableIdMode stableIdMode) {
            this.isolateViewTypes = z10;
            this.stableIdMode = stableIdMode;
        }
    }

    @SafeVarargs
    public ConcatAdapter(@NonNull RecyclerView.Adapter<? extends RecyclerView.ViewHolder>... adapterArr) {
        this(Config.DEFAULT, adapterArr);
    }

    public final void a(@NonNull RecyclerView.Adapter.StateRestorationPolicy stateRestorationPolicy) {
        super.setStateRestorationPolicy(stateRestorationPolicy);
    }

    public boolean addAdapter(@NonNull RecyclerView.Adapter<? extends RecyclerView.ViewHolder> adapter) {
        c cVar = this.f22583p0;
        return cVar.a(cVar.f22967e.size(), adapter);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int findRelativeAdapterPositionIn(@NonNull RecyclerView.Adapter<? extends RecyclerView.ViewHolder> adapter, @NonNull RecyclerView.ViewHolder viewHolder, int i10) {
        c cVar = this.f22583p0;
        s sVar = cVar.f22966d.get(viewHolder);
        if (sVar == null) {
            return -1;
        }
        int iC = i10 - cVar.c(sVar);
        RecyclerView.Adapter<RecyclerView.ViewHolder> adapter2 = sVar.f23080c;
        int itemCount = adapter2.getItemCount();
        if (iC >= 0 && iC < itemCount) {
            return adapter2.findRelativeAdapterPositionIn(adapter, viewHolder, iC);
        }
        StringBuilder sbE = androidx.collection.h.e("Detected inconsistent adapter updates. The local position of the view holder maps to ", iC, " which is out of bounds for the adapter with size ", itemCount, ".Make sure to immediately call notify methods in your adapter when you change the backing dataviewHolder:");
        sbE.append(viewHolder);
        sbE.append("adapter:");
        sbE.append(adapter);
        throw new IllegalStateException(sbE.toString());
    }

    @NonNull
    public List<? extends RecyclerView.Adapter<? extends RecyclerView.ViewHolder>> getAdapters() {
        List listEmptyList;
        ArrayList arrayList = this.f22583p0.f22967e;
        if (arrayList.isEmpty()) {
            listEmptyList = Collections.emptyList();
        } else {
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((s) it.next()).f23080c);
            }
            listEmptyList = arrayList2;
        }
        return Collections.unmodifiableList(listEmptyList);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        Iterator it = this.f22583p0.f22967e.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 += ((s) it.next()).f23082e;
        }
        return i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i10) {
        c cVar = this.f22583p0;
        c.a aVarD = cVar.d(i10);
        s sVar = aVarD.f22971a;
        long jLocalToGlobal = sVar.f23079b.localToGlobal(sVar.f23080c.getItemId(aVarD.f22972b));
        aVarD.f22973c = false;
        aVarD.f22971a = null;
        aVarD.f22972b = -1;
        cVar.f22968f = aVarD;
        return jLocalToGlobal;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i10) {
        c cVar = this.f22583p0;
        c.a aVarD = cVar.d(i10);
        s sVar = aVarD.f22971a;
        int iLocalToGlobal = sVar.f23078a.localToGlobal(sVar.f23080c.getItemViewType(aVarD.f22972b));
        aVarD.f22973c = false;
        aVarD.f22971a = null;
        aVarD.f22972b = -1;
        cVar.f22968f = aVarD;
        return iLocalToGlobal;
    }

    @NonNull
    public Pair<RecyclerView.Adapter<? extends RecyclerView.ViewHolder>, Integer> getWrappedAdapterAndPosition(int i10) {
        c cVar = this.f22583p0;
        c.a aVarD = cVar.d(i10);
        Pair<RecyclerView.Adapter<? extends RecyclerView.ViewHolder>, Integer> pair = new Pair<>(aVarD.f22971a.f23080c, Integer.valueOf(aVarD.f22972b));
        aVarD.f22973c = false;
        aVarD.f22971a = null;
        aVarD.f22972b = -1;
        cVar.f22968f = aVarD;
        return pair;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        c cVar = this.f22583p0;
        ArrayList arrayList = cVar.f22965c;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((WeakReference) it.next()).get() == recyclerView) {
                return;
            }
        }
        arrayList.add(new WeakReference(recyclerView));
        Iterator it2 = cVar.f22967e.iterator();
        while (it2.hasNext()) {
            ((s) it2.next()).f23080c.onAttachedToRecyclerView(recyclerView);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i10) {
        c cVar = this.f22583p0;
        c.a aVarD = cVar.d(i10);
        cVar.f22966d.put(viewHolder, aVarD.f22971a);
        s sVar = aVarD.f22971a;
        sVar.f23080c.bindViewHolder(viewHolder, aVarD.f22972b);
        aVarD.f22973c = false;
        aVarD.f22971a = null;
        aVarD.f22972b = -1;
        cVar.f22968f = aVarD;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i10) {
        s wrapperForGlobalType = this.f22583p0.f22964b.getWrapperForGlobalType(i10);
        return wrapperForGlobalType.f23080c.onCreateViewHolder(viewGroup, wrapperForGlobalType.f23078a.globalToLocal(i10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(@NonNull RecyclerView recyclerView) {
        c cVar = this.f22583p0;
        ArrayList arrayList = cVar.f22965c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            WeakReference weakReference = (WeakReference) arrayList.get(size);
            if (weakReference.get() != null) {
                if (weakReference.get() == recyclerView) {
                    arrayList.remove(size);
                    break;
                }
            } else {
                arrayList.remove(size);
            }
        }
        Iterator it = cVar.f22967e.iterator();
        while (it.hasNext()) {
            ((s) it.next()).f23080c.onDetachedFromRecyclerView(recyclerView);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public boolean onFailedToRecycleView(@NonNull RecyclerView.ViewHolder viewHolder) {
        c cVar = this.f22583p0;
        IdentityHashMap<RecyclerView.ViewHolder, s> identityHashMap = cVar.f22966d;
        s sVar = identityHashMap.get(viewHolder);
        if (sVar != null) {
            boolean zOnFailedToRecycleView = sVar.f23080c.onFailedToRecycleView(viewHolder);
            identityHashMap.remove(viewHolder);
            return zOnFailedToRecycleView;
        }
        throw new IllegalStateException("Cannot find wrapper for " + viewHolder + ", seems like it is not bound by this adapter: " + cVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(@NonNull RecyclerView.ViewHolder viewHolder) {
        this.f22583p0.e(viewHolder).f23080c.onViewAttachedToWindow(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(@NonNull RecyclerView.ViewHolder viewHolder) {
        this.f22583p0.e(viewHolder).f23080c.onViewDetachedFromWindow(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewRecycled(@NonNull RecyclerView.ViewHolder viewHolder) {
        c cVar = this.f22583p0;
        IdentityHashMap<RecyclerView.ViewHolder, s> identityHashMap = cVar.f22966d;
        s sVar = identityHashMap.get(viewHolder);
        if (sVar != null) {
            sVar.f23080c.onViewRecycled(viewHolder);
            identityHashMap.remove(viewHolder);
        } else {
            throw new IllegalStateException("Cannot find wrapper for " + viewHolder + ", seems like it is not bound by this adapter: " + cVar);
        }
    }

    public boolean removeAdapter(@NonNull RecyclerView.Adapter<? extends RecyclerView.ViewHolder> adapter) {
        c cVar = this.f22583p0;
        int iF = cVar.f(adapter);
        if (iF == -1) {
            return false;
        }
        ArrayList arrayList = cVar.f22967e;
        s sVar = (s) arrayList.get(iF);
        int iC = cVar.c(sVar);
        arrayList.remove(iF);
        cVar.f22963a.notifyItemRangeRemoved(iC, sVar.f23082e);
        Iterator it = cVar.f22965c.iterator();
        while (it.hasNext()) {
            RecyclerView recyclerView = (RecyclerView) ((WeakReference) it.next()).get();
            if (recyclerView != null) {
                adapter.onDetachedFromRecyclerView(recyclerView);
            }
        }
        sVar.f23080c.unregisterAdapterDataObserver(sVar.f23083f);
        sVar.f23078a.dispose();
        cVar.b();
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void setHasStableIds(boolean z10) {
        throw new UnsupportedOperationException("Calling setHasStableIds is not allowed on the ConcatAdapter. Use the Config object passed in the constructor to control this behavior");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void setStateRestorationPolicy(@NonNull RecyclerView.Adapter.StateRestorationPolicy stateRestorationPolicy) {
        throw new UnsupportedOperationException("Calling setStateRestorationPolicy is not allowed on the ConcatAdapter. This value is inferred from added adapters");
    }

    @SafeVarargs
    public ConcatAdapter(@NonNull Config config, @NonNull RecyclerView.Adapter<? extends RecyclerView.ViewHolder>... adapterArr) {
        this(config, (List<? extends RecyclerView.Adapter<? extends RecyclerView.ViewHolder>>) Arrays.asList(adapterArr));
    }

    public ConcatAdapter(@NonNull List<? extends RecyclerView.Adapter<? extends RecyclerView.ViewHolder>> list) {
        this(Config.DEFAULT, list);
    }

    public boolean addAdapter(int i10, @NonNull RecyclerView.Adapter<? extends RecyclerView.ViewHolder> adapter) {
        return this.f22583p0.a(i10, adapter);
    }

    public ConcatAdapter(@NonNull Config config, @NonNull List<? extends RecyclerView.Adapter<? extends RecyclerView.ViewHolder>> list) {
        this.f22583p0 = new c(this, config);
        Iterator<? extends RecyclerView.Adapter<? extends RecyclerView.ViewHolder>> it = list.iterator();
        while (it.hasNext()) {
            addAdapter(it.next());
        }
        super.setHasStableIds(this.f22583p0.f22969g != Config.StableIdMode.NO_STABLE_IDS);
    }
}
