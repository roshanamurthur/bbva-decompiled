package androidx.constraintlayout.core;

import androidx.camera.camera2.internal.compat.u;
import androidx.camera.camera2.internal.l0;
import androidx.camera.core.impl.utils.c;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class ArrayLinkedVariables implements ArrayRow.ArrayRowVariables {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayRow f18517b;
    protected final Cache mCache;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18516a = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f18518c = 8;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f18519d = new int[8];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f18520e = new int[8];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float[] f18521f = new float[8];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f18522g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f18523h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f18524i = false;

    public ArrayLinkedVariables(ArrayRow arrayRow, Cache cache) {
        this.f18517b = arrayRow;
        this.mCache = cache;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void add(SolverVariable solverVariable, float f6, boolean z10) {
        if (f6 <= -0.001f || f6 >= 0.001f) {
            int i10 = this.f18522g;
            ArrayRow arrayRow = this.f18517b;
            if (i10 == -1) {
                this.f18522g = 0;
                this.f18521f[0] = f6;
                this.f18519d[0] = solverVariable.id;
                this.f18520e[0] = -1;
                solverVariable.usageInRowCount++;
                solverVariable.addToRow(arrayRow);
                this.f18516a++;
                if (this.f18524i) {
                    return;
                }
                int i11 = this.f18523h + 1;
                this.f18523h = i11;
                int[] iArr = this.f18519d;
                if (i11 >= iArr.length) {
                    this.f18524i = true;
                    this.f18523h = iArr.length - 1;
                    return;
                }
                return;
            }
            int i12 = -1;
            for (int i13 = 0; i10 != -1 && i13 < this.f18516a; i13++) {
                int i14 = this.f18519d[i10];
                int i15 = solverVariable.id;
                if (i14 == i15) {
                    float[] fArr = this.f18521f;
                    float f10 = fArr[i10] + f6;
                    if (f10 > -0.001f && f10 < 0.001f) {
                        f10 = 0.0f;
                    }
                    fArr[i10] = f10;
                    if (f10 == 0.0f) {
                        if (i10 == this.f18522g) {
                            this.f18522g = this.f18520e[i10];
                        } else {
                            int[] iArr2 = this.f18520e;
                            iArr2[i12] = iArr2[i10];
                        }
                        if (z10) {
                            solverVariable.removeFromRow(arrayRow);
                        }
                        if (this.f18524i) {
                            this.f18523h = i10;
                        }
                        solverVariable.usageInRowCount--;
                        this.f18516a--;
                        return;
                    }
                    return;
                }
                if (i14 < i15) {
                    i12 = i10;
                }
                i10 = this.f18520e[i10];
            }
            int length = this.f18523h;
            int i16 = length + 1;
            if (this.f18524i) {
                int[] iArr3 = this.f18519d;
                if (iArr3[length] != -1) {
                    length = iArr3.length;
                }
            } else {
                length = i16;
            }
            int[] iArr4 = this.f18519d;
            if (length >= iArr4.length && this.f18516a < iArr4.length) {
                int i17 = 0;
                while (true) {
                    int[] iArr5 = this.f18519d;
                    if (i17 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i17] == -1) {
                        length = i17;
                        break;
                    }
                    i17++;
                }
            }
            int[] iArr6 = this.f18519d;
            if (length >= iArr6.length) {
                length = iArr6.length;
                int i18 = this.f18518c * 2;
                this.f18518c = i18;
                this.f18524i = false;
                this.f18523h = length - 1;
                this.f18521f = Arrays.copyOf(this.f18521f, i18);
                this.f18519d = Arrays.copyOf(this.f18519d, this.f18518c);
                this.f18520e = Arrays.copyOf(this.f18520e, this.f18518c);
            }
            this.f18519d[length] = solverVariable.id;
            this.f18521f[length] = f6;
            if (i12 != -1) {
                int[] iArr7 = this.f18520e;
                iArr7[length] = iArr7[i12];
                iArr7[i12] = length;
            } else {
                this.f18520e[length] = this.f18522g;
                this.f18522g = length;
            }
            solverVariable.usageInRowCount++;
            solverVariable.addToRow(arrayRow);
            this.f18516a++;
            if (!this.f18524i) {
                this.f18523h++;
            }
            int i19 = this.f18523h;
            int[] iArr8 = this.f18519d;
            if (i19 >= iArr8.length) {
                this.f18524i = true;
                this.f18523h = iArr8.length - 1;
            }
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public final void clear() {
        int i10 = this.f18522g;
        for (int i11 = 0; i10 != -1 && i11 < this.f18516a; i11++) {
            SolverVariable solverVariable = this.mCache.f18532d[this.f18519d[i10]];
            if (solverVariable != null) {
                solverVariable.removeFromRow(this.f18517b);
            }
            i10 = this.f18520e[i10];
        }
        this.f18522g = -1;
        this.f18523h = -1;
        this.f18524i = false;
        this.f18516a = 0;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public boolean contains(SolverVariable solverVariable) {
        int i10 = this.f18522g;
        if (i10 == -1) {
            return false;
        }
        for (int i11 = 0; i10 != -1 && i11 < this.f18516a; i11++) {
            if (this.f18519d[i10] == solverVariable.id) {
                return true;
            }
            i10 = this.f18520e[i10];
        }
        return false;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void display() {
        int i10 = this.f18516a;
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
        int i10 = this.f18522g;
        for (int i11 = 0; i10 != -1 && i11 < this.f18516a; i11++) {
            float[] fArr = this.f18521f;
            fArr[i10] = fArr[i10] / f6;
            i10 = this.f18520e[i10];
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public final float get(SolverVariable solverVariable) {
        int i10 = this.f18522g;
        for (int i11 = 0; i10 != -1 && i11 < this.f18516a; i11++) {
            if (this.f18519d[i10] == solverVariable.id) {
                return this.f18521f[i10];
            }
            i10 = this.f18520e[i10];
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public int getCurrentSize() {
        return this.f18516a;
    }

    public int getHead() {
        return this.f18522g;
    }

    public final int getId(int i10) {
        return this.f18519d[i10];
    }

    public final int getNextIndice(int i10) {
        return this.f18520e[i10];
    }

    public final float getValue(int i10) {
        return this.f18521f[i10];
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public SolverVariable getVariable(int i10) {
        int i11 = this.f18522g;
        for (int i12 = 0; i11 != -1 && i12 < this.f18516a; i12++) {
            if (i12 == i10) {
                return this.mCache.f18532d[this.f18519d[i11]];
            }
            i11 = this.f18520e[i11];
        }
        return null;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public float getVariableValue(int i10) {
        int i11 = this.f18522g;
        for (int i12 = 0; i11 != -1 && i12 < this.f18516a; i12++) {
            if (i12 == i10) {
                return this.f18521f[i11];
            }
            i11 = this.f18520e[i11];
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public int indexOf(SolverVariable solverVariable) {
        int i10 = this.f18522g;
        if (i10 == -1) {
            return -1;
        }
        for (int i11 = 0; i10 != -1 && i11 < this.f18516a; i11++) {
            if (this.f18519d[i10] == solverVariable.id) {
                return i10;
            }
            i10 = this.f18520e[i10];
        }
        return -1;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void invert() {
        int i10 = this.f18522g;
        for (int i11 = 0; i10 != -1 && i11 < this.f18516a; i11++) {
            float[] fArr = this.f18521f;
            fArr[i10] = fArr[i10] * (-1.0f);
            i10 = this.f18520e[i10];
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public final void put(SolverVariable solverVariable, float f6) {
        if (f6 == 0.0f) {
            remove(solverVariable, true);
            return;
        }
        int i10 = this.f18522g;
        ArrayRow arrayRow = this.f18517b;
        if (i10 == -1) {
            this.f18522g = 0;
            this.f18521f[0] = f6;
            this.f18519d[0] = solverVariable.id;
            this.f18520e[0] = -1;
            solverVariable.usageInRowCount++;
            solverVariable.addToRow(arrayRow);
            this.f18516a++;
            if (this.f18524i) {
                return;
            }
            int i11 = this.f18523h + 1;
            this.f18523h = i11;
            int[] iArr = this.f18519d;
            if (i11 >= iArr.length) {
                this.f18524i = true;
                this.f18523h = iArr.length - 1;
                return;
            }
            return;
        }
        int i12 = -1;
        for (int i13 = 0; i10 != -1 && i13 < this.f18516a; i13++) {
            int i14 = this.f18519d[i10];
            int i15 = solverVariable.id;
            if (i14 == i15) {
                this.f18521f[i10] = f6;
                return;
            }
            if (i14 < i15) {
                i12 = i10;
            }
            i10 = this.f18520e[i10];
        }
        int length = this.f18523h;
        int i16 = length + 1;
        if (this.f18524i) {
            int[] iArr2 = this.f18519d;
            if (iArr2[length] != -1) {
                length = iArr2.length;
            }
        } else {
            length = i16;
        }
        int[] iArr3 = this.f18519d;
        if (length >= iArr3.length && this.f18516a < iArr3.length) {
            int i17 = 0;
            while (true) {
                int[] iArr4 = this.f18519d;
                if (i17 >= iArr4.length) {
                    break;
                }
                if (iArr4[i17] == -1) {
                    length = i17;
                    break;
                }
                i17++;
            }
        }
        int[] iArr5 = this.f18519d;
        if (length >= iArr5.length) {
            length = iArr5.length;
            int i18 = this.f18518c * 2;
            this.f18518c = i18;
            this.f18524i = false;
            this.f18523h = length - 1;
            this.f18521f = Arrays.copyOf(this.f18521f, i18);
            this.f18519d = Arrays.copyOf(this.f18519d, this.f18518c);
            this.f18520e = Arrays.copyOf(this.f18520e, this.f18518c);
        }
        this.f18519d[length] = solverVariable.id;
        this.f18521f[length] = f6;
        if (i12 != -1) {
            int[] iArr6 = this.f18520e;
            iArr6[length] = iArr6[i12];
            iArr6[i12] = length;
        } else {
            this.f18520e[length] = this.f18522g;
            this.f18522g = length;
        }
        solverVariable.usageInRowCount++;
        solverVariable.addToRow(arrayRow);
        int i19 = this.f18516a + 1;
        this.f18516a = i19;
        if (!this.f18524i) {
            this.f18523h++;
        }
        int[] iArr7 = this.f18519d;
        if (i19 >= iArr7.length) {
            this.f18524i = true;
        }
        if (this.f18523h >= iArr7.length) {
            this.f18524i = true;
            this.f18523h = iArr7.length - 1;
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public final float remove(SolverVariable solverVariable, boolean z10) {
        int i10 = this.f18522g;
        if (i10 == -1) {
            return 0.0f;
        }
        int i11 = 0;
        int i12 = -1;
        while (i10 != -1 && i11 < this.f18516a) {
            if (this.f18519d[i10] == solverVariable.id) {
                if (i10 == this.f18522g) {
                    this.f18522g = this.f18520e[i10];
                } else {
                    int[] iArr = this.f18520e;
                    iArr[i12] = iArr[i10];
                }
                if (z10) {
                    solverVariable.removeFromRow(this.f18517b);
                }
                solverVariable.usageInRowCount--;
                this.f18516a--;
                this.f18519d[i10] = -1;
                if (this.f18524i) {
                    this.f18523h = i10;
                }
                return this.f18521f[i10];
            }
            i11++;
            i12 = i10;
            i10 = this.f18520e[i10];
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public int sizeInBytes() {
        return (this.f18519d.length * 12) + 36;
    }

    public String toString() {
        int i10 = this.f18522g;
        String string = "";
        for (int i11 = 0; i10 != -1 && i11 < this.f18516a; i11++) {
            StringBuilder sbD = c.d(l0.a(c.d(u.f(string, " -> ")), this.f18521f[i10], " : "));
            sbD.append(this.mCache.f18532d[this.f18519d[i10]]);
            string = sbD.toString();
            i10 = this.f18520e[i10];
        }
        return string;
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public float use(ArrayRow arrayRow, boolean z10) {
        float f6 = get(arrayRow.f18525a);
        remove(arrayRow.f18525a, z10);
        ArrayRow.ArrayRowVariables arrayRowVariables = arrayRow.variables;
        int currentSize = arrayRowVariables.getCurrentSize();
        for (int i10 = 0; i10 < currentSize; i10++) {
            SolverVariable variable = arrayRowVariables.getVariable(i10);
            add(variable, arrayRowVariables.get(variable) * f6, z10);
        }
        return f6;
    }
}
