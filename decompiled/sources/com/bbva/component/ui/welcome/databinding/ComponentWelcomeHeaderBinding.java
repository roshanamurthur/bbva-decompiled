package com.bbva.component.ui.welcome.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import com.bbva.cellswidgets.CellsTextView;
import com.bbva.component.ui.welcome.R;

/* JADX INFO: loaded from: classes2.dex */
public final class ComponentWelcomeHeaderBinding implements ViewBinding {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NonNull
    public final View f28773p0;

    @NonNull
    public final CellsTextView welcomeHeaderDescription;

    @NonNull
    public final CellsTextView welcomeHeaderTitle;

    @NonNull
    public final CellsTextView welcomeHeaderUserName;

    public ComponentWelcomeHeaderBinding(@NonNull View view, @NonNull CellsTextView cellsTextView, @NonNull CellsTextView cellsTextView2, @NonNull CellsTextView cellsTextView3) {
        this.f28773p0 = view;
        this.welcomeHeaderDescription = cellsTextView;
        this.welcomeHeaderTitle = cellsTextView2;
        this.welcomeHeaderUserName = cellsTextView3;
    }

    @NonNull
    public static ComponentWelcomeHeaderBinding bind(@NonNull View view) {
        int i10 = R.id.welcomeHeaderDescription;
        CellsTextView cellsTextView = (CellsTextView) view.findViewById(i10);
        if (cellsTextView != null) {
            i10 = R.id.welcomeHeaderTitle;
            CellsTextView cellsTextView2 = (CellsTextView) view.findViewById(i10);
            if (cellsTextView2 != null) {
                i10 = R.id.welcomeHeaderUserName;
                CellsTextView cellsTextView3 = (CellsTextView) view.findViewById(i10);
                if (cellsTextView3 != null) {
                    return new ComponentWelcomeHeaderBinding(view, cellsTextView, cellsTextView2, cellsTextView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static ComponentWelcomeHeaderBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.component_welcome_header, viewGroup);
        return bind(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.f28773p0;
    }
}
