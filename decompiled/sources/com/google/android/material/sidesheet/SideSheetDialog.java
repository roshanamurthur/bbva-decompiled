package com.google.android.material.sidesheet;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.GravityInt;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import com.google.android.material.R;

/* JADX INFO: loaded from: classes10.dex */
public class SideSheetDialog extends a<SideSheetCallback> {
    public static final int J0 = R.attr.sideSheetDialogTheme;
    public static final int K0 = R.style.Theme_Material3_Light_SideSheetDialog;

    public SideSheetDialog(@NonNull Context context) {
        this(context, 0);
    }

    @Override // com.google.android.material.sidesheet.a, android.app.Dialog, android.content.DialogInterface
    public /* bridge */ /* synthetic */ void cancel() {
        super.cancel();
    }

    @Override // com.google.android.material.sidesheet.a
    public /* bridge */ /* synthetic */ boolean isDismissWithSheetAnimationEnabled() {
        return super.isDismissWithSheetAnimationEnabled();
    }

    @Override // com.google.android.material.sidesheet.a, android.app.Dialog, android.view.Window.Callback
    public /* bridge */ /* synthetic */ void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // com.google.android.material.sidesheet.a, android.app.Dialog, android.view.Window.Callback
    public /* bridge */ /* synthetic */ void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // com.google.android.material.sidesheet.a, android.app.Dialog
    public /* bridge */ /* synthetic */ void setCancelable(boolean z10) {
        super.setCancelable(z10);
    }

    @Override // com.google.android.material.sidesheet.a, android.app.Dialog
    public /* bridge */ /* synthetic */ void setCanceledOnTouchOutside(boolean z10) {
        super.setCanceledOnTouchOutside(z10);
    }

    @Override // com.google.android.material.sidesheet.a, androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public /* bridge */ /* synthetic */ void setContentView(@LayoutRes int i10) {
        super.setContentView(i10);
    }

    @Override // com.google.android.material.sidesheet.a
    public /* bridge */ /* synthetic */ void setDismissWithSheetAnimationEnabled(boolean z10) {
        super.setDismissWithSheetAnimationEnabled(z10);
    }

    @Override // com.google.android.material.sidesheet.a
    public /* bridge */ /* synthetic */ void setSheetEdge(@GravityInt int i10) {
        super.setSheetEdge(i10);
    }

    public SideSheetDialog(@NonNull Context context, @StyleRes int i10) {
        if (i10 == 0) {
            TypedValue typedValue = new TypedValue();
            i10 = context.getTheme().resolveAttribute(J0, typedValue, true) ? typedValue.resourceId : K0;
        }
        super(context, i10);
        this.f45362y0 = true;
        this.E0 = true;
        supportRequestWindowFeature(1);
    }

    @Override // com.google.android.material.sidesheet.a
    @NonNull
    public SideSheetBehavior<? extends View> getBehavior() {
        if (this.f45359u0 == null) {
            e();
        }
        SideSheetBehavior<? extends View> sideSheetBehavior = this.f45359u0;
        if (sideSheetBehavior instanceof SideSheetBehavior) {
            return sideSheetBehavior;
        }
        throw new IllegalStateException("The view is not associated with SideSheetBehavior");
    }

    @Override // com.google.android.material.sidesheet.a, androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public /* bridge */ /* synthetic */ void setContentView(@Nullable View view) {
        super.setContentView(view);
    }

    @Override // com.google.android.material.sidesheet.a, androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public /* bridge */ /* synthetic */ void setContentView(@Nullable View view, @Nullable ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
    }
}
