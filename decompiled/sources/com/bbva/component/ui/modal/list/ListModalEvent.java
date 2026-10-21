package com.bbva.component.ui.modal.list;

import com.bbva.component.dm.analytics.constants.AnalyticsConstants;
import com.bbva.component.ui.modal.list.model.Item;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ListModalViewModel.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/bbva/component/ui/modal/list/ListModalEvent;", "", "()V", "OnClose", "OnItemSelected", "Lcom/bbva/component/ui/modal/list/ListModalEvent$OnClose;", "Lcom/bbva/component/ui/modal/list/ListModalEvent$OnItemSelected;", "component-ui-modal_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class ListModalEvent {

    /* JADX INFO: compiled from: ListModalViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/component/ui/modal/list/ListModalEvent$OnClose;", "Lcom/bbva/component/ui/modal/list/ListModalEvent;", "()V", "component-ui-modal_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class OnClose extends ListModalEvent {

        @NotNull
        public static final OnClose INSTANCE = new OnClose();

        public OnClose() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: ListModalViewModel.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/bbva/component/ui/modal/list/ListModalEvent$OnItemSelected;", "Lcom/bbva/component/ui/modal/list/ListModalEvent;", "Lcom/bbva/component/ui/modal/list/model/Item;", "component1", AnalyticsConstants.Key.ITEM, "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Lcom/bbva/component/ui/modal/list/model/Item;", "getItem", "()Lcom/bbva/component/ui/modal/list/model/Item;", "<init>", "(Lcom/bbva/component/ui/modal/list/model/Item;)V", "component-ui-modal_release"}, k = 1, mv = {1, 9, 0})
    public static final /* data */ class OnItemSelected extends ListModalEvent {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Item item;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnItemSelected(@NotNull Item item) {
            super(null);
            Intrinsics.checkNotNullParameter(item, "item");
            this.item = item;
        }

        public static /* synthetic */ OnItemSelected copy$default(OnItemSelected onItemSelected, Item item, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                item = onItemSelected.item;
            }
            return onItemSelected.copy(item);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Item getItem() {
            return this.item;
        }

        @NotNull
        public final OnItemSelected copy(@NotNull Item item) {
            Intrinsics.checkNotNullParameter(item, "item");
            return new OnItemSelected(item);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OnItemSelected) && Intrinsics.areEqual(this.item, ((OnItemSelected) other).item);
        }

        @NotNull
        public final Item getItem() {
            return this.item;
        }

        public int hashCode() {
            return this.item.hashCode();
        }

        @NotNull
        public String toString() {
            return "OnItemSelected(item=" + this.item + ")";
        }
    }

    public ListModalEvent() {
    }

    public /* synthetic */ ListModalEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
