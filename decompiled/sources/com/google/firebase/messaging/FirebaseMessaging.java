package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.app.Application;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.webkit.ProxyConfig;
import com.google.android.datatransport.TransportFactory;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.DataCollectionDefaultChange;
import com.google.firebase.FirebaseApp;
import com.google.firebase.events.Event;
import com.google.firebase.events.EventHandler;
import com.google.firebase.events.Subscriber;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.iid.internal.FirebaseInstanceIdInternal;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.platforminfo.UserAgentPublisher;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public class FirebaseMessaging {

    @Deprecated
    public static final String INSTANCE_ID_SCOPE = "FCM";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final long f48546n = TimeUnit.HOURS.toSeconds(8);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @GuardedBy("FirebaseMessaging.class")
    public static p f48547o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    @SuppressLint({"FirebaseUnknownNullness"})
    @VisibleForTesting
    public static TransportFactory f48548p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @GuardedBy("FirebaseMessaging.class")
    @VisibleForTesting
    public static ScheduledThreadPoolExecutor f48549q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FirebaseApp f48550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final FirebaseInstanceIdInternal f48551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FirebaseInstallationsApi f48552c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f48553d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k f48554e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n f48555f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a f48556g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Executor f48557h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Executor f48558i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Executor f48559j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Task<v> f48560k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final l f48561l;

    @GuardedBy("this")
    public boolean m;

    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Subscriber f48562a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @GuardedBy("this")
        public boolean f48563b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        @GuardedBy("this")
        public j f48564c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        @GuardedBy("this")
        public Boolean f48565d;

        public a(Subscriber subscriber) {
            this.f48562a = subscriber;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [com.google.firebase.events.EventHandler, com.google.firebase.messaging.j] */
        public final synchronized void a() {
            try {
                if (this.f48563b) {
                    return;
                }
                Boolean boolC = c();
                this.f48565d = boolC;
                if (boolC == null) {
                    ?? r1 = new EventHandler() { // from class: com.google.firebase.messaging.j
                        @Override // com.google.firebase.events.EventHandler
                        public final void handle(Event event) {
                            FirebaseMessaging.a aVar = this.f48635a;
                            if (aVar.b()) {
                                String str = FirebaseMessaging.INSTANCE_ID_SCOPE;
                                FirebaseMessaging.this.h();
                            }
                        }
                    };
                    this.f48564c = r1;
                    this.f48562a.subscribe(DataCollectionDefaultChange.class, r1);
                }
                this.f48563b = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }

        public final synchronized boolean b() {
            Boolean bool;
            try {
                a();
                bool = this.f48565d;
            } catch (Throwable th2) {
                throw th2;
            }
            return bool != null ? bool.booleanValue() : FirebaseMessaging.this.f48550a.isDataCollectionDefaultEnabled();
        }

        @Nullable
        public final Boolean c() {
            ApplicationInfo applicationInfo;
            Bundle bundle;
            Context applicationContext = FirebaseMessaging.this.f48550a.getApplicationContext();
            SharedPreferences sharedPreferences = applicationContext.getSharedPreferences(BuildConfig.LIBRARY_PACKAGE_NAME, 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = applicationContext.getPackageManager();
                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                    return null;
                }
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }
    }

    public FirebaseMessaging() {
        throw null;
    }

    public FirebaseMessaging(FirebaseApp firebaseApp, @Nullable FirebaseInstanceIdInternal firebaseInstanceIdInternal, Provider<UserAgentPublisher> provider, Provider<HeartBeatInfo> provider2, FirebaseInstallationsApi firebaseInstallationsApi, @Nullable TransportFactory transportFactory, Subscriber subscriber) {
        final l lVar = new l(firebaseApp.getApplicationContext());
        final k kVar = new k(firebaseApp, lVar, provider, provider2, firebaseInstallationsApi);
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new NamedThreadFactory("Firebase-Messaging-Task"));
        int i10 = 1;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("Firebase-Messaging-Init"));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory("Firebase-Messaging-File-Io"));
        this.m = false;
        f48548p = transportFactory;
        this.f48550a = firebaseApp;
        this.f48551b = firebaseInstanceIdInternal;
        this.f48552c = firebaseInstallationsApi;
        this.f48556g = new a(subscriber);
        final Context applicationContext = firebaseApp.getApplicationContext();
        this.f48553d = applicationContext;
        g gVar = new g();
        this.f48561l = lVar;
        this.f48558i = executorServiceNewSingleThreadExecutor;
        this.f48554e = kVar;
        this.f48555f = new n(executorServiceNewSingleThreadExecutor);
        this.f48557h = scheduledThreadPoolExecutor;
        this.f48559j = threadPoolExecutor;
        Context applicationContext2 = firebaseApp.getApplicationContext();
        if (applicationContext2 instanceof Application) {
            ((Application) applicationContext2).registerActivityLifecycleCallbacks(gVar);
        } else {
            Log.w(Constants.TAG, "Context " + applicationContext2 + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        if (firebaseInstanceIdInternal != null) {
            firebaseInstanceIdInternal.addNewTokenListener(new FirebaseInstanceIdInternal.NewTokenListener() { // from class: com.google.firebase.messaging.h
                @Override // com.google.firebase.iid.internal.FirebaseInstanceIdInternal.NewTokenListener
                public final void onNewToken(String str) {
                    String str2 = FirebaseMessaging.INSTANCE_ID_SCOPE;
                    this.f48631a.f(str);
                }
            });
        }
        scheduledThreadPoolExecutor.execute(new androidx.compose.ui.platform.j(this, 7));
        final ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("Firebase-Messaging-Topics-Io"));
        int i11 = v.f48713j;
        Task<v> taskCall = Tasks.call(scheduledThreadPoolExecutor2, new Callable() { // from class: com.google.firebase.messaging.u
            @Override // java.util.concurrent.Callable
            public final Object call() {
                t tVar;
                Context context = applicationContext;
                ScheduledExecutorService scheduledExecutorService = scheduledThreadPoolExecutor2;
                FirebaseMessaging firebaseMessaging = this;
                l lVar2 = lVar;
                k kVar2 = kVar;
                synchronized (t.class) {
                    try {
                        WeakReference<t> weakReference = t.f48702d;
                        tVar = weakReference != null ? weakReference.get() : null;
                        if (tVar == null) {
                            t tVar2 = new t(context.getSharedPreferences("com.google.android.gms.appid", 0), scheduledExecutorService);
                            tVar2.b();
                            t.f48702d = new WeakReference<>(tVar2);
                            tVar = tVar2;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return new v(firebaseMessaging, lVar2, tVar, kVar2, context, scheduledExecutorService);
            }
        });
        this.f48560k = taskCall;
        taskCall.addOnSuccessListener(scheduledThreadPoolExecutor, new n6.a(this, i10));
        scheduledThreadPoolExecutor.execute(new androidx.core.app.a(this, 3));
    }

    @SuppressLint({"ThreadPoolCreation"})
    public static void b(q qVar, long j10) {
        synchronized (FirebaseMessaging.class) {
            try {
                if (f48549q == null) {
                    f48549q = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("TAG"));
                }
                f48549q.schedule(qVar, j10, TimeUnit.SECONDS);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NonNull
    public static synchronized p c(Context context) {
        try {
            if (f48547o == null) {
                f48547o = new p(context);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f48547o;
    }

    @NonNull
    public static synchronized FirebaseMessaging getInstance() {
        return getInstance(FirebaseApp.getInstance());
    }

    @Nullable
    public static TransportFactory getTransportFactory() {
        return f48548p;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String a() throws IOException {
        Task taskContinueWithTask;
        FirebaseInstanceIdInternal firebaseInstanceIdInternal = this.f48551b;
        if (firebaseInstanceIdInternal != null) {
            try {
                return (String) Tasks.await(firebaseInstanceIdInternal.getTokenTask());
            } catch (InterruptedException | ExecutionException e5) {
                throw new IOException(e5);
            }
        }
        final p.a aVarE = e();
        if (!j(aVarE)) {
            return aVarE.f48659a;
        }
        final String strC = l.c(this.f48550a);
        n nVar = this.f48555f;
        synchronized (nVar) {
            taskContinueWithTask = (Task) nVar.f48651b.get(strC);
            if (taskContinueWithTask == null) {
                k kVar = this.f48554e;
                taskContinueWithTask = kVar.a(kVar.c(l.c(kVar.f48636a), ProxyConfig.MATCH_ALL_SCHEMES, new Bundle())).onSuccessTask(this.f48559j, new SuccessContinuation() { // from class: com.google.firebase.messaging.i
                    @Override // com.google.android.gms.tasks.SuccessContinuation
                    public final Task then(Object obj) {
                        FirebaseMessaging firebaseMessaging = this.f48632p0;
                        String str = strC;
                        p.a aVar = aVarE;
                        String str2 = (String) obj;
                        p pVarC = FirebaseMessaging.c(firebaseMessaging.f48553d);
                        String strD = firebaseMessaging.d();
                        String strA = firebaseMessaging.f48561l.a();
                        synchronized (pVarC) {
                            String strA2 = p.a.a(System.currentTimeMillis(), str2, strA);
                            if (strA2 != null) {
                                SharedPreferences.Editor editorEdit = pVarC.f48657a.edit();
                                editorEdit.putString(p.a(strD, str), strA2);
                                editorEdit.commit();
                            }
                        }
                        if (aVar == null || !str2.equals(aVar.f48659a)) {
                            firebaseMessaging.f(str2);
                        }
                        return Tasks.forResult(str2);
                    }
                }).continueWithTask(nVar.f48650a, new androidx.camera.camera2.interop.i(nVar, strC));
                nVar.f48651b.put(strC, taskContinueWithTask);
            }
        }
        try {
            return (String) Tasks.await(taskContinueWithTask);
        } catch (InterruptedException | ExecutionException e7) {
            throw new IOException(e7);
        }
    }

    public final String d() {
        FirebaseApp firebaseApp = this.f48550a;
        return "[DEFAULT]".equals(firebaseApp.getName()) ? "" : firebaseApp.getPersistenceKey();
    }

    @NonNull
    public Task<Void> deleteToken() {
        if (this.f48551b != null) {
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            this.f48557h.execute(new h2.j(this, taskCompletionSource, 4));
            return taskCompletionSource.getTask();
        }
        if (e() == null) {
            return Tasks.forResult(null);
        }
        TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
        Executors.newSingleThreadExecutor(new NamedThreadFactory("Firebase-Messaging-Network-Io")).execute(new androidx.camera.core.impl.l(this, taskCompletionSource2, 3));
        return taskCompletionSource2.getTask();
    }

    @NonNull
    public boolean deliveryMetricsExportToBigQueryEnabled() {
        return MessagingAnalytics.a();
    }

    @Nullable
    @VisibleForTesting
    public final p.a e() {
        p.a aVarB;
        p pVarC = c(this.f48553d);
        String strD = d();
        String strC = l.c(this.f48550a);
        synchronized (pVarC) {
            aVarB = p.a.b(pVarC.f48657a.getString(p.a(strD, strC), null));
        }
        return aVarB;
    }

    public final void f(String str) {
        FirebaseApp firebaseApp = this.f48550a;
        if ("[DEFAULT]".equals(firebaseApp.getName())) {
            if (Log.isLoggable(Constants.TAG, 3)) {
                firebaseApp.getName();
            }
            Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
            intent.putExtra("token", str);
            new FcmBroadcastProcessor(this.f48553d).process(intent);
        }
    }

    public final synchronized void g(boolean z10) {
        this.m = z10;
    }

    @NonNull
    public Task<String> getToken() {
        FirebaseInstanceIdInternal firebaseInstanceIdInternal = this.f48551b;
        if (firebaseInstanceIdInternal != null) {
            return firebaseInstanceIdInternal.getTokenTask();
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f48557h.execute(new androidx.camera.core.p(this, taskCompletionSource, 1));
        return taskCompletionSource.getTask();
    }

    public final void h() {
        FirebaseInstanceIdInternal firebaseInstanceIdInternal = this.f48551b;
        if (firebaseInstanceIdInternal != null) {
            firebaseInstanceIdInternal.getToken();
        } else if (j(e())) {
            synchronized (this) {
                if (!this.m) {
                    i(0L);
                }
            }
        }
    }

    public final synchronized void i(long j10) {
        b(new q(this, Math.min(Math.max(30L, 2 * j10), f48546n)), j10);
        this.m = true;
    }

    public boolean isAutoInitEnabled() {
        return this.f48556g.b();
    }

    public boolean isNotificationDelegationEnabled() {
        if (!PlatformVersion.isAtLeastQ()) {
            return false;
        }
        int callingUid = Binder.getCallingUid();
        Context context = this.f48553d;
        if (callingUid == context.getApplicationInfo().uid) {
            return "com.google.android.gms".equals(((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationDelegate());
        }
        context.getPackageName();
        return false;
    }

    @VisibleForTesting
    public final boolean j(@Nullable p.a aVar) {
        if (aVar != null) {
            String strA = this.f48561l.a();
            if (System.currentTimeMillis() <= aVar.f48661c + p.a.f48658d && strA.equals(aVar.f48660b)) {
                return false;
            }
        }
        return true;
    }

    public void send(@NonNull RemoteMessage remoteMessage) {
        if (TextUtils.isEmpty(remoteMessage.getTo())) {
            throw new IllegalArgumentException("Missing 'to'");
        }
        Intent intent = new Intent("com.google.android.gcm.intent.SEND");
        Intent intent2 = new Intent();
        intent2.setPackage("com.google.example.invalidpackage");
        Context context = this.f48553d;
        intent.putExtra("app", PendingIntent.getBroadcast(context, 0, intent2, AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL));
        intent.setPackage("com.google.android.gms");
        intent.putExtras(remoteMessage.f48572p0);
        context.sendOrderedBroadcast(intent, "com.google.android.gtalkservice.permission.GTALK_SERVICE");
    }

    public void setAutoInitEnabled(boolean z10) {
        a aVar = this.f48556g;
        synchronized (aVar) {
            try {
                aVar.a();
                j jVar = aVar.f48564c;
                if (jVar != null) {
                    aVar.f48562a.unsubscribe(DataCollectionDefaultChange.class, jVar);
                    aVar.f48564c = null;
                }
                SharedPreferences.Editor editorEdit = FirebaseMessaging.this.f48550a.getApplicationContext().getSharedPreferences(BuildConfig.LIBRARY_PACKAGE_NAME, 0).edit();
                editorEdit.putBoolean("auto_init", z10);
                editorEdit.apply();
                if (z10) {
                    FirebaseMessaging.this.h();
                }
                aVar.f48565d = Boolean.valueOf(z10);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void setDeliveryMetricsExportToBigQuery(boolean z10) {
        FirebaseApp.getInstance().getApplicationContext().getSharedPreferences(BuildConfig.LIBRARY_PACKAGE_NAME, 0).edit().putBoolean("export_to_big_query", z10).apply();
    }

    @NonNull
    public Task<Void> setNotificationDelegationEnabled(boolean z10) {
        if (!PlatformVersion.isAtLeastQ()) {
            return Tasks.forResult(null);
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f48557h.execute(new m(this.f48553d, z10, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    @NonNull
    @SuppressLint({"TaskMainThread"})
    public Task<Void> subscribeToTopic(@NonNull String str) {
        return this.f48560k.onSuccessTask(new hc.a(str));
    }

    @NonNull
    @SuppressLint({"TaskMainThread"})
    public Task<Void> unsubscribeFromTopic(@NonNull String str) {
        return this.f48560k.onSuccessTask(new rb.a(str));
    }

    @NonNull
    @Keep
    public static synchronized FirebaseMessaging getInstance(@NonNull FirebaseApp firebaseApp) {
        FirebaseMessaging firebaseMessaging;
        firebaseMessaging = (FirebaseMessaging) firebaseApp.get(FirebaseMessaging.class);
        Preconditions.checkNotNull(firebaseMessaging, "Firebase Messaging component is not present");
        return firebaseMessaging;
    }
}
