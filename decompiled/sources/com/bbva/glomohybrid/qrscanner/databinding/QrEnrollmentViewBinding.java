package com.bbva.glomohybrid.qrscanner.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bbva.glomohybrid.qrscanner.R;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: loaded from: classes6.dex */
public final class QrEnrollmentViewBinding implements ViewBinding {

    @NonNull
    public final LinearLayout bottomLinear;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f34416p0;

    @NonNull
    public final TextView qrMessage;

    @NonNull
    public final RelativeLayout scannerLayout;

    @NonNull
    public final TabLayout tabLayout;

    @NonNull
    public final Toolbar toolbar;

    @NonNull
    public final AppCompatImageButton toolbarStartButton;

    @NonNull
    public final AppCompatTextView toolbarTitle;

    public QrEnrollmentViewBinding(@NonNull RelativeLayout relativeLayout, @NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull RelativeLayout relativeLayout2, @NonNull TabLayout tabLayout, @NonNull Toolbar toolbar, @NonNull AppCompatImageButton appCompatImageButton, @NonNull AppCompatTextView appCompatTextView) {
        this.f34416p0 = relativeLayout;
        this.bottomLinear = linearLayout;
        this.qrMessage = textView;
        this.scannerLayout = relativeLayout2;
        this.tabLayout = tabLayout;
        this.toolbar = toolbar;
        this.toolbarStartButton = appCompatImageButton;
        this.toolbarTitle = appCompatTextView;
    }

    @NonNull
    public static QrEnrollmentViewBinding bind(@NonNull View view) {
        int i10 = R.id.bottom_linear;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i10);
        if (linearLayout != null) {
            i10 = R.id.qr_message;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i10);
            if (textView != null) {
                i10 = R.id.scanner_layout;
                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i10);
                if (relativeLayout != null) {
                    i10 = R.id.tab_layout;
                    TabLayout tabLayout = (TabLayout) ViewBindings.findChildViewById(view, i10);
                    if (tabLayout != null) {
                        i10 = R.id.toolbar;
                        Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(view, i10);
                        if (toolbar != null) {
                            i10 = R.id.toolbar_start_button;
                            AppCompatImageButton appCompatImageButton = (AppCompatImageButton) ViewBindings.findChildViewById(view, i10);
                            if (appCompatImageButton != null) {
                                i10 = R.id.toolbar_title;
                                AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i10);
                                if (appCompatTextView != null) {
                                    return new QrEnrollmentViewBinding((RelativeLayout) view, linearLayout, textView, relativeLayout, tabLayout, toolbar, appCompatImageButton, appCompatTextView);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static QrEnrollmentViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static QrEnrollmentViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.qr_enrollment_view, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.f34416p0;
    }
}
