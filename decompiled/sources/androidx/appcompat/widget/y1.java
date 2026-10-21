package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewConfigurationCompat;
import com.bbva.androidtoolkit.utils.PluginUtils;
import com.bbva.nativesettings.common.Constants;

/* JADX INFO: compiled from: TooltipCompatHandler.java */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class y1 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {
    public static y1 E0;
    public static y1 F0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final View f1701p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final CharSequence f1702q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final int f1703r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final w1 f1704s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final x1 f1705t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f1706u0;
    public int v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public z1 f1707w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public boolean f1708x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public boolean f1709y0 = true;

    public y1(View view, CharSequence charSequence) {
        int i10 = 0;
        this.f1704s0 = new w1(this, i10);
        this.f1705t0 = new x1(this, i10);
        this.f1701p0 = view;
        this.f1702q0 = charSequence;
        this.f1703r0 = ViewConfigurationCompat.getScaledHoverSlop(ViewConfiguration.get(view.getContext()));
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(y1 y1Var) {
        y1 y1Var2 = E0;
        if (y1Var2 != null) {
            y1Var2.f1701p0.removeCallbacks(y1Var2.f1704s0);
        }
        E0 = y1Var;
        if (y1Var != null) {
            y1Var.f1701p0.postDelayed(y1Var.f1704s0, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        y1 y1Var = F0;
        View view = this.f1701p0;
        if (y1Var == this) {
            F0 = null;
            z1 z1Var = this.f1707w0;
            if (z1Var != null) {
                View view2 = z1Var.f1711b;
                if (view2.getParent() != null) {
                    ((WindowManager) z1Var.f1710a.getSystemService("window")).removeView(view2);
                }
                this.f1707w0 = null;
                this.f1709y0 = true;
                view.removeOnAttachStateChangeListener(this);
            }
        }
        if (E0 == this) {
            b(null);
        }
        view.removeCallbacks(this.f1705t0);
    }

    public final void c(boolean z10) {
        int height;
        int i10;
        int i11;
        long longPressTimeout;
        long j10;
        long j11;
        View view = this.f1701p0;
        if (view.isAttachedToWindow()) {
            b(null);
            y1 y1Var = F0;
            if (y1Var != null) {
                y1Var.a();
            }
            F0 = this;
            this.f1708x0 = z10;
            z1 z1Var = new z1(view.getContext());
            this.f1707w0 = z1Var;
            int width = this.f1706u0;
            int i12 = this.v0;
            boolean z11 = this.f1708x0;
            View view2 = z1Var.f1711b;
            ViewParent parent = view2.getParent();
            Context context = z1Var.f1710a;
            if (parent != null && view2.getParent() != null) {
                ((WindowManager) context.getSystemService("window")).removeView(view2);
            }
            z1Var.f1712c.setText(this.f1702q0);
            WindowManager.LayoutParams layoutParams = z1Var.f1713d;
            layoutParams.token = view.getApplicationWindowToken();
            int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
            if (view.getWidth() < dimensionPixelOffset) {
                width = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
                height = i12 + dimensionPixelOffset2;
                i10 = i12 - dimensionPixelOffset2;
            } else {
                height = view.getHeight();
                i10 = 0;
            }
            layoutParams.gravity = 49;
            int dimensionPixelOffset3 = context.getResources().getDimensionPixelOffset(z11 ? R.dimen.tooltip_y_offset_touch : R.dimen.tooltip_y_offset_non_touch);
            View rootView = view.getRootView();
            ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
            if (!(layoutParams2 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams2).type != 2) {
                for (Context context2 = view.getContext(); context2 instanceof ContextWrapper; context2 = ((ContextWrapper) context2).getBaseContext()) {
                    if (context2 instanceof Activity) {
                        rootView = ((Activity) context2).getWindow().getDecorView();
                        break;
                    }
                }
            }
            if (rootView != null) {
                Rect rect = z1Var.f1714e;
                rootView.getWindowVisibleDisplayFrame(rect);
                if (rect.left >= 0 || rect.top >= 0) {
                    i11 = 0;
                } else {
                    Resources resources = context.getResources();
                    int identifier = resources.getIdentifier("status_bar_height", PluginUtils.IDENTIFIER_DIMENSION, "android");
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    i11 = 0;
                    rect.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                int[] iArr = z1Var.f1716g;
                rootView.getLocationOnScreen(iArr);
                int[] iArr2 = z1Var.f1715f;
                view.getLocationOnScreen(iArr2);
                int i13 = iArr2[i11] - iArr[i11];
                iArr2[i11] = i13;
                iArr2[1] = iArr2[1] - iArr[1];
                layoutParams.x = (i13 + width) - (rootView.getWidth() / 2);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i11, i11);
                view2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredHeight = view2.getMeasuredHeight();
                int i14 = iArr2[1];
                int i15 = ((i10 + i14) - dimensionPixelOffset3) - measuredHeight;
                int i16 = i14 + height + dimensionPixelOffset3;
                if (z11) {
                    if (i15 >= 0) {
                        layoutParams.y = i15;
                    } else {
                        layoutParams.y = i16;
                    }
                } else if (measuredHeight + i16 <= rect.height()) {
                    layoutParams.y = i16;
                } else {
                    layoutParams.y = i15;
                }
            }
            ((WindowManager) context.getSystemService("window")).addView(view2, layoutParams);
            view.addOnAttachStateChangeListener(this);
            if (this.f1708x0) {
                j11 = 2500;
            } else {
                if ((ViewCompat.getWindowSystemUiVisibility(view) & 1) == 1) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j10 = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j10 = 15000;
                }
                j11 = j10 - longPressTimeout;
            }
            x1 x1Var = this.f1705t0;
            view.removeCallbacks(x1Var);
            view.postDelayed(x1Var, j11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0066  */
    @Override // android.view.View.OnHoverListener
    public final boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f1707w0 != null && this.f1708x0) {
            return false;
        }
        View view2 = this.f1701p0;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view2.getContext().getSystemService(Constants.ACCESSIBILITY);
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                this.f1709y0 = true;
                a();
            }
        } else if (view2.isEnabled() && this.f1707w0 == null) {
            int x4 = (int) motionEvent.getX();
            int y7 = (int) motionEvent.getY();
            if (this.f1709y0) {
                this.f1706u0 = x4;
                this.v0 = y7;
                this.f1709y0 = false;
                b(this);
            } else {
                int iAbs = Math.abs(x4 - this.f1706u0);
                int i10 = this.f1703r0;
                if (iAbs > i10 || Math.abs(y7 - this.v0) > i10) {
                    this.f1706u0 = x4;
                    this.v0 = y7;
                    this.f1709y0 = false;
                    b(this);
                }
            }
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.f1706u0 = view.getWidth() / 2;
        this.v0 = view.getHeight() / 2;
        c(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        a();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
