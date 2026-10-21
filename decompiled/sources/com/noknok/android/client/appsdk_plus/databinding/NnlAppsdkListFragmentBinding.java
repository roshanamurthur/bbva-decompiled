package com.noknok.android.client.appsdk_plus.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.noknok.android.client.appsdk_plus.R;

/* JADX INFO: loaded from: classes11.dex */
public final class NnlAppsdkListFragmentBinding implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final RelativeLayout f62974a;

    @NonNull
    public final Button btnRemoveAll;

    @NonNull
    public final TextView emptylvTokens;

    @NonNull
    public final RecyclerView llTokens;

    @NonNull
    public final LinearLayout lytTop;

    @NonNull
    public final TextView tvListTitle;

    private NnlAppsdkListFragmentBinding(@NonNull RelativeLayout relativeLayout, @NonNull Button button, @NonNull TextView textView, @NonNull RecyclerView recyclerView, @NonNull LinearLayout linearLayout, @NonNull TextView textView2) {
        this.f62974a = relativeLayout;
        this.btnRemoveAll = button;
        this.emptylvTokens = textView;
        this.llTokens = recyclerView;
        this.lytTop = linearLayout;
        this.tvListTitle = textView2;
    }

    @NonNull
    public static NnlAppsdkListFragmentBinding bind(@NonNull View view) {
        int i10 = R.id.btnRemoveAll;
        Button button = (Button) ViewBindings.findChildViewById(view, i10);
        if (button != null) {
            i10 = R.id.emptylvTokens;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i10);
            if (textView != null) {
                i10 = R.id.ll_tokens;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i10);
                if (recyclerView != null) {
                    i10 = R.id.lyt_top;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i10);
                    if (linearLayout != null) {
                        i10 = R.id.tv_list_title;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i10);
                        if (textView2 != null) {
                            return new NnlAppsdkListFragmentBinding((RelativeLayout) view, button, textView, recyclerView, linearLayout, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static NnlAppsdkListFragmentBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static NnlAppsdkListFragmentBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.nnl_appsdk_list_fragment, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.f62974a;
    }
}
