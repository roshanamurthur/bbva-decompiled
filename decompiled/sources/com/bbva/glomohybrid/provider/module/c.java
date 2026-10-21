package com.bbva.glomohybrid.provider.module;

import com.bbva.actionlauncher.plugin.params.FileSystemConfig;
import java.io.File;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: ActionLauncherModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nActionLauncherModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActionLauncherModule.kt\ncom/bbva/glomohybrid/provider/module/ActionLauncherModuleKt$actionLauncherModule$1$3\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,48:1\n129#2,5:49\n129#2,5:54\n*S KotlinDebug\n*F\n+ 1 ActionLauncherModule.kt\ncom/bbva/glomohybrid/provider/module/ActionLauncherModuleKt$actionLauncherModule$1$3\n*L\n31#1:49,5\n32#1:54,5\n*E\n"})
public final class c extends Lambda implements Function2<Scope, ParametersHolder, FileSystemConfig> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final c f34018p0 = new c(2);

    @Override // kotlin.jvm.functions.Function2
    public final FileSystemConfig invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope factory = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(factory, "$this$factory");
        Intrinsics.checkNotNullParameter(it, "it");
        String absolutePath = ((File) factory.get(Reflection.getOrCreateKotlinClass(File.class), QualifierKt.named(ArchitectureModuleKt.FILES_PATH), null)).getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
        return new FileSystemConfig(absolutePath, (String) factory.get(Reflection.getOrCreateKotlinClass(String.class), QualifierKt.named(ActionLauncherModuleKt.FILE_AUTHORITIES), null));
    }
}
