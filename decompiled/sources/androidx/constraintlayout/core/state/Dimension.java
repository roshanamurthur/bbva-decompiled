package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.widgets.ConstraintWidget;

/* JADX INFO: loaded from: classes.dex */
public class Dimension {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f19021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f19022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f19023c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f19024d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f19025e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f19026f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f19027g;
    public static final Object FIXED_DIMENSION = new String("FIXED_DIMENSION");
    public static final Object WRAP_DIMENSION = new String("WRAP_DIMENSION");
    public static final Object SPREAD_DIMENSION = new String("SPREAD_DIMENSION");
    public static final Object PARENT_DIMENSION = new String("PARENT_DIMENSION");
    public static final Object PERCENT_DIMENSION = new String("PERCENT_DIMENSION");
    public static final Object RATIO_DIMENSION = new String("RATIO_DIMENSION");

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Type {
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type FIXED;
        public static final Type MATCH_CONSTRAINT;
        public static final Type MATCH_PARENT;
        public static final Type WRAP;

        static {
            Type type = new Type("FIXED", 0);
            FIXED = type;
            Type type2 = new Type("WRAP", 1);
            WRAP = type2;
            Type type3 = new Type("MATCH_PARENT", 2);
            MATCH_PARENT = type3;
            Type type4 = new Type("MATCH_CONSTRAINT", 3);
            MATCH_CONSTRAINT = type4;
            $VALUES = new Type[]{type, type2, type3, type4};
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

    public Dimension() {
        this.f19021a = 0;
        this.f19022b = Integer.MAX_VALUE;
        this.f19023c = 1.0f;
        this.f19024d = 0;
        this.f19025e = null;
        this.f19026f = WRAP_DIMENSION;
        this.f19027g = false;
    }

    public static Dimension createFixed(int i10) {
        Dimension dimension = new Dimension(FIXED_DIMENSION);
        dimension.fixed(i10);
        return dimension;
    }

    public static Dimension createParent() {
        return new Dimension(PARENT_DIMENSION);
    }

    public static Dimension createPercent(Object obj, float f6) {
        Dimension dimension = new Dimension(PERCENT_DIMENSION);
        dimension.percent(obj, f6);
        return dimension;
    }

    public static Dimension createRatio(String str) {
        Dimension dimension = new Dimension(RATIO_DIMENSION);
        dimension.ratio(str);
        return dimension;
    }

    public static Dimension createSpread() {
        return new Dimension(SPREAD_DIMENSION);
    }

    public static Dimension createSuggested(int i10) {
        Dimension dimension = new Dimension();
        dimension.suggested(i10);
        return dimension;
    }

    public static Dimension createWrap() {
        return new Dimension(WRAP_DIMENSION);
    }

    public void apply(State state, ConstraintWidget constraintWidget, int i10) {
        String str = this.f19025e;
        if (str != null) {
            constraintWidget.setDimensionRatio(str);
        }
        int i11 = 2;
        if (i10 == 0) {
            if (this.f19027g) {
                constraintWidget.setHorizontalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
                Object obj = this.f19026f;
                if (obj == WRAP_DIMENSION) {
                    i11 = 1;
                } else if (obj != PERCENT_DIMENSION) {
                    i11 = 0;
                }
                constraintWidget.setHorizontalMatchStyle(i11, this.f19021a, this.f19022b, this.f19023c);
                return;
            }
            int i12 = this.f19021a;
            if (i12 > 0) {
                constraintWidget.setMinWidth(i12);
            }
            int i13 = this.f19022b;
            if (i13 < Integer.MAX_VALUE) {
                constraintWidget.setMaxWidth(i13);
            }
            Object obj2 = this.f19026f;
            if (obj2 == WRAP_DIMENSION) {
                constraintWidget.setHorizontalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.WRAP_CONTENT);
                return;
            }
            if (obj2 == PARENT_DIMENSION) {
                constraintWidget.setHorizontalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.MATCH_PARENT);
                return;
            } else {
                if (obj2 == null) {
                    constraintWidget.setHorizontalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.FIXED);
                    constraintWidget.setWidth(this.f19024d);
                    return;
                }
                return;
            }
        }
        if (this.f19027g) {
            constraintWidget.setVerticalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
            Object obj3 = this.f19026f;
            if (obj3 == WRAP_DIMENSION) {
                i11 = 1;
            } else if (obj3 != PERCENT_DIMENSION) {
                i11 = 0;
            }
            constraintWidget.setVerticalMatchStyle(i11, this.f19021a, this.f19022b, this.f19023c);
            return;
        }
        int i14 = this.f19021a;
        if (i14 > 0) {
            constraintWidget.setMinHeight(i14);
        }
        int i15 = this.f19022b;
        if (i15 < Integer.MAX_VALUE) {
            constraintWidget.setMaxHeight(i15);
        }
        Object obj4 = this.f19026f;
        if (obj4 == WRAP_DIMENSION) {
            constraintWidget.setVerticalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.WRAP_CONTENT);
            return;
        }
        if (obj4 == PARENT_DIMENSION) {
            constraintWidget.setVerticalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.MATCH_PARENT);
        } else if (obj4 == null) {
            constraintWidget.setVerticalDimensionBehaviour(ConstraintWidget.DimensionBehaviour.FIXED);
            constraintWidget.setHeight(this.f19024d);
        }
    }

    public boolean equalsFixedValue(int i10) {
        return this.f19026f == null && this.f19024d == i10;
    }

    public Dimension fixed(Object obj) {
        this.f19026f = obj;
        if (obj instanceof Integer) {
            this.f19024d = ((Integer) obj).intValue();
            this.f19026f = null;
        }
        return this;
    }

    public Dimension max(int i10) {
        if (this.f19022b >= 0) {
            this.f19022b = i10;
        }
        return this;
    }

    public Dimension min(int i10) {
        if (i10 >= 0) {
            this.f19021a = i10;
        }
        return this;
    }

    public Dimension percent(Object obj, float f6) {
        this.f19023c = f6;
        return this;
    }

    public Dimension ratio(String str) {
        this.f19025e = str;
        return this;
    }

    public Dimension suggested(int i10) {
        this.f19027g = true;
        if (i10 >= 0) {
            this.f19022b = i10;
        }
        return this;
    }

    public Dimension min(Object obj) {
        if (obj == WRAP_DIMENSION) {
            this.f19021a = -2;
        }
        return this;
    }

    public static Dimension createFixed(Object obj) {
        Dimension dimension = new Dimension(FIXED_DIMENSION);
        dimension.fixed(obj);
        return dimension;
    }

    public static Dimension createSuggested(Object obj) {
        Dimension dimension = new Dimension();
        dimension.suggested(obj);
        return dimension;
    }

    public Dimension max(Object obj) {
        Object obj2 = WRAP_DIMENSION;
        if (obj == obj2 && this.f19027g) {
            this.f19026f = obj2;
            this.f19022b = Integer.MAX_VALUE;
        }
        return this;
    }

    public Dimension suggested(Object obj) {
        this.f19026f = obj;
        this.f19027g = true;
        return this;
    }

    public Dimension fixed(int i10) {
        this.f19026f = null;
        this.f19024d = i10;
        return this;
    }

    public Dimension(Object obj) {
        this.f19021a = 0;
        this.f19022b = Integer.MAX_VALUE;
        this.f19023c = 1.0f;
        this.f19024d = 0;
        this.f19025e = null;
        this.f19027g = false;
        this.f19026f = obj;
    }
}
