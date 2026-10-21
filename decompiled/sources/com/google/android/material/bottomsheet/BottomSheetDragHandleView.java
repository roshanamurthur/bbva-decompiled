package com.google.android.material.bottomsheet;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.bbva.nativesettings.common.Constants;
import com.google.android.material.R;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import y0.g;

/* JADX INFO: loaded from: classes10.dex */
public class BottomSheetDragHandleView extends AppCompatImageView implements AccessibilityManager.AccessibilityStateChangeListener {
    public static final int G0 = R.style.Widget_Material3_BottomSheet_DragHandle;
    public final String E0;
    public final a F0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @Nullable
    public final AccessibilityManager f44118s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @Nullable
    public BottomSheetBehavior<?> f44119t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public boolean f44120u0;
    public boolean v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public boolean f44121w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final String f44122x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final String f44123y0;

    public class b extends AccessibilityDelegateCompat {
        public b() {
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final void onPopulateAccessibilityEvent(View view, @NonNull AccessibilityEvent accessibilityEvent) {
            super.onPopulateAccessibilityEvent(view, accessibilityEvent);
            if (accessibilityEvent.getEventType() == 1) {
                int i10 = BottomSheetDragHandleView.G0;
                BottomSheetDragHandleView.this.a();
            }
        }
    }

    public BottomSheetDragHandleView(@NonNull Context context) {
        this(context, null);
    }

    private void setBottomSheetBehavior(@Nullable BottomSheetBehavior<?> bottomSheetBehavior) {
        BottomSheetBehavior<?> bottomSheetBehavior2 = this.f44119t0;
        a aVar = this.F0;
        if (bottomSheetBehavior2 != null) {
            bottomSheetBehavior2.removeBottomSheetCallback(aVar);
            this.f44119t0.k(null);
        }
        this.f44119t0 = bottomSheetBehavior;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.k(this);
            b(this.f44119t0.getState());
            this.f44119t0.addBottomSheetCallback(aVar);
        }
        c();
    }

    public final boolean a() {
        boolean z10 = false;
        if (!this.v0) {
            return false;
        }
        AccessibilityManager accessibilityManager = this.f44118s0;
        if (accessibilityManager != null) {
            AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(16384);
            accessibilityEventObtain.getText().add(this.E0);
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain);
        }
        if (!this.f44119t0.isFitToContents() && !this.f44119t0.shouldSkipHalfExpandedStateWhenDragging()) {
            z10 = true;
        }
        int state = this.f44119t0.getState();
        int i10 = 6;
        int i11 = 3;
        if (state == 4) {
            if (!z10) {
                i10 = i11;
            }
        } else if (state != 3) {
            if (!this.f44121w0) {
                i11 = 4;
            }
            i10 = i11;
        } else if (!z10) {
            i10 = 4;
        }
        this.f44119t0.setState(i10);
        return true;
    }

    public final void b(int i10) {
        if (i10 == 4) {
            this.f44121w0 = true;
        } else if (i10 == 3) {
            this.f44121w0 = false;
        }
        ViewCompat.replaceAccessibilityAction(this, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLICK, this.f44121w0 ? this.f44122x0 : this.f44123y0, new g(this));
    }

    public final void c() {
        this.v0 = this.f44120u0 && this.f44119t0 != null;
        ViewCompat.setImportantForAccessibility(this, this.f44119t0 == null ? 2 : 1);
        setClickable(this.v0);
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public void onAccessibilityStateChanged(boolean z10) {
        this.f44120u0 = z10;
        c();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        BottomSheetBehavior<?> bottomSheetBehavior;
        super.onAttachedToWindow();
        View view = this;
        while (true) {
            Object parent = view.getParent();
            bottomSheetBehavior = null;
            view = parent instanceof View ? (View) parent : null;
            if (view == null) {
                break;
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.LayoutParams) {
                CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior();
                if (behavior instanceof BottomSheetBehavior) {
                    bottomSheetBehavior = (BottomSheetBehavior) behavior;
                    break;
                }
            }
        }
        setBottomSheetBehavior(bottomSheetBehavior);
        AccessibilityManager accessibilityManager = this.f44118s0;
        if (accessibilityManager != null) {
            accessibilityManager.addAccessibilityStateChangeListener(this);
            onAccessibilityStateChanged(accessibilityManager.isEnabled());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        AccessibilityManager accessibilityManager = this.f44118s0;
        if (accessibilityManager != null) {
            accessibilityManager.removeAccessibilityStateChangeListener(this);
        }
        setBottomSheetBehavior(null);
        super.onDetachedFromWindow();
    }

    public BottomSheetDragHandleView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.bottomSheetDragHandleStyle);
    }

    public BottomSheetDragHandleView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(MaterialThemeOverlay.wrap(context, attributeSet, i10, G0), attributeSet, i10);
        this.f44122x0 = getResources().getString(R.string.bottomsheet_action_expand);
        this.f44123y0 = getResources().getString(R.string.bottomsheet_action_collapse);
        this.E0 = getResources().getString(R.string.bottomsheet_drag_handle_clicked);
        this.F0 = new a();
        this.f44118s0 = (AccessibilityManager) getContext().getSystemService(Constants.ACCESSIBILITY);
        c();
        ViewCompat.setAccessibilityDelegate(this, new b());
    }

    public class a extends BottomSheetBehavior.BottomSheetCallback {
        public a() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public final void onStateChanged(@NonNull View view, int i10) {
            int i11 = BottomSheetDragHandleView.G0;
            BottomSheetDragHandleView.this.b(i10);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public final void onSlide(@NonNull View view, float f6) {
        }
    }
}
