package androidx.constraintlayout.core;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class SolverVariable implements Comparable<SolverVariable> {
    public static final int STRENGTH_BARRIER = 6;
    public static final int STRENGTH_CENTERING = 7;
    public static final int STRENGTH_EQUALITY = 5;
    public static final int STRENGTH_FIXED = 8;
    public static final int STRENGTH_HIGH = 3;
    public static final int STRENGTH_HIGHEST = 4;
    public static final int STRENGTH_LOW = 1;
    public static final int STRENGTH_MEDIUM = 2;
    public static final int STRENGTH_NONE = 0;
    public float computedValue;
    public int id;
    public boolean inGoal;
    public boolean isFinalValue;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public String f18552p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f18553q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final float[] f18554r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final float[] f18555s0;
    public int strength;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public Type f18556t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public ArrayRow[] f18557u0;
    public int usageInRowCount;
    public int v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public boolean f18558w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public int f18559x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public float f18560y0;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Type {
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type CONSTANT;
        public static final Type ERROR;
        public static final Type SLACK;
        public static final Type UNKNOWN;
        public static final Type UNRESTRICTED;

        static {
            Type type = new Type("UNRESTRICTED", 0);
            UNRESTRICTED = type;
            Type type2 = new Type("CONSTANT", 1);
            CONSTANT = type2;
            Type type3 = new Type("SLACK", 2);
            SLACK = type3;
            Type type4 = new Type("ERROR", 3);
            ERROR = type4;
            Type type5 = new Type("UNKNOWN", 4);
            UNKNOWN = type5;
            $VALUES = new Type[]{type, type2, type3, type4, type5};
        }

        public Type() {
            throw null;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public SolverVariable(String str, Type type) {
        this.id = -1;
        this.f18553q0 = -1;
        this.strength = 0;
        this.isFinalValue = false;
        this.f18554r0 = new float[9];
        this.f18555s0 = new float[9];
        this.f18557u0 = new ArrayRow[16];
        this.v0 = 0;
        this.usageInRowCount = 0;
        this.f18558w0 = false;
        this.f18559x0 = -1;
        this.f18560y0 = 0.0f;
        this.f18552p0 = str;
        this.f18556t0 = type;
    }

    public final void addToRow(ArrayRow arrayRow) {
        int i10 = 0;
        while (true) {
            int i11 = this.v0;
            if (i10 >= i11) {
                ArrayRow[] arrayRowArr = this.f18557u0;
                if (i11 >= arrayRowArr.length) {
                    this.f18557u0 = (ArrayRow[]) Arrays.copyOf(arrayRowArr, arrayRowArr.length * 2);
                }
                ArrayRow[] arrayRowArr2 = this.f18557u0;
                int i12 = this.v0;
                arrayRowArr2[i12] = arrayRow;
                this.v0 = i12 + 1;
                return;
            }
            if (this.f18557u0[i10] == arrayRow) {
                return;
            } else {
                i10++;
            }
        }
    }

    public String getName() {
        return this.f18552p0;
    }

    public final void removeFromRow(ArrayRow arrayRow) {
        int i10 = this.v0;
        int i11 = 0;
        while (i11 < i10) {
            if (this.f18557u0[i11] == arrayRow) {
                while (i11 < i10 - 1) {
                    ArrayRow[] arrayRowArr = this.f18557u0;
                    int i12 = i11 + 1;
                    arrayRowArr[i11] = arrayRowArr[i12];
                    i11 = i12;
                }
                this.v0--;
                return;
            }
            i11++;
        }
    }

    public void reset() {
        this.f18552p0 = null;
        this.f18556t0 = Type.UNKNOWN;
        this.strength = 0;
        this.id = -1;
        this.f18553q0 = -1;
        this.computedValue = 0.0f;
        this.isFinalValue = false;
        this.f18558w0 = false;
        this.f18559x0 = -1;
        this.f18560y0 = 0.0f;
        int i10 = this.v0;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f18557u0[i11] = null;
        }
        this.v0 = 0;
        this.usageInRowCount = 0;
        this.inGoal = false;
        Arrays.fill(this.f18555s0, 0.0f);
    }

    public void setFinalValue(LinearSystem linearSystem, float f6) {
        this.computedValue = f6;
        this.isFinalValue = true;
        this.f18558w0 = false;
        this.f18559x0 = -1;
        this.f18560y0 = 0.0f;
        int i10 = this.v0;
        this.f18553q0 = -1;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f18557u0[i11].updateFromFinalVariable(linearSystem, this, false);
        }
        this.v0 = 0;
    }

    public void setName(String str) {
        this.f18552p0 = str;
    }

    public void setSynonym(LinearSystem linearSystem, SolverVariable solverVariable, float f6) {
        this.f18558w0 = true;
        this.f18559x0 = solverVariable.id;
        this.f18560y0 = f6;
        int i10 = this.v0;
        this.f18553q0 = -1;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f18557u0[i11].updateFromSynonymVariable(linearSystem, this, false);
        }
        this.v0 = 0;
        linearSystem.displayReadableRows();
    }

    public void setType(Type type, String str) {
        this.f18556t0 = type;
    }

    public String toString() {
        if (this.f18552p0 != null) {
            return "" + this.f18552p0;
        }
        return "" + this.id;
    }

    public final void updateReferencesWithNewDefinition(LinearSystem linearSystem, ArrayRow arrayRow) {
        int i10 = this.v0;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f18557u0[i11].updateFromRow(linearSystem, arrayRow, false);
        }
        this.v0 = 0;
    }

    @Override // java.lang.Comparable
    public int compareTo(SolverVariable solverVariable) {
        return this.id - solverVariable.id;
    }

    public SolverVariable(Type type, String str) {
        this.id = -1;
        this.f18553q0 = -1;
        this.strength = 0;
        this.isFinalValue = false;
        this.f18554r0 = new float[9];
        this.f18555s0 = new float[9];
        this.f18557u0 = new ArrayRow[16];
        this.v0 = 0;
        this.usageInRowCount = 0;
        this.f18558w0 = false;
        this.f18559x0 = -1;
        this.f18560y0 = 0.0f;
        this.f18556t0 = type;
    }
}
