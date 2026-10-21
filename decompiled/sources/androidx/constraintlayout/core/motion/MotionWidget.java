package androidx.constraintlayout.core.motion;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.motion.utils.a;
import androidx.constraintlayout.core.motion.utils.e;
import androidx.constraintlayout.core.state.WidgetFrame;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class MotionWidget implements TypedValues {
    public static final int FILL_PARENT = -1;
    public static final int GONE_UNSET = Integer.MIN_VALUE;
    public static final int INVISIBLE = 0;
    public static final int MATCH_CONSTRAINT = 0;
    public static final int MATCH_CONSTRAINT_WRAP = 1;
    public static final int MATCH_PARENT = -1;
    public static final int PARENT_ID = 0;
    public static final int ROTATE_LEFT_OF_PORTRATE = 4;
    public static final int ROTATE_NONE = 0;
    public static final int ROTATE_PORTRATE_OF_LEFT = 2;
    public static final int ROTATE_PORTRATE_OF_RIGHT = 1;
    public static final int ROTATE_RIGHT_OF_PORTRATE = 3;
    public static final int UNSET = -1;
    public static final int VISIBILITY_MODE_IGNORE = 1;
    public static final int VISIBILITY_MODE_NORMAL = 0;
    public static final int VISIBLE = 4;
    public static final int WRAP_CONTENT = -2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WidgetFrame f18756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Motion f18757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PropertySet f18758c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f18759d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f18760e;

    public static class Motion {
        public String mAnimateRelativeTo = null;
        public int mAnimateCircleAngleTo = 0;
        public String mTransitionEasing = null;
        public int mPathMotionArc = -1;
        public int mDrawPath = 0;
        public float mMotionStagger = Float.NaN;
        public int mPolarRelativeTo = -1;
        public float mPathRotate = Float.NaN;
        public float mQuantizeMotionPhase = Float.NaN;
        public int mQuantizeMotionSteps = -1;
        public String mQuantizeInterpolatorString = null;
        public int mQuantizeInterpolatorType = -3;
        public int mQuantizeInterpolatorID = -1;
    }

    public static class PropertySet {
        public int visibility = 4;
        public int mVisibilityMode = 0;
        public float alpha = 1.0f;
        public float mProgress = Float.NaN;
    }

    public MotionWidget() {
        this.f18756a = new WidgetFrame();
        this.f18757b = new Motion();
        this.f18758c = new PropertySet();
    }

    public MotionWidget findViewById(int i10) {
        return null;
    }

    public float getAlpha() {
        return this.f18756a.alpha;
    }

    public int getBottom() {
        return this.f18756a.bottom;
    }

    public CustomVariable getCustomAttribute(String str) {
        return this.f18756a.getCustomAttribute(str);
    }

    public Set<String> getCustomAttributeNames() {
        return this.f18756a.getCustomAttributeNames();
    }

    public int getHeight() {
        WidgetFrame widgetFrame = this.f18756a;
        return widgetFrame.bottom - widgetFrame.top;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public int getId(String str) {
        int iA = a.a(str);
        return iA != -1 ? iA : e.a(str);
    }

    public int getLeft() {
        return this.f18756a.left;
    }

    public String getName() {
        return this.f18756a.getId();
    }

    public MotionWidget getParent() {
        return null;
    }

    public float getPivotX() {
        return this.f18756a.pivotX;
    }

    public float getPivotY() {
        return this.f18756a.pivotY;
    }

    public int getRight() {
        return this.f18756a.right;
    }

    public float getRotationX() {
        return this.f18756a.rotationX;
    }

    public float getRotationY() {
        return this.f18756a.rotationY;
    }

    public float getRotationZ() {
        return this.f18756a.rotationZ;
    }

    public float getScaleX() {
        return this.f18756a.scaleX;
    }

    public float getScaleY() {
        return this.f18756a.scaleY;
    }

    public int getTop() {
        return this.f18756a.top;
    }

    public float getTranslationX() {
        return this.f18756a.translationX;
    }

    public float getTranslationY() {
        return this.f18756a.translationY;
    }

    public float getTranslationZ() {
        return this.f18756a.translationZ;
    }

    public float getValueAttributes(int i10) {
        switch (i10) {
            case 303:
                return this.f18756a.alpha;
            case 304:
                return this.f18756a.translationX;
            case 305:
                return this.f18756a.translationY;
            case 306:
                return this.f18756a.translationZ;
            case 307:
            default:
                return Float.NaN;
            case 308:
                return this.f18756a.rotationX;
            case 309:
                return this.f18756a.rotationY;
            case 310:
                return this.f18756a.rotationZ;
            case 311:
                return this.f18756a.scaleX;
            case 312:
                return this.f18756a.scaleY;
            case 313:
                return this.f18756a.pivotX;
            case 314:
                return this.f18756a.pivotY;
            case 315:
                return this.f18759d;
            case TypedValues.AttributesType.TYPE_PATH_ROTATE /* 316 */:
                return this.f18760e;
        }
    }

    public int getVisibility() {
        return this.f18758c.visibility;
    }

    public WidgetFrame getWidgetFrame() {
        return this.f18756a;
    }

    public int getWidth() {
        WidgetFrame widgetFrame = this.f18756a;
        return widgetFrame.right - widgetFrame.left;
    }

    public int getX() {
        return this.f18756a.left;
    }

    public int getY() {
        return this.f18756a.top;
    }

    public void layout(int i10, int i11, int i12, int i13) {
        setBounds(i10, i11, i12, i13);
    }

    public void setBounds(int i10, int i11, int i12, int i13) {
        if (this.f18756a == null) {
            this.f18756a = new WidgetFrame((ConstraintWidget) null);
        }
        WidgetFrame widgetFrame = this.f18756a;
        widgetFrame.top = i11;
        widgetFrame.left = i10;
        widgetFrame.right = i12;
        widgetFrame.bottom = i13;
    }

    public void setCustomAttribute(String str, int i10, float f6) {
        this.f18756a.setCustomAttribute(str, i10, f6);
    }

    public void setInterpolatedValue(CustomAttribute customAttribute, float[] fArr) {
        this.f18756a.setCustomAttribute(customAttribute.f18710a, 901, fArr[0]);
    }

    public void setPivotX(float f6) {
        this.f18756a.pivotX = f6;
    }

    public void setPivotY(float f6) {
        this.f18756a.pivotY = f6;
    }

    public void setRotationX(float f6) {
        this.f18756a.rotationX = f6;
    }

    public void setRotationY(float f6) {
        this.f18756a.rotationY = f6;
    }

    public void setRotationZ(float f6) {
        this.f18756a.rotationZ = f6;
    }

    public void setScaleX(float f6) {
        this.f18756a.scaleX = f6;
    }

    public void setScaleY(float f6) {
        this.f18756a.scaleY = f6;
    }

    public void setTranslationX(float f6) {
        this.f18756a.translationX = f6;
    }

    public void setTranslationY(float f6) {
        this.f18756a.translationY = f6;
    }

    public void setTranslationZ(float f6) {
        this.f18756a.translationZ = f6;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i10, boolean z10) {
        return false;
    }

    public boolean setValueAttributes(int i10, float f6) {
        switch (i10) {
            case 303:
                this.f18756a.alpha = f6;
                return true;
            case 304:
                this.f18756a.translationX = f6;
                return true;
            case 305:
                this.f18756a.translationY = f6;
                return true;
            case 306:
                this.f18756a.translationZ = f6;
                return true;
            case 307:
            default:
                return false;
            case 308:
                this.f18756a.rotationX = f6;
                return true;
            case 309:
                this.f18756a.rotationY = f6;
                return true;
            case 310:
                this.f18756a.rotationZ = f6;
                return true;
            case 311:
                this.f18756a.scaleX = f6;
                return true;
            case 312:
                this.f18756a.scaleY = f6;
                return true;
            case 313:
                this.f18756a.pivotX = f6;
                return true;
            case 314:
                this.f18756a.pivotY = f6;
                return true;
            case 315:
                this.f18759d = f6;
                return true;
            case TypedValues.AttributesType.TYPE_PATH_ROTATE /* 316 */:
                this.f18760e = f6;
                return true;
        }
    }

    public boolean setValueMotion(int i10, int i11) {
        Motion motion = this.f18757b;
        switch (i10) {
            case TypedValues.MotionType.TYPE_ANIMATE_CIRCLEANGLE_TO /* 606 */:
                motion.mAnimateCircleAngleTo = i11;
                return true;
            case TypedValues.MotionType.TYPE_PATHMOTION_ARC /* 607 */:
                motion.mPathMotionArc = i11;
                return true;
            case TypedValues.MotionType.TYPE_DRAW_PATH /* 608 */:
                motion.mDrawPath = i11;
                return true;
            case TypedValues.MotionType.TYPE_POLAR_RELATIVETO /* 609 */:
                motion.mPolarRelativeTo = i11;
                return true;
            case TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS /* 610 */:
                motion.mQuantizeMotionSteps = i11;
                return true;
            case TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR_TYPE /* 611 */:
                motion.mQuantizeInterpolatorType = i11;
                return true;
            case TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR_ID /* 612 */:
                motion.mQuantizeInterpolatorID = i11;
                return true;
            default:
                return false;
        }
    }

    public void setVisibility(int i10) {
        this.f18758c.visibility = i10;
    }

    public String toString() {
        return this.f18756a.left + ", " + this.f18756a.top + ", " + this.f18756a.right + ", " + this.f18756a.bottom;
    }

    public void updateMotion(TypedValues typedValues) {
        if (this.f18756a.getMotionProperties() != null) {
            this.f18756a.getMotionProperties().applyDelta(typedValues);
        }
    }

    public void setCustomAttribute(String str, int i10, int i11) {
        this.f18756a.setCustomAttribute(str, i10, i11);
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i10, int i11) {
        if (setValueAttributes(i10, i11)) {
            return true;
        }
        return setValueMotion(i10, i11);
    }

    public void setCustomAttribute(String str, int i10, boolean z10) {
        this.f18756a.setCustomAttribute(str, i10, z10);
    }

    public void setCustomAttribute(String str, int i10, String str2) {
        this.f18756a.setCustomAttribute(str, i10, str2);
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i10, float f6) {
        if (setValueAttributes(i10, f6)) {
            return true;
        }
        return setValueMotion(i10, f6);
    }

    public MotionWidget(WidgetFrame widgetFrame) {
        this.f18756a = new WidgetFrame();
        this.f18757b = new Motion();
        this.f18758c = new PropertySet();
        this.f18756a = widgetFrame;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i10, String str) {
        if (i10 == 605) {
            this.f18757b.mAnimateRelativeTo = str;
            return true;
        }
        return setValueMotion(i10, str);
    }

    public boolean setValueMotion(int i10, String str) {
        Motion motion = this.f18757b;
        if (i10 == 603) {
            motion.mTransitionEasing = str;
            return true;
        }
        if (i10 != 604) {
            return false;
        }
        motion.mQuantizeInterpolatorString = str;
        return true;
    }

    public boolean setValueMotion(int i10, float f6) {
        Motion motion = this.f18757b;
        switch (i10) {
            case 600:
                motion.mMotionStagger = f6;
                return true;
            case 601:
                motion.mPathRotate = f6;
                return true;
            case 602:
                motion.mQuantizeMotionPhase = f6;
                return true;
            default:
                return false;
        }
    }
}
