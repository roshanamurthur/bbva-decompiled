package org.koin.dsl;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.koin.core.module.KoinDslMarker;
import org.koin.core.module.Module;

/* JADX INFO: compiled from: ModuleDSL.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a9\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u001b\u0010\u0005\u001a\u0017\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00070\u0006j\u0002`\b¢\u0006\u0002\b\tH\u0007\u001a/\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u001b\u0010\u0005\u001a\u0017\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00070\u0006j\u0002`\b¢\u0006\u0002\b\tH\u0007*,\u0010\n\"\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\t2\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\t¨\u0006\u000b"}, d2 = {"module", "Lorg/koin/core/module/Module;", "createdAtStart", "", "override", "moduleDeclaration", "Lkotlin/Function1;", "", "Lorg/koin/dsl/ModuleDeclaration;", "Lkotlin/ExtensionFunctionType;", "ModuleDeclaration", "koin-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ModuleDSLKt {
    @Deprecated(message = "'override' parameter is not used anymore. See 'allowOverride' in KoinApplication")
    @KoinDslMarker
    @NotNull
    public static final Module module(boolean z10, boolean z11, @NotNull Function1<? super Module, Unit> moduleDeclaration) {
        Intrinsics.checkNotNullParameter(moduleDeclaration, "moduleDeclaration");
        Module module = new Module(z10);
        moduleDeclaration.invoke(module);
        return module;
    }

    public static /* synthetic */ Module module$default(boolean z10, boolean z11, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            z11 = false;
        }
        return module(z10, z11, function1);
    }

    public static /* synthetic */ Module module$default(boolean z10, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return module(z10, function1);
    }

    @KoinDslMarker
    @NotNull
    public static final Module module(boolean z10, @NotNull Function1<? super Module, Unit> moduleDeclaration) {
        Intrinsics.checkNotNullParameter(moduleDeclaration, "moduleDeclaration");
        Module module = new Module(z10);
        moduleDeclaration.invoke(module);
        return module;
    }
}
