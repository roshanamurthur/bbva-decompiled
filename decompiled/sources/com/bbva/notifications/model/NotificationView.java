package com.bbva.notifications.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.google.android.gms.measurement.internal.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: NotificationNoCommercialData.kt */
/* JADX INFO: loaded from: classes7.dex */
@Parcelize
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b,\u0010-J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003J\u0011\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003JC\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\tHÆ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0012HÖ\u0001J\u0019\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0012HÖ\u0001R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001f\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b'\u0010%R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+¨\u0006."}, d2 = {"Lcom/bbva/notifications/model/NotificationView;", "Landroid/os/Parcelable;", "Lcom/bbva/notifications/model/NotificationNoCommercialData;", "component1", "", "Lcom/bbva/notifications/model/NotificationDetailItem;", "component2", "Lcom/bbva/notifications/model/NotificationShortcutItemModel;", "component3", "Lcom/bbva/notifications/model/Timer;", "component4", "header", "notificationDetailList", "shortcutsAction", "timer", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "p0", "Lcom/bbva/notifications/model/NotificationNoCommercialData;", "getHeader", "()Lcom/bbva/notifications/model/NotificationNoCommercialData;", "q0", "Ljava/util/List;", "getNotificationDetailList", "()Ljava/util/List;", "r0", "getShortcutsAction", "s0", "Lcom/bbva/notifications/model/Timer;", "getTimer", "()Lcom/bbva/notifications/model/Timer;", "<init>", "(Lcom/bbva/notifications/model/NotificationNoCommercialData;Ljava/util/List;Ljava/util/List;Lcom/bbva/notifications/model/Timer;)V", "Notifications_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final /* data */ class NotificationView implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<NotificationView> CREATOR = new Creator();

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final NotificationNoCommercialData header;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<NotificationDetailItem> notificationDetailList;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final List<NotificationShortcutItemModel> shortcutsAction;

    /* JADX INFO: renamed from: s0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Timer timer;

    /* JADX INFO: compiled from: NotificationNoCommercialData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<NotificationView> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final NotificationView createFromParcel(@NotNull Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            NotificationNoCommercialData notificationNoCommercialDataCreateFromParcel = parcel.readInt() == 0 ? null : NotificationNoCommercialData.CREATOR.createFromParcel(parcel);
            int i10 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i10);
            for (int i11 = 0; i11 != i10; i11++) {
                arrayList2.add(NotificationDetailItem.CREATOR.createFromParcel(parcel));
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                for (int i13 = 0; i13 != i12; i13++) {
                    arrayList.add(NotificationShortcutItemModel.CREATOR.createFromParcel(parcel));
                }
            }
            return new NotificationView(notificationNoCommercialDataCreateFromParcel, arrayList2, arrayList, parcel.readInt() != 0 ? Timer.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final NotificationView[] newArray(int i10) {
            return new NotificationView[i10];
        }
    }

    public NotificationView(@Nullable NotificationNoCommercialData notificationNoCommercialData, @NotNull List<NotificationDetailItem> notificationDetailList, @Nullable List<NotificationShortcutItemModel> list, @Nullable Timer timer) {
        Intrinsics.checkNotNullParameter(notificationDetailList, "notificationDetailList");
        this.header = notificationNoCommercialData;
        this.notificationDetailList = notificationDetailList;
        this.shortcutsAction = list;
        this.timer = timer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NotificationView copy$default(NotificationView notificationView, NotificationNoCommercialData notificationNoCommercialData, List list, List list2, Timer timer, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            notificationNoCommercialData = notificationView.header;
        }
        if ((i10 & 2) != 0) {
            list = notificationView.notificationDetailList;
        }
        if ((i10 & 4) != 0) {
            list2 = notificationView.shortcutsAction;
        }
        if ((i10 & 8) != 0) {
            timer = notificationView.timer;
        }
        return notificationView.copy(notificationNoCommercialData, list, list2, timer);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final NotificationNoCommercialData getHeader() {
        return this.header;
    }

    @NotNull
    public final List<NotificationDetailItem> component2() {
        return this.notificationDetailList;
    }

    @Nullable
    public final List<NotificationShortcutItemModel> component3() {
        return this.shortcutsAction;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Timer getTimer() {
        return this.timer;
    }

    @NotNull
    public final NotificationView copy(@Nullable NotificationNoCommercialData header, @NotNull List<NotificationDetailItem> notificationDetailList, @Nullable List<NotificationShortcutItemModel> shortcutsAction, @Nullable Timer timer) {
        Intrinsics.checkNotNullParameter(notificationDetailList, "notificationDetailList");
        return new NotificationView(header, notificationDetailList, shortcutsAction, timer);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotificationView)) {
            return false;
        }
        NotificationView notificationView = (NotificationView) other;
        return Intrinsics.areEqual(this.header, notificationView.header) && Intrinsics.areEqual(this.notificationDetailList, notificationView.notificationDetailList) && Intrinsics.areEqual(this.shortcutsAction, notificationView.shortcutsAction) && Intrinsics.areEqual(this.timer, notificationView.timer);
    }

    @Nullable
    public final NotificationNoCommercialData getHeader() {
        return this.header;
    }

    @NotNull
    public final List<NotificationDetailItem> getNotificationDetailList() {
        return this.notificationDetailList;
    }

    @Nullable
    public final List<NotificationShortcutItemModel> getShortcutsAction() {
        return this.shortcutsAction;
    }

    @Nullable
    public final Timer getTimer() {
        return this.timer;
    }

    public int hashCode() {
        NotificationNoCommercialData notificationNoCommercialData = this.header;
        int iA = a.a(this.notificationDetailList, (notificationNoCommercialData == null ? 0 : notificationNoCommercialData.hashCode()) * 31, 31);
        List<NotificationShortcutItemModel> list = this.shortcutsAction;
        int iHashCode = (iA + (list == null ? 0 : list.hashCode())) * 31;
        Timer timer = this.timer;
        return iHashCode + (timer != null ? timer.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "NotificationView(header=" + this.header + ", notificationDetailList=" + this.notificationDetailList + ", shortcutsAction=" + this.shortcutsAction + ", timer=" + this.timer + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        NotificationNoCommercialData notificationNoCommercialData = this.header;
        if (notificationNoCommercialData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            notificationNoCommercialData.writeToParcel(parcel, flags);
        }
        List<NotificationDetailItem> list = this.notificationDetailList;
        parcel.writeInt(list.size());
        Iterator<NotificationDetailItem> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, flags);
        }
        List<NotificationShortcutItemModel> list2 = this.shortcutsAction;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            Iterator<NotificationShortcutItemModel> it2 = list2.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, flags);
            }
        }
        Timer timer = this.timer;
        if (timer == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            timer.writeToParcel(parcel, flags);
        }
    }

    public /* synthetic */ NotificationView(NotificationNoCommercialData notificationNoCommercialData, List list, List list2, Timer timer, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(notificationNoCommercialData, list, list2, (i10 & 8) != 0 ? null : timer);
    }
}
