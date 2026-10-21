package androidx.recyclerview.widget;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.g0;
import androidx.core.util.Preconditions;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: ConcatAdapterController.java */
/* JADX INFO: loaded from: classes2.dex */
public final class c implements s.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcatAdapter f22963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewTypeStorage f22964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f22965c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final IdentityHashMap<RecyclerView.ViewHolder, s> f22966d = new IdentityHashMap<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f22967e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a f22968f = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final ConcatAdapter.Config.StableIdMode f22969g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final StableIdStorage f22970h;

    /* JADX INFO: compiled from: ConcatAdapterController.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public s f22971a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f22972b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f22973c;
    }

    public c(ConcatAdapter concatAdapter, ConcatAdapter.Config config) {
        this.f22963a = concatAdapter;
        if (config.isolateViewTypes) {
            this.f22964b = new ViewTypeStorage.IsolatedViewTypeStorage();
        } else {
            this.f22964b = new ViewTypeStorage.SharedIdRangeViewTypeStorage();
        }
        ConcatAdapter.Config.StableIdMode stableIdMode = config.stableIdMode;
        this.f22969g = stableIdMode;
        if (stableIdMode == ConcatAdapter.Config.StableIdMode.NO_STABLE_IDS) {
            this.f22970h = new StableIdStorage.NoStableIdStorage();
        } else if (stableIdMode == ConcatAdapter.Config.StableIdMode.ISOLATED_STABLE_IDS) {
            this.f22970h = new StableIdStorage.IsolatedStableIdStorage();
        } else {
            if (stableIdMode != ConcatAdapter.Config.StableIdMode.SHARED_STABLE_IDS) {
                throw new IllegalArgumentException("unknown stable id mode");
            }
            this.f22970h = new StableIdStorage.SharedPoolStableIdStorage();
        }
    }

    public final boolean a(int i10, RecyclerView.Adapter<RecyclerView.ViewHolder> adapter) {
        ArrayList arrayList = this.f22967e;
        if (i10 < 0 || i10 > arrayList.size()) {
            throw new IndexOutOfBoundsException("Index must be between 0 and " + arrayList.size() + ". Given:" + i10);
        }
        if (this.f22969g != ConcatAdapter.Config.StableIdMode.NO_STABLE_IDS) {
            Preconditions.checkArgument(adapter.hasStableIds(), "All sub adapters must have stable ids when stable id mode is ISOLATED_STABLE_IDS or SHARED_STABLE_IDS");
        } else if (adapter.hasStableIds()) {
            Log.w("ConcatAdapter", "Stable ids in the adapter will be ignored as the ConcatAdapter is configured not to have stable ids");
        }
        int iF = f(adapter);
        if ((iF == -1 ? null : (s) arrayList.get(iF)) != null) {
            return false;
        }
        s sVar = new s(adapter, this, this.f22964b, this.f22970h.createStableIdLookup());
        arrayList.add(i10, sVar);
        Iterator it = this.f22965c.iterator();
        while (it.hasNext()) {
            RecyclerView recyclerView = (RecyclerView) ((WeakReference) it.next()).get();
            if (recyclerView != null) {
                adapter.onAttachedToRecyclerView(recyclerView);
            }
        }
        if (sVar.f23082e > 0) {
            this.f22963a.notifyItemRangeInserted(c(sVar), sVar.f23082e);
        }
        b();
        return true;
    }

    public final void b() {
        RecyclerView.Adapter.StateRestorationPolicy stateRestorationPolicy;
        Iterator it = this.f22967e.iterator();
        while (true) {
            if (!it.hasNext()) {
                stateRestorationPolicy = RecyclerView.Adapter.StateRestorationPolicy.ALLOW;
                break;
            }
            s sVar = (s) it.next();
            RecyclerView.Adapter.StateRestorationPolicy stateRestorationPolicy2 = sVar.f23080c.getStateRestorationPolicy();
            stateRestorationPolicy = RecyclerView.Adapter.StateRestorationPolicy.PREVENT;
            if (stateRestorationPolicy2 == stateRestorationPolicy || (stateRestorationPolicy2 == RecyclerView.Adapter.StateRestorationPolicy.PREVENT_WHEN_EMPTY && sVar.f23082e == 0)) {
                break;
            }
        }
        ConcatAdapter concatAdapter = this.f22963a;
        if (stateRestorationPolicy != concatAdapter.getStateRestorationPolicy()) {
            concatAdapter.a(stateRestorationPolicy);
        }
    }

    public final int c(s sVar) {
        s sVar2;
        Iterator it = this.f22967e.iterator();
        int i10 = 0;
        while (it.hasNext() && (sVar2 = (s) it.next()) != sVar) {
            i10 += sVar2.f23082e;
        }
        return i10;
    }

    @NonNull
    public final a d(int i10) {
        a aVar = this.f22968f;
        if (aVar.f22973c) {
            aVar = new a();
        } else {
            aVar.f22973c = true;
        }
        int i11 = i10;
        for (s sVar : this.f22967e) {
            int i12 = sVar.f23082e;
            if (i12 > i11) {
                aVar.f22971a = sVar;
                aVar.f22972b = i11;
                break;
            }
            i11 -= i12;
        }
        if (aVar.f22971a != null) {
            return aVar;
        }
        throw new IllegalArgumentException(g0.c("Cannot find wrapper for ", i10));
    }

    @NonNull
    public final s e(RecyclerView.ViewHolder viewHolder) {
        s sVar = this.f22966d.get(viewHolder);
        if (sVar != null) {
            return sVar;
        }
        throw new IllegalStateException("Cannot find wrapper for " + viewHolder + ", seems like it is not bound by this adapter: " + this);
    }

    public final int f(RecyclerView.Adapter<RecyclerView.ViewHolder> adapter) {
        ArrayList arrayList = this.f22967e;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((s) arrayList.get(i10)).f23080c == adapter) {
                return i10;
            }
        }
        return -1;
    }
}
