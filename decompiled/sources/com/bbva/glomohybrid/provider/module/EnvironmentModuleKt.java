package com.bbva.glomohybrid.provider.module;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.koin.core.module.Module;
import org.koin.dsl.ModuleDSLKt;

/* JADX INFO: compiled from: EnvironmentModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u0017\u0010\u0005\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lorg/koin/core/module/Module;", "a", "Lorg/koin/core/module/Module;", "getEnvironmentModule", "()Lorg/koin/core/module/Module;", "environmentModule", "app_mexicoProdGoogleRelease"}, k = 2, mv = {1, 9, 0})
public final class EnvironmentModuleKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Module f33962a = ModuleDSLKt.module$default(false, a.f33963p0, 1, null);

    /* JADX INFO: compiled from: EnvironmentModule.kt */
    public static final class a extends Lambda implements Function1<Module, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f33963p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Module module) {
            Module module2 = module;
            Intrinsics.checkNotNullParameter(module2, "$this$module");
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public static final Module getEnvironmentModule() {
        return f33962a;
    }
}
