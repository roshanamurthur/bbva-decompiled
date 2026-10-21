package androidx.constraintlayout.helper.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.HelperWidget;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.R;
import androidx.constraintlayout.widget.VirtualLayout;

/* JADX INFO: loaded from: classes.dex */
public class Flow extends VirtualLayout {
    public static final int CHAIN_PACKED = 2;
    public static final int CHAIN_SPREAD = 0;
    public static final int CHAIN_SPREAD_INSIDE = 1;
    public static final int HORIZONTAL = 0;
    public static final int HORIZONTAL_ALIGN_CENTER = 2;
    public static final int HORIZONTAL_ALIGN_END = 1;
    public static final int HORIZONTAL_ALIGN_START = 0;
    public static final int VERTICAL = 1;
    public static final int VERTICAL_ALIGN_BASELINE = 3;
    public static final int VERTICAL_ALIGN_BOTTOM = 1;
    public static final int VERTICAL_ALIGN_CENTER = 2;
    public static final int VERTICAL_ALIGN_TOP = 0;
    public static final int WRAP_ALIGNED = 2;
    public static final int WRAP_CHAIN = 1;
    public static final int WRAP_NONE = 0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public androidx.constraintlayout.core.widgets.Flow f19258s0;

    public Flow(Context context) {
        super(context);
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper
    public void init(AttributeSet attributeSet) {
        super.init(attributeSet);
        this.f19258s0 = new androidx.constraintlayout.core.widgets.Flow();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.ConstraintLayout_Layout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == R.styleable.ConstraintLayout_Layout_android_orientation) {
                    this.f19258s0.setOrientation(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == R.styleable.ConstraintLayout_Layout_android_padding) {
                    this.f19258s0.setPadding(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == R.styleable.ConstraintLayout_Layout_android_paddingStart) {
                    this.f19258s0.setPaddingStart(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == R.styleable.ConstraintLayout_Layout_android_paddingEnd) {
                    this.f19258s0.setPaddingEnd(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == R.styleable.ConstraintLayout_Layout_android_paddingLeft) {
                    this.f19258s0.setPaddingLeft(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == R.styleable.ConstraintLayout_Layout_android_paddingTop) {
                    this.f19258s0.setPaddingTop(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == R.styleable.ConstraintLayout_Layout_android_paddingRight) {
                    this.f19258s0.setPaddingRight(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == R.styleable.ConstraintLayout_Layout_android_paddingBottom) {
                    this.f19258s0.setPaddingBottom(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == R.styleable.ConstraintLayout_Layout_flow_wrapMode) {
                    this.f19258s0.setWrapMode(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == R.styleable.ConstraintLayout_Layout_flow_horizontalStyle) {
                    this.f19258s0.setHorizontalStyle(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == R.styleable.ConstraintLayout_Layout_flow_verticalStyle) {
                    this.f19258s0.setVerticalStyle(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == R.styleable.ConstraintLayout_Layout_flow_firstHorizontalStyle) {
                    this.f19258s0.setFirstHorizontalStyle(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == R.styleable.ConstraintLayout_Layout_flow_lastHorizontalStyle) {
                    this.f19258s0.setLastHorizontalStyle(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == R.styleable.ConstraintLayout_Layout_flow_firstVerticalStyle) {
                    this.f19258s0.setFirstVerticalStyle(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == R.styleable.ConstraintLayout_Layout_flow_lastVerticalStyle) {
                    this.f19258s0.setLastVerticalStyle(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == R.styleable.ConstraintLayout_Layout_flow_horizontalBias) {
                    this.f19258s0.setHorizontalBias(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == R.styleable.ConstraintLayout_Layout_flow_firstHorizontalBias) {
                    this.f19258s0.setFirstHorizontalBias(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == R.styleable.ConstraintLayout_Layout_flow_lastHorizontalBias) {
                    this.f19258s0.setLastHorizontalBias(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == R.styleable.ConstraintLayout_Layout_flow_firstVerticalBias) {
                    this.f19258s0.setFirstVerticalBias(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == R.styleable.ConstraintLayout_Layout_flow_lastVerticalBias) {
                    this.f19258s0.setLastVerticalBias(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == R.styleable.ConstraintLayout_Layout_flow_verticalBias) {
                    this.f19258s0.setVerticalBias(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == R.styleable.ConstraintLayout_Layout_flow_horizontalAlign) {
                    this.f19258s0.setHorizontalAlign(typedArrayObtainStyledAttributes.getInt(index, 2));
                } else if (index == R.styleable.ConstraintLayout_Layout_flow_verticalAlign) {
                    this.f19258s0.setVerticalAlign(typedArrayObtainStyledAttributes.getInt(index, 2));
                } else if (index == R.styleable.ConstraintLayout_Layout_flow_horizontalGap) {
                    this.f19258s0.setHorizontalGap(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == R.styleable.ConstraintLayout_Layout_flow_verticalGap) {
                    this.f19258s0.setVerticalGap(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == R.styleable.ConstraintLayout_Layout_flow_maxElementsWrap) {
                    this.f19258s0.setMaxElementsWrap(typedArrayObtainStyledAttributes.getInt(index, -1));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.mHelperWidget = this.f19258s0;
        validateParams();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void loadParameters(ConstraintSet.Constraint constraint, HelperWidget helperWidget, ConstraintLayout.LayoutParams layoutParams, SparseArray<ConstraintWidget> sparseArray) {
        super.loadParameters(constraint, helperWidget, layoutParams, sparseArray);
        if (helperWidget instanceof androidx.constraintlayout.core.widgets.Flow) {
            androidx.constraintlayout.core.widgets.Flow flow = (androidx.constraintlayout.core.widgets.Flow) helperWidget;
            int i10 = layoutParams.orientation;
            if (i10 != -1) {
                flow.setOrientation(i10);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    @SuppressLint({"WrongCall"})
    public void onMeasure(int i10, int i11) {
        onMeasure(this.f19258s0, i10, i11);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void resolveRtl(ConstraintWidget constraintWidget, boolean z10) {
        this.f19258s0.applyRtl(z10);
    }

    public void setFirstHorizontalBias(float f6) {
        this.f19258s0.setFirstHorizontalBias(f6);
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i10) {
        this.f19258s0.setFirstHorizontalStyle(i10);
        requestLayout();
    }

    public void setFirstVerticalBias(float f6) {
        this.f19258s0.setFirstVerticalBias(f6);
        requestLayout();
    }

    public void setFirstVerticalStyle(int i10) {
        this.f19258s0.setFirstVerticalStyle(i10);
        requestLayout();
    }

    public void setHorizontalAlign(int i10) {
        this.f19258s0.setHorizontalAlign(i10);
        requestLayout();
    }

    public void setHorizontalBias(float f6) {
        this.f19258s0.setHorizontalBias(f6);
        requestLayout();
    }

    public void setHorizontalGap(int i10) {
        this.f19258s0.setHorizontalGap(i10);
        requestLayout();
    }

    public void setHorizontalStyle(int i10) {
        this.f19258s0.setHorizontalStyle(i10);
        requestLayout();
    }

    public void setLastHorizontalBias(float f6) {
        this.f19258s0.setLastHorizontalBias(f6);
        requestLayout();
    }

    public void setLastHorizontalStyle(int i10) {
        this.f19258s0.setLastHorizontalStyle(i10);
        requestLayout();
    }

    public void setLastVerticalBias(float f6) {
        this.f19258s0.setLastVerticalBias(f6);
        requestLayout();
    }

    public void setLastVerticalStyle(int i10) {
        this.f19258s0.setLastVerticalStyle(i10);
        requestLayout();
    }

    public void setMaxElementsWrap(int i10) {
        this.f19258s0.setMaxElementsWrap(i10);
        requestLayout();
    }

    public void setOrientation(int i10) {
        this.f19258s0.setOrientation(i10);
        requestLayout();
    }

    public void setPadding(int i10) {
        this.f19258s0.setPadding(i10);
        requestLayout();
    }

    public void setPaddingBottom(int i10) {
        this.f19258s0.setPaddingBottom(i10);
        requestLayout();
    }

    public void setPaddingLeft(int i10) {
        this.f19258s0.setPaddingLeft(i10);
        requestLayout();
    }

    public void setPaddingRight(int i10) {
        this.f19258s0.setPaddingRight(i10);
        requestLayout();
    }

    public void setPaddingTop(int i10) {
        this.f19258s0.setPaddingTop(i10);
        requestLayout();
    }

    public void setVerticalAlign(int i10) {
        this.f19258s0.setVerticalAlign(i10);
        requestLayout();
    }

    public void setVerticalBias(float f6) {
        this.f19258s0.setVerticalBias(f6);
        requestLayout();
    }

    public void setVerticalGap(int i10) {
        this.f19258s0.setVerticalGap(i10);
        requestLayout();
    }

    public void setVerticalStyle(int i10) {
        this.f19258s0.setVerticalStyle(i10);
        requestLayout();
    }

    public void setWrapMode(int i10) {
        this.f19258s0.setWrapMode(i10);
        requestLayout();
    }

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout
    public void onMeasure(androidx.constraintlayout.core.widgets.VirtualLayout virtualLayout, int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        if (virtualLayout == null) {
            setMeasuredDimension(0, 0);
        } else {
            virtualLayout.measure(mode, size, mode2, size2);
            setMeasuredDimension(virtualLayout.getMeasuredWidth(), virtualLayout.getMeasuredHeight());
        }
    }

    public Flow(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
