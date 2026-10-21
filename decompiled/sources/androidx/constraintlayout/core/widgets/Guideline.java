package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.SolverVariable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class Guideline extends ConstraintWidget {
    public static final int HORIZONTAL = 0;
    public static final int RELATIVE_BEGIN = 1;
    public static final int RELATIVE_END = 2;
    public static final int RELATIVE_PERCENT = 0;
    public static final int RELATIVE_UNKNOWN = -1;
    public static final int VERTICAL = 1;
    public boolean M;
    protected float mRelativePercent = -1.0f;
    protected int mRelativeBegin = -1;
    protected int mRelativeEnd = -1;
    protected boolean mGuidelineUseRtl = true;
    public ConstraintAnchor J = this.mTop;
    public int K = 0;
    public int L = 0;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19193a;

        static {
            int[] iArr = new int[ConstraintAnchor.Type.values().length];
            f19193a = iArr;
            try {
                iArr[ConstraintAnchor.Type.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19193a[ConstraintAnchor.Type.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19193a[ConstraintAnchor.Type.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19193a[ConstraintAnchor.Type.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19193a[ConstraintAnchor.Type.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19193a[ConstraintAnchor.Type.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19193a[ConstraintAnchor.Type.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f19193a[ConstraintAnchor.Type.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f19193a[ConstraintAnchor.Type.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public Guideline() {
        this.mAnchors.clear();
        this.mAnchors.add(this.J);
        int length = this.mListAnchors.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.mListAnchors[i10] = this.J;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void addToSolver(LinearSystem linearSystem, boolean z10) {
        ConstraintWidgetContainer constraintWidgetContainer = (ConstraintWidgetContainer) getParent();
        if (constraintWidgetContainer == null) {
            return;
        }
        ConstraintAnchor anchor = constraintWidgetContainer.getAnchor(ConstraintAnchor.Type.LEFT);
        ConstraintAnchor anchor2 = constraintWidgetContainer.getAnchor(ConstraintAnchor.Type.RIGHT);
        ConstraintWidget constraintWidget = this.mParent;
        boolean z11 = constraintWidget != null && constraintWidget.mListDimensionBehaviors[0] == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if (this.K == 0) {
            anchor = constraintWidgetContainer.getAnchor(ConstraintAnchor.Type.TOP);
            anchor2 = constraintWidgetContainer.getAnchor(ConstraintAnchor.Type.BOTTOM);
            ConstraintWidget constraintWidget2 = this.mParent;
            z11 = constraintWidget2 != null && constraintWidget2.mListDimensionBehaviors[1] == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        }
        if (this.M && this.J.hasFinalValue()) {
            SolverVariable solverVariableCreateObjectVariable = linearSystem.createObjectVariable(this.J);
            linearSystem.addEquality(solverVariableCreateObjectVariable, this.J.getFinalValue());
            if (this.mRelativeBegin != -1) {
                if (z11) {
                    linearSystem.addGreaterThan(linearSystem.createObjectVariable(anchor2), solverVariableCreateObjectVariable, 0, 5);
                }
            } else if (this.mRelativeEnd != -1 && z11) {
                SolverVariable solverVariableCreateObjectVariable2 = linearSystem.createObjectVariable(anchor2);
                linearSystem.addGreaterThan(solverVariableCreateObjectVariable, linearSystem.createObjectVariable(anchor), 0, 5);
                linearSystem.addGreaterThan(solverVariableCreateObjectVariable2, solverVariableCreateObjectVariable, 0, 5);
            }
            this.M = false;
            return;
        }
        if (this.mRelativeBegin != -1) {
            SolverVariable solverVariableCreateObjectVariable3 = linearSystem.createObjectVariable(this.J);
            linearSystem.addEquality(solverVariableCreateObjectVariable3, linearSystem.createObjectVariable(anchor), this.mRelativeBegin, 8);
            if (z11) {
                linearSystem.addGreaterThan(linearSystem.createObjectVariable(anchor2), solverVariableCreateObjectVariable3, 0, 5);
                return;
            }
            return;
        }
        if (this.mRelativeEnd == -1) {
            if (this.mRelativePercent != -1.0f) {
                linearSystem.addConstraint(LinearSystem.createRowDimensionPercent(linearSystem, linearSystem.createObjectVariable(this.J), linearSystem.createObjectVariable(anchor2), this.mRelativePercent));
                return;
            }
            return;
        }
        SolverVariable solverVariableCreateObjectVariable4 = linearSystem.createObjectVariable(this.J);
        SolverVariable solverVariableCreateObjectVariable5 = linearSystem.createObjectVariable(anchor2);
        linearSystem.addEquality(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable5, -this.mRelativeEnd, 8);
        if (z11) {
            linearSystem.addGreaterThan(solverVariableCreateObjectVariable4, linearSystem.createObjectVariable(anchor), 0, 5);
            linearSystem.addGreaterThan(solverVariableCreateObjectVariable5, solverVariableCreateObjectVariable4, 0, 5);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public boolean allowedInBarrier() {
        return true;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void copy(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> map) {
        super.copy(constraintWidget, map);
        Guideline guideline = (Guideline) constraintWidget;
        this.mRelativePercent = guideline.mRelativePercent;
        this.mRelativeBegin = guideline.mRelativeBegin;
        this.mRelativeEnd = guideline.mRelativeEnd;
        this.mGuidelineUseRtl = guideline.mGuidelineUseRtl;
        setOrientation(guideline.K);
    }

    public void cyclePosition() {
        if (this.mRelativeBegin != -1) {
            float x4 = getX() / getParent().getWidth();
            if (this.K == 0) {
                x4 = getY() / getParent().getHeight();
            }
            setGuidePercent(x4);
            return;
        }
        if (this.mRelativePercent != -1.0f) {
            int width = getParent().getWidth() - getX();
            if (this.K == 0) {
                width = getParent().getHeight() - getY();
            }
            setGuideEnd(width);
            return;
        }
        if (this.mRelativeEnd != -1) {
            int x6 = getX();
            if (this.K == 0) {
                x6 = getY();
            }
            setGuideBegin(x6);
        }
    }

    public ConstraintAnchor getAnchor() {
        return this.J;
    }

    public int getMinimumPosition() {
        return this.L;
    }

    public int getOrientation() {
        return this.K;
    }

    public int getRelativeBegin() {
        return this.mRelativeBegin;
    }

    public int getRelativeBehaviour() {
        if (this.mRelativePercent != -1.0f) {
            return 0;
        }
        if (this.mRelativeBegin != -1) {
            return 1;
        }
        return this.mRelativeEnd != -1 ? 2 : -1;
    }

    public int getRelativeEnd() {
        return this.mRelativeEnd;
    }

    public float getRelativePercent() {
        return this.mRelativePercent;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public String getType() {
        return "Guideline";
    }

    public boolean isPercent() {
        return this.mRelativePercent != -1.0f && this.mRelativeBegin == -1 && this.mRelativeEnd == -1;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public boolean isResolvedHorizontally() {
        return this.M;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public boolean isResolvedVertically() {
        return this.M;
    }

    public void setFinalValue(int i10) {
        this.J.setFinalValue(i10);
        this.M = true;
    }

    public void setGuideBegin(int i10) {
        if (i10 > -1) {
            this.mRelativePercent = -1.0f;
            this.mRelativeBegin = i10;
            this.mRelativeEnd = -1;
        }
    }

    public void setGuideEnd(int i10) {
        if (i10 > -1) {
            this.mRelativePercent = -1.0f;
            this.mRelativeBegin = -1;
            this.mRelativeEnd = i10;
        }
    }

    public void setGuidePercent(int i10) {
        setGuidePercent(i10 / 100.0f);
    }

    public void setMinimumPosition(int i10) {
        this.L = i10;
    }

    public void setOrientation(int i10) {
        if (this.K == i10) {
            return;
        }
        this.K = i10;
        this.mAnchors.clear();
        if (this.K == 1) {
            this.J = this.mLeft;
        } else {
            this.J = this.mTop;
        }
        this.mAnchors.add(this.J);
        int length = this.mListAnchors.length;
        for (int i11 = 0; i11 < length; i11++) {
            this.mListAnchors[i11] = this.J;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void updateFromSolver(LinearSystem linearSystem, boolean z10) {
        if (getParent() == null) {
            return;
        }
        int objectVariableValue = linearSystem.getObjectVariableValue(this.J);
        if (this.K == 1) {
            setX(objectVariableValue);
            setY(0);
            setHeight(getParent().getHeight());
            setWidth(0);
            return;
        }
        setX(0);
        setY(objectVariableValue);
        setWidth(getParent().getWidth());
        setHeight(0);
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public ConstraintAnchor getAnchor(ConstraintAnchor.Type type) {
        int i10 = a.f19193a[type.ordinal()];
        if (i10 == 1 || i10 == 2) {
            if (this.K == 1) {
                return this.J;
            }
            return null;
        }
        if ((i10 == 3 || i10 == 4) && this.K == 0) {
            return this.J;
        }
        return null;
    }

    public void setGuidePercent(float f6) {
        if (f6 > -1.0f) {
            this.mRelativePercent = f6;
            this.mRelativeBegin = -1;
            this.mRelativeEnd = -1;
        }
    }
}
