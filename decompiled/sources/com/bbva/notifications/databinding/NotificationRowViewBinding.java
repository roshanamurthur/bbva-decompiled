package com.bbva.notifications.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bbva.cellswidgets.CellsTextView;
import com.bbva.notifications.R;

/* JADX INFO: loaded from: classes7.dex */
public final class NotificationRowViewBinding implements ViewBinding {

    @NonNull
    public final CellsTextView notificationRowDescriptionTextView;

    @NonNull
    public final CellsTextView notificationRowTitleTextView;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NonNull
    public final View f35341p0;

    public NotificationRowViewBinding(@NonNull View view, @NonNull CellsTextView cellsTextView, @NonNull CellsTextView cellsTextView2) {
        this.f35341p0 = view;
        this.notificationRowDescriptionTextView = cellsTextView;
        this.notificationRowTitleTextView = cellsTextView2;
    }

    @NonNull
    public static NotificationRowViewBinding bind(@NonNull View view) {
        int i10 = R.id.notificationRowDescriptionTextView;
        CellsTextView cellsTextView = (CellsTextView) ViewBindings.findChildViewById(view, i10);
        if (cellsTextView != null) {
            i10 = R.id.notificationRowTitleTextView;
            CellsTextView cellsTextView2 = (CellsTextView) ViewBindings.findChildViewById(view, i10);
            if (cellsTextView2 != null) {
                return new NotificationRowViewBinding(view, cellsTextView, cellsTextView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static NotificationRowViewBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.notification_row_view, viewGroup);
        return bind(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.f35341p0;
    }
}
