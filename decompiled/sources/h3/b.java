package h3;

import android.animation.TypeEvaluator;

/* JADX INFO: compiled from: FloatArrayEvaluator.java */
/* JADX INFO: loaded from: classes2.dex */
public final class b implements TypeEvaluator<float[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float[] f69302a;

    @Override // android.animation.TypeEvaluator
    public final float[] evaluate(float f6, float[] fArr, float[] fArr2) {
        float[] fArr3 = fArr;
        float[] fArr4 = fArr2;
        float[] fArr5 = this.f69302a;
        if (fArr5 == null) {
            fArr5 = new float[fArr3.length];
        }
        for (int i10 = 0; i10 < fArr5.length; i10++) {
            float f10 = fArr3[i10];
            fArr5[i10] = androidx.datastore.preferences.protobuf.e.a(fArr4[i10], f10, f6, f10);
        }
        return fArr5;
    }
}
