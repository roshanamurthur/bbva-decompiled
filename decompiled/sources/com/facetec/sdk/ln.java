package com.facetec.sdk;

import com.bbva.library.digipassmanager.constants.DigipassManagerConstants;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class ln implements km {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ka f42341d;

    public ln(ka kaVar) {
        this.f42341d = kaVar;
    }

    @Override // com.facetec.sdk.km
    public final kq c(km.e eVar) throws IOException {
        boolean z10;
        kr krVarD = eVar.d();
        kr.a aVarB = krVarD.b();
        kp kpVarE = krVarD.e();
        if (kpVarE != null) {
            kn knVarB = kpVarE.b();
            if (knVarB != null) {
                aVarB.c(DigipassManagerConstants.KEY_CONTENT_TYPE, knVarB.toString());
            }
            long jD = kpVarE.d();
            if (jD != -1) {
                aVarB.c("Content-Length", Long.toString(jD));
                aVarB.c("Transfer-Encoding");
            } else {
                aVarB.c("Transfer-Encoding", "chunked");
                aVarB.c("Content-Length");
            }
        }
        if (krVarD.d("Host") == null) {
            aVarB.c("Host", kz.a(krVarD.a(), false));
        }
        if (krVarD.d("Connection") == null) {
            aVarB.c("Connection", "Keep-Alive");
        }
        if (krVarD.d("Accept-Encoding") == null && krVarD.d("Range") == null) {
            aVarB.c("Accept-Encoding", "gzip");
            z10 = true;
        } else {
            z10 = false;
        }
        ka kaVar = this.f42341d;
        krVarD.a();
        List<kc> listA = kaVar.a();
        if (!listA.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            int size = listA.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (i10 > 0) {
                    sb2.append("; ");
                }
                kc kcVar = listA.get(i10);
                sb2.append(kcVar.f41999b);
                sb2.append('=');
                sb2.append(kcVar.f42000e);
            }
            aVarB.c("Cookie", sb2.toString());
        }
        if (krVarD.d("User-Agent") == null) {
            aVarB.c("User-Agent", la.c());
        }
        kq kqVarB = eVar.b(aVarB.e());
        lp.e(this.f42341d, krVarD.a(), kqVarB.c());
        kq.d dVarA = kqVarB.j().a(krVarD);
        if (z10 && "gzip".equalsIgnoreCase(kqVarB.d("Content-Encoding")) && lp.d(kqVarB)) {
            np npVar = new np(kqVarB.a().b());
            dVarA.e(kqVarB.c().b().b("Content-Encoding").b("Content-Length").d());
            dVarA.c(new lw(kqVarB.d(DigipassManagerConstants.KEY_CONTENT_TYPE), -1L, no.c(npVar)));
        }
        return dVarA.c();
    }
}
