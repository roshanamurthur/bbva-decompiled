package androidx.transition;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.core.content.res.TypedArrayUtils;
import androidx.core.graphics.PathParser;
import h3.k;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes2.dex */
public class PatternPathMotion extends PathMotion {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Path f23634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final Path f23635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Matrix f23636c;

    public PatternPathMotion() {
        Path path = new Path();
        this.f23635b = path;
        this.f23636c = new Matrix();
        path.lineTo(1.0f, 0.0f);
        this.f23634a = path;
    }

    @Override // androidx.transition.PathMotion
    @NonNull
    public Path getPath(float f6, float f10, float f11, float f12) {
        float f13 = f11 - f6;
        float f14 = f12 - f10;
        float fSqrt = (float) Math.sqrt((f14 * f14) + (f13 * f13));
        double dAtan2 = Math.atan2(f14, f13);
        Matrix matrix = this.f23636c;
        matrix.setScale(fSqrt, fSqrt);
        matrix.postRotate((float) Math.toDegrees(dAtan2));
        matrix.postTranslate(f6, f10);
        Path path = new Path();
        this.f23635b.transform(matrix, path);
        return path;
    }

    @NonNull
    public Path getPatternPath() {
        return this.f23634a;
    }

    public void setPatternPath(@NonNull Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float[] fArr = new float[2];
        pathMeasure.getPosTan(pathMeasure.getLength(), fArr, null);
        float f6 = fArr[0];
        float f10 = fArr[1];
        pathMeasure.getPosTan(0.0f, fArr, null);
        float f11 = fArr[0];
        float f12 = fArr[1];
        if (f11 == f6 && f12 == f10) {
            throw new IllegalArgumentException("pattern must not end at the starting point");
        }
        Matrix matrix = this.f23636c;
        matrix.setTranslate(-f11, -f12);
        float f13 = f6 - f11;
        float f14 = f10 - f12;
        float fSqrt = 1.0f / ((float) Math.sqrt((f14 * f14) + (f13 * f13)));
        matrix.postScale(fSqrt, fSqrt);
        matrix.postRotate((float) Math.toDegrees(-Math.atan2(f14, f13)));
        path.transform(matrix, this.f23635b);
        this.f23634a = path;
    }

    public PatternPathMotion(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        this.f23635b = new Path();
        this.f23636c = new Matrix();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.f69325k);
        try {
            String namedString = TypedArrayUtils.getNamedString(typedArrayObtainStyledAttributes, (XmlPullParser) attributeSet, "patternPathData", 0);
            if (namedString != null) {
                setPatternPath(PathParser.createPathFromPathData(namedString));
                typedArrayObtainStyledAttributes.recycle();
                return;
            }
            throw new RuntimeException("pathData must be supplied for patternPathMotion");
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    public PatternPathMotion(@NonNull Path path) {
        this.f23635b = new Path();
        this.f23636c = new Matrix();
        setPatternPath(path);
    }
}
