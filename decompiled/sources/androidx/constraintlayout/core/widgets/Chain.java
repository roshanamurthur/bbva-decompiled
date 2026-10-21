package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.ArrayRow;
import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.SolverVariable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class Chain {
    public static final boolean USE_CHAIN_OPTIMIZATION = false;

    /* JADX WARN: Code duplicated, block: B:113:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:115:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:117:0x01be  */
    /* JADX WARN: Code duplicated, block: B:119:0x01df  */
    /* JADX WARN: Code duplicated, block: B:216:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:231:0x03f5  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r42v0, types: [androidx.constraintlayout.core.LinearSystem] */
    /* JADX WARN: Type inference failed for: r6v33, types: [androidx.constraintlayout.core.SolverVariable] */
    /* JADX WARN: Type inference failed for: r8v44, types: [androidx.constraintlayout.core.widgets.ConstraintWidget] */
    /* JADX WARN: Type inference failed for: r9v29 */
    /* JADX WARN: Type inference failed for: r9v30 */
    /* JADX WARN: Type inference failed for: r9v36 */
    /* JADX WARN: Type inference failed for: r9v5, types: [androidx.constraintlayout.core.widgets.ConstraintWidget] */
    public static void applyChainConstraints(ConstraintWidgetContainer constraintWidgetContainer, LinearSystem linearSystem, ArrayList<ConstraintWidget> arrayList, int i10) {
        int i11;
        ChainHead[] chainHeadArr;
        int i12;
        boolean z10;
        boolean z11;
        boolean z12;
        Object obj;
        int i13;
        ConstraintWidget constraintWidget;
        ConstraintWidget constraintWidget2;
        int i14;
        ConstraintWidget constraintWidget3;
        SolverVariable solverVariable;
        ConstraintAnchor constraintAnchor;
        SolverVariable solverVariable2;
        ConstraintAnchor constraintAnchor2;
        SolverVariable solverVariable3;
        ConstraintWidget constraintWidget4;
        ConstraintWidget constraintWidget5;
        ConstraintWidget constraintWidget6;
        int size;
        ConstraintAnchor constraintAnchor3;
        ConstraintWidget constraintWidget7;
        int i15;
        int i16;
        boolean z13;
        ConstraintWidgetContainer constraintWidgetContainer2 = constraintWidgetContainer;
        int i17 = i10;
        if (i17 == 0) {
            i11 = constraintWidgetContainer2.mHorizontalChainsSize;
            chainHeadArr = constraintWidgetContainer2.P;
            i12 = 0;
        } else {
            i11 = constraintWidgetContainer2.mVerticalChainsSize;
            chainHeadArr = constraintWidgetContainer2.O;
            i12 = 2;
        }
        int i18 = 0;
        while (i18 < i11) {
            ChainHead chainHead = chainHeadArr[i18];
            chainHead.define();
            if (arrayList == 0 || arrayList.contains(chainHead.mFirst)) {
                ConstraintWidget constraintWidget8 = chainHead.mFirst;
                ConstraintWidget constraintWidget9 = chainHead.mLast;
                ConstraintWidget constraintWidget10 = chainHead.mFirstVisibleWidget;
                ConstraintWidget constraintWidget11 = chainHead.mLastVisibleWidget;
                ConstraintWidget constraintWidget12 = chainHead.mHead;
                float f6 = chainHead.mTotalWeight;
                boolean z14 = constraintWidgetContainer2.mListDimensionBehaviors[i17] == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                if (i17 == 0) {
                    int i19 = constraintWidget12.F;
                    boolean z15 = i19 == 0;
                    if (i19 == 1) {
                        z13 = true;
                        i16 = 2;
                    } else {
                        i16 = 2;
                        z13 = false;
                    }
                    z11 = i19 == i16;
                    z12 = z15;
                    z10 = z13;
                } else {
                    int i20 = constraintWidget12.G;
                    boolean z16 = i20 == 0;
                    z10 = i20 == 1;
                    z11 = i20 == 2;
                    z12 = z16;
                }
                boolean z17 = false;
                ConstraintWidget constraintWidget13 = constraintWidget8;
                ?? r10 = constraintWidget8;
                while (true) {
                    obj = null;
                    if (z17) {
                        break;
                    }
                    ConstraintAnchor constraintAnchor4 = r10.mListAnchors[i12];
                    int i21 = z11 ? 1 : 4;
                    int margin = constraintAnchor4.getMargin();
                    float f10 = f6;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour = r10.mListDimensionBehaviors[i17];
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                    boolean z18 = dimensionBehaviour == dimensionBehaviour2 && r10.mResolvedMatchConstraintDefault[i17] == 0;
                    ConstraintAnchor constraintAnchor5 = constraintAnchor4.mTarget;
                    if (constraintAnchor5 != null && r10 != constraintWidget13) {
                        margin = constraintAnchor5.getMargin() + margin;
                    }
                    int i22 = margin;
                    if (z11 && r10 != constraintWidget13 && r10 != constraintWidget10) {
                        i21 = 8;
                    }
                    ConstraintAnchor constraintAnchor6 = constraintAnchor4.mTarget;
                    if (constraintAnchor6 != null) {
                        if (r10 == constraintWidget10) {
                            linearSystem.addGreaterThan(constraintAnchor4.f19133e, constraintAnchor6.f19133e, i22, 6);
                        } else {
                            linearSystem.addGreaterThan(constraintAnchor4.f19133e, constraintAnchor6.f19133e, i22, 8);
                        }
                        if (z18 && !z11) {
                            i21 = 5;
                        }
                        linearSystem.addEquality(constraintAnchor4.f19133e, constraintAnchor4.mTarget.f19133e, i22, (r10 == constraintWidget10 && z11 && r10.isInBarrier(i17)) ? 5 : i21);
                        constraintWidget7 = constraintWidget13;
                    } else {
                        chainHead = chainHead;
                        constraintWidget7 = constraintWidget13;
                    }
                    if (z14) {
                        if (r10.getVisibility() == 8 || r10.mListDimensionBehaviors[i17] != dimensionBehaviour2) {
                            i15 = 0;
                        } else {
                            ConstraintAnchor[] constraintAnchorArr = r10.mListAnchors;
                            i15 = 0;
                            linearSystem.addGreaterThan(constraintAnchorArr[i12 + 1].f19133e, constraintAnchorArr[i12].f19133e, 0, 5);
                        }
                        linearSystem.addGreaterThan(r10.mListAnchors[i12].f19133e, constraintWidgetContainer2.mListAnchors[i12].f19133e, i15, 8);
                    }
                    ConstraintAnchor constraintAnchor7 = r10.mListAnchors[i12 + 1].mTarget;
                    if (constraintAnchor7 != null) {
                        ConstraintWidget constraintWidget14 = constraintAnchor7.mOwner;
                        ConstraintAnchor constraintAnchor8 = constraintWidget14.mListAnchors[i12].mTarget;
                        if (constraintAnchor8 != null && constraintAnchor8.mOwner == r10) {
                            obj = constraintWidget14;
                        }
                    }
                    if (obj != null) {
                        r10 = obj;
                    } else {
                        z17 = true;
                    }
                    constraintWidget12 = constraintWidget12;
                    f6 = f10;
                    i11 = i11;
                    constraintWidget13 = constraintWidget7;
                    chainHead = chainHead;
                    r10 = r10;
                }
                ChainHead chainHead2 = chainHead;
                ConstraintWidget constraintWidget15 = constraintWidget12;
                float f11 = f6;
                ConstraintWidget constraintWidget16 = constraintWidget13;
                i13 = i11;
                if (constraintWidget11 != null) {
                    int i23 = i12 + 1;
                    if (constraintWidget9.mListAnchors[i23].mTarget != null) {
                        ConstraintAnchor constraintAnchor9 = constraintWidget11.mListAnchors[i23];
                        if (constraintWidget11.mListDimensionBehaviors[i17] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget11.mResolvedMatchConstraintDefault[i17] == 0 && !z11) {
                            ConstraintAnchor constraintAnchor10 = constraintAnchor9.mTarget;
                            if (constraintAnchor10.mOwner == constraintWidgetContainer2) {
                                linearSystem.addEquality(constraintAnchor9.f19133e, constraintAnchor10.f19133e, -constraintAnchor9.getMargin(), 5);
                            } else if (z11) {
                                constraintAnchor3 = constraintAnchor9.mTarget;
                                if (constraintAnchor3.mOwner == constraintWidgetContainer2) {
                                    linearSystem.addEquality(constraintAnchor9.f19133e, constraintAnchor3.f19133e, -constraintAnchor9.getMargin(), 4);
                                }
                            }
                        } else if (z11) {
                            constraintAnchor3 = constraintAnchor9.mTarget;
                            if (constraintAnchor3.mOwner == constraintWidgetContainer2) {
                                linearSystem.addEquality(constraintAnchor9.f19133e, constraintAnchor3.f19133e, -constraintAnchor9.getMargin(), 4);
                            }
                        }
                        linearSystem.addLowerThan(constraintAnchor9.f19133e, constraintWidget9.mListAnchors[i23].mTarget.f19133e, -constraintAnchor9.getMargin(), 6);
                    }
                }
                if (z14) {
                    int i24 = i12 + 1;
                    SolverVariable solverVariable4 = constraintWidgetContainer2.mListAnchors[i24].f19133e;
                    ConstraintAnchor constraintAnchor11 = constraintWidget9.mListAnchors[i24];
                    linearSystem.addGreaterThan(solverVariable4, constraintAnchor11.f19133e, constraintAnchor11.getMargin(), 8);
                }
                ArrayList<ConstraintWidget> arrayList2 = chainHead2.mWeightedMatchConstraintsWidgets;
                if (arrayList2 != null && (size = arrayList2.size()) > 1) {
                    if (chainHead2.mHasUndefinedWeights && !chainHead2.mHasComplexMatchWeights) {
                        f11 = chainHead2.mWidgetsMatchCount;
                    }
                    float f12 = 0.0f;
                    float f13 = 0.0f;
                    ConstraintWidget constraintWidget17 = null;
                    int i25 = 0;
                    while (i25 < size) {
                        ConstraintWidget constraintWidget18 = arrayList2.get(i25);
                        float f14 = constraintWidget18.mWeight[i17];
                        if (f14 < f12) {
                            if (chainHead2.mHasComplexMatchWeights) {
                                ConstraintAnchor[] constraintAnchorArr2 = constraintWidget18.mListAnchors;
                                linearSystem.addEquality(constraintAnchorArr2[i12 + 1].f19133e, constraintAnchorArr2[i12].f19133e, 0, 4);
                            } else {
                                f14 = 1.0f;
                            }
                            arrayList2 = arrayList2;
                            i25++;
                            arrayList2 = arrayList2;
                            f12 = 0.0f;
                        }
                        if (f14 == 0.0f) {
                            ConstraintAnchor[] constraintAnchorArr3 = constraintWidget18.mListAnchors;
                            linearSystem.addEquality(constraintAnchorArr3[i12 + 1].f19133e, constraintAnchorArr3[i12].f19133e, 0, 8);
                            arrayList2 = arrayList2;
                        } else {
                            if (constraintWidget17 != null) {
                                ConstraintAnchor[] constraintAnchorArr4 = constraintWidget17.mListAnchors;
                                SolverVariable solverVariable5 = constraintAnchorArr4[i12].f19133e;
                                int i26 = i12 + 1;
                                SolverVariable solverVariable6 = constraintAnchorArr4[i26].f19133e;
                                ConstraintAnchor[] constraintAnchorArr5 = constraintWidget18.mListAnchors;
                                SolverVariable solverVariable7 = constraintAnchorArr5[i12].f19133e;
                                SolverVariable solverVariable8 = constraintAnchorArr5[i26].f19133e;
                                ArrayRow arrayRowCreateRow = linearSystem.createRow();
                                arrayRowCreateRow.createRowEqualMatchDimensions(f13, f11, f14, solverVariable5, solverVariable6, solverVariable7, solverVariable8);
                                linearSystem.addConstraint(arrayRowCreateRow);
                            }
                            f13 = f14;
                            constraintWidget17 = constraintWidget18;
                        }
                        i25++;
                        arrayList2 = arrayList2;
                        f12 = 0.0f;
                    }
                }
                if (constraintWidget10 == null || !(constraintWidget10 == constraintWidget11 || z11)) {
                    constraintWidget11 = constraintWidget11;
                    constraintWidget = constraintWidget10;
                    constraintWidget2 = constraintWidget9;
                    i18 = i18;
                    ConstraintWidget constraintWidget19 = constraintWidget16;
                    if (z12 && constraintWidget != null) {
                        int i27 = chainHead2.mWidgetsMatchCount;
                        boolean z19 = i27 > 0 && chainHead2.mWidgetsCount == i27;
                        ConstraintWidget constraintWidget20 = constraintWidget;
                        ConstraintWidget constraintWidget21 = constraintWidget20;
                        ConstraintWidget constraintWidget22 = constraintWidget19;
                        while (constraintWidget21 != null) {
                            ConstraintWidget constraintWidget23 = constraintWidget21.mNextChainWidget[i17];
                            while (constraintWidget23 != null && constraintWidget23.getVisibility() == 8) {
                                constraintWidget23 = constraintWidget23.mNextChainWidget[i17];
                            }
                            if (constraintWidget23 != null || constraintWidget21 == constraintWidget11) {
                                ConstraintAnchor constraintAnchor12 = constraintWidget21.mListAnchors[i12];
                                SolverVariable solverVariable9 = constraintAnchor12.f19133e;
                                ConstraintAnchor constraintAnchor13 = constraintAnchor12.mTarget;
                                SolverVariable solverVariable10 = constraintAnchor13 != null ? constraintAnchor13.f19133e : null;
                                if (constraintWidget20 != constraintWidget21) {
                                    solverVariable10 = constraintWidget20.mListAnchors[i12 + 1].f19133e;
                                } else if (constraintWidget21 == constraintWidget) {
                                    ConstraintAnchor constraintAnchor14 = constraintWidget22.mListAnchors[i12].mTarget;
                                    solverVariable10 = constraintAnchor14 != null ? constraintAnchor14.f19133e : null;
                                }
                                int margin2 = constraintAnchor12.getMargin();
                                int i28 = i12 + 1;
                                int margin3 = constraintWidget21.mListAnchors[i28].getMargin();
                                if (constraintWidget23 != null) {
                                    constraintAnchor2 = constraintWidget23.mListAnchors[i12];
                                    constraintWidget6 = constraintWidget22;
                                    solverVariable3 = constraintAnchor2.f19133e;
                                } else {
                                    ConstraintWidget constraintWidget24 = constraintWidget22;
                                    constraintAnchor2 = constraintWidget2.mListAnchors[i28].mTarget;
                                    if (constraintAnchor2 != null) {
                                        solverVariable3 = constraintAnchor2.f19133e;
                                        constraintWidget6 = constraintWidget24;
                                    } else {
                                        solverVariable3 = null;
                                        constraintWidget4 = constraintWidget24;
                                    }
                                    SolverVariable solverVariable11 = constraintWidget21.mListAnchors[i28].f19133e;
                                    if (constraintAnchor2 != null) {
                                        margin3 += constraintAnchor2.getMargin();
                                    }
                                    int margin4 = constraintWidget20.mListAnchors[i28].getMargin() + margin2;
                                    if (solverVariable9 != null || solverVariable10 == null || solverVariable3 == null || solverVariable11 == null) {
                                        constraintWidget5 = constraintWidget4;
                                    } else {
                                        if (constraintWidget21 == constraintWidget) {
                                            margin4 = constraintWidget.mListAnchors[i12].getMargin();
                                        }
                                        constraintWidget5 = constraintWidget4;
                                        linearSystem.addCentering(solverVariable9, solverVariable10, margin4, 0.5f, solverVariable3, solverVariable11, constraintWidget21 == constraintWidget11 ? constraintWidget11.mListAnchors[i28].getMargin() : margin3, z19 ? 8 : 5);
                                    }
                                }
                                constraintWidget4 = constraintWidget6;
                                SolverVariable solverVariable12 = constraintWidget21.mListAnchors[i28].f19133e;
                                if (constraintAnchor2 != null) {
                                    margin3 += constraintAnchor2.getMargin();
                                }
                                int margin5 = constraintWidget20.mListAnchors[i28].getMargin() + margin2;
                                if (solverVariable9 != null) {
                                    constraintWidget5 = constraintWidget4;
                                } else {
                                    constraintWidget5 = constraintWidget4;
                                }
                            } else {
                                constraintWidget5 = constraintWidget22;
                            }
                            constraintWidget20 = constraintWidget21.getVisibility() != 8 ? constraintWidget21 : constraintWidget20;
                            constraintWidget21 = constraintWidget23;
                            constraintWidget22 = constraintWidget5;
                        }
                    } else if (z10 && constraintWidget != null) {
                        int i29 = chainHead2.mWidgetsMatchCount;
                        boolean z20 = i29 > 0 && chainHead2.mWidgetsCount == i29;
                        ConstraintWidget constraintWidget25 = constraintWidget;
                        ConstraintWidget constraintWidget26 = constraintWidget25;
                        while (constraintWidget25 != null) {
                            ConstraintWidget constraintWidget27 = constraintWidget25.mNextChainWidget[i17];
                            while (constraintWidget27 != null && constraintWidget27.getVisibility() == 8) {
                                constraintWidget27 = constraintWidget27.mNextChainWidget[i17];
                            }
                            if (constraintWidget25 == constraintWidget || constraintWidget25 == constraintWidget11 || constraintWidget27 == null) {
                                constraintWidget26 = constraintWidget26;
                                constraintWidget3 = constraintWidget27;
                            } else {
                                ConstraintWidget constraintWidget28 = constraintWidget27 == constraintWidget11 ? null : constraintWidget27;
                                ConstraintAnchor constraintAnchor15 = constraintWidget25.mListAnchors[i12];
                                SolverVariable solverVariable13 = constraintAnchor15.f19133e;
                                int i30 = i12 + 1;
                                SolverVariable solverVariable14 = constraintWidget26.mListAnchors[i30].f19133e;
                                int margin6 = constraintAnchor15.getMargin();
                                int margin7 = constraintWidget25.mListAnchors[i30].getMargin();
                                if (constraintWidget28 != null) {
                                    constraintAnchor = constraintWidget28.mListAnchors[i12];
                                    solverVariable2 = constraintAnchor.f19133e;
                                    ConstraintAnchor constraintAnchor16 = constraintAnchor.mTarget;
                                    solverVariable = constraintAnchor16 != null ? constraintAnchor16.f19133e : null;
                                } else {
                                    ConstraintAnchor constraintAnchor17 = constraintWidget11.mListAnchors[i12];
                                    SolverVariable solverVariable15 = constraintAnchor17 != null ? constraintAnchor17.f19133e : null;
                                    solverVariable = constraintWidget25.mListAnchors[i30].f19133e;
                                    constraintAnchor = constraintAnchor17;
                                    solverVariable2 = solverVariable15;
                                }
                                int margin8 = constraintAnchor != null ? constraintAnchor.getMargin() + margin7 : margin7;
                                int margin9 = constraintWidget26.mListAnchors[i30].getMargin() + margin6;
                                int i31 = z20 ? 8 : 4;
                                if (solverVariable13 != null && solverVariable14 != null && solverVariable2 != null && solverVariable != null) {
                                    linearSystem.addCentering(solverVariable13, solverVariable14, margin9, 0.5f, solverVariable2, solverVariable, margin8, i31);
                                }
                                constraintWidget3 = constraintWidget28;
                            }
                            constraintWidget26 = constraintWidget25.getVisibility() != 8 ? constraintWidget25 : constraintWidget26;
                            constraintWidget25 = constraintWidget3;
                        }
                        ConstraintAnchor constraintAnchor18 = constraintWidget.mListAnchors[i12];
                        ConstraintAnchor constraintAnchor19 = constraintWidget19.mListAnchors[i12].mTarget;
                        int i32 = i12 + 1;
                        ConstraintAnchor constraintAnchor20 = constraintWidget11.mListAnchors[i32];
                        ConstraintAnchor constraintAnchor21 = constraintWidget2.mListAnchors[i32].mTarget;
                        if (constraintAnchor19 == null) {
                            i14 = 5;
                        } else {
                            if (constraintWidget != constraintWidget11) {
                                linearSystem.addEquality(constraintAnchor18.f19133e, constraintAnchor19.f19133e, constraintAnchor18.getMargin(), 5);
                            } else if (constraintAnchor21 != null) {
                                i14 = 5;
                                linearSystem.addCentering(constraintAnchor18.f19133e, constraintAnchor19.f19133e, constraintAnchor18.getMargin(), 0.5f, constraintAnchor20.f19133e, constraintAnchor21.f19133e, constraintAnchor20.getMargin(), 5);
                            }
                            i14 = 5;
                        }
                        if (constraintAnchor21 != 0 && constraintWidget != constraintWidget11) {
                            linearSystem.addEquality(constraintAnchor20.f19133e, constraintAnchor21.f19133e, -constraintAnchor20.getMargin(), i14);
                        }
                    }
                } else {
                    ConstraintAnchor constraintAnchor22 = constraintWidget16.mListAnchors[i12];
                    int i33 = i12 + 1;
                    ConstraintAnchor constraintAnchor23 = constraintWidget9.mListAnchors[i33];
                    ConstraintAnchor constraintAnchor24 = constraintAnchor22.mTarget;
                    SolverVariable solverVariable16 = constraintAnchor24 != null ? constraintAnchor24.f19133e : null;
                    ConstraintAnchor constraintAnchor25 = constraintAnchor23.mTarget;
                    SolverVariable solverVariable17 = constraintAnchor25 != null ? constraintAnchor25.f19133e : null;
                    ConstraintAnchor constraintAnchor26 = constraintWidget10.mListAnchors[i12];
                    if (constraintWidget11 != null) {
                        constraintAnchor23 = constraintWidget11.mListAnchors[i33];
                    }
                    if (solverVariable16 == null || solverVariable17 == null) {
                        constraintWidget = constraintWidget10;
                    } else {
                        constraintWidget = constraintWidget10;
                        linearSystem.addCentering(constraintAnchor26.f19133e, solverVariable16, constraintAnchor26.getMargin(), i17 == 0 ? constraintWidget15.f19156x : constraintWidget15.f19157y, solverVariable17, constraintAnchor23.f19133e, constraintAnchor23.getMargin(), 7);
                    }
                    constraintWidget2 = constraintWidget9;
                }
                if ((z12 || z10) && constraintWidget != null && constraintWidget != constraintWidget11) {
                    ConstraintAnchor[] constraintAnchorArr6 = constraintWidget.mListAnchors;
                    ConstraintAnchor constraintAnchor27 = constraintAnchorArr6[i12];
                    ConstraintWidget constraintWidget29 = constraintWidget11 == null ? constraintWidget : constraintWidget11;
                    int i34 = i12 + 1;
                    ConstraintAnchor constraintAnchor28 = constraintWidget29.mListAnchors[i34];
                    ConstraintAnchor constraintAnchor29 = constraintAnchor27.mTarget;
                    SolverVariable solverVariable18 = constraintAnchor29 != null ? constraintAnchor29.f19133e : null;
                    ConstraintAnchor constraintAnchor30 = constraintAnchor28.mTarget;
                    SolverVariable solverVariable19 = constraintAnchor30 != null ? constraintAnchor30.f19133e : null;
                    if (constraintWidget2 == constraintWidget29) {
                        obj = solverVariable19;
                    } else {
                        ConstraintAnchor constraintAnchor31 = constraintWidget2.mListAnchors[i34].mTarget;
                        if (constraintAnchor31 != null) {
                            solverVariable19 = constraintAnchor31.f19133e;
                            obj = solverVariable19;
                        }
                    }
                    if (constraintWidget == constraintWidget29) {
                        constraintAnchor28 = constraintAnchorArr6[i34];
                    }
                    if (solverVariable18 != null && obj != null) {
                        linearSystem.addCentering(constraintAnchor27.f19133e, solverVariable18, constraintAnchor27.getMargin(), 0.5f, obj, constraintAnchor28.f19133e, constraintWidget29.mListAnchors[i34].getMargin(), 5);
                    }
                }
            } else {
                i18 = i18;
                i13 = i11;
            }
            i18++;
            constraintWidgetContainer2 = constraintWidgetContainer;
            i17 = i10;
            i11 = i13;
        }
    }
}
