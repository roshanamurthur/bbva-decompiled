package com.google.android.play.integrity.internal;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class z implements ac {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f46400c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile ac f46401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f46402b;

    public static ac b(ac acVar) {
        acVar.getClass();
        if (acVar instanceof z) {
            return acVar;
        }
        z zVar = new z();
        zVar.f46402b = f46400c;
        zVar.f46401a = acVar;
        return zVar;
    }

    @Override // com.google.android.play.integrity.internal.ac
    public final Object a() {
        Object objA = this.f46402b;
        Object obj = f46400c;
        if (objA == obj) {
            synchronized (this) {
                try {
                    objA = this.f46402b;
                    if (objA == obj) {
                        objA = this.f46401a.a();
                        Object obj2 = this.f46402b;
                        if (obj2 != obj && obj2 != objA) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj2 + " & " + objA + ". This is likely due to a circular dependency.");
                        }
                        this.f46402b = objA;
                        this.f46401a = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return objA;
    }
}
