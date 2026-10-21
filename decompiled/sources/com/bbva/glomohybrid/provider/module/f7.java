package com.bbva.glomohybrid.provider.module;

import com.bbva.glomohybrid.ui.options.profileselector.delegate.EmptyActivityDelegate;
import com.bbva.glomohybrid.ui.options.profileselector.delegate.UserTypeActivityDelegate;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: UserTypeEmptyModule.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class f7 extends Lambda implements Function2<Scope, ParametersHolder, UserTypeActivityDelegate> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final f7 f34053p0 = new f7(2);

    @Override // kotlin.jvm.functions.Function2
    public final UserTypeActivityDelegate invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope scoped = scope;
        Intrinsics.checkNotNullParameter(scoped, "$this$scoped");
        Intrinsics.checkNotNullParameter(parametersHolder, "<name for destructuring parameter 0>");
        return EmptyActivityDelegate.INSTANCE;
    }
}
