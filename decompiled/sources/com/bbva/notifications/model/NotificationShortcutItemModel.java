package com.bbva.notifications.model;

import ad.d;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.camera2.internal.n1;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.zoomauth.facialauth.constant.AuthConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: NotificationShortcutItemModel.kt */
/* JADX INFO: loaded from: classes7.dex */
@Parcelize
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b*\u0010+J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0002HÆ\u0003J\t\u0010\b\u001a\u00020\u0002HÆ\u0003J=\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u0002HÆ\u0001J\t\u0010\u000f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0010HÖ\u0001J\u0019\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0010HÖ\u0001R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001fR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\u001d\u001a\u0004\b'\u0010\u001fR\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010\u001d\u001a\u0004\b)\u0010\u001f¨\u0006,"}, d2 = {"Lcom/bbva/notifications/model/NotificationShortcutItemModel;", "Landroid/os/Parcelable;", "", "component1", "component2", "Lcom/bbva/notifications/model/ShortcutAction;", "component3", "component4", "component5", "route", "navigationType", "navigationAction", "text", AuthConstants.IMAGE, "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "p0", "Ljava/lang/String;", "getRoute", "()Ljava/lang/String;", "q0", "getNavigationType", "r0", "Lcom/bbva/notifications/model/ShortcutAction;", "getNavigationAction", "()Lcom/bbva/notifications/model/ShortcutAction;", "s0", "getText", "t0", "getImage", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/bbva/notifications/model/ShortcutAction;Ljava/lang/String;Ljava/lang/String;)V", "Notifications_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final /* data */ class NotificationShortcutItemModel implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<NotificationShortcutItemModel> CREATOR = new Creator();

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String route;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String navigationType;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final ShortcutAction navigationAction;

    /* JADX INFO: renamed from: s0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String text;

    /* JADX INFO: renamed from: t0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String image;

    /* JADX INFO: compiled from: NotificationShortcutItemModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<NotificationShortcutItemModel> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final NotificationShortcutItemModel createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new NotificationShortcutItemModel(parcel.readString(), parcel.readString(), (ShortcutAction) parcel.readParcelable(NotificationShortcutItemModel.class.getClassLoader()), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final NotificationShortcutItemModel[] newArray(int i10) {
            return new NotificationShortcutItemModel[i10];
        }
    }

    public NotificationShortcutItemModel(@NotNull String route, @NotNull String navigationType, @Nullable ShortcutAction shortcutAction, @NotNull String text, @NotNull String image) {
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(navigationType, "navigationType");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(image, "image");
        this.route = route;
        this.navigationType = navigationType;
        this.navigationAction = shortcutAction;
        this.text = text;
        this.image = image;
    }

    public static /* synthetic */ NotificationShortcutItemModel copy$default(NotificationShortcutItemModel notificationShortcutItemModel, String str, String str2, ShortcutAction shortcutAction, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = notificationShortcutItemModel.route;
        }
        if ((i10 & 2) != 0) {
            str2 = notificationShortcutItemModel.navigationType;
        }
        String str5 = str2;
        if ((i10 & 4) != 0) {
            shortcutAction = notificationShortcutItemModel.navigationAction;
        }
        ShortcutAction shortcutAction2 = shortcutAction;
        if ((i10 & 8) != 0) {
            str3 = notificationShortcutItemModel.text;
        }
        String str6 = str3;
        if ((i10 & 16) != 0) {
            str4 = notificationShortcutItemModel.image;
        }
        return notificationShortcutItemModel.copy(str, str5, shortcutAction2, str6, str4);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRoute() {
        return this.route;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNavigationType() {
        return this.navigationType;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ShortcutAction getNavigationAction() {
        return this.navigationAction;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    @NotNull
    public final NotificationShortcutItemModel copy(@NotNull String route, @NotNull String navigationType, @Nullable ShortcutAction navigationAction, @NotNull String text, @NotNull String image) {
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(navigationType, "navigationType");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(image, "image");
        return new NotificationShortcutItemModel(route, navigationType, navigationAction, text, image);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotificationShortcutItemModel)) {
            return false;
        }
        NotificationShortcutItemModel notificationShortcutItemModel = (NotificationShortcutItemModel) other;
        return Intrinsics.areEqual(this.route, notificationShortcutItemModel.route) && Intrinsics.areEqual(this.navigationType, notificationShortcutItemModel.navigationType) && Intrinsics.areEqual(this.navigationAction, notificationShortcutItemModel.navigationAction) && Intrinsics.areEqual(this.text, notificationShortcutItemModel.text) && Intrinsics.areEqual(this.image, notificationShortcutItemModel.image);
    }

    @NotNull
    public final String getImage() {
        return this.image;
    }

    @Nullable
    public final ShortcutAction getNavigationAction() {
        return this.navigationAction;
    }

    @NotNull
    public final String getNavigationType() {
        return this.navigationType;
    }

    @NotNull
    public final String getRoute() {
        return this.route;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int iC = n1.c(this.navigationType, this.route.hashCode() * 31, 31);
        ShortcutAction shortcutAction = this.navigationAction;
        return this.image.hashCode() + n1.c(this.text, (iC + (shortcutAction == null ? 0 : shortcutAction.hashCode())) * 31, 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("NotificationShortcutItemModel(route=");
        sb2.append(this.route);
        sb2.append(", navigationType=");
        sb2.append(this.navigationType);
        sb2.append(", navigationAction=");
        sb2.append(this.navigationAction);
        sb2.append(", text=");
        sb2.append(this.text);
        sb2.append(", image=");
        return d.f(sb2, this.image, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.route);
        parcel.writeString(this.navigationType);
        parcel.writeParcelable(this.navigationAction, flags);
        parcel.writeString(this.text);
        parcel.writeString(this.image);
    }
}
