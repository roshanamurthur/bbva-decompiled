package net.ipsoft.amelia.sdk.internal.a;

import net.ipsoft.amelia.sdk.IAmeliaError;
import net.ipsoft.amelia.sdk.internal.common.ALog;

/* JADX INFO: loaded from: classes12.dex */
public final class i extends net.ipsoft.amelia.sdk.internal.b.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ e f84659i;

    public i(e eVar) {
        this.f84659i = eVar;
    }

    @Override // net.ipsoft.amelia.sdk.internal.b.o
    public final void a() {
        if (this.f84765g) {
            return;
        }
        net.ipsoft.amelia.sdk.internal.b.l lVar = this.f84764f;
        e eVar = this.f84659i;
        if (lVar != null) {
            eVar.f84626p = e.f.pendingReconnect;
            eVar.m.postDelayed(eVar.f84629s, eVar.f84625o.f84833h);
        } else if (b()) {
            ALog.d(ALog.TAG_AMELIA, "continue rejoin");
            eVar.e(true);
        } else {
            net.ipsoft.amelia.sdk.internal.common.c cVar = new net.ipsoft.amelia.sdk.internal.common.c(IAmeliaError.Code.invalidSession, "Reconnect Failed");
            eVar.f84626p = e.f.idle;
            eVar.f84623l.a(cVar);
        }
    }
}
