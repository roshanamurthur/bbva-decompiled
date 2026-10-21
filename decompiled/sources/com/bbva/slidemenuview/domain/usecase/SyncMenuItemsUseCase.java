package com.bbva.slidemenuview.domain.usecase;

import com.bbva.glomoutils.usecase.UseCaseWithParams;
import com.bbva.slidemenuview.domain.model.MenuItemSpec;
import com.bbva.slidemenuview.domain.model.MenuItems;
import com.bbva.slidemenuview.repository.MenuRepository;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SyncMenuItemsUseCase.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u0006\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¨\u0006\r"}, d2 = {"Lcom/bbva/slidemenuview/domain/usecase/SyncMenuItemsUseCase;", "Lcom/bbva/glomoutils/usecase/UseCaseWithParams;", "", "Lcom/bbva/slidemenuview/domain/model/MenuItems;", "", "params", "execute", "", "currentVersion", "Lcom/bbva/slidemenuview/repository/MenuRepository;", "menuRepository", "<init>", "(Ljava/lang/String;Lcom/bbva/slidemenuview/repository/MenuRepository;)V", "slidemenuview_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nSyncMenuItemsUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SyncMenuItemsUseCase.kt\ncom/bbva/slidemenuview/domain/usecase/SyncMenuItemsUseCase\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,55:1\n1#2:56\n1549#3:57\n1620#3,3:58\n*S KotlinDebug\n*F\n+ 1 SyncMenuItemsUseCase.kt\ncom/bbva/slidemenuview/domain/usecase/SyncMenuItemsUseCase\n*L\n42#1:57\n42#1:58,3\n*E\n"})
public final class SyncMenuItemsUseCase implements UseCaseWithParams<List<? extends MenuItems>, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f36729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MenuRepository f36730b;

    public SyncMenuItemsUseCase(@NotNull String currentVersion, @NotNull MenuRepository menuRepository) {
        Intrinsics.checkNotNullParameter(currentVersion, "currentVersion");
        Intrinsics.checkNotNullParameter(menuRepository, "menuRepository");
        this.f36729a = currentVersion;
        this.f36730b = menuRepository;
    }

    @Override // com.bbva.glomoutils.usecase.UseCaseWithParams
    public /* bridge */ /* synthetic */ Unit execute(List<? extends MenuItems> list) {
        execute2((List<MenuItems>) list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: execute, reason: avoid collision after fix types in other method */
    public void execute2(@NotNull List<MenuItems> params) {
        Object next;
        Object next2;
        Intrinsics.checkNotNullParameter(params, "params");
        MenuRepository menuRepository = this.f36730b;
        MenuItems empty = menuRepository.get();
        if (empty == null) {
            empty = MenuItems.INSTANCE.getEMPTY();
        }
        List<String> version = empty != null ? empty.getVersion() : null;
        if (version == null) {
            version = CollectionsKt__CollectionsKt.emptyList();
        }
        String str = this.f36729a;
        if (!version.contains(str)) {
            menuRepository.remove();
        }
        Iterator<T> it = params.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((MenuItems) next).getVersion().contains(str));
        MenuItems menuItemsCopy$default = (MenuItems) next;
        if (menuItemsCopy$default == null) {
            return;
        }
        List<String> version2 = empty != null ? empty.getVersion() : null;
        if (version2 == null) {
            version2 = CollectionsKt__CollectionsKt.emptyList();
        }
        if (!(!version2.contains(str))) {
            List<MenuItemSpec> items = menuItemsCopy$default.getItems();
            List<MenuItemSpec> items2 = empty.getItems();
            List<MenuItemSpec> list = items;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            for (MenuItemSpec menuItemSpec : list) {
                String id = menuItemSpec.getId();
                Iterator<T> it2 = items2.iterator();
                do {
                    if (!it2.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it2.next();
                } while (!Intrinsics.areEqual(((MenuItemSpec) next2).getId(), id));
                MenuItemSpec menuItemSpec2 = (MenuItemSpec) next2;
                arrayList.add(MenuItemSpec.copy$default(menuItemSpec, null, null, null, null, menuItemSpec2 != null ? menuItemSpec2.isVisited() : false, 15, null));
            }
            menuItemsCopy$default = MenuItems.copy$default(menuItemsCopy$default, null, arrayList, 1, null);
        }
        menuRepository.save(menuItemsCopy$default);
    }
}
