package com.bbva.glomohybrid.infoscreen.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bbva.glomohybrid.infoscreen.R;
import com.bbva.ui.components.timer.TimerProgressView;
import com.bbva.ui.widget.BbvaTextView;

/* JADX INFO: loaded from: classes6.dex */
public final class ViewTimerBinding implements ViewBinding {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NonNull
    public final LinearLayout f32303p0;

    @NonNull
    public final BbvaTextView timerProgressDescription;

    @NonNull
    public final LinearLayout timerProgressLayout;

    @NonNull
    public final TimerProgressView timerProgressView;

    public ViewTimerBinding(@NonNull LinearLayout linearLayout, @NonNull BbvaTextView bbvaTextView, @NonNull LinearLayout linearLayout2, @NonNull TimerProgressView timerProgressView) {
        this.f32303p0 = linearLayout;
        this.timerProgressDescription = bbvaTextView;
        this.timerProgressLayout = linearLayout2;
        this.timerProgressView = timerProgressView;
    }

    @NonNull
    public static ViewTimerBinding bind(@NonNull View view) {
        int i10 = R.id.timerProgressDescription;
        BbvaTextView bbvaTextView = (BbvaTextView) ViewBindings.findChildViewById(view, i10);
        if (bbvaTextView != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            int i11 = R.id.timerProgressView;
            TimerProgressView timerProgressView = (TimerProgressView) ViewBindings.findChildViewById(view, i11);
            if (timerProgressView != null) {
                return new ViewTimerBinding(linearLayout, bbvaTextView, linearLayout, timerProgressView);
            }
            i10 = i11;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static ViewTimerBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ViewTimerBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.view_timer, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f32303p0;
    }
}
