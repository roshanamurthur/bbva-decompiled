package com.google.firebase.iid;

import android.content.SharedPreferences;
import android.os.Looper;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import androidx.webkit.ProxyConfig;
import com.bbva.glomohybrid.base.deeplink.extensions.DeepLinkExtensionsKt;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.splitinstall.internal.l;
import com.google.firebase.FirebaseApp;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.messaging.Constants;
import com.google.firebase.platforminfo.UserAgentPublisher;
import hg.c;
import hg.m;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: compiled from: com.google.firebase:firebase-iid@@21.1.0 */
/* JADX INFO: loaded from: classes10.dex */
@Deprecated
public class FirebaseInstanceId {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static a f48403j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @VisibleForTesting
    @GuardedBy("FirebaseInstanceId.class")
    public static ScheduledThreadPoolExecutor f48405l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @VisibleForTesting
    public final Executor f48406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FirebaseApp f48407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Metadata f48408c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final GmsRpc f48409d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m f48410e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final FirebaseInstallationsApi f48411f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @GuardedBy("this")
    public boolean f48412g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f48413h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final long f48402i = TimeUnit.HOURS.toSeconds(8);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Pattern f48404k = Pattern.compile("\\AA[\\w-]{38}\\z");

    public FirebaseInstanceId() {
        throw null;
    }

    public FirebaseInstanceId(FirebaseApp firebaseApp, Provider<UserAgentPublisher> provider, Provider<HeartBeatInfo> provider2, FirebaseInstallationsApi firebaseInstallationsApi) {
        Metadata metadata = new Metadata(firebaseApp.getApplicationContext());
        ThreadPoolExecutor threadPoolExecutorA = l.a();
        ThreadPoolExecutor threadPoolExecutorA2 = l.a();
        this.f48412g = false;
        this.f48413h = new ArrayList();
        if (Metadata.getDefaultSenderId(firebaseApp) == null) {
            throw new IllegalStateException("FirebaseInstanceId failed to initialize, FirebaseApp is missing project ID");
        }
        synchronized (FirebaseInstanceId.class) {
            try {
                if (f48403j == null) {
                    f48403j = new a(firebaseApp.getApplicationContext());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f48407b = firebaseApp;
        this.f48408c = metadata;
        this.f48409d = new GmsRpc(firebaseApp, metadata, provider, provider2, firebaseInstallationsApi);
        this.f48406a = threadPoolExecutorA2;
        this.f48410e = new m(threadPoolExecutorA);
        this.f48411f = firebaseInstallationsApi;
    }

    public static <T> T b(@NonNull Task<T> task) throws InterruptedException {
        Preconditions.checkNotNull(task, "Task must not be null");
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        task.addOnCompleteListener(c.f69427p0, new OnCompleteListener(countDownLatch) { // from class: hg.d

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CountDownLatch f69428a;

            {
                this.f69428a = countDownLatch;
            }

            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task2) {
                com.google.firebase.iid.a aVar = FirebaseInstanceId.f48403j;
                this.f69428a.countDown();
            }
        });
        countDownLatch.await(30000L, TimeUnit.MILLISECONDS);
        if (task.isSuccessful()) {
            return task.getResult();
        }
        if (task.isCanceled()) {
            throw new CancellationException("Task is already canceled");
        }
        if (task.isComplete()) {
            throw new IllegalStateException(task.getException());
        }
        throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
    }

    public static void c(@NonNull FirebaseApp firebaseApp) {
        Preconditions.checkNotEmpty(firebaseApp.getOptions().getProjectId(), "Please set your project ID. A valid Firebase project ID is required to communicate with Firebase server APIs: It identifies your project with Google.");
        Preconditions.checkNotEmpty(firebaseApp.getOptions().getApplicationId(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.");
        Preconditions.checkNotEmpty(firebaseApp.getOptions().getApiKey(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.");
        Preconditions.checkArgument(firebaseApp.getOptions().getApplicationId().contains(DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.checkArgument(f48404k.matcher(firebaseApp.getOptions().getApiKey()).matches(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    @VisibleForTesting
    @KeepForSdk
    public static synchronized void clearInstancesForTest() {
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = f48405l;
            if (scheduledThreadPoolExecutor != null) {
                scheduledThreadPoolExecutor.shutdownNow();
            }
            f48405l = null;
            f48403j = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static void d(b bVar, long j10) {
        synchronized (FirebaseInstanceId.class) {
            try {
                if (f48405l == null) {
                    f48405l = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("FirebaseInstanceId"));
                }
                f48405l.schedule(bVar, j10, TimeUnit.SECONDS);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NonNull
    public static FirebaseInstanceId getInstance() {
        return getInstance(FirebaseApp.getInstance());
    }

    public final <T> T a(Task<T> task) throws IOException {
        try {
            return (T) Tasks.await(task, 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | TimeoutException unused) {
            throw new IOException(GmsRpc.ERROR_SERVICE_NOT_AVAILABLE);
        } catch (ExecutionException e5) {
            Throwable cause = e5.getCause();
            if (!(cause instanceof IOException)) {
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                throw new IOException(e5);
            }
            if ("INSTANCE_ID_RESET".equals(cause.getMessage())) {
                synchronized (this) {
                    f48403j.c();
                }
            }
            throw ((IOException) cause);
        }
    }

    @WorkerThread
    @Deprecated
    public void deleteInstanceId() throws IOException {
        c(this.f48407b);
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IOException("MAIN_THREAD");
        }
        a(this.f48411f.delete());
        synchronized (this) {
            f48403j.c();
        }
    }

    @WorkerThread
    @Deprecated
    public void deleteToken(@NonNull String str, @NonNull String str2) throws IOException {
        c(this.f48407b);
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IOException("MAIN_THREAD");
        }
        if (str2.isEmpty() || str2.equalsIgnoreCase("fcm") || str2.equalsIgnoreCase(Constants.MessageTypes.MESSAGE)) {
            str2 = ProxyConfig.MATCH_ALL_SCHEMES;
        }
        a(this.f48409d.deleteToken(e(), str, str2));
        a aVar = f48403j;
        String strF = f();
        synchronized (aVar) {
            String strB = a.b(strF, str, str2);
            SharedPreferences.Editor editorEdit = aVar.f48429a.edit();
            editorEdit.remove(strB);
            editorEdit.commit();
        }
    }

    public final String e() {
        try {
            f48403j.d(this.f48407b.getPersistenceKey());
            return (String) b(this.f48411f.getId());
        } catch (InterruptedException e5) {
            throw new IllegalStateException(e5);
        }
    }

    public final String f() {
        FirebaseApp firebaseApp = this.f48407b;
        return "[DEFAULT]".equals(firebaseApp.getName()) ? "" : firebaseApp.getPersistenceKey();
    }

    @Nullable
    @VisibleForTesting
    public final a.C0211a g(String str, String str2) {
        a.C0211a c0211aB;
        a aVar = f48403j;
        String strF = f();
        synchronized (aVar) {
            c0211aB = a.C0211a.b(aVar.f48429a.getString(a.b(strF, str, str2), null));
        }
        return c0211aB;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public long getCreationTime() {
        long jLongValue;
        a aVar = f48403j;
        String persistenceKey = this.f48407b.getPersistenceKey();
        synchronized (aVar) {
            Long l6 = (Long) aVar.f48430b.get(persistenceKey);
            if (l6 != null) {
                jLongValue = l6.longValue();
            } else {
                String string = aVar.f48429a.getString(a.a(persistenceKey), null);
                if (string != null) {
                    try {
                        jLongValue = Long.parseLong(string);
                    } catch (NumberFormatException unused) {
                        jLongValue = 0;
                    }
                } else {
                    jLongValue = 0;
                }
            }
        }
        return jLongValue;
    }

    @NonNull
    @WorkerThread
    @Deprecated
    public String getId() {
        c(this.f48407b);
        if (j(g(Metadata.getDefaultSenderId(this.f48407b), ProxyConfig.MATCH_ALL_SCHEMES))) {
            synchronized (this) {
                if (!this.f48412g) {
                    i(0L);
                }
            }
        }
        return e();
    }

    @NonNull
    @Deprecated
    public Task<InstanceIdResult> getInstanceId() {
        FirebaseApp firebaseApp = this.f48407b;
        c(firebaseApp);
        String defaultSenderId = Metadata.getDefaultSenderId(firebaseApp);
        return Tasks.forResult(null).continueWithTask(this.f48406a, new hg.b(this, defaultSenderId, ProxyConfig.MATCH_ALL_SCHEMES));
    }

    @Nullable
    @Deprecated
    public String getToken() {
        c(this.f48407b);
        a.C0211a c0211aG = g(Metadata.getDefaultSenderId(this.f48407b), ProxyConfig.MATCH_ALL_SCHEMES);
        if (j(c0211aG)) {
            synchronized (this) {
                if (!this.f48412g) {
                    i(0L);
                }
            }
        }
        if (c0211aG != null) {
            return c0211aG.f48433a;
        }
        int i10 = a.C0211a.f48432e;
        return null;
    }

    public final synchronized void h(boolean z10) {
        this.f48412g = z10;
    }

    public final synchronized void i(long j10) {
        d(new b(this, Math.min(Math.max(30L, j10 + j10), f48402i)), j10);
        this.f48412g = true;
    }

    @VisibleForTesting
    @KeepForSdk
    public boolean isFcmAutoInitEnabled() {
        throw new IllegalStateException("FirebaseMessaging version not supported. Update to latest version.");
    }

    @VisibleForTesting
    public boolean isGmsCorePresent() {
        return this.f48408c.isGmscorePresent();
    }

    public final boolean j(@Nullable a.C0211a c0211a) {
        if (c0211a != null) {
            return System.currentTimeMillis() > c0211a.f48435c + a.C0211a.f48431d || !this.f48408c.getAppVersionCode().equals(c0211a.f48434b);
        }
        return true;
    }

    @VisibleForTesting
    @KeepForSdk
    public void setFcmAutoInitEnabled(boolean z10) {
        throw new IllegalStateException("FirebaseMessaging version not supported. Update to latest version.");
    }

    @NonNull
    @Keep
    public static FirebaseInstanceId getInstance(@NonNull FirebaseApp firebaseApp) {
        c(firebaseApp);
        FirebaseInstanceId firebaseInstanceId = (FirebaseInstanceId) firebaseApp.get(FirebaseInstanceId.class);
        Preconditions.checkNotNull(firebaseInstanceId, "Firebase Instance ID component is not present");
        return firebaseInstanceId;
    }

    @Nullable
    @WorkerThread
    @Deprecated
    public String getToken(@NonNull String str, @NonNull String str2) throws IOException {
        c(this.f48407b);
        if (Looper.getMainLooper() != Looper.myLooper()) {
            if (str2.isEmpty() || str2.equalsIgnoreCase("fcm") || str2.equalsIgnoreCase(Constants.MessageTypes.MESSAGE)) {
                str2 = ProxyConfig.MATCH_ALL_SCHEMES;
            }
            return ((InstanceIdResult) a(Tasks.forResult(null).continueWithTask(this.f48406a, new hg.b(this, str, str2)))).getToken();
        }
        throw new IOException("MAIN_THREAD");
    }
}
