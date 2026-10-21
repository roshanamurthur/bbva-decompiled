package androidx.constraintlayout.core.state;

import androidx.annotation.NonNull;
import androidx.constraintlayout.core.state.helpers.AlignHorizontallyReference;
import androidx.constraintlayout.core.state.helpers.AlignVerticallyReference;
import androidx.constraintlayout.core.state.helpers.BarrierReference;
import androidx.constraintlayout.core.state.helpers.FlowReference;
import androidx.constraintlayout.core.state.helpers.GridReference;
import androidx.constraintlayout.core.state.helpers.GuidelineReference;
import androidx.constraintlayout.core.state.helpers.HorizontalChainReference;
import androidx.constraintlayout.core.state.helpers.VerticalChainReference;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.HelperWidget;
import com.bbva.tohu.android.product.valkyria.sdk.constants.ExpectedUserActionOnPoiTypes;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class State {
    public static final Integer PARENT = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CorePixelDp f19030a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f19033d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList<Object> f19034e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList<ConstraintWidget> f19035f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f19036g;
    public final ConstraintReference mParent;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f19031b = true;
    protected HashMap<Object, Reference> mReferences = new HashMap<>();
    protected HashMap<Object, HelperReference> mHelperReferences = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap<String, ArrayList<String>> f19032c = new HashMap<>();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Chain {
        private static final /* synthetic */ Chain[] $VALUES;
        public static final Chain PACKED;
        public static final Chain SPREAD;
        public static final Chain SPREAD_INSIDE;
        public static Map<String, Chain> chainMap;
        public static Map<String, Integer> valueMap;

        static {
            Chain chain = new Chain("SPREAD", 0);
            SPREAD = chain;
            Chain chain2 = new Chain("SPREAD_INSIDE", 1);
            SPREAD_INSIDE = chain2;
            Chain chain3 = new Chain("PACKED", 2);
            PACKED = chain3;
            $VALUES = new Chain[]{chain, chain2, chain3};
            chainMap = new HashMap();
            valueMap = new HashMap();
            chainMap.put("packed", chain3);
            chainMap.put("spread_inside", chain2);
            chainMap.put("spread", chain);
            valueMap.put("packed", 2);
            valueMap.put("spread_inside", 1);
            valueMap.put("spread", 0);
        }

        public Chain() {
            throw null;
        }

        public static Chain getChainByString(String str) {
            if (chainMap.containsKey(str)) {
                return chainMap.get(str);
            }
            return null;
        }

        public static int getValueByString(String str) {
            if (valueMap.containsKey(str)) {
                return valueMap.get(str).intValue();
            }
            return -1;
        }

        public static Chain valueOf(String str) {
            return (Chain) Enum.valueOf(Chain.class, str);
        }

        public static Chain[] values() {
            return (Chain[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Constraint {
        private static final /* synthetic */ Constraint[] $VALUES;
        public static final Constraint BASELINE_TO_BASELINE;
        public static final Constraint BASELINE_TO_BOTTOM;
        public static final Constraint BASELINE_TO_TOP;
        public static final Constraint BOTTOM_TO_BASELINE;
        public static final Constraint BOTTOM_TO_BOTTOM;
        public static final Constraint BOTTOM_TO_TOP;
        public static final Constraint CENTER_HORIZONTALLY;
        public static final Constraint CENTER_VERTICALLY;
        public static final Constraint CIRCULAR_CONSTRAINT;
        public static final Constraint END_TO_END;
        public static final Constraint END_TO_START;
        public static final Constraint LEFT_TO_LEFT;
        public static final Constraint LEFT_TO_RIGHT;
        public static final Constraint RIGHT_TO_LEFT;
        public static final Constraint RIGHT_TO_RIGHT;
        public static final Constraint START_TO_END;
        public static final Constraint START_TO_START;
        public static final Constraint TOP_TO_BASELINE;
        public static final Constraint TOP_TO_BOTTOM;
        public static final Constraint TOP_TO_TOP;

        static {
            Constraint constraint = new Constraint("LEFT_TO_LEFT", 0);
            LEFT_TO_LEFT = constraint;
            Constraint constraint2 = new Constraint("LEFT_TO_RIGHT", 1);
            LEFT_TO_RIGHT = constraint2;
            Constraint constraint3 = new Constraint("RIGHT_TO_LEFT", 2);
            RIGHT_TO_LEFT = constraint3;
            Constraint constraint4 = new Constraint("RIGHT_TO_RIGHT", 3);
            RIGHT_TO_RIGHT = constraint4;
            Constraint constraint5 = new Constraint("START_TO_START", 4);
            START_TO_START = constraint5;
            Constraint constraint6 = new Constraint("START_TO_END", 5);
            START_TO_END = constraint6;
            Constraint constraint7 = new Constraint("END_TO_START", 6);
            END_TO_START = constraint7;
            Constraint constraint8 = new Constraint("END_TO_END", 7);
            END_TO_END = constraint8;
            Constraint constraint9 = new Constraint("TOP_TO_TOP", 8);
            TOP_TO_TOP = constraint9;
            Constraint constraint10 = new Constraint("TOP_TO_BOTTOM", 9);
            TOP_TO_BOTTOM = constraint10;
            Constraint constraint11 = new Constraint("TOP_TO_BASELINE", 10);
            TOP_TO_BASELINE = constraint11;
            Constraint constraint12 = new Constraint("BOTTOM_TO_TOP", 11);
            BOTTOM_TO_TOP = constraint12;
            Constraint constraint13 = new Constraint("BOTTOM_TO_BOTTOM", 12);
            BOTTOM_TO_BOTTOM = constraint13;
            Constraint constraint14 = new Constraint("BOTTOM_TO_BASELINE", 13);
            BOTTOM_TO_BASELINE = constraint14;
            Constraint constraint15 = new Constraint("BASELINE_TO_BASELINE", 14);
            BASELINE_TO_BASELINE = constraint15;
            Constraint constraint16 = new Constraint("BASELINE_TO_TOP", 15);
            BASELINE_TO_TOP = constraint16;
            Constraint constraint17 = new Constraint("BASELINE_TO_BOTTOM", 16);
            BASELINE_TO_BOTTOM = constraint17;
            Constraint constraint18 = new Constraint("CENTER_HORIZONTALLY", 17);
            CENTER_HORIZONTALLY = constraint18;
            Constraint constraint19 = new Constraint("CENTER_VERTICALLY", 18);
            CENTER_VERTICALLY = constraint19;
            Constraint constraint20 = new Constraint("CIRCULAR_CONSTRAINT", 19);
            CIRCULAR_CONSTRAINT = constraint20;
            $VALUES = new Constraint[]{constraint, constraint2, constraint3, constraint4, constraint5, constraint6, constraint7, constraint8, constraint9, constraint10, constraint11, constraint12, constraint13, constraint14, constraint15, constraint16, constraint17, constraint18, constraint19, constraint20};
        }

        public Constraint() {
            throw null;
        }

        public static Constraint valueOf(String str) {
            return (Constraint) Enum.valueOf(Constraint.class, str);
        }

        public static Constraint[] values() {
            return (Constraint[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Direction {
        private static final /* synthetic */ Direction[] $VALUES;
        public static final Direction BOTTOM;
        public static final Direction END;
        public static final Direction LEFT;
        public static final Direction RIGHT;
        public static final Direction START;
        public static final Direction TOP;

        static {
            Direction direction = new Direction("LEFT", 0);
            LEFT = direction;
            Direction direction2 = new Direction("RIGHT", 1);
            RIGHT = direction2;
            Direction direction3 = new Direction("START", 2);
            START = direction3;
            Direction direction4 = new Direction("END", 3);
            END = direction4;
            Direction direction5 = new Direction("TOP", 4);
            TOP = direction5;
            Direction direction6 = new Direction("BOTTOM", 5);
            BOTTOM = direction6;
            $VALUES = new Direction[]{direction, direction2, direction3, direction4, direction5, direction6};
        }

        public Direction() {
            throw null;
        }

        public static Direction valueOf(String str) {
            return (Direction) Enum.valueOf(Direction.class, str);
        }

        public static Direction[] values() {
            return (Direction[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Helper {
        private static final /* synthetic */ Helper[] $VALUES;
        public static final Helper ALIGN_HORIZONTALLY;
        public static final Helper ALIGN_VERTICALLY;
        public static final Helper BARRIER;
        public static final Helper COLUMN;
        public static final Helper FLOW;
        public static final Helper GRID;
        public static final Helper HORIZONTAL_CHAIN;
        public static final Helper HORIZONTAL_FLOW;
        public static final Helper LAYER;
        public static final Helper ROW;
        public static final Helper VERTICAL_CHAIN;
        public static final Helper VERTICAL_FLOW;

        static {
            Helper helper = new Helper("HORIZONTAL_CHAIN", 0);
            HORIZONTAL_CHAIN = helper;
            Helper helper2 = new Helper("VERTICAL_CHAIN", 1);
            VERTICAL_CHAIN = helper2;
            Helper helper3 = new Helper("ALIGN_HORIZONTALLY", 2);
            ALIGN_HORIZONTALLY = helper3;
            Helper helper4 = new Helper("ALIGN_VERTICALLY", 3);
            ALIGN_VERTICALLY = helper4;
            Helper helper5 = new Helper("BARRIER", 4);
            BARRIER = helper5;
            Helper helper6 = new Helper("LAYER", 5);
            LAYER = helper6;
            Helper helper7 = new Helper("HORIZONTAL_FLOW", 6);
            HORIZONTAL_FLOW = helper7;
            Helper helper8 = new Helper("VERTICAL_FLOW", 7);
            VERTICAL_FLOW = helper8;
            Helper helper9 = new Helper("GRID", 8);
            GRID = helper9;
            Helper helper10 = new Helper("ROW", 9);
            ROW = helper10;
            Helper helper11 = new Helper("COLUMN", 10);
            COLUMN = helper11;
            Helper helper12 = new Helper("FLOW", 11);
            FLOW = helper12;
            $VALUES = new Helper[]{helper, helper2, helper3, helper4, helper5, helper6, helper7, helper8, helper9, helper10, helper11, helper12};
        }

        public Helper() {
            throw null;
        }

        public static Helper valueOf(String str) {
            return (Helper) Enum.valueOf(Helper.class, str);
        }

        public static Helper[] values() {
            return (Helper[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Wrap {
        private static final /* synthetic */ Wrap[] $VALUES;
        public static final Wrap ALIGNED;
        public static final Wrap CHAIN;
        public static final Wrap NONE;
        public static Map<String, Integer> valueMap;
        public static Map<String, Wrap> wrapMap;

        static {
            Wrap wrap = new Wrap(ExpectedUserActionOnPoiTypes.NONE, 0);
            NONE = wrap;
            Wrap wrap2 = new Wrap("CHAIN", 1);
            CHAIN = wrap2;
            Wrap wrap3 = new Wrap("ALIGNED", 2);
            ALIGNED = wrap3;
            $VALUES = new Wrap[]{wrap, wrap2, wrap3};
            wrapMap = new HashMap();
            valueMap = new HashMap();
            wrapMap.put("none", wrap);
            wrapMap.put("chain", wrap2);
            wrapMap.put("aligned", wrap3);
            valueMap.put("none", 0);
            valueMap.put("chain", 3);
            valueMap.put("aligned", 2);
        }

        public Wrap() {
            throw null;
        }

        public static Wrap getChainByString(String str) {
            if (wrapMap.containsKey(str)) {
                return wrapMap.get(str);
            }
            return null;
        }

        public static int getValueByString(String str) {
            if (valueMap.containsKey(str)) {
                return valueMap.get(str).intValue();
            }
            return -1;
        }

        public static Wrap valueOf(String str) {
            return (Wrap) Enum.valueOf(Wrap.class, str);
        }

        public static Wrap[] values() {
            return (Wrap[]) $VALUES.clone();
        }
    }

    public State() {
        ConstraintReference constraintReference = new ConstraintReference(this);
        this.mParent = constraintReference;
        this.f19033d = 0;
        this.f19034e = new ArrayList<>();
        this.f19035f = new ArrayList<>();
        this.f19036g = true;
        Integer num = PARENT;
        constraintReference.setKey(num);
        this.mReferences.put(num, constraintReference);
    }

    public void apply(ConstraintWidgetContainer constraintWidgetContainer) {
        HelperReference helperReference;
        HelperWidget helperWidget;
        HelperWidget helperWidget2;
        constraintWidgetContainer.removeAllChildren();
        this.mParent.getWidth().apply(this, constraintWidgetContainer, 0);
        this.mParent.getHeight().apply(this, constraintWidgetContainer, 1);
        for (Object obj : this.mHelperReferences.keySet()) {
            HelperWidget helperWidget3 = this.mHelperReferences.get(obj).getHelperWidget();
            if (helperWidget3 != null) {
                Reference referenceConstraints = this.mReferences.get(obj);
                if (referenceConstraints == null) {
                    referenceConstraints = constraints(obj);
                }
                referenceConstraints.setConstraintWidget(helperWidget3);
            }
        }
        for (Object obj2 : this.mReferences.keySet()) {
            Reference reference = this.mReferences.get(obj2);
            if (reference != this.mParent && (reference.getFacade() instanceof HelperReference) && (helperWidget2 = ((HelperReference) reference.getFacade()).getHelperWidget()) != null) {
                Reference referenceConstraints2 = this.mReferences.get(obj2);
                if (referenceConstraints2 == null) {
                    referenceConstraints2 = constraints(obj2);
                }
                referenceConstraints2.setConstraintWidget(helperWidget2);
            }
        }
        Iterator<Object> it = this.mReferences.keySet().iterator();
        while (it.hasNext()) {
            Reference reference2 = this.mReferences.get(it.next());
            if (reference2 != this.mParent) {
                ConstraintWidget constraintWidget = reference2.getConstraintWidget();
                constraintWidget.setDebugName(reference2.getKey().toString());
                constraintWidget.setParent(null);
                if (reference2.getFacade() instanceof GuidelineReference) {
                    reference2.apply();
                }
                constraintWidgetContainer.add(constraintWidget);
            } else {
                reference2.setConstraintWidget(constraintWidgetContainer);
            }
        }
        Iterator<Object> it2 = this.mHelperReferences.keySet().iterator();
        while (it2.hasNext()) {
            HelperReference helperReference2 = this.mHelperReferences.get(it2.next());
            if (helperReference2.getHelperWidget() != null) {
                Iterator<Object> it3 = helperReference2.mReferences.iterator();
                while (it3.hasNext()) {
                    helperReference2.getHelperWidget().add(this.mReferences.get(it3.next()).getConstraintWidget());
                }
                helperReference2.apply();
            } else {
                helperReference2.apply();
            }
        }
        Iterator<Object> it4 = this.mReferences.keySet().iterator();
        while (it4.hasNext()) {
            Reference reference3 = this.mReferences.get(it4.next());
            if (reference3 != this.mParent && (reference3.getFacade() instanceof HelperReference) && (helperWidget = (helperReference = (HelperReference) reference3.getFacade()).getHelperWidget()) != null) {
                for (Object obj3 : helperReference.mReferences) {
                    Reference reference4 = this.mReferences.get(obj3);
                    if (reference4 != null) {
                        helperWidget.add(reference4.getConstraintWidget());
                    } else if (obj3 instanceof Reference) {
                        helperWidget.add(((Reference) obj3).getConstraintWidget());
                    } else {
                        System.out.println("couldn't find reference for " + obj3);
                    }
                }
                reference3.apply();
            }
        }
        for (Object obj4 : this.mReferences.keySet()) {
            Reference reference5 = this.mReferences.get(obj4);
            reference5.apply();
            ConstraintWidget constraintWidget2 = reference5.getConstraintWidget();
            if (constraintWidget2 != null && obj4 != null) {
                constraintWidget2.stringId = obj4.toString();
            }
        }
    }

    public BarrierReference barrier(Object obj, Direction direction) {
        ConstraintReference constraintReferenceConstraints = constraints(obj);
        if (constraintReferenceConstraints.getFacade() == null || !(constraintReferenceConstraints.getFacade() instanceof BarrierReference)) {
            BarrierReference barrierReference = new BarrierReference(this);
            barrierReference.setBarrierDirection(direction);
            constraintReferenceConstraints.setFacade(barrierReference);
        }
        return (BarrierReference) constraintReferenceConstraints.getFacade();
    }

    public void baselineNeededFor(Object obj) {
        this.f19034e.add(obj);
        this.f19036g = true;
    }

    public AlignHorizontallyReference centerHorizontally(Object... objArr) {
        AlignHorizontallyReference alignHorizontallyReference = (AlignHorizontallyReference) helper(null, Helper.ALIGN_HORIZONTALLY);
        alignHorizontallyReference.add(objArr);
        return alignHorizontallyReference;
    }

    public AlignVerticallyReference centerVertically(Object... objArr) {
        AlignVerticallyReference alignVerticallyReference = (AlignVerticallyReference) helper(null, Helper.ALIGN_VERTICALLY);
        alignVerticallyReference.add(objArr);
        return alignVerticallyReference;
    }

    public ConstraintReference constraints(Object obj) {
        Reference referenceCreateConstraintReference = this.mReferences.get(obj);
        if (referenceCreateConstraintReference == null) {
            referenceCreateConstraintReference = createConstraintReference(obj);
            this.mReferences.put(obj, referenceCreateConstraintReference);
            referenceCreateConstraintReference.setKey(obj);
        }
        if (referenceCreateConstraintReference instanceof ConstraintReference) {
            return (ConstraintReference) referenceCreateConstraintReference;
        }
        return null;
    }

    public int convertDimension(Object obj) {
        if (obj instanceof Float) {
            return Math.round(((Float) obj).floatValue());
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        return 0;
    }

    public ConstraintReference createConstraintReference(Object obj) {
        return new ConstraintReference(this);
    }

    public void directMapping() {
        for (Object obj : this.mReferences.keySet()) {
            ConstraintReference constraintReferenceConstraints = constraints(obj);
            if (constraintReferenceConstraints instanceof ConstraintReference) {
                constraintReferenceConstraints.setView(obj);
            }
        }
    }

    public FlowReference getFlow(Object obj, boolean z10) {
        ConstraintReference constraintReferenceConstraints = constraints(obj);
        if (constraintReferenceConstraints.getFacade() == null || !(constraintReferenceConstraints.getFacade() instanceof FlowReference)) {
            constraintReferenceConstraints.setFacade(z10 ? new FlowReference(this, Helper.VERTICAL_FLOW) : new FlowReference(this, Helper.HORIZONTAL_FLOW));
        }
        return (FlowReference) constraintReferenceConstraints.getFacade();
    }

    @NonNull
    public GridReference getGrid(@NonNull Object obj, @NonNull String str) {
        ConstraintReference constraintReferenceConstraints = constraints(obj);
        if (constraintReferenceConstraints.getFacade() == null || !(constraintReferenceConstraints.getFacade() instanceof GridReference)) {
            Helper helper = Helper.GRID;
            if (str.charAt(0) == 'r') {
                helper = Helper.ROW;
            } else if (str.charAt(0) == 'c') {
                helper = Helper.COLUMN;
            }
            constraintReferenceConstraints.setFacade(new GridReference(this, helper));
        }
        return (GridReference) constraintReferenceConstraints.getFacade();
    }

    public FlowReference getHorizontalFlow() {
        return (FlowReference) helper(null, Helper.HORIZONTAL_FLOW);
    }

    public ArrayList<String> getIdsForTag(String str) {
        HashMap<String, ArrayList<String>> map = this.f19032c;
        if (map.containsKey(str)) {
            return map.get(str);
        }
        return null;
    }

    public FlowReference getVerticalFlow() {
        return (FlowReference) helper(null, Helper.VERTICAL_FLOW);
    }

    public GuidelineReference guideline(Object obj, int i10) {
        ConstraintReference constraintReferenceConstraints = constraints(obj);
        if (constraintReferenceConstraints.getFacade() == null || !(constraintReferenceConstraints.getFacade() instanceof GuidelineReference)) {
            GuidelineReference guidelineReference = new GuidelineReference(this);
            guidelineReference.setOrientation(i10);
            guidelineReference.setKey(obj);
            constraintReferenceConstraints.setFacade(guidelineReference);
        }
        return (GuidelineReference) constraintReferenceConstraints.getFacade();
    }

    public State height(Dimension dimension) {
        return setHeight(dimension);
    }

    public HelperReference helper(Object obj, Helper helper) {
        HelperReference horizontalChainReference;
        if (obj == null) {
            StringBuilder sb2 = new StringBuilder("__HELPER_KEY_");
            int i10 = this.f19033d;
            this.f19033d = i10 + 1;
            obj = androidx.appcompat.widget.a.c(sb2, i10, "__");
        }
        HelperReference flowReference = this.mHelperReferences.get(obj);
        if (flowReference == null) {
            switch (helper.ordinal()) {
                case 0:
                    horizontalChainReference = new HorizontalChainReference(this);
                    flowReference = horizontalChainReference;
                    break;
                case 1:
                    horizontalChainReference = new VerticalChainReference(this);
                    flowReference = horizontalChainReference;
                    break;
                case 2:
                    horizontalChainReference = new AlignHorizontallyReference(this);
                    flowReference = horizontalChainReference;
                    break;
                case 3:
                    horizontalChainReference = new AlignVerticallyReference(this);
                    flowReference = horizontalChainReference;
                    break;
                case 4:
                    horizontalChainReference = new BarrierReference(this);
                    flowReference = horizontalChainReference;
                    break;
                case 5:
                default:
                    flowReference = new HelperReference(this, helper);
                    break;
                case 6:
                case 7:
                    flowReference = new FlowReference(this, helper);
                    break;
                case 8:
                case 9:
                case 10:
                    flowReference = new GridReference(this, helper);
                    break;
            }
            flowReference.setKey(obj);
            this.mHelperReferences.put(obj, flowReference);
        }
        return flowReference;
    }

    public HorizontalChainReference horizontalChain() {
        return (HorizontalChainReference) helper(null, Helper.HORIZONTAL_CHAIN);
    }

    public GuidelineReference horizontalGuideline(Object obj) {
        return guideline(obj, 0);
    }

    public boolean isBaselineNeeded(ConstraintWidget constraintWidget) {
        boolean z10 = this.f19036g;
        ArrayList<ConstraintWidget> arrayList = this.f19035f;
        if (z10) {
            arrayList.clear();
            Iterator<Object> it = this.f19034e.iterator();
            while (it.hasNext()) {
                ConstraintWidget constraintWidget2 = this.mReferences.get(it.next()).getConstraintWidget();
                if (constraintWidget2 != null) {
                    arrayList.add(constraintWidget2);
                }
            }
            this.f19036g = false;
        }
        return arrayList.contains(constraintWidget);
    }

    @Deprecated
    public boolean isLtr() {
        return this.f19031b;
    }

    public boolean isRtl() {
        return !this.f19031b;
    }

    public void map(Object obj, Object obj2) {
        ConstraintReference constraintReferenceConstraints = constraints(obj);
        if (constraintReferenceConstraints != null) {
            constraintReferenceConstraints.setView(obj2);
        }
    }

    public void reset() {
        Iterator<Object> it = this.mReferences.keySet().iterator();
        while (it.hasNext()) {
            this.mReferences.get(it.next()).getConstraintWidget().reset();
        }
        this.mReferences.clear();
        this.mReferences.put(PARENT, this.mParent);
        this.mHelperReferences.clear();
        this.f19032c.clear();
        this.f19034e.clear();
        this.f19036g = true;
    }

    public boolean sameFixedHeight(int i10) {
        return this.mParent.getHeight().equalsFixedValue(i10);
    }

    public boolean sameFixedWidth(int i10) {
        return this.mParent.getWidth().equalsFixedValue(i10);
    }

    public void setDpToPixel(CorePixelDp corePixelDp) {
        this.f19030a = corePixelDp;
    }

    public State setHeight(Dimension dimension) {
        this.mParent.setHeight(dimension);
        return this;
    }

    @Deprecated
    public void setLtr(boolean z10) {
        this.f19031b = z10;
    }

    public void setRtl(boolean z10) {
        this.f19031b = !z10;
    }

    public void setTag(String str, String str2) {
        ArrayList<String> arrayList;
        ConstraintReference constraintReferenceConstraints = constraints(str);
        if (constraintReferenceConstraints instanceof ConstraintReference) {
            constraintReferenceConstraints.setTag(str2);
            HashMap<String, ArrayList<String>> map = this.f19032c;
            if (map.containsKey(str2)) {
                arrayList = map.get(str2);
            } else {
                arrayList = new ArrayList<>();
                map.put(str2, arrayList);
            }
            arrayList.add(str);
        }
    }

    public State setWidth(Dimension dimension) {
        this.mParent.setWidth(dimension);
        return this;
    }

    public VerticalChainReference verticalChain() {
        return (VerticalChainReference) helper(null, Helper.VERTICAL_CHAIN);
    }

    public GuidelineReference verticalGuideline(Object obj) {
        return guideline(obj, 1);
    }

    public State width(Dimension dimension) {
        return setWidth(dimension);
    }

    public FlowReference getHorizontalFlow(Object... objArr) {
        FlowReference flowReference = (FlowReference) helper(null, Helper.HORIZONTAL_FLOW);
        flowReference.add(objArr);
        return flowReference;
    }

    public FlowReference getVerticalFlow(Object... objArr) {
        FlowReference flowReference = (FlowReference) helper(null, Helper.VERTICAL_FLOW);
        flowReference.add(objArr);
        return flowReference;
    }

    public HorizontalChainReference horizontalChain(Object... objArr) {
        HorizontalChainReference horizontalChainReference = (HorizontalChainReference) helper(null, Helper.HORIZONTAL_CHAIN);
        horizontalChainReference.add(objArr);
        return horizontalChainReference;
    }

    public VerticalChainReference verticalChain(Object... objArr) {
        VerticalChainReference verticalChainReference = (VerticalChainReference) helper(null, Helper.VERTICAL_CHAIN);
        verticalChainReference.add(objArr);
        return verticalChainReference;
    }
}
