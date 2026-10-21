package com.google.firebase.installations;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.s1;
import com.bbva.glomohybrid.base.deeplink.extensions.DeepLinkExtensionsKt;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.components.Lazy;
import com.google.firebase.heartbeatinfo.HeartBeatController;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallations;
import com.google.firebase.installations.FirebaseInstallationsException;
import com.google.firebase.installations.internal.FidListener;
import com.google.firebase.installations.internal.FidListenerHandle;
import com.google.firebase.installations.local.IidStore;
import com.google.firebase.installations.local.PersistedInstallation;
import com.google.firebase.installations.local.PersistedInstallationEntry;
import com.google.firebase.installations.remote.FirebaseInstallationServiceClient;
import com.google.firebase.installations.remote.InstallationResponse;
import com.google.firebase.installations.remote.TokenResult;
import ig.g;
import ig.h;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes10.dex */
public class FirebaseInstallations implements FirebaseInstallationsApi {
    public static final Object m = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FirebaseApp f48440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FirebaseInstallationServiceClient f48441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PersistedInstallation f48442c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Utils f48443d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Lazy<IidStore> f48444e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final RandomFidGenerator f48445f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f48446g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ExecutorService f48447h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Executor f48448i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @GuardedBy("this")
    public String f48449j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @GuardedBy("FirebaseInstallations.this")
    public final HashSet f48450k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @GuardedBy("lock")
    public final ArrayList f48451l;

    public class a implements FidListenerHandle {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ FidListener f48452a;

        public a(FidListener fidListener) {
            this.f48452a = fidListener;
        }

        @Override // com.google.firebase.installations.internal.FidListenerHandle
        public final void unregister() {
            synchronized (FirebaseInstallations.this) {
                FirebaseInstallations.this.f48450k.remove(this.f48452a);
            }
        }
    }

    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f48454a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f48455b;

        static {
            int[] iArr = new int[TokenResult.ResponseCode.values().length];
            f48455b = iArr;
            try {
                iArr[TokenResult.ResponseCode.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f48455b[TokenResult.ResponseCode.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f48455b[TokenResult.ResponseCode.AUTH_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[InstallationResponse.ResponseCode.values().length];
            f48454a = iArr2;
            try {
                iArr2[InstallationResponse.ResponseCode.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f48454a[InstallationResponse.ResponseCode.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    static {
        new AtomicInteger(1);
    }

    @SuppressLint({"ThreadPoolCreation"})
    public FirebaseInstallations() {
        throw null;
    }

    @SuppressLint({"ThreadPoolCreation"})
    public FirebaseInstallations(final FirebaseApp firebaseApp, @NonNull Provider<HeartBeatController> provider, @NonNull ExecutorService executorService, @NonNull Executor executor) {
        FirebaseInstallationServiceClient firebaseInstallationServiceClient = new FirebaseInstallationServiceClient(firebaseApp.getApplicationContext(), provider);
        PersistedInstallation persistedInstallation = new PersistedInstallation(firebaseApp);
        Utils utils = Utils.getInstance();
        Lazy<IidStore> lazy = new Lazy<>(new Provider() { // from class: ig.d
            @Override // com.google.firebase.inject.Provider
            public final Object get() {
                Object obj = FirebaseInstallations.m;
                return new IidStore(firebaseApp);
            }
        });
        RandomFidGenerator randomFidGenerator = new RandomFidGenerator();
        this.f48446g = new Object();
        this.f48450k = new HashSet();
        this.f48451l = new ArrayList();
        this.f48440a = firebaseApp;
        this.f48441b = firebaseInstallationServiceClient;
        this.f48442c = persistedInstallation;
        this.f48443d = utils;
        this.f48444e = lazy;
        this.f48445f = randomFidGenerator;
        this.f48447h = executorService;
        this.f48448i = executor;
    }

    @NonNull
    public static FirebaseInstallations getInstance() {
        return getInstance(FirebaseApp.getInstance());
    }

    public final void a(h hVar) {
        synchronized (this.f48446g) {
            this.f48451l.add(hVar);
        }
    }

    public final void b(final boolean z10) {
        PersistedInstallationEntry persistedInstallationEntryValue;
        String iid;
        synchronized (m) {
            try {
                ig.a aVarA = ig.a.a(this.f48440a.getApplicationContext());
                try {
                    persistedInstallationEntryValue = this.f48442c.readPersistedInstallationEntryValue();
                    if (persistedInstallationEntryValue.isNotGenerated()) {
                        FirebaseApp firebaseApp = this.f48440a;
                        boolean zEquals = firebaseApp.getName().equals("CHIME_ANDROID_SDK");
                        RandomFidGenerator randomFidGenerator = this.f48445f;
                        if ((zEquals || firebaseApp.isDefaultApp()) && persistedInstallationEntryValue.shouldAttemptMigration()) {
                            iid = this.f48444e.get().readIid();
                            if (TextUtils.isEmpty(iid)) {
                                iid = randomFidGenerator.createRandomFid();
                            }
                        } else {
                            iid = randomFidGenerator.createRandomFid();
                        }
                        persistedInstallationEntryValue = this.f48442c.insertOrUpdatePersistedInstallationEntry(persistedInstallationEntryValue.withUnregisteredFid(iid));
                    }
                    if (aVarA != null) {
                        aVarA.b();
                    }
                } catch (Throwable th2) {
                    if (aVarA != null) {
                        aVarA.b();
                    }
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (z10) {
            persistedInstallationEntryValue = persistedInstallationEntryValue.withClearedAuthToken();
        }
        i(persistedInstallationEntryValue);
        this.f48448i.execute(new Runnable() { // from class: ig.e
            @Override // java.lang.Runnable
            public final void run() {
                PersistedInstallationEntry persistedInstallationEntryG;
                FirebaseInstallations firebaseInstallations = this.f69676p0;
                boolean z11 = z10;
                Object obj = FirebaseInstallations.m;
                PersistedInstallationEntry persistedInstallationEntryD = firebaseInstallations.d();
                try {
                    if (persistedInstallationEntryD.isErrored() || persistedInstallationEntryD.isUnregistered()) {
                        persistedInstallationEntryG = firebaseInstallations.g(persistedInstallationEntryD);
                    } else {
                        if (!z11 && !firebaseInstallations.f48443d.isAuthTokenExpired(persistedInstallationEntryD)) {
                            return;
                        }
                        persistedInstallationEntryG = firebaseInstallations.c(persistedInstallationEntryD);
                    }
                    firebaseInstallations.e(persistedInstallationEntryG);
                    synchronized (firebaseInstallations) {
                        if (firebaseInstallations.f48450k.size() != 0 && !TextUtils.equals(persistedInstallationEntryD.getFirebaseInstallationId(), persistedInstallationEntryG.getFirebaseInstallationId())) {
                            Iterator it = firebaseInstallations.f48450k.iterator();
                            while (it.hasNext()) {
                                ((FidListener) it.next()).onFidChanged(persistedInstallationEntryG.getFirebaseInstallationId());
                            }
                        }
                    }
                    if (persistedInstallationEntryG.isRegistered()) {
                        firebaseInstallations.j(persistedInstallationEntryG.getFirebaseInstallationId());
                    }
                    if (persistedInstallationEntryG.isErrored()) {
                        firebaseInstallations.h(new FirebaseInstallationsException(FirebaseInstallationsException.Status.BAD_CONFIG));
                    } else if (persistedInstallationEntryG.isNotGenerated()) {
                        firebaseInstallations.h(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
                    } else {
                        firebaseInstallations.i(persistedInstallationEntryG);
                    }
                } catch (FirebaseInstallationsException e5) {
                    firebaseInstallations.h(e5);
                }
            }
        });
    }

    public final PersistedInstallationEntry c(@NonNull PersistedInstallationEntry persistedInstallationEntry) throws FirebaseInstallationsException {
        FirebaseApp firebaseApp = this.f48440a;
        TokenResult tokenResultGenerateAuthToken = this.f48441b.generateAuthToken(firebaseApp.getOptions().getApiKey(), persistedInstallationEntry.getFirebaseInstallationId(), firebaseApp.getOptions().getProjectId(), persistedInstallationEntry.getRefreshToken());
        int i10 = b.f48455b[tokenResultGenerateAuthToken.getResponseCode().ordinal()];
        if (i10 == 1) {
            return persistedInstallationEntry.withAuthToken(tokenResultGenerateAuthToken.getToken(), tokenResultGenerateAuthToken.getTokenExpirationTimestamp(), this.f48443d.currentTimeInSecs());
        }
        if (i10 == 2) {
            return persistedInstallationEntry.withFisError("BAD CONFIG");
        }
        if (i10 != 3) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
        }
        j(null);
        return persistedInstallationEntry.withNoGeneratedFid();
    }

    public final PersistedInstallationEntry d() {
        PersistedInstallationEntry persistedInstallationEntryValue;
        synchronized (m) {
            try {
                ig.a aVarA = ig.a.a(this.f48440a.getApplicationContext());
                try {
                    persistedInstallationEntryValue = this.f48442c.readPersistedInstallationEntryValue();
                    if (aVarA != null) {
                        aVarA.b();
                    }
                } catch (Throwable th2) {
                    if (aVarA != null) {
                        aVarA.b();
                    }
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return persistedInstallationEntryValue;
    }

    @Override // com.google.firebase.installations.FirebaseInstallationsApi
    @NonNull
    public Task<Void> delete() {
        return Tasks.call(this.f48447h, new Callable() { // from class: ig.b
            @Override // java.util.concurrent.Callable
            public final Object call() throws FirebaseInstallationsException {
                Object obj = FirebaseInstallations.m;
                FirebaseInstallations firebaseInstallations = this.f69672p0;
                firebaseInstallations.j(null);
                PersistedInstallationEntry persistedInstallationEntryD = firebaseInstallations.d();
                if (persistedInstallationEntryD.isRegistered()) {
                    FirebaseApp firebaseApp = firebaseInstallations.f48440a;
                    firebaseInstallations.f48441b.deleteFirebaseInstallation(firebaseApp.getOptions().getApiKey(), persistedInstallationEntryD.getFirebaseInstallationId(), firebaseApp.getOptions().getProjectId(), persistedInstallationEntryD.getRefreshToken());
                }
                firebaseInstallations.e(persistedInstallationEntryD.withNoGeneratedFid());
                return null;
            }
        });
    }

    public final void e(PersistedInstallationEntry persistedInstallationEntry) {
        synchronized (m) {
            try {
                ig.a aVarA = ig.a.a(this.f48440a.getApplicationContext());
                try {
                    this.f48442c.insertOrUpdatePersistedInstallationEntry(persistedInstallationEntry);
                    if (aVarA != null) {
                        aVarA.b();
                    }
                } catch (Throwable th2) {
                    if (aVarA != null) {
                        aVarA.b();
                    }
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void f() {
        FirebaseApp firebaseApp = this.f48440a;
        Preconditions.checkNotEmpty(firebaseApp.getOptions().getApplicationId(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.checkNotEmpty(firebaseApp.getOptions().getProjectId(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.checkNotEmpty(firebaseApp.getOptions().getApiKey(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        String applicationId = firebaseApp.getOptions().getApplicationId();
        Pattern pattern = Utils.f48459b;
        Preconditions.checkArgument(applicationId.contains(DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.checkArgument(Utils.f48459b.matcher(firebaseApp.getOptions().getApiKey()).matches(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    public final PersistedInstallationEntry g(PersistedInstallationEntry persistedInstallationEntry) throws FirebaseInstallationsException {
        String token = (persistedInstallationEntry.getFirebaseInstallationId() == null || persistedInstallationEntry.getFirebaseInstallationId().length() != 11) ? null : this.f48444e.get().readToken();
        FirebaseInstallationServiceClient firebaseInstallationServiceClient = this.f48441b;
        FirebaseApp firebaseApp = this.f48440a;
        InstallationResponse installationResponseCreateFirebaseInstallation = firebaseInstallationServiceClient.createFirebaseInstallation(firebaseApp.getOptions().getApiKey(), persistedInstallationEntry.getFirebaseInstallationId(), firebaseApp.getOptions().getProjectId(), firebaseApp.getOptions().getApplicationId(), token);
        int i10 = b.f48454a[installationResponseCreateFirebaseInstallation.getResponseCode().ordinal()];
        if (i10 == 1) {
            return persistedInstallationEntry.withRegisteredFid(installationResponseCreateFirebaseInstallation.getFid(), installationResponseCreateFirebaseInstallation.getRefreshToken(), this.f48443d.currentTimeInSecs(), installationResponseCreateFirebaseInstallation.getAuthToken().getToken(), installationResponseCreateFirebaseInstallation.getAuthToken().getTokenExpirationTimestamp());
        }
        if (i10 == 2) {
            return persistedInstallationEntry.withFisError("BAD CONFIG");
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
    }

    @Override // com.google.firebase.installations.FirebaseInstallationsApi
    @NonNull
    public Task<String> getId() {
        String str;
        f();
        synchronized (this) {
            str = this.f48449j;
        }
        if (str != null) {
            return Tasks.forResult(str);
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        a(new g(taskCompletionSource));
        Task<String> task = taskCompletionSource.getTask();
        this.f48447h.execute(new s1(this, 7));
        return task;
    }

    @Override // com.google.firebase.installations.FirebaseInstallationsApi
    @NonNull
    public Task<InstallationTokenResult> getToken(final boolean z10) {
        f();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        a(new com.google.firebase.installations.b(this.f48443d, taskCompletionSource));
        Task<InstallationTokenResult> task = taskCompletionSource.getTask();
        this.f48447h.execute(new Runnable() { // from class: ig.c
            @Override // java.lang.Runnable
            public final void run() {
                Object obj = FirebaseInstallations.m;
                this.f69673p0.b(z10);
            }
        });
        return task;
    }

    public final void h(Exception exc) {
        synchronized (this.f48446g) {
            try {
                Iterator it = this.f48451l.iterator();
                while (it.hasNext()) {
                    if (((h) it.next()).a(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void i(PersistedInstallationEntry persistedInstallationEntry) {
        synchronized (this.f48446g) {
            try {
                Iterator it = this.f48451l.iterator();
                while (it.hasNext()) {
                    if (((h) it.next()).b(persistedInstallationEntry)) {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final synchronized void j(String str) {
        this.f48449j = str;
    }

    @Override // com.google.firebase.installations.FirebaseInstallationsApi
    @NonNull
    public synchronized FidListenerHandle registerFidListener(@NonNull FidListener fidListener) {
        this.f48450k.add(fidListener);
        return new a(fidListener);
    }

    @NonNull
    public static FirebaseInstallations getInstance(@NonNull FirebaseApp firebaseApp) {
        Preconditions.checkArgument(firebaseApp != null, "Null is not a valid value of FirebaseApp.");
        return (FirebaseInstallations) firebaseApp.get(FirebaseInstallationsApi.class);
    }
}
