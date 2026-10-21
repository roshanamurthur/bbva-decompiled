package com.bbva.glomohybrid.base.usecase;

import com.bbva.glomoutils.usecase.UseCase;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CiscoWebexInstantiatePluginUseCase.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u0000 \u00032\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/bbva/glomohybrid/base/usecase/CiscoWebexInstantiatePluginUseCase;", "Lcom/bbva/glomoutils/usecase/UseCase;", "", "Companion", "Base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface CiscoWebexInstantiatePluginUseCase extends UseCase<Unit> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f31582a;

    @NotNull
    public static final String PROVIDER = "com.bbva.ciscowebex.provider.CiscoWebexDynamicModuleProvider";

    /* JADX INFO: compiled from: CiscoWebexInstantiatePluginUseCase.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bbva/glomohybrid/base/usecase/CiscoWebexInstantiatePluginUseCase$Companion;", "", "()V", "PROVIDER", "", "Base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        @NotNull
        public static final String PROVIDER = "com.bbva.ciscowebex.provider.CiscoWebexDynamicModuleProvider";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f31582a = new Companion();
    }
}
