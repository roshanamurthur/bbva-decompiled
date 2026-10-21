package com.bbva.notifications.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.bbva.component.ui.shortcuts.ShortcutsSimpleView;
import com.bbva.notifications.R;

/* JADX INFO: loaded from: classes7.dex */
public final class ViewShortcutsBinding implements ViewBinding {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NonNull
    public final ShortcutsSimpleView f35342p0;

    @NonNull
    public final ShortcutsSimpleView shortcuts;

    public ViewShortcutsBinding(@NonNull ShortcutsSimpleView shortcutsSimpleView, @NonNull ShortcutsSimpleView shortcutsSimpleView2) {
        this.f35342p0 = shortcutsSimpleView;
        this.shortcuts = shortcutsSimpleView2;
    }

    @NonNull
    public static ViewShortcutsBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        ShortcutsSimpleView shortcutsSimpleView = (ShortcutsSimpleView) view;
        return new ViewShortcutsBinding(shortcutsSimpleView, shortcutsSimpleView);
    }

    @NonNull
    public static ViewShortcutsBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ViewShortcutsBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.view_shortcuts, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ShortcutsSimpleView getRoot() {
        return this.f35342p0;
    }
}
