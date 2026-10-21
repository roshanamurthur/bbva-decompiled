package com.bbva.glomohybrid.provider.modules;

import com.bbva.glomohybrid.ui.options.profileselector.helper.ProfileSelectorHelper;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.koin.android.ext.koin.ModuleExtKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: UserTypeModule.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class r2 extends Lambda implements Function2<Scope, ParametersHolder, ProfileSelectorHelper> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final r2 f34336p0 = new r2(2);

    @Override // kotlin.jvm.functions.Function2
    public final ProfileSelectorHelper invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        return new ProfileSelectorHelper(ModuleExtKt.androidContext(single));
    }
}
