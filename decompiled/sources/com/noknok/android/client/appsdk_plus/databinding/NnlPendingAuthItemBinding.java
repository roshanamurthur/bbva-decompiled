package com.noknok.android.client.appsdk_plus.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.noknok.android.client.appsdk_plus.R;

/* JADX INFO: loaded from: classes11.dex */
public final class NnlPendingAuthItemBinding implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final RelativeLayout f62976a;

    @NonNull
    public final Button approveButton;

    @NonNull
    public final Button rejectButton;

    @NonNull
    public final TextView remainingTime;

    @NonNull
    public final TextView statusCode;

    @NonNull
    public final TextView title;

    private NnlPendingAuthItemBinding(@NonNull RelativeLayout relativeLayout, @NonNull Button button, @NonNull Button button2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f62976a = relativeLayout;
        this.approveButton = button;
        this.rejectButton = button2;
        this.remainingTime = textView;
        this.statusCode = textView2;
        this.title = textView3;
    }

    @NonNull
    public static NnlPendingAuthItemBinding bind(@NonNull View view) {
        int i10 = R.id.approve_button;
        Button button = (Button) ViewBindings.findChildViewById(view, i10);
        if (button != null) {
            i10 = R.id.reject_button;
            Button button2 = (Button) ViewBindings.findChildViewById(view, i10);
            if (button2 != null) {
                i10 = R.id.remaining_time;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i10);
                if (textView != null) {
                    i10 = R.id.status_code;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i10);
                    if (textView2 != null) {
                        i10 = R.id.title;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i10);
                        if (textView3 != null) {
                            return new NnlPendingAuthItemBinding((RelativeLayout) view, button, button2, textView, textView2, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static NnlPendingAuthItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static NnlPendingAuthItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.nnl_pending_auth_item, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.f62976a;
    }
}
