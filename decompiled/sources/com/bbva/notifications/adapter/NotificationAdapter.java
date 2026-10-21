package com.bbva.notifications.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bbva.cellswidgets.CellsTextView;
import com.bbva.notifications.databinding.NotificationItemListBinding;
import com.bbva.notifications.model.NotificationDetailItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: NotificationAdapter.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\f\u001a\u00020\u0005H\u0016R6\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u001a"}, d2 = {"Lcom/bbva/notifications/adapter/NotificationAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/bbva/notifications/adapter/NotificationAdapter$ViewHolder;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "holder", "position", "", "onBindViewHolder", "getItemCount", "", "Lcom/bbva/notifications/model/NotificationDetailItem;", "value", "p0", "Ljava/util/List;", "getNotificationsList$Notifications_mexicoRelease", "()Ljava/util/List;", "setNotificationsList$Notifications_mexicoRelease", "(Ljava/util/List;)V", "notificationsList", "<init>", "()V", "ViewHolder", "Notifications_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final class NotificationAdapter extends RecyclerView.Adapter<ViewHolder> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public List<NotificationDetailItem> notificationsList = CollectionsKt__CollectionsKt.emptyList();

    /* JADX INFO: compiled from: NotificationAdapter.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\n"}, d2 = {"Lcom/bbva/notifications/adapter/NotificationAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/bbva/notifications/model/NotificationDetailItem;", "notificationField", "", "bind", "Lcom/bbva/notifications/databinding/NotificationItemListBinding;", "binding", "<init>", "(Lcom/bbva/notifications/databinding/NotificationItemListBinding;)V", "Notifications_mexicoRelease"}, k = 1, mv = {1, 9, 0})
    public static final class ViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        @NotNull
        public final NotificationItemListBinding f35338p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(@NotNull NotificationItemListBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.f35338p0 = binding;
        }

        public final void bind(@NotNull NotificationDetailItem notificationField) {
            Intrinsics.checkNotNullParameter(notificationField, "notificationField");
            boolean zEquals = l.equals(notificationField.getKey(), "date", true);
            NotificationItemListBinding notificationItemListBinding = this.f35338p0;
            if (zEquals || l.equals(notificationField.getKey(), "hour", true)) {
                CellsTextView cellsTextView = notificationItemListBinding.notificationDescription;
                cellsTextView.setTypeface(cellsTextView.getTypeface(), 2);
            }
            notificationItemListBinding.notificationTitle.setText(notificationField.getTitle());
            notificationItemListBinding.notificationDescription.setText(notificationField.getDescription());
            notificationItemListBinding.getRoot().setContentDescription(notificationField.getTitle());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.notificationsList.size();
    }

    @NotNull
    public final List<NotificationDetailItem> getNotificationsList$Notifications_mexicoRelease() {
        return this.notificationsList;
    }

    public final void setNotificationsList$Notifications_mexicoRelease(@NotNull List<NotificationDetailItem> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.notificationsList = value;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull ViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(this.notificationsList.get(position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        NotificationItemListBinding notificationItemListBindingInflate = NotificationItemListBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(notificationItemListBindingInflate, "inflate(...)");
        return new ViewHolder(notificationItemListBindingInflate);
    }
}
