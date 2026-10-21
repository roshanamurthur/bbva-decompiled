package com.bbva.glomohybrid.provider.module;

import com.bbva.cellscore.app.ComponentManager;
import com.bbva.glomohybrid.documents.component.TermsDataManager;
import com.bbva.glomohybrid.settings.TermsAppSettingsObserver;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: AppSettingsModule.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class j extends Lambda implements Function2<Scope, ParametersHolder, TermsAppSettingsObserver> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final j f34081p0 = new j(2);

    @Override // kotlin.jvm.functions.Function2
    public final TermsAppSettingsObserver invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope factory = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(factory, "$this$factory");
        Intrinsics.checkNotNullParameter(it, "it");
        Object obj = ComponentManager.get(TermsDataManager.INSTANCE.getID());
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        return new TermsAppSettingsObserver((TermsDataManager) obj);
    }
}
