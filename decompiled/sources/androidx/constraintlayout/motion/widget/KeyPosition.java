package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.camera.camera2.internal.h0;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.motion.utils.ViewSpline;
import androidx.constraintlayout.widget.R;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class KeyPosition extends androidx.constraintlayout.motion.widget.a {
    public static final String DRAWPATH = "drawPath";
    public static final String PERCENT_HEIGHT = "percentHeight";
    public static final String PERCENT_WIDTH = "percentWidth";
    public static final String PERCENT_X = "percentX";
    public static final String PERCENT_Y = "percentY";
    public static final String SIZE_PERCENT = "sizePercent";
    public static final String TRANSITION_EASING = "transitionEasing";
    public static final int TYPE_AXIS = 3;
    public static final int TYPE_CARTESIAN = 0;
    public static final int TYPE_PATH = 1;
    public static final int TYPE_SCREEN = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f19340f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f19341g = Key.UNSET;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f19342h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f19343i = Float.NaN;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f19344j = Float.NaN;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f19345k = Float.NaN;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f19346l = Float.NaN;
    public float m = Float.NaN;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f19347n = Float.NaN;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f19348o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f19349p = Float.NaN;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f19350q = Float.NaN;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SparseIntArray f19351a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f19351a = sparseIntArray;
            sparseIntArray.append(R.styleable.KeyPosition_motionTarget, 1);
            sparseIntArray.append(R.styleable.KeyPosition_framePosition, 2);
            sparseIntArray.append(R.styleable.KeyPosition_transitionEasing, 3);
            sparseIntArray.append(R.styleable.KeyPosition_curveFit, 4);
            sparseIntArray.append(R.styleable.KeyPosition_drawPath, 5);
            sparseIntArray.append(R.styleable.KeyPosition_percentX, 6);
            sparseIntArray.append(R.styleable.KeyPosition_percentY, 7);
            sparseIntArray.append(R.styleable.KeyPosition_keyPositionType, 9);
            sparseIntArray.append(R.styleable.KeyPosition_sizePercent, 8);
            sparseIntArray.append(R.styleable.KeyPosition_percentWidth, 11);
            sparseIntArray.append(R.styleable.KeyPosition_percentHeight, 12);
            sparseIntArray.append(R.styleable.KeyPosition_pathMotionArc, 10);
        }
    }

    public KeyPosition() {
        this.mType = 2;
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public Key copy(Key key) {
        super.copy(key);
        KeyPosition keyPosition = (KeyPosition) key;
        this.f19340f = keyPosition.f19340f;
        this.f19341g = keyPosition.f19341g;
        this.f19342h = keyPosition.f19342h;
        this.f19343i = keyPosition.f19343i;
        this.f19344j = Float.NaN;
        this.f19345k = keyPosition.f19345k;
        this.f19346l = keyPosition.f19346l;
        this.m = keyPosition.m;
        this.f19347n = keyPosition.f19347n;
        this.f19349p = keyPosition.f19349p;
        this.f19350q = keyPosition.f19350q;
        return this;
    }

    @Override // androidx.constraintlayout.motion.widget.a
    public boolean intersects(int i10, int i11, RectF rectF, RectF rectF2, float f6, float f10) {
        float fCenterX = rectF.centerX();
        float fCenterY = rectF.centerY();
        float fCenterX2 = rectF2.centerX();
        float fCenterY2 = rectF2.centerY();
        int i12 = this.f19348o;
        if (i12 == 1) {
            float f11 = fCenterX2 - fCenterX;
            float f12 = fCenterY2 - fCenterY;
            float f13 = this.f19345k;
            float f14 = (f11 * f13) + fCenterX;
            float f15 = this.f19346l;
            this.f19349p = ((-f12) * f15) + f14;
            this.f19350q = (f11 * f15) + (f12 * f13) + fCenterY;
        } else if (i12 != 2) {
            float f16 = fCenterX2 - fCenterX;
            float f17 = fCenterY2 - fCenterY;
            float f18 = Float.isNaN(this.f19345k) ? 0.0f : this.f19345k;
            float f19 = Float.isNaN(this.f19347n) ? 0.0f : this.f19347n;
            float f20 = Float.isNaN(this.f19346l) ? 0.0f : this.f19346l;
            this.f19349p = (int) (((Float.isNaN(this.m) ? 0.0f : this.m) * f17) + (f18 * f16) + fCenterX);
            this.f19350q = (int) ((f17 * f20) + (f16 * f19) + fCenterY);
        } else {
            float f21 = this.f19345k;
            float f22 = 0;
            this.f19349p = (i10 * f21) + f22;
            this.f19350q = (i11 * f21) + f22;
        }
        return Math.abs(f6 - this.f19349p) < 20.0f && Math.abs(f10 - this.f19350q) < 20.0f;
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void load(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.KeyPosition);
        SparseIntArray sparseIntArray = a.f19351a;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            SparseIntArray sparseIntArray2 = a.f19351a;
            switch (sparseIntArray2.get(index)) {
                case 1:
                    if (MotionLayout.IS_IN_EDIT_MODE) {
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f19301b);
                        this.f19301b = resourceId;
                        if (resourceId == -1) {
                            this.f19302c = typedArrayObtainStyledAttributes.getString(index);
                        }
                    } else if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        this.f19302c = typedArrayObtainStyledAttributes.getString(index);
                    } else {
                        this.f19301b = typedArrayObtainStyledAttributes.getResourceId(index, this.f19301b);
                    }
                    break;
                case 2:
                    this.f19300a = typedArrayObtainStyledAttributes.getInt(index, this.f19300a);
                    break;
                case 3:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        this.f19340f = typedArrayObtainStyledAttributes.getString(index);
                    } else {
                        this.f19340f = Easing.NAMED_EASING[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                    }
                    break;
                case 4:
                    this.f19582e = typedArrayObtainStyledAttributes.getInteger(index, this.f19582e);
                    break;
                case 5:
                    this.f19342h = typedArrayObtainStyledAttributes.getInt(index, this.f19342h);
                    break;
                case 6:
                    this.f19345k = typedArrayObtainStyledAttributes.getFloat(index, this.f19345k);
                    break;
                case 7:
                    this.f19346l = typedArrayObtainStyledAttributes.getFloat(index, this.f19346l);
                    break;
                case 8:
                    float f6 = typedArrayObtainStyledAttributes.getFloat(index, this.f19344j);
                    this.f19343i = f6;
                    this.f19344j = f6;
                    break;
                case 9:
                    this.f19348o = typedArrayObtainStyledAttributes.getInt(index, this.f19348o);
                    break;
                case 10:
                    this.f19341g = typedArrayObtainStyledAttributes.getInt(index, this.f19341g);
                    break;
                case 11:
                    this.f19343i = typedArrayObtainStyledAttributes.getFloat(index, this.f19343i);
                    break;
                case 12:
                    this.f19344j = typedArrayObtainStyledAttributes.getFloat(index, this.f19344j);
                    break;
                default:
                    Integer.toHexString(index);
                    sparseIntArray2.get(index);
                    break;
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.a
    public void positionAttributes(View view, RectF rectF, RectF rectF2, float f6, float f10, String[] strArr, float[] fArr) {
        int i10 = this.f19348o;
        if (i10 == 1) {
            float fCenterX = rectF.centerX();
            float fCenterY = rectF.centerY();
            float fCenterX2 = rectF2.centerX() - fCenterX;
            float fCenterY2 = rectF2.centerY() - fCenterY;
            float fHypot = (float) Math.hypot(fCenterX2, fCenterY2);
            if (fHypot < 1.0E-4d) {
                System.out.println("distance ~ 0");
                fArr[0] = 0.0f;
                fArr[1] = 0.0f;
                return;
            }
            float f11 = fCenterX2 / fHypot;
            float f12 = fCenterY2 / fHypot;
            float f13 = f10 - fCenterY;
            float f14 = f6 - fCenterX;
            float fA = h0.a(f14, f12, f11 * f13, fHypot);
            float f15 = ((f12 * f13) + (f11 * f14)) / fHypot;
            String str = strArr[0];
            if (str != null) {
                if ("percentX".equals(str)) {
                    fArr[0] = f15;
                    fArr[1] = fA;
                    return;
                }
                return;
            }
            strArr[0] = "percentX";
            strArr[1] = "percentY";
            fArr[0] = f15;
            fArr[1] = fA;
            return;
        }
        if (i10 == 2) {
            rectF.centerX();
            rectF.centerY();
            rectF2.centerX();
            rectF2.centerY();
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            int width = viewGroup.getWidth();
            int height = viewGroup.getHeight();
            String str2 = strArr[0];
            if (str2 == null) {
                strArr[0] = "percentX";
                fArr[0] = f6 / width;
                strArr[1] = "percentY";
                fArr[1] = f10 / height;
                return;
            }
            if ("percentX".equals(str2)) {
                fArr[0] = f6 / width;
                fArr[1] = f10 / height;
                return;
            } else {
                fArr[1] = f6 / width;
                fArr[0] = f10 / height;
                return;
            }
        }
        if (i10 != 3) {
            float fCenterX3 = rectF.centerX();
            float fCenterY3 = rectF.centerY();
            float fCenterX4 = rectF2.centerX() - fCenterX3;
            float fCenterY4 = rectF2.centerY() - fCenterY3;
            String str3 = strArr[0];
            if (str3 == null) {
                strArr[0] = "percentX";
                fArr[0] = (f6 - fCenterX3) / fCenterX4;
                strArr[1] = "percentY";
                fArr[1] = (f10 - fCenterY3) / fCenterY4;
                return;
            }
            if ("percentX".equals(str3)) {
                fArr[0] = (f6 - fCenterX3) / fCenterX4;
                fArr[1] = (f10 - fCenterY3) / fCenterY4;
                return;
            } else {
                fArr[1] = (f6 - fCenterX3) / fCenterX4;
                fArr[0] = (f10 - fCenterY3) / fCenterY4;
                return;
            }
        }
        float fCenterX5 = rectF.centerX();
        float fCenterY5 = rectF.centerY();
        float fCenterX6 = rectF2.centerX();
        float fCenterY6 = rectF2.centerY();
        if (fCenterX5 > fCenterX6) {
            fCenterX6 = fCenterX5;
            fCenterX5 = fCenterX6;
        }
        if (fCenterY5 <= fCenterY6) {
            fCenterY6 = fCenterY5;
            fCenterY5 = fCenterY6;
        }
        float f16 = fCenterX6 - fCenterX5;
        float f17 = fCenterY5 - fCenterY6;
        String str4 = strArr[0];
        if (str4 == null) {
            strArr[0] = "percentX";
            fArr[0] = (f6 - fCenterX5) / f16;
            strArr[1] = "percentY";
            fArr[1] = (f10 - fCenterY6) / f17;
            return;
        }
        if ("percentX".equals(str4)) {
            fArr[0] = (f6 - fCenterX5) / f16;
            fArr[1] = (f10 - fCenterY6) / f17;
        } else {
            fArr[1] = (f6 - fCenterX5) / f16;
            fArr[0] = (f10 - fCenterY6) / f17;
        }
    }

    public void setType(int i10) {
        this.f19348o = i10;
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void setValue(String str, Object obj) {
        str.getClass();
        switch (str) {
            case "transitionEasing":
                this.f19340f = obj.toString();
                break;
            case "percentWidth":
                this.f19343i = Key.a(obj);
                break;
            case "percentHeight":
                this.f19344j = Key.a(obj);
                break;
            case "drawPath":
                this.f19342h = Key.b(obj);
                break;
            case "sizePercent":
                float fA = Key.a(obj);
                this.f19343i = fA;
                this.f19344j = fA;
                break;
            case "percentX":
                this.f19345k = Key.a(obj);
                break;
            case "percentY":
                this.f19346l = Key.a(obj);
                break;
        }
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    /* JADX INFO: renamed from: clone */
    public Key mo4634clone() {
        return new KeyPosition().copy(this);
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void addValues(HashMap<String, ViewSpline> map) {
    }
}
