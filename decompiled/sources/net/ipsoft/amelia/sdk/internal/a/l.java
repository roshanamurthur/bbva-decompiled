package net.ipsoft.amelia.sdk.internal.a;

import java.util.Iterator;
import java.util.Map;
import okhttp3.WebSocket;

/* JADX INFO: loaded from: classes12.dex */
public final class l implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ boolean f84664p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ e f84665q0;

    public l(e eVar, boolean z10) {
        this.f84665q0 = eVar;
        this.f84664p0 = z10;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x007d A[LOOP:1: B:20:0x0077->B:22:0x007d, LOOP_END] */
    @Override // java.lang.Runnable
    public final void run() {
        Iterator it;
        if (this.f84664p0) {
            int i10 = e.d.f84636a[this.f84665q0.f84626p.ordinal()];
            if (i10 == 1) {
                e eVar = this.f84665q0;
                eVar.f84618g = null;
                eVar.f84620i = null;
            } else if (i10 == 2) {
                WebSocket webSocket = this.f84665q0.f84618g;
                if (webSocket != null) {
                    webSocket.close(1000, null);
                }
                e eVar2 = this.f84665q0;
                eVar2.f84626p = e.f.pendingReconnect;
                eVar2.m.postDelayed(eVar2.f84629s, eVar2.f84625o.f84833h);
                Iterator it2 = this.f84665q0.f84617f.entrySet().iterator();
                while (it2.hasNext()) {
                    this.f84665q0.f84623l.c((net.ipsoft.amelia.sdk.internal.common.f) ((Map.Entry) it2.next()).getValue());
                }
            }
            it = this.f84665q0.f84628r.iterator();
            while (it.hasNext()) {
                ((e.InterfaceC0471e) it.next()).a();
            }
        }
        e eVar3 = this.f84665q0;
        eVar3.f84618g = null;
        eVar3.f84620i = null;
        this.f84665q0.f84626p = e.f.idle;
        it = this.f84665q0.f84628r.iterator();
        while (it.hasNext()) {
            ((e.InterfaceC0471e) it.next()).a();
        }
    }
}
