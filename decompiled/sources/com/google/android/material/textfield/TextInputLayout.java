package com.google.android.material.textfield;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatDrawableManager;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.DrawableUtils;
import androidx.appcompat.widget.TintTypedArray;
import androidx.camera.core.h0;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.text.BidiFormatter;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.MarginLayoutParamsCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.widget.TextViewCompat;
import androidx.customview.view.AbsSavedState;
import androidx.transition.Fade;
import androidx.transition.TransitionManager;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.CollapsingTextHelper;
import com.google.android.material.internal.DescendantOffsetUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.CornerSize;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes10.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {
    public static final int BOX_BACKGROUND_FILLED = 1;
    public static final int BOX_BACKGROUND_NONE = 0;
    public static final int BOX_BACKGROUND_OUTLINE = 2;
    public static final int END_ICON_CLEAR_TEXT = 2;
    public static final int END_ICON_CUSTOM = -1;
    public static final int END_ICON_DROPDOWN_MENU = 3;
    public static final int END_ICON_NONE = 0;
    public static final int END_ICON_PASSWORD_TOGGLE = 1;
    public static final int T1 = R.style.Widget_Design_TextInputLayout;
    public static final int[][] U1 = {new int[]{android.R.attr.state_pressed}, new int[0]};
    public ColorStateList A1;

    @ColorInt
    public int B1;

    @ColorInt
    public int C1;

    @ColorInt
    public int D1;
    public boolean E0;
    public ColorStateList E1;
    public int F0;

    @ColorInt
    public int F1;
    public boolean G0;

    @ColorInt
    public int G1;

    @NonNull
    public LengthCounter H0;

    @ColorInt
    public int H1;

    @Nullable
    public AppCompatTextView I0;

    @ColorInt
    public int I1;
    public int J0;

    @ColorInt
    public int J1;
    public int K0;
    public int K1;
    public CharSequence L0;
    public boolean L1;
    public boolean M0;
    public final CollapsingTextHelper M1;
    public AppCompatTextView N0;
    public boolean N1;

    @Nullable
    public ColorStateList O0;
    public boolean O1;
    public int P0;
    public ValueAnimator P1;

    @Nullable
    public Fade Q0;
    public boolean Q1;

    @Nullable
    public Fade R0;
    public boolean R1;

    @Nullable
    public ColorStateList S0;
    public boolean S1;

    @Nullable
    public ColorStateList T0;

    @Nullable
    public ColorStateList U0;

    @Nullable
    public ColorStateList V0;
    public boolean W0;
    public CharSequence X0;
    public boolean Y0;

    @Nullable
    public MaterialShapeDrawable Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public MaterialShapeDrawable f45571a1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public StateListDrawable f45572b1;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public boolean f45573c1;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    @Nullable
    public MaterialShapeDrawable f45574d1;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    @Nullable
    public MaterialShapeDrawable f45575e1;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    @NonNull
    public ShapeAppearanceModel f45576f1;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public boolean f45577g1;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public final int f45578h1;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public int f45579i1;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public int f45580j1;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public int f45581k1;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public int f45582l1;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public int f45583m1;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    @ColorInt
    public int f45584n1;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    @ColorInt
    public int f45585o1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NonNull
    public final FrameLayout f45586p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public final Rect f45587p1;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NonNull
    public final t f45588q0;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public final Rect f45589q1;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NonNull
    public final m f45590r0;
    public final RectF r1;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public EditText f45591s0;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public Typeface f45592s1;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public CharSequence f45593t0;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    @Nullable
    public ColorDrawable f45594t1;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f45595u0;

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    public int f45596u1;
    public int v0;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    public final LinkedHashSet<OnEditTextAttachedListener> f45597v1;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public int f45598w0;

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    @Nullable
    public ColorDrawable f45599w1;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public int f45600x0;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public int f45601x1;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final p f45602y0;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    public Drawable f45603y1;

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    public ColorStateList f45604z1;

    public static class AccessibilityDelegate extends AccessibilityDelegateCompat {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextInputLayout f45605a;

        public AccessibilityDelegate(@NonNull TextInputLayout textInputLayout) {
            this.f45605a = textInputLayout;
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(@NonNull View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            TextInputLayout textInputLayout = this.f45605a;
            EditText editText = textInputLayout.getEditText();
            CharSequence text = editText != null ? editText.getText() : null;
            CharSequence hint = textInputLayout.getHint();
            CharSequence error = textInputLayout.getError();
            CharSequence placeholderText = textInputLayout.getPlaceholderText();
            int counterMaxLength = textInputLayout.getCounterMaxLength();
            CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
            boolean zIsEmpty = TextUtils.isEmpty(text);
            boolean z10 = !zIsEmpty;
            boolean z11 = true;
            boolean z12 = !TextUtils.isEmpty(hint);
            boolean z13 = !textInputLayout.L1;
            boolean z14 = !TextUtils.isEmpty(error);
            if (!z14 && TextUtils.isEmpty(counterOverflowDescription)) {
                z11 = false;
            }
            String string = z12 ? hint.toString() : "";
            t tVar = textInputLayout.f45588q0;
            View view2 = tVar.f45698q0;
            if (view2.getVisibility() == 0) {
                accessibilityNodeInfoCompat.setLabelFor(view2);
                accessibilityNodeInfoCompat.setTraversalAfter(view2);
            } else {
                accessibilityNodeInfoCompat.setTraversalAfter(tVar.f45700s0);
            }
            if (z10) {
                accessibilityNodeInfoCompat.setText(text);
            } else if (!TextUtils.isEmpty(string)) {
                accessibilityNodeInfoCompat.setText(string);
                if (z13 && placeholderText != null) {
                    accessibilityNodeInfoCompat.setText(string + ", " + ((Object) placeholderText));
                }
            } else if (placeholderText != null) {
                accessibilityNodeInfoCompat.setText(placeholderText);
            }
            if (!TextUtils.isEmpty(string)) {
                if (Build.VERSION.SDK_INT >= 26) {
                    accessibilityNodeInfoCompat.setHintText(string);
                } else {
                    if (z10) {
                        string = ((Object) text) + ", " + string;
                    }
                    accessibilityNodeInfoCompat.setText(string);
                }
                accessibilityNodeInfoCompat.setShowingHintText(zIsEmpty);
            }
            if (text == null || text.length() != counterMaxLength) {
                counterMaxLength = -1;
            }
            accessibilityNodeInfoCompat.setMaxTextLength(counterMaxLength);
            if (z11) {
                if (!z14) {
                    error = counterOverflowDescription;
                }
                accessibilityNodeInfoCompat.setError(error);
            }
            View view3 = textInputLayout.f45602y0.f45686y;
            if (view3 != null) {
                accessibilityNodeInfoCompat.setLabelFor(view3);
            }
            textInputLayout.f45590r0.b().n(accessibilityNodeInfoCompat);
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onPopulateAccessibilityEvent(@NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
            super.onPopulateAccessibilityEvent(view, accessibilityEvent);
            this.f45605a.f45590r0.b().o(accessibilityEvent);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface BoxBackgroundMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface EndIconMode {
    }

    public interface LengthCounter {
        int countLength(@Nullable Editable editable);
    }

    public interface OnEditTextAttachedListener {
        void onEditTextAttached(@NonNull TextInputLayout textInputLayout);
    }

    public interface OnEndIconChangedListener {
        void onEndIconChanged(@NonNull TextInputLayout textInputLayout, int i10);
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        @Nullable
        public CharSequence f45606q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public boolean f45607r0;

        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            @NonNull
            public final SavedState createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            public final Object[] newArray(int i10) {
                return new SavedState[i10];
            }

            @Override // android.os.Parcelable.Creator
            @Nullable
            public final Object createFromParcel(@NonNull Parcel parcel) {
                return new SavedState(parcel, null);
            }
        }

        public SavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f45606q0 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f45607r0 = parcel.readInt() == 1;
        }

        @NonNull
        public final String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f45606q0) + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(@NonNull Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            TextUtils.writeToParcel(this.f45606q0, parcel, i10);
            parcel.writeInt(this.f45607r0 ? 1 : 0);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            CheckableImageButton checkableImageButton = TextInputLayout.this.f45590r0.v0;
            checkableImageButton.performClick();
            checkableImageButton.jumpDrawablesToCurrentState();
        }
    }

    public class c implements ValueAnimator.AnimatorUpdateListener {
        public c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            TextInputLayout.this.M1.setExpansionFraction(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public TextInputLayout(@NonNull Context context) {
        this(context, null);
    }

    @Nullable
    private Drawable getEditTextBoxBackground() {
        EditText editText = this.f45591s0;
        if (!(editText instanceof AutoCompleteTextView) || editText.getInputType() != 0) {
            return this.Z0;
        }
        int color = MaterialColors.getColor(this.f45591s0, R.attr.colorControlHighlight);
        int i10 = this.f45579i1;
        int[][] iArr = U1;
        if (i10 != 2) {
            if (i10 != 1) {
                return null;
            }
            MaterialShapeDrawable materialShapeDrawable = this.Z0;
            int i11 = this.f45585o1;
            return new RippleDrawable(new ColorStateList(iArr, new int[]{MaterialColors.layer(color, i11, 0.1f), i11}), materialShapeDrawable, materialShapeDrawable);
        }
        Context context = getContext();
        MaterialShapeDrawable materialShapeDrawable2 = this.Z0;
        int color2 = MaterialColors.getColor(context, R.attr.colorSurface, "TextInputLayout");
        MaterialShapeDrawable materialShapeDrawable3 = new MaterialShapeDrawable(materialShapeDrawable2.getShapeAppearanceModel());
        int iLayer = MaterialColors.layer(color, color2, 0.1f);
        materialShapeDrawable3.setFillColor(new ColorStateList(iArr, new int[]{iLayer, 0}));
        materialShapeDrawable3.setTint(color2);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iLayer, color2});
        MaterialShapeDrawable materialShapeDrawable4 = new MaterialShapeDrawable(materialShapeDrawable2.getShapeAppearanceModel());
        materialShapeDrawable4.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, materialShapeDrawable3, materialShapeDrawable4), materialShapeDrawable2});
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.f45572b1 == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.f45572b1 = stateListDrawable;
            stateListDrawable.addState(new int[]{android.R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.f45572b1.addState(new int[0], f(false));
        }
        return this.f45572b1;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.f45571a1 == null) {
            this.f45571a1 = f(true);
        }
        return this.f45571a1;
    }

    public static void k(@NonNull ViewGroup viewGroup, boolean z10) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            childAt.setEnabled(z10);
            if (childAt instanceof ViewGroup) {
                k((ViewGroup) childAt, z10);
            }
        }
    }

    private void setEditText(EditText editText) {
        if (this.f45591s0 != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (getEndIconMode() != 3) {
            boolean z10 = editText instanceof TextInputEditText;
        }
        this.f45591s0 = editText;
        int i10 = this.f45595u0;
        if (i10 != -1) {
            setMinEms(i10);
        } else {
            setMinWidth(this.f45598w0);
        }
        int i11 = this.v0;
        if (i11 != -1) {
            setMaxEms(i11);
        } else {
            setMaxWidth(this.f45600x0);
        }
        this.f45573c1 = false;
        i();
        setTextInputAccessibilityDelegate(new AccessibilityDelegate(this));
        Typeface typeface = this.f45591s0.getTypeface();
        CollapsingTextHelper collapsingTextHelper = this.M1;
        collapsingTextHelper.setTypefaces(typeface);
        collapsingTextHelper.setExpandedTextSize(this.f45591s0.getTextSize());
        int i12 = Build.VERSION.SDK_INT;
        collapsingTextHelper.setExpandedLetterSpacing(this.f45591s0.getLetterSpacing());
        int gravity = this.f45591s0.getGravity();
        collapsingTextHelper.setCollapsedTextGravity((gravity & (-113)) | 48);
        collapsingTextHelper.setExpandedTextGravity(gravity);
        this.K1 = ViewCompat.getMinimumHeight(editText);
        this.f45591s0.addTextChangedListener(new a(editText));
        if (this.f45604z1 == null) {
            this.f45604z1 = this.f45591s0.getHintTextColors();
        }
        if (this.W0) {
            if (TextUtils.isEmpty(this.X0)) {
                CharSequence hint = this.f45591s0.getHint();
                this.f45593t0 = hint;
                setHint(hint);
                this.f45591s0.setHint((CharSequence) null);
            }
            this.Y0 = true;
        }
        if (i12 >= 29) {
            p();
        }
        if (this.I0 != null) {
            n(this.f45591s0.getText());
        }
        r();
        this.f45602y0.b();
        this.f45588q0.bringToFront();
        m mVar = this.f45590r0;
        mVar.bringToFront();
        Iterator<OnEditTextAttachedListener> it = this.f45597v1.iterator();
        while (it.hasNext()) {
            it.next().onEditTextAttached(this);
        }
        mVar.m();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        u(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.X0)) {
            return;
        }
        this.X0 = charSequence;
        this.M1.setText(charSequence);
        if (this.L1) {
            return;
        }
        j();
    }

    private void setPlaceholderTextEnabled(boolean z10) {
        if (this.M0 == z10) {
            return;
        }
        if (z10) {
            AppCompatTextView appCompatTextView = this.N0;
            if (appCompatTextView != null) {
                this.f45586p0.addView(appCompatTextView);
                this.N0.setVisibility(0);
            }
        } else {
            AppCompatTextView appCompatTextView2 = this.N0;
            if (appCompatTextView2 != null) {
                appCompatTextView2.setVisibility(8);
            }
            this.N0 = null;
        }
        this.M0 = z10;
    }

    @VisibleForTesting
    public final void a(float f6) {
        CollapsingTextHelper collapsingTextHelper = this.M1;
        if (collapsingTextHelper.getExpansionFraction() == f6) {
            return;
        }
        if (this.P1 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.P1 = valueAnimator;
            valueAnimator.setInterpolator(MotionUtils.resolveThemeInterpolator(getContext(), R.attr.motionEasingEmphasizedInterpolator, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
            this.P1.setDuration(MotionUtils.resolveThemeDuration(getContext(), R.attr.motionDurationMedium4, 167));
            this.P1.addUpdateListener(new c());
        }
        this.P1.setFloatValues(collapsingTextHelper.getExpansionFraction(), f6);
        this.P1.start();
    }

    public void addOnEditTextAttachedListener(@NonNull OnEditTextAttachedListener onEditTextAttachedListener) {
        this.f45597v1.add(onEditTextAttachedListener);
        if (this.f45591s0 != null) {
            onEditTextAttachedListener.onEditTextAttached(this);
        }
    }

    public void addOnEndIconChangedListener(@NonNull OnEndIconChangedListener onEndIconChangedListener) {
        this.f45590r0.f45651y0.add(onEndIconChangedListener);
    }

    @Override // android.view.ViewGroup
    public void addView(@NonNull View view, int i10, @NonNull ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i10, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.f45586p0;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        t();
        setEditText((EditText) view);
    }

    public final void b() {
        int i10;
        int i11;
        MaterialShapeDrawable materialShapeDrawable = this.Z0;
        if (materialShapeDrawable == null) {
            return;
        }
        ShapeAppearanceModel shapeAppearanceModel = materialShapeDrawable.getShapeAppearanceModel();
        ShapeAppearanceModel shapeAppearanceModel2 = this.f45576f1;
        if (shapeAppearanceModel != shapeAppearanceModel2) {
            this.Z0.setShapeAppearanceModel(shapeAppearanceModel2);
        }
        if (this.f45579i1 == 2 && (i10 = this.f45581k1) > -1 && (i11 = this.f45584n1) != 0) {
            this.Z0.setStroke(i10, i11);
        }
        int iLayer = this.f45585o1;
        if (this.f45579i1 == 1) {
            iLayer = MaterialColors.layer(MaterialColors.getColor(this, R.attr.colorSurface, 0), this.f45585o1);
        }
        this.f45585o1 = iLayer;
        this.Z0.setFillColor(ColorStateList.valueOf(iLayer));
        MaterialShapeDrawable materialShapeDrawable2 = this.f45574d1;
        if (materialShapeDrawable2 != null && this.f45575e1 != null) {
            if (this.f45581k1 > -1 && this.f45584n1 != 0) {
                materialShapeDrawable2.setFillColor(this.f45591s0.isFocused() ? ColorStateList.valueOf(this.B1) : ColorStateList.valueOf(this.f45584n1));
                this.f45575e1.setFillColor(ColorStateList.valueOf(this.f45584n1));
            }
            invalidate();
        }
        s();
    }

    public final int c() {
        float collapsedTextHeight;
        if (!this.W0) {
            return 0;
        }
        int i10 = this.f45579i1;
        CollapsingTextHelper collapsingTextHelper = this.M1;
        if (i10 == 0) {
            collapsedTextHeight = collapsingTextHelper.getCollapsedTextHeight();
        } else {
            if (i10 != 2) {
                return 0;
            }
            collapsedTextHeight = collapsingTextHelper.getCollapsedTextHeight() / 2.0f;
        }
        return (int) collapsedTextHeight;
    }

    public void clearOnEditTextAttachedListeners() {
        this.f45597v1.clear();
    }

    public void clearOnEndIconChangedListeners() {
        this.f45590r0.f45651y0.clear();
    }

    public final Fade d() {
        Fade fade = new Fade();
        fade.setDuration(MotionUtils.resolveThemeDuration(getContext(), R.attr.motionDurationShort2, 87));
        fade.setInterpolator(MotionUtils.resolveThemeInterpolator(getContext(), R.attr.motionEasingLinearInterpolator, AnimationUtils.LINEAR_INTERPOLATOR));
        return fade;
    }

    @Override // android.view.ViewGroup, android.view.View
    @TargetApi(26)
    public void dispatchProvideAutofillStructure(@NonNull ViewStructure viewStructure, int i10) {
        EditText editText = this.f45591s0;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i10);
            return;
        }
        if (this.f45593t0 != null) {
            boolean z10 = this.Y0;
            this.Y0 = false;
            CharSequence hint = editText.getHint();
            this.f45591s0.setHint(this.f45593t0);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i10);
                return;
            } finally {
                this.f45591s0.setHint(hint);
                this.Y0 = z10;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i10);
        onProvideAutofillVirtualStructure(viewStructure, i10);
        FrameLayout frameLayout = this.f45586p0;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i11 = 0; i11 < frameLayout.getChildCount(); i11++) {
            View childAt = frameLayout.getChildAt(i11);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i11);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i10);
            if (childAt == this.f45591s0) {
                viewStructureNewChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(@NonNull SparseArray<Parcelable> sparseArray) {
        this.R1 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.R1 = false;
    }

    @Override // android.view.View
    public void draw(@NonNull Canvas canvas) {
        MaterialShapeDrawable materialShapeDrawable;
        super.draw(canvas);
        boolean z10 = this.W0;
        CollapsingTextHelper collapsingTextHelper = this.M1;
        if (z10) {
            collapsingTextHelper.draw(canvas);
        }
        if (this.f45575e1 == null || (materialShapeDrawable = this.f45574d1) == null) {
            return;
        }
        materialShapeDrawable.draw(canvas);
        if (this.f45591s0.isFocused()) {
            Rect bounds = this.f45575e1.getBounds();
            Rect bounds2 = this.f45574d1.getBounds();
            float expansionFraction = collapsingTextHelper.getExpansionFraction();
            int iCenterX = bounds2.centerX();
            bounds.left = AnimationUtils.lerp(iCenterX, bounds2.left, expansionFraction);
            bounds.right = AnimationUtils.lerp(iCenterX, bounds2.right, expansionFraction);
            this.f45575e1.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        if (this.Q1) {
            return;
        }
        this.Q1 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        CollapsingTextHelper collapsingTextHelper = this.M1;
        boolean state = collapsingTextHelper != null ? collapsingTextHelper.setState(drawableState) : false;
        if (this.f45591s0 != null) {
            u(ViewCompat.isLaidOut(this) && isEnabled(), false);
        }
        r();
        x();
        if (state) {
            invalidate();
        }
        this.Q1 = false;
    }

    public final boolean e() {
        return this.W0 && !TextUtils.isEmpty(this.X0) && (this.Z0 instanceof g);
    }

    public final MaterialShapeDrawable f(boolean z10) {
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.mtrl_shape_corner_size_small_component);
        float f6 = z10 ? dimensionPixelOffset : 0.0f;
        EditText editText = this.f45591s0;
        float popupElevation = editText instanceof MaterialAutoCompleteTextView ? ((MaterialAutoCompleteTextView) editText).getPopupElevation() : getResources().getDimensionPixelOffset(R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        ShapeAppearanceModel shapeAppearanceModelBuild = ShapeAppearanceModel.builder().setTopLeftCornerSize(f6).setTopRightCornerSize(f6).setBottomLeftCornerSize(dimensionPixelOffset).setBottomRightCornerSize(dimensionPixelOffset).build();
        EditText editText2 = this.f45591s0;
        MaterialShapeDrawable materialShapeDrawableCreateWithElevationOverlay = MaterialShapeDrawable.createWithElevationOverlay(getContext(), popupElevation, editText2 instanceof MaterialAutoCompleteTextView ? ((MaterialAutoCompleteTextView) editText2).getDropDownBackgroundTintList() : null);
        materialShapeDrawableCreateWithElevationOverlay.setShapeAppearanceModel(shapeAppearanceModelBuild);
        materialShapeDrawableCreateWithElevationOverlay.setPadding(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        return materialShapeDrawableCreateWithElevationOverlay;
    }

    public final int g(int i10, boolean z10) {
        int compoundPaddingLeft;
        if (z10 || getPrefixText() == null) {
            compoundPaddingLeft = (!z10 || getSuffixText() == null) ? this.f45591s0.getCompoundPaddingLeft() : this.f45590r0.c();
        } else {
            compoundPaddingLeft = this.f45588q0.a();
        }
        return compoundPaddingLeft + i10;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f45591s0;
        if (editText == null) {
            return super.getBaseline();
        }
        return c() + getPaddingTop() + editText.getBaseline();
    }

    @NonNull
    public MaterialShapeDrawable getBoxBackground() {
        int i10 = this.f45579i1;
        if (i10 == 1 || i10 == 2) {
            return this.Z0;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f45585o1;
    }

    public int getBoxBackgroundMode() {
        return this.f45579i1;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f45580j1;
    }

    public float getBoxCornerRadiusBottomEnd() {
        boolean zIsLayoutRtl = ViewUtils.isLayoutRtl(this);
        RectF rectF = this.r1;
        return zIsLayoutRtl ? this.f45576f1.getBottomLeftCornerSize().getCornerSize(rectF) : this.f45576f1.getBottomRightCornerSize().getCornerSize(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        boolean zIsLayoutRtl = ViewUtils.isLayoutRtl(this);
        RectF rectF = this.r1;
        return zIsLayoutRtl ? this.f45576f1.getBottomRightCornerSize().getCornerSize(rectF) : this.f45576f1.getBottomLeftCornerSize().getCornerSize(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        boolean zIsLayoutRtl = ViewUtils.isLayoutRtl(this);
        RectF rectF = this.r1;
        return zIsLayoutRtl ? this.f45576f1.getTopLeftCornerSize().getCornerSize(rectF) : this.f45576f1.getTopRightCornerSize().getCornerSize(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        boolean zIsLayoutRtl = ViewUtils.isLayoutRtl(this);
        RectF rectF = this.r1;
        return zIsLayoutRtl ? this.f45576f1.getTopRightCornerSize().getCornerSize(rectF) : this.f45576f1.getTopLeftCornerSize().getCornerSize(rectF);
    }

    public int getBoxStrokeColor() {
        return this.D1;
    }

    @Nullable
    public ColorStateList getBoxStrokeErrorColor() {
        return this.E1;
    }

    public int getBoxStrokeWidth() {
        return this.f45582l1;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f45583m1;
    }

    public int getCounterMaxLength() {
        return this.F0;
    }

    @Nullable
    public CharSequence getCounterOverflowDescription() {
        AppCompatTextView appCompatTextView;
        if (this.E0 && this.G0 && (appCompatTextView = this.I0) != null) {
            return appCompatTextView.getContentDescription();
        }
        return null;
    }

    @Nullable
    public ColorStateList getCounterOverflowTextColor() {
        return this.T0;
    }

    @Nullable
    public ColorStateList getCounterTextColor() {
        return this.S0;
    }

    @Nullable
    @RequiresApi(29)
    public ColorStateList getCursorColor() {
        return this.U0;
    }

    @Nullable
    @RequiresApi(29)
    public ColorStateList getCursorErrorColor() {
        return this.V0;
    }

    @Nullable
    public ColorStateList getDefaultHintTextColor() {
        return this.f45604z1;
    }

    @Nullable
    public EditText getEditText() {
        return this.f45591s0;
    }

    @Nullable
    public CharSequence getEndIconContentDescription() {
        return this.f45590r0.v0.getContentDescription();
    }

    @Nullable
    public Drawable getEndIconDrawable() {
        return this.f45590r0.v0.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.f45590r0.G0;
    }

    public int getEndIconMode() {
        return this.f45590r0.f45650x0;
    }

    @NonNull
    public ImageView.ScaleType getEndIconScaleType() {
        return this.f45590r0.H0;
    }

    @NonNull
    public CheckableImageButton getEndIconView() {
        return this.f45590r0.v0;
    }

    @Nullable
    public CharSequence getError() {
        p pVar = this.f45602y0;
        if (pVar.f45678q) {
            return pVar.f45677p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f45602y0.f45681t;
    }

    @Nullable
    public CharSequence getErrorContentDescription() {
        return this.f45602y0.f45680s;
    }

    @ColorInt
    public int getErrorCurrentTextColors() {
        AppCompatTextView appCompatTextView = this.f45602y0.f45679r;
        if (appCompatTextView != null) {
            return appCompatTextView.getCurrentTextColor();
        }
        return -1;
    }

    @Nullable
    public Drawable getErrorIconDrawable() {
        return this.f45590r0.f45645r0.getDrawable();
    }

    @Nullable
    public CharSequence getHelperText() {
        p pVar = this.f45602y0;
        if (pVar.f45685x) {
            return pVar.f45684w;
        }
        return null;
    }

    @ColorInt
    public int getHelperTextCurrentTextColor() {
        AppCompatTextView appCompatTextView = this.f45602y0.f45686y;
        if (appCompatTextView != null) {
            return appCompatTextView.getCurrentTextColor();
        }
        return -1;
    }

    @Nullable
    public CharSequence getHint() {
        if (this.W0) {
            return this.X0;
        }
        return null;
    }

    @VisibleForTesting
    public final float getHintCollapsedTextHeight() {
        return this.M1.getCollapsedTextHeight();
    }

    @VisibleForTesting
    public final int getHintCurrentCollapsedTextColor() {
        return this.M1.getCurrentCollapsedTextColor();
    }

    @Nullable
    public ColorStateList getHintTextColor() {
        return this.A1;
    }

    @NonNull
    public LengthCounter getLengthCounter() {
        return this.H0;
    }

    public int getMaxEms() {
        return this.v0;
    }

    @Px
    public int getMaxWidth() {
        return this.f45600x0;
    }

    public int getMinEms() {
        return this.f45595u0;
    }

    @Px
    public int getMinWidth() {
        return this.f45598w0;
    }

    @Nullable
    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f45590r0.v0.getContentDescription();
    }

    @Nullable
    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f45590r0.v0.getDrawable();
    }

    @Nullable
    public CharSequence getPlaceholderText() {
        if (this.M0) {
            return this.L0;
        }
        return null;
    }

    @StyleRes
    public int getPlaceholderTextAppearance() {
        return this.P0;
    }

    @Nullable
    public ColorStateList getPlaceholderTextColor() {
        return this.O0;
    }

    @Nullable
    public CharSequence getPrefixText() {
        return this.f45588q0.f45699r0;
    }

    @Nullable
    public ColorStateList getPrefixTextColor() {
        return this.f45588q0.f45698q0.getTextColors();
    }

    @NonNull
    public TextView getPrefixTextView() {
        return this.f45588q0.f45698q0;
    }

    @NonNull
    public ShapeAppearanceModel getShapeAppearanceModel() {
        return this.f45576f1;
    }

    @Nullable
    public CharSequence getStartIconContentDescription() {
        return this.f45588q0.f45700s0.getContentDescription();
    }

    @Nullable
    public Drawable getStartIconDrawable() {
        return this.f45588q0.f45700s0.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.f45588q0.v0;
    }

    @NonNull
    public ImageView.ScaleType getStartIconScaleType() {
        return this.f45588q0.f45703w0;
    }

    @Nullable
    public CharSequence getSuffixText() {
        return this.f45590r0.J0;
    }

    @Nullable
    public ColorStateList getSuffixTextColor() {
        return this.f45590r0.K0.getTextColors();
    }

    @NonNull
    public TextView getSuffixTextView() {
        return this.f45590r0.K0;
    }

    @Nullable
    public Typeface getTypeface() {
        return this.f45592s1;
    }

    public final int h(int i10, boolean z10) {
        int compoundPaddingRight;
        if (z10 || getSuffixText() == null) {
            compoundPaddingRight = (!z10 || getPrefixText() == null) ? this.f45591s0.getCompoundPaddingRight() : this.f45588q0.a();
        } else {
            compoundPaddingRight = this.f45590r0.c();
        }
        return i10 - compoundPaddingRight;
    }

    public final void i() {
        int i10 = this.f45579i1;
        if (i10 == 0) {
            this.Z0 = null;
            this.f45574d1 = null;
            this.f45575e1 = null;
        } else if (i10 == 1) {
            this.Z0 = new MaterialShapeDrawable(this.f45576f1);
            this.f45574d1 = new MaterialShapeDrawable();
            this.f45575e1 = new MaterialShapeDrawable();
        } else {
            if (i10 != 2) {
                throw new IllegalArgumentException(androidx.appcompat.widget.a.c(new StringBuilder(), this.f45579i1, " is illegal; only @BoxBackgroundMode constants are supported."));
            }
            if (!this.W0 || (this.Z0 instanceof g)) {
                this.Z0 = new MaterialShapeDrawable(this.f45576f1);
            } else {
                ShapeAppearanceModel shapeAppearanceModel = this.f45576f1;
                int i11 = g.T0;
                if (shapeAppearanceModel == null) {
                    shapeAppearanceModel = new ShapeAppearanceModel();
                }
                this.Z0 = new g.b(new g.a(shapeAppearanceModel, new RectF()));
            }
            this.f45574d1 = null;
            this.f45575e1 = null;
        }
        s();
        x();
        if (this.f45579i1 == 1) {
            if (MaterialResources.isFontScaleAtLeast2_0(getContext())) {
                this.f45580j1 = getResources().getDimensionPixelSize(R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (MaterialResources.isFontScaleAtLeast1_3(getContext())) {
                this.f45580j1 = getResources().getDimensionPixelSize(R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        if (this.f45591s0 != null && this.f45579i1 == 1) {
            if (MaterialResources.isFontScaleAtLeast2_0(getContext())) {
                EditText editText = this.f45591s0;
                ViewCompat.setPaddingRelative(editText, ViewCompat.getPaddingStart(editText), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_2_0_padding_top), ViewCompat.getPaddingEnd(this.f45591s0), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_2_0_padding_bottom));
            } else if (MaterialResources.isFontScaleAtLeast1_3(getContext())) {
                EditText editText2 = this.f45591s0;
                ViewCompat.setPaddingRelative(editText2, ViewCompat.getPaddingStart(editText2), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_1_3_padding_top), ViewCompat.getPaddingEnd(this.f45591s0), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_1_3_padding_bottom));
            }
        }
        if (this.f45579i1 != 0) {
            t();
        }
        EditText editText3 = this.f45591s0;
        if (editText3 instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText3;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i12 = this.f45579i1;
                if (i12 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i12 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    public boolean isCounterEnabled() {
        return this.E0;
    }

    public boolean isEndIconCheckable() {
        return this.f45590r0.v0.isCheckable();
    }

    public boolean isEndIconVisible() {
        return this.f45590r0.d();
    }

    public boolean isErrorEnabled() {
        return this.f45602y0.f45678q;
    }

    public boolean isExpandedHintEnabled() {
        return this.N1;
    }

    public boolean isHelperTextEnabled() {
        return this.f45602y0.f45685x;
    }

    public boolean isHintAnimationEnabled() {
        return this.O1;
    }

    public boolean isHintEnabled() {
        return this.W0;
    }

    @Deprecated
    public boolean isPasswordVisibilityToggleEnabled() {
        return this.f45590r0.f45650x0 == 1;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean isProvidingHint() {
        return this.Y0;
    }

    public boolean isStartIconCheckable() {
        return this.f45588q0.f45700s0.isCheckable();
    }

    public boolean isStartIconVisible() {
        return this.f45588q0.f45700s0.getVisibility() == 0;
    }

    public final void j() {
        if (e()) {
            RectF rectF = this.r1;
            this.M1.getCollapsedTextActualBounds(rectF, this.f45591s0.getWidth(), this.f45591s0.getGravity());
            if (rectF.width() <= 0.0f || rectF.height() <= 0.0f) {
                return;
            }
            float f6 = rectF.left;
            float f10 = this.f45578h1;
            rectF.left = f6 - f10;
            rectF.right += f10;
            rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.f45581k1);
            g gVar = (g) this.Z0;
            gVar.getClass();
            gVar.i(rectF.left, rectF.top, rectF.right, rectF.bottom);
        }
    }

    public final void l(@NonNull TextView textView, @StyleRes int i10) {
        try {
            TextViewCompat.setTextAppearance(textView, i10);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        TextViewCompat.setTextAppearance(textView, R.style.TextAppearance_AppCompat_Caption);
        textView.setTextColor(ContextCompat.getColor(getContext(), R.color.design_error));
    }

    public final boolean m() {
        p pVar = this.f45602y0;
        return (pVar.f45676o != 1 || pVar.f45679r == null || TextUtils.isEmpty(pVar.f45677p)) ? false : true;
    }

    public final void n(@Nullable Editable editable) {
        int iCountLength = this.H0.countLength(editable);
        boolean z10 = this.G0;
        int i10 = this.F0;
        if (i10 == -1) {
            this.I0.setText(String.valueOf(iCountLength));
            this.I0.setContentDescription(null);
            this.G0 = false;
        } else {
            this.G0 = iCountLength > i10;
            Context context = getContext();
            this.I0.setContentDescription(context.getString(this.G0 ? R.string.character_counter_overflowed_content_description : R.string.character_counter_content_description, Integer.valueOf(iCountLength), Integer.valueOf(this.F0)));
            if (z10 != this.G0) {
                o();
            }
            this.I0.setText(BidiFormatter.getInstance().unicodeWrap(getContext().getString(R.string.character_counter_pattern, Integer.valueOf(iCountLength), Integer.valueOf(this.F0))));
        }
        if (this.f45591s0 == null || z10 == this.G0) {
            return;
        }
        u(false, false);
        x();
        r();
    }

    public final void o() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        AppCompatTextView appCompatTextView = this.I0;
        if (appCompatTextView != null) {
            l(appCompatTextView, this.G0 ? this.J0 : this.K0);
            if (!this.G0 && (colorStateList2 = this.S0) != null) {
                this.I0.setTextColor(colorStateList2);
            }
            if (!this.G0 || (colorStateList = this.T0) == null) {
                return;
            }
            this.I0.setTextColor(colorStateList);
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.M1.maybeUpdateFontWeightAdjustment(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        int iMax;
        m mVar = this.f45590r0;
        mVar.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z10 = false;
        this.S1 = false;
        if (this.f45591s0 != null && this.f45591s0.getMeasuredHeight() < (iMax = Math.max(mVar.getMeasuredHeight(), this.f45588q0.getMeasuredHeight()))) {
            this.f45591s0.setMinimumHeight(iMax);
            z10 = true;
        }
        boolean zQ = q();
        if (z10 || zQ) {
            this.f45591s0.post(new h0(this, 4));
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        EditText editText = this.f45591s0;
        if (editText != null) {
            Rect rect = this.f45587p1;
            DescendantOffsetUtils.getDescendantRect(this, editText, rect);
            MaterialShapeDrawable materialShapeDrawable = this.f45574d1;
            if (materialShapeDrawable != null) {
                int i14 = rect.bottom;
                materialShapeDrawable.setBounds(rect.left, i14 - this.f45582l1, rect.right, i14);
            }
            MaterialShapeDrawable materialShapeDrawable2 = this.f45575e1;
            if (materialShapeDrawable2 != null) {
                int i15 = rect.bottom;
                materialShapeDrawable2.setBounds(rect.left, i15 - this.f45583m1, rect.right, i15);
            }
            if (this.W0) {
                float textSize = this.f45591s0.getTextSize();
                CollapsingTextHelper collapsingTextHelper = this.M1;
                collapsingTextHelper.setExpandedTextSize(textSize);
                int gravity = this.f45591s0.getGravity();
                collapsingTextHelper.setCollapsedTextGravity((gravity & (-113)) | 48);
                collapsingTextHelper.setExpandedTextGravity(gravity);
                if (this.f45591s0 == null) {
                    throw new IllegalStateException();
                }
                boolean zIsLayoutRtl = ViewUtils.isLayoutRtl(this);
                int i16 = rect.bottom;
                Rect rect2 = this.f45589q1;
                rect2.bottom = i16;
                int i17 = this.f45579i1;
                if (i17 == 1) {
                    rect2.left = g(rect.left, zIsLayoutRtl);
                    rect2.top = rect.top + this.f45580j1;
                    rect2.right = h(rect.right, zIsLayoutRtl);
                } else if (i17 != 2) {
                    rect2.left = g(rect.left, zIsLayoutRtl);
                    rect2.top = getPaddingTop();
                    rect2.right = h(rect.right, zIsLayoutRtl);
                } else {
                    rect2.left = this.f45591s0.getPaddingLeft() + rect.left;
                    rect2.top = rect.top - c();
                    rect2.right = rect.right - this.f45591s0.getPaddingRight();
                }
                collapsingTextHelper.setCollapsedBounds(rect2);
                if (this.f45591s0 == null) {
                    throw new IllegalStateException();
                }
                float expandedTextHeight = collapsingTextHelper.getExpandedTextHeight();
                rect2.left = this.f45591s0.getCompoundPaddingLeft() + rect.left;
                rect2.top = (this.f45579i1 != 1 || this.f45591s0.getMinLines() > 1) ? rect.top + this.f45591s0.getCompoundPaddingTop() : (int) (rect.centerY() - (expandedTextHeight / 2.0f));
                rect2.right = rect.right - this.f45591s0.getCompoundPaddingRight();
                rect2.bottom = (this.f45579i1 != 1 || this.f45591s0.getMinLines() > 1) ? rect.bottom - this.f45591s0.getCompoundPaddingBottom() : (int) (rect2.top + expandedTextHeight);
                collapsingTextHelper.setExpandedBounds(rect2);
                collapsingTextHelper.recalculate();
                if (!e() || this.L1) {
                    return;
                }
                j();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        EditText editText;
        super.onMeasure(i10, i11);
        boolean z10 = this.S1;
        m mVar = this.f45590r0;
        if (!z10) {
            mVar.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.S1 = true;
        }
        if (this.N0 != null && (editText = this.f45591s0) != null) {
            this.N0.setGravity(editText.getGravity());
            this.N0.setPadding(this.f45591s0.getCompoundPaddingLeft(), this.f45591s0.getCompoundPaddingTop(), this.f45591s0.getCompoundPaddingRight(), this.f45591s0.getCompoundPaddingBottom());
        }
        mVar.m();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(@Nullable Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setError(savedState.f45606q0);
        if (savedState.f45607r0) {
            post(new b());
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        boolean z10 = i10 == 1;
        if (z10 != this.f45577g1) {
            CornerSize topLeftCornerSize = this.f45576f1.getTopLeftCornerSize();
            RectF rectF = this.r1;
            float cornerSize = topLeftCornerSize.getCornerSize(rectF);
            float cornerSize2 = this.f45576f1.getTopRightCornerSize().getCornerSize(rectF);
            ShapeAppearanceModel shapeAppearanceModelBuild = ShapeAppearanceModel.builder().setTopLeftCorner(this.f45576f1.getTopRightCorner()).setTopRightCorner(this.f45576f1.getTopLeftCorner()).setBottomLeftCorner(this.f45576f1.getBottomRightCorner()).setBottomRightCorner(this.f45576f1.getBottomLeftCorner()).setTopLeftCornerSize(cornerSize2).setTopRightCornerSize(cornerSize).setBottomLeftCornerSize(this.f45576f1.getBottomRightCornerSize().getCornerSize(rectF)).setBottomRightCornerSize(this.f45576f1.getBottomLeftCornerSize().getCornerSize(rectF)).build();
            this.f45577g1 = z10;
            setShapeAppearanceModel(shapeAppearanceModelBuild);
        }
    }

    @Override // android.view.View
    @Nullable
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (m()) {
            savedState.f45606q0 = getError();
        }
        m mVar = this.f45590r0;
        savedState.f45607r0 = mVar.f45650x0 != 0 && mVar.v0.isChecked();
        return savedState;
    }

    @RequiresApi(29)
    public final void p() {
        ColorStateList colorStateList;
        ColorStateList colorStateListOrNull = this.U0;
        if (colorStateListOrNull == null) {
            colorStateListOrNull = MaterialColors.getColorStateListOrNull(getContext(), R.attr.colorControlActivated);
        }
        EditText editText = this.f45591s0;
        if (editText == null || editText.getTextCursorDrawable() == null) {
            return;
        }
        Drawable drawableMutate = DrawableCompat.wrap(this.f45591s0.getTextCursorDrawable()).mutate();
        if ((m() || (this.I0 != null && this.G0)) && (colorStateList = this.V0) != null) {
            colorStateListOrNull = colorStateList;
        }
        DrawableCompat.setTintList(drawableMutate, colorStateListOrNull);
    }

    @Deprecated
    public void passwordVisibilityToggleRequested(boolean z10) {
        m mVar = this.f45590r0;
        if (mVar.f45650x0 == 1) {
            CheckableImageButton checkableImageButton = mVar.v0;
            checkableImageButton.performClick();
            if (z10) {
                checkableImageButton.jumpDrawablesToCurrentState();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005f  */
    /* JADX WARN: Code duplicated, block: B:23:0x0063  */
    /* JADX WARN: Code duplicated, block: B:25:0x0078  */
    public final boolean q() {
        boolean z10;
        if (this.f45591s0 == null) {
            return false;
        }
        CheckableImageButton checkableImageButton = null;
        boolean z11 = true;
        if (getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) {
            t tVar = this.f45588q0;
            if (tVar.getMeasuredWidth() > 0) {
                int measuredWidth = tVar.getMeasuredWidth() - this.f45591s0.getPaddingLeft();
                if (this.f45594t1 == null || this.f45596u1 != measuredWidth) {
                    ColorDrawable colorDrawable = new ColorDrawable();
                    this.f45594t1 = colorDrawable;
                    this.f45596u1 = measuredWidth;
                    colorDrawable.setBounds(0, 0, measuredWidth, 1);
                }
                Drawable[] compoundDrawablesRelative = TextViewCompat.getCompoundDrawablesRelative(this.f45591s0);
                Drawable drawable = compoundDrawablesRelative[0];
                ColorDrawable colorDrawable2 = this.f45594t1;
                if (drawable != colorDrawable2) {
                    TextViewCompat.setCompoundDrawablesRelative(this.f45591s0, colorDrawable2, compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else if (this.f45594t1 != null) {
                Drawable[] compoundDrawablesRelative2 = TextViewCompat.getCompoundDrawablesRelative(this.f45591s0);
                TextViewCompat.setCompoundDrawablesRelative(this.f45591s0, null, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
                this.f45594t1 = null;
                z10 = true;
            } else {
                z10 = false;
            }
        } else if (this.f45594t1 != null) {
            Drawable[] compoundDrawablesRelative3 = TextViewCompat.getCompoundDrawablesRelative(this.f45591s0);
            TextViewCompat.setCompoundDrawablesRelative(this.f45591s0, null, compoundDrawablesRelative3[1], compoundDrawablesRelative3[2], compoundDrawablesRelative3[3]);
            this.f45594t1 = null;
            z10 = true;
        } else {
            z10 = false;
        }
        m mVar = this.f45590r0;
        if ((mVar.e() || ((mVar.f45650x0 != 0 && isEndIconVisible()) || mVar.J0 != null)) && mVar.getMeasuredWidth() > 0) {
            int measuredWidth2 = mVar.K0.getMeasuredWidth() - this.f45591s0.getPaddingRight();
            if (mVar.e()) {
                checkableImageButton = mVar.f45645r0;
            } else if (mVar.f45650x0 != 0 && mVar.d()) {
                checkableImageButton = mVar.v0;
            }
            if (checkableImageButton != null) {
                measuredWidth2 = MarginLayoutParamsCompat.getMarginStart((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()) + checkableImageButton.getMeasuredWidth() + measuredWidth2;
            }
            Drawable[] compoundDrawablesRelative4 = TextViewCompat.getCompoundDrawablesRelative(this.f45591s0);
            ColorDrawable colorDrawable3 = this.f45599w1;
            if (colorDrawable3 == null || this.f45601x1 == measuredWidth2) {
                if (colorDrawable3 == null) {
                    ColorDrawable colorDrawable4 = new ColorDrawable();
                    this.f45599w1 = colorDrawable4;
                    this.f45601x1 = measuredWidth2;
                    colorDrawable4.setBounds(0, 0, measuredWidth2, 1);
                }
                Drawable drawable2 = compoundDrawablesRelative4[2];
                ColorDrawable colorDrawable5 = this.f45599w1;
                if (drawable2 != colorDrawable5) {
                    this.f45603y1 = drawable2;
                    TextViewCompat.setCompoundDrawablesRelative(this.f45591s0, compoundDrawablesRelative4[0], compoundDrawablesRelative4[1], colorDrawable5, compoundDrawablesRelative4[3]);
                } else {
                    z11 = z10;
                }
            } else {
                this.f45601x1 = measuredWidth2;
                colorDrawable3.setBounds(0, 0, measuredWidth2, 1);
                TextViewCompat.setCompoundDrawablesRelative(this.f45591s0, compoundDrawablesRelative4[0], compoundDrawablesRelative4[1], this.f45599w1, compoundDrawablesRelative4[3]);
            }
        } else {
            if (this.f45599w1 == null) {
                return z10;
            }
            Drawable[] compoundDrawablesRelative5 = TextViewCompat.getCompoundDrawablesRelative(this.f45591s0);
            if (compoundDrawablesRelative5[2] == this.f45599w1) {
                TextViewCompat.setCompoundDrawablesRelative(this.f45591s0, compoundDrawablesRelative5[0], compoundDrawablesRelative5[1], this.f45603y1, compoundDrawablesRelative5[3]);
            } else {
                z11 = z10;
            }
            this.f45599w1 = null;
        }
        return z11;
    }

    public final void r() {
        Drawable background;
        AppCompatTextView appCompatTextView;
        EditText editText = this.f45591s0;
        if (editText == null || this.f45579i1 != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        if (DrawableUtils.canSafelyMutateDrawable(background)) {
            background = background.mutate();
        }
        if (m()) {
            background.setColorFilter(AppCompatDrawableManager.getPorterDuffColorFilter(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.G0 && (appCompatTextView = this.I0) != null) {
            background.setColorFilter(AppCompatDrawableManager.getPorterDuffColorFilter(appCompatTextView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            DrawableCompat.clearColorFilter(background);
            this.f45591s0.refreshDrawableState();
        }
    }

    public void refreshEndIconDrawableState() {
        m mVar = this.f45590r0;
        o.c(mVar.f45643p0, mVar.v0, mVar.E0);
    }

    public void refreshErrorIconDrawableState() {
        m mVar = this.f45590r0;
        o.c(mVar.f45643p0, mVar.f45645r0, mVar.f45646s0);
    }

    public void refreshStartIconDrawableState() {
        t tVar = this.f45588q0;
        o.c(tVar.f45697p0, tVar.f45700s0, tVar.f45701t0);
    }

    public void removeOnEditTextAttachedListener(@NonNull OnEditTextAttachedListener onEditTextAttachedListener) {
        this.f45597v1.remove(onEditTextAttachedListener);
    }

    public void removeOnEndIconChangedListener(@NonNull OnEndIconChangedListener onEndIconChangedListener) {
        this.f45590r0.f45651y0.remove(onEndIconChangedListener);
    }

    public final void s() {
        EditText editText = this.f45591s0;
        if (editText == null || this.Z0 == null) {
            return;
        }
        if ((this.f45573c1 || editText.getBackground() == null) && this.f45579i1 != 0) {
            ViewCompat.setBackground(this.f45591s0, getEditTextBoxBackground());
            this.f45573c1 = true;
        }
    }

    public void setBoxBackgroundColor(@ColorInt int i10) {
        if (this.f45585o1 != i10) {
            this.f45585o1 = i10;
            this.F1 = i10;
            this.H1 = i10;
            this.I1 = i10;
            b();
        }
    }

    public void setBoxBackgroundColorResource(@ColorRes int i10) {
        setBoxBackgroundColor(ContextCompat.getColor(getContext(), i10));
    }

    public void setBoxBackgroundColorStateList(@NonNull ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.F1 = defaultColor;
        this.f45585o1 = defaultColor;
        this.G1 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.H1 = colorStateList.getColorForState(new int[]{android.R.attr.state_focused, android.R.attr.state_enabled}, -1);
        this.I1 = colorStateList.getColorForState(new int[]{android.R.attr.state_hovered, android.R.attr.state_enabled}, -1);
        b();
    }

    public void setBoxBackgroundMode(int i10) {
        if (i10 == this.f45579i1) {
            return;
        }
        this.f45579i1 = i10;
        if (this.f45591s0 != null) {
            i();
        }
    }

    public void setBoxCollapsedPaddingTop(int i10) {
        this.f45580j1 = i10;
    }

    public void setBoxCornerFamily(int i10) {
        this.f45576f1 = this.f45576f1.toBuilder().setTopLeftCorner(i10, this.f45576f1.getTopLeftCornerSize()).setTopRightCorner(i10, this.f45576f1.getTopRightCornerSize()).setBottomLeftCorner(i10, this.f45576f1.getBottomLeftCornerSize()).setBottomRightCorner(i10, this.f45576f1.getBottomRightCornerSize()).build();
        b();
    }

    public void setBoxCornerRadii(float f6, float f10, float f11, float f12) {
        boolean zIsLayoutRtl = ViewUtils.isLayoutRtl(this);
        this.f45577g1 = zIsLayoutRtl;
        float f13 = zIsLayoutRtl ? f10 : f6;
        if (!zIsLayoutRtl) {
            f6 = f10;
        }
        float f14 = zIsLayoutRtl ? f12 : f11;
        if (!zIsLayoutRtl) {
            f11 = f12;
        }
        MaterialShapeDrawable materialShapeDrawable = this.Z0;
        if (materialShapeDrawable != null && materialShapeDrawable.getTopLeftCornerResolvedSize() == f13 && this.Z0.getTopRightCornerResolvedSize() == f6 && this.Z0.getBottomLeftCornerResolvedSize() == f14 && this.Z0.getBottomRightCornerResolvedSize() == f11) {
            return;
        }
        this.f45576f1 = this.f45576f1.toBuilder().setTopLeftCornerSize(f13).setTopRightCornerSize(f6).setBottomLeftCornerSize(f14).setBottomRightCornerSize(f11).build();
        b();
    }

    public void setBoxCornerRadiiResources(@DimenRes int i10, @DimenRes int i11, @DimenRes int i12, @DimenRes int i13) {
        setBoxCornerRadii(getContext().getResources().getDimension(i10), getContext().getResources().getDimension(i11), getContext().getResources().getDimension(i13), getContext().getResources().getDimension(i12));
    }

    public void setBoxStrokeColor(@ColorInt int i10) {
        if (this.D1 != i10) {
            this.D1 = i10;
            x();
        }
    }

    public void setBoxStrokeColorStateList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.B1 = colorStateList.getDefaultColor();
            this.J1 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.C1 = colorStateList.getColorForState(new int[]{android.R.attr.state_hovered, android.R.attr.state_enabled}, -1);
            this.D1 = colorStateList.getColorForState(new int[]{android.R.attr.state_focused, android.R.attr.state_enabled}, -1);
        } else if (this.D1 != colorStateList.getDefaultColor()) {
            this.D1 = colorStateList.getDefaultColor();
        }
        x();
    }

    public void setBoxStrokeErrorColor(@Nullable ColorStateList colorStateList) {
        if (this.E1 != colorStateList) {
            this.E1 = colorStateList;
            x();
        }
    }

    public void setBoxStrokeWidth(int i10) {
        this.f45582l1 = i10;
        x();
    }

    public void setBoxStrokeWidthFocused(int i10) {
        this.f45583m1 = i10;
        x();
    }

    public void setBoxStrokeWidthFocusedResource(@DimenRes int i10) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i10));
    }

    public void setBoxStrokeWidthResource(@DimenRes int i10) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i10));
    }

    public void setCounterEnabled(boolean z10) {
        if (this.E0 != z10) {
            p pVar = this.f45602y0;
            if (z10) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
                this.I0 = appCompatTextView;
                appCompatTextView.setId(R.id.textinput_counter);
                Typeface typeface = this.f45592s1;
                if (typeface != null) {
                    this.I0.setTypeface(typeface);
                }
                this.I0.setMaxLines(1);
                pVar.a(this.I0, 2);
                MarginLayoutParamsCompat.setMarginStart((ViewGroup.MarginLayoutParams) this.I0.getLayoutParams(), getResources().getDimensionPixelOffset(R.dimen.mtrl_textinput_counter_margin_start));
                o();
                if (this.I0 != null) {
                    EditText editText = this.f45591s0;
                    n(editText != null ? editText.getText() : null);
                }
            } else {
                pVar.g(this.I0, 2);
                this.I0 = null;
            }
            this.E0 = z10;
        }
    }

    public void setCounterMaxLength(int i10) {
        if (this.F0 != i10) {
            if (i10 > 0) {
                this.F0 = i10;
            } else {
                this.F0 = -1;
            }
            if (!this.E0 || this.I0 == null) {
                return;
            }
            EditText editText = this.f45591s0;
            n(editText == null ? null : editText.getText());
        }
    }

    public void setCounterOverflowTextAppearance(int i10) {
        if (this.J0 != i10) {
            this.J0 = i10;
            o();
        }
    }

    public void setCounterOverflowTextColor(@Nullable ColorStateList colorStateList) {
        if (this.T0 != colorStateList) {
            this.T0 = colorStateList;
            o();
        }
    }

    public void setCounterTextAppearance(int i10) {
        if (this.K0 != i10) {
            this.K0 = i10;
            o();
        }
    }

    public void setCounterTextColor(@Nullable ColorStateList colorStateList) {
        if (this.S0 != colorStateList) {
            this.S0 = colorStateList;
            o();
        }
    }

    @RequiresApi(29)
    public void setCursorColor(@Nullable ColorStateList colorStateList) {
        if (this.U0 != colorStateList) {
            this.U0 = colorStateList;
            p();
        }
    }

    @RequiresApi(29)
    public void setCursorErrorColor(@Nullable ColorStateList colorStateList) {
        if (this.V0 != colorStateList) {
            this.V0 = colorStateList;
            if (m() || (this.I0 != null && this.G0)) {
                p();
            }
        }
    }

    public void setDefaultHintTextColor(@Nullable ColorStateList colorStateList) {
        this.f45604z1 = colorStateList;
        this.A1 = colorStateList;
        if (this.f45591s0 != null) {
            u(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        k(this, z10);
        super.setEnabled(z10);
    }

    public void setEndIconActivated(boolean z10) {
        this.f45590r0.v0.setActivated(z10);
    }

    public void setEndIconCheckable(boolean z10) {
        this.f45590r0.v0.setCheckable(z10);
    }

    public void setEndIconContentDescription(@StringRes int i10) {
        m mVar = this.f45590r0;
        CharSequence text = i10 != 0 ? mVar.getResources().getText(i10) : null;
        CheckableImageButton checkableImageButton = mVar.v0;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
    }

    public void setEndIconDrawable(@DrawableRes int i10) {
        m mVar = this.f45590r0;
        Drawable drawable = i10 != 0 ? AppCompatResources.getDrawable(mVar.getContext(), i10) : null;
        CheckableImageButton checkableImageButton = mVar.v0;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = mVar.E0;
            PorterDuff.Mode mode = mVar.F0;
            TextInputLayout textInputLayout = mVar.f45643p0;
            o.a(textInputLayout, checkableImageButton, colorStateList, mode);
            o.c(textInputLayout, checkableImageButton, mVar.E0);
        }
    }

    public void setEndIconMinSize(@IntRange(from = 0) int i10) {
        m mVar = this.f45590r0;
        if (i10 < 0) {
            mVar.getClass();
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i10 != mVar.G0) {
            mVar.G0 = i10;
            CheckableImageButton checkableImageButton = mVar.v0;
            checkableImageButton.setMinimumWidth(i10);
            checkableImageButton.setMinimumHeight(i10);
            CheckableImageButton checkableImageButton2 = mVar.f45645r0;
            checkableImageButton2.setMinimumWidth(i10);
            checkableImageButton2.setMinimumHeight(i10);
        }
    }

    public void setEndIconMode(int i10) {
        this.f45590r0.g(i10);
    }

    public void setEndIconOnClickListener(@Nullable View.OnClickListener onClickListener) {
        m mVar = this.f45590r0;
        View.OnLongClickListener onLongClickListener = mVar.I0;
        CheckableImageButton checkableImageButton = mVar.v0;
        checkableImageButton.setOnClickListener(onClickListener);
        o.d(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(@Nullable View.OnLongClickListener onLongClickListener) {
        m mVar = this.f45590r0;
        mVar.I0 = onLongClickListener;
        CheckableImageButton checkableImageButton = mVar.v0;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        o.d(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(@NonNull ImageView.ScaleType scaleType) {
        m mVar = this.f45590r0;
        mVar.H0 = scaleType;
        mVar.v0.setScaleType(scaleType);
        mVar.f45645r0.setScaleType(scaleType);
    }

    public void setEndIconTintList(@Nullable ColorStateList colorStateList) {
        m mVar = this.f45590r0;
        if (mVar.E0 != colorStateList) {
            mVar.E0 = colorStateList;
            o.a(mVar.f45643p0, mVar.v0, colorStateList, mVar.F0);
        }
    }

    public void setEndIconTintMode(@Nullable PorterDuff.Mode mode) {
        m mVar = this.f45590r0;
        if (mVar.F0 != mode) {
            mVar.F0 = mode;
            o.a(mVar.f45643p0, mVar.v0, mVar.E0, mode);
        }
    }

    public void setEndIconVisible(boolean z10) {
        this.f45590r0.h(z10);
    }

    public void setError(@Nullable CharSequence charSequence) {
        p pVar = this.f45602y0;
        if (!pVar.f45678q) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            pVar.f();
            return;
        }
        pVar.c();
        pVar.f45677p = charSequence;
        pVar.f45679r.setText(charSequence);
        int i10 = pVar.f45675n;
        if (i10 != 1) {
            pVar.f45676o = 1;
        }
        pVar.i(i10, pVar.f45676o, pVar.h(pVar.f45679r, charSequence));
    }

    public void setErrorAccessibilityLiveRegion(int i10) {
        p pVar = this.f45602y0;
        pVar.f45681t = i10;
        AppCompatTextView appCompatTextView = pVar.f45679r;
        if (appCompatTextView != null) {
            ViewCompat.setAccessibilityLiveRegion(appCompatTextView, i10);
        }
    }

    public void setErrorContentDescription(@Nullable CharSequence charSequence) {
        p pVar = this.f45602y0;
        pVar.f45680s = charSequence;
        AppCompatTextView appCompatTextView = pVar.f45679r;
        if (appCompatTextView != null) {
            appCompatTextView.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z10) {
        p pVar = this.f45602y0;
        if (pVar.f45678q == z10) {
            return;
        }
        pVar.c();
        TextInputLayout textInputLayout = pVar.f45670h;
        if (z10) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(pVar.f45669g);
            pVar.f45679r = appCompatTextView;
            appCompatTextView.setId(R.id.textinput_error);
            pVar.f45679r.setTextAlignment(5);
            Typeface typeface = pVar.B;
            if (typeface != null) {
                pVar.f45679r.setTypeface(typeface);
            }
            int i10 = pVar.f45682u;
            pVar.f45682u = i10;
            AppCompatTextView appCompatTextView2 = pVar.f45679r;
            if (appCompatTextView2 != null) {
                textInputLayout.l(appCompatTextView2, i10);
            }
            ColorStateList colorStateList = pVar.f45683v;
            pVar.f45683v = colorStateList;
            AppCompatTextView appCompatTextView3 = pVar.f45679r;
            if (appCompatTextView3 != null && colorStateList != null) {
                appCompatTextView3.setTextColor(colorStateList);
            }
            CharSequence charSequence = pVar.f45680s;
            pVar.f45680s = charSequence;
            AppCompatTextView appCompatTextView4 = pVar.f45679r;
            if (appCompatTextView4 != null) {
                appCompatTextView4.setContentDescription(charSequence);
            }
            int i11 = pVar.f45681t;
            pVar.f45681t = i11;
            AppCompatTextView appCompatTextView5 = pVar.f45679r;
            if (appCompatTextView5 != null) {
                ViewCompat.setAccessibilityLiveRegion(appCompatTextView5, i11);
            }
            pVar.f45679r.setVisibility(4);
            pVar.a(pVar.f45679r, 0);
        } else {
            pVar.f();
            pVar.g(pVar.f45679r, 0);
            pVar.f45679r = null;
            textInputLayout.r();
            textInputLayout.x();
        }
        pVar.f45678q = z10;
    }

    public void setErrorIconDrawable(@DrawableRes int i10) {
        m mVar = this.f45590r0;
        mVar.i(i10 != 0 ? AppCompatResources.getDrawable(mVar.getContext(), i10) : null);
        o.c(mVar.f45643p0, mVar.f45645r0, mVar.f45646s0);
    }

    public void setErrorIconOnClickListener(@Nullable View.OnClickListener onClickListener) {
        m mVar = this.f45590r0;
        CheckableImageButton checkableImageButton = mVar.f45645r0;
        View.OnLongClickListener onLongClickListener = mVar.f45648u0;
        checkableImageButton.setOnClickListener(onClickListener);
        o.d(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(@Nullable View.OnLongClickListener onLongClickListener) {
        m mVar = this.f45590r0;
        mVar.f45648u0 = onLongClickListener;
        CheckableImageButton checkableImageButton = mVar.f45645r0;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        o.d(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(@Nullable ColorStateList colorStateList) {
        m mVar = this.f45590r0;
        if (mVar.f45646s0 != colorStateList) {
            mVar.f45646s0 = colorStateList;
            o.a(mVar.f45643p0, mVar.f45645r0, colorStateList, mVar.f45647t0);
        }
    }

    public void setErrorIconTintMode(@Nullable PorterDuff.Mode mode) {
        m mVar = this.f45590r0;
        if (mVar.f45647t0 != mode) {
            mVar.f45647t0 = mode;
            o.a(mVar.f45643p0, mVar.f45645r0, mVar.f45646s0, mode);
        }
    }

    public void setErrorTextAppearance(@StyleRes int i10) {
        p pVar = this.f45602y0;
        pVar.f45682u = i10;
        AppCompatTextView appCompatTextView = pVar.f45679r;
        if (appCompatTextView != null) {
            pVar.f45670h.l(appCompatTextView, i10);
        }
    }

    public void setErrorTextColor(@Nullable ColorStateList colorStateList) {
        p pVar = this.f45602y0;
        pVar.f45683v = colorStateList;
        AppCompatTextView appCompatTextView = pVar.f45679r;
        if (appCompatTextView == null || colorStateList == null) {
            return;
        }
        appCompatTextView.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z10) {
        if (this.N1 != z10) {
            this.N1 = z10;
            u(false, false);
        }
    }

    public void setHelperText(@Nullable CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            if (isHelperTextEnabled()) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!isHelperTextEnabled()) {
            setHelperTextEnabled(true);
        }
        p pVar = this.f45602y0;
        pVar.c();
        pVar.f45684w = charSequence;
        pVar.f45686y.setText(charSequence);
        int i10 = pVar.f45675n;
        if (i10 != 2) {
            pVar.f45676o = 2;
        }
        pVar.i(i10, pVar.f45676o, pVar.h(pVar.f45686y, charSequence));
    }

    public void setHelperTextColor(@Nullable ColorStateList colorStateList) {
        p pVar = this.f45602y0;
        pVar.A = colorStateList;
        AppCompatTextView appCompatTextView = pVar.f45686y;
        if (appCompatTextView == null || colorStateList == null) {
            return;
        }
        appCompatTextView.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z10) {
        p pVar = this.f45602y0;
        if (pVar.f45685x == z10) {
            return;
        }
        pVar.c();
        if (z10) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(pVar.f45669g);
            pVar.f45686y = appCompatTextView;
            appCompatTextView.setId(R.id.textinput_helper_text);
            pVar.f45686y.setTextAlignment(5);
            Typeface typeface = pVar.B;
            if (typeface != null) {
                pVar.f45686y.setTypeface(typeface);
            }
            pVar.f45686y.setVisibility(4);
            ViewCompat.setAccessibilityLiveRegion(pVar.f45686y, 1);
            int i10 = pVar.f45687z;
            pVar.f45687z = i10;
            AppCompatTextView appCompatTextView2 = pVar.f45686y;
            if (appCompatTextView2 != null) {
                TextViewCompat.setTextAppearance(appCompatTextView2, i10);
            }
            ColorStateList colorStateList = pVar.A;
            pVar.A = colorStateList;
            AppCompatTextView appCompatTextView3 = pVar.f45686y;
            if (appCompatTextView3 != null && colorStateList != null) {
                appCompatTextView3.setTextColor(colorStateList);
            }
            pVar.a(pVar.f45686y, 1);
            pVar.f45686y.setAccessibilityDelegate(new q(pVar));
        } else {
            pVar.c();
            int i11 = pVar.f45675n;
            if (i11 == 2) {
                pVar.f45676o = 0;
            }
            pVar.i(i11, pVar.f45676o, pVar.h(pVar.f45686y, ""));
            pVar.g(pVar.f45686y, 1);
            pVar.f45686y = null;
            TextInputLayout textInputLayout = pVar.f45670h;
            textInputLayout.r();
            textInputLayout.x();
        }
        pVar.f45685x = z10;
    }

    public void setHelperTextTextAppearance(@StyleRes int i10) {
        p pVar = this.f45602y0;
        pVar.f45687z = i10;
        AppCompatTextView appCompatTextView = pVar.f45686y;
        if (appCompatTextView != null) {
            TextViewCompat.setTextAppearance(appCompatTextView, i10);
        }
    }

    public void setHint(@Nullable CharSequence charSequence) {
        if (this.W0) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z10) {
        this.O1 = z10;
    }

    public void setHintEnabled(boolean z10) {
        if (z10 != this.W0) {
            this.W0 = z10;
            if (z10) {
                CharSequence hint = this.f45591s0.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.X0)) {
                        setHint(hint);
                    }
                    this.f45591s0.setHint((CharSequence) null);
                }
                this.Y0 = true;
            } else {
                this.Y0 = false;
                if (!TextUtils.isEmpty(this.X0) && TextUtils.isEmpty(this.f45591s0.getHint())) {
                    this.f45591s0.setHint(this.X0);
                }
                setHintInternal(null);
            }
            if (this.f45591s0 != null) {
                t();
            }
        }
    }

    public void setHintTextAppearance(@StyleRes int i10) {
        CollapsingTextHelper collapsingTextHelper = this.M1;
        collapsingTextHelper.setCollapsedTextAppearance(i10);
        this.A1 = collapsingTextHelper.getCollapsedTextColor();
        if (this.f45591s0 != null) {
            u(false, false);
            t();
        }
    }

    public void setHintTextColor(@Nullable ColorStateList colorStateList) {
        if (this.A1 != colorStateList) {
            if (this.f45604z1 == null) {
                this.M1.setCollapsedTextColor(colorStateList);
            }
            this.A1 = colorStateList;
            if (this.f45591s0 != null) {
                u(false, false);
            }
        }
    }

    public void setLengthCounter(@NonNull LengthCounter lengthCounter) {
        this.H0 = lengthCounter;
    }

    public void setMaxEms(int i10) {
        this.v0 = i10;
        EditText editText = this.f45591s0;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMaxEms(i10);
    }

    public void setMaxWidth(@Px int i10) {
        this.f45600x0 = i10;
        EditText editText = this.f45591s0;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMaxWidth(i10);
    }

    public void setMaxWidthResource(@DimenRes int i10) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i10));
    }

    public void setMinEms(int i10) {
        this.f45595u0 = i10;
        EditText editText = this.f45591s0;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMinEms(i10);
    }

    public void setMinWidth(@Px int i10) {
        this.f45598w0 = i10;
        EditText editText = this.f45591s0;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMinWidth(i10);
    }

    public void setMinWidthResource(@DimenRes int i10) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i10));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(@StringRes int i10) {
        m mVar = this.f45590r0;
        mVar.v0.setContentDescription(i10 != 0 ? mVar.getResources().getText(i10) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(@DrawableRes int i10) {
        m mVar = this.f45590r0;
        mVar.v0.setImageDrawable(i10 != 0 ? AppCompatResources.getDrawable(mVar.getContext(), i10) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z10) {
        m mVar = this.f45590r0;
        if (z10 && mVar.f45650x0 != 1) {
            mVar.g(1);
        } else if (z10) {
            mVar.getClass();
        } else {
            mVar.g(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(@Nullable ColorStateList colorStateList) {
        m mVar = this.f45590r0;
        mVar.E0 = colorStateList;
        o.a(mVar.f45643p0, mVar.v0, colorStateList, mVar.F0);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(@Nullable PorterDuff.Mode mode) {
        m mVar = this.f45590r0;
        mVar.F0 = mode;
        o.a(mVar.f45643p0, mVar.v0, mVar.E0, mode);
    }

    public void setPlaceholderText(@Nullable CharSequence charSequence) {
        if (this.N0 == null) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
            this.N0 = appCompatTextView;
            appCompatTextView.setId(R.id.textinput_placeholder);
            ViewCompat.setImportantForAccessibility(this.N0, 2);
            Fade fadeD = d();
            this.Q0 = fadeD;
            fadeD.setStartDelay(67L);
            this.R0 = d();
            setPlaceholderTextAppearance(this.P0);
            setPlaceholderTextColor(this.O0);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.M0) {
                setPlaceholderTextEnabled(true);
            }
            this.L0 = charSequence;
        }
        EditText editText = this.f45591s0;
        v(editText == null ? null : editText.getText());
    }

    public void setPlaceholderTextAppearance(@StyleRes int i10) {
        this.P0 = i10;
        AppCompatTextView appCompatTextView = this.N0;
        if (appCompatTextView != null) {
            TextViewCompat.setTextAppearance(appCompatTextView, i10);
        }
    }

    public void setPlaceholderTextColor(@Nullable ColorStateList colorStateList) {
        if (this.O0 != colorStateList) {
            this.O0 = colorStateList;
            AppCompatTextView appCompatTextView = this.N0;
            if (appCompatTextView == null || colorStateList == null) {
                return;
            }
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(@Nullable CharSequence charSequence) {
        t tVar = this.f45588q0;
        tVar.getClass();
        tVar.f45699r0 = TextUtils.isEmpty(charSequence) ? null : charSequence;
        tVar.f45698q0.setText(charSequence);
        tVar.e();
    }

    public void setPrefixTextAppearance(@StyleRes int i10) {
        TextViewCompat.setTextAppearance(this.f45588q0.f45698q0, i10);
    }

    public void setPrefixTextColor(@NonNull ColorStateList colorStateList) {
        this.f45588q0.f45698q0.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(@NonNull ShapeAppearanceModel shapeAppearanceModel) {
        MaterialShapeDrawable materialShapeDrawable = this.Z0;
        if (materialShapeDrawable == null || materialShapeDrawable.getShapeAppearanceModel() == shapeAppearanceModel) {
            return;
        }
        this.f45576f1 = shapeAppearanceModel;
        b();
    }

    public void setStartIconCheckable(boolean z10) {
        this.f45588q0.f45700s0.setCheckable(z10);
    }

    public void setStartIconContentDescription(@Nullable CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f45588q0.f45700s0;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(@DrawableRes int i10) {
        setStartIconDrawable(i10 != 0 ? AppCompatResources.getDrawable(getContext(), i10) : null);
    }

    public void setStartIconMinSize(@IntRange(from = 0) int i10) {
        t tVar = this.f45588q0;
        if (i10 < 0) {
            tVar.getClass();
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i10 != tVar.v0) {
            tVar.v0 = i10;
            CheckableImageButton checkableImageButton = tVar.f45700s0;
            checkableImageButton.setMinimumWidth(i10);
            checkableImageButton.setMinimumHeight(i10);
        }
    }

    public void setStartIconOnClickListener(@Nullable View.OnClickListener onClickListener) {
        t tVar = this.f45588q0;
        View.OnLongClickListener onLongClickListener = tVar.f45704x0;
        CheckableImageButton checkableImageButton = tVar.f45700s0;
        checkableImageButton.setOnClickListener(onClickListener);
        o.d(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(@Nullable View.OnLongClickListener onLongClickListener) {
        t tVar = this.f45588q0;
        tVar.f45704x0 = onLongClickListener;
        CheckableImageButton checkableImageButton = tVar.f45700s0;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        o.d(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(@NonNull ImageView.ScaleType scaleType) {
        t tVar = this.f45588q0;
        tVar.f45703w0 = scaleType;
        tVar.f45700s0.setScaleType(scaleType);
    }

    public void setStartIconTintList(@Nullable ColorStateList colorStateList) {
        t tVar = this.f45588q0;
        if (tVar.f45701t0 != colorStateList) {
            tVar.f45701t0 = colorStateList;
            o.a(tVar.f45697p0, tVar.f45700s0, colorStateList, tVar.f45702u0);
        }
    }

    public void setStartIconTintMode(@Nullable PorterDuff.Mode mode) {
        t tVar = this.f45588q0;
        if (tVar.f45702u0 != mode) {
            tVar.f45702u0 = mode;
            o.a(tVar.f45697p0, tVar.f45700s0, tVar.f45701t0, mode);
        }
    }

    public void setStartIconVisible(boolean z10) {
        this.f45588q0.c(z10);
    }

    public void setSuffixText(@Nullable CharSequence charSequence) {
        m mVar = this.f45590r0;
        mVar.getClass();
        mVar.J0 = TextUtils.isEmpty(charSequence) ? null : charSequence;
        mVar.K0.setText(charSequence);
        mVar.n();
    }

    public void setSuffixTextAppearance(@StyleRes int i10) {
        TextViewCompat.setTextAppearance(this.f45590r0.K0, i10);
    }

    public void setSuffixTextColor(@NonNull ColorStateList colorStateList) {
        this.f45590r0.K0.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(@Nullable AccessibilityDelegate accessibilityDelegate) {
        EditText editText = this.f45591s0;
        if (editText != null) {
            ViewCompat.setAccessibilityDelegate(editText, accessibilityDelegate);
        }
    }

    public void setTypeface(@Nullable Typeface typeface) {
        if (typeface != this.f45592s1) {
            this.f45592s1 = typeface;
            this.M1.setTypefaces(typeface);
            p pVar = this.f45602y0;
            if (typeface != pVar.B) {
                pVar.B = typeface;
                AppCompatTextView appCompatTextView = pVar.f45679r;
                if (appCompatTextView != null) {
                    appCompatTextView.setTypeface(typeface);
                }
                AppCompatTextView appCompatTextView2 = pVar.f45686y;
                if (appCompatTextView2 != null) {
                    appCompatTextView2.setTypeface(typeface);
                }
            }
            AppCompatTextView appCompatTextView3 = this.I0;
            if (appCompatTextView3 != null) {
                appCompatTextView3.setTypeface(typeface);
            }
        }
    }

    public final void t() {
        if (this.f45579i1 != 1) {
            FrameLayout frameLayout = this.f45586p0;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int iC = c();
            if (iC != layoutParams.topMargin) {
                layoutParams.topMargin = iC;
                frameLayout.requestLayout();
            }
        }
    }

    public final void u(boolean z10, boolean z11) {
        ColorStateList colorStateList;
        AppCompatTextView appCompatTextView;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.f45591s0;
        boolean z12 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f45591s0;
        boolean z13 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.f45604z1;
        CollapsingTextHelper collapsingTextHelper = this.M1;
        if (colorStateList2 != null) {
            collapsingTextHelper.setCollapsedAndExpandedTextColor(colorStateList2);
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList3 = this.f45604z1;
            collapsingTextHelper.setCollapsedAndExpandedTextColor(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.J1) : this.J1));
        } else if (m()) {
            AppCompatTextView appCompatTextView2 = this.f45602y0.f45679r;
            collapsingTextHelper.setCollapsedAndExpandedTextColor(appCompatTextView2 != null ? appCompatTextView2.getTextColors() : null);
        } else if (this.G0 && (appCompatTextView = this.I0) != null) {
            collapsingTextHelper.setCollapsedAndExpandedTextColor(appCompatTextView.getTextColors());
        } else if (z13 && (colorStateList = this.A1) != null) {
            collapsingTextHelper.setCollapsedTextColor(colorStateList);
        }
        m mVar = this.f45590r0;
        t tVar = this.f45588q0;
        if (z12 || !this.N1 || (isEnabled() && z13)) {
            if (z11 || this.L1) {
                ValueAnimator valueAnimator = this.P1;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.P1.cancel();
                }
                if (z10 && this.O1) {
                    a(1.0f);
                } else {
                    collapsingTextHelper.setExpansionFraction(1.0f);
                }
                this.L1 = false;
                if (e()) {
                    j();
                }
                EditText editText3 = this.f45591s0;
                v(editText3 != null ? editText3.getText() : null);
                tVar.f45705y0 = false;
                tVar.e();
                mVar.L0 = false;
                mVar.n();
                return;
            }
            return;
        }
        if (z11 || !this.L1) {
            ValueAnimator valueAnimator2 = this.P1;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.P1.cancel();
            }
            if (z10 && this.O1) {
                a(0.0f);
            } else {
                collapsingTextHelper.setExpansionFraction(0.0f);
            }
            if (e() && (!((g) this.Z0).S0.f45625v.isEmpty()) && e()) {
                ((g) this.Z0).i(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.L1 = true;
            AppCompatTextView appCompatTextView3 = this.N0;
            if (appCompatTextView3 != null && this.M0) {
                appCompatTextView3.setText((CharSequence) null);
                TransitionManager.beginDelayedTransition(this.f45586p0, this.R0);
                this.N0.setVisibility(4);
            }
            tVar.f45705y0 = true;
            tVar.e();
            mVar.L0 = true;
            mVar.n();
        }
    }

    public final void v(@Nullable Editable editable) {
        int iCountLength = this.H0.countLength(editable);
        FrameLayout frameLayout = this.f45586p0;
        if (iCountLength != 0 || this.L1) {
            AppCompatTextView appCompatTextView = this.N0;
            if (appCompatTextView == null || !this.M0) {
                return;
            }
            appCompatTextView.setText((CharSequence) null);
            TransitionManager.beginDelayedTransition(frameLayout, this.R0);
            this.N0.setVisibility(4);
            return;
        }
        if (this.N0 == null || !this.M0 || TextUtils.isEmpty(this.L0)) {
            return;
        }
        this.N0.setText(this.L0);
        TransitionManager.beginDelayedTransition(frameLayout, this.Q0);
        this.N0.setVisibility(0);
        this.N0.bringToFront();
        announceForAccessibility(this.L0);
    }

    public final void w(boolean z10, boolean z11) {
        int defaultColor = this.E1.getDefaultColor();
        int colorForState = this.E1.getColorForState(new int[]{android.R.attr.state_hovered, android.R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.E1.getColorForState(new int[]{android.R.attr.state_activated, android.R.attr.state_enabled}, defaultColor);
        if (z10) {
            this.f45584n1 = colorForState2;
        } else if (z11) {
            this.f45584n1 = colorForState;
        } else {
            this.f45584n1 = defaultColor;
        }
    }

    public final void x() {
        AppCompatTextView appCompatTextView;
        EditText editText;
        EditText editText2;
        if (this.Z0 == null || this.f45579i1 == 0) {
            return;
        }
        boolean z10 = false;
        boolean z11 = isFocused() || ((editText2 = this.f45591s0) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.f45591s0) != null && editText.isHovered())) {
            z10 = true;
        }
        if (!isEnabled()) {
            this.f45584n1 = this.J1;
        } else if (m()) {
            if (this.E1 != null) {
                w(z11, z10);
            } else {
                this.f45584n1 = getErrorCurrentTextColors();
            }
        } else if (!this.G0 || (appCompatTextView = this.I0) == null) {
            if (z11) {
                this.f45584n1 = this.D1;
            } else if (z10) {
                this.f45584n1 = this.C1;
            } else {
                this.f45584n1 = this.B1;
            }
        } else if (this.E1 != null) {
            w(z11, z10);
        } else {
            this.f45584n1 = appCompatTextView.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            p();
        }
        m mVar = this.f45590r0;
        mVar.l();
        CheckableImageButton checkableImageButton = mVar.f45645r0;
        ColorStateList colorStateList = mVar.f45646s0;
        TextInputLayout textInputLayout = mVar.f45643p0;
        o.c(textInputLayout, checkableImageButton, colorStateList);
        ColorStateList colorStateList2 = mVar.E0;
        CheckableImageButton checkableImageButton2 = mVar.v0;
        o.c(textInputLayout, checkableImageButton2, colorStateList2);
        if (mVar.b() instanceof l) {
            if (!textInputLayout.m() || checkableImageButton2.getDrawable() == null) {
                o.a(textInputLayout, checkableImageButton2, mVar.E0, mVar.F0);
            } else {
                Drawable drawableMutate = DrawableCompat.wrap(checkableImageButton2.getDrawable()).mutate();
                DrawableCompat.setTint(drawableMutate, textInputLayout.getErrorCurrentTextColors());
                checkableImageButton2.setImageDrawable(drawableMutate);
            }
        }
        refreshStartIconDrawableState();
        if (this.f45579i1 == 2) {
            int i10 = this.f45581k1;
            if (z11 && isEnabled()) {
                this.f45581k1 = this.f45583m1;
            } else {
                this.f45581k1 = this.f45582l1;
            }
            if (this.f45581k1 != i10 && e() && !this.L1) {
                if (e()) {
                    ((g) this.Z0).i(0.0f, 0.0f, 0.0f, 0.0f);
                }
                j();
            }
        }
        if (this.f45579i1 == 1) {
            if (!isEnabled()) {
                this.f45585o1 = this.G1;
            } else if (z10 && !z11) {
                this.f45585o1 = this.I1;
            } else if (z11) {
                this.f45585o1 = this.H1;
            } else {
                this.f45585o1 = this.F1;
            }
        }
        b();
    }

    public TextInputLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textInputStyle);
    }

    public void setStartIconDrawable(@Nullable Drawable drawable) {
        this.f45588q0.b(drawable);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TextInputLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        int i11 = T1;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i10, i11), attributeSet, i10);
        this.f45595u0 = -1;
        this.v0 = -1;
        this.f45598w0 = -1;
        this.f45600x0 = -1;
        this.f45602y0 = new p(this);
        this.H0 = new androidx.constraintlayout.core.state.a();
        this.f45587p1 = new Rect();
        this.f45589q1 = new Rect();
        this.r1 = new RectF();
        this.f45597v1 = new LinkedHashSet<>();
        CollapsingTextHelper collapsingTextHelper = new CollapsingTextHelper(this);
        this.M1 = collapsingTextHelper;
        this.S1 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f45586p0 = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        TimeInterpolator timeInterpolator = AnimationUtils.LINEAR_INTERPOLATOR;
        collapsingTextHelper.setTextSizeInterpolator(timeInterpolator);
        collapsingTextHelper.setPositionInterpolator(timeInterpolator);
        collapsingTextHelper.setCollapsedTextGravity(8388659);
        int[] iArr = R.styleable.TextInputLayout;
        int i12 = R.styleable.TextInputLayout_counterTextAppearance;
        int i13 = R.styleable.TextInputLayout_counterOverflowTextAppearance;
        int i14 = R.styleable.TextInputLayout_errorTextAppearance;
        int i15 = R.styleable.TextInputLayout_helperTextTextAppearance;
        int i16 = R.styleable.TextInputLayout_hintTextAppearance;
        TintTypedArray tintTypedArrayObtainTintedStyledAttributes = ThemeEnforcement.obtainTintedStyledAttributes(context2, attributeSet, iArr, i10, i11, i12, i13, i14, i15, i16);
        t tVar = new t(this, tintTypedArrayObtainTintedStyledAttributes);
        this.f45588q0 = tVar;
        this.W0 = tintTypedArrayObtainTintedStyledAttributes.getBoolean(R.styleable.TextInputLayout_hintEnabled, true);
        setHint(tintTypedArrayObtainTintedStyledAttributes.getText(R.styleable.TextInputLayout_android_hint));
        this.O1 = tintTypedArrayObtainTintedStyledAttributes.getBoolean(R.styleable.TextInputLayout_hintAnimationEnabled, true);
        this.N1 = tintTypedArrayObtainTintedStyledAttributes.getBoolean(R.styleable.TextInputLayout_expandedHintEnabled, true);
        int i17 = R.styleable.TextInputLayout_android_minEms;
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(i17)) {
            setMinEms(tintTypedArrayObtainTintedStyledAttributes.getInt(i17, -1));
        } else {
            int i18 = R.styleable.TextInputLayout_android_minWidth;
            if (tintTypedArrayObtainTintedStyledAttributes.hasValue(i18)) {
                setMinWidth(tintTypedArrayObtainTintedStyledAttributes.getDimensionPixelSize(i18, -1));
            }
        }
        int i19 = R.styleable.TextInputLayout_android_maxEms;
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(i19)) {
            setMaxEms(tintTypedArrayObtainTintedStyledAttributes.getInt(i19, -1));
        } else {
            int i20 = R.styleable.TextInputLayout_android_maxWidth;
            if (tintTypedArrayObtainTintedStyledAttributes.hasValue(i20)) {
                setMaxWidth(tintTypedArrayObtainTintedStyledAttributes.getDimensionPixelSize(i20, -1));
            }
        }
        this.f45576f1 = ShapeAppearanceModel.builder(context2, attributeSet, i10, i11).build();
        this.f45578h1 = context2.getResources().getDimensionPixelOffset(R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.f45580j1 = tintTypedArrayObtainTintedStyledAttributes.getDimensionPixelOffset(R.styleable.TextInputLayout_boxCollapsedPaddingTop, 0);
        this.f45582l1 = tintTypedArrayObtainTintedStyledAttributes.getDimensionPixelSize(R.styleable.TextInputLayout_boxStrokeWidth, context2.getResources().getDimensionPixelSize(R.dimen.mtrl_textinput_box_stroke_width_default));
        this.f45583m1 = tintTypedArrayObtainTintedStyledAttributes.getDimensionPixelSize(R.styleable.TextInputLayout_boxStrokeWidthFocused, context2.getResources().getDimensionPixelSize(R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.f45581k1 = this.f45582l1;
        float dimension = tintTypedArrayObtainTintedStyledAttributes.getDimension(R.styleable.TextInputLayout_boxCornerRadiusTopStart, -1.0f);
        float dimension2 = tintTypedArrayObtainTintedStyledAttributes.getDimension(R.styleable.TextInputLayout_boxCornerRadiusTopEnd, -1.0f);
        float dimension3 = tintTypedArrayObtainTintedStyledAttributes.getDimension(R.styleable.TextInputLayout_boxCornerRadiusBottomEnd, -1.0f);
        float dimension4 = tintTypedArrayObtainTintedStyledAttributes.getDimension(R.styleable.TextInputLayout_boxCornerRadiusBottomStart, -1.0f);
        ShapeAppearanceModel.Builder builder = this.f45576f1.toBuilder();
        if (dimension >= 0.0f) {
            builder.setTopLeftCornerSize(dimension);
        }
        if (dimension2 >= 0.0f) {
            builder.setTopRightCornerSize(dimension2);
        }
        if (dimension3 >= 0.0f) {
            builder.setBottomRightCornerSize(dimension3);
        }
        if (dimension4 >= 0.0f) {
            builder.setBottomLeftCornerSize(dimension4);
        }
        this.f45576f1 = builder.build();
        ColorStateList colorStateList = MaterialResources.getColorStateList(context2, tintTypedArrayObtainTintedStyledAttributes, R.styleable.TextInputLayout_boxBackgroundColor);
        if (colorStateList != null) {
            int defaultColor = colorStateList.getDefaultColor();
            this.F1 = defaultColor;
            this.f45585o1 = defaultColor;
            if (colorStateList.isStateful()) {
                this.G1 = colorStateList.getColorForState(new int[]{-16842910}, -1);
                this.H1 = colorStateList.getColorForState(new int[]{android.R.attr.state_focused, android.R.attr.state_enabled}, -1);
                this.I1 = colorStateList.getColorForState(new int[]{android.R.attr.state_hovered, android.R.attr.state_enabled}, -1);
            } else {
                this.H1 = this.F1;
                ColorStateList colorStateList2 = AppCompatResources.getColorStateList(context2, R.color.mtrl_filled_background_color);
                this.G1 = colorStateList2.getColorForState(new int[]{-16842910}, -1);
                this.I1 = colorStateList2.getColorForState(new int[]{android.R.attr.state_hovered}, -1);
            }
        } else {
            this.f45585o1 = 0;
            this.F1 = 0;
            this.G1 = 0;
            this.H1 = 0;
            this.I1 = 0;
        }
        int i21 = R.styleable.TextInputLayout_android_textColorHint;
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(i21)) {
            ColorStateList colorStateList3 = tintTypedArrayObtainTintedStyledAttributes.getColorStateList(i21);
            this.A1 = colorStateList3;
            this.f45604z1 = colorStateList3;
        }
        int i22 = R.styleable.TextInputLayout_boxStrokeColor;
        ColorStateList colorStateList4 = MaterialResources.getColorStateList(context2, tintTypedArrayObtainTintedStyledAttributes, i22);
        this.D1 = tintTypedArrayObtainTintedStyledAttributes.getColor(i22, 0);
        this.B1 = ContextCompat.getColor(context2, R.color.mtrl_textinput_default_box_stroke_color);
        this.J1 = ContextCompat.getColor(context2, R.color.mtrl_textinput_disabled_color);
        this.C1 = ContextCompat.getColor(context2, R.color.mtrl_textinput_hovered_box_stroke_color);
        if (colorStateList4 != null) {
            setBoxStrokeColorStateList(colorStateList4);
        }
        int i23 = R.styleable.TextInputLayout_boxStrokeErrorColor;
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(i23)) {
            setBoxStrokeErrorColor(MaterialResources.getColorStateList(context2, tintTypedArrayObtainTintedStyledAttributes, i23));
        }
        if (tintTypedArrayObtainTintedStyledAttributes.getResourceId(i16, -1) != -1) {
            setHintTextAppearance(tintTypedArrayObtainTintedStyledAttributes.getResourceId(i16, 0));
        }
        this.U0 = tintTypedArrayObtainTintedStyledAttributes.getColorStateList(R.styleable.TextInputLayout_cursorColor);
        this.V0 = tintTypedArrayObtainTintedStyledAttributes.getColorStateList(R.styleable.TextInputLayout_cursorErrorColor);
        int resourceId = tintTypedArrayObtainTintedStyledAttributes.getResourceId(i14, 0);
        CharSequence text = tintTypedArrayObtainTintedStyledAttributes.getText(R.styleable.TextInputLayout_errorContentDescription);
        int i24 = tintTypedArrayObtainTintedStyledAttributes.getInt(R.styleable.TextInputLayout_errorAccessibilityLiveRegion, 1);
        boolean z10 = tintTypedArrayObtainTintedStyledAttributes.getBoolean(R.styleable.TextInputLayout_errorEnabled, false);
        int resourceId2 = tintTypedArrayObtainTintedStyledAttributes.getResourceId(i15, 0);
        boolean z11 = tintTypedArrayObtainTintedStyledAttributes.getBoolean(R.styleable.TextInputLayout_helperTextEnabled, false);
        CharSequence text2 = tintTypedArrayObtainTintedStyledAttributes.getText(R.styleable.TextInputLayout_helperText);
        int resourceId3 = tintTypedArrayObtainTintedStyledAttributes.getResourceId(R.styleable.TextInputLayout_placeholderTextAppearance, 0);
        CharSequence text3 = tintTypedArrayObtainTintedStyledAttributes.getText(R.styleable.TextInputLayout_placeholderText);
        boolean z12 = tintTypedArrayObtainTintedStyledAttributes.getBoolean(R.styleable.TextInputLayout_counterEnabled, false);
        setCounterMaxLength(tintTypedArrayObtainTintedStyledAttributes.getInt(R.styleable.TextInputLayout_counterMaxLength, -1));
        this.K0 = tintTypedArrayObtainTintedStyledAttributes.getResourceId(i12, 0);
        this.J0 = tintTypedArrayObtainTintedStyledAttributes.getResourceId(i13, 0);
        setBoxBackgroundMode(tintTypedArrayObtainTintedStyledAttributes.getInt(R.styleable.TextInputLayout_boxBackgroundMode, 0));
        setErrorContentDescription(text);
        setErrorAccessibilityLiveRegion(i24);
        setCounterOverflowTextAppearance(this.J0);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.K0);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        int i25 = R.styleable.TextInputLayout_errorTextColor;
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(i25)) {
            setErrorTextColor(tintTypedArrayObtainTintedStyledAttributes.getColorStateList(i25));
        }
        int i26 = R.styleable.TextInputLayout_helperTextTextColor;
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(i26)) {
            setHelperTextColor(tintTypedArrayObtainTintedStyledAttributes.getColorStateList(i26));
        }
        int i27 = R.styleable.TextInputLayout_hintTextColor;
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(i27)) {
            setHintTextColor(tintTypedArrayObtainTintedStyledAttributes.getColorStateList(i27));
        }
        int i28 = R.styleable.TextInputLayout_counterTextColor;
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(i28)) {
            setCounterTextColor(tintTypedArrayObtainTintedStyledAttributes.getColorStateList(i28));
        }
        int i29 = R.styleable.TextInputLayout_counterOverflowTextColor;
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(i29)) {
            setCounterOverflowTextColor(tintTypedArrayObtainTintedStyledAttributes.getColorStateList(i29));
        }
        int i30 = R.styleable.TextInputLayout_placeholderTextColor;
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(i30)) {
            setPlaceholderTextColor(tintTypedArrayObtainTintedStyledAttributes.getColorStateList(i30));
        }
        m mVar = new m(this, tintTypedArrayObtainTintedStyledAttributes);
        this.f45590r0 = mVar;
        boolean z13 = tintTypedArrayObtainTintedStyledAttributes.getBoolean(R.styleable.TextInputLayout_android_enabled, true);
        tintTypedArrayObtainTintedStyledAttributes.recycle();
        ViewCompat.setImportantForAccessibility(this, 2);
        if (Build.VERSION.SDK_INT >= 26) {
            ViewCompat.setImportantForAutofill(this, 1);
        }
        frameLayout.addView(tVar);
        frameLayout.addView(mVar);
        addView(frameLayout);
        setEnabled(z13);
        setHelperTextEnabled(z11);
        setErrorEnabled(z10);
        setCounterEnabled(z12);
        setHelperText(text2);
    }

    public void setHint(@StringRes int i10) {
        setHint(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setStartIconContentDescription(@StringRes int i10) {
        setStartIconContentDescription(i10 != 0 ? getResources().getText(i10) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(@Nullable CharSequence charSequence) {
        this.f45590r0.v0.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(@Nullable Drawable drawable) {
        this.f45590r0.v0.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(@Nullable Drawable drawable) {
        this.f45590r0.i(drawable);
    }

    public void setEndIconContentDescription(@Nullable CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f45590r0.v0;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(@Nullable Drawable drawable) {
        m mVar = this.f45590r0;
        CheckableImageButton checkableImageButton = mVar.v0;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = mVar.E0;
            PorterDuff.Mode mode = mVar.F0;
            TextInputLayout textInputLayout = mVar.f45643p0;
            o.a(textInputLayout, checkableImageButton, colorStateList, mode);
            o.c(textInputLayout, checkableImageButton, mVar.E0);
        }
    }

    public class a implements TextWatcher {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f45608p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ EditText f45609q0;

        public a(EditText editText) {
            this.f45609q0 = editText;
            this.f45608p0 = editText.getLineCount();
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(@NonNull Editable editable) {
            TextInputLayout textInputLayout = TextInputLayout.this;
            textInputLayout.u(!textInputLayout.R1, false);
            if (textInputLayout.E0) {
                textInputLayout.n(editable);
            }
            if (textInputLayout.M0) {
                textInputLayout.v(editable);
            }
            EditText editText = this.f45609q0;
            int lineCount = editText.getLineCount();
            int i10 = this.f45608p0;
            if (lineCount != i10) {
                if (lineCount < i10) {
                    int minimumHeight = ViewCompat.getMinimumHeight(editText);
                    int i11 = textInputLayout.K1;
                    if (minimumHeight != i11) {
                        editText.setMinimumHeight(i11);
                    }
                }
                this.f45608p0 = lineCount;
            }
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }
}
