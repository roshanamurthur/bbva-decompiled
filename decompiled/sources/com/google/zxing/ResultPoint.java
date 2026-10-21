package com.google.zxing;

import androidx.camera.camera2.internal.compat.u;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.google.zxing.common.detector.MathUtils;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes10.dex */
public class ResultPoint {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f49670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f49671b;

    public ResultPoint(float f6, float f10) {
        this.f49670a = f6;
        this.f49671b = f10;
    }

    public static float distance(ResultPoint resultPoint, ResultPoint resultPoint2) {
        return MathUtils.distance(resultPoint.f49670a, resultPoint.f49671b, resultPoint2.f49670a, resultPoint2.f49671b);
    }

    public static void orderBestPatterns(ResultPoint[] resultPointArr) {
        ResultPoint resultPoint;
        ResultPoint resultPoint2;
        ResultPoint resultPoint3;
        float fDistance = distance(resultPointArr[0], resultPointArr[1]);
        float fDistance2 = distance(resultPointArr[1], resultPointArr[2]);
        float fDistance3 = distance(resultPointArr[0], resultPointArr[2]);
        if (fDistance2 >= fDistance && fDistance2 >= fDistance3) {
            resultPoint = resultPointArr[0];
            resultPoint2 = resultPointArr[1];
            resultPoint3 = resultPointArr[2];
        } else if (fDistance3 < fDistance2 || fDistance3 < fDistance) {
            resultPoint = resultPointArr[2];
            resultPoint2 = resultPointArr[0];
            resultPoint3 = resultPointArr[1];
        } else {
            resultPoint = resultPointArr[1];
            resultPoint2 = resultPointArr[0];
            resultPoint3 = resultPointArr[2];
        }
        float f6 = resultPoint.f49670a;
        float f10 = resultPoint3.f49670a - f6;
        float f11 = resultPoint2.f49671b;
        float f12 = resultPoint.f49671b;
        if (((f11 - f12) * f10) - ((resultPoint2.f49670a - f6) * (resultPoint3.f49671b - f12)) < 0.0f) {
            ResultPoint resultPoint4 = resultPoint3;
            resultPoint3 = resultPoint2;
            resultPoint2 = resultPoint4;
        }
        resultPointArr[0] = resultPoint2;
        resultPointArr[1] = resultPoint;
        resultPointArr[2] = resultPoint3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ResultPoint) {
            ResultPoint resultPoint = (ResultPoint) obj;
            if (this.f49670a == resultPoint.f49670a && this.f49671b == resultPoint.f49671b) {
                return true;
            }
        }
        return false;
    }

    public final float getX() {
        return this.f49670a;
    }

    public final float getY() {
        return this.f49671b;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f49671b) + (Float.floatToIntBits(this.f49670a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("(");
        sb2.append(this.f49670a);
        sb2.append(AbstractJsonLexerKt.COMMA);
        return u.i(sb2, this.f49671b, RootService.CLOSE_BRACKET);
    }
}
