package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import com.bbva.tohu.android.product.valkyria.sdk.constants.ExpectedUserActionOnPoiTypes;

/* JADX INFO: loaded from: classes.dex */
public abstract class WidgetRun implements Dependency {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ConstraintWidget f19236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e f19237b;
    protected ConstraintWidget.DimensionBehaviour mDimensionBehavior;
    public int matchConstraintsType;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final androidx.constraintlayout.core.widgets.analyzer.b f19238c = new androidx.constraintlayout.core.widgets.analyzer.b(this);
    public int orientation = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f19239d = false;
    public DependencyNode start = new DependencyNode(this);
    public DependencyNode end = new DependencyNode(this);
    protected b mRunType = b.NONE;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19240a;

        static {
            int[] iArr = new int[ConstraintAnchor.Type.values().length];
            f19240a = iArr;
            try {
                iArr[ConstraintAnchor.Type.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19240a[ConstraintAnchor.Type.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19240a[ConstraintAnchor.Type.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19240a[ConstraintAnchor.Type.BASELINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19240a[ConstraintAnchor.Type.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        private static final /* synthetic */ b[] $VALUES;
        public static final b CENTER;
        public static final b END;
        public static final b NONE;
        public static final b START;

        static {
            b bVar = new b(ExpectedUserActionOnPoiTypes.NONE, 0);
            NONE = bVar;
            b bVar2 = new b("START", 1);
            START = bVar2;
            b bVar3 = new b("END", 2);
            END = bVar3;
            b bVar4 = new b("CENTER", 3);
            CENTER = bVar4;
            $VALUES = new b[]{bVar, bVar2, bVar3, bVar4};
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    public WidgetRun(ConstraintWidget constraintWidget) {
        this.f19236a = constraintWidget;
    }

    public abstract void a();

    public final void addTarget(DependencyNode dependencyNode, DependencyNode dependencyNode2, int i10) {
        dependencyNode.f19216g.add(dependencyNode2);
        dependencyNode.f19212c = i10;
        dependencyNode2.f19215f.add(dependencyNode);
    }

    public abstract void applyToWidget();

    public abstract void b();

    public abstract boolean c();

    public final int getLimitedDimension(int i10, int i11) {
        int iMax;
        if (i11 == 0) {
            ConstraintWidget constraintWidget = this.f19236a;
            int i12 = constraintWidget.mMatchConstraintMaxWidth;
            iMax = Math.max(constraintWidget.mMatchConstraintMinWidth, i10);
            if (i12 > 0) {
                iMax = Math.min(i12, i10);
            }
            if (iMax == i10) {
                return i10;
            }
        } else {
            ConstraintWidget constraintWidget2 = this.f19236a;
            int i13 = constraintWidget2.mMatchConstraintMaxHeight;
            iMax = Math.max(constraintWidget2.mMatchConstraintMinHeight, i10);
            if (i13 > 0) {
                iMax = Math.min(i13, i10);
            }
            if (iMax == i10) {
                return i10;
            }
        }
        return iMax;
    }

    public final DependencyNode getTarget(ConstraintAnchor constraintAnchor) {
        ConstraintAnchor constraintAnchor2 = constraintAnchor.mTarget;
        if (constraintAnchor2 == null) {
            return null;
        }
        ConstraintWidget constraintWidget = constraintAnchor2.mOwner;
        int i10 = a.f19240a[constraintAnchor2.mType.ordinal()];
        if (i10 == 1) {
            return constraintWidget.mHorizontalRun.start;
        }
        if (i10 == 2) {
            return constraintWidget.mHorizontalRun.end;
        }
        if (i10 == 3) {
            return constraintWidget.mVerticalRun.start;
        }
        if (i10 == 4) {
            return constraintWidget.mVerticalRun.baseline;
        }
        if (i10 != 5) {
            return null;
        }
        return constraintWidget.mVerticalRun.end;
    }

    public long getWrapDimension() {
        androidx.constraintlayout.core.widgets.analyzer.b bVar = this.f19238c;
        if (bVar.resolved) {
            return bVar.value;
        }
        return 0L;
    }

    public boolean isCenterConnection() {
        int size = this.start.f19216g.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            if (((DependencyNode) this.start.f19216g.get(i11)).f19210a != this) {
                i10++;
            }
        }
        int size2 = this.end.f19216g.size();
        for (int i12 = 0; i12 < size2; i12++) {
            if (((DependencyNode) this.end.f19216g.get(i12)).f19210a != this) {
                i10++;
            }
        }
        return i10 >= 2;
    }

    public boolean isDimensionResolved() {
        return this.f19238c.resolved;
    }

    public boolean isResolved() {
        return this.f19239d;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0056 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    /* JADX WARN: Code duplicated, block: B:33:0x0060  */
    /* JADX WARN: Code duplicated, block: B:35:0x0068  */
    /* JADX WARN: Code duplicated, block: B:36:0x006f  */
    public void updateRunCenter(Dependency dependency, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, int i10) {
        float dimensionRatio;
        androidx.constraintlayout.core.widgets.analyzer.b bVar;
        int i11;
        DependencyNode target = getTarget(constraintAnchor);
        DependencyNode target2 = getTarget(constraintAnchor2);
        if (target.resolved && target2.resolved) {
            int margin = constraintAnchor.getMargin() + target.value;
            int margin2 = target2.value - constraintAnchor2.getMargin();
            int i12 = margin2 - margin;
            androidx.constraintlayout.core.widgets.analyzer.b bVar2 = this.f19238c;
            if (!bVar2.resolved) {
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = this.mDimensionBehavior;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (dimensionBehaviour == dimensionBehaviour2) {
                    int i13 = this.matchConstraintsType;
                    if (i13 == 0) {
                        bVar2.resolve(getLimitedDimension(i12, i10));
                    } else if (i13 == 1) {
                        bVar2.resolve(Math.min(getLimitedDimension(bVar2.f19241h, i10), i12));
                    } else if (i13 == 2) {
                        ConstraintWidget parent = this.f19236a.getParent();
                        if (parent != null) {
                            androidx.constraintlayout.core.widgets.analyzer.b bVar3 = (i10 == 0 ? parent.mHorizontalRun : parent.mVerticalRun).f19238c;
                            if (bVar3.resolved) {
                                bVar2.resolve(getLimitedDimension((int) ((bVar3.value * (i10 == 0 ? this.f19236a.mMatchConstraintPercentWidth : this.f19236a.mMatchConstraintPercentHeight)) + 0.5f), i10));
                            }
                        }
                    } else if (i13 == 3) {
                        ConstraintWidget constraintWidget = this.f19236a;
                        WidgetRun widgetRun = constraintWidget.mHorizontalRun;
                        if (widgetRun.mDimensionBehavior == dimensionBehaviour2 && widgetRun.matchConstraintsType == 3) {
                            VerticalWidgetRun verticalWidgetRun = constraintWidget.mVerticalRun;
                            if (verticalWidgetRun.mDimensionBehavior != dimensionBehaviour2 || verticalWidgetRun.matchConstraintsType != 3) {
                                if (i10 == 0) {
                                    widgetRun = constraintWidget.mVerticalRun;
                                }
                                if (widgetRun.f19238c.resolved) {
                                    dimensionRatio = constraintWidget.getDimensionRatio();
                                    bVar = widgetRun.f19238c;
                                    if (i10 == 1) {
                                        i11 = (int) ((bVar.value / dimensionRatio) + 0.5f);
                                    } else {
                                        i11 = (int) ((dimensionRatio * bVar.value) + 0.5f);
                                    }
                                    bVar2.resolve(i11);
                                }
                            }
                        } else {
                            if (i10 == 0) {
                                widgetRun = constraintWidget.mVerticalRun;
                            }
                            if (widgetRun.f19238c.resolved) {
                                dimensionRatio = constraintWidget.getDimensionRatio();
                                bVar = widgetRun.f19238c;
                                if (i10 == 1) {
                                    i11 = (int) ((bVar.value / dimensionRatio) + 0.5f);
                                } else {
                                    i11 = (int) ((dimensionRatio * bVar.value) + 0.5f);
                                }
                                bVar2.resolve(i11);
                            }
                        }
                    }
                }
            }
            if (bVar2.resolved) {
                if (bVar2.value == i12) {
                    this.start.resolve(margin);
                    this.end.resolve(margin2);
                    return;
                }
                float horizontalBiasPercent = i10 == 0 ? this.f19236a.getHorizontalBiasPercent() : this.f19236a.getVerticalBiasPercent();
                if (target == target2) {
                    margin = target.value;
                    margin2 = target2.value;
                    horizontalBiasPercent = 0.5f;
                }
                this.start.resolve((int) ((((margin2 - margin) - bVar2.value) * horizontalBiasPercent) + margin + 0.5f));
                this.end.resolve(this.start.value + bVar2.value);
            }
        }
    }

    public long wrapSize(int i10) {
        int i11;
        androidx.constraintlayout.core.widgets.analyzer.b bVar = this.f19238c;
        if (!bVar.resolved) {
            return 0L;
        }
        long j10 = bVar.value;
        if (isCenterConnection()) {
            i11 = this.start.f19212c - this.end.f19212c;
        } else {
            if (i10 != 0) {
                return j10 - ((long) this.end.f19212c);
            }
            i11 = this.start.f19212c;
        }
        return j10 + ((long) i11);
    }

    public final void addTarget(DependencyNode dependencyNode, DependencyNode dependencyNode2, int i10, androidx.constraintlayout.core.widgets.analyzer.b bVar) {
        dependencyNode.f19216g.add(dependencyNode2);
        dependencyNode.f19216g.add(this.f19238c);
        dependencyNode.f19213d = i10;
        dependencyNode.f19214e = bVar;
        dependencyNode2.f19215f.add(dependencyNode);
        bVar.f19215f.add(dependencyNode);
    }

    public final DependencyNode getTarget(ConstraintAnchor constraintAnchor, int i10) {
        ConstraintAnchor constraintAnchor2 = constraintAnchor.mTarget;
        if (constraintAnchor2 == null) {
            return null;
        }
        ConstraintWidget constraintWidget = constraintAnchor2.mOwner;
        WidgetRun widgetRun = i10 == 0 ? constraintWidget.mHorizontalRun : constraintWidget.mVerticalRun;
        int i11 = a.f19240a[constraintAnchor2.mType.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 5) {
                        return null;
                    }
                }
            }
            return widgetRun.end;
        }
        return widgetRun.start;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.Dependency
    public void update(Dependency dependency) {
    }

    public void updateRunEnd(Dependency dependency) {
    }

    public void updateRunStart(Dependency dependency) {
    }
}
