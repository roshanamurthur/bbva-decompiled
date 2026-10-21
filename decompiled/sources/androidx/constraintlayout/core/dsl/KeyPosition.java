package androidx.constraintlayout.core.dsl;

import androidx.camera.core.impl.utils.c;

/* JADX INFO: loaded from: classes.dex */
public class KeyPosition extends Keys {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f18663a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f18665c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f18664b = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f18666d = Float.NaN;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f18667e = Float.NaN;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f18668f = Float.NaN;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f18669g = Float.NaN;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Type f18670h = Type.CARTESIAN;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Type {
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type CARTESIAN;
        public static final Type PATH;
        public static final Type SCREEN;

        static {
            Type type = new Type("CARTESIAN", 0);
            CARTESIAN = type;
            Type type2 = new Type("SCREEN", 1);
            SCREEN = type2;
            Type type3 = new Type("PATH", 2);
            PATH = type3;
            $VALUES = new Type[]{type, type2, type3};
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

    public KeyPosition(String str, int i10) {
        this.f18663a = null;
        this.f18665c = 0;
        this.f18663a = str;
        this.f18665c = i10;
    }

    public int getFrames() {
        return this.f18665c;
    }

    public float getPercentHeight() {
        return this.f18667e;
    }

    public float getPercentWidth() {
        return this.f18666d;
    }

    public float getPercentX() {
        return this.f18668f;
    }

    public float getPercentY() {
        return this.f18669g;
    }

    public Type getPositionType() {
        return this.f18670h;
    }

    public String getTarget() {
        return this.f18663a;
    }

    public String getTransitionEasing() {
        return this.f18664b;
    }

    public void setFrames(int i10) {
        this.f18665c = i10;
    }

    public void setPercentHeight(float f6) {
        this.f18667e = f6;
    }

    public void setPercentWidth(float f6) {
        this.f18666d = f6;
    }

    public void setPercentX(float f6) {
        this.f18668f = f6;
    }

    public void setPercentY(float f6) {
        this.f18669g = f6;
    }

    public void setPositionType(Type type) {
        this.f18670h = type;
    }

    public void setTarget(String str) {
        this.f18663a = str;
    }

    public void setTransitionEasing(String str) {
        this.f18664b = str;
    }

    public String toString() {
        StringBuilder sbD = c.d("KeyPositions:{\n");
        append(sbD, "target", this.f18663a);
        sbD.append("frame:");
        sbD.append(this.f18665c);
        sbD.append(",\n");
        if (this.f18670h != null) {
            sbD.append("type:'");
            sbD.append(this.f18670h);
            sbD.append("',\n");
        }
        append(sbD, "easing", this.f18664b);
        append(sbD, "percentX", this.f18668f);
        append(sbD, "percentY", this.f18669g);
        append(sbD, "percentWidth", this.f18666d);
        append(sbD, "percentHeight", this.f18667e);
        sbD.append("},\n");
        return sbD.toString();
    }
}
