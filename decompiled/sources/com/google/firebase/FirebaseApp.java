package com.google.firebase;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.collection.ArrayMap;
import androidx.core.os.UserManagerCompat;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.firebase.FirebaseApp;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentDiscovery;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.ComponentRuntime;
import com.google.firebase.components.Lazy;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.concurrent.UiExecutor;
import com.google.firebase.events.Publisher;
import com.google.firebase.heartbeatinfo.DefaultHeartBeatController;
import com.google.firebase.inject.Provider;
import com.google.firebase.internal.DataCollectionConfigStorage;
import com.google.firebase.provider.FirebaseInitProvider;
import com.google.firebase.tracing.ComponentMonitor;
import com.google.firebase.tracing.FirebaseTrace;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public class FirebaseApp {

    @NonNull
    public static final String DEFAULT_APP_NAME = "[DEFAULT]";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Object f47542k = new Object();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @GuardedBy("LOCK")
    public static final ArrayMap f47543l = new ArrayMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f47544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f47545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FirebaseOptions f47546c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ComponentRuntime f47547d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Lazy<DataCollectionConfigStorage> f47550g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Provider<DefaultHeartBeatController> f47551h;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f47548e = new AtomicBoolean(false);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f47549f = new AtomicBoolean();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final CopyOnWriteArrayList f47552i = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final CopyOnWriteArrayList f47553j = new CopyOnWriteArrayList();

    @KeepForSdk
    public interface BackgroundStateChangeListener {
        @KeepForSdk
        void onBackgroundStateChanged(boolean z10);
    }

    @TargetApi(14)
    public static class a implements BackgroundDetector.BackgroundStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AtomicReference<a> f47554a = new AtomicReference<>();

        @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
        public final void onBackgroundStateChanged(boolean z10) {
            synchronized (FirebaseApp.f47542k) {
                try {
                    for (FirebaseApp firebaseApp : new ArrayList(FirebaseApp.f47543l.values())) {
                        if (firebaseApp.f47548e.get()) {
                            firebaseApp.d(z10);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @TargetApi(24)
    public static class b extends BroadcastReceiver {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final AtomicReference<b> f47555b = new AtomicReference<>();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f47556a;

        public b(Context context) {
            this.f47556a = context;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            synchronized (FirebaseApp.f47542k) {
                try {
                    Iterator it = FirebaseApp.f47543l.values().iterator();
                    while (it.hasNext()) {
                        ((FirebaseApp) it.next()).c();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f47556a.unregisterReceiver(this);
        }
    }

    public FirebaseApp(final Context context, String str, FirebaseOptions firebaseOptions) {
        this.f47544a = (Context) Preconditions.checkNotNull(context);
        this.f47545b = Preconditions.checkNotEmpty(str);
        this.f47546c = (FirebaseOptions) Preconditions.checkNotNull(firebaseOptions);
        StartupTime startupTime = FirebaseInitProvider.getStartupTime();
        FirebaseTrace.pushTrace("Firebase");
        FirebaseTrace.pushTrace("ComponentDiscovery");
        List<Provider<ComponentRegistrar>> listDiscoverLazy = ComponentDiscovery.forContext(context, ComponentDiscoveryService.class).discoverLazy();
        FirebaseTrace.popTrace();
        FirebaseTrace.pushTrace("Runtime");
        ComponentRuntime.Builder processor = ComponentRuntime.builder(UiExecutor.INSTANCE).addLazyComponentRegistrars(listDiscoverLazy).addComponentRegistrar(new FirebaseCommonRegistrar()).addComponentRegistrar(new ExecutorsRegistrar()).addComponent(Component.of(context, (Class<Context>) Context.class, (Class<? super Context>[]) new Class[0])).addComponent(Component.of(this, (Class<FirebaseApp>) FirebaseApp.class, (Class<? super FirebaseApp>[]) new Class[0])).addComponent(Component.of(firebaseOptions, (Class<FirebaseOptions>) FirebaseOptions.class, (Class<? super FirebaseOptions>[]) new Class[0])).setProcessor(new ComponentMonitor());
        if (UserManagerCompat.isUserUnlocked(context) && FirebaseInitProvider.isCurrentlyInitializing()) {
            processor.addComponent(Component.of(startupTime, (Class<StartupTime>) StartupTime.class, (Class<? super StartupTime>[]) new Class[0]));
        }
        ComponentRuntime componentRuntimeBuild = processor.build();
        this.f47547d = componentRuntimeBuild;
        FirebaseTrace.popTrace();
        this.f47550g = new Lazy<>(new Provider() { // from class: of.b
            @Override // com.google.firebase.inject.Provider
            public final Object get() {
                String str2 = FirebaseApp.DEFAULT_APP_NAME;
                FirebaseApp firebaseApp = this.f85399a;
                return new DataCollectionConfigStorage(context, firebaseApp.getPersistenceKey(), (Publisher) firebaseApp.f47547d.get(Publisher.class));
            }
        });
        this.f47551h = componentRuntimeBuild.getProvider(DefaultHeartBeatController.class);
        addBackgroundStateChangeListener(new BackgroundStateChangeListener() { // from class: of.c
            @Override // com.google.firebase.FirebaseApp.BackgroundStateChangeListener
            public final void onBackgroundStateChanged(boolean z10) {
                FirebaseApp firebaseApp = this.f85401a;
                if (!z10) {
                    firebaseApp.f47551h.get().registerHeartBeat();
                } else {
                    String str2 = FirebaseApp.DEFAULT_APP_NAME;
                    firebaseApp.getClass();
                }
            }
        });
        FirebaseTrace.popTrace();
    }

    public static ArrayList b() {
        ArrayList arrayList = new ArrayList();
        synchronized (f47542k) {
            try {
                Iterator it = f47543l.values().iterator();
                while (it.hasNext()) {
                    arrayList.add(((FirebaseApp) it.next()).getName());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    @VisibleForTesting
    public static void clearInstancesForTest() {
        synchronized (f47542k) {
            f47543l.clear();
        }
    }

    @NonNull
    public static List<FirebaseApp> getApps(@NonNull Context context) {
        ArrayList arrayList;
        synchronized (f47542k) {
            arrayList = new ArrayList(f47543l.values());
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    public static FirebaseApp getInstance() {
        FirebaseApp firebaseApp;
        synchronized (f47542k) {
            try {
                firebaseApp = (FirebaseApp) f47543l.get("[DEFAULT]");
                if (firebaseApp == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + ProcessUtils.getMyProcessName() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                firebaseApp.f47551h.get().registerHeartBeat();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return firebaseApp;
    }

    @Nullable
    public static FirebaseApp initializeApp(@NonNull Context context) {
        synchronized (f47542k) {
            try {
                if (f47543l.containsKey("[DEFAULT]")) {
                    return getInstance();
                }
                FirebaseOptions firebaseOptionsFromResource = FirebaseOptions.fromResource(context);
                if (firebaseOptionsFromResource == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                return initializeApp(context, firebaseOptionsFromResource);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void a() {
        Preconditions.checkState(!this.f47549f.get(), "FirebaseApp was deleted");
    }

    @KeepForSdk
    public void addBackgroundStateChangeListener(BackgroundStateChangeListener backgroundStateChangeListener) {
        a();
        if (this.f47548e.get() && BackgroundDetector.getInstance().isInBackground()) {
            backgroundStateChangeListener.onBackgroundStateChanged(true);
        }
        this.f47552i.add(backgroundStateChangeListener);
    }

    @KeepForSdk
    public void addLifecycleEventListener(@NonNull FirebaseAppLifecycleListener firebaseAppLifecycleListener) {
        a();
        Preconditions.checkNotNull(firebaseAppLifecycleListener);
        this.f47553j.add(firebaseAppLifecycleListener);
    }

    public final void c() {
        Context context = this.f47544a;
        if (!(!UserManagerCompat.isUserUnlocked(context))) {
            getName();
            this.f47547d.initializeEagerComponents(isDefaultApp());
            this.f47551h.get().registerHeartBeat();
            return;
        }
        getName();
        AtomicReference<b> atomicReference = b.f47555b;
        if (atomicReference.get() == null) {
            b bVar = new b(context);
            while (!atomicReference.compareAndSet(null, bVar)) {
                if (atomicReference.get() != null) {
                    return;
                }
            }
            context.registerReceiver(bVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
        }
    }

    public final void d(boolean z10) {
        Iterator it = this.f47552i.iterator();
        while (it.hasNext()) {
            ((BackgroundStateChangeListener) it.next()).onBackgroundStateChanged(z10);
        }
    }

    public void delete() {
        if (this.f47549f.compareAndSet(false, true)) {
            synchronized (f47542k) {
                f47543l.remove(this.f47545b);
            }
            Iterator it = this.f47553j.iterator();
            while (it.hasNext()) {
                ((FirebaseAppLifecycleListener) it.next()).onDeleted(this.f47545b, this.f47546c);
            }
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof FirebaseApp)) {
            return false;
        }
        return this.f47545b.equals(((FirebaseApp) obj).getName());
    }

    @KeepForSdk
    public <T> T get(Class<T> cls) {
        a();
        return (T) this.f47547d.get(cls);
    }

    @NonNull
    public Context getApplicationContext() {
        a();
        return this.f47544a;
    }

    @NonNull
    public String getName() {
        a();
        return this.f47545b;
    }

    @NonNull
    public FirebaseOptions getOptions() {
        a();
        return this.f47546c;
    }

    @KeepForSdk
    public String getPersistenceKey() {
        return Base64Utils.encodeUrlSafeNoPadding(getName().getBytes(Charset.defaultCharset())) + "+" + Base64Utils.encodeUrlSafeNoPadding(getOptions().getApplicationId().getBytes(Charset.defaultCharset()));
    }

    public int hashCode() {
        return this.f47545b.hashCode();
    }

    @KeepForSdk
    public boolean isDataCollectionDefaultEnabled() {
        a();
        return this.f47550g.get().isEnabled();
    }

    @KeepForSdk
    @VisibleForTesting
    public boolean isDefaultApp() {
        return "[DEFAULT]".equals(getName());
    }

    @KeepForSdk
    public void removeBackgroundStateChangeListener(BackgroundStateChangeListener backgroundStateChangeListener) {
        a();
        this.f47552i.remove(backgroundStateChangeListener);
    }

    @KeepForSdk
    public void removeLifecycleEventListener(@NonNull FirebaseAppLifecycleListener firebaseAppLifecycleListener) {
        a();
        Preconditions.checkNotNull(firebaseAppLifecycleListener);
        this.f47553j.remove(firebaseAppLifecycleListener);
    }

    public void setAutomaticResourceManagementEnabled(boolean z10) {
        a();
        if (this.f47548e.compareAndSet(!z10, z10)) {
            boolean zIsInBackground = BackgroundDetector.getInstance().isInBackground();
            if (z10 && zIsInBackground) {
                d(true);
            } else {
                if (z10 || !zIsInBackground) {
                    return;
                }
                d(false);
            }
        }
    }

    @KeepForSdk
    public void setDataCollectionDefaultEnabled(Boolean bool) {
        a();
        this.f47550g.get().setEnabled(bool);
    }

    public String toString() {
        return Objects.toStringHelper(this).add("name", this.f47545b).add("options", this.f47546c).toString();
    }

    @KeepForSdk
    @Deprecated
    public void setDataCollectionDefaultEnabled(boolean z10) {
        setDataCollectionDefaultEnabled(Boolean.valueOf(z10));
    }

    @KeepForSdk
    public static String getPersistenceKey(String str, FirebaseOptions firebaseOptions) {
        return Base64Utils.encodeUrlSafeNoPadding(str.getBytes(Charset.defaultCharset())) + "+" + Base64Utils.encodeUrlSafeNoPadding(firebaseOptions.getApplicationId().getBytes(Charset.defaultCharset()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    public static FirebaseApp getInstance(@NonNull String str) {
        FirebaseApp firebaseApp;
        String str2;
        synchronized (f47542k) {
            try {
                firebaseApp = (FirebaseApp) f47543l.get(str.trim());
                if (firebaseApp != null) {
                    firebaseApp.f47551h.get().registerHeartBeat();
                } else {
                    ArrayList arrayListB = b();
                    if (arrayListB.isEmpty()) {
                        str2 = "";
                    } else {
                        str2 = "Available app names: " + TextUtils.join(", ", arrayListB);
                    }
                    throw new IllegalStateException(String.format("FirebaseApp with name %s doesn't exist. %s", str, str2));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return firebaseApp;
    }

    @NonNull
    public static FirebaseApp initializeApp(@NonNull Context context, @NonNull FirebaseOptions firebaseOptions) {
        return initializeApp(context, firebaseOptions, "[DEFAULT]");
    }

    @NonNull
    public static FirebaseApp initializeApp(@NonNull Context context, @NonNull FirebaseOptions firebaseOptions, @NonNull String str) {
        FirebaseApp firebaseApp;
        AtomicReference<a> atomicReference = a.f47554a;
        if (PlatformVersion.isAtLeastIceCreamSandwich() && (context.getApplicationContext() instanceof Application)) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference<a> atomicReference2 = a.f47554a;
            if (atomicReference2.get() == null) {
                a aVar = new a();
                do {
                    if (atomicReference2.compareAndSet(null, aVar)) {
                        BackgroundDetector.initialize(application);
                        BackgroundDetector.getInstance().addListener(aVar);
                        break;
                    }
                } while (atomicReference2.get() == null);
            }
        }
        String strTrim = str.trim();
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f47542k) {
            ArrayMap arrayMap = f47543l;
            Preconditions.checkState(!arrayMap.containsKey(strTrim), "FirebaseApp name " + strTrim + " already exists!");
            Preconditions.checkNotNull(context, "Application context cannot be null.");
            firebaseApp = new FirebaseApp(context, strTrim, firebaseOptions);
            arrayMap.put(strTrim, firebaseApp);
        }
        firebaseApp.c();
        return firebaseApp;
    }
}
