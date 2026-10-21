package com.bbva.notifications.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bbva.notifications.R;
import com.bbva.ui.components.timer.TimerProgressView;
import com.bbva.ui.widget.BbvaTextView;

/* JADX INFO: loaded from: classes7.dex */
public final class ViewTimerProgressBinding implements ViewBinding {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NonNull
    public final LinearLayout f35343p0;

    @NonNull
    public final LinearLayout timerProgressContainer;

    @NonNull
    public final BbvaTextView timerProgressDescription;

    @NonNull
    public final FrameLayout timerShortcutsContainer;

    @NonNull
    public final TimerProgressView timerView;

    public ViewTimerProgressBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull BbvaTextView bbvaTextView, @NonNull FrameLayout frameLayout, @NonNull TimerProgressView timerProgressView) {
        this.f35343p0 = linearLayout;
        this.timerProgressContainer = linearLayout2;
        this.timerProgressDescription = bbvaTextView;
        this.timerShortcutsContainer = frameLayout;
        this.timerView = timerProgressView;
    }

    @NonNull
    public static ViewTimerProgressBinding bind(@NonNull View view) {
        int i10 = R.id.timerProgressContainer;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i10);
        if (linearLayout != null) {
            i10 = R.id.timerProgressDescription;
            BbvaTextView bbvaTextView = (BbvaTextView) ViewBindings.findChildViewById(view, i10);
            if (bbvaTextView != null) {
                i10 = R.id.timerShortcutsContainer;
                FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i10);
                if (frameLayout != null) {
                    i10 = R.id.timerView;
                    TimerProgressView timerProgressView = (TimerProgressView) ViewBindings.findChildViewById(view, i10);
                    if (timerProgressView != null) {
                        return new ViewTimerProgressBinding((LinearLayout) view, linearLayout, bbvaTextView, frameLayout, timerProgressView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static ViewTimerProgressBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ViewTimerProgressBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.view_timer_progress, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f35343p0;
    }
}
