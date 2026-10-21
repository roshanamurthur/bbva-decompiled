package com.bbva.glomohybrid.splash.presentation.view;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.glomohybrid.base.shortcuts.ShortcutActions;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SplashContract.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, d2 = {"Lcom/bbva/glomohybrid/splash/presentation/view/SplashContract;", "", "()V", "Event", "Intent", "Splash_mexicoProdRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SplashContract {

    /* JADX INFO: compiled from: SplashContract.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/bbva/glomohybrid/splash/presentation/view/SplashContract$Event;", "", "()V", "DeepLinkHandled", "Navigate", "Lcom/bbva/glomohybrid/splash/presentation/view/SplashContract$Event$DeepLinkHandled;", "Lcom/bbva/glomohybrid/splash/presentation/view/SplashContract$Event$Navigate;", "Splash_mexicoProdRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class Event {

        /* JADX INFO: compiled from: SplashContract.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/bbva/glomohybrid/splash/presentation/view/SplashContract$Event$DeepLinkHandled;", "Lcom/bbva/glomohybrid/splash/presentation/view/SplashContract$Event;", "()V", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "Splash_mexicoProdRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class DeepLinkHandled extends Event {

            @NotNull
            public static final DeepLinkHandled INSTANCE = new DeepLinkHandled();

            public DeepLinkHandled() {
                super(null);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof DeepLinkHandled)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 519795501;
            }

            @NotNull
            public String toString() {
                return "DeepLinkHandled";
            }
        }

        /* JADX INFO: compiled from: SplashContract.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/bbva/glomohybrid/splash/presentation/view/SplashContract$Event$Navigate;", "Lcom/bbva/glomohybrid/splash/presentation/view/SplashContract$Event;", "()V", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "Splash_mexicoProdRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Navigate extends Event {

            @NotNull
            public static final Navigate INSTANCE = new Navigate();

            public Navigate() {
                super(null);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Navigate)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return -316524678;
            }

            @NotNull
            public String toString() {
                return "Navigate";
            }
        }

        public Event() {
        }

        public /* synthetic */ Event(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: compiled from: SplashContract.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/bbva/glomohybrid/splash/presentation/view/SplashContract$Intent;", "", "()V", "ShortcutWebMessage", "Started", "Lcom/bbva/glomohybrid/splash/presentation/view/SplashContract$Intent$ShortcutWebMessage;", "Lcom/bbva/glomohybrid/splash/presentation/view/SplashContract$Intent$Started;", "Splash_mexicoProdRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class Intent {

        /* JADX INFO: compiled from: SplashContract.kt */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/bbva/glomohybrid/splash/presentation/view/SplashContract$Intent$ShortcutWebMessage;", "Lcom/bbva/glomohybrid/splash/presentation/view/SplashContract$Intent;", "", "component1", "Lcom/bbva/glomohybrid/base/shortcuts/ShortcutActions;", "component2", "channelWebName", "actions", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Ljava/lang/String;", "getChannelWebName", "()Ljava/lang/String;", "b", "Lcom/bbva/glomohybrid/base/shortcuts/ShortcutActions;", "getActions", "()Lcom/bbva/glomohybrid/base/shortcuts/ShortcutActions;", "<init>", "(Ljava/lang/String;Lcom/bbva/glomohybrid/base/shortcuts/ShortcutActions;)V", "Splash_mexicoProdRelease"}, k = 1, mv = {1, 9, 0})
        public static final /* data */ class ShortcutWebMessage extends Intent {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final String channelWebName;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final ShortcutActions actions;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ShortcutWebMessage(@NotNull String channelWebName, @NotNull ShortcutActions actions) {
                super(null);
                Intrinsics.checkNotNullParameter(channelWebName, "channelWebName");
                Intrinsics.checkNotNullParameter(actions, "actions");
                this.channelWebName = channelWebName;
                this.actions = actions;
            }

            public static /* synthetic */ ShortcutWebMessage copy$default(ShortcutWebMessage shortcutWebMessage, String str, ShortcutActions shortcutActions, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = shortcutWebMessage.channelWebName;
                }
                if ((i10 & 2) != 0) {
                    shortcutActions = shortcutWebMessage.actions;
                }
                return shortcutWebMessage.copy(str, shortcutActions);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getChannelWebName() {
                return this.channelWebName;
            }

            @NotNull
            /* JADX INFO: renamed from: component2, reason: from getter */
            public final ShortcutActions getActions() {
                return this.actions;
            }

            @NotNull
            public final ShortcutWebMessage copy(@NotNull String channelWebName, @NotNull ShortcutActions actions) {
                Intrinsics.checkNotNullParameter(channelWebName, "channelWebName");
                Intrinsics.checkNotNullParameter(actions, "actions");
                return new ShortcutWebMessage(channelWebName, actions);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ShortcutWebMessage)) {
                    return false;
                }
                ShortcutWebMessage shortcutWebMessage = (ShortcutWebMessage) other;
                return Intrinsics.areEqual(this.channelWebName, shortcutWebMessage.channelWebName) && this.actions == shortcutWebMessage.actions;
            }

            @NotNull
            public final ShortcutActions getActions() {
                return this.actions;
            }

            @NotNull
            public final String getChannelWebName() {
                return this.channelWebName;
            }

            public int hashCode() {
                return this.actions.hashCode() + (this.channelWebName.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return "ShortcutWebMessage(channelWebName=" + this.channelWebName + ", actions=" + this.actions + ")";
            }
        }

        /* JADX INFO: compiled from: SplashContract.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/bbva/glomohybrid/splash/presentation/view/SplashContract$Intent$Started;", "Lcom/bbva/glomohybrid/splash/presentation/view/SplashContract$Intent;", "()V", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "Splash_mexicoProdRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Started extends Intent {

            @NotNull
            public static final Started INSTANCE = new Started();

            public Started() {
                super(null);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Started)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 608912420;
            }

            @NotNull
            public String toString() {
                return "Started";
            }
        }

        public Intent() {
        }

        public /* synthetic */ Intent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
