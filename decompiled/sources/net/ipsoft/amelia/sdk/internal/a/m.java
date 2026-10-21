package net.ipsoft.amelia.sdk.internal.a;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes12.dex */
public final class m implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ String f84666p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ net.ipsoft.amelia.sdk.internal.c.b f84667q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ net.ipsoft.amelia.sdk.internal.common.f f84668r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ String f84669s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ d f84670t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final /* synthetic */ e f84671u0;

    public m(e eVar, String str, net.ipsoft.amelia.sdk.internal.c.b bVar, net.ipsoft.amelia.sdk.internal.common.f fVar, String str2, d dVar) {
        this.f84671u0 = eVar;
        this.f84666p0 = str;
        this.f84667q0 = bVar;
        this.f84668r0 = fVar;
        this.f84669s0 = str2;
        this.f84670t0 = dVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // java.lang.Runnable
    public final void run() {
        String str = this.f84666p0;
        str.getClass();
        byte b10 = -1;
        switch (str.hashCode()) {
            case -1689016312:
                if (str.equals("OutboundConversationClosedMessage")) {
                    b10 = 0;
                }
                break;
            case -799280843:
                if (str.equals("OutboundSessionClosedMessage")) {
                    b10 = 1;
                }
                break;
            case 422356447:
                if (str.equals("OutboundAmeliaReadyMessage")) {
                    b10 = 2;
                }
                break;
            case 527800049:
                if (str.equals("OutboundFormInputMessage")) {
                    b10 = 3;
                }
                break;
            case 1300620522:
                if (str.equals("OutboundTextMessage")) {
                    b10 = 4;
                }
                break;
        }
        e eVar = this.f84671u0;
        net.ipsoft.amelia.sdk.internal.common.f fVar = this.f84668r0;
        if (b10 == 0 || b10 == 1) {
            String str2 = this.f84667q0.a(net.ipsoft.amelia.sdk.internal.c.c.f84802g).f84808n;
            eVar.getClass();
            try {
                eVar.f84618g.send(eVar.f84619h.a(new net.ipsoft.amelia.sdk.internal.c.b.a().a("UNSUBSCRIBE").a(net.ipsoft.amelia.sdk.internal.c.c.c(str2)).a()));
                eVar.f84616e.remove(str2);
            } catch (net.ipsoft.amelia.sdk.internal.c.a e5) {
                e5.printStackTrace();
            }
            if (fVar != null) {
                eVar.f84623l.d(fVar);
            }
        } else if ((b10 == 2 || b10 == 3 || b10 == 4) && fVar != null && !fVar.c()) {
            fVar.e(true);
        }
        if (fVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        eVar.f84623l.a(fVar, this.f84669s0, this.f84670t0);
    }
}
