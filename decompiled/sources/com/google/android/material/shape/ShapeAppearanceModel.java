package com.google.android.material.shape;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import androidx.annotation.AttrRes;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import com.google.android.material.R;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

/* JADX INFO: loaded from: classes10.dex */
public class ShapeAppearanceModel {
    public static final CornerSize PILL = new RelativeCornerSize(0.5f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CornerTreatment f45270a = new RoundedCornerTreatment();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CornerTreatment f45271b = new RoundedCornerTreatment();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CornerTreatment f45272c = new RoundedCornerTreatment();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public CornerTreatment f45273d = new RoundedCornerTreatment();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CornerSize f45274e = new AbsoluteCornerSize(0.0f);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CornerSize f45275f = new AbsoluteCornerSize(0.0f);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public CornerSize f45276g = new AbsoluteCornerSize(0.0f);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public CornerSize f45277h = new AbsoluteCornerSize(0.0f);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public EdgeTreatment f45278i = new EdgeTreatment();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public EdgeTreatment f45279j = new EdgeTreatment();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public EdgeTreatment f45280k = new EdgeTreatment();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public EdgeTreatment f45281l = new EdgeTreatment();

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public CornerTreatment f45282a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NonNull
        public CornerTreatment f45283b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NonNull
        public CornerTreatment f45284c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NonNull
        public CornerTreatment f45285d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NonNull
        public CornerSize f45286e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NonNull
        public CornerSize f45287f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NonNull
        public CornerSize f45288g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @NonNull
        public CornerSize f45289h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NonNull
        public EdgeTreatment f45290i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @NonNull
        public EdgeTreatment f45291j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @NonNull
        public EdgeTreatment f45292k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @NonNull
        public EdgeTreatment f45293l;

        public Builder() {
            this.f45282a = new RoundedCornerTreatment();
            this.f45283b = new RoundedCornerTreatment();
            this.f45284c = new RoundedCornerTreatment();
            this.f45285d = new RoundedCornerTreatment();
            this.f45286e = new AbsoluteCornerSize(0.0f);
            this.f45287f = new AbsoluteCornerSize(0.0f);
            this.f45288g = new AbsoluteCornerSize(0.0f);
            this.f45289h = new AbsoluteCornerSize(0.0f);
            this.f45290i = new EdgeTreatment();
            this.f45291j = new EdgeTreatment();
            this.f45292k = new EdgeTreatment();
            this.f45293l = new EdgeTreatment();
        }

        public static float a(CornerTreatment cornerTreatment) {
            if (cornerTreatment instanceof RoundedCornerTreatment) {
                return ((RoundedCornerTreatment) cornerTreatment).f45269a;
            }
            if (cornerTreatment instanceof CutCornerTreatment) {
                return ((CutCornerTreatment) cornerTreatment).f45227a;
            }
            return -1.0f;
        }

        @NonNull
        public ShapeAppearanceModel build() {
            ShapeAppearanceModel shapeAppearanceModel = new ShapeAppearanceModel();
            shapeAppearanceModel.f45270a = this.f45282a;
            shapeAppearanceModel.f45271b = this.f45283b;
            shapeAppearanceModel.f45272c = this.f45284c;
            shapeAppearanceModel.f45273d = this.f45285d;
            shapeAppearanceModel.f45274e = this.f45286e;
            shapeAppearanceModel.f45275f = this.f45287f;
            shapeAppearanceModel.f45276g = this.f45288g;
            shapeAppearanceModel.f45277h = this.f45289h;
            shapeAppearanceModel.f45278i = this.f45290i;
            shapeAppearanceModel.f45279j = this.f45291j;
            shapeAppearanceModel.f45280k = this.f45292k;
            shapeAppearanceModel.f45281l = this.f45293l;
            return shapeAppearanceModel;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setAllCornerSizes(@NonNull CornerSize cornerSize) {
            return setTopLeftCornerSize(cornerSize).setTopRightCornerSize(cornerSize).setBottomRightCornerSize(cornerSize).setBottomLeftCornerSize(cornerSize);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setAllCorners(int i10, @Dimension float f6) {
            return setAllCorners(MaterialShapeUtils.a(i10)).setAllCornerSizes(f6);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setAllEdges(@NonNull EdgeTreatment edgeTreatment) {
            return setLeftEdge(edgeTreatment).setTopEdge(edgeTreatment).setRightEdge(edgeTreatment).setBottomEdge(edgeTreatment);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setBottomEdge(@NonNull EdgeTreatment edgeTreatment) {
            this.f45292k = edgeTreatment;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setBottomLeftCorner(int i10, @Dimension float f6) {
            return setBottomLeftCorner(MaterialShapeUtils.a(i10)).setBottomLeftCornerSize(f6);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setBottomLeftCornerSize(@Dimension float f6) {
            this.f45289h = new AbsoluteCornerSize(f6);
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setBottomRightCorner(int i10, @Dimension float f6) {
            return setBottomRightCorner(MaterialShapeUtils.a(i10)).setBottomRightCornerSize(f6);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setBottomRightCornerSize(@Dimension float f6) {
            this.f45288g = new AbsoluteCornerSize(f6);
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setLeftEdge(@NonNull EdgeTreatment edgeTreatment) {
            this.f45293l = edgeTreatment;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setRightEdge(@NonNull EdgeTreatment edgeTreatment) {
            this.f45291j = edgeTreatment;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setTopEdge(@NonNull EdgeTreatment edgeTreatment) {
            this.f45290i = edgeTreatment;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setTopLeftCorner(int i10, @Dimension float f6) {
            return setTopLeftCorner(MaterialShapeUtils.a(i10)).setTopLeftCornerSize(f6);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setTopLeftCornerSize(@Dimension float f6) {
            this.f45286e = new AbsoluteCornerSize(f6);
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setTopRightCorner(int i10, @Dimension float f6) {
            return setTopRightCorner(MaterialShapeUtils.a(i10)).setTopRightCornerSize(f6);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setTopRightCornerSize(@Dimension float f6) {
            this.f45287f = new AbsoluteCornerSize(f6);
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setBottomLeftCornerSize(@NonNull CornerSize cornerSize) {
            this.f45289h = cornerSize;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setBottomRightCornerSize(@NonNull CornerSize cornerSize) {
            this.f45288g = cornerSize;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setTopLeftCornerSize(@NonNull CornerSize cornerSize) {
            this.f45286e = cornerSize;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setTopRightCornerSize(@NonNull CornerSize cornerSize) {
            this.f45287f = cornerSize;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setAllCorners(@NonNull CornerTreatment cornerTreatment) {
            return setTopLeftCorner(cornerTreatment).setTopRightCorner(cornerTreatment).setBottomRightCorner(cornerTreatment).setBottomLeftCorner(cornerTreatment);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setBottomLeftCorner(int i10, @NonNull CornerSize cornerSize) {
            return setBottomLeftCorner(MaterialShapeUtils.a(i10)).setBottomLeftCornerSize(cornerSize);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setBottomRightCorner(int i10, @NonNull CornerSize cornerSize) {
            return setBottomRightCorner(MaterialShapeUtils.a(i10)).setBottomRightCornerSize(cornerSize);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setTopLeftCorner(int i10, @NonNull CornerSize cornerSize) {
            return setTopLeftCorner(MaterialShapeUtils.a(i10)).setTopLeftCornerSize(cornerSize);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setTopRightCorner(int i10, @NonNull CornerSize cornerSize) {
            return setTopRightCorner(MaterialShapeUtils.a(i10)).setTopRightCornerSize(cornerSize);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setAllCornerSizes(@Dimension float f6) {
            return setTopLeftCornerSize(f6).setTopRightCornerSize(f6).setBottomRightCornerSize(f6).setBottomLeftCornerSize(f6);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setBottomLeftCorner(@NonNull CornerTreatment cornerTreatment) {
            this.f45285d = cornerTreatment;
            float fA = a(cornerTreatment);
            if (fA != -1.0f) {
                setBottomLeftCornerSize(fA);
            }
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setBottomRightCorner(@NonNull CornerTreatment cornerTreatment) {
            this.f45284c = cornerTreatment;
            float fA = a(cornerTreatment);
            if (fA != -1.0f) {
                setBottomRightCornerSize(fA);
            }
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setTopLeftCorner(@NonNull CornerTreatment cornerTreatment) {
            this.f45282a = cornerTreatment;
            float fA = a(cornerTreatment);
            if (fA != -1.0f) {
                setTopLeftCornerSize(fA);
            }
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setTopRightCorner(@NonNull CornerTreatment cornerTreatment) {
            this.f45283b = cornerTreatment;
            float fA = a(cornerTreatment);
            if (fA != -1.0f) {
                setTopRightCornerSize(fA);
            }
            return this;
        }

        public Builder(@NonNull ShapeAppearanceModel shapeAppearanceModel) {
            this.f45282a = new RoundedCornerTreatment();
            this.f45283b = new RoundedCornerTreatment();
            this.f45284c = new RoundedCornerTreatment();
            this.f45285d = new RoundedCornerTreatment();
            this.f45286e = new AbsoluteCornerSize(0.0f);
            this.f45287f = new AbsoluteCornerSize(0.0f);
            this.f45288g = new AbsoluteCornerSize(0.0f);
            this.f45289h = new AbsoluteCornerSize(0.0f);
            this.f45290i = new EdgeTreatment();
            this.f45291j = new EdgeTreatment();
            this.f45292k = new EdgeTreatment();
            this.f45293l = new EdgeTreatment();
            this.f45282a = shapeAppearanceModel.f45270a;
            this.f45283b = shapeAppearanceModel.f45271b;
            this.f45284c = shapeAppearanceModel.f45272c;
            this.f45285d = shapeAppearanceModel.f45273d;
            this.f45286e = shapeAppearanceModel.f45274e;
            this.f45287f = shapeAppearanceModel.f45275f;
            this.f45288g = shapeAppearanceModel.f45276g;
            this.f45289h = shapeAppearanceModel.f45277h;
            this.f45290i = shapeAppearanceModel.f45278i;
            this.f45291j = shapeAppearanceModel.f45279j;
            this.f45292k = shapeAppearanceModel.f45280k;
            this.f45293l = shapeAppearanceModel.f45281l;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public interface CornerSizeUnaryOperator {
        @NonNull
        CornerSize apply(@NonNull CornerSize cornerSize);
    }

    @NonNull
    public static Builder a(Context context, @StyleRes int i10, @StyleRes int i11, @NonNull CornerSize cornerSize) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i10);
        if (i11 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i11);
        }
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(R.styleable.ShapeAppearance);
        try {
            int i12 = typedArrayObtainStyledAttributes.getInt(R.styleable.ShapeAppearance_cornerFamily, 0);
            int i13 = typedArrayObtainStyledAttributes.getInt(R.styleable.ShapeAppearance_cornerFamilyTopLeft, i12);
            int i14 = typedArrayObtainStyledAttributes.getInt(R.styleable.ShapeAppearance_cornerFamilyTopRight, i12);
            int i15 = typedArrayObtainStyledAttributes.getInt(R.styleable.ShapeAppearance_cornerFamilyBottomRight, i12);
            int i16 = typedArrayObtainStyledAttributes.getInt(R.styleable.ShapeAppearance_cornerFamilyBottomLeft, i12);
            CornerSize cornerSizeB = b(typedArrayObtainStyledAttributes, R.styleable.ShapeAppearance_cornerSize, cornerSize);
            CornerSize cornerSizeB2 = b(typedArrayObtainStyledAttributes, R.styleable.ShapeAppearance_cornerSizeTopLeft, cornerSizeB);
            CornerSize cornerSizeB3 = b(typedArrayObtainStyledAttributes, R.styleable.ShapeAppearance_cornerSizeTopRight, cornerSizeB);
            CornerSize cornerSizeB4 = b(typedArrayObtainStyledAttributes, R.styleable.ShapeAppearance_cornerSizeBottomRight, cornerSizeB);
            return new Builder().setTopLeftCorner(i13, cornerSizeB2).setTopRightCorner(i14, cornerSizeB3).setBottomRightCorner(i15, cornerSizeB4).setBottomLeftCorner(i16, b(typedArrayObtainStyledAttributes, R.styleable.ShapeAppearance_cornerSizeBottomLeft, cornerSizeB));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @NonNull
    public static CornerSize b(TypedArray typedArray, int i10, @NonNull CornerSize cornerSize) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i10);
        if (typedValuePeekValue == null) {
            return cornerSize;
        }
        int i11 = typedValuePeekValue.type;
        if (i11 == 5) {
            return new AbsoluteCornerSize(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
        }
        return i11 == 6 ? new RelativeCornerSize(typedValuePeekValue.getFraction(1.0f, 1.0f)) : cornerSize;
    }

    @NonNull
    public static Builder builder() {
        return new Builder();
    }

    @NonNull
    public EdgeTreatment getBottomEdge() {
        return this.f45280k;
    }

    @NonNull
    public CornerTreatment getBottomLeftCorner() {
        return this.f45273d;
    }

    @NonNull
    public CornerSize getBottomLeftCornerSize() {
        return this.f45277h;
    }

    @NonNull
    public CornerTreatment getBottomRightCorner() {
        return this.f45272c;
    }

    @NonNull
    public CornerSize getBottomRightCornerSize() {
        return this.f45276g;
    }

    @NonNull
    public EdgeTreatment getLeftEdge() {
        return this.f45281l;
    }

    @NonNull
    public EdgeTreatment getRightEdge() {
        return this.f45279j;
    }

    @NonNull
    public EdgeTreatment getTopEdge() {
        return this.f45278i;
    }

    @NonNull
    public CornerTreatment getTopLeftCorner() {
        return this.f45270a;
    }

    @NonNull
    public CornerSize getTopLeftCornerSize() {
        return this.f45274e;
    }

    @NonNull
    public CornerTreatment getTopRightCorner() {
        return this.f45271b;
    }

    @NonNull
    public CornerSize getTopRightCornerSize() {
        return this.f45275f;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean isRoundRect(@NonNull RectF rectF) {
        boolean z10 = this.f45281l.getClass().equals(EdgeTreatment.class) && this.f45279j.getClass().equals(EdgeTreatment.class) && this.f45278i.getClass().equals(EdgeTreatment.class) && this.f45280k.getClass().equals(EdgeTreatment.class);
        float cornerSize = this.f45274e.getCornerSize(rectF);
        return z10 && ((this.f45275f.getCornerSize(rectF) > cornerSize ? 1 : (this.f45275f.getCornerSize(rectF) == cornerSize ? 0 : -1)) == 0 && (this.f45277h.getCornerSize(rectF) > cornerSize ? 1 : (this.f45277h.getCornerSize(rectF) == cornerSize ? 0 : -1)) == 0 && (this.f45276g.getCornerSize(rectF) > cornerSize ? 1 : (this.f45276g.getCornerSize(rectF) == cornerSize ? 0 : -1)) == 0) && ((this.f45271b instanceof RoundedCornerTreatment) && (this.f45270a instanceof RoundedCornerTreatment) && (this.f45272c instanceof RoundedCornerTreatment) && (this.f45273d instanceof RoundedCornerTreatment));
    }

    @NonNull
    public Builder toBuilder() {
        return new Builder(this);
    }

    @NonNull
    public ShapeAppearanceModel withCornerSize(float f6) {
        return toBuilder().setAllCornerSizes(f6).build();
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public ShapeAppearanceModel withTransformedCornerSizes(@NonNull CornerSizeUnaryOperator cornerSizeUnaryOperator) {
        return toBuilder().setTopLeftCornerSize(cornerSizeUnaryOperator.apply(getTopLeftCornerSize())).setTopRightCornerSize(cornerSizeUnaryOperator.apply(getTopRightCornerSize())).setBottomLeftCornerSize(cornerSizeUnaryOperator.apply(getBottomLeftCornerSize())).setBottomRightCornerSize(cornerSizeUnaryOperator.apply(getBottomRightCornerSize())).build();
    }

    @NonNull
    public static Builder builder(@NonNull Context context, AttributeSet attributeSet, @AttrRes int i10, @StyleRes int i11) {
        return builder(context, attributeSet, i10, i11, 0);
    }

    @NonNull
    public ShapeAppearanceModel withCornerSize(@NonNull CornerSize cornerSize) {
        return toBuilder().setAllCornerSizes(cornerSize).build();
    }

    @NonNull
    public static Builder builder(@NonNull Context context, AttributeSet attributeSet, @AttrRes int i10, @StyleRes int i11, int i12) {
        return builder(context, attributeSet, i10, i11, new AbsoluteCornerSize(i12));
    }

    @NonNull
    public static Builder builder(@NonNull Context context, AttributeSet attributeSet, @AttrRes int i10, @StyleRes int i11, @NonNull CornerSize cornerSize) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.MaterialShape, i10, i11);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.MaterialShape_shapeAppearance, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(R.styleable.MaterialShape_shapeAppearanceOverlay, 0);
        typedArrayObtainStyledAttributes.recycle();
        return a(context, resourceId, resourceId2, cornerSize);
    }

    @NonNull
    public static Builder builder(Context context, @StyleRes int i10, @StyleRes int i11) {
        return a(context, i10, i11, new AbsoluteCornerSize(0));
    }
}
