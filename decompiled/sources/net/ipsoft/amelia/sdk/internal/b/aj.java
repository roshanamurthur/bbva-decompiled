package net.ipsoft.amelia.sdk.internal.b;

import android.content.Context;
import android.webkit.CookieManager;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.ipsoft.amelia.sdk.BaseAuthSystem;
import net.ipsoft.amelia.sdk.BaseDomain;
import net.ipsoft.amelia.sdk.ConversationInfo;
import net.ipsoft.amelia.sdk.DomainSelectionMode;
import net.ipsoft.amelia.sdk.IAmeliaError;
import net.ipsoft.amelia.sdk.ISessionInfo;
import net.ipsoft.amelia.sdk.LoginOptions;
import net.ipsoft.amelia.sdk.internal.common.ALog;

/* JADX INFO: loaded from: classes12.dex */
public class aj {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final net.ipsoft.amelia.sdk.internal.common.b f84701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f84702c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f84703d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f84704e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList f84706g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Map<String, String> f84707h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Map<String, String> f84708i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final HashSet<net.ipsoft.amelia.sdk.internal.common.f> f84709j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final a f84711l;
    public LoginOptions m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public net.ipsoft.amelia.sdk.internal.common.d f84713o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f84700a = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public BaseDomain f84705f = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public e f84710k = e.inactive;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public d f84712n = d.none;

    public interface a {
        void a();

        void a(List<BaseAuthSystem> list);

        void a(ISessionInfo iSessionInfo);

        void a(net.ipsoft.amelia.sdk.internal.common.c cVar);

        void a(net.ipsoft.amelia.sdk.internal.common.d dVar, String str);

        void a(net.ipsoft.amelia.sdk.internal.common.f fVar);

        void b();

        void b(List<ConversationInfo> list);

        void b(net.ipsoft.amelia.sdk.internal.common.c cVar);

        void b(net.ipsoft.amelia.sdk.internal.common.f fVar);

        void c();

        void c(List<BaseDomain> list);

        void c(net.ipsoft.amelia.sdk.internal.common.c cVar);

        void d(net.ipsoft.amelia.sdk.internal.common.c cVar);

        void e(net.ipsoft.amelia.sdk.internal.common.c cVar);

        void f(net.ipsoft.amelia.sdk.internal.common.c cVar);

        void g(net.ipsoft.amelia.sdk.internal.common.c cVar);
    }

    public static /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f84715a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f84716b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f84717c;

        static {
            int[] iArr = new int[DomainSelectionMode.values().length];
            f84717c = iArr;
            try {
                iArr[DomainSelectionMode.automatic.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f84717c[DomainSelectionMode.manual.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f84717c[DomainSelectionMode.predefined.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[d.values().length];
            f84716b = iArr2;
            try {
                iArr2[d.logout.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f84716b[d.prepareLogin.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f84716b[d.login.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f84716b[d.newConversation.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[e.values().length];
            f84715a = iArr3;
            try {
                iArr3[e.loggedOut.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f84715a[e.loggedIn.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f84715a[e.inConversation.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f84715a[e.pendingEndConversation.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f84715a[e.pendingSessionInit.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f84715a[e.pendingAnonymousInit.ordinal()] = 6;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f84715a[e.pendingLoginInit.ordinal()] = 7;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f84715a[e.pendingUserInit.ordinal()] = 8;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f84715a[e.pendingSessionCheck.ordinal()] = 9;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f84715a[e.pendingAuthSystems.ordinal()] = 10;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f84715a[e.pendingLogin.ordinal()] = 11;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f84715a[e.pendingDomains.ordinal()] = 12;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f84715a[e.pendingConversationsRetrieval.ordinal()] = 13;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f84715a[e.pendingNewConversation.ordinal()] = 14;
            } catch (NoSuchFieldError unused21) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class d {
        private static final /* synthetic */ d[] $VALUES;
        public static final d login;
        public static final d logout;
        public static final d newConversation;
        public static final d none;
        public static final d prepareLogin;

        static {
            d dVar = new d("none", 0);
            none = dVar;
            d dVar2 = new d("logout", 1);
            logout = dVar2;
            d dVar3 = new d("prepareLogin", 2);
            prepareLogin = dVar3;
            d dVar4 = new d("login", 3);
            login = dVar4;
            d dVar5 = new d("newConversation", 4);
            newConversation = dVar5;
            $VALUES = new d[]{dVar, dVar2, dVar3, dVar4, dVar5};
        }

        public d() {
            throw null;
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class e {
        private static final /* synthetic */ e[] $VALUES;
        public static final e inConversation;
        public static final e inactive;
        public static final e loggedIn;
        public static final e loggedOut;
        public static final e pendingAnonymousInit;
        public static final e pendingAuthSystems;
        public static final e pendingConversationsRetrieval;
        public static final e pendingDomains;
        public static final e pendingEndConversation;
        public static final e pendingLogin;
        public static final e pendingLoginInit;
        public static final e pendingNewConversation;
        public static final e pendingSessionCheck;
        public static final e pendingSessionInit;
        public static final e pendingUserInit;

        static {
            e eVar = new e("inactive", 0);
            inactive = eVar;
            e eVar2 = new e("loggedOut", 1);
            loggedOut = eVar2;
            e eVar3 = new e("pendingSessionInit", 2);
            pendingSessionInit = eVar3;
            e eVar4 = new e("pendingAnonymousInit", 3);
            pendingAnonymousInit = eVar4;
            e eVar5 = new e("pendingAuthSystems", 4);
            pendingAuthSystems = eVar5;
            e eVar6 = new e("pendingSessionCheck", 5);
            pendingSessionCheck = eVar6;
            e eVar7 = new e("pendingLoginInit", 6);
            pendingLoginInit = eVar7;
            e eVar8 = new e("pendingLogin", 7);
            pendingLogin = eVar8;
            e eVar9 = new e("pendingUserInit", 8);
            pendingUserInit = eVar9;
            e eVar10 = new e("pendingConversationsRetrieval", 9);
            pendingConversationsRetrieval = eVar10;
            e eVar11 = new e("loggedIn", 10);
            loggedIn = eVar11;
            e eVar12 = new e("pendingDomains", 11);
            pendingDomains = eVar12;
            e eVar13 = new e("pendingNewConversation", 12);
            pendingNewConversation = eVar13;
            e eVar14 = new e("pendingEndConversation", 13);
            pendingEndConversation = eVar14;
            e eVar15 = new e("inConversation", 14);
            inConversation = eVar15;
            $VALUES = new e[]{eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7, eVar8, eVar9, eVar10, eVar11, eVar12, eVar13, eVar14, eVar15};
        }

        public e() {
            throw null;
        }

        public static e valueOf(String str) {
            return (e) Enum.valueOf(e.class, str);
        }

        public static e[] values() {
            return (e[]) $VALUES.clone();
        }
    }

    public aj(Context context, net.ipsoft.amelia.sdk.internal.common.b bVar, net.ipsoft.amelia.sdk.internal.common.k kVar, a aVar) {
        this.f84702c = null;
        b bVar2 = new b();
        this.f84701b = bVar;
        p pVarA = kVar.a();
        this.f84702c = pVarA;
        pVarA.a(bVar2);
        this.f84711l = aVar;
        this.f84709j = new HashSet<>();
    }

    public void a() {
        this.f84702c.a();
        this.f84710k = e.pendingSessionInit;
    }

    public void b() {
        this.f84710k = e.loggedOut;
    }

    public final void c(LoginOptions loginOptions) {
        String cookie;
        Map<String, String> initialAttributes = loginOptions.getInitialAttributes();
        Map<String, String> initialBpnVariables = loginOptions.getInitialBpnVariables();
        this.f84707h = initialAttributes;
        this.f84708i = initialBpnVariables;
        String str = loginOptions.username;
        p pVar = this.f84702c;
        if (str != null) {
            pVar.e();
            pVar.a();
            this.f84710k = e.pendingLoginInit;
            this.m = loginOptions;
            return;
        }
        if (loginOptions.sessionCookie != null) {
            cookie = "amelia_s=" + loginOptions.sessionCookie;
            a0.a(pVar.d(), cookie);
        } else {
            cookie = CookieManager.getInstance().getCookie(pVar.d() + "/Amelia/index.html");
        }
        if (pVar.d(cookie)) {
            pVar.a((String) null);
            this.f84710k = e.pendingSessionCheck;
        } else {
            this.f84710k = e.loggedOut;
            this.f84711l.e(new net.ipsoft.amelia.sdk.internal.common.c(IAmeliaError.Code.missingSessionCookie, "Login failed"));
        }
    }

    public void d() {
        int i10 = c.f84715a[this.f84710k.ordinal()];
        if (i10 != 2 && i10 != 3) {
            ALog.w(ALog.TAG_AMELIA, "logout() not supported in state: " + this.f84710k);
            return;
        }
        this.f84712n = d.logout;
        CookieManager.getInstance().removeAllCookies(null);
        CookieManager.getInstance().flush();
        this.f84709j.clear();
        h();
    }

    public void e() {
        net.ipsoft.amelia.sdk.internal.common.d dVar = this.f84713o;
        if (dVar != null) {
            String defaultConversationDomainId = dVar.getDefaultConversationDomainId();
            ArrayList<BaseDomain> arrayList = this.f84703d;
            if (arrayList == null) {
                arrayList = this.f84704e;
            }
            if (arrayList != null) {
                for (BaseDomain baseDomain : arrayList) {
                    if (baseDomain.getDomainId().equals(defaultConversationDomainId)) {
                        a(baseDomain);
                        return;
                    }
                }
            }
        }
    }

    public net.ipsoft.amelia.sdk.internal.common.d f() {
        return this.f84713o;
    }

    public final void g() {
        ArrayList arrayList = this.f84703d;
        p pVar = this.f84702c;
        if (arrayList == null) {
            this.f84710k = e.pendingDomains;
            pVar.b(this.f84700a);
        } else if (this.f84705f == null) {
            this.f84710k = e.loggedIn;
            this.f84711l.c(arrayList);
        } else {
            pVar.a(new ae(this.f84700a, System.currentTimeMillis(), this.f84705f.getCode(), this.f84708i, this.f84707h));
            this.f84710k = e.pendingNewConversation;
        }
    }

    public final void h() {
        this.f84713o = null;
        this.f84703d = null;
        this.f84704e = null;
        this.f84705f = null;
        this.f84709j.clear();
        CookieManager.getInstance().removeAllCookies(null);
        CookieManager.getInstance().flush();
        p pVar = this.f84702c;
        pVar.e();
        pVar.c();
        this.f84710k = e.loggedOut;
    }

    public void a(Map<String, String> map) {
        this.f84707h = map;
    }

    public void b(Map<String, String> map) {
        this.f84708i = map;
    }

    public void c() {
        Iterator<net.ipsoft.amelia.sdk.internal.common.f> it = this.f84709j.iterator();
        while (it.hasNext()) {
            this.f84711l.b(it.next());
            it.remove();
        }
        ArrayList arrayList = this.f84706g;
        if (arrayList == null) {
            this.f84710k = e.pendingAuthSystems;
            this.f84702c.b();
        } else {
            this.f84703d = null;
            this.f84710k = e.loggedOut;
            this.f84711l.a(arrayList);
        }
    }

    public void a(BaseDomain baseDomain) {
        if (baseDomain != null) {
            this.f84705f = baseDomain;
        }
        net.ipsoft.amelia.sdk.internal.common.d dVar = this.f84713o;
        if (dVar != null && !dVar.isAnonymous()) {
            g();
        } else {
            this.f84702c.a();
            this.f84710k = e.pendingAnonymousInit;
        }
    }

    public void b(net.ipsoft.amelia.sdk.internal.common.f fVar) {
        if (c.f84715a[this.f84710k.ordinal()] == 3) {
            this.f84710k = e.pendingEndConversation;
            this.f84711l.b(fVar);
        } else {
            ALog.w(ALog.TAG_AMELIA, "endConversation() not supported in state: " + this.f84710k);
        }
    }

    public void c(net.ipsoft.amelia.sdk.internal.common.f fVar) {
        int i10 = c.f84715a[this.f84710k.ordinal()];
        if (i10 == 3) {
            this.f84710k = e.loggedIn;
            return;
        }
        if (i10 != 4) {
            ALog.w(ALog.TAG_AMELIA, "endConversation() not supported in state: " + this.f84710k);
            return;
        }
        this.f84710k = e.loggedIn;
        int i11 = c.f84716b[this.f84712n.ordinal()];
        if (i11 == 1) {
            h();
        } else if (i11 == 2) {
            ArrayList arrayList = this.f84706g;
            if (arrayList == null) {
                this.f84710k = e.pendingAuthSystems;
                this.f84702c.b();
            } else {
                this.f84703d = null;
                this.f84710k = e.loggedOut;
                this.f84711l.a(arrayList);
            }
        } else if (i11 == 3) {
            c(this.m);
        } else if (i11 == 4) {
            g();
        }
        this.f84712n = d.none;
    }

    public void a(ConversationInfo conversationInfo) {
        this.f84702c.a(new t(this.f84700a, conversationInfo));
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0065, code lost:
    
        if (r4.f84713o.isAnonymous() != false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(net.ipsoft.amelia.sdk.LoginOptions r5) {
        /*
            r4 = this;
            int[] r0 = net.ipsoft.amelia.sdk.internal.b.aj.c.f84715a
            net.ipsoft.amelia.sdk.internal.b.aj$e r1 = r4.f84710k
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L67
            r1 = 2
            java.lang.String r3 = "Attempt to login already logged in user"
            if (r0 == r1) goto L5f
            r1 = 3
            if (r0 == r1) goto L2c
            java.lang.String r5 = net.ipsoft.amelia.sdk.internal.common.ALog.TAG_AMELIA
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "login() not supported in state: "
            r0.<init>(r1)
            net.ipsoft.amelia.sdk.internal.b.aj$e r1 = r4.f84710k
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            net.ipsoft.amelia.sdk.internal.common.ALog.w(r5, r0)
            goto L6e
        L2c:
            net.ipsoft.amelia.sdk.internal.common.d r0 = r4.f84713o
            boolean r0 = r0.isAnonymous()
            if (r0 == 0) goto L59
            r4.f84703d = r2
            r4.f84705f = r2
            r4.m = r5
            net.ipsoft.amelia.sdk.internal.b.aj$d r5 = net.ipsoft.amelia.sdk.internal.b.aj.d.login
            r4.f84712n = r5
            java.util.HashSet<net.ipsoft.amelia.sdk.internal.common.f> r5 = r4.f84709j
            java.util.Iterator r5 = r5.iterator()
        L44:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L6e
            java.lang.Object r0 = r5.next()
            net.ipsoft.amelia.sdk.internal.common.f r0 = (net.ipsoft.amelia.sdk.internal.common.f) r0
            net.ipsoft.amelia.sdk.internal.b.aj$a r1 = r4.f84711l
            r1.b(r0)
            r5.remove()
            goto L44
        L59:
            java.lang.String r5 = net.ipsoft.amelia.sdk.internal.common.ALog.TAG_AMELIA
            net.ipsoft.amelia.sdk.internal.common.ALog.w(r5, r3)
            goto L6e
        L5f:
            net.ipsoft.amelia.sdk.internal.common.d r0 = r4.f84713o
            boolean r0 = r0.isAnonymous()
            if (r0 == 0) goto L59
        L67:
            r4.f84703d = r2
            r4.f84705f = r2
            r4.c(r5)
        L6e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: net.ipsoft.amelia.sdk.internal.b.aj.a(net.ipsoft.amelia.sdk.LoginOptions):void");
    }

    public class b implements p.a {
        public b() {
        }

        @Override // net.ipsoft.amelia.sdk.internal.b.p.a
        public final void a(af afVar) {
            int[] iArr = c.f84715a;
            aj ajVar = aj.this;
            if (iArr[ajVar.f84710k.ordinal()] != 14) {
                ALog.w(ALog.TAG_AMELIA, "/conversation/new not supported in state: " + ajVar.f84710k);
                return;
            }
            ajVar.getClass();
            l lVar = afVar.f84764f;
            a aVar = ajVar.f84711l;
            if (lVar != null) {
                ajVar.f84710k = e.loggedIn;
                aVar.g(new net.ipsoft.amelia.sdk.internal.common.c(lVar, "Failed starting new conversation"));
                return;
            }
            ajVar.f84710k = e.inConversation;
            net.ipsoft.amelia.sdk.internal.common.f fVar = new net.ipsoft.amelia.sdk.internal.common.f(ajVar.f84700a, afVar.f84696b.a(), afVar.f84696b.b());
            fVar.a(ajVar.f84705f);
            ajVar.f84709j.add(fVar);
            aVar.a(fVar);
        }

        @Override // net.ipsoft.amelia.sdk.internal.b.p.a
        public final void a(ai aiVar) {
            int[] iArr = c.f84715a;
            aj ajVar = aj.this;
            if (iArr[ajVar.f84710k.ordinal()] != 13) {
                ALog.w(ALog.TAG_AMELIA, "conversations/my/open not supported in state: " + ajVar.f84710k);
                return;
            }
            ajVar.getClass();
            l lVar = aiVar.f84764f;
            a aVar = ajVar.f84711l;
            if (lVar == null) {
                aVar.b(aiVar.f84699b);
            } else {
                aVar.d(new net.ipsoft.amelia.sdk.internal.common.c(lVar, "Failed to retrieve open conversations for user"));
            }
            ajVar.f84710k = e.pendingDomains;
            ajVar.f84702c.b(ajVar.f84700a);
        }

        @Override // net.ipsoft.amelia.sdk.internal.b.p.a
        public final void a(net.ipsoft.amelia.sdk.internal.b.c cVar) {
            int[] iArr = c.f84715a;
            aj ajVar = aj.this;
            if (iArr[ajVar.f84710k.ordinal()] != 10) {
                ALog.w(ALog.TAG_AMELIA, "/whoAmI not supported in state: " + ajVar.f84710k);
                return;
            }
            l lVar = cVar.f84764f;
            a aVar = ajVar.f84711l;
            if (lVar != null) {
                aVar.c(new net.ipsoft.amelia.sdk.internal.common.c(lVar, "Failed fetching authSystems"));
                return;
            }
            ajVar.f84710k = e.loggedOut;
            ArrayList<BaseAuthSystem> arrayList = cVar.f84718b;
            ajVar.f84706g = arrayList;
            if (arrayList == null) {
                ArrayList arrayList2 = new ArrayList();
                ajVar.f84706g = arrayList2;
                arrayList2.add(net.ipsoft.amelia.sdk.internal.common.e.a());
            }
            aVar.a(ajVar.f84706g);
        }

        @Override // net.ipsoft.amelia.sdk.internal.b.p.a
        public final void a(net.ipsoft.amelia.sdk.internal.b.e eVar) {
            int[] iArr = c.f84715a;
            aj ajVar = aj.this;
            if (iArr[ajVar.f84710k.ordinal()] != 9) {
                ALog.w(ALog.TAG_AMELIA, "/httpSession/check not supported in state: " + ajVar.f84710k);
                return;
            }
            ajVar.getClass();
            boolean zB = eVar.b();
            l lVar = eVar.f84764f;
            a aVar = ajVar.f84711l;
            p pVar = ajVar.f84702c;
            if (lVar == null && zB) {
                pVar.a();
                ajVar.f84710k = e.pendingUserInit;
                aVar.b();
            } else {
                pVar.e();
                ajVar.f84710k = e.loggedOut;
                aVar.e(new net.ipsoft.amelia.sdk.internal.common.c(IAmeliaError.Code.invalidSession, "Session invalid"));
            }
        }

        @Override // net.ipsoft.amelia.sdk.internal.b.p.a
        public final void a(g gVar) {
            int[] iArr = c.f84715a;
            aj ajVar = aj.this;
            if (iArr[ajVar.f84710k.ordinal()] != 12) {
                ALog.w(ALog.TAG_AMELIA, "/conversation/domains not supported in state: " + ajVar.f84710k);
                return;
            }
            if (gVar.f84764f == null) {
                ajVar.f84703d = gVar.f84720b;
                int[] iArr2 = c.f84717c;
                net.ipsoft.amelia.sdk.internal.common.b bVar = ajVar.f84701b;
                int i10 = iArr2[bVar.f84832g.ordinal()];
                if (i10 == 1) {
                    String defaultConversationDomainId = ajVar.f84713o.getDefaultConversationDomainId();
                    for (BaseDomain baseDomain : ajVar.f84703d) {
                        if (baseDomain.getDomainId().equals(defaultConversationDomainId)) {
                            ajVar.f84705f = baseDomain;
                        }
                    }
                } else if (i10 == 3) {
                    for (BaseDomain baseDomain2 : ajVar.f84703d) {
                        if (baseDomain2.getCode().equals(bVar.f84827b)) {
                            ajVar.f84705f = baseDomain2;
                        }
                    }
                }
            }
            ajVar.f84710k = e.loggedIn;
            l lVar = gVar.f84764f;
            a aVar = ajVar.f84711l;
            if (lVar != null) {
                aVar.f(new net.ipsoft.amelia.sdk.internal.common.c(lVar, "Failed fetching domains"));
            } else if (ajVar.f84705f == null) {
                aVar.c(gVar.f84720b);
            } else {
                ajVar.g();
            }
        }

        @Override // net.ipsoft.amelia.sdk.internal.b.p.a
        public final void a(r rVar) {
            net.ipsoft.amelia.sdk.internal.common.c cVar;
            net.ipsoft.amelia.sdk.internal.common.d dVar;
            int[] iArr = c.f84715a;
            aj ajVar = aj.this;
            int i10 = iArr[ajVar.f84710k.ordinal()];
            if (i10 == 5) {
                l lVar = rVar.f84764f;
                a aVar = ajVar.f84711l;
                if (lVar != null) {
                    ajVar.f84710k = e.loggedOut;
                    aVar.b(new net.ipsoft.amelia.sdk.internal.common.c(lVar, "Session Init Failed"));
                    return;
                }
                s sVar = rVar.f84766b;
                if (sVar.f84769c) {
                    ajVar.f84710k = e.loggedIn;
                    ajVar.f84700a = sVar.a();
                    s sVar2 = rVar.f84766b;
                    ajVar.f84713o = sVar2.f84772f;
                    ajVar.f84704e = sVar2.f84771e;
                } else {
                    ajVar.f84710k = e.loggedOut;
                }
                aVar.a(rVar.f84766b);
                return;
            }
            if (i10 == 6) {
                if (rVar.f84764f == null) {
                    ajVar.f84700a = rVar.f84766b.a();
                }
                l lVar2 = rVar.f84764f;
                a aVar2 = ajVar.f84711l;
                if (lVar2 != null) {
                    ajVar.f84710k = e.loggedOut;
                    cVar = new net.ipsoft.amelia.sdk.internal.common.c(lVar2, "Initialization failed");
                } else {
                    if (rVar.f84766b.isAnonymousAllowed() && (dVar = rVar.f84766b.f84772f) != null && dVar.isAnonymous()) {
                        s sVar3 = rVar.f84766b;
                        ajVar.f84713o = sVar3.f84772f;
                        ajVar.f84704e = sVar3.f84771e;
                        ajVar.f84710k = e.pendingUserInit;
                        ajVar.f84702c.a();
                        return;
                    }
                    ajVar.f84710k = e.loggedOut;
                    cVar = new net.ipsoft.amelia.sdk.internal.common.c(IAmeliaError.Code.illegalAnonymousLogin, "Illegal anonymous login");
                }
                aVar2.c(cVar);
                return;
            }
            if (i10 == 7) {
                l lVar3 = rVar.f84764f;
                if (lVar3 == null) {
                    String strA = rVar.f84766b.a();
                    ajVar.f84700a = strA;
                    e eVar = e.pendingLogin;
                    ajVar.f84710k = eVar;
                    LoginOptions loginOptions = ajVar.m;
                    ajVar.f84702c.a(new v(strA, loginOptions.username, loginOptions.password));
                    ajVar.m = null;
                    ajVar.f84710k = eVar;
                    return;
                }
                ajVar.f84710k = e.loggedOut;
                ajVar.f84711l.e(new net.ipsoft.amelia.sdk.internal.common.c(lVar3, "Failed init before login"));
                ajVar.m = null;
                return;
            }
            if (i10 != 8) {
                ALog.w(ALog.TAG_AMELIA, "/init not supported in state: " + ajVar.f84710k);
                return;
            }
            l lVar4 = rVar.f84764f;
            a aVar3 = ajVar.f84711l;
            if (lVar4 != null) {
                ajVar.f84710k = e.loggedOut;
                aVar3.c(new net.ipsoft.amelia.sdk.internal.common.c(lVar4, "Failed init before login"));
                return;
            }
            String strA2 = rVar.f84766b.a();
            ajVar.f84700a = strA2;
            ajVar.f84710k = e.pendingConversationsRetrieval;
            net.ipsoft.amelia.sdk.internal.common.d dVar2 = rVar.f84766b.f84772f;
            if (dVar2 != null) {
                ajVar.f84713o = dVar2;
                aVar3.a(dVar2, strA2);
            }
            ajVar.f84704e = rVar.f84766b.f84771e;
            aVar3.a();
            ajVar.f84702c.c(ajVar.f84700a);
        }

        @Override // net.ipsoft.amelia.sdk.internal.b.p.a
        public final void a(u uVar) {
            aj ajVar = aj.this;
            ajVar.getClass();
            l lVar = uVar.f84764f;
            a aVar = ajVar.f84711l;
            if (lVar != null) {
                aVar.a(new net.ipsoft.amelia.sdk.internal.common.c(lVar, "Failed to join new conversation " + uVar.d()));
                return;
            }
            ajVar.f84710k = e.inConversation;
            net.ipsoft.amelia.sdk.internal.common.f fVar = new net.ipsoft.amelia.sdk.internal.common.f(ajVar.f84700a, uVar.b(), uVar.d());
            fVar.d(true);
            ArrayList<BaseDomain> arrayList = ajVar.f84704e;
            if (arrayList != null) {
                for (BaseDomain baseDomain : arrayList) {
                    if (baseDomain.getDomainId().equals(uVar.e())) {
                        fVar.a(baseDomain);
                    }
                }
            }
            ajVar.f84709j.add(fVar);
            aVar.a(fVar);
        }

        @Override // net.ipsoft.amelia.sdk.internal.b.p.a
        public final void a(w wVar) {
            int[] iArr = c.f84715a;
            aj ajVar = aj.this;
            if (iArr[ajVar.f84710k.ordinal()] != 11) {
                ALog.w(ALog.TAG_AMELIA, "/login not supported in state: " + ajVar.f84710k);
                return;
            }
            l lVar = wVar.f84764f;
            a aVar = ajVar.f84711l;
            if (lVar != null || !wVar.f84781b.b()) {
                ajVar.f84710k = e.loggedOut;
                l lVar2 = wVar.f84764f;
                aVar.e(lVar2 != null ? new net.ipsoft.amelia.sdk.internal.common.c(lVar2, "Login failed") : new net.ipsoft.amelia.sdk.internal.common.c(IAmeliaError.Code.authenticationFailure, "Login failed"));
            } else {
                ajVar.f84713o = wVar.f84781b.f84785c;
                p pVar = ajVar.f84702c;
                pVar.a();
                ajVar.f84710k = e.pendingUserInit;
                aVar.b();
                a0.a(pVar.d(), wVar.f84782c);
            }
        }

        @Override // net.ipsoft.amelia.sdk.internal.b.p.a
        public final void a(z zVar) {
            aj.this.f84711l.c();
        }
    }

    public void a(net.ipsoft.amelia.sdk.internal.common.f fVar) {
        b(fVar);
        a(this.f84705f);
    }
}
