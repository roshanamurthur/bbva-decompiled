package x2;

import android.view.animation.Interpolator;
import androidx.camera.camera2.internal.h0;
import androidx.datastore.preferences.protobuf.e;

/* JADX INFO: compiled from: LookupTableInterpolator.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a implements Interpolator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f94480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f94481b;

    public a(float[] fArr) {
        this.f94480a = fArr;
        this.f94481b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f6) {
        if (f6 >= 1.0f) {
            return 1.0f;
        }
        if (f6 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f94480a;
        int iMin = Math.min((int) ((fArr.length - 1) * f6), fArr.length - 2);
        float f10 = this.f94481b;
        float fA = h0.a(iMin, f10, f6, f10);
        float f11 = fArr[iMin];
        return e.a(fArr[iMin + 1], f11, fA, f11);
    }
}
