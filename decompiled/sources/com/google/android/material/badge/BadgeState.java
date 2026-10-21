package com.google.android.material.badge;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import androidx.annotation.ColorInt;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.PluralsRes;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.annotation.XmlRes;
import com.google.android.material.R;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.resources.TextAppearance;
import java.util.Locale;

/* JADX INFO: loaded from: classes10.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class BadgeState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final State f43965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final State f43966b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f43967c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f43968d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f43969e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f43970f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f43971g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f43972h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f43973i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f43974j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f43975k;

    public static final class State implements Parcelable {
        public static final Parcelable.Creator<State> CREATOR = new a();
        public Locale H0;

        @Nullable
        public CharSequence I0;

        @Nullable
        public CharSequence J0;

        @PluralsRes
        public int K0;

        @StringRes
        public int L0;
        public Integer M0;

        @Px
        public Integer O0;

        @Px
        public Integer P0;

        @Dimension(unit = 1)
        public Integer Q0;

        @Dimension(unit = 1)
        public Integer R0;

        @Dimension(unit = 1)
        public Integer S0;

        @Dimension(unit = 1)
        public Integer T0;

        @Dimension(unit = 1)
        public Integer U0;

        @Dimension(unit = 1)
        public Integer V0;

        @Dimension(unit = 1)
        public Integer W0;
        public Boolean X0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        @XmlRes
        public int f43976p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        @ColorInt
        public Integer f43977q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        @ColorInt
        public Integer f43978r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        @StyleRes
        public Integer f43979s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        @StyleRes
        public Integer f43980t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        @StyleRes
        public Integer f43981u0;

        @StyleRes
        public Integer v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        @StyleRes
        public Integer f43982w0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        @Nullable
        public String f43984y0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public int f43983x0 = 255;
        public int E0 = -2;
        public int F0 = -2;
        public int G0 = -2;
        public Boolean N0 = Boolean.TRUE;

        public class a implements Parcelable.Creator<State> {
            @Override // android.os.Parcelable.Creator
            @NonNull
            public final State createFromParcel(@NonNull Parcel parcel) {
                State state = new State();
                state.f43983x0 = 255;
                state.E0 = -2;
                state.F0 = -2;
                state.G0 = -2;
                state.N0 = Boolean.TRUE;
                state.f43976p0 = parcel.readInt();
                state.f43977q0 = (Integer) parcel.readSerializable();
                state.f43978r0 = (Integer) parcel.readSerializable();
                state.f43979s0 = (Integer) parcel.readSerializable();
                state.f43980t0 = (Integer) parcel.readSerializable();
                state.f43981u0 = (Integer) parcel.readSerializable();
                state.v0 = (Integer) parcel.readSerializable();
                state.f43982w0 = (Integer) parcel.readSerializable();
                state.f43983x0 = parcel.readInt();
                state.f43984y0 = parcel.readString();
                state.E0 = parcel.readInt();
                state.F0 = parcel.readInt();
                state.G0 = parcel.readInt();
                state.I0 = parcel.readString();
                state.J0 = parcel.readString();
                state.K0 = parcel.readInt();
                state.M0 = (Integer) parcel.readSerializable();
                state.O0 = (Integer) parcel.readSerializable();
                state.P0 = (Integer) parcel.readSerializable();
                state.Q0 = (Integer) parcel.readSerializable();
                state.R0 = (Integer) parcel.readSerializable();
                state.S0 = (Integer) parcel.readSerializable();
                state.T0 = (Integer) parcel.readSerializable();
                state.W0 = (Integer) parcel.readSerializable();
                state.U0 = (Integer) parcel.readSerializable();
                state.V0 = (Integer) parcel.readSerializable();
                state.N0 = (Boolean) parcel.readSerializable();
                state.H0 = (Locale) parcel.readSerializable();
                state.X0 = (Boolean) parcel.readSerializable();
                return state;
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            public final State[] newArray(int i10) {
                return new State[i10];
            }
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i10) {
            parcel.writeInt(this.f43976p0);
            parcel.writeSerializable(this.f43977q0);
            parcel.writeSerializable(this.f43978r0);
            parcel.writeSerializable(this.f43979s0);
            parcel.writeSerializable(this.f43980t0);
            parcel.writeSerializable(this.f43981u0);
            parcel.writeSerializable(this.v0);
            parcel.writeSerializable(this.f43982w0);
            parcel.writeInt(this.f43983x0);
            parcel.writeString(this.f43984y0);
            parcel.writeInt(this.E0);
            parcel.writeInt(this.F0);
            parcel.writeInt(this.G0);
            CharSequence charSequence = this.I0;
            parcel.writeString(charSequence != null ? charSequence.toString() : null);
            CharSequence charSequence2 = this.J0;
            parcel.writeString(charSequence2 != null ? charSequence2.toString() : null);
            parcel.writeInt(this.K0);
            parcel.writeSerializable(this.M0);
            parcel.writeSerializable(this.O0);
            parcel.writeSerializable(this.P0);
            parcel.writeSerializable(this.Q0);
            parcel.writeSerializable(this.R0);
            parcel.writeSerializable(this.S0);
            parcel.writeSerializable(this.T0);
            parcel.writeSerializable(this.W0);
            parcel.writeSerializable(this.U0);
            parcel.writeSerializable(this.V0);
            parcel.writeSerializable(this.N0);
            parcel.writeSerializable(this.H0);
            parcel.writeSerializable(this.X0);
        }
    }

    public BadgeState(Context context, @XmlRes int i10, @Nullable State state) {
        AttributeSet drawableXml;
        int styleAttribute;
        int i11 = BadgeDrawable.I0;
        int i12 = BadgeDrawable.H0;
        State state2 = new State();
        this.f43966b = state2;
        state = state == null ? new State() : state;
        if (i10 != 0) {
            state.f43976p0 = i10;
        }
        int i13 = state.f43976p0;
        if (i13 != 0) {
            drawableXml = DrawableUtils.parseDrawableXml(context, i13, "badge");
            styleAttribute = drawableXml.getStyleAttribute();
        } else {
            drawableXml = null;
            styleAttribute = 0;
        }
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context, drawableXml, R.styleable.Badge, i11, styleAttribute == 0 ? i12 : styleAttribute, new int[0]);
        Resources resources = context.getResources();
        this.f43967c = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.Badge_badgeRadius, -1);
        this.f43973i = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_horizontal_edge_offset);
        this.f43974j = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_text_horizontal_edge_offset);
        this.f43968d = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.Badge_badgeWithTextRadius, -1);
        int i14 = R.styleable.Badge_badgeWidth;
        int i15 = R.dimen.m3_badge_size;
        this.f43969e = typedArrayObtainStyledAttributes.getDimension(i14, resources.getDimension(i15));
        int i16 = R.styleable.Badge_badgeWithTextWidth;
        int i17 = R.dimen.m3_badge_with_text_size;
        this.f43971g = typedArrayObtainStyledAttributes.getDimension(i16, resources.getDimension(i17));
        this.f43970f = typedArrayObtainStyledAttributes.getDimension(R.styleable.Badge_badgeHeight, resources.getDimension(i15));
        this.f43972h = typedArrayObtainStyledAttributes.getDimension(R.styleable.Badge_badgeWithTextHeight, resources.getDimension(i17));
        boolean z10 = true;
        this.f43975k = typedArrayObtainStyledAttributes.getInt(R.styleable.Badge_offsetAlignmentMode, 1);
        int i18 = state.f43983x0;
        state2.f43983x0 = i18 == -2 ? 255 : i18;
        int i19 = state.E0;
        if (i19 != -2) {
            state2.E0 = i19;
        } else {
            int i20 = R.styleable.Badge_number;
            if (typedArrayObtainStyledAttributes.hasValue(i20)) {
                state2.E0 = typedArrayObtainStyledAttributes.getInt(i20, 0);
            } else {
                state2.E0 = -1;
            }
        }
        String str = state.f43984y0;
        if (str != null) {
            state2.f43984y0 = str;
        } else {
            int i21 = R.styleable.Badge_badgeText;
            if (typedArrayObtainStyledAttributes.hasValue(i21)) {
                state2.f43984y0 = typedArrayObtainStyledAttributes.getString(i21);
            }
        }
        state2.I0 = state.I0;
        CharSequence charSequence = state.J0;
        state2.J0 = charSequence == null ? context.getString(R.string.mtrl_badge_numberless_content_description) : charSequence;
        int i22 = state.K0;
        state2.K0 = i22 == 0 ? R.plurals.mtrl_badge_content_description : i22;
        int i23 = state.L0;
        state2.L0 = i23 == 0 ? R.string.mtrl_exceed_max_badge_number_content_description : i23;
        Boolean bool = state.N0;
        if (bool != null && !bool.booleanValue()) {
            z10 = false;
        }
        state2.N0 = Boolean.valueOf(z10);
        int i24 = state.F0;
        state2.F0 = i24 == -2 ? typedArrayObtainStyledAttributes.getInt(R.styleable.Badge_maxCharacterCount, -2) : i24;
        int i25 = state.G0;
        state2.G0 = i25 == -2 ? typedArrayObtainStyledAttributes.getInt(R.styleable.Badge_maxNumber, -2) : i25;
        Integer num = state.f43980t0;
        state2.f43980t0 = Integer.valueOf(num == null ? typedArrayObtainStyledAttributes.getResourceId(R.styleable.Badge_badgeShapeAppearance, R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full) : num.intValue());
        Integer num2 = state.f43981u0;
        state2.f43981u0 = Integer.valueOf(num2 == null ? typedArrayObtainStyledAttributes.getResourceId(R.styleable.Badge_badgeShapeAppearanceOverlay, 0) : num2.intValue());
        Integer num3 = state.v0;
        state2.v0 = Integer.valueOf(num3 == null ? typedArrayObtainStyledAttributes.getResourceId(R.styleable.Badge_badgeWithTextShapeAppearance, R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full) : num3.intValue());
        Integer num4 = state.f43982w0;
        state2.f43982w0 = Integer.valueOf(num4 == null ? typedArrayObtainStyledAttributes.getResourceId(R.styleable.Badge_badgeWithTextShapeAppearanceOverlay, 0) : num4.intValue());
        Integer num5 = state.f43977q0;
        state2.f43977q0 = Integer.valueOf(num5 == null ? MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, R.styleable.Badge_backgroundColor).getDefaultColor() : num5.intValue());
        Integer num6 = state.f43979s0;
        state2.f43979s0 = Integer.valueOf(num6 == null ? typedArrayObtainStyledAttributes.getResourceId(R.styleable.Badge_badgeTextAppearance, R.style.TextAppearance_MaterialComponents_Badge) : num6.intValue());
        Integer num7 = state.f43978r0;
        if (num7 != null) {
            state2.f43978r0 = num7;
        } else {
            int i26 = R.styleable.Badge_badgeTextColor;
            if (typedArrayObtainStyledAttributes.hasValue(i26)) {
                state2.f43978r0 = Integer.valueOf(MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, i26).getDefaultColor());
            } else {
                state2.f43978r0 = Integer.valueOf(new TextAppearance(context, state2.f43979s0.intValue()).getTextColor().getDefaultColor());
            }
        }
        Integer num8 = state.M0;
        state2.M0 = Integer.valueOf(num8 == null ? typedArrayObtainStyledAttributes.getInt(R.styleable.Badge_badgeGravity, 8388661) : num8.intValue());
        Integer num9 = state.O0;
        state2.O0 = Integer.valueOf(num9 == null ? typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.Badge_badgeWidePadding, resources.getDimensionPixelSize(R.dimen.mtrl_badge_long_text_horizontal_padding)) : num9.intValue());
        Integer num10 = state.P0;
        state2.P0 = Integer.valueOf(num10 == null ? typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.Badge_badgeVerticalPadding, resources.getDimensionPixelSize(R.dimen.m3_badge_with_text_vertical_padding)) : num10.intValue());
        Integer num11 = state.Q0;
        state2.Q0 = Integer.valueOf(num11 == null ? typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.Badge_horizontalOffset, 0) : num11.intValue());
        Integer num12 = state.R0;
        state2.R0 = Integer.valueOf(num12 == null ? typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.Badge_verticalOffset, 0) : num12.intValue());
        Integer num13 = state.S0;
        state2.S0 = Integer.valueOf(num13 == null ? typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.Badge_horizontalOffsetWithText, state2.Q0.intValue()) : num13.intValue());
        Integer num14 = state.T0;
        state2.T0 = Integer.valueOf(num14 == null ? typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.Badge_verticalOffsetWithText, state2.R0.intValue()) : num14.intValue());
        Integer num15 = state.W0;
        state2.W0 = Integer.valueOf(num15 == null ? typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.Badge_largeFontVerticalOffsetAdjustment, 0) : num15.intValue());
        Integer num16 = state.U0;
        state2.U0 = Integer.valueOf(num16 == null ? 0 : num16.intValue());
        Integer num17 = state.V0;
        state2.V0 = Integer.valueOf(num17 == null ? 0 : num17.intValue());
        Boolean bool2 = state.X0;
        state2.X0 = Boolean.valueOf(bool2 == null ? typedArrayObtainStyledAttributes.getBoolean(R.styleable.Badge_autoAdjustToWithinGrandparentBounds, false) : bool2.booleanValue());
        typedArrayObtainStyledAttributes.recycle();
        Locale locale = state.H0;
        if (locale == null) {
            state2.H0 = Build.VERSION.SDK_INT >= 24 ? Locale.getDefault(Locale.Category.FORMAT) : Locale.getDefault();
        } else {
            state2.H0 = locale;
        }
        this.f43965a = state;
    }
}
