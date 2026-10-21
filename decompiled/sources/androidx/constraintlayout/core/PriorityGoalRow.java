package androidx.constraintlayout.core;

import androidx.camera.camera2.internal.l0;
import androidx.camera.core.impl.utils.c;
import androidx.camera.core.processing.f;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public class PriorityGoalRow extends ArrayRow {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public SolverVariable[] f18546e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public SolverVariable[] f18547f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f18548g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b f18549h;

    public class a implements Comparator<SolverVariable> {
        @Override // java.util.Comparator
        public final int compare(SolverVariable solverVariable, SolverVariable solverVariable2) {
            return solverVariable.id - solverVariable2.id;
        }
    }

    public class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public SolverVariable f18550a;

        public b() {
        }

        public final String toString() {
            String strA = "[ ";
            if (this.f18550a != null) {
                for (int i10 = 0; i10 < 9; i10++) {
                    strA = l0.a(c.d(strA), this.f18550a.f18555s0[i10], " ");
                }
            }
            StringBuilder sbE = f.e(strA, "] ");
            sbE.append(this.f18550a);
            return sbE.toString();
        }
    }

    public PriorityGoalRow(Cache cache) {
        super(cache);
        this.f18546e = new SolverVariable[128];
        this.f18547f = new SolverVariable[128];
        this.f18548g = 0;
        this.f18549h = new b();
    }

    @Override // androidx.constraintlayout.core.ArrayRow, androidx.constraintlayout.core.LinearSystem.a
    public void addError(SolverVariable solverVariable) {
        this.f18549h.f18550a = solverVariable;
        Arrays.fill(solverVariable.f18555s0, 0.0f);
        solverVariable.f18555s0[solverVariable.strength] = 1.0f;
        d(solverVariable);
    }

    @Override // androidx.constraintlayout.core.ArrayRow, androidx.constraintlayout.core.LinearSystem.a
    public void clear() {
        this.f18548g = 0;
        this.f18526b = 0.0f;
    }

    public final void d(SolverVariable solverVariable) {
        int i10;
        int i11 = this.f18548g + 1;
        SolverVariable[] solverVariableArr = this.f18546e;
        if (i11 > solverVariableArr.length) {
            SolverVariable[] solverVariableArr2 = (SolverVariable[]) Arrays.copyOf(solverVariableArr, solverVariableArr.length * 2);
            this.f18546e = solverVariableArr2;
            this.f18547f = (SolverVariable[]) Arrays.copyOf(solverVariableArr2, solverVariableArr2.length * 2);
        }
        SolverVariable[] solverVariableArr3 = this.f18546e;
        int i12 = this.f18548g;
        solverVariableArr3[i12] = solverVariable;
        int i13 = i12 + 1;
        this.f18548g = i13;
        if (i13 > 1 && solverVariableArr3[i12].id > solverVariable.id) {
            int i14 = 0;
            while (true) {
                i10 = this.f18548g;
                if (i14 >= i10) {
                    break;
                }
                this.f18547f[i14] = this.f18546e[i14];
                i14++;
            }
            Arrays.sort(this.f18547f, 0, i10, new a());
            for (int i15 = 0; i15 < this.f18548g; i15++) {
                this.f18546e[i15] = this.f18547f[i15];
            }
        }
        solverVariable.inGoal = true;
        solverVariable.addToRow(this);
    }

    public final void e(SolverVariable solverVariable) {
        int i10 = 0;
        while (i10 < this.f18548g) {
            if (this.f18546e[i10] == solverVariable) {
                while (true) {
                    int i11 = this.f18548g;
                    if (i10 >= i11 - 1) {
                        this.f18548g = i11 - 1;
                        solverVariable.inGoal = false;
                        return;
                    } else {
                        SolverVariable[] solverVariableArr = this.f18546e;
                        int i12 = i10 + 1;
                        solverVariableArr[i10] = solverVariableArr[i12];
                        i10 = i12;
                    }
                }
            } else {
                i10++;
            }
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow, androidx.constraintlayout.core.LinearSystem.a
    public SolverVariable getPivotCandidate(LinearSystem linearSystem, boolean[] zArr) {
        int i10 = -1;
        for (int i11 = 0; i11 < this.f18548g; i11++) {
            SolverVariable[] solverVariableArr = this.f18546e;
            SolverVariable solverVariable = solverVariableArr[i11];
            if (!zArr[solverVariable.id]) {
                b bVar = this.f18549h;
                bVar.f18550a = solverVariable;
                int i12 = 8;
                if (i10 != -1) {
                    SolverVariable solverVariable2 = solverVariableArr[i10];
                    bVar.getClass();
                    while (i12 >= 0) {
                        float f6 = solverVariable2.f18555s0[i12];
                        float f10 = bVar.f18550a.f18555s0[i12];
                        if (f10 != f6) {
                            if (f10 >= f6) {
                                break;
                            }
                            i10 = i11;
                            break;
                            break;
                        }
                        i12--;
                    }
                } else {
                    while (true) {
                        if (i12 < 0) {
                            bVar.getClass();
                            break;
                        }
                        float f11 = bVar.f18550a.f18555s0[i12];
                        if (f11 > 0.0f) {
                            break;
                        }
                        if (f11 < 0.0f) {
                            i10 = i11;
                            break;
                        }
                        i12--;
                    }
                }
            }
        }
        if (i10 == -1) {
            return null;
        }
        return this.f18546e[i10];
    }

    @Override // androidx.constraintlayout.core.ArrayRow, androidx.constraintlayout.core.LinearSystem.a
    public boolean isEmpty() {
        return this.f18548g == 0;
    }

    @Override // androidx.constraintlayout.core.ArrayRow
    public String toString() {
        String strA = l0.a(new StringBuilder(" goal -> ("), this.f18526b, ") : ");
        for (int i10 = 0; i10 < this.f18548g; i10++) {
            SolverVariable solverVariable = this.f18546e[i10];
            b bVar = this.f18549h;
            bVar.f18550a = solverVariable;
            strA = strA + bVar + " ";
        }
        return strA;
    }

    @Override // androidx.constraintlayout.core.ArrayRow
    public void updateFromRow(LinearSystem linearSystem, ArrayRow arrayRow, boolean z10) {
        SolverVariable solverVariable = arrayRow.f18525a;
        if (solverVariable == null) {
            return;
        }
        ArrayRow.ArrayRowVariables arrayRowVariables = arrayRow.variables;
        int currentSize = arrayRowVariables.getCurrentSize();
        for (int i10 = 0; i10 < currentSize; i10++) {
            SolverVariable variable = arrayRowVariables.getVariable(i10);
            float variableValue = arrayRowVariables.getVariableValue(i10);
            b bVar = this.f18549h;
            bVar.f18550a = variable;
            boolean z11 = variable.inGoal;
            float[] fArr = solverVariable.f18555s0;
            if (z11) {
                boolean z12 = true;
                for (int i11 = 0; i11 < 9; i11++) {
                    float[] fArr2 = bVar.f18550a.f18555s0;
                    float f6 = (fArr[i11] * variableValue) + fArr2[i11];
                    fArr2[i11] = f6;
                    if (Math.abs(f6) < 1.0E-4f) {
                        bVar.f18550a.f18555s0[i11] = 0.0f;
                    } else {
                        z12 = false;
                    }
                }
                if (z12) {
                    PriorityGoalRow.this.e(bVar.f18550a);
                }
            } else {
                for (int i12 = 0; i12 < 9; i12++) {
                    float f10 = fArr[i12];
                    if (f10 != 0.0f) {
                        float f11 = f10 * variableValue;
                        if (Math.abs(f11) < 1.0E-4f) {
                            f11 = 0.0f;
                        }
                        bVar.f18550a.f18555s0[i12] = f11;
                    } else {
                        bVar.f18550a.f18555s0[i12] = 0.0f;
                    }
                }
                d(variable);
            }
            this.f18526b = (arrayRow.f18526b * variableValue) + this.f18526b;
        }
        e(solverVariable);
    }
}
