package com.bbva.ui.component.menu.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bbva.ui.component.menu.R;

/* JADX INFO: loaded from: classes9.dex */
public final class ViewSlideMenuBinding implements ViewBinding {

    @NonNull
    public final View clickableLayout;

    @NonNull
    public final FrameLayout draggableLayout;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NonNull
    public final View f36969p0;

    public ViewSlideMenuBinding(@NonNull View view, @NonNull View view2, @NonNull FrameLayout frameLayout) {
        this.f36969p0 = view;
        this.clickableLayout = view2;
        this.draggableLayout = frameLayout;
    }

    @NonNull
    public static ViewSlideMenuBinding bind(@NonNull View view) {
        int i10 = R.id.clickableLayout;
        View viewFindChildViewById = ViewBindings.findChildViewById(view, i10);
        if (viewFindChildViewById != null) {
            i10 = R.id.draggableLayout;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i10);
            if (frameLayout != null) {
                return new ViewSlideMenuBinding(view, viewFindChildViewById, frameLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static ViewSlideMenuBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.view_slide_menu, viewGroup);
        return bind(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.f36969p0;
    }
}
