package com.bbva.glomohybrid.provider.module;

import android.content.Context;
import com.bbva.actionlauncher.ActionLauncher;
import com.bbva.actionlauncher.ActionLauncherConfig;
import com.bbva.actionlauncher.AndroidActionLauncher;
import java.io.File;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.android.error.MissingAndroidContextException;
import org.koin.android.ext.koin.ModuleExtKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: ActionLauncherModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nActionLauncherModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActionLauncherModule.kt\ncom/bbva/glomohybrid/provider/module/ActionLauncherModuleKt$actionLauncherModule$1$2\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,48:1\n129#2,5:49\n129#2,5:54\n*S KotlinDebug\n*F\n+ 1 ActionLauncherModule.kt\ncom/bbva/glomohybrid/provider/module/ActionLauncherModuleKt$actionLauncherModule$1$2\n*L\n23#1:49,5\n24#1:54,5\n*E\n"})
public final class b extends Lambda implements Function2<Scope, ParametersHolder, ActionLauncher> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final b f34009p0 = new b(2);

    @Override // kotlin.jvm.functions.Function2
    public final ActionLauncher invoke(Scope scope, ParametersHolder parametersHolder) throws MissingAndroidContextException {
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        Context contextAndroidContext = ModuleExtKt.androidContext(single);
        String str = (String) single.get(Reflection.getOrCreateKotlinClass(String.class), QualifierKt.named(ActionLauncherModuleKt.FILE_AUTHORITIES), null);
        String absolutePath = ((File) single.get(Reflection.getOrCreateKotlinClass(File.class), QualifierKt.named(ArchitectureModuleKt.FILES_PATH), null)).getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
        return new AndroidActionLauncher(contextAndroidContext, new ActionLauncherConfig(str, absolutePath, 0, 0, 12, null));
    }
}
