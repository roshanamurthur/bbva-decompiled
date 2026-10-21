package com.bbva.slidemenuview.repository;

import com.bbva.plugin.localstorage.command.RemoveCommand;
import com.bbva.slidemenuview.domain.model.MenuItems;
import com.bbva.slidemenuview.repository.datasource.StorageMenuDataSource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: MenuRepository.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0005¨\u0006\f"}, d2 = {"Lcom/bbva/slidemenuview/repository/MenuRepository;", "", "Lcom/bbva/slidemenuview/domain/model/MenuItems;", "get", "menuItems", "", "save", RemoveCommand.ID, "Lcom/bbva/slidemenuview/repository/datasource/StorageMenuDataSource;", "dataSource", "<init>", "(Lcom/bbva/slidemenuview/repository/datasource/StorageMenuDataSource;)V", "slidemenuview_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nMenuRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MenuRepository.kt\ncom/bbva/slidemenuview/repository/MenuRepository\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,28:1\n1#2:29\n*E\n"})
public final class MenuRepository {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final StorageMenuDataSource f36777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public MenuItems f36778b;

    public MenuRepository(@NotNull StorageMenuDataSource dataSource) {
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        this.f36777a = dataSource;
    }

    @Nullable
    public final MenuItems get() {
        MenuItems menuItems = this.f36778b;
        if (menuItems != null) {
            return menuItems;
        }
        MenuItems menuItems2 = this.f36777a.get();
        this.f36778b = menuItems2;
        return menuItems2;
    }

    public final void remove() {
        this.f36778b = null;
        this.f36777a.remove();
    }

    public final void save(@NotNull MenuItems menuItems) {
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f36778b = menuItems;
        this.f36777a.save(menuItems);
    }
}
