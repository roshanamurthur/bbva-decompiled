package com.bbva.ui.component.menu.model;

import android.content.Context;
import androidx.camera.camera2.internal.n1;
import androidx.datastore.preferences.protobuf.e;
import com.bbva.cells.component.kit.ui.helper.PropertiesHelper;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
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

/* JADX INFO: compiled from: HeaderSubItem.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001:\u0001 B4\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u001b\b\u0002\u0010\u000b\u001a\u0015\u0012\u0004\u0012\u00020\u0004\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u0007\u0018\u00010\u0006¢\u0006\u0004\b\u001e\u0010\u001fJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001c\u0010\b\u001a\u0015\u0012\u0004\u0012\u00020\u0004\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u0007\u0018\u00010\u0006HÆ\u0003J:\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00042\u001b\b\u0002\u0010\u000b\u001a\u0015\u0012\u0004\u0012\u00020\u0004\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u0007\u0018\u00010\u0006HÆ\u0001J\t\u0010\r\u001a\u00020\u0004HÖ\u0001J\t\u0010\u000e\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R*\u0010\u000b\u001a\u0015\u0012\u0004\u0012\u00020\u0004\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006!"}, d2 = {"Lcom/bbva/ui/component/menu/model/HeaderSubItem;", "", "", "component1", "", "component2", "", "Lom/bbva/ui/component/menu/model/BaseMenuItem$Stat;", "component3", "id", "text", b.f50432b, "copy", "toString", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getId", "()I", "b", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "c", "Ljava/util/Map;", "getStates", "()Ljava/util/Map;", "<init>", "(ILjava/lang/String;Ljava/util/Map;)V", "Builder", "component-ui-menu_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class HeaderSubItem {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final int id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String text;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Map<String, String> states;

    /* JADX INFO: compiled from: HeaderSubItem.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\u0005\u001a\u00020\u00002\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002J\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\f"}, d2 = {"Lcom/bbva/ui/component/menu/model/HeaderSubItem$Builder;", "", "", "", "map", "configuration", "Lcom/bbva/ui/component/menu/model/HeaderSubItem;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "component-ui-menu_release"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nHeaderSubItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeaderSubItem.kt\ncom/bbva/ui/component/menu/model/HeaderSubItem$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,29:1\n1#2:30\n*E\n"})
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final Context f36991a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Map<String, ? extends Object> f36992b;

        public Builder(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            this.f36991a = context;
        }

        @NotNull
        public final HeaderSubItem build() {
            Map<String, ? extends Object> map = this.f36992b;
            Map<String, ? extends Object> map2 = null;
            if (map == null) {
                Intrinsics.throwUninitializedPropertyAccessException("map");
                map = null;
            }
            Object obj = map.get("text");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
            PropertiesHelper.Property property = MapExtensionKt.toProperty((Map) obj);
            Map<String, ? extends Object> map3 = this.f36992b;
            if (map3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("map");
                map3 = null;
            }
            Object obj2 = map3.get("id");
            Integer num = obj2 instanceof Integer ? (Integer) obj2 : null;
            int iIntValue = num != null ? num.intValue() : 0;
            String strLoadString$component_ui_menu_release = BuilderHelper.INSTANCE.loadString$component_ui_menu_release(this.f36991a, property);
            Map<String, ? extends Object> map4 = this.f36992b;
            if (map4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("map");
            } else {
                map2 = map4;
            }
            return new HeaderSubItem(iIntValue, strLoadString$component_ui_menu_release, (Map) map2.get(b.f50432b));
        }

        @NotNull
        public final Builder configuration(@NotNull Map<String, ? extends Object> map) {
            Intrinsics.checkNotNullParameter(map, "map");
            this.f36992b = map;
            return this;
        }
    }

    public HeaderSubItem(int i10, @NotNull String text, @Nullable Map<String, String> map) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.id = i10;
        this.text = text;
        this.states = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HeaderSubItem copy$default(HeaderSubItem headerSubItem, int i10, String str, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = headerSubItem.id;
        }
        if ((i11 & 2) != 0) {
            str = headerSubItem.text;
        }
        if ((i11 & 4) != 0) {
            map = headerSubItem.states;
        }
        return headerSubItem.copy(i10, str, map);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @Nullable
    public final Map<String, String> component3() {
        return this.states;
    }

    @NotNull
    public final HeaderSubItem copy(int id, @NotNull String text, @Nullable Map<String, String> states) {
        Intrinsics.checkNotNullParameter(text, "text");
        return new HeaderSubItem(id, text, states);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HeaderSubItem)) {
            return false;
        }
        HeaderSubItem headerSubItem = (HeaderSubItem) other;
        return this.id == headerSubItem.id && Intrinsics.areEqual(this.text, headerSubItem.text) && Intrinsics.areEqual(this.states, headerSubItem.states);
    }

    public final int getId() {
        return this.id;
    }

    @Nullable
    public final Map<String, String> getStates() {
        return this.states;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int iC = n1.c(this.text, this.id * 31, 31);
        Map<String, String> map = this.states;
        return iC + (map == null ? 0 : map.hashCode());
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("HeaderSubItem(id=");
        sb2.append(this.id);
        sb2.append(", text=");
        sb2.append(this.text);
        sb2.append(", states=");
        return e.g(sb2, this.states, RootService.CLOSE_BRACKET);
    }

    public /* synthetic */ HeaderSubItem(int i10, String str, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, str, (i11 & 4) != 0 ? null : map);
    }
}
