package mx.openpay.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import mx.openpay.library.R;

/* JADX INFO: loaded from: classes12.dex */
public final class FragmentPayWithPlansModalBinding implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f83824a;

    @NonNull
    public final AppCompatButton btnContinue;

    @NonNull
    public final ConstraintLayout clContent;

    @NonNull
    public final AppCompatImageView closeButton;

    @NonNull
    public final FrameLayout flContainerMessage;

    @NonNull
    public final View horizontalDivider;

    @NonNull
    public final AppCompatImageView ivCaption;

    @NonNull
    public final TextView noButton;

    @NonNull
    public final RecyclerView rvContentPlans;

    @NonNull
    public final TextView titleTextview;

    @NonNull
    public final TextView tvMessage;

    @NonNull
    public final TextView tvSubtitle;

    @NonNull
    public final View verticalDivider;

    @NonNull
    public final TextView yesButton;

    public FragmentPayWithPlansModalBinding(ConstraintLayout constraintLayout, AppCompatButton appCompatButton, ConstraintLayout constraintLayout2, AppCompatImageView appCompatImageView, FrameLayout frameLayout, View view, AppCompatImageView appCompatImageView2, TextView textView, RecyclerView recyclerView, TextView textView2, TextView textView3, TextView textView4, View view2, TextView textView5) {
        this.f83824a = constraintLayout;
        this.btnContinue = appCompatButton;
        this.clContent = constraintLayout2;
        this.closeButton = appCompatImageView;
        this.flContainerMessage = frameLayout;
        this.horizontalDivider = view;
        this.ivCaption = appCompatImageView2;
        this.noButton = textView;
        this.rvContentPlans = recyclerView;
        this.titleTextview = textView2;
        this.tvMessage = textView3;
        this.tvSubtitle = textView4;
        this.verticalDivider = view2;
        this.yesButton = textView5;
    }

    @NonNull
    public static FragmentPayWithPlansModalBinding bind(@NonNull View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        int i10 = R.id.btnContinue;
        AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(view, i10);
        if (appCompatButton != null) {
            i10 = R.id.clContent;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i10);
            if (constraintLayout != null) {
                i10 = R.id.close_button;
                AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i10);
                if (appCompatImageView != null) {
                    i10 = R.id.flContainerMessage;
                    FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i10);
                    if (frameLayout != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i10 = R.id.horizontal_divider))) != null) {
                        i10 = R.id.ivCaption;
                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i10);
                        if (appCompatImageView2 != null) {
                            i10 = R.id.noButton;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view, i10);
                            if (textView != null) {
                                i10 = R.id.rvContentPlans;
                                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i10);
                                if (recyclerView != null) {
                                    i10 = R.id.titleTextview;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i10);
                                    if (textView2 != null) {
                                        i10 = R.id.tvMessage;
                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i10);
                                        if (textView3 != null) {
                                            i10 = R.id.tvSubtitle;
                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i10);
                                            if (textView4 != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i10 = R.id.vertical_divider))) != null) {
                                                i10 = R.id.yesButton;
                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i10);
                                                if (textView5 != null) {
                                                    return new FragmentPayWithPlansModalBinding((ConstraintLayout) view, appCompatButton, constraintLayout, appCompatImageView, frameLayout, viewFindChildViewById, appCompatImageView2, textView, recyclerView, textView2, textView3, textView4, viewFindChildViewById2, textView5);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static FragmentPayWithPlansModalBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentPayWithPlansModalBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_pay_with_plans_modal, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f83824a;
    }
}
