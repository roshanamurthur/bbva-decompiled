package com.google.android.material.textfield;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.TintTypedArray;
import androidx.appcompat.widget.g0;
import androidx.core.view.GravityCompat;
import androidx.core.view.MarginLayoutParamsCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityManagerCompat;
import androidx.core.widget.TextViewCompat;
import com.bbva.nativesettings.common.Constants;
import com.google.android.material.R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.TextWatcherAdapter;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: EndCompoundLayout.java */
/* JADX INFO: loaded from: classes10.dex */
@SuppressLint({"ViewConstructor"})
public final class m extends LinearLayout {
    public ColorStateList E0;
    public PorterDuff.Mode F0;
    public int G0;

    @NonNull
    public ImageView.ScaleType H0;
    public View.OnLongClickListener I0;

    @Nullable
    public CharSequence J0;

    @NonNull
    public final AppCompatTextView K0;
    public boolean L0;
    public EditText M0;

    @Nullable
    public final AccessibilityManager N0;

    @Nullable
    public AccessibilityManagerCompat.TouchExplorationStateChangeListener O0;
    public final a P0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final TextInputLayout f45643p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NonNull
    public final FrameLayout f45644q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NonNull
    public final CheckableImageButton f45645r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public ColorStateList f45646s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public PorterDuff.Mode f45647t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public View.OnLongClickListener f45648u0;

    @NonNull
    public final CheckableImageButton v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final d f45649w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public int f45650x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final LinkedHashSet<TextInputLayout.OnEndIconChangedListener> f45651y0;

    /* JADX INFO: compiled from: EndCompoundLayout.java */
    public class a extends TextWatcherAdapter {
        public a() {
        }

        @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            m.this.b().a();
        }

        @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            m.this.b().b();
        }
    }

    /* JADX INFO: compiled from: EndCompoundLayout.java */
    public class b implements TextInputLayout.OnEditTextAttachedListener {
        public b() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.OnEditTextAttachedListener
        public final void onEditTextAttached(@NonNull TextInputLayout textInputLayout) {
            m mVar = m.this;
            if (mVar.M0 == textInputLayout.getEditText()) {
                return;
            }
            EditText editText = mVar.M0;
            a aVar = mVar.P0;
            if (editText != null) {
                editText.removeTextChangedListener(aVar);
                if (mVar.M0.getOnFocusChangeListener() == mVar.b().e()) {
                    mVar.M0.setOnFocusChangeListener(null);
                }
            }
            EditText editText2 = textInputLayout.getEditText();
            mVar.M0 = editText2;
            if (editText2 != null) {
                editText2.addTextChangedListener(aVar);
            }
            mVar.b().m(mVar.M0);
            mVar.j(mVar.b());
        }
    }

    /* JADX INFO: compiled from: EndCompoundLayout.java */
    public class c implements View.OnAttachStateChangeListener {
        public c() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            AccessibilityManager accessibilityManager;
            m mVar = m.this;
            if (mVar.O0 == null || (accessibilityManager = mVar.N0) == null || !ViewCompat.isAttachedToWindow(mVar)) {
                return;
            }
            AccessibilityManagerCompat.addTouchExplorationStateChangeListener(accessibilityManager, mVar.O0);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            AccessibilityManager accessibilityManager;
            m mVar = m.this;
            AccessibilityManagerCompat.TouchExplorationStateChangeListener touchExplorationStateChangeListener = mVar.O0;
            if (touchExplorationStateChangeListener == null || (accessibilityManager = mVar.N0) == null) {
                return;
            }
            AccessibilityManagerCompat.removeTouchExplorationStateChangeListener(accessibilityManager, touchExplorationStateChangeListener);
        }
    }

    /* JADX INFO: compiled from: EndCompoundLayout.java */
    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SparseArray<n> f45655a = new SparseArray<>();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final m f45656b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f45657c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f45658d;

        public d(m mVar, TintTypedArray tintTypedArray) {
            this.f45656b = mVar;
            this.f45657c = tintTypedArray.getResourceId(R.styleable.TextInputLayout_endIconDrawable, 0);
            this.f45658d = tintTypedArray.getResourceId(R.styleable.TextInputLayout_passwordToggleDrawable, 0);
        }
    }

    public m(TextInputLayout textInputLayout, TintTypedArray tintTypedArray) {
        CharSequence text;
        super(textInputLayout.getContext());
        this.f45650x0 = 0;
        this.f45651y0 = new LinkedHashSet<>();
        this.P0 = new a();
        b bVar = new b();
        this.N0 = (AccessibilityManager) getContext().getSystemService(Constants.ACCESSIBILITY);
        this.f45643p0 = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, GravityCompat.END));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f45644q0 = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        CheckableImageButton checkableImageButtonA = a(this, layoutInflaterFrom, R.id.text_input_error_icon);
        this.f45645r0 = checkableImageButtonA;
        CheckableImageButton checkableImageButtonA2 = a(frameLayout, layoutInflaterFrom, R.id.text_input_end_icon);
        this.v0 = checkableImageButtonA2;
        this.f45649w0 = new d(this, tintTypedArray);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.K0 = appCompatTextView;
        int i10 = R.styleable.TextInputLayout_errorIconTint;
        if (tintTypedArray.hasValue(i10)) {
            this.f45646s0 = MaterialResources.getColorStateList(getContext(), tintTypedArray, i10);
        }
        int i11 = R.styleable.TextInputLayout_errorIconTintMode;
        if (tintTypedArray.hasValue(i11)) {
            this.f45647t0 = ViewUtils.parseTintMode(tintTypedArray.getInt(i11, -1), null);
        }
        int i12 = R.styleable.TextInputLayout_errorIconDrawable;
        if (tintTypedArray.hasValue(i12)) {
            i(tintTypedArray.getDrawable(i12));
        }
        checkableImageButtonA.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        ViewCompat.setImportantForAccessibility(checkableImageButtonA, 2);
        checkableImageButtonA.setClickable(false);
        checkableImageButtonA.setPressable(false);
        checkableImageButtonA.setFocusable(false);
        int i13 = R.styleable.TextInputLayout_passwordToggleEnabled;
        if (!tintTypedArray.hasValue(i13)) {
            int i14 = R.styleable.TextInputLayout_endIconTint;
            if (tintTypedArray.hasValue(i14)) {
                this.E0 = MaterialResources.getColorStateList(getContext(), tintTypedArray, i14);
            }
            int i15 = R.styleable.TextInputLayout_endIconTintMode;
            if (tintTypedArray.hasValue(i15)) {
                this.F0 = ViewUtils.parseTintMode(tintTypedArray.getInt(i15, -1), null);
            }
        }
        int i16 = R.styleable.TextInputLayout_endIconMode;
        if (tintTypedArray.hasValue(i16)) {
            g(tintTypedArray.getInt(i16, 0));
            int i17 = R.styleable.TextInputLayout_endIconContentDescription;
            if (tintTypedArray.hasValue(i17) && checkableImageButtonA2.getContentDescription() != (text = tintTypedArray.getText(i17))) {
                checkableImageButtonA2.setContentDescription(text);
            }
            checkableImageButtonA2.setCheckable(tintTypedArray.getBoolean(R.styleable.TextInputLayout_endIconCheckable, true));
        } else if (tintTypedArray.hasValue(i13)) {
            int i18 = R.styleable.TextInputLayout_passwordToggleTint;
            if (tintTypedArray.hasValue(i18)) {
                this.E0 = MaterialResources.getColorStateList(getContext(), tintTypedArray, i18);
            }
            int i19 = R.styleable.TextInputLayout_passwordToggleTintMode;
            if (tintTypedArray.hasValue(i19)) {
                this.F0 = ViewUtils.parseTintMode(tintTypedArray.getInt(i19, -1), null);
            }
            g(tintTypedArray.getBoolean(i13, false) ? 1 : 0);
            CharSequence text2 = tintTypedArray.getText(R.styleable.TextInputLayout_passwordToggleContentDescription);
            if (checkableImageButtonA2.getContentDescription() != text2) {
                checkableImageButtonA2.setContentDescription(text2);
            }
        }
        int dimensionPixelSize = tintTypedArray.getDimensionPixelSize(R.styleable.TextInputLayout_endIconMinSize, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.G0) {
            this.G0 = dimensionPixelSize;
            checkableImageButtonA2.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonA2.setMinimumHeight(dimensionPixelSize);
            checkableImageButtonA.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonA.setMinimumHeight(dimensionPixelSize);
        }
        int i20 = R.styleable.TextInputLayout_endIconScaleType;
        if (tintTypedArray.hasValue(i20)) {
            ImageView.ScaleType scaleTypeB = o.b(tintTypedArray.getInt(i20, -1));
            this.H0 = scaleTypeB;
            checkableImageButtonA2.setScaleType(scaleTypeB);
            checkableImageButtonA.setScaleType(scaleTypeB);
        }
        appCompatTextView.setVisibility(8);
        appCompatTextView.setId(R.id.textinput_suffix_text);
        appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        ViewCompat.setAccessibilityLiveRegion(appCompatTextView, 1);
        TextViewCompat.setTextAppearance(appCompatTextView, tintTypedArray.getResourceId(R.styleable.TextInputLayout_suffixTextAppearance, 0));
        int i21 = R.styleable.TextInputLayout_suffixTextColor;
        if (tintTypedArray.hasValue(i21)) {
            appCompatTextView.setTextColor(tintTypedArray.getColorStateList(i21));
        }
        CharSequence text3 = tintTypedArray.getText(R.styleable.TextInputLayout_suffixText);
        this.J0 = TextUtils.isEmpty(text3) ? null : text3;
        appCompatTextView.setText(text3);
        n();
        frameLayout.addView(checkableImageButtonA2);
        addView(appCompatTextView);
        addView(frameLayout);
        addView(checkableImageButtonA);
        textInputLayout.addOnEditTextAttachedListener(bVar);
        addOnAttachStateChangeListener(new c());
    }

    public final CheckableImageButton a(ViewGroup viewGroup, LayoutInflater layoutInflater, @IdRes int i10) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i10);
        if (MaterialResources.isFontScaleAtLeast1_3(getContext())) {
            MarginLayoutParamsCompat.setMarginStart((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), 0);
        }
        return checkableImageButton;
    }

    public final n b() {
        n fVar;
        int i10 = this.f45650x0;
        d dVar = this.f45649w0;
        SparseArray<n> sparseArray = dVar.f45655a;
        n sVar = sparseArray.get(i10);
        if (sVar == null) {
            m mVar = dVar.f45656b;
            if (i10 == -1) {
                fVar = new f(mVar);
            } else if (i10 != 0) {
                if (i10 == 1) {
                    sVar = new s(mVar, dVar.f45658d);
                } else if (i10 == 2) {
                    fVar = new e(mVar);
                } else {
                    if (i10 != 3) {
                        throw new IllegalArgumentException(g0.c("Invalid end icon mode: ", i10));
                    }
                    fVar = new l(mVar);
                }
                sparseArray.append(i10, sVar);
            } else {
                fVar = new r(mVar);
            }
            sVar = fVar;
            sparseArray.append(i10, sVar);
        }
        return sVar;
    }

    public final int c() {
        int marginStart;
        if (d() || e()) {
            CheckableImageButton checkableImageButton = this.v0;
            marginStart = MarginLayoutParamsCompat.getMarginStart((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()) + checkableImageButton.getMeasuredWidth();
        } else {
            marginStart = 0;
        }
        return ViewCompat.getPaddingEnd(this.K0) + ViewCompat.getPaddingEnd(this) + marginStart;
    }

    public final boolean d() {
        return this.f45644q0.getVisibility() == 0 && this.v0.getVisibility() == 0;
    }

    public final boolean e() {
        return this.f45645r0.getVisibility() == 0;
    }

    public final void f(boolean z10) {
        boolean z11;
        boolean zIsActivated;
        boolean zIsChecked;
        n nVarB = b();
        boolean zK = nVarB.k();
        CheckableImageButton checkableImageButton = this.v0;
        boolean z12 = true;
        if (!zK || (zIsChecked = checkableImageButton.isChecked()) == nVarB.l()) {
            z11 = false;
        } else {
            checkableImageButton.setChecked(!zIsChecked);
            z11 = true;
        }
        if (!(nVarB instanceof l) || (zIsActivated = checkableImageButton.isActivated()) == nVarB.j()) {
            z12 = z11;
        } else {
            checkableImageButton.setActivated(!zIsActivated);
        }
        if (z10 || z12) {
            o.c(this.f45643p0, checkableImageButton, this.E0);
        }
    }

    public final void g(int i10) {
        TextInputLayout textInputLayout;
        if (this.f45650x0 == i10) {
            return;
        }
        n nVarB = b();
        AccessibilityManagerCompat.TouchExplorationStateChangeListener touchExplorationStateChangeListener = this.O0;
        AccessibilityManager accessibilityManager = this.N0;
        if (touchExplorationStateChangeListener != null && accessibilityManager != null) {
            AccessibilityManagerCompat.removeTouchExplorationStateChangeListener(accessibilityManager, touchExplorationStateChangeListener);
        }
        this.O0 = null;
        nVarB.s();
        int i11 = this.f45650x0;
        this.f45650x0 = i10;
        Iterator<TextInputLayout.OnEndIconChangedListener> it = this.f45651y0.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            textInputLayout = this.f45643p0;
            if (!zHasNext) {
                break;
            } else {
                it.next().onEndIconChanged(textInputLayout, i11);
            }
        }
        h(i10 != 0);
        n nVarB2 = b();
        int iD = this.f45649w0.f45657c;
        if (iD == 0) {
            iD = nVarB2.d();
        }
        Drawable drawable = iD != 0 ? AppCompatResources.getDrawable(getContext(), iD) : null;
        CheckableImageButton checkableImageButton = this.v0;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            o.a(textInputLayout, checkableImageButton, this.E0, this.F0);
            o.c(textInputLayout, checkableImageButton, this.E0);
        }
        int iC = nVarB2.c();
        CharSequence text = iC != 0 ? getResources().getText(iC) : null;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
        checkableImageButton.setCheckable(nVarB2.k());
        if (!nVarB2.i(textInputLayout.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i10);
        }
        nVarB2.r();
        AccessibilityManagerCompat.TouchExplorationStateChangeListener touchExplorationStateChangeListenerH = nVarB2.h();
        this.O0 = touchExplorationStateChangeListenerH;
        if (touchExplorationStateChangeListenerH != null && accessibilityManager != null && ViewCompat.isAttachedToWindow(this)) {
            AccessibilityManagerCompat.addTouchExplorationStateChangeListener(accessibilityManager, this.O0);
        }
        View.OnClickListener onClickListenerF = nVarB2.f();
        View.OnLongClickListener onLongClickListener = this.I0;
        checkableImageButton.setOnClickListener(onClickListenerF);
        o.d(checkableImageButton, onLongClickListener);
        EditText editText = this.M0;
        if (editText != null) {
            nVarB2.m(editText);
            j(nVarB2);
        }
        o.a(textInputLayout, checkableImageButton, this.E0, this.F0);
        f(true);
    }

    public final void h(boolean z10) {
        if (d() != z10) {
            this.v0.setVisibility(z10 ? 0 : 8);
            k();
            m();
            this.f45643p0.q();
        }
    }

    public final void i(@Nullable Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f45645r0;
        checkableImageButton.setImageDrawable(drawable);
        l();
        o.a(this.f45643p0, checkableImageButton, this.f45646s0, this.f45647t0);
    }

    public final void j(n nVar) {
        if (this.M0 == null) {
            return;
        }
        if (nVar.e() != null) {
            this.M0.setOnFocusChangeListener(nVar.e());
        }
        if (nVar.g() != null) {
            this.v0.setOnFocusChangeListener(nVar.g());
        }
    }

    public final void k() {
        this.f45644q0.setVisibility((this.v0.getVisibility() != 0 || e()) ? 8 : 0);
        setVisibility((d() || e() || ((this.J0 == null || this.L0) ? '\b' : (char) 0) == 0) ? 0 : 8);
    }

    public final void l() {
        CheckableImageButton checkableImageButton = this.f45645r0;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.f45643p0;
        checkableImageButton.setVisibility((drawable != null && textInputLayout.isErrorEnabled() && textInputLayout.m()) ? 0 : 8);
        k();
        m();
        if (this.f45650x0 != 0) {
            return;
        }
        textInputLayout.q();
    }

    public final void m() {
        TextInputLayout textInputLayout = this.f45643p0;
        if (textInputLayout.f45591s0 == null) {
            return;
        }
        ViewCompat.setPaddingRelative(this.K0, getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), textInputLayout.f45591s0.getPaddingTop(), (d() || e()) ? 0 : ViewCompat.getPaddingEnd(textInputLayout.f45591s0), textInputLayout.f45591s0.getPaddingBottom());
    }

    public final void n() {
        AppCompatTextView appCompatTextView = this.K0;
        int visibility = appCompatTextView.getVisibility();
        int i10 = (this.J0 == null || this.L0) ? 8 : 0;
        if (visibility != i10) {
            b().p(i10 == 0);
        }
        k();
        appCompatTextView.setVisibility(i10);
        this.f45643p0.q();
    }
}
