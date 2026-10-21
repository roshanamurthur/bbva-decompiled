package com.bbva.ui.component.menu.model;

import android.content.Context;
import com.bbva.cells.component.kit.ui.helper.PropertiesHelper;
import com.bbva.cells.componentkit.model.dsl.ImageSettings;
import com.bbva.cells.componentkit.model.dsl.ResourceId;
import com.bbva.cells.componentkit.model.dsl.Scale;
import com.bbva.cells.componentkit.model.dsl.ViewSettings;
import com.bbva.ui.component.menu.extensions.MapExtensionKt;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.huawei.hms.feature.model.b;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: MenuItem.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0018Bz\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000e\u0012\u001b\b\u0002\u0010\u0013\u001a\u0015\u0012\u0004\u0012\u00020\n\u0012\t\u0012\u00070\n¢\u0006\u0002\b\u0012\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0019"}, d2 = {"Lcom/bbva/ui/component/menu/model/MenuItem;", "Lcom/bbva/ui/component/menu/model/BaseMenuItem;", "Lcom/bbva/cells/componentkit/model/dsl/ImageSettings;", "j", "Lcom/bbva/cells/componentkit/model/dsl/ImageSettings;", "getIcon", "()Lcom/bbva/cells/componentkit/model/dsl/ImageSettings;", "icon", "", "id", "", "route", "text", "clickAccessibilityLabel", "", "isChecked", "isCheckable", "", "Lom/bbva/ui/component/menu/model/BaseMenuItem$Stat;", b.f50432b, "isFeatured", "clickAction", "<init>", "(ILjava/lang/String;Lcom/bbva/cells/componentkit/model/dsl/ImageSettings;Ljava/lang/String;Ljava/lang/String;ZZLjava/util/Map;ZLjava/lang/String;)V", "Builder", "component-ui-menu_release"}, k = 1, mv = {1, 8, 0})
public class MenuItem extends BaseMenuItem {

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ImageSettings icon;

    /* JADX INFO: compiled from: MenuItem.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\u0005\u001a\u00020\u00002\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002J\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\f"}, d2 = {"Lcom/bbva/ui/component/menu/model/MenuItem$Builder;", "", "", "", "map", "configuration", "Lcom/bbva/ui/component/menu/model/MenuItem;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "component-ui-menu_release"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nMenuItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MenuItem.kt\ncom/bbva/ui/component/menu/model/MenuItem$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,63:1\n1#2:64\n*E\n"})
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final Context f36994a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Map<String, ? extends Object> f36995b;

        public Builder(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            this.f36994a = context;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public final MenuItem build() {
            ImageSettings imageSettings;
            Map<String, ? extends Object> map = this.f36995b;
            Map<String, ? extends Object> map2 = null;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            if (map == null) {
                Intrinsics.throwUninitializedPropertyAccessException("map");
                map = null;
            }
            Object obj = map.get("icon");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
            PropertiesHelper.Property property = MapExtensionKt.toProperty((Map) obj);
            Map<String, ? extends Object> map3 = this.f36995b;
            if (map3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("map");
                map3 = null;
            }
            Object obj2 = map3.get("text");
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
            PropertiesHelper.Property property2 = MapExtensionKt.toProperty((Map) obj2);
            Map<String, ? extends Object> map4 = this.f36995b;
            if (map4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("map");
                map4 = null;
            }
            PropertiesHelper.Property property3 = MapExtensionKt.toProperty((Map) map4.get("clickAccessibilityLabel"));
            Map<String, ? extends Object> map5 = this.f36995b;
            if (map5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("map");
                map5 = null;
            }
            Object obj3 = map5.get("id");
            Double d2 = obj3 instanceof Double ? (Double) obj3 : null;
            int iDoubleValue = d2 != null ? (int) d2.doubleValue() : 0;
            Map<String, ? extends Object> map6 = this.f36995b;
            if (map6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("map");
                map6 = null;
            }
            Object obj4 = map6.get("route");
            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj4;
            boolean zAreEqual = Intrinsics.areEqual(property != null ? property.getType() : null, "resource");
            int i10 = 1;
            Context context = this.f36994a;
            if (zAreEqual) {
                imageSettings = new ImageSettings((ViewSettings) null, (Scale) null, new ResourceId((String) (objArr2 == true ? 1 : 0), Integer.valueOf(BuilderHelper.INSTANCE.loadDrawableId$component_ui_menu_release(context, property)), i10, (DefaultConstructorMarker) (objArr == true ? 1 : 0)), (String) null, 11, (DefaultConstructorMarker) null);
            } else {
                imageSettings = new ImageSettings((ViewSettings) null, (Scale) null, (ResourceId) null, property != null ? property.getValue() : null, 7, (DefaultConstructorMarker) null);
            }
            BuilderHelper builderHelper = BuilderHelper.INSTANCE;
            String strLoadString$component_ui_menu_release = builderHelper.loadString$component_ui_menu_release(context, property2);
            String strLoadString$component_ui_menu_release2 = builderHelper.loadString$component_ui_menu_release(context, property3);
            Map<String, ? extends Object> map7 = this.f36995b;
            if (map7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("map");
                map7 = null;
            }
            Boolean bool = (Boolean) map7.get("checkable");
            boolean zBooleanValue = bool != null ? bool.booleanValue() : true;
            Map<String, ? extends Object> map8 = this.f36995b;
            if (map8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("map");
                map8 = null;
            }
            Map map9 = (Map) map8.get(b.f50432b);
            Map<String, ? extends Object> map10 = this.f36995b;
            if (map10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("map");
                map10 = null;
            }
            Object obj5 = map10.get("featured");
            if (obj5 == null) {
                obj5 = Boolean.FALSE;
            }
            Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type kotlin.Boolean");
            boolean zBooleanValue2 = ((Boolean) obj5).booleanValue();
            Map<String, ? extends Object> map11 = this.f36995b;
            if (map11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("map");
            } else {
                map2 = map11;
            }
            return new MenuItem(iDoubleValue, str, imageSettings, strLoadString$component_ui_menu_release, strLoadString$component_ui_menu_release2, false, zBooleanValue, map9, zBooleanValue2, (String) map2.get("clickAction"));
        }

        @NotNull
        public final Builder configuration(@NotNull Map<String, ? extends Object> map) {
            Intrinsics.checkNotNullParameter(map, "map");
            this.f36995b = map;
            return this;
        }
    }

    public /* synthetic */ MenuItem(int i10, String str, ImageSettings imageSettings, String str2, String str3, boolean z10, boolean z11, Map map, boolean z12, String str4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, str, imageSettings, str2, (i11 & 16) != 0 ? null : str3, (i11 & 32) != 0 ? false : z10, (i11 & 64) != 0 ? true : z11, (i11 & 128) != 0 ? null : map, (i11 & 256) != 0 ? false : z12, (i11 & 512) != 0 ? null : str4);
    }

    @NotNull
    public final ImageSettings getIcon() {
        return this.icon;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MenuItem(int i10, @NotNull String route, @NotNull ImageSettings icon, @NotNull String text, @Nullable String str, boolean z10, boolean z11, @Nullable Map<String, String> map, boolean z12, @Nullable String str2) {
        super(i10, route, text, str, z10, z11, map, z12, str2);
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(text, "text");
        this.icon = icon;
    }
}
