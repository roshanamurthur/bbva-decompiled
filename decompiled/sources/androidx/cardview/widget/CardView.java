package androidx.cardview.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import q.b;
import q.c;

/* JADX INFO: loaded from: classes.dex */
public class CardView extends FrameLayout {

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final int[] f2337u0 = {R.attr.colorBackground};
    public static final q.a v0 = new q.a();

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public boolean f2338p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public boolean f2339q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Rect f2340r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final Rect f2341s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final a f2342t0;

    public class a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Drawable f2343a;

        public a() {
        }

        public final void a(int i10, int i11, int i12, int i13) {
            CardView cardView = CardView.this;
            cardView.f2341s0.set(i10, i11, i12, i13);
            Rect rect = cardView.f2340r0;
            CardView.super.setPadding(i10 + rect.left, i11 + rect.top, i12 + rect.right, i13 + rect.bottom);
        }
    }

    public CardView(@NonNull Context context) {
        this(context, null);
    }

    @NonNull
    public ColorStateList getCardBackgroundColor() {
        return q.a.a(this.f2342t0).f92735h;
    }

    public float getCardElevation() {
        return CardView.this.getElevation();
    }

    @Px
    public int getContentPaddingBottom() {
        return this.f2340r0.bottom;
    }

    @Px
    public int getContentPaddingLeft() {
        return this.f2340r0.left;
    }

    @Px
    public int getContentPaddingRight() {
        return this.f2340r0.right;
    }

    @Px
    public int getContentPaddingTop() {
        return this.f2340r0.top;
    }

    public float getMaxCardElevation() {
        return q.a.a(this.f2342t0).f92732e;
    }

    public boolean getPreventCornerOverlap() {
        return this.f2339q0;
    }

    public float getRadius() {
        return q.a.a(this.f2342t0).f92728a;
    }

    public boolean getUseCompatPadding() {
        return this.f2338p0;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    public void setCardBackgroundColor(@Nullable ColorStateList colorStateList) {
        c cVarA = q.a.a(this.f2342t0);
        if (colorStateList == null) {
            cVarA.getClass();
            colorStateList = ColorStateList.valueOf(0);
        }
        cVarA.f92735h = colorStateList;
        cVarA.f92729b.setColor(colorStateList.getColorForState(cVarA.getState(), cVarA.f92735h.getDefaultColor()));
        cVarA.invalidateSelf();
    }

    public void setCardElevation(float f6) {
        CardView.this.setElevation(f6);
    }

    public void setContentPadding(@Px int i10, @Px int i11, @Px int i12, @Px int i13) {
        this.f2340r0.set(i10, i11, i12, i13);
        v0.c(this.f2342t0);
    }

    public void setMaxCardElevation(float f6) {
        v0.b(this.f2342t0, f6);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i10) {
        super.setMinimumHeight(i10);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i10) {
        super.setMinimumWidth(i10);
    }

    public void setPreventCornerOverlap(boolean z10) {
        if (z10 != this.f2339q0) {
            this.f2339q0 = z10;
            q.a aVar = v0;
            a aVar2 = this.f2342t0;
            aVar.b(aVar2, q.a.a(aVar2).f92732e);
        }
    }

    public void setRadius(float f6) {
        c cVarA = q.a.a(this.f2342t0);
        if (f6 == cVarA.f92728a) {
            return;
        }
        cVarA.f92728a = f6;
        cVarA.b(null);
        cVarA.invalidateSelf();
    }

    public void setUseCompatPadding(boolean z10) {
        if (this.f2338p0 != z10) {
            this.f2338p0 = z10;
            q.a aVar = v0;
            a aVar2 = this.f2342t0;
            aVar.b(aVar2, q.a.a(aVar2).f92732e);
        }
    }

    public CardView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, androidx.cardview.R.attr.cardViewStyle);
    }

    public CardView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        int color;
        ColorStateList colorStateListValueOf;
        super(context, attributeSet, i10);
        Rect rect = new Rect();
        this.f2340r0 = rect;
        this.f2341s0 = new Rect();
        a aVar = new a();
        this.f2342t0 = aVar;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.cardview.R.styleable.CardView, i10, androidx.cardview.R.style.CardView);
        int i11 = androidx.cardview.R.styleable.CardView_cardBackgroundColor;
        if (typedArrayObtainStyledAttributes.hasValue(i11)) {
            colorStateListValueOf = typedArrayObtainStyledAttributes.getColorStateList(i11);
        } else {
            TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(f2337u0);
            int color2 = typedArrayObtainStyledAttributes2.getColor(0, 0);
            typedArrayObtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color2, fArr);
            if (fArr[2] > 0.5f) {
                color = getResources().getColor(androidx.cardview.R.color.cardview_light_background);
            } else {
                color = getResources().getColor(androidx.cardview.R.color.cardview_dark_background);
            }
            colorStateListValueOf = ColorStateList.valueOf(color);
        }
        float dimension = typedArrayObtainStyledAttributes.getDimension(androidx.cardview.R.styleable.CardView_cardCornerRadius, 0.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(androidx.cardview.R.styleable.CardView_cardElevation, 0.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(androidx.cardview.R.styleable.CardView_cardMaxElevation, 0.0f);
        this.f2338p0 = typedArrayObtainStyledAttributes.getBoolean(androidx.cardview.R.styleable.CardView_cardUseCompatPadding, false);
        this.f2339q0 = typedArrayObtainStyledAttributes.getBoolean(androidx.cardview.R.styleable.CardView_cardPreventCornerOverlap, true);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(androidx.cardview.R.styleable.CardView_contentPadding, 0);
        rect.left = typedArrayObtainStyledAttributes.getDimensionPixelSize(androidx.cardview.R.styleable.CardView_contentPaddingLeft, dimensionPixelSize);
        rect.top = typedArrayObtainStyledAttributes.getDimensionPixelSize(androidx.cardview.R.styleable.CardView_contentPaddingTop, dimensionPixelSize);
        rect.right = typedArrayObtainStyledAttributes.getDimensionPixelSize(androidx.cardview.R.styleable.CardView_contentPaddingRight, dimensionPixelSize);
        rect.bottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(androidx.cardview.R.styleable.CardView_contentPaddingBottom, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        typedArrayObtainStyledAttributes.getDimensionPixelSize(androidx.cardview.R.styleable.CardView_android_minWidth, 0);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(androidx.cardview.R.styleable.CardView_android_minHeight, 0);
        typedArrayObtainStyledAttributes.recycle();
        q.a aVar2 = v0;
        c cVar = new c(dimension, colorStateListValueOf);
        aVar.f2343a = cVar;
        setBackgroundDrawable(cVar);
        setClipToOutline(true);
        setElevation(dimension2);
        aVar2.b(aVar, dimension3);
    }

    public void setCardBackgroundColor(@ColorInt int i10) {
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(i10);
        c cVarA = q.a.a(this.f2342t0);
        if (colorStateListValueOf == null) {
            cVarA.getClass();
            colorStateListValueOf = ColorStateList.valueOf(0);
        }
        cVarA.f92735h = colorStateListValueOf;
        cVarA.f92729b.setColor(colorStateListValueOf.getColorForState(cVarA.getState(), cVarA.f92735h.getDefaultColor()));
        cVarA.invalidateSelf();
    }

    @Override // android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i10, int i11, int i12, int i13) {
    }
}
