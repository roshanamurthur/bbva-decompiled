package com.bbva.slidemenuview.cells.components.dm;

import com.bbva.slidemenuview.domain.usecase.GetFeaturedMenuUseCase;
import com.bbva.slidemenuview.domain.usecase.MarkItemAsVisitedUseCase;
import kotlin.Metadata;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;

/* JADX INFO: compiled from: MenuUseCaseFactory.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/bbva/slidemenuview/cells/components/dm/MenuUseCaseFactory;", "Lorg/koin/core/component/KoinComponent;", "()V", "getMenuUseCase", "Lcom/bbva/slidemenuview/domain/usecase/GetFeaturedMenuUseCase;", "markAsVisitedUseCase", "Lcom/bbva/slidemenuview/domain/usecase/MarkItemAsVisitedUseCase;", "slidemenuview_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMenuUseCaseFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MenuUseCaseFactory.kt\ncom/bbva/slidemenuview/cells/components/dm/MenuUseCaseFactory\n+ 2 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n+ 3 Scope.kt\norg/koin/core/scope/Scope\n+ 4 Koin.kt\norg/koin/core/Koin\n*L\n1#1,13:1\n41#2,6:14\n47#2:21\n41#2,6:23\n47#2:30\n133#3:20\n133#3:29\n107#4:22\n107#4:31\n*S KotlinDebug\n*F\n+ 1 MenuUseCaseFactory.kt\ncom/bbva/slidemenuview/cells/components/dm/MenuUseCaseFactory\n*L\n9#1:14,6\n9#1:21\n11#1:23,6\n11#1:30\n9#1:20\n11#1:29\n9#1:22\n11#1:31\n*E\n"})
public final class MenuUseCaseFactory implements KoinComponent {
    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final GetFeaturedMenuUseCase getMenuUseCase() {
        return (GetFeaturedMenuUseCase) (this instanceof KoinScopeComponent ? ((KoinScopeComponent) this).getScope() : getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(GetFeaturedMenuUseCase.class), null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final MarkItemAsVisitedUseCase markAsVisitedUseCase() {
        return (MarkItemAsVisitedUseCase) (this instanceof KoinScopeComponent ? ((KoinScopeComponent) this).getScope() : getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(MarkItemAsVisitedUseCase.class), null, null);
    }
}
