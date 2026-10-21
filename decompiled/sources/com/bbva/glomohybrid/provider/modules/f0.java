package com.bbva.glomohybrid.provider.modules;

import com.bbva.glomohybrid.crontoToken.CrontoTokenDataStore;
import com.bbva.library.digipassmanager.helpers.DigipassManagerHelper;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.android.ext.koin.ModuleExtKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: CrontoManagerModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nCrontoManagerModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CrontoManagerModule.kt\ncom/bbva/glomohybrid/provider/modules/CrontoManagerModuleKt$crontoManagerModule$1$2\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,14:1\n129#2,5:15\n*S KotlinDebug\n*F\n+ 1 CrontoManagerModule.kt\ncom/bbva/glomohybrid/provider/modules/CrontoManagerModuleKt$crontoManagerModule$1$2\n*L\n12#1:15,5\n*E\n"})
public final class f0 extends Lambda implements Function2<Scope, ParametersHolder, CrontoTokenDataStore> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final f0 f34285p0 = new f0(2);

    @Override // kotlin.jvm.functions.Function2
    public final CrontoTokenDataStore invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        return new CrontoTokenDataStore(ModuleExtKt.androidContext(single), (DigipassManagerHelper) single.get(Reflection.getOrCreateKotlinClass(DigipassManagerHelper.class), null, null));
    }
}
