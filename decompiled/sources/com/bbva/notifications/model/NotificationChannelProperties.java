package com.bbva.notifications.model;

import android.net.Uri;
import androidx.appcompat.app.i;
import androidx.camera.camera2.internal.n1;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.notifications.provider.NotificationsProvider;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: NotificationChannelProperties.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b$\b\u0086\b\u0018\u0000 -2\u00020\u0001:\u0001-B?\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\n¢\u0006\u0004\b+\u0010,J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\u000b\u001a\u00020\nHÆ\u0003JG\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u0011\u001a\u00020\nHÆ\u0001J\t\u0010\u0013\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001aR\u0017\u0010\u000f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0011\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006."}, d2 = {"Lcom/bbva/notifications/model/NotificationChannelProperties;", "", "", "component1", "component2", "component3", "", "component4", "Landroid/net/Uri;", "component5", "", "component6", "id", "name", "description", "importance", "sound", "showBadge", "copy", "toString", GenerateActivationFormCommand.HASH_CODE, "other", "equals", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "b", "getName", "c", "getDescription", "d", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getImportance", "()I", "e", "Landroid/net/Uri;", "getSound", "()Landroid/net/Uri;", "f", "Z", "getShowBadge", "()Z", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILandroid/net/Uri;Z)V", "Companion", "Notifications_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final /* data */ class NotificationChannelProperties {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String name;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String description;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final int importance;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Uri sound;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final boolean showBadge;

    /* JADX INFO: compiled from: NotificationChannelProperties.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/bbva/notifications/model/NotificationChannelProperties$Companion;", "", "()V", "default", "Lcom/bbva/notifications/model/NotificationChannelProperties;", "getDefault", "()Lcom/bbva/notifications/model/NotificationChannelProperties;", "Notifications_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final NotificationChannelProperties getDefault() {
            return new NotificationChannelProperties(NotificationsProvider.NOTIFICATION_ID, NotificationsProvider.NOTIFICATION_DESCRIPTION, NotificationsProvider.NOTIFICATION_DESCRIPTION, 4, null, false, 48, null);
        }
    }

    public NotificationChannelProperties(@NotNull String id, @NotNull String name, @NotNull String description, int i10, @Nullable Uri uri, boolean z10) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(description, "description");
        this.id = id;
        this.name = name;
        this.description = description;
        this.importance = i10;
        this.sound = uri;
        this.showBadge = z10;
    }

    public static /* synthetic */ NotificationChannelProperties copy$default(NotificationChannelProperties notificationChannelProperties, String str, String str2, String str3, int i10, Uri uri, boolean z10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = notificationChannelProperties.id;
        }
        if ((i11 & 2) != 0) {
            str2 = notificationChannelProperties.name;
        }
        String str4 = str2;
        if ((i11 & 4) != 0) {
            str3 = notificationChannelProperties.description;
        }
        String str5 = str3;
        if ((i11 & 8) != 0) {
            i10 = notificationChannelProperties.importance;
        }
        int i12 = i10;
        if ((i11 & 16) != 0) {
            uri = notificationChannelProperties.sound;
        }
        Uri uri2 = uri;
        if ((i11 & 32) != 0) {
            z10 = notificationChannelProperties.showBadge;
        }
        return notificationChannelProperties.copy(str, str4, str5, i12, uri2, z10);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getImportance() {
        return this.importance;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Uri getSound() {
        return this.sound;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getShowBadge() {
        return this.showBadge;
    }

    @NotNull
    public final NotificationChannelProperties copy(@NotNull String id, @NotNull String name, @NotNull String description, int importance, @Nullable Uri sound, boolean showBadge) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(description, "description");
        return new NotificationChannelProperties(id, name, description, importance, sound, showBadge);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotificationChannelProperties)) {
            return false;
        }
        NotificationChannelProperties notificationChannelProperties = (NotificationChannelProperties) other;
        return Intrinsics.areEqual(this.id, notificationChannelProperties.id) && Intrinsics.areEqual(this.name, notificationChannelProperties.name) && Intrinsics.areEqual(this.description, notificationChannelProperties.description) && this.importance == notificationChannelProperties.importance && Intrinsics.areEqual(this.sound, notificationChannelProperties.sound) && this.showBadge == notificationChannelProperties.showBadge;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public final int getImportance() {
        return this.importance;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final boolean getShowBadge() {
        return this.showBadge;
    }

    @Nullable
    public final Uri getSound() {
        return this.sound;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    public int hashCode() {
        int iC = (n1.c(this.description, n1.c(this.name, this.id.hashCode() * 31, 31), 31) + this.importance) * 31;
        Uri uri = this.sound;
        int iHashCode = (iC + (uri == null ? 0 : uri.hashCode())) * 31;
        boolean z10 = this.showBadge;
        ?? r1 = z10;
        if (z10) {
            r1 = 1;
        }
        return iHashCode + r1;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("NotificationChannelProperties(id=");
        sb2.append(this.id);
        sb2.append(", name=");
        sb2.append(this.name);
        sb2.append(", description=");
        sb2.append(this.description);
        sb2.append(", importance=");
        sb2.append(this.importance);
        sb2.append(", sound=");
        sb2.append(this.sound);
        sb2.append(", showBadge=");
        return i.c(sb2, this.showBadge, ")");
    }

    public /* synthetic */ NotificationChannelProperties(String str, String str2, String str3, int i10, Uri uri, boolean z10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i11 & 8) != 0 ? 3 : i10, (i11 & 16) != 0 ? null : uri, (i11 & 32) != 0 ? false : z10);
    }
}
