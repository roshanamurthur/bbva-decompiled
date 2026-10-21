package com.bbva.glomohybrid.infoscreen.mobilepayment;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.ethermobilesdk.tokencompat.storage.local.UUIDPreferences;
import com.bbva.glomohybrid.base.router.Route;
import com.bbva.glomohybrid.infoscreen.data.model.InfoScreenData;
import com.bbva.notifications.model.constants.BanxicoConstants;
import java.util.Map;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PaymentsInfoContract.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0006"}, d2 = {"Lcom/bbva/glomohybrid/infoscreen/mobilepayment/PaymentsInfoContract;", "", "()V", "Event", "Intent", "State", "info-modal_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PaymentsInfoContract {

    /* JADX INFO: compiled from: PaymentsInfoContract.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/bbva/glomohybrid/infoscreen/mobilepayment/PaymentsInfoContract$Event;", "", "()V", "Authentication", "CloseScreen", "Navigation", "SecuritySettings", "Lcom/bbva/glomohybrid/infoscreen/mobilepayment/PaymentsInfoContract$Event$Authentication;", "Lcom/bbva/glomohybrid/infoscreen/mobilepayment/PaymentsInfoContract$Event$CloseScreen;", "Lcom/bbva/glomohybrid/infoscreen/mobilepayment/PaymentsInfoContract$Event$Navigation;", "Lcom/bbva/glomohybrid/infoscreen/mobilepayment/PaymentsInfoContract$Event$SecuritySettings;", "info-modal_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class Event {

        /* JADX INFO: compiled from: PaymentsInfoContract.kt */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0003J\u001f\u0010\u0007\u001a\u00020\u00002\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0003HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÖ\u0003R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/bbva/glomohybrid/infoscreen/mobilepayment/PaymentsInfoContract$Event$Authentication;", "Lcom/bbva/glomohybrid/infoscreen/mobilepayment/PaymentsInfoContract$Event;", "", "", "", "component1", "uiModel", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/util/Map;", "getUiModel", "()Ljava/util/Map;", "<init>", "(Ljava/util/Map;)V", "info-modal_mexicoRelease"}, k = 1, mv = {1, 9, 0})
        public static final /* data */ class Authentication extends Event {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Map<String, Object> uiModel;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Authentication(@NotNull Map<String, ? extends Object> uiModel) {
                super(null);
                Intrinsics.checkNotNullParameter(uiModel, "uiModel");
                this.uiModel = uiModel;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Authentication copy$default(Authentication authentication, Map map, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    map = authentication.uiModel;
                }
                return authentication.copy(map);
            }

            @NotNull
            public final Map<String, Object> component1() {
                return this.uiModel;
            }

            @NotNull
            public final Authentication copy(@NotNull Map<String, ? extends Object> uiModel) {
                Intrinsics.checkNotNullParameter(uiModel, "uiModel");
                return new Authentication(uiModel);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Authentication) && Intrinsics.areEqual(this.uiModel, ((Authentication) other).uiModel);
            }

            @NotNull
            public final Map<String, Object> getUiModel() {
                return this.uiModel;
            }

            public int hashCode() {
                return this.uiModel.hashCode();
            }

            @NotNull
            public String toString() {
                return "Authentication(uiModel=" + this.uiModel + ")";
            }
        }

        /* JADX INFO: compiled from: PaymentsInfoContract.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/bbva/glomohybrid/infoscreen/mobilepayment/PaymentsInfoContract$Event$CloseScreen;", "Lcom/bbva/glomohybrid/infoscreen/mobilepayment/PaymentsInfoContract$Event;", "()V", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "info-modal_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class CloseScreen extends Event {

            @NotNull
            public static final CloseScreen INSTANCE = new CloseScreen();

            public CloseScreen() {
                super(null);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof CloseScreen)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return -199201647;
            }

            @NotNull
            public String toString() {
                return "CloseScreen";
            }
        }

        /* JADX INFO: compiled from: PaymentsInfoContract.kt */
        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001:\u0001'B-\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b%\u0010&J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0003J3\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\bHÆ\u0001J\t\u0010\u000f\u001a\u00020\bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\r\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006("}, d2 = {"Lcom/bbva/glomohybrid/infoscreen/mobilepayment/PaymentsInfoContract$Event$Navigation;", "Lcom/bbva/glomohybrid/infoscreen/mobilepayment/PaymentsInfoContract$Event;", "Lcom/bbva/glomohybrid/infoscreen/mobilepayment/PaymentsInfoContract$Event$Navigation$Type;", "component1", "Lcom/bbva/glomohybrid/base/router/Route;", "component2", "", "component3", "", "component4", "type", "route", "clearHistory", BanxicoConstants.KEY_HISTORICAL_PAYLOAD, "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "equals", "a", "Lcom/bbva/glomohybrid/infoscreen/mobilepayment/PaymentsInfoContract$Event$Navigation$Type;", "getType", "()Lcom/bbva/glomohybrid/infoscreen/mobilepayment/PaymentsInfoContract$Event$Navigation$Type;", "b", "Lcom/bbva/glomohybrid/base/router/Route;", "getRoute", "()Lcom/bbva/glomohybrid/base/router/Route;", "c", "Z", "getClearHistory", "()Z", "d", "Ljava/lang/String;", "getPayload", "()Ljava/lang/String;", "<init>", "(Lcom/bbva/glomohybrid/infoscreen/mobilepayment/PaymentsInfoContract$Event$Navigation$Type;Lcom/bbva/glomohybrid/base/router/Route;ZLjava/lang/String;)V", UUIDPreferences.TYPE_KEY, "info-modal_mexicoRelease"}, k = 1, mv = {1, 9, 0})
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
            public final String payload;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* JADX INFO: compiled from: PaymentsInfoContract.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/bbva/glomohybrid/infoscreen/mobilepayment/PaymentsInfoContract$Event$Navigation$Type;", "", "NATIVE", "WEB", "info-modal_mexicoRelease"}, k = 1, mv = {1, 9, 0})
            public static final class Type {
                private static final /* synthetic */ EnumEntries $ENTRIES;
                private static final /* synthetic */ Type[] $VALUES;
                public static final Type NATIVE;
                public static final Type WEB;

                static {
                    Type type = new Type("NATIVE", 0);
                    NATIVE = type;
                    Type type2 = new Type("WEB", 1);
                    WEB = type2;
                    Type[] typeArr = {type, type2};
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

            public /* synthetic */ Navigation(Type type, Route route, boolean z10, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(type, route, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? null : str);
            }

            public static /* synthetic */ Navigation copy$default(Navigation navigation, Type type, Route route, boolean z10, String str, int i10, Object obj) {
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
                    str = navigation.payload;
                }
                return navigation.copy(type, route, z10, str);
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
            public final String getPayload() {
                return this.payload;
            }

            @NotNull
            public final Navigation copy(@NotNull Type type, @NotNull Route route, boolean clearHistory, @Nullable String payload) {
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
            public final String getPayload() {
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
                String str = this.payload;
                return i10 + (str == null ? 0 : str.hashCode());
            }

            @NotNull
            public String toString() {
                return "Navigation(type=" + this.type + ", route=" + this.route + ", clearHistory=" + this.clearHistory + ", payload=" + this.payload + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Navigation(@NotNull Type type, @NotNull Route route, boolean z10, @Nullable String str) {
                super(null);
                Intrinsics.checkNotNullParameter(type, "type");
                Intrinsics.checkNotNullParameter(route, "route");
                this.type = type;
                this.route = route;
                this.clearHistory = z10;
                this.payload = str;
            }
        }

        /* JADX INFO: compiled from: PaymentsInfoContract.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/bbva/glomohybrid/infoscreen/mobilepayment/PaymentsInfoContract$Event$SecuritySettings;", "Lcom/bbva/glomohybrid/infoscreen/mobilepayment/PaymentsInfoContract$Event;", "()V", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "info-modal_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class SecuritySettings extends Event {

            @NotNull
            public static final SecuritySettings INSTANCE = new SecuritySettings();

            public SecuritySettings() {
                super(null);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SecuritySettings)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 114858902;
            }

            @NotNull
            public String toString() {
                return "SecuritySettings";
            }
        }

        public Event() {
        }

        public /* synthetic */ Event(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: compiled from: PaymentsInfoContract.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/bbva/glomohybrid/infoscreen/mobilepayment/PaymentsInfoContract$Intent;", "", "()V", "Authenticated", "ButtonClick", "Error", "Lcom/bbva/glomohybrid/infoscreen/mobilepayment/PaymentsInfoContract$Intent$Authenticated;", "Lcom/bbva/glomohybrid/infoscreen/mobilepayment/PaymentsInfoContract$Intent$ButtonClick;", "Lcom/bbva/glomohybrid/infoscreen/mobilepayment/PaymentsInfoContract$Intent$Error;", "info-modal_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class Intent {

        /* JADX INFO: compiled from: PaymentsInfoContract.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/bbva/glomohybrid/infoscreen/mobilepayment/PaymentsInfoContract$Intent$Authenticated;", "Lcom/bbva/glomohybrid/infoscreen/mobilepayment/PaymentsInfoContract$Intent;", "()V", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "info-modal_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Authenticated extends Intent {

            @NotNull
            public static final Authenticated INSTANCE = new Authenticated();

            public Authenticated() {
                super(null);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Authenticated)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return -834070756;
            }

            @NotNull
            public String toString() {
                return "Authenticated";
            }
        }

        /* JADX INFO: compiled from: PaymentsInfoContract.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/bbva/glomohybrid/infoscreen/mobilepayment/PaymentsInfoContract$Intent$ButtonClick;", "Lcom/bbva/glomohybrid/infoscreen/mobilepayment/PaymentsInfoContract$Intent;", "()V", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "info-modal_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ButtonClick extends Intent {

            @NotNull
            public static final ButtonClick INSTANCE = new ButtonClick();

            public ButtonClick() {
                super(null);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ButtonClick)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 1188272035;
            }

            @NotNull
            public String toString() {
                return "ButtonClick";
            }
        }

        /* JADX INFO: compiled from: PaymentsInfoContract.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/bbva/glomohybrid/infoscreen/mobilepayment/PaymentsInfoContract$Intent$Error;", "Lcom/bbva/glomohybrid/infoscreen/mobilepayment/PaymentsInfoContract$Intent;", "()V", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "info-modal_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Error extends Intent {

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
                return 1368617461;
            }

            @NotNull
            public String toString() {
                return "Error";
            }
        }

        public Intent() {
        }

        public /* synthetic */ Intent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: compiled from: PaymentsInfoContract.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\b\u0003\u0004\u0005\u0006\u0007\b\t\nB\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\b\u000b\f\r\u000e\u000f\u0010\u0011\u0012¨\u0006\u0013"}, d2 = {"Lcom/bbva/glomohybrid/infoscreen/mobilepayment/PaymentsInfoContract$State;", "", "()V", "AuthGranted", "AuthRequired", "InsecureDevice", "Loading", "NotDefaultCard", "PaymentAbort", "ResultOk", "TokensNotPresent", "Lcom/bbva/glomohybrid/infoscreen/mobilepayment/PaymentsInfoContract$State$AuthGranted;", "Lcom/bbva/glomohybrid/infoscreen/mobilepayment/PaymentsInfoContract$State$AuthRequired;", "Lcom/bbva/glomohybrid/infoscreen/mobilepayment/PaymentsInfoContract$State$InsecureDevice;", "Lcom/bbva/glomohybrid/infoscreen/mobilepayment/PaymentsInfoContract$State$Loading;", "Lcom/bbva/glomohybrid/infoscreen/mobilepayment/PaymentsInfoContract$State$NotDefaultCard;", "Lcom/bbva/glomohybrid/infoscreen/mobilepayment/PaymentsInfoContract$State$PaymentAbort;", "Lcom/bbva/glomohybrid/infoscreen/mobilepayment/PaymentsInfoContract$State$ResultOk;", "Lcom/bbva/glomohybrid/infoscreen/mobilepayment/PaymentsInfoContract$State$TokensNotPresent;", "info-modal_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class State {

        /* JADX INFO: compiled from: PaymentsInfoContract.kt */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/bbva/glomohybrid/infoscreen/mobilepayment/PaymentsInfoContract$State$AuthGranted;", "Lcom/bbva/glomohybrid/infoscreen/mobilepayment/PaymentsInfoContract$State;", "Lcom/bbva/glomohybrid/infoscreen/data/model/InfoScreenData;", "component1", "screenData", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Lcom/bbva/glomohybrid/infoscreen/data/model/InfoScreenData;", "getScreenData", "()Lcom/bbva/glomohybrid/infoscreen/data/model/InfoScreenData;", "<init>", "(Lcom/bbva/glomohybrid/infoscreen/data/model/InfoScreenData;)V", "info-modal_mexicoRelease"}, k = 1, mv = {1, 9, 0})
        public static final /* data */ class AuthGranted extends State {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final InfoScreenData screenData;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AuthGranted(@NotNull InfoScreenData screenData) {
                super(null);
                Intrinsics.checkNotNullParameter(screenData, "screenData");
                this.screenData = screenData;
            }

            public static /* synthetic */ AuthGranted copy$default(AuthGranted authGranted, InfoScreenData infoScreenData, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    infoScreenData = authGranted.screenData;
                }
                return authGranted.copy(infoScreenData);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final InfoScreenData getScreenData() {
                return this.screenData;
            }

            @NotNull
            public final AuthGranted copy(@NotNull InfoScreenData screenData) {
                Intrinsics.checkNotNullParameter(screenData, "screenData");
                return new AuthGranted(screenData);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof AuthGranted) && Intrinsics.areEqual(this.screenData, ((AuthGranted) other).screenData);
            }

            @NotNull
            public final InfoScreenData getScreenData() {
                return this.screenData;
            }

            public int hashCode() {
                return this.screenData.hashCode();
            }

            @NotNull
            public String toString() {
                return "AuthGranted(screenData=" + this.screenData + ")";
            }
        }

        /* JADX INFO: compiled from: PaymentsInfoContract.kt */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/bbva/glomohybrid/infoscreen/mobilepayment/PaymentsInfoContract$State$AuthRequired;", "Lcom/bbva/glomohybrid/infoscreen/mobilepayment/PaymentsInfoContract$State;", "Lcom/bbva/glomohybrid/infoscreen/data/model/InfoScreenData;", "component1", "screenData", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Lcom/bbva/glomohybrid/infoscreen/data/model/InfoScreenData;", "getScreenData", "()Lcom/bbva/glomohybrid/infoscreen/data/model/InfoScreenData;", "<init>", "(Lcom/bbva/glomohybrid/infoscreen/data/model/InfoScreenData;)V", "info-modal_mexicoRelease"}, k = 1, mv = {1, 9, 0})
        public static final /* data */ class AuthRequired extends State {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final InfoScreenData screenData;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AuthRequired(@NotNull InfoScreenData screenData) {
                super(null);
                Intrinsics.checkNotNullParameter(screenData, "screenData");
                this.screenData = screenData;
            }

            public static /* synthetic */ AuthRequired copy$default(AuthRequired authRequired, InfoScreenData infoScreenData, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    infoScreenData = authRequired.screenData;
                }
                return authRequired.copy(infoScreenData);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final InfoScreenData getScreenData() {
                return this.screenData;
            }

            @NotNull
            public final AuthRequired copy(@NotNull InfoScreenData screenData) {
                Intrinsics.checkNotNullParameter(screenData, "screenData");
                return new AuthRequired(screenData);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof AuthRequired) && Intrinsics.areEqual(this.screenData, ((AuthRequired) other).screenData);
            }

            @NotNull
            public final InfoScreenData getScreenData() {
                return this.screenData;
            }

            public int hashCode() {
                return this.screenData.hashCode();
            }

            @NotNull
            public String toString() {
                return "AuthRequired(screenData=" + this.screenData + ")";
            }
        }

        /* JADX INFO: compiled from: PaymentsInfoContract.kt */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/bbva/glomohybrid/infoscreen/mobilepayment/PaymentsInfoContract$State$InsecureDevice;", "Lcom/bbva/glomohybrid/infoscreen/mobilepayment/PaymentsInfoContract$State;", "Lcom/bbva/glomohybrid/infoscreen/data/model/InfoScreenData;", "component1", "screenData", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Lcom/bbva/glomohybrid/infoscreen/data/model/InfoScreenData;", "getScreenData", "()Lcom/bbva/glomohybrid/infoscreen/data/model/InfoScreenData;", "<init>", "(Lcom/bbva/glomohybrid/infoscreen/data/model/InfoScreenData;)V", "info-modal_mexicoRelease"}, k = 1, mv = {1, 9, 0})
        public static final /* data */ class InsecureDevice extends State {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final InfoScreenData screenData;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public InsecureDevice(@NotNull InfoScreenData screenData) {
                super(null);
                Intrinsics.checkNotNullParameter(screenData, "screenData");
                this.screenData = screenData;
            }

            public static /* synthetic */ InsecureDevice copy$default(InsecureDevice insecureDevice, InfoScreenData infoScreenData, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    infoScreenData = insecureDevice.screenData;
                }
                return insecureDevice.copy(infoScreenData);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final InfoScreenData getScreenData() {
                return this.screenData;
            }

            @NotNull
            public final InsecureDevice copy(@NotNull InfoScreenData screenData) {
                Intrinsics.checkNotNullParameter(screenData, "screenData");
                return new InsecureDevice(screenData);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof InsecureDevice) && Intrinsics.areEqual(this.screenData, ((InsecureDevice) other).screenData);
            }

            @NotNull
            public final InfoScreenData getScreenData() {
                return this.screenData;
            }

            public int hashCode() {
                return this.screenData.hashCode();
            }

            @NotNull
            public String toString() {
                return "InsecureDevice(screenData=" + this.screenData + ")";
            }
        }

        /* JADX INFO: compiled from: PaymentsInfoContract.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/bbva/glomohybrid/infoscreen/mobilepayment/PaymentsInfoContract$State$Loading;", "Lcom/bbva/glomohybrid/infoscreen/mobilepayment/PaymentsInfoContract$State;", "()V", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "info-modal_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
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
                return 2133694144;
            }

            @NotNull
            public String toString() {
                return "Loading";
            }
        }

        /* JADX INFO: compiled from: PaymentsInfoContract.kt */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/bbva/glomohybrid/infoscreen/mobilepayment/PaymentsInfoContract$State$NotDefaultCard;", "Lcom/bbva/glomohybrid/infoscreen/mobilepayment/PaymentsInfoContract$State;", "Lcom/bbva/glomohybrid/infoscreen/data/model/InfoScreenData;", "component1", "screenData", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Lcom/bbva/glomohybrid/infoscreen/data/model/InfoScreenData;", "getScreenData", "()Lcom/bbva/glomohybrid/infoscreen/data/model/InfoScreenData;", "<init>", "(Lcom/bbva/glomohybrid/infoscreen/data/model/InfoScreenData;)V", "info-modal_mexicoRelease"}, k = 1, mv = {1, 9, 0})
        public static final /* data */ class NotDefaultCard extends State {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final InfoScreenData screenData;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NotDefaultCard(@NotNull InfoScreenData screenData) {
                super(null);
                Intrinsics.checkNotNullParameter(screenData, "screenData");
                this.screenData = screenData;
            }

            public static /* synthetic */ NotDefaultCard copy$default(NotDefaultCard notDefaultCard, InfoScreenData infoScreenData, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    infoScreenData = notDefaultCard.screenData;
                }
                return notDefaultCard.copy(infoScreenData);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final InfoScreenData getScreenData() {
                return this.screenData;
            }

            @NotNull
            public final NotDefaultCard copy(@NotNull InfoScreenData screenData) {
                Intrinsics.checkNotNullParameter(screenData, "screenData");
                return new NotDefaultCard(screenData);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof NotDefaultCard) && Intrinsics.areEqual(this.screenData, ((NotDefaultCard) other).screenData);
            }

            @NotNull
            public final InfoScreenData getScreenData() {
                return this.screenData;
            }

            public int hashCode() {
                return this.screenData.hashCode();
            }

            @NotNull
            public String toString() {
                return "NotDefaultCard(screenData=" + this.screenData + ")";
            }
        }

        /* JADX INFO: compiled from: PaymentsInfoContract.kt */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/bbva/glomohybrid/infoscreen/mobilepayment/PaymentsInfoContract$State$PaymentAbort;", "Lcom/bbva/glomohybrid/infoscreen/mobilepayment/PaymentsInfoContract$State;", "Lcom/bbva/glomohybrid/infoscreen/data/model/InfoScreenData;", "component1", "screenData", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Lcom/bbva/glomohybrid/infoscreen/data/model/InfoScreenData;", "getScreenData", "()Lcom/bbva/glomohybrid/infoscreen/data/model/InfoScreenData;", "<init>", "(Lcom/bbva/glomohybrid/infoscreen/data/model/InfoScreenData;)V", "info-modal_mexicoRelease"}, k = 1, mv = {1, 9, 0})
        public static final /* data */ class PaymentAbort extends State {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final InfoScreenData screenData;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PaymentAbort(@NotNull InfoScreenData screenData) {
                super(null);
                Intrinsics.checkNotNullParameter(screenData, "screenData");
                this.screenData = screenData;
            }

            public static /* synthetic */ PaymentAbort copy$default(PaymentAbort paymentAbort, InfoScreenData infoScreenData, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    infoScreenData = paymentAbort.screenData;
                }
                return paymentAbort.copy(infoScreenData);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final InfoScreenData getScreenData() {
                return this.screenData;
            }

            @NotNull
            public final PaymentAbort copy(@NotNull InfoScreenData screenData) {
                Intrinsics.checkNotNullParameter(screenData, "screenData");
                return new PaymentAbort(screenData);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof PaymentAbort) && Intrinsics.areEqual(this.screenData, ((PaymentAbort) other).screenData);
            }

            @NotNull
            public final InfoScreenData getScreenData() {
                return this.screenData;
            }

            public int hashCode() {
                return this.screenData.hashCode();
            }

            @NotNull
            public String toString() {
                return "PaymentAbort(screenData=" + this.screenData + ")";
            }
        }

        /* JADX INFO: compiled from: PaymentsInfoContract.kt */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/bbva/glomohybrid/infoscreen/mobilepayment/PaymentsInfoContract$State$ResultOk;", "Lcom/bbva/glomohybrid/infoscreen/mobilepayment/PaymentsInfoContract$State;", "Lcom/bbva/glomohybrid/infoscreen/data/model/InfoScreenData;", "component1", "screenData", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Lcom/bbva/glomohybrid/infoscreen/data/model/InfoScreenData;", "getScreenData", "()Lcom/bbva/glomohybrid/infoscreen/data/model/InfoScreenData;", "<init>", "(Lcom/bbva/glomohybrid/infoscreen/data/model/InfoScreenData;)V", "info-modal_mexicoRelease"}, k = 1, mv = {1, 9, 0})
        public static final /* data */ class ResultOk extends State {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final InfoScreenData screenData;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ResultOk(@NotNull InfoScreenData screenData) {
                super(null);
                Intrinsics.checkNotNullParameter(screenData, "screenData");
                this.screenData = screenData;
            }

            public static /* synthetic */ ResultOk copy$default(ResultOk resultOk, InfoScreenData infoScreenData, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    infoScreenData = resultOk.screenData;
                }
                return resultOk.copy(infoScreenData);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final InfoScreenData getScreenData() {
                return this.screenData;
            }

            @NotNull
            public final ResultOk copy(@NotNull InfoScreenData screenData) {
                Intrinsics.checkNotNullParameter(screenData, "screenData");
                return new ResultOk(screenData);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ResultOk) && Intrinsics.areEqual(this.screenData, ((ResultOk) other).screenData);
            }

            @NotNull
            public final InfoScreenData getScreenData() {
                return this.screenData;
            }

            public int hashCode() {
                return this.screenData.hashCode();
            }

            @NotNull
            public String toString() {
                return "ResultOk(screenData=" + this.screenData + ")";
            }
        }

        /* JADX INFO: compiled from: PaymentsInfoContract.kt */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/bbva/glomohybrid/infoscreen/mobilepayment/PaymentsInfoContract$State$TokensNotPresent;", "Lcom/bbva/glomohybrid/infoscreen/mobilepayment/PaymentsInfoContract$State;", "Lcom/bbva/glomohybrid/infoscreen/data/model/InfoScreenData;", "component1", "screenData", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Lcom/bbva/glomohybrid/infoscreen/data/model/InfoScreenData;", "getScreenData", "()Lcom/bbva/glomohybrid/infoscreen/data/model/InfoScreenData;", "<init>", "(Lcom/bbva/glomohybrid/infoscreen/data/model/InfoScreenData;)V", "info-modal_mexicoRelease"}, k = 1, mv = {1, 9, 0})
        public static final /* data */ class TokensNotPresent extends State {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final InfoScreenData screenData;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TokensNotPresent(@NotNull InfoScreenData screenData) {
                super(null);
                Intrinsics.checkNotNullParameter(screenData, "screenData");
                this.screenData = screenData;
            }

            public static /* synthetic */ TokensNotPresent copy$default(TokensNotPresent tokensNotPresent, InfoScreenData infoScreenData, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    infoScreenData = tokensNotPresent.screenData;
                }
                return tokensNotPresent.copy(infoScreenData);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final InfoScreenData getScreenData() {
                return this.screenData;
            }

            @NotNull
            public final TokensNotPresent copy(@NotNull InfoScreenData screenData) {
                Intrinsics.checkNotNullParameter(screenData, "screenData");
                return new TokensNotPresent(screenData);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof TokensNotPresent) && Intrinsics.areEqual(this.screenData, ((TokensNotPresent) other).screenData);
            }

            @NotNull
            public final InfoScreenData getScreenData() {
                return this.screenData;
            }

            public int hashCode() {
                return this.screenData.hashCode();
            }

            @NotNull
            public String toString() {
                return "TokensNotPresent(screenData=" + this.screenData + ")";
            }
        }

        public State() {
        }

        public /* synthetic */ State(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
