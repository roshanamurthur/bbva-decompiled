package androidx.constraintlayout.core.dsl;

import androidx.camera.core.impl.utils.c;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class KeyPositions extends Keys {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String[] f18671a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f18674d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f18672b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Type f18673c = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float[] f18675e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float[] f18676f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float[] f18677g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float[] f18678h = null;

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

    public KeyPositions(int i10, String... strArr) {
        this.f18674d = null;
        this.f18671a = strArr;
        int[] iArr = new int[i10];
        this.f18674d = iArr;
        float length = 100.0f / (iArr.length + 1);
        int i11 = 0;
        while (true) {
            int[] iArr2 = this.f18674d;
            if (i11 >= iArr2.length) {
                return;
            }
            iArr2[i11] = (int) ((i11 * length) + length);
            i11++;
        }
    }

    public int[] getFrames() {
        return this.f18674d;
    }

    public float[] getPercentHeight() {
        return this.f18676f;
    }

    public float[] getPercentWidth() {
        return this.f18675e;
    }

    public float[] getPercentX() {
        return this.f18677g;
    }

    public float[] getPercentY() {
        return this.f18678h;
    }

    public Type getPositionType() {
        return this.f18673c;
    }

    public String[] getTarget() {
        return this.f18671a;
    }

    public String getTransitionEasing() {
        return this.f18672b;
    }

    public void setFrames(int... iArr) {
        this.f18674d = iArr;
    }

    public void setPercentHeight(float... fArr) {
        this.f18676f = fArr;
    }

    public void setPercentWidth(float... fArr) {
        this.f18675e = fArr;
    }

    public void setPercentX(float... fArr) {
        this.f18677g = fArr;
    }

    public void setPercentY(float... fArr) {
        this.f18678h = fArr;
    }

    public void setPositionType(Type type) {
        this.f18673c = type;
    }

    public void setTransitionEasing(String str) {
        this.f18672b = str;
    }

    public String toString() {
        StringBuilder sbD = c.d("KeyPositions:{\n");
        append(sbD, "target", this.f18671a);
        sbD.append("frame:");
        sbD.append(Arrays.toString(this.f18674d));
        sbD.append(",\n");
        if (this.f18673c != null) {
            sbD.append("type:'");
            sbD.append(this.f18673c);
            sbD.append("',\n");
        }
        append(sbD, "easing", this.f18672b);
        append(sbD, "percentX", this.f18677g);
        append(sbD, "percentX", this.f18678h);
        append(sbD, "percentWidth", this.f18675e);
        append(sbD, "percentHeight", this.f18676f);
        sbD.append("},\n");
        return sbD.toString();
    }
}
