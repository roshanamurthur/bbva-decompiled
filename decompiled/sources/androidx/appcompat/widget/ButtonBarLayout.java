package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class ButtonBarLayout extends LinearLayout {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public boolean f1278p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public boolean f1279q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f1280r0;

    public ButtonBarLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1280r0 = -1;
        int[] iArr = R.styleable.ButtonBarLayout;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        ViewCompat.saveAttributeDataForStyleable(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0, 0);
        this.f1278p0 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.ButtonBarLayout_allowStacking, true);
        typedArrayObtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.f1278p0);
        }
    }

    private void setStacked(boolean z10) {
        if (this.f1279q0 != z10) {
            if (!z10 || this.f1278p0) {
                this.f1279q0 = z10;
                setOrientation(z10 ? 1 : 0);
                setGravity(z10 ? GravityCompat.END : 80);
                View viewFindViewById = findViewById(R.id.spacer);
                if (viewFindViewById != null) {
                    viewFindViewById.setVisibility(z10 ? 8 : 4);
                }
                for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                    bringChildToFront(getChildAt(childCount));
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0054  */
    /* JADX WARN: Code duplicated, block: B:31:0x005f A[LOOP:0: B:26:0x0051->B:31:0x005f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x0065  */
    /* JADX WARN: Code duplicated, block: B:36:0x0082  */
    /* JADX WARN: Code duplicated, block: B:38:0x0089  */
    /* JADX WARN: Code duplicated, block: B:41:0x0095 A[LOOP:1: B:37:0x0087->B:41:0x0095, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:43:0x009a  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:52:0x0062 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x0063 A[EDGE_INSN: B:53:0x0063->B:33:0x0063 BREAK  A[LOOP:0: B:26:0x0051->B:31:0x005f], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0093 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        int iMakeMeasureSpec;
        boolean z10;
        int childCount;
        int i12;
        int i13;
        int measuredHeight;
        int i14;
        int childCount2;
        int size = View.MeasureSpec.getSize(i10);
        int paddingBottom = 0;
        if (this.f1278p0) {
            if (size > this.f1280r0 && this.f1279q0) {
                setStacked(false);
            }
            this.f1280r0 = size;
        }
        if (this.f1279q0 || View.MeasureSpec.getMode(i10) != 1073741824) {
            iMakeMeasureSpec = i10;
            z10 = false;
        } else {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z10 = true;
        }
        super.onMeasure(iMakeMeasureSpec, i11);
        if (!this.f1278p0 || this.f1279q0 || (getMeasuredWidthAndState() & ViewCompat.MEASURED_STATE_MASK) != 16777216) {
            if (z10) {
            }
            childCount = getChildCount();
            i12 = 0;
            while (true) {
                i13 = -1;
                if (i12 < childCount) {
                    i12 = -1;
                    break;
                } else if (getChildAt(i12).getVisibility() == 0) {
                    break;
                } else {
                    i12++;
                }
            }
            if (i12 >= 0) {
                View childAt = getChildAt(i12);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
                measuredHeight = childAt.getMeasuredHeight() + getPaddingTop() + layoutParams.topMargin + layoutParams.bottomMargin;
                if (this.f1279q0) {
                    childCount2 = getChildCount();
                    for (i14 = i12 + 1; i14 < childCount2; i14++) {
                        if (getChildAt(i14).getVisibility() == 0) {
                            i13 = i14;
                            break;
                        }
                    }
                    if (i13 >= 0) {
                        paddingBottom = getChildAt(i13).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f)) + measuredHeight;
                    } else {
                        paddingBottom = measuredHeight;
                    }
                } else {
                    paddingBottom = getPaddingBottom() + measuredHeight;
                }
            }
            if (ViewCompat.getMinimumHeight(this) != paddingBottom) {
                setMinimumHeight(paddingBottom);
                if (i11 == 0) {
                    super.onMeasure(i10, i11);
                }
            }
        }
        setStacked(true);
        super.onMeasure(i10, i11);
        childCount = getChildCount();
        i12 = 0;
        while (true) {
            i13 = -1;
            if (i12 < childCount) {
                i12 = -1;
                break;
            } else {
                if (getChildAt(i12).getVisibility() == 0) {
                    break;
                    break;
                }
                i12++;
            }
        }
        if (i12 >= 0) {
            View childAt2 = getChildAt(i12);
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) childAt2.getLayoutParams();
            measuredHeight = childAt2.getMeasuredHeight() + getPaddingTop() + layoutParams2.topMargin + layoutParams2.bottomMargin;
            if (this.f1279q0) {
                childCount2 = getChildCount();
                while (i14 < childCount2) {
                    if (getChildAt(i14).getVisibility() == 0) {
                        i13 = i14;
                        break;
                    }
                }
                if (i13 >= 0) {
                    paddingBottom = getChildAt(i13).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f)) + measuredHeight;
                } else {
                    paddingBottom = measuredHeight;
                }
            } else {
                paddingBottom = getPaddingBottom() + measuredHeight;
            }
        }
        if (ViewCompat.getMinimumHeight(this) != paddingBottom) {
            setMinimumHeight(paddingBottom);
            if (i11 == 0) {
                super.onMeasure(i10, i11);
            }
        }
    }

    public void setAllowStacking(boolean z10) {
        if (this.f1278p0 != z10) {
            this.f1278p0 = z10;
            if (!z10 && this.f1279q0) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
