package androidx.constraintlayout.core.widgets;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class ChainHead {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f19127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f19128c;
    protected ConstraintWidget mFirst;
    protected ConstraintWidget mFirstMatchConstraintWidget;
    protected ConstraintWidget mFirstVisibleWidget;
    protected boolean mHasComplexMatchWeights;
    protected boolean mHasDefinedWeights;
    protected boolean mHasRatio;
    protected boolean mHasUndefinedWeights;
    protected ConstraintWidget mHead;
    protected ConstraintWidget mLast;
    protected ConstraintWidget mLastMatchConstraintWidget;
    protected ConstraintWidget mLastVisibleWidget;
    protected float mTotalWeight = 0.0f;
    protected ArrayList<ConstraintWidget> mWeightedMatchConstraintsWidgets;
    protected int mWidgetsCount;
    protected int mWidgetsMatchCount;

    public ChainHead(ConstraintWidget constraintWidget, int i10, boolean z10) {
        this.mFirst = constraintWidget;
        this.f19126a = i10;
        this.f19127b = z10;
    }

    public void define() {
        int i10;
        if (!this.f19128c) {
            int i11 = this.f19126a;
            int i12 = i11 * 2;
            ConstraintWidget constraintWidget = this.mFirst;
            boolean z10 = false;
            ConstraintWidget constraintWidget2 = constraintWidget;
            boolean z11 = false;
            while (!z11) {
                this.mWidgetsCount++;
                ConstraintWidget constraintWidget3 = null;
                constraintWidget.mNextChainWidget[i11] = null;
                constraintWidget.mListNextMatchConstraintsWidget[i11] = null;
                if (constraintWidget.getVisibility() != 8) {
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour = constraintWidget.getDimensionBehaviour(i11);
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                    if (dimensionBehaviour != dimensionBehaviour2) {
                        constraintWidget.getLength(i11);
                    }
                    constraintWidget.mListAnchors[i12].getMargin();
                    int i13 = i12 + 1;
                    constraintWidget.mListAnchors[i13].getMargin();
                    constraintWidget.mListAnchors[i12].getMargin();
                    constraintWidget.mListAnchors[i13].getMargin();
                    if (this.mFirstVisibleWidget == null) {
                        this.mFirstVisibleWidget = constraintWidget;
                    }
                    this.mLastVisibleWidget = constraintWidget;
                    if (constraintWidget.mListDimensionBehaviors[i11] == dimensionBehaviour2) {
                        int i14 = constraintWidget.mResolvedMatchConstraintDefault[i11];
                        if (i14 == 0 || i14 == 3 || i14 == 2) {
                            this.mWidgetsMatchCount++;
                            float f6 = constraintWidget.mWeight[i11];
                            if (f6 > 0.0f) {
                                this.mTotalWeight += f6;
                            }
                            if (constraintWidget.getVisibility() != 8 && constraintWidget.mListDimensionBehaviors[i11] == dimensionBehaviour2 && ((i10 = constraintWidget.mResolvedMatchConstraintDefault[i11]) == 0 || i10 == 3)) {
                                if (f6 < 0.0f) {
                                    this.mHasUndefinedWeights = true;
                                } else {
                                    this.mHasDefinedWeights = true;
                                }
                                if (this.mWeightedMatchConstraintsWidgets == null) {
                                    this.mWeightedMatchConstraintsWidgets = new ArrayList<>();
                                }
                                this.mWeightedMatchConstraintsWidgets.add(constraintWidget);
                            }
                            if (this.mFirstMatchConstraintWidget == null) {
                                this.mFirstMatchConstraintWidget = constraintWidget;
                            }
                            ConstraintWidget constraintWidget4 = this.mLastMatchConstraintWidget;
                            if (constraintWidget4 != null) {
                                constraintWidget4.mListNextMatchConstraintsWidget[i11] = constraintWidget;
                            }
                            this.mLastMatchConstraintWidget = constraintWidget;
                        }
                        if (i11 == 0) {
                            if (constraintWidget.mMatchConstraintDefaultWidth == 0 && constraintWidget.mMatchConstraintMinWidth == 0) {
                                int i15 = constraintWidget.mMatchConstraintMaxWidth;
                            }
                        } else if (constraintWidget.mMatchConstraintDefaultHeight == 0 && constraintWidget.mMatchConstraintMinHeight == 0) {
                            int i16 = constraintWidget.mMatchConstraintMaxHeight;
                        }
                        if (constraintWidget.mDimensionRatio != 0.0f) {
                            this.mHasRatio = true;
                        }
                    }
                }
                if (constraintWidget2 != constraintWidget) {
                    constraintWidget2.mNextChainWidget[i11] = constraintWidget;
                }
                ConstraintAnchor constraintAnchor = constraintWidget.mListAnchors[i12 + 1].mTarget;
                if (constraintAnchor != null) {
                    ConstraintWidget constraintWidget5 = constraintAnchor.mOwner;
                    ConstraintAnchor constraintAnchor2 = constraintWidget5.mListAnchors[i12].mTarget;
                    if (constraintAnchor2 != null && constraintAnchor2.mOwner == constraintWidget) {
                        constraintWidget3 = constraintWidget5;
                    }
                }
                if (constraintWidget3 == null) {
                    z11 = true;
                    constraintWidget3 = constraintWidget;
                }
                constraintWidget2 = constraintWidget;
                constraintWidget = constraintWidget3;
            }
            ConstraintWidget constraintWidget6 = this.mFirstVisibleWidget;
            if (constraintWidget6 != null) {
                constraintWidget6.mListAnchors[i12].getMargin();
            }
            ConstraintWidget constraintWidget7 = this.mLastVisibleWidget;
            if (constraintWidget7 != null) {
                constraintWidget7.mListAnchors[i12 + 1].getMargin();
            }
            this.mLast = constraintWidget;
            if (i11 == 0 && this.f19127b) {
                this.mHead = constraintWidget;
            } else {
                this.mHead = this.mFirst;
            }
            if (this.mHasDefinedWeights && this.mHasUndefinedWeights) {
                z10 = true;
            }
            this.mHasComplexMatchWeights = z10;
        }
        this.f19128c = true;
    }

    public ConstraintWidget getFirst() {
        return this.mFirst;
    }

    public ConstraintWidget getFirstMatchConstraintWidget() {
        return this.mFirstMatchConstraintWidget;
    }

    public ConstraintWidget getFirstVisibleWidget() {
        return this.mFirstVisibleWidget;
    }

    public ConstraintWidget getHead() {
        return this.mHead;
    }

    public ConstraintWidget getLast() {
        return this.mLast;
    }

    public ConstraintWidget getLastMatchConstraintWidget() {
        return this.mLastMatchConstraintWidget;
    }

    public ConstraintWidget getLastVisibleWidget() {
        return this.mLastVisibleWidget;
    }

    public float getTotalWeight() {
        return this.mTotalWeight;
    }
}
