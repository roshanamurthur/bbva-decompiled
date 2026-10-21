package com.google.android.material.sidesheet;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.annotation.GravityInt;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDialog;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import com.google.android.material.R;
import com.google.android.material.motion.MaterialBackOrchestrator;
import ne.c;
import ne.e;
import ne.i;

/* JADX INFO: compiled from: SheetDialog.java */
/* JADX INFO: loaded from: classes10.dex */
public abstract class a<C extends c> extends AppCompatDialog {
    public static final int H0 = R.id.coordinator;
    public static final int I0 = R.id.touch_outside;
    public boolean E0;
    public boolean F0;

    @Nullable
    public MaterialBackOrchestrator G0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @Nullable
    public SideSheetBehavior f45359u0;

    @Nullable
    public FrameLayout v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    @Nullable
    public FrameLayout f45360w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public boolean f45361x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public boolean f45362y0;

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        Sheet<C> behavior = getBehavior();
        if (!this.f45361x0 || behavior.getState() == 5) {
            super.cancel();
        } else {
            behavior.setState(5);
        }
    }

    public final void e() {
        if (this.v0 == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), R.layout.m3_side_sheet_dialog, null);
            this.v0 = frameLayout;
            FrameLayout frameLayout2 = (FrameLayout) frameLayout.findViewById(R.id.m3_side_sheet);
            this.f45360w0 = frameLayout2;
            SideSheetBehavior sideSheetBehaviorFrom = SideSheetBehavior.from(frameLayout2);
            this.f45359u0 = sideSheetBehaviorFrom;
            sideSheetBehaviorFrom.addCallback(new i((SideSheetDialog) this));
            this.G0 = new MaterialBackOrchestrator(this.f45359u0, this.f45360w0);
        }
    }

    public final void f() {
        FrameLayout frameLayout;
        Window window = getWindow();
        if (window == null || (frameLayout = this.f45360w0) == null || !(frameLayout.getLayoutParams() instanceof CoordinatorLayout.LayoutParams)) {
            return;
        }
        window.setWindowAnimations(GravityCompat.getAbsoluteGravity(((CoordinatorLayout.LayoutParams) this.f45360w0.getLayoutParams()).gravity, ViewCompat.getLayoutDirection(this.f45360w0)) == 3 ? R.style.Animation_Material3_SideSheetDialog_Left : R.style.Animation_Material3_SideSheetDialog_Right);
    }

    public final FrameLayout g(@Nullable View view, int i10, @Nullable ViewGroup.LayoutParams layoutParams) {
        e();
        if (this.v0 == null) {
            e();
        }
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.v0.findViewById(H0);
        if (i10 != 0 && view == null) {
            view = getLayoutInflater().inflate(i10, (ViewGroup) coordinatorLayout, false);
        }
        if (this.f45360w0 == null) {
            e();
        }
        FrameLayout frameLayout = this.f45360w0;
        frameLayout.removeAllViews();
        if (layoutParams == null) {
            frameLayout.addView(view);
        } else {
            frameLayout.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(I0).setOnClickListener(new c9.a(this, 2));
        if (this.f45360w0 == null) {
            e();
        }
        ViewCompat.setAccessibilityDelegate(this.f45360w0, new e(this));
        return this.v0;
    }

    @NonNull
    public abstract Sheet<C> getBehavior();

    public boolean isDismissWithSheetAnimationEnabled() {
        return this.f45361x0;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        f();
        MaterialBackOrchestrator materialBackOrchestrator = this.G0;
        if (materialBackOrchestrator == null) {
            return;
        }
        if (this.f45362y0) {
            materialBackOrchestrator.startListeningForBackCallbacks();
        } else {
            materialBackOrchestrator.stopListeningForBackCallbacks();
        }
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        MaterialBackOrchestrator materialBackOrchestrator = this.G0;
        if (materialBackOrchestrator != null) {
            materialBackOrchestrator.stopListeningForBackCallbacks();
        }
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public void onStart() {
        super.onStart();
        SideSheetBehavior sideSheetBehavior = this.f45359u0;
        if (sideSheetBehavior == null || sideSheetBehavior.getState() != 5) {
            return;
        }
        this.f45359u0.setState(3);
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z10) {
        MaterialBackOrchestrator materialBackOrchestrator;
        super.setCancelable(z10);
        if (this.f45362y0 != z10) {
            this.f45362y0 = z10;
        }
        if (getWindow() == null || (materialBackOrchestrator = this.G0) == null) {
            return;
        }
        if (this.f45362y0) {
            materialBackOrchestrator.startListeningForBackCallbacks();
        } else {
            materialBackOrchestrator.stopListeningForBackCallbacks();
        }
    }

    @Override // android.app.Dialog
    public void setCanceledOnTouchOutside(boolean z10) {
        super.setCanceledOnTouchOutside(z10);
        if (z10 && !this.f45362y0) {
            this.f45362y0 = true;
        }
        this.E0 = z10;
        this.F0 = true;
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void setContentView(@LayoutRes int i10) {
        super.setContentView(g(null, i10, null));
    }

    public void setDismissWithSheetAnimationEnabled(boolean z10) {
        this.f45361x0 = z10;
    }

    public void setSheetEdge(@GravityInt int i10) {
        FrameLayout frameLayout = this.f45360w0;
        if (frameLayout == null) {
            throw new IllegalStateException("Sheet view reference is null; sheet edge cannot be changed if the sheet view is null.");
        }
        if (ViewCompat.isLaidOut(frameLayout)) {
            throw new IllegalStateException("Sheet view has been laid out; sheet edge cannot be changed once the sheet has been laid out.");
        }
        ViewGroup.LayoutParams layoutParams = this.f45360w0.getLayoutParams();
        if (layoutParams instanceof CoordinatorLayout.LayoutParams) {
            ((CoordinatorLayout.LayoutParams) layoutParams).gravity = i10;
            f();
        }
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void setContentView(@Nullable View view) {
        super.setContentView(g(view, 0, null));
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void setContentView(@Nullable View view, @Nullable ViewGroup.LayoutParams layoutParams) {
        super.setContentView(g(view, 0, layoutParams));
    }
}
