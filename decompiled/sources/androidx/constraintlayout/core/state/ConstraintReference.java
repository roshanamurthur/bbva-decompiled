package androidx.constraintlayout.core.state;

import androidx.annotation.Nullable;
import androidx.constraintlayout.core.motion.utils.TypedBundle;
import androidx.constraintlayout.core.state.helpers.Facade;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintReference implements Reference {
    public float C;
    public float D;
    public Dimension F;
    public Dimension G;
    public Object H;
    public ConstraintWidget I;
    public final HashMap<String, Integer> J;
    public HashMap<String, Float> K;
    public TypedBundle L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f18979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final State f18980b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f18981c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Facade f18982d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f18983e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f18984f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f18985g = -1.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f18986h = -1.0f;
    protected float mHorizontalBias = 0.5f;
    protected float mVerticalBias = 0.5f;
    protected int mMarginLeft = 0;
    protected int mMarginRight = 0;
    protected int mMarginStart = 0;
    protected int mMarginEnd = 0;
    protected int mMarginTop = 0;
    protected int mMarginBottom = 0;
    protected int mMarginLeftGone = 0;
    protected int mMarginRightGone = 0;
    protected int mMarginStartGone = 0;
    protected int mMarginEndGone = 0;
    protected int mMarginTopGone = 0;
    protected int mMarginBottomGone = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f18987i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f18988j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f18989k = Float.NaN;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f18990l = Float.NaN;
    public float m = Float.NaN;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f18991n = Float.NaN;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f18992o = Float.NaN;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f18993p = Float.NaN;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f18994q = Float.NaN;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f18995r = Float.NaN;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f18996s = Float.NaN;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f18997t = Float.NaN;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f18998u = Float.NaN;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f18999v = 0;
    protected Object mLeftToLeft = null;
    protected Object mLeftToRight = null;
    protected Object mRightToLeft = null;
    protected Object mRightToRight = null;
    protected Object mStartToStart = null;
    protected Object mStartToEnd = null;
    protected Object mEndToStart = null;
    protected Object mEndToEnd = null;
    protected Object mTopToTop = null;
    protected Object mTopToBottom = null;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Nullable
    public Object f19000w = null;
    protected Object mBottomToTop = null;
    protected Object mBottomToBottom = null;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @Nullable
    public Object f19001x = null;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Object f19002y = null;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Object f19003z = null;
    public Object A = null;
    public Object B = null;
    public State.Constraint E = null;

    public interface ConstraintReferenceFactory {
        ConstraintReference create(State state);
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19004a;

        static {
            int[] iArr = new int[State.Constraint.values().length];
            f19004a = iArr;
            try {
                iArr[State.Constraint.LEFT_TO_LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19004a[State.Constraint.LEFT_TO_RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19004a[State.Constraint.RIGHT_TO_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19004a[State.Constraint.RIGHT_TO_RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19004a[State.Constraint.START_TO_START.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19004a[State.Constraint.START_TO_END.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19004a[State.Constraint.END_TO_START.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f19004a[State.Constraint.END_TO_END.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f19004a[State.Constraint.TOP_TO_TOP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f19004a[State.Constraint.TOP_TO_BOTTOM.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f19004a[State.Constraint.TOP_TO_BASELINE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f19004a[State.Constraint.BOTTOM_TO_TOP.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f19004a[State.Constraint.BOTTOM_TO_BOTTOM.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f19004a[State.Constraint.BOTTOM_TO_BASELINE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f19004a[State.Constraint.BASELINE_TO_BOTTOM.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f19004a[State.Constraint.BASELINE_TO_TOP.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f19004a[State.Constraint.BASELINE_TO_BASELINE.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f19004a[State.Constraint.CIRCULAR_CONSTRAINT.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f19004a[State.Constraint.CENTER_HORIZONTALLY.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f19004a[State.Constraint.CENTER_VERTICALLY.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
        }
    }

    public static class b extends Exception {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final ArrayList<String> f19005p0;

        public b(ArrayList<String> arrayList) {
            this.f19005p0 = arrayList;
        }

        @Override // java.lang.Throwable
        public final String getMessage() {
            return toString();
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return "IncorrectConstraintException: " + this.f19005p0.toString();
        }
    }

    public ConstraintReference(State state) {
        Object obj = Dimension.WRAP_DIMENSION;
        this.F = Dimension.createFixed(obj);
        this.G = Dimension.createFixed(obj);
        this.J = new HashMap<>();
        this.K = new HashMap<>();
        this.L = null;
        this.f18980b = state;
    }

    public final void a(ConstraintWidget constraintWidget, Object obj, State.Constraint constraint) {
        ConstraintWidget constraintWidget2 = obj instanceof Reference ? ((Reference) obj).getConstraintWidget() : null;
        if (constraintWidget2 == null) {
        }
        int[] iArr = a.f19004a;
        int i10 = iArr[constraint.ordinal()];
        switch (iArr[constraint.ordinal()]) {
            case 1:
                ConstraintAnchor.Type type = ConstraintAnchor.Type.LEFT;
                constraintWidget.getAnchor(type).connect(constraintWidget2.getAnchor(type), this.mMarginLeft, this.mMarginLeftGone, false);
                break;
            case 2:
                constraintWidget.getAnchor(ConstraintAnchor.Type.LEFT).connect(constraintWidget2.getAnchor(ConstraintAnchor.Type.RIGHT), this.mMarginLeft, this.mMarginLeftGone, false);
                break;
            case 3:
                constraintWidget.getAnchor(ConstraintAnchor.Type.RIGHT).connect(constraintWidget2.getAnchor(ConstraintAnchor.Type.LEFT), this.mMarginRight, this.mMarginRightGone, false);
                break;
            case 4:
                ConstraintAnchor.Type type2 = ConstraintAnchor.Type.RIGHT;
                constraintWidget.getAnchor(type2).connect(constraintWidget2.getAnchor(type2), this.mMarginRight, this.mMarginRightGone, false);
                break;
            case 5:
                ConstraintAnchor.Type type3 = ConstraintAnchor.Type.LEFT;
                constraintWidget.getAnchor(type3).connect(constraintWidget2.getAnchor(type3), this.mMarginStart, this.mMarginStartGone, false);
                break;
            case 6:
                constraintWidget.getAnchor(ConstraintAnchor.Type.LEFT).connect(constraintWidget2.getAnchor(ConstraintAnchor.Type.RIGHT), this.mMarginStart, this.mMarginStartGone, false);
                break;
            case 7:
                constraintWidget.getAnchor(ConstraintAnchor.Type.RIGHT).connect(constraintWidget2.getAnchor(ConstraintAnchor.Type.LEFT), this.mMarginEnd, this.mMarginEndGone, false);
                break;
            case 8:
                ConstraintAnchor.Type type4 = ConstraintAnchor.Type.RIGHT;
                constraintWidget.getAnchor(type4).connect(constraintWidget2.getAnchor(type4), this.mMarginEnd, this.mMarginEndGone, false);
                break;
            case 9:
                ConstraintAnchor.Type type5 = ConstraintAnchor.Type.TOP;
                constraintWidget.getAnchor(type5).connect(constraintWidget2.getAnchor(type5), this.mMarginTop, this.mMarginTopGone, false);
                break;
            case 10:
                constraintWidget.getAnchor(ConstraintAnchor.Type.TOP).connect(constraintWidget2.getAnchor(ConstraintAnchor.Type.BOTTOM), this.mMarginTop, this.mMarginTopGone, false);
                break;
            case 11:
                constraintWidget.immediateConnect(ConstraintAnchor.Type.TOP, constraintWidget2, ConstraintAnchor.Type.BASELINE, this.mMarginTop, this.mMarginTopGone);
                break;
            case 12:
                constraintWidget.getAnchor(ConstraintAnchor.Type.BOTTOM).connect(constraintWidget2.getAnchor(ConstraintAnchor.Type.TOP), this.mMarginBottom, this.mMarginBottomGone, false);
                break;
            case 13:
                ConstraintAnchor.Type type6 = ConstraintAnchor.Type.BOTTOM;
                constraintWidget.getAnchor(type6).connect(constraintWidget2.getAnchor(type6), this.mMarginBottom, this.mMarginBottomGone, false);
                break;
            case 14:
                constraintWidget.immediateConnect(ConstraintAnchor.Type.BOTTOM, constraintWidget2, ConstraintAnchor.Type.BASELINE, this.mMarginBottom, this.mMarginBottomGone);
                break;
            case 15:
                constraintWidget.immediateConnect(ConstraintAnchor.Type.BASELINE, constraintWidget2, ConstraintAnchor.Type.BOTTOM, this.f18987i, this.f18988j);
                break;
            case 16:
                constraintWidget.immediateConnect(ConstraintAnchor.Type.BASELINE, constraintWidget2, ConstraintAnchor.Type.TOP, this.f18987i, this.f18988j);
                break;
            case 17:
                ConstraintAnchor.Type type7 = ConstraintAnchor.Type.BASELINE;
                constraintWidget.immediateConnect(type7, constraintWidget2, type7, this.f18987i, this.f18988j);
                break;
            case 18:
                constraintWidget.connectCircularConstraint(constraintWidget2, this.C, (int) this.D);
                break;
        }
    }

    public void addCustomColor(String str, int i10) {
        this.J.put(str, Integer.valueOf(i10));
    }

    public void addCustomFloat(String str, float f6) {
        if (this.K == null) {
            this.K = new HashMap<>();
        }
        this.K.put(str, Float.valueOf(f6));
    }

    public ConstraintReference alpha(float f6) {
        this.f18996s = f6;
        return this;
    }

    @Override // androidx.constraintlayout.core.state.Reference
    public void apply() {
        if (this.I == null) {
            return;
        }
        Facade facade = this.f18982d;
        if (facade != null) {
            facade.apply();
        }
        Dimension dimension = this.F;
        ConstraintWidget constraintWidget = this.I;
        State state = this.f18980b;
        dimension.apply(state, constraintWidget, 0);
        this.G.apply(state, this.I, 1);
        this.mLeftToLeft = b(this.mLeftToLeft);
        this.mLeftToRight = b(this.mLeftToRight);
        this.mRightToLeft = b(this.mRightToLeft);
        this.mRightToRight = b(this.mRightToRight);
        this.mStartToStart = b(this.mStartToStart);
        this.mStartToEnd = b(this.mStartToEnd);
        this.mEndToStart = b(this.mEndToStart);
        this.mEndToEnd = b(this.mEndToEnd);
        this.mTopToTop = b(this.mTopToTop);
        this.mTopToBottom = b(this.mTopToBottom);
        this.mBottomToTop = b(this.mBottomToTop);
        this.mBottomToBottom = b(this.mBottomToBottom);
        this.f19002y = b(this.f19002y);
        this.f19003z = b(this.f19003z);
        this.A = b(this.A);
        applyWidgetConstraints();
        int i10 = this.f18983e;
        if (i10 != 0) {
            this.I.setHorizontalChainStyle(i10);
        }
        int i11 = this.f18984f;
        if (i11 != 0) {
            this.I.setVerticalChainStyle(i11);
        }
        float f6 = this.f18985g;
        if (f6 != -1.0f) {
            this.I.setHorizontalWeight(f6);
        }
        float f10 = this.f18986h;
        if (f10 != -1.0f) {
            this.I.setVerticalWeight(f10);
        }
        this.I.setHorizontalBiasPercent(this.mHorizontalBias);
        this.I.setVerticalBiasPercent(this.mVerticalBias);
        ConstraintWidget constraintWidget2 = this.I;
        WidgetFrame widgetFrame = constraintWidget2.frame;
        widgetFrame.pivotX = this.f18989k;
        widgetFrame.pivotY = this.f18990l;
        widgetFrame.rotationX = this.m;
        widgetFrame.rotationY = this.f18991n;
        widgetFrame.rotationZ = this.f18992o;
        widgetFrame.translationX = this.f18993p;
        widgetFrame.translationY = this.f18994q;
        widgetFrame.translationZ = this.f18995r;
        widgetFrame.scaleX = this.f18997t;
        widgetFrame.scaleY = this.f18998u;
        widgetFrame.alpha = this.f18996s;
        int i12 = this.f18999v;
        widgetFrame.visibility = i12;
        constraintWidget2.setVisibility(i12);
        this.I.frame.f19089b = this.L;
        HashMap<String, Integer> map = this.J;
        if (map != null) {
            for (String str : map.keySet()) {
                this.I.frame.setCustomAttribute(str, 902, map.get(str).intValue());
            }
        }
        HashMap<String, Float> map2 = this.K;
        if (map2 != null) {
            for (String str2 : map2.keySet()) {
                this.I.frame.setCustomAttribute(str2, 901, this.K.get(str2).floatValue());
            }
        }
    }

    public void applyWidgetConstraints() {
        a(this.I, this.mLeftToLeft, State.Constraint.LEFT_TO_LEFT);
        a(this.I, this.mLeftToRight, State.Constraint.LEFT_TO_RIGHT);
        a(this.I, this.mRightToLeft, State.Constraint.RIGHT_TO_LEFT);
        a(this.I, this.mRightToRight, State.Constraint.RIGHT_TO_RIGHT);
        a(this.I, this.mStartToStart, State.Constraint.START_TO_START);
        a(this.I, this.mStartToEnd, State.Constraint.START_TO_END);
        a(this.I, this.mEndToStart, State.Constraint.END_TO_START);
        a(this.I, this.mEndToEnd, State.Constraint.END_TO_END);
        a(this.I, this.mTopToTop, State.Constraint.TOP_TO_TOP);
        a(this.I, this.mTopToBottom, State.Constraint.TOP_TO_BOTTOM);
        a(this.I, this.f19000w, State.Constraint.TOP_TO_BASELINE);
        a(this.I, this.mBottomToTop, State.Constraint.BOTTOM_TO_TOP);
        a(this.I, this.mBottomToBottom, State.Constraint.BOTTOM_TO_BOTTOM);
        a(this.I, this.f19001x, State.Constraint.BOTTOM_TO_BASELINE);
        a(this.I, this.f19002y, State.Constraint.BASELINE_TO_BASELINE);
        a(this.I, this.f19003z, State.Constraint.BASELINE_TO_TOP);
        a(this.I, this.A, State.Constraint.BASELINE_TO_BOTTOM);
        a(this.I, this.B, State.Constraint.CIRCULAR_CONSTRAINT);
    }

    public final Object b(Object obj) {
        if (obj == null) {
            return null;
        }
        return !(obj instanceof ConstraintReference) ? this.f18980b.mReferences.get(obj) : obj;
    }

    public ConstraintReference baseline() {
        this.E = State.Constraint.BASELINE_TO_BASELINE;
        return this;
    }

    public ConstraintReference baselineToBaseline(Object obj) {
        this.E = State.Constraint.BASELINE_TO_BASELINE;
        this.f19002y = obj;
        return this;
    }

    public ConstraintReference baselineToBottom(Object obj) {
        this.E = State.Constraint.BASELINE_TO_BOTTOM;
        this.A = obj;
        return this;
    }

    public ConstraintReference baselineToTop(Object obj) {
        this.E = State.Constraint.BASELINE_TO_TOP;
        this.f19003z = obj;
        return this;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:11:0x0019  */
    /* JADX WARN: Code duplicated, block: B:12:0x001c  */
    public ConstraintReference bias(float f6) {
        State.Constraint constraint = this.E;
        if (constraint == null) {
            return this;
        }
        int i10 = a.f19004a[constraint.ordinal()];
        if (i10 == 19) {
            this.mHorizontalBias = f6;
        } else if (i10 != 20) {
            switch (i10) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    this.mHorizontalBias = f6;
                    break;
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                    this.mVerticalBias = f6;
                    break;
            }
        } else {
            this.mVerticalBias = f6;
        }
        return this;
    }

    public ConstraintReference bottom() {
        if (this.mBottomToTop != null) {
            this.E = State.Constraint.BOTTOM_TO_TOP;
        } else {
            this.E = State.Constraint.BOTTOM_TO_BOTTOM;
        }
        return this;
    }

    public ConstraintReference bottomToBottom(Object obj) {
        this.E = State.Constraint.BOTTOM_TO_BOTTOM;
        this.mBottomToBottom = obj;
        return this;
    }

    public ConstraintReference bottomToTop(Object obj) {
        this.E = State.Constraint.BOTTOM_TO_TOP;
        this.mBottomToTop = obj;
        return this;
    }

    public ConstraintReference centerHorizontally(Object obj) {
        Object objB = b(obj);
        this.mStartToStart = objB;
        this.mEndToEnd = objB;
        this.E = State.Constraint.CENTER_HORIZONTALLY;
        this.mHorizontalBias = 0.5f;
        return this;
    }

    public ConstraintReference centerVertically(Object obj) {
        Object objB = b(obj);
        this.mTopToTop = objB;
        this.mBottomToBottom = objB;
        this.E = State.Constraint.CENTER_VERTICALLY;
        this.mVerticalBias = 0.5f;
        return this;
    }

    public ConstraintReference circularConstraint(Object obj, float f6, float f10) {
        this.B = b(obj);
        this.C = f6;
        this.D = f10;
        this.E = State.Constraint.CIRCULAR_CONSTRAINT;
        return this;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public ConstraintReference clear() {
        State.Constraint constraint = this.E;
        if (constraint != null) {
            switch (a.f19004a[constraint.ordinal()]) {
                case 1:
                case 2:
                    this.mLeftToLeft = null;
                    this.mLeftToRight = null;
                    this.mMarginLeft = 0;
                    this.mMarginLeftGone = 0;
                    break;
                case 3:
                case 4:
                    this.mRightToLeft = null;
                    this.mRightToRight = null;
                    this.mMarginRight = 0;
                    this.mMarginRightGone = 0;
                    break;
                case 5:
                case 6:
                    this.mStartToStart = null;
                    this.mStartToEnd = null;
                    this.mMarginStart = 0;
                    this.mMarginStartGone = 0;
                    break;
                case 7:
                case 8:
                    this.mEndToStart = null;
                    this.mEndToEnd = null;
                    this.mMarginEnd = 0;
                    this.mMarginEndGone = 0;
                    break;
                case 9:
                case 10:
                case 11:
                    this.mTopToTop = null;
                    this.mTopToBottom = null;
                    this.f19000w = null;
                    this.mMarginTop = 0;
                    this.mMarginTopGone = 0;
                    break;
                case 12:
                case 13:
                case 14:
                    this.mBottomToTop = null;
                    this.mBottomToBottom = null;
                    this.f19001x = null;
                    this.mMarginBottom = 0;
                    this.mMarginBottomGone = 0;
                    break;
                case 17:
                    this.f19002y = null;
                    break;
                case 18:
                    this.B = null;
                    break;
            }
        } else {
            clearAll();
        }
        return this;
    }

    public ConstraintReference clearAll() {
        this.mLeftToLeft = null;
        this.mLeftToRight = null;
        this.mMarginLeft = 0;
        this.mRightToLeft = null;
        this.mRightToRight = null;
        this.mMarginRight = 0;
        this.mStartToStart = null;
        this.mStartToEnd = null;
        this.mMarginStart = 0;
        this.mEndToStart = null;
        this.mEndToEnd = null;
        this.mMarginEnd = 0;
        this.mTopToTop = null;
        this.mTopToBottom = null;
        this.mMarginTop = 0;
        this.mBottomToTop = null;
        this.mBottomToBottom = null;
        this.mMarginBottom = 0;
        this.f19002y = null;
        this.B = null;
        this.mHorizontalBias = 0.5f;
        this.mVerticalBias = 0.5f;
        this.mMarginLeftGone = 0;
        this.mMarginRightGone = 0;
        this.mMarginStartGone = 0;
        this.mMarginEndGone = 0;
        this.mMarginTopGone = 0;
        this.mMarginBottomGone = 0;
        return this;
    }

    public ConstraintReference clearHorizontal() {
        start().clear();
        end().clear();
        left().clear();
        right().clear();
        return this;
    }

    public ConstraintReference clearVertical() {
        top().clear();
        baseline().clear();
        bottom().clear();
        return this;
    }

    public ConstraintWidget createConstraintWidget() {
        return new ConstraintWidget(getWidth().f19024d, getHeight().f19024d);
    }

    public ConstraintReference end() {
        if (this.mEndToStart != null) {
            this.E = State.Constraint.END_TO_START;
        } else {
            this.E = State.Constraint.END_TO_END;
        }
        return this;
    }

    public ConstraintReference endToEnd(Object obj) {
        this.E = State.Constraint.END_TO_END;
        this.mEndToEnd = obj;
        return this;
    }

    public ConstraintReference endToStart(Object obj) {
        this.E = State.Constraint.END_TO_START;
        this.mEndToStart = obj;
        return this;
    }

    public float getAlpha() {
        return this.f18996s;
    }

    @Override // androidx.constraintlayout.core.state.Reference
    public ConstraintWidget getConstraintWidget() {
        if (this.I == null) {
            ConstraintWidget constraintWidgetCreateConstraintWidget = createConstraintWidget();
            this.I = constraintWidgetCreateConstraintWidget;
            constraintWidgetCreateConstraintWidget.setCompanionWidget(this.H);
        }
        return this.I;
    }

    @Override // androidx.constraintlayout.core.state.Reference
    public Facade getFacade() {
        return this.f18982d;
    }

    public Dimension getHeight() {
        return this.G;
    }

    public int getHorizontalChainStyle() {
        return this.f18983e;
    }

    public float getHorizontalChainWeight() {
        return this.f18985g;
    }

    @Override // androidx.constraintlayout.core.state.Reference
    public Object getKey() {
        return this.f18979a;
    }

    public float getPivotX() {
        return this.f18989k;
    }

    public float getPivotY() {
        return this.f18990l;
    }

    public float getRotationX() {
        return this.m;
    }

    public float getRotationY() {
        return this.f18991n;
    }

    public float getRotationZ() {
        return this.f18992o;
    }

    public float getScaleX() {
        return this.f18997t;
    }

    public float getScaleY() {
        return this.f18998u;
    }

    public String getTag() {
        return this.f18981c;
    }

    public float getTranslationX() {
        return this.f18993p;
    }

    public float getTranslationY() {
        return this.f18994q;
    }

    public float getTranslationZ() {
        return this.f18995r;
    }

    public int getVerticalChainStyle(int i10) {
        return this.f18984f;
    }

    public float getVerticalChainWeight() {
        return this.f18986h;
    }

    public Object getView() {
        return this.H;
    }

    public Dimension getWidth() {
        return this.F;
    }

    public ConstraintReference height(Dimension dimension) {
        return setHeight(dimension);
    }

    public ConstraintReference horizontalBias(float f6) {
        this.mHorizontalBias = f6;
        return this;
    }

    public ConstraintReference left() {
        if (this.mLeftToLeft != null) {
            this.E = State.Constraint.LEFT_TO_LEFT;
        } else {
            this.E = State.Constraint.LEFT_TO_RIGHT;
        }
        return this;
    }

    public ConstraintReference leftToLeft(Object obj) {
        this.E = State.Constraint.LEFT_TO_LEFT;
        this.mLeftToLeft = obj;
        return this;
    }

    public ConstraintReference leftToRight(Object obj) {
        this.E = State.Constraint.LEFT_TO_RIGHT;
        this.mLeftToRight = obj;
        return this;
    }

    public ConstraintReference margin(Object obj) {
        return margin(this.f18980b.convertDimension(obj));
    }

    public ConstraintReference marginGone(Object obj) {
        return marginGone(this.f18980b.convertDimension(obj));
    }

    public ConstraintReference pivotX(float f6) {
        this.f18989k = f6;
        return this;
    }

    public ConstraintReference pivotY(float f6) {
        this.f18990l = f6;
        return this;
    }

    public ConstraintReference right() {
        if (this.mRightToLeft != null) {
            this.E = State.Constraint.RIGHT_TO_LEFT;
        } else {
            this.E = State.Constraint.RIGHT_TO_RIGHT;
        }
        return this;
    }

    public ConstraintReference rightToLeft(Object obj) {
        this.E = State.Constraint.RIGHT_TO_LEFT;
        this.mRightToLeft = obj;
        return this;
    }

    public ConstraintReference rightToRight(Object obj) {
        this.E = State.Constraint.RIGHT_TO_RIGHT;
        this.mRightToRight = obj;
        return this;
    }

    public ConstraintReference rotationX(float f6) {
        this.m = f6;
        return this;
    }

    public ConstraintReference rotationY(float f6) {
        this.f18991n = f6;
        return this;
    }

    public ConstraintReference rotationZ(float f6) {
        this.f18992o = f6;
        return this;
    }

    public ConstraintReference scaleX(float f6) {
        this.f18997t = f6;
        return this;
    }

    public ConstraintReference scaleY(float f6) {
        this.f18998u = f6;
        return this;
    }

    @Override // androidx.constraintlayout.core.state.Reference
    public void setConstraintWidget(ConstraintWidget constraintWidget) {
        if (constraintWidget == null) {
            return;
        }
        this.I = constraintWidget;
        constraintWidget.setCompanionWidget(this.H);
    }

    public void setFacade(Facade facade) {
        this.f18982d = facade;
        if (facade != null) {
            setConstraintWidget(facade.getConstraintWidget());
        }
    }

    public ConstraintReference setHeight(Dimension dimension) {
        this.G = dimension;
        return this;
    }

    public void setHorizontalChainStyle(int i10) {
        this.f18983e = i10;
    }

    public void setHorizontalChainWeight(float f6) {
        this.f18985g = f6;
    }

    @Override // androidx.constraintlayout.core.state.Reference
    public void setKey(Object obj) {
        this.f18979a = obj;
    }

    public void setTag(String str) {
        this.f18981c = str;
    }

    public void setVerticalChainStyle(int i10) {
        this.f18984f = i10;
    }

    public void setVerticalChainWeight(float f6) {
        this.f18986h = f6;
    }

    public void setView(Object obj) {
        this.H = obj;
        ConstraintWidget constraintWidget = this.I;
        if (constraintWidget != null) {
            constraintWidget.setCompanionWidget(obj);
        }
    }

    public ConstraintReference setWidth(Dimension dimension) {
        this.F = dimension;
        return this;
    }

    public ConstraintReference start() {
        if (this.mStartToStart != null) {
            this.E = State.Constraint.START_TO_START;
        } else {
            this.E = State.Constraint.START_TO_END;
        }
        return this;
    }

    public ConstraintReference startToEnd(Object obj) {
        this.E = State.Constraint.START_TO_END;
        this.mStartToEnd = obj;
        return this;
    }

    public ConstraintReference startToStart(Object obj) {
        this.E = State.Constraint.START_TO_START;
        this.mStartToStart = obj;
        return this;
    }

    public ConstraintReference top() {
        if (this.mTopToTop != null) {
            this.E = State.Constraint.TOP_TO_TOP;
        } else {
            this.E = State.Constraint.TOP_TO_BOTTOM;
        }
        return this;
    }

    public ConstraintReference topToBottom(Object obj) {
        this.E = State.Constraint.TOP_TO_BOTTOM;
        this.mTopToBottom = obj;
        return this;
    }

    public ConstraintReference topToTop(Object obj) {
        this.E = State.Constraint.TOP_TO_TOP;
        this.mTopToTop = obj;
        return this;
    }

    public ConstraintReference translationX(float f6) {
        this.f18993p = f6;
        return this;
    }

    public ConstraintReference translationY(float f6) {
        this.f18994q = f6;
        return this;
    }

    public ConstraintReference translationZ(float f6) {
        this.f18995r = f6;
        return this;
    }

    public void validate() throws b {
        ArrayList arrayList = new ArrayList();
        if (this.mLeftToLeft != null && this.mLeftToRight != null) {
            arrayList.add("LeftToLeft and LeftToRight both defined");
        }
        if (this.mRightToLeft != null && this.mRightToRight != null) {
            arrayList.add("RightToLeft and RightToRight both defined");
        }
        if (this.mStartToStart != null && this.mStartToEnd != null) {
            arrayList.add("StartToStart and StartToEnd both defined");
        }
        if (this.mEndToStart != null && this.mEndToEnd != null) {
            arrayList.add("EndToStart and EndToEnd both defined");
        }
        if ((this.mLeftToLeft != null || this.mLeftToRight != null || this.mRightToLeft != null || this.mRightToRight != null) && (this.mStartToStart != null || this.mStartToEnd != null || this.mEndToStart != null || this.mEndToEnd != null)) {
            arrayList.add("Both left/right and start/end constraints defined");
        }
        if (arrayList.size() > 0) {
            throw new b(arrayList);
        }
    }

    public ConstraintReference verticalBias(float f6) {
        this.mVerticalBias = f6;
        return this;
    }

    public ConstraintReference visibility(int i10) {
        this.f18999v = i10;
        return this;
    }

    public ConstraintReference width(Dimension dimension) {
        return setWidth(dimension);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public ConstraintReference margin(int i10) {
        State.Constraint constraint = this.E;
        if (constraint != null) {
            switch (a.f19004a[constraint.ordinal()]) {
                case 1:
                case 2:
                    this.mMarginLeft = i10;
                    break;
                case 3:
                case 4:
                    this.mMarginRight = i10;
                    break;
                case 5:
                case 6:
                    this.mMarginStart = i10;
                    break;
                case 7:
                case 8:
                    this.mMarginEnd = i10;
                    break;
                case 9:
                case 10:
                case 11:
                    this.mMarginTop = i10;
                    break;
                case 12:
                case 13:
                case 14:
                    this.mMarginBottom = i10;
                    break;
                case 15:
                case 16:
                case 17:
                    this.f18987i = i10;
                    break;
                case 18:
                    this.D = i10;
                    break;
            }
        } else {
            this.mMarginLeft = i10;
            this.mMarginRight = i10;
            this.mMarginStart = i10;
            this.mMarginEnd = i10;
            this.mMarginTop = i10;
            this.mMarginBottom = i10;
        }
        return this;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public ConstraintReference marginGone(int i10) {
        State.Constraint constraint = this.E;
        if (constraint != null) {
            switch (a.f19004a[constraint.ordinal()]) {
                case 1:
                case 2:
                    this.mMarginLeftGone = i10;
                    break;
                case 3:
                case 4:
                    this.mMarginRightGone = i10;
                    break;
                case 5:
                case 6:
                    this.mMarginStartGone = i10;
                    break;
                case 7:
                case 8:
                    this.mMarginEndGone = i10;
                    break;
                case 9:
                case 10:
                case 11:
                    this.mMarginTopGone = i10;
                    break;
                case 12:
                case 13:
                case 14:
                    this.mMarginBottomGone = i10;
                    break;
                case 15:
                case 16:
                case 17:
                    this.f18988j = i10;
                    break;
            }
        } else {
            this.mMarginLeftGone = i10;
            this.mMarginRightGone = i10;
            this.mMarginStartGone = i10;
            this.mMarginEndGone = i10;
            this.mMarginTopGone = i10;
            this.mMarginBottomGone = i10;
        }
        return this;
    }
}
