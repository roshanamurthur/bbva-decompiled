package androidx.transition;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.core.content.res.TypedArrayUtils;
import androidx.datastore.preferences.protobuf.e;
import h3.k;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes2.dex */
public class ArcMotion extends PathMotion {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final float f23535g = (float) Math.tan(Math.toRadians(35.0d));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f23536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f23537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f23538c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f23539d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f23540e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f23541f;

    public ArcMotion() {
        this.f23536a = 0.0f;
        this.f23537b = 0.0f;
        this.f23538c = 70.0f;
        this.f23539d = 0.0f;
        this.f23540e = 0.0f;
        this.f23541f = f23535g;
    }

    public static float a(float f6) {
        if (f6 < 0.0f || f6 > 90.0f) {
            throw new IllegalArgumentException("Arc must be between 0 and 90 degrees");
        }
        return (float) Math.tan(Math.toRadians(f6 / 2.0f));
    }

    public float getMaximumAngle() {
        return this.f23538c;
    }

    public float getMinimumHorizontalAngle() {
        return this.f23536a;
    }

    public float getMinimumVerticalAngle() {
        return this.f23537b;
    }

    @Override // androidx.transition.PathMotion
    @NonNull
    public Path getPath(float f6, float f10, float f11, float f12) {
        float fA;
        float fA2;
        float f13;
        Path path = new Path();
        path.moveTo(f6, f10);
        float f14 = f11 - f6;
        float f15 = f12 - f10;
        float f16 = (f15 * f15) + (f14 * f14);
        float f17 = (f6 + f11) / 2.0f;
        float f18 = (f10 + f12) / 2.0f;
        float f19 = 0.25f * f16;
        boolean z10 = f10 > f12;
        if (Math.abs(f14) < Math.abs(f15)) {
            float fAbs = Math.abs(f16 / (f15 * 2.0f));
            if (z10) {
                fA2 = fAbs + f12;
                fA = f11;
            } else {
                fA2 = fAbs + f10;
                fA = f6;
            }
            f13 = this.f23540e;
        } else {
            float f20 = f16 / (f14 * 2.0f);
            if (z10) {
                fA2 = f10;
                fA = f20 + f6;
            } else {
                fA = f11 - f20;
                fA2 = f12;
            }
            f13 = this.f23539d;
        }
        float f21 = f19 * f13 * f13;
        float f22 = f17 - fA;
        float f23 = f18 - fA2;
        float f24 = (f23 * f23) + (f22 * f22);
        float f25 = this.f23541f;
        float f26 = f19 * f25 * f25;
        if (f24 >= f21) {
            f21 = f24 > f26 ? f26 : 0.0f;
        }
        if (f21 != 0.0f) {
            float fSqrt = (float) Math.sqrt(f21 / f24);
            fA = e.a(fA, f17, fSqrt, f17);
            fA2 = e.a(fA2, f18, fSqrt, f18);
        }
        path.cubicTo((f6 + fA) / 2.0f, (f10 + fA2) / 2.0f, (fA + f11) / 2.0f, (fA2 + f12) / 2.0f, f11, f12);
        return path;
    }

    public void setMaximumAngle(float f6) {
        this.f23538c = f6;
        this.f23541f = a(f6);
    }

    public void setMinimumHorizontalAngle(float f6) {
        this.f23536a = f6;
        this.f23539d = a(f6);
    }

    public void setMinimumVerticalAngle(float f6) {
        this.f23537b = f6;
        this.f23540e = a(f6);
    }

    public ArcMotion(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23536a = 0.0f;
        this.f23537b = 0.0f;
        this.f23538c = 70.0f;
        this.f23539d = 0.0f;
        this.f23540e = 0.0f;
        this.f23541f = f23535g;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.f69324j);
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        setMinimumVerticalAngle(TypedArrayUtils.getNamedFloat(typedArrayObtainStyledAttributes, xmlPullParser, "minimumVerticalAngle", 1, 0.0f));
        setMinimumHorizontalAngle(TypedArrayUtils.getNamedFloat(typedArrayObtainStyledAttributes, xmlPullParser, "minimumHorizontalAngle", 0, 0.0f));
        setMaximumAngle(TypedArrayUtils.getNamedFloat(typedArrayObtainStyledAttributes, xmlPullParser, "maximumAngle", 2, 70.0f));
        typedArrayObtainStyledAttributes.recycle();
    }
}
