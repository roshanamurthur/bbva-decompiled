package com.bbva.component.ui.welcome.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import com.bbva.component.ui.welcome.R;
import com.bbva.component.ui.welcome.pager.PageIndicator;
import com.bbva.component.ui.welcome.pager.WelcomeViewPager;

/* JADX INFO: loaded from: classes2.dex */
public final class ComponentWelcomePagerBinding implements ViewBinding {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NonNull
    public final View f28774p0;

    @NonNull
    public final PageIndicator pageIndicator;

    @NonNull
    public final WelcomeViewPager viewPager;

    public ComponentWelcomePagerBinding(@NonNull View view, @NonNull PageIndicator pageIndicator, @NonNull WelcomeViewPager welcomeViewPager) {
        this.f28774p0 = view;
        this.pageIndicator = pageIndicator;
        this.viewPager = welcomeViewPager;
    }

    @NonNull
    public static ComponentWelcomePagerBinding bind(@NonNull View view) {
        int i10 = R.id.pageIndicator;
        PageIndicator pageIndicator = (PageIndicator) view.findViewById(i10);
        if (pageIndicator != null) {
            i10 = R.id.viewPager;
            WelcomeViewPager welcomeViewPager = (WelcomeViewPager) view.findViewById(i10);
            if (welcomeViewPager != null) {
                return new ComponentWelcomePagerBinding(view, pageIndicator, welcomeViewPager);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static ComponentWelcomePagerBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.component_welcome_pager, viewGroup);
        return bind(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.f28774p0;
    }
}
