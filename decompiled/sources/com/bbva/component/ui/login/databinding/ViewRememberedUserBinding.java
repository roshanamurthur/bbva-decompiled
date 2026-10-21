package com.bbva.component.ui.login.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bbva.cellswidgets.CellsButton;
import com.bbva.cellswidgets.CellsCircleInitialsView;
import com.bbva.cellswidgets.CellsEditText;
import com.bbva.cellswidgets.CellsTextView;
import com.bbva.component.ui.login.R;

/* JADX INFO: loaded from: classes4.dex */
public final class ViewRememberedUserBinding implements ViewBinding {

    @NonNull
    public final ViewAccessingBiometricsBinding accessingBiometricsInclude;

    @NonNull
    public final ConstraintLayout buttonsContainer;

    @NonNull
    public final ConstraintLayout greetingsContainer;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NonNull
    public final View f28500p0;

    @NonNull
    public final CellsEditText passwordEditText;

    @NonNull
    public final CellsButton primaryActionButton;

    @NonNull
    public final CellsTextView rememberPassword;

    @NonNull
    public final CellsCircleInitialsView rememberedUserAvatar;

    @NonNull
    public final AppCompatTextView rememberedUserGreeting;

    @NonNull
    public final LinearLayoutCompat rememberedUserGreetingContainer;

    @NonNull
    public final AppCompatImageView rememberedUserImage;

    @NonNull
    public final AppCompatTextView rememberedUserName;

    @NonNull
    public final FrameLayout rememebredUserImageContainer;

    @NonNull
    public final CellsButton secondaryActionButton;

    public ViewRememberedUserBinding(@NonNull View view, @NonNull ViewAccessingBiometricsBinding viewAccessingBiometricsBinding, @NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull CellsEditText cellsEditText, @NonNull CellsButton cellsButton, @NonNull CellsTextView cellsTextView, @NonNull CellsCircleInitialsView cellsCircleInitialsView, @NonNull AppCompatTextView appCompatTextView, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull AppCompatImageView appCompatImageView, @NonNull AppCompatTextView appCompatTextView2, @NonNull FrameLayout frameLayout, @NonNull CellsButton cellsButton2) {
        this.f28500p0 = view;
        this.accessingBiometricsInclude = viewAccessingBiometricsBinding;
        this.buttonsContainer = constraintLayout;
        this.greetingsContainer = constraintLayout2;
        this.passwordEditText = cellsEditText;
        this.primaryActionButton = cellsButton;
        this.rememberPassword = cellsTextView;
        this.rememberedUserAvatar = cellsCircleInitialsView;
        this.rememberedUserGreeting = appCompatTextView;
        this.rememberedUserGreetingContainer = linearLayoutCompat;
        this.rememberedUserImage = appCompatImageView;
        this.rememberedUserName = appCompatTextView2;
        this.rememebredUserImageContainer = frameLayout;
        this.secondaryActionButton = cellsButton2;
    }

    @NonNull
    public static ViewRememberedUserBinding bind(@NonNull View view) {
        int i10 = R.id.accessing_biometrics_include;
        View viewFindChildViewById = ViewBindings.findChildViewById(view, i10);
        if (viewFindChildViewById != null) {
            ViewAccessingBiometricsBinding viewAccessingBiometricsBindingBind = ViewAccessingBiometricsBinding.bind(viewFindChildViewById);
            i10 = R.id.buttons_container;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i10);
            if (constraintLayout != null) {
                i10 = R.id.greetings_container;
                ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i10);
                if (constraintLayout2 != null) {
                    i10 = R.id.passwordEditText;
                    CellsEditText cellsEditText = (CellsEditText) ViewBindings.findChildViewById(view, i10);
                    if (cellsEditText != null) {
                        i10 = R.id.primaryActionButton;
                        CellsButton cellsButton = (CellsButton) ViewBindings.findChildViewById(view, i10);
                        if (cellsButton != null) {
                            i10 = R.id.remember_password;
                            CellsTextView cellsTextView = (CellsTextView) ViewBindings.findChildViewById(view, i10);
                            if (cellsTextView != null) {
                                i10 = R.id.remembered_user_avatar;
                                CellsCircleInitialsView cellsCircleInitialsView = (CellsCircleInitialsView) ViewBindings.findChildViewById(view, i10);
                                if (cellsCircleInitialsView != null) {
                                    i10 = R.id.remembered_user_greeting;
                                    AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i10);
                                    if (appCompatTextView != null) {
                                        i10 = R.id.remembered_user_greeting_container;
                                        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i10);
                                        if (linearLayoutCompat != null) {
                                            i10 = R.id.remembered_user_image;
                                            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i10);
                                            if (appCompatImageView != null) {
                                                i10 = R.id.remembered_user_name;
                                                AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i10);
                                                if (appCompatTextView2 != null) {
                                                    i10 = R.id.rememebred_user_image_container;
                                                    FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i10);
                                                    if (frameLayout != null) {
                                                        i10 = R.id.secondaryActionButton;
                                                        CellsButton cellsButton2 = (CellsButton) ViewBindings.findChildViewById(view, i10);
                                                        if (cellsButton2 != null) {
                                                            return new ViewRememberedUserBinding(view, viewAccessingBiometricsBindingBind, constraintLayout, constraintLayout2, cellsEditText, cellsButton, cellsTextView, cellsCircleInitialsView, appCompatTextView, linearLayoutCompat, appCompatImageView, appCompatTextView2, frameLayout, cellsButton2);
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
    public static ViewRememberedUserBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.view_remembered_user, viewGroup);
        return bind(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.f28500p0;
    }
}
