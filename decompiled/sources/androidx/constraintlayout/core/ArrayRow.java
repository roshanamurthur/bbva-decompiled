package androidx.constraintlayout.core;

import androidx.camera.camera2.internal.compat.u;
import androidx.camera.core.impl.utils.c;
import com.google.firebase.crashlytics.internal.common.IdManager;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class ArrayRow implements LinearSystem.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SolverVariable f18525a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f18526b = 0.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList<SolverVariable> f18527c = new ArrayList<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f18528d = false;
    public ArrayRowVariables variables;

    public interface ArrayRowVariables {
        void add(SolverVariable solverVariable, float f6, boolean z10);

        void clear();

        boolean contains(SolverVariable solverVariable);

        void display();

        void divideByAmount(float f6);

        float get(SolverVariable solverVariable);

        int getCurrentSize();

        SolverVariable getVariable(int i10);

        float getVariableValue(int i10);

        int indexOf(SolverVariable solverVariable);

        void invert();

        void put(SolverVariable solverVariable, float f6);

        float remove(SolverVariable solverVariable, boolean z10);

        int sizeInBytes();

        float use(ArrayRow arrayRow, boolean z10);
    }

    public ArrayRow() {
    }

    public final SolverVariable a(boolean[] zArr, SolverVariable solverVariable) {
        SolverVariable.Type type;
        int currentSize = this.variables.getCurrentSize();
        SolverVariable solverVariable2 = null;
        float f6 = 0.0f;
        for (int i10 = 0; i10 < currentSize; i10++) {
            float variableValue = this.variables.getVariableValue(i10);
            if (variableValue < 0.0f) {
                SolverVariable variable = this.variables.getVariable(i10);
                if ((zArr == null || !zArr[variable.id]) && variable != solverVariable && (((type = variable.f18556t0) == SolverVariable.Type.SLACK || type == SolverVariable.Type.ERROR) && variableValue < f6)) {
                    f6 = variableValue;
                    solverVariable2 = variable;
                }
            }
        }
        return solverVariable2;
    }

    public ArrayRow addError(LinearSystem linearSystem, int i10) {
        this.variables.put(linearSystem.createErrorVariable(i10, "ep"), 1.0f);
        this.variables.put(linearSystem.createErrorVariable(i10, "em"), -1.0f);
        return this;
    }

    public final void b(SolverVariable solverVariable) {
        SolverVariable solverVariable2 = this.f18525a;
        if (solverVariable2 != null) {
            this.variables.put(solverVariable2, -1.0f);
            this.f18525a.f18553q0 = -1;
            this.f18525a = null;
        }
        float fRemove = this.variables.remove(solverVariable, true) * (-1.0f);
        this.f18525a = solverVariable;
        if (fRemove == 1.0f) {
            return;
        }
        this.f18526b /= fRemove;
        this.variables.divideByAmount(fRemove);
    }

    public final String c() {
        boolean z10;
        String strF = u.f(this.f18525a == null ? "0" : "" + this.f18525a, " = ");
        if (this.f18526b != 0.0f) {
            StringBuilder sbD = c.d(strF);
            sbD.append(this.f18526b);
            strF = sbD.toString();
            z10 = true;
        } else {
            z10 = false;
        }
        int currentSize = this.variables.getCurrentSize();
        for (int i10 = 0; i10 < currentSize; i10++) {
            SolverVariable variable = this.variables.getVariable(i10);
            if (variable != null) {
                float variableValue = this.variables.getVariableValue(i10);
                if (variableValue != 0.0f) {
                    String string = variable.toString();
                    if (z10) {
                        if (variableValue > 0.0f) {
                            strF = u.f(strF, " + ");
                        } else {
                            strF = u.f(strF, " - ");
                            variableValue *= -1.0f;
                        }
                    } else if (variableValue < 0.0f) {
                        strF = u.f(strF, "- ");
                        variableValue *= -1.0f;
                    }
                    strF = variableValue == 1.0f ? u.f(strF, string) : strF + variableValue + " " + string;
                    z10 = true;
                }
            }
        }
        return !z10 ? u.f(strF, IdManager.DEFAULT_VERSION_NAME) : strF;
    }

    @Override // androidx.constraintlayout.core.LinearSystem.a
    public void clear() {
        this.variables.clear();
        this.f18525a = null;
        this.f18526b = 0.0f;
    }

    public ArrayRow createRowDimensionRatio(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4, float f6) {
        this.variables.put(solverVariable, -1.0f);
        this.variables.put(solverVariable2, 1.0f);
        this.variables.put(solverVariable3, f6);
        this.variables.put(solverVariable4, -f6);
        return this;
    }

    public ArrayRow createRowEqualDimension(float f6, float f10, float f11, SolverVariable solverVariable, int i10, SolverVariable solverVariable2, int i11, SolverVariable solverVariable3, int i12, SolverVariable solverVariable4, int i13) {
        if (f10 == 0.0f || f6 == f11) {
            this.f18526b = ((-i10) - i11) + i12 + i13;
            this.variables.put(solverVariable, 1.0f);
            this.variables.put(solverVariable2, -1.0f);
            this.variables.put(solverVariable4, 1.0f);
            this.variables.put(solverVariable3, -1.0f);
        } else {
            float f12 = (f6 / f10) / (f11 / f10);
            this.f18526b = (i13 * f12) + (i12 * f12) + ((-i10) - i11);
            this.variables.put(solverVariable, 1.0f);
            this.variables.put(solverVariable2, -1.0f);
            this.variables.put(solverVariable4, f12);
            this.variables.put(solverVariable3, -f12);
        }
        return this;
    }

    public ArrayRow createRowEqualMatchDimensions(float f6, float f10, float f11, SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4) {
        this.f18526b = 0.0f;
        if (f10 == 0.0f || f6 == f11) {
            this.variables.put(solverVariable, 1.0f);
            this.variables.put(solverVariable2, -1.0f);
            this.variables.put(solverVariable4, 1.0f);
            this.variables.put(solverVariable3, -1.0f);
        } else if (f6 == 0.0f) {
            this.variables.put(solverVariable, 1.0f);
            this.variables.put(solverVariable2, -1.0f);
        } else if (f11 == 0.0f) {
            this.variables.put(solverVariable3, 1.0f);
            this.variables.put(solverVariable4, -1.0f);
        } else {
            float f12 = (f6 / f10) / (f11 / f10);
            this.variables.put(solverVariable, 1.0f);
            this.variables.put(solverVariable2, -1.0f);
            this.variables.put(solverVariable4, f12);
            this.variables.put(solverVariable3, -f12);
        }
        return this;
    }

    public ArrayRow createRowEquals(SolverVariable solverVariable, int i10) {
        if (i10 < 0) {
            this.f18526b = i10 * (-1);
            this.variables.put(solverVariable, 1.0f);
        } else {
            this.f18526b = i10;
            this.variables.put(solverVariable, -1.0f);
        }
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0023  */
    public ArrayRow createRowGreaterThan(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, int i10) {
        boolean z10;
        if (i10 == 0) {
            this.variables.put(solverVariable, -1.0f);
            this.variables.put(solverVariable2, 1.0f);
            this.variables.put(solverVariable3, 1.0f);
        } else {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            } else {
                z10 = false;
            }
            this.f18526b = i10;
            if (z10) {
                this.variables.put(solverVariable, 1.0f);
                this.variables.put(solverVariable2, -1.0f);
                this.variables.put(solverVariable3, -1.0f);
            } else {
                this.variables.put(solverVariable, -1.0f);
                this.variables.put(solverVariable2, 1.0f);
                this.variables.put(solverVariable3, 1.0f);
            }
        }
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0023  */
    public ArrayRow createRowLowerThan(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, int i10) {
        boolean z10;
        if (i10 == 0) {
            this.variables.put(solverVariable, -1.0f);
            this.variables.put(solverVariable2, 1.0f);
            this.variables.put(solverVariable3, -1.0f);
        } else {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            } else {
                z10 = false;
            }
            this.f18526b = i10;
            if (z10) {
                this.variables.put(solverVariable, 1.0f);
                this.variables.put(solverVariable2, -1.0f);
                this.variables.put(solverVariable3, 1.0f);
            } else {
                this.variables.put(solverVariable, -1.0f);
                this.variables.put(solverVariable2, 1.0f);
                this.variables.put(solverVariable3, -1.0f);
            }
        }
        return this;
    }

    public ArrayRow createRowWithAngle(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4, float f6) {
        this.variables.put(solverVariable3, 0.5f);
        this.variables.put(solverVariable4, 0.5f);
        this.variables.put(solverVariable, -0.5f);
        this.variables.put(solverVariable2, -0.5f);
        this.f18526b = -f6;
        return this;
    }

    @Override // androidx.constraintlayout.core.LinearSystem.a
    public SolverVariable getKey() {
        return this.f18525a;
    }

    @Override // androidx.constraintlayout.core.LinearSystem.a
    public SolverVariable getPivotCandidate(LinearSystem linearSystem, boolean[] zArr) {
        return a(zArr, null);
    }

    @Override // androidx.constraintlayout.core.LinearSystem.a
    public void initFromRow(LinearSystem.a aVar) {
        if (aVar instanceof ArrayRow) {
            ArrayRow arrayRow = (ArrayRow) aVar;
            this.f18525a = null;
            this.variables.clear();
            for (int i10 = 0; i10 < arrayRow.variables.getCurrentSize(); i10++) {
                this.variables.add(arrayRow.variables.getVariable(i10), arrayRow.variables.getVariableValue(i10), true);
            }
        }
    }

    @Override // androidx.constraintlayout.core.LinearSystem.a
    public boolean isEmpty() {
        return this.f18525a == null && this.f18526b == 0.0f && this.variables.getCurrentSize() == 0;
    }

    public SolverVariable pickPivot(SolverVariable solverVariable) {
        return a(null, solverVariable);
    }

    public void reset() {
        this.f18525a = null;
        this.variables.clear();
        this.f18526b = 0.0f;
        this.f18528d = false;
    }

    public String toString() {
        return c();
    }

    public void updateFromFinalVariable(LinearSystem linearSystem, SolverVariable solverVariable, boolean z10) {
        if (solverVariable == null || !solverVariable.isFinalValue) {
            return;
        }
        float f6 = this.variables.get(solverVariable);
        this.f18526b = (solverVariable.computedValue * f6) + this.f18526b;
        this.variables.remove(solverVariable, z10);
        if (z10) {
            solverVariable.removeFromRow(this);
        }
        if (LinearSystem.SIMPLIFY_SYNONYMS && this.variables.getCurrentSize() == 0) {
            this.f18528d = true;
            linearSystem.hasSimpleDefinition = true;
        }
    }

    public void updateFromRow(LinearSystem linearSystem, ArrayRow arrayRow, boolean z10) {
        float fUse = this.variables.use(arrayRow, z10);
        this.f18526b = (arrayRow.f18526b * fUse) + this.f18526b;
        if (z10) {
            arrayRow.f18525a.removeFromRow(this);
        }
        if (LinearSystem.SIMPLIFY_SYNONYMS && this.f18525a != null && this.variables.getCurrentSize() == 0) {
            this.f18528d = true;
            linearSystem.hasSimpleDefinition = true;
        }
    }

    public void updateFromSynonymVariable(LinearSystem linearSystem, SolverVariable solverVariable, boolean z10) {
        if (solverVariable == null || !solverVariable.f18558w0) {
            return;
        }
        float f6 = this.variables.get(solverVariable);
        this.f18526b = (solverVariable.f18560y0 * f6) + this.f18526b;
        this.variables.remove(solverVariable, z10);
        if (z10) {
            solverVariable.removeFromRow(this);
        }
        this.variables.add(linearSystem.f18543k.f18532d[solverVariable.f18559x0], f6, z10);
        if (LinearSystem.SIMPLIFY_SYNONYMS && this.variables.getCurrentSize() == 0) {
            this.f18528d = true;
            linearSystem.hasSimpleDefinition = true;
        }
    }

    public void updateFromSystem(LinearSystem linearSystem) {
        ArrayList<SolverVariable> arrayList;
        if (linearSystem.f18538f.length == 0) {
            return;
        }
        boolean z10 = false;
        while (!z10) {
            int currentSize = this.variables.getCurrentSize();
            int i10 = 0;
            while (true) {
                arrayList = this.f18527c;
                if (i10 >= currentSize) {
                    break;
                }
                SolverVariable variable = this.variables.getVariable(i10);
                if (variable.f18553q0 != -1 || variable.isFinalValue || variable.f18558w0) {
                    arrayList.add(variable);
                }
                i10++;
            }
            int size = arrayList.size();
            if (size > 0) {
                for (int i11 = 0; i11 < size; i11++) {
                    SolverVariable solverVariable = arrayList.get(i11);
                    if (solverVariable.isFinalValue) {
                        updateFromFinalVariable(linearSystem, solverVariable, true);
                    } else if (solverVariable.f18558w0) {
                        updateFromSynonymVariable(linearSystem, solverVariable, true);
                    } else {
                        updateFromRow(linearSystem, linearSystem.f18538f[solverVariable.f18553q0], true);
                    }
                }
                arrayList.clear();
            } else {
                z10 = true;
            }
        }
        if (LinearSystem.SIMPLIFY_SYNONYMS && this.f18525a != null && this.variables.getCurrentSize() == 0) {
            this.f18528d = true;
            linearSystem.hasSimpleDefinition = true;
        }
    }

    @Override // androidx.constraintlayout.core.LinearSystem.a
    public void addError(SolverVariable solverVariable) {
        int i10 = solverVariable.strength;
        float f6 = 1.0f;
        if (i10 != 1) {
            if (i10 == 2) {
                f6 = 1000.0f;
            } else if (i10 == 3) {
                f6 = 1000000.0f;
            } else if (i10 == 4) {
                f6 = 1.0E9f;
            } else if (i10 == 5) {
                f6 = 1.0E12f;
            }
        }
        this.variables.put(solverVariable, f6);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001e  */
    public ArrayRow createRowEquals(SolverVariable solverVariable, SolverVariable solverVariable2, int i10) {
        boolean z10;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            } else {
                z10 = false;
            }
            this.f18526b = i10;
            if (z10) {
                this.variables.put(solverVariable, 1.0f);
                this.variables.put(solverVariable2, -1.0f);
            } else {
                this.variables.put(solverVariable, -1.0f);
                this.variables.put(solverVariable2, 1.0f);
            }
        } else {
            this.variables.put(solverVariable, -1.0f);
            this.variables.put(solverVariable2, 1.0f);
        }
        return this;
    }

    public ArrayRow(Cache cache) {
        this.variables = new ArrayLinkedVariables(this, cache);
    }

    public ArrayRow createRowGreaterThan(SolverVariable solverVariable, int i10, SolverVariable solverVariable2) {
        this.f18526b = i10;
        this.variables.put(solverVariable, -1.0f);
        return this;
    }
}
