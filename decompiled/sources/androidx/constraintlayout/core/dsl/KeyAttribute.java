package androidx.constraintlayout.core.dsl;

import androidx.constraintlayout.core.motion.utils.TypedValues;

/* JADX INFO: loaded from: classes.dex */
public class KeyAttribute extends Keys {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f18623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f18625c;
    protected String TYPE = TypedValues.AttributesType.NAME;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Fit f18626d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Visibility f18627e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f18628f = Float.NaN;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f18629g = Float.NaN;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f18630h = Float.NaN;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f18631i = Float.NaN;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f18632j = Float.NaN;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f18633k = Float.NaN;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f18634l = Float.NaN;
    public float m = Float.NaN;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f18635n = Float.NaN;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f18636o = Float.NaN;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f18637p = Float.NaN;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f18638q = Float.NaN;

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

    public KeyAttribute(int i10, String str) {
        this.f18623a = str;
        this.f18624b = i10;
    }

    public void attributesToString(StringBuilder sb2) {
        append(sb2, "target", this.f18623a);
        sb2.append("frame:");
        sb2.append(this.f18624b);
        sb2.append(",\n");
        append(sb2, "easing", this.f18625c);
        if (this.f18626d != null) {
            sb2.append("fit:'");
            sb2.append(this.f18626d);
            sb2.append("',\n");
        }
        if (this.f18627e != null) {
            sb2.append("visibility:'");
            sb2.append(this.f18627e);
            sb2.append("',\n");
        }
        append(sb2, "alpha", this.f18628f);
        append(sb2, "rotationX", this.f18630h);
        append(sb2, "rotationY", this.f18631i);
        append(sb2, "rotationZ", this.f18629g);
        append(sb2, "pivotX", this.f18632j);
        append(sb2, "pivotY", this.f18633k);
        append(sb2, "pathRotate", this.f18634l);
        append(sb2, "scaleX", this.m);
        append(sb2, "scaleY", this.f18635n);
        append(sb2, "translationX", this.f18636o);
        append(sb2, "translationY", this.f18637p);
        append(sb2, "translationZ", this.f18638q);
    }

    public float getAlpha() {
        return this.f18628f;
    }

    public Fit getCurveFit() {
        return this.f18626d;
    }

    public float getPivotX() {
        return this.f18632j;
    }

    public float getPivotY() {
        return this.f18633k;
    }

    public float getRotation() {
        return this.f18629g;
    }

    public float getRotationX() {
        return this.f18630h;
    }

    public float getRotationY() {
        return this.f18631i;
    }

    public float getScaleX() {
        return this.m;
    }

    public float getScaleY() {
        return this.f18635n;
    }

    public String getTarget() {
        return this.f18623a;
    }

    public String getTransitionEasing() {
        return this.f18625c;
    }

    public float getTransitionPathRotate() {
        return this.f18634l;
    }

    public float getTranslationX() {
        return this.f18636o;
    }

    public float getTranslationY() {
        return this.f18637p;
    }

    public float getTranslationZ() {
        return this.f18638q;
    }

    public Visibility getVisibility() {
        return this.f18627e;
    }

    public void setAlpha(float f6) {
        this.f18628f = f6;
    }

    public void setCurveFit(Fit fit) {
        this.f18626d = fit;
    }

    public void setPivotX(float f6) {
        this.f18632j = f6;
    }

    public void setPivotY(float f6) {
        this.f18633k = f6;
    }

    public void setRotation(float f6) {
        this.f18629g = f6;
    }

    public void setRotationX(float f6) {
        this.f18630h = f6;
    }

    public void setRotationY(float f6) {
        this.f18631i = f6;
    }

    public void setScaleX(float f6) {
        this.m = f6;
    }

    public void setScaleY(float f6) {
        this.f18635n = f6;
    }

    public void setTarget(String str) {
        this.f18623a = str;
    }

    public void setTransitionEasing(String str) {
        this.f18625c = str;
    }

    public void setTransitionPathRotate(float f6) {
        this.f18634l = f6;
    }

    public void setTranslationX(float f6) {
        this.f18636o = f6;
    }

    public void setTranslationY(float f6) {
        this.f18637p = f6;
    }

    public void setTranslationZ(float f6) {
        this.f18638q = f6;
    }

    public void setVisibility(Visibility visibility) {
        this.f18627e = visibility;
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
