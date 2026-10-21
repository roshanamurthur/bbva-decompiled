package com.bbva.slidemenuview.domain.usecase;

import com.bbva.glomoutils.usecase.UseCaseWithParams;
import com.bbva.slidemenuview.cells.components.dm.infraestructure.DefaultMenuIdentifierMapper;
import com.bbva.slidemenuview.cells.components.dm.infraestructure.MenuIdentifierMapper;
import com.bbva.slidemenuview.domain.model.MenuItems;
import com.bbva.slidemenuview.repository.MenuRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: MarkItemAsVisitedUseCase.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\f"}, d2 = {"Lcom/bbva/slidemenuview/domain/usecase/MarkItemAsVisitedUseCase;", "Lcom/bbva/glomoutils/usecase/UseCaseWithParams;", "", "Lcom/bbva/slidemenuview/domain/model/MenuItems;", "params", "execute", "Lcom/bbva/slidemenuview/repository/MenuRepository;", "repository", "Lcom/bbva/slidemenuview/cells/components/dm/infraestructure/MenuIdentifierMapper;", "menuIdentifiers", "<init>", "(Lcom/bbva/slidemenuview/repository/MenuRepository;Lcom/bbva/slidemenuview/cells/components/dm/infraestructure/MenuIdentifierMapper;)V", "slidemenuview_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nMarkItemAsVisitedUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarkItemAsVisitedUseCase.kt\ncom/bbva/slidemenuview/domain/usecase/MarkItemAsVisitedUseCase\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,21:1\n1#2:22\n*E\n"})
public final class MarkItemAsVisitedUseCase implements UseCaseWithParams<Integer, MenuItems> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MenuRepository f36727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MenuIdentifierMapper f36728b;

    public MarkItemAsVisitedUseCase(@NotNull MenuRepository repository, @NotNull MenuIdentifierMapper menuIdentifiers) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(menuIdentifiers, "menuIdentifiers");
        this.f36727a = repository;
        this.f36728b = menuIdentifiers;
    }

    @Override // com.bbva.glomoutils.usecase.UseCaseWithParams
    public /* bridge */ /* synthetic */ MenuItems execute(Integer num) {
        return execute(num.intValue());
    }

    @NotNull
    public MenuItems execute(int params) {
        MenuRepository menuRepository = this.f36727a;
        MenuItems empty = menuRepository.get();
        if (empty == null) {
            empty = MenuItems.INSTANCE.getEMPTY();
        }
        MenuItems menuItemsMarkAsVisited = empty.markAsVisited(this.f36728b.stringIdentifier(params));
        menuRepository.save(menuItemsMarkAsVisited);
        return menuItemsMarkAsVisited;
    }

    public /* synthetic */ MarkItemAsVisitedUseCase(MenuRepository menuRepository, MenuIdentifierMapper menuIdentifierMapper, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(menuRepository, (i10 & 2) != 0 ? new DefaultMenuIdentifierMapper() : menuIdentifierMapper);
    }
}
