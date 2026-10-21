package com.bbva.notifications.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bbva.cellswidgets.CellsImageView;
import com.bbva.cellswidgets.CellsTextView;
import com.bbva.component.ui.loader.LoaderSpinnerComponent;
import com.bbva.notifications.R;

/* JADX INFO: loaded from: classes7.dex */
public final class ActivityNotificationNoCommercialBinding implements ViewBinding {

    @NonNull
    public final Toolbar appBarLayout;

    @NonNull
    public final AppCompatImageView icLogo;

    @NonNull
    public final CellsImageView iconClose;

    @NonNull
    public final LoaderSpinnerComponent loaderSpinnerComponent;

    @NonNull
    public final NestedScrollView nestedScrollView;

    @NonNull
    public final LinearLayout notificationDetailContainer;

    @NonNull
    public final RecyclerView notificationDetailList;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f35339p0;

    @NonNull
    public final FrameLayout shortcutsContainer;

    @NonNull
    public final ViewTimerProgressBinding timerProgressLayout;

    @NonNull
    public final CellsTextView toolbarTitleLabel;

    @NonNull
    public final CellsTextView topNotificationAmountTextView;

    @NonNull
    public final CellsTextView topNotificationDateTextView;

    @NonNull
    public final CellsTextView topNotificationDescriptionTextView;

    @NonNull
    public final CellsTextView topNotificationTitleTextView;

    public ActivityNotificationNoCommercialBinding(@NonNull ConstraintLayout constraintLayout, @NonNull Toolbar toolbar, @NonNull AppCompatImageView appCompatImageView, @NonNull CellsImageView cellsImageView, @NonNull LoaderSpinnerComponent loaderSpinnerComponent, @NonNull NestedScrollView nestedScrollView, @NonNull LinearLayout linearLayout, @NonNull RecyclerView recyclerView, @NonNull FrameLayout frameLayout, @NonNull ViewTimerProgressBinding viewTimerProgressBinding, @NonNull CellsTextView cellsTextView, @NonNull CellsTextView cellsTextView2, @NonNull CellsTextView cellsTextView3, @NonNull CellsTextView cellsTextView4, @NonNull CellsTextView cellsTextView5) {
        this.f35339p0 = constraintLayout;
        this.appBarLayout = toolbar;
        this.icLogo = appCompatImageView;
        this.iconClose = cellsImageView;
        this.loaderSpinnerComponent = loaderSpinnerComponent;
        this.nestedScrollView = nestedScrollView;
        this.notificationDetailContainer = linearLayout;
        this.notificationDetailList = recyclerView;
        this.shortcutsContainer = frameLayout;
        this.timerProgressLayout = viewTimerProgressBinding;
        this.toolbarTitleLabel = cellsTextView;
        this.topNotificationAmountTextView = cellsTextView2;
        this.topNotificationDateTextView = cellsTextView3;
        this.topNotificationDescriptionTextView = cellsTextView4;
        this.topNotificationTitleTextView = cellsTextView5;
    }

    @NonNull
    public static ActivityNotificationNoCommercialBinding bind(@NonNull View view) {
        View viewFindChildViewById;
        int i10 = R.id.appBarLayout;
        Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(view, i10);
        if (toolbar != null) {
            i10 = R.id.ic_logo;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i10);
            if (appCompatImageView != null) {
                i10 = R.id.icon_close;
                CellsImageView cellsImageView = (CellsImageView) ViewBindings.findChildViewById(view, i10);
                if (cellsImageView != null) {
                    i10 = R.id.loaderSpinnerComponent;
                    LoaderSpinnerComponent loaderSpinnerComponent = (LoaderSpinnerComponent) ViewBindings.findChildViewById(view, i10);
                    if (loaderSpinnerComponent != null) {
                        i10 = R.id.nestedScrollView;
                        NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i10);
                        if (nestedScrollView != null) {
                            i10 = R.id.notificationDetailContainer;
                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i10);
                            if (linearLayout != null) {
                                i10 = R.id.notificationDetailList;
                                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i10);
                                if (recyclerView != null) {
                                    i10 = R.id.shortcutsContainer;
                                    FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i10);
                                    if (frameLayout != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i10 = R.id.timerProgressLayout))) != null) {
                                        ViewTimerProgressBinding viewTimerProgressBindingBind = ViewTimerProgressBinding.bind(viewFindChildViewById);
                                        i10 = R.id.toolbarTitleLabel;
                                        CellsTextView cellsTextView = (CellsTextView) ViewBindings.findChildViewById(view, i10);
                                        if (cellsTextView != null) {
                                            i10 = R.id.topNotificationAmountTextView;
                                            CellsTextView cellsTextView2 = (CellsTextView) ViewBindings.findChildViewById(view, i10);
                                            if (cellsTextView2 != null) {
                                                i10 = R.id.topNotificationDateTextView;
                                                CellsTextView cellsTextView3 = (CellsTextView) ViewBindings.findChildViewById(view, i10);
                                                if (cellsTextView3 != null) {
                                                    i10 = R.id.topNotificationDescriptionTextView;
                                                    CellsTextView cellsTextView4 = (CellsTextView) ViewBindings.findChildViewById(view, i10);
                                                    if (cellsTextView4 != null) {
                                                        i10 = R.id.topNotificationTitleTextView;
                                                        CellsTextView cellsTextView5 = (CellsTextView) ViewBindings.findChildViewById(view, i10);
                                                        if (cellsTextView5 != null) {
                                                            return new ActivityNotificationNoCommercialBinding((ConstraintLayout) view, toolbar, appCompatImageView, cellsImageView, loaderSpinnerComponent, nestedScrollView, linearLayout, recyclerView, frameLayout, viewTimerProgressBindingBind, cellsTextView, cellsTextView2, cellsTextView3, cellsTextView4, cellsTextView5);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static ActivityNotificationNoCommercialBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityNotificationNoCommercialBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_notification_no_commercial, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f35339p0;
    }
}
