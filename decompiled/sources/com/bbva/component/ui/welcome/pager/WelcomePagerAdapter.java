package com.bbva.component.ui.welcome.pager;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Observer;
import androidx.viewpager.widget.PagerAdapter;
import com.bbva.cells.component.kit.ui.helper.ContextHelper;
import com.bbva.component.ui.welcome.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: WelcomePagerAdapter.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J \u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0006H\u0016J\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\u000f\u001a\u00020\u0004H\u0016¨\u0006\u0016"}, d2 = {"Lcom/bbva/component/ui/welcome/pager/WelcomePagerAdapter;", "Landroidx/viewpager/widget/PagerAdapter;", "Landroid/view/ViewGroup;", "container", "", "position", "", "instantiateItem", "object", "", "destroyItem", "Landroid/view/View;", "view", "", "isViewFromObject", "getCount", "Landroid/content/Context;", "context", "Lcom/bbva/component/ui/welcome/pager/WelcomePagerViewModel;", "viewModel", "<init>", "(Landroid/content/Context;Lcom/bbva/component/ui/welcome/pager/WelcomePagerViewModel;)V", "component-ui-welcome_release"}, k = 1, mv = {1, 4, 0})
public final class WelcomePagerAdapter extends PagerAdapter {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f28844c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final WelcomePagerViewModel f28845d;

    /* JADX INFO: compiled from: WelcomePagerAdapter.kt */
    public static final class a<T> implements Observer<List<? extends Page>> {
        public a() {
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(List<? extends Page> list) {
            WelcomePagerAdapter.access$notifyIfNeeded(WelcomePagerAdapter.this, list);
        }
    }

    /* JADX INFO: compiled from: WelcomePagerAdapter.kt */
    public static final class b<T> implements Observer<List<? extends Mode>> {
        public b() {
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(List<? extends Mode> list) {
            WelcomePagerAdapter.access$notifyIfNeeded(WelcomePagerAdapter.this, list);
        }
    }

    /* JADX INFO: compiled from: WelcomePagerAdapter.kt */
    public static final class c<T> implements Observer<String> {
        public c() {
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(String str) {
            WelcomePagerAdapter.this.notifyDataSetChanged();
        }
    }

    public WelcomePagerAdapter(@NotNull Context context, @NotNull WelcomePagerViewModel viewModel) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.f28844c = context;
        this.f28845d = viewModel;
        viewModel.getPageList$component_ui_welcome_release().observe(ContextHelper.getOwner(context), new a());
        viewModel.getModeList$component_ui_welcome_release().observe(ContextHelper.getOwner(context), new b());
        viewModel.getCurrentMode$component_ui_welcome_release().observe(ContextHelper.getOwner(context), new c());
    }

    public static final void access$notifyIfNeeded(WelcomePagerAdapter welcomePagerAdapter, List list) {
        welcomePagerAdapter.getClass();
        if (list != null) {
            if (!(!list.isEmpty())) {
                list = null;
            }
            if (list != null) {
                welcomePagerAdapter.notifyDataSetChanged();
            }
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(@NotNull ViewGroup container, int position, @NotNull Object object) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(object, "object");
        container.removeView((View) object);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.f28845d.getCount$component_ui_welcome_release();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    @NotNull
    public Object instantiateItem(@NotNull ViewGroup container, int position) {
        Intrinsics.checkNotNullParameter(container, "container");
        View viewInflate = LayoutInflater.from(this.f28844c).inflate(R.layout.layout_welcome_page, container, false);
        if (viewInflate == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.bbva.component.ui.welcome.pager.WelcomePageLayout");
        }
        WelcomePageLayout welcomePageLayout = (WelcomePageLayout) viewInflate;
        welcomePageLayout.setPage(this.f28845d.getPage$component_ui_welcome_release(position), position);
        container.addView(welcomePageLayout);
        return welcomePageLayout;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(@NotNull View view, @NotNull Object object) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(object, "object");
        return Intrinsics.areEqual(view, object);
    }
}
