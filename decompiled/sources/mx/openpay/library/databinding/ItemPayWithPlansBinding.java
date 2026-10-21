package mx.openpay.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import mx.openpay.library.R;

/* JADX INFO: loaded from: classes12.dex */
public final class ItemPayWithPlansBinding implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f83826a;

    @NonNull
    public final View divider;

    @NonNull
    public final AppCompatRadioButton radioButtonPlans;

    public ItemPayWithPlansBinding(ConstraintLayout constraintLayout, View view, AppCompatRadioButton appCompatRadioButton) {
        this.f83826a = constraintLayout;
        this.divider = view;
        this.radioButtonPlans = appCompatRadioButton;
    }

    @NonNull
    public static ItemPayWithPlansBinding bind(@NonNull View view) {
        int i10 = R.id.divider;
        View viewFindChildViewById = ViewBindings.findChildViewById(view, i10);
        if (viewFindChildViewById != null) {
            i10 = R.id.radioButtonPlans;
            AppCompatRadioButton appCompatRadioButton = (AppCompatRadioButton) ViewBindings.findChildViewById(view, i10);
            if (appCompatRadioButton != null) {
                return new ItemPayWithPlansBinding((ConstraintLayout) view, viewFindChildViewById, appCompatRadioButton);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static ItemPayWithPlansBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemPayWithPlansBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.item_pay_with_plans, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f83826a;
    }
}
