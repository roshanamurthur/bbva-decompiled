package com.google.android.material.bottomsheet;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import androidx.appcompat.app.AppCompatDialog;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.R;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.EdgeToEdgeUtils;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.motion.MaterialBackOrchestrator;
import com.google.android.material.shape.MaterialShapeDrawable;
import de.d;
import de.e;
import de.f;

/* JADX INFO: loaded from: classes10.dex */
public class BottomSheetDialog extends AppCompatDialog {
    public boolean E0;
    public boolean F0;
    public boolean G0;
    public b H0;
    public final boolean I0;

    @Nullable
    public MaterialBackOrchestrator J0;

    @NonNull
    public final a K0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public BottomSheetBehavior<FrameLayout> f44108u0;
    public FrameLayout v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public CoordinatorLayout f44109w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public FrameLayout f44110x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public boolean f44111y0;

    public static class b extends BottomSheetBehavior.BottomSheetCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final Boolean f44113a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NonNull
        public final WindowInsetsCompat f44114b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public Window f44115c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f44116d;

        public b(FrameLayout frameLayout, WindowInsetsCompat windowInsetsCompat) {
            this.f44114b = windowInsetsCompat;
            MaterialShapeDrawable materialShapeDrawable = BottomSheetBehavior.from(frameLayout).f44089y0;
            ColorStateList fillColor = materialShapeDrawable != null ? materialShapeDrawable.getFillColor() : ViewCompat.getBackgroundTintList(frameLayout);
            if (fillColor != null) {
                this.f44113a = Boolean.valueOf(MaterialColors.isColorLight(fillColor.getDefaultColor()));
                return;
            }
            Integer backgroundColor = ViewUtils.getBackgroundColor(frameLayout);
            if (backgroundColor != null) {
                this.f44113a = Boolean.valueOf(MaterialColors.isColorLight(backgroundColor.intValue()));
            } else {
                this.f44113a = null;
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public final void a(@NonNull View view) {
            b(view);
        }

        public final void b(View view) {
            int top = view.getTop();
            WindowInsetsCompat windowInsetsCompat = this.f44114b;
            if (top < windowInsetsCompat.getSystemWindowInsetTop()) {
                Window window = this.f44115c;
                if (window != null) {
                    Boolean bool = this.f44113a;
                    EdgeToEdgeUtils.setLightStatusBar(window, bool == null ? this.f44116d : bool.booleanValue());
                }
                view.setPadding(view.getPaddingLeft(), windowInsetsCompat.getSystemWindowInsetTop() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
                return;
            }
            if (view.getTop() != 0) {
                Window window2 = this.f44115c;
                if (window2 != null) {
                    EdgeToEdgeUtils.setLightStatusBar(window2, this.f44116d);
                }
                view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
            }
        }

        public final void c(@Nullable Window window) {
            if (this.f44115c == window) {
                return;
            }
            this.f44115c = window;
            if (window != null) {
                this.f44116d = WindowCompat.getInsetsController(window, window.getDecorView()).isAppearanceLightStatusBars();
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public final void onSlide(@NonNull View view, float f6) {
            b(view);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public final void onStateChanged(@NonNull View view, int i10) {
            b(view);
        }
    }

    public BottomSheetDialog(@NonNull Context context) {
        this(context, 0);
        this.I0 = getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.enableEdgeToEdge}).getBoolean(0, false);
    }

    @Deprecated
    public static void setLightStatusBar(@NonNull View view, boolean z10) {
        int systemUiVisibility = view.getSystemUiVisibility();
        view.setSystemUiVisibility(z10 ? systemUiVisibility | 8192 : systemUiVisibility & (-8193));
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        BottomSheetBehavior<FrameLayout> behavior = getBehavior();
        if (!this.f44111y0 || behavior.getState() == 5) {
            super.cancel();
        } else {
            behavior.setState(5);
        }
    }

    public final void e() {
        if (this.v0 == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), R.layout.design_bottom_sheet_dialog, null);
            this.v0 = frameLayout;
            this.f44109w0 = (CoordinatorLayout) frameLayout.findViewById(R.id.coordinator);
            FrameLayout frameLayout2 = (FrameLayout) this.v0.findViewById(R.id.design_bottom_sheet);
            this.f44110x0 = frameLayout2;
            BottomSheetBehavior<FrameLayout> bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout2);
            this.f44108u0 = bottomSheetBehaviorFrom;
            bottomSheetBehaviorFrom.addBottomSheetCallback(this.K0);
            this.f44108u0.setHideable(this.E0);
            this.J0 = new MaterialBackOrchestrator(this.f44108u0, this.f44110x0);
        }
    }

    public final FrameLayout f(@Nullable View view, int i10, @Nullable ViewGroup.LayoutParams layoutParams) {
        e();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.v0.findViewById(R.id.coordinator);
        if (i10 != 0 && view == null) {
            view = getLayoutInflater().inflate(i10, (ViewGroup) coordinatorLayout, false);
        }
        if (this.I0) {
            ViewCompat.setOnApplyWindowInsetsListener(this.f44110x0, new com.google.android.material.bottomsheet.a(this));
        }
        this.f44110x0.removeAllViews();
        if (layoutParams == null) {
            this.f44110x0.addView(view);
        } else {
            this.f44110x0.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(R.id.touch_outside).setOnClickListener(new d(this));
        ViewCompat.setAccessibilityDelegate(this.f44110x0, new e(this));
        this.f44110x0.setOnTouchListener(new f());
        return this.v0;
    }

    @NonNull
    public BottomSheetBehavior<FrameLayout> getBehavior() {
        if (this.f44108u0 == null) {
            e();
        }
        return this.f44108u0;
    }

    public boolean getDismissWithAnimation() {
        return this.f44111y0;
    }

    public boolean getEdgeToEdgeEnabled() {
        return this.I0;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            boolean z10 = this.I0 && Color.alpha(window.getNavigationBarColor()) < 255;
            FrameLayout frameLayout = this.v0;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(!z10);
            }
            CoordinatorLayout coordinatorLayout = this.f44109w0;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(!z10);
            }
            WindowCompat.setDecorFitsSystemWindows(window, !z10);
            b bVar = this.H0;
            if (bVar != null) {
                bVar.c(window);
            }
        }
        MaterialBackOrchestrator materialBackOrchestrator = this.J0;
        if (materialBackOrchestrator == null) {
            return;
        }
        if (this.E0) {
            materialBackOrchestrator.startListeningForBackCallbacks();
        } else {
            materialBackOrchestrator.stopListeningForBackCallbacks();
        }
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void onCreate(Bundle bundle) {
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
        b bVar = this.H0;
        if (bVar != null) {
            bVar.c(null);
        }
        MaterialBackOrchestrator materialBackOrchestrator = this.J0;
        if (materialBackOrchestrator != null) {
            materialBackOrchestrator.stopListeningForBackCallbacks();
        }
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public void onStart() {
        super.onStart();
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f44108u0;
        if (bottomSheetBehavior == null || bottomSheetBehavior.getState() != 5) {
            return;
        }
        this.f44108u0.setState(4);
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z10) {
        MaterialBackOrchestrator materialBackOrchestrator;
        super.setCancelable(z10);
        if (this.E0 != z10) {
            this.E0 = z10;
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f44108u0;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.setHideable(z10);
            }
            if (getWindow() == null || (materialBackOrchestrator = this.J0) == null) {
                return;
            }
            if (this.E0) {
                materialBackOrchestrator.startListeningForBackCallbacks();
            } else {
                materialBackOrchestrator.stopListeningForBackCallbacks();
            }
        }
    }

    @Override // android.app.Dialog
    public void setCanceledOnTouchOutside(boolean z10) {
        super.setCanceledOnTouchOutside(z10);
        if (z10 && !this.E0) {
            this.E0 = true;
        }
        this.F0 = z10;
        this.G0 = true;
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void setContentView(@LayoutRes int i10) {
        super.setContentView(f(null, i10, null));
    }

    public void setDismissWithAnimation(boolean z10) {
        this.f44111y0 = z10;
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void setContentView(View view) {
        super.setContentView(f(view, 0, null));
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(f(view, 0, layoutParams));
    }

    public BottomSheetDialog(@NonNull Context context, boolean z10, DialogInterface.OnCancelListener onCancelListener) {
        super(context, z10, onCancelListener);
        this.E0 = true;
        this.F0 = true;
        this.K0 = new a();
        supportRequestWindowFeature(1);
        this.E0 = z10;
        this.I0 = getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.enableEdgeToEdge}).getBoolean(0, false);
    }

    public BottomSheetDialog(@NonNull Context context, @StyleRes int i10) {
        if (i10 == 0) {
            TypedValue typedValue = new TypedValue();
            if (context.getTheme().resolveAttribute(R.attr.bottomSheetDialogTheme, typedValue, true)) {
                i10 = typedValue.resourceId;
            } else {
                i10 = R.style.Theme_Design_Light_BottomSheetDialog;
            }
        }
        super(context, i10);
        this.E0 = true;
        this.F0 = true;
        this.K0 = new a();
        supportRequestWindowFeature(1);
        this.I0 = getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.enableEdgeToEdge}).getBoolean(0, false);
    }

    public class a extends BottomSheetBehavior.BottomSheetCallback {
        public a() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public final void onStateChanged(@NonNull View view, int i10) {
            if (i10 == 5) {
                BottomSheetDialog.this.cancel();
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public final void onSlide(@NonNull View view, float f6) {
        }
    }
}
