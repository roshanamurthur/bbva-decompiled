package androidx.appcompat.widget;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import android.widget.CompoundButton;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.text.AllCapsTransformationMethod;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TextViewCompat;
import androidx.emoji2.text.EmojiCompat;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class SwitchCompat extends CompoundButton implements EmojiCompatConfigurationView {

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public static final a f1450l1 = new a(Float.class, "thumbPos");

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public static final int[] f1451m1 = {R.attr.state_checked};
    public int E0;
    public int F0;
    public int G0;
    public boolean H0;
    public CharSequence I0;
    public CharSequence J0;
    public CharSequence K0;
    public CharSequence L0;
    public boolean M0;
    public int N0;
    public final int O0;
    public float P0;
    public float Q0;
    public final VelocityTracker R0;
    public final int S0;
    public float T0;
    public int U0;
    public int V0;
    public int W0;
    public int X0;
    public int Y0;
    public int Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public int f1452a1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public boolean f1453b1;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public final TextPaint f1454c1;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public ColorStateList f1455d1;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public StaticLayout f1456e1;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public StaticLayout f1457f1;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    @Nullable
    public AllCapsTransformationMethod f1458g1;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public ObjectAnimator f1459h1;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    @NonNull
    public y f1460i1;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    @Nullable
    public b f1461j1;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public final Rect f1462k1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public Drawable f1463p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ColorStateList f1464q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public PorterDuff.Mode f1465r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public boolean f1466s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public boolean f1467t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public Drawable f1468u0;
    public ColorStateList v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public PorterDuff.Mode f1469w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public boolean f1470x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public boolean f1471y0;

    @RequiresApi(29)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f1472a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f1473b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f1474c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f1475d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f1476e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f1477f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f1478g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f1479h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f1480i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f1481j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f1482k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f1483l;
        public int m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f1484n;

        public void mapProperties(@NonNull PropertyMapper propertyMapper) {
            this.f1473b = propertyMapper.mapObject("textOff", R.attr.textOff);
            this.f1474c = propertyMapper.mapObject("textOn", R.attr.textOn);
            this.f1475d = propertyMapper.mapObject("thumb", R.attr.thumb);
            this.f1476e = propertyMapper.mapBoolean("showText", androidx.appcompat.R.attr.showText);
            this.f1477f = propertyMapper.mapBoolean("splitTrack", androidx.appcompat.R.attr.splitTrack);
            this.f1478g = propertyMapper.mapInt("switchMinWidth", androidx.appcompat.R.attr.switchMinWidth);
            this.f1479h = propertyMapper.mapInt("switchPadding", androidx.appcompat.R.attr.switchPadding);
            this.f1480i = propertyMapper.mapInt("thumbTextPadding", androidx.appcompat.R.attr.thumbTextPadding);
            this.f1481j = propertyMapper.mapObject("thumbTint", androidx.appcompat.R.attr.thumbTint);
            this.f1482k = propertyMapper.mapObject("thumbTintMode", androidx.appcompat.R.attr.thumbTintMode);
            this.f1483l = propertyMapper.mapObject("track", androidx.appcompat.R.attr.track);
            this.m = propertyMapper.mapObject("trackTint", androidx.appcompat.R.attr.trackTint);
            this.f1484n = propertyMapper.mapObject("trackTintMode", androidx.appcompat.R.attr.trackTintMode);
            this.f1472a = true;
        }

        public void readProperties(@NonNull SwitchCompat switchCompat, @NonNull PropertyReader propertyReader) {
            if (!this.f1472a) {
                throw j.c();
            }
            propertyReader.readObject(this.f1473b, switchCompat.getTextOff());
            propertyReader.readObject(this.f1474c, switchCompat.getTextOn());
            propertyReader.readObject(this.f1475d, switchCompat.getThumbDrawable());
            propertyReader.readBoolean(this.f1476e, switchCompat.getShowText());
            propertyReader.readBoolean(this.f1477f, switchCompat.getSplitTrack());
            propertyReader.readInt(this.f1478g, switchCompat.getSwitchMinWidth());
            propertyReader.readInt(this.f1479h, switchCompat.getSwitchPadding());
            propertyReader.readInt(this.f1480i, switchCompat.getThumbTextPadding());
            propertyReader.readObject(this.f1481j, switchCompat.getThumbTintList());
            propertyReader.readObject(this.f1482k, switchCompat.getThumbTintMode());
            propertyReader.readObject(this.f1483l, switchCompat.getTrackDrawable());
            propertyReader.readObject(this.m, switchCompat.getTrackTintList());
            propertyReader.readObject(this.f1484n, switchCompat.getTrackTintMode());
        }
    }

    public class a extends Property<SwitchCompat, Float> {
        @Override // android.util.Property
        public final Float get(SwitchCompat switchCompat) {
            return Float.valueOf(switchCompat.T0);
        }

        @Override // android.util.Property
        public final void set(SwitchCompat switchCompat, Float f6) {
            switchCompat.setThumbPosition(f6.floatValue());
        }
    }

    public static class b extends EmojiCompat.InitCallback {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final WeakReference f1485p0;

        public b(SwitchCompat switchCompat) {
            this.f1485p0 = new WeakReference(switchCompat);
        }

        @Override // androidx.emoji2.text.EmojiCompat.InitCallback
        public final void onFailed(@Nullable Throwable th2) {
            SwitchCompat switchCompat = (SwitchCompat) this.f1485p0.get();
            if (switchCompat != null) {
                switchCompat.c();
            }
        }

        @Override // androidx.emoji2.text.EmojiCompat.InitCallback
        public final void onInitialized() {
            SwitchCompat switchCompat = (SwitchCompat) this.f1485p0.get();
            if (switchCompat != null) {
                switchCompat.c();
            }
        }
    }

    public SwitchCompat(@NonNull Context context) {
        this(context, null);
    }

    @NonNull
    private y getEmojiTextViewHelper() {
        if (this.f1460i1 == null) {
            this.f1460i1 = new y(this);
        }
        return this.f1460i1;
    }

    private boolean getTargetCheckedState() {
        return this.T0 > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((ViewUtils.isLayoutRtl(this) ? 1.0f - this.T0 : this.T0) * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f1468u0;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.f1462k1;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f1463p0;
        Rect opticalBounds = drawable2 != null ? DrawableUtils.getOpticalBounds(drawable2) : DrawableUtils.INSETS_NONE;
        return ((((this.U0 - this.W0) - rect.left) - rect.right) - opticalBounds.left) - opticalBounds.right;
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.K0 = charSequence;
        y emojiTextViewHelper = getEmojiTextViewHelper();
        TransformationMethod transformationMethodWrapTransformationMethod = emojiTextViewHelper.f1700b.wrapTransformationMethod(this.f1458g1);
        if (transformationMethodWrapTransformationMethod != null) {
            charSequence = transformationMethodWrapTransformationMethod.getTransformation(charSequence, this);
        }
        this.L0 = charSequence;
        this.f1457f1 = null;
        if (this.M0) {
            d();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.I0 = charSequence;
        y emojiTextViewHelper = getEmojiTextViewHelper();
        TransformationMethod transformationMethodWrapTransformationMethod = emojiTextViewHelper.f1700b.wrapTransformationMethod(this.f1458g1);
        if (transformationMethodWrapTransformationMethod != null) {
            charSequence = transformationMethodWrapTransformationMethod.getTransformation(charSequence, this);
        }
        this.J0 = charSequence;
        this.f1456e1 = null;
        if (this.M0) {
            d();
        }
    }

    public final void a() {
        Drawable drawable = this.f1463p0;
        if (drawable != null) {
            if (this.f1466s0 || this.f1467t0) {
                Drawable drawableMutate = DrawableCompat.wrap(drawable).mutate();
                this.f1463p0 = drawableMutate;
                if (this.f1466s0) {
                    DrawableCompat.setTintList(drawableMutate, this.f1464q0);
                }
                if (this.f1467t0) {
                    DrawableCompat.setTintMode(this.f1463p0, this.f1465r0);
                }
                if (this.f1463p0.isStateful()) {
                    this.f1463p0.setState(getDrawableState());
                }
            }
        }
    }

    public final void b() {
        Drawable drawable = this.f1468u0;
        if (drawable != null) {
            if (this.f1470x0 || this.f1471y0) {
                Drawable drawableMutate = DrawableCompat.wrap(drawable).mutate();
                this.f1468u0 = drawableMutate;
                if (this.f1470x0) {
                    DrawableCompat.setTintList(drawableMutate, this.v0);
                }
                if (this.f1471y0) {
                    DrawableCompat.setTintMode(this.f1468u0, this.f1469w0);
                }
                if (this.f1468u0.isStateful()) {
                    this.f1468u0.setState(getDrawableState());
                }
            }
        }
    }

    public final void c() {
        setTextOnInternal(this.I0);
        setTextOffInternal(this.K0);
        requestLayout();
    }

    public final void d() {
        if (this.f1461j1 == null && this.f1460i1.f1700b.isEnabled() && EmojiCompat.isConfigured()) {
            EmojiCompat emojiCompat = EmojiCompat.get();
            int loadState = emojiCompat.getLoadState();
            if (loadState == 3 || loadState == 0) {
                b bVar = new b(this);
                this.f1461j1 = bVar;
                emojiCompat.registerInitCallback(bVar);
            }
        }
    }

    @Override // android.view.View
    public void draw(@NonNull Canvas canvas) {
        int i10;
        int i11;
        int i12 = this.X0;
        int i13 = this.Y0;
        int i14 = this.Z0;
        int i15 = this.f1452a1;
        int thumbOffset = getThumbOffset() + i12;
        Drawable drawable = this.f1463p0;
        Rect opticalBounds = drawable != null ? DrawableUtils.getOpticalBounds(drawable) : DrawableUtils.INSETS_NONE;
        Drawable drawable2 = this.f1468u0;
        Rect rect = this.f1462k1;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i16 = rect.left;
            thumbOffset += i16;
            if (opticalBounds != null) {
                int i17 = opticalBounds.left;
                if (i17 > i16) {
                    i12 += i17 - i16;
                }
                int i18 = opticalBounds.top;
                int i19 = rect.top;
                i10 = i18 > i19 ? (i18 - i19) + i13 : i13;
                int i20 = opticalBounds.right;
                int i21 = rect.right;
                if (i20 > i21) {
                    i14 -= i20 - i21;
                }
                int i22 = opticalBounds.bottom;
                int i23 = rect.bottom;
                if (i22 > i23) {
                    i11 = i15 - (i22 - i23);
                }
                this.f1468u0.setBounds(i12, i10, i14, i11);
            } else {
                i10 = i13;
            }
            i11 = i15;
            this.f1468u0.setBounds(i12, i10, i14, i11);
        }
        Drawable drawable3 = this.f1463p0;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i24 = thumbOffset - rect.left;
            int i25 = thumbOffset + this.W0 + rect.right;
            this.f1463p0.setBounds(i24, i13, i25, i15);
            Drawable background = getBackground();
            if (background != null) {
                DrawableCompat.setHotspotBounds(background, i24, i13, i25, i15);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableHotspotChanged(float f6, float f10) {
        super.drawableHotspotChanged(f6, f10);
        Drawable drawable = this.f1463p0;
        if (drawable != null) {
            DrawableCompat.setHotspot(drawable, f6, f10);
        }
        Drawable drawable2 = this.f1468u0;
        if (drawable2 != null) {
            DrawableCompat.setHotspot(drawable2, f6, f10);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f1463p0;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.f1468u0;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (!ViewUtils.isLayoutRtl(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.U0;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.G0 : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (ViewUtils.isLayoutRtl(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.U0;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.G0 : compoundPaddingRight;
    }

    @Override // android.widget.TextView
    @Nullable
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return TextViewCompat.unwrapCustomSelectionActionModeCallback(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.M0;
    }

    public boolean getSplitTrack() {
        return this.H0;
    }

    public int getSwitchMinWidth() {
        return this.F0;
    }

    public int getSwitchPadding() {
        return this.G0;
    }

    public CharSequence getTextOff() {
        return this.K0;
    }

    public CharSequence getTextOn() {
        return this.I0;
    }

    public Drawable getThumbDrawable() {
        return this.f1463p0;
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public final float getThumbPosition() {
        return this.T0;
    }

    public int getThumbTextPadding() {
        return this.E0;
    }

    @Nullable
    public ColorStateList getThumbTintList() {
        return this.f1464q0;
    }

    @Nullable
    public PorterDuff.Mode getThumbTintMode() {
        return this.f1465r0;
    }

    public Drawable getTrackDrawable() {
        return this.f1468u0;
    }

    @Nullable
    public ColorStateList getTrackTintList() {
        return this.v0;
    }

    @Nullable
    public PorterDuff.Mode getTrackTintMode() {
        return this.f1469w0;
    }

    @Override // androidx.appcompat.widget.EmojiCompatConfigurationView
    public boolean isEmojiCompatEnabled() {
        return getEmojiTextViewHelper().f1700b.isEnabled();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1463p0;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f1468u0;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f1459h1;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.f1459h1.end();
        this.f1459h1 = null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f1451m1);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Drawable drawable = this.f1468u0;
        Rect rect = this.f1462k1;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i10 = this.Y0;
        int i11 = this.f1452a1;
        int i12 = i10 + rect.top;
        int i13 = i11 - rect.bottom;
        Drawable drawable2 = this.f1463p0;
        if (drawable != null) {
            if (!this.H0 || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect opticalBounds = DrawableUtils.getOpticalBounds(drawable2);
                drawable2.copyBounds(rect);
                rect.left += opticalBounds.left;
                rect.right -= opticalBounds.right;
                int iSave = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(iSave);
            }
        }
        int iSave2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        StaticLayout staticLayout = getTargetCheckedState() ? this.f1456e1 : this.f1457f1;
        if (staticLayout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.f1455d1;
            TextPaint textPaint = this.f1454c1;
            if (colorStateList != null) {
                textPaint.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            textPaint.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (staticLayout.getWidth() / 2), ((i12 + i13) / 2) - (staticLayout.getHeight() / 2));
            staticLayout.draw(canvas);
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.I0 : this.K0;
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(text);
            sb2.append(' ');
            sb2.append(charSequence);
            accessibilityNodeInfo.setText(sb2);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int iMax;
        int width;
        int paddingLeft;
        int height;
        int paddingTop;
        super.onLayout(z10, i10, i11, i12, i13);
        int iMax2 = 0;
        if (this.f1463p0 != null) {
            Drawable drawable = this.f1468u0;
            Rect rect = this.f1462k1;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect opticalBounds = DrawableUtils.getOpticalBounds(this.f1463p0);
            iMax = Math.max(0, opticalBounds.left - rect.left);
            iMax2 = Math.max(0, opticalBounds.right - rect.right);
        } else {
            iMax = 0;
        }
        if (ViewUtils.isLayoutRtl(this)) {
            paddingLeft = getPaddingLeft() + iMax;
            width = ((this.U0 + paddingLeft) - iMax) - iMax2;
        } else {
            width = (getWidth() - getPaddingRight()) - iMax2;
            paddingLeft = (width - this.U0) + iMax + iMax2;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int height2 = ((getHeight() + getPaddingTop()) - getPaddingBottom()) / 2;
            int i14 = this.V0;
            int i15 = height2 - (i14 / 2);
            height = i14 + i15;
            paddingTop = i15;
        } else if (gravity != 80) {
            paddingTop = getPaddingTop();
            height = this.V0 + paddingTop;
        } else {
            height = getHeight() - getPaddingBottom();
            paddingTop = height - this.V0;
        }
        this.X0 = paddingLeft;
        this.Y0 = paddingTop;
        this.f1452a1 = height;
        this.Z0 = width;
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        int intrinsicWidth;
        int intrinsicHeight;
        int iMax;
        int intrinsicHeight2 = 0;
        if (this.M0) {
            StaticLayout staticLayout = this.f1456e1;
            TextPaint textPaint = this.f1454c1;
            if (staticLayout == null) {
                CharSequence charSequence = this.J0;
                this.f1456e1 = new StaticLayout(charSequence, textPaint, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
            if (this.f1457f1 == null) {
                CharSequence charSequence2 = this.L0;
                this.f1457f1 = new StaticLayout(charSequence2, textPaint, charSequence2 != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence2, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
        }
        Drawable drawable = this.f1463p0;
        Rect rect = this.f1462k1;
        if (drawable != null) {
            drawable.getPadding(rect);
            intrinsicWidth = (this.f1463p0.getIntrinsicWidth() - rect.left) - rect.right;
            intrinsicHeight = this.f1463p0.getIntrinsicHeight();
        } else {
            intrinsicWidth = 0;
            intrinsicHeight = 0;
        }
        if (this.M0) {
            iMax = (this.E0 * 2) + Math.max(this.f1456e1.getWidth(), this.f1457f1.getWidth());
        } else {
            iMax = 0;
        }
        this.W0 = Math.max(iMax, intrinsicWidth);
        Drawable drawable2 = this.f1468u0;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            intrinsicHeight2 = this.f1468u0.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int iMax2 = rect.left;
        int iMax3 = rect.right;
        Drawable drawable3 = this.f1463p0;
        if (drawable3 != null) {
            Rect opticalBounds = DrawableUtils.getOpticalBounds(drawable3);
            iMax2 = Math.max(iMax2, opticalBounds.left);
            iMax3 = Math.max(iMax3, opticalBounds.right);
        }
        int iMax4 = this.f1453b1 ? Math.max(this.F0, (this.W0 * 2) + iMax2 + iMax3) : this.F0;
        int iMax5 = Math.max(intrinsicHeight2, intrinsicHeight);
        this.U0 = iMax4;
        this.V0 = iMax5;
        super.onMeasure(i10, i11);
        if (getMeasuredHeight() < iMax5) {
            setMeasuredDimension(getMeasuredWidthAndState(), iMax5);
        }
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.I0 : this.K0;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x008d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0092  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:52:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:61:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ef  */
    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean zIsChecked;
        boolean targetCheckedState;
        float xVelocity;
        float f6;
        VelocityTracker velocityTracker = this.R0;
        velocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int i10 = this.O0;
        if (actionMasked != 0) {
            float f10 = 0.0f;
            if (actionMasked == 1) {
                if (this.N0 == 2) {
                    this.N0 = 0;
                    if (motionEvent.getAction() == 1 || !isEnabled()) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    zIsChecked = isChecked();
                    if (z10) {
                        velocityTracker.computeCurrentVelocity(1000);
                        xVelocity = velocityTracker.getXVelocity();
                        if (Math.abs(xVelocity) <= this.S0) {
                            targetCheckedState = ViewUtils.isLayoutRtl(this) ? xVelocity > 0.0f : xVelocity < 0.0f;
                        } else {
                            targetCheckedState = getTargetCheckedState();
                        }
                    } else {
                        targetCheckedState = zIsChecked;
                    }
                    if (targetCheckedState != zIsChecked) {
                        playSoundEffect(0);
                    }
                    setChecked(targetCheckedState);
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    motionEventObtain.setAction(3);
                    super.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    super.onTouchEvent(motionEvent);
                    return true;
                }
                this.N0 = 0;
                velocityTracker.clear();
            } else if (actionMasked == 2) {
                int i11 = this.N0;
                if (i11 == 1) {
                    float x4 = motionEvent.getX();
                    float y7 = motionEvent.getY();
                    if (Math.abs(x4 - this.P0) > i10 || Math.abs(y7 - this.Q0) > i10) {
                        this.N0 = 2;
                        getParent().requestDisallowInterceptTouchEvent(true);
                        this.P0 = x4;
                        this.Q0 = y7;
                        return true;
                    }
                } else if (i11 == 2) {
                    float x6 = motionEvent.getX();
                    int thumbScrollRange = getThumbScrollRange();
                    float f11 = x6 - this.P0;
                    if (thumbScrollRange != 0) {
                        f6 = f11 / thumbScrollRange;
                    } else {
                        f6 = f11 > 0.0f ? 1.0f : -1.0f;
                    }
                    if (ViewUtils.isLayoutRtl(this)) {
                        f6 = -f6;
                    }
                    float f12 = this.T0;
                    float f13 = f6 + f12;
                    if (f13 >= 0.0f) {
                        f10 = f13 > 1.0f ? 1.0f : f13;
                    }
                    if (f10 != f12) {
                        this.P0 = x6;
                        setThumbPosition(f10);
                    }
                    return true;
                }
            } else if (actionMasked == 3) {
                if (this.N0 == 2) {
                    this.N0 = 0;
                    if (motionEvent.getAction() == 1) {
                        z10 = false;
                    } else {
                        z10 = false;
                    }
                    zIsChecked = isChecked();
                    if (z10) {
                        velocityTracker.computeCurrentVelocity(1000);
                        xVelocity = velocityTracker.getXVelocity();
                        if (Math.abs(xVelocity) <= this.S0) {
                            targetCheckedState = getTargetCheckedState();
                        } else if (ViewUtils.isLayoutRtl(this)) {
                        }
                    } else {
                        targetCheckedState = zIsChecked;
                    }
                    if (targetCheckedState != zIsChecked) {
                        playSoundEffect(0);
                    }
                    setChecked(targetCheckedState);
                    MotionEvent motionEventObtain2 = MotionEvent.obtain(motionEvent);
                    motionEventObtain2.setAction(3);
                    super.onTouchEvent(motionEventObtain2);
                    motionEventObtain2.recycle();
                    super.onTouchEvent(motionEvent);
                    return true;
                }
                this.N0 = 0;
                velocityTracker.clear();
            }
        } else {
            float x7 = motionEvent.getX();
            float y10 = motionEvent.getY();
            if (isEnabled() && this.f1463p0 != null) {
                int thumbOffset = getThumbOffset();
                Drawable drawable = this.f1463p0;
                Rect rect = this.f1462k1;
                drawable.getPadding(rect);
                int i12 = this.Y0 - i10;
                int i13 = (this.X0 + thumbOffset) - i10;
                int i14 = this.W0 + i13 + rect.left + rect.right + i10;
                int i15 = this.f1452a1 + i10;
                if (x7 > i13 && x7 < i14 && y10 > i12 && y10 < i15) {
                    this.N0 = 1;
                    this.P0 = x7;
                    this.Q0 = y10;
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().b(z10);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) {
        super.setChecked(z10);
        boolean zIsChecked = isChecked();
        if (zIsChecked) {
            if (Build.VERSION.SDK_INT >= 30) {
                CharSequence string = this.I0;
                if (string == null) {
                    string = getResources().getString(androidx.appcompat.R.string.abc_capital_on);
                }
                ViewCompat.setStateDescription(this, string);
            }
        } else if (Build.VERSION.SDK_INT >= 30) {
            CharSequence string2 = this.K0;
            if (string2 == null) {
                string2 = getResources().getString(androidx.appcompat.R.string.abc_capital_off);
            }
            ViewCompat.setStateDescription(this, string2);
        }
        if (getWindowToken() == null || !isLaidOut()) {
            ObjectAnimator objectAnimator = this.f1459h1;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            setThumbPosition(zIsChecked ? 1.0f : 0.0f);
            return;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f1450l1, zIsChecked ? 1.0f : 0.0f);
        this.f1459h1 = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(250L);
        this.f1459h1.setAutoCancel(true);
        this.f1459h1.start();
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(@Nullable ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(TextViewCompat.wrapCustomSelectionActionModeCallback(this, callback));
    }

    @Override // androidx.appcompat.widget.EmojiCompatConfigurationView
    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().c(z10);
        setTextOnInternal(this.I0);
        setTextOffInternal(this.K0);
        requestLayout();
    }

    public final void setEnforceSwitchWidth(boolean z10) {
        this.f1453b1 = z10;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setFilters(@NonNull InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().f1700b.getFilters(inputFilterArr));
    }

    public void setShowText(boolean z10) {
        if (this.M0 != z10) {
            this.M0 = z10;
            requestLayout();
            if (z10) {
                d();
            }
        }
    }

    public void setSplitTrack(boolean z10) {
        this.H0 = z10;
        invalidate();
    }

    public void setSwitchMinWidth(int i10) {
        this.F0 = i10;
        requestLayout();
    }

    public void setSwitchPadding(int i10) {
        this.G0 = i10;
        requestLayout();
    }

    public void setSwitchTextAppearance(Context context, int i10) {
        Typeface typeface;
        TintTypedArray tintTypedArrayObtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, i10, androidx.appcompat.R.styleable.TextAppearance);
        ColorStateList colorStateList = tintTypedArrayObtainStyledAttributes.getColorStateList(androidx.appcompat.R.styleable.TextAppearance_android_textColor);
        if (colorStateList != null) {
            this.f1455d1 = colorStateList;
        } else {
            this.f1455d1 = getTextColors();
        }
        int dimensionPixelSize = tintTypedArrayObtainStyledAttributes.getDimensionPixelSize(androidx.appcompat.R.styleable.TextAppearance_android_textSize, 0);
        if (dimensionPixelSize != 0) {
            float f6 = dimensionPixelSize;
            TextPaint textPaint = this.f1454c1;
            if (f6 != textPaint.getTextSize()) {
                textPaint.setTextSize(f6);
                requestLayout();
            }
        }
        int i11 = tintTypedArrayObtainStyledAttributes.getInt(androidx.appcompat.R.styleable.TextAppearance_android_typeface, -1);
        int i12 = tintTypedArrayObtainStyledAttributes.getInt(androidx.appcompat.R.styleable.TextAppearance_android_textStyle, -1);
        if (i11 == 1) {
            typeface = Typeface.SANS_SERIF;
        } else if (i11 != 2) {
            typeface = i11 != 3 ? null : Typeface.MONOSPACE;
        } else {
            typeface = Typeface.SERIF;
        }
        setSwitchTypeface(typeface, i12);
        if (tintTypedArrayObtainStyledAttributes.getBoolean(androidx.appcompat.R.styleable.TextAppearance_textAllCaps, false)) {
            this.f1458g1 = new AllCapsTransformationMethod(getContext());
        } else {
            this.f1458g1 = null;
        }
        setTextOnInternal(this.I0);
        setTextOffInternal(this.K0);
        tintTypedArrayObtainStyledAttributes.recycle();
    }

    public void setSwitchTypeface(Typeface typeface, int i10) {
        TextPaint textPaint = this.f1454c1;
        if (i10 <= 0) {
            textPaint.setFakeBoldText(false);
            textPaint.setTextSkewX(0.0f);
            setSwitchTypeface(typeface);
        } else {
            Typeface typefaceDefaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i10) : Typeface.create(typeface, i10);
            setSwitchTypeface(typefaceDefaultFromStyle);
            int i11 = (~(typefaceDefaultFromStyle != null ? typefaceDefaultFromStyle.getStyle() : 0)) & i10;
            textPaint.setFakeBoldText((i11 & 1) != 0);
            textPaint.setTextSkewX((i11 & 2) != 0 ? -0.25f : 0.0f);
        }
    }

    public void setTextOff(CharSequence charSequence) {
        setTextOffInternal(charSequence);
        requestLayout();
        if (isChecked() || Build.VERSION.SDK_INT < 30) {
            return;
        }
        CharSequence string = this.K0;
        if (string == null) {
            string = getResources().getString(androidx.appcompat.R.string.abc_capital_off);
        }
        ViewCompat.setStateDescription(this, string);
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (!isChecked() || Build.VERSION.SDK_INT < 30) {
            return;
        }
        CharSequence string = this.I0;
        if (string == null) {
            string = getResources().getString(androidx.appcompat.R.string.abc_capital_on);
        }
        ViewCompat.setStateDescription(this, string);
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f1463p0;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1463p0 = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f6) {
        this.T0 = f6;
        invalidate();
    }

    public void setThumbResource(int i10) {
        setThumbDrawable(AppCompatResources.getDrawable(getContext(), i10));
    }

    public void setThumbTextPadding(int i10) {
        this.E0 = i10;
        requestLayout();
    }

    public void setThumbTintList(@Nullable ColorStateList colorStateList) {
        this.f1464q0 = colorStateList;
        this.f1466s0 = true;
        a();
    }

    public void setThumbTintMode(@Nullable PorterDuff.Mode mode) {
        this.f1465r0 = mode;
        this.f1467t0 = true;
        a();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f1468u0;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1468u0 = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i10) {
        setTrackDrawable(AppCompatResources.getDrawable(getContext(), i10));
    }

    public void setTrackTintList(@Nullable ColorStateList colorStateList) {
        this.v0 = colorStateList;
        this.f1470x0 = true;
        b();
    }

    public void setTrackTintMode(@Nullable PorterDuff.Mode mode) {
        this.f1469w0 = mode;
        this.f1471y0 = true;
        b();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public boolean verifyDrawable(@NonNull Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f1463p0 || drawable == this.f1468u0;
    }

    public SwitchCompat(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, androidx.appcompat.R.attr.switchStyle);
    }

    public SwitchCompat(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1464q0 = null;
        this.f1465r0 = null;
        this.f1466s0 = false;
        this.f1467t0 = false;
        this.v0 = null;
        this.f1469w0 = null;
        this.f1470x0 = false;
        this.f1471y0 = false;
        this.R0 = VelocityTracker.obtain();
        this.f1453b1 = true;
        this.f1462k1 = new Rect();
        ThemeUtils.checkAppCompatTheme(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.f1454c1 = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = androidx.appcompat.R.styleable.SwitchCompat;
        TintTypedArray tintTypedArrayObtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, iArr, i10, 0);
        ViewCompat.saveAttributeDataForStyleable(this, context, iArr, attributeSet, tintTypedArrayObtainStyledAttributes.getWrappedTypeArray(), i10, 0);
        Drawable drawable = tintTypedArrayObtainStyledAttributes.getDrawable(androidx.appcompat.R.styleable.SwitchCompat_android_thumb);
        this.f1463p0 = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        Drawable drawable2 = tintTypedArrayObtainStyledAttributes.getDrawable(androidx.appcompat.R.styleable.SwitchCompat_track);
        this.f1468u0 = drawable2;
        if (drawable2 != null) {
            drawable2.setCallback(this);
        }
        setTextOnInternal(tintTypedArrayObtainStyledAttributes.getText(androidx.appcompat.R.styleable.SwitchCompat_android_textOn));
        setTextOffInternal(tintTypedArrayObtainStyledAttributes.getText(androidx.appcompat.R.styleable.SwitchCompat_android_textOff));
        this.M0 = tintTypedArrayObtainStyledAttributes.getBoolean(androidx.appcompat.R.styleable.SwitchCompat_showText, true);
        this.E0 = tintTypedArrayObtainStyledAttributes.getDimensionPixelSize(androidx.appcompat.R.styleable.SwitchCompat_thumbTextPadding, 0);
        this.F0 = tintTypedArrayObtainStyledAttributes.getDimensionPixelSize(androidx.appcompat.R.styleable.SwitchCompat_switchMinWidth, 0);
        this.G0 = tintTypedArrayObtainStyledAttributes.getDimensionPixelSize(androidx.appcompat.R.styleable.SwitchCompat_switchPadding, 0);
        this.H0 = tintTypedArrayObtainStyledAttributes.getBoolean(androidx.appcompat.R.styleable.SwitchCompat_splitTrack, false);
        ColorStateList colorStateList = tintTypedArrayObtainStyledAttributes.getColorStateList(androidx.appcompat.R.styleable.SwitchCompat_thumbTint);
        if (colorStateList != null) {
            this.f1464q0 = colorStateList;
            this.f1466s0 = true;
        }
        PorterDuff.Mode tintMode = DrawableUtils.parseTintMode(tintTypedArrayObtainStyledAttributes.getInt(androidx.appcompat.R.styleable.SwitchCompat_thumbTintMode, -1), null);
        if (this.f1465r0 != tintMode) {
            this.f1465r0 = tintMode;
            this.f1467t0 = true;
        }
        if (this.f1466s0 || this.f1467t0) {
            a();
        }
        ColorStateList colorStateList2 = tintTypedArrayObtainStyledAttributes.getColorStateList(androidx.appcompat.R.styleable.SwitchCompat_trackTint);
        if (colorStateList2 != null) {
            this.v0 = colorStateList2;
            this.f1470x0 = true;
        }
        PorterDuff.Mode tintMode2 = DrawableUtils.parseTintMode(tintTypedArrayObtainStyledAttributes.getInt(androidx.appcompat.R.styleable.SwitchCompat_trackTintMode, -1), null);
        if (this.f1469w0 != tintMode2) {
            this.f1469w0 = tintMode2;
            this.f1471y0 = true;
        }
        if (this.f1470x0 || this.f1471y0) {
            b();
        }
        int resourceId = tintTypedArrayObtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.SwitchCompat_switchTextAppearance, 0);
        if (resourceId != 0) {
            setSwitchTextAppearance(context, resourceId);
        }
        new h0(this).f(attributeSet, i10);
        tintTypedArrayObtainStyledAttributes.recycle();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.O0 = viewConfiguration.getScaledTouchSlop();
        this.S0 = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().a(attributeSet, i10);
        refreshDrawableState();
        setChecked(isChecked());
    }

    public void setSwitchTypeface(Typeface typeface) {
        TextPaint textPaint = this.f1454c1;
        if ((textPaint.getTypeface() == null || textPaint.getTypeface().equals(typeface)) && (textPaint.getTypeface() != null || typeface == null)) {
            return;
        }
        textPaint.setTypeface(typeface);
        requestLayout();
        invalidate();
    }
}
