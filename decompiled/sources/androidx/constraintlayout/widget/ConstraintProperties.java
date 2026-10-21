package androidx.constraintlayout.widget;

import android.view.View;
import android.view.ViewGroup;
import com.adobe.marketing.mobile.EventDataKeys;
import com.dasnano.vdphotoselfiecapture.api.model.Parameters;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintProperties {
    public static final int BASELINE = 5;
    public static final int BOTTOM = 4;
    public static final int END = 7;
    public static final int LEFT = 1;
    public static final int MATCH_CONSTRAINT = 0;
    public static final int MATCH_CONSTRAINT_SPREAD = 0;
    public static final int MATCH_CONSTRAINT_WRAP = 1;
    public static final int PARENT_ID = 0;
    public static final int RIGHT = 2;
    public static final int START = 6;
    public static final int TOP = 3;
    public static final int UNSET = -1;
    public static final int WRAP_CONTENT = -2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout.LayoutParams f19754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f19755b;

    public ConstraintProperties(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ConstraintLayout.LayoutParams)) {
            throw new RuntimeException("Only children of ConstraintLayout.LayoutParams supported");
        }
        this.f19754a = (ConstraintLayout.LayoutParams) layoutParams;
        this.f19755b = view;
    }

    public static String a(int i10) {
        switch (i10) {
            case 1:
                return Parameters.DIRECTION.LEFT;
            case 2:
                return Parameters.DIRECTION.RIGHT;
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return EventDataKeys.Lifecycle.LIFECYCLE_START;
            case 7:
                return "end";
            default:
                return "undefined";
        }
    }

    public ConstraintProperties addToHorizontalChain(int i10, int i11) {
        connect(1, i10, i10 == 0 ? 1 : 2, 0);
        connect(2, i11, i11 == 0 ? 2 : 1, 0);
        View view = this.f19755b;
        if (i10 != 0) {
            new ConstraintProperties(((ViewGroup) view.getParent()).findViewById(i10)).connect(2, view.getId(), 1, 0);
        }
        if (i11 != 0) {
            new ConstraintProperties(((ViewGroup) view.getParent()).findViewById(i11)).connect(1, view.getId(), 2, 0);
        }
        return this;
    }

    public ConstraintProperties addToHorizontalChainRTL(int i10, int i11) {
        connect(6, i10, i10 == 0 ? 6 : 7, 0);
        connect(7, i11, i11 == 0 ? 7 : 6, 0);
        View view = this.f19755b;
        if (i10 != 0) {
            new ConstraintProperties(((ViewGroup) view.getParent()).findViewById(i10)).connect(7, view.getId(), 6, 0);
        }
        if (i11 != 0) {
            new ConstraintProperties(((ViewGroup) view.getParent()).findViewById(i11)).connect(6, view.getId(), 7, 0);
        }
        return this;
    }

    public ConstraintProperties addToVerticalChain(int i10, int i11) {
        connect(3, i10, i10 == 0 ? 3 : 4, 0);
        connect(4, i11, i11 == 0 ? 4 : 3, 0);
        View view = this.f19755b;
        if (i10 != 0) {
            new ConstraintProperties(((ViewGroup) view.getParent()).findViewById(i10)).connect(4, view.getId(), 3, 0);
        }
        if (i11 != 0) {
            new ConstraintProperties(((ViewGroup) view.getParent()).findViewById(i11)).connect(3, view.getId(), 4, 0);
        }
        return this;
    }

    public ConstraintProperties alpha(float f6) {
        this.f19755b.setAlpha(f6);
        return this;
    }

    public ConstraintProperties center(int i10, int i11, int i12, int i13, int i14, int i15, float f6) {
        if (i12 < 0) {
            throw new IllegalArgumentException("margin must be > 0");
        }
        if (i15 < 0) {
            throw new IllegalArgumentException("margin must be > 0");
        }
        if (f6 <= 0.0f || f6 > 1.0f) {
            throw new IllegalArgumentException("bias must be between 0 and 1 inclusive");
        }
        ConstraintLayout.LayoutParams layoutParams = this.f19754a;
        if (i11 == 1 || i11 == 2) {
            connect(1, i10, i11, i12);
            connect(2, i13, i14, i15);
            layoutParams.horizontalBias = f6;
        } else if (i11 == 6 || i11 == 7) {
            connect(6, i10, i11, i12);
            connect(7, i13, i14, i15);
            layoutParams.horizontalBias = f6;
        } else {
            connect(3, i10, i11, i12);
            connect(4, i13, i14, i15);
            layoutParams.verticalBias = f6;
        }
        return this;
    }

    public ConstraintProperties centerHorizontally(int i10, int i11, int i12, int i13, int i14, int i15, float f6) {
        connect(1, i10, i11, i12);
        connect(2, i13, i14, i15);
        this.f19754a.horizontalBias = f6;
        return this;
    }

    public ConstraintProperties centerHorizontallyRtl(int i10, int i11, int i12, int i13, int i14, int i15, float f6) {
        connect(6, i10, i11, i12);
        connect(7, i13, i14, i15);
        this.f19754a.horizontalBias = f6;
        return this;
    }

    public ConstraintProperties centerVertically(int i10, int i11, int i12, int i13, int i14, int i15, float f6) {
        connect(3, i10, i11, i12);
        connect(4, i13, i14, i15);
        this.f19754a.verticalBias = f6;
        return this;
    }

    public ConstraintProperties connect(int i10, int i11, int i12, int i13) {
        ConstraintLayout.LayoutParams layoutParams = this.f19754a;
        switch (i10) {
            case 1:
                if (i12 == 1) {
                    layoutParams.leftToLeft = i11;
                    layoutParams.leftToRight = -1;
                } else {
                    if (i12 != 2) {
                        throw new IllegalArgumentException("Left to " + a(i12) + " undefined");
                    }
                    layoutParams.leftToRight = i11;
                    layoutParams.leftToLeft = -1;
                }
                ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = i13;
                return this;
            case 2:
                if (i12 == 1) {
                    layoutParams.rightToLeft = i11;
                    layoutParams.rightToRight = -1;
                } else {
                    if (i12 != 2) {
                        throw new IllegalArgumentException("right to " + a(i12) + " undefined");
                    }
                    layoutParams.rightToRight = i11;
                    layoutParams.rightToLeft = -1;
                }
                ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = i13;
                return this;
            case 3:
                if (i12 == 3) {
                    layoutParams.topToTop = i11;
                    layoutParams.topToBottom = -1;
                    layoutParams.baselineToBaseline = -1;
                    layoutParams.baselineToTop = -1;
                    layoutParams.baselineToBottom = -1;
                } else {
                    if (i12 != 4) {
                        throw new IllegalArgumentException("right to " + a(i12) + " undefined");
                    }
                    layoutParams.topToBottom = i11;
                    layoutParams.topToTop = -1;
                    layoutParams.baselineToBaseline = -1;
                    layoutParams.baselineToTop = -1;
                    layoutParams.baselineToBottom = -1;
                }
                ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = i13;
                return this;
            case 4:
                if (i12 == 4) {
                    layoutParams.bottomToBottom = i11;
                    layoutParams.bottomToTop = -1;
                    layoutParams.baselineToBaseline = -1;
                    layoutParams.baselineToTop = -1;
                    layoutParams.baselineToBottom = -1;
                } else {
                    if (i12 != 3) {
                        throw new IllegalArgumentException("right to " + a(i12) + " undefined");
                    }
                    layoutParams.bottomToTop = i11;
                    layoutParams.bottomToBottom = -1;
                    layoutParams.baselineToBaseline = -1;
                    layoutParams.baselineToTop = -1;
                    layoutParams.baselineToBottom = -1;
                }
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = i13;
                return this;
            case 5:
                if (i12 == 5) {
                    layoutParams.baselineToBaseline = i11;
                    layoutParams.bottomToBottom = -1;
                    layoutParams.bottomToTop = -1;
                    layoutParams.topToTop = -1;
                    layoutParams.topToBottom = -1;
                } else if (i12 == 3) {
                    layoutParams.baselineToTop = i11;
                    layoutParams.bottomToBottom = -1;
                    layoutParams.bottomToTop = -1;
                    layoutParams.topToTop = -1;
                    layoutParams.topToBottom = -1;
                } else {
                    if (i12 != 4) {
                        throw new IllegalArgumentException("right to " + a(i12) + " undefined");
                    }
                    layoutParams.baselineToBottom = i11;
                    layoutParams.bottomToBottom = -1;
                    layoutParams.bottomToTop = -1;
                    layoutParams.topToTop = -1;
                    layoutParams.topToBottom = -1;
                }
                layoutParams.baselineMargin = i13;
                return this;
            case 6:
                if (i12 == 6) {
                    layoutParams.startToStart = i11;
                    layoutParams.startToEnd = -1;
                } else {
                    if (i12 != 7) {
                        throw new IllegalArgumentException("right to " + a(i12) + " undefined");
                    }
                    layoutParams.startToEnd = i11;
                    layoutParams.startToStart = -1;
                }
                layoutParams.setMarginStart(i13);
                return this;
            case 7:
                if (i12 == 7) {
                    layoutParams.endToEnd = i11;
                    layoutParams.endToStart = -1;
                } else {
                    if (i12 != 6) {
                        throw new IllegalArgumentException("right to " + a(i12) + " undefined");
                    }
                    layoutParams.endToStart = i11;
                    layoutParams.endToEnd = -1;
                }
                layoutParams.setMarginEnd(i13);
                return this;
            default:
                throw new IllegalArgumentException(a(i10) + " to " + a(i12) + " unknown");
        }
    }

    public ConstraintProperties constrainDefaultHeight(int i10) {
        this.f19754a.matchConstraintDefaultHeight = i10;
        return this;
    }

    public ConstraintProperties constrainDefaultWidth(int i10) {
        this.f19754a.matchConstraintDefaultWidth = i10;
        return this;
    }

    public ConstraintProperties constrainHeight(int i10) {
        ((ViewGroup.MarginLayoutParams) this.f19754a).height = i10;
        return this;
    }

    public ConstraintProperties constrainMaxHeight(int i10) {
        this.f19754a.matchConstraintMaxHeight = i10;
        return this;
    }

    public ConstraintProperties constrainMaxWidth(int i10) {
        this.f19754a.matchConstraintMaxWidth = i10;
        return this;
    }

    public ConstraintProperties constrainMinHeight(int i10) {
        this.f19754a.matchConstraintMinHeight = i10;
        return this;
    }

    public ConstraintProperties constrainMinWidth(int i10) {
        this.f19754a.matchConstraintMinWidth = i10;
        return this;
    }

    public ConstraintProperties constrainWidth(int i10) {
        ((ViewGroup.MarginLayoutParams) this.f19754a).width = i10;
        return this;
    }

    public ConstraintProperties dimensionRatio(String str) {
        this.f19754a.dimensionRatio = str;
        return this;
    }

    public ConstraintProperties elevation(float f6) {
        this.f19755b.setElevation(f6);
        return this;
    }

    public ConstraintProperties goneMargin(int i10, int i11) {
        ConstraintLayout.LayoutParams layoutParams = this.f19754a;
        switch (i10) {
            case 1:
                layoutParams.goneLeftMargin = i11;
                return this;
            case 2:
                layoutParams.goneRightMargin = i11;
                return this;
            case 3:
                layoutParams.goneTopMargin = i11;
                return this;
            case 4:
                layoutParams.goneBottomMargin = i11;
                return this;
            case 5:
                throw new IllegalArgumentException("baseline does not support margins");
            case 6:
                layoutParams.goneStartMargin = i11;
                return this;
            case 7:
                layoutParams.goneEndMargin = i11;
                return this;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public ConstraintProperties horizontalBias(float f6) {
        this.f19754a.horizontalBias = f6;
        return this;
    }

    public ConstraintProperties horizontalChainStyle(int i10) {
        this.f19754a.horizontalChainStyle = i10;
        return this;
    }

    public ConstraintProperties horizontalWeight(float f6) {
        this.f19754a.horizontalWeight = f6;
        return this;
    }

    public ConstraintProperties margin(int i10, int i11) {
        ConstraintLayout.LayoutParams layoutParams = this.f19754a;
        switch (i10) {
            case 1:
                ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = i11;
                return this;
            case 2:
                ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = i11;
                return this;
            case 3:
                ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = i11;
                return this;
            case 4:
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = i11;
                return this;
            case 5:
                throw new IllegalArgumentException("baseline does not support margins");
            case 6:
                layoutParams.setMarginStart(i11);
                return this;
            case 7:
                layoutParams.setMarginEnd(i11);
                return this;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public ConstraintProperties removeConstraints(int i10) {
        ConstraintLayout.LayoutParams layoutParams = this.f19754a;
        switch (i10) {
            case 1:
                layoutParams.leftToRight = -1;
                layoutParams.leftToLeft = -1;
                ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = -1;
                layoutParams.goneLeftMargin = Integer.MIN_VALUE;
                return this;
            case 2:
                layoutParams.rightToRight = -1;
                layoutParams.rightToLeft = -1;
                ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = -1;
                layoutParams.goneRightMargin = Integer.MIN_VALUE;
                return this;
            case 3:
                layoutParams.topToBottom = -1;
                layoutParams.topToTop = -1;
                ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = -1;
                layoutParams.goneTopMargin = Integer.MIN_VALUE;
                return this;
            case 4:
                layoutParams.bottomToTop = -1;
                layoutParams.bottomToBottom = -1;
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = -1;
                layoutParams.goneBottomMargin = Integer.MIN_VALUE;
                return this;
            case 5:
                layoutParams.baselineToBaseline = -1;
                return this;
            case 6:
                layoutParams.startToEnd = -1;
                layoutParams.startToStart = -1;
                layoutParams.setMarginStart(-1);
                layoutParams.goneStartMargin = Integer.MIN_VALUE;
                return this;
            case 7:
                layoutParams.endToStart = -1;
                layoutParams.endToEnd = -1;
                layoutParams.setMarginEnd(-1);
                layoutParams.goneEndMargin = Integer.MIN_VALUE;
                return this;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public ConstraintProperties removeFromHorizontalChain() {
        ConstraintLayout.LayoutParams layoutParams = this.f19754a;
        int i10 = layoutParams.leftToRight;
        int i11 = layoutParams.rightToLeft;
        View view = this.f19755b;
        if (i10 == -1 && i11 == -1) {
            int i12 = layoutParams.startToEnd;
            int i13 = layoutParams.endToStart;
            if (i12 != -1 || i13 != -1) {
                ConstraintProperties constraintProperties = new ConstraintProperties(((ViewGroup) view.getParent()).findViewById(i12));
                ConstraintProperties constraintProperties2 = new ConstraintProperties(((ViewGroup) view.getParent()).findViewById(i13));
                if (i12 != -1 && i13 != -1) {
                    constraintProperties.connect(7, i13, 6, 0);
                    constraintProperties2.connect(6, i10, 7, 0);
                } else if (i10 != -1 || i13 != -1) {
                    int i14 = layoutParams.rightToRight;
                    if (i14 != -1) {
                        constraintProperties.connect(7, i14, 7, 0);
                    } else {
                        int i15 = layoutParams.leftToLeft;
                        if (i15 != -1) {
                            constraintProperties2.connect(6, i15, 6, 0);
                        }
                    }
                }
            }
            removeConstraints(6);
            removeConstraints(7);
        } else {
            ConstraintProperties constraintProperties3 = new ConstraintProperties(((ViewGroup) view.getParent()).findViewById(i10));
            ConstraintProperties constraintProperties4 = new ConstraintProperties(((ViewGroup) view.getParent()).findViewById(i11));
            if (i10 != -1 && i11 != -1) {
                constraintProperties3.connect(2, i11, 1, 0);
                constraintProperties4.connect(1, i10, 2, 0);
            } else if (i10 != -1 || i11 != -1) {
                int i16 = layoutParams.rightToRight;
                if (i16 != -1) {
                    constraintProperties3.connect(2, i16, 2, 0);
                } else {
                    int i17 = layoutParams.leftToLeft;
                    if (i17 != -1) {
                        constraintProperties4.connect(1, i17, 1, 0);
                    }
                }
            }
            removeConstraints(1);
            removeConstraints(2);
        }
        return this;
    }

    public ConstraintProperties removeFromVerticalChain() {
        ConstraintLayout.LayoutParams layoutParams = this.f19754a;
        int i10 = layoutParams.topToBottom;
        int i11 = layoutParams.bottomToTop;
        if (i10 != -1 || i11 != -1) {
            View view = this.f19755b;
            ConstraintProperties constraintProperties = new ConstraintProperties(((ViewGroup) view.getParent()).findViewById(i10));
            ConstraintProperties constraintProperties2 = new ConstraintProperties(((ViewGroup) view.getParent()).findViewById(i11));
            if (i10 != -1 && i11 != -1) {
                constraintProperties.connect(4, i11, 3, 0);
                constraintProperties2.connect(3, i10, 4, 0);
            } else if (i10 != -1 || i11 != -1) {
                int i12 = layoutParams.bottomToBottom;
                if (i12 != -1) {
                    constraintProperties.connect(4, i12, 4, 0);
                } else {
                    int i13 = layoutParams.topToTop;
                    if (i13 != -1) {
                        constraintProperties2.connect(3, i13, 3, 0);
                    }
                }
            }
        }
        removeConstraints(3);
        removeConstraints(4);
        return this;
    }

    public ConstraintProperties rotation(float f6) {
        this.f19755b.setRotation(f6);
        return this;
    }

    public ConstraintProperties rotationX(float f6) {
        this.f19755b.setRotationX(f6);
        return this;
    }

    public ConstraintProperties rotationY(float f6) {
        this.f19755b.setRotationY(f6);
        return this;
    }

    public ConstraintProperties scaleX(float f6) {
        this.f19755b.setScaleY(f6);
        return this;
    }

    public ConstraintProperties transformPivot(float f6, float f10) {
        View view = this.f19755b;
        view.setPivotX(f6);
        view.setPivotY(f10);
        return this;
    }

    public ConstraintProperties transformPivotX(float f6) {
        this.f19755b.setPivotX(f6);
        return this;
    }

    public ConstraintProperties transformPivotY(float f6) {
        this.f19755b.setPivotY(f6);
        return this;
    }

    public ConstraintProperties translation(float f6, float f10) {
        View view = this.f19755b;
        view.setTranslationX(f6);
        view.setTranslationY(f10);
        return this;
    }

    public ConstraintProperties translationX(float f6) {
        this.f19755b.setTranslationX(f6);
        return this;
    }

    public ConstraintProperties translationY(float f6) {
        this.f19755b.setTranslationY(f6);
        return this;
    }

    public ConstraintProperties translationZ(float f6) {
        this.f19755b.setTranslationZ(f6);
        return this;
    }

    public ConstraintProperties verticalBias(float f6) {
        this.f19754a.verticalBias = f6;
        return this;
    }

    public ConstraintProperties verticalChainStyle(int i10) {
        this.f19754a.verticalChainStyle = i10;
        return this;
    }

    public ConstraintProperties verticalWeight(float f6) {
        this.f19754a.verticalWeight = f6;
        return this;
    }

    public ConstraintProperties visibility(int i10) {
        this.f19755b.setVisibility(i10);
        return this;
    }

    public ConstraintProperties centerHorizontally(int i10) {
        if (i10 == 0) {
            center(0, 1, 0, 0, 2, 0, 0.5f);
        } else {
            center(i10, 2, 0, i10, 1, 0, 0.5f);
        }
        return this;
    }

    public ConstraintProperties centerHorizontallyRtl(int i10) {
        if (i10 == 0) {
            center(0, 6, 0, 0, 7, 0, 0.5f);
        } else {
            center(i10, 7, 0, i10, 6, 0, 0.5f);
        }
        return this;
    }

    public ConstraintProperties centerVertically(int i10) {
        if (i10 == 0) {
            center(0, 3, 0, 0, 4, 0, 0.5f);
        } else {
            center(i10, 4, 0, i10, 3, 0, 0.5f);
        }
        return this;
    }

    public void apply() {
    }

    public ConstraintProperties scaleY(float f6) {
        return this;
    }
}
