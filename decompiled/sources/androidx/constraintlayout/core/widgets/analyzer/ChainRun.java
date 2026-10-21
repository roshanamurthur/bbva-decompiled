package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class ChainRun extends WidgetRun {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList<WidgetRun> f19200e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f19201f;

    public ChainRun(ConstraintWidget constraintWidget, int i10) {
        ConstraintWidget constraintWidget2;
        super(constraintWidget);
        this.f19200e = new ArrayList<>();
        this.orientation = i10;
        ConstraintWidget constraintWidget3 = this.f19236a;
        ConstraintWidget previousChainMember = constraintWidget3.getPreviousChainMember(i10);
        while (true) {
            ConstraintWidget constraintWidget4 = previousChainMember;
            constraintWidget2 = constraintWidget3;
            constraintWidget3 = constraintWidget4;
            if (constraintWidget3 == null) {
                break;
            } else {
                previousChainMember = constraintWidget3.getPreviousChainMember(this.orientation);
            }
        }
        this.f19236a = constraintWidget2;
        WidgetRun run = constraintWidget2.getRun(this.orientation);
        ArrayList<WidgetRun> arrayList = this.f19200e;
        arrayList.add(run);
        ConstraintWidget nextChainMember = constraintWidget2.getNextChainMember(this.orientation);
        while (nextChainMember != null) {
            arrayList.add(nextChainMember.getRun(this.orientation));
            nextChainMember = nextChainMember.getNextChainMember(this.orientation);
        }
        for (WidgetRun widgetRun : arrayList) {
            int i11 = this.orientation;
            if (i11 == 0) {
                widgetRun.f19236a.horizontalChainRun = this;
            } else if (i11 == 1) {
                widgetRun.f19236a.verticalChainRun = this;
            }
        }
        if (this.orientation == 0 && ((ConstraintWidgetContainer) this.f19236a.getParent()).isRtl() && arrayList.size() > 1) {
            this.f19236a = ((WidgetRun) androidx.appcompat.view.menu.b.b(arrayList, 1)).f19236a;
        }
        this.f19201f = this.orientation == 0 ? this.f19236a.getHorizontalChainStyle() : this.f19236a.getVerticalChainStyle();
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final void a() {
        ArrayList<WidgetRun> arrayList = this.f19200e;
        Iterator<WidgetRun> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        int size = arrayList.size();
        if (size < 1) {
            return;
        }
        ConstraintWidget constraintWidget = arrayList.get(0).f19236a;
        ConstraintWidget constraintWidget2 = arrayList.get(size - 1).f19236a;
        if (this.orientation == 0) {
            ConstraintAnchor constraintAnchor = constraintWidget.mLeft;
            ConstraintAnchor constraintAnchor2 = constraintWidget2.mRight;
            DependencyNode target = getTarget(constraintAnchor, 0);
            int margin = constraintAnchor.getMargin();
            ConstraintWidget constraintWidgetD = d();
            if (constraintWidgetD != null) {
                margin = constraintWidgetD.mLeft.getMargin();
            }
            if (target != null) {
                addTarget(this.start, target, margin);
            }
            DependencyNode target2 = getTarget(constraintAnchor2, 0);
            int margin2 = constraintAnchor2.getMargin();
            ConstraintWidget constraintWidgetE = e();
            if (constraintWidgetE != null) {
                margin2 = constraintWidgetE.mRight.getMargin();
            }
            if (target2 != null) {
                addTarget(this.end, target2, -margin2);
            }
        } else {
            ConstraintAnchor constraintAnchor3 = constraintWidget.mTop;
            ConstraintAnchor constraintAnchor4 = constraintWidget2.mBottom;
            DependencyNode target3 = getTarget(constraintAnchor3, 1);
            int margin3 = constraintAnchor3.getMargin();
            ConstraintWidget constraintWidgetD2 = d();
            if (constraintWidgetD2 != null) {
                margin3 = constraintWidgetD2.mTop.getMargin();
            }
            if (target3 != null) {
                addTarget(this.start, target3, margin3);
            }
            DependencyNode target4 = getTarget(constraintAnchor4, 1);
            int margin4 = constraintAnchor4.getMargin();
            ConstraintWidget constraintWidgetE2 = e();
            if (constraintWidgetE2 != null) {
                margin4 = constraintWidgetE2.mBottom.getMargin();
            }
            if (target4 != null) {
                addTarget(this.end, target4, -margin4);
            }
        }
        this.start.updateDelegate = this;
        this.end.updateDelegate = this;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void applyToWidget() {
        int i10 = 0;
        while (true) {
            ArrayList<WidgetRun> arrayList = this.f19200e;
            if (i10 >= arrayList.size()) {
                return;
            }
            arrayList.get(i10).applyToWidget();
            i10++;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final void b() {
        this.f19237b = null;
        Iterator<WidgetRun> it = this.f19200e.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final boolean c() {
        ArrayList<WidgetRun> arrayList = this.f19200e;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!arrayList.get(i10).c()) {
                return false;
            }
        }
        return true;
    }

    public final ConstraintWidget d() {
        int i10 = 0;
        while (true) {
            ArrayList<WidgetRun> arrayList = this.f19200e;
            if (i10 >= arrayList.size()) {
                return null;
            }
            WidgetRun widgetRun = arrayList.get(i10);
            if (widgetRun.f19236a.getVisibility() != 8) {
                return widgetRun.f19236a;
            }
            i10++;
        }
    }

    public final ConstraintWidget e() {
        ArrayList<WidgetRun> arrayList = this.f19200e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            WidgetRun widgetRun = arrayList.get(size);
            if (widgetRun.f19236a.getVisibility() != 8) {
                return widgetRun.f19236a;
            }
        }
        return null;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public long getWrapDimension() {
        ArrayList<WidgetRun> arrayList = this.f19200e;
        int size = arrayList.size();
        long wrapDimension = 0;
        for (int i10 = 0; i10 < size; i10++) {
            WidgetRun widgetRun = arrayList.get(i10);
            wrapDimension = ((long) widgetRun.end.f19212c) + widgetRun.getWrapDimension() + wrapDimension + ((long) widgetRun.start.f19212c);
        }
        return wrapDimension;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ChainRun ");
        sb2.append(this.orientation == 0 ? "horizontal : " : "vertical : ");
        for (WidgetRun widgetRun : this.f19200e) {
            sb2.append("<");
            sb2.append(widgetRun);
            sb2.append("> ");
        }
        return sb2.toString();
    }

    /* JADX WARN: Code duplicated, block: B:291:0x00f1 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:64:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:65:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:67:0x00e9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:90:0x0153  */
    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun, androidx.constraintlayout.core.widgets.analyzer.Dependency
    public void update(Dependency dependency) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        float f6;
        boolean z10;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        float f10;
        if (this.start.resolved && this.end.resolved) {
            ConstraintWidget parent = this.f19236a.getParent();
            boolean zIsRtl = parent instanceof ConstraintWidgetContainer ? ((ConstraintWidgetContainer) parent).isRtl() : false;
            int i22 = this.end.value - this.start.value;
            ArrayList<WidgetRun> arrayList = this.f19200e;
            int size = arrayList.size();
            int i23 = 0;
            while (true) {
                i10 = -1;
                i11 = 8;
                if (i23 >= size) {
                    i23 = -1;
                    break;
                } else if (arrayList.get(i23).f19236a.getVisibility() != 8) {
                    break;
                } else {
                    i23++;
                }
            }
            int i24 = size - 1;
            for (int i25 = i24; i25 >= 0; i25--) {
                if (arrayList.get(i25).f19236a.getVisibility() != 8) {
                    i10 = i25;
                    break;
                }
            }
            int i26 = 0;
            while (true) {
                if (i26 >= 2) {
                    i12 = 0;
                    i13 = 0;
                    i14 = 0;
                    f6 = 0.0f;
                    break;
                }
                int i27 = 0;
                i14 = 0;
                int i28 = 0;
                int i29 = 0;
                f6 = 0.0f;
                while (i27 < size) {
                    WidgetRun widgetRun = arrayList.get(i27);
                    if (widgetRun.f19236a.getVisibility() != i11) {
                        i29++;
                        if (i27 > 0 && i27 >= i23) {
                            i14 += widgetRun.start.f19212c;
                        }
                        b bVar = widgetRun.f19238c;
                        int i30 = bVar.value;
                        boolean z11 = widgetRun.mDimensionBehavior != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                        if (z11) {
                            int i31 = this.orientation;
                            if (i31 == 0 && !widgetRun.f19236a.mHorizontalRun.f19238c.resolved) {
                                return;
                            }
                            if (i31 == 1 && !widgetRun.f19236a.mVerticalRun.f19238c.resolved) {
                                return;
                            } else {
                                i20 = i30;
                            }
                        } else {
                            i20 = i30;
                            if (widgetRun.matchConstraintsType == 1 && i26 == 0) {
                                i21 = bVar.f19241h;
                                i28++;
                            } else {
                                if (bVar.resolved) {
                                    i21 = i20;
                                }
                                if (z11) {
                                    i14 += i21;
                                } else {
                                    i28++;
                                    f10 = widgetRun.f19236a.mWeight[this.orientation];
                                    if (f10 >= 0.0f) {
                                        f6 += f10;
                                    }
                                }
                                if (i27 >= i24 && i27 < i10) {
                                    i14 += -widgetRun.end.f19212c;
                                }
                            }
                            z11 = true;
                            if (z11) {
                                i28++;
                                f10 = widgetRun.f19236a.mWeight[this.orientation];
                                if (f10 >= 0.0f) {
                                    f6 += f10;
                                }
                            } else {
                                i14 += i21;
                            }
                            if (i27 >= i24) {
                            }
                        }
                        i21 = i20;
                        if (z11) {
                            i28++;
                            f10 = widgetRun.f19236a.mWeight[this.orientation];
                            if (f10 >= 0.0f) {
                                f6 += f10;
                            }
                        } else {
                            i14 += i21;
                        }
                        if (i27 >= i24) {
                        }
                    }
                    i27++;
                    i11 = 8;
                }
                if (i14 < i22 || i28 == 0) {
                    i12 = i28;
                    i13 = i29;
                    break;
                } else {
                    i26++;
                    i11 = 8;
                }
            }
            int i32 = this.start.value;
            if (zIsRtl) {
                i32 = this.end.value;
            }
            if (i14 > i22) {
                i32 = zIsRtl ? i32 + ((int) (((i14 - i22) / 2.0f) + 0.5f)) : i32 - ((int) (((i14 - i22) / 2.0f) + 0.5f));
            }
            if (i12 > 0) {
                float f11 = i22 - i14;
                int i33 = (int) ((f11 / i12) + 0.5f);
                int i34 = 0;
                int i35 = 0;
                while (i34 < size) {
                    WidgetRun widgetRun2 = arrayList.get(i34);
                    int i36 = i33;
                    int i37 = i14;
                    if (widgetRun2.f19236a.getVisibility() != 8 && widgetRun2.mDimensionBehavior == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        b bVar2 = widgetRun2.f19238c;
                        if (bVar2.resolved) {
                            i32 = i32;
                            f11 = f11;
                        } else {
                            int i38 = f6 > 0.0f ? (int) (((widgetRun2.f19236a.mWeight[this.orientation] * f11) / f6) + 0.5f) : i36;
                            if (this.orientation == 0) {
                                ConstraintWidget constraintWidget = widgetRun2.f19236a;
                                i19 = constraintWidget.mMatchConstraintMaxWidth;
                                i18 = constraintWidget.mMatchConstraintMinWidth;
                            } else {
                                ConstraintWidget constraintWidget2 = widgetRun2.f19236a;
                                int i39 = constraintWidget2.mMatchConstraintMaxHeight;
                                i18 = constraintWidget2.mMatchConstraintMinHeight;
                                i19 = i39;
                            }
                            int iMax = Math.max(i18, widgetRun2.matchConstraintsType == 1 ? Math.min(i38, bVar2.f19241h) : i38);
                            if (i19 > 0) {
                                iMax = Math.min(i19, iMax);
                            }
                            if (iMax != i38) {
                                i35++;
                                i38 = iMax;
                            }
                            bVar2.resolve(i38);
                        }
                    } else {
                        i32 = i32;
                        f11 = f11;
                    }
                    i34++;
                    i33 = i36;
                    i14 = i37;
                    i32 = i32;
                    f11 = f11;
                    zIsRtl = zIsRtl;
                }
                z10 = zIsRtl;
                i15 = i32;
                int i40 = i14;
                if (i35 > 0) {
                    i12 -= i35;
                    i14 = 0;
                    for (int i41 = 0; i41 < size; i41++) {
                        WidgetRun widgetRun3 = arrayList.get(i41);
                        if (widgetRun3.f19236a.getVisibility() != 8) {
                            if (i41 > 0 && i41 >= i23) {
                                i14 += widgetRun3.start.f19212c;
                            }
                            i14 += widgetRun3.f19238c.value;
                            if (i41 < i24 && i41 < i10) {
                                i14 += -widgetRun3.end.f19212c;
                            }
                        }
                    }
                } else {
                    i14 = i40;
                }
                i17 = 2;
                if (this.f19201f == 2 && i35 == 0) {
                    i16 = 0;
                    this.f19201f = 0;
                } else {
                    i16 = 0;
                }
            } else {
                z10 = zIsRtl;
                i15 = i32;
                i16 = 0;
                i17 = 2;
            }
            if (i14 > i22) {
                this.f19201f = i17;
            }
            if (i13 > 0 && i12 == 0 && i23 == i10) {
                this.f19201f = i17;
            }
            int i42 = this.f19201f;
            if (i42 == 1) {
                int i43 = i13 > 1 ? (i22 - i14) / (i13 - 1) : i13 == 1 ? (i22 - i14) / 2 : i16;
                if (i12 > 0) {
                    i43 = i16;
                }
                int i44 = i15;
                for (int i45 = i16; i45 < size; i45++) {
                    WidgetRun widgetRun4 = arrayList.get(z10 ? size - (i45 + 1) : i45);
                    if (widgetRun4.f19236a.getVisibility() == 8) {
                        widgetRun4.start.resolve(i44);
                        widgetRun4.end.resolve(i44);
                    } else {
                        if (i45 > 0) {
                            i44 = z10 ? i44 - i43 : i44 + i43;
                        }
                        if (i45 > 0 && i45 >= i23) {
                            i44 = z10 ? i44 - widgetRun4.start.f19212c : i44 + widgetRun4.start.f19212c;
                        }
                        if (z10) {
                            widgetRun4.end.resolve(i44);
                        } else {
                            widgetRun4.start.resolve(i44);
                        }
                        b bVar3 = widgetRun4.f19238c;
                        int i46 = bVar3.value;
                        if (widgetRun4.mDimensionBehavior == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && widgetRun4.matchConstraintsType == 1) {
                            i46 = bVar3.f19241h;
                        }
                        i44 = z10 ? i44 - i46 : i44 + i46;
                        if (z10) {
                            widgetRun4.start.resolve(i44);
                        } else {
                            widgetRun4.end.resolve(i44);
                        }
                        widgetRun4.f19239d = true;
                        if (i45 < i24 && i45 < i10) {
                            i44 = z10 ? i44 - (-widgetRun4.end.f19212c) : i44 + (-widgetRun4.end.f19212c);
                        }
                    }
                }
                return;
            }
            if (i42 == 0) {
                int i47 = (i22 - i14) / (i13 + 1);
                if (i12 > 0) {
                    i47 = i16;
                }
                int i48 = i15;
                for (int i49 = i16; i49 < size; i49++) {
                    WidgetRun widgetRun5 = arrayList.get(z10 ? size - (i49 + 1) : i49);
                    if (widgetRun5.f19236a.getVisibility() == 8) {
                        widgetRun5.start.resolve(i48);
                        widgetRun5.end.resolve(i48);
                    } else {
                        int i50 = z10 ? i48 - i47 : i48 + i47;
                        if (i49 > 0 && i49 >= i23) {
                            i50 = z10 ? i50 - widgetRun5.start.f19212c : i50 + widgetRun5.start.f19212c;
                        }
                        if (z10) {
                            widgetRun5.end.resolve(i50);
                        } else {
                            widgetRun5.start.resolve(i50);
                        }
                        b bVar4 = widgetRun5.f19238c;
                        int iMin = bVar4.value;
                        if (widgetRun5.mDimensionBehavior == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && widgetRun5.matchConstraintsType == 1) {
                            iMin = Math.min(iMin, bVar4.f19241h);
                        }
                        i48 = z10 ? i50 - iMin : i50 + iMin;
                        if (z10) {
                            widgetRun5.start.resolve(i48);
                        } else {
                            widgetRun5.end.resolve(i48);
                        }
                        if (i49 < i24 && i49 < i10) {
                            i48 = z10 ? i48 - (-widgetRun5.end.f19212c) : i48 + (-widgetRun5.end.f19212c);
                        }
                    }
                }
                return;
            }
            if (i42 == 2) {
                float horizontalBiasPercent = this.orientation == 0 ? this.f19236a.getHorizontalBiasPercent() : this.f19236a.getVerticalBiasPercent();
                if (z10) {
                    horizontalBiasPercent = 1.0f - horizontalBiasPercent;
                }
                int i51 = (int) (((i22 - i14) * horizontalBiasPercent) + 0.5f);
                if (i51 < 0 || i12 > 0) {
                    i51 = i16;
                }
                int i52 = z10 ? i15 - i51 : i15 + i51;
                for (int i53 = i16; i53 < size; i53++) {
                    WidgetRun widgetRun6 = arrayList.get(z10 ? size - (i53 + 1) : i53);
                    if (widgetRun6.f19236a.getVisibility() == 8) {
                        widgetRun6.start.resolve(i52);
                        widgetRun6.end.resolve(i52);
                    } else {
                        if (i53 > 0 && i53 >= i23) {
                            i52 = z10 ? i52 - widgetRun6.start.f19212c : i52 + widgetRun6.start.f19212c;
                        }
                        if (z10) {
                            widgetRun6.end.resolve(i52);
                        } else {
                            widgetRun6.start.resolve(i52);
                        }
                        b bVar5 = widgetRun6.f19238c;
                        int i54 = bVar5.value;
                        if (widgetRun6.mDimensionBehavior == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && widgetRun6.matchConstraintsType == 1) {
                            i54 = bVar5.f19241h;
                        }
                        i52 = z10 ? i52 - i54 : i52 + i54;
                        if (z10) {
                            widgetRun6.start.resolve(i52);
                        } else {
                            widgetRun6.end.resolve(i52);
                        }
                        if (i53 < i24 && i53 < i10) {
                            i52 = z10 ? i52 - (-widgetRun6.end.f19212c) : i52 + (-widgetRun6.end.f19212c);
                        }
                    }
                }
            }
        }
    }
}
