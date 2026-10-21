package pe;

import android.graphics.RectF;

/* JADX INFO: compiled from: FitModeEvaluators.java */
/* JADX INFO: loaded from: classes10.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f92659a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f92660b = new b();

    /* JADX INFO: compiled from: FitModeEvaluators.java */
    public class a implements h {
        @Override // pe.h
        public final j a(float f6, float f10, float f11, float f12, float f13, float f14, float f15) {
            float fD = p.d(f12, f14, f10, f11, f6, true);
            float f16 = fD / f12;
            float f17 = fD / f14;
            return new j(f16, f17, fD, f13 * f16, fD, f15 * f17);
        }

        @Override // pe.h
        public final void b(RectF rectF, float f6, j jVar) {
            rectF.bottom -= Math.abs(jVar.f92666f - jVar.f92664d) * f6;
        }

        @Override // pe.h
        public final boolean c(j jVar) {
            return jVar.f92664d > jVar.f92666f;
        }
    }

    /* JADX INFO: compiled from: FitModeEvaluators.java */
    public class b implements h {
        @Override // pe.h
        public final j a(float f6, float f10, float f11, float f12, float f13, float f14, float f15) {
            float fD = p.d(f13, f15, f10, f11, f6, true);
            float f16 = fD / f13;
            float f17 = fD / f15;
            return new j(f16, f17, f12 * f16, fD, f14 * f17, fD);
        }

        @Override // pe.h
        public final void b(RectF rectF, float f6, j jVar) {
            float fAbs = (Math.abs(jVar.f92665e - jVar.f92663c) / 2.0f) * f6;
            rectF.left += fAbs;
            rectF.right -= fAbs;
        }

        @Override // pe.h
        public final boolean c(j jVar) {
            return jVar.f92663c > jVar.f92665e;
        }
    }
}
