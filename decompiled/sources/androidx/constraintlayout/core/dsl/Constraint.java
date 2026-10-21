package androidx.constraintlayout.core.dsl;

import ad.d;
import com.bbva.glomohybrid.base.deeplink.extensions.DeepLinkExtensionsKt;
import java.util.HashMap;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes.dex */
public class Constraint {
    public static final HashMap I;
    public int A;
    public int B;
    public float C;
    public float D;
    public String[] E;
    public boolean F;
    public boolean G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HAnchor f18583b = new HAnchor(this, HSide.LEFT);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HAnchor f18584c = new HAnchor(this, HSide.RIGHT);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final VAnchor f18585d = new VAnchor(this, VSide.TOP);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final VAnchor f18586e = new VAnchor(this, VSide.BOTTOM);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HAnchor f18587f = new HAnchor(this, HSide.START);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HAnchor f18588g = new HAnchor(this, HSide.END);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final VAnchor f18589h = new VAnchor(this, VSide.BASELINE);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f18590i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f18591j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f18592k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f18593l;
    public String m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f18594n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f18595o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f18596p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f18597q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f18598r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f18599s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f18600t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ChainMode f18601u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ChainMode f18602v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Behaviour f18603w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Behaviour f18604x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f18605y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f18606z;
    public static final Constraint PARENT = new Constraint("parent");
    public static final int H = Integer.MIN_VALUE;

    public class Anchor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Side f18607a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f18609c;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Anchor f18608b = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f18610d = Integer.MIN_VALUE;

        public Anchor(Side side) {
            this.f18607a = side;
        }

        public void build(StringBuilder sb2) {
            if (this.f18608b != null) {
                sb2.append(this.f18607a.toString().toLowerCase());
                sb2.append(DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER);
                sb2.append(this);
                sb2.append(",\n");
            }
        }

        public String getId() {
            return Constraint.this.f18582a;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder(Constant.BRACKET_OPEN);
            if (this.f18608b != null) {
                sb2.append("'");
                sb2.append(this.f18608b.getId());
                sb2.append("','");
                sb2.append(this.f18608b.f18607a.toString().toLowerCase());
                sb2.append("'");
            }
            if (this.f18609c != 0) {
                sb2.append(",");
                sb2.append(this.f18609c);
            }
            if (this.f18610d != Integer.MIN_VALUE) {
                if (this.f18609c == 0) {
                    sb2.append(",0,");
                    sb2.append(this.f18610d);
                } else {
                    sb2.append(",");
                    sb2.append(this.f18610d);
                }
            }
            sb2.append(Constant.BRACKET_CLOSE);
            return sb2.toString();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Behaviour {
        private static final /* synthetic */ Behaviour[] $VALUES;
        public static final Behaviour PERCENT;
        public static final Behaviour RATIO;
        public static final Behaviour RESOLVED;
        public static final Behaviour SPREAD;
        public static final Behaviour WRAP;

        static {
            Behaviour behaviour = new Behaviour("SPREAD", 0);
            SPREAD = behaviour;
            Behaviour behaviour2 = new Behaviour("WRAP", 1);
            WRAP = behaviour2;
            Behaviour behaviour3 = new Behaviour("PERCENT", 2);
            PERCENT = behaviour3;
            Behaviour behaviour4 = new Behaviour("RATIO", 3);
            RATIO = behaviour4;
            Behaviour behaviour5 = new Behaviour("RESOLVED", 4);
            RESOLVED = behaviour5;
            $VALUES = new Behaviour[]{behaviour, behaviour2, behaviour3, behaviour4, behaviour5};
        }

        public Behaviour() {
            throw null;
        }

        public static Behaviour valueOf(String str) {
            return (Behaviour) Enum.valueOf(Behaviour.class, str);
        }

        public static Behaviour[] values() {
            return (Behaviour[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ChainMode {
        private static final /* synthetic */ ChainMode[] $VALUES;
        public static final ChainMode PACKED;
        public static final ChainMode SPREAD;
        public static final ChainMode SPREAD_INSIDE;

        static {
            ChainMode chainMode = new ChainMode("SPREAD", 0);
            SPREAD = chainMode;
            ChainMode chainMode2 = new ChainMode("SPREAD_INSIDE", 1);
            SPREAD_INSIDE = chainMode2;
            ChainMode chainMode3 = new ChainMode("PACKED", 2);
            PACKED = chainMode3;
            $VALUES = new ChainMode[]{chainMode, chainMode2, chainMode3};
        }

        public ChainMode() {
            throw null;
        }

        public static ChainMode valueOf(String str) {
            return (ChainMode) Enum.valueOf(ChainMode.class, str);
        }

        public static ChainMode[] values() {
            return (ChainMode[]) $VALUES.clone();
        }
    }

    public class HAnchor extends Anchor {
        public HAnchor(Constraint constraint, HSide hSide) {
            super(Side.valueOf(hSide.name()));
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class HSide {
        private static final /* synthetic */ HSide[] $VALUES;
        public static final HSide END;
        public static final HSide LEFT;
        public static final HSide RIGHT;
        public static final HSide START;

        static {
            HSide hSide = new HSide("LEFT", 0);
            LEFT = hSide;
            HSide hSide2 = new HSide("RIGHT", 1);
            RIGHT = hSide2;
            HSide hSide3 = new HSide("START", 2);
            START = hSide3;
            HSide hSide4 = new HSide("END", 3);
            END = hSide4;
            $VALUES = new HSide[]{hSide, hSide2, hSide3, hSide4};
        }

        public HSide() {
            throw null;
        }

        public static HSide valueOf(String str) {
            return (HSide) Enum.valueOf(HSide.class, str);
        }

        public static HSide[] values() {
            return (HSide[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Side {
        private static final /* synthetic */ Side[] $VALUES;
        public static final Side BASELINE;
        public static final Side BOTTOM;
        public static final Side END;
        public static final Side LEFT;
        public static final Side RIGHT;
        public static final Side START;
        public static final Side TOP;

        static {
            Side side = new Side("LEFT", 0);
            LEFT = side;
            Side side2 = new Side("RIGHT", 1);
            RIGHT = side2;
            Side side3 = new Side("TOP", 2);
            TOP = side3;
            Side side4 = new Side("BOTTOM", 3);
            BOTTOM = side4;
            Side side5 = new Side("START", 4);
            START = side5;
            Side side6 = new Side("END", 5);
            END = side6;
            Side side7 = new Side("BASELINE", 6);
            BASELINE = side7;
            $VALUES = new Side[]{side, side2, side3, side4, side5, side6, side7};
        }

        public Side() {
            throw null;
        }

        public static Side valueOf(String str) {
            return (Side) Enum.valueOf(Side.class, str);
        }

        public static Side[] values() {
            return (Side[]) $VALUES.clone();
        }
    }

    public class VAnchor extends Anchor {
        public VAnchor(Constraint constraint, VSide vSide) {
            super(Side.valueOf(vSide.name()));
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class VSide {
        private static final /* synthetic */ VSide[] $VALUES;
        public static final VSide BASELINE;
        public static final VSide BOTTOM;
        public static final VSide TOP;

        static {
            VSide vSide = new VSide("TOP", 0);
            TOP = vSide;
            VSide vSide2 = new VSide("BOTTOM", 1);
            BOTTOM = vSide2;
            VSide vSide3 = new VSide("BASELINE", 2);
            BASELINE = vSide3;
            $VALUES = new VSide[]{vSide, vSide2, vSide3};
        }

        public VSide() {
            throw null;
        }

        public static VSide valueOf(String str) {
            return (VSide) Enum.valueOf(VSide.class, str);
        }

        public static VSide[] values() {
            return (VSide[]) $VALUES.clone();
        }
    }

    static {
        HashMap map = new HashMap();
        I = map;
        map.put(ChainMode.SPREAD, "spread");
        map.put(ChainMode.SPREAD_INSIDE, "spread_inside");
        map.put(ChainMode.PACKED, "packed");
    }

    public Constraint(String str) {
        int i10 = H;
        this.f18590i = i10;
        this.f18591j = i10;
        this.f18592k = Float.NaN;
        this.f18593l = Float.NaN;
        this.m = null;
        this.f18594n = null;
        this.f18595o = Integer.MIN_VALUE;
        this.f18596p = Float.NaN;
        this.f18597q = Integer.MIN_VALUE;
        this.f18598r = Integer.MIN_VALUE;
        this.f18599s = Float.NaN;
        this.f18600t = Float.NaN;
        this.f18601u = null;
        this.f18602v = null;
        this.f18603w = null;
        this.f18604x = null;
        this.f18605y = i10;
        this.f18606z = i10;
        this.A = i10;
        this.B = i10;
        this.C = Float.NaN;
        this.D = Float.NaN;
        this.E = null;
        this.F = false;
        this.G = false;
        this.f18582a = str;
    }

    public void append(StringBuilder sb2, String str, float f6) {
        if (Float.isNaN(f6)) {
            return;
        }
        sb2.append(str);
        sb2.append(DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER);
        sb2.append(f6);
        sb2.append(",\n");
    }

    public String convertStringArrayToString(String[] strArr) {
        StringBuilder sb2 = new StringBuilder(Constant.BRACKET_OPEN);
        int i10 = 0;
        while (i10 < strArr.length) {
            sb2.append(i10 == 0 ? "'" : ",'");
            sb2.append(strArr[i10]);
            sb2.append("'");
            i10++;
        }
        sb2.append(Constant.BRACKET_CLOSE);
        return sb2.toString();
    }

    public VAnchor getBaseline() {
        return this.f18589h;
    }

    public VAnchor getBottom() {
        return this.f18586e;
    }

    public float getCircleAngle() {
        return this.f18596p;
    }

    public String getCircleConstraint() {
        return this.f18594n;
    }

    public int getCircleRadius() {
        return this.f18595o;
    }

    public String getDimensionRatio() {
        return this.m;
    }

    public int getEditorAbsoluteX() {
        return this.f18597q;
    }

    public int getEditorAbsoluteY() {
        return this.f18598r;
    }

    public HAnchor getEnd() {
        return this.f18588g;
    }

    public int getHeight() {
        return this.f18591j;
    }

    public Behaviour getHeightDefault() {
        return this.f18604x;
    }

    public int getHeightMax() {
        return this.f18606z;
    }

    public int getHeightMin() {
        return this.B;
    }

    public float getHeightPercent() {
        return this.D;
    }

    public float getHorizontalBias() {
        return this.f18592k;
    }

    public ChainMode getHorizontalChainStyle() {
        return this.f18601u;
    }

    public float getHorizontalWeight() {
        return this.f18600t;
    }

    public HAnchor getLeft() {
        return this.f18583b;
    }

    public String[] getReferenceIds() {
        return this.E;
    }

    public HAnchor getRight() {
        return this.f18584c;
    }

    public HAnchor getStart() {
        return this.f18587f;
    }

    public VAnchor getTop() {
        return this.f18585d;
    }

    public float getVerticalBias() {
        return this.f18593l;
    }

    public ChainMode getVerticalChainStyle() {
        return this.f18602v;
    }

    public float getVerticalWeight() {
        return this.f18599s;
    }

    public int getWidth() {
        return this.f18590i;
    }

    public Behaviour getWidthDefault() {
        return this.f18603w;
    }

    public int getWidthMax() {
        return this.f18605y;
    }

    public int getWidthMin() {
        return this.A;
    }

    public float getWidthPercent() {
        return this.C;
    }

    public boolean isConstrainedHeight() {
        return this.G;
    }

    public boolean isConstrainedWidth() {
        return this.F;
    }

    public void linkToBaseline(VAnchor vAnchor) {
        linkToBaseline(vAnchor, 0);
    }

    public void linkToBottom(VAnchor vAnchor) {
        linkToBottom(vAnchor, 0);
    }

    public void linkToEnd(HAnchor hAnchor) {
        linkToEnd(hAnchor, 0);
    }

    public void linkToLeft(HAnchor hAnchor) {
        linkToLeft(hAnchor, 0);
    }

    public void linkToRight(HAnchor hAnchor) {
        linkToRight(hAnchor, 0);
    }

    public void linkToStart(HAnchor hAnchor) {
        linkToStart(hAnchor, 0);
    }

    public void linkToTop(VAnchor vAnchor) {
        linkToTop(vAnchor, 0);
    }

    public void setCircleAngle(float f6) {
        this.f18596p = f6;
    }

    public void setCircleConstraint(String str) {
        this.f18594n = str;
    }

    public void setCircleRadius(int i10) {
        this.f18595o = i10;
    }

    public void setConstrainedHeight(boolean z10) {
        this.G = z10;
    }

    public void setConstrainedWidth(boolean z10) {
        this.F = z10;
    }

    public void setDimensionRatio(String str) {
        this.m = str;
    }

    public void setEditorAbsoluteX(int i10) {
        this.f18597q = i10;
    }

    public void setEditorAbsoluteY(int i10) {
        this.f18598r = i10;
    }

    public void setHeight(int i10) {
        this.f18591j = i10;
    }

    public void setHeightDefault(Behaviour behaviour) {
        this.f18604x = behaviour;
    }

    public void setHeightMax(int i10) {
        this.f18606z = i10;
    }

    public void setHeightMin(int i10) {
        this.B = i10;
    }

    public void setHeightPercent(float f6) {
        this.D = f6;
    }

    public void setHorizontalBias(float f6) {
        this.f18592k = f6;
    }

    public void setHorizontalChainStyle(ChainMode chainMode) {
        this.f18601u = chainMode;
    }

    public void setHorizontalWeight(float f6) {
        this.f18600t = f6;
    }

    public void setReferenceIds(String[] strArr) {
        this.E = strArr;
    }

    public void setVerticalBias(float f6) {
        this.f18593l = f6;
    }

    public void setVerticalChainStyle(ChainMode chainMode) {
        this.f18602v = chainMode;
    }

    public void setVerticalWeight(float f6) {
        this.f18599s = f6;
    }

    public void setWidth(int i10) {
        this.f18590i = i10;
    }

    public void setWidthDefault(Behaviour behaviour) {
        this.f18603w = behaviour;
    }

    public void setWidthMax(int i10) {
        this.f18605y = i10;
    }

    public void setWidthMin(int i10) {
        this.A = i10;
    }

    public void setWidthPercent(float f6) {
        this.C = f6;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(d.f(new StringBuilder(), this.f18582a, ":{\n"));
        this.f18583b.build(sb2);
        this.f18584c.build(sb2);
        this.f18585d.build(sb2);
        this.f18586e.build(sb2);
        this.f18587f.build(sb2);
        this.f18588g.build(sb2);
        this.f18589h.build(sb2);
        int i10 = this.f18590i;
        int i11 = H;
        if (i10 != i11) {
            sb2.append("width:");
            sb2.append(this.f18590i);
            sb2.append(",\n");
        }
        if (this.f18591j != i11) {
            sb2.append("height:");
            sb2.append(this.f18591j);
            sb2.append(",\n");
        }
        append(sb2, "horizontalBias", this.f18592k);
        append(sb2, "verticalBias", this.f18593l);
        if (this.m != null) {
            sb2.append("dimensionRatio:'");
            sb2.append(this.m);
            sb2.append("',\n");
        }
        if (this.f18594n != null && (!Float.isNaN(this.f18596p) || this.f18595o != Integer.MIN_VALUE)) {
            sb2.append("circular:['");
            sb2.append(this.f18594n);
            sb2.append("'");
            if (!Float.isNaN(this.f18596p)) {
                sb2.append(",");
                sb2.append(this.f18596p);
            }
            if (this.f18595o != Integer.MIN_VALUE) {
                if (Float.isNaN(this.f18596p)) {
                    sb2.append(",0,");
                    sb2.append(this.f18595o);
                } else {
                    sb2.append(",");
                    sb2.append(this.f18595o);
                }
            }
            sb2.append("],\n");
        }
        append(sb2, "verticalWeight", this.f18599s);
        append(sb2, "horizontalWeight", this.f18600t);
        ChainMode chainMode = this.f18601u;
        HashMap map = I;
        if (chainMode != null) {
            sb2.append("horizontalChainStyle:'");
            sb2.append((String) map.get(this.f18601u));
            sb2.append("',\n");
        }
        if (this.f18602v != null) {
            sb2.append("verticalChainStyle:'");
            sb2.append((String) map.get(this.f18602v));
            sb2.append("',\n");
        }
        if (this.f18603w != null) {
            if (this.f18605y == i11 && this.A == i11) {
                sb2.append("width:'");
                sb2.append(this.f18603w.toString().toLowerCase());
                sb2.append("',\n");
            } else {
                sb2.append("width:{value:'");
                sb2.append(this.f18603w.toString().toLowerCase());
                sb2.append("'");
                if (this.f18605y != i11) {
                    sb2.append(",max:");
                    sb2.append(this.f18605y);
                }
                if (this.A != i11) {
                    sb2.append(",min:");
                    sb2.append(this.A);
                }
                sb2.append("},\n");
            }
        }
        if (this.f18604x != null) {
            if (this.f18606z == i11 && this.B == i11) {
                sb2.append("height:'");
                sb2.append(this.f18604x.toString().toLowerCase());
                sb2.append("',\n");
            } else {
                sb2.append("height:{value:'");
                sb2.append(this.f18604x.toString().toLowerCase());
                sb2.append("'");
                if (this.f18606z != i11) {
                    sb2.append(",max:");
                    sb2.append(this.f18606z);
                }
                if (this.B != i11) {
                    sb2.append(",min:");
                    sb2.append(this.B);
                }
                sb2.append("},\n");
            }
        }
        if (!Double.isNaN(this.C)) {
            sb2.append("width:'");
            sb2.append((int) this.C);
            sb2.append("%',\n");
        }
        if (!Double.isNaN(this.D)) {
            sb2.append("height:'");
            sb2.append((int) this.D);
            sb2.append("%',\n");
        }
        if (this.E != null) {
            sb2.append("referenceIds:");
            sb2.append(convertStringArrayToString(this.E));
            sb2.append(",\n");
        }
        if (this.F) {
            sb2.append("constrainedWidth:");
            sb2.append(this.F);
            sb2.append(",\n");
        }
        if (this.G) {
            sb2.append("constrainedHeight:");
            sb2.append(this.G);
            sb2.append(",\n");
        }
        sb2.append("},\n");
        return sb2.toString();
    }

    public void linkToBaseline(VAnchor vAnchor, int i10) {
        linkToBaseline(vAnchor, i10, Integer.MIN_VALUE);
    }

    public void linkToBottom(VAnchor vAnchor, int i10) {
        linkToBottom(vAnchor, i10, Integer.MIN_VALUE);
    }

    public void linkToEnd(HAnchor hAnchor, int i10) {
        linkToEnd(hAnchor, i10, Integer.MIN_VALUE);
    }

    public void linkToLeft(HAnchor hAnchor, int i10) {
        linkToLeft(hAnchor, i10, Integer.MIN_VALUE);
    }

    public void linkToRight(HAnchor hAnchor, int i10) {
        linkToRight(hAnchor, i10, Integer.MIN_VALUE);
    }

    public void linkToStart(HAnchor hAnchor, int i10) {
        linkToStart(hAnchor, i10, Integer.MIN_VALUE);
    }

    public void linkToTop(VAnchor vAnchor, int i10) {
        linkToTop(vAnchor, i10, Integer.MIN_VALUE);
    }

    public void linkToBaseline(VAnchor vAnchor, int i10, int i11) {
        VAnchor vAnchor2 = this.f18589h;
        vAnchor2.f18608b = vAnchor;
        vAnchor2.f18609c = i10;
        vAnchor2.f18610d = i11;
    }

    public void linkToBottom(VAnchor vAnchor, int i10, int i11) {
        VAnchor vAnchor2 = this.f18586e;
        vAnchor2.f18608b = vAnchor;
        vAnchor2.f18609c = i10;
        vAnchor2.f18610d = i11;
    }

    public void linkToEnd(HAnchor hAnchor, int i10, int i11) {
        HAnchor hAnchor2 = this.f18588g;
        hAnchor2.f18608b = hAnchor;
        hAnchor2.f18609c = i10;
        hAnchor2.f18610d = i11;
    }

    public void linkToLeft(HAnchor hAnchor, int i10, int i11) {
        HAnchor hAnchor2 = this.f18583b;
        hAnchor2.f18608b = hAnchor;
        hAnchor2.f18609c = i10;
        hAnchor2.f18610d = i11;
    }

    public void linkToRight(HAnchor hAnchor, int i10, int i11) {
        HAnchor hAnchor2 = this.f18584c;
        hAnchor2.f18608b = hAnchor;
        hAnchor2.f18609c = i10;
        hAnchor2.f18610d = i11;
    }

    public void linkToStart(HAnchor hAnchor, int i10, int i11) {
        HAnchor hAnchor2 = this.f18587f;
        hAnchor2.f18608b = hAnchor;
        hAnchor2.f18609c = i10;
        hAnchor2.f18610d = i11;
    }

    public void linkToTop(VAnchor vAnchor, int i10, int i11) {
        VAnchor vAnchor2 = this.f18585d;
        vAnchor2.f18608b = vAnchor;
        vAnchor2.f18609c = i10;
        vAnchor2.f18610d = i11;
    }
}
