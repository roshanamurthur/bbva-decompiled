package com.bbva.notifications.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bbva.cellswidgets.CellsTextView;
import com.bbva.notifications.R;

/* JADX INFO: loaded from: classes7.dex */
public final class NotificationItemListBinding implements ViewBinding {

    @NonNull
    public final CellsTextView notificationDescription;

    @NonNull
    public final CellsTextView notificationTitle;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f35340p0;

    public NotificationItemListBinding(@NonNull ConstraintLayout constraintLayout, @NonNull CellsTextView cellsTextView, @NonNull CellsTextView cellsTextView2) {
        this.f35340p0 = constraintLayout;
        this.notificationDescription = cellsTextView;
        this.notificationTitle = cellsTextView2;
    }

    @NonNull
    public static NotificationItemListBinding bind(@NonNull View view) {
        int i10 = R.id.notification_description;
        CellsTextView cellsTextView = (CellsTextView) ViewBindings.findChildViewById(view, i10);
        if (cellsTextView != null) {
            i10 = R.id.notification_title;
            CellsTextView cellsTextView2 = (CellsTextView) ViewBindings.findChildViewById(view, i10);
            if (cellsTextView2 != null) {
                return new NotificationItemListBinding((ConstraintLayout) view, cellsTextView, cellsTextView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static NotificationItemListBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static NotificationItemListBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.notification_item_list, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f35340p0;
    }
}
