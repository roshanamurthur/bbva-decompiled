package com.bbva.glomohybrid.infoscreen.webView.force;

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

/* JADX INFO: compiled from: WebViewForceUpdateContract.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, d2 = {"Lcom/bbva/glomohybrid/infoscreen/webView/force/WebViewForceUpdateContract;", "", "()V", "Event", "Intent", "info-modal_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class WebViewForceUpdateContract {

    /* JADX INFO: compiled from: WebViewForceUpdateContract.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/bbva/glomohybrid/infoscreen/webView/force/WebViewForceUpdateContract$Event;", "", "()V", "Navigation", "StoreUrlError", "Lcom/bbva/glomohybrid/infoscreen/webView/force/WebViewForceUpdateContract$Event$Navigation;", "Lcom/bbva/glomohybrid/infoscreen/webView/force/WebViewForceUpdateContract$Event$StoreUrlError;", "info-modal_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class Event {

        /* JADX INFO: compiled from: WebViewForceUpdateContract.kt */
        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001bB\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lcom/bbva/glomohybrid/infoscreen/webView/force/WebViewForceUpdateContract$Event$Navigation;", "Lcom/bbva/glomohybrid/infoscreen/webView/force/WebViewForceUpdateContract$Event;", "Lcom/bbva/glomohybrid/infoscreen/webView/force/WebViewForceUpdateContract$Event$Navigation$Type;", "component1", "Lcom/bbva/glomohybrid/base/router/Route;", "component2", "type", "route", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Lcom/bbva/glomohybrid/infoscreen/webView/force/WebViewForceUpdateContract$Event$Navigation$Type;", "getType", "()Lcom/bbva/glomohybrid/infoscreen/webView/force/WebViewForceUpdateContract$Event$Navigation$Type;", "b", "Lcom/bbva/glomohybrid/base/router/Route;", "getRoute", "()Lcom/bbva/glomohybrid/base/router/Route;", "<init>", "(Lcom/bbva/glomohybrid/infoscreen/webView/force/WebViewForceUpdateContract$Event$Navigation$Type;Lcom/bbva/glomohybrid/base/router/Route;)V", UUIDPreferences.TYPE_KEY, "info-modal_mexicoRelease"}, k = 1, mv = {1, 9, 0})
        public static final /* data */ class Navigation extends Event {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Type type;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Route route;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* JADX INFO: compiled from: WebViewForceUpdateContract.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/glomohybrid/infoscreen/webView/force/WebViewForceUpdateContract$Event$Navigation$Type;", "", "MARKET", "info-modal_mexicoRelease"}, k = 1, mv = {1, 9, 0})
            public static final class Type {
                private static final /* synthetic */ EnumEntries $ENTRIES;
                private static final /* synthetic */ Type[] $VALUES;
                public static final Type MARKET;

                static {
                    Type type = new Type("MARKET", 0);
                    MARKET = type;
                    Type[] typeArr = {type};
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Navigation(@NotNull Type type, @NotNull Route route) {
                super(null);
                Intrinsics.checkNotNullParameter(type, "type");
                Intrinsics.checkNotNullParameter(route, "route");
                this.type = type;
                this.route = route;
            }

            public static /* synthetic */ Navigation copy$default(Navigation navigation, Type type, Route route, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    type = navigation.type;
                }
                if ((i10 & 2) != 0) {
                    route = navigation.route;
                }
                return navigation.copy(type, route);
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

            @NotNull
            public final Navigation copy(@NotNull Type type, @NotNull Route route) {
                Intrinsics.checkNotNullParameter(type, "type");
                Intrinsics.checkNotNullParameter(route, "route");
                return new Navigation(type, route);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Navigation)) {
                    return false;
                }
                Navigation navigation = (Navigation) other;
                return this.type == navigation.type && Intrinsics.areEqual(this.route, navigation.route);
            }

            @NotNull
            public final Route getRoute() {
                return this.route;
            }

            @NotNull
            public final Type getType() {
                return this.type;
            }

            public int hashCode() {
                return this.route.hashCode() + (this.type.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return "Navigation(type=" + this.type + ", route=" + this.route + ")";
            }
        }

        /* JADX INFO: compiled from: WebViewForceUpdateContract.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/glomohybrid/infoscreen/webView/force/WebViewForceUpdateContract$Event$StoreUrlError;", "Lcom/bbva/glomohybrid/infoscreen/webView/force/WebViewForceUpdateContract$Event;", "()V", "info-modal_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class StoreUrlError extends Event {

            @NotNull
            public static final StoreUrlError INSTANCE = new StoreUrlError();

            public StoreUrlError() {
                super(null);
            }
        }

        public Event() {
        }

        public /* synthetic */ Event(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: compiled from: WebViewForceUpdateContract.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/bbva/glomohybrid/infoscreen/webView/force/WebViewForceUpdateContract$Intent;", "", "()V", "PositiveButtonTap", "Lcom/bbva/glomohybrid/infoscreen/webView/force/WebViewForceUpdateContract$Intent$PositiveButtonTap;", "info-modal_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class Intent {

        /* JADX INFO: compiled from: WebViewForceUpdateContract.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/glomohybrid/infoscreen/webView/force/WebViewForceUpdateContract$Intent$PositiveButtonTap;", "Lcom/bbva/glomohybrid/infoscreen/webView/force/WebViewForceUpdateContract$Intent;", "()V", "info-modal_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class PositiveButtonTap extends Intent {

            @NotNull
            public static final PositiveButtonTap INSTANCE = new PositiveButtonTap();

            public PositiveButtonTap() {
                super(null);
            }
        }

        public Intent() {
        }

        public /* synthetic */ Intent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
