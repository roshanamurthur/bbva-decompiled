package androidx.constraintlayout.core.widgets;

import androidx.camera.camera2.internal.compat.u;
import androidx.camera.core.impl.utils.c;
import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.SolverVariable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class Barrier extends HelperWidget {
    public static final int BOTTOM = 3;
    public static final int LEFT = 0;
    public static final int RIGHT = 1;
    public static final int TOP = 2;
    public int J = 0;
    public boolean K = true;
    public int L = 0;
    public boolean M = false;

    public Barrier() {
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void addToSolver(LinearSystem linearSystem, boolean z10) {
        ConstraintAnchor[] constraintAnchorArr;
        boolean z11;
        int i10;
        int i11;
        int i12;
        ConstraintAnchor[] constraintAnchorArr2 = this.mListAnchors;
        constraintAnchorArr2[0] = this.mLeft;
        constraintAnchorArr2[2] = this.mTop;
        constraintAnchorArr2[1] = this.mRight;
        constraintAnchorArr2[3] = this.mBottom;
        int i13 = 0;
        while (true) {
            constraintAnchorArr = this.mListAnchors;
            if (i13 >= constraintAnchorArr.length) {
                break;
            }
            ConstraintAnchor constraintAnchor = constraintAnchorArr[i13];
            constraintAnchor.f19133e = linearSystem.createObjectVariable(constraintAnchor);
            i13++;
        }
        int i14 = this.J;
        if (i14 < 0 || i14 >= 4) {
            return;
        }
        ConstraintAnchor constraintAnchor2 = constraintAnchorArr[i14];
        if (!this.M) {
            allSolved();
        }
        if (this.M) {
            this.M = false;
            int i15 = this.J;
            if (i15 == 0 || i15 == 1) {
                linearSystem.addEquality(this.mLeft.f19133e, this.mX);
                linearSystem.addEquality(this.mRight.f19133e, this.mX);
                return;
            } else {
                if (i15 == 2 || i15 == 3) {
                    linearSystem.addEquality(this.mTop.f19133e, this.mY);
                    linearSystem.addEquality(this.mBottom.f19133e, this.mY);
                    return;
                }
                return;
            }
        }
        int i16 = 0;
        while (true) {
            if (i16 >= this.mWidgetsCount) {
                z11 = false;
                break;
            }
            ConstraintWidget constraintWidget = this.mWidgets[i16];
            if ((this.K || constraintWidget.allowedInBarrier()) && ((((i11 = this.J) == 0 || i11 == 1) && constraintWidget.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.mLeft.mTarget != null && constraintWidget.mRight.mTarget != null) || (((i12 = this.J) == 2 || i12 == 3) && constraintWidget.getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.mTop.mTarget != null && constraintWidget.mBottom.mTarget != null))) {
                z11 = true;
                break;
            }
            i16++;
        }
        boolean z12 = this.mLeft.hasCenteredDependents() || this.mRight.hasCenteredDependents();
        boolean z13 = this.mTop.hasCenteredDependents() || this.mBottom.hasCenteredDependents();
        int i17 = !(!z11 && (((i10 = this.J) == 0 && z12) || ((i10 == 2 && z13) || ((i10 == 1 && z12) || (i10 == 3 && z13))))) ? 4 : 5;
        for (int i18 = 0; i18 < this.mWidgetsCount; i18++) {
            ConstraintWidget constraintWidget2 = this.mWidgets[i18];
            if (this.K || constraintWidget2.allowedInBarrier()) {
                SolverVariable solverVariableCreateObjectVariable = linearSystem.createObjectVariable(constraintWidget2.mListAnchors[this.J]);
                ConstraintAnchor[] constraintAnchorArr3 = constraintWidget2.mListAnchors;
                int i19 = this.J;
                ConstraintAnchor constraintAnchor3 = constraintAnchorArr3[i19];
                constraintAnchor3.f19133e = solverVariableCreateObjectVariable;
                ConstraintAnchor constraintAnchor4 = constraintAnchor3.mTarget;
                int i20 = (constraintAnchor4 == null || constraintAnchor4.mOwner != this) ? 0 : constraintAnchor3.mMargin;
                if (i19 == 0 || i19 == 2) {
                    linearSystem.addLowerBarrier(constraintAnchor2.f19133e, solverVariableCreateObjectVariable, this.L - i20, z11);
                } else {
                    linearSystem.addGreaterBarrier(constraintAnchor2.f19133e, solverVariableCreateObjectVariable, this.L + i20, z11);
                }
                linearSystem.addEquality(constraintAnchor2.f19133e, solverVariableCreateObjectVariable, this.L + i20, i17);
            }
        }
        int i21 = this.J;
        if (i21 == 0) {
            linearSystem.addEquality(this.mRight.f19133e, this.mLeft.f19133e, 0, 8);
            linearSystem.addEquality(this.mLeft.f19133e, this.mParent.mRight.f19133e, 0, 4);
            linearSystem.addEquality(this.mLeft.f19133e, this.mParent.mLeft.f19133e, 0, 0);
            return;
        }
        if (i21 == 1) {
            linearSystem.addEquality(this.mLeft.f19133e, this.mRight.f19133e, 0, 8);
            linearSystem.addEquality(this.mLeft.f19133e, this.mParent.mLeft.f19133e, 0, 4);
            linearSystem.addEquality(this.mLeft.f19133e, this.mParent.mRight.f19133e, 0, 0);
        } else if (i21 == 2) {
            linearSystem.addEquality(this.mBottom.f19133e, this.mTop.f19133e, 0, 8);
            linearSystem.addEquality(this.mTop.f19133e, this.mParent.mBottom.f19133e, 0, 4);
            linearSystem.addEquality(this.mTop.f19133e, this.mParent.mTop.f19133e, 0, 0);
        } else if (i21 == 3) {
            linearSystem.addEquality(this.mTop.f19133e, this.mBottom.f19133e, 0, 8);
            linearSystem.addEquality(this.mTop.f19133e, this.mParent.mTop.f19133e, 0, 4);
            linearSystem.addEquality(this.mTop.f19133e, this.mParent.mBottom.f19133e, 0, 0);
        }
    }

    public boolean allSolved() {
        int i10;
        int i11;
        int i12;
        boolean z10 = true;
        int i13 = 0;
        while (true) {
            i10 = this.mWidgetsCount;
            if (i13 >= i10) {
                break;
            }
            ConstraintWidget constraintWidget = this.mWidgets[i13];
            if ((this.K || constraintWidget.allowedInBarrier()) && ((((i11 = this.J) == 0 || i11 == 1) && !constraintWidget.isResolvedHorizontally()) || (((i12 = this.J) == 2 || i12 == 3) && !constraintWidget.isResolvedVertically()))) {
                z10 = false;
            }
            i13++;
        }
        if (!z10 || i10 <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z11 = false;
        for (int i14 = 0; i14 < this.mWidgetsCount; i14++) {
            ConstraintWidget constraintWidget2 = this.mWidgets[i14];
            if (this.K || constraintWidget2.allowedInBarrier()) {
                if (!z11) {
                    int i15 = this.J;
                    if (i15 == 0) {
                        iMax = constraintWidget2.getAnchor(ConstraintAnchor.Type.LEFT).getFinalValue();
                    } else if (i15 == 1) {
                        iMax = constraintWidget2.getAnchor(ConstraintAnchor.Type.RIGHT).getFinalValue();
                    } else if (i15 == 2) {
                        iMax = constraintWidget2.getAnchor(ConstraintAnchor.Type.TOP).getFinalValue();
                    } else if (i15 == 3) {
                        iMax = constraintWidget2.getAnchor(ConstraintAnchor.Type.BOTTOM).getFinalValue();
                    }
                    z11 = true;
                }
                int i16 = this.J;
                if (i16 == 0) {
                    iMax = Math.min(iMax, constraintWidget2.getAnchor(ConstraintAnchor.Type.LEFT).getFinalValue());
                } else if (i16 == 1) {
                    iMax = Math.max(iMax, constraintWidget2.getAnchor(ConstraintAnchor.Type.RIGHT).getFinalValue());
                } else if (i16 == 2) {
                    iMax = Math.min(iMax, constraintWidget2.getAnchor(ConstraintAnchor.Type.TOP).getFinalValue());
                } else if (i16 == 3) {
                    iMax = Math.max(iMax, constraintWidget2.getAnchor(ConstraintAnchor.Type.BOTTOM).getFinalValue());
                }
            }
        }
        int i17 = iMax + this.L;
        int i18 = this.J;
        if (i18 == 0 || i18 == 1) {
            setFinalHorizontal(i17, i17);
        } else {
            setFinalVertical(i17, i17);
        }
        this.M = true;
        return true;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public boolean allowedInBarrier() {
        return true;
    }

    @Deprecated
    public boolean allowsGoneWidget() {
        return this.K;
    }

    @Override // androidx.constraintlayout.core.widgets.HelperWidget, androidx.constraintlayout.core.widgets.ConstraintWidget
    public void copy(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> map) {
        super.copy(constraintWidget, map);
        Barrier barrier = (Barrier) constraintWidget;
        this.J = barrier.J;
        this.K = barrier.K;
        this.L = barrier.L;
    }

    public boolean getAllowsGoneWidget() {
        return this.K;
    }

    public int getBarrierType() {
        return this.J;
    }

    public int getMargin() {
        return this.L;
    }

    public int getOrientation() {
        int i10 = this.J;
        if (i10 == 0 || i10 == 1) {
            return 0;
        }
        return (i10 == 2 || i10 == 3) ? 1 : -1;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public boolean isResolvedHorizontally() {
        return this.M;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public boolean isResolvedVertically() {
        return this.M;
    }

    public void markWidgets() {
        for (int i10 = 0; i10 < this.mWidgetsCount; i10++) {
            ConstraintWidget constraintWidget = this.mWidgets[i10];
            if (this.K || constraintWidget.allowedInBarrier()) {
                int i11 = this.J;
                if (i11 == 0 || i11 == 1) {
                    constraintWidget.setInBarrier(0, true);
                } else if (i11 == 2 || i11 == 3) {
                    constraintWidget.setInBarrier(1, true);
                }
            }
        }
    }

    public void setAllowsGoneWidget(boolean z10) {
        this.K = z10;
    }

    public void setBarrierType(int i10) {
        this.J = i10;
    }

    public void setMargin(int i10) {
        this.L = i10;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public String toString() {
        String string = "[Barrier] " + getDebugName() + " {";
        for (int i10 = 0; i10 < this.mWidgetsCount; i10++) {
            ConstraintWidget constraintWidget = this.mWidgets[i10];
            if (i10 > 0) {
                string = u.f(string, ", ");
            }
            StringBuilder sbD = c.d(string);
            sbD.append(constraintWidget.getDebugName());
            string = sbD.toString();
        }
        return u.f(string, "}");
    }

    public Barrier(String str) {
        setDebugName(str);
    }
}
