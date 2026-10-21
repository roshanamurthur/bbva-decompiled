package qe;

import androidx.annotation.RequiresApi;

/* JADX INFO: compiled from: FadeModeEvaluators.java */
/* JADX INFO: loaded from: classes10.dex */
@RequiresApi(21)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f92819a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0483b f92820b = new C0483b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f92821c = new c();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f92822d = new d();

    /* JADX INFO: compiled from: FadeModeEvaluators.java */
    public class a implements qe.a {
        @Override // qe.a
        public final qe.c a(float f6, float f10, float f11) {
            return new qe.c(255, s.e(f10, 0, 255, f11, f6), true);
        }
    }

    /* JADX INFO: renamed from: qe.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: FadeModeEvaluators.java */
    public class C0483b implements qe.a {
        @Override // qe.a
        public final qe.c a(float f6, float f10, float f11) {
            return new qe.c(s.e(f10, 255, 0, f11, f6), 255, false);
        }
    }

    /* JADX INFO: compiled from: FadeModeEvaluators.java */
    public class c implements qe.a {
        @Override // qe.a
        public final qe.c a(float f6, float f10, float f11) {
            return new qe.c(s.e(f10, 255, 0, f11, f6), s.e(f10, 0, 255, f11, f6), false);
        }
    }

    /* JADX INFO: compiled from: FadeModeEvaluators.java */
    public class d implements qe.a {
        @Override // qe.a
        public final qe.c a(float f6, float f10, float f11) {
            float fA = androidx.datastore.preferences.protobuf.e.a(f11, f10, 0.35f, f10);
            return new qe.c(s.e(f10, 255, 0, fA, f6), s.e(fA, 0, 255, f11, f6), false);
        }
    }
}
