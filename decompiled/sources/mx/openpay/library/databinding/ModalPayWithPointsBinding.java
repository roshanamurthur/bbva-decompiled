package mx.openpay.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import mx.openpay.library.R;

/* JADX INFO: loaded from: classes12.dex */
public final class ModalPayWithPointsBinding implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f83828a;

    @NonNull
    public final View horizontalDivider;

    @NonNull
    public final TextView noButton;

    @NonNull
    public final TextView titleTextview;

    @NonNull
    public final View verticalDivider;

    @NonNull
    public final TextView yesButton;

    public ModalPayWithPointsBinding(FrameLayout frameLayout, View view, TextView textView, TextView textView2, View view2, TextView textView3) {
        this.f83828a = frameLayout;
        this.horizontalDivider = view;
        this.noButton = textView;
        this.titleTextview = textView2;
        this.verticalDivider = view2;
        this.yesButton = textView3;
    }

    @NonNull
    public static ModalPayWithPointsBinding bind(@NonNull View view) {
        View viewFindChildViewById;
        int i10 = R.id.horizontal_divider;
        View viewFindChildViewById2 = ViewBindings.findChildViewById(view, i10);
        if (viewFindChildViewById2 != null) {
            i10 = R.id.noButton;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i10);
            if (textView != null) {
                i10 = R.id.titleTextview;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i10);
                if (textView2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i10 = R.id.vertical_divider))) != null) {
                    i10 = R.id.yesButton;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i10);
                    if (textView3 != null) {
                        return new ModalPayWithPointsBinding((FrameLayout) view, viewFindChildViewById2, textView, textView2, viewFindChildViewById, textView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static ModalPayWithPointsBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ModalPayWithPointsBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.modal_pay_with_points, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.f83828a;
    }
}
