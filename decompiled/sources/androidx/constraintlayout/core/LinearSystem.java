package androidx.constraintlayout.core;

import androidx.camera.camera2.internal.compat.u;
import androidx.camera.camera2.internal.l0;
import androidx.camera.core.impl.utils.c;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class LinearSystem {
    public static long ARRAY_ROW_CREATION = 0;
    public static final boolean DEBUG = false;
    public static final boolean FULL_DEBUG = false;
    public static long OPTIMIZED_ARRAY_ROW_CREATION = 0;
    public static boolean OPTIMIZED_ENGINE = false;
    public static boolean SIMPLIFY_SYNONYMS = true;
    public static boolean SKIP_COLUMNS = true;
    public static boolean USE_BASIC_SYNONYMS = true;
    public static boolean USE_DEPENDENCY_ORDERING = false;
    public static boolean USE_SYNONYMS = true;
    public static Metrics sMetrics;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PriorityGoalRow f18535c;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Cache f18543k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ArrayRow f18545n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18533a = 1000;
    public boolean hasSimpleDefinition = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f18534b = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f18536d = 32;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f18537e = 32;
    public boolean graphOptimizer = false;
    public boolean newgraphOptimizer = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean[] f18539g = new boolean[32];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f18540h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f18541i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f18542j = 32;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public SolverVariable[] f18544l = new SolverVariable[1000];
    public int m = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayRow[] f18538f = new ArrayRow[32];

    public interface a {
        void addError(SolverVariable solverVariable);

        void clear();

        SolverVariable getKey();

        SolverVariable getPivotCandidate(LinearSystem linearSystem, boolean[] zArr);

        void initFromRow(a aVar);

        boolean isEmpty();
    }

    public static class b extends ArrayRow {
        public b(Cache cache) {
            this.variables = new SolverVariableValues(this, cache);
        }
    }

    public LinearSystem() {
        h();
        Cache cache = new Cache();
        this.f18543k = cache;
        this.f18535c = new PriorityGoalRow(cache);
        if (OPTIMIZED_ENGINE) {
            this.f18545n = new b(cache);
        } else {
            this.f18545n = new ArrayRow(cache);
        }
    }

    public static ArrayRow createRowDimensionPercent(LinearSystem linearSystem, SolverVariable solverVariable, SolverVariable solverVariable2, float f6) {
        ArrayRow arrayRowCreateRow = linearSystem.createRow();
        arrayRowCreateRow.variables.put(solverVariable, -1.0f);
        arrayRowCreateRow.variables.put(solverVariable2, f6);
        return arrayRowCreateRow;
    }

    public static Metrics getMetrics() {
        return sMetrics;
    }

    public final SolverVariable a(SolverVariable.Type type, String str) {
        SolverVariable solverVariable = (SolverVariable) this.f18543k.f18531c.a();
        if (solverVariable == null) {
            solverVariable = new SolverVariable(type, str);
            solverVariable.setType(type, str);
        } else {
            solverVariable.reset();
            solverVariable.setType(type, str);
        }
        int i10 = this.m;
        int i11 = this.f18533a;
        if (i10 >= i11) {
            int i12 = i11 * 2;
            this.f18533a = i12;
            this.f18544l = (SolverVariable[]) Arrays.copyOf(this.f18544l, i12);
        }
        SolverVariable[] solverVariableArr = this.f18544l;
        int i13 = this.m;
        this.m = i13 + 1;
        solverVariableArr[i13] = solverVariable;
        return solverVariable;
    }

    public void addCenterPoint(ConstraintWidget constraintWidget, ConstraintWidget constraintWidget2, float f6, int i10) {
        ConstraintAnchor.Type type = ConstraintAnchor.Type.LEFT;
        SolverVariable solverVariableCreateObjectVariable = createObjectVariable(constraintWidget.getAnchor(type));
        ConstraintAnchor.Type type2 = ConstraintAnchor.Type.TOP;
        SolverVariable solverVariableCreateObjectVariable2 = createObjectVariable(constraintWidget.getAnchor(type2));
        ConstraintAnchor.Type type3 = ConstraintAnchor.Type.RIGHT;
        SolverVariable solverVariableCreateObjectVariable3 = createObjectVariable(constraintWidget.getAnchor(type3));
        ConstraintAnchor.Type type4 = ConstraintAnchor.Type.BOTTOM;
        SolverVariable solverVariableCreateObjectVariable4 = createObjectVariable(constraintWidget.getAnchor(type4));
        SolverVariable solverVariableCreateObjectVariable5 = createObjectVariable(constraintWidget2.getAnchor(type));
        SolverVariable solverVariableCreateObjectVariable6 = createObjectVariable(constraintWidget2.getAnchor(type2));
        SolverVariable solverVariableCreateObjectVariable7 = createObjectVariable(constraintWidget2.getAnchor(type3));
        SolverVariable solverVariableCreateObjectVariable8 = createObjectVariable(constraintWidget2.getAnchor(type4));
        ArrayRow arrayRowCreateRow = createRow();
        double d2 = f6;
        double d3 = i10;
        arrayRowCreateRow.createRowWithAngle(solverVariableCreateObjectVariable2, solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable6, solverVariableCreateObjectVariable8, (float) (Math.sin(d2) * d3));
        addConstraint(arrayRowCreateRow);
        ArrayRow arrayRowCreateRow2 = createRow();
        arrayRowCreateRow2.createRowWithAngle(solverVariableCreateObjectVariable, solverVariableCreateObjectVariable3, solverVariableCreateObjectVariable5, solverVariableCreateObjectVariable7, (float) (Math.cos(d2) * d3));
        addConstraint(arrayRowCreateRow2);
    }

    public void addCentering(SolverVariable solverVariable, SolverVariable solverVariable2, int i10, float f6, SolverVariable solverVariable3, SolverVariable solverVariable4, int i11, int i12) {
        ArrayRow arrayRowCreateRow = createRow();
        if (solverVariable2 == solverVariable3) {
            arrayRowCreateRow.variables.put(solverVariable, 1.0f);
            arrayRowCreateRow.variables.put(solverVariable4, 1.0f);
            arrayRowCreateRow.variables.put(solverVariable2, -2.0f);
        } else if (f6 == 0.5f) {
            arrayRowCreateRow.variables.put(solverVariable, 1.0f);
            arrayRowCreateRow.variables.put(solverVariable2, -1.0f);
            arrayRowCreateRow.variables.put(solverVariable3, -1.0f);
            arrayRowCreateRow.variables.put(solverVariable4, 1.0f);
            if (i10 > 0 || i11 > 0) {
                arrayRowCreateRow.f18526b = (-i10) + i11;
            }
        } else if (f6 <= 0.0f) {
            arrayRowCreateRow.variables.put(solverVariable, -1.0f);
            arrayRowCreateRow.variables.put(solverVariable2, 1.0f);
            arrayRowCreateRow.f18526b = i10;
        } else if (f6 >= 1.0f) {
            arrayRowCreateRow.variables.put(solverVariable4, -1.0f);
            arrayRowCreateRow.variables.put(solverVariable3, 1.0f);
            arrayRowCreateRow.f18526b = -i11;
        } else {
            float f10 = 1.0f - f6;
            arrayRowCreateRow.variables.put(solverVariable, f10 * 1.0f);
            arrayRowCreateRow.variables.put(solverVariable2, f10 * (-1.0f));
            arrayRowCreateRow.variables.put(solverVariable3, (-1.0f) * f6);
            arrayRowCreateRow.variables.put(solverVariable4, 1.0f * f6);
            if (i10 > 0 || i11 > 0) {
                arrayRowCreateRow.f18526b = (i11 * f6) + ((-i10) * f10);
            }
        }
        if (i12 != 8) {
            arrayRowCreateRow.addError(this, i12);
        }
        addConstraint(arrayRowCreateRow);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0074  */
    /* JADX WARN: Code duplicated, block: B:49:0x0096  */
    /* JADX WARN: Code duplicated, block: B:91:0x011f  */
    public void addConstraint(ArrayRow arrayRow) {
        boolean z10;
        SolverVariable solverVariablePickPivot;
        if (arrayRow == null) {
            return;
        }
        Metrics metrics = sMetrics;
        if (metrics != null) {
            metrics.constraints++;
            if (arrayRow.f18528d) {
                metrics.simpleconstraints++;
            }
        }
        boolean z11 = true;
        if (this.f18541i + 1 >= this.f18542j || this.f18540h + 1 >= this.f18537e) {
            e();
        }
        if (!arrayRow.f18528d) {
            arrayRow.updateFromSystem(this);
            if (arrayRow.isEmpty()) {
                return;
            }
            float f6 = arrayRow.f18526b;
            if (f6 < 0.0f) {
                arrayRow.f18526b = f6 * (-1.0f);
                arrayRow.variables.invert();
            }
            int currentSize = arrayRow.variables.getCurrentSize();
            SolverVariable solverVariable = null;
            float f10 = 0.0f;
            float f11 = 0.0f;
            SolverVariable solverVariable2 = null;
            boolean z12 = false;
            boolean z13 = false;
            for (int i10 = 0; i10 < currentSize; i10++) {
                float variableValue = arrayRow.variables.getVariableValue(i10);
                SolverVariable variable = arrayRow.variables.getVariable(i10);
                if (variable.f18556t0 == SolverVariable.Type.UNRESTRICTED) {
                    if (solverVariable == null) {
                        if (variable.usageInRowCount <= 1) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        solverVariable = variable;
                        f10 = variableValue;
                    } else {
                        if (f10 > variableValue) {
                            if (variable.usageInRowCount > 1) {
                                z12 = false;
                            }
                            solverVariable = variable;
                            f10 = variableValue;
                        } else if (z12 || variable.usageInRowCount > 1) {
                        }
                        z12 = true;
                        solverVariable = variable;
                        f10 = variableValue;
                    }
                } else if (solverVariable == null && variableValue < 0.0f) {
                    if (solverVariable2 == null) {
                        if (variable.usageInRowCount <= 1) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        solverVariable2 = variable;
                        f11 = variableValue;
                    } else {
                        if (f11 > variableValue) {
                            if (variable.usageInRowCount > 1) {
                                z13 = false;
                            }
                            solverVariable2 = variable;
                            f11 = variableValue;
                        } else if (z13 || variable.usageInRowCount > 1) {
                        }
                        z13 = true;
                        solverVariable2 = variable;
                        f11 = variableValue;
                    }
                }
            }
            if (solverVariable == null) {
                solverVariable = solverVariable2;
            }
            if (solverVariable == null) {
                z10 = true;
            } else {
                arrayRow.b(solverVariable);
                z10 = false;
            }
            if (arrayRow.variables.getCurrentSize() == 0) {
                arrayRow.f18528d = true;
            }
            if (z10) {
                SolverVariable solverVariableCreateExtraVariable = createExtraVariable();
                arrayRow.f18525a = solverVariableCreateExtraVariable;
                int i11 = this.f18541i;
                b(arrayRow);
                if (this.f18541i == i11 + 1) {
                    this.f18545n.initFromRow(arrayRow);
                    g(this.f18545n);
                    if (solverVariableCreateExtraVariable.f18553q0 == -1) {
                        if (arrayRow.f18525a == solverVariableCreateExtraVariable && (solverVariablePickPivot = arrayRow.pickPivot(solverVariableCreateExtraVariable)) != null) {
                            Metrics metrics2 = sMetrics;
                            if (metrics2 != null) {
                                metrics2.pivots++;
                            }
                            arrayRow.b(solverVariablePickPivot);
                        }
                        if (!arrayRow.f18528d) {
                            arrayRow.f18525a.updateReferencesWithNewDefinition(this, arrayRow);
                        }
                        boolean z14 = OPTIMIZED_ENGINE;
                        Cache cache = this.f18543k;
                        if (z14) {
                            cache.f18529a.b(arrayRow);
                        } else {
                            cache.f18530b.b(arrayRow);
                        }
                        this.f18541i--;
                    }
                } else {
                    z11 = false;
                }
            } else {
                z11 = false;
            }
            SolverVariable solverVariable3 = arrayRow.f18525a;
            if (solverVariable3 == null) {
                return;
            }
            if ((solverVariable3.f18556t0 != SolverVariable.Type.UNRESTRICTED && arrayRow.f18526b < 0.0f) || z11) {
                return;
            }
        }
        b(arrayRow);
    }

    public ArrayRow addEquality(SolverVariable solverVariable, SolverVariable solverVariable2, int i10, int i11) {
        Metrics metrics = sMetrics;
        if (metrics != null) {
            metrics.mSimpleEquations++;
        }
        if (USE_BASIC_SYNONYMS && i11 == 8 && solverVariable2.isFinalValue && solverVariable.f18553q0 == -1) {
            solverVariable.setFinalValue(this, solverVariable2.computedValue + i10);
            return null;
        }
        ArrayRow arrayRowCreateRow = createRow();
        arrayRowCreateRow.createRowEquals(solverVariable, solverVariable2, i10);
        if (i11 != 8) {
            arrayRowCreateRow.addError(this, i11);
        }
        addConstraint(arrayRowCreateRow);
        return arrayRowCreateRow;
    }

    public void addGreaterBarrier(SolverVariable solverVariable, SolverVariable solverVariable2, int i10, boolean z10) {
        ArrayRow arrayRowCreateRow = createRow();
        SolverVariable solverVariableCreateSlackVariable = createSlackVariable();
        solverVariableCreateSlackVariable.strength = 0;
        arrayRowCreateRow.createRowGreaterThan(solverVariable, solverVariable2, solverVariableCreateSlackVariable, i10);
        addConstraint(arrayRowCreateRow);
    }

    public void addGreaterThan(SolverVariable solverVariable, SolverVariable solverVariable2, int i10, int i11) {
        ArrayRow arrayRowCreateRow = createRow();
        SolverVariable solverVariableCreateSlackVariable = createSlackVariable();
        solverVariableCreateSlackVariable.strength = 0;
        arrayRowCreateRow.createRowGreaterThan(solverVariable, solverVariable2, solverVariableCreateSlackVariable, i10);
        if (i11 != 8) {
            arrayRowCreateRow.variables.put(createErrorVariable(i11, null), (int) (arrayRowCreateRow.variables.get(solverVariableCreateSlackVariable) * (-1.0f)));
        }
        addConstraint(arrayRowCreateRow);
    }

    public void addLowerBarrier(SolverVariable solverVariable, SolverVariable solverVariable2, int i10, boolean z10) {
        ArrayRow arrayRowCreateRow = createRow();
        SolverVariable solverVariableCreateSlackVariable = createSlackVariable();
        solverVariableCreateSlackVariable.strength = 0;
        arrayRowCreateRow.createRowLowerThan(solverVariable, solverVariable2, solverVariableCreateSlackVariable, i10);
        addConstraint(arrayRowCreateRow);
    }

    public void addLowerThan(SolverVariable solverVariable, SolverVariable solverVariable2, int i10, int i11) {
        ArrayRow arrayRowCreateRow = createRow();
        SolverVariable solverVariableCreateSlackVariable = createSlackVariable();
        solverVariableCreateSlackVariable.strength = 0;
        arrayRowCreateRow.createRowLowerThan(solverVariable, solverVariable2, solverVariableCreateSlackVariable, i10);
        if (i11 != 8) {
            arrayRowCreateRow.variables.put(createErrorVariable(i11, null), (int) (arrayRowCreateRow.variables.get(solverVariableCreateSlackVariable) * (-1.0f)));
        }
        addConstraint(arrayRowCreateRow);
    }

    public void addRatio(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4, float f6, int i10) {
        ArrayRow arrayRowCreateRow = createRow();
        arrayRowCreateRow.createRowDimensionRatio(solverVariable, solverVariable2, solverVariable3, solverVariable4, f6);
        if (i10 != 8) {
            arrayRowCreateRow.addError(this, i10);
        }
        addConstraint(arrayRowCreateRow);
    }

    public void addSynonym(SolverVariable solverVariable, SolverVariable solverVariable2, int i10) {
        if (solverVariable.f18553q0 != -1 || i10 != 0) {
            addEquality(solverVariable, solverVariable2, i10, 8);
            return;
        }
        boolean z10 = solverVariable2.f18558w0;
        Cache cache = this.f18543k;
        if (z10) {
            solverVariable2 = cache.f18532d[solverVariable2.f18559x0];
        }
        if (solverVariable.f18558w0) {
            SolverVariable solverVariable3 = cache.f18532d[solverVariable.f18559x0];
        } else {
            solverVariable.setSynonym(this, solverVariable2, 0.0f);
        }
    }

    public final void b(ArrayRow arrayRow) {
        int i10;
        if (SIMPLIFY_SYNONYMS && arrayRow.f18528d) {
            arrayRow.f18525a.setFinalValue(this, arrayRow.f18526b);
        } else {
            ArrayRow[] arrayRowArr = this.f18538f;
            int i11 = this.f18541i;
            arrayRowArr[i11] = arrayRow;
            SolverVariable solverVariable = arrayRow.f18525a;
            solverVariable.f18553q0 = i11;
            this.f18541i = i11 + 1;
            solverVariable.updateReferencesWithNewDefinition(this, arrayRow);
        }
        if (SIMPLIFY_SYNONYMS && this.hasSimpleDefinition) {
            int i12 = 0;
            while (i12 < this.f18541i) {
                if (this.f18538f[i12] == null) {
                    System.out.println("WTF");
                }
                ArrayRow arrayRow2 = this.f18538f[i12];
                if (arrayRow2 != null && arrayRow2.f18528d) {
                    arrayRow2.f18525a.setFinalValue(this, arrayRow2.f18526b);
                    boolean z10 = OPTIMIZED_ENGINE;
                    Cache cache = this.f18543k;
                    if (z10) {
                        cache.f18529a.b(arrayRow2);
                    } else {
                        cache.f18530b.b(arrayRow2);
                    }
                    this.f18538f[i12] = null;
                    int i13 = i12 + 1;
                    int i14 = i13;
                    while (true) {
                        i10 = this.f18541i;
                        if (i13 >= i10) {
                            break;
                        }
                        ArrayRow[] arrayRowArr2 = this.f18538f;
                        int i15 = i13 - 1;
                        ArrayRow arrayRow3 = arrayRowArr2[i13];
                        arrayRowArr2[i15] = arrayRow3;
                        SolverVariable solverVariable2 = arrayRow3.f18525a;
                        if (solverVariable2.f18553q0 == i13) {
                            solverVariable2.f18553q0 = i15;
                        }
                        i14 = i13;
                        i13++;
                    }
                    if (i14 < i10) {
                        this.f18538f[i14] = null;
                    }
                    this.f18541i = i10 - 1;
                    i12--;
                }
                i12++;
            }
            this.hasSimpleDefinition = false;
        }
    }

    public final void c() {
        for (int i10 = 0; i10 < this.f18541i; i10++) {
            ArrayRow arrayRow = this.f18538f[i10];
            arrayRow.f18525a.computedValue = arrayRow.f18526b;
        }
    }

    public SolverVariable createErrorVariable(int i10, String str) {
        Metrics metrics = sMetrics;
        if (metrics != null) {
            metrics.errors++;
        }
        if (this.f18540h + 1 >= this.f18537e) {
            e();
        }
        SolverVariable solverVariableA = a(SolverVariable.Type.ERROR, str);
        int i11 = this.f18534b + 1;
        this.f18534b = i11;
        this.f18540h++;
        solverVariableA.id = i11;
        solverVariableA.strength = i10;
        this.f18543k.f18532d[i11] = solverVariableA;
        this.f18535c.addError(solverVariableA);
        return solverVariableA;
    }

    public SolverVariable createExtraVariable() {
        Metrics metrics = sMetrics;
        if (metrics != null) {
            metrics.extravariables++;
        }
        if (this.f18540h + 1 >= this.f18537e) {
            e();
        }
        SolverVariable solverVariableA = a(SolverVariable.Type.SLACK, null);
        int i10 = this.f18534b + 1;
        this.f18534b = i10;
        this.f18540h++;
        solverVariableA.id = i10;
        this.f18543k.f18532d[i10] = solverVariableA;
        return solverVariableA;
    }

    public SolverVariable createObjectVariable(Object obj) {
        SolverVariable solverVariable = null;
        if (obj == null) {
            return null;
        }
        if (this.f18540h + 1 >= this.f18537e) {
            e();
        }
        if (obj instanceof ConstraintAnchor) {
            ConstraintAnchor constraintAnchor = (ConstraintAnchor) obj;
            solverVariable = constraintAnchor.getSolverVariable();
            Cache cache = this.f18543k;
            if (solverVariable == null) {
                constraintAnchor.resetSolverVariable(cache);
                solverVariable = constraintAnchor.getSolverVariable();
            }
            int i10 = solverVariable.id;
            if (i10 == -1 || i10 > this.f18534b || cache.f18532d[i10] == null) {
                if (i10 != -1) {
                    solverVariable.reset();
                }
                int i11 = this.f18534b + 1;
                this.f18534b = i11;
                this.f18540h++;
                solverVariable.id = i11;
                solverVariable.f18556t0 = SolverVariable.Type.UNRESTRICTED;
                cache.f18532d[i11] = solverVariable;
            }
        }
        return solverVariable;
    }

    public ArrayRow createRow() {
        boolean z10 = OPTIMIZED_ENGINE;
        Cache cache = this.f18543k;
        if (z10) {
            ArrayRow arrayRow = (ArrayRow) cache.f18529a.a();
            if (arrayRow != null) {
                arrayRow.reset();
                return arrayRow;
            }
            b bVar = new b(cache);
            OPTIMIZED_ARRAY_ROW_CREATION++;
            return bVar;
        }
        ArrayRow arrayRow2 = (ArrayRow) cache.f18530b.a();
        if (arrayRow2 != null) {
            arrayRow2.reset();
            return arrayRow2;
        }
        ArrayRow arrayRow3 = new ArrayRow(cache);
        ARRAY_ROW_CREATION++;
        return arrayRow3;
    }

    public SolverVariable createSlackVariable() {
        Metrics metrics = sMetrics;
        if (metrics != null) {
            metrics.slackvariables++;
        }
        if (this.f18540h + 1 >= this.f18537e) {
            e();
        }
        SolverVariable solverVariableA = a(SolverVariable.Type.SLACK, null);
        int i10 = this.f18534b + 1;
        this.f18534b = i10;
        this.f18540h++;
        solverVariableA.id = i10;
        this.f18543k.f18532d[i10] = solverVariableA;
        return solverVariableA;
    }

    public final void d() {
        StringBuilder sb2 = new StringBuilder("Display Rows (");
        sb2.append(this.f18541i);
        sb2.append("x");
        System.out.println(androidx.appcompat.widget.a.c(sb2, this.f18540h, ")\n"));
    }

    public void displayReadableRows() {
        Cache cache;
        d();
        String strC = androidx.appcompat.widget.a.c(new StringBuilder(" num vars "), this.f18534b, RootService.LINE_BREAK);
        int i10 = 0;
        while (true) {
            int i11 = this.f18534b + 1;
            cache = this.f18543k;
            if (i10 >= i11) {
                break;
            }
            SolverVariable solverVariable = cache.f18532d[i10];
            if (solverVariable != null && solverVariable.isFinalValue) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(strC);
                sb2.append(" $[");
                sb2.append(i10);
                sb2.append("] => ");
                sb2.append(solverVariable);
                sb2.append(" = ");
                strC = l0.a(sb2, solverVariable.computedValue, RootService.LINE_BREAK);
            }
            i10++;
        }
        String strF = u.f(strC, RootService.LINE_BREAK);
        for (int i12 = 0; i12 < this.f18534b + 1; i12++) {
            SolverVariable[] solverVariableArr = cache.f18532d;
            SolverVariable solverVariable2 = solverVariableArr[i12];
            if (solverVariable2 != null && solverVariable2.f18558w0) {
                SolverVariable solverVariable3 = solverVariableArr[solverVariable2.f18559x0];
                StringBuilder sb3 = new StringBuilder();
                sb3.append(strF);
                sb3.append(" ~[");
                sb3.append(i12);
                sb3.append("] => ");
                sb3.append(solverVariable2);
                sb3.append(" = ");
                sb3.append(solverVariable3);
                sb3.append(" + ");
                strF = l0.a(sb3, solverVariable2.f18560y0, RootService.LINE_BREAK);
            }
        }
        String strF2 = u.f(strF, "\n\n #  ");
        for (int i13 = 0; i13 < this.f18541i; i13++) {
            StringBuilder sbD = c.d(strF2);
            sbD.append(this.f18538f[i13].c());
            strF2 = u.f(sbD.toString(), "\n #  ");
        }
        PriorityGoalRow priorityGoalRow = this.f18535c;
        if (priorityGoalRow != null) {
            strF2 = strF2 + "Goal: " + priorityGoalRow + RootService.LINE_BREAK;
        }
        System.out.println(strF2);
    }

    public void displayVariablesReadableRows() {
        d();
        String strF = "";
        for (int i10 = 0; i10 < this.f18541i; i10++) {
            if (this.f18538f[i10].f18525a.f18556t0 == SolverVariable.Type.UNRESTRICTED) {
                StringBuilder sbD = c.d(strF);
                sbD.append(this.f18538f[i10].c());
                strF = u.f(sbD.toString(), RootService.LINE_BREAK);
            }
        }
        StringBuilder sbD2 = c.d(strF);
        sbD2.append(this.f18535c);
        sbD2.append(RootService.LINE_BREAK);
        System.out.println(sbD2.toString());
    }

    public final void e() {
        int i10 = this.f18536d * 2;
        this.f18536d = i10;
        this.f18538f = (ArrayRow[]) Arrays.copyOf(this.f18538f, i10);
        Cache cache = this.f18543k;
        cache.f18532d = (SolverVariable[]) Arrays.copyOf(cache.f18532d, this.f18536d);
        int i11 = this.f18536d;
        this.f18539g = new boolean[i11];
        this.f18537e = i11;
        this.f18542j = i11;
        Metrics metrics = sMetrics;
        if (metrics != null) {
            metrics.tableSizeIncrease++;
            metrics.maxTableSize = Math.max(metrics.maxTableSize, i11);
            Metrics metrics2 = sMetrics;
            metrics2.lastTableSize = metrics2.maxTableSize;
        }
    }

    public final void f(PriorityGoalRow priorityGoalRow) throws Exception {
        Cache cache;
        long j10;
        Metrics metrics = sMetrics;
        long j11 = 1;
        if (metrics != null) {
            metrics.minimizeGoal++;
            metrics.maxVariables = Math.max(metrics.maxVariables, this.f18540h);
            Metrics metrics2 = sMetrics;
            metrics2.maxRows = Math.max(metrics2.maxRows, this.f18541i);
        }
        int i10 = 0;
        while (i10 < this.f18541i) {
            ArrayRow arrayRow = this.f18538f[i10];
            if (arrayRow.f18525a.f18556t0 != SolverVariable.Type.UNRESTRICTED) {
                float f6 = 0.0f;
                if (arrayRow.f18526b < 0.0f) {
                    boolean z10 = false;
                    int i11 = 0;
                    while (!z10) {
                        Metrics metrics3 = sMetrics;
                        if (metrics3 != null) {
                            metrics3.bfs += j11;
                        }
                        i11++;
                        float f10 = Float.MAX_VALUE;
                        int i12 = 0;
                        int i13 = -1;
                        int i14 = -1;
                        int i15 = 0;
                        while (true) {
                            int i16 = this.f18541i;
                            cache = this.f18543k;
                            if (i12 >= i16) {
                                break;
                            }
                            ArrayRow arrayRow2 = this.f18538f[i12];
                            if (arrayRow2.f18525a.f18556t0 != SolverVariable.Type.UNRESTRICTED && !arrayRow2.f18528d && arrayRow2.f18526b < f6) {
                                int i17 = 9;
                                if (SKIP_COLUMNS) {
                                    int currentSize = arrayRow2.variables.getCurrentSize();
                                    int i18 = 0;
                                    while (i18 < currentSize) {
                                        SolverVariable variable = arrayRow2.variables.getVariable(i18);
                                        float f11 = arrayRow2.variables.get(variable);
                                        if (f11 > f6) {
                                            int i19 = 0;
                                            while (i19 < i17) {
                                                float f12 = variable.f18554r0[i19] / f11;
                                                if ((f12 < f10 && i19 == i15) || i19 > i15) {
                                                    i15 = i19;
                                                    i14 = variable.id;
                                                    i13 = i12;
                                                    f10 = f12;
                                                }
                                                i19++;
                                                i17 = 9;
                                            }
                                        }
                                        i18++;
                                        i17 = 9;
                                    }
                                } else {
                                    int i20 = 1;
                                    while (i20 < this.f18540h) {
                                        SolverVariable solverVariable = cache.f18532d[i20];
                                        float f13 = arrayRow2.variables.get(solverVariable);
                                        if (f13 > f6) {
                                            for (int i21 = 0; i21 < 9; i21++) {
                                                float f14 = solverVariable.f18554r0[i21] / f13;
                                                if ((f14 < f10 && i21 == i15) || i21 > i15) {
                                                    i14 = i20;
                                                    f10 = f14;
                                                    i15 = i21;
                                                    i13 = i12;
                                                }
                                            }
                                        }
                                        i20++;
                                        f6 = 0.0f;
                                    }
                                }
                            }
                            i12++;
                            f6 = 0.0f;
                        }
                        if (i13 != -1) {
                            ArrayRow arrayRow3 = this.f18538f[i13];
                            arrayRow3.f18525a.f18553q0 = -1;
                            Metrics metrics4 = sMetrics;
                            if (metrics4 != null) {
                                j10 = 1;
                                metrics4.pivots++;
                            } else {
                                j10 = 1;
                            }
                            arrayRow3.b(cache.f18532d[i14]);
                            SolverVariable solverVariable2 = arrayRow3.f18525a;
                            solverVariable2.f18553q0 = i13;
                            solverVariable2.updateReferencesWithNewDefinition(this, arrayRow3);
                        } else {
                            j10 = 1;
                            z10 = true;
                        }
                        if (i11 > this.f18540h / 2) {
                            z10 = true;
                        }
                        j11 = j10;
                        f6 = 0.0f;
                    }
                    break;
                }
            }
            i10++;
            j11 = j11;
        }
        g(priorityGoalRow);
        c();
    }

    public void fillMetrics(Metrics metrics) {
        sMetrics = metrics;
    }

    public final void g(ArrayRow arrayRow) {
        Metrics metrics = sMetrics;
        if (metrics != null) {
            metrics.optimize++;
        }
        for (int i10 = 0; i10 < this.f18540h; i10++) {
            this.f18539g[i10] = false;
        }
        boolean z10 = false;
        int i11 = 0;
        while (!z10) {
            Metrics metrics2 = sMetrics;
            if (metrics2 != null) {
                metrics2.iterations++;
            }
            i11++;
            if (i11 >= this.f18540h * 2) {
                return;
            }
            if (arrayRow.getKey() != null) {
                this.f18539g[arrayRow.getKey().id] = true;
            }
            SolverVariable pivotCandidate = arrayRow.getPivotCandidate(this, this.f18539g);
            if (pivotCandidate != null) {
                boolean[] zArr = this.f18539g;
                int i12 = pivotCandidate.id;
                if (zArr[i12]) {
                    return;
                } else {
                    zArr[i12] = true;
                }
            }
            if (pivotCandidate != null) {
                float f6 = Float.MAX_VALUE;
                int i13 = -1;
                for (int i14 = 0; i14 < this.f18541i; i14++) {
                    ArrayRow arrayRow2 = this.f18538f[i14];
                    if (arrayRow2.f18525a.f18556t0 != SolverVariable.Type.UNRESTRICTED && !arrayRow2.f18528d && arrayRow2.variables.contains(pivotCandidate)) {
                        float f10 = arrayRow2.variables.get(pivotCandidate);
                        if (f10 < 0.0f) {
                            float f11 = (-arrayRow2.f18526b) / f10;
                            if (f11 < f6) {
                                i13 = i14;
                                f6 = f11;
                            }
                        }
                    }
                }
                if (i13 > -1) {
                    ArrayRow arrayRow3 = this.f18538f[i13];
                    arrayRow3.f18525a.f18553q0 = -1;
                    Metrics metrics3 = sMetrics;
                    if (metrics3 != null) {
                        metrics3.pivots++;
                    }
                    arrayRow3.b(pivotCandidate);
                    SolverVariable solverVariable = arrayRow3.f18525a;
                    solverVariable.f18553q0 = i13;
                    solverVariable.updateReferencesWithNewDefinition(this, arrayRow3);
                }
            } else {
                z10 = true;
            }
        }
    }

    public Cache getCache() {
        return this.f18543k;
    }

    public int getMemoryUsed() {
        int iSizeInBytes = 0;
        for (int i10 = 0; i10 < this.f18541i; i10++) {
            ArrayRow arrayRow = this.f18538f[i10];
            if (arrayRow != null) {
                iSizeInBytes += arrayRow.variables.sizeInBytes() + (arrayRow.f18525a != null ? 4 : 0) + 8;
            }
        }
        return iSizeInBytes;
    }

    public int getNumEquations() {
        return this.f18541i;
    }

    public int getNumVariables() {
        return this.f18534b;
    }

    public int getObjectVariableValue(Object obj) {
        SolverVariable solverVariable = ((ConstraintAnchor) obj).getSolverVariable();
        if (solverVariable != null) {
            return (int) (solverVariable.computedValue + 0.5f);
        }
        return 0;
    }

    public final void h() {
        boolean z10 = OPTIMIZED_ENGINE;
        Cache cache = this.f18543k;
        int i10 = 0;
        if (z10) {
            while (i10 < this.f18541i) {
                ArrayRow arrayRow = this.f18538f[i10];
                if (arrayRow != null) {
                    cache.f18529a.b(arrayRow);
                }
                this.f18538f[i10] = null;
                i10++;
            }
            return;
        }
        while (i10 < this.f18541i) {
            ArrayRow arrayRow2 = this.f18538f[i10];
            if (arrayRow2 != null) {
                cache.f18530b.b(arrayRow2);
            }
            this.f18538f[i10] = null;
            i10++;
        }
    }

    public void minimize() throws Exception {
        Metrics metrics = sMetrics;
        if (metrics != null) {
            metrics.minimize++;
        }
        PriorityGoalRow priorityGoalRow = this.f18535c;
        if (priorityGoalRow.isEmpty()) {
            c();
            return;
        }
        if (!this.graphOptimizer && !this.newgraphOptimizer) {
            f(priorityGoalRow);
            return;
        }
        Metrics metrics2 = sMetrics;
        if (metrics2 != null) {
            metrics2.graphOptimizer++;
        }
        for (int i10 = 0; i10 < this.f18541i; i10++) {
            if (!this.f18538f[i10].f18528d) {
                f(priorityGoalRow);
                return;
            }
        }
        Metrics metrics3 = sMetrics;
        if (metrics3 != null) {
            metrics3.fullySolved++;
        }
        c();
    }

    public void removeRow(ArrayRow arrayRow) {
        SolverVariable solverVariable;
        int i10;
        if (!arrayRow.f18528d || (solverVariable = arrayRow.f18525a) == null) {
            return;
        }
        int i11 = solverVariable.f18553q0;
        if (i11 != -1) {
            while (true) {
                i10 = this.f18541i - 1;
                if (i11 >= i10) {
                    break;
                }
                ArrayRow[] arrayRowArr = this.f18538f;
                int i12 = i11 + 1;
                ArrayRow arrayRow2 = arrayRowArr[i12];
                SolverVariable solverVariable2 = arrayRow2.f18525a;
                if (solverVariable2.f18553q0 == i12) {
                    solverVariable2.f18553q0 = i11;
                }
                arrayRowArr[i11] = arrayRow2;
                i11 = i12;
            }
            this.f18541i = i10;
        }
        SolverVariable solverVariable3 = arrayRow.f18525a;
        if (!solverVariable3.isFinalValue) {
            solverVariable3.setFinalValue(this, arrayRow.f18526b);
        }
        boolean z10 = OPTIMIZED_ENGINE;
        Cache cache = this.f18543k;
        if (z10) {
            cache.f18529a.b(arrayRow);
        } else {
            cache.f18530b.b(arrayRow);
        }
    }

    public void reset() {
        Cache cache;
        int i10 = 0;
        while (true) {
            cache = this.f18543k;
            SolverVariable[] solverVariableArr = cache.f18532d;
            if (i10 >= solverVariableArr.length) {
                break;
            }
            SolverVariable solverVariable = solverVariableArr[i10];
            if (solverVariable != null) {
                solverVariable.reset();
            }
            i10++;
        }
        androidx.constraintlayout.core.a aVar = cache.f18531c;
        SolverVariable[] solverVariableArr2 = this.f18544l;
        int length = this.m;
        aVar.getClass();
        if (length > solverVariableArr2.length) {
            length = solverVariableArr2.length;
        }
        for (int i11 = 0; i11 < length; i11++) {
            SolverVariable solverVariable2 = solverVariableArr2[i11];
            int i12 = aVar.f18572b;
            Object[] objArr = aVar.f18571a;
            if (i12 < objArr.length) {
                objArr[i12] = solverVariable2;
                aVar.f18572b = i12 + 1;
            }
        }
        this.m = 0;
        Arrays.fill(cache.f18532d, (Object) null);
        this.f18534b = 0;
        this.f18535c.clear();
        this.f18540h = 1;
        for (int i13 = 0; i13 < this.f18541i; i13++) {
            ArrayRow arrayRow = this.f18538f[i13];
        }
        h();
        this.f18541i = 0;
        if (OPTIMIZED_ENGINE) {
            this.f18545n = new b(cache);
        } else {
            this.f18545n = new ArrayRow(cache);
        }
    }

    public void addEquality(SolverVariable solverVariable, int i10) {
        Metrics metrics = sMetrics;
        if (metrics != null) {
            metrics.mSimpleEquations++;
        }
        if (USE_BASIC_SYNONYMS && solverVariable.f18553q0 == -1) {
            float f6 = i10;
            solverVariable.setFinalValue(this, f6);
            for (int i11 = 0; i11 < this.f18534b + 1; i11++) {
                SolverVariable solverVariable2 = this.f18543k.f18532d[i11];
                if (solverVariable2 != null && solverVariable2.f18558w0 && solverVariable2.f18559x0 == solverVariable.id) {
                    solverVariable2.setFinalValue(this, solverVariable2.f18560y0 + f6);
                }
            }
            return;
        }
        int i12 = solverVariable.f18553q0;
        if (i12 != -1) {
            ArrayRow arrayRow = this.f18538f[i12];
            if (arrayRow.f18528d) {
                arrayRow.f18526b = i10;
                return;
            }
            if (arrayRow.variables.getCurrentSize() == 0) {
                arrayRow.f18528d = true;
                arrayRow.f18526b = i10;
                return;
            } else {
                ArrayRow arrayRowCreateRow = createRow();
                arrayRowCreateRow.createRowEquals(solverVariable, i10);
                addConstraint(arrayRowCreateRow);
                return;
            }
        }
        ArrayRow arrayRowCreateRow2 = createRow();
        arrayRowCreateRow2.f18525a = solverVariable;
        float f10 = i10;
        solverVariable.computedValue = f10;
        arrayRowCreateRow2.f18526b = f10;
        arrayRowCreateRow2.f18528d = true;
        addConstraint(arrayRowCreateRow2);
    }
}
