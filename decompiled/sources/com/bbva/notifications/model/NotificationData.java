package com.bbva.notifications.model;

import ad.d;
import androidx.camera.camera2.internal.n1;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.google.android.gms.measurement.internal.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: NotificationData.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0018\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b)\u0010*J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0002HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003J\t\u0010\n\u001a\u00020\u0002HÆ\u0003JK\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00022\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0012\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0013HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b \u0010\u001aR\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u0018\u001a\u0004\b\"\u0010\u001aR\u0017\u0010\u000f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010\u0018\u001a\u0004\b(\u0010\u001a¨\u0006+"}, d2 = {"Lcom/bbva/notifications/model/NotificationData;", "", "", "component1", "", "component2", "component3", "component4", "", "component5", "component6", "title", "bodyLocArgs", "bodyLocKey", "clickAction", "contentAvailable", "content", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "equals", "a", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "b", "Ljava/util/List;", "getBodyLocArgs", "()Ljava/util/List;", "c", "getBodyLocKey", "d", "getClickAction", "e", "Z", "getContentAvailable", "()Z", "f", "getContent", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "Notifications_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final /* data */ class NotificationData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String title;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<String> bodyLocArgs;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String bodyLocKey;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String clickAction;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final boolean contentAvailable;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String content;

    public NotificationData() {
        this(null, null, null, null, false, null, 63, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NotificationData copy$default(NotificationData notificationData, String str, List list, String str2, String str3, boolean z10, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = notificationData.title;
        }
        if ((i10 & 2) != 0) {
            list = notificationData.bodyLocArgs;
        }
        List list2 = list;
        if ((i10 & 4) != 0) {
            str2 = notificationData.bodyLocKey;
        }
        String str5 = str2;
        if ((i10 & 8) != 0) {
            str3 = notificationData.clickAction;
        }
        String str6 = str3;
        if ((i10 & 16) != 0) {
            z10 = notificationData.contentAvailable;
        }
        boolean z11 = z10;
        if ((i10 & 32) != 0) {
            str4 = notificationData.content;
        }
        return notificationData.copy(str, list2, str5, str6, z11, str4);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final List<String> component2() {
        return this.bodyLocArgs;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBodyLocKey() {
        return this.bodyLocKey;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getClickAction() {
        return this.clickAction;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getContentAvailable() {
        return this.contentAvailable;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    @NotNull
    public final NotificationData copy(@NotNull String title, @NotNull List<String> bodyLocArgs, @NotNull String bodyLocKey, @NotNull String clickAction, boolean contentAvailable, @NotNull String content) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(bodyLocArgs, "bodyLocArgs");
        Intrinsics.checkNotNullParameter(bodyLocKey, "bodyLocKey");
        Intrinsics.checkNotNullParameter(clickAction, "clickAction");
        Intrinsics.checkNotNullParameter(content, "content");
        return new NotificationData(title, bodyLocArgs, bodyLocKey, clickAction, contentAvailable, content);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotificationData)) {
            return false;
        }
        NotificationData notificationData = (NotificationData) other;
        return Intrinsics.areEqual(this.title, notificationData.title) && Intrinsics.areEqual(this.bodyLocArgs, notificationData.bodyLocArgs) && Intrinsics.areEqual(this.bodyLocKey, notificationData.bodyLocKey) && Intrinsics.areEqual(this.clickAction, notificationData.clickAction) && this.contentAvailable == notificationData.contentAvailable && Intrinsics.areEqual(this.content, notificationData.content);
    }

    @NotNull
    public final List<String> getBodyLocArgs() {
        return this.bodyLocArgs;
    }

    @NotNull
    public final String getBodyLocKey() {
        return this.bodyLocKey;
    }

    @NotNull
    public final String getClickAction() {
        return this.clickAction;
    }

    @NotNull
    public final String getContent() {
        return this.content;
    }

    public final boolean getContentAvailable() {
        return this.contentAvailable;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    /* JADX WARN: Type inference failed for: r2v4, types: [int] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    public int hashCode() {
        int iC = n1.c(this.clickAction, n1.c(this.bodyLocKey, a.a(this.bodyLocArgs, this.title.hashCode() * 31, 31), 31), 31);
        boolean z10 = this.contentAvailable;
        ?? r3 = z10;
        if (z10) {
            r3 = 1;
        }
        return this.content.hashCode() + ((iC + r3) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("NotificationData(title=");
        sb2.append(this.title);
        sb2.append(", bodyLocArgs=");
        sb2.append(this.bodyLocArgs);
        sb2.append(", bodyLocKey=");
        sb2.append(this.bodyLocKey);
        sb2.append(", clickAction=");
        sb2.append(this.clickAction);
        sb2.append(", contentAvailable=");
        sb2.append(this.contentAvailable);
        sb2.append(", content=");
        return d.f(sb2, this.content, ")");
    }

    public NotificationData(@NotNull String title, @NotNull List<String> bodyLocArgs, @NotNull String bodyLocKey, @NotNull String clickAction, boolean z10, @NotNull String content) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(bodyLocArgs, "bodyLocArgs");
        Intrinsics.checkNotNullParameter(bodyLocKey, "bodyLocKey");
        Intrinsics.checkNotNullParameter(clickAction, "clickAction");
        Intrinsics.checkNotNullParameter(content, "content");
        this.title = title;
        this.bodyLocArgs = bodyLocArgs;
        this.bodyLocKey = bodyLocKey;
        this.clickAction = clickAction;
        this.contentAvailable = z10;
        this.content = content;
    }

    public /* synthetic */ NotificationData(String str, List list, String str2, String str3, boolean z10, String str4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i10 & 4) != 0 ? "" : str2, (i10 & 8) != 0 ? "" : str3, (i10 & 16) != 0 ? false : z10, (i10 & 32) != 0 ? "" : str4);
    }
}
