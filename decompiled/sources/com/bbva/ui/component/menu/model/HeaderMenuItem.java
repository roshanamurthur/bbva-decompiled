package com.bbva.ui.component.menu.model;

import android.content.Context;
import com.bbva.cells.component.kit.ui.helper.PropertiesHelper;
import com.bbva.ui.component.menu.extensions.MapExtensionKt;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.huawei.hms.feature.model.b;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import com.vierge.bluetoothlibrary.BluetoothState;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: HeaderMenuItem.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001:\u0001!B\u008c\u0001\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u000e\u0012\u0006\u0010\u0017\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0019\u0012\u001b\b\u0002\u0010\u001e\u001a\u0015\u0012\u0004\u0012\u00020\u000e\u0012\t\u0012\u00070\u000e¢\u0006\u0002\b\u001d\u0018\u00010\u001c\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u001f\u0010 R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\""}, d2 = {"Lcom/bbva/ui/component/menu/model/HeaderMenuItem;", "Lcom/bbva/ui/component/menu/model/BaseMenuItem;", "Lcom/bbva/ui/component/menu/model/HeaderSubItem;", "j", "Lcom/bbva/ui/component/menu/model/HeaderSubItem;", "getSubtitle", "()Lcom/bbva/ui/component/menu/model/HeaderSubItem;", NotificationMessage.NOTIF_KEY_SUB_TITLE, "k", "getSubHeader", "subHeader", "l", "getThirdLine", "thirdLine", "", "m", "Ljava/lang/String;", "getInitials", "()Ljava/lang/String;", "initials", "", "id", "route", "title", "clickAccessibilityLabel", "", "isChecked", "isCheckable", "", "Lom/bbva/ui/component/menu/model/BaseMenuItem$Stat;", b.f50432b, "<init>", "(ILjava/lang/String;Ljava/lang/String;Lcom/bbva/ui/component/menu/model/HeaderSubItem;Ljava/lang/String;ZZLjava/util/Map;Lcom/bbva/ui/component/menu/model/HeaderSubItem;Lcom/bbva/ui/component/menu/model/HeaderSubItem;Ljava/lang/String;)V", "Builder", "component-ui-menu_release"}, k = 1, mv = {1, 8, 0})
public class HeaderMenuItem extends BaseMenuItem {

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final HeaderSubItem subtitle;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final HeaderSubItem subHeader;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final HeaderSubItem thirdLine;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public final String initials;

    /* JADX INFO: compiled from: HeaderMenuItem.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\u0005\u001a\u00020\u00002\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002J\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\f"}, d2 = {"Lcom/bbva/ui/component/menu/model/HeaderMenuItem$Builder;", "", "", "", "map", "configuration", "Lcom/bbva/ui/component/menu/model/HeaderMenuItem;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "component-ui-menu_release"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nHeaderMenuItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeaderMenuItem.kt\ncom/bbva/ui/component/menu/model/HeaderMenuItem$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,66:1\n1#2:67\n*E\n"})
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final Context f36986a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Map<String, ? extends Object> f36987b;

        public Builder(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            this.f36986a = context;
        }

        @NotNull
        public final HeaderMenuItem build() {
            Map<String, ? extends Object> map = this.f36987b;
            if (map == null) {
                Intrinsics.throwUninitializedPropertyAccessException("map");
                map = null;
            }
            PropertiesHelper.Property property = MapExtensionKt.toProperty((Map) map.get("clickAccessibilityLabel"));
            Map<String, ? extends Object> map2 = this.f36987b;
            if (map2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("map");
                map2 = null;
            }
            Map<String, ? extends Object> map3 = (Map) map2.get(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            Map<String, ? extends Object> map4 = this.f36987b;
            if (map4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("map");
                map4 = null;
            }
            Map<String, ? extends Object> map5 = (Map) map4.get("subHeader");
            Map<String, ? extends Object> map6 = this.f36987b;
            if (map6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("map");
                map6 = null;
            }
            Map<String, ? extends Object> map7 = (Map) map6.get("thirdLine");
            Map<String, ? extends Object> map8 = this.f36987b;
            if (map8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("map");
                map8 = null;
            }
            PropertiesHelper.Property property2 = MapExtensionKt.toProperty((Map) map8.get("initials"));
            Map<String, ? extends Object> map9 = this.f36987b;
            if (map9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("map");
                map9 = null;
            }
            Object obj = map9.get("id");
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            int iIntValue = num != null ? num.intValue() : 0;
            Map<String, ? extends Object> map10 = this.f36987b;
            if (map10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("map");
                map10 = null;
            }
            Object obj2 = map10.get("route");
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Map<String, ? extends Object> map11 = this.f36987b;
            if (map11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("map");
                map11 = null;
            }
            Object obj3 = map11.get("title");
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.String");
            String str2 = (String) obj3;
            Context context = this.f36986a;
            HeaderSubItem headerSubItemBuild = map3 != null ? new HeaderSubItem.Builder(context).configuration(map3).build() : null;
            BuilderHelper builderHelper = BuilderHelper.INSTANCE;
            String strLoadString$component_ui_menu_release = builderHelper.loadString$component_ui_menu_release(context, property);
            Map<String, ? extends Object> map12 = this.f36987b;
            if (map12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("map");
                map12 = null;
            }
            Boolean bool = (Boolean) map12.get("checkable");
            boolean zBooleanValue = bool != null ? bool.booleanValue() : true;
            Map<String, ? extends Object> map13 = this.f36987b;
            if (map13 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("map");
                map13 = null;
            }
            return new HeaderMenuItem(iIntValue, str, str2, headerSubItemBuild, strLoadString$component_ui_menu_release, false, zBooleanValue, (Map) map13.get(b.f50432b), map5 != null ? new HeaderSubItem.Builder(context).configuration(map5).build() : null, map7 != null ? new HeaderSubItem.Builder(context).configuration(map7).build() : null, property2 != null ? builderHelper.loadString$component_ui_menu_release(context, property2) : null);
        }

        @NotNull
        public final Builder configuration(@NotNull Map<String, ? extends Object> map) {
            Intrinsics.checkNotNullParameter(map, "map");
            this.f36987b = map;
            return this;
        }
    }

    public /* synthetic */ HeaderMenuItem(int i10, String str, String str2, HeaderSubItem headerSubItem, String str3, boolean z10, boolean z11, Map map, HeaderSubItem headerSubItem2, HeaderSubItem headerSubItem3, String str4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, str, str2, (i11 & 8) != 0 ? null : headerSubItem, (i11 & 16) != 0 ? null : str3, (i11 & 32) != 0 ? false : z10, (i11 & 64) != 0 ? true : z11, (i11 & 128) != 0 ? null : map, (i11 & 256) != 0 ? null : headerSubItem2, (i11 & 512) != 0 ? null : headerSubItem3, (i11 & 1024) != 0 ? null : str4);
    }

    @Nullable
    public final String getInitials() {
        return this.initials;
    }

    @Nullable
    public final HeaderSubItem getSubHeader() {
        return this.subHeader;
    }

    @Nullable
    public final HeaderSubItem getSubtitle() {
        return this.subtitle;
    }

    @Nullable
    public final HeaderSubItem getThirdLine() {
        return this.thirdLine;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeaderMenuItem(int i10, @NotNull String route, @NotNull String title, @Nullable HeaderSubItem headerSubItem, @Nullable String str, boolean z10, boolean z11, @Nullable Map<String, String> map, @Nullable HeaderSubItem headerSubItem2, @Nullable HeaderSubItem headerSubItem3, @Nullable String str2) {
        super(i10, route, title, str, z10, z11, map, false, null, BluetoothState.REQUEST_CONNECT_DEVICE, null);
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(title, "title");
        this.subtitle = headerSubItem;
        this.subHeader = headerSubItem2;
        this.thirdLine = headerSubItem3;
        this.initials = str2;
    }
}
