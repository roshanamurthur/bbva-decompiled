package com.bbva.glomohybrid.provider.module;

import com.bbva.glomohybrid.base.file.constants.FileConstants;
import java.io.File;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.koin.android.ext.koin.ModuleExtKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: ArchitectureModule.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class g0 extends Lambda implements Function2<Scope, ParametersHolder, File> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final g0 f34055p0 = new g0(2);

    @Override // kotlin.jvm.functions.Function2
    public final File invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        return new File(ModuleExtKt.androidContext(single).getFilesDir(), FileConstants.FILE_PROVIDER_SHARED_FOLDER_NAME);
    }
}
