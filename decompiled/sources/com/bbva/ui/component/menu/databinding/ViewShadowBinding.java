package com.bbva.ui.component.menu.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bbva.ui.component.menu.R;

/* JADX INFO: loaded from: classes9.dex */
public final class ViewShadowBinding implements ViewBinding {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NonNull
    public final LinearLayout f36968p0;

    @NonNull
    public final View triangleView;

    public ViewShadowBinding(@NonNull LinearLayout linearLayout, @NonNull View view) {
        this.f36968p0 = linearLayout;
        this.triangleView = view;
    }

    @NonNull
    public static ViewShadowBinding bind(@NonNull View view) {
        int i10 = R.id.triangleView;
        View viewFindChildViewById = ViewBindings.findChildViewById(view, i10);
        if (viewFindChildViewById != null) {
            return new ViewShadowBinding((LinearLayout) view, viewFindChildViewById);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static ViewShadowBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ViewShadowBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.view_shadow, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f36968p0;
    }
}
