package com.bbva.slidemenuview.presentation;

import androidx.lifecycle.LiveData;
import com.bbva.component.dm.analytics.constants.AnalyticsConstants;
import com.bbva.slidemenuview.domain.model.MenuClickAction;
import kotlin.Metadata;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: MenuDelegate.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\b\u001a\u00020\tH&J\u0014\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fH&J\u001e\u0010\r\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fj\u0002`\u00120\u000eH&J \u0010\u0013\u001a\u00020\t2\u0016\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fj\u0002`\u0012H&R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\u0015"}, d2 = {"Lcom/bbva/slidemenuview/presentation/MenuDelegate;", "", "delegate", "Lcom/bbva/slidemenuview/presentation/CustomMenuItemClickDelegate;", "getDelegate", "()Lcom/bbva/slidemenuview/presentation/CustomMenuItemClickDelegate;", "setDelegate", "(Lcom/bbva/slidemenuview/presentation/CustomMenuItemClickDelegate;)V", "onItemClicked", "", "onStoreItemClicked", AnalyticsConstants.Key.ITEM, "Lcom/bbva/slidemenuview/domain/model/MenuClickAction;", "refreshMenuObserver", "Landroidx/lifecycle/LiveData;", "Lkotlin/Pair;", "", "", "Lcom/bbva/slidemenuview/presentation/MenuItemConsumed;", "updateFeaturedItem", "menuItemConsumed", "slidemenuview_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface MenuDelegate {

    /* JADX INFO: compiled from: MenuDelegate.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void onStoreItemClicked$default(MenuDelegate menuDelegate, MenuClickAction menuClickAction, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onStoreItemClicked");
            }
            if ((i10 & 1) != 0) {
                menuClickAction = null;
            }
            menuDelegate.onStoreItemClicked(menuClickAction);
        }
    }

    @Nullable
    CustomMenuItemClickDelegate getDelegate();

    void onItemClicked();

    void onStoreItemClicked(@Nullable MenuClickAction item);

    @NotNull
    LiveData<Pair<Integer, Boolean>> refreshMenuObserver();

    void setDelegate(@Nullable CustomMenuItemClickDelegate customMenuItemClickDelegate);

    void updateFeaturedItem(@NotNull Pair<Integer, Boolean> menuItemConsumed);
}
