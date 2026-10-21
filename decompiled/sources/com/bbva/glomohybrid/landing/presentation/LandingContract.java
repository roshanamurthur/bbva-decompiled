package com.bbva.glomohybrid.landing.presentation;

import ad.d;
import com.bbva.appsflyer.DeepLinkListenerAdapter;
import com.bbva.component.dm.analytics.constants.AnalyticsConstants;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.ethermobilesdk.tokencompat.storage.local.UUIDPreferences;
import com.bbva.glomohybrid.base.models.DeepLinkModel;
import com.bbva.glomohybrid.base.models.ModalType;
import com.bbva.glomohybrid.base.models.ShortcutModel;
import com.bbva.glomohybrid.base.router.Route;
import com.bbva.glomohybrid.base.snackbar.SnackbarSpec;
import com.bbva.glomohybrid.base.snackbar.SnackbarState;
import com.bbva.glomohybrid.landing.domain.model.LandingBiometricsParams;
import com.bbva.glomohybrid.landing.domain.sections.model.LandingSection;
import com.bbva.glomohybrid.landing.presentation.model.LandingHeaderState;
import com.bbva.glomohybrid.landing.presentation.model.LandingInAppUpdate;
import com.bbva.glomohybrid.landing.presentation.model.LandingLink;
import com.bbva.glomohybrid.landing.presentation.model.LandingNavigationPayload;
import com.bbva.notifications.model.constants.BanxicoConstants;
import com.bbva.ui.component.menu.model.MenuItem;
import com.google.firebase.dynamiclinks.DynamicLink;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LandingContract.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0006"}, d2 = {"Lcom/bbva/glomohybrid/landing/presentation/LandingContract;", "", "()V", "Event", "Intent", "State", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class LandingContract {

    /* JADX INFO: compiled from: LandingContract.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\bB\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0006\t\n\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/bbva/glomohybrid/landing/presentation/LandingContract$Event;", "", "()V", "CustomNavigation", "EnterpriseNavigation", "ImmediateUpdateNavigation", "Modal", "Navigation", "SnackBar", "Lcom/bbva/glomohybrid/landing/presentation/LandingContract$Event$CustomNavigation;", "Lcom/bbva/glomohybrid/landing/presentation/LandingContract$Event$EnterpriseNavigation;", "Lcom/bbva/glomohybrid/landing/presentation/LandingContract$Event$ImmediateUpdateNavigation;", "Lcom/bbva/glomohybrid/landing/presentation/LandingContract$Event$Modal;", "Lcom/bbva/glomohybrid/landing/presentation/LandingContract$Event$Navigation;", "Lcom/bbva/glomohybrid/landing/presentation/LandingContract$Event$SnackBar;", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class Event {

        /* JADX INFO: compiled from: LandingContract.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/bbva/glomohybrid/landing/presentation/LandingContract$Event$CustomNavigation;", "Lcom/bbva/glomohybrid/landing/presentation/LandingContract$Event;", "", "component1", "route", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Ljava/lang/String;", "getRoute", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0})
        public static final /* data */ class CustomNavigation extends Event {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final String route;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CustomNavigation(@NotNull String route) {
                super(null);
                Intrinsics.checkNotNullParameter(route, "route");
                this.route = route;
            }

            public static /* synthetic */ CustomNavigation copy$default(CustomNavigation customNavigation, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = customNavigation.route;
                }
                return customNavigation.copy(str);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getRoute() {
                return this.route;
            }

            @NotNull
            public final CustomNavigation copy(@NotNull String route) {
                Intrinsics.checkNotNullParameter(route, "route");
                return new CustomNavigation(route);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof CustomNavigation) && Intrinsics.areEqual(this.route, ((CustomNavigation) other).route);
            }

            @NotNull
            public final String getRoute() {
                return this.route;
            }

            public int hashCode() {
                return this.route.hashCode();
            }

            @NotNull
            public String toString() {
                return d.f(new StringBuilder("CustomNavigation(route="), this.route, ")");
            }
        }

        /* JADX INFO: compiled from: LandingContract.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/bbva/glomohybrid/landing/presentation/LandingContract$Event$EnterpriseNavigation;", "Lcom/bbva/glomohybrid/landing/presentation/LandingContract$Event;", "()V", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class EnterpriseNavigation extends Event {

            @NotNull
            public static final EnterpriseNavigation INSTANCE = new EnterpriseNavigation();

            public EnterpriseNavigation() {
                super(null);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof EnterpriseNavigation)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 617042287;
            }

            @NotNull
            public String toString() {
                return "EnterpriseNavigation";
            }
        }

        /* JADX INFO: compiled from: LandingContract.kt */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/bbva/glomohybrid/landing/presentation/LandingContract$Event$ImmediateUpdateNavigation;", "Lcom/bbva/glomohybrid/landing/presentation/LandingContract$Event;", "Lcom/bbva/glomohybrid/landing/presentation/model/LandingInAppUpdate;", "component1", "update", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Lcom/bbva/glomohybrid/landing/presentation/model/LandingInAppUpdate;", "getUpdate", "()Lcom/bbva/glomohybrid/landing/presentation/model/LandingInAppUpdate;", "<init>", "(Lcom/bbva/glomohybrid/landing/presentation/model/LandingInAppUpdate;)V", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0})
        public static final /* data */ class ImmediateUpdateNavigation extends Event {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final LandingInAppUpdate update;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ImmediateUpdateNavigation(@NotNull LandingInAppUpdate update) {
                super(null);
                Intrinsics.checkNotNullParameter(update, "update");
                this.update = update;
            }

            public static /* synthetic */ ImmediateUpdateNavigation copy$default(ImmediateUpdateNavigation immediateUpdateNavigation, LandingInAppUpdate landingInAppUpdate, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    landingInAppUpdate = immediateUpdateNavigation.update;
                }
                return immediateUpdateNavigation.copy(landingInAppUpdate);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final LandingInAppUpdate getUpdate() {
                return this.update;
            }

            @NotNull
            public final ImmediateUpdateNavigation copy(@NotNull LandingInAppUpdate update) {
                Intrinsics.checkNotNullParameter(update, "update");
                return new ImmediateUpdateNavigation(update);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ImmediateUpdateNavigation) && Intrinsics.areEqual(this.update, ((ImmediateUpdateNavigation) other).update);
            }

            @NotNull
            public final LandingInAppUpdate getUpdate() {
                return this.update;
            }

            public int hashCode() {
                return this.update.hashCode();
            }

            @NotNull
            public String toString() {
                return "ImmediateUpdateNavigation(update=" + this.update + ")";
            }
        }

        /* JADX INFO: compiled from: LandingContract.kt */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/bbva/glomohybrid/landing/presentation/LandingContract$Event$Modal;", "Lcom/bbva/glomohybrid/landing/presentation/LandingContract$Event;", "Lcom/bbva/glomohybrid/base/models/ModalType;", "component1", "value", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Lcom/bbva/glomohybrid/base/models/ModalType;", "getValue", "()Lcom/bbva/glomohybrid/base/models/ModalType;", "<init>", "(Lcom/bbva/glomohybrid/base/models/ModalType;)V", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0})
        public static final /* data */ class Modal extends Event {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final ModalType value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Modal(@NotNull ModalType value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }

            public static /* synthetic */ Modal copy$default(Modal modal, ModalType modalType, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    modalType = modal.value;
                }
                return modal.copy(modalType);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final ModalType getValue() {
                return this.value;
            }

            @NotNull
            public final Modal copy(@NotNull ModalType value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return new Modal(value);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Modal) && Intrinsics.areEqual(this.value, ((Modal) other).value);
            }

            @NotNull
            public final ModalType getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            @NotNull
            public String toString() {
                return "Modal(value=" + this.value + ")";
            }
        }

        /* JADX INFO: compiled from: LandingContract.kt */
        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001:\u0001(B-\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b&\u0010'J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0003J3\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\bHÆ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\r\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006)"}, d2 = {"Lcom/bbva/glomohybrid/landing/presentation/LandingContract$Event$Navigation;", "Lcom/bbva/glomohybrid/landing/presentation/LandingContract$Event;", "Lcom/bbva/glomohybrid/landing/presentation/LandingContract$Event$Navigation$Type;", "component1", "Lcom/bbva/glomohybrid/base/router/Route;", "component2", "", "component3", "Lcom/bbva/glomohybrid/landing/presentation/model/LandingNavigationPayload;", "component4", "type", "route", "clearHistory", BanxicoConstants.KEY_HISTORICAL_PAYLOAD, "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "equals", "a", "Lcom/bbva/glomohybrid/landing/presentation/LandingContract$Event$Navigation$Type;", "getType", "()Lcom/bbva/glomohybrid/landing/presentation/LandingContract$Event$Navigation$Type;", "b", "Lcom/bbva/glomohybrid/base/router/Route;", "getRoute", "()Lcom/bbva/glomohybrid/base/router/Route;", "c", "Z", "getClearHistory", "()Z", "d", "Lcom/bbva/glomohybrid/landing/presentation/model/LandingNavigationPayload;", "getPayload", "()Lcom/bbva/glomohybrid/landing/presentation/model/LandingNavigationPayload;", "<init>", "(Lcom/bbva/glomohybrid/landing/presentation/LandingContract$Event$Navigation$Type;Lcom/bbva/glomohybrid/base/router/Route;ZLcom/bbva/glomohybrid/landing/presentation/model/LandingNavigationPayload;)V", UUIDPreferences.TYPE_KEY, "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0})
        public static final /* data */ class Navigation extends Event {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Type type;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Route route;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            public final boolean clearHistory;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final LandingNavigationPayload payload;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* JADX INFO: compiled from: LandingContract.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/bbva/glomohybrid/landing/presentation/LandingContract$Event$Navigation$Type;", "", "NATIVE", "WEB", "DIALER", "MARKET", "EXTERNAL_APP", "EXTERNAL_WEB_LINK", "CUSTOM", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0})
            public static final class Type {
                private static final /* synthetic */ EnumEntries $ENTRIES;
                private static final /* synthetic */ Type[] $VALUES;
                public static final Type CUSTOM;
                public static final Type DIALER;
                public static final Type EXTERNAL_APP;
                public static final Type EXTERNAL_WEB_LINK;
                public static final Type MARKET;
                public static final Type NATIVE;
                public static final Type WEB;

                static {
                    Type type = new Type("NATIVE", 0);
                    NATIVE = type;
                    Type type2 = new Type("WEB", 1);
                    WEB = type2;
                    Type type3 = new Type("DIALER", 2);
                    DIALER = type3;
                    Type type4 = new Type("MARKET", 3);
                    MARKET = type4;
                    Type type5 = new Type("EXTERNAL_APP", 4);
                    EXTERNAL_APP = type5;
                    Type type6 = new Type("EXTERNAL_WEB_LINK", 5);
                    EXTERNAL_WEB_LINK = type6;
                    Type type7 = new Type("CUSTOM", 6);
                    CUSTOM = type7;
                    Type[] typeArr = {type, type2, type3, type4, type5, type6, type7};
                    $VALUES = typeArr;
                    $ENTRIES = EnumEntriesKt.enumEntries(typeArr);
                }

                public Type() {
                    throw null;
                }

                @NotNull
                public static EnumEntries<Type> getEntries() {
                    return $ENTRIES;
                }

                public static Type valueOf(String str) {
                    return (Type) Enum.valueOf(Type.class, str);
                }

                public static Type[] values() {
                    return (Type[]) $VALUES.clone();
                }
            }

            public /* synthetic */ Navigation(Type type, Route route, boolean z10, LandingNavigationPayload landingNavigationPayload, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(type, route, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? null : landingNavigationPayload);
            }

            public static /* synthetic */ Navigation copy$default(Navigation navigation, Type type, Route route, boolean z10, LandingNavigationPayload landingNavigationPayload, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    type = navigation.type;
                }
                if ((i10 & 2) != 0) {
                    route = navigation.route;
                }
                if ((i10 & 4) != 0) {
                    z10 = navigation.clearHistory;
                }
                if ((i10 & 8) != 0) {
                    landingNavigationPayload = navigation.payload;
                }
                return navigation.copy(type, route, z10, landingNavigationPayload);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final Type getType() {
                return this.type;
            }

            @NotNull
            /* JADX INFO: renamed from: component2, reason: from getter */
            public final Route getRoute() {
                return this.route;
            }

            /* JADX INFO: renamed from: component3, reason: from getter */
            public final boolean getClearHistory() {
                return this.clearHistory;
            }

            @Nullable
            /* JADX INFO: renamed from: component4, reason: from getter */
            public final LandingNavigationPayload getPayload() {
                return this.payload;
            }

            @NotNull
            public final Navigation copy(@NotNull Type type, @NotNull Route route, boolean clearHistory, @Nullable LandingNavigationPayload payload) {
                Intrinsics.checkNotNullParameter(type, "type");
                Intrinsics.checkNotNullParameter(route, "route");
                return new Navigation(type, route, clearHistory, payload);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Navigation)) {
                    return false;
                }
                Navigation navigation = (Navigation) other;
                return this.type == navigation.type && Intrinsics.areEqual(this.route, navigation.route) && this.clearHistory == navigation.clearHistory && Intrinsics.areEqual(this.payload, navigation.payload);
            }

            public final boolean getClearHistory() {
                return this.clearHistory;
            }

            @Nullable
            public final LandingNavigationPayload getPayload() {
                return this.payload;
            }

            @NotNull
            public final Route getRoute() {
                return this.route;
            }

            @NotNull
            public final Type getType() {
                return this.type;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v10 */
            /* JADX WARN: Type inference failed for: r0v4, types: [int] */
            /* JADX WARN: Type inference failed for: r0v9 */
            /* JADX WARN: Type inference failed for: r1v4, types: [int] */
            public int hashCode() {
                int iHashCode = (this.route.hashCode() + (this.type.hashCode() * 31)) * 31;
                boolean z10 = this.clearHistory;
                ?? r1 = z10;
                if (z10) {
                    r1 = 1;
                }
                int i10 = (iHashCode + r1) * 31;
                LandingNavigationPayload landingNavigationPayload = this.payload;
                return i10 + (landingNavigationPayload == null ? 0 : landingNavigationPayload.hashCode());
            }

            @NotNull
            public String toString() {
                return "Navigation(type=" + this.type + ", route=" + this.route + ", clearHistory=" + this.clearHistory + ", payload=" + this.payload + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Navigation(@NotNull Type type, @NotNull Route route, boolean z10, @Nullable LandingNavigationPayload landingNavigationPayload) {
                super(null);
                Intrinsics.checkNotNullParameter(type, "type");
                Intrinsics.checkNotNullParameter(route, "route");
                this.type = type;
                this.route = route;
                this.clearHistory = z10;
                this.payload = landingNavigationPayload;
            }
        }

        /* JADX INFO: compiled from: LandingContract.kt */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/bbva/glomohybrid/landing/presentation/LandingContract$Event$SnackBar;", "Lcom/bbva/glomohybrid/landing/presentation/LandingContract$Event;", "Lcom/bbva/glomohybrid/base/snackbar/SnackbarState;", "component1", "state", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Lcom/bbva/glomohybrid/base/snackbar/SnackbarState;", "getState", "()Lcom/bbva/glomohybrid/base/snackbar/SnackbarState;", "<init>", "(Lcom/bbva/glomohybrid/base/snackbar/SnackbarState;)V", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0})
        public static final /* data */ class SnackBar extends Event {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final SnackbarState state;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SnackBar(@NotNull SnackbarState state) {
                super(null);
                Intrinsics.checkNotNullParameter(state, "state");
                this.state = state;
            }

            public static /* synthetic */ SnackBar copy$default(SnackBar snackBar, SnackbarState snackbarState, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    snackbarState = snackBar.state;
                }
                return snackBar.copy(snackbarState);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final SnackbarState getState() {
                return this.state;
            }

            @NotNull
            public final SnackBar copy(@NotNull SnackbarState state) {
                Intrinsics.checkNotNullParameter(state, "state");
                return new SnackBar(state);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SnackBar) && Intrinsics.areEqual(this.state, ((SnackBar) other).state);
            }

            @NotNull
            public final SnackbarState getState() {
                return this.state;
            }

            public int hashCode() {
                return this.state.hashCode();
            }

            @NotNull
            public String toString() {
                return "SnackBar(state=" + this.state + ")";
            }
        }

        public Event() {
        }

        public /* synthetic */ Event(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: compiled from: LandingContract.kt */
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u000f\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u000f\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f ¨\u0006!"}, d2 = {"Lcom/bbva/glomohybrid/landing/presentation/LandingContract$Intent;", "", "()V", "CancelPendingNavigation", "ChangeUserTap", "EnterpriseLogin", "LoadProfile", "LoginButtonTap", "MenuItemTap", "Notification", "OpenLink", "PerformChangeUser", "ResumePendingNavigation", "SectionItemTap", "Shortcut", "ShortcutItemTap", "SnackBarReceived", "UpdateApp", "Lcom/bbva/glomohybrid/landing/presentation/LandingContract$Intent$CancelPendingNavigation;", "Lcom/bbva/glomohybrid/landing/presentation/LandingContract$Intent$ChangeUserTap;", "Lcom/bbva/glomohybrid/landing/presentation/LandingContract$Intent$EnterpriseLogin;", "Lcom/bbva/glomohybrid/landing/presentation/LandingContract$Intent$LoadProfile;", "Lcom/bbva/glomohybrid/landing/presentation/LandingContract$Intent$LoginButtonTap;", "Lcom/bbva/glomohybrid/landing/presentation/LandingContract$Intent$MenuItemTap;", "Lcom/bbva/glomohybrid/landing/presentation/LandingContract$Intent$Notification;", "Lcom/bbva/glomohybrid/landing/presentation/LandingContract$Intent$OpenLink;", "Lcom/bbva/glomohybrid/landing/presentation/LandingContract$Intent$PerformChangeUser;", "Lcom/bbva/glomohybrid/landing/presentation/LandingContract$Intent$ResumePendingNavigation;", "Lcom/bbva/glomohybrid/landing/presentation/LandingContract$Intent$SectionItemTap;", "Lcom/bbva/glomohybrid/landing/presentation/LandingContract$Intent$Shortcut;", "Lcom/bbva/glomohybrid/landing/presentation/LandingContract$Intent$ShortcutItemTap;", "Lcom/bbva/glomohybrid/landing/presentation/LandingContract$Intent$SnackBarReceived;", "Lcom/bbva/glomohybrid/landing/presentation/LandingContract$Intent$UpdateApp;", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class Intent {

        /* JADX INFO: compiled from: LandingContract.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/bbva/glomohybrid/landing/presentation/LandingContract$Intent$CancelPendingNavigation;", "Lcom/bbva/glomohybrid/landing/presentation/LandingContract$Intent;", "()V", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class CancelPendingNavigation extends Intent {

            @NotNull
            public static final CancelPendingNavigation INSTANCE = new CancelPendingNavigation();

            public CancelPendingNavigation() {
                super(null);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof CancelPendingNavigation)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 1957769573;
            }

            @NotNull
            public String toString() {
                return "CancelPendingNavigation";
            }
        }

        /* JADX INFO: compiled from: LandingContract.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/bbva/glomohybrid/landing/presentation/LandingContract$Intent$ChangeUserTap;", "Lcom/bbva/glomohybrid/landing/presentation/LandingContract$Intent;", "()V", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ChangeUserTap extends Intent {

            @NotNull
            public static final ChangeUserTap INSTANCE = new ChangeUserTap();

            public ChangeUserTap() {
                super(null);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ChangeUserTap)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return -2105241412;
            }

            @NotNull
            public String toString() {
                return "ChangeUserTap";
            }
        }

        /* JADX INFO: compiled from: LandingContract.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/bbva/glomohybrid/landing/presentation/LandingContract$Intent$EnterpriseLogin;", "Lcom/bbva/glomohybrid/landing/presentation/LandingContract$Intent;", "()V", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class EnterpriseLogin extends Intent {

            @NotNull
            public static final EnterpriseLogin INSTANCE = new EnterpriseLogin();

            public EnterpriseLogin() {
                super(null);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof EnterpriseLogin)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return -789204420;
            }

            @NotNull
            public String toString() {
                return "EnterpriseLogin";
            }
        }

        /* JADX INFO: compiled from: LandingContract.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/bbva/glomohybrid/landing/presentation/LandingContract$Intent$LoadProfile;", "Lcom/bbva/glomohybrid/landing/presentation/LandingContract$Intent;", "()V", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class LoadProfile extends Intent {

            @NotNull
            public static final LoadProfile INSTANCE = new LoadProfile();

            public LoadProfile() {
                super(null);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof LoadProfile)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 1563367831;
            }

            @NotNull
            public String toString() {
                return "LoadProfile";
            }
        }

        /* JADX INFO: compiled from: LandingContract.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/bbva/glomohybrid/landing/presentation/LandingContract$Intent$LoginButtonTap;", "Lcom/bbva/glomohybrid/landing/presentation/LandingContract$Intent;", "()V", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class LoginButtonTap extends Intent {

            @NotNull
            public static final LoginButtonTap INSTANCE = new LoginButtonTap();

            public LoginButtonTap() {
                super(null);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof LoginButtonTap)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 1028520308;
            }

            @NotNull
            public String toString() {
                return "LoginButtonTap";
            }
        }

        /* JADX INFO: compiled from: LandingContract.kt */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/bbva/glomohybrid/landing/presentation/LandingContract$Intent$MenuItemTap;", "Lcom/bbva/glomohybrid/landing/presentation/LandingContract$Intent;", "Lcom/bbva/ui/component/menu/model/MenuItem;", "component1", AnalyticsConstants.Key.ITEM, "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Lcom/bbva/ui/component/menu/model/MenuItem;", "getItem", "()Lcom/bbva/ui/component/menu/model/MenuItem;", "<init>", "(Lcom/bbva/ui/component/menu/model/MenuItem;)V", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0})
        public static final /* data */ class MenuItemTap extends Intent {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final MenuItem item;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public MenuItemTap(@NotNull MenuItem item) {
                super(null);
                Intrinsics.checkNotNullParameter(item, "item");
                this.item = item;
            }

            public static /* synthetic */ MenuItemTap copy$default(MenuItemTap menuItemTap, MenuItem menuItem, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    menuItem = menuItemTap.item;
                }
                return menuItemTap.copy(menuItem);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final MenuItem getItem() {
                return this.item;
            }

            @NotNull
            public final MenuItemTap copy(@NotNull MenuItem item) {
                Intrinsics.checkNotNullParameter(item, "item");
                return new MenuItemTap(item);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof MenuItemTap) && Intrinsics.areEqual(this.item, ((MenuItemTap) other).item);
            }

            @NotNull
            public final MenuItem getItem() {
                return this.item;
            }

            public int hashCode() {
                return this.item.hashCode();
            }

            @NotNull
            public String toString() {
                return "MenuItemTap(item=" + this.item + ")";
            }
        }

        /* JADX INFO: compiled from: LandingContract.kt */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b$\u0010%J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0003J7\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\bHÆ\u0001J\t\u0010\u000f\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\bHÖ\u0003R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\r\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006&"}, d2 = {"Lcom/bbva/glomohybrid/landing/presentation/LandingContract$Intent$Notification;", "Lcom/bbva/glomohybrid/landing/presentation/LandingContract$Intent;", "", "component1", "Lcom/bbva/glomohybrid/base/models/DeepLinkModel;", "component2", "", "component3", "", "component4", "needLogin", DeepLinkListenerAdapter.Constants.DEEP_LINK, "route", BanxicoConstants.KEY_HISTORICAL_PAYLOAD, "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "equals", "a", "Z", "getNeedLogin", "()Z", "b", "Lcom/bbva/glomohybrid/base/models/DeepLinkModel;", "getDeepLink", "()Lcom/bbva/glomohybrid/base/models/DeepLinkModel;", "c", "Ljava/lang/String;", "getRoute", "()Ljava/lang/String;", "d", "Ljava/lang/Object;", "getPayload", "()Ljava/lang/Object;", "<init>", "(ZLcom/bbva/glomohybrid/base/models/DeepLinkModel;Ljava/lang/String;Ljava/lang/Object;)V", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0})
        public static final /* data */ class Notification extends Intent {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            public final boolean needLogin;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final DeepLinkModel deepLink;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final String route;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final Object payload;

            public /* synthetic */ Notification(boolean z10, DeepLinkModel deepLinkModel, String str, Object obj, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(z10, (i10 & 2) != 0 ? null : deepLinkModel, (i10 & 4) != 0 ? null : str, (i10 & 8) != 0 ? null : obj);
            }

            public static /* synthetic */ Notification copy$default(Notification notification, boolean z10, DeepLinkModel deepLinkModel, String str, Object obj, int i10, Object obj2) {
                if ((i10 & 1) != 0) {
                    z10 = notification.needLogin;
                }
                if ((i10 & 2) != 0) {
                    deepLinkModel = notification.deepLink;
                }
                if ((i10 & 4) != 0) {
                    str = notification.route;
                }
                if ((i10 & 8) != 0) {
                    obj = notification.payload;
                }
                return notification.copy(z10, deepLinkModel, str, obj);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final boolean getNeedLogin() {
                return this.needLogin;
            }

            @Nullable
            /* JADX INFO: renamed from: component2, reason: from getter */
            public final DeepLinkModel getDeepLink() {
                return this.deepLink;
            }

            @Nullable
            /* JADX INFO: renamed from: component3, reason: from getter */
            public final String getRoute() {
                return this.route;
            }

            @Nullable
            /* JADX INFO: renamed from: component4, reason: from getter */
            public final Object getPayload() {
                return this.payload;
            }

            @NotNull
            public final Notification copy(boolean needLogin, @Nullable DeepLinkModel deepLink, @Nullable String route, @Nullable Object payload) {
                return new Notification(needLogin, deepLink, route, payload);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Notification)) {
                    return false;
                }
                Notification notification = (Notification) other;
                return this.needLogin == notification.needLogin && Intrinsics.areEqual(this.deepLink, notification.deepLink) && Intrinsics.areEqual(this.route, notification.route) && Intrinsics.areEqual(this.payload, notification.payload);
            }

            @Nullable
            public final DeepLinkModel getDeepLink() {
                return this.deepLink;
            }

            public final boolean getNeedLogin() {
                return this.needLogin;
            }

            @Nullable
            public final Object getPayload() {
                return this.payload;
            }

            @Nullable
            public final String getRoute() {
                return this.route;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v1, types: [int] */
            /* JADX WARN: Type inference failed for: r0v8 */
            /* JADX WARN: Type inference failed for: r0v9 */
            public int hashCode() {
                boolean z10 = this.needLogin;
                ?? r1 = z10;
                if (z10) {
                    r1 = 1;
                }
                int i10 = r1 * 31;
                DeepLinkModel deepLinkModel = this.deepLink;
                int iHashCode = (i10 + (deepLinkModel == null ? 0 : deepLinkModel.hashCode())) * 31;
                String str = this.route;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                Object obj = this.payload;
                return iHashCode2 + (obj != null ? obj.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "Notification(needLogin=" + this.needLogin + ", deepLink=" + this.deepLink + ", route=" + this.route + ", payload=" + this.payload + ")";
            }

            public Notification(boolean z10, @Nullable DeepLinkModel deepLinkModel, @Nullable String str, @Nullable Object obj) {
                super(null);
                this.needLogin = z10;
                this.deepLink = deepLinkModel;
                this.route = str;
                this.payload = obj;
            }
        }

        /* JADX INFO: compiled from: LandingContract.kt */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u001f\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0004HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/bbva/glomohybrid/landing/presentation/LandingContract$Intent$OpenLink;", "Lcom/bbva/glomohybrid/landing/presentation/LandingContract$Intent;", "Lcom/bbva/glomohybrid/landing/presentation/model/LandingLink;", "component1", "", "component2", DynamicLink.Builder.KEY_LINK, "analyticsFlow", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Lcom/bbva/glomohybrid/landing/presentation/model/LandingLink;", "getLink", "()Lcom/bbva/glomohybrid/landing/presentation/model/LandingLink;", "b", "Ljava/lang/String;", "getAnalyticsFlow", "()Ljava/lang/String;", "<init>", "(Lcom/bbva/glomohybrid/landing/presentation/model/LandingLink;Ljava/lang/String;)V", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0})
        public static final /* data */ class OpenLink extends Intent {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final LandingLink link;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final String analyticsFlow;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OpenLink(@NotNull LandingLink link, @Nullable String str) {
                super(null);
                Intrinsics.checkNotNullParameter(link, "link");
                this.link = link;
                this.analyticsFlow = str;
            }

            public static /* synthetic */ OpenLink copy$default(OpenLink openLink, LandingLink landingLink, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    landingLink = openLink.link;
                }
                if ((i10 & 2) != 0) {
                    str = openLink.analyticsFlow;
                }
                return openLink.copy(landingLink, str);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final LandingLink getLink() {
                return this.link;
            }

            @Nullable
            /* JADX INFO: renamed from: component2, reason: from getter */
            public final String getAnalyticsFlow() {
                return this.analyticsFlow;
            }

            @NotNull
            public final OpenLink copy(@NotNull LandingLink link, @Nullable String analyticsFlow) {
                Intrinsics.checkNotNullParameter(link, "link");
                return new OpenLink(link, analyticsFlow);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof OpenLink)) {
                    return false;
                }
                OpenLink openLink = (OpenLink) other;
                return Intrinsics.areEqual(this.link, openLink.link) && Intrinsics.areEqual(this.analyticsFlow, openLink.analyticsFlow);
            }

            @Nullable
            public final String getAnalyticsFlow() {
                return this.analyticsFlow;
            }

            @NotNull
            public final LandingLink getLink() {
                return this.link;
            }

            public int hashCode() {
                int iHashCode = this.link.hashCode() * 31;
                String str = this.analyticsFlow;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            @NotNull
            public String toString() {
                return "OpenLink(link=" + this.link + ", analyticsFlow=" + this.analyticsFlow + ")";
            }

            public /* synthetic */ OpenLink(LandingLink landingLink, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(landingLink, (i10 & 2) != 0 ? null : str);
            }
        }

        /* JADX INFO: compiled from: LandingContract.kt */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/bbva/glomohybrid/landing/presentation/LandingContract$Intent$PerformChangeUser;", "Lcom/bbva/glomohybrid/landing/presentation/LandingContract$Intent;", "Lcom/bbva/glomohybrid/landing/domain/model/LandingBiometricsParams;", "component1", "params", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Lcom/bbva/glomohybrid/landing/domain/model/LandingBiometricsParams;", "getParams", "()Lcom/bbva/glomohybrid/landing/domain/model/LandingBiometricsParams;", "<init>", "(Lcom/bbva/glomohybrid/landing/domain/model/LandingBiometricsParams;)V", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0})
        public static final /* data */ class PerformChangeUser extends Intent {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final LandingBiometricsParams params;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PerformChangeUser(@NotNull LandingBiometricsParams params) {
                super(null);
                Intrinsics.checkNotNullParameter(params, "params");
                this.params = params;
            }

            public static /* synthetic */ PerformChangeUser copy$default(PerformChangeUser performChangeUser, LandingBiometricsParams landingBiometricsParams, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    landingBiometricsParams = performChangeUser.params;
                }
                return performChangeUser.copy(landingBiometricsParams);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final LandingBiometricsParams getParams() {
                return this.params;
            }

            @NotNull
            public final PerformChangeUser copy(@NotNull LandingBiometricsParams params) {
                Intrinsics.checkNotNullParameter(params, "params");
                return new PerformChangeUser(params);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof PerformChangeUser) && Intrinsics.areEqual(this.params, ((PerformChangeUser) other).params);
            }

            @NotNull
            public final LandingBiometricsParams getParams() {
                return this.params;
            }

            public int hashCode() {
                return this.params.hashCode();
            }

            @NotNull
            public String toString() {
                return "PerformChangeUser(params=" + this.params + ")";
            }
        }

        /* JADX INFO: compiled from: LandingContract.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/bbva/glomohybrid/landing/presentation/LandingContract$Intent$ResumePendingNavigation;", "Lcom/bbva/glomohybrid/landing/presentation/LandingContract$Intent;", "()V", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ResumePendingNavigation extends Intent {

            @NotNull
            public static final ResumePendingNavigation INSTANCE = new ResumePendingNavigation();

            public ResumePendingNavigation() {
                super(null);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ResumePendingNavigation)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 2103694354;
            }

            @NotNull
            public String toString() {
                return "ResumePendingNavigation";
            }
        }

        /* JADX INFO: compiled from: LandingContract.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012¨\u0006\u0017"}, d2 = {"Lcom/bbva/glomohybrid/landing/presentation/LandingContract$Intent$SectionItemTap;", "Lcom/bbva/glomohybrid/landing/presentation/LandingContract$Intent;", "", "component1", "component2", "id", "param", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "b", "getParam", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0})
        public static final /* data */ class SectionItemTap extends Intent {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final String id;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final String param;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SectionItemTap(@NotNull String id, @NotNull String param) {
                super(null);
                Intrinsics.checkNotNullParameter(id, "id");
                Intrinsics.checkNotNullParameter(param, "param");
                this.id = id;
                this.param = param;
            }

            public static /* synthetic */ SectionItemTap copy$default(SectionItemTap sectionItemTap, String str, String str2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = sectionItemTap.id;
                }
                if ((i10 & 2) != 0) {
                    str2 = sectionItemTap.param;
                }
                return sectionItemTap.copy(str, str2);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getId() {
                return this.id;
            }

            @NotNull
            /* JADX INFO: renamed from: component2, reason: from getter */
            public final String getParam() {
                return this.param;
            }

            @NotNull
            public final SectionItemTap copy(@NotNull String id, @NotNull String param) {
                Intrinsics.checkNotNullParameter(id, "id");
                Intrinsics.checkNotNullParameter(param, "param");
                return new SectionItemTap(id, param);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SectionItemTap)) {
                    return false;
                }
                SectionItemTap sectionItemTap = (SectionItemTap) other;
                return Intrinsics.areEqual(this.id, sectionItemTap.id) && Intrinsics.areEqual(this.param, sectionItemTap.param);
            }

            @NotNull
            public final String getId() {
                return this.id;
            }

            @NotNull
            public final String getParam() {
                return this.param;
            }

            public int hashCode() {
                return this.param.hashCode() + (this.id.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                StringBuilder sb2 = new StringBuilder("SectionItemTap(id=");
                sb2.append(this.id);
                sb2.append(", param=");
                return d.f(sb2, this.param, ")");
            }
        }

        /* JADX INFO: compiled from: LandingContract.kt */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b$\u0010%J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0003J7\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\bHÆ\u0001J\t\u0010\u000f\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\bHÖ\u0003R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\r\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006&"}, d2 = {"Lcom/bbva/glomohybrid/landing/presentation/LandingContract$Intent$Shortcut;", "Lcom/bbva/glomohybrid/landing/presentation/LandingContract$Intent;", "", "component1", "Lcom/bbva/glomohybrid/base/models/ShortcutModel;", "component2", "", "component3", "", "component4", "needLogin", "shortcut", "route", BanxicoConstants.KEY_HISTORICAL_PAYLOAD, "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "equals", "a", "Z", "getNeedLogin", "()Z", "b", "Lcom/bbva/glomohybrid/base/models/ShortcutModel;", "getShortcut", "()Lcom/bbva/glomohybrid/base/models/ShortcutModel;", "c", "Ljava/lang/String;", "getRoute", "()Ljava/lang/String;", "d", "Ljava/lang/Object;", "getPayload", "()Ljava/lang/Object;", "<init>", "(ZLcom/bbva/glomohybrid/base/models/ShortcutModel;Ljava/lang/String;Ljava/lang/Object;)V", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0})
        public static final /* data */ class Shortcut extends Intent {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            public final boolean needLogin;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final ShortcutModel shortcut;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final String route;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final Object payload;

            public /* synthetic */ Shortcut(boolean z10, ShortcutModel shortcutModel, String str, Object obj, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(z10, (i10 & 2) != 0 ? null : shortcutModel, (i10 & 4) != 0 ? null : str, (i10 & 8) != 0 ? null : obj);
            }

            public static /* synthetic */ Shortcut copy$default(Shortcut shortcut, boolean z10, ShortcutModel shortcutModel, String str, Object obj, int i10, Object obj2) {
                if ((i10 & 1) != 0) {
                    z10 = shortcut.needLogin;
                }
                if ((i10 & 2) != 0) {
                    shortcutModel = shortcut.shortcut;
                }
                if ((i10 & 4) != 0) {
                    str = shortcut.route;
                }
                if ((i10 & 8) != 0) {
                    obj = shortcut.payload;
                }
                return shortcut.copy(z10, shortcutModel, str, obj);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final boolean getNeedLogin() {
                return this.needLogin;
            }

            @Nullable
            /* JADX INFO: renamed from: component2, reason: from getter */
            public final ShortcutModel getShortcut() {
                return this.shortcut;
            }

            @Nullable
            /* JADX INFO: renamed from: component3, reason: from getter */
            public final String getRoute() {
                return this.route;
            }

            @Nullable
            /* JADX INFO: renamed from: component4, reason: from getter */
            public final Object getPayload() {
                return this.payload;
            }

            @NotNull
            public final Shortcut copy(boolean needLogin, @Nullable ShortcutModel shortcut, @Nullable String route, @Nullable Object payload) {
                return new Shortcut(needLogin, shortcut, route, payload);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Shortcut)) {
                    return false;
                }
                Shortcut shortcut = (Shortcut) other;
                return this.needLogin == shortcut.needLogin && Intrinsics.areEqual(this.shortcut, shortcut.shortcut) && Intrinsics.areEqual(this.route, shortcut.route) && Intrinsics.areEqual(this.payload, shortcut.payload);
            }

            public final boolean getNeedLogin() {
                return this.needLogin;
            }

            @Nullable
            public final Object getPayload() {
                return this.payload;
            }

            @Nullable
            public final String getRoute() {
                return this.route;
            }

            @Nullable
            public final ShortcutModel getShortcut() {
                return this.shortcut;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v1, types: [int] */
            /* JADX WARN: Type inference failed for: r0v8 */
            /* JADX WARN: Type inference failed for: r0v9 */
            public int hashCode() {
                boolean z10 = this.needLogin;
                ?? r1 = z10;
                if (z10) {
                    r1 = 1;
                }
                int i10 = r1 * 31;
                ShortcutModel shortcutModel = this.shortcut;
                int iHashCode = (i10 + (shortcutModel == null ? 0 : shortcutModel.hashCode())) * 31;
                String str = this.route;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                Object obj = this.payload;
                return iHashCode2 + (obj != null ? obj.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "Shortcut(needLogin=" + this.needLogin + ", shortcut=" + this.shortcut + ", route=" + this.route + ", payload=" + this.payload + ")";
            }

            public Shortcut(boolean z10, @Nullable ShortcutModel shortcutModel, @Nullable String str, @Nullable Object obj) {
                super(null);
                this.needLogin = z10;
                this.shortcut = shortcutModel;
                this.route = str;
                this.payload = obj;
            }
        }

        /* JADX INFO: compiled from: LandingContract.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/bbva/glomohybrid/landing/presentation/LandingContract$Intent$ShortcutItemTap;", "Lcom/bbva/glomohybrid/landing/presentation/LandingContract$Intent;", "", "component1", "id", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0})
        public static final /* data */ class ShortcutItemTap extends Intent {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final String id;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ShortcutItemTap(@NotNull String id) {
                super(null);
                Intrinsics.checkNotNullParameter(id, "id");
                this.id = id;
            }

            public static /* synthetic */ ShortcutItemTap copy$default(ShortcutItemTap shortcutItemTap, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = shortcutItemTap.id;
                }
                return shortcutItemTap.copy(str);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getId() {
                return this.id;
            }

            @NotNull
            public final ShortcutItemTap copy(@NotNull String id) {
                Intrinsics.checkNotNullParameter(id, "id");
                return new ShortcutItemTap(id);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ShortcutItemTap) && Intrinsics.areEqual(this.id, ((ShortcutItemTap) other).id);
            }

            @NotNull
            public final String getId() {
                return this.id;
            }

            public int hashCode() {
                return this.id.hashCode();
            }

            @NotNull
            public String toString() {
                return d.f(new StringBuilder("ShortcutItemTap(id="), this.id, ")");
            }
        }

        /* JADX INFO: compiled from: LandingContract.kt */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/bbva/glomohybrid/landing/presentation/LandingContract$Intent$SnackBarReceived;", "Lcom/bbva/glomohybrid/landing/presentation/LandingContract$Intent;", "Lcom/bbva/glomohybrid/base/snackbar/SnackbarSpec;", "component1", "config", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Lcom/bbva/glomohybrid/base/snackbar/SnackbarSpec;", "getConfig", "()Lcom/bbva/glomohybrid/base/snackbar/SnackbarSpec;", "<init>", "(Lcom/bbva/glomohybrid/base/snackbar/SnackbarSpec;)V", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0})
        public static final /* data */ class SnackBarReceived extends Intent {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final SnackbarSpec config;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SnackBarReceived(@NotNull SnackbarSpec config) {
                super(null);
                Intrinsics.checkNotNullParameter(config, "config");
                this.config = config;
            }

            public static /* synthetic */ SnackBarReceived copy$default(SnackBarReceived snackBarReceived, SnackbarSpec snackbarSpec, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    snackbarSpec = snackBarReceived.config;
                }
                return snackBarReceived.copy(snackbarSpec);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final SnackbarSpec getConfig() {
                return this.config;
            }

            @NotNull
            public final SnackBarReceived copy(@NotNull SnackbarSpec config) {
                Intrinsics.checkNotNullParameter(config, "config");
                return new SnackBarReceived(config);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SnackBarReceived) && Intrinsics.areEqual(this.config, ((SnackBarReceived) other).config);
            }

            @NotNull
            public final SnackbarSpec getConfig() {
                return this.config;
            }

            public int hashCode() {
                return this.config.hashCode();
            }

            @NotNull
            public String toString() {
                return "SnackBarReceived(config=" + this.config + ")";
            }
        }

        /* JADX INFO: compiled from: LandingContract.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/bbva/glomohybrid/landing/presentation/LandingContract$Intent$UpdateApp;", "Lcom/bbva/glomohybrid/landing/presentation/LandingContract$Intent;", "", "component1", "packageId", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Ljava/lang/String;", "getPackageId", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0})
        public static final /* data */ class UpdateApp extends Intent {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final String packageId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UpdateApp(@NotNull String packageId) {
                super(null);
                Intrinsics.checkNotNullParameter(packageId, "packageId");
                this.packageId = packageId;
            }

            public static /* synthetic */ UpdateApp copy$default(UpdateApp updateApp, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = updateApp.packageId;
                }
                return updateApp.copy(str);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getPackageId() {
                return this.packageId;
            }

            @NotNull
            public final UpdateApp copy(@NotNull String packageId) {
                Intrinsics.checkNotNullParameter(packageId, "packageId");
                return new UpdateApp(packageId);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof UpdateApp) && Intrinsics.areEqual(this.packageId, ((UpdateApp) other).packageId);
            }

            @NotNull
            public final String getPackageId() {
                return this.packageId;
            }

            public int hashCode() {
                return this.packageId.hashCode();
            }

            @NotNull
            public String toString() {
                return d.f(new StringBuilder("UpdateApp(packageId="), this.packageId, ")");
            }
        }

        public Intent() {
        }

        public /* synthetic */ Intent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: compiled from: LandingContract.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/bbva/glomohybrid/landing/presentation/LandingContract$State;", "", "()V", "Loading", "Ready", "Skeleton", "Lcom/bbva/glomohybrid/landing/presentation/LandingContract$State$Loading;", "Lcom/bbva/glomohybrid/landing/presentation/LandingContract$State$Ready;", "Lcom/bbva/glomohybrid/landing/presentation/LandingContract$State$Skeleton;", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class State {

        /* JADX INFO: compiled from: LandingContract.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/glomohybrid/landing/presentation/LandingContract$State$Loading;", "Lcom/bbva/glomohybrid/landing/presentation/LandingContract$State;", "()V", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Loading extends State {

            @NotNull
            public static final Loading INSTANCE = new Loading();

            public Loading() {
                super(null);
            }
        }

        /* JADX INFO: compiled from: LandingContract.kt */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0011\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003J%\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/bbva/glomohybrid/landing/presentation/LandingContract$State$Ready;", "Lcom/bbva/glomohybrid/landing/presentation/LandingContract$State;", "Lcom/bbva/glomohybrid/landing/presentation/model/LandingHeaderState;", "component1", "", "Lcom/bbva/glomohybrid/landing/domain/sections/model/LandingSection;", "component2", "header", "sections", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Lcom/bbva/glomohybrid/landing/presentation/model/LandingHeaderState;", "getHeader", "()Lcom/bbva/glomohybrid/landing/presentation/model/LandingHeaderState;", "b", "Ljava/util/List;", "getSections", "()Ljava/util/List;", "<init>", "(Lcom/bbva/glomohybrid/landing/presentation/model/LandingHeaderState;Ljava/util/List;)V", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0})
        public static final /* data */ class Ready extends State {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final LandingHeaderState header;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final List<LandingSection> sections;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public Ready(@NotNull LandingHeaderState header, @Nullable List<? extends LandingSection> list) {
                super(null);
                Intrinsics.checkNotNullParameter(header, "header");
                this.header = header;
                this.sections = list;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Ready copy$default(Ready ready, LandingHeaderState landingHeaderState, List list, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    landingHeaderState = ready.header;
                }
                if ((i10 & 2) != 0) {
                    list = ready.sections;
                }
                return ready.copy(landingHeaderState, list);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final LandingHeaderState getHeader() {
                return this.header;
            }

            @Nullable
            public final List<LandingSection> component2() {
                return this.sections;
            }

            @NotNull
            public final Ready copy(@NotNull LandingHeaderState header, @Nullable List<? extends LandingSection> sections) {
                Intrinsics.checkNotNullParameter(header, "header");
                return new Ready(header, sections);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Ready)) {
                    return false;
                }
                Ready ready = (Ready) other;
                return Intrinsics.areEqual(this.header, ready.header) && Intrinsics.areEqual(this.sections, ready.sections);
            }

            @NotNull
            public final LandingHeaderState getHeader() {
                return this.header;
            }

            @Nullable
            public final List<LandingSection> getSections() {
                return this.sections;
            }

            public int hashCode() {
                int iHashCode = this.header.hashCode() * 31;
                List<LandingSection> list = this.sections;
                return iHashCode + (list == null ? 0 : list.hashCode());
            }

            @NotNull
            public String toString() {
                return "Ready(header=" + this.header + ", sections=" + this.sections + ")";
            }
        }

        /* JADX INFO: compiled from: LandingContract.kt */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/bbva/glomohybrid/landing/presentation/LandingContract$State$Skeleton;", "Lcom/bbva/glomohybrid/landing/presentation/LandingContract$State;", "Lcom/bbva/glomohybrid/landing/presentation/model/LandingHeaderState;", "component1", "header", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Lcom/bbva/glomohybrid/landing/presentation/model/LandingHeaderState;", "getHeader", "()Lcom/bbva/glomohybrid/landing/presentation/model/LandingHeaderState;", "<init>", "(Lcom/bbva/glomohybrid/landing/presentation/model/LandingHeaderState;)V", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0})
        public static final /* data */ class Skeleton extends State {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final LandingHeaderState header;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Skeleton(@NotNull LandingHeaderState header) {
                super(null);
                Intrinsics.checkNotNullParameter(header, "header");
                this.header = header;
            }

            public static /* synthetic */ Skeleton copy$default(Skeleton skeleton, LandingHeaderState landingHeaderState, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    landingHeaderState = skeleton.header;
                }
                return skeleton.copy(landingHeaderState);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final LandingHeaderState getHeader() {
                return this.header;
            }

            @NotNull
            public final Skeleton copy(@NotNull LandingHeaderState header) {
                Intrinsics.checkNotNullParameter(header, "header");
                return new Skeleton(header);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Skeleton) && Intrinsics.areEqual(this.header, ((Skeleton) other).header);
            }

            @NotNull
            public final LandingHeaderState getHeader() {
                return this.header;
            }

            public int hashCode() {
                return this.header.hashCode();
            }

            @NotNull
            public String toString() {
                return "Skeleton(header=" + this.header + ")";
            }
        }

        public State() {
        }

        public /* synthetic */ State(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
