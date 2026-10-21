package com.bbva.component.ui.welcome.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import com.bbva.cellswidgets.CellsButton;
import com.bbva.component.ui.welcome.R;

/* JADX INFO: loaded from: classes2.dex */
public final class ComponentWelcomeFooterBinding implements ViewBinding {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NonNull
    public final View f28772p0;

    @NonNull
    public final CellsButton welcomeFooterBottomButton;

    @NonNull
    public final TextView welcomeFooterTerms;

    @NonNull
    public final CellsButton welcomeFooterTopButton;

    public ComponentWelcomeFooterBinding(@NonNull View view, @NonNull CellsButton cellsButton, @NonNull TextView textView, @NonNull CellsButton cellsButton2) {
        this.f28772p0 = view;
        this.welcomeFooterBottomButton = cellsButton;
        this.welcomeFooterTerms = textView;
        this.welcomeFooterTopButton = cellsButton2;
    }

    @NonNull
    public static ComponentWelcomeFooterBinding bind(@NonNull View view) {
        int i10 = R.id.welcomeFooterBottomButton;
        CellsButton cellsButton = (CellsButton) view.findViewById(i10);
        if (cellsButton != null) {
            i10 = R.id.welcomeFooterTerms;
            TextView textView = (TextView) view.findViewById(i10);
            if (textView != null) {
                i10 = R.id.welcomeFooterTopButton;
                CellsButton cellsButton2 = (CellsButton) view.findViewById(i10);
                if (cellsButton2 != null) {
                    return new ComponentWelcomeFooterBinding(view, cellsButton, textView, cellsButton2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static ComponentWelcomeFooterBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.component_welcome_footer, viewGroup);
        return bind(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.f28772p0;
    }
}
