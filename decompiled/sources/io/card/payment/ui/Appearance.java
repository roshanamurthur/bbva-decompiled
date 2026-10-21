package io.card.payment.ui;

import android.R;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.RectShape;

/* JADX INFO: loaded from: classes7.dex */
public class Appearance {
    public static final Drawable ACTIONBAR_BACKGROUND;
    public static final int BUTTON_PRIMARY_DISABLED_COLOR;
    public static final int BUTTON_PRIMARY_FOCUS_COLOR;
    public static final int BUTTON_PRIMARY_NORMAL_COLOR;
    public static final int BUTTON_PRIMARY_PRESSED_COLOR;
    public static final int BUTTON_SECONDARY_DISABLED_COLOR;
    public static final int BUTTON_SECONDARY_FOCUS_COLOR;
    public static final int BUTTON_SECONDARY_NORMAL_COLOR;
    public static final int BUTTON_SECONDARY_PRESSED_COLOR;
    public static final int DEFAULT_BACKGROUND_COLOR;
    public static final int PAL_BLUE_COLOR;
    public static final int PAL_BLUE_COLOR_OPACITY_66;
    public static final int PAY_BLUE_COLOR;
    public static final int TEXT_COLOR_ERROR;
    public static final int TEXT_COLOR_LABEL;
    public static final int TEXT_COLOR_LIGHT;
    public static final Typeface TYPEFACE_BUTTON;
    public static final int[] BUTTON_STATE_PRESSED = {R.attr.state_pressed, R.attr.state_enabled};
    public static final int[] BUTTON_STATE_NORMAL = {R.attr.state_enabled};
    public static final int[] BUTTON_STATE_DISABLED = {-16842910};
    public static final int[] BUTTON_STATE_FOCUSED = {R.attr.state_focused};

    static {
        int color = Color.parseColor("#003087");
        PAY_BLUE_COLOR = color;
        int color2 = Color.parseColor("#009CDE");
        PAL_BLUE_COLOR = color2;
        int color3 = Color.parseColor("#aa009CDE");
        PAL_BLUE_COLOR_OPACITY_66 = color3;
        ACTIONBAR_BACKGROUND = new ColorDrawable(Color.parseColor("#717074"));
        DEFAULT_BACKGROUND_COLOR = Color.parseColor("#f5f5f5");
        BUTTON_PRIMARY_NORMAL_COLOR = color2;
        BUTTON_PRIMARY_FOCUS_COLOR = color3;
        BUTTON_PRIMARY_PRESSED_COLOR = color;
        BUTTON_PRIMARY_DISABLED_COLOR = Color.parseColor("#c5ddeb");
        BUTTON_SECONDARY_NORMAL_COLOR = Color.parseColor("#717074");
        BUTTON_SECONDARY_FOCUS_COLOR = Color.parseColor("#aa717074");
        BUTTON_SECONDARY_PRESSED_COLOR = Color.parseColor("#5a5a5d");
        BUTTON_SECONDARY_DISABLED_COLOR = Color.parseColor("#f5f5f5");
        int color4 = Color.parseColor("#515151");
        TEXT_COLOR_LIGHT = color4;
        TEXT_COLOR_ERROR = Color.parseColor("#b32317");
        TEXT_COLOR_LABEL = color4;
        TYPEFACE_BUTTON = Typeface.create("sans-serif-light", 0);
    }

    public static LayerDrawable a(float f6, int i10, int i11) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
        shapeDrawable.getPaint().setStrokeWidth(2.0f * f6);
        Paint paint = shapeDrawable.getPaint();
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        shapeDrawable.getPaint().setColor(DEFAULT_BACKGROUND_COLOR);
        ShapeDrawable shapeDrawable2 = new ShapeDrawable(new RectShape());
        shapeDrawable2.getPaint().setStrokeWidth(f6);
        shapeDrawable2.getPaint().setStyle(style);
        shapeDrawable2.getPaint().setColor(i11);
        return new LayerDrawable(new Drawable[]{new ColorDrawable(i10), shapeDrawable, shapeDrawable2});
    }

    public static LayerDrawable b(float f6, int i10) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
        shapeDrawable.getPaint().setStrokeWidth(f6 * 2.0f);
        shapeDrawable.getPaint().setStyle(Paint.Style.STROKE);
        shapeDrawable.getPaint().setColor(DEFAULT_BACKGROUND_COLOR);
        return new LayerDrawable(new Drawable[]{new ColorDrawable(i10), shapeDrawable});
    }

    public static Drawable buttonBackgroundPrimary(Context context) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(BUTTON_STATE_PRESSED, new ColorDrawable(BUTTON_PRIMARY_PRESSED_COLOR));
        stateListDrawable.addState(BUTTON_STATE_DISABLED, new ColorDrawable(BUTTON_PRIMARY_DISABLED_COLOR));
        int[] iArr = BUTTON_STATE_FOCUSED;
        int i10 = BUTTON_PRIMARY_NORMAL_COLOR;
        stateListDrawable.addState(iArr, a(c(context), i10, BUTTON_PRIMARY_FOCUS_COLOR));
        stateListDrawable.addState(BUTTON_STATE_NORMAL, b(c(context), i10));
        return stateListDrawable;
    }

    public static Drawable buttonBackgroundSecondary(Context context) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(BUTTON_STATE_PRESSED, new ColorDrawable(BUTTON_SECONDARY_PRESSED_COLOR));
        stateListDrawable.addState(BUTTON_STATE_DISABLED, new ColorDrawable(BUTTON_SECONDARY_DISABLED_COLOR));
        int[] iArr = BUTTON_STATE_FOCUSED;
        int i10 = BUTTON_SECONDARY_NORMAL_COLOR;
        stateListDrawable.addState(iArr, a(c(context), i10, BUTTON_SECONDARY_FOCUS_COLOR));
        stateListDrawable.addState(BUTTON_STATE_NORMAL, b(c(context), i10));
        return stateListDrawable;
    }

    public static float c(Context context) {
        return (ViewUtil.typedDimensionValueToPixels("4dip", context) / 2.0f) * context.getResources().getDisplayMetrics().density;
    }
}
