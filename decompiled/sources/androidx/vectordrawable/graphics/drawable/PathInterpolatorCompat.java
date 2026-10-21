package androidx.vectordrawable.graphics.drawable;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.animation.Interpolator;
import androidx.annotation.RestrictTo;
import androidx.camera.core.processing.f;
import androidx.core.content.res.TypedArrayUtils;
import androidx.core.graphics.PathParser;
import androidx.datastore.preferences.protobuf.e;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class PathInterpolatorCompat implements Interpolator {
    public static final double EPSILON = 1.0E-5d;
    public static final int MAX_NUM_POINTS = 3000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float[] f23768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float[] f23769b;

    public PathInterpolatorCompat(Context context, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        this(context.getResources(), context.getTheme(), attributeSet, xmlPullParser);
    }

    public final void a(Path path) {
        int i10 = 0;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int iMin = Math.min(3000, ((int) (length / 0.002f)) + 1);
        if (iMin <= 0) {
            throw new IllegalArgumentException("The Path has a invalid length " + length);
        }
        this.f23768a = new float[iMin];
        this.f23769b = new float[iMin];
        float[] fArr = new float[2];
        for (int i11 = 0; i11 < iMin; i11++) {
            pathMeasure.getPosTan((i11 * length) / (iMin - 1), fArr, null);
            this.f23768a[i11] = fArr[0];
            this.f23769b[i11] = fArr[1];
        }
        if (Math.abs(this.f23768a[0]) <= 1.0E-5d && Math.abs(this.f23769b[0]) <= 1.0E-5d) {
            int i12 = iMin - 1;
            if (Math.abs(this.f23768a[i12] - 1.0f) <= 1.0E-5d && Math.abs(this.f23769b[i12] - 1.0f) <= 1.0E-5d) {
                float f6 = 0.0f;
                int i13 = 0;
                while (i10 < iMin) {
                    float[] fArr2 = this.f23768a;
                    int i14 = i13 + 1;
                    float f10 = fArr2[i13];
                    if (f10 < f6) {
                        throw new IllegalArgumentException("The Path cannot loop back on itself, x :" + f10);
                    }
                    fArr2[i10] = f10;
                    i10++;
                    f6 = f10;
                    i13 = i14;
                }
                if (pathMeasure.nextContour()) {
                    throw new IllegalArgumentException("The Path should be continuous, can't have 2+ contours");
                }
                return;
            }
        }
        StringBuilder sb2 = new StringBuilder("The Path must start at (0,0) and end at (1,1) start: ");
        sb2.append(this.f23768a[0]);
        sb2.append(",");
        sb2.append(this.f23769b[0]);
        sb2.append(" end:");
        int i15 = iMin - 1;
        sb2.append(this.f23768a[i15]);
        sb2.append(",");
        sb2.append(this.f23769b[i15]);
        throw new IllegalArgumentException(sb2.toString());
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f6) {
        if (f6 <= 0.0f) {
            return 0.0f;
        }
        if (f6 >= 1.0f) {
            return 1.0f;
        }
        int length = this.f23768a.length - 1;
        int i10 = 0;
        while (length - i10 > 1) {
            int i11 = (i10 + length) / 2;
            if (f6 < this.f23768a[i11]) {
                length = i11;
            } else {
                i10 = i11;
            }
        }
        float[] fArr = this.f23768a;
        float f10 = fArr[length];
        float f11 = fArr[i10];
        float f12 = f10 - f11;
        if (f12 == 0.0f) {
            return this.f23769b[i10];
        }
        float f13 = (f6 - f11) / f12;
        float[] fArr2 = this.f23769b;
        float f14 = fArr2[i10];
        return e.a(fArr2[length], f14, f13, f14);
    }

    public PathInterpolatorCompat(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray typedArrayObtainAttributes = TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, a.f23843l);
        if (TypedArrayUtils.hasAttribute(xmlPullParser, "pathData")) {
            String namedString = TypedArrayUtils.getNamedString(typedArrayObtainAttributes, xmlPullParser, "pathData", 4);
            Path pathCreatePathFromPathData = PathParser.createPathFromPathData(namedString);
            if (pathCreatePathFromPathData == null) {
                throw new InflateException(f.d("The path is null, which is created from ", namedString));
            }
            a(pathCreatePathFromPathData);
        } else {
            if (!TypedArrayUtils.hasAttribute(xmlPullParser, "controlX1")) {
                throw new InflateException("pathInterpolator requires the controlX1 attribute");
            }
            if (!TypedArrayUtils.hasAttribute(xmlPullParser, "controlY1")) {
                throw new InflateException("pathInterpolator requires the controlY1 attribute");
            }
            float namedFloat = TypedArrayUtils.getNamedFloat(typedArrayObtainAttributes, xmlPullParser, "controlX1", 0, 0.0f);
            float namedFloat2 = TypedArrayUtils.getNamedFloat(typedArrayObtainAttributes, xmlPullParser, "controlY1", 1, 0.0f);
            boolean zHasAttribute = TypedArrayUtils.hasAttribute(xmlPullParser, "controlX2");
            if (zHasAttribute != TypedArrayUtils.hasAttribute(xmlPullParser, "controlY2")) {
                throw new InflateException("pathInterpolator requires both controlX2 and controlY2 for cubic Beziers.");
            }
            if (zHasAttribute) {
                float namedFloat3 = TypedArrayUtils.getNamedFloat(typedArrayObtainAttributes, xmlPullParser, "controlX2", 2, 0.0f);
                float namedFloat4 = TypedArrayUtils.getNamedFloat(typedArrayObtainAttributes, xmlPullParser, "controlY2", 3, 0.0f);
                Path path = new Path();
                path.moveTo(0.0f, 0.0f);
                path.cubicTo(namedFloat, namedFloat2, namedFloat3, namedFloat4, 1.0f, 1.0f);
                a(path);
            } else {
                Path path2 = new Path();
                path2.moveTo(0.0f, 0.0f);
                path2.quadTo(namedFloat, namedFloat2, 1.0f, 1.0f);
                a(path2);
            }
        }
        typedArrayObtainAttributes.recycle();
    }
}
