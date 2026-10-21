package net.ipsoft.amelia.sdk.internal.a;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.JsonReader;
import android.util.JsonWriter;
import androidx.webkit.ProxyConfig;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import mx.openpay.library.data.util.CommandConstants;
import net.ipsoft.amelia.sdk.FormInputData;
import net.ipsoft.amelia.sdk.internal.b.n;
import net.ipsoft.amelia.sdk.internal.common.ALog;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okio.ByteString;

/* JADX INFO: loaded from: classes12.dex */
public class e implements net.ipsoft.amelia.sdk.internal.a.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f84612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f84613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f84614c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f84615d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public WebSocket f84618g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile String f84620i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f84621j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f84622k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public net.ipsoft.amelia.sdk.internal.a.f.a f84623l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final n f84624n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final net.ipsoft.amelia.sdk.internal.common.b f84625o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public n.a f84627q;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final net.ipsoft.amelia.sdk.internal.c.f f84619h = new net.ipsoft.amelia.sdk.internal.c.f();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public f f84626p = f.idle;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final a f84629s = new a();
    public final Handler m = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap f84617f = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f84616e = new ArrayList();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ArrayList f84628r = new ArrayList();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            e eVar = e.this;
            eVar.f84626p = f.checkingHttpSession;
            eVar.f84627q = eVar.f84624n.a(new net.ipsoft.amelia.sdk.internal.b.d(eVar.f84620i), new i(eVar));
        }
    }

    public class b implements InterfaceC0471e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ net.ipsoft.amelia.sdk.internal.common.d f84631a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f84632b;

        public b(net.ipsoft.amelia.sdk.internal.common.d dVar, String str) {
            this.f84631a = dVar;
            this.f84632b = str;
        }

        @Override // net.ipsoft.amelia.sdk.internal.a.e.InterfaceC0471e
        public final void a() {
            net.ipsoft.amelia.sdk.internal.common.d dVar = this.f84631a;
            String str = this.f84632b;
            e eVar = e.this;
            eVar.g(dVar, str);
            eVar.f84628r.remove(this);
        }
    }

    public static /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f84636a;

        static {
            int[] iArr = new int[f.values().length];
            f84636a = iArr;
            try {
                iArr[f.wsClosing.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f84636a[f.wsCreated.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f84636a[f.idle.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f84636a[f.checkingHttpSession.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f84636a[f.pendingReconnect.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: renamed from: net.ipsoft.amelia.sdk.internal.a.e$e, reason: collision with other inner class name */
    public interface InterfaceC0471e {
        void a();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class f {
        private static final /* synthetic */ f[] $VALUES;
        public static final f checkingHttpSession;
        public static final f idle;
        public static final f pendingReconnect;
        public static final f wsClosing;
        public static final f wsCreated;

        static {
            f fVar = new f("idle", 0);
            idle = fVar;
            f fVar2 = new f("wsCreated", 1);
            wsCreated = fVar2;
            f fVar3 = new f("pendingReconnect", 2);
            pendingReconnect = fVar3;
            f fVar4 = new f("checkingHttpSession", 3);
            checkingHttpSession = fVar4;
            f fVar5 = new f("wsClosing", 4);
            wsClosing = fVar5;
            $VALUES = new f[]{fVar, fVar2, fVar3, fVar4, fVar5};
        }

        public f() {
            throw null;
        }

        public static f valueOf(String str) {
            return (f) Enum.valueOf(f.class, str);
        }

        public static f[] values() {
            return (f[]) $VALUES.clone();
        }
    }

    public e(n nVar, net.ipsoft.amelia.sdk.internal.common.b bVar) {
        this.f84624n = nVar;
        this.f84625o = bVar;
    }

    public static void b(e eVar, String str) {
        if (eVar.f84622k) {
            net.ipsoft.amelia.sdk.internal.c.b bVarA = new net.ipsoft.amelia.sdk.internal.c.b.a().a("SUBSCRIBE").a(net.ipsoft.amelia.sdk.internal.c.c.c(eVar.f84612a)).a(net.ipsoft.amelia.sdk.internal.c.c.d("/topic/escalation." + str)).a(net.ipsoft.amelia.sdk.internal.c.c.i(eVar.f84613b)).a(new net.ipsoft.amelia.sdk.internal.c.c("X-CSRF-TOKEN", eVar.f84620i)).a();
            net.ipsoft.amelia.sdk.internal.c.b bVarA2 = new net.ipsoft.amelia.sdk.internal.c.b.a().a("SUBSCRIBE").a(net.ipsoft.amelia.sdk.internal.c.c.c(eVar.f84614c)).a(net.ipsoft.amelia.sdk.internal.c.c.d("/topic/join-conversation-request." + str)).a(net.ipsoft.amelia.sdk.internal.c.c.i(eVar.f84615d)).a(new net.ipsoft.amelia.sdk.internal.c.c("X-CSRF-TOKEN", eVar.f84620i)).a();
            try {
                String strA = eVar.f84619h.a(bVarA);
                String strA2 = eVar.f84619h.a(bVarA2);
                eVar.f84618g.send(strA);
                eVar.f84618g.send(strA2);
            } catch (net.ipsoft.amelia.sdk.internal.c.a e5) {
                e5.printStackTrace();
            }
        }
        Iterator it = eVar.f84617f.entrySet().iterator();
        while (it.hasNext()) {
            eVar.i((net.ipsoft.amelia.sdk.internal.common.f) ((Map.Entry) it.next()).getValue());
        }
    }

    public static void c(e eVar, String str, net.ipsoft.amelia.sdk.internal.c.b bVar) {
        String str2;
        eVar.getClass();
        net.ipsoft.amelia.sdk.internal.c.c cVarA = bVar.a("X-Amelia-Message-Type");
        net.ipsoft.amelia.sdk.internal.c.c cVarA2 = bVar.a("X-Amelia-Conversation-Id");
        if (cVarA == null || (str2 = cVarA.f84808n) == null) {
            str2 = "";
        }
        String str3 = str2;
        net.ipsoft.amelia.sdk.internal.common.f fVar = cVarA2 != null ? (net.ipsoft.amelia.sdk.internal.common.f) eVar.f84617f.get(cVarA2.f84808n) : null;
        String strReplace = bVar.f84788c;
        if (str3.equals("OutboundFormInputMessage")) {
            strReplace = strReplace.replace("\"{", "{").replace("}\"", "}").replace("\\\"", "\"");
        }
        net.ipsoft.amelia.sdk.internal.a.d dVar = new net.ipsoft.amelia.sdk.internal.a.d(new JsonReader(new BufferedReader(new StringReader(strReplace))));
        ALog.d(ALog.TAG_AMELIA, "Amelia says: " + dVar.getMessageText());
        for (net.ipsoft.amelia.sdk.internal.c.c cVar : bVar.f84787b) {
            dVar.a(cVar.m, cVar.f84808n);
        }
        eVar.m.post(new m(eVar, str3, bVar, fVar, str, dVar));
    }

    public static void f(e eVar, String str) {
        Iterator it = eVar.f84617f.entrySet().iterator();
        while (it.hasNext()) {
            net.ipsoft.amelia.sdk.internal.common.f fVar = (net.ipsoft.amelia.sdk.internal.common.f) ((Map.Entry) it.next()).getValue();
            if (("subscribe-" + fVar.b()).equals(str)) {
                eVar.m.post(new k(eVar, fVar));
                if (!fVar.c()) {
                    if (fVar.isExistingConversation()) {
                        eVar.a(fVar, "InboundReplayConversationMessage");
                    } else {
                        eVar.a(fVar, "InboundStartConversationMessage");
                    }
                    ALog.d(ALog.TAG_AMELIA, "First successful web socket connection established, after a few attempts for conversation " + fVar.getConversationId());
                }
                ALog.d(ALog.TAG_AMELIA, "reconnect success");
                return;
            }
        }
    }

    public static void h(e eVar, String str) {
        Iterator it = eVar.f84617f.entrySet().iterator();
        while (it.hasNext()) {
            net.ipsoft.amelia.sdk.internal.common.f fVar = (net.ipsoft.amelia.sdk.internal.common.f) ((Map.Entry) it.next()).getValue();
            if (("subscribe-" + fVar.b()).equals(str)) {
                eVar.m.post(new j(eVar, fVar));
                if (fVar.isExistingConversation()) {
                    eVar.a(fVar, "InboundReplayConversationMessage");
                    return;
                } else {
                    eVar.a(fVar, "InboundStartConversationMessage");
                    return;
                }
            }
        }
    }

    @Override // net.ipsoft.amelia.sdk.internal.a.f
    public void a() {
        this.f84626p = f.wsClosing;
        this.m.removeCallbacks(this.f84629s);
        if (this.f84618g.close(1000, null)) {
            return;
        }
        this.f84618g = null;
        Iterator it = this.f84628r.iterator();
        while (it.hasNext()) {
            ((InterfaceC0471e) it.next()).a();
        }
    }

    public final void d(net.ipsoft.amelia.sdk.internal.common.f fVar, net.ipsoft.amelia.sdk.internal.a.a aVar, String str) {
        this.f84623l.a(fVar, str);
        try {
            StringWriter stringWriter = new StringWriter();
            JsonWriter jsonWriter = new JsonWriter(new BufferedWriter(stringWriter));
            aVar.a(jsonWriter);
            jsonWriter.close();
            String string = stringWriter.toString();
            try {
                this.f84618g.send(this.f84619h.a(new net.ipsoft.amelia.sdk.internal.c.b.a().a("SEND").a(new net.ipsoft.amelia.sdk.internal.c.c("X-Amelia-Session-Id", fVar.b())).a(new net.ipsoft.amelia.sdk.internal.c.c("X-Amelia-Conversation-Id", fVar.getConversationId())).a(new net.ipsoft.amelia.sdk.internal.c.c("X-Amelia-Message-Type", str)).a(new net.ipsoft.amelia.sdk.internal.c.c("X-Amelia-Timestamp", String.valueOf(System.currentTimeMillis()))).a(net.ipsoft.amelia.sdk.internal.c.c.d("/amelia/session.in")).a(net.ipsoft.amelia.sdk.internal.c.c.a(string.getBytes(Charset.forName("UTF-8")).length)).b(string).a()));
            } catch (net.ipsoft.amelia.sdk.internal.c.a e5) {
                e5.printStackTrace();
            }
        } catch (IOException e7) {
            e7.printStackTrace();
        }
    }

    public final void e(boolean z10) {
        net.ipsoft.amelia.sdk.internal.common.b bVar = this.f84625o;
        Uri uri = Uri.parse(bVar.f84826a);
        String string = uri.buildUpon().scheme(ProxyConfig.MATCH_HTTPS.equals(uri.getScheme()) ? "wss" : "ws").build().toString();
        Request requestBuild = new Request.Builder().url(string + "/Amelia/api/sock/websocket").build();
        c cVar = new c(z10);
        boolean z11 = bVar.f84831f;
        n nVar = this.f84624n;
        this.f84618g = (z11 ? nVar.b() : nVar.d()).newWebSocket(requestBuild, cVar);
        this.f84626p = f.wsCreated;
    }

    public final void g(net.ipsoft.amelia.sdk.internal.common.d dVar, String str) {
        this.f84617f.clear();
        this.f84621j = dVar.getUserId();
        this.f84622k = dVar.isAgent();
        this.f84620i = str;
        this.f84612a = "escalation-sub-agent-" + UUID.randomUUID().toString();
        this.f84613b = "escalation-receipt-" + UUID.randomUUID().toString();
        this.f84614c = "join-conversation-sub-agent-" + UUID.randomUUID().toString();
        this.f84615d = "join-conversation-receipt-" + UUID.randomUUID().toString();
        e(false);
    }

    public final void i(net.ipsoft.amelia.sdk.internal.common.f fVar) {
        String str = "subscribe-" + fVar.b();
        String string = UUID.randomUUID().toString();
        this.f84616e.add(string);
        try {
            this.f84618g.send(this.f84619h.a(new net.ipsoft.amelia.sdk.internal.c.b.a().a("SUBSCRIBE").a(net.ipsoft.amelia.sdk.internal.c.c.c(string)).a(net.ipsoft.amelia.sdk.internal.c.c.d("/queue/session." + fVar.b())).a(net.ipsoft.amelia.sdk.internal.c.c.i(str)).a(new net.ipsoft.amelia.sdk.internal.c.c("X-CSRF-TOKEN", this.f84620i)).a()));
        } catch (net.ipsoft.amelia.sdk.internal.c.a e5) {
            e5.printStackTrace();
        }
    }

    @Override // net.ipsoft.amelia.sdk.internal.a.f
    public void a(net.ipsoft.amelia.sdk.internal.a.f.a aVar) {
        this.f84623l = aVar;
    }

    @Override // net.ipsoft.amelia.sdk.internal.a.f
    public synchronized void a(net.ipsoft.amelia.sdk.internal.common.d dVar, String str) {
        try {
            if (this.f84618g != null) {
                ALog.d(ALog.TAG_AMELIA, "web socket re-init");
                this.f84628r.add(new b(dVar, str));
                a();
            } else {
                ALog.d(ALog.TAG_AMELIA, "Initializing web socket");
                g(dVar, str);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // net.ipsoft.amelia.sdk.internal.a.f
    public void b(net.ipsoft.amelia.sdk.internal.common.f fVar) {
        this.f84617f.remove(fVar.getConversationId());
        int i10 = d.f84636a[this.f84626p.ordinal()];
        if (i10 == 2) {
            a(fVar, "InboundConversationClosedMessage");
            return;
        }
        if (i10 == 4) {
            this.f84627q.a();
        } else if (i10 != 5) {
            return;
        }
        this.f84623l.d(fVar);
    }

    public class c extends WebSocketListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f84634a;

        public c(boolean z10) {
            this.f84634a = z10;
        }

        @Override // okhttp3.WebSocketListener
        public final void onClosed(WebSocket webSocket, int i10, String str) {
            ALog.d(ALog.TAG_AMELIA, "onClosed: " + str);
            e eVar = e.this;
            eVar.m.post(new l(eVar, false));
        }

        @Override // okhttp3.WebSocketListener
        public final void onClosing(WebSocket webSocket, int i10, String str) {
            ALog.d(ALog.TAG_AMELIA, "onClosing: " + str);
            e eVar = e.this;
            eVar.getClass();
            net.ipsoft.amelia.sdk.internal.c.b bVarA = new net.ipsoft.amelia.sdk.internal.c.b.a().a("UNSUBSCRIBE").a(net.ipsoft.amelia.sdk.internal.c.c.c(eVar.f84612a)).a();
            net.ipsoft.amelia.sdk.internal.c.b bVarA2 = new net.ipsoft.amelia.sdk.internal.c.b.a().a("UNSUBSCRIBE").a(net.ipsoft.amelia.sdk.internal.c.c.c(eVar.f84614c)).a();
            try {
                boolean z10 = eVar.f84622k;
                net.ipsoft.amelia.sdk.internal.c.f fVar = eVar.f84619h;
                if (z10) {
                    eVar.f84618g.send(fVar.a(bVarA2));
                    eVar.f84618g.send(fVar.a(bVarA));
                }
                ArrayList arrayList = eVar.f84616e;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    eVar.f84618g.send(fVar.a(new net.ipsoft.amelia.sdk.internal.c.b.a().a("UNSUBSCRIBE").a(net.ipsoft.amelia.sdk.internal.c.c.c((String) it.next())).a()));
                }
                arrayList.clear();
            } catch (net.ipsoft.amelia.sdk.internal.c.a e5) {
                e5.printStackTrace();
            }
        }

        @Override // okhttp3.WebSocketListener
        public final void onFailure(WebSocket webSocket, Throwable th2, Response response) {
            ALog.d(ALog.TAG_AMELIA, "onFailure");
            th2.printStackTrace();
            e eVar = e.this;
            eVar.m.post(new l(eVar, true));
        }

        /* JADX WARN: Code duplicated, block: B:26:0x0066  */
        @Override // okhttp3.WebSocketListener
        public final void onMessage(WebSocket webSocket, String str) {
            byte b10;
            net.ipsoft.amelia.sdk.internal.c.c cVarA;
            e eVar = e.this;
            ALog.d(ALog.TAG_AMELIA, "onMessage:\n" + str);
            try {
                net.ipsoft.amelia.sdk.internal.c.e eVarA = eVar.f84619h.a(str);
                if (eVarA instanceof net.ipsoft.amelia.sdk.internal.c.d) {
                    ALog.d(ALog.TAG_AMELIA, "stomp heart beat");
                    return;
                }
                net.ipsoft.amelia.sdk.internal.c.b bVar = (net.ipsoft.amelia.sdk.internal.c.b) eVarA;
                String str2 = bVar.f84786a;
                int iHashCode = str2.hashCode();
                if (iHashCode != -2087582999) {
                    if (iHashCode != 1672907751) {
                        if (iHashCode == 1800273432 && str2.equals("RECEIPT")) {
                            b10 = 2;
                        } else {
                            b10 = -1;
                        }
                    } else if (str2.equals("MESSAGE")) {
                        b10 = 0;
                    } else {
                        b10 = -1;
                    }
                } else if (str2.equals("CONNECTED")) {
                    b10 = 1;
                } else {
                    b10 = -1;
                }
                if (b10 == 0) {
                    e.c(eVar, str, bVar);
                    return;
                }
                if (b10 == 1) {
                    e.b(eVar, eVar.f84621j);
                    return;
                }
                if (b10 == 2 && (cVarA = bVar.a(net.ipsoft.amelia.sdk.internal.c.c.f84806k)) != null) {
                    if (this.f84634a) {
                        e.f(eVar, cVarA.f84808n);
                    } else {
                        e.h(eVar, cVarA.f84808n);
                    }
                }
            } catch (IOException e5) {
                e = e5;
                e.printStackTrace();
            } catch (net.ipsoft.amelia.sdk.internal.c.a e7) {
                e = e7;
                e.printStackTrace();
            }
        }

        @Override // okhttp3.WebSocketListener
        public final void onOpen(WebSocket webSocket, Response response) {
            ALog.d(ALog.TAG_AMELIA, "onOpen");
            e eVar = e.this;
            eVar.getClass();
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(net.ipsoft.amelia.sdk.internal.c.c.a("1.1"));
            arrayList.add(new net.ipsoft.amelia.sdk.internal.c.c("X-CSRF-TOKEN", eVar.f84620i));
            try {
                eVar.f84618g.send(eVar.f84619h.a(new net.ipsoft.amelia.sdk.internal.c.b.a().a(CommandConstants.CONNECT).a(arrayList).a()));
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }

        @Override // okhttp3.WebSocketListener
        public final void onMessage(WebSocket webSocket, ByteString byteString) {
            ALog.d(ALog.TAG_AMELIA, "onMessage: <binary>");
        }
    }

    @Override // net.ipsoft.amelia.sdk.internal.a.f
    public synchronized void a(net.ipsoft.amelia.sdk.internal.common.f fVar) {
        ALog.d(ALog.TAG_AMELIA, "start conversation: " + fVar.b());
        this.f84617f.put(fVar.getConversationId(), fVar);
        if (this.f84626p == f.wsCreated) {
            i(fVar);
        }
    }

    @Override // net.ipsoft.amelia.sdk.internal.a.f
    public void a(net.ipsoft.amelia.sdk.internal.common.f fVar, String str) {
        d(fVar, new net.ipsoft.amelia.sdk.internal.a.a(), str);
    }

    @Override // net.ipsoft.amelia.sdk.internal.a.f
    public void b(net.ipsoft.amelia.sdk.internal.common.f fVar, String str, String str2) {
        net.ipsoft.amelia.sdk.internal.a.a aVar = new net.ipsoft.amelia.sdk.internal.a.a();
        aVar.a(str);
        aVar.a(true);
        d(fVar, aVar, str2);
    }

    @Override // net.ipsoft.amelia.sdk.internal.a.f
    public void a(net.ipsoft.amelia.sdk.internal.common.f fVar, String str, String str2) {
        net.ipsoft.amelia.sdk.internal.a.a aVar = new net.ipsoft.amelia.sdk.internal.a.a();
        aVar.a(str);
        d(fVar, aVar, str2);
    }

    @Override // net.ipsoft.amelia.sdk.internal.a.f
    public void a(net.ipsoft.amelia.sdk.internal.common.f fVar, String str, String str2, String str3) {
        net.ipsoft.amelia.sdk.internal.a.a aVar = new net.ipsoft.amelia.sdk.internal.a.a();
        aVar.a(str3);
        net.ipsoft.amelia.sdk.internal.a.b bVar = new net.ipsoft.amelia.sdk.internal.a.b();
        bVar.a(str);
        bVar.b(str2);
        aVar.a(bVar);
        d(fVar, aVar, "InboundBpnKickoffMessage");
    }

    @Override // net.ipsoft.amelia.sdk.internal.a.f
    public void a(net.ipsoft.amelia.sdk.internal.common.f fVar, String str, boolean z10) {
        if (z10) {
            b(fVar, str, "InboundUserUtteranceMessage");
        } else {
            a(fVar, str, "InboundUserUtteranceMessage");
        }
    }

    @Override // net.ipsoft.amelia.sdk.internal.a.f
    public void a(net.ipsoft.amelia.sdk.internal.common.f fVar, Map<String, String> map) {
        net.ipsoft.amelia.sdk.internal.a.a aVar = new net.ipsoft.amelia.sdk.internal.a.a();
        aVar.a(new net.ipsoft.amelia.sdk.internal.a.c(map));
        d(fVar, aVar, "InboundSetCustomConversationAttributesMessage");
    }

    @Override // net.ipsoft.amelia.sdk.internal.a.f
    public void a(net.ipsoft.amelia.sdk.internal.common.f fVar, FormInputData formInputData, String str) {
        net.ipsoft.amelia.sdk.internal.a.a aVar = new net.ipsoft.amelia.sdk.internal.a.a();
        aVar.a(str);
        net.ipsoft.amelia.sdk.internal.a.b bVar = new net.ipsoft.amelia.sdk.internal.a.b();
        bVar.a(formInputData);
        aVar.a(bVar);
        d(fVar, aVar, "InboundUserUtteranceMessage");
    }

    @Override // net.ipsoft.amelia.sdk.internal.a.f
    public void a(net.ipsoft.amelia.sdk.internal.common.f fVar, boolean z10) {
        net.ipsoft.amelia.sdk.internal.a.a aVar = new net.ipsoft.amelia.sdk.internal.a.a();
        aVar.a(z10 ? "The files were successfully uploaded" : "File upload canceled");
        net.ipsoft.amelia.sdk.internal.a.b bVar = new net.ipsoft.amelia.sdk.internal.a.b();
        bVar.c(z10 ? "SUBMIT" : "CANCEL");
        aVar.a(bVar);
        d(fVar, aVar, "InboundRequestConfirmMessage");
    }
}
