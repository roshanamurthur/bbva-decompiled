package com.bbva.notifications.activity;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.notifications.NotificationType;
import com.bbva.notifications.model.NotificationView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: NotificationNoCommercialContract.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, d2 = {"Lcom/bbva/notifications/activity/NotificationNoCommercialContract;", "", "()V", "Intent", "State", "Notifications_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class NotificationNoCommercialContract {

    /* JADX INFO: compiled from: NotificationNoCommercialContract.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/bbva/notifications/activity/NotificationNoCommercialContract$Intent;", "", "()V", "SendAnalytics", "Lcom/bbva/notifications/activity/NotificationNoCommercialContract$Intent$SendAnalytics;", "Notifications_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class Intent {

        /* JADX INFO: compiled from: NotificationNoCommercialContract.kt */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u001f\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0004HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/bbva/notifications/activity/NotificationNoCommercialContract$Intent$SendAnalytics;", "Lcom/bbva/notifications/activity/NotificationNoCommercialContract$Intent;", "Lcom/bbva/notifications/NotificationType;", "component1", "", "component2", "type", "data", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Lcom/bbva/notifications/NotificationType;", "getType", "()Lcom/bbva/notifications/NotificationType;", "b", "Ljava/lang/String;", "getData", "()Ljava/lang/String;", "<init>", "(Lcom/bbva/notifications/NotificationType;Ljava/lang/String;)V", "Notifications_mexicoRelease"}, k = 1, mv = {1, 9, 0})
        public static final /* data */ class SendAnalytics extends Intent {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final NotificationType type;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final String data;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SendAnalytics(@NotNull NotificationType type, @Nullable String str) {
                super(null);
                Intrinsics.checkNotNullParameter(type, "type");
                this.type = type;
                this.data = str;
            }

            public static /* synthetic */ SendAnalytics copy$default(SendAnalytics sendAnalytics, NotificationType notificationType, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    notificationType = sendAnalytics.type;
                }
                if ((i10 & 2) != 0) {
                    str = sendAnalytics.data;
                }
                return sendAnalytics.copy(notificationType, str);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final NotificationType getType() {
                return this.type;
            }

            @Nullable
            /* JADX INFO: renamed from: component2, reason: from getter */
            public final String getData() {
                return this.data;
            }

            @NotNull
            public final SendAnalytics copy(@NotNull NotificationType type, @Nullable String data) {
                Intrinsics.checkNotNullParameter(type, "type");
                return new SendAnalytics(type, data);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SendAnalytics)) {
                    return false;
                }
                SendAnalytics sendAnalytics = (SendAnalytics) other;
                return this.type == sendAnalytics.type && Intrinsics.areEqual(this.data, sendAnalytics.data);
            }

            @Nullable
            public final String getData() {
                return this.data;
            }

            @NotNull
            public final NotificationType getType() {
                return this.type;
            }

            public int hashCode() {
                int iHashCode = this.type.hashCode() * 31;
                String str = this.data;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            @NotNull
            public String toString() {
                return "SendAnalytics(type=" + this.type + ", data=" + this.data + ")";
            }

            public /* synthetic */ SendAnalytics(NotificationType notificationType, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(notificationType, (i10 & 2) != 0 ? null : str);
            }
        }

        public Intent() {
        }

        public /* synthetic */ Intent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: compiled from: NotificationNoCommercialContract.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/bbva/notifications/activity/NotificationNoCommercialContract$State;", "", "()V", "Error", "Loading", "Ready", "TimerExpired", "Lcom/bbva/notifications/activity/NotificationNoCommercialContract$State$Error;", "Lcom/bbva/notifications/activity/NotificationNoCommercialContract$State$Loading;", "Lcom/bbva/notifications/activity/NotificationNoCommercialContract$State$Ready;", "Lcom/bbva/notifications/activity/NotificationNoCommercialContract$State$TimerExpired;", "Notifications_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class State {

        /* JADX INFO: compiled from: NotificationNoCommercialContract.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/bbva/notifications/activity/NotificationNoCommercialContract$State$Error;", "Lcom/bbva/notifications/activity/NotificationNoCommercialContract$State;", "()V", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "Notifications_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Error extends State {

            @NotNull
            public static final Error INSTANCE = new Error();

            public Error() {
                super(null);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Error)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 1359298888;
            }

            @NotNull
            public String toString() {
                return "Error";
            }
        }

        /* JADX INFO: compiled from: NotificationNoCommercialContract.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/bbva/notifications/activity/NotificationNoCommercialContract$State$Loading;", "Lcom/bbva/notifications/activity/NotificationNoCommercialContract$State;", "()V", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "Notifications_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Loading extends State {

            @NotNull
            public static final Loading INSTANCE = new Loading();

            public Loading() {
                super(null);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Loading)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return -1863155588;
            }

            @NotNull
            public String toString() {
                return "Loading";
            }
        }

        /* JADX INFO: compiled from: NotificationNoCommercialContract.kt */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/bbva/notifications/activity/NotificationNoCommercialContract$State$Ready;", "Lcom/bbva/notifications/activity/NotificationNoCommercialContract$State;", "Lcom/bbva/notifications/model/NotificationView;", "component1", "notificationView", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Lcom/bbva/notifications/model/NotificationView;", "getNotificationView", "()Lcom/bbva/notifications/model/NotificationView;", "<init>", "(Lcom/bbva/notifications/model/NotificationView;)V", "Notifications_mexicoRelease"}, k = 1, mv = {1, 9, 0})
        public static final /* data */ class Ready extends State {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final NotificationView notificationView;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Ready(@NotNull NotificationView notificationView) {
                super(null);
                Intrinsics.checkNotNullParameter(notificationView, "notificationView");
                this.notificationView = notificationView;
            }

            public static /* synthetic */ Ready copy$default(Ready ready, NotificationView notificationView, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    notificationView = ready.notificationView;
                }
                return ready.copy(notificationView);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final NotificationView getNotificationView() {
                return this.notificationView;
            }

            @NotNull
            public final Ready copy(@NotNull NotificationView notificationView) {
                Intrinsics.checkNotNullParameter(notificationView, "notificationView");
                return new Ready(notificationView);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Ready) && Intrinsics.areEqual(this.notificationView, ((Ready) other).notificationView);
            }

            @NotNull
            public final NotificationView getNotificationView() {
                return this.notificationView;
            }

            public int hashCode() {
                return this.notificationView.hashCode();
            }

            @NotNull
            public String toString() {
                return "Ready(notificationView=" + this.notificationView + ")";
            }
        }

        /* JADX INFO: compiled from: NotificationNoCommercialContract.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/bbva/notifications/activity/NotificationNoCommercialContract$State$TimerExpired;", "Lcom/bbva/notifications/activity/NotificationNoCommercialContract$State;", "()V", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "Notifications_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class TimerExpired extends State {

            @NotNull
            public static final TimerExpired INSTANCE = new TimerExpired();

            public TimerExpired() {
                super(null);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof TimerExpired)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return -1887020832;
            }

            @NotNull
            public String toString() {
                return "TimerExpired";
            }
        }

        public State() {
        }

        public /* synthetic */ State(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
