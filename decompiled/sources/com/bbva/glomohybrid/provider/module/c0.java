package com.bbva.glomohybrid.provider.module;

import com.bbva.glomohybrid.base.fetcher.UserAvatarFetcher;
import com.bbva.glomoutils.network.ImageFetcher;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: ArchitectureModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nArchitectureModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArchitectureModule.kt\ncom/bbva/glomohybrid/provider/module/ArchitectureModuleKt$fetchersModule$1$2\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,298:1\n129#2,5:299\n*S KotlinDebug\n*F\n+ 1 ArchitectureModule.kt\ncom/bbva/glomohybrid/provider/module/ArchitectureModuleKt$fetchersModule$1$2\n*L\n289#1:299,5\n*E\n"})
public final class c0 extends Lambda implements Function2<Scope, ParametersHolder, UserAvatarFetcher> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final c0 f34019p0 = new c0(2);

    @Override // kotlin.jvm.functions.Function2
    public final UserAvatarFetcher invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        return new UserAvatarFetcher((String) single.get(Reflection.getOrCreateKotlinClass(String.class), QualifierKt.named(ConfigModuleKt.HOST_AEM), null), (ImageFetcher) single.get(Reflection.getOrCreateKotlinClass(ImageFetcher.class), null, null));
    }
}
