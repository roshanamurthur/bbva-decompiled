package com.facetec.sdk;

/* JADX INFO: loaded from: classes9.dex */
public final class fn implements el {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ev f41620e;

    public fn(ev evVar) {
        this.f41620e = evVar;
    }

    public static eo<?> b(ev evVar, dv dvVar, fy<?> fyVar, eq eqVar) {
        eo<?> fqVar;
        Object objC = evVar.e(fy.c(eqVar.e())).c();
        if (objC instanceof eo) {
            fqVar = (eo) objC;
        } else if (objC instanceof el) {
            fqVar = ((el) objC).c(dvVar, fyVar);
        } else {
            boolean z10 = objC instanceof ej;
            if (!z10 && !(objC instanceof ea)) {
                StringBuilder sb2 = new StringBuilder("Invalid attempt to bind an instance of ");
                sb2.append(objC.getClass().getName());
                sb2.append(" as a @JsonAdapter for ");
                sb2.append(fyVar.toString());
                sb2.append(". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
                throw new IllegalArgumentException(sb2.toString());
            }
            fqVar = new fq<>(z10 ? (ej) objC : null, objC instanceof ea ? (ea) objC : null, dvVar, fyVar);
        }
        return (fqVar == null || !eqVar.b()) ? fqVar : fqVar.b();
    }

    @Override // com.facetec.sdk.el
    public final <T> eo<T> c(dv dvVar, fy<T> fyVar) {
        eq eqVar = (eq) fyVar.d().getAnnotation(eq.class);
        if (eqVar == null) {
            return null;
        }
        return (eo<T>) b(this.f41620e, dvVar, fyVar, eqVar);
    }
}
