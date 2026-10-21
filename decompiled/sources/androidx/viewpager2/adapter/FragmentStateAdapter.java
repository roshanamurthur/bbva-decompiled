package androidx.viewpager2.adapter;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.impl.v;
import androidx.collection.ArraySet;
import androidx.collection.LongSparseArray;
import androidx.core.util.Preconditions;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class FragmentStateAdapter extends RecyclerView.Adapter<FragmentViewHolder> implements StatefulAdapter {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Lifecycle f23936p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final FragmentManager f23937q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final LongSparseArray<Fragment> f23938r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final LongSparseArray<Fragment.SavedState> f23939s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final LongSparseArray<Integer> f23940t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public d f23941u0;
    public boolean v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public boolean f23942w0;

    public class a implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ FrameLayout f23943a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ FragmentViewHolder f23944b;

        public a(FrameLayout frameLayout, FragmentViewHolder fragmentViewHolder) {
            this.f23943a = frameLayout;
            this.f23944b = fragmentViewHolder;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            FrameLayout frameLayout = this.f23943a;
            if (frameLayout.getParent() != null) {
                frameLayout.removeOnLayoutChangeListener(this);
                FragmentStateAdapter.this.d(this.f23944b);
            }
        }
    }

    public class b implements LifecycleEventObserver {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ FragmentViewHolder f23946p0;

        public b(FragmentViewHolder fragmentViewHolder) {
            this.f23946p0 = fragmentViewHolder;
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(@NonNull LifecycleOwner lifecycleOwner, @NonNull Lifecycle.Event event) {
            FragmentStateAdapter fragmentStateAdapter = FragmentStateAdapter.this;
            if (fragmentStateAdapter.f23937q0.isStateSaved()) {
                return;
            }
            lifecycleOwner.getLifecycle().removeObserver(this);
            FragmentViewHolder fragmentViewHolder = this.f23946p0;
            if (ViewCompat.isAttachedToWindow((FrameLayout) fragmentViewHolder.itemView)) {
                fragmentStateAdapter.d(fragmentViewHolder);
            }
        }
    }

    public static abstract class c extends RecyclerView.AdapterDataObserver {
        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public abstract void onChanged();

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeChanged(int i10, int i11) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeInserted(int i10, int i11) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeMoved(int i10, int i11, int i12) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeRemoved(int i10, int i11) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeChanged(int i10, int i11, @Nullable Object obj) {
            onChanged();
        }
    }

    public class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public androidx.viewpager2.adapter.a f23948a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public androidx.viewpager2.adapter.b f23949b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public androidx.viewpager2.adapter.c f23950c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ViewPager2 f23951d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f23952e = -1;

        public d() {
        }

        @NonNull
        public static ViewPager2 a(@NonNull RecyclerView recyclerView) {
            ViewParent parent = recyclerView.getParent();
            if (parent instanceof ViewPager2) {
                return (ViewPager2) parent;
            }
            throw new IllegalStateException("Expected ViewPager2 instance. Got: " + parent);
        }

        public final void b(boolean z10) {
            int currentItem;
            Fragment fragment;
            FragmentStateAdapter fragmentStateAdapter = FragmentStateAdapter.this;
            if (fragmentStateAdapter.f23937q0.isStateSaved() || this.f23951d.getScrollState() != 0 || fragmentStateAdapter.f23938r0.isEmpty() || fragmentStateAdapter.getItemCount() == 0 || (currentItem = this.f23951d.getCurrentItem()) >= fragmentStateAdapter.getItemCount()) {
                return;
            }
            long itemId = fragmentStateAdapter.getItemId(currentItem);
            if ((itemId != this.f23952e || z10) && (fragment = fragmentStateAdapter.f23938r0.get(itemId)) != null && fragment.isAdded()) {
                this.f23952e = itemId;
                FragmentTransaction fragmentTransactionBeginTransaction = fragmentStateAdapter.f23937q0.beginTransaction();
                Fragment fragment2 = null;
                for (int i10 = 0; i10 < fragmentStateAdapter.f23938r0.size(); i10++) {
                    long jKeyAt = fragmentStateAdapter.f23938r0.keyAt(i10);
                    Fragment fragmentValueAt = fragmentStateAdapter.f23938r0.valueAt(i10);
                    if (fragmentValueAt.isAdded()) {
                        if (jKeyAt != this.f23952e) {
                            fragmentTransactionBeginTransaction.setMaxLifecycle(fragmentValueAt, Lifecycle.State.STARTED);
                        } else {
                            fragment2 = fragmentValueAt;
                        }
                        fragmentValueAt.setMenuVisibility(jKeyAt == this.f23952e);
                    }
                }
                if (fragment2 != null) {
                    fragmentTransactionBeginTransaction.setMaxLifecycle(fragment2, Lifecycle.State.RESUMED);
                }
                if (fragmentTransactionBeginTransaction.isEmpty()) {
                    return;
                }
                fragmentTransactionBeginTransaction.commitNow();
            }
        }
    }

    public FragmentStateAdapter(@NonNull FragmentActivity fragmentActivity) {
        this(fragmentActivity.getSupportFragmentManager(), fragmentActivity.getLifecycle());
    }

    public static void a(@NonNull View view, @NonNull FrameLayout frameLayout) {
        if (frameLayout.getChildCount() > 1) {
            throw new IllegalStateException("Design assumption violated.");
        }
        if (view.getParent() == frameLayout) {
            return;
        }
        if (frameLayout.getChildCount() > 0) {
            frameLayout.removeAllViews();
        }
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        frameLayout.addView(view);
    }

    public final void b() {
        LongSparseArray<Fragment> longSparseArray;
        LongSparseArray<Integer> longSparseArray2;
        Fragment fragment;
        View view;
        if (!this.f23942w0 || this.f23937q0.isStateSaved()) {
            return;
        }
        ArraySet arraySet = new ArraySet();
        int i10 = 0;
        while (true) {
            longSparseArray = this.f23938r0;
            int size = longSparseArray.size();
            longSparseArray2 = this.f23940t0;
            if (i10 >= size) {
                break;
            }
            long jKeyAt = longSparseArray.keyAt(i10);
            if (!containsItem(jKeyAt)) {
                arraySet.add(Long.valueOf(jKeyAt));
                longSparseArray2.remove(jKeyAt);
            }
            i10++;
        }
        if (!this.v0) {
            this.f23942w0 = false;
            for (int i11 = 0; i11 < longSparseArray.size(); i11++) {
                long jKeyAt2 = longSparseArray.keyAt(i11);
                if (!longSparseArray2.containsKey(jKeyAt2) && ((fragment = longSparseArray.get(jKeyAt2)) == null || (view = fragment.getView()) == null || view.getParent() == null)) {
                    arraySet.add(Long.valueOf(jKeyAt2));
                }
            }
        }
        Iterator<E> it = arraySet.iterator();
        while (it.hasNext()) {
            e(((Long) it.next()).longValue());
        }
    }

    public final Long c(int i10) {
        Long lValueOf = null;
        int i11 = 0;
        while (true) {
            LongSparseArray<Integer> longSparseArray = this.f23940t0;
            if (i11 >= longSparseArray.size()) {
                return lValueOf;
            }
            if (longSparseArray.valueAt(i11).intValue() == i10) {
                if (lValueOf != null) {
                    throw new IllegalStateException("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                }
                lValueOf = Long.valueOf(longSparseArray.keyAt(i11));
            }
            i11++;
        }
    }

    public boolean containsItem(long j10) {
        return j10 >= 0 && j10 < ((long) getItemCount());
    }

    @NonNull
    public abstract Fragment createFragment(int i10);

    public final void d(@NonNull FragmentViewHolder fragmentViewHolder) {
        Fragment fragment = this.f23938r0.get(fragmentViewHolder.getItemId());
        if (fragment == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        FrameLayout frameLayout = (FrameLayout) fragmentViewHolder.itemView;
        View view = fragment.getView();
        if (!fragment.isAdded() && view != null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        boolean zIsAdded = fragment.isAdded();
        FragmentManager fragmentManager = this.f23937q0;
        if (zIsAdded && view == null) {
            fragmentManager.registerFragmentLifecycleCallbacks(new i3.a(this, fragment, frameLayout), false);
            return;
        }
        if (fragment.isAdded() && view.getParent() != null) {
            if (view.getParent() != frameLayout) {
                a(view, frameLayout);
                return;
            }
            return;
        }
        if (fragment.isAdded()) {
            a(view, frameLayout);
            return;
        }
        if (fragmentManager.isStateSaved()) {
            if (fragmentManager.isDestroyed()) {
                return;
            }
            this.f23936p0.addObserver(new b(fragmentViewHolder));
            return;
        }
        fragmentManager.registerFragmentLifecycleCallbacks(new i3.a(this, fragment, frameLayout), false);
        fragmentManager.beginTransaction().add(fragment, "f" + fragmentViewHolder.getItemId()).setMaxLifecycle(fragment, Lifecycle.State.STARTED).commitNow();
        this.f23941u0.b(false);
    }

    public final void e(long j10) {
        ViewParent parent;
        LongSparseArray<Fragment> longSparseArray = this.f23938r0;
        Fragment fragment = longSparseArray.get(j10);
        if (fragment == null) {
            return;
        }
        if (fragment.getView() != null && (parent = fragment.getView().getParent()) != null) {
            ((FrameLayout) parent).removeAllViews();
        }
        boolean zContainsItem = containsItem(j10);
        LongSparseArray<Fragment.SavedState> longSparseArray2 = this.f23939s0;
        if (!zContainsItem) {
            longSparseArray2.remove(j10);
        }
        if (!fragment.isAdded()) {
            longSparseArray.remove(j10);
            return;
        }
        FragmentManager fragmentManager = this.f23937q0;
        if (fragmentManager.isStateSaved()) {
            this.f23942w0 = true;
            return;
        }
        if (fragment.isAdded() && containsItem(j10)) {
            longSparseArray2.put(j10, fragmentManager.saveFragmentInstanceState(fragment));
        }
        fragmentManager.beginTransaction().remove(fragment).commitNow();
        longSparseArray.remove(j10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i10) {
        return i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @CallSuper
    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        Preconditions.checkArgument(this.f23941u0 == null);
        d dVar = new d();
        this.f23941u0 = dVar;
        dVar.f23951d = d.a(recyclerView);
        androidx.viewpager2.adapter.a aVar = new androidx.viewpager2.adapter.a(dVar);
        dVar.f23948a = aVar;
        dVar.f23951d.registerOnPageChangeCallback(aVar);
        androidx.viewpager2.adapter.b bVar = new androidx.viewpager2.adapter.b(dVar);
        dVar.f23949b = bVar;
        registerAdapterDataObserver(bVar);
        androidx.viewpager2.adapter.c cVar = new androidx.viewpager2.adapter.c(dVar);
        dVar.f23950c = cVar;
        this.f23936p0.addObserver(cVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @CallSuper
    public void onDetachedFromRecyclerView(@NonNull RecyclerView recyclerView) {
        d dVar = this.f23941u0;
        dVar.getClass();
        d.a(recyclerView).unregisterOnPageChangeCallback(dVar.f23948a);
        androidx.viewpager2.adapter.b bVar = dVar.f23949b;
        FragmentStateAdapter fragmentStateAdapter = FragmentStateAdapter.this;
        fragmentStateAdapter.unregisterAdapterDataObserver(bVar);
        fragmentStateAdapter.f23936p0.removeObserver(dVar.f23950c);
        dVar.f23951d = null;
        this.f23941u0 = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final boolean onFailedToRecycleView(@NonNull FragmentViewHolder fragmentViewHolder) {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewRecycled(@NonNull FragmentViewHolder fragmentViewHolder) {
        Long lC = c(((FrameLayout) fragmentViewHolder.itemView).getId());
        if (lC != null) {
            e(lC.longValue());
            this.f23940t0.remove(lC.longValue());
        }
    }

    @Override // androidx.viewpager2.adapter.StatefulAdapter
    public final void restoreState(@NonNull Parcelable parcelable) {
        LongSparseArray<Fragment.SavedState> longSparseArray = this.f23939s0;
        if (longSparseArray.isEmpty()) {
            LongSparseArray<Fragment> longSparseArray2 = this.f23938r0;
            if (longSparseArray2.isEmpty()) {
                Bundle bundle = (Bundle) parcelable;
                if (bundle.getClassLoader() == null) {
                    bundle.setClassLoader(getClass().getClassLoader());
                }
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        if (longSparseArray2.isEmpty()) {
                            return;
                        }
                        this.f23942w0 = true;
                        this.v0 = true;
                        b();
                        Handler handler = new Handler(Looper.getMainLooper());
                        i3.b bVar = new i3.b(this);
                        this.f23936p0.addObserver(new i3.c(handler, bVar));
                        handler.postDelayed(bVar, 10000L);
                        return;
                    }
                    String next = it.next();
                    if (next.startsWith("f#") && next.length() > 2) {
                        longSparseArray2.put(Long.parseLong(next.substring(2)), this.f23937q0.getFragment(bundle, next));
                    } else {
                        if (!next.startsWith("s#") || next.length() <= 2) {
                            throw new IllegalArgumentException("Unexpected key in savedState: ".concat(next));
                        }
                        long j10 = Long.parseLong(next.substring(2));
                        Fragment.SavedState savedState = (Fragment.SavedState) bundle.getParcelable(next);
                        if (containsItem(j10)) {
                            longSparseArray.put(j10, savedState);
                        }
                    }
                }
            }
        }
        throw new IllegalStateException("Expected the adapter to be 'fresh' while restoring state.");
    }

    @Override // androidx.viewpager2.adapter.StatefulAdapter
    @NonNull
    public final Parcelable saveState() {
        LongSparseArray<Fragment> longSparseArray = this.f23938r0;
        int size = longSparseArray.size();
        LongSparseArray<Fragment.SavedState> longSparseArray2 = this.f23939s0;
        Bundle bundle = new Bundle(longSparseArray2.size() + size);
        for (int i10 = 0; i10 < longSparseArray.size(); i10++) {
            long jKeyAt = longSparseArray.keyAt(i10);
            Fragment fragment = longSparseArray.get(jKeyAt);
            if (fragment != null && fragment.isAdded()) {
                this.f23937q0.putFragment(bundle, v.c("f#", jKeyAt), fragment);
            }
        }
        for (int i11 = 0; i11 < longSparseArray2.size(); i11++) {
            long jKeyAt2 = longSparseArray2.keyAt(i11);
            if (containsItem(jKeyAt2)) {
                bundle.putParcelable(v.c("s#", jKeyAt2), longSparseArray2.get(jKeyAt2));
            }
        }
        return bundle;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void setHasStableIds(boolean z10) {
        throw new UnsupportedOperationException("Stable Ids are required for the adapter to function properly, and the adapter takes care of setting the flag.");
    }

    public FragmentStateAdapter(@NonNull Fragment fragment) {
        this(fragment.getChildFragmentManager(), fragment.getLifecycle());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(@NonNull FragmentViewHolder fragmentViewHolder, int i10) {
        long itemId = fragmentViewHolder.getItemId();
        int id = ((FrameLayout) fragmentViewHolder.itemView).getId();
        Long lC = c(id);
        LongSparseArray<Integer> longSparseArray = this.f23940t0;
        if (lC != null && lC.longValue() != itemId) {
            e(lC.longValue());
            longSparseArray.remove(lC.longValue());
        }
        longSparseArray.put(itemId, Integer.valueOf(id));
        long itemId2 = getItemId(i10);
        LongSparseArray<Fragment> longSparseArray2 = this.f23938r0;
        if (!longSparseArray2.containsKey(itemId2)) {
            Fragment fragmentCreateFragment = createFragment(i10);
            fragmentCreateFragment.setInitialSavedState(this.f23939s0.get(itemId2));
            longSparseArray2.put(itemId2, fragmentCreateFragment);
        }
        FrameLayout frameLayout = (FrameLayout) fragmentViewHolder.itemView;
        if (ViewCompat.isAttachedToWindow(frameLayout)) {
            if (frameLayout.getParent() != null) {
                throw new IllegalStateException("Design assumption violated.");
            }
            frameLayout.addOnLayoutChangeListener(new a(frameLayout, fragmentViewHolder));
        }
        b();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public final FragmentViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i10) {
        int i11 = FragmentViewHolder.f23954p0;
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setId(ViewCompat.generateViewId());
        frameLayout.setSaveEnabled(false);
        return new FragmentViewHolder(frameLayout);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewAttachedToWindow(@NonNull FragmentViewHolder fragmentViewHolder) {
        d(fragmentViewHolder);
        b();
    }

    public FragmentStateAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        this.f23938r0 = new LongSparseArray<>();
        this.f23939s0 = new LongSparseArray<>();
        this.f23940t0 = new LongSparseArray<>();
        this.v0 = false;
        this.f23942w0 = false;
        this.f23937q0 = fragmentManager;
        this.f23936p0 = lifecycle;
        super.setHasStableIds(true);
    }
}
