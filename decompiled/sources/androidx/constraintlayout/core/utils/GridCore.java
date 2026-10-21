package androidx.constraintlayout.core.utils;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.VirtualLayout;
import c2.a;
import c2.b;
import com.bbva.glomohybrid.base.deeplink.extensions.DeepLinkExtensionsKt;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public class GridCore extends VirtualLayout {
    public static final int HORIZONTAL = 0;
    public static final int SPANS_RESPECT_WIDGET_ORDER = 2;
    public static final int SUB_GRID_BY_COL_ROW = 1;
    public static final int VERTICAL = 1;
    public ConstraintWidgetContainer T;
    public ConstraintWidget[] U;
    public int W;
    public int X;
    public int Y;
    public int Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public float f19103a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public float f19104b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public String f19105c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public String f19106d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public String f19107e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public String f19108f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public int f19109g0;
    public boolean[][] i0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public int[][] f19112k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public int f19113l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public int[][] f19114m0;
    public boolean V = false;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public int f19110h0 = 0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public final HashSet f19111j0 = new HashSet();
    public int n0 = 0;

    public GridCore() {
        v();
        q();
    }

    public static void k(ConstraintWidget constraintWidget) {
        constraintWidget.setVerticalWeight(-1.0f);
        constraintWidget.mTop.reset();
        constraintWidget.mBottom.reset();
        constraintWidget.mBaseline.reset();
    }

    public static float[] u(int i10, String str) {
        if (str == null || str.trim().isEmpty()) {
            return null;
        }
        String[] strArrSplit = str.split(",");
        float[] fArr = new float[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 < strArrSplit.length) {
                try {
                    fArr[i11] = Float.parseFloat(strArrSplit[i11]);
                } catch (Exception e5) {
                    System.err.println("Error parsing `" + strArrSplit[i11] + "`: " + e5.getMessage());
                    fArr[i11] = 1.0f;
                }
            } else {
                fArr[i11] = 1.0f;
            }
        }
        return fArr;
    }

    /* JADX WARN: Code duplicated, block: B:75:0x01d7  */
    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void addToSolver(@Nullable LinearSystem linearSystem, boolean z10) {
        int i10;
        int i11;
        int[][] iArr;
        int i12;
        super.addToSolver(linearSystem, z10);
        int iMax = Math.max(this.W, this.Y);
        ConstraintWidget constraintWidget = this.U[0];
        float[] fArrU = u(this.W, this.f19105c0);
        if (this.W == 1) {
            k(constraintWidget);
            constraintWidget.mTop.connect(this.mTop, 0);
            constraintWidget.mBottom.connect(this.mBottom, 0);
        } else {
            int i13 = 0;
            while (true) {
                i10 = this.W;
                if (i13 >= i10) {
                    break;
                }
                ConstraintWidget constraintWidget2 = this.U[i13];
                k(constraintWidget2);
                if (fArrU != null) {
                    constraintWidget2.setVerticalWeight(fArrU[i13]);
                }
                if (i13 > 0) {
                    constraintWidget2.mTop.connect(this.U[i13 - 1].mBottom, 0);
                } else {
                    constraintWidget2.mTop.connect(this.mTop, 0);
                }
                if (i13 < this.W - 1) {
                    constraintWidget2.mBottom.connect(this.U[i13 + 1].mTop, 0);
                } else {
                    constraintWidget2.mBottom.connect(this.mBottom, 0);
                }
                if (i13 > 0) {
                    constraintWidget2.mTop.mMargin = (int) this.f19104b0;
                }
                i13++;
            }
            while (i10 < iMax) {
                ConstraintWidget constraintWidget3 = this.U[i10];
                k(constraintWidget3);
                constraintWidget3.mTop.connect(this.mTop, 0);
                constraintWidget3.mBottom.connect(this.mBottom, 0);
                i10++;
            }
        }
        int iMax2 = Math.max(this.W, this.Y);
        ConstraintWidget constraintWidget4 = this.U[0];
        float[] fArrU2 = u(this.Y, this.f19106d0);
        if (this.Y == 1) {
            constraintWidget4.setHorizontalWeight(-1.0f);
            constraintWidget4.mLeft.reset();
            constraintWidget4.mRight.reset();
            constraintWidget4.mLeft.connect(this.mLeft, 0);
            constraintWidget4.mRight.connect(this.mRight, 0);
        } else {
            int i14 = 0;
            while (true) {
                i11 = this.Y;
                if (i14 >= i11) {
                    break;
                }
                ConstraintWidget constraintWidget5 = this.U[i14];
                constraintWidget5.setHorizontalWeight(-1.0f);
                constraintWidget5.mLeft.reset();
                constraintWidget5.mRight.reset();
                if (fArrU2 != null) {
                    constraintWidget5.setHorizontalWeight(fArrU2[i14]);
                }
                if (i14 > 0) {
                    constraintWidget5.mLeft.connect(this.U[i14 - 1].mRight, 0);
                } else {
                    constraintWidget5.mLeft.connect(this.mLeft, 0);
                }
                if (i14 < this.Y - 1) {
                    constraintWidget5.mRight.connect(this.U[i14 + 1].mLeft, 0);
                } else {
                    constraintWidget5.mRight.connect(this.mRight, 0);
                }
                if (i14 > 0) {
                    constraintWidget5.mLeft.mMargin = (int) this.f19103a0;
                }
                i14++;
            }
            while (i11 < iMax2) {
                ConstraintWidget constraintWidget6 = this.U[i11];
                constraintWidget6.setHorizontalWeight(-1.0f);
                constraintWidget6.mLeft.reset();
                constraintWidget6.mRight.reset();
                constraintWidget6.mLeft.connect(this.mLeft, 0);
                constraintWidget6.mRight.connect(this.mRight, 0);
                i11++;
            }
        }
        for (int i15 = 0; i15 < this.mWidgetsCount; i15++) {
            if (!this.f19111j0.contains(this.mWidgets[i15].stringId)) {
                boolean z11 = false;
                int i16 = 0;
                while (!z11) {
                    i16 = this.f19110h0;
                    if (i16 >= this.W * this.Y) {
                        i16 = -1;
                        break;
                    }
                    int iN = n(i16);
                    int iM = m(this.f19110h0);
                    boolean[] zArr = this.i0[iN];
                    if (zArr[iM]) {
                        zArr[iM] = false;
                        z11 = true;
                    }
                    this.f19110h0++;
                }
                int iN2 = n(i16);
                int iM2 = m(i16);
                if (i16 == -1) {
                    return;
                }
                if ((this.f19113l0 & 2) <= 0 || (iArr = this.f19114m0) == null || (i12 = this.n0) >= iArr.length) {
                    l(this.mWidgets[i15], iN2, iM2, 1, 1);
                } else {
                    int[] iArr2 = iArr[i12];
                    if (iArr2[0] == i16) {
                        this.i0[iN2][iM2] = true;
                        if (s(iN2, iM2, iArr2[1], iArr2[2])) {
                            ConstraintWidget constraintWidget7 = this.mWidgets[i15];
                            int[] iArr3 = this.f19114m0[this.n0];
                            l(constraintWidget7, iN2, iM2, iArr3[1], iArr3[2]);
                            this.n0++;
                        }
                    } else {
                        l(this.mWidgets[i15], iN2, iM2, 1, 1);
                    }
                }
            }
        }
    }

    @Nullable
    public String getColumnWeights() {
        return this.f19106d0;
    }

    @Nullable
    public ConstraintWidgetContainer getContainer() {
        return this.T;
    }

    public int getFlags() {
        return this.f19113l0;
    }

    public float getHorizontalGaps() {
        return this.f19103a0;
    }

    public int getOrientation() {
        return this.f19109g0;
    }

    @Nullable
    public String getRowWeights() {
        return this.f19105c0;
    }

    public float getVerticalGaps() {
        return this.f19104b0;
    }

    public final void l(ConstraintWidget constraintWidget, int i10, int i11, int i12, int i13) {
        constraintWidget.mLeft.connect(this.U[i11].mLeft, 0);
        constraintWidget.mTop.connect(this.U[i10].mTop, 0);
        constraintWidget.mRight.connect(this.U[(i11 + i13) - 1].mRight, 0);
        constraintWidget.mBottom.connect(this.U[(i10 + i12) - 1].mBottom, 0);
    }

    public final int m(int i10) {
        return this.f19109g0 == 1 ? i10 / this.W : i10 % this.Y;
    }

    @Override // androidx.constraintlayout.core.widgets.VirtualLayout
    public void measure(int i10, int i11, int i12, int i13) {
        int[][] iArrT;
        super.measure(i10, i11, i12, i13);
        this.T = (ConstraintWidgetContainer) getParent();
        if (this.W >= 1 && this.Y >= 1) {
            this.f19110h0 = 0;
            String str = this.f19108f0;
            if (str != null && !str.trim().isEmpty() && (iArrT = t(this.f19108f0, false)) != null) {
                o(iArrT);
            }
            String str2 = this.f19107e0;
            if (str2 != null && !str2.trim().isEmpty()) {
                this.f19114m0 = t(this.f19107e0, true);
            }
            int iMax = Math.max(this.W, this.Y);
            ConstraintWidget[] constraintWidgetArr = this.U;
            if (constraintWidgetArr == null) {
                this.U = new ConstraintWidget[iMax];
                int i14 = 0;
                while (true) {
                    ConstraintWidget[] constraintWidgetArr2 = this.U;
                    if (i14 >= constraintWidgetArr2.length) {
                        break;
                    }
                    ConstraintWidget constraintWidget = new ConstraintWidget();
                    ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.mListDimensionBehaviors;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                    dimensionBehaviourArr[0] = dimensionBehaviour;
                    dimensionBehaviourArr[1] = dimensionBehaviour;
                    constraintWidget.stringId = String.valueOf(constraintWidget.hashCode());
                    constraintWidgetArr2[i14] = constraintWidget;
                    i14++;
                }
            } else if (iMax != constraintWidgetArr.length) {
                ConstraintWidget[] constraintWidgetArr3 = new ConstraintWidget[iMax];
                for (int i15 = 0; i15 < iMax; i15++) {
                    ConstraintWidget[] constraintWidgetArr4 = this.U;
                    if (i15 < constraintWidgetArr4.length) {
                        constraintWidgetArr3[i15] = constraintWidgetArr4[i15];
                    } else {
                        ConstraintWidget constraintWidget2 = new ConstraintWidget();
                        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr2 = constraintWidget2.mListDimensionBehaviors;
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                        dimensionBehaviourArr2[0] = dimensionBehaviour2;
                        dimensionBehaviourArr2[1] = dimensionBehaviour2;
                        constraintWidget2.stringId = String.valueOf(constraintWidget2.hashCode());
                        constraintWidgetArr3[i15] = constraintWidget2;
                    }
                }
                while (true) {
                    ConstraintWidget[] constraintWidgetArr5 = this.U;
                    if (iMax >= constraintWidgetArr5.length) {
                        break;
                    }
                    this.T.remove(constraintWidgetArr5[iMax]);
                    iMax++;
                }
                this.U = constraintWidgetArr3;
            }
            int[][] iArr = this.f19114m0;
            if (iArr != null) {
                p(iArr);
            }
        }
        this.T.add(this.U);
    }

    public final int n(int i10) {
        return this.f19109g0 == 1 ? i10 % this.W : i10 / this.Y;
    }

    public final void o(int[][] iArr) {
        for (int[] iArr2 : iArr) {
            if (!s(n(iArr2[0]), m(iArr2[0]), iArr2[1], iArr2[2])) {
                return;
            }
        }
    }

    public final void p(int[][] iArr) {
        if ((this.f19113l0 & 2) > 0) {
            return;
        }
        for (int i10 = 0; i10 < iArr.length; i10++) {
            int iN = n(iArr[i10][0]);
            int iM = m(iArr[i10][0]);
            int[] iArr2 = iArr[i10];
            if (!s(iN, iM, iArr2[1], iArr2[2])) {
                return;
            }
            ConstraintWidget constraintWidget = this.mWidgets[i10];
            int[] iArr3 = iArr[i10];
            l(constraintWidget, iN, iM, iArr3[1], iArr3[2]);
            this.f19111j0.add(this.mWidgets[i10].stringId);
        }
    }

    public final void q() {
        int[][] iArrT;
        int[][] iArrT2;
        boolean[][] zArr;
        int[][] iArr = this.f19112k0;
        boolean z10 = iArr != null && iArr.length == this.mWidgetsCount && (zArr = this.i0) != null && zArr.length == this.W && zArr[0].length == this.Y;
        if (!z10) {
            r();
        }
        if (z10) {
            for (int i10 = 0; i10 < this.i0.length; i10++) {
                int i11 = 0;
                while (true) {
                    boolean[][] zArr2 = this.i0;
                    if (i11 < zArr2[0].length) {
                        zArr2[i10][i11] = true;
                        i11++;
                    }
                }
            }
            for (int i12 = 0; i12 < this.f19112k0.length; i12++) {
                int i13 = 0;
                while (true) {
                    int[][] iArr2 = this.f19112k0;
                    if (i13 < iArr2[0].length) {
                        iArr2[i12][i13] = -1;
                        i13++;
                    }
                }
            }
        }
        this.f19110h0 = 0;
        String str = this.f19108f0;
        if (str != null && !str.trim().isEmpty() && (iArrT2 = t(this.f19108f0, false)) != null) {
            o(iArrT2);
        }
        String str2 = this.f19107e0;
        if (str2 == null || str2.trim().isEmpty() || (iArrT = t(this.f19107e0, true)) == null) {
            return;
        }
        p(iArrT);
    }

    public final void r() {
        boolean[][] zArr = (boolean[][]) Array.newInstance((Class<?>) Boolean.TYPE, this.W, this.Y);
        this.i0 = zArr;
        for (boolean[] zArr2 : zArr) {
            Arrays.fill(zArr2, true);
        }
        int i10 = this.mWidgetsCount;
        if (i10 > 0) {
            int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i10, 4);
            this.f19112k0 = iArr;
            for (int[] iArr2 : iArr) {
                Arrays.fill(iArr2, -1);
            }
        }
    }

    public final boolean s(int i10, int i11, int i12, int i13) {
        for (int i14 = i10; i14 < i10 + i12; i14++) {
            for (int i15 = i11; i15 < i11 + i13; i15++) {
                boolean[][] zArr = this.i0;
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

    public void setColumnWeights(@NonNull String str) {
        String str2 = this.f19106d0;
        if (str2 == null || !str2.equals(str)) {
            this.f19106d0 = str;
        }
    }

    public void setColumns(int i10) {
        if (i10 <= 50 && this.Z != i10) {
            this.Z = i10;
            v();
            r();
        }
    }

    public void setContainer(@NonNull ConstraintWidgetContainer constraintWidgetContainer) {
        this.T = constraintWidgetContainer;
    }

    public void setFlags(int i10) {
        this.f19113l0 = i10;
    }

    public void setHorizontalGaps(float f6) {
        if (f6 >= 0.0f && this.f19103a0 != f6) {
            this.f19103a0 = f6;
        }
    }

    public void setOrientation(int i10) {
        if ((i10 == 0 || i10 == 1) && this.f19109g0 != i10) {
            this.f19109g0 = i10;
        }
    }

    public void setRowWeights(@NonNull String str) {
        String str2 = this.f19105c0;
        if (str2 == null || !str2.equals(str)) {
            this.f19105c0 = str;
        }
    }

    public void setRows(int i10) {
        if (i10 <= 50 && this.X != i10) {
            this.X = i10;
            v();
            r();
        }
    }

    public void setSkips(@NonNull String str) {
        String str2 = this.f19108f0;
        if (str2 == null || !str2.equals(str)) {
            this.V = false;
            this.f19108f0 = str;
        }
    }

    public void setSpans(@NonNull CharSequence charSequence) {
        String str = this.f19107e0;
        if (str == null || !str.equals(charSequence.toString())) {
            this.V = false;
            this.f19107e0 = charSequence.toString();
        }
    }

    public void setVerticalGaps(float f6) {
        if (f6 >= 0.0f && this.f19104b0 != f6) {
            this.f19104b0 = f6;
        }
    }

    public final int[][] t(String str, boolean z10) {
        try {
            String[] strArrSplit = str.split(",");
            Arrays.sort(strArrSplit, new a(0));
            int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, strArrSplit.length, 3);
            if (this.W == 1 || this.Y == 1) {
                int i10 = 0;
                int i11 = 0;
                for (int i12 = 0; i12 < strArrSplit.length; i12++) {
                    String[] strArrSplit2 = strArrSplit[i12].trim().split(DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER);
                    iArr[i12][0] = Integer.parseInt(strArrSplit2[0]);
                    int[] iArr2 = iArr[i12];
                    iArr2[1] = 1;
                    iArr2[2] = 1;
                    if (this.Y == 1) {
                        iArr2[1] = Integer.parseInt(strArrSplit2[1]);
                        i10 += iArr[i12][1];
                        if (z10) {
                            i10--;
                        }
                    }
                    if (this.W == 1) {
                        iArr[i12][2] = Integer.parseInt(strArrSplit2[1]);
                        i11 += iArr[i12][2];
                        if (z10) {
                            i11--;
                        }
                    }
                }
                if (i10 != 0 && !this.V) {
                    setRows(this.W + i10);
                }
                if (i11 != 0 && !this.V) {
                    setColumns(this.Y + i11);
                }
                this.V = true;
            } else {
                for (int i13 = 0; i13 < strArrSplit.length; i13++) {
                    String[] strArrSplit3 = strArrSplit[i13].trim().split(DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER);
                    String[] strArrSplit4 = strArrSplit3[1].split("x");
                    iArr[i13][0] = Integer.parseInt(strArrSplit3[0]);
                    if ((this.f19113l0 & 1) > 0) {
                        iArr[i13][1] = Integer.parseInt(strArrSplit4[1]);
                        iArr[i13][2] = Integer.parseInt(strArrSplit4[0]);
                    } else {
                        iArr[i13][1] = Integer.parseInt(strArrSplit4[0]);
                        iArr[i13][2] = Integer.parseInt(strArrSplit4[1]);
                    }
                }
            }
            return iArr;
        } catch (Exception unused) {
            return null;
        }
    }

    public final void v() {
        int i10;
        int i11 = this.X;
        if (i11 != 0 && (i10 = this.Z) != 0) {
            this.W = i11;
            this.Y = i10;
            return;
        }
        int i12 = this.Z;
        if (i12 > 0) {
            this.Y = i12;
            this.W = b.a(this.mWidgetsCount, i12, 1, i12);
        } else if (i11 > 0) {
            this.W = i11;
            this.Y = b.a(this.mWidgetsCount, i11, 1, i11);
        } else {
            int iSqrt = (int) (Math.sqrt(this.mWidgetsCount) + 1.5d);
            this.W = iSqrt;
            this.Y = b.a(this.mWidgetsCount, iSqrt, 1, iSqrt);
        }
    }

    public GridCore(int i10, int i11) {
        this.X = i10;
        this.Z = i11;
        if (i10 > 50) {
            this.X = 3;
        }
        if (i11 > 50) {
            this.Z = 3;
        }
        v();
        q();
    }
}
