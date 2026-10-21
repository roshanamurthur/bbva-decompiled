package androidx.constraintlayout.core.widgets;

import ad.d;
import androidx.collection.k;
import androidx.constraintlayout.core.ArrayRow;
import androidx.constraintlayout.core.Cache;
import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.Metrics;
import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.state.WidgetFrame;
import androidx.constraintlayout.core.widgets.analyzer.ChainRun;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun;
import androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun;
import androidx.constraintlayout.core.widgets.analyzer.WidgetRun;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.dasnano.vdphotoselfiecapture.api.model.Parameters;
import com.dasnano.vdvideoselfiecapture.config.VDVideoSelfieConfiguration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintWidget {
    public static final int ANCHOR_BASELINE = 4;
    public static final int ANCHOR_BOTTOM = 3;
    public static final int ANCHOR_LEFT = 0;
    public static final int ANCHOR_RIGHT = 1;
    public static final int ANCHOR_TOP = 2;
    public static final int BOTH = 2;
    public static final int CHAIN_PACKED = 2;
    public static final int CHAIN_SPREAD = 0;
    public static final int CHAIN_SPREAD_INSIDE = 1;
    public static float DEFAULT_BIAS = 0.5f;
    protected static final int DIRECT = 2;
    public static final int GONE = 8;
    public static final int HORIZONTAL = 0;
    public static final int INVISIBLE = 4;
    public static final int MATCH_CONSTRAINT_PERCENT = 2;
    public static final int MATCH_CONSTRAINT_RATIO = 3;
    public static final int MATCH_CONSTRAINT_RATIO_RESOLVED = 4;
    public static final int MATCH_CONSTRAINT_SPREAD = 0;
    public static final int MATCH_CONSTRAINT_WRAP = 1;
    protected static final int SOLVER = 1;
    public static final int UNKNOWN = -1;
    public static final int VERTICAL = 1;
    public static final int VISIBLE = 0;
    public static final int WRAP_BEHAVIOR_HORIZONTAL_ONLY = 1;
    public static final int WRAP_BEHAVIOR_INCLUDED = 0;
    public static final int WRAP_BEHAVIOR_SKIPPED = 3;
    public static final int WRAP_BEHAVIOR_VERTICAL_ONLY = 2;
    public int A;
    public int B;
    public boolean C;
    public String D;
    public String E;
    public int F;
    public int G;
    public ConstraintWidget H;
    public ConstraintWidget I;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f19134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f19135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f19136c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f19137d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f19138e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f19139f;
    public WidgetFrame frame;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f19140g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f19141h;
    public ChainRun horizontalChainRun;
    public int horizontalGroup;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f19142i;
    public boolean[] isTerminalWidget;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f19143j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f19144k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int[] f19145l;
    public boolean m;
    protected ArrayList<ConstraintAnchor> mAnchors;
    public ConstraintAnchor mBaseline;
    public ConstraintAnchor mBottom;
    public ConstraintAnchor mCenter;
    public float mCircleConstraintAngle;
    public float mDimensionRatio;
    protected int mDimensionRatioSide;
    public int mHorizontalResolution;
    public HorizontalWidgetRun mHorizontalRun;
    public boolean mIsHeightWrapContent;
    public boolean mIsWidthWrapContent;
    public ConstraintAnchor mLeft;
    public ConstraintAnchor[] mListAnchors;
    public DimensionBehaviour[] mListDimensionBehaviors;
    protected ConstraintWidget[] mListNextMatchConstraintsWidget;
    public int mMatchConstraintDefaultHeight;
    public int mMatchConstraintDefaultWidth;
    public int mMatchConstraintMaxHeight;
    public int mMatchConstraintMaxWidth;
    public int mMatchConstraintMinHeight;
    public int mMatchConstraintMinWidth;
    public float mMatchConstraintPercentHeight;
    public float mMatchConstraintPercentWidth;
    protected int mMinHeight;
    protected int mMinWidth;
    protected ConstraintWidget[] mNextChainWidget;
    protected int mOffsetX;
    protected int mOffsetY;
    public ConstraintWidget mParent;
    public int[] mResolvedMatchConstraintDefault;
    public ConstraintAnchor mRight;
    public ConstraintAnchor mTop;
    public int mVerticalResolution;
    public VerticalWidgetRun mVerticalRun;
    public float[] mWeight;
    protected int mX;
    protected int mY;
    public boolean measured;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f19146n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f19147o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f19148p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f19149q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ConstraintAnchor f19150r;
    public WidgetRun[] run;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ConstraintAnchor f19151s;
    public String stringId;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean[] f19152t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f19153u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f19154v;
    public ChainRun verticalChainRun;
    public int verticalGroup;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f19155w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f19156x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public float f19157y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Object f19158z;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class DimensionBehaviour {
        private static final /* synthetic */ DimensionBehaviour[] $VALUES;
        public static final DimensionBehaviour FIXED;
        public static final DimensionBehaviour MATCH_CONSTRAINT;
        public static final DimensionBehaviour MATCH_PARENT;
        public static final DimensionBehaviour WRAP_CONTENT;

        static {
            DimensionBehaviour dimensionBehaviour = new DimensionBehaviour("FIXED", 0);
            FIXED = dimensionBehaviour;
            DimensionBehaviour dimensionBehaviour2 = new DimensionBehaviour("WRAP_CONTENT", 1);
            WRAP_CONTENT = dimensionBehaviour2;
            DimensionBehaviour dimensionBehaviour3 = new DimensionBehaviour("MATCH_CONSTRAINT", 2);
            MATCH_CONSTRAINT = dimensionBehaviour3;
            DimensionBehaviour dimensionBehaviour4 = new DimensionBehaviour("MATCH_PARENT", 3);
            MATCH_PARENT = dimensionBehaviour4;
            $VALUES = new DimensionBehaviour[]{dimensionBehaviour, dimensionBehaviour2, dimensionBehaviour3, dimensionBehaviour4};
        }

        public DimensionBehaviour() {
            throw null;
        }

        public static DimensionBehaviour valueOf(String str) {
            return (DimensionBehaviour) Enum.valueOf(DimensionBehaviour.class, str);
        }

        public static DimensionBehaviour[] values() {
            return (DimensionBehaviour[]) $VALUES.clone();
        }
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19159a;

        static {
            int[] iArr = new int[ConstraintAnchor.Type.values().length];
            f19159a = iArr;
            try {
                iArr[ConstraintAnchor.Type.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19159a[ConstraintAnchor.Type.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19159a[ConstraintAnchor.Type.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19159a[ConstraintAnchor.Type.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19159a[ConstraintAnchor.Type.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19159a[ConstraintAnchor.Type.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19159a[ConstraintAnchor.Type.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f19159a[ConstraintAnchor.Type.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f19159a[ConstraintAnchor.Type.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public ConstraintWidget() {
        this.measured = false;
        this.run = new WidgetRun[2];
        this.mHorizontalRun = null;
        this.mVerticalRun = null;
        this.isTerminalWidget = new boolean[]{true, true};
        this.f19134a = true;
        this.f19135b = true;
        this.f19136c = -1;
        this.f19137d = -1;
        this.frame = new WidgetFrame(this);
        this.f19138e = false;
        this.f19139f = false;
        this.f19140g = false;
        this.f19141h = false;
        this.mHorizontalResolution = -1;
        this.mVerticalResolution = -1;
        this.f19142i = 0;
        this.mMatchConstraintDefaultWidth = 0;
        this.mMatchConstraintDefaultHeight = 0;
        this.mResolvedMatchConstraintDefault = new int[2];
        this.mMatchConstraintMinWidth = 0;
        this.mMatchConstraintMaxWidth = 0;
        this.mMatchConstraintPercentWidth = 1.0f;
        this.mMatchConstraintMinHeight = 0;
        this.mMatchConstraintMaxHeight = 0;
        this.mMatchConstraintPercentHeight = 1.0f;
        this.f19143j = -1;
        this.f19144k = 1.0f;
        this.f19145l = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.mCircleConstraintAngle = Float.NaN;
        this.m = false;
        this.f19147o = false;
        this.f19148p = 0;
        this.f19149q = 0;
        this.mLeft = new ConstraintAnchor(this, ConstraintAnchor.Type.LEFT);
        this.mTop = new ConstraintAnchor(this, ConstraintAnchor.Type.TOP);
        this.mRight = new ConstraintAnchor(this, ConstraintAnchor.Type.RIGHT);
        this.mBottom = new ConstraintAnchor(this, ConstraintAnchor.Type.BOTTOM);
        this.mBaseline = new ConstraintAnchor(this, ConstraintAnchor.Type.BASELINE);
        this.f19150r = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_X);
        this.f19151s = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_Y);
        ConstraintAnchor constraintAnchor = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER);
        this.mCenter = constraintAnchor;
        this.mListAnchors = new ConstraintAnchor[]{this.mLeft, this.mRight, this.mTop, this.mBottom, this.mBaseline, constraintAnchor};
        this.mAnchors = new ArrayList<>();
        this.f19152t = new boolean[2];
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.FIXED;
        this.mListDimensionBehaviors = new DimensionBehaviour[]{dimensionBehaviour, dimensionBehaviour};
        this.mParent = null;
        this.f19153u = 0;
        this.f19154v = 0;
        this.mDimensionRatio = 0.0f;
        this.mDimensionRatioSide = -1;
        this.mX = 0;
        this.mY = 0;
        this.mOffsetX = 0;
        this.mOffsetY = 0;
        this.f19155w = 0;
        float f6 = DEFAULT_BIAS;
        this.f19156x = f6;
        this.f19157y = f6;
        this.A = 0;
        this.B = 0;
        this.C = false;
        this.D = null;
        this.E = null;
        this.F = 0;
        this.G = 0;
        this.mWeight = new float[]{-1.0f, -1.0f};
        this.mListNextMatchConstraintsWidget = new ConstraintWidget[]{null, null};
        this.mNextChainWidget = new ConstraintWidget[]{null, null};
        this.H = null;
        this.I = null;
        this.horizontalGroup = -1;
        this.verticalGroup = -1;
        a();
    }

    public static void c(StringBuilder sb2, String str, int i10, int i11, int i12, int i13, int i14, float f6, DimensionBehaviour dimensionBehaviour) {
        sb2.append(str);
        sb2.append(" :  {\n");
        String string = dimensionBehaviour.toString();
        if (!DimensionBehaviour.FIXED.toString().equals(string)) {
            k.e(sb2, "      behavior", " :   ", string, ",\n");
        }
        g(sb2, i10, 0, "      size");
        g(sb2, i11, 0, "      min");
        g(sb2, i12, Integer.MAX_VALUE, "      max");
        g(sb2, i13, 0, "      matchMin");
        g(sb2, i14, 0, "      matchDef");
        h(sb2, "      matchPercent", f6, 1.0f);
        sb2.append("    },\n");
    }

    public static void d(StringBuilder sb2, String str, ConstraintAnchor constraintAnchor) {
        if (constraintAnchor.mTarget == null) {
            return;
        }
        sb2.append("    ");
        sb2.append(str);
        sb2.append(" : [ '");
        sb2.append(constraintAnchor.mTarget);
        sb2.append("'");
        if (constraintAnchor.f19132d != Integer.MIN_VALUE || constraintAnchor.mMargin != 0) {
            sb2.append(",");
            sb2.append(constraintAnchor.mMargin);
            if (constraintAnchor.f19132d != Integer.MIN_VALUE) {
                sb2.append(",");
                sb2.append(constraintAnchor.f19132d);
                sb2.append(",");
            }
        }
        sb2.append(" ] ,\n");
    }

    public static void f(StringBuilder sb2, String str, ConstraintAnchor constraintAnchor) {
        if (constraintAnchor.mTarget == null) {
            return;
        }
        sb2.append(str);
        sb2.append(" : [ '");
        sb2.append(constraintAnchor.mTarget);
        sb2.append("',");
        sb2.append(constraintAnchor.mMargin);
        sb2.append(",");
        sb2.append(constraintAnchor.f19132d);
        sb2.append(",");
        sb2.append(" ] ,\n");
    }

    public static void g(StringBuilder sb2, int i10, int i11, String str) {
        if (i10 == i11) {
            return;
        }
        sb2.append(str);
        sb2.append(" :   ");
        sb2.append(i10);
        sb2.append(",\n");
    }

    public static void h(StringBuilder sb2, String str, float f6, float f10) {
        if (f6 == f10) {
            return;
        }
        sb2.append(str);
        sb2.append(" :   ");
        sb2.append(f6);
        sb2.append(",\n");
    }

    public static void i(StringBuilder sb2, String str, float f6, int i10) {
        if (f6 == 0.0f) {
            return;
        }
        sb2.append(str);
        sb2.append(" :  [");
        sb2.append(f6);
        sb2.append(",");
        sb2.append(i10);
        sb2.append("");
        sb2.append("],\n");
    }

    public static void j(StringBuilder sb2, String str, int i10, int i11, int i12, int i13, int i14, int i15, float f6, float f10) {
        sb2.append(str);
        sb2.append(" :  {\n");
        g(sb2, i10, Integer.MIN_VALUE, "size");
        g(sb2, i11, 0, "min");
        g(sb2, i12, Integer.MAX_VALUE, VDVideoSelfieConfiguration.MAX);
        g(sb2, i14, 0, "matchMin");
        g(sb2, i15, 0, "matchDef");
        g(sb2, i15, 1, "matchPercent");
        h(sb2, "matchConstraintPercent", f6, 1.0f);
        h(sb2, "weight", f10, 1.0f);
        g(sb2, i13, 1, "override");
        sb2.append("},\n");
    }

    public final void a() {
        this.mAnchors.add(this.mLeft);
        this.mAnchors.add(this.mTop);
        this.mAnchors.add(this.mRight);
        this.mAnchors.add(this.mBottom);
        this.mAnchors.add(this.f19150r);
        this.mAnchors.add(this.f19151s);
        this.mAnchors.add(this.mCenter);
        this.mAnchors.add(this.mBaseline);
    }

    public void addChildrenToSolverByDependency(ConstraintWidgetContainer constraintWidgetContainer, LinearSystem linearSystem, HashSet<ConstraintWidget> hashSet, int i10, boolean z10) {
        if (z10) {
            if (!hashSet.contains(this)) {
                return;
            }
            Optimizer.a(constraintWidgetContainer, linearSystem, this);
            hashSet.remove(this);
            addToSolver(linearSystem, constraintWidgetContainer.optimizeFor(64));
        }
        if (i10 == 0) {
            HashSet<ConstraintAnchor> dependents = this.mLeft.getDependents();
            if (dependents != null) {
                Iterator<ConstraintAnchor> it = dependents.iterator();
                while (it.hasNext()) {
                    it.next().mOwner.addChildrenToSolverByDependency(constraintWidgetContainer, linearSystem, hashSet, i10, true);
                }
            }
            HashSet<ConstraintAnchor> dependents2 = this.mRight.getDependents();
            if (dependents2 != null) {
                Iterator<ConstraintAnchor> it2 = dependents2.iterator();
                while (it2.hasNext()) {
                    it2.next().mOwner.addChildrenToSolverByDependency(constraintWidgetContainer, linearSystem, hashSet, i10, true);
                }
                return;
            }
            return;
        }
        HashSet<ConstraintAnchor> dependents3 = this.mTop.getDependents();
        if (dependents3 != null) {
            Iterator<ConstraintAnchor> it3 = dependents3.iterator();
            while (it3.hasNext()) {
                it3.next().mOwner.addChildrenToSolverByDependency(constraintWidgetContainer, linearSystem, hashSet, i10, true);
            }
        }
        HashSet<ConstraintAnchor> dependents4 = this.mBottom.getDependents();
        if (dependents4 != null) {
            Iterator<ConstraintAnchor> it4 = dependents4.iterator();
            while (it4.hasNext()) {
                it4.next().mOwner.addChildrenToSolverByDependency(constraintWidgetContainer, linearSystem, hashSet, i10, true);
            }
        }
        HashSet<ConstraintAnchor> dependents5 = this.mBaseline.getDependents();
        if (dependents5 != null) {
            Iterator<ConstraintAnchor> it5 = dependents5.iterator();
            while (it5.hasNext()) {
                it5.next().mOwner.addChildrenToSolverByDependency(constraintWidgetContainer, linearSystem, hashSet, i10, true);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:191:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:193:0x02ec A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:195:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:198:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:19:0x004f  */
    /* JADX WARN: Code duplicated, block: B:202:0x0300  */
    /* JADX WARN: Code duplicated, block: B:205:0x030b  */
    /* JADX WARN: Code duplicated, block: B:208:0x0311  */
    /* JADX WARN: Code duplicated, block: B:210:0x0314  */
    /* JADX WARN: Code duplicated, block: B:211:0x0316  */
    /* JADX WARN: Code duplicated, block: B:214:0x032c  */
    /* JADX WARN: Code duplicated, block: B:223:0x0342  */
    /* JADX WARN: Code duplicated, block: B:235:0x0398  */
    /* JADX WARN: Code duplicated, block: B:238:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:239:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:242:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:243:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:246:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:247:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:251:0x044a  */
    /* JADX WARN: Code duplicated, block: B:267:0x049f  */
    /* JADX WARN: Code duplicated, block: B:271:0x04b3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:276:0x04c1  */
    /* JADX WARN: Code duplicated, block: B:279:0x04c7  */
    /* JADX WARN: Code duplicated, block: B:281:0x04ca  */
    /* JADX WARN: Code duplicated, block: B:284:0x04d0  */
    /* JADX WARN: Code duplicated, block: B:285:0x04d8  */
    /* JADX WARN: Code duplicated, block: B:288:0x04de  */
    /* JADX WARN: Code duplicated, block: B:289:0x04e6  */
    /* JADX WARN: Code duplicated, block: B:292:0x04ec  */
    /* JADX WARN: Code duplicated, block: B:294:0x04f0  */
    /* JADX WARN: Code duplicated, block: B:296:0x04f6  */
    /* JADX WARN: Code duplicated, block: B:298:0x0510  */
    /* JADX WARN: Code duplicated, block: B:300:0x051d  */
    /* JADX WARN: Code duplicated, block: B:302:0x0521  */
    /* JADX WARN: Code duplicated, block: B:303:0x0529  */
    /* JADX WARN: Code duplicated, block: B:307:0x0550  */
    /* JADX WARN: Code duplicated, block: B:308:0x0553  */
    /* JADX WARN: Code duplicated, block: B:310:0x0593  */
    /* JADX WARN: Code duplicated, block: B:312:0x0599  */
    /* JADX WARN: Code duplicated, block: B:314:0x05a2  */
    /* JADX WARN: Code duplicated, block: B:315:0x05b2  */
    /* JADX WARN: Code duplicated, block: B:316:0x05c2  */
    /* JADX WARN: Code duplicated, block: B:319:0x05cc  */
    /* JADX WARN: Code duplicated, block: B:321:0x05ee  */
    /* JADX WARN: Code duplicated, block: B:324:0x05f9  */
    /* JADX WARN: Code duplicated, block: B:326:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x018f  */
    /* JADX WARN: Multi-variable type inference failed */
    public void addToSolver(LinearSystem linearSystem, boolean z10) {
        boolean z11;
        boolean z12;
        ConstraintWidget constraintWidget;
        ConstraintWidget constraintWidget2;
        boolean z13;
        boolean z14;
        boolean[] zArr;
        int i10;
        boolean z15;
        int i11;
        boolean z16;
        DimensionBehaviour dimensionBehaviour;
        DimensionBehaviour dimensionBehaviour2;
        boolean z17;
        int i12;
        boolean z18;
        boolean z19;
        SolverVariable solverVariable;
        SolverVariable solverVariable2;
        LinearSystem linearSystem2;
        SolverVariable solverVariable3;
        SolverVariable solverVariable4;
        SolverVariable solverVariable5;
        int i13;
        int i14;
        char c10;
        int i15;
        ConstraintWidget constraintWidget3;
        Metrics metrics;
        ConstraintWidget constraintWidget4;
        boolean z20;
        ConstraintWidget constraintWidget5;
        SolverVariable solverVariableCreateObjectVariable;
        ConstraintWidget constraintWidget6;
        SolverVariable solverVariableCreateObjectVariable2;
        ConstraintAnchor constraintAnchor;
        boolean z21;
        DimensionBehaviour[] dimensionBehaviourArr;
        boolean z22;
        VerticalWidgetRun verticalWidgetRun;
        ConstraintWidget constraintWidget7;
        SolverVariable solverVariableCreateObjectVariable3;
        ConstraintWidget constraintWidget8;
        SolverVariable solverVariableCreateObjectVariable4;
        DimensionBehaviour[] dimensionBehaviourArr2;
        boolean z23;
        HorizontalWidgetRun horizontalWidgetRun;
        int i16;
        int i17;
        boolean zIsInHorizontalChain;
        boolean zIsInVerticalChain;
        HorizontalWidgetRun horizontalWidgetRun2;
        VerticalWidgetRun verticalWidgetRun2;
        boolean z24;
        SolverVariable solverVariableCreateObjectVariable5 = linearSystem.createObjectVariable(this.mLeft);
        SolverVariable solverVariableCreateObjectVariable6 = linearSystem.createObjectVariable(this.mRight);
        SolverVariable solverVariableCreateObjectVariable7 = linearSystem.createObjectVariable(this.mTop);
        SolverVariable solverVariableCreateObjectVariable8 = linearSystem.createObjectVariable(this.mBottom);
        SolverVariable solverVariableCreateObjectVariable9 = linearSystem.createObjectVariable(this.mBaseline);
        ConstraintWidget constraintWidget9 = this.mParent;
        if (constraintWidget9 == null) {
            z11 = false;
            z12 = false;
        } else {
            boolean z25 = constraintWidget9 != null && constraintWidget9.mListDimensionBehaviors[0] == DimensionBehaviour.WRAP_CONTENT;
            boolean z26 = constraintWidget9 != null && constraintWidget9.mListDimensionBehaviors[1] == DimensionBehaviour.WRAP_CONTENT;
            int i18 = this.f19142i;
            if (i18 == 1) {
                z11 = z25;
                z12 = false;
            } else if (i18 == 2) {
                z12 = z26;
                z11 = false;
            } else if (i18 != 3) {
                z12 = z26;
                z11 = z25;
            } else {
                z11 = false;
                z12 = false;
            }
        }
        int i19 = this.B;
        boolean[] zArr2 = this.f19152t;
        if (i19 != 8 || this.C || hasDependencies() || zArr2[0] || zArr2[1]) {
            boolean z27 = this.f19138e;
            if (z27 || this.f19139f) {
                boolean z28 = this.f19135b;
                if (z27) {
                    linearSystem.addEquality(solverVariableCreateObjectVariable5, this.mX);
                    linearSystem.addEquality(solverVariableCreateObjectVariable6, this.mX + this.f19153u);
                    if (z11 && (constraintWidget2 = this.mParent) != null) {
                        if (z28) {
                            ConstraintWidgetContainer constraintWidgetContainer = (ConstraintWidgetContainer) constraintWidget2;
                            constraintWidgetContainer.addHorizontalWrapMinVariable(this.mLeft);
                            constraintWidgetContainer.addHorizontalWrapMaxVariable(this.mRight);
                        } else {
                            linearSystem.addGreaterThan(linearSystem.createObjectVariable(constraintWidget2.mRight), solverVariableCreateObjectVariable6, 0, 5);
                        }
                    }
                }
                if (this.f19139f) {
                    linearSystem.addEquality(solverVariableCreateObjectVariable7, this.mY);
                    linearSystem.addEquality(solverVariableCreateObjectVariable8, this.mY + this.f19154v);
                    if (this.mBaseline.hasDependents()) {
                        linearSystem.addEquality(solverVariableCreateObjectVariable9, this.mY + this.f19155w);
                    }
                    if (z12 && (constraintWidget = this.mParent) != null) {
                        if (z28) {
                            ConstraintWidgetContainer constraintWidgetContainer2 = (ConstraintWidgetContainer) constraintWidget;
                            constraintWidgetContainer2.m(this.mTop);
                            constraintWidgetContainer2.l(this.mBottom);
                        } else {
                            linearSystem.addGreaterThan(linearSystem.createObjectVariable(constraintWidget.mBottom), solverVariableCreateObjectVariable8, 0, 5);
                        }
                    }
                }
                if (this.f19138e && this.f19139f) {
                    this.f19138e = false;
                    this.f19139f = false;
                    return;
                }
            }
            Metrics metrics2 = LinearSystem.sMetrics;
            if (metrics2 != null) {
                metrics2.widgets++;
            }
            if (z10 && (horizontalWidgetRun2 = this.mHorizontalRun) != null && (verticalWidgetRun2 = this.mVerticalRun) != null) {
                DependencyNode dependencyNode = horizontalWidgetRun2.start;
                if (dependencyNode.resolved && horizontalWidgetRun2.end.resolved && verticalWidgetRun2.start.resolved && verticalWidgetRun2.end.resolved) {
                    if (metrics2 != null) {
                        metrics2.graphSolved++;
                    }
                    linearSystem.addEquality(solverVariableCreateObjectVariable5, dependencyNode.value);
                    linearSystem.addEquality(solverVariableCreateObjectVariable6, this.mHorizontalRun.end.value);
                    linearSystem.addEquality(solverVariableCreateObjectVariable7, this.mVerticalRun.start.value);
                    linearSystem.addEquality(solverVariableCreateObjectVariable8, this.mVerticalRun.end.value);
                    linearSystem.addEquality(solverVariableCreateObjectVariable9, this.mVerticalRun.baseline.value);
                    if (this.mParent == null) {
                        z24 = false;
                    } else {
                        if (z11 && this.isTerminalWidget[0] && !isInHorizontalChain()) {
                            linearSystem.addGreaterThan(linearSystem.createObjectVariable(this.mParent.mRight), solverVariableCreateObjectVariable6, 0, 8);
                        }
                        if (z12 && this.isTerminalWidget[1] && !isInVerticalChain()) {
                            z24 = false;
                            linearSystem.addGreaterThan(linearSystem.createObjectVariable(this.mParent.mBottom), solverVariableCreateObjectVariable8, 0, 8);
                        } else {
                            z24 = false;
                        }
                    }
                    this.f19138e = z24;
                    this.f19139f = z24;
                    return;
                }
            }
            if (metrics2 != null) {
                metrics2.linearSolved++;
            }
            if (this.mParent != null) {
                if (e(0)) {
                    ((ConstraintWidgetContainer) this.mParent).k(this, 0);
                    zIsInHorizontalChain = true;
                } else {
                    zIsInHorizontalChain = isInHorizontalChain();
                }
                if (e(1)) {
                    ((ConstraintWidgetContainer) this.mParent).k(this, 1);
                    zIsInVerticalChain = true;
                } else {
                    zIsInVerticalChain = isInVerticalChain();
                }
                if (!zIsInHorizontalChain && z11 && this.B != 8 && this.mLeft.mTarget == null && this.mRight.mTarget == null) {
                    linearSystem.addGreaterThan(linearSystem.createObjectVariable(this.mParent.mRight), solverVariableCreateObjectVariable6, 0, 1);
                }
                if (!zIsInVerticalChain && z12 && this.B != 8 && this.mTop.mTarget == null && this.mBottom.mTarget == null && this.mBaseline == null) {
                    linearSystem.addGreaterThan(linearSystem.createObjectVariable(this.mParent.mBottom), solverVariableCreateObjectVariable8, 0, 1);
                }
                z14 = zIsInHorizontalChain;
                z13 = zIsInVerticalChain;
            } else {
                z13 = false;
                z14 = false;
            }
            int i20 = this.f19153u;
            int i21 = this.mMinWidth;
            if (i20 >= i21) {
                i21 = i20;
            }
            int i22 = this.f19154v;
            int i23 = this.mMinHeight;
            if (i22 >= i23) {
                i23 = i22;
            }
            DimensionBehaviour[] dimensionBehaviourArr3 = this.mListDimensionBehaviors;
            DimensionBehaviour dimensionBehaviour3 = dimensionBehaviourArr3[0];
            DimensionBehaviour dimensionBehaviour4 = DimensionBehaviour.MATCH_CONSTRAINT;
            int i24 = i21;
            boolean z29 = dimensionBehaviour3 != dimensionBehaviour4;
            DimensionBehaviour dimensionBehaviour5 = dimensionBehaviourArr3[1];
            int i25 = i23;
            boolean z30 = dimensionBehaviour5 != dimensionBehaviour4;
            int i26 = this.mDimensionRatioSide;
            this.f19143j = i26;
            float f6 = this.mDimensionRatio;
            this.f19144k = f6;
            int i27 = this.mMatchConstraintDefaultWidth;
            int i28 = this.mMatchConstraintDefaultHeight;
            if (f6 > 0.0f) {
                zArr = zArr2;
                if (this.B != 8) {
                    if (dimensionBehaviour3 == dimensionBehaviour4 && i27 == 0) {
                        i27 = 3;
                    }
                    if (dimensionBehaviour5 == dimensionBehaviour4 && i28 == 0) {
                        i28 = 3;
                    }
                    if (dimensionBehaviour3 == dimensionBehaviour4 && dimensionBehaviour5 == dimensionBehaviour4) {
                        i17 = 3;
                        if (i27 == 3 && i28 == 3) {
                            setupDimensionRatio(z11, z12, z29, z30);
                        }
                        i24 = i24;
                        i10 = i25;
                        z15 = true;
                        int[] iArr = this.mResolvedMatchConstraintDefault;
                        iArr[0] = i27;
                        iArr[1] = i28;
                        if (z15) {
                            int i29 = this.f19143j;
                            i11 = -1;
                            boolean z31 = i29 != 0 || i29 == -1;
                            if (z15 || !((i16 = this.f19143j) == 1 || i16 == i11)) {
                                z16 = false;
                            } else {
                                z16 = true;
                            }
                            dimensionBehaviour = this.mListDimensionBehaviors[0];
                            dimensionBehaviour2 = DimensionBehaviour.WRAP_CONTENT;
                            if (dimensionBehaviour == dimensionBehaviour2 || !(this instanceof ConstraintWidgetContainer)) {
                                z17 = false;
                            } else {
                                z17 = true;
                            }
                            if (z17) {
                                i12 = 0;
                            } else {
                                i12 = i24;
                            }
                            z18 = !this.mCenter.isConnected();
                            boolean z32 = zArr[0];
                            z19 = zArr[1];
                            if (this.mHorizontalResolution != 2 || this.f19138e) {
                                solverVariable = solverVariableCreateObjectVariable6;
                                solverVariable2 = solverVariableCreateObjectVariable5;
                            } else if (!z10 || (horizontalWidgetRun = this.mHorizontalRun) == null) {
                                constraintWidget7 = this.mParent;
                                if (constraintWidget7 != null) {
                                    solverVariableCreateObjectVariable3 = linearSystem.createObjectVariable(constraintWidget7.mRight);
                                } else {
                                    solverVariableCreateObjectVariable3 = null;
                                }
                                constraintWidget8 = this.mParent;
                                if (constraintWidget8 != null) {
                                    solverVariableCreateObjectVariable4 = linearSystem.createObjectVariable(constraintWidget8.mLeft);
                                } else {
                                    solverVariableCreateObjectVariable4 = null;
                                }
                                boolean z33 = this.isTerminalWidget[0];
                                dimensionBehaviourArr2 = this.mListDimensionBehaviors;
                                DimensionBehaviour dimensionBehaviour6 = dimensionBehaviourArr2[0];
                                ConstraintAnchor constraintAnchor2 = this.mLeft;
                                ConstraintAnchor constraintAnchor3 = this.mRight;
                                int i30 = this.mX;
                                int i31 = this.mMinWidth;
                                int i32 = this.f19145l[0];
                                float f10 = this.f19156x;
                                if (dimensionBehaviourArr2[1] == dimensionBehaviour4) {
                                    z23 = true;
                                } else {
                                    z23 = false;
                                }
                                solverVariable = solverVariableCreateObjectVariable6;
                                solverVariable2 = solverVariableCreateObjectVariable5;
                                b(linearSystem, true, z11, z12, z33, solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable3, dimensionBehaviour6, z17, constraintAnchor2, constraintAnchor3, i30, i12, i31, i32, f10, z31, z23, z14, z13, z32, i27, i28, this.mMatchConstraintMinWidth, this.mMatchConstraintMaxWidth, this.mMatchConstraintPercentWidth, z18);
                            } else {
                                DependencyNode dependencyNode2 = horizontalWidgetRun.start;
                                if (!dependencyNode2.resolved || !horizontalWidgetRun.end.resolved) {
                                    constraintWidget7 = this.mParent;
                                    if (constraintWidget7 != null) {
                                        solverVariableCreateObjectVariable3 = linearSystem.createObjectVariable(constraintWidget7.mRight);
                                    } else {
                                        solverVariableCreateObjectVariable3 = null;
                                    }
                                    constraintWidget8 = this.mParent;
                                    if (constraintWidget8 != null) {
                                        solverVariableCreateObjectVariable4 = linearSystem.createObjectVariable(constraintWidget8.mLeft);
                                    } else {
                                        solverVariableCreateObjectVariable4 = null;
                                    }
                                    boolean z34 = this.isTerminalWidget[0];
                                    dimensionBehaviourArr2 = this.mListDimensionBehaviors;
                                    DimensionBehaviour dimensionBehaviour7 = dimensionBehaviourArr2[0];
                                    ConstraintAnchor constraintAnchor4 = this.mLeft;
                                    ConstraintAnchor constraintAnchor5 = this.mRight;
                                    int i33 = this.mX;
                                    int i34 = this.mMinWidth;
                                    int i35 = this.f19145l[0];
                                    float f11 = this.f19156x;
                                    if (dimensionBehaviourArr2[1] == dimensionBehaviour4) {
                                        z23 = true;
                                    } else {
                                        z23 = false;
                                    }
                                    solverVariable = solverVariableCreateObjectVariable6;
                                    solverVariable2 = solverVariableCreateObjectVariable5;
                                    b(linearSystem, true, z11, z12, z34, solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable3, dimensionBehaviour7, z17, constraintAnchor4, constraintAnchor5, i33, i12, i34, i35, f11, z31, z23, z14, z13, z32, i27, i28, this.mMatchConstraintMinWidth, this.mMatchConstraintMaxWidth, this.mMatchConstraintPercentWidth, z18);
                                } else if (z10) {
                                    linearSystem.addEquality(solverVariableCreateObjectVariable5, dependencyNode2.value);
                                    linearSystem.addEquality(solverVariableCreateObjectVariable6, this.mHorizontalRun.end.value);
                                    if (this.mParent != null && z11 && this.isTerminalWidget[0] && !isInHorizontalChain()) {
                                        linearSystem.addGreaterThan(linearSystem.createObjectVariable(this.mParent.mRight), solverVariableCreateObjectVariable6, 0, 8);
                                    }
                                    solverVariable2 = solverVariableCreateObjectVariable5;
                                    solverVariable = solverVariableCreateObjectVariable6;
                                } else {
                                    solverVariable = solverVariableCreateObjectVariable6;
                                    solverVariable2 = solverVariableCreateObjectVariable5;
                                }
                            }
                            if (z10 || (verticalWidgetRun = this.mVerticalRun) == null) {
                                linearSystem2 = linearSystem;
                                solverVariable3 = r27;
                                solverVariable4 = r30;
                                solverVariable5 = r19;
                                i13 = 8;
                                i14 = 0;
                                c10 = 1;
                                i15 = 1;
                            } else {
                                DependencyNode dependencyNode3 = verticalWidgetRun.start;
                                if (dependencyNode3.resolved && verticalWidgetRun.end.resolved) {
                                    LinearSystem linearSystem3 = linearSystem;
                                    solverVariable5 = solverVariableCreateObjectVariable7;
                                    linearSystem3.addEquality(solverVariable5, dependencyNode3.value);
                                    solverVariable4 = solverVariableCreateObjectVariable8;
                                    linearSystem3.addEquality(solverVariable4, this.mVerticalRun.end.value);
                                    solverVariable3 = solverVariableCreateObjectVariable9;
                                    linearSystem3.addEquality(solverVariable3, this.mVerticalRun.baseline.value);
                                    ConstraintWidget constraintWidget10 = this.mParent;
                                    if (constraintWidget10 == null || z13 || !z12) {
                                        i13 = 8;
                                        i14 = 0;
                                        c10 = 1;
                                    } else {
                                        c10 = 1;
                                        if (this.isTerminalWidget[1]) {
                                            i13 = 8;
                                            i14 = 0;
                                            linearSystem3.addGreaterThan(linearSystem3.createObjectVariable(constraintWidget10.mBottom), solverVariable4, 0, 8);
                                        } else {
                                            i13 = 8;
                                            i14 = 0;
                                        }
                                    }
                                    i15 = i14;
                                    linearSystem2 = linearSystem3;
                                } else {
                                    linearSystem2 = linearSystem;
                                    solverVariable3 = r27;
                                    solverVariable4 = r30;
                                    solverVariable5 = r19;
                                    i13 = 8;
                                    i14 = 0;
                                    c10 = 1;
                                    i15 = 1;
                                }
                            }
                            if (this.mVerticalResolution != 2 && i15 != 0 && !this.f19139f) {
                                if (this.mListDimensionBehaviors[c10] == dimensionBehaviour2 || !(this instanceof ConstraintWidgetContainer)) {
                                    z20 = i14;
                                } else {
                                    z20 = c10;
                                }
                                if (z20 != 0) {
                                    i10 = i14;
                                }
                                constraintWidget5 = this.mParent;
                                if (constraintWidget5 != null) {
                                    solverVariableCreateObjectVariable = linearSystem2.createObjectVariable(constraintWidget5.mBottom);
                                } else {
                                    solverVariableCreateObjectVariable = null;
                                }
                                constraintWidget6 = this.mParent;
                                if (constraintWidget6 != null) {
                                    solverVariableCreateObjectVariable2 = linearSystem2.createObjectVariable(constraintWidget6.mTop);
                                } else {
                                    solverVariableCreateObjectVariable2 = null;
                                }
                                if (this.f19155w <= 0 || this.B == i13) {
                                    constraintAnchor = this.mBaseline;
                                    if (constraintAnchor.mTarget != null) {
                                        linearSystem2.addEquality(solverVariable3, solverVariable5, getBaselineDistance(), i13);
                                        linearSystem2.addEquality(solverVariable3, linearSystem2.createObjectVariable(this.mBaseline.mTarget), this.mBaseline.getMargin(), i13);
                                        if (z12 != 0) {
                                            linearSystem2.addGreaterThan(solverVariableCreateObjectVariable, linearSystem2.createObjectVariable(this.mBottom), i14, 5);
                                        }
                                        z21 = i14;
                                    } else {
                                        if (this.B == i13) {
                                            linearSystem2.addEquality(solverVariable3, solverVariable5, constraintAnchor.getMargin(), i13);
                                        } else {
                                            linearSystem2.addEquality(solverVariable3, solverVariable5, getBaselineDistance(), i13);
                                        }
                                        z21 = z18;
                                    }
                                } else {
                                    z21 = z18;
                                }
                                boolean z35 = this.isTerminalWidget[c10];
                                dimensionBehaviourArr = this.mListDimensionBehaviors;
                                DimensionBehaviour dimensionBehaviour8 = dimensionBehaviourArr[c10];
                                ConstraintAnchor constraintAnchor6 = this.mTop;
                                ConstraintAnchor constraintAnchor7 = this.mBottom;
                                int i36 = this.mY;
                                int i37 = this.mMinHeight;
                                int i38 = this.f19145l[c10];
                                float f12 = this.f19157y;
                                if (dimensionBehaviourArr[0] == dimensionBehaviour4) {
                                    z22 = true;
                                } else {
                                    z22 = false;
                                }
                                b(linearSystem, false, z12, z11, z35, solverVariableCreateObjectVariable2, solverVariableCreateObjectVariable, dimensionBehaviour8, z20, constraintAnchor6, constraintAnchor7, i36, i10, i37, i38, f12, z16, z22, z13, z14, z19, i28, i27, this.mMatchConstraintMinHeight, this.mMatchConstraintMaxHeight, this.mMatchConstraintPercentHeight, z21);
                            }
                            if (z15) {
                                constraintWidget4 = this;
                                if (constraintWidget4.f19143j == 1) {
                                    linearSystem.addRatio(solverVariable4, solverVariable5, solverVariable, solverVariable2, constraintWidget4.f19144k, 8);
                                    constraintWidget3 = constraintWidget4;
                                } else {
                                    linearSystem.addRatio(solverVariable, solverVariable2, solverVariable4, solverVariable5, constraintWidget4.f19144k, 8);
                                    constraintWidget3 = constraintWidget4;
                                }
                            } else {
                                constraintWidget3 = this;
                            }
                            if (constraintWidget3.mCenter.isConnected()) {
                                linearSystem.addCenterPoint(constraintWidget3, constraintWidget3.mCenter.getTarget().getOwner(), (float) Math.toRadians(constraintWidget3.mCircleConstraintAngle + 90.0f), constraintWidget3.mCenter.getMargin());
                            }
                            constraintWidget3.f19138e = false;
                            constraintWidget3.f19139f = false;
                            metrics = LinearSystem.sMetrics;
                            if (metrics != null) {
                                metrics.mEquations = linearSystem.getNumEquations();
                                LinearSystem.sMetrics.mVariables = linearSystem.getNumVariables();
                            }
                        }
                        i11 = -1;
                        if (z15) {
                            z16 = false;
                        } else {
                            z16 = false;
                        }
                        dimensionBehaviour = this.mListDimensionBehaviors[0];
                        dimensionBehaviour2 = DimensionBehaviour.WRAP_CONTENT;
                        if (dimensionBehaviour == dimensionBehaviour2) {
                            z17 = false;
                        } else {
                            z17 = false;
                        }
                        if (z17) {
                            i12 = 0;
                        } else {
                            i12 = i24;
                        }
                        z18 = !this.mCenter.isConnected();
                        boolean z36 = zArr[0];
                        z19 = zArr[1];
                        if (this.mHorizontalResolution != 2) {
                            solverVariable = solverVariableCreateObjectVariable6;
                            solverVariable2 = solverVariableCreateObjectVariable5;
                        } else {
                            solverVariable = solverVariableCreateObjectVariable6;
                            solverVariable2 = solverVariableCreateObjectVariable5;
                        }
                        if (z10) {
                            linearSystem2 = linearSystem;
                            solverVariable3 = r27;
                            solverVariable4 = r30;
                            solverVariable5 = r19;
                            i13 = 8;
                            i14 = 0;
                            c10 = 1;
                            i15 = 1;
                        } else {
                            linearSystem2 = linearSystem;
                            solverVariable3 = r27;
                            solverVariable4 = r30;
                            solverVariable5 = r19;
                            i13 = 8;
                            i14 = 0;
                            c10 = 1;
                            i15 = 1;
                        }
                        if (this.mVerticalResolution != 2) {
                            if (this.mListDimensionBehaviors[c10] == dimensionBehaviour2) {
                                z20 = i14;
                            } else {
                                z20 = i14;
                            }
                            if (z20 != 0) {
                                i10 = i14;
                            }
                            constraintWidget5 = this.mParent;
                            if (constraintWidget5 != null) {
                                solverVariableCreateObjectVariable = linearSystem2.createObjectVariable(constraintWidget5.mBottom);
                            } else {
                                solverVariableCreateObjectVariable = null;
                            }
                            constraintWidget6 = this.mParent;
                            if (constraintWidget6 != null) {
                                solverVariableCreateObjectVariable2 = linearSystem2.createObjectVariable(constraintWidget6.mTop);
                            } else {
                                solverVariableCreateObjectVariable2 = null;
                            }
                            if (this.f19155w <= 0) {
                                constraintAnchor = this.mBaseline;
                                if (constraintAnchor.mTarget != null) {
                                    linearSystem2.addEquality(solverVariable3, solverVariable5, getBaselineDistance(), i13);
                                    linearSystem2.addEquality(solverVariable3, linearSystem2.createObjectVariable(this.mBaseline.mTarget), this.mBaseline.getMargin(), i13);
                                    if (z12 != 0) {
                                        linearSystem2.addGreaterThan(solverVariableCreateObjectVariable, linearSystem2.createObjectVariable(this.mBottom), i14, 5);
                                    }
                                    z21 = i14;
                                } else {
                                    if (this.B == i13) {
                                        linearSystem2.addEquality(solverVariable3, solverVariable5, constraintAnchor.getMargin(), i13);
                                    } else {
                                        linearSystem2.addEquality(solverVariable3, solverVariable5, getBaselineDistance(), i13);
                                    }
                                    z21 = z18;
                                }
                            } else {
                                constraintAnchor = this.mBaseline;
                                if (constraintAnchor.mTarget != null) {
                                    linearSystem2.addEquality(solverVariable3, solverVariable5, getBaselineDistance(), i13);
                                    linearSystem2.addEquality(solverVariable3, linearSystem2.createObjectVariable(this.mBaseline.mTarget), this.mBaseline.getMargin(), i13);
                                    if (z12 != 0) {
                                        linearSystem2.addGreaterThan(solverVariableCreateObjectVariable, linearSystem2.createObjectVariable(this.mBottom), i14, 5);
                                    }
                                    z21 = i14;
                                } else {
                                    if (this.B == i13) {
                                        linearSystem2.addEquality(solverVariable3, solverVariable5, constraintAnchor.getMargin(), i13);
                                    } else {
                                        linearSystem2.addEquality(solverVariable3, solverVariable5, getBaselineDistance(), i13);
                                    }
                                    z21 = z18;
                                }
                            }
                            boolean z37 = this.isTerminalWidget[c10];
                            dimensionBehaviourArr = this.mListDimensionBehaviors;
                            DimensionBehaviour dimensionBehaviour9 = dimensionBehaviourArr[c10];
                            ConstraintAnchor constraintAnchor8 = this.mTop;
                            ConstraintAnchor constraintAnchor9 = this.mBottom;
                            int i39 = this.mY;
                            int i310 = this.mMinHeight;
                            int i311 = this.f19145l[c10];
                            float f13 = this.f19157y;
                            if (dimensionBehaviourArr[0] == dimensionBehaviour4) {
                                z22 = true;
                            } else {
                                z22 = false;
                            }
                            b(linearSystem, false, z12, z11, z37, solverVariableCreateObjectVariable2, solverVariableCreateObjectVariable, dimensionBehaviour9, z20, constraintAnchor8, constraintAnchor9, i39, i10, i310, i311, f13, z16, z22, z13, z14, z19, i28, i27, this.mMatchConstraintMinHeight, this.mMatchConstraintMaxHeight, this.mMatchConstraintPercentHeight, z21);
                        }
                        if (z15) {
                            constraintWidget4 = this;
                            if (constraintWidget4.f19143j == 1) {
                                linearSystem.addRatio(solverVariable4, solverVariable5, solverVariable, solverVariable2, constraintWidget4.f19144k, 8);
                                constraintWidget3 = constraintWidget4;
                            } else {
                                linearSystem.addRatio(solverVariable, solverVariable2, solverVariable4, solverVariable5, constraintWidget4.f19144k, 8);
                                constraintWidget3 = constraintWidget4;
                            }
                        } else {
                            constraintWidget3 = this;
                        }
                        if (constraintWidget3.mCenter.isConnected()) {
                            linearSystem.addCenterPoint(constraintWidget3, constraintWidget3.mCenter.getTarget().getOwner(), (float) Math.toRadians(constraintWidget3.mCircleConstraintAngle + 90.0f), constraintWidget3.mCenter.getMargin());
                        }
                        constraintWidget3.f19138e = false;
                        constraintWidget3.f19139f = false;
                        metrics = LinearSystem.sMetrics;
                        if (metrics != null) {
                            metrics.mEquations = linearSystem.getNumEquations();
                            LinearSystem.sMetrics.mVariables = linearSystem.getNumVariables();
                        }
                    }
                    i17 = 3;
                    if (dimensionBehaviour3 == dimensionBehaviour4 && i27 == i17) {
                        this.f19143j = 0;
                        int i40 = (int) (f6 * i22);
                        if (dimensionBehaviour5 != dimensionBehaviour4) {
                            i27 = 4;
                            i28 = i28;
                            i10 = i25;
                            z15 = false;
                            i24 = i40;
                        } else {
                            i24 = i40;
                            i10 = i25;
                            z15 = true;
                        }
                    } else {
                        if (dimensionBehaviour5 == dimensionBehaviour4 && i28 == i17) {
                            this.f19143j = 1;
                            if (i26 == -1) {
                                this.f19144k = 1.0f / f6;
                            }
                            int i41 = (int) (this.f19144k * i20);
                            if (dimensionBehaviour3 != dimensionBehaviour4) {
                                i28 = 4;
                                i10 = i41;
                                i27 = i27;
                            } else {
                                i10 = i41;
                                i27 = i27;
                                i28 = i28;
                                i24 = i24;
                            }
                        } else {
                            i24 = i24;
                            i10 = i25;
                        }
                        z15 = true;
                    }
                    int[] iArr2 = this.mResolvedMatchConstraintDefault;
                    iArr2[0] = i27;
                    iArr2[1] = i28;
                    if (z15) {
                        int i210 = this.f19143j;
                        i11 = -1;
                        if (i210 != 0) {
                        }
                        if (z15) {
                            z16 = false;
                        } else {
                            z16 = false;
                        }
                        dimensionBehaviour = this.mListDimensionBehaviors[0];
                        dimensionBehaviour2 = DimensionBehaviour.WRAP_CONTENT;
                        if (dimensionBehaviour == dimensionBehaviour2) {
                            z17 = false;
                        } else {
                            z17 = false;
                        }
                        if (z17) {
                            i12 = 0;
                        } else {
                            i12 = i24;
                        }
                        z18 = !this.mCenter.isConnected();
                        boolean z38 = zArr[0];
                        z19 = zArr[1];
                        if (this.mHorizontalResolution != 2) {
                            solverVariable = solverVariableCreateObjectVariable6;
                            solverVariable2 = solverVariableCreateObjectVariable5;
                        } else {
                            solverVariable = solverVariableCreateObjectVariable6;
                            solverVariable2 = solverVariableCreateObjectVariable5;
                        }
                        if (z10) {
                            linearSystem2 = linearSystem;
                            solverVariable3 = r27;
                            solverVariable4 = r30;
                            solverVariable5 = r19;
                            i13 = 8;
                            i14 = 0;
                            c10 = 1;
                            i15 = 1;
                        } else {
                            linearSystem2 = linearSystem;
                            solverVariable3 = r27;
                            solverVariable4 = r30;
                            solverVariable5 = r19;
                            i13 = 8;
                            i14 = 0;
                            c10 = 1;
                            i15 = 1;
                        }
                        if (this.mVerticalResolution != 2) {
                            if (this.mListDimensionBehaviors[c10] == dimensionBehaviour2) {
                                z20 = i14;
                            } else {
                                z20 = i14;
                            }
                            if (z20 != 0) {
                                i10 = i14;
                            }
                            constraintWidget5 = this.mParent;
                            if (constraintWidget5 != null) {
                                solverVariableCreateObjectVariable = linearSystem2.createObjectVariable(constraintWidget5.mBottom);
                            } else {
                                solverVariableCreateObjectVariable = null;
                            }
                            constraintWidget6 = this.mParent;
                            if (constraintWidget6 != null) {
                                solverVariableCreateObjectVariable2 = linearSystem2.createObjectVariable(constraintWidget6.mTop);
                            } else {
                                solverVariableCreateObjectVariable2 = null;
                            }
                            if (this.f19155w <= 0) {
                                constraintAnchor = this.mBaseline;
                                if (constraintAnchor.mTarget != null) {
                                    linearSystem2.addEquality(solverVariable3, solverVariable5, getBaselineDistance(), i13);
                                    linearSystem2.addEquality(solverVariable3, linearSystem2.createObjectVariable(this.mBaseline.mTarget), this.mBaseline.getMargin(), i13);
                                    if (z12 != 0) {
                                        linearSystem2.addGreaterThan(solverVariableCreateObjectVariable, linearSystem2.createObjectVariable(this.mBottom), i14, 5);
                                    }
                                    z21 = i14;
                                } else {
                                    if (this.B == i13) {
                                        linearSystem2.addEquality(solverVariable3, solverVariable5, constraintAnchor.getMargin(), i13);
                                    } else {
                                        linearSystem2.addEquality(solverVariable3, solverVariable5, getBaselineDistance(), i13);
                                    }
                                    z21 = z18;
                                }
                            } else {
                                constraintAnchor = this.mBaseline;
                                if (constraintAnchor.mTarget != null) {
                                    linearSystem2.addEquality(solverVariable3, solverVariable5, getBaselineDistance(), i13);
                                    linearSystem2.addEquality(solverVariable3, linearSystem2.createObjectVariable(this.mBaseline.mTarget), this.mBaseline.getMargin(), i13);
                                    if (z12 != 0) {
                                        linearSystem2.addGreaterThan(solverVariableCreateObjectVariable, linearSystem2.createObjectVariable(this.mBottom), i14, 5);
                                    }
                                    z21 = i14;
                                } else {
                                    if (this.B == i13) {
                                        linearSystem2.addEquality(solverVariable3, solverVariable5, constraintAnchor.getMargin(), i13);
                                    } else {
                                        linearSystem2.addEquality(solverVariable3, solverVariable5, getBaselineDistance(), i13);
                                    }
                                    z21 = z18;
                                }
                            }
                            boolean z39 = this.isTerminalWidget[c10];
                            dimensionBehaviourArr = this.mListDimensionBehaviors;
                            DimensionBehaviour dimensionBehaviour10 = dimensionBehaviourArr[c10];
                            ConstraintAnchor constraintAnchor10 = this.mTop;
                            ConstraintAnchor constraintAnchor11 = this.mBottom;
                            int i312 = this.mY;
                            int i313 = this.mMinHeight;
                            int i314 = this.f19145l[c10];
                            float f14 = this.f19157y;
                            if (dimensionBehaviourArr[0] == dimensionBehaviour4) {
                                z22 = true;
                            } else {
                                z22 = false;
                            }
                            b(linearSystem, false, z12, z11, z39, solverVariableCreateObjectVariable2, solverVariableCreateObjectVariable, dimensionBehaviour10, z20, constraintAnchor10, constraintAnchor11, i312, i10, i313, i314, f14, z16, z22, z13, z14, z19, i28, i27, this.mMatchConstraintMinHeight, this.mMatchConstraintMaxHeight, this.mMatchConstraintPercentHeight, z21);
                        }
                        if (z15) {
                            constraintWidget4 = this;
                            if (constraintWidget4.f19143j == 1) {
                                linearSystem.addRatio(solverVariable4, solverVariable5, solverVariable, solverVariable2, constraintWidget4.f19144k, 8);
                                constraintWidget3 = constraintWidget4;
                            } else {
                                linearSystem.addRatio(solverVariable, solverVariable2, solverVariable4, solverVariable5, constraintWidget4.f19144k, 8);
                                constraintWidget3 = constraintWidget4;
                            }
                        } else {
                            constraintWidget3 = this;
                        }
                        if (constraintWidget3.mCenter.isConnected()) {
                            linearSystem.addCenterPoint(constraintWidget3, constraintWidget3.mCenter.getTarget().getOwner(), (float) Math.toRadians(constraintWidget3.mCircleConstraintAngle + 90.0f), constraintWidget3.mCenter.getMargin());
                        }
                        constraintWidget3.f19138e = false;
                        constraintWidget3.f19139f = false;
                        metrics = LinearSystem.sMetrics;
                        if (metrics != null) {
                            metrics.mEquations = linearSystem.getNumEquations();
                            LinearSystem.sMetrics.mVariables = linearSystem.getNumVariables();
                        }
                    }
                    i11 = -1;
                    if (z15) {
                        z16 = false;
                    } else {
                        z16 = false;
                    }
                    dimensionBehaviour = this.mListDimensionBehaviors[0];
                    dimensionBehaviour2 = DimensionBehaviour.WRAP_CONTENT;
                    if (dimensionBehaviour == dimensionBehaviour2) {
                        z17 = false;
                    } else {
                        z17 = false;
                    }
                    if (z17) {
                        i12 = 0;
                    } else {
                        i12 = i24;
                    }
                    z18 = !this.mCenter.isConnected();
                    boolean z310 = zArr[0];
                    z19 = zArr[1];
                    if (this.mHorizontalResolution != 2) {
                        solverVariable = solverVariableCreateObjectVariable6;
                        solverVariable2 = solverVariableCreateObjectVariable5;
                    } else {
                        solverVariable = solverVariableCreateObjectVariable6;
                        solverVariable2 = solverVariableCreateObjectVariable5;
                    }
                    if (z10) {
                        linearSystem2 = linearSystem;
                        solverVariable3 = r27;
                        solverVariable4 = r30;
                        solverVariable5 = r19;
                        i13 = 8;
                        i14 = 0;
                        c10 = 1;
                        i15 = 1;
                    } else {
                        linearSystem2 = linearSystem;
                        solverVariable3 = r27;
                        solverVariable4 = r30;
                        solverVariable5 = r19;
                        i13 = 8;
                        i14 = 0;
                        c10 = 1;
                        i15 = 1;
                    }
                    if (this.mVerticalResolution != 2) {
                        if (this.mListDimensionBehaviors[c10] == dimensionBehaviour2) {
                            z20 = i14;
                        } else {
                            z20 = i14;
                        }
                        if (z20 != 0) {
                            i10 = i14;
                        }
                        constraintWidget5 = this.mParent;
                        if (constraintWidget5 != null) {
                            solverVariableCreateObjectVariable = linearSystem2.createObjectVariable(constraintWidget5.mBottom);
                        } else {
                            solverVariableCreateObjectVariable = null;
                        }
                        constraintWidget6 = this.mParent;
                        if (constraintWidget6 != null) {
                            solverVariableCreateObjectVariable2 = linearSystem2.createObjectVariable(constraintWidget6.mTop);
                        } else {
                            solverVariableCreateObjectVariable2 = null;
                        }
                        if (this.f19155w <= 0) {
                            constraintAnchor = this.mBaseline;
                            if (constraintAnchor.mTarget != null) {
                                linearSystem2.addEquality(solverVariable3, solverVariable5, getBaselineDistance(), i13);
                                linearSystem2.addEquality(solverVariable3, linearSystem2.createObjectVariable(this.mBaseline.mTarget), this.mBaseline.getMargin(), i13);
                                if (z12 != 0) {
                                    linearSystem2.addGreaterThan(solverVariableCreateObjectVariable, linearSystem2.createObjectVariable(this.mBottom), i14, 5);
                                }
                                z21 = i14;
                            } else {
                                if (this.B == i13) {
                                    linearSystem2.addEquality(solverVariable3, solverVariable5, constraintAnchor.getMargin(), i13);
                                } else {
                                    linearSystem2.addEquality(solverVariable3, solverVariable5, getBaselineDistance(), i13);
                                }
                                z21 = z18;
                            }
                        } else {
                            constraintAnchor = this.mBaseline;
                            if (constraintAnchor.mTarget != null) {
                                linearSystem2.addEquality(solverVariable3, solverVariable5, getBaselineDistance(), i13);
                                linearSystem2.addEquality(solverVariable3, linearSystem2.createObjectVariable(this.mBaseline.mTarget), this.mBaseline.getMargin(), i13);
                                if (z12 != 0) {
                                    linearSystem2.addGreaterThan(solverVariableCreateObjectVariable, linearSystem2.createObjectVariable(this.mBottom), i14, 5);
                                }
                                z21 = i14;
                            } else {
                                if (this.B == i13) {
                                    linearSystem2.addEquality(solverVariable3, solverVariable5, constraintAnchor.getMargin(), i13);
                                } else {
                                    linearSystem2.addEquality(solverVariable3, solverVariable5, getBaselineDistance(), i13);
                                }
                                z21 = z18;
                            }
                        }
                        boolean z311 = this.isTerminalWidget[c10];
                        dimensionBehaviourArr = this.mListDimensionBehaviors;
                        DimensionBehaviour dimensionBehaviour11 = dimensionBehaviourArr[c10];
                        ConstraintAnchor constraintAnchor12 = this.mTop;
                        ConstraintAnchor constraintAnchor13 = this.mBottom;
                        int i315 = this.mY;
                        int i316 = this.mMinHeight;
                        int i317 = this.f19145l[c10];
                        float f15 = this.f19157y;
                        if (dimensionBehaviourArr[0] == dimensionBehaviour4) {
                            z22 = true;
                        } else {
                            z22 = false;
                        }
                        b(linearSystem, false, z12, z11, z311, solverVariableCreateObjectVariable2, solverVariableCreateObjectVariable, dimensionBehaviour11, z20, constraintAnchor12, constraintAnchor13, i315, i10, i316, i317, f15, z16, z22, z13, z14, z19, i28, i27, this.mMatchConstraintMinHeight, this.mMatchConstraintMaxHeight, this.mMatchConstraintPercentHeight, z21);
                    }
                    if (z15) {
                        constraintWidget4 = this;
                        if (constraintWidget4.f19143j == 1) {
                            linearSystem.addRatio(solverVariable4, solverVariable5, solverVariable, solverVariable2, constraintWidget4.f19144k, 8);
                            constraintWidget3 = constraintWidget4;
                        } else {
                            linearSystem.addRatio(solverVariable, solverVariable2, solverVariable4, solverVariable5, constraintWidget4.f19144k, 8);
                            constraintWidget3 = constraintWidget4;
                        }
                    } else {
                        constraintWidget3 = this;
                    }
                    if (constraintWidget3.mCenter.isConnected()) {
                        linearSystem.addCenterPoint(constraintWidget3, constraintWidget3.mCenter.getTarget().getOwner(), (float) Math.toRadians(constraintWidget3.mCircleConstraintAngle + 90.0f), constraintWidget3.mCenter.getMargin());
                    }
                    constraintWidget3.f19138e = false;
                    constraintWidget3.f19139f = false;
                    metrics = LinearSystem.sMetrics;
                    if (metrics != null) {
                        metrics.mEquations = linearSystem.getNumEquations();
                        LinearSystem.sMetrics.mVariables = linearSystem.getNumVariables();
                    }
                }
                z15 = false;
                int[] iArr3 = this.mResolvedMatchConstraintDefault;
                iArr3[0] = i27;
                iArr3[1] = i28;
                if (z15) {
                    int i211 = this.f19143j;
                    i11 = -1;
                    if (i211 != 0) {
                    }
                    if (z15) {
                        z16 = false;
                    } else {
                        z16 = false;
                    }
                    dimensionBehaviour = this.mListDimensionBehaviors[0];
                    dimensionBehaviour2 = DimensionBehaviour.WRAP_CONTENT;
                    if (dimensionBehaviour == dimensionBehaviour2) {
                        z17 = false;
                    } else {
                        z17 = false;
                    }
                    if (z17) {
                        i12 = 0;
                    } else {
                        i12 = i24;
                    }
                    z18 = !this.mCenter.isConnected();
                    boolean z312 = zArr[0];
                    z19 = zArr[1];
                    if (this.mHorizontalResolution != 2) {
                        solverVariable = solverVariableCreateObjectVariable6;
                        solverVariable2 = solverVariableCreateObjectVariable5;
                    } else {
                        solverVariable = solverVariableCreateObjectVariable6;
                        solverVariable2 = solverVariableCreateObjectVariable5;
                    }
                    if (z10) {
                        linearSystem2 = linearSystem;
                        solverVariable3 = r27;
                        solverVariable4 = r30;
                        solverVariable5 = r19;
                        i13 = 8;
                        i14 = 0;
                        c10 = 1;
                        i15 = 1;
                    } else {
                        linearSystem2 = linearSystem;
                        solverVariable3 = r27;
                        solverVariable4 = r30;
                        solverVariable5 = r19;
                        i13 = 8;
                        i14 = 0;
                        c10 = 1;
                        i15 = 1;
                    }
                    if (this.mVerticalResolution != 2) {
                        if (this.mListDimensionBehaviors[c10] == dimensionBehaviour2) {
                            z20 = i14;
                        } else {
                            z20 = i14;
                        }
                        if (z20 != 0) {
                            i10 = i14;
                        }
                        constraintWidget5 = this.mParent;
                        if (constraintWidget5 != null) {
                            solverVariableCreateObjectVariable = linearSystem2.createObjectVariable(constraintWidget5.mBottom);
                        } else {
                            solverVariableCreateObjectVariable = null;
                        }
                        constraintWidget6 = this.mParent;
                        if (constraintWidget6 != null) {
                            solverVariableCreateObjectVariable2 = linearSystem2.createObjectVariable(constraintWidget6.mTop);
                        } else {
                            solverVariableCreateObjectVariable2 = null;
                        }
                        if (this.f19155w <= 0) {
                            constraintAnchor = this.mBaseline;
                            if (constraintAnchor.mTarget != null) {
                                linearSystem2.addEquality(solverVariable3, solverVariable5, getBaselineDistance(), i13);
                                linearSystem2.addEquality(solverVariable3, linearSystem2.createObjectVariable(this.mBaseline.mTarget), this.mBaseline.getMargin(), i13);
                                if (z12 != 0) {
                                    linearSystem2.addGreaterThan(solverVariableCreateObjectVariable, linearSystem2.createObjectVariable(this.mBottom), i14, 5);
                                }
                                z21 = i14;
                            } else {
                                if (this.B == i13) {
                                    linearSystem2.addEquality(solverVariable3, solverVariable5, constraintAnchor.getMargin(), i13);
                                } else {
                                    linearSystem2.addEquality(solverVariable3, solverVariable5, getBaselineDistance(), i13);
                                }
                                z21 = z18;
                            }
                        } else {
                            constraintAnchor = this.mBaseline;
                            if (constraintAnchor.mTarget != null) {
                                linearSystem2.addEquality(solverVariable3, solverVariable5, getBaselineDistance(), i13);
                                linearSystem2.addEquality(solverVariable3, linearSystem2.createObjectVariable(this.mBaseline.mTarget), this.mBaseline.getMargin(), i13);
                                if (z12 != 0) {
                                    linearSystem2.addGreaterThan(solverVariableCreateObjectVariable, linearSystem2.createObjectVariable(this.mBottom), i14, 5);
                                }
                                z21 = i14;
                            } else {
                                if (this.B == i13) {
                                    linearSystem2.addEquality(solverVariable3, solverVariable5, constraintAnchor.getMargin(), i13);
                                } else {
                                    linearSystem2.addEquality(solverVariable3, solverVariable5, getBaselineDistance(), i13);
                                }
                                z21 = z18;
                            }
                        }
                        boolean z313 = this.isTerminalWidget[c10];
                        dimensionBehaviourArr = this.mListDimensionBehaviors;
                        DimensionBehaviour dimensionBehaviour12 = dimensionBehaviourArr[c10];
                        ConstraintAnchor constraintAnchor14 = this.mTop;
                        ConstraintAnchor constraintAnchor15 = this.mBottom;
                        int i318 = this.mY;
                        int i319 = this.mMinHeight;
                        int i3110 = this.f19145l[c10];
                        float f16 = this.f19157y;
                        if (dimensionBehaviourArr[0] == dimensionBehaviour4) {
                            z22 = true;
                        } else {
                            z22 = false;
                        }
                        b(linearSystem, false, z12, z11, z313, solverVariableCreateObjectVariable2, solverVariableCreateObjectVariable, dimensionBehaviour12, z20, constraintAnchor14, constraintAnchor15, i318, i10, i319, i3110, f16, z16, z22, z13, z14, z19, i28, i27, this.mMatchConstraintMinHeight, this.mMatchConstraintMaxHeight, this.mMatchConstraintPercentHeight, z21);
                    }
                    if (z15) {
                        constraintWidget4 = this;
                        if (constraintWidget4.f19143j == 1) {
                            linearSystem.addRatio(solverVariable4, solverVariable5, solverVariable, solverVariable2, constraintWidget4.f19144k, 8);
                            constraintWidget3 = constraintWidget4;
                        } else {
                            linearSystem.addRatio(solverVariable, solverVariable2, solverVariable4, solverVariable5, constraintWidget4.f19144k, 8);
                            constraintWidget3 = constraintWidget4;
                        }
                    } else {
                        constraintWidget3 = this;
                    }
                    if (constraintWidget3.mCenter.isConnected()) {
                        linearSystem.addCenterPoint(constraintWidget3, constraintWidget3.mCenter.getTarget().getOwner(), (float) Math.toRadians(constraintWidget3.mCircleConstraintAngle + 90.0f), constraintWidget3.mCenter.getMargin());
                    }
                    constraintWidget3.f19138e = false;
                    constraintWidget3.f19139f = false;
                    metrics = LinearSystem.sMetrics;
                    if (metrics != null) {
                        metrics.mEquations = linearSystem.getNumEquations();
                        LinearSystem.sMetrics.mVariables = linearSystem.getNumVariables();
                    }
                }
                i11 = -1;
                if (z15) {
                    z16 = false;
                } else {
                    z16 = false;
                }
                dimensionBehaviour = this.mListDimensionBehaviors[0];
                dimensionBehaviour2 = DimensionBehaviour.WRAP_CONTENT;
                if (dimensionBehaviour == dimensionBehaviour2) {
                    z17 = false;
                } else {
                    z17 = false;
                }
                if (z17) {
                    i12 = 0;
                } else {
                    i12 = i24;
                }
                z18 = !this.mCenter.isConnected();
                boolean z314 = zArr[0];
                z19 = zArr[1];
                if (this.mHorizontalResolution != 2) {
                    solverVariable = solverVariableCreateObjectVariable6;
                    solverVariable2 = solverVariableCreateObjectVariable5;
                } else {
                    solverVariable = solverVariableCreateObjectVariable6;
                    solverVariable2 = solverVariableCreateObjectVariable5;
                }
                if (z10) {
                    linearSystem2 = linearSystem;
                    solverVariable3 = r27;
                    solverVariable4 = r30;
                    solverVariable5 = r19;
                    i13 = 8;
                    i14 = 0;
                    c10 = 1;
                    i15 = 1;
                } else {
                    linearSystem2 = linearSystem;
                    solverVariable3 = r27;
                    solverVariable4 = r30;
                    solverVariable5 = r19;
                    i13 = 8;
                    i14 = 0;
                    c10 = 1;
                    i15 = 1;
                }
                if (this.mVerticalResolution != 2) {
                    if (this.mListDimensionBehaviors[c10] == dimensionBehaviour2) {
                        z20 = i14;
                    } else {
                        z20 = i14;
                    }
                    if (z20 != 0) {
                        i10 = i14;
                    }
                    constraintWidget5 = this.mParent;
                    if (constraintWidget5 != null) {
                        solverVariableCreateObjectVariable = linearSystem2.createObjectVariable(constraintWidget5.mBottom);
                    } else {
                        solverVariableCreateObjectVariable = null;
                    }
                    constraintWidget6 = this.mParent;
                    if (constraintWidget6 != null) {
                        solverVariableCreateObjectVariable2 = linearSystem2.createObjectVariable(constraintWidget6.mTop);
                    } else {
                        solverVariableCreateObjectVariable2 = null;
                    }
                    if (this.f19155w <= 0) {
                        constraintAnchor = this.mBaseline;
                        if (constraintAnchor.mTarget != null) {
                            linearSystem2.addEquality(solverVariable3, solverVariable5, getBaselineDistance(), i13);
                            linearSystem2.addEquality(solverVariable3, linearSystem2.createObjectVariable(this.mBaseline.mTarget), this.mBaseline.getMargin(), i13);
                            if (z12 != 0) {
                                linearSystem2.addGreaterThan(solverVariableCreateObjectVariable, linearSystem2.createObjectVariable(this.mBottom), i14, 5);
                            }
                            z21 = i14;
                        } else {
                            if (this.B == i13) {
                                linearSystem2.addEquality(solverVariable3, solverVariable5, constraintAnchor.getMargin(), i13);
                            } else {
                                linearSystem2.addEquality(solverVariable3, solverVariable5, getBaselineDistance(), i13);
                            }
                            z21 = z18;
                        }
                    } else {
                        constraintAnchor = this.mBaseline;
                        if (constraintAnchor.mTarget != null) {
                            linearSystem2.addEquality(solverVariable3, solverVariable5, getBaselineDistance(), i13);
                            linearSystem2.addEquality(solverVariable3, linearSystem2.createObjectVariable(this.mBaseline.mTarget), this.mBaseline.getMargin(), i13);
                            if (z12 != 0) {
                                linearSystem2.addGreaterThan(solverVariableCreateObjectVariable, linearSystem2.createObjectVariable(this.mBottom), i14, 5);
                            }
                            z21 = i14;
                        } else {
                            if (this.B == i13) {
                                linearSystem2.addEquality(solverVariable3, solverVariable5, constraintAnchor.getMargin(), i13);
                            } else {
                                linearSystem2.addEquality(solverVariable3, solverVariable5, getBaselineDistance(), i13);
                            }
                            z21 = z18;
                        }
                    }
                    boolean z315 = this.isTerminalWidget[c10];
                    dimensionBehaviourArr = this.mListDimensionBehaviors;
                    DimensionBehaviour dimensionBehaviour13 = dimensionBehaviourArr[c10];
                    ConstraintAnchor constraintAnchor16 = this.mTop;
                    ConstraintAnchor constraintAnchor17 = this.mBottom;
                    int i3111 = this.mY;
                    int i3112 = this.mMinHeight;
                    int i3113 = this.f19145l[c10];
                    float f17 = this.f19157y;
                    if (dimensionBehaviourArr[0] == dimensionBehaviour4) {
                        z22 = true;
                    } else {
                        z22 = false;
                    }
                    b(linearSystem, false, z12, z11, z315, solverVariableCreateObjectVariable2, solverVariableCreateObjectVariable, dimensionBehaviour13, z20, constraintAnchor16, constraintAnchor17, i3111, i10, i3112, i3113, f17, z16, z22, z13, z14, z19, i28, i27, this.mMatchConstraintMinHeight, this.mMatchConstraintMaxHeight, this.mMatchConstraintPercentHeight, z21);
                }
                if (z15) {
                    constraintWidget4 = this;
                    if (constraintWidget4.f19143j == 1) {
                        linearSystem.addRatio(solverVariable4, solverVariable5, solverVariable, solverVariable2, constraintWidget4.f19144k, 8);
                        constraintWidget3 = constraintWidget4;
                    } else {
                        linearSystem.addRatio(solverVariable, solverVariable2, solverVariable4, solverVariable5, constraintWidget4.f19144k, 8);
                        constraintWidget3 = constraintWidget4;
                    }
                } else {
                    constraintWidget3 = this;
                }
                if (constraintWidget3.mCenter.isConnected()) {
                    linearSystem.addCenterPoint(constraintWidget3, constraintWidget3.mCenter.getTarget().getOwner(), (float) Math.toRadians(constraintWidget3.mCircleConstraintAngle + 90.0f), constraintWidget3.mCenter.getMargin());
                }
                constraintWidget3.f19138e = false;
                constraintWidget3.f19139f = false;
                metrics = LinearSystem.sMetrics;
                if (metrics != null) {
                    metrics.mEquations = linearSystem.getNumEquations();
                    LinearSystem.sMetrics.mVariables = linearSystem.getNumVariables();
                }
            }
            zArr = zArr2;
            i27 = i27;
            i28 = i28;
            i10 = i25;
            z15 = false;
            int[] iArr4 = this.mResolvedMatchConstraintDefault;
            iArr4[0] = i27;
            iArr4[1] = i28;
            if (z15) {
                int i212 = this.f19143j;
                i11 = -1;
                if (i212 != 0) {
                }
                if (z15) {
                    z16 = false;
                } else {
                    z16 = false;
                }
                dimensionBehaviour = this.mListDimensionBehaviors[0];
                dimensionBehaviour2 = DimensionBehaviour.WRAP_CONTENT;
                if (dimensionBehaviour == dimensionBehaviour2) {
                    z17 = false;
                } else {
                    z17 = false;
                }
                if (z17) {
                    i12 = 0;
                } else {
                    i12 = i24;
                }
                z18 = !this.mCenter.isConnected();
                boolean z316 = zArr[0];
                z19 = zArr[1];
                if (this.mHorizontalResolution != 2) {
                    solverVariable = solverVariableCreateObjectVariable6;
                    solverVariable2 = solverVariableCreateObjectVariable5;
                } else {
                    solverVariable = solverVariableCreateObjectVariable6;
                    solverVariable2 = solverVariableCreateObjectVariable5;
                }
                if (z10) {
                    linearSystem2 = linearSystem;
                    solverVariable3 = r27;
                    solverVariable4 = r30;
                    solverVariable5 = r19;
                    i13 = 8;
                    i14 = 0;
                    c10 = 1;
                    i15 = 1;
                } else {
                    linearSystem2 = linearSystem;
                    solverVariable3 = r27;
                    solverVariable4 = r30;
                    solverVariable5 = r19;
                    i13 = 8;
                    i14 = 0;
                    c10 = 1;
                    i15 = 1;
                }
                if (this.mVerticalResolution != 2) {
                    if (this.mListDimensionBehaviors[c10] == dimensionBehaviour2) {
                        z20 = i14;
                    } else {
                        z20 = i14;
                    }
                    if (z20 != 0) {
                        i10 = i14;
                    }
                    constraintWidget5 = this.mParent;
                    if (constraintWidget5 != null) {
                        solverVariableCreateObjectVariable = linearSystem2.createObjectVariable(constraintWidget5.mBottom);
                    } else {
                        solverVariableCreateObjectVariable = null;
                    }
                    constraintWidget6 = this.mParent;
                    if (constraintWidget6 != null) {
                        solverVariableCreateObjectVariable2 = linearSystem2.createObjectVariable(constraintWidget6.mTop);
                    } else {
                        solverVariableCreateObjectVariable2 = null;
                    }
                    if (this.f19155w <= 0) {
                        constraintAnchor = this.mBaseline;
                        if (constraintAnchor.mTarget != null) {
                            linearSystem2.addEquality(solverVariable3, solverVariable5, getBaselineDistance(), i13);
                            linearSystem2.addEquality(solverVariable3, linearSystem2.createObjectVariable(this.mBaseline.mTarget), this.mBaseline.getMargin(), i13);
                            if (z12 != 0) {
                                linearSystem2.addGreaterThan(solverVariableCreateObjectVariable, linearSystem2.createObjectVariable(this.mBottom), i14, 5);
                            }
                            z21 = i14;
                        } else {
                            if (this.B == i13) {
                                linearSystem2.addEquality(solverVariable3, solverVariable5, constraintAnchor.getMargin(), i13);
                            } else {
                                linearSystem2.addEquality(solverVariable3, solverVariable5, getBaselineDistance(), i13);
                            }
                            z21 = z18;
                        }
                    } else {
                        constraintAnchor = this.mBaseline;
                        if (constraintAnchor.mTarget != null) {
                            linearSystem2.addEquality(solverVariable3, solverVariable5, getBaselineDistance(), i13);
                            linearSystem2.addEquality(solverVariable3, linearSystem2.createObjectVariable(this.mBaseline.mTarget), this.mBaseline.getMargin(), i13);
                            if (z12 != 0) {
                                linearSystem2.addGreaterThan(solverVariableCreateObjectVariable, linearSystem2.createObjectVariable(this.mBottom), i14, 5);
                            }
                            z21 = i14;
                        } else {
                            if (this.B == i13) {
                                linearSystem2.addEquality(solverVariable3, solverVariable5, constraintAnchor.getMargin(), i13);
                            } else {
                                linearSystem2.addEquality(solverVariable3, solverVariable5, getBaselineDistance(), i13);
                            }
                            z21 = z18;
                        }
                    }
                    boolean z317 = this.isTerminalWidget[c10];
                    dimensionBehaviourArr = this.mListDimensionBehaviors;
                    DimensionBehaviour dimensionBehaviour14 = dimensionBehaviourArr[c10];
                    ConstraintAnchor constraintAnchor18 = this.mTop;
                    ConstraintAnchor constraintAnchor19 = this.mBottom;
                    int i3114 = this.mY;
                    int i3115 = this.mMinHeight;
                    int i3116 = this.f19145l[c10];
                    float f18 = this.f19157y;
                    if (dimensionBehaviourArr[0] == dimensionBehaviour4) {
                        z22 = true;
                    } else {
                        z22 = false;
                    }
                    b(linearSystem, false, z12, z11, z317, solverVariableCreateObjectVariable2, solverVariableCreateObjectVariable, dimensionBehaviour14, z20, constraintAnchor18, constraintAnchor19, i3114, i10, i3115, i3116, f18, z16, z22, z13, z14, z19, i28, i27, this.mMatchConstraintMinHeight, this.mMatchConstraintMaxHeight, this.mMatchConstraintPercentHeight, z21);
                }
                if (z15) {
                    constraintWidget4 = this;
                    if (constraintWidget4.f19143j == 1) {
                        linearSystem.addRatio(solverVariable4, solverVariable5, solverVariable, solverVariable2, constraintWidget4.f19144k, 8);
                        constraintWidget3 = constraintWidget4;
                    } else {
                        linearSystem.addRatio(solverVariable, solverVariable2, solverVariable4, solverVariable5, constraintWidget4.f19144k, 8);
                        constraintWidget3 = constraintWidget4;
                    }
                } else {
                    constraintWidget3 = this;
                }
                if (constraintWidget3.mCenter.isConnected()) {
                    linearSystem.addCenterPoint(constraintWidget3, constraintWidget3.mCenter.getTarget().getOwner(), (float) Math.toRadians(constraintWidget3.mCircleConstraintAngle + 90.0f), constraintWidget3.mCenter.getMargin());
                }
                constraintWidget3.f19138e = false;
                constraintWidget3.f19139f = false;
                metrics = LinearSystem.sMetrics;
                if (metrics != null) {
                    metrics.mEquations = linearSystem.getNumEquations();
                    LinearSystem.sMetrics.mVariables = linearSystem.getNumVariables();
                }
            }
            i11 = -1;
            if (z15) {
                z16 = false;
            } else {
                z16 = false;
            }
            dimensionBehaviour = this.mListDimensionBehaviors[0];
            dimensionBehaviour2 = DimensionBehaviour.WRAP_CONTENT;
            if (dimensionBehaviour == dimensionBehaviour2) {
                z17 = false;
            } else {
                z17 = false;
            }
            if (z17) {
                i12 = 0;
            } else {
                i12 = i24;
            }
            z18 = !this.mCenter.isConnected();
            boolean z318 = zArr[0];
            z19 = zArr[1];
            if (this.mHorizontalResolution != 2) {
                solverVariable = solverVariableCreateObjectVariable6;
                solverVariable2 = solverVariableCreateObjectVariable5;
            } else {
                solverVariable = solverVariableCreateObjectVariable6;
                solverVariable2 = solverVariableCreateObjectVariable5;
            }
            if (z10) {
                linearSystem2 = linearSystem;
                solverVariable3 = r27;
                solverVariable4 = r30;
                solverVariable5 = r19;
                i13 = 8;
                i14 = 0;
                c10 = 1;
                i15 = 1;
            } else {
                linearSystem2 = linearSystem;
                solverVariable3 = r27;
                solverVariable4 = r30;
                solverVariable5 = r19;
                i13 = 8;
                i14 = 0;
                c10 = 1;
                i15 = 1;
            }
            if (this.mVerticalResolution != 2) {
                if (this.mListDimensionBehaviors[c10] == dimensionBehaviour2) {
                    z20 = i14;
                } else {
                    z20 = i14;
                }
                if (z20 != 0) {
                    i10 = i14;
                }
                constraintWidget5 = this.mParent;
                if (constraintWidget5 != null) {
                    solverVariableCreateObjectVariable = linearSystem2.createObjectVariable(constraintWidget5.mBottom);
                } else {
                    solverVariableCreateObjectVariable = null;
                }
                constraintWidget6 = this.mParent;
                if (constraintWidget6 != null) {
                    solverVariableCreateObjectVariable2 = linearSystem2.createObjectVariable(constraintWidget6.mTop);
                } else {
                    solverVariableCreateObjectVariable2 = null;
                }
                if (this.f19155w <= 0) {
                    constraintAnchor = this.mBaseline;
                    if (constraintAnchor.mTarget != null) {
                        linearSystem2.addEquality(solverVariable3, solverVariable5, getBaselineDistance(), i13);
                        linearSystem2.addEquality(solverVariable3, linearSystem2.createObjectVariable(this.mBaseline.mTarget), this.mBaseline.getMargin(), i13);
                        if (z12 != 0) {
                            linearSystem2.addGreaterThan(solverVariableCreateObjectVariable, linearSystem2.createObjectVariable(this.mBottom), i14, 5);
                        }
                        z21 = i14;
                    } else {
                        if (this.B == i13) {
                            linearSystem2.addEquality(solverVariable3, solverVariable5, constraintAnchor.getMargin(), i13);
                        } else {
                            linearSystem2.addEquality(solverVariable3, solverVariable5, getBaselineDistance(), i13);
                        }
                        z21 = z18;
                    }
                } else {
                    constraintAnchor = this.mBaseline;
                    if (constraintAnchor.mTarget != null) {
                        linearSystem2.addEquality(solverVariable3, solverVariable5, getBaselineDistance(), i13);
                        linearSystem2.addEquality(solverVariable3, linearSystem2.createObjectVariable(this.mBaseline.mTarget), this.mBaseline.getMargin(), i13);
                        if (z12 != 0) {
                            linearSystem2.addGreaterThan(solverVariableCreateObjectVariable, linearSystem2.createObjectVariable(this.mBottom), i14, 5);
                        }
                        z21 = i14;
                    } else {
                        if (this.B == i13) {
                            linearSystem2.addEquality(solverVariable3, solverVariable5, constraintAnchor.getMargin(), i13);
                        } else {
                            linearSystem2.addEquality(solverVariable3, solverVariable5, getBaselineDistance(), i13);
                        }
                        z21 = z18;
                    }
                }
                boolean z319 = this.isTerminalWidget[c10];
                dimensionBehaviourArr = this.mListDimensionBehaviors;
                DimensionBehaviour dimensionBehaviour15 = dimensionBehaviourArr[c10];
                ConstraintAnchor constraintAnchor110 = this.mTop;
                ConstraintAnchor constraintAnchor111 = this.mBottom;
                int i3117 = this.mY;
                int i3118 = this.mMinHeight;
                int i3119 = this.f19145l[c10];
                float f19 = this.f19157y;
                if (dimensionBehaviourArr[0] == dimensionBehaviour4) {
                    z22 = true;
                } else {
                    z22 = false;
                }
                b(linearSystem, false, z12, z11, z319, solverVariableCreateObjectVariable2, solverVariableCreateObjectVariable, dimensionBehaviour15, z20, constraintAnchor110, constraintAnchor111, i3117, i10, i3118, i3119, f19, z16, z22, z13, z14, z19, i28, i27, this.mMatchConstraintMinHeight, this.mMatchConstraintMaxHeight, this.mMatchConstraintPercentHeight, z21);
            }
            if (z15) {
                constraintWidget4 = this;
                if (constraintWidget4.f19143j == 1) {
                    linearSystem.addRatio(solverVariable4, solverVariable5, solverVariable, solverVariable2, constraintWidget4.f19144k, 8);
                    constraintWidget3 = constraintWidget4;
                } else {
                    linearSystem.addRatio(solverVariable, solverVariable2, solverVariable4, solverVariable5, constraintWidget4.f19144k, 8);
                    constraintWidget3 = constraintWidget4;
                }
            } else {
                constraintWidget3 = this;
            }
            if (constraintWidget3.mCenter.isConnected()) {
                linearSystem.addCenterPoint(constraintWidget3, constraintWidget3.mCenter.getTarget().getOwner(), (float) Math.toRadians(constraintWidget3.mCircleConstraintAngle + 90.0f), constraintWidget3.mCenter.getMargin());
            }
            constraintWidget3.f19138e = false;
            constraintWidget3.f19139f = false;
            metrics = LinearSystem.sMetrics;
            if (metrics != null) {
                metrics.mEquations = linearSystem.getNumEquations();
                LinearSystem.sMetrics.mVariables = linearSystem.getNumVariables();
            }
        }
    }

    public boolean allowedInBarrier() {
        return this.B != 8;
    }

    /* JADX WARN: Code duplicated, block: B:114:0x01e0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:115:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:116:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:117:0x01f1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:120:0x01f9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:121:0x01fb A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:131:0x0218 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:135:0x0230  */
    /* JADX WARN: Code duplicated, block: B:137:0x0234 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:228:0x03be A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:231:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:233:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:234:0x03cf A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:239:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:241:0x0411  */
    /* JADX WARN: Code duplicated, block: B:244:0x0425  */
    /* JADX WARN: Code duplicated, block: B:248:0x042e  */
    /* JADX WARN: Code duplicated, block: B:249:0x0430 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:257:0x0450  */
    /* JADX WARN: Code duplicated, block: B:259:0x0454 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:267:0x0468  */
    /* JADX WARN: Code duplicated, block: B:270:0x046e  */
    /* JADX WARN: Code duplicated, block: B:271:0x0470 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:274:0x0476 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:279:0x047f  */
    /* JADX WARN: Code duplicated, block: B:281:0x0483  */
    /* JADX WARN: Code duplicated, block: B:284:0x0489  */
    /* JADX WARN: Code duplicated, block: B:286:0x048d  */
    /* JADX WARN: Code duplicated, block: B:288:0x0491  */
    /* JADX WARN: Code duplicated, block: B:289:0x0493  */
    /* JADX WARN: Code duplicated, block: B:292:0x049b  */
    /* JADX WARN: Code duplicated, block: B:294:0x04a1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:298:0x04a9  */
    /* JADX WARN: Code duplicated, block: B:301:0x04bb  */
    /* JADX WARN: Code duplicated, block: B:303:0x04bf  */
    /* JADX WARN: Code duplicated, block: B:304:0x04c4  */
    /* JADX WARN: Code duplicated, block: B:306:0x04c7  */
    /* JADX WARN: Code duplicated, block: B:308:0x04cd A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:315:0x04e0  */
    /* JADX WARN: Code duplicated, block: B:320:0x04ee A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:328:0x0506  */
    /* JADX WARN: Code duplicated, block: B:330:0x0513 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:356:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:359:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public final void b(LinearSystem linearSystem, boolean z10, boolean z11, boolean z12, boolean z13, SolverVariable solverVariable, SolverVariable solverVariable2, DimensionBehaviour dimensionBehaviour, boolean z14, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, int i10, int i11, int i12, int i13, float f6, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, int i14, int i15, int i16, int i17, float f10, boolean z20) {
        boolean z21;
        boolean z22;
        boolean z23;
        int iMin;
        int i18;
        int i19;
        int i20;
        boolean z24;
        boolean z25;
        SolverVariable solverVariableCreateObjectVariable;
        SolverVariable solverVariableCreateObjectVariable2;
        char c10;
        char c11;
        ConstraintAnchor constraintAnchor3;
        boolean z26;
        boolean z27;
        int i21;
        int i22;
        boolean z28;
        boolean z29;
        boolean z30;
        ConstraintWidget constraintWidget;
        int i23;
        boolean z31;
        ConstraintWidget constraintWidget2;
        int iMax;
        int i24;
        int margin;
        int iMin2;
        int i25;
        int i26;
        boolean z32;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        SolverVariable solverVariableCreateObjectVariable3 = linearSystem.createObjectVariable(constraintAnchor);
        SolverVariable solverVariableCreateObjectVariable4 = linearSystem.createObjectVariable(constraintAnchor2);
        SolverVariable solverVariableCreateObjectVariable5 = linearSystem.createObjectVariable(constraintAnchor.getTarget());
        SolverVariable solverVariableCreateObjectVariable6 = linearSystem.createObjectVariable(constraintAnchor2.getTarget());
        if (LinearSystem.getMetrics() != null) {
            LinearSystem.getMetrics().nonresolvedWidgets++;
        }
        boolean zIsConnected = constraintAnchor.isConnected();
        boolean zIsConnected2 = constraintAnchor2.isConnected();
        boolean zIsConnected3 = this.mCenter.isConnected();
        int i32 = zIsConnected2 ? (zIsConnected ? 1 : 0) + 1 : zIsConnected ? 1 : 0;
        if (zIsConnected3) {
            i32++;
        }
        int i33 = z15 ? 3 : i14;
        int iOrdinal = dimensionBehaviour.ordinal();
        boolean z33 = (iOrdinal == 0 || iOrdinal == 1 || iOrdinal != 2 || i33 == 4) ? false : true;
        int i34 = this.f19136c;
        if (i34 == -1 || !z10) {
            i34 = i11;
            z21 = z33;
        } else {
            this.f19136c = -1;
            z21 = false;
        }
        int i35 = this.f19137d;
        if (i35 == -1 || z10) {
            z22 = z21;
        } else {
            this.f19137d = -1;
            i34 = i35;
            z22 = false;
        }
        int i36 = i34;
        if (this.B == 8) {
            iMin = 0;
            z23 = false;
        } else {
            z23 = z22;
            iMin = i36;
        }
        if (z20) {
            if (!zIsConnected && !zIsConnected2 && !zIsConnected3) {
                linearSystem.addEquality(solverVariableCreateObjectVariable3, i10);
            } else if (zIsConnected && !zIsConnected2) {
                i18 = 8;
                linearSystem.addEquality(solverVariableCreateObjectVariable3, solverVariableCreateObjectVariable5, constraintAnchor.getMargin(), 8);
            }
            i18 = 8;
        } else {
            i18 = 8;
        }
        if (z23) {
            if (i32 == 2 || z15 || !(i33 == 1 || i33 == 0)) {
                int i37 = i16 == -2 ? iMin : i16;
                i19 = i17 == -2 ? iMin : i17;
                if (iMin > 0 && i33 != 1) {
                    iMin = 0;
                }
                if (i37 > 0) {
                    linearSystem.addGreaterThan(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable3, i37, 8);
                    iMin = Math.max(iMin, i37);
                }
                if (i19 > 0) {
                    if (!z11 || i33 != 1) {
                        linearSystem.addLowerThan(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable3, i19, 8);
                    }
                    iMin = Math.min(iMin, i19);
                }
                if (i33 == 1) {
                    if (z11) {
                        linearSystem.addEquality(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable3, iMin, 8);
                    } else if (z17) {
                        linearSystem.addEquality(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable3, iMin, 5);
                        linearSystem.addLowerThan(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable3, iMin, 8);
                    } else {
                        linearSystem.addEquality(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable3, iMin, 5);
                        linearSystem.addLowerThan(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable3, iMin, 8);
                    }
                    i20 = i37;
                } else if (i33 == 2) {
                    ConstraintAnchor.Type type = constraintAnchor.getType();
                    ConstraintAnchor.Type type2 = ConstraintAnchor.Type.TOP;
                    if (type == type2 || constraintAnchor.getType() == ConstraintAnchor.Type.BOTTOM) {
                        solverVariableCreateObjectVariable = linearSystem.createObjectVariable(this.mParent.getAnchor(type2));
                        solverVariableCreateObjectVariable2 = linearSystem.createObjectVariable(this.mParent.getAnchor(ConstraintAnchor.Type.BOTTOM));
                    } else {
                        solverVariableCreateObjectVariable = linearSystem.createObjectVariable(this.mParent.getAnchor(ConstraintAnchor.Type.LEFT));
                        solverVariableCreateObjectVariable2 = linearSystem.createObjectVariable(this.mParent.getAnchor(ConstraintAnchor.Type.RIGHT));
                    }
                    SolverVariable solverVariable3 = solverVariableCreateObjectVariable;
                    SolverVariable solverVariable4 = solverVariableCreateObjectVariable2;
                    ArrayRow arrayRowCreateRow = linearSystem.createRow();
                    int i38 = i37;
                    boolean z34 = z23;
                    i32 = (i32 == true ? 1 : 0) == true ? 1 : 0;
                    linearSystem.addConstraint(arrayRowCreateRow.createRowDimensionRatio(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable3, solverVariable4, solverVariable3, f10));
                    if (z11) {
                        z34 = false;
                    }
                    i20 = i38;
                    z24 = z34;
                } else {
                    i32 = i32 == true ? 1 : 0;
                    solverVariableCreateObjectVariable4 = solverVariableCreateObjectVariable4;
                    int i39 = i37;
                    solverVariableCreateObjectVariable6 = solverVariableCreateObjectVariable6;
                    boolean z35 = z23;
                    solverVariableCreateObjectVariable5 = solverVariableCreateObjectVariable5;
                    i20 = i39;
                    z24 = z35;
                    z25 = true;
                }
                if (!z20) {
                    c10 = 1;
                    c11 = 2;
                } else {
                    if (!z17) {
                        if (zIsConnected && !zIsConnected2 && !zIsConnected3) {
                            i24 = 5;
                            z31 = z11;
                            i31 = i24;
                        } else if (zIsConnected || zIsConnected2 != 0) {
                            if (!zIsConnected || zIsConnected2 == 0) {
                                if (!zIsConnected && zIsConnected2 != 0) {
                                    ConstraintWidget constraintWidget3 = constraintAnchor.mTarget.mOwner;
                                    boolean z36 = true;
                                    ConstraintWidget constraintWidget4 = constraintAnchor2.mTarget.mOwner;
                                    ConstraintWidget parent = getParent();
                                    int i40 = 6;
                                    if (z24) {
                                        if (i33 == 0) {
                                            if (i19 != 0 || i20 != 0) {
                                                z27 = true;
                                                z26 = true;
                                                i30 = 5;
                                                i21 = 5;
                                                z28 = false;
                                            } else if (solverVariableCreateObjectVariable5.isFinalValue && solverVariableCreateObjectVariable6.isFinalValue) {
                                                linearSystem.addEquality(solverVariableCreateObjectVariable3, solverVariableCreateObjectVariable5, constraintAnchor.getMargin(), 8);
                                                linearSystem.addEquality(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable6, -constraintAnchor2.getMargin(), 8);
                                                return;
                                            } else {
                                                z28 = true;
                                                i30 = 8;
                                                i21 = 8;
                                                z27 = false;
                                                z26 = false;
                                            }
                                            if ((constraintWidget3 instanceof Barrier) || (constraintWidget4 instanceof Barrier)) {
                                                z36 = true;
                                                i21 = 4;
                                            } else {
                                                z36 = true;
                                            }
                                            i22 = i30;
                                            i33 = i33;
                                        } else {
                                            if (i33 == 2) {
                                                if ((constraintWidget3 instanceof Barrier) || (constraintWidget4 instanceof Barrier)) {
                                                    z36 = true;
                                                    i21 = 4;
                                                } else {
                                                    z36 = true;
                                                    i21 = 5;
                                                }
                                                i22 = 5;
                                            } else {
                                                if (i33 == 1) {
                                                    i33 = i33;
                                                    i40 = 6;
                                                    z36 = true;
                                                    i21 = 4;
                                                    i22 = 8;
                                                } else if (i33 == 3) {
                                                    i33 = i33;
                                                    if (this.f19143j == -1) {
                                                        if (z18) {
                                                            solverVariable2 = solverVariable2;
                                                            i40 = z11 ? 5 : 4;
                                                        } else {
                                                            solverVariable2 = solverVariable2;
                                                            i40 = 8;
                                                        }
                                                        z36 = true;
                                                        i21 = 5;
                                                        i22 = 8;
                                                        z26 = true;
                                                        z27 = true;
                                                        z28 = true;
                                                    } else if (z15) {
                                                        if (i15 != 2) {
                                                            z36 = true;
                                                            if (i15 != 1) {
                                                                i28 = 8;
                                                                i29 = 5;
                                                            }
                                                            i22 = i28;
                                                            i21 = i29;
                                                            z26 = z36;
                                                            z27 = z26;
                                                            z28 = z27;
                                                        } else {
                                                            z36 = true;
                                                        }
                                                        i28 = 5;
                                                        i29 = 4;
                                                        i22 = i28;
                                                        i21 = i29;
                                                        z26 = z36;
                                                        z27 = z26;
                                                        z28 = z27;
                                                    } else {
                                                        z36 = true;
                                                        if (i19 > 0) {
                                                            z26 = true;
                                                            z27 = true;
                                                            z28 = true;
                                                            i21 = 5;
                                                        } else if (i19 != 0 || i20 != 0) {
                                                            z26 = true;
                                                            z27 = true;
                                                            z28 = true;
                                                            i21 = 4;
                                                        } else if (z18) {
                                                            solverVariable2 = solverVariable2;
                                                            i22 = (constraintWidget3 == parent || constraintWidget4 == parent) ? 5 : 4;
                                                            z26 = true;
                                                            z27 = true;
                                                            z28 = true;
                                                            i40 = 6;
                                                            i21 = 4;
                                                        } else {
                                                            z26 = true;
                                                            z27 = true;
                                                            z28 = true;
                                                            i21 = 8;
                                                        }
                                                        i22 = 5;
                                                    }
                                                } else {
                                                    z36 = true;
                                                    i21 = 4;
                                                    i22 = 5;
                                                    z26 = false;
                                                    z27 = false;
                                                }
                                                if (z26 || solverVariableCreateObjectVariable5 != solverVariableCreateObjectVariable6 || constraintWidget3 == parent) {
                                                    z29 = z26;
                                                    z30 = z36;
                                                } else {
                                                    z30 = false;
                                                    z29 = false;
                                                }
                                                if (z27) {
                                                    if (z24 && !z16 && !z18 && solverVariableCreateObjectVariable5 == solverVariable && solverVariableCreateObjectVariable6 == solverVariable2) {
                                                        z31 = false;
                                                        i27 = 8;
                                                        i26 = 8;
                                                        z32 = false;
                                                    } else {
                                                        i26 = i40;
                                                        z32 = z30;
                                                        i27 = i22;
                                                        z31 = z11;
                                                    }
                                                    constraintWidget = parent;
                                                    linearSystem.addCentering(solverVariableCreateObjectVariable3, solverVariableCreateObjectVariable5, constraintAnchor.getMargin(), f6, solverVariableCreateObjectVariable6, solverVariableCreateObjectVariable4, constraintAnchor2.getMargin(), i26);
                                                    i23 = i27;
                                                    z30 = z32;
                                                } else {
                                                    constraintWidget = parent;
                                                    i23 = i22;
                                                    z31 = z11;
                                                }
                                                if (this.B != 8 && !constraintAnchor2.hasDependents()) {
                                                    return;
                                                }
                                                if (z29) {
                                                    if (z31 && solverVariableCreateObjectVariable5 != solverVariableCreateObjectVariable6 && !z24 && ((constraintWidget3 instanceof Barrier) || (constraintWidget4 instanceof Barrier))) {
                                                        i23 = 6;
                                                    }
                                                    linearSystem.addGreaterThan(solverVariableCreateObjectVariable3, solverVariableCreateObjectVariable5, constraintAnchor.getMargin(), i23);
                                                    solverVariableCreateObjectVariable4 = solverVariableCreateObjectVariable4;
                                                    linearSystem.addLowerThan(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable6, -constraintAnchor2.getMargin(), i23);
                                                } else {
                                                    solverVariableCreateObjectVariable4 = solverVariableCreateObjectVariable4;
                                                }
                                                if (z31 || !z19 || (constraintWidget3 instanceof Barrier) || (constraintWidget4 instanceof Barrier)) {
                                                    constraintWidget2 = constraintWidget;
                                                } else {
                                                    constraintWidget2 = constraintWidget;
                                                    if (constraintWidget4 != constraintWidget2) {
                                                        i23 = 6;
                                                        iMax = 6;
                                                        z30 = z36;
                                                    }
                                                    if (z30) {
                                                        if (z28 && (!z18 || z12)) {
                                                            if (constraintWidget3 != constraintWidget2 && constraintWidget4 != constraintWidget2) {
                                                                i40 = iMax;
                                                            }
                                                            if ((constraintWidget3 instanceof Guideline) || (constraintWidget4 instanceof Guideline)) {
                                                                i40 = 5;
                                                            }
                                                            if ((constraintWidget3 instanceof Barrier) || (constraintWidget4 instanceof Barrier)) {
                                                                i40 = 5;
                                                            }
                                                            if (z18) {
                                                                i25 = 5;
                                                            } else {
                                                                i25 = i40;
                                                            }
                                                            iMax = Math.max(i25, iMax);
                                                        }
                                                        if (z31) {
                                                            iMin2 = Math.min(i23, iMax);
                                                            if (z15 || z18 || !(constraintWidget3 == constraintWidget2 || constraintWidget4 == constraintWidget2)) {
                                                                iMax = iMin2;
                                                            } else {
                                                                iMax = 4;
                                                            }
                                                        }
                                                        linearSystem.addEquality(solverVariableCreateObjectVariable3, solverVariableCreateObjectVariable5, constraintAnchor.getMargin(), iMax);
                                                        linearSystem.addEquality(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable6, -constraintAnchor2.getMargin(), iMax);
                                                    }
                                                    if (z31) {
                                                        if (solverVariable == solverVariableCreateObjectVariable5) {
                                                            margin = constraintAnchor.getMargin();
                                                        } else {
                                                            margin = 0;
                                                        }
                                                        if (solverVariableCreateObjectVariable5 != solverVariable) {
                                                            linearSystem.addGreaterThan(solverVariableCreateObjectVariable3, solverVariable, margin, 5);
                                                        }
                                                    }
                                                    if (z31 || !z24 || i12 != 0 || i20 != 0) {
                                                        i24 = 5;
                                                    } else if (z24 && i33 == 3) {
                                                        linearSystem.addGreaterThan(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable3, 0, 8);
                                                        i24 = 5;
                                                    } else {
                                                        i24 = 5;
                                                        linearSystem.addGreaterThan(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable3, 0, 5);
                                                    }
                                                }
                                                iMax = i21;
                                                if (z30) {
                                                    if (z28) {
                                                        if (constraintWidget3 != constraintWidget2) {
                                                            i40 = iMax;
                                                        }
                                                        if (constraintWidget3 instanceof Guideline) {
                                                            i40 = 5;
                                                        } else {
                                                            i40 = 5;
                                                        }
                                                        if (constraintWidget3 instanceof Barrier) {
                                                            i40 = 5;
                                                        } else {
                                                            i40 = 5;
                                                        }
                                                        if (z18) {
                                                            i25 = 5;
                                                        } else {
                                                            i25 = i40;
                                                        }
                                                        iMax = Math.max(i25, iMax);
                                                    }
                                                    if (z31) {
                                                        iMin2 = Math.min(i23, iMax);
                                                        if (z15) {
                                                            iMax = iMin2;
                                                        } else {
                                                            iMax = iMin2;
                                                        }
                                                    }
                                                    linearSystem.addEquality(solverVariableCreateObjectVariable3, solverVariableCreateObjectVariable5, constraintAnchor.getMargin(), iMax);
                                                    linearSystem.addEquality(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable6, -constraintAnchor2.getMargin(), iMax);
                                                }
                                                if (z31) {
                                                    if (solverVariable == solverVariableCreateObjectVariable5) {
                                                        margin = constraintAnchor.getMargin();
                                                    } else {
                                                        margin = 0;
                                                    }
                                                    if (solverVariableCreateObjectVariable5 != solverVariable) {
                                                        linearSystem.addGreaterThan(solverVariableCreateObjectVariable3, solverVariable, margin, 5);
                                                    }
                                                }
                                                if (z31) {
                                                    i24 = 5;
                                                } else {
                                                    i24 = 5;
                                                }
                                            }
                                            z26 = true;
                                            z27 = true;
                                            z28 = false;
                                            solverVariable2 = solverVariable2;
                                            if (z26) {
                                                z29 = z26;
                                                z30 = z36;
                                            } else {
                                                z29 = z26;
                                                z30 = z36;
                                            }
                                            if (z27) {
                                                if (z24) {
                                                    i26 = i40;
                                                    z32 = z30;
                                                    i27 = i22;
                                                    z31 = z11;
                                                } else {
                                                    i26 = i40;
                                                    z32 = z30;
                                                    i27 = i22;
                                                    z31 = z11;
                                                }
                                                constraintWidget = parent;
                                                linearSystem.addCentering(solverVariableCreateObjectVariable3, solverVariableCreateObjectVariable5, constraintAnchor.getMargin(), f6, solverVariableCreateObjectVariable6, solverVariableCreateObjectVariable4, constraintAnchor2.getMargin(), i26);
                                                i23 = i27;
                                                z30 = z32;
                                            } else {
                                                constraintWidget = parent;
                                                i23 = i22;
                                                z31 = z11;
                                            }
                                            if (this.B != 8) {
                                            }
                                            if (z29) {
                                                if (z31) {
                                                    i23 = 6;
                                                }
                                                linearSystem.addGreaterThan(solverVariableCreateObjectVariable3, solverVariableCreateObjectVariable5, constraintAnchor.getMargin(), i23);
                                                solverVariableCreateObjectVariable4 = solverVariableCreateObjectVariable4;
                                                linearSystem.addLowerThan(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable6, -constraintAnchor2.getMargin(), i23);
                                            } else {
                                                solverVariableCreateObjectVariable4 = solverVariableCreateObjectVariable4;
                                            }
                                            if (z31) {
                                                constraintWidget2 = constraintWidget;
                                                iMax = i21;
                                            } else {
                                                constraintWidget2 = constraintWidget;
                                                iMax = i21;
                                            }
                                            if (z30) {
                                                if (z28) {
                                                    if (constraintWidget3 != constraintWidget2) {
                                                        i40 = iMax;
                                                    }
                                                    if (constraintWidget3 instanceof Guideline) {
                                                        i40 = 5;
                                                    } else {
                                                        i40 = 5;
                                                    }
                                                    if (constraintWidget3 instanceof Barrier) {
                                                        i40 = 5;
                                                    } else {
                                                        i40 = 5;
                                                    }
                                                    if (z18) {
                                                        i25 = 5;
                                                    } else {
                                                        i25 = i40;
                                                    }
                                                    iMax = Math.max(i25, iMax);
                                                }
                                                if (z31) {
                                                    iMin2 = Math.min(i23, iMax);
                                                    if (z15) {
                                                        iMax = iMin2;
                                                    } else {
                                                        iMax = iMin2;
                                                    }
                                                }
                                                linearSystem.addEquality(solverVariableCreateObjectVariable3, solverVariableCreateObjectVariable5, constraintAnchor.getMargin(), iMax);
                                                linearSystem.addEquality(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable6, -constraintAnchor2.getMargin(), iMax);
                                            }
                                            if (z31) {
                                                if (solverVariable == solverVariableCreateObjectVariable5) {
                                                    margin = constraintAnchor.getMargin();
                                                } else {
                                                    margin = 0;
                                                }
                                                if (solverVariableCreateObjectVariable5 != solverVariable) {
                                                    linearSystem.addGreaterThan(solverVariableCreateObjectVariable3, solverVariable, margin, 5);
                                                }
                                            }
                                            if (z31) {
                                                i24 = 5;
                                            } else {
                                                i24 = 5;
                                            }
                                        }
                                        i40 = 6;
                                        solverVariable2 = solverVariable2;
                                        if (z26) {
                                            z29 = z26;
                                            z30 = z36;
                                        } else {
                                            z29 = z26;
                                            z30 = z36;
                                        }
                                        if (z27) {
                                            if (z24) {
                                                i26 = i40;
                                                z32 = z30;
                                                i27 = i22;
                                                z31 = z11;
                                            } else {
                                                i26 = i40;
                                                z32 = z30;
                                                i27 = i22;
                                                z31 = z11;
                                            }
                                            constraintWidget = parent;
                                            linearSystem.addCentering(solverVariableCreateObjectVariable3, solverVariableCreateObjectVariable5, constraintAnchor.getMargin(), f6, solverVariableCreateObjectVariable6, solverVariableCreateObjectVariable4, constraintAnchor2.getMargin(), i26);
                                            i23 = i27;
                                            z30 = z32;
                                        } else {
                                            constraintWidget = parent;
                                            i23 = i22;
                                            z31 = z11;
                                        }
                                        if (this.B != 8) {
                                        }
                                        if (z29) {
                                            if (z31) {
                                                i23 = 6;
                                            }
                                            linearSystem.addGreaterThan(solverVariableCreateObjectVariable3, solverVariableCreateObjectVariable5, constraintAnchor.getMargin(), i23);
                                            solverVariableCreateObjectVariable4 = solverVariableCreateObjectVariable4;
                                            linearSystem.addLowerThan(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable6, -constraintAnchor2.getMargin(), i23);
                                        } else {
                                            solverVariableCreateObjectVariable4 = solverVariableCreateObjectVariable4;
                                        }
                                        if (z31) {
                                            constraintWidget2 = constraintWidget;
                                            iMax = i21;
                                        } else {
                                            constraintWidget2 = constraintWidget;
                                            iMax = i21;
                                        }
                                        if (z30) {
                                            if (z28) {
                                                if (constraintWidget3 != constraintWidget2) {
                                                    i40 = iMax;
                                                }
                                                if (constraintWidget3 instanceof Guideline) {
                                                    i40 = 5;
                                                } else {
                                                    i40 = 5;
                                                }
                                                if (constraintWidget3 instanceof Barrier) {
                                                    i40 = 5;
                                                } else {
                                                    i40 = 5;
                                                }
                                                if (z18) {
                                                    i25 = 5;
                                                } else {
                                                    i25 = i40;
                                                }
                                                iMax = Math.max(i25, iMax);
                                            }
                                            if (z31) {
                                                iMin2 = Math.min(i23, iMax);
                                                if (z15) {
                                                    iMax = iMin2;
                                                } else {
                                                    iMax = iMin2;
                                                }
                                            }
                                            linearSystem.addEquality(solverVariableCreateObjectVariable3, solverVariableCreateObjectVariable5, constraintAnchor.getMargin(), iMax);
                                            linearSystem.addEquality(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable6, -constraintAnchor2.getMargin(), iMax);
                                        }
                                        if (z31) {
                                            if (solverVariable == solverVariableCreateObjectVariable5) {
                                                margin = constraintAnchor.getMargin();
                                            } else {
                                                margin = 0;
                                            }
                                            if (solverVariableCreateObjectVariable5 != solverVariable) {
                                                linearSystem.addGreaterThan(solverVariableCreateObjectVariable3, solverVariable, margin, 5);
                                            }
                                        }
                                        if (z31) {
                                            i24 = 5;
                                        } else {
                                            i24 = 5;
                                        }
                                    } else {
                                        if (solverVariableCreateObjectVariable5.isFinalValue && solverVariableCreateObjectVariable6.isFinalValue) {
                                            linearSystem.addCentering(solverVariableCreateObjectVariable3, solverVariableCreateObjectVariable5, constraintAnchor.getMargin(), f6, solverVariableCreateObjectVariable6, solverVariableCreateObjectVariable4, constraintAnchor2.getMargin(), 8);
                                            if (z11 && z25) {
                                                int margin2 = constraintAnchor2.mTarget != null ? constraintAnchor2.getMargin() : 0;
                                                if (solverVariableCreateObjectVariable6 != solverVariable2) {
                                                    linearSystem.addGreaterThan(solverVariable2, solverVariableCreateObjectVariable4, margin2, 5);
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                        }
                                        z26 = true;
                                        z27 = true;
                                        i21 = 4;
                                        i22 = 5;
                                    }
                                    z28 = false;
                                    if (z26) {
                                        z29 = z26;
                                        z30 = z36;
                                    } else {
                                        z29 = z26;
                                        z30 = z36;
                                    }
                                    if (z27) {
                                        if (z24) {
                                            i26 = i40;
                                            z32 = z30;
                                            i27 = i22;
                                            z31 = z11;
                                        } else {
                                            i26 = i40;
                                            z32 = z30;
                                            i27 = i22;
                                            z31 = z11;
                                        }
                                        constraintWidget = parent;
                                        linearSystem.addCentering(solverVariableCreateObjectVariable3, solverVariableCreateObjectVariable5, constraintAnchor.getMargin(), f6, solverVariableCreateObjectVariable6, solverVariableCreateObjectVariable4, constraintAnchor2.getMargin(), i26);
                                        i23 = i27;
                                        z30 = z32;
                                    } else {
                                        constraintWidget = parent;
                                        i23 = i22;
                                        z31 = z11;
                                    }
                                    if (this.B != 8) {
                                    }
                                    if (z29) {
                                        if (z31) {
                                            i23 = 6;
                                        }
                                        linearSystem.addGreaterThan(solverVariableCreateObjectVariable3, solverVariableCreateObjectVariable5, constraintAnchor.getMargin(), i23);
                                        solverVariableCreateObjectVariable4 = solverVariableCreateObjectVariable4;
                                        linearSystem.addLowerThan(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable6, -constraintAnchor2.getMargin(), i23);
                                    } else {
                                        solverVariableCreateObjectVariable4 = solverVariableCreateObjectVariable4;
                                    }
                                    if (z31) {
                                        constraintWidget2 = constraintWidget;
                                        iMax = i21;
                                    } else {
                                        constraintWidget2 = constraintWidget;
                                        iMax = i21;
                                    }
                                    if (z30) {
                                        if (z28) {
                                            if (constraintWidget3 != constraintWidget2) {
                                                i40 = iMax;
                                            }
                                            if (constraintWidget3 instanceof Guideline) {
                                                i40 = 5;
                                            } else {
                                                i40 = 5;
                                            }
                                            if (constraintWidget3 instanceof Barrier) {
                                                i40 = 5;
                                            } else {
                                                i40 = 5;
                                            }
                                            if (z18) {
                                                i25 = 5;
                                            } else {
                                                i25 = i40;
                                            }
                                            iMax = Math.max(i25, iMax);
                                        }
                                        if (z31) {
                                            iMin2 = Math.min(i23, iMax);
                                            if (z15) {
                                                iMax = iMin2;
                                            } else {
                                                iMax = iMin2;
                                            }
                                        }
                                        linearSystem.addEquality(solverVariableCreateObjectVariable3, solverVariableCreateObjectVariable5, constraintAnchor.getMargin(), iMax);
                                        linearSystem.addEquality(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable6, -constraintAnchor2.getMargin(), iMax);
                                    }
                                    if (z31) {
                                        if (solverVariable == solverVariableCreateObjectVariable5) {
                                            margin = constraintAnchor.getMargin();
                                        } else {
                                            margin = 0;
                                        }
                                        if (solverVariableCreateObjectVariable5 != solverVariable) {
                                            linearSystem.addGreaterThan(solverVariableCreateObjectVariable3, solverVariable, margin, 5);
                                        }
                                    }
                                    if (z31) {
                                        i24 = 5;
                                    } else {
                                        i24 = 5;
                                    }
                                }
                                i31 = i24;
                            } else {
                                linearSystem.addEquality(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable6, -constraintAnchor2.getMargin(), 8);
                                if (z11) {
                                    i24 = 5;
                                    linearSystem.addGreaterThan(solverVariableCreateObjectVariable3, solverVariable, 0, 5);
                                }
                                z31 = z11;
                                i31 = i24;
                            }
                            i24 = 5;
                            z31 = z11;
                            i31 = i24;
                        } else {
                            z31 = z11;
                            solverVariableCreateObjectVariable4 = solverVariableCreateObjectVariable4;
                            i31 = (z11 && (constraintAnchor.mTarget.mOwner instanceof Barrier)) ? 8 : 5;
                        }
                        if (z31 || !z25) {
                            return;
                        }
                        int margin3 = constraintAnchor2.mTarget != null ? constraintAnchor2.getMargin() : 0;
                        if (solverVariableCreateObjectVariable6 != solverVariable2) {
                            linearSystem.addGreaterThan(solverVariable2, solverVariableCreateObjectVariable4, margin3, i31);
                            return;
                        }
                        return;
                    }
                    c11 = 2;
                    c10 = 1;
                }
                if (i32 >= c11 && z11 && z25) {
                    linearSystem.addGreaterThan(solverVariableCreateObjectVariable3, solverVariable, 0, 8);
                    char c12 = (z10 || this.mBaseline.mTarget == null) ? c10 : (char) 0;
                    if (!z10 && (constraintAnchor3 = this.mBaseline.mTarget) != null) {
                        ConstraintWidget constraintWidget5 = constraintAnchor3.mOwner;
                        if (constraintWidget5.mDimensionRatio == 0.0f) {
                            return;
                        }
                        DimensionBehaviour[] dimensionBehaviourArr = constraintWidget5.mListDimensionBehaviors;
                        DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[0];
                        DimensionBehaviour dimensionBehaviour3 = DimensionBehaviour.MATCH_CONSTRAINT;
                        if (dimensionBehaviour2 != dimensionBehaviour3 || dimensionBehaviourArr[c10] != dimensionBehaviour3) {
                            return;
                        }
                    } else if (c12 == 0) {
                        return;
                    }
                    linearSystem.addGreaterThan(solverVariable2, solverVariableCreateObjectVariable4, 0, 8);
                    return;
                }
                return;
            }
            int iMax2 = Math.max(i16, iMin);
            if (i17 > 0) {
                iMax2 = Math.min(i17, iMax2);
            }
            linearSystem.addEquality(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable3, iMax2, 8);
            i20 = i16;
            i19 = i17;
            i32 = i32 == true ? 1 : 0;
            z24 = false;
            z25 = z13;
            if (!z20) {
                c10 = 1;
                c11 = 2;
            } else {
                if (!z17) {
                    if (zIsConnected) {
                        if (zIsConnected) {
                        }
                        if (zIsConnected) {
                            if (!zIsConnected) {
                            }
                            i24 = 5;
                            z31 = z11;
                        } else {
                            if (!zIsConnected) {
                            }
                            i24 = 5;
                            z31 = z11;
                        }
                        i31 = i24;
                    } else {
                        if (zIsConnected) {
                        }
                        if (zIsConnected) {
                            if (!zIsConnected) {
                            }
                            i24 = 5;
                            z31 = z11;
                        } else {
                            if (!zIsConnected) {
                            }
                            i24 = 5;
                            z31 = z11;
                        }
                        i31 = i24;
                    }
                    if (z31) {
                        return;
                    } else {
                        return;
                    }
                }
                c11 = 2;
                c10 = 1;
            }
            if (i32 >= c11) {
            }
        }
        if (z14) {
            linearSystem.addEquality(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable3, 0, 3);
            if (i12 > 0) {
                linearSystem.addGreaterThan(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable3, i12, 8);
            }
            if (i13 < Integer.MAX_VALUE) {
                linearSystem.addLowerThan(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable3, i13, 8);
            }
        } else {
            linearSystem.addEquality(solverVariableCreateObjectVariable4, solverVariableCreateObjectVariable3, iMin, i18);
        }
        i20 = i16;
        i19 = i17;
        z24 = z23;
        solverVariableCreateObjectVariable6 = solverVariableCreateObjectVariable6;
        z25 = z13;
        solverVariableCreateObjectVariable5 = solverVariableCreateObjectVariable5;
        if (!z20) {
            c10 = 1;
            c11 = 2;
        } else {
            if (!z17) {
                if (zIsConnected) {
                    if (zIsConnected) {
                    }
                    if (zIsConnected) {
                        if (!zIsConnected) {
                        }
                        i24 = 5;
                        z31 = z11;
                    } else {
                        if (!zIsConnected) {
                        }
                        i24 = 5;
                        z31 = z11;
                    }
                    i31 = i24;
                } else {
                    if (zIsConnected) {
                    }
                    if (zIsConnected) {
                        if (!zIsConnected) {
                        }
                        i24 = 5;
                        z31 = z11;
                    } else {
                        if (!zIsConnected) {
                        }
                        i24 = 5;
                        z31 = z11;
                    }
                    i31 = i24;
                }
                if (z31) {
                    return;
                } else {
                    return;
                }
            }
            c11 = 2;
            c10 = 1;
        }
        if (i32 >= c11) {
        }
    }

    public void connect(ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, int i10) {
        if (constraintAnchor.getOwner() == this) {
            connect(constraintAnchor.getType(), constraintAnchor2.getOwner(), constraintAnchor2.getType(), i10);
        }
    }

    public void connectCircularConstraint(ConstraintWidget constraintWidget, float f6, int i10) {
        ConstraintAnchor.Type type = ConstraintAnchor.Type.CENTER;
        immediateConnect(type, constraintWidget, type, i10, 0);
        this.mCircleConstraintAngle = f6;
    }

    public void copy(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> map) {
        this.mHorizontalResolution = constraintWidget.mHorizontalResolution;
        this.mVerticalResolution = constraintWidget.mVerticalResolution;
        this.mMatchConstraintDefaultWidth = constraintWidget.mMatchConstraintDefaultWidth;
        this.mMatchConstraintDefaultHeight = constraintWidget.mMatchConstraintDefaultHeight;
        int[] iArr = this.mResolvedMatchConstraintDefault;
        int[] iArr2 = constraintWidget.mResolvedMatchConstraintDefault;
        iArr[0] = iArr2[0];
        iArr[1] = iArr2[1];
        this.mMatchConstraintMinWidth = constraintWidget.mMatchConstraintMinWidth;
        this.mMatchConstraintMaxWidth = constraintWidget.mMatchConstraintMaxWidth;
        this.mMatchConstraintMinHeight = constraintWidget.mMatchConstraintMinHeight;
        this.mMatchConstraintMaxHeight = constraintWidget.mMatchConstraintMaxHeight;
        this.mMatchConstraintPercentHeight = constraintWidget.mMatchConstraintPercentHeight;
        this.mIsWidthWrapContent = constraintWidget.mIsWidthWrapContent;
        this.mIsHeightWrapContent = constraintWidget.mIsHeightWrapContent;
        this.f19143j = constraintWidget.f19143j;
        this.f19144k = constraintWidget.f19144k;
        int[] iArr3 = constraintWidget.f19145l;
        this.f19145l = Arrays.copyOf(iArr3, iArr3.length);
        this.mCircleConstraintAngle = constraintWidget.mCircleConstraintAngle;
        this.m = constraintWidget.m;
        this.f19146n = constraintWidget.f19146n;
        this.mLeft.reset();
        this.mTop.reset();
        this.mRight.reset();
        this.mBottom.reset();
        this.mBaseline.reset();
        this.f19150r.reset();
        this.f19151s.reset();
        this.mCenter.reset();
        this.mListDimensionBehaviors = (DimensionBehaviour[]) Arrays.copyOf(this.mListDimensionBehaviors, 2);
        this.mParent = this.mParent == null ? null : map.get(constraintWidget.mParent);
        this.f19153u = constraintWidget.f19153u;
        this.f19154v = constraintWidget.f19154v;
        this.mDimensionRatio = constraintWidget.mDimensionRatio;
        this.mDimensionRatioSide = constraintWidget.mDimensionRatioSide;
        this.mX = constraintWidget.mX;
        this.mY = constraintWidget.mY;
        this.mOffsetX = constraintWidget.mOffsetX;
        this.mOffsetY = constraintWidget.mOffsetY;
        this.f19155w = constraintWidget.f19155w;
        this.mMinWidth = constraintWidget.mMinWidth;
        this.mMinHeight = constraintWidget.mMinHeight;
        this.f19156x = constraintWidget.f19156x;
        this.f19157y = constraintWidget.f19157y;
        this.f19158z = constraintWidget.f19158z;
        this.A = constraintWidget.A;
        this.B = constraintWidget.B;
        this.C = constraintWidget.C;
        this.D = constraintWidget.D;
        this.E = constraintWidget.E;
        this.F = constraintWidget.F;
        this.G = constraintWidget.G;
        float[] fArr = this.mWeight;
        float[] fArr2 = constraintWidget.mWeight;
        fArr[0] = fArr2[0];
        fArr[1] = fArr2[1];
        ConstraintWidget[] constraintWidgetArr = this.mListNextMatchConstraintsWidget;
        ConstraintWidget[] constraintWidgetArr2 = constraintWidget.mListNextMatchConstraintsWidget;
        constraintWidgetArr[0] = constraintWidgetArr2[0];
        constraintWidgetArr[1] = constraintWidgetArr2[1];
        ConstraintWidget[] constraintWidgetArr3 = this.mNextChainWidget;
        ConstraintWidget[] constraintWidgetArr4 = constraintWidget.mNextChainWidget;
        constraintWidgetArr3[0] = constraintWidgetArr4[0];
        constraintWidgetArr3[1] = constraintWidgetArr4[1];
        ConstraintWidget constraintWidget2 = constraintWidget.H;
        this.H = constraintWidget2 == null ? null : map.get(constraintWidget2);
        ConstraintWidget constraintWidget3 = constraintWidget.I;
        this.I = constraintWidget3 != null ? map.get(constraintWidget3) : null;
    }

    public void createObjectVariables(LinearSystem linearSystem) {
        linearSystem.createObjectVariable(this.mLeft);
        linearSystem.createObjectVariable(this.mTop);
        linearSystem.createObjectVariable(this.mRight);
        linearSystem.createObjectVariable(this.mBottom);
        if (this.f19155w > 0) {
            linearSystem.createObjectVariable(this.mBaseline);
        }
    }

    public final boolean e(int i10) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        int i11 = i10 * 2;
        ConstraintAnchor[] constraintAnchorArr = this.mListAnchors;
        ConstraintAnchor constraintAnchor3 = constraintAnchorArr[i11];
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.mTarget;
        return (constraintAnchor4 == null || constraintAnchor4.mTarget == constraintAnchor3 || (constraintAnchor2 = (constraintAnchor = constraintAnchorArr[i11 + 1]).mTarget) == null || constraintAnchor2.mTarget != constraintAnchor) ? false : true;
    }

    public void ensureMeasureRequested() {
        this.f19134a = true;
    }

    public void ensureWidgetRuns() {
        if (this.mHorizontalRun == null) {
            this.mHorizontalRun = new HorizontalWidgetRun(this);
        }
        if (this.mVerticalRun == null) {
            this.mVerticalRun = new VerticalWidgetRun(this);
        }
    }

    public ConstraintAnchor getAnchor(ConstraintAnchor.Type type) {
        switch (a.f19159a[type.ordinal()]) {
            case 1:
                return this.mLeft;
            case 2:
                return this.mTop;
            case 3:
                return this.mRight;
            case 4:
                return this.mBottom;
            case 5:
                return this.mBaseline;
            case 6:
                return this.mCenter;
            case 7:
                return this.f19150r;
            case 8:
                return this.f19151s;
            case 9:
                return null;
            default:
                throw new AssertionError(type.name());
        }
    }

    public ArrayList<ConstraintAnchor> getAnchors() {
        return this.mAnchors;
    }

    public int getBaselineDistance() {
        return this.f19155w;
    }

    public float getBiasPercent(int i10) {
        if (i10 == 0) {
            return this.f19156x;
        }
        if (i10 == 1) {
            return this.f19157y;
        }
        return -1.0f;
    }

    public int getBottom() {
        return getY() + this.f19154v;
    }

    public Object getCompanionWidget() {
        return this.f19158z;
    }

    public int getContainerItemSkip() {
        return this.A;
    }

    public String getDebugName() {
        return this.D;
    }

    public DimensionBehaviour getDimensionBehaviour(int i10) {
        if (i10 == 0) {
            return getHorizontalDimensionBehaviour();
        }
        if (i10 == 1) {
            return getVerticalDimensionBehaviour();
        }
        return null;
    }

    public float getDimensionRatio() {
        return this.mDimensionRatio;
    }

    public int getDimensionRatioSide() {
        return this.mDimensionRatioSide;
    }

    public boolean getHasBaseline() {
        return this.m;
    }

    public int getHeight() {
        if (this.B == 8) {
            return 0;
        }
        return this.f19154v;
    }

    public float getHorizontalBiasPercent() {
        return this.f19156x;
    }

    public ConstraintWidget getHorizontalChainControlWidget() {
        if (!isInHorizontalChain()) {
            return null;
        }
        ConstraintWidget constraintWidget = this;
        ConstraintWidget constraintWidget2 = null;
        while (constraintWidget2 == null && constraintWidget != null) {
            ConstraintAnchor anchor = constraintWidget.getAnchor(ConstraintAnchor.Type.LEFT);
            ConstraintAnchor target = anchor == null ? null : anchor.getTarget();
            ConstraintWidget owner = target == null ? null : target.getOwner();
            if (owner == getParent()) {
                return constraintWidget;
            }
            ConstraintAnchor target2 = owner == null ? null : owner.getAnchor(ConstraintAnchor.Type.RIGHT).getTarget();
            if (target2 == null || target2.getOwner() == constraintWidget) {
                constraintWidget = owner;
            } else {
                constraintWidget2 = constraintWidget;
            }
        }
        return constraintWidget2;
    }

    public int getHorizontalChainStyle() {
        return this.F;
    }

    public DimensionBehaviour getHorizontalDimensionBehaviour() {
        return this.mListDimensionBehaviors[0];
    }

    public int getHorizontalMargin() {
        ConstraintAnchor constraintAnchor = this.mLeft;
        int i10 = constraintAnchor != null ? constraintAnchor.mMargin : 0;
        ConstraintAnchor constraintAnchor2 = this.mRight;
        return constraintAnchor2 != null ? i10 + constraintAnchor2.mMargin : i10;
    }

    public int getLastHorizontalMeasureSpec() {
        return this.f19148p;
    }

    public int getLastVerticalMeasureSpec() {
        return this.f19149q;
    }

    public int getLeft() {
        return getX();
    }

    public int getLength(int i10) {
        if (i10 == 0) {
            return getWidth();
        }
        if (i10 == 1) {
            return getHeight();
        }
        return 0;
    }

    public int getMaxHeight() {
        return this.f19145l[1];
    }

    public int getMaxWidth() {
        return this.f19145l[0];
    }

    public int getMinHeight() {
        return this.mMinHeight;
    }

    public int getMinWidth() {
        return this.mMinWidth;
    }

    public ConstraintWidget getNextChainMember(int i10) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        if (i10 != 0) {
            if (i10 == 1 && (constraintAnchor2 = (constraintAnchor = this.mBottom).mTarget) != null && constraintAnchor2.mTarget == constraintAnchor) {
                return constraintAnchor2.mOwner;
            }
            return null;
        }
        ConstraintAnchor constraintAnchor3 = this.mRight;
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.mTarget;
        if (constraintAnchor4 == null || constraintAnchor4.mTarget != constraintAnchor3) {
            return null;
        }
        return constraintAnchor4.mOwner;
    }

    public int getOptimizerWrapHeight() {
        int iMax;
        int i10 = this.f19154v;
        if (this.mListDimensionBehaviors[1] != DimensionBehaviour.MATCH_CONSTRAINT) {
            return i10;
        }
        if (this.mMatchConstraintDefaultHeight == 1) {
            iMax = Math.max(this.mMatchConstraintMinHeight, i10);
        } else {
            iMax = this.mMatchConstraintMinHeight;
            if (iMax > 0) {
                this.f19154v = iMax;
            } else {
                iMax = 0;
            }
        }
        int i11 = this.mMatchConstraintMaxHeight;
        return (i11 <= 0 || i11 >= iMax) ? iMax : i11;
    }

    public int getOptimizerWrapWidth() {
        int iMax;
        int i10 = this.f19153u;
        if (this.mListDimensionBehaviors[0] != DimensionBehaviour.MATCH_CONSTRAINT) {
            return i10;
        }
        if (this.mMatchConstraintDefaultWidth == 1) {
            iMax = Math.max(this.mMatchConstraintMinWidth, i10);
        } else {
            iMax = this.mMatchConstraintMinWidth;
            if (iMax > 0) {
                this.f19153u = iMax;
            } else {
                iMax = 0;
            }
        }
        int i11 = this.mMatchConstraintMaxWidth;
        return (i11 <= 0 || i11 >= iMax) ? iMax : i11;
    }

    public ConstraintWidget getParent() {
        return this.mParent;
    }

    public ConstraintWidget getPreviousChainMember(int i10) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        if (i10 != 0) {
            if (i10 == 1 && (constraintAnchor2 = (constraintAnchor = this.mTop).mTarget) != null && constraintAnchor2.mTarget == constraintAnchor) {
                return constraintAnchor2.mOwner;
            }
            return null;
        }
        ConstraintAnchor constraintAnchor3 = this.mLeft;
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.mTarget;
        if (constraintAnchor4 == null || constraintAnchor4.mTarget != constraintAnchor3) {
            return null;
        }
        return constraintAnchor4.mOwner;
    }

    public int getRight() {
        return getX() + this.f19153u;
    }

    public int getRootX() {
        return this.mX + this.mOffsetX;
    }

    public int getRootY() {
        return this.mY + this.mOffsetY;
    }

    public WidgetRun getRun(int i10) {
        if (i10 == 0) {
            return this.mHorizontalRun;
        }
        if (i10 == 1) {
            return this.mVerticalRun;
        }
        return null;
    }

    public void getSceneString(StringBuilder sb2) {
        sb2.append("  " + this.stringId + ":{\n");
        StringBuilder sb3 = new StringBuilder("    actualWidth:");
        sb3.append(this.f19153u);
        sb2.append(sb3.toString());
        sb2.append(RootService.LINE_BREAK);
        sb2.append("    actualHeight:" + this.f19154v);
        sb2.append(RootService.LINE_BREAK);
        sb2.append("    actualLeft:" + this.mX);
        sb2.append(RootService.LINE_BREAK);
        sb2.append("    actualTop:" + this.mY);
        sb2.append(RootService.LINE_BREAK);
        d(sb2, Parameters.DIRECTION.LEFT, this.mLeft);
        d(sb2, "top", this.mTop);
        d(sb2, Parameters.DIRECTION.RIGHT, this.mRight);
        d(sb2, "bottom", this.mBottom);
        d(sb2, "baseline", this.mBaseline);
        d(sb2, "centerX", this.f19150r);
        d(sb2, "centerY", this.f19151s);
        int i10 = this.f19153u;
        int i11 = this.mMinWidth;
        int i12 = this.f19145l[0];
        int i13 = this.mMatchConstraintMinWidth;
        int i14 = this.mMatchConstraintDefaultWidth;
        float f6 = this.mMatchConstraintPercentWidth;
        DimensionBehaviour dimensionBehaviour = this.mListDimensionBehaviors[0];
        float f10 = this.mWeight[0];
        c(sb2, "    width", i10, i11, i12, i13, i14, f6, dimensionBehaviour);
        int i15 = this.f19154v;
        int i16 = this.mMinHeight;
        int i17 = this.f19145l[1];
        int i18 = this.mMatchConstraintMinHeight;
        int i19 = this.mMatchConstraintDefaultHeight;
        float f11 = this.mMatchConstraintPercentHeight;
        DimensionBehaviour dimensionBehaviour2 = this.mListDimensionBehaviors[1];
        float f12 = this.mWeight[1];
        c(sb2, "    height", i15, i16, i17, i18, i19, f11, dimensionBehaviour2);
        i(sb2, "    dimensionRatio", this.mDimensionRatio, this.mDimensionRatioSide);
        h(sb2, "    horizontalBias", this.f19156x, DEFAULT_BIAS);
        h(sb2, "    verticalBias", this.f19157y, DEFAULT_BIAS);
        g(sb2, this.F, 0, "    horizontalChainStyle");
        g(sb2, this.G, 0, "    verticalChainStyle");
        sb2.append("  }");
    }

    public int getTop() {
        return getY();
    }

    public String getType() {
        return this.E;
    }

    public float getVerticalBiasPercent() {
        return this.f19157y;
    }

    public ConstraintWidget getVerticalChainControlWidget() {
        if (!isInVerticalChain()) {
            return null;
        }
        ConstraintWidget constraintWidget = this;
        ConstraintWidget constraintWidget2 = null;
        while (constraintWidget2 == null && constraintWidget != null) {
            ConstraintAnchor anchor = constraintWidget.getAnchor(ConstraintAnchor.Type.TOP);
            ConstraintAnchor target = anchor == null ? null : anchor.getTarget();
            ConstraintWidget owner = target == null ? null : target.getOwner();
            if (owner == getParent()) {
                return constraintWidget;
            }
            ConstraintAnchor target2 = owner == null ? null : owner.getAnchor(ConstraintAnchor.Type.BOTTOM).getTarget();
            if (target2 == null || target2.getOwner() == constraintWidget) {
                constraintWidget = owner;
            } else {
                constraintWidget2 = constraintWidget;
            }
        }
        return constraintWidget2;
    }

    public int getVerticalChainStyle() {
        return this.G;
    }

    public DimensionBehaviour getVerticalDimensionBehaviour() {
        return this.mListDimensionBehaviors[1];
    }

    public int getVerticalMargin() {
        int i10 = this.mLeft != null ? this.mTop.mMargin : 0;
        return this.mRight != null ? i10 + this.mBottom.mMargin : i10;
    }

    public int getVisibility() {
        return this.B;
    }

    public int getWidth() {
        if (this.B == 8) {
            return 0;
        }
        return this.f19153u;
    }

    public int getWrapBehaviorInParent() {
        return this.f19142i;
    }

    public int getX() {
        ConstraintWidget constraintWidget = this.mParent;
        return (constraintWidget == null || !(constraintWidget instanceof ConstraintWidgetContainer)) ? this.mX : ((ConstraintWidgetContainer) constraintWidget).M + this.mX;
    }

    public int getY() {
        ConstraintWidget constraintWidget = this.mParent;
        return (constraintWidget == null || !(constraintWidget instanceof ConstraintWidgetContainer)) ? this.mY : ((ConstraintWidgetContainer) constraintWidget).N + this.mY;
    }

    public boolean hasBaseline() {
        return this.m;
    }

    public boolean hasDanglingDimension(int i10) {
        if (i10 == 0) {
            return (this.mLeft.mTarget != null ? 1 : 0) + (this.mRight.mTarget != null ? 1 : 0) < 2;
        }
        return ((this.mTop.mTarget != null ? 1 : 0) + (this.mBottom.mTarget != null ? 1 : 0)) + (this.mBaseline.mTarget != null ? 1 : 0) < 2;
    }

    public boolean hasDependencies() {
        int size = this.mAnchors.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.mAnchors.get(i10).hasDependents()) {
                return true;
            }
        }
        return false;
    }

    public boolean hasDimensionOverride() {
        return (this.f19136c == -1 && this.f19137d == -1) ? false : true;
    }

    public boolean hasResolvedTargets(int i10, int i11) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        if (i10 == 0) {
            ConstraintAnchor constraintAnchor3 = this.mLeft.mTarget;
            if (constraintAnchor3 != null && constraintAnchor3.hasFinalValue() && (constraintAnchor2 = this.mRight.mTarget) != null && constraintAnchor2.hasFinalValue()) {
                return (this.mRight.mTarget.getFinalValue() - this.mRight.getMargin()) - (this.mLeft.getMargin() + this.mLeft.mTarget.getFinalValue()) >= i11;
            }
        } else {
            ConstraintAnchor constraintAnchor4 = this.mTop.mTarget;
            if (constraintAnchor4 != null && constraintAnchor4.hasFinalValue() && (constraintAnchor = this.mBottom.mTarget) != null && constraintAnchor.hasFinalValue()) {
                return (this.mBottom.mTarget.getFinalValue() - this.mBottom.getMargin()) - (this.mTop.getMargin() + this.mTop.mTarget.getFinalValue()) >= i11;
            }
        }
        return false;
    }

    public void immediateConnect(ConstraintAnchor.Type type, ConstraintWidget constraintWidget, ConstraintAnchor.Type type2, int i10, int i11) {
        getAnchor(type).connect(constraintWidget.getAnchor(type2), i10, i11, true);
    }

    public boolean isAnimated() {
        return this.C;
    }

    public boolean isHeightWrapContent() {
        return this.mIsHeightWrapContent;
    }

    public boolean isHorizontalSolvingPassDone() {
        return this.f19140g;
    }

    public boolean isInBarrier(int i10) {
        return this.f19152t[i10];
    }

    public boolean isInHorizontalChain() {
        ConstraintAnchor constraintAnchor = this.mLeft;
        ConstraintAnchor constraintAnchor2 = constraintAnchor.mTarget;
        if (constraintAnchor2 != null && constraintAnchor2.mTarget == constraintAnchor) {
            return true;
        }
        ConstraintAnchor constraintAnchor3 = this.mRight;
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.mTarget;
        return constraintAnchor4 != null && constraintAnchor4.mTarget == constraintAnchor3;
    }

    public boolean isInPlaceholder() {
        return this.f19146n;
    }

    public boolean isInVerticalChain() {
        ConstraintAnchor constraintAnchor = this.mTop;
        ConstraintAnchor constraintAnchor2 = constraintAnchor.mTarget;
        if (constraintAnchor2 != null && constraintAnchor2.mTarget == constraintAnchor) {
            return true;
        }
        ConstraintAnchor constraintAnchor3 = this.mBottom;
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.mTarget;
        return constraintAnchor4 != null && constraintAnchor4.mTarget == constraintAnchor3;
    }

    public boolean isInVirtualLayout() {
        return this.f19147o;
    }

    public boolean isMeasureRequested() {
        return this.f19134a && this.B != 8;
    }

    public boolean isResolvedHorizontally() {
        return this.f19138e || (this.mLeft.hasFinalValue() && this.mRight.hasFinalValue());
    }

    public boolean isResolvedVertically() {
        return this.f19139f || (this.mTop.hasFinalValue() && this.mBottom.hasFinalValue());
    }

    public boolean isRoot() {
        return this.mParent == null;
    }

    public boolean isSpreadHeight() {
        return this.mMatchConstraintDefaultHeight == 0 && this.mDimensionRatio == 0.0f && this.mMatchConstraintMinHeight == 0 && this.mMatchConstraintMaxHeight == 0 && this.mListDimensionBehaviors[1] == DimensionBehaviour.MATCH_CONSTRAINT;
    }

    public boolean isSpreadWidth() {
        return this.mMatchConstraintDefaultWidth == 0 && this.mDimensionRatio == 0.0f && this.mMatchConstraintMinWidth == 0 && this.mMatchConstraintMaxWidth == 0 && this.mListDimensionBehaviors[0] == DimensionBehaviour.MATCH_CONSTRAINT;
    }

    public boolean isVerticalSolvingPassDone() {
        return this.f19141h;
    }

    public boolean isWidthWrapContent() {
        return this.mIsWidthWrapContent;
    }

    public void markHorizontalSolvingPassDone() {
        this.f19140g = true;
    }

    public void markVerticalSolvingPassDone() {
        this.f19141h = true;
    }

    public boolean oppositeDimensionDependsOn(int i10) {
        char c10 = i10 == 0 ? (char) 1 : (char) 0;
        DimensionBehaviour[] dimensionBehaviourArr = this.mListDimensionBehaviors;
        DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[i10];
        DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[c10];
        DimensionBehaviour dimensionBehaviour3 = DimensionBehaviour.MATCH_CONSTRAINT;
        return dimensionBehaviour == dimensionBehaviour3 && dimensionBehaviour2 == dimensionBehaviour3;
    }

    public boolean oppositeDimensionsTied() {
        DimensionBehaviour[] dimensionBehaviourArr = this.mListDimensionBehaviors;
        DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
        DimensionBehaviour dimensionBehaviour2 = DimensionBehaviour.MATCH_CONSTRAINT;
        return dimensionBehaviour == dimensionBehaviour2 && dimensionBehaviourArr[1] == dimensionBehaviour2;
    }

    public void reset() {
        this.mLeft.reset();
        this.mTop.reset();
        this.mRight.reset();
        this.mBottom.reset();
        this.mBaseline.reset();
        this.f19150r.reset();
        this.f19151s.reset();
        this.mCenter.reset();
        this.mParent = null;
        this.mCircleConstraintAngle = Float.NaN;
        this.f19153u = 0;
        this.f19154v = 0;
        this.mDimensionRatio = 0.0f;
        this.mDimensionRatioSide = -1;
        this.mX = 0;
        this.mY = 0;
        this.mOffsetX = 0;
        this.mOffsetY = 0;
        this.f19155w = 0;
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        float f6 = DEFAULT_BIAS;
        this.f19156x = f6;
        this.f19157y = f6;
        DimensionBehaviour[] dimensionBehaviourArr = this.mListDimensionBehaviors;
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.FIXED;
        dimensionBehaviourArr[0] = dimensionBehaviour;
        dimensionBehaviourArr[1] = dimensionBehaviour;
        this.f19158z = null;
        this.A = 0;
        this.B = 0;
        this.E = null;
        this.F = 0;
        this.G = 0;
        float[] fArr = this.mWeight;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.mHorizontalResolution = -1;
        this.mVerticalResolution = -1;
        int[] iArr = this.f19145l;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.mMatchConstraintDefaultWidth = 0;
        this.mMatchConstraintDefaultHeight = 0;
        this.mMatchConstraintPercentWidth = 1.0f;
        this.mMatchConstraintPercentHeight = 1.0f;
        this.mMatchConstraintMaxWidth = Integer.MAX_VALUE;
        this.mMatchConstraintMaxHeight = Integer.MAX_VALUE;
        this.mMatchConstraintMinWidth = 0;
        this.mMatchConstraintMinHeight = 0;
        this.f19143j = -1;
        this.f19144k = 1.0f;
        boolean[] zArr = this.isTerminalWidget;
        zArr[0] = true;
        zArr[1] = true;
        this.f19147o = false;
        boolean[] zArr2 = this.f19152t;
        zArr2[0] = false;
        zArr2[1] = false;
        this.f19134a = true;
        int[] iArr2 = this.mResolvedMatchConstraintDefault;
        iArr2[0] = 0;
        iArr2[1] = 0;
        this.f19136c = -1;
        this.f19137d = -1;
    }

    public void resetAllConstraints() {
        resetAnchors();
        setVerticalBiasPercent(DEFAULT_BIAS);
        setHorizontalBiasPercent(DEFAULT_BIAS);
    }

    public void resetAnchor(ConstraintAnchor constraintAnchor) {
        if (getParent() != null && (getParent() instanceof ConstraintWidgetContainer) && ((ConstraintWidgetContainer) getParent()).handlesInternalConstraints()) {
            return;
        }
        ConstraintAnchor anchor = getAnchor(ConstraintAnchor.Type.LEFT);
        ConstraintAnchor anchor2 = getAnchor(ConstraintAnchor.Type.RIGHT);
        ConstraintAnchor anchor3 = getAnchor(ConstraintAnchor.Type.TOP);
        ConstraintAnchor anchor4 = getAnchor(ConstraintAnchor.Type.BOTTOM);
        ConstraintAnchor anchor5 = getAnchor(ConstraintAnchor.Type.CENTER);
        ConstraintAnchor anchor6 = getAnchor(ConstraintAnchor.Type.CENTER_X);
        ConstraintAnchor anchor7 = getAnchor(ConstraintAnchor.Type.CENTER_Y);
        if (constraintAnchor == anchor5) {
            if (anchor.isConnected() && anchor2.isConnected() && anchor.getTarget() == anchor2.getTarget()) {
                anchor.reset();
                anchor2.reset();
            }
            if (anchor3.isConnected() && anchor4.isConnected() && anchor3.getTarget() == anchor4.getTarget()) {
                anchor3.reset();
                anchor4.reset();
            }
            this.f19156x = 0.5f;
            this.f19157y = 0.5f;
        } else if (constraintAnchor == anchor6) {
            if (anchor.isConnected() && anchor2.isConnected() && anchor.getTarget().getOwner() == anchor2.getTarget().getOwner()) {
                anchor.reset();
                anchor2.reset();
            }
            this.f19156x = 0.5f;
        } else if (constraintAnchor == anchor7) {
            if (anchor3.isConnected() && anchor4.isConnected() && anchor3.getTarget().getOwner() == anchor4.getTarget().getOwner()) {
                anchor3.reset();
                anchor4.reset();
            }
            this.f19157y = 0.5f;
        } else if (constraintAnchor == anchor || constraintAnchor == anchor2) {
            if (anchor.isConnected() && anchor.getTarget() == anchor2.getTarget()) {
                anchor5.reset();
            }
        } else if ((constraintAnchor == anchor3 || constraintAnchor == anchor4) && anchor3.isConnected() && anchor3.getTarget() == anchor4.getTarget()) {
            anchor5.reset();
        }
        constraintAnchor.reset();
    }

    public void resetAnchors() {
        ConstraintWidget parent = getParent();
        if (parent != null && (parent instanceof ConstraintWidgetContainer) && ((ConstraintWidgetContainer) getParent()).handlesInternalConstraints()) {
            return;
        }
        int size = this.mAnchors.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.mAnchors.get(i10).reset();
        }
    }

    public void resetFinalResolution() {
        this.f19138e = false;
        this.f19139f = false;
        this.f19140g = false;
        this.f19141h = false;
        int size = this.mAnchors.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.mAnchors.get(i10).resetFinalResolution();
        }
    }

    public void resetSolverVariables(Cache cache) {
        this.mLeft.resetSolverVariable(cache);
        this.mTop.resetSolverVariable(cache);
        this.mRight.resetSolverVariable(cache);
        this.mBottom.resetSolverVariable(cache);
        this.mBaseline.resetSolverVariable(cache);
        this.mCenter.resetSolverVariable(cache);
        this.f19150r.resetSolverVariable(cache);
        this.f19151s.resetSolverVariable(cache);
    }

    public void resetSolvingPassFlag() {
        this.f19140g = false;
        this.f19141h = false;
    }

    public StringBuilder serialize(StringBuilder sb2) {
        sb2.append("{\n");
        f(sb2, Parameters.DIRECTION.LEFT, this.mLeft);
        f(sb2, "top", this.mTop);
        f(sb2, Parameters.DIRECTION.RIGHT, this.mRight);
        f(sb2, "bottom", this.mBottom);
        f(sb2, "baseline", this.mBaseline);
        f(sb2, "centerX", this.f19150r);
        f(sb2, "centerY", this.f19151s);
        ConstraintAnchor constraintAnchor = this.mCenter;
        float f6 = this.mCircleConstraintAngle;
        if (constraintAnchor.mTarget != null && !Float.isNaN(f6)) {
            sb2.append("circle : [ '");
            sb2.append(constraintAnchor.mTarget);
            sb2.append("',");
            sb2.append(constraintAnchor.mMargin);
            sb2.append(",");
            sb2.append(f6);
            sb2.append(",");
            sb2.append(" ] ,\n");
        }
        j(sb2, "width", this.f19153u, this.mMinWidth, this.f19145l[0], this.f19136c, this.mMatchConstraintMinWidth, this.mMatchConstraintDefaultWidth, this.mMatchConstraintPercentWidth, this.mWeight[0]);
        j(sb2, "height", this.f19154v, this.mMinHeight, this.f19145l[1], this.f19137d, this.mMatchConstraintMinHeight, this.mMatchConstraintDefaultHeight, this.mMatchConstraintPercentHeight, this.mWeight[1]);
        i(sb2, "dimensionRatio", this.mDimensionRatio, this.mDimensionRatioSide);
        h(sb2, "horizontalBias", this.f19156x, DEFAULT_BIAS);
        h(sb2, "verticalBias", this.f19157y, DEFAULT_BIAS);
        sb2.append("}\n");
        return sb2;
    }

    public void setAnimated(boolean z10) {
        this.C = z10;
    }

    public void setBaselineDistance(int i10) {
        this.f19155w = i10;
        this.m = i10 > 0;
    }

    public void setCompanionWidget(Object obj) {
        this.f19158z = obj;
    }

    public void setContainerItemSkip(int i10) {
        if (i10 >= 0) {
            this.A = i10;
        } else {
            this.A = 0;
        }
    }

    public void setDebugName(String str) {
        this.D = str;
    }

    public void setDebugSolverName(LinearSystem linearSystem, String str) {
        this.D = str;
        SolverVariable solverVariableCreateObjectVariable = linearSystem.createObjectVariable(this.mLeft);
        SolverVariable solverVariableCreateObjectVariable2 = linearSystem.createObjectVariable(this.mTop);
        SolverVariable solverVariableCreateObjectVariable3 = linearSystem.createObjectVariable(this.mRight);
        SolverVariable solverVariableCreateObjectVariable4 = linearSystem.createObjectVariable(this.mBottom);
        solverVariableCreateObjectVariable.setName(str + ".left");
        solverVariableCreateObjectVariable2.setName(str + ".top");
        solverVariableCreateObjectVariable3.setName(str + ".right");
        solverVariableCreateObjectVariable4.setName(str + ".bottom");
        linearSystem.createObjectVariable(this.mBaseline).setName(str + ".baseline");
    }

    public void setDimension(int i10, int i11) {
        this.f19153u = i10;
        int i12 = this.mMinWidth;
        if (i10 < i12) {
            this.f19153u = i12;
        }
        this.f19154v = i11;
        int i13 = this.mMinHeight;
        if (i11 < i13) {
            this.f19154v = i13;
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0086 A[PHI: r0
      0x0086: PHI (r0v2 int) = (r0v1 int), (r0v0 int), (r0v0 int), (r0v0 int), (r0v0 int), (r0v0 int) binds: [B:46:0x0086, B:36:0x007f, B:24:0x0051, B:26:0x0057, B:28:0x0063, B:30:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0086 -> B:40:0x0087). Please report as a decompilation issue!!! */
    public void setDimensionRatio(String str) {
        float fAbs;
        int i10 = 0;
        if (str == null || str.length() == 0) {
            this.mDimensionRatio = 0.0f;
            return;
        }
        int length = str.length();
        int iIndexOf = str.indexOf(44);
        int i11 = 0;
        int i12 = -1;
        if (iIndexOf > 0 && iIndexOf < length - 1) {
            String strSubstring = str.substring(0, iIndexOf);
            if (!strSubstring.equalsIgnoreCase(ExifInterface.LONGITUDE_WEST)) {
                i11 = strSubstring.equalsIgnoreCase("H") ? 1 : -1;
            }
            i12 = i11;
            i11 = iIndexOf + 1;
        }
        int iIndexOf2 = str.indexOf(58);
        try {
            if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                String strSubstring2 = str.substring(i11);
                if (strSubstring2.length() > 0) {
                    fAbs = Float.parseFloat(strSubstring2);
                } else {
                    fAbs = i10;
                }
            } else {
                String strSubstring3 = str.substring(i11, iIndexOf2);
                String strSubstring4 = str.substring(iIndexOf2 + 1);
                if (strSubstring3.length() <= 0 || strSubstring4.length() <= 0) {
                    fAbs = i10;
                } else {
                    float f6 = Float.parseFloat(strSubstring3);
                    float f10 = Float.parseFloat(strSubstring4);
                    if (f6 <= 0.0f || f10 <= 0.0f) {
                        fAbs = i10;
                    } else {
                        fAbs = i12 == 1 ? Math.abs(f10 / f6) : Math.abs(f6 / f10);
                    }
                }
            }
        } catch (NumberFormatException unused) {
        }
        i10 = (fAbs > i10 ? 1 : (fAbs == i10 ? 0 : -1));
        if (i10 > 0) {
            this.mDimensionRatio = fAbs;
            this.mDimensionRatioSide = i12;
        }
    }

    public void setFinalBaseline(int i10) {
        if (this.m) {
            int i11 = i10 - this.f19155w;
            int i12 = this.f19154v + i11;
            this.mY = i11;
            this.mTop.setFinalValue(i11);
            this.mBottom.setFinalValue(i12);
            this.mBaseline.setFinalValue(i10);
            this.f19139f = true;
        }
    }

    public void setFinalFrame(int i10, int i11, int i12, int i13, int i14, int i15) {
        setFrame(i10, i11, i12, i13);
        setBaselineDistance(i14);
        if (i15 == 0) {
            this.f19138e = true;
            this.f19139f = false;
        } else if (i15 == 1) {
            this.f19138e = false;
            this.f19139f = true;
        } else if (i15 == 2) {
            this.f19138e = true;
            this.f19139f = true;
        } else {
            this.f19138e = false;
            this.f19139f = false;
        }
    }

    public void setFinalHorizontal(int i10, int i11) {
        if (this.f19138e) {
            return;
        }
        this.mLeft.setFinalValue(i10);
        this.mRight.setFinalValue(i11);
        this.mX = i10;
        this.f19153u = i11 - i10;
        this.f19138e = true;
    }

    public void setFinalLeft(int i10) {
        this.mLeft.setFinalValue(i10);
        this.mX = i10;
    }

    public void setFinalTop(int i10) {
        this.mTop.setFinalValue(i10);
        this.mY = i10;
    }

    public void setFinalVertical(int i10, int i11) {
        if (this.f19139f) {
            return;
        }
        this.mTop.setFinalValue(i10);
        this.mBottom.setFinalValue(i11);
        this.mY = i10;
        this.f19154v = i11 - i10;
        if (this.m) {
            this.mBaseline.setFinalValue(i10 + this.f19155w);
        }
        this.f19139f = true;
    }

    public void setFrame(int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16 = i12 - i10;
        int i17 = i13 - i11;
        this.mX = i10;
        this.mY = i11;
        if (this.B == 8) {
            this.f19153u = 0;
            this.f19154v = 0;
            return;
        }
        DimensionBehaviour[] dimensionBehaviourArr = this.mListDimensionBehaviors;
        DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
        DimensionBehaviour dimensionBehaviour2 = DimensionBehaviour.FIXED;
        if (dimensionBehaviour == dimensionBehaviour2 && i16 < (i15 = this.f19153u)) {
            i16 = i15;
        }
        if (dimensionBehaviourArr[1] == dimensionBehaviour2 && i17 < (i14 = this.f19154v)) {
            i17 = i14;
        }
        this.f19153u = i16;
        this.f19154v = i17;
        int i18 = this.mMinHeight;
        if (i17 < i18) {
            this.f19154v = i18;
        }
        int i19 = this.mMinWidth;
        if (i16 < i19) {
            this.f19153u = i19;
        }
        int i20 = this.mMatchConstraintMaxWidth;
        if (i20 > 0 && dimensionBehaviour == DimensionBehaviour.MATCH_CONSTRAINT) {
            this.f19153u = Math.min(this.f19153u, i20);
        }
        int i21 = this.mMatchConstraintMaxHeight;
        if (i21 > 0 && this.mListDimensionBehaviors[1] == DimensionBehaviour.MATCH_CONSTRAINT) {
            this.f19154v = Math.min(this.f19154v, i21);
        }
        int i22 = this.f19153u;
        if (i16 != i22) {
            this.f19136c = i22;
        }
        int i23 = this.f19154v;
        if (i17 != i23) {
            this.f19137d = i23;
        }
    }

    public void setGoneMargin(ConstraintAnchor.Type type, int i10) {
        int i11 = a.f19159a[type.ordinal()];
        if (i11 == 1) {
            this.mLeft.f19132d = i10;
            return;
        }
        if (i11 == 2) {
            this.mTop.f19132d = i10;
            return;
        }
        if (i11 == 3) {
            this.mRight.f19132d = i10;
        } else if (i11 == 4) {
            this.mBottom.f19132d = i10;
        } else {
            if (i11 != 5) {
                return;
            }
            this.mBaseline.f19132d = i10;
        }
    }

    public void setHasBaseline(boolean z10) {
        this.m = z10;
    }

    public void setHeight(int i10) {
        this.f19154v = i10;
        int i11 = this.mMinHeight;
        if (i10 < i11) {
            this.f19154v = i11;
        }
    }

    public void setHeightWrapContent(boolean z10) {
        this.mIsHeightWrapContent = z10;
    }

    public void setHorizontalBiasPercent(float f6) {
        this.f19156x = f6;
    }

    public void setHorizontalChainStyle(int i10) {
        this.F = i10;
    }

    public void setHorizontalDimension(int i10, int i11) {
        this.mX = i10;
        int i12 = i11 - i10;
        this.f19153u = i12;
        int i13 = this.mMinWidth;
        if (i12 < i13) {
            this.f19153u = i13;
        }
    }

    public void setHorizontalDimensionBehaviour(DimensionBehaviour dimensionBehaviour) {
        this.mListDimensionBehaviors[0] = dimensionBehaviour;
    }

    public void setHorizontalMatchStyle(int i10, int i11, int i12, float f6) {
        this.mMatchConstraintDefaultWidth = i10;
        this.mMatchConstraintMinWidth = i11;
        if (i12 == Integer.MAX_VALUE) {
            i12 = 0;
        }
        this.mMatchConstraintMaxWidth = i12;
        this.mMatchConstraintPercentWidth = f6;
        if (f6 <= 0.0f || f6 >= 1.0f || i10 != 0) {
            return;
        }
        this.mMatchConstraintDefaultWidth = 2;
    }

    public void setHorizontalWeight(float f6) {
        this.mWeight[0] = f6;
    }

    public void setInBarrier(int i10, boolean z10) {
        this.f19152t[i10] = z10;
    }

    public void setInPlaceholder(boolean z10) {
        this.f19146n = z10;
    }

    public void setInVirtualLayout(boolean z10) {
        this.f19147o = z10;
    }

    public void setLastMeasureSpec(int i10, int i11) {
        this.f19148p = i10;
        this.f19149q = i11;
        setMeasureRequested(false);
    }

    public void setLength(int i10, int i11) {
        if (i11 == 0) {
            setWidth(i10);
        } else if (i11 == 1) {
            setHeight(i10);
        }
    }

    public void setMaxHeight(int i10) {
        this.f19145l[1] = i10;
    }

    public void setMaxWidth(int i10) {
        this.f19145l[0] = i10;
    }

    public void setMeasureRequested(boolean z10) {
        this.f19134a = z10;
    }

    public void setMinHeight(int i10) {
        if (i10 < 0) {
            this.mMinHeight = 0;
        } else {
            this.mMinHeight = i10;
        }
    }

    public void setMinWidth(int i10) {
        if (i10 < 0) {
            this.mMinWidth = 0;
        } else {
            this.mMinWidth = i10;
        }
    }

    public void setOffset(int i10, int i11) {
        this.mOffsetX = i10;
        this.mOffsetY = i11;
    }

    public void setOrigin(int i10, int i11) {
        this.mX = i10;
        this.mY = i11;
    }

    public void setParent(ConstraintWidget constraintWidget) {
        this.mParent = constraintWidget;
    }

    public void setType(String str) {
        this.E = str;
    }

    public void setVerticalBiasPercent(float f6) {
        this.f19157y = f6;
    }

    public void setVerticalChainStyle(int i10) {
        this.G = i10;
    }

    public void setVerticalDimension(int i10, int i11) {
        this.mY = i10;
        int i12 = i11 - i10;
        this.f19154v = i12;
        int i13 = this.mMinHeight;
        if (i12 < i13) {
            this.f19154v = i13;
        }
    }

    public void setVerticalDimensionBehaviour(DimensionBehaviour dimensionBehaviour) {
        this.mListDimensionBehaviors[1] = dimensionBehaviour;
    }

    public void setVerticalMatchStyle(int i10, int i11, int i12, float f6) {
        this.mMatchConstraintDefaultHeight = i10;
        this.mMatchConstraintMinHeight = i11;
        if (i12 == Integer.MAX_VALUE) {
            i12 = 0;
        }
        this.mMatchConstraintMaxHeight = i12;
        this.mMatchConstraintPercentHeight = f6;
        if (f6 <= 0.0f || f6 >= 1.0f || i10 != 0) {
            return;
        }
        this.mMatchConstraintDefaultHeight = 2;
    }

    public void setVerticalWeight(float f6) {
        this.mWeight[1] = f6;
    }

    public void setVisibility(int i10) {
        this.B = i10;
    }

    public void setWidth(int i10) {
        this.f19153u = i10;
        int i11 = this.mMinWidth;
        if (i10 < i11) {
            this.f19153u = i11;
        }
    }

    public void setWidthWrapContent(boolean z10) {
        this.mIsWidthWrapContent = z10;
    }

    public void setWrapBehaviorInParent(int i10) {
        if (i10 < 0 || i10 > 3) {
            return;
        }
        this.f19142i = i10;
    }

    public void setX(int i10) {
        this.mX = i10;
    }

    public void setY(int i10) {
        this.mY = i10;
    }

    public void setupDimensionRatio(boolean z10, boolean z11, boolean z12, boolean z13) {
        if (this.f19143j == -1) {
            if (z12 && !z13) {
                this.f19143j = 0;
            } else if (!z12 && z13) {
                this.f19143j = 1;
                if (this.mDimensionRatioSide == -1) {
                    this.f19144k = 1.0f / this.f19144k;
                }
            }
        }
        if (this.f19143j == 0 && (!this.mTop.isConnected() || !this.mBottom.isConnected())) {
            this.f19143j = 1;
        } else if (this.f19143j == 1 && (!this.mLeft.isConnected() || !this.mRight.isConnected())) {
            this.f19143j = 0;
        }
        if (this.f19143j == -1 && (!this.mTop.isConnected() || !this.mBottom.isConnected() || !this.mLeft.isConnected() || !this.mRight.isConnected())) {
            if (this.mTop.isConnected() && this.mBottom.isConnected()) {
                this.f19143j = 0;
            } else if (this.mLeft.isConnected() && this.mRight.isConnected()) {
                this.f19144k = 1.0f / this.f19144k;
                this.f19143j = 1;
            }
        }
        if (this.f19143j == -1) {
            int i10 = this.mMatchConstraintMinWidth;
            if (i10 > 0 && this.mMatchConstraintMinHeight == 0) {
                this.f19143j = 0;
            } else {
                if (i10 != 0 || this.mMatchConstraintMinHeight <= 0) {
                    return;
                }
                this.f19144k = 1.0f / this.f19144k;
                this.f19143j = 1;
            }
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.E != null ? d.f(new StringBuilder("type: "), this.E, " ") : "");
        sb2.append(this.D != null ? d.f(new StringBuilder("id: "), this.D, " ") : "");
        sb2.append("(");
        sb2.append(this.mX);
        sb2.append(", ");
        sb2.append(this.mY);
        sb2.append(") - (");
        sb2.append(this.f19153u);
        sb2.append(" x ");
        return androidx.appcompat.widget.a.c(sb2, this.f19154v, ")");
    }

    public void updateFromRuns(boolean z10, boolean z11) {
        int i10;
        int i11;
        boolean zIsResolved = z10 & this.mHorizontalRun.isResolved();
        boolean zIsResolved2 = z11 & this.mVerticalRun.isResolved();
        HorizontalWidgetRun horizontalWidgetRun = this.mHorizontalRun;
        int i12 = horizontalWidgetRun.start.value;
        VerticalWidgetRun verticalWidgetRun = this.mVerticalRun;
        int i13 = verticalWidgetRun.start.value;
        int i14 = horizontalWidgetRun.end.value;
        int i15 = verticalWidgetRun.end.value;
        int i16 = i15 - i13;
        if (i14 - i12 < 0 || i16 < 0 || i12 == Integer.MIN_VALUE || i12 == Integer.MAX_VALUE || i13 == Integer.MIN_VALUE || i13 == Integer.MAX_VALUE || i14 == Integer.MIN_VALUE || i14 == Integer.MAX_VALUE || i15 == Integer.MIN_VALUE || i15 == Integer.MAX_VALUE) {
            i14 = 0;
            i12 = 0;
            i15 = 0;
            i13 = 0;
        }
        int i17 = i14 - i12;
        int i18 = i15 - i13;
        if (zIsResolved) {
            this.mX = i12;
        }
        if (zIsResolved2) {
            this.mY = i13;
        }
        if (this.B == 8) {
            this.f19153u = 0;
            this.f19154v = 0;
            return;
        }
        if (zIsResolved) {
            if (this.mListDimensionBehaviors[0] == DimensionBehaviour.FIXED && i17 < (i11 = this.f19153u)) {
                i17 = i11;
            }
            this.f19153u = i17;
            int i19 = this.mMinWidth;
            if (i17 < i19) {
                this.f19153u = i19;
            }
        }
        if (zIsResolved2) {
            if (this.mListDimensionBehaviors[1] == DimensionBehaviour.FIXED && i18 < (i10 = this.f19154v)) {
                i18 = i10;
            }
            this.f19154v = i18;
            int i20 = this.mMinHeight;
            if (i18 < i20) {
                this.f19154v = i20;
            }
        }
    }

    public void updateFromSolver(LinearSystem linearSystem, boolean z10) {
        VerticalWidgetRun verticalWidgetRun;
        HorizontalWidgetRun horizontalWidgetRun;
        int objectVariableValue = linearSystem.getObjectVariableValue(this.mLeft);
        int objectVariableValue2 = linearSystem.getObjectVariableValue(this.mTop);
        int objectVariableValue3 = linearSystem.getObjectVariableValue(this.mRight);
        int objectVariableValue4 = linearSystem.getObjectVariableValue(this.mBottom);
        if (z10 && (horizontalWidgetRun = this.mHorizontalRun) != null) {
            DependencyNode dependencyNode = horizontalWidgetRun.start;
            if (dependencyNode.resolved) {
                DependencyNode dependencyNode2 = horizontalWidgetRun.end;
                if (dependencyNode2.resolved) {
                    objectVariableValue = dependencyNode.value;
                    objectVariableValue3 = dependencyNode2.value;
                }
            }
        }
        if (z10 && (verticalWidgetRun = this.mVerticalRun) != null) {
            DependencyNode dependencyNode3 = verticalWidgetRun.start;
            if (dependencyNode3.resolved) {
                DependencyNode dependencyNode4 = verticalWidgetRun.end;
                if (dependencyNode4.resolved) {
                    objectVariableValue2 = dependencyNode3.value;
                    objectVariableValue4 = dependencyNode4.value;
                }
            }
        }
        int i10 = objectVariableValue4 - objectVariableValue2;
        if (objectVariableValue3 - objectVariableValue < 0 || i10 < 0 || objectVariableValue == Integer.MIN_VALUE || objectVariableValue == Integer.MAX_VALUE || objectVariableValue2 == Integer.MIN_VALUE || objectVariableValue2 == Integer.MAX_VALUE || objectVariableValue3 == Integer.MIN_VALUE || objectVariableValue3 == Integer.MAX_VALUE || objectVariableValue4 == Integer.MIN_VALUE || objectVariableValue4 == Integer.MAX_VALUE) {
            objectVariableValue = 0;
            objectVariableValue4 = 0;
            objectVariableValue2 = 0;
            objectVariableValue3 = 0;
        }
        setFrame(objectVariableValue, objectVariableValue2, objectVariableValue3, objectVariableValue4);
    }

    public void connect(ConstraintAnchor.Type type, ConstraintWidget constraintWidget, ConstraintAnchor.Type type2) {
        connect(type, constraintWidget, type2, 0);
    }

    public void connect(ConstraintAnchor.Type type, ConstraintWidget constraintWidget, ConstraintAnchor.Type type2, int i10) {
        ConstraintAnchor.Type type3;
        ConstraintAnchor.Type type4;
        boolean z10;
        ConstraintAnchor.Type type5 = ConstraintAnchor.Type.CENTER;
        if (type == type5) {
            if (type2 == type5) {
                ConstraintAnchor.Type type6 = ConstraintAnchor.Type.LEFT;
                ConstraintAnchor anchor = getAnchor(type6);
                ConstraintAnchor.Type type7 = ConstraintAnchor.Type.RIGHT;
                ConstraintAnchor anchor2 = getAnchor(type7);
                ConstraintAnchor.Type type8 = ConstraintAnchor.Type.TOP;
                ConstraintAnchor anchor3 = getAnchor(type8);
                ConstraintAnchor.Type type9 = ConstraintAnchor.Type.BOTTOM;
                ConstraintAnchor anchor4 = getAnchor(type9);
                boolean z11 = true;
                if ((anchor == null || !anchor.isConnected()) && (anchor2 == null || !anchor2.isConnected())) {
                    connect(type6, constraintWidget, type6, 0);
                    connect(type7, constraintWidget, type7, 0);
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((anchor3 == null || !anchor3.isConnected()) && (anchor4 == null || !anchor4.isConnected())) {
                    connect(type8, constraintWidget, type8, 0);
                    connect(type9, constraintWidget, type9, 0);
                } else {
                    z11 = false;
                }
                if (z10 && z11) {
                    getAnchor(type5).connect(constraintWidget.getAnchor(type5), 0);
                    return;
                }
                if (z10) {
                    ConstraintAnchor.Type type10 = ConstraintAnchor.Type.CENTER_X;
                    getAnchor(type10).connect(constraintWidget.getAnchor(type10), 0);
                    return;
                } else {
                    if (z11) {
                        ConstraintAnchor.Type type11 = ConstraintAnchor.Type.CENTER_Y;
                        getAnchor(type11).connect(constraintWidget.getAnchor(type11), 0);
                        return;
                    }
                    return;
                }
            }
            ConstraintAnchor.Type type12 = ConstraintAnchor.Type.LEFT;
            if (type2 != type12 && type2 != ConstraintAnchor.Type.RIGHT) {
                ConstraintAnchor.Type type13 = ConstraintAnchor.Type.TOP;
                if (type2 == type13 || type2 == ConstraintAnchor.Type.BOTTOM) {
                    connect(type13, constraintWidget, type2, 0);
                    connect(ConstraintAnchor.Type.BOTTOM, constraintWidget, type2, 0);
                    getAnchor(type5).connect(constraintWidget.getAnchor(type2), 0);
                    return;
                }
                return;
            }
            connect(type12, constraintWidget, type2, 0);
            connect(ConstraintAnchor.Type.RIGHT, constraintWidget, type2, 0);
            getAnchor(type5).connect(constraintWidget.getAnchor(type2), 0);
            return;
        }
        ConstraintAnchor.Type type14 = ConstraintAnchor.Type.CENTER_X;
        if (type == type14 && (type2 == (type4 = ConstraintAnchor.Type.LEFT) || type2 == ConstraintAnchor.Type.RIGHT)) {
            ConstraintAnchor anchor5 = getAnchor(type4);
            ConstraintAnchor anchor6 = constraintWidget.getAnchor(type2);
            ConstraintAnchor anchor7 = getAnchor(ConstraintAnchor.Type.RIGHT);
            anchor5.connect(anchor6, 0);
            anchor7.connect(anchor6, 0);
            getAnchor(type14).connect(anchor6, 0);
            return;
        }
        ConstraintAnchor.Type type15 = ConstraintAnchor.Type.CENTER_Y;
        if (type == type15 && (type2 == (type3 = ConstraintAnchor.Type.TOP) || type2 == ConstraintAnchor.Type.BOTTOM)) {
            ConstraintAnchor anchor8 = constraintWidget.getAnchor(type2);
            getAnchor(type3).connect(anchor8, 0);
            getAnchor(ConstraintAnchor.Type.BOTTOM).connect(anchor8, 0);
            getAnchor(type15).connect(anchor8, 0);
            return;
        }
        if (type == type14 && type2 == type14) {
            ConstraintAnchor.Type type16 = ConstraintAnchor.Type.LEFT;
            getAnchor(type16).connect(constraintWidget.getAnchor(type16), 0);
            ConstraintAnchor.Type type17 = ConstraintAnchor.Type.RIGHT;
            getAnchor(type17).connect(constraintWidget.getAnchor(type17), 0);
            getAnchor(type14).connect(constraintWidget.getAnchor(type2), 0);
            return;
        }
        if (type == type15 && type2 == type15) {
            ConstraintAnchor.Type type18 = ConstraintAnchor.Type.TOP;
            getAnchor(type18).connect(constraintWidget.getAnchor(type18), 0);
            ConstraintAnchor.Type type19 = ConstraintAnchor.Type.BOTTOM;
            getAnchor(type19).connect(constraintWidget.getAnchor(type19), 0);
            getAnchor(type15).connect(constraintWidget.getAnchor(type2), 0);
            return;
        }
        ConstraintAnchor anchor9 = getAnchor(type);
        ConstraintAnchor anchor10 = constraintWidget.getAnchor(type2);
        if (anchor9.isValidConnection(anchor10)) {
            ConstraintAnchor.Type type20 = ConstraintAnchor.Type.BASELINE;
            if (type == type20) {
                ConstraintAnchor anchor11 = getAnchor(ConstraintAnchor.Type.TOP);
                ConstraintAnchor anchor12 = getAnchor(ConstraintAnchor.Type.BOTTOM);
                if (anchor11 != null) {
                    anchor11.reset();
                }
                if (anchor12 != null) {
                    anchor12.reset();
                }
            } else if (type != ConstraintAnchor.Type.TOP && type != ConstraintAnchor.Type.BOTTOM) {
                if (type == ConstraintAnchor.Type.LEFT || type == ConstraintAnchor.Type.RIGHT) {
                    ConstraintAnchor anchor13 = getAnchor(type5);
                    if (anchor13.getTarget() != anchor10) {
                        anchor13.reset();
                    }
                    ConstraintAnchor opposite = getAnchor(type).getOpposite();
                    ConstraintAnchor anchor14 = getAnchor(type14);
                    if (anchor14.isConnected()) {
                        opposite.reset();
                        anchor14.reset();
                    }
                }
            } else {
                ConstraintAnchor anchor15 = getAnchor(type20);
                if (anchor15 != null) {
                    anchor15.reset();
                }
                ConstraintAnchor anchor16 = getAnchor(type5);
                if (anchor16.getTarget() != anchor10) {
                    anchor16.reset();
                }
                ConstraintAnchor opposite2 = getAnchor(type).getOpposite();
                ConstraintAnchor anchor17 = getAnchor(type15);
                if (anchor17.isConnected()) {
                    opposite2.reset();
                    anchor17.reset();
                }
            }
            anchor9.connect(anchor10, i10);
        }
    }

    public void setDimensionRatio(float f6, int i10) {
        this.mDimensionRatio = f6;
        this.mDimensionRatioSide = i10;
    }

    public void setFrame(int i10, int i11, int i12) {
        if (i12 == 0) {
            setHorizontalDimension(i10, i11);
        } else if (i12 == 1) {
            setVerticalDimension(i10, i11);
        }
    }

    public ConstraintWidget(String str) {
        this.measured = false;
        this.run = new WidgetRun[2];
        this.mHorizontalRun = null;
        this.mVerticalRun = null;
        this.isTerminalWidget = new boolean[]{true, true};
        this.f19134a = true;
        this.f19135b = true;
        this.f19136c = -1;
        this.f19137d = -1;
        this.frame = new WidgetFrame(this);
        this.f19138e = false;
        this.f19139f = false;
        this.f19140g = false;
        this.f19141h = false;
        this.mHorizontalResolution = -1;
        this.mVerticalResolution = -1;
        this.f19142i = 0;
        this.mMatchConstraintDefaultWidth = 0;
        this.mMatchConstraintDefaultHeight = 0;
        this.mResolvedMatchConstraintDefault = new int[2];
        this.mMatchConstraintMinWidth = 0;
        this.mMatchConstraintMaxWidth = 0;
        this.mMatchConstraintPercentWidth = 1.0f;
        this.mMatchConstraintMinHeight = 0;
        this.mMatchConstraintMaxHeight = 0;
        this.mMatchConstraintPercentHeight = 1.0f;
        this.f19143j = -1;
        this.f19144k = 1.0f;
        this.f19145l = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.mCircleConstraintAngle = Float.NaN;
        this.m = false;
        this.f19147o = false;
        this.f19148p = 0;
        this.f19149q = 0;
        this.mLeft = new ConstraintAnchor(this, ConstraintAnchor.Type.LEFT);
        this.mTop = new ConstraintAnchor(this, ConstraintAnchor.Type.TOP);
        this.mRight = new ConstraintAnchor(this, ConstraintAnchor.Type.RIGHT);
        this.mBottom = new ConstraintAnchor(this, ConstraintAnchor.Type.BOTTOM);
        this.mBaseline = new ConstraintAnchor(this, ConstraintAnchor.Type.BASELINE);
        this.f19150r = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_X);
        this.f19151s = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_Y);
        ConstraintAnchor constraintAnchor = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER);
        this.mCenter = constraintAnchor;
        this.mListAnchors = new ConstraintAnchor[]{this.mLeft, this.mRight, this.mTop, this.mBottom, this.mBaseline, constraintAnchor};
        this.mAnchors = new ArrayList<>();
        this.f19152t = new boolean[2];
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.FIXED;
        this.mListDimensionBehaviors = new DimensionBehaviour[]{dimensionBehaviour, dimensionBehaviour};
        this.mParent = null;
        this.f19153u = 0;
        this.f19154v = 0;
        this.mDimensionRatio = 0.0f;
        this.mDimensionRatioSide = -1;
        this.mX = 0;
        this.mY = 0;
        this.mOffsetX = 0;
        this.mOffsetY = 0;
        this.f19155w = 0;
        float f6 = DEFAULT_BIAS;
        this.f19156x = f6;
        this.f19157y = f6;
        this.A = 0;
        this.B = 0;
        this.C = false;
        this.D = null;
        this.E = null;
        this.F = 0;
        this.G = 0;
        this.mWeight = new float[]{-1.0f, -1.0f};
        this.mListNextMatchConstraintsWidget = new ConstraintWidget[]{null, null};
        this.mNextChainWidget = new ConstraintWidget[]{null, null};
        this.H = null;
        this.I = null;
        this.horizontalGroup = -1;
        this.verticalGroup = -1;
        a();
        setDebugName(str);
    }

    public ConstraintWidget(int i10, int i11, int i12, int i13) {
        this.measured = false;
        this.run = new WidgetRun[2];
        this.mHorizontalRun = null;
        this.mVerticalRun = null;
        this.isTerminalWidget = new boolean[]{true, true};
        this.f19134a = true;
        this.f19135b = true;
        this.f19136c = -1;
        this.f19137d = -1;
        this.frame = new WidgetFrame(this);
        this.f19138e = false;
        this.f19139f = false;
        this.f19140g = false;
        this.f19141h = false;
        this.mHorizontalResolution = -1;
        this.mVerticalResolution = -1;
        this.f19142i = 0;
        this.mMatchConstraintDefaultWidth = 0;
        this.mMatchConstraintDefaultHeight = 0;
        this.mResolvedMatchConstraintDefault = new int[2];
        this.mMatchConstraintMinWidth = 0;
        this.mMatchConstraintMaxWidth = 0;
        this.mMatchConstraintPercentWidth = 1.0f;
        this.mMatchConstraintMinHeight = 0;
        this.mMatchConstraintMaxHeight = 0;
        this.mMatchConstraintPercentHeight = 1.0f;
        this.f19143j = -1;
        this.f19144k = 1.0f;
        this.f19145l = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.mCircleConstraintAngle = Float.NaN;
        this.m = false;
        this.f19147o = false;
        this.f19148p = 0;
        this.f19149q = 0;
        this.mLeft = new ConstraintAnchor(this, ConstraintAnchor.Type.LEFT);
        this.mTop = new ConstraintAnchor(this, ConstraintAnchor.Type.TOP);
        this.mRight = new ConstraintAnchor(this, ConstraintAnchor.Type.RIGHT);
        this.mBottom = new ConstraintAnchor(this, ConstraintAnchor.Type.BOTTOM);
        this.mBaseline = new ConstraintAnchor(this, ConstraintAnchor.Type.BASELINE);
        this.f19150r = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_X);
        this.f19151s = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_Y);
        ConstraintAnchor constraintAnchor = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER);
        this.mCenter = constraintAnchor;
        this.mListAnchors = new ConstraintAnchor[]{this.mLeft, this.mRight, this.mTop, this.mBottom, this.mBaseline, constraintAnchor};
        this.mAnchors = new ArrayList<>();
        this.f19152t = new boolean[2];
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.FIXED;
        this.mListDimensionBehaviors = new DimensionBehaviour[]{dimensionBehaviour, dimensionBehaviour};
        this.mParent = null;
        this.mDimensionRatio = 0.0f;
        this.mDimensionRatioSide = -1;
        this.mOffsetX = 0;
        this.mOffsetY = 0;
        this.f19155w = 0;
        float f6 = DEFAULT_BIAS;
        this.f19156x = f6;
        this.f19157y = f6;
        this.A = 0;
        this.B = 0;
        this.C = false;
        this.D = null;
        this.E = null;
        this.F = 0;
        this.G = 0;
        this.mWeight = new float[]{-1.0f, -1.0f};
        this.mListNextMatchConstraintsWidget = new ConstraintWidget[]{null, null};
        this.mNextChainWidget = new ConstraintWidget[]{null, null};
        this.H = null;
        this.I = null;
        this.horizontalGroup = -1;
        this.verticalGroup = -1;
        this.mX = i10;
        this.mY = i11;
        this.f19153u = i12;
        this.f19154v = i13;
        a();
    }

    public ConstraintWidget(String str, int i10, int i11, int i12, int i13) {
        this(i10, i11, i12, i13);
        setDebugName(str);
    }

    public ConstraintWidget(int i10, int i11) {
        this(0, 0, i10, i11);
    }

    public ConstraintWidget(String str, int i10, int i11) {
        this(i10, i11);
        setDebugName(str);
    }
}
