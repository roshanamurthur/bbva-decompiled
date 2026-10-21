package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.R;
import androidx.constraintlayout.widget.VirtualLayout;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class CircularFlow extends VirtualLayout {
    public static int H0;
    public static float I0;
    public String E0;
    public Float F0;
    public Integer G0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public ConstraintLayout f19252s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f19253t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public float[] f19254u0;
    public int[] v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public int f19255w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public int f19256x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public String f19257y0;

    public CircularFlow(Context context) {
        super(context);
    }

    private void setAngles(String str) {
        if (str == null) {
            return;
        }
        int i10 = 0;
        this.f19256x0 = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i10);
            if (iIndexOf == -1) {
                f(str.substring(i10).trim());
                return;
            } else {
                f(str.substring(i10, iIndexOf).trim());
                i10 = iIndexOf + 1;
            }
        }
    }

    private void setRadius(String str) {
        if (str == null) {
            return;
        }
        int i10 = 0;
        this.f19255w0 = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i10);
            if (iIndexOf == -1) {
                g(str.substring(i10).trim());
                return;
            } else {
                g(str.substring(i10, iIndexOf).trim());
                i10 = iIndexOf + 1;
            }
        }
    }

    public void addViewToCircularFlow(View view, int i10, float f6) {
        if (containsId(view.getId())) {
            return;
        }
        addView(view);
        this.f19256x0++;
        float[] angles = getAngles();
        this.f19254u0 = angles;
        angles[this.f19256x0 - 1] = f6;
        this.f19255w0++;
        int[] radius = getRadius();
        this.v0 = radius;
        radius[this.f19255w0 - 1] = (int) (i10 * this.myContext.getResources().getDisplayMetrics().density);
        h();
    }

    public final void f(String str) {
        float[] fArr;
        if (str == null || str.length() == 0 || this.myContext == null || (fArr = this.f19254u0) == null) {
            return;
        }
        if (this.f19256x0 + 1 > fArr.length) {
            this.f19254u0 = Arrays.copyOf(fArr, fArr.length + 1);
        }
        this.f19254u0[this.f19256x0] = Integer.parseInt(str);
        this.f19256x0++;
    }

    public final void g(String str) {
        int[] iArr;
        if (str == null || str.length() == 0 || this.myContext == null || (iArr = this.v0) == null) {
            return;
        }
        if (this.f19255w0 + 1 > iArr.length) {
            this.v0 = Arrays.copyOf(iArr, iArr.length + 1);
        }
        this.v0[this.f19255w0] = (int) (Integer.parseInt(str) * this.myContext.getResources().getDisplayMetrics().density);
        this.f19255w0++;
    }

    public float[] getAngles() {
        return Arrays.copyOf(this.f19254u0, this.f19256x0);
    }

    public int[] getRadius() {
        return Arrays.copyOf(this.v0, this.f19255w0);
    }

    public final void h() {
        this.f19252s0 = (ConstraintLayout) getParent();
        for (int i10 = 0; i10 < this.mCount; i10++) {
            View viewById = this.f19252s0.getViewById(this.mIds[i10]);
            if (viewById != null) {
                int i11 = H0;
                float f6 = I0;
                int[] iArr = this.v0;
                if (iArr == null || i10 >= iArr.length) {
                    Integer num = this.G0;
                    if (num == null || num.intValue() == -1) {
                        this.mMap.get(Integer.valueOf(viewById.getId()));
                    } else {
                        this.f19255w0++;
                        if (this.v0 == null) {
                            this.v0 = new int[1];
                        }
                        int[] radius = getRadius();
                        this.v0 = radius;
                        radius[this.f19255w0 - 1] = i11;
                    }
                } else {
                    i11 = iArr[i10];
                }
                float[] fArr = this.f19254u0;
                if (fArr == null || i10 >= fArr.length) {
                    Float f10 = this.F0;
                    if (f10 == null || f10.floatValue() == -1.0f) {
                        this.mMap.get(Integer.valueOf(viewById.getId()));
                    } else {
                        this.f19256x0++;
                        if (this.f19254u0 == null) {
                            this.f19254u0 = new float[1];
                        }
                        float[] angles = getAngles();
                        this.f19254u0 = angles;
                        angles[this.f19256x0 - 1] = f6;
                    }
                } else {
                    f6 = fArr[i10];
                }
                ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) viewById.getLayoutParams();
                layoutParams.circleAngle = f6;
                layoutParams.circleConstraint = this.f19253t0;
                layoutParams.circleRadius = i11;
                viewById.setLayoutParams(layoutParams);
            }
        }
        applyLayoutFeatures();
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper
    public void init(AttributeSet attributeSet) {
        super.init(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.ConstraintLayout_Layout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == R.styleable.ConstraintLayout_Layout_circularflow_viewCenter) {
                    this.f19253t0 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                } else if (index == R.styleable.ConstraintLayout_Layout_circularflow_angles) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f19257y0 = string;
                    setAngles(string);
                } else if (index == R.styleable.ConstraintLayout_Layout_circularflow_radiusInDP) {
                    String string2 = typedArrayObtainStyledAttributes.getString(index);
                    this.E0 = string2;
                    setRadius(string2);
                } else if (index == R.styleable.ConstraintLayout_Layout_circularflow_defaultAngle) {
                    Float fValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getFloat(index, I0));
                    this.F0 = fValueOf;
                    setDefaultAngle(fValueOf.floatValue());
                } else if (index == R.styleable.ConstraintLayout_Layout_circularflow_defaultRadius) {
                    Integer numValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, H0));
                    this.G0 = numValueOf;
                    setDefaultRadius(numValueOf.intValue());
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public boolean isUpdatable(View view) {
        return containsId(view.getId()) && indexFromId(view.getId()) != -1;
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f19257y0;
        if (str != null) {
            this.f19254u0 = new float[1];
            setAngles(str);
        }
        String str2 = this.E0;
        if (str2 != null) {
            this.v0 = new int[1];
            setRadius(str2);
        }
        Float f6 = this.F0;
        if (f6 != null) {
            setDefaultAngle(f6.floatValue());
        }
        Integer num = this.G0;
        if (num != null) {
            setDefaultRadius(num.intValue());
        }
        h();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public int removeView(View view) {
        int iRemoveView = super.removeView(view);
        if (iRemoveView == -1) {
            return iRemoveView;
        }
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(this.f19252s0);
        constraintSet.clear(view.getId(), 8);
        constraintSet.applyTo(this.f19252s0);
        float[] fArr = this.f19254u0;
        if (iRemoveView < fArr.length) {
            if (fArr != null && iRemoveView >= 0 && iRemoveView < this.f19256x0) {
                float[] fArr2 = new float[fArr.length - 1];
                int i10 = 0;
                for (int i11 = 0; i11 < fArr.length; i11++) {
                    if (i11 != iRemoveView) {
                        fArr2[i10] = fArr[i11];
                        i10++;
                    }
                }
                fArr = fArr2;
            }
            this.f19254u0 = fArr;
            this.f19256x0--;
        }
        int[] iArr = this.v0;
        if (iRemoveView < iArr.length) {
            if (iArr != null && iRemoveView >= 0 && iRemoveView < this.f19255w0) {
                int[] iArr2 = new int[iArr.length - 1];
                int i12 = 0;
                for (int i13 = 0; i13 < iArr.length; i13++) {
                    if (i13 != iRemoveView) {
                        iArr2[i12] = iArr[i13];
                        i12++;
                    }
                }
                iArr = iArr2;
            }
            this.v0 = iArr;
            this.f19255w0--;
        }
        h();
        return iRemoveView;
    }

    public void setDefaultAngle(float f6) {
        I0 = f6;
    }

    public void setDefaultRadius(int i10) {
        H0 = i10;
    }

    public void updateAngle(View view, float f6) {
        if (!isUpdatable(view)) {
            view.getId();
            return;
        }
        int iIndexFromId = indexFromId(view.getId());
        if (iIndexFromId > this.f19254u0.length) {
            return;
        }
        float[] angles = getAngles();
        this.f19254u0 = angles;
        angles[iIndexFromId] = f6;
        h();
    }

    public void updateRadius(View view, int i10) {
        if (!isUpdatable(view)) {
            view.getId();
            return;
        }
        int iIndexFromId = indexFromId(view.getId());
        if (iIndexFromId > this.v0.length) {
            return;
        }
        int[] radius = getRadius();
        this.v0 = radius;
        radius[iIndexFromId] = (int) (i10 * this.myContext.getResources().getDisplayMetrics().density);
        h();
    }

    public void updateReference(View view, int i10, float f6) {
        if (!isUpdatable(view)) {
            view.getId();
            return;
        }
        int iIndexFromId = indexFromId(view.getId());
        if (getAngles().length > iIndexFromId) {
            float[] angles = getAngles();
            this.f19254u0 = angles;
            angles[iIndexFromId] = f6;
        }
        if (getRadius().length > iIndexFromId) {
            int[] radius = getRadius();
            this.v0 = radius;
            radius[iIndexFromId] = (int) (i10 * this.myContext.getResources().getDisplayMetrics().density);
        }
        h();
    }

    public CircularFlow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CircularFlow(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
