package com.facetec.sdk;

import android.content.Context;
import android.os.Process;
import com.bbva.library.digipassmanager.constants.DigipassManagerConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes9.dex */
final class n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static kl f42646d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Semaphore f42647b = new Semaphore(1);

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(t.b bVar, Context context, String str, ArrayList arrayList) throws Throwable {
        if (bVar != t.b.USER_CANCELLED) {
            Process.setThreadPriority(19);
        }
        t.b(context, str, arrayList, "", s.FACE_SCAN, "");
        this.f42647b.release();
    }

    private void e(final Context context) {
        if (bg.d()) {
            try {
                final an anVarG = ag.d(context).booleanValue() ? ag.f40232c : ag.g();
                this.f42647b.acquire();
                cx.b(new Runnable() { // from class: com.facetec.sdk.y7
                    @Override // java.lang.Runnable
                    public final void run() throws Throwable {
                        this.f43003p0.a(context, anVarG);
                    }
                });
            } catch (am e5) {
                e5.printStackTrace();
            } catch (InterruptedException e7) {
                k.c(e7);
            }
        }
    }

    private static kl a() {
        kl.d dVar = new kl.d();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        dVar.f42105x = kz.b("timeout", timeUnit);
        dVar.f42107z = kz.b("timeout", timeUnit);
        dVar.C = kz.b("timeout", timeUnit);
        return dVar.d();
    }

    private static synchronized kl b() {
        try {
            if (f42646d == null) {
                f42646d = a();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f42646d;
    }

    private static ArrayList<String> c(t.b bVar, boolean z10) throws Throwable {
        boolean zO = ch.o();
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(ak.f40277a);
        cj cjVarH = cj.ZOOM_FAR;
        if (z10) {
            cjVarH = ch.h();
        }
        if (cjVarH == cj.PROCESSING_COMPLETE_SUCCESS) {
            arrayList.add(ak.f40287d);
        } else if (cjVarH == cj.PROCESSING_COMPLETE_RETRY) {
            arrayList.add(ak.f40285b);
        } else if (bVar == t.b.USER_CANCELLED) {
            arrayList.add(ak.f40288e);
            arrayList.add(t.f42834e);
        } else if (bVar == t.b.SESSION_CONTEXT_SWITCH) {
            arrayList.add(ak.f40292i);
            arrayList.add(t.f42834e);
        } else if (bVar == t.b.PRE_SESSION_PHASE_1_TIMEOUT) {
            arrayList.add(ak.f40299q);
            arrayList.add(t.f42834e);
        } else if (bVar == t.b.PRE_SESSION_PHASE_2_TIMEOUT) {
            arrayList.add(ak.f40302t);
            arrayList.add(t.f42834e);
        } else if (bVar == t.b.SESSION_TIMEOUT) {
            arrayList.add(ak.f40291h);
            arrayList.add(t.f42834e);
        } else if (bVar == t.b.USER_WAS_SUCCESSFUL) {
            arrayList.add(ak.f40287d);
        } else {
            arrayList.add(ak.f40285b);
        }
        if (zO) {
            arrayList.add(ak.f40290g);
        } else {
            arrayList.add(ak.f40289f);
        }
        return arrayList;
    }

    public final synchronized void b(Context context, FaceTecSessionResult faceTecSessionResult, String str) {
        try {
            eh ehVar = new eh();
            ehVar.a("faceScan", faceTecSessionResult.getFaceScanBase64());
            ehVar.a("auditTrailImage", faceTecSessionResult.getAuditTrailCompressedBase64()[0]);
            ehVar.a("lowQualityAuditTrailImage", faceTecSessionResult.getLowQualityAuditTrailCompressedBase64()[0]);
            if (t.b()) {
                b().c(new kr.a().e("https://api.facetec.com/api/v3.1/biometrics/liveness-3d").c(DigipassManagerConstants.KEY_CONTENT_TYPE, "application/json").c("X-Device-Key", str).c("User-Agent", FaceTecSDK.createFaceTecAPIUserAgentString(faceTecSessionResult.getSessionId())).c("X-User-Agent", FaceTecSDK.createFaceTecAPIUserAgentString(faceTecSessionResult.getSessionId())).c(kp.a(kn.e("application/json; charset=utf-8"), ehVar.toString())).e()).e(new jy() { // from class: com.facetec.sdk.n.1
                    @Override // com.facetec.sdk.jy
                    public final void a() {
                    }

                    @Override // com.facetec.sdk.jy
                    public final void e(kq kqVar) {
                    }
                });
            }
            e(context);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void d() {
        Semaphore semaphore = this.f42647b;
        if (semaphore != null) {
            try {
                if (semaphore.tryAcquire(5L, TimeUnit.SECONDS)) {
                    this.f42647b.release();
                }
            } catch (InterruptedException e5) {
                e5.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Context context, an anVar) throws Throwable {
        Process.setThreadPriority(19);
        t.b((be) context, anVar, true, bj.c.FRONT, cc.f40802c);
        this.f42647b.release();
    }

    public final synchronized void e(final Context context, final t.b bVar, final String str, final boolean z10) {
        try {
            t.d(context, bVar);
            final ArrayList<String> arrayListC = c(bVar, false);
            if (bVar != t.b.USER_WAS_SUCCESSFUL) {
                Iterator<String> it = arrayListC.iterator();
                while (it.hasNext()) {
                    ch.A(it.next());
                }
            }
            if (t.b()) {
                try {
                    this.f42647b.acquire();
                    cx.b(new Runnable() { // from class: com.facetec.sdk.x7
                        @Override // java.lang.Runnable
                        public final void run() throws Throwable {
                            this.f42970p0.a(bVar, z10, context, null, arrayListC, str);
                        }
                    });
                } catch (InterruptedException e5) {
                    k.c(e5);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void a(Context context, t.b bVar) {
        try {
            t.d(context, bVar);
            ArrayList<String> arrayListC = c(bVar, true);
            if (bVar != t.b.USER_WAS_SUCCESSFUL) {
                Iterator<String> it = arrayListC.iterator();
                while (it.hasNext()) {
                    ch.A(it.next());
                }
            }
            if (t.b()) {
                try {
                    this.f42647b.acquire();
                    cx.b(new t4(this, bVar, context, arrayListC));
                } catch (InterruptedException e5) {
                    k.c(e5);
                }
            }
            e(context);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(t.b bVar, boolean z10, Context context, String str, ArrayList arrayList, String str2) throws Throwable {
        if (bVar != t.b.USER_CANCELLED) {
            Process.setThreadPriority(19);
        }
        t.b(context, str, arrayList, "", z10 ? s.ID_SCAN_ONLY : s.ID_SCAN_MATCH, str2);
        this.f42647b.release();
    }
}
