package com.bbva.component.dm.actionlauncher.model;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.notifications.model.constants.BanxicoConstants;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Action.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \b2\u00020\u0001:\b\u0007\b\t\n\u000b\f\r\u000eB\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0007\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lcom/bbva/component/dm/actionlauncher/model/Action;", "", "()V", "actionId", "", "getActionId", "()Ljava/lang/String;", "App", "Companion", "Dialer", "Market", "Settings", "Share", "ShareFile", "View", "Lcom/bbva/component/dm/actionlauncher/model/Action$Dialer;", "Lcom/bbva/component/dm/actionlauncher/model/Action$Share;", "Lcom/bbva/component/dm/actionlauncher/model/Action$ShareFile;", "Lcom/bbva/component/dm/actionlauncher/model/Action$View;", "Lcom/bbva/component/dm/actionlauncher/model/Action$App;", "Lcom/bbva/component/dm/actionlauncher/model/Action$Market;", "Lcom/bbva/component/dm/actionlauncher/model/Action$Settings;", "component-dm-actionlauncher_release"}, k = 1, mv = {1, 1, 13})
public abstract class Action {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String TYPE_APP = "app";

    @NotNull
    public static final String TYPE_DIALER = "dialer";

    @NotNull
    public static final String TYPE_MARKET = "market";

    @NotNull
    public static final String TYPE_SETTINGS = "settings";

    @NotNull
    public static final String TYPE_SHARE = "share";

    @NotNull
    public static final String TYPE_SHARE_FILE = "share-file";

    @NotNull
    public static final String TYPE_VIEW = "view";

    /* JADX INFO: compiled from: Action.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u001f\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0004HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/bbva/component/dm/actionlauncher/model/Action$App;", "Lcom/bbva/component/dm/actionlauncher/model/Action;", "Lcom/bbva/component/dm/actionlauncher/model/AppPayload;", "component1", "", "component2", BanxicoConstants.KEY_HISTORICAL_PAYLOAD, "actionId", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Lcom/bbva/component/dm/actionlauncher/model/AppPayload;", "getPayload", "()Lcom/bbva/component/dm/actionlauncher/model/AppPayload;", "b", "Ljava/lang/String;", "getActionId", "()Ljava/lang/String;", "<init>", "(Lcom/bbva/component/dm/actionlauncher/model/AppPayload;Ljava/lang/String;)V", "component-dm-actionlauncher_release"}, k = 1, mv = {1, 4, 0})
    public static final /* data */ class App extends Action {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final AppPayload payload;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final String actionId;

        public App(@NotNull AppPayload appPayload, @Nullable String str) {
            super(null);
            this.payload = appPayload;
            this.actionId = str;
        }

        @NotNull
        public static /* synthetic */ App copy$default(App app, AppPayload appPayload, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                appPayload = app.payload;
            }
            if ((i10 & 2) != 0) {
                str = app.getActionId();
            }
            return app.copy(appPayload, str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final AppPayload getPayload() {
            return this.payload;
        }

        @Nullable
        public final String component2() {
            return getActionId();
        }

        @NotNull
        public final App copy(@NotNull AppPayload payload, @Nullable String actionId) {
            return new App(payload, actionId);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof App)) {
                return false;
            }
            App app = (App) other;
            return Intrinsics.areEqual(this.payload, app.payload) && Intrinsics.areEqual(getActionId(), app.getActionId());
        }

        @Override // com.bbva.component.dm.actionlauncher.model.Action
        @Nullable
        public String getActionId() {
            return this.actionId;
        }

        @NotNull
        public final AppPayload getPayload() {
            return this.payload;
        }

        public int hashCode() {
            AppPayload appPayload = this.payload;
            int iHashCode = (appPayload != null ? appPayload.hashCode() : 0) * 31;
            String actionId = getActionId();
            return iHashCode + (actionId != null ? actionId.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "App(payload=" + this.payload + ", actionId=" + getActionId() + ")";
        }

        public /* synthetic */ App(AppPayload appPayload, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(appPayload, (i10 & 2) != 0 ? null : str);
        }
    }

    /* JADX INFO: compiled from: Action.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u000b\u001a\u0004\u0018\u00010\f2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000eH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/bbva/component/dm/actionlauncher/model/Action$Companion;", "", "()V", "TYPE_APP", "", "TYPE_DIALER", "TYPE_MARKET", "TYPE_SETTINGS", "TYPE_SHARE", "TYPE_SHARE_FILE", "TYPE_VIEW", "fromMap", "Lcom/bbva/component/dm/actionlauncher/model/Action;", "map", "", "component-dm-actionlauncher_release"}, k = 1, mv = {1, 1, 13})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @Nullable
        public final Action fromMap(@NotNull Map<String, ? extends Object> map) {
            Object obj = map.get("type");
            if (!(obj instanceof String)) {
                obj = null;
            }
            String str = (String) obj;
            if (str == null) {
                return null;
            }
            Object obj2 = map.get("action");
            if (!(obj2 instanceof String)) {
                obj2 = null;
            }
            String str2 = (String) obj2;
            switch (str) {
                case "share-file":
                    Object obj3 = map.get("value");
                    if (obj3 != null) {
                        return new ShareFile(new ShareFilePayload((Map) obj3), str2);
                    }
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
                case "dialer":
                    Object obj4 = map.get("value");
                    return new Dialer((String) (obj4 instanceof String ? obj4 : null), str2);
                case "market":
                    Object obj5 = map.get("value");
                    if (obj5 != null) {
                        return new Market((String) obj5, str2);
                    }
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
                case "app":
                    Object obj6 = map.get("value");
                    if (obj6 != null) {
                        return new App(new AppPayload((Map) obj6), str2);
                    }
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
                case "view":
                    ViewPayload.Companion companion = ViewPayload.INSTANCE;
                    Object obj7 = map.get("value");
                    if (obj7 != null) {
                        return new View(companion.fromMap(obj7), str2);
                    }
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Any");
                case "share":
                    Object obj8 = map.get("value");
                    if (obj8 != null) {
                        return new Share(new SharePayload((Map) obj8), str2);
                    }
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
                case "settings":
                    Object obj9 = map.get("value");
                    if (obj9 != null) {
                        return new Settings((String) obj9, str2);
                    }
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
                default:
                    return null;
            }
        }
    }

    /* JADX INFO: compiled from: Action.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J!\u0010\u0007\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012¨\u0006\u0017"}, d2 = {"Lcom/bbva/component/dm/actionlauncher/model/Action$Dialer;", "Lcom/bbva/component/dm/actionlauncher/model/Action;", "", "component1", "component2", "phone", "actionId", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Ljava/lang/String;", "getPhone", "()Ljava/lang/String;", "b", "getActionId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component-dm-actionlauncher_release"}, k = 1, mv = {1, 4, 0})
    public static final /* data */ class Dialer extends Action {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final String phone;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final String actionId;

        public Dialer(@Nullable String str, @Nullable String str2) {
            super(null);
            this.phone = str;
            this.actionId = str2;
        }

        @NotNull
        public static /* synthetic */ Dialer copy$default(Dialer dialer, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = dialer.phone;
            }
            if ((i10 & 2) != 0) {
                str2 = dialer.getActionId();
            }
            return dialer.copy(str, str2);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getPhone() {
            return this.phone;
        }

        @Nullable
        public final String component2() {
            return getActionId();
        }

        @NotNull
        public final Dialer copy(@Nullable String phone, @Nullable String actionId) {
            return new Dialer(phone, actionId);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Dialer)) {
                return false;
            }
            Dialer dialer = (Dialer) other;
            return Intrinsics.areEqual(this.phone, dialer.phone) && Intrinsics.areEqual(getActionId(), dialer.getActionId());
        }

        @Override // com.bbva.component.dm.actionlauncher.model.Action
        @Nullable
        public String getActionId() {
            return this.actionId;
        }

        @Nullable
        public final String getPhone() {
            return this.phone;
        }

        public int hashCode() {
            String str = this.phone;
            int iHashCode = (str != null ? str.hashCode() : 0) * 31;
            String actionId = getActionId();
            return iHashCode + (actionId != null ? actionId.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Dialer(phone=" + this.phone + ", actionId=" + getActionId() + ")";
        }

        public /* synthetic */ Dialer(String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i10 & 2) != 0 ? null : str2);
        }
    }

    /* JADX INFO: compiled from: Action.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u001f\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012¨\u0006\u0017"}, d2 = {"Lcom/bbva/component/dm/actionlauncher/model/Action$Market;", "Lcom/bbva/component/dm/actionlauncher/model/Action;", "", "component1", "component2", "packageName", "actionId", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Ljava/lang/String;", "getPackageName", "()Ljava/lang/String;", "b", "getActionId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component-dm-actionlauncher_release"}, k = 1, mv = {1, 4, 0})
    public static final /* data */ class Market extends Action {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String packageName;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final String actionId;

        public Market(@NotNull String str, @Nullable String str2) {
            super(null);
            this.packageName = str;
            this.actionId = str2;
        }

        @NotNull
        public static /* synthetic */ Market copy$default(Market market, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = market.packageName;
            }
            if ((i10 & 2) != 0) {
                str2 = market.getActionId();
            }
            return market.copy(str, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getPackageName() {
            return this.packageName;
        }

        @Nullable
        public final String component2() {
            return getActionId();
        }

        @NotNull
        public final Market copy(@NotNull String packageName, @Nullable String actionId) {
            return new Market(packageName, actionId);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Market)) {
                return false;
            }
            Market market = (Market) other;
            return Intrinsics.areEqual(this.packageName, market.packageName) && Intrinsics.areEqual(getActionId(), market.getActionId());
        }

        @Override // com.bbva.component.dm.actionlauncher.model.Action
        @Nullable
        public String getActionId() {
            return this.actionId;
        }

        @NotNull
        public final String getPackageName() {
            return this.packageName;
        }

        public int hashCode() {
            String str = this.packageName;
            int iHashCode = (str != null ? str.hashCode() : 0) * 31;
            String actionId = getActionId();
            return iHashCode + (actionId != null ? actionId.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Market(packageName=" + this.packageName + ", actionId=" + getActionId() + ")";
        }

        public /* synthetic */ Market(String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i10 & 2) != 0 ? null : str2);
        }
    }

    /* JADX INFO: compiled from: Action.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u001f\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012¨\u0006\u0017"}, d2 = {"Lcom/bbva/component/dm/actionlauncher/model/Action$Settings;", "Lcom/bbva/component/dm/actionlauncher/model/Action;", "", "component1", "component2", "packageName", "actionId", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Ljava/lang/String;", "getPackageName", "()Ljava/lang/String;", "b", "getActionId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component-dm-actionlauncher_release"}, k = 1, mv = {1, 4, 0})
    public static final /* data */ class Settings extends Action {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String packageName;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final String actionId;

        public Settings(@NotNull String str, @Nullable String str2) {
            super(null);
            this.packageName = str;
            this.actionId = str2;
        }

        @NotNull
        public static /* synthetic */ Settings copy$default(Settings settings, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = settings.packageName;
            }
            if ((i10 & 2) != 0) {
                str2 = settings.getActionId();
            }
            return settings.copy(str, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getPackageName() {
            return this.packageName;
        }

        @Nullable
        public final String component2() {
            return getActionId();
        }

        @NotNull
        public final Settings copy(@NotNull String packageName, @Nullable String actionId) {
            return new Settings(packageName, actionId);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Settings)) {
                return false;
            }
            Settings settings = (Settings) other;
            return Intrinsics.areEqual(this.packageName, settings.packageName) && Intrinsics.areEqual(getActionId(), settings.getActionId());
        }

        @Override // com.bbva.component.dm.actionlauncher.model.Action
        @Nullable
        public String getActionId() {
            return this.actionId;
        }

        @NotNull
        public final String getPackageName() {
            return this.packageName;
        }

        public int hashCode() {
            String str = this.packageName;
            int iHashCode = (str != null ? str.hashCode() : 0) * 31;
            String actionId = getActionId();
            return iHashCode + (actionId != null ? actionId.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Settings(packageName=" + this.packageName + ", actionId=" + getActionId() + ")";
        }

        public /* synthetic */ Settings(String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i10 & 2) != 0 ? null : str2);
        }
    }

    /* JADX INFO: compiled from: Action.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u001f\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0004HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/bbva/component/dm/actionlauncher/model/Action$Share;", "Lcom/bbva/component/dm/actionlauncher/model/Action;", "Lcom/bbva/component/dm/actionlauncher/model/SharePayload;", "component1", "", "component2", BanxicoConstants.KEY_HISTORICAL_PAYLOAD, "actionId", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Lcom/bbva/component/dm/actionlauncher/model/SharePayload;", "getPayload", "()Lcom/bbva/component/dm/actionlauncher/model/SharePayload;", "b", "Ljava/lang/String;", "getActionId", "()Ljava/lang/String;", "<init>", "(Lcom/bbva/component/dm/actionlauncher/model/SharePayload;Ljava/lang/String;)V", "component-dm-actionlauncher_release"}, k = 1, mv = {1, 4, 0})
    public static final /* data */ class Share extends Action {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final SharePayload payload;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final String actionId;

        public Share(@NotNull SharePayload sharePayload, @Nullable String str) {
            super(null);
            this.payload = sharePayload;
            this.actionId = str;
        }

        @NotNull
        public static /* synthetic */ Share copy$default(Share share, SharePayload sharePayload, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                sharePayload = share.payload;
            }
            if ((i10 & 2) != 0) {
                str = share.getActionId();
            }
            return share.copy(sharePayload, str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final SharePayload getPayload() {
            return this.payload;
        }

        @Nullable
        public final String component2() {
            return getActionId();
        }

        @NotNull
        public final Share copy(@NotNull SharePayload payload, @Nullable String actionId) {
            return new Share(payload, actionId);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Share)) {
                return false;
            }
            Share share = (Share) other;
            return Intrinsics.areEqual(this.payload, share.payload) && Intrinsics.areEqual(getActionId(), share.getActionId());
        }

        @Override // com.bbva.component.dm.actionlauncher.model.Action
        @Nullable
        public String getActionId() {
            return this.actionId;
        }

        @NotNull
        public final SharePayload getPayload() {
            return this.payload;
        }

        public int hashCode() {
            SharePayload sharePayload = this.payload;
            int iHashCode = (sharePayload != null ? sharePayload.hashCode() : 0) * 31;
            String actionId = getActionId();
            return iHashCode + (actionId != null ? actionId.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Share(payload=" + this.payload + ", actionId=" + getActionId() + ")";
        }

        public /* synthetic */ Share(SharePayload sharePayload, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(sharePayload, (i10 & 2) != 0 ? null : str);
        }
    }

    /* JADX INFO: compiled from: Action.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u001f\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0004HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/bbva/component/dm/actionlauncher/model/Action$ShareFile;", "Lcom/bbva/component/dm/actionlauncher/model/Action;", "Lcom/bbva/component/dm/actionlauncher/model/ShareFilePayload;", "component1", "", "component2", BanxicoConstants.KEY_HISTORICAL_PAYLOAD, "actionId", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Lcom/bbva/component/dm/actionlauncher/model/ShareFilePayload;", "getPayload", "()Lcom/bbva/component/dm/actionlauncher/model/ShareFilePayload;", "b", "Ljava/lang/String;", "getActionId", "()Ljava/lang/String;", "<init>", "(Lcom/bbva/component/dm/actionlauncher/model/ShareFilePayload;Ljava/lang/String;)V", "component-dm-actionlauncher_release"}, k = 1, mv = {1, 4, 0})
    public static final /* data */ class ShareFile extends Action {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final ShareFilePayload payload;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final String actionId;

        public /* synthetic */ ShareFile(ShareFilePayload shareFilePayload, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(shareFilePayload, (i10 & 2) != 0 ? null : str);
        }

        @NotNull
        public static /* synthetic */ ShareFile copy$default(ShareFile shareFile, ShareFilePayload shareFilePayload, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                shareFilePayload = shareFile.payload;
            }
            if ((i10 & 2) != 0) {
                str = shareFile.getActionId();
            }
            return shareFile.copy(shareFilePayload, str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final ShareFilePayload getPayload() {
            return this.payload;
        }

        @Nullable
        public final String component2() {
            return getActionId();
        }

        @NotNull
        public final ShareFile copy(@NotNull ShareFilePayload payload, @Nullable String actionId) {
            return new ShareFile(payload, actionId);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ShareFile)) {
                return false;
            }
            ShareFile shareFile = (ShareFile) other;
            return Intrinsics.areEqual(this.payload, shareFile.payload) && Intrinsics.areEqual(getActionId(), shareFile.getActionId());
        }

        @Override // com.bbva.component.dm.actionlauncher.model.Action
        @Nullable
        public String getActionId() {
            return this.actionId;
        }

        @NotNull
        public final ShareFilePayload getPayload() {
            return this.payload;
        }

        public int hashCode() {
            ShareFilePayload shareFilePayload = this.payload;
            int iHashCode = (shareFilePayload != null ? shareFilePayload.hashCode() : 0) * 31;
            String actionId = getActionId();
            return iHashCode + (actionId != null ? actionId.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "ShareFile(payload=" + this.payload + ", actionId=" + getActionId() + ")";
        }

        public ShareFile(@NotNull ShareFilePayload shareFilePayload, @Nullable String str) {
            super(null);
            this.payload = shareFilePayload;
            this.actionId = str;
        }
    }

    /* JADX INFO: compiled from: Action.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u001f\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0004HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/bbva/component/dm/actionlauncher/model/Action$View;", "Lcom/bbva/component/dm/actionlauncher/model/Action;", "Lcom/bbva/component/dm/actionlauncher/model/ViewPayload;", "component1", "", "component2", BanxicoConstants.KEY_HISTORICAL_PAYLOAD, "actionId", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Lcom/bbva/component/dm/actionlauncher/model/ViewPayload;", "getPayload", "()Lcom/bbva/component/dm/actionlauncher/model/ViewPayload;", "b", "Ljava/lang/String;", "getActionId", "()Ljava/lang/String;", "<init>", "(Lcom/bbva/component/dm/actionlauncher/model/ViewPayload;Ljava/lang/String;)V", "component-dm-actionlauncher_release"}, k = 1, mv = {1, 4, 0})
    public static final /* data */ class View extends Action {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final ViewPayload payload;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final String actionId;

        public View(@NotNull ViewPayload viewPayload, @Nullable String str) {
            super(null);
            this.payload = viewPayload;
            this.actionId = str;
        }

        @NotNull
        public static /* synthetic */ View copy$default(View view, ViewPayload viewPayload, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                viewPayload = view.payload;
            }
            if ((i10 & 2) != 0) {
                str = view.getActionId();
            }
            return view.copy(viewPayload, str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final ViewPayload getPayload() {
            return this.payload;
        }

        @Nullable
        public final String component2() {
            return getActionId();
        }

        @NotNull
        public final View copy(@NotNull ViewPayload payload, @Nullable String actionId) {
            return new View(payload, actionId);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof View)) {
                return false;
            }
            View view = (View) other;
            return Intrinsics.areEqual(this.payload, view.payload) && Intrinsics.areEqual(getActionId(), view.getActionId());
        }

        @Override // com.bbva.component.dm.actionlauncher.model.Action
        @Nullable
        public String getActionId() {
            return this.actionId;
        }

        @NotNull
        public final ViewPayload getPayload() {
            return this.payload;
        }

        public int hashCode() {
            ViewPayload viewPayload = this.payload;
            int iHashCode = (viewPayload != null ? viewPayload.hashCode() : 0) * 31;
            String actionId = getActionId();
            return iHashCode + (actionId != null ? actionId.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "View(payload=" + this.payload + ", actionId=" + getActionId() + ")";
        }

        public /* synthetic */ View(ViewPayload viewPayload, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(viewPayload, (i10 & 2) != 0 ? null : str);
        }
    }

    public Action() {
    }

    public /* synthetic */ Action(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @JvmStatic
    @Nullable
    public static final Action fromMap(@NotNull Map<String, ? extends Object> map) {
        return INSTANCE.fromMap(map);
    }

    @Nullable
    public abstract String getActionId();
}
