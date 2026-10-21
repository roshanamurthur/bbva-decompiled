package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.constraintlayout.motion.widget.MotionHelper;
import androidx.constraintlayout.widget.R;

/* JADX INFO: loaded from: classes.dex */
public class MotionEffect extends MotionHelper {
    public static final int AUTO = -1;
    public static final int EAST = 2;
    public static final int NORTH = 0;
    public static final int SOUTH = 1;
    public static final String TAG = "FadeMove";
    public static final int WEST = 3;
    public int E0;
    public int F0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public float f19273t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f19274u0;
    public int v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public int f19275w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public int f19276x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public boolean f19277y0;

    public MotionEffect(Context context) {
        super(context);
        this.f19273t0 = 0.1f;
        this.f19274u0 = 49;
        this.v0 = 50;
        this.f19275w0 = 0;
        this.f19276x0 = 0;
        this.f19277y0 = true;
        this.E0 = -1;
        this.F0 = -1;
    }

    public final void f(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.MotionEffect);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == R.styleable.MotionEffect_motionEffect_start) {
                    int i11 = typedArrayObtainStyledAttributes.getInt(index, this.f19274u0);
                    this.f19274u0 = i11;
                    this.f19274u0 = Math.max(Math.min(i11, 99), 0);
                } else if (index == R.styleable.MotionEffect_motionEffect_end) {
                    int i12 = typedArrayObtainStyledAttributes.getInt(index, this.v0);
                    this.v0 = i12;
                    this.v0 = Math.max(Math.min(i12, 99), 0);
                } else if (index == R.styleable.MotionEffect_motionEffect_translationX) {
                    this.f19275w0 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f19275w0);
                } else if (index == R.styleable.MotionEffect_motionEffect_translationY) {
                    this.f19276x0 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f19276x0);
                } else if (index == R.styleable.MotionEffect_motionEffect_alpha) {
                    this.f19273t0 = typedArrayObtainStyledAttributes.getFloat(index, this.f19273t0);
                } else if (index == R.styleable.MotionEffect_motionEffect_move) {
                    this.F0 = typedArrayObtainStyledAttributes.getInt(index, this.F0);
                } else if (index == R.styleable.MotionEffect_motionEffect_strict) {
                    this.f19277y0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f19277y0);
                } else if (index == R.styleable.MotionEffect_motionEffect_viewTransition) {
                    this.E0 = typedArrayObtainStyledAttributes.getResourceId(index, this.E0);
                }
            }
            int i13 = this.f19274u0;
            int i14 = this.v0;
            if (i13 == i14) {
                if (i13 > 0) {
                    this.f19274u0 = i13 - 1;
                } else {
                    this.v0 = i14 + 1;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.constraintlayout.motion.widget.MotionHelper, androidx.constraintlayout.motion.widget.MotionHelperInterface
    public boolean isDecorator() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x014c  */
    /* JADX WARN: Code duplicated, block: B:88:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:90:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:93:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:95:0x01cf  */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0170, code lost:
    
        if (r14 == 0.0f) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0184, code lost:
    
        if (r14 == 0.0f) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0194, code lost:
    
        if (r15 == 0.0f) goto L58;
     */
    @Override // androidx.constraintlayout.motion.widget.MotionHelper, androidx.constraintlayout.motion.widget.MotionHelperInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onPreSetup(androidx.constraintlayout.motion.widget.MotionLayout r23, java.util.HashMap<android.view.View, androidx.constraintlayout.motion.widget.MotionController> r24) {
        /*
            Method dump skipped, instruction units count: 475
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.helper.widget.MotionEffect.onPreSetup(androidx.constraintlayout.motion.widget.MotionLayout, java.util.HashMap):void");
    }

    public MotionEffect(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f19273t0 = 0.1f;
        this.f19274u0 = 49;
        this.v0 = 50;
        this.f19275w0 = 0;
        this.f19276x0 = 0;
        this.f19277y0 = true;
        this.E0 = -1;
        this.F0 = -1;
        f(context, attributeSet);
    }

    public MotionEffect(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f19273t0 = 0.1f;
        this.f19274u0 = 49;
        this.v0 = 50;
        this.f19275w0 = 0;
        this.f19276x0 = 0;
        this.f19277y0 = true;
        this.E0 = -1;
        this.F0 = -1;
        f(context, attributeSet);
    }
}
