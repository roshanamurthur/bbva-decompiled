package com.bbva.glomohybrid.infoscreen.fragment;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: InfoScreenType.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \b2\u00020\u0001:\t\b\t\n\u000b\f\r\u000e\u000f\u0010R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\b\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018¨\u0006\u0019"}, d2 = {"Lcom/bbva/glomohybrid/infoscreen/fragment/InfoScreenType;", "", "", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "id", "Companion", "DeviceActivationInfoScreen", "NetworkInfoScreen", "NotificationErrorInfoScreen", "RootNotRestrictedScreen", "RootRestrictedScreen", "StandardInfoScreen", "TimerExpiredForegroundStateErrorInfoScreen", "TimerExpiredRunningStateErrorInfoScreen", "Lcom/bbva/glomohybrid/infoscreen/fragment/InfoScreenType$DeviceActivationInfoScreen;", "Lcom/bbva/glomohybrid/infoscreen/fragment/InfoScreenType$NetworkInfoScreen;", "Lcom/bbva/glomohybrid/infoscreen/fragment/InfoScreenType$NotificationErrorInfoScreen;", "Lcom/bbva/glomohybrid/infoscreen/fragment/InfoScreenType$RootNotRestrictedScreen;", "Lcom/bbva/glomohybrid/infoscreen/fragment/InfoScreenType$RootRestrictedScreen;", "Lcom/bbva/glomohybrid/infoscreen/fragment/InfoScreenType$StandardInfoScreen;", "Lcom/bbva/glomohybrid/infoscreen/fragment/InfoScreenType$TimerExpiredForegroundStateErrorInfoScreen;", "Lcom/bbva/glomohybrid/infoscreen/fragment/InfoScreenType$TimerExpiredRunningStateErrorInfoScreen;", "info-modal_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public abstract class InfoScreenType {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String id;

    /* JADX INFO: compiled from: InfoScreenType.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/bbva/glomohybrid/infoscreen/fragment/InfoScreenType$Companion;", "", "()V", "getRootScreenType", "Lcom/bbva/glomohybrid/infoscreen/fragment/InfoScreenType;", "isRestrictedMode", "", "info-modal_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final InfoScreenType getRootScreenType(boolean isRestrictedMode) {
            return isRestrictedMode ? RootRestrictedScreen.INSTANCE : RootNotRestrictedScreen.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: InfoScreenType.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/glomohybrid/infoscreen/fragment/InfoScreenType$DeviceActivationInfoScreen;", "Lcom/bbva/glomohybrid/infoscreen/fragment/InfoScreenType;", "()V", "info-modal_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class DeviceActivationInfoScreen extends InfoScreenType {

        @NotNull
        public static final DeviceActivationInfoScreen INSTANCE = new DeviceActivationInfoScreen();

        public DeviceActivationInfoScreen() {
            super("DeviceActivation", null);
        }
    }

    /* JADX INFO: compiled from: InfoScreenType.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/glomohybrid/infoscreen/fragment/InfoScreenType$NetworkInfoScreen;", "Lcom/bbva/glomohybrid/infoscreen/fragment/InfoScreenType;", "()V", "info-modal_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class NetworkInfoScreen extends InfoScreenType {

        @NotNull
        public static final NetworkInfoScreen INSTANCE = new NetworkInfoScreen();

        public NetworkInfoScreen() {
            super("Network", null);
        }
    }

    /* JADX INFO: compiled from: InfoScreenType.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/glomohybrid/infoscreen/fragment/InfoScreenType$NotificationErrorInfoScreen;", "Lcom/bbva/glomohybrid/infoscreen/fragment/InfoScreenType;", "()V", "info-modal_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class NotificationErrorInfoScreen extends InfoScreenType {

        @NotNull
        public static final NotificationErrorInfoScreen INSTANCE = new NotificationErrorInfoScreen();

        public NotificationErrorInfoScreen() {
            super("NotificationError", null);
        }
    }

    /* JADX INFO: compiled from: InfoScreenType.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/glomohybrid/infoscreen/fragment/InfoScreenType$RootNotRestrictedScreen;", "Lcom/bbva/glomohybrid/infoscreen/fragment/InfoScreenType;", "()V", "info-modal_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class RootNotRestrictedScreen extends InfoScreenType {

        @NotNull
        public static final RootNotRestrictedScreen INSTANCE = new RootNotRestrictedScreen();

        public RootNotRestrictedScreen() {
            super("RootNotRestricted", null);
        }
    }

    /* JADX INFO: compiled from: InfoScreenType.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/glomohybrid/infoscreen/fragment/InfoScreenType$RootRestrictedScreen;", "Lcom/bbva/glomohybrid/infoscreen/fragment/InfoScreenType;", "()V", "info-modal_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class RootRestrictedScreen extends InfoScreenType {

        @NotNull
        public static final RootRestrictedScreen INSTANCE = new RootRestrictedScreen();

        public RootRestrictedScreen() {
            super("RootRestricted", null);
        }
    }

    /* JADX INFO: compiled from: InfoScreenType.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/glomohybrid/infoscreen/fragment/InfoScreenType$StandardInfoScreen;", "Lcom/bbva/glomohybrid/infoscreen/fragment/InfoScreenType;", "()V", "info-modal_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class StandardInfoScreen extends InfoScreenType {

        @NotNull
        public static final StandardInfoScreen INSTANCE = new StandardInfoScreen();

        public StandardInfoScreen() {
            super("Standard", null);
        }
    }

    /* JADX INFO: compiled from: InfoScreenType.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/bbva/glomohybrid/infoscreen/fragment/InfoScreenType$TimerExpiredForegroundStateErrorInfoScreen;", "Lcom/bbva/glomohybrid/infoscreen/fragment/InfoScreenType;", "()V", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "info-modal_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class TimerExpiredForegroundStateErrorInfoScreen extends InfoScreenType {

        @NotNull
        public static final TimerExpiredForegroundStateErrorInfoScreen INSTANCE = new TimerExpiredForegroundStateErrorInfoScreen();

        public TimerExpiredForegroundStateErrorInfoScreen() {
            super("TimerExpiredForeground", null);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TimerExpiredForegroundStateErrorInfoScreen)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -601903960;
        }

        @NotNull
        public String toString() {
            return "TimerExpiredForegroundStateErrorInfoScreen";
        }
    }

    /* JADX INFO: compiled from: InfoScreenType.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/bbva/glomohybrid/infoscreen/fragment/InfoScreenType$TimerExpiredRunningStateErrorInfoScreen;", "Lcom/bbva/glomohybrid/infoscreen/fragment/InfoScreenType;", "()V", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "info-modal_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class TimerExpiredRunningStateErrorInfoScreen extends InfoScreenType {

        @NotNull
        public static final TimerExpiredRunningStateErrorInfoScreen INSTANCE = new TimerExpiredRunningStateErrorInfoScreen();

        public TimerExpiredRunningStateErrorInfoScreen() {
            super("TimerExpiredRunning", null);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TimerExpiredRunningStateErrorInfoScreen)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 683963964;
        }

        @NotNull
        public String toString() {
            return "TimerExpiredRunningStateErrorInfoScreen";
        }
    }

    public InfoScreenType(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this.id = str;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }
}
