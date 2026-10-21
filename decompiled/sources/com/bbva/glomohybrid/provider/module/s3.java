package com.bbva.glomohybrid.provider.module;

import com.bbva.glomo.storage.MainStorage;
import com.bbva.glomohybrid.landing.data.datasource.LandingSectionsDeletedDataSource;
import com.bbva.glomohybrid.landing.data.repository.LandingSectionsDeletedRepository;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: LandingModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nLandingModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LandingModule.kt\ncom/bbva/glomohybrid/provider/module/LandingModuleKt$landingModule$1$2\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,214:1\n129#2,5:215\n*S KotlinDebug\n*F\n+ 1 LandingModule.kt\ncom/bbva/glomohybrid/provider/module/LandingModuleKt$landingModule$1$2\n*L\n82#1:215,5\n*E\n"})
public final class s3 extends Lambda implements Function2<Scope, ParametersHolder, LandingSectionsDeletedRepository> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final s3 f34162p0 = new s3(2);

    @Override // kotlin.jvm.functions.Function2
    public final LandingSectionsDeletedRepository invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        return new LandingSectionsDeletedRepository(new LandingSectionsDeletedDataSource((MainStorage) single.get(Reflection.getOrCreateKotlinClass(MainStorage.class), null, null)));
    }
}
