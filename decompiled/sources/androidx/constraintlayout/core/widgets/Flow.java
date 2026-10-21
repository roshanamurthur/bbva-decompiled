package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.LinearSystem;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class Flow extends VirtualLayout {
    public static final int HORIZONTAL_ALIGN_CENTER = 2;
    public static final int HORIZONTAL_ALIGN_END = 1;
    public static final int HORIZONTAL_ALIGN_START = 0;
    public static final int VERTICAL_ALIGN_BASELINE = 3;
    public static final int VERTICAL_ALIGN_BOTTOM = 1;
    public static final int VERTICAL_ALIGN_CENTER = 2;
    public static final int VERTICAL_ALIGN_TOP = 0;
    public static final int WRAP_ALIGNED = 2;
    public static final int WRAP_CHAIN = 1;
    public static final int WRAP_CHAIN_NEW = 3;
    public static final int WRAP_NONE = 0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ConstraintWidget[] f19174q0;
    public int T = -1;
    public int U = -1;
    public int V = -1;
    public int W = -1;
    public int X = -1;
    public int Y = -1;
    public float Z = 0.5f;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public float f19160a0 = 0.5f;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public float f19161b0 = 0.5f;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public float f19162c0 = 0.5f;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public float f19163d0 = 0.5f;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public float f19164e0 = 0.5f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public int f19165f0 = 0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public int f19166g0 = 0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public int f19167h0 = 2;
    public int i0 = 2;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public int f19168j0 = 0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public int f19169k0 = -1;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public int f19170l0 = 0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public final ArrayList<a> f19171m0 = new ArrayList<>();
    public ConstraintWidget[] n0 = null;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public ConstraintWidget[] f19172o0 = null;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int[] f19173p0 = null;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f19175r0 = 0;

    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f19176a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ConstraintAnchor f19179d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public ConstraintAnchor f19180e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public ConstraintAnchor f19181f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public ConstraintAnchor f19182g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f19183h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f19184i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f19185j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f19186k;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f19191q;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ConstraintWidget f19177b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f19178c = 0;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f19187l = 0;
        public int m = 0;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f19188n = 0;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f19189o = 0;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f19190p = 0;

        public a(int i10, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, ConstraintAnchor constraintAnchor3, ConstraintAnchor constraintAnchor4, int i11) {
            this.f19183h = 0;
            this.f19184i = 0;
            this.f19185j = 0;
            this.f19186k = 0;
            this.f19191q = 0;
            this.f19176a = i10;
            this.f19179d = constraintAnchor;
            this.f19180e = constraintAnchor2;
            this.f19181f = constraintAnchor3;
            this.f19182g = constraintAnchor4;
            this.f19183h = Flow.this.getPaddingLeft();
            this.f19184i = Flow.this.getPaddingTop();
            this.f19185j = Flow.this.getPaddingRight();
            this.f19186k = Flow.this.getPaddingBottom();
            this.f19191q = i11;
        }

        public final void a(ConstraintWidget constraintWidget) {
            int i10 = this.f19176a;
            Flow flow = Flow.this;
            if (i10 == 0) {
                int iL = flow.l(constraintWidget, this.f19191q);
                if (constraintWidget.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    this.f19190p++;
                    iL = 0;
                }
                this.f19187l = iL + (constraintWidget.getVisibility() != 8 ? flow.f19165f0 : 0) + this.f19187l;
                int iK = flow.k(constraintWidget, this.f19191q);
                if (this.f19177b == null || this.f19178c < iK) {
                    this.f19177b = constraintWidget;
                    this.f19178c = iK;
                    this.m = iK;
                }
            } else {
                int iL2 = flow.l(constraintWidget, this.f19191q);
                int iK2 = flow.k(constraintWidget, this.f19191q);
                if (constraintWidget.getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    this.f19190p++;
                    iK2 = 0;
                }
                this.m = iK2 + (constraintWidget.getVisibility() != 8 ? flow.f19166g0 : 0) + this.m;
                if (this.f19177b == null || this.f19178c < iL2) {
                    this.f19177b = constraintWidget;
                    this.f19178c = iL2;
                    this.f19187l = iL2;
                }
            }
            this.f19189o++;
        }

        public final void b(int i10, boolean z10, boolean z11) {
            Flow flow;
            int i11;
            ConstraintWidget constraintWidget;
            char c10;
            int i12;
            float f6;
            float f10;
            int i13 = this.f19189o;
            int i14 = 0;
            while (true) {
                flow = Flow.this;
                if (i14 >= i13) {
                    break;
                }
                int i15 = this.f19188n;
                if (i15 + i14 >= flow.f19175r0) {
                    break;
                }
                ConstraintWidget constraintWidget2 = flow.f19174q0[i15 + i14];
                if (constraintWidget2 != null) {
                    constraintWidget2.resetAnchors();
                }
                i14++;
            }
            if (i13 == 0 || this.f19177b == null) {
                return;
            }
            boolean z12 = z11 && i10 == 0;
            int i16 = -1;
            int i17 = -1;
            for (int i18 = 0; i18 < i13; i18++) {
                int i19 = z10 ? (i13 - 1) - i18 : i18;
                int i20 = this.f19188n;
                if (i20 + i19 >= flow.f19175r0) {
                    break;
                }
                ConstraintWidget constraintWidget3 = flow.f19174q0[i20 + i19];
                if (constraintWidget3 != null && constraintWidget3.getVisibility() == 0) {
                    if (i16 == -1) {
                        i16 = i18;
                    }
                    i17 = i18;
                }
            }
            if (this.f19176a != 0) {
                ConstraintWidget constraintWidget4 = this.f19177b;
                constraintWidget4.setHorizontalChainStyle(flow.T);
                int i21 = this.f19183h;
                if (i10 > 0) {
                    i21 += flow.f19165f0;
                }
                if (z10) {
                    constraintWidget4.mRight.connect(this.f19181f, i21);
                    if (z11) {
                        constraintWidget4.mLeft.connect(this.f19179d, this.f19185j);
                    }
                    if (i10 > 0) {
                        this.f19181f.mOwner.mLeft.connect(constraintWidget4.mRight, 0);
                    }
                } else {
                    constraintWidget4.mLeft.connect(this.f19179d, i21);
                    if (z11) {
                        constraintWidget4.mRight.connect(this.f19181f, this.f19185j);
                    }
                    if (i10 > 0) {
                        this.f19179d.mOwner.mRight.connect(constraintWidget4.mLeft, 0);
                    }
                }
                ConstraintWidget constraintWidget5 = null;
                for (int i22 = 0; i22 < i13; i22++) {
                    int i23 = this.f19188n;
                    if (i23 + i22 >= flow.f19175r0) {
                        return;
                    }
                    ConstraintWidget constraintWidget6 = flow.f19174q0[i23 + i22];
                    if (constraintWidget6 != null) {
                        if (i22 == 0) {
                            constraintWidget6.connect(constraintWidget6.mTop, this.f19180e, this.f19184i);
                            int i24 = flow.U;
                            float f11 = flow.f19160a0;
                            if (this.f19188n != 0 || (i11 = flow.W) == -1) {
                                if (z11 && (i11 = flow.Y) != -1) {
                                    f11 = flow.f19164e0;
                                }
                                constraintWidget6.setVerticalChainStyle(i24);
                                constraintWidget6.setVerticalBiasPercent(f11);
                            } else {
                                f11 = flow.f19162c0;
                            }
                            i24 = i11;
                            constraintWidget6.setVerticalChainStyle(i24);
                            constraintWidget6.setVerticalBiasPercent(f11);
                        }
                        if (i22 == i13 - 1) {
                            constraintWidget6.connect(constraintWidget6.mBottom, this.f19182g, this.f19186k);
                        }
                        if (constraintWidget5 != null) {
                            constraintWidget6.mTop.connect(constraintWidget5.mBottom, flow.f19166g0);
                            if (i22 == i16) {
                                constraintWidget6.mTop.setGoneMargin(this.f19184i);
                            }
                            constraintWidget5.mBottom.connect(constraintWidget6.mTop, 0);
                            if (i22 == i17 + 1) {
                                constraintWidget5.mBottom.setGoneMargin(this.f19186k);
                            }
                        }
                        if (constraintWidget6 != constraintWidget4) {
                            if (z10) {
                                int i25 = flow.f19167h0;
                                if (i25 == 0) {
                                    constraintWidget6.mRight.connect(constraintWidget4.mRight, 0);
                                } else if (i25 == 1) {
                                    constraintWidget6.mLeft.connect(constraintWidget4.mLeft, 0);
                                } else if (i25 == 2) {
                                    constraintWidget6.mLeft.connect(constraintWidget4.mLeft, 0);
                                    constraintWidget6.mRight.connect(constraintWidget4.mRight, 0);
                                }
                            } else {
                                int i26 = flow.f19167h0;
                                if (i26 == 0) {
                                    constraintWidget6.mLeft.connect(constraintWidget4.mLeft, 0);
                                } else if (i26 == 1) {
                                    constraintWidget6.mRight.connect(constraintWidget4.mRight, 0);
                                } else if (i26 == 2) {
                                    if (z12) {
                                        constraintWidget6.mLeft.connect(this.f19179d, this.f19183h);
                                        constraintWidget6.mRight.connect(this.f19181f, this.f19185j);
                                    } else {
                                        constraintWidget6.mLeft.connect(constraintWidget4.mLeft, 0);
                                        constraintWidget6.mRight.connect(constraintWidget4.mRight, 0);
                                    }
                                }
                            }
                        }
                        constraintWidget5 = constraintWidget6;
                    }
                }
                return;
            }
            ConstraintWidget constraintWidget7 = this.f19177b;
            constraintWidget7.setVerticalChainStyle(flow.U);
            int i27 = this.f19184i;
            if (i10 > 0) {
                i27 += flow.f19166g0;
            }
            constraintWidget7.mTop.connect(this.f19180e, i27);
            if (z11) {
                constraintWidget7.mBottom.connect(this.f19182g, this.f19186k);
            }
            if (i10 > 0) {
                this.f19180e.mOwner.mBottom.connect(constraintWidget7.mTop, 0);
            }
            if (flow.i0 != 3 || constraintWidget7.hasBaseline()) {
                constraintWidget = constraintWidget7;
                break;
            }
            int i28 = 0;
            while (true) {
                if (i28 < i13) {
                    int i29 = z10 ? (i13 - 1) - i28 : i28;
                    int i30 = this.f19188n;
                    if (i30 + i29 < flow.f19175r0) {
                        constraintWidget = flow.f19174q0[i30 + i29];
                        if (constraintWidget.hasBaseline()) {
                            break;
                        } else {
                            i28++;
                        }
                    }
                }
                constraintWidget = constraintWidget7;
                break;
            }
            int i31 = 0;
            ConstraintWidget constraintWidget8 = null;
            while (i31 < i13) {
                int i32 = z10 ? (i13 - 1) - i31 : i31;
                int i33 = this.f19188n;
                if (i33 + i32 >= flow.f19175r0) {
                    return;
                }
                ConstraintWidget constraintWidget9 = flow.f19174q0[i33 + i32];
                if (constraintWidget9 == null) {
                    constraintWidget9 = constraintWidget8;
                } else {
                    if (i31 == 0) {
                        constraintWidget9.connect(constraintWidget9.mLeft, this.f19179d, this.f19183h);
                    }
                    if (i32 == 0) {
                        int i34 = flow.T;
                        float f12 = z10 ? 1.0f - flow.Z : flow.Z;
                        if (this.f19188n != 0 || (i12 = flow.V) == -1) {
                            if (z11 && (i12 = flow.X) != -1) {
                                if (z10) {
                                    f10 = flow.f19163d0;
                                    f12 = 1.0f - f10;
                                    i34 = i12;
                                } else {
                                    f6 = flow.f19163d0;
                                    f12 = f6;
                                    i34 = i12;
                                }
                            }
                        } else if (z10) {
                            f10 = flow.f19161b0;
                            f12 = 1.0f - f10;
                            i34 = i12;
                        } else {
                            f6 = flow.f19161b0;
                            f12 = f6;
                            i34 = i12;
                        }
                        constraintWidget9.setHorizontalChainStyle(i34);
                        constraintWidget9.setHorizontalBiasPercent(f12);
                    }
                    if (i31 == i13 - 1) {
                        constraintWidget9.connect(constraintWidget9.mRight, this.f19181f, this.f19185j);
                    }
                    if (constraintWidget8 != null) {
                        constraintWidget9.mLeft.connect(constraintWidget8.mRight, flow.f19165f0);
                        if (i31 == i16) {
                            constraintWidget9.mLeft.setGoneMargin(this.f19183h);
                        }
                        constraintWidget8.mRight.connect(constraintWidget9.mLeft, 0);
                        if (i31 == i17 + 1) {
                            constraintWidget8.mRight.setGoneMargin(this.f19185j);
                        }
                    }
                    if (constraintWidget9 != constraintWidget7) {
                        c10 = 3;
                        if (flow.i0 == 3 && constraintWidget.hasBaseline() && constraintWidget9 != constraintWidget && constraintWidget9.hasBaseline()) {
                            constraintWidget9.mBaseline.connect(constraintWidget.mBaseline, 0);
                        } else {
                            int i35 = flow.i0;
                            if (i35 == 0) {
                                constraintWidget9.mTop.connect(constraintWidget7.mTop, 0);
                            } else if (i35 == 1) {
                                constraintWidget9.mBottom.connect(constraintWidget7.mBottom, 0);
                            } else if (z12) {
                                constraintWidget9.mTop.connect(this.f19180e, this.f19184i);
                                constraintWidget9.mBottom.connect(this.f19182g, this.f19186k);
                            } else {
                                constraintWidget9.mTop.connect(constraintWidget7.mTop, 0);
                                constraintWidget9.mBottom.connect(constraintWidget7.mBottom, 0);
                            }
                        }
                    }
                    i31++;
                    constraintWidget8 = constraintWidget9;
                }
                c10 = 3;
                i31++;
                constraintWidget8 = constraintWidget9;
            }
        }

        public final int c() {
            return this.f19176a == 1 ? this.m - Flow.this.f19166g0 : this.m;
        }

        public final int d() {
            return this.f19176a == 0 ? this.f19187l - Flow.this.f19165f0 : this.f19187l;
        }

        public final void e(int i10) {
            Flow flow;
            int i11 = this.f19190p;
            if (i11 == 0) {
                return;
            }
            int i12 = this.f19189o;
            int i13 = i10 / i11;
            int i14 = 0;
            while (true) {
                flow = Flow.this;
                if (i14 >= i12) {
                    break;
                }
                int i15 = this.f19188n;
                if (i15 + i14 >= flow.f19175r0) {
                    break;
                }
                ConstraintWidget constraintWidget = flow.f19174q0[i15 + i14];
                if (this.f19176a == 0) {
                    if (constraintWidget != null && constraintWidget.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.mMatchConstraintDefaultWidth == 0) {
                        Flow.this.measure(constraintWidget, ConstraintWidget.DimensionBehaviour.FIXED, i13, constraintWidget.getVerticalDimensionBehaviour(), constraintWidget.getHeight());
                    }
                } else if (constraintWidget != null && constraintWidget.getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.mMatchConstraintDefaultHeight == 0) {
                    Flow.this.measure(constraintWidget, constraintWidget.getHorizontalDimensionBehaviour(), constraintWidget.getWidth(), ConstraintWidget.DimensionBehaviour.FIXED, i13);
                }
                i14++;
            }
            this.f19187l = 0;
            this.m = 0;
            this.f19177b = null;
            this.f19178c = 0;
            int i16 = this.f19189o;
            for (int i17 = 0; i17 < i16; i17++) {
                int i18 = this.f19188n + i17;
                if (i18 >= flow.f19175r0) {
                    return;
                }
                ConstraintWidget constraintWidget2 = flow.f19174q0[i18];
                if (this.f19176a == 0) {
                    int width = constraintWidget2.getWidth();
                    int i19 = flow.f19165f0;
                    if (constraintWidget2.getVisibility() == 8) {
                        i19 = 0;
                    }
                    this.f19187l = width + i19 + this.f19187l;
                    int iK = flow.k(constraintWidget2, this.f19191q);
                    if (this.f19177b == null || this.f19178c < iK) {
                        this.f19177b = constraintWidget2;
                        this.f19178c = iK;
                        this.m = iK;
                    }
                } else {
                    int iL = flow.l(constraintWidget2, this.f19191q);
                    int iK2 = flow.k(constraintWidget2, this.f19191q);
                    int i20 = flow.f19166g0;
                    if (constraintWidget2.getVisibility() == 8) {
                        i20 = 0;
                    }
                    this.m = iK2 + i20 + this.m;
                    if (this.f19177b == null || this.f19178c < iL) {
                        this.f19177b = constraintWidget2;
                        this.f19178c = iL;
                        this.f19187l = iL;
                    }
                }
            }
        }

        public final void f(int i10, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, ConstraintAnchor constraintAnchor3, ConstraintAnchor constraintAnchor4, int i11, int i12, int i13, int i14, int i15) {
            this.f19176a = i10;
            this.f19179d = constraintAnchor;
            this.f19180e = constraintAnchor2;
            this.f19181f = constraintAnchor3;
            this.f19182g = constraintAnchor4;
            this.f19183h = i11;
            this.f19184i = i12;
            this.f19185j = i13;
            this.f19186k = i14;
            this.f19191q = i15;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void addToSolver(LinearSystem linearSystem, boolean z10) {
        ConstraintWidget constraintWidget;
        float f6;
        int i10;
        super.addToSolver(linearSystem, z10);
        boolean z11 = getParent() != null && ((ConstraintWidgetContainer) getParent()).isRtl();
        int i11 = this.f19168j0;
        ArrayList<a> arrayList = this.f19171m0;
        if (i11 != 0) {
            if (i11 == 1) {
                int size = arrayList.size();
                int i12 = 0;
                while (i12 < size) {
                    arrayList.get(i12).b(i12, z11, i12 == size + (-1));
                    i12++;
                }
            } else if (i11 != 2) {
                if (i11 == 3) {
                    int size2 = arrayList.size();
                    int i13 = 0;
                    while (i13 < size2) {
                        arrayList.get(i13).b(i13, z11, i13 == size2 + (-1));
                        i13++;
                    }
                }
            } else if (this.f19173p0 != null && this.f19172o0 != null && this.n0 != null) {
                for (int i14 = 0; i14 < this.f19175r0; i14++) {
                    this.f19174q0[i14].resetAnchors();
                }
                int[] iArr = this.f19173p0;
                int i15 = iArr[0];
                int i16 = iArr[1];
                float f10 = this.Z;
                ConstraintWidget constraintWidget2 = null;
                int i17 = 0;
                while (i17 < i15) {
                    if (z11) {
                        i10 = (i15 - i17) - 1;
                        f6 = 1.0f - this.Z;
                    } else {
                        f6 = f10;
                        i10 = i17;
                    }
                    ConstraintWidget constraintWidget3 = this.f19172o0[i10];
                    if (constraintWidget3 != null && constraintWidget3.getVisibility() != 8) {
                        if (i17 == 0) {
                            constraintWidget3.connect(constraintWidget3.mLeft, this.mLeft, getPaddingLeft());
                            constraintWidget3.setHorizontalChainStyle(this.T);
                            constraintWidget3.setHorizontalBiasPercent(f6);
                        }
                        if (i17 == i15 - 1) {
                            constraintWidget3.connect(constraintWidget3.mRight, this.mRight, getPaddingRight());
                        }
                        if (i17 > 0 && constraintWidget2 != null) {
                            constraintWidget3.connect(constraintWidget3.mLeft, constraintWidget2.mRight, this.f19165f0);
                            constraintWidget2.connect(constraintWidget2.mRight, constraintWidget3.mLeft, 0);
                        }
                        constraintWidget2 = constraintWidget3;
                    }
                    i17++;
                    f10 = f6;
                }
                for (int i18 = 0; i18 < i16; i18++) {
                    ConstraintWidget constraintWidget4 = this.n0[i18];
                    if (constraintWidget4 != null && constraintWidget4.getVisibility() != 8) {
                        if (i18 == 0) {
                            constraintWidget4.connect(constraintWidget4.mTop, this.mTop, getPaddingTop());
                            constraintWidget4.setVerticalChainStyle(this.U);
                            constraintWidget4.setVerticalBiasPercent(this.f19160a0);
                        }
                        if (i18 == i16 - 1) {
                            constraintWidget4.connect(constraintWidget4.mBottom, this.mBottom, getPaddingBottom());
                        }
                        if (i18 > 0 && constraintWidget2 != null) {
                            constraintWidget4.connect(constraintWidget4.mTop, constraintWidget2.mBottom, this.f19166g0);
                            constraintWidget2.connect(constraintWidget2.mBottom, constraintWidget4.mTop, 0);
                        }
                        constraintWidget2 = constraintWidget4;
                    }
                }
                for (int i19 = 0; i19 < i15; i19++) {
                    for (int i20 = 0; i20 < i16; i20++) {
                        int i21 = (i20 * i15) + i19;
                        if (this.f19170l0 == 1) {
                            i21 = (i19 * i16) + i20;
                        }
                        ConstraintWidget[] constraintWidgetArr = this.f19174q0;
                        if (i21 < constraintWidgetArr.length && (constraintWidget = constraintWidgetArr[i21]) != null && constraintWidget.getVisibility() != 8) {
                            ConstraintWidget constraintWidget5 = this.f19172o0[i19];
                            ConstraintWidget constraintWidget6 = this.n0[i20];
                            if (constraintWidget != constraintWidget5) {
                                constraintWidget.connect(constraintWidget.mLeft, constraintWidget5.mLeft, 0);
                                constraintWidget.connect(constraintWidget.mRight, constraintWidget5.mRight, 0);
                            }
                            if (constraintWidget != constraintWidget6) {
                                constraintWidget.connect(constraintWidget.mTop, constraintWidget6.mTop, 0);
                                constraintWidget.connect(constraintWidget.mBottom, constraintWidget6.mBottom, 0);
                            }
                        }
                    }
                }
            }
        } else if (arrayList.size() > 0) {
            arrayList.get(0).b(0, z11, true);
        }
        needsCallbackFromSolver(false);
    }

    @Override // androidx.constraintlayout.core.widgets.HelperWidget, androidx.constraintlayout.core.widgets.ConstraintWidget
    public void copy(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> map) {
        super.copy(constraintWidget, map);
        Flow flow = (Flow) constraintWidget;
        this.T = flow.T;
        this.U = flow.U;
        this.V = flow.V;
        this.W = flow.W;
        this.X = flow.X;
        this.Y = flow.Y;
        this.Z = flow.Z;
        this.f19160a0 = flow.f19160a0;
        this.f19161b0 = flow.f19161b0;
        this.f19162c0 = flow.f19162c0;
        this.f19163d0 = flow.f19163d0;
        this.f19164e0 = flow.f19164e0;
        this.f19165f0 = flow.f19165f0;
        this.f19166g0 = flow.f19166g0;
        this.f19167h0 = flow.f19167h0;
        this.i0 = flow.i0;
        this.f19168j0 = flow.f19168j0;
        this.f19169k0 = flow.f19169k0;
        this.f19170l0 = flow.f19170l0;
    }

    public float getMaxElementsWrap() {
        return this.f19169k0;
    }

    public final int k(ConstraintWidget constraintWidget, int i10) {
        if (constraintWidget == null) {
            return 0;
        }
        if (constraintWidget.getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            int i11 = constraintWidget.mMatchConstraintDefaultHeight;
            if (i11 == 0) {
                return 0;
            }
            if (i11 == 2) {
                int i12 = (int) (constraintWidget.mMatchConstraintPercentHeight * i10);
                if (i12 != constraintWidget.getHeight()) {
                    constraintWidget.setMeasureRequested(true);
                    measure(constraintWidget, constraintWidget.getHorizontalDimensionBehaviour(), constraintWidget.getWidth(), ConstraintWidget.DimensionBehaviour.FIXED, i12);
                }
                return i12;
            }
            if (i11 == 1) {
                return constraintWidget.getHeight();
            }
            if (i11 == 3) {
                return (int) ((constraintWidget.getWidth() * constraintWidget.mDimensionRatio) + 0.5f);
            }
        }
        return constraintWidget.getHeight();
    }

    public final int l(ConstraintWidget constraintWidget, int i10) {
        if (constraintWidget == null) {
            return 0;
        }
        if (constraintWidget.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            int i11 = constraintWidget.mMatchConstraintDefaultWidth;
            if (i11 == 0) {
                return 0;
            }
            if (i11 == 2) {
                int i12 = (int) (constraintWidget.mMatchConstraintPercentWidth * i10);
                if (i12 != constraintWidget.getWidth()) {
                    constraintWidget.setMeasureRequested(true);
                    measure(constraintWidget, ConstraintWidget.DimensionBehaviour.FIXED, i12, constraintWidget.getVerticalDimensionBehaviour(), constraintWidget.getHeight());
                }
                return i12;
            }
            if (i11 == 1) {
                return constraintWidget.getWidth();
            }
            if (i11 == 3) {
                return (int) ((constraintWidget.getHeight() * constraintWidget.mDimensionRatio) + 0.5f);
            }
        }
        return constraintWidget.getWidth();
    }

    /* JADX WARN: Code duplicated, block: B:377:0x0702  */
    /* JADX WARN: Code duplicated, block: B:378:0x0705 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:379:0x0707  */
    /* JADX WARN: Code duplicated, block: B:380:0x070e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:381:0x0710  */
    /* JADX WARN: Code duplicated, block: B:382:0x0712  */
    /* JADX WARN: Code duplicated, block: B:385:0x0720  */
    /* JADX WARN: Code duplicated, block: B:386:0x0722  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.constraintlayout.core.widgets.VirtualLayout
    public void measure(int i10, int i11, int i12, int i13) {
        int i14;
        int[] iArr;
        int i15;
        int i16;
        a aVar;
        int i17;
        char c10;
        int iMin;
        boolean z10;
        int i18;
        int i19;
        int i20;
        int i21;
        ConstraintWidget constraintWidget;
        int i22;
        int iCeil;
        int iCeil2;
        ConstraintWidget constraintWidget2;
        a aVar2;
        int i23;
        int i24;
        int i25;
        ArrayList<a> arrayList;
        int paddingRight;
        a aVar3;
        int i26;
        ConstraintWidget constraintWidget3;
        int i27;
        if (this.mWidgetsCount > 0 && !measureChildren()) {
            setMeasure(0, 0);
            needsCallbackFromSolver(false);
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingRight2 = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int[] iArr2 = new int[2];
        int i28 = (i11 - paddingLeft) - paddingRight2;
        int i29 = this.f19170l0;
        if (i29 == 1) {
            i28 = (i13 - paddingTop) - paddingBottom;
        }
        int i30 = i28;
        if (i29 == 0) {
            if (this.T == -1) {
                this.T = 0;
            }
            if (this.U == -1) {
                this.U = 0;
            }
        } else {
            if (this.T == -1) {
                this.T = 0;
            }
            if (this.U == -1) {
                this.U = 0;
            }
        }
        ConstraintWidget[] constraintWidgetArr = this.mWidgets;
        int i31 = 0;
        int i32 = 0;
        while (true) {
            i14 = this.mWidgetsCount;
            if (i31 >= i14) {
                break;
            }
            if (this.mWidgets[i31].getVisibility() == 8) {
                i32++;
            }
            i31++;
        }
        if (i32 > 0) {
            constraintWidgetArr = new ConstraintWidget[i14 - i32];
            i14 = 0;
            for (int i33 = 0; i33 < this.mWidgetsCount; i33++) {
                ConstraintWidget constraintWidget4 = this.mWidgets[i33];
                if (constraintWidget4.getVisibility() != 8) {
                    constraintWidgetArr[i14] = constraintWidget4;
                    i14++;
                }
            }
        }
        ConstraintWidget[] constraintWidgetArr2 = constraintWidgetArr;
        this.f19174q0 = constraintWidgetArr2;
        this.f19175r0 = i14;
        int i34 = this.f19168j0;
        ArrayList<a> arrayList2 = this.f19171m0;
        if (i34 != 0) {
            if (i34 == 1) {
                ArrayList<a> arrayList3 = arrayList2;
                int i35 = i14;
                iArr = iArr2;
                i15 = paddingLeft;
                i16 = paddingRight2;
                int i36 = this.f19170l0;
                if (i35 != 0) {
                    arrayList3.clear();
                    a aVar4 = new a(i36, this.mLeft, this.mTop, this.mRight, this.mBottom, i30);
                    arrayList3.add(aVar4);
                    if (i36 == 0) {
                        i19 = 0;
                        int i37 = 0;
                        int i38 = 0;
                        while (i38 < i35) {
                            ConstraintWidget constraintWidget5 = constraintWidgetArr2[i38];
                            int iL = l(constraintWidget5, i30);
                            if (constraintWidget5.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                                i19++;
                            }
                            int i39 = i19;
                            boolean z11 = (i37 == i30 || (this.f19165f0 + i37) + iL > i30) && aVar4.f19177b != null;
                            if ((z11 || i38 <= 0 || (i22 = this.f19169k0) <= 0 || i38 % i22 != 0) && !z11) {
                                i21 = i36;
                                constraintWidget = constraintWidget5;
                                if (i38 > 0) {
                                    i37 = this.f19165f0 + iL + i37;
                                }
                                aVar4.a(constraintWidget);
                                i38++;
                                i19 = i39;
                                i36 = i21;
                            } else {
                                int i40 = i36;
                                i21 = i36;
                                constraintWidget = constraintWidget5;
                                aVar4 = new a(i40, this.mLeft, this.mTop, this.mRight, this.mBottom, i30);
                                aVar4.f19188n = i38;
                                arrayList3.add(aVar4);
                            }
                            i37 = iL;
                            aVar4.a(constraintWidget);
                            i38++;
                            i19 = i39;
                            i36 = i21;
                        }
                        i18 = i36;
                    } else {
                        i18 = i36;
                        i19 = 0;
                        int i41 = 0;
                        int i42 = 0;
                        while (i42 < i35) {
                            ConstraintWidget constraintWidget6 = constraintWidgetArr2[i42];
                            int iK = k(constraintWidget6, i30);
                            if (constraintWidget6.getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                                i19++;
                            }
                            int i43 = i19;
                            boolean z12 = (i41 == i30 || (this.f19166g0 + i41) + iK > i30) && aVar4.f19177b != null;
                            if ((z12 || i42 <= 0 || (i20 = this.f19169k0) <= 0 || i42 % i20 != 0) && !z12) {
                                if (i42 > 0) {
                                    i41 = this.f19166g0 + iK + i41;
                                }
                                aVar4.a(constraintWidget6);
                                i42++;
                                i19 = i43;
                            } else {
                                aVar4 = new a(i18, this.mLeft, this.mTop, this.mRight, this.mBottom, i30);
                                aVar4.f19188n = i42;
                                arrayList3.add(aVar4);
                            }
                            i41 = iK;
                            aVar4.a(constraintWidget6);
                            i42++;
                            i19 = i43;
                        }
                    }
                    int size = arrayList3.size();
                    ConstraintAnchor constraintAnchor = this.mLeft;
                    ConstraintAnchor constraintAnchor2 = this.mTop;
                    ConstraintAnchor constraintAnchor3 = this.mRight;
                    ConstraintAnchor constraintAnchor4 = this.mBottom;
                    int paddingLeft2 = getPaddingLeft();
                    int paddingTop2 = getPaddingTop();
                    int paddingRight3 = getPaddingRight();
                    int paddingBottom2 = getPaddingBottom();
                    ConstraintWidget.DimensionBehaviour horizontalDimensionBehaviour = getHorizontalDimensionBehaviour();
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    boolean z13 = horizontalDimensionBehaviour == dimensionBehaviour || getVerticalDimensionBehaviour() == dimensionBehaviour;
                    if (i19 > 0 && z13) {
                        for (int i44 = 0; i44 < size; i44++) {
                            a aVar5 = arrayList3.get(i44);
                            if (i18 == 0) {
                                aVar5.e(i30 - aVar5.d());
                            } else {
                                aVar5.e(i30 - aVar5.c());
                            }
                        }
                    }
                    int i45 = 0;
                    int i46 = 0;
                    int i47 = 0;
                    while (i45 < size) {
                        a aVar6 = arrayList3.get(i45);
                        if (i18 == 0) {
                            if (i45 < size - 1) {
                                constraintAnchor4 = arrayList3.get(i45 + 1).f19177b.mTop;
                                paddingBottom2 = 0;
                            } else {
                                constraintAnchor4 = this.mBottom;
                                paddingBottom2 = getPaddingBottom();
                            }
                            ConstraintAnchor constraintAnchor5 = aVar6.f19177b.mBottom;
                            aVar6.f(i18, constraintAnchor, constraintAnchor2, constraintAnchor3, constraintAnchor4, paddingLeft2, paddingTop2, paddingRight3, paddingBottom2, i30);
                            int iMax = Math.max(i46, aVar6.d());
                            int iC = aVar6.c() + i47;
                            if (i45 > 0) {
                                iC += this.f19166g0;
                            }
                            i46 = iMax;
                            i47 = iC;
                            constraintAnchor2 = constraintAnchor5;
                            arrayList3 = arrayList3;
                            paddingTop2 = 0;
                            size = size;
                        } else {
                            ArrayList<a> arrayList4 = arrayList3;
                            if (i45 < size - 1) {
                                arrayList3 = arrayList4;
                                constraintAnchor3 = arrayList3.get(i45 + 1).f19177b.mLeft;
                                paddingRight3 = 0;
                            } else {
                                arrayList3 = arrayList4;
                                constraintAnchor3 = this.mRight;
                                paddingRight3 = getPaddingRight();
                            }
                            ConstraintAnchor constraintAnchor6 = aVar6.f19177b.mRight;
                            aVar6.f(i18, constraintAnchor, constraintAnchor2, constraintAnchor3, constraintAnchor4, paddingLeft2, paddingTop2, paddingRight3, paddingBottom2, i30);
                            int iD = aVar6.d() + i46;
                            int iMax2 = Math.max(i47, aVar6.c());
                            if (i45 > 0) {
                                iD += this.f19165f0;
                            }
                            i46 = iD;
                            i47 = iMax2;
                            paddingLeft2 = 0;
                            constraintAnchor = constraintAnchor6;
                        }
                        i45++;
                        size = size;
                    }
                    iArr[0] = i46;
                    iArr[1] = i47;
                }
            } else if (i34 == 2) {
                int i48 = i14;
                iArr = iArr2;
                i15 = paddingLeft;
                i16 = paddingRight2;
                int i49 = this.f19170l0;
                if (i49 == 0) {
                    int i50 = this.f19169k0;
                    if (i50 <= 0) {
                        int i51 = 0;
                        iCeil2 = 0;
                        for (int i52 = 0; i52 < i48; i52++) {
                            if (i52 > 0) {
                                i51 += this.f19165f0;
                            }
                            ConstraintWidget constraintWidget7 = constraintWidgetArr2[i52];
                            if (constraintWidget7 != null) {
                                int iL2 = l(constraintWidget7, i30) + i51;
                                if (iL2 > i30) {
                                    break;
                                }
                                iCeil2++;
                                i51 = iL2;
                            }
                        }
                    } else {
                        iCeil2 = i50;
                    }
                    iCeil = 0;
                } else {
                    iCeil = this.f19169k0;
                    if (iCeil <= 0) {
                        int i53 = 0;
                        int i54 = 0;
                        for (int i55 = 0; i55 < i48; i55++) {
                            if (i55 > 0) {
                                i53 += this.f19166g0;
                            }
                            ConstraintWidget constraintWidget8 = constraintWidgetArr2[i55];
                            if (constraintWidget8 != null) {
                                int iK2 = k(constraintWidget8, i30) + i53;
                                if (iK2 > i30) {
                                    break;
                                }
                                i54++;
                                i53 = iK2;
                            }
                        }
                        iCeil = i54;
                    }
                    iCeil2 = 0;
                }
                if (this.f19173p0 == null) {
                    this.f19173p0 = new int[2];
                }
                boolean z14 = (iCeil == 0 && i49 == 1) || (iCeil2 == 0 && i49 == 0);
                while (!z14) {
                    if (i49 == 0) {
                        iCeil = (int) Math.ceil(i48 / iCeil2);
                    } else {
                        iCeil2 = (int) Math.ceil(i48 / iCeil);
                    }
                    ConstraintWidget[] constraintWidgetArr3 = this.f19172o0;
                    if (constraintWidgetArr3 == null || constraintWidgetArr3.length < iCeil2) {
                        this.f19172o0 = new ConstraintWidget[iCeil2];
                    } else {
                        Arrays.fill(constraintWidgetArr3, (Object) null);
                    }
                    ConstraintWidget[] constraintWidgetArr4 = this.n0;
                    if (constraintWidgetArr4 == null || constraintWidgetArr4.length < iCeil) {
                        this.n0 = new ConstraintWidget[iCeil];
                    } else {
                        Arrays.fill(constraintWidgetArr4, (Object) null);
                    }
                    for (int i56 = 0; i56 < iCeil2; i56++) {
                        for (int i57 = 0; i57 < iCeil; i57++) {
                            int i58 = (i57 * iCeil2) + i56;
                            if (i49 == 1) {
                                i58 = (i56 * iCeil) + i57;
                            }
                            if (i58 < constraintWidgetArr2.length && (constraintWidget2 = constraintWidgetArr2[i58]) != null) {
                                int iL3 = l(constraintWidget2, i30);
                                ConstraintWidget constraintWidget9 = this.f19172o0[i56];
                                if (constraintWidget9 == null || constraintWidget9.getWidth() < iL3) {
                                    this.f19172o0[i56] = constraintWidget2;
                                }
                                int iK3 = k(constraintWidget2, i30);
                                ConstraintWidget constraintWidget10 = this.n0[i57];
                                if (constraintWidget10 == null || constraintWidget10.getHeight() < iK3) {
                                    this.n0[i57] = constraintWidget2;
                                }
                            }
                        }
                    }
                    int iL4 = 0;
                    for (int i59 = 0; i59 < iCeil2; i59++) {
                        ConstraintWidget constraintWidget11 = this.f19172o0[i59];
                        if (constraintWidget11 != null) {
                            if (i59 > 0) {
                                iL4 += this.f19165f0;
                            }
                            iL4 = l(constraintWidget11, i30) + iL4;
                        }
                    }
                    int iK4 = 0;
                    for (int i60 = 0; i60 < iCeil; i60++) {
                        ConstraintWidget constraintWidget12 = this.n0[i60];
                        if (constraintWidget12 != null) {
                            if (i60 > 0) {
                                iK4 += this.f19166g0;
                            }
                            iK4 = k(constraintWidget12, i30) + iK4;
                        }
                    }
                    iArr[0] = iL4;
                    iArr[1] = iK4;
                    if (i49 == 0) {
                        if (iL4 <= i30 || iCeil2 <= 1) {
                            z14 = true;
                        } else {
                            iCeil2--;
                        }
                    } else if (iK4 <= i30 || iCeil <= 1) {
                        z14 = true;
                    } else {
                        iCeil--;
                    }
                }
                int[] iArr3 = this.f19173p0;
                iArr3[0] = iCeil2;
                iArr3[1] = iCeil;
            } else if (i34 != 3) {
                c10 = 1;
                iArr = iArr2;
                i15 = paddingLeft;
                i16 = paddingRight2;
                i17 = 0;
            } else {
                int i61 = this.f19170l0;
                if (i14 == 0) {
                    iArr = iArr2;
                    i15 = paddingLeft;
                    i16 = paddingRight2;
                } else {
                    arrayList2.clear();
                    ArrayList<a> arrayList5 = arrayList2;
                    int i62 = i14;
                    int i63 = i30;
                    boolean z15 = true;
                    iArr = iArr2;
                    a aVar7 = new a(i61, this.mLeft, this.mTop, this.mRight, this.mBottom, i63);
                    arrayList5.add(aVar7);
                    if (i61 == 0) {
                        int i64 = 0;
                        i23 = 0;
                        int i65 = 0;
                        int i66 = 0;
                        while (i66 < i62) {
                            int i67 = i64 + 1;
                            ConstraintWidget constraintWidget13 = constraintWidgetArr2[i66];
                            int i68 = i63;
                            int iL5 = l(constraintWidget13, i68);
                            if (constraintWidget13.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                                aVar3 = aVar7;
                                i23++;
                            }
                            aVar3 = aVar7;
                            int i69 = i23;
                            boolean z16 = ((i65 == i68 || (this.f19165f0 + i65) + iL5 > i68) && aVar3.f19177b != null) ? z15 : false;
                            if ((z16 || i66 <= 0 || (i27 = this.f19169k0) <= 0 || i67 <= i27) && !z16) {
                                i63 = i68;
                                i26 = paddingRight2;
                                constraintWidget3 = constraintWidget13;
                                if (i66 > 0) {
                                    i65 = this.f19165f0 + iL5 + i65;
                                    i64 = i67;
                                } else {
                                    i64 = i67;
                                    i65 = iL5;
                                }
                            } else {
                                i63 = i68;
                                i26 = paddingRight2;
                                constraintWidget3 = constraintWidget13;
                                a aVar8 = new a(i61, this.mLeft, this.mTop, this.mRight, this.mBottom, i63);
                                aVar8.f19188n = i66;
                                arrayList5.add(aVar8);
                                aVar3 = aVar8;
                                i65 = iL5;
                                i64 = 1;
                            }
                            aVar3.a(constraintWidget3);
                            i66++;
                            i23 = i69;
                            paddingRight2 = i26;
                            z15 = true;
                        }
                        aVar3 = aVar7;
                        i16 = paddingRight2;
                    } else {
                        i16 = paddingRight2;
                        int i70 = 0;
                        i23 = 0;
                        int i71 = 0;
                        int i72 = 0;
                        while (i72 < i62) {
                            int i73 = i70 + 1;
                            ConstraintWidget constraintWidget14 = constraintWidgetArr2[i72];
                            int i74 = i63;
                            int iK5 = k(constraintWidget14, i74);
                            if (constraintWidget14.getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                                aVar2 = aVar7;
                                i23++;
                            }
                            aVar2 = aVar7;
                            int i75 = i23;
                            boolean z17 = (i71 == i74 || (this.f19166g0 + i71) + iK5 > i74) && aVar2.f19177b != null;
                            if ((z17 || i72 <= 0 || (i25 = this.f19169k0) <= 0 || i73 <= i25) && !z17) {
                                i24 = paddingLeft;
                                if (i72 > 0) {
                                    i71 = this.f19166g0 + iK5 + i71;
                                    i70 = i73;
                                } else {
                                    i70 = i73;
                                    i71 = iK5;
                                }
                            } else {
                                i24 = paddingLeft;
                                a aVar9 = new a(i61, this.mLeft, this.mTop, this.mRight, this.mBottom, i74);
                                aVar9.f19188n = i72;
                                arrayList5.add(aVar9);
                                aVar2 = aVar9;
                                i71 = iK5;
                                i70 = 1;
                            }
                            aVar2.a(constraintWidget14);
                            i72++;
                            i23 = i75;
                            paddingLeft = i24;
                            i63 = i74;
                        }
                        aVar2 = aVar7;
                    }
                    int i76 = i63;
                    i15 = paddingLeft;
                    int size2 = arrayList5.size();
                    ConstraintAnchor constraintAnchor7 = this.mLeft;
                    ConstraintAnchor constraintAnchor8 = this.mTop;
                    ConstraintAnchor constraintAnchor9 = this.mRight;
                    ConstraintAnchor constraintAnchor10 = this.mBottom;
                    int paddingLeft3 = getPaddingLeft();
                    int paddingTop3 = getPaddingTop();
                    int paddingRight4 = getPaddingRight();
                    int paddingBottom3 = getPaddingBottom();
                    ConstraintWidget.DimensionBehaviour horizontalDimensionBehaviour2 = getHorizontalDimensionBehaviour();
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    boolean z18 = horizontalDimensionBehaviour2 == dimensionBehaviour2 || getVerticalDimensionBehaviour() == dimensionBehaviour2;
                    if (i23 > 0 && z18) {
                        for (int i77 = 0; i77 < size2; i77++) {
                            a aVar10 = arrayList5.get(i77);
                            if (i61 == 0) {
                                aVar10.e(i76 - aVar10.d());
                            } else {
                                aVar10.e(i76 - aVar10.c());
                            }
                        }
                    }
                    int i78 = 0;
                    int i79 = 0;
                    int i80 = 0;
                    while (i78 < size2) {
                        a aVar11 = arrayList5.get(i78);
                        if (i61 == 0) {
                            if (i78 < size2 - 1) {
                                constraintAnchor10 = arrayList5.get(i78 + 1).f19177b.mTop;
                                paddingBottom3 = 0;
                            } else {
                                constraintAnchor10 = this.mBottom;
                                paddingBottom3 = getPaddingBottom();
                            }
                            ConstraintAnchor constraintAnchor11 = aVar11.f19177b.mBottom;
                            aVar11.f(i61, constraintAnchor7, constraintAnchor8, constraintAnchor9, constraintAnchor10, paddingLeft3, paddingTop3, paddingRight4, paddingBottom3, i76);
                            int iMax3 = Math.max(i79, aVar11.d());
                            int iC2 = aVar11.c() + i80;
                            if (i78 > 0) {
                                iC2 += this.f19166g0;
                            }
                            i79 = iMax3;
                            i80 = iC2;
                            constraintAnchor8 = constraintAnchor11;
                            paddingTop3 = 0;
                            paddingRight = paddingRight4;
                            arrayList = arrayList5;
                            size2 = size2;
                        } else {
                            ArrayList<a> arrayList6 = arrayList5;
                            if (i78 < size2 - 1) {
                                arrayList = arrayList6;
                                constraintAnchor9 = arrayList.get(i78 + 1).f19177b.mLeft;
                                paddingRight = 0;
                            } else {
                                arrayList = arrayList6;
                                constraintAnchor9 = this.mRight;
                                paddingRight = getPaddingRight();
                            }
                            ConstraintAnchor constraintAnchor12 = aVar11.f19177b.mRight;
                            aVar11.f(i61, constraintAnchor7, constraintAnchor8, constraintAnchor9, constraintAnchor10, paddingLeft3, paddingTop3, paddingRight, paddingBottom3, i76);
                            int iD2 = aVar11.d() + i79;
                            int iMax4 = Math.max(i80, aVar11.c());
                            if (i78 > 0) {
                                iD2 += this.f19165f0;
                            }
                            i79 = iD2;
                            i80 = iMax4;
                            paddingLeft3 = 0;
                            constraintAnchor7 = constraintAnchor12;
                        }
                        i78++;
                        size2 = size2;
                        int i81 = paddingRight;
                        arrayList5 = arrayList;
                        paddingRight4 = i81;
                    }
                    iArr[0] = i79;
                    iArr[1] = i80;
                }
            }
            i17 = 0;
            c10 = 1;
        } else {
            int i82 = i14;
            iArr = iArr2;
            i15 = paddingLeft;
            i16 = paddingRight2;
            int i83 = this.f19170l0;
            if (i82 == 0) {
                i17 = 0;
                c10 = 1;
            } else {
                if (arrayList2.size() == 0) {
                    aVar = new a(i83, this.mLeft, this.mTop, this.mRight, this.mBottom, i30);
                    arrayList2.add(aVar);
                } else {
                    aVar = arrayList2.get(0);
                    aVar.f19178c = 0;
                    aVar.f19177b = null;
                    aVar.f19187l = 0;
                    aVar.m = 0;
                    aVar.f19188n = 0;
                    aVar.f19189o = 0;
                    aVar.f19190p = 0;
                    aVar.f(i83, this.mLeft, this.mTop, this.mRight, this.mBottom, getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom(), i30);
                }
                for (int i84 = 0; i84 < i82; i84++) {
                    aVar.a(constraintWidgetArr2[i84]);
                }
                i17 = 0;
                iArr[0] = aVar.d();
                c10 = 1;
                iArr[1] = aVar.c();
            }
        }
        int iMin2 = iArr[i17] + i15 + i16;
        int i85 = iArr[c10] + paddingTop + paddingBottom;
        char c11 = c10;
        if (i10 == 1073741824) {
            iMin2 = i11;
        } else {
            if (i10 != Integer.MIN_VALUE) {
                if (i10 != 0) {
                    iMin2 = i17;
                }
                if (i12 == 1073741824) {
                    iMin = i13;
                } else if (i12 == -2147483648) {
                    iMin = Math.min(i85, i13);
                } else if (i12 == 0) {
                    iMin = i85;
                } else {
                    iMin = i17;
                }
                setMeasure(iMin2, iMin);
                setWidth(iMin2);
                setHeight(iMin);
                if (this.mWidgetsCount > 0) {
                    z10 = c11;
                } else {
                    z10 = i17;
                }
                needsCallbackFromSolver(z10);
            }
            iMin2 = Math.min(iMin2, i11);
        }
        if (i12 == 1073741824) {
            iMin = i13;
        } else if (i12 == -2147483648) {
            iMin = Math.min(i85, i13);
        } else if (i12 == 0) {
            iMin = i85;
        } else {
            iMin = i17;
        }
        setMeasure(iMin2, iMin);
        setWidth(iMin2);
        setHeight(iMin);
        if (this.mWidgetsCount > 0) {
            z10 = c11;
        } else {
            z10 = i17;
        }
        needsCallbackFromSolver(z10);
    }

    public void setFirstHorizontalBias(float f6) {
        this.f19161b0 = f6;
    }

    public void setFirstHorizontalStyle(int i10) {
        this.V = i10;
    }

    public void setFirstVerticalBias(float f6) {
        this.f19162c0 = f6;
    }

    public void setFirstVerticalStyle(int i10) {
        this.W = i10;
    }

    public void setHorizontalAlign(int i10) {
        this.f19167h0 = i10;
    }

    public void setHorizontalBias(float f6) {
        this.Z = f6;
    }

    public void setHorizontalGap(int i10) {
        this.f19165f0 = i10;
    }

    public void setHorizontalStyle(int i10) {
        this.T = i10;
    }

    public void setLastHorizontalBias(float f6) {
        this.f19163d0 = f6;
    }

    public void setLastHorizontalStyle(int i10) {
        this.X = i10;
    }

    public void setLastVerticalBias(float f6) {
        this.f19164e0 = f6;
    }

    public void setLastVerticalStyle(int i10) {
        this.Y = i10;
    }

    public void setMaxElementsWrap(int i10) {
        this.f19169k0 = i10;
    }

    public void setOrientation(int i10) {
        this.f19170l0 = i10;
    }

    public void setVerticalAlign(int i10) {
        this.i0 = i10;
    }

    public void setVerticalBias(float f6) {
        this.f19160a0 = f6;
    }

    public void setVerticalGap(int i10) {
        this.f19166g0 = i10;
    }

    public void setVerticalStyle(int i10) {
        this.U = i10;
    }

    public void setWrapMode(int i10) {
        this.f19168j0 = i10;
    }
}
