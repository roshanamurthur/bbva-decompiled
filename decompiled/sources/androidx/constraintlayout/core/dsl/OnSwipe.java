package androidx.constraintlayout.core.dsl;

/* JADX INFO: loaded from: classes.dex */
public class OnSwipe {
    public static final int FLAG_DISABLE_POST_SCROLL = 1;
    public static final int FLAG_DISABLE_SCROLL = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Drag f18681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Side f18682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f18683c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f18684d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TouchUp f18685e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f18686f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f18687g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f18688h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f18689i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f18690j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f18691k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f18692l;
    public float m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f18693n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Boundary f18694o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Mode f18695p;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Boundary {
        private static final /* synthetic */ Boundary[] $VALUES;
        public static final Boundary BOUNCE_BOTH;
        public static final Boundary BOUNCE_END;
        public static final Boundary BOUNCE_START;
        public static final Boundary OVERSHOOT;

        static {
            Boundary boundary = new Boundary("OVERSHOOT", 0);
            OVERSHOOT = boundary;
            Boundary boundary2 = new Boundary("BOUNCE_START", 1);
            BOUNCE_START = boundary2;
            Boundary boundary3 = new Boundary("BOUNCE_END", 2);
            BOUNCE_END = boundary3;
            Boundary boundary4 = new Boundary("BOUNCE_BOTH", 3);
            BOUNCE_BOTH = boundary4;
            $VALUES = new Boundary[]{boundary, boundary2, boundary3, boundary4};
        }

        public Boundary() {
            throw null;
        }

        public static Boundary valueOf(String str) {
            return (Boundary) Enum.valueOf(Boundary.class, str);
        }

        public static Boundary[] values() {
            return (Boundary[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Drag {
        private static final /* synthetic */ Drag[] $VALUES;
        public static final Drag ANTICLOCKWISE;
        public static final Drag CLOCKWISE;
        public static final Drag DOWN;
        public static final Drag END;
        public static final Drag LEFT;
        public static final Drag RIGHT;
        public static final Drag START;
        public static final Drag UP;

        static {
            Drag drag = new Drag("UP", 0);
            UP = drag;
            Drag drag2 = new Drag("DOWN", 1);
            DOWN = drag2;
            Drag drag3 = new Drag("LEFT", 2);
            LEFT = drag3;
            Drag drag4 = new Drag("RIGHT", 3);
            RIGHT = drag4;
            Drag drag5 = new Drag("START", 4);
            START = drag5;
            Drag drag6 = new Drag("END", 5);
            END = drag6;
            Drag drag7 = new Drag("CLOCKWISE", 6);
            CLOCKWISE = drag7;
            Drag drag8 = new Drag("ANTICLOCKWISE", 7);
            ANTICLOCKWISE = drag8;
            $VALUES = new Drag[]{drag, drag2, drag3, drag4, drag5, drag6, drag7, drag8};
        }

        public Drag() {
            throw null;
        }

        public static Drag valueOf(String str) {
            return (Drag) Enum.valueOf(Drag.class, str);
        }

        public static Drag[] values() {
            return (Drag[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Mode {
        private static final /* synthetic */ Mode[] $VALUES;
        public static final Mode SPRING;
        public static final Mode VELOCITY;

        static {
            Mode mode = new Mode("VELOCITY", 0);
            VELOCITY = mode;
            Mode mode2 = new Mode("SPRING", 1);
            SPRING = mode2;
            $VALUES = new Mode[]{mode, mode2};
        }

        public Mode() {
            throw null;
        }

        public static Mode valueOf(String str) {
            return (Mode) Enum.valueOf(Mode.class, str);
        }

        public static Mode[] values() {
            return (Mode[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Side {
        private static final /* synthetic */ Side[] $VALUES;
        public static final Side BOTTOM;
        public static final Side END;
        public static final Side LEFT;
        public static final Side MIDDLE;
        public static final Side RIGHT;
        public static final Side START;
        public static final Side TOP;

        static {
            Side side = new Side("TOP", 0);
            TOP = side;
            Side side2 = new Side("LEFT", 1);
            LEFT = side2;
            Side side3 = new Side("RIGHT", 2);
            RIGHT = side3;
            Side side4 = new Side("BOTTOM", 3);
            BOTTOM = side4;
            Side side5 = new Side("MIDDLE", 4);
            MIDDLE = side5;
            Side side6 = new Side("START", 5);
            START = side6;
            Side side7 = new Side("END", 6);
            END = side7;
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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class TouchUp {
        private static final /* synthetic */ TouchUp[] $VALUES;
        public static final TouchUp AUTOCOMPLETE;
        public static final TouchUp DECELERATE;
        public static final TouchUp DECELERATE_COMPLETE;
        public static final TouchUp NEVER_COMPLETE_END;
        public static final TouchUp NEVER_COMPLETE_START;
        public static final TouchUp STOP;
        public static final TouchUp TO_END;
        public static final TouchUp TO_START;

        static {
            TouchUp touchUp = new TouchUp("AUTOCOMPLETE", 0);
            AUTOCOMPLETE = touchUp;
            TouchUp touchUp2 = new TouchUp("TO_START", 1);
            TO_START = touchUp2;
            TouchUp touchUp3 = new TouchUp("NEVER_COMPLETE_END", 2);
            NEVER_COMPLETE_END = touchUp3;
            TouchUp touchUp4 = new TouchUp("TO_END", 3);
            TO_END = touchUp4;
            TouchUp touchUp5 = new TouchUp("STOP", 4);
            STOP = touchUp5;
            TouchUp touchUp6 = new TouchUp("DECELERATE", 5);
            DECELERATE = touchUp6;
            TouchUp touchUp7 = new TouchUp("DECELERATE_COMPLETE", 6);
            DECELERATE_COMPLETE = touchUp7;
            TouchUp touchUp8 = new TouchUp("NEVER_COMPLETE_START", 7);
            NEVER_COMPLETE_START = touchUp8;
            $VALUES = new TouchUp[]{touchUp, touchUp2, touchUp3, touchUp4, touchUp5, touchUp6, touchUp7, touchUp8};
        }

        public TouchUp() {
            throw null;
        }

        public static TouchUp valueOf(String str) {
            return (TouchUp) Enum.valueOf(TouchUp.class, str);
        }

        public static TouchUp[] values() {
            return (TouchUp[]) $VALUES.clone();
        }
    }

    public OnSwipe() {
        this.f18681a = null;
        this.f18682b = null;
        this.f18683c = null;
        this.f18684d = null;
        this.f18685e = null;
        this.f18686f = null;
        this.f18687g = Float.NaN;
        this.f18688h = Float.NaN;
        this.f18689i = Float.NaN;
        this.f18690j = Float.NaN;
        this.f18691k = Float.NaN;
        this.f18692l = Float.NaN;
        this.m = Float.NaN;
        this.f18693n = Float.NaN;
        this.f18694o = null;
        this.f18695p = null;
    }

    public Mode getAutoCompleteMode() {
        return this.f18695p;
    }

    public Drag getDragDirection() {
        return this.f18681a;
    }

    public float getDragScale() {
        return this.f18689i;
    }

    public float getDragThreshold() {
        return this.f18690j;
    }

    public String getLimitBoundsTo() {
        return this.f18684d;
    }

    public float getMaxAcceleration() {
        return this.f18688h;
    }

    public float getMaxVelocity() {
        return this.f18687g;
    }

    public TouchUp getOnTouchUp() {
        return this.f18685e;
    }

    public String getRotationCenterId() {
        return this.f18686f;
    }

    public Boundary getSpringBoundary() {
        return this.f18694o;
    }

    public float getSpringDamping() {
        return this.f18691k;
    }

    public float getSpringMass() {
        return this.f18692l;
    }

    public float getSpringStiffness() {
        return this.m;
    }

    public float getSpringStopThreshold() {
        return this.f18693n;
    }

    public String getTouchAnchorId() {
        return this.f18683c;
    }

    public Side getTouchAnchorSide() {
        return this.f18682b;
    }

    public void setAutoCompleteMode(Mode mode) {
        this.f18695p = mode;
    }

    public OnSwipe setDragDirection(Drag drag) {
        this.f18681a = drag;
        return this;
    }

    public OnSwipe setDragScale(int i10) {
        this.f18689i = i10;
        return this;
    }

    public OnSwipe setDragThreshold(int i10) {
        this.f18690j = i10;
        return this;
    }

    public OnSwipe setLimitBoundsTo(String str) {
        this.f18684d = str;
        return this;
    }

    public OnSwipe setMaxAcceleration(int i10) {
        this.f18688h = i10;
        return this;
    }

    public OnSwipe setMaxVelocity(int i10) {
        this.f18687g = i10;
        return this;
    }

    public OnSwipe setOnTouchUp(TouchUp touchUp) {
        this.f18685e = touchUp;
        return this;
    }

    public OnSwipe setRotateCenter(String str) {
        this.f18686f = str;
        return this;
    }

    public OnSwipe setSpringBoundary(Boundary boundary) {
        this.f18694o = boundary;
        return this;
    }

    public OnSwipe setSpringDamping(float f6) {
        this.f18691k = f6;
        return this;
    }

    public OnSwipe setSpringMass(float f6) {
        this.f18692l = f6;
        return this;
    }

    public OnSwipe setSpringStiffness(float f6) {
        this.m = f6;
        return this;
    }

    public OnSwipe setSpringStopThreshold(float f6) {
        this.f18693n = f6;
        return this;
    }

    public OnSwipe setTouchAnchorId(String str) {
        this.f18683c = str;
        return this;
    }

    public OnSwipe setTouchAnchorSide(Side side) {
        this.f18682b = side;
        return this;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("OnSwipe:{\n");
        if (this.f18683c != null) {
            sb2.append("anchor:'");
            sb2.append(this.f18683c);
            sb2.append("',\n");
        }
        if (this.f18681a != null) {
            sb2.append("direction:'");
            sb2.append(this.f18681a.toString().toLowerCase());
            sb2.append("',\n");
        }
        if (this.f18682b != null) {
            sb2.append("side:'");
            sb2.append(this.f18682b.toString().toLowerCase());
            sb2.append("',\n");
        }
        if (!Float.isNaN(this.f18689i)) {
            sb2.append("scale:'");
            sb2.append(this.f18689i);
            sb2.append("',\n");
        }
        if (!Float.isNaN(this.f18690j)) {
            sb2.append("threshold:'");
            sb2.append(this.f18690j);
            sb2.append("',\n");
        }
        if (!Float.isNaN(this.f18687g)) {
            sb2.append("maxVelocity:'");
            sb2.append(this.f18687g);
            sb2.append("',\n");
        }
        if (!Float.isNaN(this.f18688h)) {
            sb2.append("maxAccel:'");
            sb2.append(this.f18688h);
            sb2.append("',\n");
        }
        if (this.f18684d != null) {
            sb2.append("limitBounds:'");
            sb2.append(this.f18684d);
            sb2.append("',\n");
        }
        if (this.f18695p != null) {
            sb2.append("mode:'");
            sb2.append(this.f18695p.toString().toLowerCase());
            sb2.append("',\n");
        }
        if (this.f18685e != null) {
            sb2.append("touchUp:'");
            sb2.append(this.f18685e.toString().toLowerCase());
            sb2.append("',\n");
        }
        if (!Float.isNaN(this.f18692l)) {
            sb2.append("springMass:'");
            sb2.append(this.f18692l);
            sb2.append("',\n");
        }
        if (!Float.isNaN(this.m)) {
            sb2.append("springStiffness:'");
            sb2.append(this.m);
            sb2.append("',\n");
        }
        if (!Float.isNaN(this.f18691k)) {
            sb2.append("springDamping:'");
            sb2.append(this.f18691k);
            sb2.append("',\n");
        }
        if (!Float.isNaN(this.f18693n)) {
            sb2.append("stopThreshold:'");
            sb2.append(this.f18693n);
            sb2.append("',\n");
        }
        if (this.f18694o != null) {
            sb2.append("springBoundary:'");
            sb2.append(this.f18694o);
            sb2.append("',\n");
        }
        if (this.f18686f != null) {
            sb2.append("around:'");
            sb2.append(this.f18686f);
            sb2.append("',\n");
        }
        sb2.append("},\n");
        return sb2.toString();
    }

    public OnSwipe(String str, Side side, Drag drag) {
        this.f18684d = null;
        this.f18685e = null;
        this.f18686f = null;
        this.f18687g = Float.NaN;
        this.f18688h = Float.NaN;
        this.f18689i = Float.NaN;
        this.f18690j = Float.NaN;
        this.f18691k = Float.NaN;
        this.f18692l = Float.NaN;
        this.m = Float.NaN;
        this.f18693n = Float.NaN;
        this.f18694o = null;
        this.f18695p = null;
        this.f18683c = str;
        this.f18682b = side;
        this.f18681a = drag;
    }
}
