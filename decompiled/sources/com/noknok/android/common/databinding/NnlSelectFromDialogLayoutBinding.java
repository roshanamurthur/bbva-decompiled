package com.noknok.android.common.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.noknok.android.common.R;

/* JADX INFO: loaded from: classes11.dex */
public final class NnlSelectFromDialogLayoutBinding implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final RelativeLayout f63508a;

    @NonNull
    public final TextView dialogHeaderText;

    @NonNull
    public final ListView dialogListView;

    @NonNull
    public final LinearLayout lytHeader;

    private NnlSelectFromDialogLayoutBinding(@NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull ListView listView, @NonNull LinearLayout linearLayout) {
        this.f63508a = relativeLayout;
        this.dialogHeaderText = textView;
        this.dialogListView = listView;
        this.lytHeader = linearLayout;
    }

    @NonNull
    public static NnlSelectFromDialogLayoutBinding bind(@NonNull View view) {
        int i10 = R.id.dialogHeaderText;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i10);
        if (textView != null) {
            i10 = R.id.dialogListView;
            ListView listView = (ListView) ViewBindings.findChildViewById(view, i10);
            if (listView != null) {
                i10 = R.id.lytHeader;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i10);
                if (linearLayout != null) {
                    return new NnlSelectFromDialogLayoutBinding((RelativeLayout) view, textView, listView, linearLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static NnlSelectFromDialogLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static NnlSelectFromDialogLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.nnl_select_from_dialog_layout, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.f63508a;
    }
}
