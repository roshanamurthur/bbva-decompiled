package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.R;
import androidx.constraintlayout.widget.VirtualLayout;
import androidx.core.internal.view.SupportMenu;
import c2.b;
import com.bbva.glomohybrid.base.deeplink.extensions.DeepLinkExtensionsKt;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public class Grid extends VirtualLayout {
    public static final int HORIZONTAL = 0;
    public static final int VERTICAL = 1;
    public String E0;
    public String F0;
    public String G0;
    public float H0;
    public float I0;
    public int J0;
    public int K0;
    public boolean[][] L0;
    public final HashSet M0;
    public int[] N0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public View[] f19259s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public ConstraintLayout f19260t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f19261u0;
    public int v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public int f19262w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public int f19263x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public String f19264y0;

    public Grid(Context context) {
        super(context);
        this.K0 = 0;
        this.M0 = new HashSet();
    }

    public static void f(View view) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) view.getLayoutParams();
        layoutParams.horizontalWeight = -1.0f;
        layoutParams.leftToRight = -1;
        layoutParams.leftToLeft = -1;
        layoutParams.rightToLeft = -1;
        layoutParams.rightToRight = -1;
        ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = -1;
        view.setLayoutParams(layoutParams);
    }

    public static void g(View view) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) view.getLayoutParams();
        layoutParams.verticalWeight = -1.0f;
        layoutParams.topToBottom = -1;
        layoutParams.topToTop = -1;
        layoutParams.bottomToTop = -1;
        layoutParams.bottomToBottom = -1;
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = -1;
        view.setLayoutParams(layoutParams);
    }

    private int getNextPosition() {
        boolean z10 = false;
        int i10 = 0;
        while (!z10) {
            i10 = this.K0;
            if (i10 >= this.f19261u0 * this.f19262w0) {
                return -1;
            }
            int iK = k(i10);
            int iJ = j(this.K0);
            boolean[] zArr = this.L0[iK];
            if (zArr[iJ]) {
                zArr[iJ] = false;
                z10 = true;
            }
            this.K0++;
        }
        return i10;
    }

    public static int[][] o(String str) {
        String[] strArrSplit = str.split(",");
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, strArrSplit.length, 3);
        for (int i10 = 0; i10 < strArrSplit.length; i10++) {
            String[] strArrSplit2 = strArrSplit[i10].trim().split(DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER);
            String[] strArrSplit3 = strArrSplit2[1].split("x");
            iArr[i10][0] = Integer.parseInt(strArrSplit2[0]);
            iArr[i10][1] = Integer.parseInt(strArrSplit3[0]);
            iArr[i10][2] = Integer.parseInt(strArrSplit3[1]);
        }
        return iArr;
    }

    public static float[] p(int i10, String str) {
        float[] fArr = null;
        if (str != null && !str.trim().isEmpty()) {
            String[] strArrSplit = str.split(",");
            if (strArrSplit.length != i10) {
                return null;
            }
            fArr = new float[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                fArr[i11] = Float.parseFloat(strArrSplit[i11].trim());
            }
        }
        return fArr;
    }

    public String getColumnWeights() {
        return this.G0;
    }

    public int getColumns() {
        return this.f19263x0;
    }

    public float getHorizontalGaps() {
        return this.H0;
    }

    public int getOrientation() {
        return this.J0;
    }

    public String getRowWeights() {
        return this.F0;
    }

    public int getRows() {
        return this.v0;
    }

    public String getSkips() {
        return this.E0;
    }

    public String getSpans() {
        return this.f19264y0;
    }

    public float getVerticalGaps() {
        return this.I0;
    }

    public final void h(View view, int i10, int i11, int i12, int i13) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) view.getLayoutParams();
        int[] iArr = this.N0;
        layoutParams.leftToLeft = iArr[i11];
        layoutParams.topToTop = iArr[i10];
        layoutParams.rightToRight = iArr[(i11 + i13) - 1];
        layoutParams.bottomToBottom = iArr[(i10 + i12) - 1];
        view.setLayoutParams(layoutParams);
    }

    public final void i(boolean z10) {
        int i10;
        int i11;
        int[][] iArrO;
        int[][] iArrO2;
        if (this.f19260t0 == null || this.f19261u0 < 1 || this.f19262w0 < 1) {
            return;
        }
        HashSet hashSet = this.M0;
        if (z10) {
            for (int i12 = 0; i12 < this.L0.length; i12++) {
                int i13 = 0;
                while (true) {
                    boolean[][] zArr = this.L0;
                    if (i13 < zArr[0].length) {
                        zArr[i12][i13] = true;
                        i13++;
                    }
                }
            }
            hashSet.clear();
        }
        this.K0 = 0;
        int iMax = Math.max(this.f19261u0, this.f19262w0);
        View[] viewArr = this.f19259s0;
        if (viewArr == null) {
            this.f19259s0 = new View[iMax];
            int i14 = 0;
            while (true) {
                View[] viewArr2 = this.f19259s0;
                if (i14 >= viewArr2.length) {
                    break;
                }
                viewArr2[i14] = n();
                i14++;
            }
        } else if (iMax != viewArr.length) {
            View[] viewArr3 = new View[iMax];
            for (int i15 = 0; i15 < iMax; i15++) {
                View[] viewArr4 = this.f19259s0;
                if (i15 < viewArr4.length) {
                    viewArr3[i15] = viewArr4[i15];
                } else {
                    viewArr3[i15] = n();
                }
            }
            int i16 = iMax;
            while (true) {
                View[] viewArr5 = this.f19259s0;
                if (i16 >= viewArr5.length) {
                    break;
                }
                this.f19260t0.removeView(viewArr5[i16]);
                i16++;
            }
            this.f19259s0 = viewArr3;
        }
        this.N0 = new int[iMax];
        int i17 = 0;
        while (true) {
            View[] viewArr6 = this.f19259s0;
            if (i17 >= viewArr6.length) {
                break;
            }
            this.N0[i17] = viewArr6[i17].getId();
            i17++;
        }
        int id = getId();
        int iMax2 = Math.max(this.f19261u0, this.f19262w0);
        float[] fArrP = p(this.f19261u0, this.F0);
        if (this.f19261u0 == 1) {
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.f19259s0[0].getLayoutParams();
            g(this.f19259s0[0]);
            layoutParams.topToTop = id;
            layoutParams.bottomToBottom = id;
            this.f19259s0[0].setLayoutParams(layoutParams);
        } else {
            int i18 = 0;
            while (true) {
                i10 = this.f19261u0;
                if (i18 >= i10) {
                    break;
                }
                ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) this.f19259s0[i18].getLayoutParams();
                g(this.f19259s0[i18]);
                if (fArrP != null) {
                    layoutParams2.verticalWeight = fArrP[i18];
                }
                if (i18 > 0) {
                    layoutParams2.topToBottom = this.N0[i18 - 1];
                } else {
                    layoutParams2.topToTop = id;
                }
                if (i18 < this.f19261u0 - 1) {
                    layoutParams2.bottomToTop = this.N0[i18 + 1];
                } else {
                    layoutParams2.bottomToBottom = id;
                }
                if (i18 > 0) {
                    ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = (int) this.H0;
                }
                this.f19259s0[i18].setLayoutParams(layoutParams2);
                i18++;
            }
            while (i10 < iMax2) {
                ConstraintLayout.LayoutParams layoutParams3 = (ConstraintLayout.LayoutParams) this.f19259s0[i10].getLayoutParams();
                g(this.f19259s0[i10]);
                layoutParams3.topToTop = id;
                layoutParams3.bottomToBottom = id;
                this.f19259s0[i10].setLayoutParams(layoutParams3);
                i10++;
            }
        }
        int id2 = getId();
        int iMax3 = Math.max(this.f19261u0, this.f19262w0);
        float[] fArrP2 = p(this.f19262w0, this.G0);
        ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) this.f19259s0[0].getLayoutParams();
        if (this.f19262w0 == 1) {
            f(this.f19259s0[0]);
            layoutParams4.leftToLeft = id2;
            layoutParams4.rightToRight = id2;
            this.f19259s0[0].setLayoutParams(layoutParams4);
        } else {
            int i19 = 0;
            while (true) {
                i11 = this.f19262w0;
                if (i19 >= i11) {
                    break;
                }
                ConstraintLayout.LayoutParams layoutParams5 = (ConstraintLayout.LayoutParams) this.f19259s0[i19].getLayoutParams();
                f(this.f19259s0[i19]);
                if (fArrP2 != null) {
                    layoutParams5.horizontalWeight = fArrP2[i19];
                }
                if (i19 > 0) {
                    layoutParams5.leftToRight = this.N0[i19 - 1];
                } else {
                    layoutParams5.leftToLeft = id2;
                }
                if (i19 < this.f19262w0 - 1) {
                    layoutParams5.rightToLeft = this.N0[i19 + 1];
                } else {
                    layoutParams5.rightToRight = id2;
                }
                if (i19 > 0) {
                    ((ViewGroup.MarginLayoutParams) layoutParams5).leftMargin = (int) this.H0;
                }
                this.f19259s0[i19].setLayoutParams(layoutParams5);
                i19++;
            }
            while (i11 < iMax3) {
                ConstraintLayout.LayoutParams layoutParams6 = (ConstraintLayout.LayoutParams) this.f19259s0[i11].getLayoutParams();
                f(this.f19259s0[i11]);
                layoutParams6.leftToLeft = id2;
                layoutParams6.rightToRight = id2;
                this.f19259s0[i11].setLayoutParams(layoutParams6);
                i11++;
            }
        }
        String str = this.E0;
        if (str != null && !str.trim().isEmpty() && (iArrO2 = o(this.E0)) != null) {
            for (int i20 = 0; i20 < iArrO2.length; i20++) {
                int iK = k(iArrO2[i20][0]);
                int iJ = j(iArrO2[i20][0]);
                int[] iArr = iArrO2[i20];
                if (!m(iK, iJ, iArr[1], iArr[2])) {
                    break;
                }
            }
        }
        String str2 = this.f19264y0;
        if (str2 != null && !str2.trim().isEmpty() && (iArrO = o(this.f19264y0)) != null) {
            int[] iArr2 = this.mIds;
            View[] views = getViews(this.f19260t0);
            for (int i21 = 0; i21 < iArrO.length; i21++) {
                int iK2 = k(iArrO[i21][0]);
                int iJ2 = j(iArrO[i21][0]);
                int[] iArr3 = iArrO[i21];
                if (!m(iK2, iJ2, iArr3[1], iArr3[2])) {
                    break;
                }
                View view = views[i21];
                int[] iArr4 = iArrO[i21];
                h(view, iK2, iJ2, iArr4[1], iArr4[2]);
                hashSet.add(Integer.valueOf(iArr2[i21]));
            }
        }
        View[] views2 = getViews(this.f19260t0);
        for (int i22 = 0; i22 < this.mCount; i22++) {
            if (!hashSet.contains(Integer.valueOf(this.mIds[i22]))) {
                int nextPosition = getNextPosition();
                int iK3 = k(nextPosition);
                int iJ3 = j(nextPosition);
                if (nextPosition == -1) {
                    return;
                } else {
                    h(views2[i22], iK3, iJ3, 1, 1);
                }
            }
        }
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper
    public void init(AttributeSet attributeSet) {
        super.init(attributeSet);
        this.mUseViewMeasure = true;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.Grid);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == R.styleable.Grid_grid_rows) {
                    this.v0 = typedArrayObtainStyledAttributes.getInteger(index, 0);
                } else if (index == R.styleable.Grid_grid_columns) {
                    this.f19263x0 = typedArrayObtainStyledAttributes.getInteger(index, 0);
                } else if (index == R.styleable.Grid_grid_spans) {
                    this.f19264y0 = typedArrayObtainStyledAttributes.getString(index);
                } else if (index == R.styleable.Grid_grid_skips) {
                    this.E0 = typedArrayObtainStyledAttributes.getString(index);
                } else if (index == R.styleable.Grid_grid_rowWeights) {
                    this.F0 = typedArrayObtainStyledAttributes.getString(index);
                } else if (index == R.styleable.Grid_grid_columnWeights) {
                    this.G0 = typedArrayObtainStyledAttributes.getString(index);
                } else if (index == R.styleable.Grid_grid_orientation) {
                    this.J0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == R.styleable.Grid_grid_horizontalGaps) {
                    this.H0 = typedArrayObtainStyledAttributes.getDimension(index, 0.0f);
                } else if (index == R.styleable.Grid_grid_verticalGaps) {
                    this.I0 = typedArrayObtainStyledAttributes.getDimension(index, 0.0f);
                } else if (index == R.styleable.Grid_grid_validateInputs) {
                    typedArrayObtainStyledAttributes.getBoolean(index, false);
                } else if (index == R.styleable.Grid_grid_useRtl) {
                    typedArrayObtainStyledAttributes.getBoolean(index, false);
                }
            }
            q();
            l();
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public final int j(int i10) {
        return this.J0 == 1 ? i10 / this.f19261u0 : i10 % this.f19262w0;
    }

    public final int k(int i10) {
        return this.J0 == 1 ? i10 % this.f19261u0 : i10 / this.f19262w0;
    }

    public final void l() {
        boolean[][] zArr = (boolean[][]) Array.newInstance((Class<?>) Boolean.TYPE, this.f19261u0, this.f19262w0);
        this.L0 = zArr;
        for (boolean[] zArr2 : zArr) {
            Arrays.fill(zArr2, true);
        }
    }

    public final boolean m(int i10, int i11, int i12, int i13) {
        for (int i14 = i10; i14 < i10 + i12; i14++) {
            for (int i15 = i11; i15 < i11 + i13; i15++) {
                boolean[][] zArr = this.L0;
                if (i14 < zArr.length && i15 < zArr[0].length) {
                    boolean[] zArr2 = zArr[i14];
                    if (zArr2[i15]) {
                        zArr2[i15] = false;
                    }
                }
                return false;
            }
        }
        return true;
    }

    public final View n() {
        View view = new View(getContext());
        view.setId(View.generateViewId());
        view.setVisibility(4);
        this.f19260t0.addView(view, new ConstraintLayout.LayoutParams(0, 0));
        return view;
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f19260t0 = (ConstraintLayout) getParent();
        i(false);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        super.onDraw(canvas);
        if (isInEditMode()) {
            Paint paint = new Paint();
            paint.setColor(SupportMenu.CATEGORY_MASK);
            paint.setStyle(Paint.Style.STROKE);
            int top = getTop();
            int left = getLeft();
            int bottom = getBottom();
            int right = getRight();
            View[] viewArr = this.f19259s0;
            int length = viewArr.length;
            int i10 = 0;
            while (i10 < length) {
                View view = viewArr[i10];
                int left2 = view.getLeft() - left;
                int top2 = view.getTop() - top;
                int right2 = view.getRight() - left;
                int bottom2 = view.getBottom() - top;
                canvas.drawRect(left2, 0.0f, right2, bottom - top, paint);
                canvas.drawRect(0.0f, top2, right - left, bottom2, paint);
                i10++;
                top = top;
            }
        }
    }

    public final void q() {
        int i10;
        int i11 = this.v0;
        if (i11 != 0 && (i10 = this.f19263x0) != 0) {
            this.f19261u0 = i11;
            this.f19262w0 = i10;
            return;
        }
        int i12 = this.f19263x0;
        if (i12 > 0) {
            this.f19262w0 = i12;
            this.f19261u0 = b.a(this.mCount, i12, 1, i12);
        } else if (i11 > 0) {
            this.f19261u0 = i11;
            this.f19262w0 = b.a(this.mCount, i11, 1, i11);
        } else {
            int iSqrt = (int) (Math.sqrt(this.mCount) + 1.5d);
            this.f19261u0 = iSqrt;
            this.f19262w0 = b.a(this.mCount, iSqrt, 1, iSqrt);
        }
    }

    public void setColumnWeights(String str) {
        String str2 = this.G0;
        if (str2 == null || !str2.equals(str)) {
            this.G0 = str;
            i(true);
            invalidate();
        }
    }

    public void setColumns(int i10) {
        if (i10 <= 50 && this.f19263x0 != i10) {
            this.f19263x0 = i10;
            q();
            l();
            i(false);
            invalidate();
        }
    }

    public void setHorizontalGaps(float f6) {
        if (f6 >= 0.0f && this.H0 != f6) {
            this.H0 = f6;
            i(true);
            invalidate();
        }
    }

    public void setOrientation(int i10) {
        if ((i10 == 0 || i10 == 1) && this.J0 != i10) {
            this.J0 = i10;
            i(true);
            invalidate();
        }
    }

    public void setRowWeights(String str) {
        String str2 = this.F0;
        if (str2 == null || !str2.equals(str)) {
            this.F0 = str;
            i(true);
            invalidate();
        }
    }

    public void setRows(int i10) {
        if (i10 <= 50 && this.v0 != i10) {
            this.v0 = i10;
            q();
            l();
            i(false);
            invalidate();
        }
    }

    public void setSkips(String str) {
        String str2 = this.E0;
        if (str2 == null || !str2.equals(str)) {
            this.E0 = str;
            i(true);
            invalidate();
        }
    }

    public void setSpans(CharSequence charSequence) {
        String str = this.f19264y0;
        if (str == null || !str.contentEquals(charSequence)) {
            this.f19264y0 = charSequence.toString();
            i(true);
            invalidate();
        }
    }

    public void setVerticalGaps(float f6) {
        if (f6 >= 0.0f && this.I0 != f6) {
            this.I0 = f6;
            i(true);
            invalidate();
        }
    }

    public Grid(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.K0 = 0;
        this.M0 = new HashSet();
    }

    public Grid(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.K0 = 0;
        this.M0 = new HashSet();
    }
}
