package com.bbva.component.ui.shortcuts.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bbva.component.ui.shortcuts.R;
import com.bbva.ui.widget.BbvaTextView;

/* JADX INFO: loaded from: classes4.dex */
public final class ViewShortcutBinding implements ViewBinding {

    @NonNull
    public final FrameLayout circularFrameLayout;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NonNull
    public final View f28745p0;

    @NonNull
    public final AppCompatImageView shortcutImage;

    @NonNull
    public final BbvaTextView shortcutLabel;

    public ViewShortcutBinding(@NonNull View view, @NonNull FrameLayout frameLayout, @NonNull AppCompatImageView appCompatImageView, @NonNull BbvaTextView bbvaTextView) {
        this.f28745p0 = view;
        this.circularFrameLayout = frameLayout;
        this.shortcutImage = appCompatImageView;
        this.shortcutLabel = bbvaTextView;
    }

    @NonNull
    public static ViewShortcutBinding bind(@NonNull View view) {
        int i10 = R.id.circularFrameLayout;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i10);
        if (frameLayout != null) {
            i10 = R.id.shortcut_image;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i10);
            if (appCompatImageView != null) {
                i10 = R.id.shortcut_label;
                BbvaTextView bbvaTextView = (BbvaTextView) ViewBindings.findChildViewById(view, i10);
                if (bbvaTextView != null) {
                    return new ViewShortcutBinding(view, frameLayout, appCompatImageView, bbvaTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static ViewShortcutBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.view_shortcut, viewGroup);
        return bind(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.f28745p0;
    }
}
