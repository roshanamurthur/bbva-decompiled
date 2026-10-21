package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.Cache;
import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.widgets.analyzer.Grouping;
import androidx.constraintlayout.core.widgets.analyzer.WidgetGroup;
import com.bbva.glomohybrid.base.deeplink.extensions.DeepLinkExtensionsKt;
import com.bbva.tohu.android.product.valkyria.sdk.constants.ExpectedUserActionOnPoiTypes;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintAnchor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f19130b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f19131c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public SolverVariable f19133e;
    public final ConstraintWidget mOwner;
    public ConstraintAnchor mTarget;
    public final Type mType;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HashSet<ConstraintAnchor> f19129a = null;
    public int mMargin = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f19132d = Integer.MIN_VALUE;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Type {
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type BASELINE;
        public static final Type BOTTOM;
        public static final Type CENTER;
        public static final Type CENTER_X;
        public static final Type CENTER_Y;
        public static final Type LEFT;
        public static final Type NONE;
        public static final Type RIGHT;
        public static final Type TOP;

        static {
            Type type = new Type(ExpectedUserActionOnPoiTypes.NONE, 0);
            NONE = type;
            Type type2 = new Type("LEFT", 1);
            LEFT = type2;
            Type type3 = new Type("TOP", 2);
            TOP = type3;
            Type type4 = new Type("RIGHT", 3);
            RIGHT = type4;
            Type type5 = new Type("BOTTOM", 4);
            BOTTOM = type5;
            Type type6 = new Type("BASELINE", 5);
            BASELINE = type6;
            Type type7 = new Type("CENTER", 6);
            CENTER = type7;
            Type type8 = new Type("CENTER_X", 7);
            CENTER_X = type8;
            Type type9 = new Type("CENTER_Y", 8);
            CENTER_Y = type9;
            $VALUES = new Type[]{type, type2, type3, type4, type5, type6, type7, type8, type9};
        }

        public Type() {
            throw null;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public ConstraintAnchor(ConstraintWidget constraintWidget, Type type) {
        this.mOwner = constraintWidget;
        this.mType = type;
    }

    public final boolean a(ConstraintWidget constraintWidget, HashSet<ConstraintWidget> hashSet) {
        if (hashSet.contains(constraintWidget)) {
            return false;
        }
        hashSet.add(constraintWidget);
        if (constraintWidget == getOwner()) {
            return true;
        }
        ArrayList<ConstraintAnchor> anchors = constraintWidget.getAnchors();
        int size = anchors.size();
        for (int i10 = 0; i10 < size; i10++) {
            ConstraintAnchor constraintAnchor = anchors.get(i10);
            if (constraintAnchor.isSimilarDimensionConnection(this) && constraintAnchor.isConnected() && a(constraintAnchor.getTarget().getOwner(), hashSet)) {
                return true;
            }
        }
        return false;
    }

    public boolean connect(ConstraintAnchor constraintAnchor, int i10, int i11, boolean z10) {
        if (constraintAnchor == null) {
            reset();
            return true;
        }
        if (!z10 && !isValidConnection(constraintAnchor)) {
            return false;
        }
        this.mTarget = constraintAnchor;
        if (constraintAnchor.f19129a == null) {
            constraintAnchor.f19129a = new HashSet<>();
        }
        HashSet<ConstraintAnchor> hashSet = this.mTarget.f19129a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.mMargin = i10;
        this.f19132d = i11;
        return true;
    }

    public void copyFrom(ConstraintAnchor constraintAnchor, HashMap<ConstraintWidget, ConstraintWidget> map) {
        HashSet<ConstraintAnchor> hashSet;
        ConstraintAnchor constraintAnchor2 = this.mTarget;
        if (constraintAnchor2 != null && (hashSet = constraintAnchor2.f19129a) != null) {
            hashSet.remove(this);
        }
        ConstraintAnchor constraintAnchor3 = constraintAnchor.mTarget;
        if (constraintAnchor3 != null) {
            this.mTarget = map.get(constraintAnchor.mTarget.mOwner).getAnchor(constraintAnchor3.getType());
        } else {
            this.mTarget = null;
        }
        ConstraintAnchor constraintAnchor4 = this.mTarget;
        if (constraintAnchor4 != null) {
            if (constraintAnchor4.f19129a == null) {
                constraintAnchor4.f19129a = new HashSet<>();
            }
            this.mTarget.f19129a.add(this);
        }
        this.mMargin = constraintAnchor.mMargin;
        this.f19132d = constraintAnchor.f19132d;
    }

    public void findDependents(int i10, ArrayList<WidgetGroup> arrayList, WidgetGroup widgetGroup) {
        HashSet<ConstraintAnchor> hashSet = this.f19129a;
        if (hashSet != null) {
            Iterator<ConstraintAnchor> it = hashSet.iterator();
            while (it.hasNext()) {
                Grouping.findDependents(it.next().mOwner, i10, arrayList, widgetGroup);
            }
        }
    }

    public HashSet<ConstraintAnchor> getDependents() {
        return this.f19129a;
    }

    public int getFinalValue() {
        if (this.f19131c) {
            return this.f19130b;
        }
        return 0;
    }

    public int getMargin() {
        ConstraintAnchor constraintAnchor;
        if (this.mOwner.getVisibility() == 8) {
            return 0;
        }
        return (this.f19132d == Integer.MIN_VALUE || (constraintAnchor = this.mTarget) == null || constraintAnchor.mOwner.getVisibility() != 8) ? this.mMargin : this.f19132d;
    }

    public final ConstraintAnchor getOpposite() {
        switch (this.mType.ordinal()) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return this.mOwner.mRight;
            case 2:
                return this.mOwner.mBottom;
            case 3:
                return this.mOwner.mLeft;
            case 4:
                return this.mOwner.mTop;
            default:
                throw new AssertionError(this.mType.name());
        }
    }

    public ConstraintWidget getOwner() {
        return this.mOwner;
    }

    public SolverVariable getSolverVariable() {
        return this.f19133e;
    }

    public ConstraintAnchor getTarget() {
        return this.mTarget;
    }

    public Type getType() {
        return this.mType;
    }

    public boolean hasCenteredDependents() {
        HashSet<ConstraintAnchor> hashSet = this.f19129a;
        if (hashSet == null) {
            return false;
        }
        Iterator<ConstraintAnchor> it = hashSet.iterator();
        while (it.hasNext()) {
            if (it.next().getOpposite().isConnected()) {
                return true;
            }
        }
        return false;
    }

    public boolean hasDependents() {
        HashSet<ConstraintAnchor> hashSet = this.f19129a;
        return hashSet != null && hashSet.size() > 0;
    }

    public boolean hasFinalValue() {
        return this.f19131c;
    }

    public boolean isConnected() {
        return this.mTarget != null;
    }

    public boolean isConnectionAllowed(ConstraintWidget constraintWidget, ConstraintAnchor constraintAnchor) {
        return isConnectionAllowed(constraintWidget);
    }

    public boolean isSideAnchor() {
        switch (this.mType.ordinal()) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return false;
            case 1:
            case 2:
            case 3:
            case 4:
                return true;
            default:
                throw new AssertionError(this.mType.name());
        }
    }

    public boolean isSimilarDimensionConnection(ConstraintAnchor constraintAnchor) {
        Type type = constraintAnchor.getType();
        Type type2 = this.mType;
        if (type == type2) {
            return true;
        }
        switch (type2.ordinal()) {
            case 0:
                return false;
            case 1:
            case 3:
            case 7:
                return type == Type.LEFT || type == Type.RIGHT || type == Type.CENTER_X;
            case 2:
            case 4:
            case 5:
            case 8:
                return type == Type.TOP || type == Type.BOTTOM || type == Type.CENTER_Y || type == Type.BASELINE;
            case 6:
                return type != Type.BASELINE;
            default:
                throw new AssertionError(this.mType.name());
        }
    }

    public boolean isValidConnection(ConstraintAnchor constraintAnchor) {
        if (constraintAnchor == null) {
            return false;
        }
        Type type = constraintAnchor.getType();
        Type type2 = this.mType;
        if (type == type2) {
            return type2 != Type.BASELINE || (constraintAnchor.getOwner().hasBaseline() && getOwner().hasBaseline());
        }
        switch (type2.ordinal()) {
            case 0:
            case 7:
            case 8:
                return false;
            case 1:
            case 3:
                boolean z10 = type == Type.LEFT || type == Type.RIGHT;
                if (constraintAnchor.getOwner() instanceof Guideline) {
                    return z10 || type == Type.CENTER_X;
                }
                return z10;
            case 2:
            case 4:
                boolean z11 = type == Type.TOP || type == Type.BOTTOM;
                if (constraintAnchor.getOwner() instanceof Guideline) {
                    return z11 || type == Type.CENTER_Y;
                }
                return z11;
            case 5:
                return (type == Type.LEFT || type == Type.RIGHT) ? false : true;
            case 6:
                return (type == Type.BASELINE || type == Type.CENTER_X || type == Type.CENTER_Y) ? false : true;
            default:
                throw new AssertionError(this.mType.name());
        }
    }

    public boolean isVerticalAnchor() {
        switch (this.mType.ordinal()) {
            case 0:
            case 2:
            case 4:
            case 5:
            case 8:
                return true;
            case 1:
            case 3:
            case 6:
            case 7:
                return false;
            default:
                throw new AssertionError(this.mType.name());
        }
    }

    public void reset() {
        HashSet<ConstraintAnchor> hashSet;
        ConstraintAnchor constraintAnchor = this.mTarget;
        if (constraintAnchor != null && (hashSet = constraintAnchor.f19129a) != null) {
            hashSet.remove(this);
            if (this.mTarget.f19129a.size() == 0) {
                this.mTarget.f19129a = null;
            }
        }
        this.f19129a = null;
        this.mTarget = null;
        this.mMargin = 0;
        this.f19132d = Integer.MIN_VALUE;
        this.f19131c = false;
        this.f19130b = 0;
    }

    public void resetFinalResolution() {
        this.f19131c = false;
        this.f19130b = 0;
    }

    public void resetSolverVariable(Cache cache) {
        SolverVariable solverVariable = this.f19133e;
        if (solverVariable == null) {
            this.f19133e = new SolverVariable(SolverVariable.Type.UNRESTRICTED, (String) null);
        } else {
            solverVariable.reset();
        }
    }

    public void setFinalValue(int i10) {
        this.f19130b = i10;
        this.f19131c = true;
    }

    public void setGoneMargin(int i10) {
        if (isConnected()) {
            this.f19132d = i10;
        }
    }

    public void setMargin(int i10) {
        if (isConnected()) {
            this.mMargin = i10;
        }
    }

    public String toString() {
        return this.mOwner.getDebugName() + DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER + this.mType.toString();
    }

    public boolean isConnectionAllowed(ConstraintWidget constraintWidget) {
        if (a(constraintWidget, new HashSet<>())) {
            return false;
        }
        ConstraintWidget parent = getOwner().getParent();
        return parent == constraintWidget || constraintWidget.getParent() == parent;
    }

    public boolean connect(ConstraintAnchor constraintAnchor, int i10) {
        return connect(constraintAnchor, i10, Integer.MIN_VALUE, false);
    }
}
