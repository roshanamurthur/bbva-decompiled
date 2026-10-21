package androidx.constraintlayout.core.motion.key;

import androidx.camera.camera2.internal.h0;
import androidx.constraintlayout.core.motion.MotionWidget;
import androidx.constraintlayout.core.motion.utils.FloatRect;
import androidx.constraintlayout.core.motion.utils.SplineSet;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.motion.utils.f;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public class MotionKeyPosition extends MotionKey {
    protected static final float SELECTION_SLOPE = 20.0f;
    public static final int TYPE_CARTESIAN = 0;
    public static final int TYPE_PATH = 1;
    public static final int TYPE_SCREEN = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f18791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f18792b;
    public float mAltPercentX;
    public float mAltPercentY;
    public int mCurveFit;
    public int mDrawPath;
    public int mPathMotionArc;
    public float mPercentHeight;
    public float mPercentWidth;
    public float mPercentX;
    public float mPercentY;
    public int mPositionType;
    public String mTransitionEasing;

    public MotionKeyPosition() {
        int i10 = MotionKey.UNSET;
        this.mCurveFit = i10;
        this.mTransitionEasing = null;
        this.mPathMotionArc = i10;
        this.mDrawPath = 0;
        this.mPercentWidth = Float.NaN;
        this.mPercentHeight = Float.NaN;
        this.mPercentX = Float.NaN;
        this.mPercentY = Float.NaN;
        this.mAltPercentX = Float.NaN;
        this.mAltPercentY = Float.NaN;
        this.mPositionType = 0;
        this.f18791a = Float.NaN;
        this.f18792b = Float.NaN;
        this.mType = 2;
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public MotionKey copy(MotionKey motionKey) {
        super.copy(motionKey);
        MotionKeyPosition motionKeyPosition = (MotionKeyPosition) motionKey;
        this.mTransitionEasing = motionKeyPosition.mTransitionEasing;
        this.mPathMotionArc = motionKeyPosition.mPathMotionArc;
        this.mDrawPath = motionKeyPosition.mDrawPath;
        this.mPercentWidth = motionKeyPosition.mPercentWidth;
        this.mPercentHeight = Float.NaN;
        this.mPercentX = motionKeyPosition.mPercentX;
        this.mPercentY = motionKeyPosition.mPercentY;
        this.mAltPercentX = motionKeyPosition.mAltPercentX;
        this.mAltPercentY = motionKeyPosition.mAltPercentY;
        this.f18791a = motionKeyPosition.f18791a;
        this.f18792b = motionKeyPosition.f18792b;
        return this;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public int getId(String str) {
        return f.a(str);
    }

    public boolean intersects(int i10, int i11, FloatRect floatRect, FloatRect floatRect2, float f6, float f10) {
        float fCenterX = floatRect.centerX();
        float fCenterY = floatRect.centerY();
        float fCenterX2 = floatRect2.centerX();
        float fCenterY2 = floatRect2.centerY();
        int i12 = this.mPositionType;
        if (i12 == 1) {
            float f11 = fCenterX2 - fCenterX;
            float f12 = fCenterY2 - fCenterY;
            float f13 = this.mPercentX;
            float f14 = (f11 * f13) + fCenterX;
            float f15 = this.mPercentY;
            this.f18791a = ((-f12) * f15) + f14;
            this.f18792b = (f11 * f15) + (f12 * f13) + fCenterY;
        } else if (i12 != 2) {
            float f16 = fCenterX2 - fCenterX;
            float f17 = fCenterY2 - fCenterY;
            float f18 = Float.isNaN(this.mPercentX) ? 0.0f : this.mPercentX;
            float f19 = Float.isNaN(this.mAltPercentY) ? 0.0f : this.mAltPercentY;
            float f20 = Float.isNaN(this.mPercentY) ? 0.0f : this.mPercentY;
            this.f18791a = (int) (((Float.isNaN(this.mAltPercentX) ? 0.0f : this.mAltPercentX) * f17) + (f18 * f16) + fCenterX);
            this.f18792b = (int) ((f17 * f20) + (f16 * f19) + fCenterY);
        } else {
            float f21 = this.mPercentX;
            float f22 = 0;
            this.f18791a = (i10 * f21) + f22;
            this.f18792b = (i11 * f21) + f22;
        }
        return Math.abs(f6 - this.f18791a) < 20.0f && Math.abs(f10 - this.f18792b) < 20.0f;
    }

    public void positionAttributes(MotionWidget motionWidget, FloatRect floatRect, FloatRect floatRect2, float f6, float f10, String[] strArr, float[] fArr) {
        int i10 = this.mPositionType;
        if (i10 == 1) {
            float fCenterX = floatRect.centerX();
            float fCenterY = floatRect.centerY();
            float fCenterX2 = floatRect2.centerX() - fCenterX;
            float fCenterY2 = floatRect2.centerY() - fCenterY;
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
        if (i10 != 2) {
            float fCenterX3 = floatRect.centerX();
            float fCenterY3 = floatRect.centerY();
            float fCenterX4 = floatRect2.centerX() - fCenterX3;
            float fCenterY4 = floatRect2.centerY() - fCenterY3;
            String str2 = strArr[0];
            if (str2 == null) {
                strArr[0] = "percentX";
                fArr[0] = (f6 - fCenterX3) / fCenterX4;
                strArr[1] = "percentY";
                fArr[1] = (f10 - fCenterY3) / fCenterY4;
                return;
            }
            if ("percentX".equals(str2)) {
                fArr[0] = (f6 - fCenterX3) / fCenterX4;
                fArr[1] = (f10 - fCenterY3) / fCenterY4;
                return;
            } else {
                fArr[1] = (f6 - fCenterX3) / fCenterX4;
                fArr[0] = (f10 - fCenterY3) / fCenterY4;
                return;
            }
        }
        floatRect.centerX();
        floatRect.centerY();
        floatRect2.centerX();
        floatRect2.centerY();
        MotionWidget parent = motionWidget.getParent();
        int width = parent.getWidth();
        int height = parent.getHeight();
        String str3 = strArr[0];
        if (str3 == null) {
            strArr[0] = "percentX";
            fArr[0] = f6 / width;
            strArr[1] = "percentY";
            fArr[1] = f10 / height;
            return;
        }
        if ("percentX".equals(str3)) {
            fArr[0] = f6 / width;
            fArr[1] = f10 / height;
        } else {
            fArr[1] = f6 / width;
            fArr[0] = f10 / height;
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i10, int i11) {
        if (i10 == 100) {
            this.mFramePosition = i11;
            return true;
        }
        if (i10 == 508) {
            this.mCurveFit = i11;
            return true;
        }
        if (i10 != 510) {
            return super.setValue(i10, i11);
        }
        this.mPositionType = i11;
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    /* JADX INFO: renamed from: clone */
    public MotionKey mo4632clone() {
        return new MotionKeyPosition().copy(this);
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i10, float f6) {
        switch (i10) {
            case 503:
                this.mPercentWidth = f6;
                return true;
            case 504:
                this.mPercentHeight = f6;
                return true;
            case TypedValues.PositionType.TYPE_SIZE_PERCENT /* 505 */:
                this.mPercentWidth = f6;
                this.mPercentHeight = f6;
                return true;
            case TypedValues.PositionType.TYPE_PERCENT_X /* 506 */:
                this.mPercentX = f6;
                return true;
            case TypedValues.PositionType.TYPE_PERCENT_Y /* 507 */:
                this.mPercentY = f6;
                return true;
            default:
                return super.setValue(i10, f6);
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i10, String str) {
        if (i10 != 501) {
            return super.setValue(i10, str);
        }
        this.mTransitionEasing = str.toString();
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public void addValues(HashMap<String, SplineSet> map) {
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public void getAttributeNames(HashSet<String> hashSet) {
    }
}
