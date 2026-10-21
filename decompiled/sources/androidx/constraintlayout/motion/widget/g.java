package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.RectF;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.R;

/* JADX INFO: compiled from: TouchResponse.java */
/* JADX INFO: loaded from: classes.dex */
public final class g {
    public static final float[][] E = {new float[]{0.5f, 0.0f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}, new float[]{0.5f, 1.0f}, new float[]{0.5f, 0.5f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}};
    public static final float[][] F = {new float[]{0.0f, -1.0f}, new float[]{0.0f, 1.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}};
    public final float A;
    public final float B;
    public final int C;
    public final int D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f19604c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f19605d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f19606e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f19607f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f19608g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f19609h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f19610i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f19611j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f19612k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f19613l;
    public boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final float[] f19614n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int[] f19615o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f19616p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f19617q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final MotionLayout f19618r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final float f19619s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final float f19620t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f19621u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final float f19622v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f19623w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final float f19624x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final float f19625y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final float f19626z;

    public g(Context context, MotionLayout motionLayout, XmlResourceParser xmlResourceParser) {
        this.f19602a = 0;
        this.f19603b = 0;
        this.f19604c = 0;
        this.f19605d = -1;
        this.f19606e = -1;
        this.f19607f = -1;
        this.f19608g = 0.5f;
        this.f19609h = 0.5f;
        this.f19610i = -1;
        this.f19611j = false;
        this.f19612k = 0.0f;
        this.f19613l = 1.0f;
        this.m = false;
        this.f19614n = new float[2];
        this.f19615o = new int[2];
        this.f19619s = 4.0f;
        this.f19620t = 1.2f;
        this.f19621u = true;
        this.f19622v = 1.0f;
        this.f19623w = 0;
        this.f19624x = 10.0f;
        this.f19625y = 10.0f;
        this.f19626z = 1.0f;
        this.A = Float.NaN;
        this.B = Float.NaN;
        this.C = 0;
        this.D = 0;
        this.f19618r = motionLayout;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), R.styleable.OnSwipe);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            if (index == R.styleable.OnSwipe_touchAnchorId) {
                this.f19605d = typedArrayObtainStyledAttributes.getResourceId(index, this.f19605d);
            } else if (index == R.styleable.OnSwipe_touchAnchorSide) {
                int i11 = typedArrayObtainStyledAttributes.getInt(index, this.f19602a);
                this.f19602a = i11;
                float[] fArr = E[i11];
                this.f19609h = fArr[0];
                this.f19608g = fArr[1];
            } else if (index == R.styleable.OnSwipe_dragDirection) {
                int i12 = typedArrayObtainStyledAttributes.getInt(index, this.f19603b);
                this.f19603b = i12;
                if (i12 < 6) {
                    float[] fArr2 = F[i12];
                    this.f19612k = fArr2[0];
                    this.f19613l = fArr2[1];
                } else {
                    this.f19613l = Float.NaN;
                    this.f19612k = Float.NaN;
                    this.f19611j = true;
                }
            } else if (index == R.styleable.OnSwipe_maxVelocity) {
                this.f19619s = typedArrayObtainStyledAttributes.getFloat(index, this.f19619s);
            } else if (index == R.styleable.OnSwipe_maxAcceleration) {
                this.f19620t = typedArrayObtainStyledAttributes.getFloat(index, this.f19620t);
            } else if (index == R.styleable.OnSwipe_moveWhenScrollAtTop) {
                this.f19621u = typedArrayObtainStyledAttributes.getBoolean(index, this.f19621u);
            } else if (index == R.styleable.OnSwipe_dragScale) {
                this.f19622v = typedArrayObtainStyledAttributes.getFloat(index, this.f19622v);
            } else if (index == R.styleable.OnSwipe_dragThreshold) {
                this.f19624x = typedArrayObtainStyledAttributes.getFloat(index, this.f19624x);
            } else if (index == R.styleable.OnSwipe_touchRegionId) {
                this.f19606e = typedArrayObtainStyledAttributes.getResourceId(index, this.f19606e);
            } else if (index == R.styleable.OnSwipe_onTouchUp) {
                this.f19604c = typedArrayObtainStyledAttributes.getInt(index, this.f19604c);
            } else if (index == R.styleable.OnSwipe_nestedScrollFlags) {
                this.f19623w = typedArrayObtainStyledAttributes.getInteger(index, 0);
            } else if (index == R.styleable.OnSwipe_limitBoundsTo) {
                this.f19607f = typedArrayObtainStyledAttributes.getResourceId(index, 0);
            } else if (index == R.styleable.OnSwipe_rotationCenterId) {
                this.f19610i = typedArrayObtainStyledAttributes.getResourceId(index, this.f19610i);
            } else if (index == R.styleable.OnSwipe_springDamping) {
                this.f19625y = typedArrayObtainStyledAttributes.getFloat(index, this.f19625y);
            } else if (index == R.styleable.OnSwipe_springMass) {
                this.f19626z = typedArrayObtainStyledAttributes.getFloat(index, this.f19626z);
            } else if (index == R.styleable.OnSwipe_springStiffness) {
                this.A = typedArrayObtainStyledAttributes.getFloat(index, this.A);
            } else if (index == R.styleable.OnSwipe_springStopThreshold) {
                this.B = typedArrayObtainStyledAttributes.getFloat(index, this.B);
            } else if (index == R.styleable.OnSwipe_springBoundary) {
                this.C = typedArrayObtainStyledAttributes.getInt(index, this.C);
            } else if (index == R.styleable.OnSwipe_autoCompleteMode) {
                this.D = typedArrayObtainStyledAttributes.getInt(index, this.D);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final RectF a(MotionLayout motionLayout, RectF rectF) {
        View viewFindViewById;
        int i10 = this.f19607f;
        if (i10 == -1 || (viewFindViewById = motionLayout.findViewById(i10)) == null) {
            return null;
        }
        rectF.set(viewFindViewById.getLeft(), viewFindViewById.getTop(), viewFindViewById.getRight(), viewFindViewById.getBottom());
        return rectF;
    }

    public final RectF b(ViewGroup viewGroup, RectF rectF) {
        View viewFindViewById;
        int i10 = this.f19606e;
        if (i10 == -1 || (viewFindViewById = viewGroup.findViewById(i10)) == null) {
            return null;
        }
        rectF.set(viewFindViewById.getLeft(), viewFindViewById.getTop(), viewFindViewById.getRight(), viewFindViewById.getBottom());
        return rectF;
    }

    public final void c(boolean z10) {
        float[][] fArr = E;
        float[][] fArr2 = F;
        if (z10) {
            fArr2[4] = fArr2[3];
            fArr2[5] = fArr2[2];
            fArr[5] = fArr[2];
            fArr[6] = fArr[1];
        } else {
            fArr2[4] = fArr2[2];
            fArr2[5] = fArr2[3];
            fArr[5] = fArr[1];
            fArr[6] = fArr[2];
        }
        float[] fArr3 = fArr[this.f19602a];
        this.f19609h = fArr3[0];
        this.f19608g = fArr3[1];
        int i10 = this.f19603b;
        if (i10 >= 6) {
            return;
        }
        float[] fArr4 = fArr2[i10];
        this.f19612k = fArr4[0];
        this.f19613l = fArr4[1];
    }

    public final String toString() {
        if (Float.isNaN(this.f19612k)) {
            return Key.ROTATION;
        }
        return this.f19612k + " , " + this.f19613l;
    }

    public g(MotionLayout motionLayout, OnSwipe onSwipe) {
        this.f19602a = 0;
        this.f19603b = 0;
        this.f19604c = 0;
        this.f19605d = -1;
        this.f19606e = -1;
        this.f19607f = -1;
        this.f19608g = 0.5f;
        this.f19609h = 0.5f;
        this.f19610i = -1;
        this.f19611j = false;
        this.f19612k = 0.0f;
        this.f19613l = 1.0f;
        this.m = false;
        this.f19614n = new float[2];
        this.f19615o = new int[2];
        this.f19619s = 4.0f;
        this.f19620t = 1.2f;
        this.f19621u = true;
        this.f19622v = 1.0f;
        this.f19623w = 0;
        this.f19624x = 10.0f;
        this.f19625y = 10.0f;
        this.f19626z = 1.0f;
        this.A = Float.NaN;
        this.B = Float.NaN;
        this.C = 0;
        this.D = 0;
        this.f19618r = motionLayout;
        this.f19605d = onSwipe.getTouchAnchorId();
        int touchAnchorSide = onSwipe.getTouchAnchorSide();
        this.f19602a = touchAnchorSide;
        if (touchAnchorSide != -1) {
            float[] fArr = E[touchAnchorSide];
            this.f19609h = fArr[0];
            this.f19608g = fArr[1];
        }
        int dragDirection = onSwipe.getDragDirection();
        this.f19603b = dragDirection;
        if (dragDirection < 6) {
            float[] fArr2 = F[dragDirection];
            this.f19612k = fArr2[0];
            this.f19613l = fArr2[1];
        } else {
            this.f19613l = Float.NaN;
            this.f19612k = Float.NaN;
            this.f19611j = true;
        }
        this.f19619s = onSwipe.getMaxVelocity();
        this.f19620t = onSwipe.getMaxAcceleration();
        this.f19621u = onSwipe.getMoveWhenScrollAtTop();
        this.f19622v = onSwipe.getDragScale();
        this.f19624x = onSwipe.getDragThreshold();
        this.f19606e = onSwipe.getTouchRegionId();
        this.f19604c = onSwipe.getOnTouchUp();
        this.f19623w = onSwipe.getNestedScrollFlags();
        this.f19607f = onSwipe.getLimitBoundsTo();
        this.f19610i = onSwipe.getRotationCenterId();
        this.C = onSwipe.getSpringBoundary();
        this.f19625y = onSwipe.getSpringDamping();
        this.f19626z = onSwipe.getSpringMass();
        this.A = onSwipe.getSpringStiffness();
        this.B = onSwipe.getSpringStopThreshold();
        this.D = onSwipe.getAutoCompleteMode();
    }
}
