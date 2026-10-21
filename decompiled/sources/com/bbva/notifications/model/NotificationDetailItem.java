package com.bbva.notifications.model;

import ad.d;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.camera2.internal.n1;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: NotificationNoCommercialData.kt */
/* JADX INFO: loaded from: classes7.dex */
@Parcelize
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u001f\u0010 J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J'\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u0011\u001a\u00020\u000bHÖ\u0001J\u0019\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000bHÖ\u0001R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001a¨\u0006!"}, d2 = {"Lcom/bbva/notifications/model/NotificationDetailItem;", "Landroid/os/Parcelable;", "", "component1", "component2", "component3", "key", "title", "description", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "p0", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "q0", "getTitle", "r0", "getDescription", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Notifications_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final /* data */ class NotificationDetailItem implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<NotificationDetailItem> CREATOR = new Creator();

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String key;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String title;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String description;

    /* JADX INFO: compiled from: NotificationNoCommercialData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<NotificationDetailItem> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final NotificationDetailItem createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new NotificationDetailItem(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final NotificationDetailItem[] newArray(int i10) {
            return new NotificationDetailItem[i10];
        }
    }

    public NotificationDetailItem(@NotNull String key, @NotNull String title, @NotNull String description) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.key = key;
        this.title = title;
        this.description = description;
    }

    public static /* synthetic */ NotificationDetailItem copy$default(NotificationDetailItem notificationDetailItem, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = notificationDetailItem.key;
        }
        if ((i10 & 2) != 0) {
            str2 = notificationDetailItem.title;
        }
        if ((i10 & 4) != 0) {
            str3 = notificationDetailItem.description;
        }
        return notificationDetailItem.copy(str, str2, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final NotificationDetailItem copy(@NotNull String key, @NotNull String title, @NotNull String description) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        return new NotificationDetailItem(key, title, description);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotificationDetailItem)) {
            return false;
        }
        NotificationDetailItem notificationDetailItem = (NotificationDetailItem) other;
        return Intrinsics.areEqual(this.key, notificationDetailItem.key) && Intrinsics.areEqual(this.title, notificationDetailItem.title) && Intrinsics.areEqual(this.description, notificationDetailItem.description);
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.description.hashCode() + n1.c(this.title, this.key.hashCode() * 31, 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("NotificationDetailItem(key=");
        sb2.append(this.key);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", description=");
        return d.f(sb2, this.description, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.key);
        parcel.writeString(this.title);
        parcel.writeString(this.description);
    }
}
