package com.noknok.android.client.appsdk_plus.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.noknok.android.client.appsdk_plus.R;

/* JADX INFO: loaded from: classes11.dex */
public final class NnlAppsdkListItemRowBinding implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final LinearLayout f62975a;

    @NonNull
    public final ImageView listItemExpandIcon;

    @NonNull
    public final TextView listItemName;

    @NonNull
    public final ImageView listItemRemoveButton;

    @NonNull
    public final ImageView listItemRenameButton;

    @NonNull
    public final LinearLayout llDpkList;

    @NonNull
    public final RelativeLayout llListHeader;

    @NonNull
    public final TextView tvLastUsed;

    private NnlAppsdkListItemRowBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull LinearLayout linearLayout2, @NonNull RelativeLayout relativeLayout, @NonNull TextView textView2) {
        this.f62975a = linearLayout;
        this.listItemExpandIcon = imageView;
        this.listItemName = textView;
        this.listItemRemoveButton = imageView2;
        this.listItemRenameButton = imageView3;
        this.llDpkList = linearLayout2;
        this.llListHeader = relativeLayout;
        this.tvLastUsed = textView2;
    }

    @NonNull
    public static NnlAppsdkListItemRowBinding bind(@NonNull View view) {
        int i10 = R.id.list_item_expand_icon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i10);
        if (imageView != null) {
            i10 = R.id.list_item_name;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i10);
            if (textView != null) {
                i10 = R.id.list_item_remove_button;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i10);
                if (imageView2 != null) {
                    i10 = R.id.list_item_rename_button;
                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i10);
                    if (imageView3 != null) {
                        i10 = R.id.ll_dpk_list;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i10);
                        if (linearLayout != null) {
                            i10 = R.id.ll_list_header;
                            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i10);
                            if (relativeLayout != null) {
                                i10 = R.id.tv_last_used;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i10);
                                if (textView2 != null) {
                                    return new NnlAppsdkListItemRowBinding((LinearLayout) view, imageView, textView, imageView2, imageView3, linearLayout, relativeLayout, textView2);
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
    public static NnlAppsdkListItemRowBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static NnlAppsdkListItemRowBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.nnl_appsdk_list_item_row, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f62975a;
    }
}
