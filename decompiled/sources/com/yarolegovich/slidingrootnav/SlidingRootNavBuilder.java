package com.yarolegovich.slidingrootnav;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.LayoutRes;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.widget.Toolbar;
import com.yarolegovich.slidingrootnav.callback.DragListener;
import com.yarolegovich.slidingrootnav.callback.DragStateListener;
import com.yarolegovich.slidingrootnav.transform.CompositeTransformation;
import com.yarolegovich.slidingrootnav.transform.ElevationTransformation;
import com.yarolegovich.slidingrootnav.transform.RootTransformation;
import com.yarolegovich.slidingrootnav.transform.ScaleTransformation;
import com.yarolegovich.slidingrootnav.transform.YTranslationTransformation;
import com.yarolegovich.slidingrootnav.util.ActionBarToggleAdapter;
import com.yarolegovich.slidingrootnav.util.DrawerListenerAdapter;
import com.yarolegovich.slidingrootnav.util.HiddenMenuClickConsumer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public class SlidingRootNavBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f68080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewGroup f68081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f68082c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f68083d;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Toolbar f68088i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f68090k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f68091l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Bundle f68092n;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f68084e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f68085f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f68086g = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public SlideGravity f68089j = SlideGravity.LEFT;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f68087h = a(180);
    public boolean m = true;

    public SlidingRootNavBuilder(Activity activity) {
        this.f68080a = activity;
    }

    public final int a(int i10) {
        return Math.round(this.f68080a.getResources().getDisplayMetrics().density * i10);
    }

    public SlidingRootNavBuilder addDragListener(DragListener dragListener) {
        this.f68085f.add(dragListener);
        return this;
    }

    public SlidingRootNavBuilder addDragStateListener(DragStateListener dragStateListener) {
        this.f68086g.add(dragStateListener);
        return this;
    }

    public SlidingRootNavBuilder addRootTransformation(RootTransformation rootTransformation) {
        this.f68084e.add(rootTransformation);
        return this;
    }

    public void initToolbarMenuVisibilityToggle(SlidingRootNavLayout slidingRootNavLayout, View view) {
        if (this.f68088i != null) {
            ActionBarToggleAdapter actionBarToggleAdapter = new ActionBarToggleAdapter(this.f68080a);
            actionBarToggleAdapter.setAdaptee(slidingRootNavLayout);
            ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(this.f68080a, actionBarToggleAdapter, this.f68088i, R.string.srn_drawer_open, R.string.srn_drawer_close);
            actionBarDrawerToggle.syncState();
            DrawerListenerAdapter drawerListenerAdapter = new DrawerListenerAdapter(actionBarDrawerToggle, view);
            slidingRootNavLayout.addDragListener(drawerListenerAdapter);
            slidingRootNavLayout.addDragStateListener(drawerListenerAdapter);
        }
    }

    public SlidingRootNav inject() {
        ViewGroup viewGroup = this.f68081b;
        Activity activity = this.f68080a;
        if (viewGroup == null) {
            this.f68081b = (ViewGroup) activity.findViewById(android.R.id.content);
        }
        if (this.f68081b.getChildCount() != 1) {
            throw new IllegalStateException(activity.getString(R.string.srn_ex_bad_content_view));
        }
        ViewGroup viewGroup2 = this.f68081b;
        View childAt = viewGroup2.getChildAt(0);
        viewGroup2.removeAllViews();
        SlidingRootNavLayout slidingRootNavLayout = new SlidingRootNavLayout(activity);
        slidingRootNavLayout.setId(R.id.srn_root_layout);
        ArrayList arrayList = this.f68084e;
        slidingRootNavLayout.setRootTransformation(arrayList.isEmpty() ? new CompositeTransformation(Arrays.asList(new ScaleTransformation(0.65f), new ElevationTransformation(a(8)))) : new CompositeTransformation(arrayList));
        slidingRootNavLayout.setMaxDragDistance(this.f68087h);
        slidingRootNavLayout.setGravity(this.f68089j);
        slidingRootNavLayout.setRootView(childAt);
        slidingRootNavLayout.setContentClickableWhenMenuOpened(this.m);
        Iterator it = this.f68085f.iterator();
        while (it.hasNext()) {
            slidingRootNavLayout.addDragListener((DragListener) it.next());
        }
        Iterator it2 = this.f68086g.iterator();
        while (it2.hasNext()) {
            slidingRootNavLayout.addDragStateListener((DragStateListener) it2.next());
        }
        if (this.f68082c == null) {
            if (this.f68083d == 0) {
                throw new IllegalStateException(activity.getString(R.string.srn_ex_no_menu_view));
            }
            this.f68082c = LayoutInflater.from(activity).inflate(this.f68083d, (ViewGroup) slidingRootNavLayout, false);
        }
        View view = this.f68082c;
        initToolbarMenuVisibilityToggle(slidingRootNavLayout, view);
        HiddenMenuClickConsumer hiddenMenuClickConsumer = new HiddenMenuClickConsumer(activity);
        hiddenMenuClickConsumer.setMenuHost(slidingRootNavLayout);
        slidingRootNavLayout.addView(view);
        slidingRootNavLayout.addView(hiddenMenuClickConsumer);
        slidingRootNavLayout.addView(childAt);
        viewGroup2.addView(slidingRootNavLayout);
        if (this.f68092n == null && this.f68090k) {
            slidingRootNavLayout.openMenu(false);
        }
        slidingRootNavLayout.setMenuLocked(this.f68091l);
        return slidingRootNavLayout;
    }

    public SlidingRootNavBuilder withContentClickableWhenMenuOpened(boolean z10) {
        this.m = z10;
        return this;
    }

    public SlidingRootNavBuilder withContentView(ViewGroup viewGroup) {
        this.f68081b = viewGroup;
        return this;
    }

    public SlidingRootNavBuilder withDragDistance(int i10) {
        return withDragDistancePx(a(i10));
    }

    public SlidingRootNavBuilder withDragDistancePx(int i10) {
        this.f68087h = i10;
        return this;
    }

    public SlidingRootNavBuilder withGravity(SlideGravity slideGravity) {
        this.f68089j = slideGravity;
        return this;
    }

    public SlidingRootNavBuilder withMenuLayout(@LayoutRes int i10) {
        this.f68083d = i10;
        return this;
    }

    public SlidingRootNavBuilder withMenuLocked(boolean z10) {
        this.f68091l = z10;
        return this;
    }

    public SlidingRootNavBuilder withMenuOpened(boolean z10) {
        this.f68090k = z10;
        return this;
    }

    public SlidingRootNavBuilder withMenuView(View view) {
        this.f68082c = view;
        return this;
    }

    public SlidingRootNavBuilder withRootViewElevation(@IntRange(from = 0) int i10) {
        return withRootViewElevationPx(a(i10));
    }

    public SlidingRootNavBuilder withRootViewElevationPx(@IntRange(from = 0) int i10) {
        this.f68084e.add(new ElevationTransformation(i10));
        return this;
    }

    public SlidingRootNavBuilder withRootViewScale(@FloatRange(from = 0.009999999776482582d) float f6) {
        this.f68084e.add(new ScaleTransformation(f6));
        return this;
    }

    public SlidingRootNavBuilder withRootViewYTranslation(int i10) {
        return withRootViewYTranslationPx(a(i10));
    }

    public SlidingRootNavBuilder withRootViewYTranslationPx(int i10) {
        this.f68084e.add(new YTranslationTransformation(i10));
        return this;
    }

    public SlidingRootNavBuilder withSavedState(Bundle bundle) {
        this.f68092n = bundle;
        return this;
    }

    public SlidingRootNavBuilder withToolbarMenuToggle(Toolbar toolbar) {
        this.f68088i = toolbar;
        return this;
    }
}
