package com.facetec.sdk;

import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public final class fo extends eo<Object> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final el f41621c = new el() { // from class: com.facetec.sdk.fo.5
        @Override // com.facetec.sdk.el
        public final <T> eo<T> c(dv dvVar, fy<T> fyVar) {
            if (fyVar.d() == Object.class) {
                return new fo(dvVar);
            }
            return null;
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final dv f41622a;

    /* JADX INFO: renamed from: com.facetec.sdk.fo$4, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass4 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final /* synthetic */ int[] f41623d;

        static {
            int[] iArr = new int[gb.values().length];
            f41623d = iArr;
            try {
                iArr[gb.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f41623d[gb.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f41623d[gb.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f41623d[gb.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f41623d[gb.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f41623d[gb.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public fo(dv dvVar) {
        this.f41622a = dvVar;
    }

    @Override // com.facetec.sdk.eo
    public final Object a(fz fzVar) throws Throwable {
        switch (AnonymousClass4.f41623d[fzVar.j().ordinal()]) {
            case 1:
                ArrayList arrayList = new ArrayList();
                fzVar.a();
                while (fzVar.c()) {
                    arrayList.add(a(fzVar));
                }
                fzVar.b();
                return arrayList;
            case 2:
                fd fdVar = new fd();
                fzVar.d();
                while (fzVar.c()) {
                    fdVar.put(fzVar.i(), a(fzVar));
                }
                fzVar.e();
                return fdVar;
            case 3:
                return fzVar.f();
            case 4:
                return Double.valueOf(fzVar.l());
            case 5:
                return Boolean.valueOf(fzVar.g());
            case 6:
                fzVar.m();
                return null;
            default:
                throw new IllegalStateException();
        }
    }

    @Override // com.facetec.sdk.eo
    public final void b(ga gaVar, Object obj) throws IOException {
        if (obj == null) {
            gaVar.g();
            return;
        }
        eo eoVarE = this.f41622a.e((Class) obj.getClass());
        if (!(eoVarE instanceof fo)) {
            eoVarE.b(gaVar, obj);
        } else {
            gaVar.a();
            gaVar.b();
        }
    }
}
