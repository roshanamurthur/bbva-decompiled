package androidx.constraintlayout.core.dsl;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class KeyAttributes extends Keys {
    protected String TYPE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String[] f18639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f18640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Fit f18641c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Visibility[] f18642d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float[] f18643e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float[] f18644f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float[] f18645g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float[] f18646h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float[] f18647i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float[] f18648j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float[] f18649k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float[] f18650l;
    public float[] m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float[] f18651n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float[] f18652o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float[] f18653p;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Fit {
        private static final /* synthetic */ Fit[] $VALUES;
        public static final Fit LINEAR;
        public static final Fit SPLINE;

        static {
            Fit fit = new Fit("SPLINE", 0);
            SPLINE = fit;
            Fit fit2 = new Fit("LINEAR", 1);
            LINEAR = fit2;
            $VALUES = new Fit[]{fit, fit2};
        }

        public Fit() {
            throw null;
        }

        public static Fit valueOf(String str) {
            return (Fit) Enum.valueOf(Fit.class, str);
        }

        public static Fit[] values() {
            return (Fit[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Visibility {
        private static final /* synthetic */ Visibility[] $VALUES;
        public static final Visibility GONE;
        public static final Visibility INVISIBLE;
        public static final Visibility VISIBLE;

        static {
            Visibility visibility = new Visibility("VISIBLE", 0);
            VISIBLE = visibility;
            Visibility visibility2 = new Visibility("INVISIBLE", 1);
            INVISIBLE = visibility2;
            Visibility visibility3 = new Visibility("GONE", 2);
            GONE = visibility3;
            $VALUES = new Visibility[]{visibility, visibility2, visibility3};
        }

        public Visibility() {
            throw null;
        }

        public static Visibility valueOf(String str) {
            return (Visibility) Enum.valueOf(Visibility.class, str);
        }

        public static Visibility[] values() {
            return (Visibility[]) $VALUES.clone();
        }
    }

    public void attributesToString(StringBuilder sb2) {
        append(sb2, "target", this.f18639a);
        sb2.append("frame:");
        sb2.append(Arrays.toString((int[]) null));
        sb2.append(",\n");
        append(sb2, "easing", this.f18640b);
        if (this.f18641c != null) {
            sb2.append("fit:'");
            sb2.append(this.f18641c);
            sb2.append("',\n");
        }
        if (this.f18642d != null) {
            sb2.append("visibility:'");
            sb2.append(Arrays.toString(this.f18642d));
            sb2.append("',\n");
        }
        append(sb2, "alpha", this.f18643e);
        append(sb2, "rotationX", this.f18645g);
        append(sb2, "rotationY", this.f18646h);
        append(sb2, "rotationZ", this.f18644f);
        append(sb2, "pivotX", this.f18647i);
        append(sb2, "pivotY", this.f18648j);
        append(sb2, "pathRotate", this.f18649k);
        append(sb2, "scaleX", this.f18650l);
        append(sb2, "scaleY", this.m);
        append(sb2, "translationX", this.f18651n);
        append(sb2, "translationY", this.f18652o);
        append(sb2, "translationZ", this.f18653p);
    }

    public float[] getAlpha() {
        return this.f18643e;
    }

    public Fit getCurveFit() {
        return this.f18641c;
    }

    public float[] getPivotX() {
        return this.f18647i;
    }

    public float[] getPivotY() {
        return this.f18648j;
    }

    public float[] getRotation() {
        return this.f18644f;
    }

    public float[] getRotationX() {
        return this.f18645g;
    }

    public float[] getRotationY() {
        return this.f18646h;
    }

    public float[] getScaleX() {
        return this.f18650l;
    }

    public float[] getScaleY() {
        return this.m;
    }

    public String[] getTarget() {
        return this.f18639a;
    }

    public String getTransitionEasing() {
        return this.f18640b;
    }

    public float[] getTransitionPathRotate() {
        return this.f18649k;
    }

    public float[] getTranslationX() {
        return this.f18651n;
    }

    public float[] getTranslationY() {
        return this.f18652o;
    }

    public float[] getTranslationZ() {
        return this.f18653p;
    }

    public Visibility[] getVisibility() {
        return this.f18642d;
    }

    public void setAlpha(float... fArr) {
        this.f18643e = fArr;
    }

    public void setCurveFit(Fit fit) {
        this.f18641c = fit;
    }

    public void setPivotX(float... fArr) {
        this.f18647i = fArr;
    }

    public void setPivotY(float... fArr) {
        this.f18648j = fArr;
    }

    public void setRotation(float... fArr) {
        this.f18644f = fArr;
    }

    public void setRotationX(float... fArr) {
        this.f18645g = fArr;
    }

    public void setRotationY(float... fArr) {
        this.f18646h = fArr;
    }

    public void setScaleX(float[] fArr) {
        this.f18650l = fArr;
    }

    public void setScaleY(float[] fArr) {
        this.m = fArr;
    }

    public void setTarget(String[] strArr) {
        this.f18639a = strArr;
    }

    public void setTransitionEasing(String str) {
        this.f18640b = str;
    }

    public void setTransitionPathRotate(float... fArr) {
        this.f18649k = fArr;
    }

    public void setTranslationX(float[] fArr) {
        this.f18651n = fArr;
    }

    public void setTranslationY(float[] fArr) {
        this.f18652o = fArr;
    }

    public void setTranslationZ(float[] fArr) {
        this.f18653p = fArr;
    }

    public void setVisibility(Visibility... visibilityArr) {
        this.f18642d = visibilityArr;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.TYPE);
        sb2.append(":{\n");
        attributesToString(sb2);
        sb2.append("},\n");
        return sb2.toString();
    }
}
