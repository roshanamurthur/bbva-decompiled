package androidx.constraintlayout.core;

import androidx.camera.camera2.internal.compat.u;
import androidx.camera.core.impl.utils.c;
import java.util.Arrays;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes.dex */
public class SolverVariableValues implements ArrayRow.ArrayRowVariables {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18561a = 16;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f18562b = new int[16];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f18563c = new int[16];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f18564d = new int[16];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float[] f18565e = new float[16];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int[] f18566f = new int[16];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int[] f18567g = new int[16];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f18568h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f18569i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayRow f18570j;
    protected final Cache mCache;

    public SolverVariableValues(ArrayRow arrayRow, Cache cache) {
        this.f18570j = arrayRow;
        this.mCache = cache;
        clear();
    }

    public final void a(SolverVariable solverVariable, int i10) {
        int[] iArr;
        int i11 = solverVariable.id % 16;
        int[] iArr2 = this.f18562b;
        int i12 = iArr2[i11];
        if (i12 == -1) {
            iArr2[i11] = i10;
        } else {
            while (true) {
                iArr = this.f18563c;
                int i13 = iArr[i12];
                if (i13 == -1) {
                    break;
                } else {
                    i12 = i13;
                }
            }
            iArr[i12] = i10;
        }
        this.f18563c[i10] = -1;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void add(SolverVariable solverVariable, float f6, boolean z10) {
        if (f6 <= -0.001f || f6 >= 0.001f) {
            int iIndexOf = indexOf(solverVariable);
            if (iIndexOf == -1) {
                put(solverVariable, f6);
                return;
            }
            float[] fArr = this.f18565e;
            float f10 = fArr[iIndexOf] + f6;
            fArr[iIndexOf] = f10;
            if (f10 <= -0.001f || f10 >= 0.001f) {
                return;
            }
            fArr[iIndexOf] = 0.0f;
            remove(solverVariable, z10);
        }
    }

    public final void b(int i10, SolverVariable solverVariable, float f6) {
        this.f18564d[i10] = solverVariable.id;
        this.f18565e[i10] = f6;
        this.f18566f[i10] = -1;
        this.f18567g[i10] = -1;
        solverVariable.addToRow(this.f18570j);
        solverVariable.usageInRowCount++;
        this.f18568h++;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void clear() {
        int i10 = this.f18568h;
        for (int i11 = 0; i11 < i10; i11++) {
            SolverVariable variable = getVariable(i11);
            if (variable != null) {
                variable.removeFromRow(this.f18570j);
            }
        }
        for (int i12 = 0; i12 < this.f18561a; i12++) {
            this.f18564d[i12] = -1;
            this.f18563c[i12] = -1;
        }
        for (int i13 = 0; i13 < 16; i13++) {
            this.f18562b[i13] = -1;
        }
        this.f18568h = 0;
        this.f18569i = -1;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public boolean contains(SolverVariable solverVariable) {
        return indexOf(solverVariable) != -1;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void display() {
        int i10 = this.f18568h;
        System.out.print("{ ");
        for (int i11 = 0; i11 < i10; i11++) {
            SolverVariable variable = getVariable(i11);
            if (variable != null) {
                System.out.print(variable + " = " + getVariableValue(i11) + " ");
            }
        }
        System.out.println(" }");
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void divideByAmount(float f6) {
        int i10 = this.f18568h;
        int i11 = this.f18569i;
        for (int i12 = 0; i12 < i10; i12++) {
            float[] fArr = this.f18565e;
            fArr[i11] = fArr[i11] / f6;
            i11 = this.f18567g[i11];
            if (i11 == -1) {
                return;
            }
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public float get(SolverVariable solverVariable) {
        int iIndexOf = indexOf(solverVariable);
        if (iIndexOf != -1) {
            return this.f18565e[iIndexOf];
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public int getCurrentSize() {
        return this.f18568h;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public SolverVariable getVariable(int i10) {
        int i11 = this.f18568h;
        if (i11 == 0) {
            return null;
        }
        int i12 = this.f18569i;
        for (int i13 = 0; i13 < i11; i13++) {
            if (i13 == i10 && i12 != -1) {
                return this.mCache.f18532d[this.f18564d[i12]];
            }
            i12 = this.f18567g[i12];
            if (i12 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public float getVariableValue(int i10) {
        int i11 = this.f18568h;
        int i12 = this.f18569i;
        for (int i13 = 0; i13 < i11; i13++) {
            if (i13 == i10) {
                return this.f18565e[i12];
            }
            i12 = this.f18567g[i12];
            if (i12 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public int indexOf(SolverVariable solverVariable) {
        if (this.f18568h != 0 && solverVariable != null) {
            int i10 = solverVariable.id;
            int i11 = this.f18562b[i10 % 16];
            if (i11 == -1) {
                return -1;
            }
            if (this.f18564d[i11] == i10) {
                return i11;
            }
            do {
                i11 = this.f18563c[i11];
                if (i11 == -1) {
                    break;
                }
            } while (this.f18564d[i11] != i10);
            if (i11 != -1 && this.f18564d[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void invert() {
        int i10 = this.f18568h;
        int i11 = this.f18569i;
        for (int i12 = 0; i12 < i10; i12++) {
            float[] fArr = this.f18565e;
            fArr[i11] = fArr[i11] * (-1.0f);
            i11 = this.f18567g[i11];
            if (i11 == -1) {
                return;
            }
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void put(SolverVariable solverVariable, float f6) {
        if (f6 > -0.001f && f6 < 0.001f) {
            remove(solverVariable, true);
            return;
        }
        int i10 = 0;
        if (this.f18568h == 0) {
            b(0, solverVariable, f6);
            a(solverVariable, 0);
            this.f18569i = 0;
            return;
        }
        int iIndexOf = indexOf(solverVariable);
        if (iIndexOf != -1) {
            this.f18565e[iIndexOf] = f6;
            return;
        }
        int i11 = this.f18568h + 1;
        int i12 = this.f18561a;
        if (i11 >= i12) {
            int i13 = i12 * 2;
            this.f18564d = Arrays.copyOf(this.f18564d, i13);
            this.f18565e = Arrays.copyOf(this.f18565e, i13);
            this.f18566f = Arrays.copyOf(this.f18566f, i13);
            this.f18567g = Arrays.copyOf(this.f18567g, i13);
            this.f18563c = Arrays.copyOf(this.f18563c, i13);
            for (int i14 = this.f18561a; i14 < i13; i14++) {
                this.f18564d[i14] = -1;
                this.f18563c[i14] = -1;
            }
            this.f18561a = i13;
        }
        int i15 = this.f18568h;
        int i16 = this.f18569i;
        int i17 = -1;
        for (int i18 = 0; i18 < i15; i18++) {
            int i19 = this.f18564d[i16];
            int i20 = solverVariable.id;
            if (i19 == i20) {
                this.f18565e[i16] = f6;
                return;
            }
            if (i19 < i20) {
                i17 = i16;
            }
            i16 = this.f18567g[i16];
            if (i16 == -1) {
                break;
            }
        }
        while (true) {
            if (i10 >= this.f18561a) {
                i10 = -1;
                break;
            } else if (this.f18564d[i10] == -1) {
                break;
            } else {
                i10++;
            }
        }
        b(i10, solverVariable, f6);
        if (i17 != -1) {
            this.f18566f[i10] = i17;
            int[] iArr = this.f18567g;
            iArr[i10] = iArr[i17];
            iArr[i17] = i10;
        } else {
            this.f18566f[i10] = -1;
            if (this.f18568h > 0) {
                this.f18567g[i10] = this.f18569i;
                this.f18569i = i10;
            } else {
                this.f18567g[i10] = -1;
            }
        }
        int i21 = this.f18567g[i10];
        if (i21 != -1) {
            this.f18566f[i21] = i10;
        }
        a(solverVariable, i10);
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public float remove(SolverVariable solverVariable, boolean z10) {
        int[] iArr;
        int i10;
        int iIndexOf = indexOf(solverVariable);
        if (iIndexOf == -1) {
            return 0.0f;
        }
        int i11 = solverVariable.id;
        int i12 = i11 % 16;
        int[] iArr2 = this.f18562b;
        int i13 = iArr2[i12];
        if (i13 != -1) {
            if (this.f18564d[i13] == i11) {
                int[] iArr3 = this.f18563c;
                iArr2[i12] = iArr3[i13];
                iArr3[i13] = -1;
            } else {
                while (true) {
                    iArr = this.f18563c;
                    i10 = iArr[i13];
                    if (i10 == -1 || this.f18564d[i10] == i11) {
                        break;
                    }
                    i13 = i10;
                }
                if (i10 != -1 && this.f18564d[i10] == i11) {
                    iArr[i13] = iArr[i10];
                    iArr[i10] = -1;
                }
            }
        }
        float f6 = this.f18565e[iIndexOf];
        if (this.f18569i == iIndexOf) {
            this.f18569i = this.f18567g[iIndexOf];
        }
        this.f18564d[iIndexOf] = -1;
        int[] iArr4 = this.f18566f;
        int i14 = iArr4[iIndexOf];
        if (i14 != -1) {
            int[] iArr5 = this.f18567g;
            iArr5[i14] = iArr5[iIndexOf];
        }
        int i15 = this.f18567g[iIndexOf];
        if (i15 != -1) {
            iArr4[i15] = iArr4[iIndexOf];
        }
        this.f18568h--;
        solverVariable.usageInRowCount--;
        if (z10) {
            solverVariable.removeFromRow(this.f18570j);
        }
        return f6;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public int sizeInBytes() {
        return 0;
    }

    public String toString() {
        String strF;
        String strF2;
        String strF3 = hashCode() + " { ";
        int i10 = this.f18568h;
        for (int i11 = 0; i11 < i10; i11++) {
            SolverVariable variable = getVariable(i11);
            if (variable != null) {
                String str = strF3 + variable + " = " + getVariableValue(i11) + " ";
                int iIndexOf = indexOf(variable);
                String strF4 = u.f(str, "[p: ");
                if (this.f18566f[iIndexOf] != -1) {
                    StringBuilder sbD = c.d(strF4);
                    sbD.append(this.mCache.f18532d[this.f18564d[this.f18566f[iIndexOf]]]);
                    strF = sbD.toString();
                } else {
                    strF = u.f(strF4, "none");
                }
                String strF5 = u.f(strF, ", n: ");
                if (this.f18567g[iIndexOf] != -1) {
                    StringBuilder sbD2 = c.d(strF5);
                    sbD2.append(this.mCache.f18532d[this.f18564d[this.f18567g[iIndexOf]]]);
                    strF2 = sbD2.toString();
                } else {
                    strF2 = u.f(strF5, "none");
                }
                strF3 = u.f(strF2, Constant.BRACKET_CLOSE);
            }
        }
        return u.f(strF3, " }");
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public float use(ArrayRow arrayRow, boolean z10) {
        float f6 = get(arrayRow.f18525a);
        remove(arrayRow.f18525a, z10);
        SolverVariableValues solverVariableValues = (SolverVariableValues) arrayRow.variables;
        int currentSize = solverVariableValues.getCurrentSize();
        int i10 = 0;
        int i11 = 0;
        while (i10 < currentSize) {
            int i12 = solverVariableValues.f18564d[i11];
            if (i12 != -1) {
                add(this.mCache.f18532d[i12], solverVariableValues.f18565e[i11] * f6, z10);
                i10++;
            }
            i11++;
        }
        return f6;
    }
}
