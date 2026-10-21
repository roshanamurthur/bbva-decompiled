package mx.openpay.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import mx.openpay.library.R;

/* JADX INFO: loaded from: classes12.dex */
public final class ItemSelectorBinding implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f83827a;

    @NonNull
    public final View horizontalDivider;

    @NonNull
    public final RadioButton optionRadioButton;

    @NonNull
    public final TextView optionText;

    public ItemSelectorBinding(ConstraintLayout constraintLayout, View view, RadioButton radioButton, TextView textView) {
        this.f83827a = constraintLayout;
        this.horizontalDivider = view;
        this.optionRadioButton = radioButton;
        this.optionText = textView;
    }

    @NonNull
    public static ItemSelectorBinding bind(@NonNull View view) {
        int i10 = R.id.horizontal_divider;
        View viewFindChildViewById = ViewBindings.findChildViewById(view, i10);
        if (viewFindChildViewById != null) {
            i10 = R.id.option_radio_button;
            RadioButton radioButton = (RadioButton) ViewBindings.findChildViewById(view, i10);
            if (radioButton != null) {
                i10 = R.id.option_text;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i10);
                if (textView != null) {
                    return new ItemSelectorBinding((ConstraintLayout) view, viewFindChildViewById, radioButton, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static ItemSelectorBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemSelectorBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.item_selector, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f83827a;
    }
}
