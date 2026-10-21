package com.salesforce.marketingcloud;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.salesforce.marketingcloud.analytics.AnalyticsManager;
import com.salesforce.marketingcloud.behaviors.LifecycleManager;
import com.salesforce.marketingcloud.events.EventManager;
import com.salesforce.marketingcloud.internal.l;
import com.salesforce.marketingcloud.media.o;
import com.salesforce.marketingcloud.messages.RegionMessageManager;
import com.salesforce.marketingcloud.messages.iam.InAppMessageComponent;
import com.salesforce.marketingcloud.messages.iam.InAppMessageManager;
import com.salesforce.marketingcloud.messages.inbox.InboxMessageManager;
import com.salesforce.marketingcloud.messages.push.PushMessageManager;
import com.salesforce.marketingcloud.notifications.NotificationManager;
import com.salesforce.marketingcloud.registration.RegistrationManager;
import com.salesforce.marketingcloud.sfmcsdk.SFMCSdkComponents;
import com.salesforce.marketingcloud.sfmcsdk.components.identity.ModuleIdentity;
import com.salesforce.marketingcloud.sfmcsdk.modules.push.PushModuleInterface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executors;
import kotlin.Deprecated;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class MarketingCloudSdk extends PushModuleInterface implements com.salesforce.marketingcloud.b.InterfaceC0244b {
    private static volatile boolean A = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @VisibleForTesting
    static final String f63754s = "MarketingCloudPrefs";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @VisibleForTesting
    static final String f63755t = "InitConfig";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    static MarketingCloudSdk f63759x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static Context f63760y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static volatile boolean f63761z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MarketingCloudConfig f63762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<d> f63763b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final SFMCSdkComponents f63764c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    com.salesforce.marketingcloud.location.f f63765d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    com.salesforce.marketingcloud.behaviors.c f63766e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.salesforce.marketingcloud.b f63767f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.salesforce.marketingcloud.storage.j f63768g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.salesforce.marketingcloud.http.c f63769h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private com.salesforce.marketingcloud.messages.inbox.a f63770i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private com.salesforce.marketingcloud.registration.d f63771j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private com.salesforce.marketingcloud.notifications.a f63772k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private com.salesforce.marketingcloud.messages.push.a f63773l;
    private com.salesforce.marketingcloud.messages.d m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private com.salesforce.marketingcloud.events.c f63774n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private AnalyticsManager f63775o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private InitializationStatus f63776p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private InAppMessageComponent f63777q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private l f63778r;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    static final String f63756u = g.a("MarketingCloudSdk");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final Object f63757v = new Object();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final List<c> f63758w = new ArrayList();
    private static volatile boolean B = true;

    @MCKeep
    public interface InitializationListener {
        void complete(@NonNull InitializationStatus initializationStatus);
    }

    @MCKeep
    public interface WhenReadyListener {
        void ready(@NonNull MarketingCloudSdk marketingCloudSdk);
    }

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f63779a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ MarketingCloudConfig f63780b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ SFMCSdkComponents f63781c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ InitializationListener f63782d;

        public a(Context context, MarketingCloudConfig marketingCloudConfig, SFMCSdkComponents sFMCSdkComponents, InitializationListener initializationListener) {
            this.f63779a = context;
            this.f63780b = marketingCloudConfig;
            this.f63781c = sFMCSdkComponents;
            this.f63782d = initializationListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            String name = Thread.currentThread().getName();
            Thread.currentThread().setName("SFMC_init");
            try {
                String str = MarketingCloudSdk.f63756u;
                g.d(str, "Starting init thread", new Object[0]);
                MarketingCloudSdk.a(this.f63779a, this.f63780b, this.f63781c, this.f63782d);
                Thread.currentThread().setName(name);
                g.d(str, "~~ MarketingCloudSdk v%s init complete ~~", MarketingCloudSdk.getSdkVersionName());
            } catch (Throwable th2) {
                Thread.currentThread().setName(name);
                g.d(MarketingCloudSdk.f63756u, "~~ MarketingCloudSdk v%s init complete ~~", MarketingCloudSdk.getSdkVersionName());
                throw th2;
            }
        }
    }

    public class b extends c {
        public b(Looper looper, WhenReadyListener whenReadyListener) {
            super(looper, whenReadyListener);
        }

        @Override // com.salesforce.marketingcloud.MarketingCloudSdk.c
        public void a(WhenReadyListener whenReadyListener) {
            if (whenReadyListener != null) {
                try {
                    whenReadyListener.ready(MarketingCloudSdk.f63759x);
                } catch (Exception e5) {
                    g.b(MarketingCloudSdk.f63756u, e5, "Error occurred in %s", whenReadyListener.getClass().getName());
                }
            }
        }
    }

    public static abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Handler f63783a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        WhenReadyListener f63784b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        volatile boolean f63785c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Runnable f63786d = new a();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private volatile boolean f63787e;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                synchronized (c.this) {
                    try {
                        if (c.this.f63785c) {
                            return;
                        }
                        c cVar = c.this;
                        cVar.a(cVar.f63784b);
                        c.this.f63785c = true;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }

        public c(Looper looper, WhenReadyListener whenReadyListener) {
            looper = looper == null ? Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper() : looper;
            this.f63784b = whenReadyListener;
            this.f63783a = new Handler(looper);
        }

        public void a() {
            synchronized (this) {
                try {
                    if (!this.f63785c && !this.f63787e) {
                        this.f63787e = true;
                        this.f63783a.post(this.f63786d);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public abstract void a(WhenReadyListener whenReadyListener);
    }

    private MarketingCloudSdk(@NonNull MarketingCloudConfig marketingCloudConfig, @Nullable SFMCSdkComponents sFMCSdkComponents) {
        this.f63762a = marketingCloudConfig;
        this.f63764c = sFMCSdkComponents;
    }

    private InitializationStatus a(@Nullable String str) {
        InitializationStatus.a aVar;
        if (com.salesforce.marketingcloud.util.b.a()) {
            return com.salesforce.marketingcloud.internal.c.a();
        }
        InitializationStatus.a aVarB = com.salesforce.marketingcloud.internal.c.b();
        try {
            String strA = com.salesforce.marketingcloud.util.e.a(f63760y, str);
            try {
                this.f63778r = new l();
                com.salesforce.marketingcloud.storage.j jVar = new com.salesforce.marketingcloud.storage.j(f63760y, new com.salesforce.marketingcloud.util.a(f63760y, this.f63762a.applicationId(), this.f63762a.accessToken(), strA), this.f63762a.applicationId(), this.f63762a.accessToken(), this.f63778r);
                this.f63768g = jVar;
                jVar.a(aVarB);
            } catch (Throwable th2) {
                g.a(f63756u, th2, "Unable to initialize SDK storage.", new Object[0]);
                aVarB.a(th2);
            }
            if (!aVarB.b()) {
                com.salesforce.marketingcloud.registration.d.a(this.f63762a, f63760y, strA, str);
                return aVarB.a();
            }
            this.f63766e = new com.salesforce.marketingcloud.behaviors.c(f63760y, Executors.newSingleThreadExecutor());
            this.f63769h = new com.salesforce.marketingcloud.http.c(f63760y, this.f63768g.f(), this.f63778r);
            com.salesforce.marketingcloud.alarms.b bVar = new com.salesforce.marketingcloud.alarms.b(f63760y, this.f63768g, this.f63766e);
            com.salesforce.marketingcloud.analytics.h hVar = new com.salesforce.marketingcloud.analytics.h(this.f63762a, this.f63768g, strA, bVar, this.f63766e, this.f63769h, this.f63778r);
            this.f63775o = hVar;
            k kVar = new k(strA, this.f63762a, this.f63768g, this.f63769h, this.f63766e, bVar, this.f63778r, hVar);
            this.f63767f = new com.salesforce.marketingcloud.b(kVar, this.f63768g.o());
            this.f63765d = com.salesforce.marketingcloud.location.f.a(f63760y, this.f63762a);
            com.salesforce.marketingcloud.proximity.e eVarA = com.salesforce.marketingcloud.proximity.e.a(f63760y, this.f63762a);
            this.f63772k = com.salesforce.marketingcloud.notifications.a.a(f63760y, this.f63768g, this.f63762a.notificationCustomizationOptions(), hVar);
            this.f63770i = new com.salesforce.marketingcloud.messages.inbox.a(this.f63762a, this.f63768g, strA, this.f63766e, bVar, this.f63769h, this.f63778r, hVar);
            InitializationStatus.a aVar2 = aVarB;
            try {
                this.m = new com.salesforce.marketingcloud.messages.d(f63760y, this.f63762a, this.f63768g, strA, this.f63765d, eVarA, this.f63766e, bVar, this.f63769h, this.f63772k, this.f63778r, hVar);
                this.f63773l = new com.salesforce.marketingcloud.messages.push.a(f63760y, this.f63768g, this.f63772k, bVar, this.f63762a.senderId());
                com.salesforce.marketingcloud.registration.f fVar = new com.salesforce.marketingcloud.registration.f(strA, this.f63762a.applicationId(), com.salesforce.marketingcloud.util.h.a(f63760y));
                this.f63771j = new com.salesforce.marketingcloud.registration.d(f63760y, this.f63762a, this.f63768g, fVar, this.f63766e, bVar, this.f63769h, this.f63773l, this.f63778r, this.f63764c);
                com.salesforce.marketingcloud.config.a aVar3 = new com.salesforce.marketingcloud.config.a(kVar, this.f63768g, hVar);
                Context context = f63760y;
                com.salesforce.marketingcloud.storage.j jVar2 = this.f63768g;
                this.f63777q = new InAppMessageComponent(context, jVar2, bVar, kVar, this.f63766e, o.a(context, jVar2), this.f63762a.urlHandler(), this.f63778r, hVar, this.f63764c, aVar3);
                this.f63774n = new com.salesforce.marketingcloud.events.c(f63760y, fVar, this.f63768g, kVar, this.f63766e, hVar, this.f63778r, this.f63764c, aVar3, this.f63777q);
                this.f63763b.add(this.f63766e);
                this.f63763b.add(LifecycleManager.a((Application) f63760y.getApplicationContext()));
                this.f63763b.add(this.f63769h);
                this.f63763b.add(bVar);
                this.f63763b.add(hVar);
                this.f63763b.add(kVar);
                this.f63763b.add(this.f63767f);
                this.f63763b.add(this.f63765d);
                this.f63763b.add(eVarA);
                this.f63763b.add(this.f63770i);
                this.f63763b.add(this.f63772k);
                this.f63763b.add(this.m);
                this.f63763b.add(this.f63773l);
                this.f63763b.add(this.f63771j);
                this.f63763b.add(aVar3);
                this.f63763b.add(this.f63777q);
                this.f63763b.add(this.f63774n);
                int iA = this.f63767f.a();
                g.d(f63756u, "Initializing all components with control channel flag [%d]", Integer.valueOf(iA));
                for (d dVar : this.f63763b) {
                    g.d(f63756u, "init called for %s", dVar.componentName());
                    if (dVar instanceof e) {
                        aVar = aVar2;
                        try {
                            ((e) dVar).init(aVar, iA);
                        } catch (Exception e5) {
                            e = e5;
                            aVar.a(e);
                            g.b(f63756u, e, "Something wrong with internal init", new Object[0]);
                            return aVar.a();
                        }
                    } else {
                        aVar = aVar2;
                        if (dVar instanceof f) {
                            ((f) dVar).a(aVar);
                        }
                    }
                    aVar.a(dVar);
                    aVar2 = aVar;
                }
                aVar = aVar2;
            } catch (Exception e7) {
                e = e7;
                aVar = aVar2;
            }
            return aVar.a();
        } catch (Exception e10) {
            e = e10;
            aVar = aVarB;
            aVar.a(e);
            g.b(f63756u, e, "Something wrong with internal init", new Object[0]);
            return aVar.a();
        }
    }

    @VisibleForTesting
    @WorkerThread
    public static void c() {
        MarketingCloudSdk marketingCloudSdk = f63759x;
        if (marketingCloudSdk != null) {
            marketingCloudSdk.a(false);
        }
        f63759x = null;
    }

    @Nullable
    @MCKeep
    public static MarketingCloudSdk getInstance() {
        if (!f63761z && !A) {
            throw new IllegalStateException("MarketingCloudSdk#init must be called before calling MarketingCloudSdk#getInstance.");
        }
        synchronized (f63757v) {
            if (A) {
                return f63759x;
            }
            boolean z10 = false;
            while (!A && f63761z) {
                try {
                    try {
                        f63757v.wait(0L);
                    } catch (InterruptedException unused) {
                        z10 = true;
                    }
                } catch (Throwable th2) {
                    if (z10) {
                        Thread.currentThread().interrupt();
                    }
                    throw th2;
                }
            }
            MarketingCloudSdk marketingCloudSdk = f63759x;
            if (z10) {
                Thread.currentThread().interrupt();
            }
            return marketingCloudSdk;
        }
    }

    @MCKeep
    @MCLogListener.LogLevel
    public static int getLogLevel() {
        return com.salesforce.marketingcloud.internal.d.a();
    }

    @MCKeep
    public static int getSdkVersionCode() {
        return com.salesforce.marketingcloud.a.f63793d;
    }

    @NonNull
    @MCKeep
    public static String getSdkVersionName() {
        return com.salesforce.marketingcloud.a.f63794e;
    }

    @MCKeep
    @Deprecated(message = "Initialize the SDK with SFMCSdk.configure()")
    @MainThread
    public static void init(@NonNull Context context, @NonNull MarketingCloudConfig marketingCloudConfig, @Nullable InitializationListener initializationListener) {
        b(context, marketingCloudConfig, null, initializationListener);
    }

    @MCKeep
    public static boolean isInitializing() {
        return f63761z;
    }

    @MCKeep
    public static boolean isReady() {
        return A && f63759x != null;
    }

    @MCKeep
    public static void requestSdk(@Nullable Looper looper, @NonNull WhenReadyListener whenReadyListener) {
        b bVar = new b(looper, whenReadyListener);
        List<c> list = f63758w;
        synchronized (list) {
            try {
                if (B) {
                    list.add(bVar);
                } else {
                    bVar.a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @MCKeep
    public static void setLogLevel(@MCLogListener.LogLevel int i10) {
        com.salesforce.marketingcloud.internal.d.a(i10);
    }

    @MCKeep
    public static void setLogListener(@Nullable MCLogListener mCLogListener) {
        com.salesforce.marketingcloud.internal.d.a(mCLogListener);
    }

    @MCKeep
    public static void unregisterWhenReadyListener(@NonNull WhenReadyListener whenReadyListener) {
        if (whenReadyListener == null) {
            return;
        }
        List<c> list = f63758w;
        synchronized (list) {
            try {
                Iterator<c> it = list.iterator();
                while (it.hasNext()) {
                    if (whenReadyListener == it.next().f63784b) {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public com.salesforce.marketingcloud.storage.j b() {
        return this.f63768g;
    }

    @Override // com.salesforce.marketingcloud.sfmcsdk.modules.push.PushModuleInterface
    @NonNull
    @MCKeep
    public AnalyticsManager getAnalyticsManager() {
        return this.f63775o;
    }

    @Override // com.salesforce.marketingcloud.sfmcsdk.modules.push.PushModuleInterface
    @NonNull
    @MCKeep
    public EventManager getEventManager() {
        return this.f63774n;
    }

    @Override // com.salesforce.marketingcloud.sfmcsdk.modules.push.PushModuleInterface
    @NonNull
    @MCKeep
    public InAppMessageManager getInAppMessageManager() {
        return this.f63777q;
    }

    @Override // com.salesforce.marketingcloud.sfmcsdk.modules.push.PushModuleInterface
    @NonNull
    @MCKeep
    public InboxMessageManager getInboxMessageManager() {
        return this.f63770i;
    }

    @Override // com.salesforce.marketingcloud.sfmcsdk.modules.push.PushModuleInterface
    @NonNull
    @MCKeep
    public InitializationStatus getInitializationStatus() {
        return this.f63776p;
    }

    @NonNull
    @MCKeep
    public MarketingCloudConfig getMarketingCloudConfig() {
        return this.f63762a;
    }

    @Override // com.salesforce.marketingcloud.sfmcsdk.modules.ModuleInterface
    @NonNull
    public ModuleIdentity getModuleIdentity() {
        return i.a(this.f63762a.applicationId(), getRegistrationManager());
    }

    @Override // com.salesforce.marketingcloud.sfmcsdk.modules.push.PushModuleInterface
    @NonNull
    @MCKeep
    public NotificationManager getNotificationManager() {
        return this.f63772k;
    }

    @Override // com.salesforce.marketingcloud.sfmcsdk.modules.push.PushModuleInterface
    @NonNull
    @MCKeep
    public PushMessageManager getPushMessageManager() {
        return this.f63773l;
    }

    @Override // com.salesforce.marketingcloud.sfmcsdk.modules.push.PushModuleInterface
    @NonNull
    @MCKeep
    public RegionMessageManager getRegionMessageManager() {
        return this.m;
    }

    @Override // com.salesforce.marketingcloud.sfmcsdk.modules.push.PushModuleInterface
    @NonNull
    @MCKeep
    public RegistrationManager getRegistrationManager() {
        return this.f63771j;
    }

    @NonNull
    @MCKeep
    public JSONObject getSdkState() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("initConfig", this.f63762a.toString());
            jSONObject.put("initStatus", this.f63776p.toString());
            for (d dVar : this.f63763b) {
                if (dVar != null) {
                    try {
                        jSONObject.put(dVar.componentName(), dVar.componentState());
                    } catch (Exception e5) {
                        g.b(f63756u, e5, "Failed to create component state for %s", dVar);
                    }
                }
            }
        } catch (Exception e7) {
            g.b(f63756u, e7, "Unable to create Sdk state json", new Object[0]);
        }
        return jSONObject;
    }

    @Override // com.salesforce.marketingcloud.sfmcsdk.modules.ModuleInterface
    @NonNull
    public JSONObject getState() {
        return getSdkState();
    }

    @MainThread
    public static void b(@NonNull Context context, @NonNull MarketingCloudConfig marketingCloudConfig, @Nullable SFMCSdkComponents sFMCSdkComponents, @Nullable InitializationListener initializationListener) {
        String str = f63756u;
        g.d(str, "~~ MarketingCloudSdk v%s init() ~~", getSdkVersionName());
        com.salesforce.marketingcloud.util.j.a(context, "Context cannot be null.");
        com.salesforce.marketingcloud.util.j.a(marketingCloudConfig, "Config cannot be null.");
        com.salesforce.marketingcloud.internal.d.a(marketingCloudConfig.applicationId(), marketingCloudConfig.accessToken(), marketingCloudConfig.senderId());
        synchronized (f63757v) {
            try {
                if (A || f63761z) {
                    MarketingCloudSdk marketingCloudSdk = f63759x;
                    if (marketingCloudSdk != null && marketingCloudConfig.equals(marketingCloudSdk.f63762a)) {
                        Object[] objArr = new Object[1];
                        objArr[0] = A ? "initialized" : "initializing";
                        g.d(str, "MarketingCloudSdk is already %s", objArr);
                        if (isReady() && initializationListener != null) {
                            initializationListener.complete(f63759x.f63776p);
                        }
                        return;
                    }
                }
                g.d(str, "Starting initialization", new Object[0]);
                A = false;
                f63761z = true;
                B = true;
                f63760y = context.getApplicationContext();
                new Thread(new a(context, marketingCloudConfig, sFMCSdkComponents, initializationListener)).start();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @MCKeep
    public static void requestSdk(@NonNull WhenReadyListener whenReadyListener) {
        requestSdk(null, whenReadyListener);
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public com.salesforce.marketingcloud.http.c a() {
        return this.f63769h;
    }

    @WorkerThread
    private void b(boolean z10) {
        for (int size = this.f63763b.size() - 1; size >= 0; size--) {
            try {
                this.f63763b.get(size).tearDown(z10);
            } catch (Exception e5) {
                g.b(f63756u, e5, "Error encountered tearing down component.", new Object[0]);
            }
        }
        this.f63763b.clear();
        l lVar = this.f63778r;
        if (lVar != null) {
            lVar.c();
        }
        com.salesforce.marketingcloud.storage.j jVar = this.f63768g;
        if (jVar != null) {
            try {
                jVar.x();
            } catch (Exception e7) {
                g.b(f63756u, e7, "Error encountered tearing down storage.", new Object[0]);
            }
            this.f63768g = null;
        }
        List<c> list = f63758w;
        synchronized (list) {
            list.clear();
        }
        A = false;
        B = true;
    }

    @Override // com.salesforce.marketingcloud.b.InterfaceC0244b
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void a(int i10) {
        for (int size = this.f63763b.size() - 1; size >= 0; size--) {
            try {
                d dVar = this.f63763b.get(size);
                if (dVar instanceof e) {
                    ((e) dVar).controlChannelInit(i10);
                }
            } catch (Exception e5) {
                g.b(f63756u, e5, "Error encountered during control channel init.", new Object[0]);
            }
        }
    }

    public static void a(@NonNull Context context, @NonNull MarketingCloudConfig marketingCloudConfig, @Nullable SFMCSdkComponents sFMCSdkComponents, @Nullable InitializationListener initializationListener) {
        String str = f63756u;
        g.d(str, "executeInit %s", marketingCloudConfig);
        synchronized (f63757v) {
            try {
                MarketingCloudSdk marketingCloudSdk = f63759x;
                if (marketingCloudSdk != null) {
                    marketingCloudSdk.b(com.salesforce.marketingcloud.internal.e.a(marketingCloudConfig, marketingCloudSdk.f63762a));
                }
                f63759x = new MarketingCloudSdk(marketingCloudConfig, sFMCSdkComponents);
                InitializationStatus initializationStatusA = f63759x.a(sFMCSdkComponents != null ? sFMCSdkComponents.getRegistrationId() : null);
                g.a(str, "MarketingCloudSdk init finished with status: %s", initializationStatusA);
                A = initializationStatusA.getIsUsable();
                f63761z = false;
                if (A) {
                    f63759x.a(initializationStatusA);
                    MarketingCloudSdk marketingCloudSdk2 = f63759x;
                    marketingCloudSdk2.f63767f.a(marketingCloudSdk2);
                    List<c> list = f63758w;
                    synchronized (list) {
                        try {
                            B = false;
                            g.d(str, "Delivering queued SDK requests to %s listeners", Integer.valueOf(list.size()));
                            if (!list.isEmpty()) {
                                Iterator<c> it = list.iterator();
                                while (it.hasNext()) {
                                    it.next().a();
                                }
                                f63758w.clear();
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                } else {
                    f63759x.a(false);
                    f63759x = null;
                    List<c> list2 = f63758w;
                    synchronized (list2) {
                        list2.clear();
                    }
                }
                f63757v.notifyAll();
                if (initializationListener != null) {
                    initializationListener.complete(initializationStatusA);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    private void a(InitializationStatus initializationStatus) {
        this.f63776p = initializationStatus;
    }

    private void a(boolean z10) {
        b(z10);
        f63761z = false;
    }
}
