package com.bbva.glomohybrid.welcome.model.domain;

import ad.d;
import android.os.Bundle;
import androidx.autofill.HintConstants;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.ethermobilesdk.tokencompat.storage.local.UUIDPreferences;
import com.bbva.glomohybrid.base.router.Route;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: WelcomeContract.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002¨\u0006\u0006"}, d2 = {"Lcom/bbva/glomohybrid/welcome/model/domain/WelcomeContract;", "", "()V", "Event", "Intent", "State", "Welcome_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class WelcomeContract {

    /* JADX INFO: compiled from: WelcomeContract.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/bbva/glomohybrid/welcome/model/domain/WelcomeContract$Event;", "", "()V", "DeeplinkReceived", "Navigation", "Lcom/bbva/glomohybrid/welcome/model/domain/WelcomeContract$Event$DeeplinkReceived;", "Lcom/bbva/glomohybrid/welcome/model/domain/WelcomeContract$Event$Navigation;", "Welcome_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class Event {

        /* JADX INFO: compiled from: WelcomeContract.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/bbva/glomohybrid/welcome/model/domain/WelcomeContract$Event$DeeplinkReceived;", "Lcom/bbva/glomohybrid/welcome/model/domain/WelcomeContract$Event;", "()V", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "Welcome_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class DeeplinkReceived extends Event {

            @NotNull
            public static final DeeplinkReceived INSTANCE = new DeeplinkReceived();

            public DeeplinkReceived() {
                super(null);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof DeeplinkReceived)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return -1072816846;
            }

            @NotNull
            public String toString() {
                return "DeeplinkReceived";
            }
        }

        /* JADX INFO: compiled from: WelcomeContract.kt */
        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\"B'\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b \u0010!J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003J+\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006#"}, d2 = {"Lcom/bbva/glomohybrid/welcome/model/domain/WelcomeContract$Event$Navigation;", "Lcom/bbva/glomohybrid/welcome/model/domain/WelcomeContract$Event;", "Lcom/bbva/glomohybrid/welcome/model/domain/WelcomeContract$Event$Navigation$Type;", "component1", "Lcom/bbva/glomohybrid/base/router/Route;", "component2", "Landroid/os/Bundle;", "component3", "type", "route", "bundle", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Lcom/bbva/glomohybrid/welcome/model/domain/WelcomeContract$Event$Navigation$Type;", "getType", "()Lcom/bbva/glomohybrid/welcome/model/domain/WelcomeContract$Event$Navigation$Type;", "b", "Lcom/bbva/glomohybrid/base/router/Route;", "getRoute", "()Lcom/bbva/glomohybrid/base/router/Route;", "c", "Landroid/os/Bundle;", "getBundle", "()Landroid/os/Bundle;", "<init>", "(Lcom/bbva/glomohybrid/welcome/model/domain/WelcomeContract$Event$Navigation$Type;Lcom/bbva/glomohybrid/base/router/Route;Landroid/os/Bundle;)V", UUIDPreferences.TYPE_KEY, "Welcome_mexicoRelease"}, k = 1, mv = {1, 9, 0})
        public static final /* data */ class Navigation extends Event {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Type type;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final Route route;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final Bundle bundle;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* JADX INFO: compiled from: WelcomeContract.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/bbva/glomohybrid/welcome/model/domain/WelcomeContract$Event$Navigation$Type;", "", "OPEN_WEB", "OPEN_EXTERNAL_WEB", "OPEN_WEB_APP", "Welcome_mexicoRelease"}, k = 1, mv = {1, 9, 0})
            public static final class Type {
                private static final /* synthetic */ EnumEntries $ENTRIES;
                private static final /* synthetic */ Type[] $VALUES;
                public static final Type OPEN_EXTERNAL_WEB;
                public static final Type OPEN_WEB;
                public static final Type OPEN_WEB_APP;

                static {
                    Type type = new Type("OPEN_WEB", 0);
                    OPEN_WEB = type;
                    Type type2 = new Type("OPEN_EXTERNAL_WEB", 1);
                    OPEN_EXTERNAL_WEB = type2;
                    Type type3 = new Type("OPEN_WEB_APP", 2);
                    OPEN_WEB_APP = type3;
                    Type[] typeArr = {type, type2, type3};
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

            public /* synthetic */ Navigation(Type type, Route route, Bundle bundle, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(type, (i10 & 2) != 0 ? null : route, (i10 & 4) != 0 ? null : bundle);
            }

            public static /* synthetic */ Navigation copy$default(Navigation navigation, Type type, Route route, Bundle bundle, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    type = navigation.type;
                }
                if ((i10 & 2) != 0) {
                    route = navigation.route;
                }
                if ((i10 & 4) != 0) {
                    bundle = navigation.bundle;
                }
                return navigation.copy(type, route, bundle);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final Type getType() {
                return this.type;
            }

            @Nullable
            /* JADX INFO: renamed from: component2, reason: from getter */
            public final Route getRoute() {
                return this.route;
            }

            @Nullable
            /* JADX INFO: renamed from: component3, reason: from getter */
            public final Bundle getBundle() {
                return this.bundle;
            }

            @NotNull
            public final Navigation copy(@NotNull Type type, @Nullable Route route, @Nullable Bundle bundle) {
                Intrinsics.checkNotNullParameter(type, "type");
                return new Navigation(type, route, bundle);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Navigation)) {
                    return false;
                }
                Navigation navigation = (Navigation) other;
                return this.type == navigation.type && Intrinsics.areEqual(this.route, navigation.route) && Intrinsics.areEqual(this.bundle, navigation.bundle);
            }

            @Nullable
            public final Bundle getBundle() {
                return this.bundle;
            }

            @Nullable
            public final Route getRoute() {
                return this.route;
            }

            @NotNull
            public final Type getType() {
                return this.type;
            }

            public int hashCode() {
                int iHashCode = this.type.hashCode() * 31;
                Route route = this.route;
                int iHashCode2 = (iHashCode + (route == null ? 0 : route.hashCode())) * 31;
                Bundle bundle = this.bundle;
                return iHashCode2 + (bundle != null ? bundle.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "Navigation(type=" + this.type + ", route=" + this.route + ", bundle=" + this.bundle + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Navigation(@NotNull Type type, @Nullable Route route, @Nullable Bundle bundle) {
                super(null);
                Intrinsics.checkNotNullParameter(type, "type");
                this.type = type;
                this.route = route;
                this.bundle = bundle;
            }
        }

        public Event() {
        }

        public /* synthetic */ Event(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: compiled from: WelcomeContract.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/bbva/glomohybrid/welcome/model/domain/WelcomeContract$Intent;", "", "()V", "OpenExternalWeb", "OpenWeb", "OpenWebApp", "Lcom/bbva/glomohybrid/welcome/model/domain/WelcomeContract$Intent$OpenExternalWeb;", "Lcom/bbva/glomohybrid/welcome/model/domain/WelcomeContract$Intent$OpenWeb;", "Lcom/bbva/glomohybrid/welcome/model/domain/WelcomeContract$Intent$OpenWebApp;", "Welcome_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class Intent {

        /* JADX INFO: compiled from: WelcomeContract.kt */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0015\u0010\u0005\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/bbva/glomohybrid/welcome/model/domain/WelcomeContract$Intent$OpenExternalWeb;", "Lcom/bbva/glomohybrid/welcome/model/domain/WelcomeContract$Intent;", "Landroid/os/Bundle;", "component1", "bundle", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Landroid/os/Bundle;", "getBundle", "()Landroid/os/Bundle;", "<init>", "(Landroid/os/Bundle;)V", "Welcome_mexicoRelease"}, k = 1, mv = {1, 9, 0})
        public static final /* data */ class OpenExternalWeb extends Intent {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final Bundle bundle;

            /* JADX WARN: Multi-variable type inference failed */
            public OpenExternalWeb() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public static /* synthetic */ OpenExternalWeb copy$default(OpenExternalWeb openExternalWeb, Bundle bundle, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    bundle = openExternalWeb.bundle;
                }
                return openExternalWeb.copy(bundle);
            }

            @Nullable
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final Bundle getBundle() {
                return this.bundle;
            }

            @NotNull
            public final OpenExternalWeb copy(@Nullable Bundle bundle) {
                return new OpenExternalWeb(bundle);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof OpenExternalWeb) && Intrinsics.areEqual(this.bundle, ((OpenExternalWeb) other).bundle);
            }

            @Nullable
            public final Bundle getBundle() {
                return this.bundle;
            }

            public int hashCode() {
                Bundle bundle = this.bundle;
                if (bundle == null) {
                    return 0;
                }
                return bundle.hashCode();
            }

            @NotNull
            public String toString() {
                return "OpenExternalWeb(bundle=" + this.bundle + ")";
            }

            public OpenExternalWeb(@Nullable Bundle bundle) {
                super(null);
                this.bundle = bundle;
            }

            public /* synthetic */ OpenExternalWeb(Bundle bundle, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this((i10 & 1) != 0 ? null : bundle);
            }
        }

        /* JADX INFO: compiled from: WelcomeContract.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/bbva/glomohybrid/welcome/model/domain/WelcomeContract$Intent$OpenWeb;", "Lcom/bbva/glomohybrid/welcome/model/domain/WelcomeContract$Intent;", "", "component1", "route", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Ljava/lang/String;", "getRoute", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "Welcome_mexicoRelease"}, k = 1, mv = {1, 9, 0})
        public static final /* data */ class OpenWeb extends Intent {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final String route;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OpenWeb(@NotNull String route) {
                super(null);
                Intrinsics.checkNotNullParameter(route, "route");
                this.route = route;
            }

            public static /* synthetic */ OpenWeb copy$default(OpenWeb openWeb, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = openWeb.route;
                }
                return openWeb.copy(str);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getRoute() {
                return this.route;
            }

            @NotNull
            public final OpenWeb copy(@NotNull String route) {
                Intrinsics.checkNotNullParameter(route, "route");
                return new OpenWeb(route);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof OpenWeb) && Intrinsics.areEqual(this.route, ((OpenWeb) other).route);
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
                return d.f(new StringBuilder("OpenWeb(route="), this.route, ")");
            }
        }

        /* JADX INFO: compiled from: WelcomeContract.kt */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0015\u0010\u0005\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/bbva/glomohybrid/welcome/model/domain/WelcomeContract$Intent$OpenWebApp;", "Lcom/bbva/glomohybrid/welcome/model/domain/WelcomeContract$Intent;", "Landroid/os/Bundle;", "component1", "bundle", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Landroid/os/Bundle;", "getBundle", "()Landroid/os/Bundle;", "<init>", "(Landroid/os/Bundle;)V", "Welcome_mexicoRelease"}, k = 1, mv = {1, 9, 0})
        public static final /* data */ class OpenWebApp extends Intent {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final Bundle bundle;

            /* JADX WARN: Multi-variable type inference failed */
            public OpenWebApp() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public static /* synthetic */ OpenWebApp copy$default(OpenWebApp openWebApp, Bundle bundle, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    bundle = openWebApp.bundle;
                }
                return openWebApp.copy(bundle);
            }

            @Nullable
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final Bundle getBundle() {
                return this.bundle;
            }

            @NotNull
            public final OpenWebApp copy(@Nullable Bundle bundle) {
                return new OpenWebApp(bundle);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof OpenWebApp) && Intrinsics.areEqual(this.bundle, ((OpenWebApp) other).bundle);
            }

            @Nullable
            public final Bundle getBundle() {
                return this.bundle;
            }

            public int hashCode() {
                Bundle bundle = this.bundle;
                if (bundle == null) {
                    return 0;
                }
                return bundle.hashCode();
            }

            @NotNull
            public String toString() {
                return "OpenWebApp(bundle=" + this.bundle + ")";
            }

            public OpenWebApp(@Nullable Bundle bundle) {
                super(null);
                this.bundle = bundle;
            }

            public /* synthetic */ OpenWebApp(Bundle bundle, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this((i10 & 1) != 0 ? null : bundle);
            }
        }

        public Intent() {
        }

        public /* synthetic */ Intent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: compiled from: WelcomeContract.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\b\u0003\u0004\u0005\u0006\u0007\b\t\nB\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\b\u000b\f\r\u000e\u000f\u0010\u0011\u0012¨\u0006\u0013"}, d2 = {"Lcom/bbva/glomohybrid/welcome/model/domain/WelcomeContract$State;", "", "()V", "FirstStart", "Loading", "PartialFirstStart", "Ready", "RegisterUserDisabled", "RegisterUserEnabled", "RememberedUser", "WebReady", "Lcom/bbva/glomohybrid/welcome/model/domain/WelcomeContract$State$FirstStart;", "Lcom/bbva/glomohybrid/welcome/model/domain/WelcomeContract$State$Loading;", "Lcom/bbva/glomohybrid/welcome/model/domain/WelcomeContract$State$PartialFirstStart;", "Lcom/bbva/glomohybrid/welcome/model/domain/WelcomeContract$State$Ready;", "Lcom/bbva/glomohybrid/welcome/model/domain/WelcomeContract$State$RegisterUserDisabled;", "Lcom/bbva/glomohybrid/welcome/model/domain/WelcomeContract$State$RegisterUserEnabled;", "Lcom/bbva/glomohybrid/welcome/model/domain/WelcomeContract$State$RememberedUser;", "Lcom/bbva/glomohybrid/welcome/model/domain/WelcomeContract$State$WebReady;", "Welcome_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class State {

        /* JADX INFO: compiled from: WelcomeContract.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/glomohybrid/welcome/model/domain/WelcomeContract$State$FirstStart;", "Lcom/bbva/glomohybrid/welcome/model/domain/WelcomeContract$State;", "()V", "Welcome_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class FirstStart extends State {

            @NotNull
            public static final FirstStart INSTANCE = new FirstStart();

            public FirstStart() {
                super(null);
            }
        }

        /* JADX INFO: compiled from: WelcomeContract.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/glomohybrid/welcome/model/domain/WelcomeContract$State$Loading;", "Lcom/bbva/glomohybrid/welcome/model/domain/WelcomeContract$State;", "()V", "Welcome_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Loading extends State {

            @NotNull
            public static final Loading INSTANCE = new Loading();

            public Loading() {
                super(null);
            }
        }

        /* JADX INFO: compiled from: WelcomeContract.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/glomohybrid/welcome/model/domain/WelcomeContract$State$PartialFirstStart;", "Lcom/bbva/glomohybrid/welcome/model/domain/WelcomeContract$State;", "()V", "Welcome_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class PartialFirstStart extends State {

            @NotNull
            public static final PartialFirstStart INSTANCE = new PartialFirstStart();

            public PartialFirstStart() {
                super(null);
            }
        }

        /* JADX INFO: compiled from: WelcomeContract.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/glomohybrid/welcome/model/domain/WelcomeContract$State$Ready;", "Lcom/bbva/glomohybrid/welcome/model/domain/WelcomeContract$State;", "()V", "Welcome_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Ready extends State {

            @NotNull
            public static final Ready INSTANCE = new Ready();

            public Ready() {
                super(null);
            }
        }

        /* JADX INFO: compiled from: WelcomeContract.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/glomohybrid/welcome/model/domain/WelcomeContract$State$RegisterUserDisabled;", "Lcom/bbva/glomohybrid/welcome/model/domain/WelcomeContract$State;", "()V", "Welcome_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class RegisterUserDisabled extends State {

            @NotNull
            public static final RegisterUserDisabled INSTANCE = new RegisterUserDisabled();

            public RegisterUserDisabled() {
                super(null);
            }
        }

        /* JADX INFO: compiled from: WelcomeContract.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/glomohybrid/welcome/model/domain/WelcomeContract$State$RegisterUserEnabled;", "Lcom/bbva/glomohybrid/welcome/model/domain/WelcomeContract$State;", "()V", "Welcome_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class RegisterUserEnabled extends State {

            @NotNull
            public static final RegisterUserEnabled INSTANCE = new RegisterUserEnabled();

            public RegisterUserEnabled() {
                super(null);
            }
        }

        /* JADX INFO: compiled from: WelcomeContract.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/bbva/glomohybrid/welcome/model/domain/WelcomeContract$State$RememberedUser;", "Lcom/bbva/glomohybrid/welcome/model/domain/WelcomeContract$State;", "", "component1", HintConstants.AUTOFILL_HINT_USERNAME, "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Ljava/lang/String;", "getUsername", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "Welcome_mexicoRelease"}, k = 1, mv = {1, 9, 0})
        public static final /* data */ class RememberedUser extends State {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final String username;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RememberedUser(@NotNull String username) {
                super(null);
                Intrinsics.checkNotNullParameter(username, "username");
                this.username = username;
            }

            public static /* synthetic */ RememberedUser copy$default(RememberedUser rememberedUser, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = rememberedUser.username;
                }
                return rememberedUser.copy(str);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getUsername() {
                return this.username;
            }

            @NotNull
            public final RememberedUser copy(@NotNull String username) {
                Intrinsics.checkNotNullParameter(username, "username");
                return new RememberedUser(username);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof RememberedUser) && Intrinsics.areEqual(this.username, ((RememberedUser) other).username);
            }

            @NotNull
            public final String getUsername() {
                return this.username;
            }

            public int hashCode() {
                return this.username.hashCode();
            }

            @NotNull
            public String toString() {
                return d.f(new StringBuilder("RememberedUser(username="), this.username, ")");
            }
        }

        /* JADX INFO: compiled from: WelcomeContract.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/glomohybrid/welcome/model/domain/WelcomeContract$State$WebReady;", "Lcom/bbva/glomohybrid/welcome/model/domain/WelcomeContract$State;", "()V", "Welcome_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class WebReady extends State {

            @NotNull
            public static final WebReady INSTANCE = new WebReady();

            public WebReady() {
                super(null);
            }
        }

        public State() {
        }

        public /* synthetic */ State(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public WelcomeContract() {
    }

    public /* synthetic */ WelcomeContract(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
