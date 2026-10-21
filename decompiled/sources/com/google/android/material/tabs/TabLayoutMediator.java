package com.google.android.material.tabs;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes10.dex */
public final class TabLayoutMediator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final TabLayout f45540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ViewPager2 f45541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f45542c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f45543d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TabConfigurationStrategy f45544e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public RecyclerView.Adapter<?> f45545f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f45546g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public b f45547h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public c f45548i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public a f45549j;

    public interface TabConfigurationStrategy {
        void onConfigureTab(@NonNull TabLayout.Tab tab, int i10);
    }

    public class a extends RecyclerView.AdapterDataObserver {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onChanged() {
            TabLayoutMediator.this.a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeChanged(int i10, int i11) {
            TabLayoutMediator.this.a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeInserted(int i10, int i11) {
            TabLayoutMediator.this.a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeMoved(int i10, int i11, int i12) {
            TabLayoutMediator.this.a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeRemoved(int i10, int i11) {
            TabLayoutMediator.this.a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeChanged(int i10, int i11, @Nullable Object obj) {
            TabLayoutMediator.this.a();
        }
    }

    public static class b extends ViewPager2.OnPageChangeCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public final WeakReference<TabLayout> f45551a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f45553c = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f45552b = 0;

        public b(TabLayout tabLayout) {
            this.f45551a = new WeakReference<>(tabLayout);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public final void onPageScrollStateChanged(int i10) {
            this.f45552b = this.f45553c;
            this.f45553c = i10;
            TabLayout tabLayout = this.f45551a.get();
            if (tabLayout != null) {
                tabLayout.f45501o1 = this.f45553c;
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public final void onPageScrolled(int i10, float f6, int i11) {
            TabLayout tabLayout = this.f45551a.get();
            if (tabLayout != null) {
                int i12 = this.f45553c;
                tabLayout.j(i10, f6, i12 != 2 || this.f45552b == 1, (i12 == 2 && this.f45552b == 0) ? false : true, false);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public final void onPageSelected(int i10) {
            TabLayout tabLayout = this.f45551a.get();
            if (tabLayout == null || tabLayout.getSelectedTabPosition() == i10 || i10 >= tabLayout.getTabCount()) {
                return;
            }
            int i11 = this.f45553c;
            tabLayout.selectTab(tabLayout.getTabAt(i10), i11 == 0 || (i11 == 2 && this.f45552b == 0));
        }
    }

    public TabLayoutMediator(@NonNull TabLayout tabLayout, @NonNull ViewPager2 viewPager2, @NonNull TabConfigurationStrategy tabConfigurationStrategy) {
        this(tabLayout, viewPager2, true, tabConfigurationStrategy);
    }

    public final void a() {
        TabLayout tabLayout = this.f45540a;
        tabLayout.removeAllTabs();
        RecyclerView.Adapter<?> adapter = this.f45545f;
        if (adapter != null) {
            int itemCount = adapter.getItemCount();
            for (int i10 = 0; i10 < itemCount; i10++) {
                TabLayout.Tab tabNewTab = tabLayout.newTab();
                this.f45544e.onConfigureTab(tabNewTab, i10);
                tabLayout.addTab(tabNewTab, false);
            }
            if (itemCount > 0) {
                int iMin = Math.min(this.f45541b.getCurrentItem(), tabLayout.getTabCount() - 1);
                if (iMin != tabLayout.getSelectedTabPosition()) {
                    tabLayout.selectTab(tabLayout.getTabAt(iMin));
                }
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void attach() {
        if (this.f45546g) {
            throw new IllegalStateException("TabLayoutMediator is already attached");
        }
        ViewPager2 viewPager2 = this.f45541b;
        RecyclerView.Adapter adapter = viewPager2.getAdapter();
        this.f45545f = adapter;
        if (adapter == null) {
            throw new IllegalStateException("TabLayoutMediator attached before ViewPager2 has an adapter");
        }
        this.f45546g = true;
        TabLayout tabLayout = this.f45540a;
        b bVar = new b(tabLayout);
        this.f45547h = bVar;
        viewPager2.registerOnPageChangeCallback(bVar);
        c cVar = new c(viewPager2, this.f45543d);
        this.f45548i = cVar;
        tabLayout.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) cVar);
        if (this.f45542c) {
            a aVar = new a();
            this.f45549j = aVar;
            this.f45545f.registerAdapterDataObserver(aVar);
        }
        a();
        tabLayout.setScrollPosition(viewPager2.getCurrentItem(), 0.0f, true);
    }

    public void detach() {
        RecyclerView.Adapter<?> adapter;
        if (this.f45542c && (adapter = this.f45545f) != null) {
            adapter.unregisterAdapterDataObserver(this.f45549j);
            this.f45549j = null;
        }
        this.f45540a.removeOnTabSelectedListener((TabLayout.OnTabSelectedListener) this.f45548i);
        this.f45541b.unregisterOnPageChangeCallback(this.f45547h);
        this.f45548i = null;
        this.f45547h = null;
        this.f45545f = null;
        this.f45546g = false;
    }

    public boolean isAttached() {
        return this.f45546g;
    }

    public TabLayoutMediator(@NonNull TabLayout tabLayout, @NonNull ViewPager2 viewPager2, boolean z10, @NonNull TabConfigurationStrategy tabConfigurationStrategy) {
        this(tabLayout, viewPager2, z10, true, tabConfigurationStrategy);
    }

    public TabLayoutMediator(@NonNull TabLayout tabLayout, @NonNull ViewPager2 viewPager2, boolean z10, boolean z11, @NonNull TabConfigurationStrategy tabConfigurationStrategy) {
        this.f45540a = tabLayout;
        this.f45541b = viewPager2;
        this.f45542c = z10;
        this.f45543d = z11;
        this.f45544e = tabConfigurationStrategy;
    }

    public static class c implements TabLayout.OnTabSelectedListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ViewPager2 f45554a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f45555b;

        public c(ViewPager2 viewPager2, boolean z10) {
            this.f45554a = viewPager2;
            this.f45555b = z10;
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public final void onTabSelected(@NonNull TabLayout.Tab tab) {
            this.f45554a.setCurrentItem(tab.getPosition(), this.f45555b);
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public final void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public final void onTabUnselected(TabLayout.Tab tab) {
        }
    }
}
