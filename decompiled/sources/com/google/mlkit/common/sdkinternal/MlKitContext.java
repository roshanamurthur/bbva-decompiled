package com.google.mlkit.common.sdkinternal;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskExecutors;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentDiscovery;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.ComponentRuntime;
import com.google.mlkit.common.internal.MlKitComponentDiscoveryService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.mlkit:common@@18.11.0 */
/* JADX INFO: loaded from: classes10.dex */
@KeepForSdk
public class MlKitContext {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f49413b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public static MlKitContext f49414c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public ComponentRuntime f49415a;

    @NonNull
    @KeepForSdk
    public static MlKitContext getInstance() {
        MlKitContext mlKitContext;
        synchronized (f49413b) {
            Preconditions.checkState(f49414c != null, "MlKitContext has not been initialized");
            mlKitContext = (MlKitContext) Preconditions.checkNotNull(f49414c);
        }
        return mlKitContext;
    }

    @NonNull
    @KeepForSdk
    public static MlKitContext initialize(@NonNull Context context, @NonNull List<ComponentRegistrar> list) {
        MlKitContext mlKitContext;
        synchronized (f49413b) {
            try {
                Preconditions.checkState(f49414c == null, "MlKitContext is already initialized");
                MlKitContext mlKitContext2 = new MlKitContext();
                f49414c = mlKitContext2;
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    context = applicationContext;
                }
                HashMap map = new HashMap();
                for (ComponentRegistrar componentRegistrar : list) {
                    map.put(componentRegistrar.getClass(), componentRegistrar);
                }
                ComponentRuntime componentRuntime = new ComponentRuntime(TaskExecutors.MAIN_THREAD, new ArrayList(map.values()), Component.of(context, (Class<Context>) Context.class, (Class<? super Context>[]) new Class[0]), Component.of(mlKitContext2, (Class<MlKitContext>) MlKitContext.class, (Class<? super MlKitContext>[]) new Class[0]));
                mlKitContext2.f49415a = componentRuntime;
                componentRuntime.initializeEagerComponents(true);
                mlKitContext = f49414c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return mlKitContext;
    }

    @NonNull
    @KeepForSdk
    public static MlKitContext initializeIfNeeded(@NonNull Context context) {
        MlKitContext mlKitContextZza;
        synchronized (f49413b) {
            mlKitContextZza = f49414c;
            if (mlKitContextZza == null) {
                mlKitContextZza = zza(context);
            }
        }
        return mlKitContextZza;
    }

    @NonNull
    public static MlKitContext zza(@NonNull Context context) {
        MlKitContext mlKitContextZzb;
        synchronized (f49413b) {
            mlKitContextZzb = zzb(context, TaskExecutors.MAIN_THREAD);
        }
        return mlKitContextZzb;
    }

    @NonNull
    public static MlKitContext zzb(@NonNull Context context, @NonNull Executor executor) {
        MlKitContext mlKitContext;
        synchronized (f49413b) {
            Preconditions.checkState(f49414c == null, "MlKitContext is already initialized");
            MlKitContext mlKitContext2 = new MlKitContext();
            f49414c = mlKitContext2;
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            ComponentRuntime componentRuntimeBuild = ComponentRuntime.builder(executor).addLazyComponentRegistrars(ComponentDiscovery.forContext(context, MlKitComponentDiscoveryService.class).discoverLazy()).addComponent(Component.of(context, (Class<Context>) Context.class, (Class<? super Context>[]) new Class[0])).addComponent(Component.of(mlKitContext2, (Class<MlKitContext>) MlKitContext.class, (Class<? super MlKitContext>[]) new Class[0])).build();
            mlKitContext2.f49415a = componentRuntimeBuild;
            componentRuntimeBuild.initializeEagerComponents(true);
            mlKitContext = f49414c;
        }
        return mlKitContext;
    }

    @NonNull
    @KeepForSdk
    public <T> T get(@NonNull Class<T> cls) {
        Preconditions.checkState(f49414c == this, "MlKitContext has been deleted");
        Preconditions.checkNotNull(this.f49415a);
        return (T) this.f49415a.get(cls);
    }

    @NonNull
    @KeepForSdk
    public Context getApplicationContext() {
        return (Context) get(Context.class);
    }

    @NonNull
    @KeepForSdk
    public static MlKitContext initializeIfNeeded(@NonNull Context context, @NonNull List<ComponentRegistrar> list) {
        MlKitContext mlKitContextInitialize;
        synchronized (f49413b) {
            mlKitContextInitialize = f49414c;
            if (mlKitContextInitialize == null) {
                mlKitContextInitialize = initialize(context, list);
            }
        }
        return mlKitContextInitialize;
    }

    @NonNull
    @KeepForSdk
    public static MlKitContext initializeIfNeeded(@NonNull Context context, @NonNull Executor executor) {
        MlKitContext mlKitContextZzb;
        synchronized (f49413b) {
            mlKitContextZzb = f49414c;
            if (mlKitContextZzb == null) {
                mlKitContextZzb = zzb(context, executor);
            }
        }
        return mlKitContextZzb;
    }
}
