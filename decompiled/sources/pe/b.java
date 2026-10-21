package pe;

/* JADX INFO: compiled from: FadeModeEvaluators.java */
/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f92638a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0479b f92639b = new C0479b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f92640c = new c();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f92641d = new d();

    /* JADX INFO: compiled from: FadeModeEvaluators.java */
    public class a implements pe.a {
        @Override // pe.a
        public final pe.c a(float f6, float f10, float f11) {
            return new pe.c(255, p.e(f10, 0, 255, f11, f6), true);
        }
    }

    /* JADX INFO: renamed from: pe.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: FadeModeEvaluators.java */
    public class C0479b implements pe.a {
        @Override // pe.a
        public final pe.c a(float f6, float f10, float f11) {
            return new pe.c(p.e(f10, 255, 0, f11, f6), 255, false);
        }
    }

    /* JADX INFO: compiled from: FadeModeEvaluators.java */
    public class c implements pe.a {
        @Override // pe.a
        public final pe.c a(float f6, float f10, float f11) {
            return new pe.c(p.e(f10, 255, 0, f11, f6), p.e(f10, 0, 255, f11, f6), false);
        }
    }

    /* JADX INFO: compiled from: FadeModeEvaluators.java */
    public class d implements pe.a {
        @Override // pe.a
        public final pe.c a(float f6, float f10, float f11) {
            float fA = androidx.datastore.preferences.protobuf.e.a(f11, f10, 0.35f, f10);
            return new pe.c(p.e(f10, 255, 0, fA, f6), p.e(fA, 0, 255, f11, f6), false);
        }
    }
}
