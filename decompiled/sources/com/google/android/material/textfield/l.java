package com.google.android.material.textfield;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.r1;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityManagerCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.bbva.nativesettings.common.Constants;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.motion.MotionUtils;

/* JADX INFO: compiled from: DropdownMenuEndIconDelegate.java */
/* JADX INFO: loaded from: classes10.dex */
public final class l extends n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f45630e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f45631f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final TimeInterpolator f45632g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public AutoCompleteTextView f45633h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final x5.a f45634i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final h f45635j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final y0.h f45636k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f45637l;
    public boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f45638n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f45639o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public AccessibilityManager f45640p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ValueAnimator f45641q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ValueAnimator f45642r;

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.material.textfield.h] */
    public l(@NonNull m mVar) {
        super(mVar);
        this.f45634i = new x5.a(this, 2);
        this.f45635j = new View.OnFocusChangeListener() { // from class: com.google.android.material.textfield.h
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                l lVar = this.f45626a;
                lVar.f45637l = z10;
                lVar.q();
                if (z10) {
                    return;
                }
                lVar.t(false);
                lVar.m = false;
            }
        };
        this.f45636k = new y0.h(this);
        this.f45639o = Long.MAX_VALUE;
        Context context = mVar.getContext();
        int i10 = R.attr.motionDurationShort3;
        this.f45631f = MotionUtils.resolveThemeDuration(context, i10, 67);
        this.f45630e = MotionUtils.resolveThemeDuration(mVar.getContext(), i10, 50);
        this.f45632g = MotionUtils.resolveThemeInterpolator(mVar.getContext(), R.attr.motionEasingLinearInterpolator, AnimationUtils.LINEAR_INTERPOLATOR);
    }

    @Override // com.google.android.material.textfield.n
    public final void a() {
        if (this.f45640p.isTouchExplorationEnabled() && this.f45633h.getInputType() != 0 && !this.f45662d.hasFocus()) {
            this.f45633h.dismissDropDown();
        }
        this.f45633h.post(new r1(this, 4));
    }

    @Override // com.google.android.material.textfield.n
    public final int c() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // com.google.android.material.textfield.n
    public final int d() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    @Override // com.google.android.material.textfield.n
    public final View.OnFocusChangeListener e() {
        return this.f45635j;
    }

    @Override // com.google.android.material.textfield.n
    public final View.OnClickListener f() {
        return this.f45634i;
    }

    @Override // com.google.android.material.textfield.n
    public final AccessibilityManagerCompat.TouchExplorationStateChangeListener h() {
        return this.f45636k;
    }

    @Override // com.google.android.material.textfield.n
    public final boolean i(int i10) {
        return i10 != 0;
    }

    @Override // com.google.android.material.textfield.n
    public final boolean j() {
        return this.f45637l;
    }

    @Override // com.google.android.material.textfield.n
    public final boolean l() {
        return this.f45638n;
    }

    @Override // com.google.android.material.textfield.n
    public final void m(@Nullable EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.f45633h = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.material.textfield.i
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                l lVar = this.f45627p0;
                lVar.getClass();
                if (motionEvent.getAction() == 1) {
                    long jCurrentTimeMillis = System.currentTimeMillis() - lVar.f45639o;
                    if (jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300) {
                        lVar.m = false;
                    }
                    lVar.u();
                    lVar.m = true;
                    lVar.f45639o = System.currentTimeMillis();
                }
                return false;
            }
        });
        this.f45633h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: com.google.android.material.textfield.j
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                l lVar = this.f45628a;
                lVar.m = true;
                lVar.f45639o = System.currentTimeMillis();
                lVar.t(false);
            }
        });
        this.f45633h.setThreshold(0);
        TextInputLayout textInputLayout = this.f45659a;
        textInputLayout.setErrorIconDrawable((Drawable) null);
        if (editText.getInputType() == 0 && this.f45640p.isTouchExplorationEnabled()) {
            ViewCompat.setImportantForAccessibility(this.f45662d, 2);
        }
        textInputLayout.setEndIconVisible(true);
    }

    @Override // com.google.android.material.textfield.n
    public final void n(@NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        if (this.f45633h.getInputType() == 0) {
            accessibilityNodeInfoCompat.setClassName(Spinner.class.getName());
        }
        if (accessibilityNodeInfoCompat.isShowingHintText()) {
            accessibilityNodeInfoCompat.setHintText(null);
        }
    }

    @Override // com.google.android.material.textfield.n
    @SuppressLint({"WrongConstant"})
    public final void o(@NonNull AccessibilityEvent accessibilityEvent) {
        if (this.f45640p.isEnabled() && this.f45633h.getInputType() == 0) {
            boolean z10 = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.f45638n && !this.f45633h.isPopupShowing();
            if (accessibilityEvent.getEventType() == 1 || z10) {
                u();
                this.m = true;
                this.f45639o = System.currentTimeMillis();
            }
        }
    }

    @Override // com.google.android.material.textfield.n
    public final void r() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f45632g;
        valueAnimatorOfFloat.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat.setDuration(this.f45631f);
        int i10 = 1;
        valueAnimatorOfFloat.addUpdateListener(new com.google.android.material.search.q(this, i10));
        this.f45642r = valueAnimatorOfFloat;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat2.setDuration(this.f45630e);
        valueAnimatorOfFloat2.addUpdateListener(new com.google.android.material.search.q(this, i10));
        this.f45641q = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.addListener(new k(this));
        this.f45640p = (AccessibilityManager) this.f45661c.getSystemService(Constants.ACCESSIBILITY);
    }

    @Override // com.google.android.material.textfield.n
    @SuppressLint({"ClickableViewAccessibility"})
    public final void s() {
        AutoCompleteTextView autoCompleteTextView = this.f45633h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.f45633h.setOnDismissListener(null);
        }
    }

    public final void t(boolean z10) {
        if (this.f45638n != z10) {
            this.f45638n = z10;
            this.f45642r.cancel();
            this.f45641q.start();
        }
    }

    public final void u() {
        if (this.f45633h == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f45639o;
        if (jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300) {
            this.m = false;
        }
        if (this.m) {
            this.m = false;
            return;
        }
        t(!this.f45638n);
        if (!this.f45638n) {
            this.f45633h.dismissDropDown();
        } else {
            this.f45633h.requestFocus();
            this.f45633h.showDropDown();
        }
    }
}
