package com.noknok.android.mfac.uaf.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.noknok.android.mfac.uaf.R;

/* JADX INFO: loaded from: classes11.dex */
public final class NnlMfacUafSelectAuthenticatorBinding implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final RelativeLayout f63513a;

    @NonNull
    public final ListView authListView;

    @NonNull
    public final LinearLayout buttons;

    @NonNull
    public final Button cancelButton;

    @NonNull
    public final TextView dialogTitle;

    @NonNull
    public final TextView longClick;

    private NnlMfacUafSelectAuthenticatorBinding(@NonNull RelativeLayout relativeLayout, @NonNull ListView listView, @NonNull LinearLayout linearLayout, @NonNull Button button, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f63513a = relativeLayout;
        this.authListView = listView;
        this.buttons = linearLayout;
        this.cancelButton = button;
        this.dialogTitle = textView;
        this.longClick = textView2;
    }

    @NonNull
    public static NnlMfacUafSelectAuthenticatorBinding bind(@NonNull View view) {
        int i10 = R.id.auth_list_view;
        ListView listView = (ListView) ViewBindings.findChildViewById(view, i10);
        if (listView != null) {
            i10 = R.id.buttons;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i10);
            if (linearLayout != null) {
                i10 = R.id.cancel_button;
                Button button = (Button) ViewBindings.findChildViewById(view, i10);
                if (button != null) {
                    i10 = R.id.dialog_title;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i10);
                    if (textView != null) {
                        i10 = R.id.long_click;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i10);
                        if (textView2 != null) {
                            return new NnlMfacUafSelectAuthenticatorBinding((RelativeLayout) view, listView, linearLayout, button, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static NnlMfacUafSelectAuthenticatorBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static NnlMfacUafSelectAuthenticatorBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.nnl_mfac_uaf_select_authenticator, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.f63513a;
    }
}
