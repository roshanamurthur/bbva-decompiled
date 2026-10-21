package com.noknok.android.client.appsdk_plus.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.noknok.android.client.appsdk_plus.R;

/* JADX INFO: loaded from: classes11.dex */
public final class FragmentFidoRegisterBinding implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ScrollView f62972a;

    @NonNull
    public final LinearLayout llList;

    private FragmentFidoRegisterBinding(@NonNull ScrollView scrollView, @NonNull LinearLayout linearLayout) {
        this.f62972a = scrollView;
        this.llList = linearLayout;
    }

    @NonNull
    public static FragmentFidoRegisterBinding bind(@NonNull View view) {
        int i10 = R.id.ll_list;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i10);
        if (linearLayout != null) {
            return new FragmentFidoRegisterBinding((ScrollView) view, linearLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static FragmentFidoRegisterBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentFidoRegisterBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_fido_register, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ScrollView getRoot() {
        return this.f62972a;
    }
}
