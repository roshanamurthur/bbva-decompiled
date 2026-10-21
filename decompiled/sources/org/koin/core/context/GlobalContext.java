package org.koin.core.context;

import bk.d;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.KoinApplication;
import org.koin.core.error.KoinAppAlreadyStartedException;
import org.koin.core.module.Module;

/* JADX INFO: compiled from: GlobalContext.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0016J%\u0010\n\u001a\u00020\u00052\u001b\u0010\u000e\u001a\u0017\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00070\u000bj\u0002`\f¢\u0006\u0002\b\rH\u0016J\u0010\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0016\u0010\u0011\u001a\u00020\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0012H\u0016J\u0010\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0016\u0010\u0014\u001a\u00020\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0012H\u0016¨\u0006\u0017"}, d2 = {"Lorg/koin/core/context/GlobalContext;", "Lorg/koin/core/context/KoinContext;", "Lorg/koin/core/Koin;", "get", "getOrNull", "Lorg/koin/core/KoinApplication;", "getKoinApplicationOrNull", "", "stopKoin", "koinApplication", "startKoin", "Lkotlin/Function1;", "Lorg/koin/dsl/KoinAppDeclaration;", "Lkotlin/ExtensionFunctionType;", "appDeclaration", "Lorg/koin/core/module/Module;", "module", "loadKoinModules", "", "modules", "unloadKoinModules", "<init>", "()V", "koin-core"}, k = 1, mv = {1, 8, 0})
public final class GlobalContext implements KoinContext {

    @NotNull
    public static final GlobalContext INSTANCE = new GlobalContext();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public static Koin f92322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public static KoinApplication f92323b;

    @Override // org.koin.core.context.KoinContext
    @NotNull
    public Koin get() {
        Koin koin = f92322a;
        if (koin != null) {
            return koin;
        }
        throw new IllegalStateException("KoinApplication has not been started".toString());
    }

    @Nullable
    public final KoinApplication getKoinApplicationOrNull() {
        return f92323b;
    }

    @Override // org.koin.core.context.KoinContext
    @Nullable
    public Koin getOrNull() {
        return f92322a;
    }

    @Override // org.koin.core.context.KoinContext
    public void loadKoinModules(@NotNull Module module) {
        Intrinsics.checkNotNullParameter(module, "module");
        synchronized (this) {
            Koin.loadModules$default(INSTANCE.get(), d.listOf(module), false, 2, null);
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // org.koin.core.context.KoinContext
    @NotNull
    public KoinApplication startKoin(@NotNull KoinApplication koinApplication) {
        Intrinsics.checkNotNullParameter(koinApplication, "koinApplication");
        synchronized (this) {
            INSTANCE.getClass();
            if (f92322a != null) {
                throw new KoinAppAlreadyStartedException("A Koin Application has already been started");
            }
            f92323b = koinApplication;
            f92322a = koinApplication.getKoin();
            koinApplication.createEagerInstances();
        }
        return koinApplication;
    }

    @Override // org.koin.core.context.KoinContext
    public void stopKoin() {
        synchronized (this) {
            try {
                Koin koin = f92322a;
                if (koin != null) {
                    koin.close();
                }
                f92322a = null;
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // org.koin.core.context.KoinContext
    public void unloadKoinModules(@NotNull Module module) {
        Intrinsics.checkNotNullParameter(module, "module");
        synchronized (this) {
            INSTANCE.get().unloadModules(d.listOf(module));
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // org.koin.core.context.KoinContext
    public void loadKoinModules(@NotNull List<Module> modules) {
        Intrinsics.checkNotNullParameter(modules, "modules");
        synchronized (this) {
            Koin.loadModules$default(INSTANCE.get(), modules, false, 2, null);
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // org.koin.core.context.KoinContext
    public void unloadKoinModules(@NotNull List<Module> modules) {
        Intrinsics.checkNotNullParameter(modules, "modules");
        synchronized (this) {
            INSTANCE.get().unloadModules(modules);
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // org.koin.core.context.KoinContext
    @NotNull
    public KoinApplication startKoin(@NotNull Function1<? super KoinApplication, Unit> appDeclaration) {
        KoinApplication koinApplicationInit;
        Intrinsics.checkNotNullParameter(appDeclaration, "appDeclaration");
        synchronized (this) {
            koinApplicationInit = KoinApplication.INSTANCE.init();
            INSTANCE.getClass();
            if (f92322a == null) {
                f92323b = koinApplicationInit;
                f92322a = koinApplicationInit.getKoin();
                appDeclaration.invoke(koinApplicationInit);
                koinApplicationInit.createEagerInstances();
            } else {
                throw new KoinAppAlreadyStartedException("A Koin Application has already been started");
            }
        }
        return koinApplicationInit;
    }
}
