package com.caverock.androidsvg;

/* JADX INFO: loaded from: classes9.dex */
public class PreserveAspectRatio {
    public static final PreserveAspectRatio BOTTOM;
    public static final PreserveAspectRatio END;
    public static final PreserveAspectRatio FULLSCREEN;
    public static final PreserveAspectRatio FULLSCREEN_START;
    public static final PreserveAspectRatio LETTERBOX;
    public static final PreserveAspectRatio START;
    public static final PreserveAspectRatio TOP;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Alignment f38934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Scale f38935b;
    public static final PreserveAspectRatio UNSCALED = new PreserveAspectRatio(null, null);
    public static final PreserveAspectRatio STRETCH = new PreserveAspectRatio(Alignment.none, null);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Alignment {
        private static final /* synthetic */ Alignment[] $VALUES;
        public static final Alignment none;
        public static final Alignment xMaxYMax;
        public static final Alignment xMaxYMid;
        public static final Alignment xMaxYMin;
        public static final Alignment xMidYMax;
        public static final Alignment xMidYMid;
        public static final Alignment xMidYMin;
        public static final Alignment xMinYMax;
        public static final Alignment xMinYMid;
        public static final Alignment xMinYMin;

        static {
            Alignment alignment = new Alignment("none", 0);
            none = alignment;
            Alignment alignment2 = new Alignment("xMinYMin", 1);
            xMinYMin = alignment2;
            Alignment alignment3 = new Alignment("xMidYMin", 2);
            xMidYMin = alignment3;
            Alignment alignment4 = new Alignment("xMaxYMin", 3);
            xMaxYMin = alignment4;
            Alignment alignment5 = new Alignment("xMinYMid", 4);
            xMinYMid = alignment5;
            Alignment alignment6 = new Alignment("xMidYMid", 5);
            xMidYMid = alignment6;
            Alignment alignment7 = new Alignment("xMaxYMid", 6);
            xMaxYMid = alignment7;
            Alignment alignment8 = new Alignment("xMinYMax", 7);
            xMinYMax = alignment8;
            Alignment alignment9 = new Alignment("xMidYMax", 8);
            xMidYMax = alignment9;
            Alignment alignment10 = new Alignment("xMaxYMax", 9);
            xMaxYMax = alignment10;
            $VALUES = new Alignment[]{alignment, alignment2, alignment3, alignment4, alignment5, alignment6, alignment7, alignment8, alignment9, alignment10};
        }

        public Alignment() {
            throw null;
        }

        public static Alignment valueOf(String str) {
            return (Alignment) Enum.valueOf(Alignment.class, str);
        }

        public static Alignment[] values() {
            return (Alignment[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Scale {
        private static final /* synthetic */ Scale[] $VALUES;
        public static final Scale meet;
        public static final Scale slice;

        static {
            Scale scale = new Scale("meet", 0);
            meet = scale;
            Scale scale2 = new Scale("slice", 1);
            slice = scale2;
            $VALUES = new Scale[]{scale, scale2};
        }

        public Scale() {
            throw null;
        }

        public static Scale valueOf(String str) {
            return (Scale) Enum.valueOf(Scale.class, str);
        }

        public static Scale[] values() {
            return (Scale[]) $VALUES.clone();
        }
    }

    static {
        Alignment alignment = Alignment.xMidYMid;
        Scale scale = Scale.meet;
        LETTERBOX = new PreserveAspectRatio(alignment, scale);
        Alignment alignment2 = Alignment.xMinYMin;
        START = new PreserveAspectRatio(alignment2, scale);
        END = new PreserveAspectRatio(Alignment.xMaxYMax, scale);
        TOP = new PreserveAspectRatio(Alignment.xMidYMin, scale);
        BOTTOM = new PreserveAspectRatio(Alignment.xMidYMax, scale);
        Scale scale2 = Scale.slice;
        FULLSCREEN = new PreserveAspectRatio(alignment, scale2);
        FULLSCREEN_START = new PreserveAspectRatio(alignment2, scale2);
    }

    public PreserveAspectRatio(Alignment alignment, Scale scale) {
        this.f38934a = alignment;
        this.f38935b = scale;
    }

    public static PreserveAspectRatio of(String str) {
        try {
            return c.B(str);
        } catch (SVGParseException e5) {
            throw new IllegalArgumentException(e5.getMessage());
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PreserveAspectRatio preserveAspectRatio = (PreserveAspectRatio) obj;
        return this.f38934a == preserveAspectRatio.f38934a && this.f38935b == preserveAspectRatio.f38935b;
    }

    public Alignment getAlignment() {
        return this.f38934a;
    }

    public Scale getScale() {
        return this.f38935b;
    }

    public String toString() {
        return this.f38934a + " " + this.f38935b;
    }
}
