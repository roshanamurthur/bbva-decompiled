package com.facetec.sdk;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public final class cb extends eo implements gj {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private gf f40798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private gk f40799c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private dv f40800e;

    public cb(dv dvVar, gk gkVar, gf gfVar) {
        this.f40800e = dvVar;
        this.f40799c = gkVar;
        this.f40798b = gfVar;
    }

    @Override // com.facetec.sdk.eo
    public final Object a(fz fzVar) throws Throwable {
        if (fzVar.j() == gb.NULL) {
            fzVar.o();
            return null;
        }
        m mVar = new m();
        dv dvVar = this.f40800e;
        gk gkVar = this.f40799c;
        fzVar.d();
        while (fzVar.c()) {
            int iB = gkVar.b(fzVar);
            boolean z10 = fzVar.j() != gb.NULL;
            if (iB != 0) {
                if (iB != 10) {
                    switch (iB) {
                        case 2:
                            if (!z10) {
                                mVar.f42384b = null;
                            } else {
                                mVar.f42384b = fzVar.j() != gb.BOOLEAN ? fzVar.f() : Boolean.toString(fzVar.g());
                            }
                            break;
                        case 3:
                            if (!z10) {
                                mVar.f42389h = null;
                            } else {
                                mVar.f42389h = fzVar.j() != gb.BOOLEAN ? fzVar.f() : Boolean.toString(fzVar.g());
                            }
                            break;
                        case 4:
                            if (!z10) {
                                mVar.f42383a = null;
                            } else {
                                mVar.f42383a = (s) dvVar.e(s.class).a(fzVar);
                            }
                            break;
                        case 5:
                            if (!z10) {
                                mVar.f42385c = null;
                            } else {
                                mVar.f42385c = fzVar.j() != gb.BOOLEAN ? fzVar.f() : Boolean.toString(fzVar.g());
                            }
                            break;
                        case 6:
                            if (!z10) {
                                mVar.f42387e = null;
                            } else {
                                mVar.f42387e = fzVar.j() != gb.BOOLEAN ? fzVar.f() : Boolean.toString(fzVar.g());
                            }
                            break;
                        case 7:
                            if (z10) {
                                try {
                                    mVar.f42390i = fzVar.n();
                                } catch (NumberFormatException e5) {
                                    throw new en(e5);
                                }
                            }
                            break;
                        case 8:
                            if (!z10) {
                                mVar.f42386d = null;
                            } else {
                                mVar.f42386d = (ArrayList) dvVar.b(new o()).a(fzVar);
                            }
                            break;
                        default:
                            fzVar.o();
                            continue;
                    }
                    fzVar.m();
                } else if (z10) {
                    mVar.f42391j = fzVar.j() != gb.BOOLEAN ? fzVar.f() : Boolean.toString(fzVar.g());
                } else {
                    mVar.f42391j = null;
                    fzVar.m();
                }
            } else if (z10) {
                mVar.f42388g = fzVar.j() != gb.BOOLEAN ? fzVar.f() : Boolean.toString(fzVar.g());
            } else {
                mVar.f42388g = null;
                fzVar.m();
            }
        }
        fzVar.e();
        return mVar;
    }

    @Override // com.facetec.sdk.eo
    public final void b(ga gaVar, Object obj) throws IOException {
        if (obj == null) {
            gaVar.g();
            return;
        }
        m mVar = (m) obj;
        dv dvVar = this.f40800e;
        gf gfVar = this.f40798b;
        gaVar.a();
        if (mVar != mVar.f42385c) {
            gfVar.b(gaVar, 4);
            gaVar.e(mVar.f42385c);
        }
        if (mVar != mVar.f42383a) {
            gfVar.b(gaVar, 9);
            s sVar = mVar.f42383a;
            Type typeA = ge.a(s.class, sVar);
            eo eoVarB = dvVar.b(fy.e(typeA));
            if (s.class != typeA && !ge.a(eoVarB)) {
                eo eoVarE = dvVar.e(s.class);
                if (ge.a(eoVarE)) {
                    eoVarB = eoVarE;
                }
            }
            eoVarB.b(gaVar, sVar);
        }
        if (mVar != mVar.f42386d) {
            gfVar.b(gaVar, 1);
            o oVar = new o();
            ArrayList<String> arrayList = mVar.f42386d;
            Type typeB = oVar.b();
            Type typeA2 = ge.a(typeB, arrayList);
            eo eoVarB2 = dvVar.b(fy.e(typeA2));
            if (typeB != typeA2 && !ge.a(eoVarB2)) {
                eo eoVarB3 = dvVar.b(oVar);
                if (ge.a(eoVarB3)) {
                    eoVarB2 = eoVarB3;
                }
            }
            eoVarB2.b(gaVar, arrayList);
        }
        if (mVar != mVar.f42384b) {
            gfVar.b(gaVar, 11);
            gaVar.e(mVar.f42384b);
        }
        if (mVar != mVar.f42387e) {
            gfVar.b(gaVar, 6);
            gaVar.e(mVar.f42387e);
        }
        if (mVar != mVar.f42389h) {
            gfVar.b(gaVar, 2);
            gaVar.e(mVar.f42389h);
        }
        if (mVar != mVar.f42391j) {
            gfVar.b(gaVar, 3);
            gaVar.e(mVar.f42391j);
        }
        if (mVar != mVar.f42388g) {
            gfVar.b(gaVar, 5);
            gaVar.e(mVar.f42388g);
        }
        gfVar.b(gaVar, 0);
        gaVar.a(Integer.valueOf(mVar.f42390i));
        gaVar.b();
    }
}
