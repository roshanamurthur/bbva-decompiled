package com.bbva.glomohybrid.base.shortcuts;

import androidx.appcompat.app.i;
import bk.o;
import com.bbva.cells.component.kit.ui.helper.PropertiesHelper;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ShortcutModel.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002¢\u0006\u0004\b'\u0010(J!\u0010\u0005\u001a\u00020\u00002\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0003HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010R\u0017\u0010\u0017\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0016\u0010\u0010R\u0017\u0010\u001a\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u000e\u001a\u0004\b\u0019\u0010\u0010R!\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001b\u0010&\u001a\u00020\u00038FX\u0086\u0084\u0002¢\u0006\f\u001a\u0004\b\"\u0010#*\u0004\b$\u0010%¨\u0006)"}, d2 = {"Lcom/bbva/glomohybrid/base/shortcuts/Shortcut;", "", "", "", "map", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "Lcom/bbva/cells/component/kit/ui/helper/PropertiesHelper$Property;", "b", "Lcom/bbva/cells/component/kit/ui/helper/PropertiesHelper$Property;", "getShortText", "()Lcom/bbva/cells/component/kit/ui/helper/PropertiesHelper$Property;", "shortText", "c", "getLongText", "longText", "d", "getIcon", "icon", "e", "getDisabledMessage", "disabledMessage", "", "Lcom/bbva/glomohybrid/base/shortcuts/Action;", "f", "Lcom/bbva/glomohybrid/base/shortcuts/ActionDelegate;", "getActions", "()Ljava/util/List;", "actions", "getId", "()Ljava/lang/String;", "getId$delegate", "(Lcom/bbva/glomohybrid/base/shortcuts/Shortcut;)Ljava/lang/Object;", "id", "<init>", "(Ljava/util/Map;)V", "Base_release"}, k = 1, mv = {1, 9, 0})
public final /* data */ class Shortcut {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ KProperty<Object>[] f31548g = {i.d(Shortcut.class, "id", "getId()Ljava/lang/String;", 0), i.d(Shortcut.class, "actions", "getActions()Ljava/util/List;", 0)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Map<String, Object> f31549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final PropertiesHelper.Property shortText;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final PropertiesHelper.Property longText;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final PropertiesHelper.Property icon;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final PropertiesHelper.Property disabledMessage;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ActionDelegate actions;

    public Shortcut(@NotNull Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        this.f31549a = map;
        Object obj = map.get("shortLabel");
        PropertiesHelper.Property propertyFrom = PropertiesHelper.Property.from((Map<String, String>) (obj instanceof Map ? (Map) obj : null));
        Intrinsics.checkNotNullExpressionValue(propertyFrom, "from(...)");
        this.shortText = propertyFrom;
        Object obj2 = map.get("longLabel");
        PropertiesHelper.Property propertyFrom2 = PropertiesHelper.Property.from((Map<String, String>) (obj2 instanceof Map ? (Map) obj2 : null));
        Intrinsics.checkNotNullExpressionValue(propertyFrom2, "from(...)");
        this.longText = propertyFrom2;
        Object obj3 = map.get("icon");
        PropertiesHelper.Property propertyFrom3 = PropertiesHelper.Property.from((Map<String, String>) (obj3 instanceof Map ? (Map) obj3 : null));
        Intrinsics.checkNotNullExpressionValue(propertyFrom3, "from(...)");
        this.icon = propertyFrom3;
        Object obj4 = map.get("disabledMessage");
        PropertiesHelper.Property propertyFrom4 = PropertiesHelper.Property.from((Map<String, String>) (obj4 instanceof Map ? (Map) obj4 : null));
        Intrinsics.checkNotNullExpressionValue(propertyFrom4, "from(...)");
        this.disabledMessage = propertyFrom4;
        Object obj5 = map.get("actions");
        this.actions = new ActionDelegate(obj5 instanceof List ? (List) obj5 : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Shortcut copy$default(Shortcut shortcut, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            map = shortcut.f31549a;
        }
        return shortcut.copy(map);
    }

    @NotNull
    public final Shortcut copy(@NotNull Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        return new Shortcut(map);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Shortcut) && Intrinsics.areEqual(this.f31549a, ((Shortcut) other).f31549a);
    }

    @NotNull
    public final List<Action> getActions() {
        return this.actions.getValue2(this, f31548g[1]);
    }

    @NotNull
    public final PropertiesHelper.Property getDisabledMessage() {
        return this.disabledMessage;
    }

    @NotNull
    public final PropertiesHelper.Property getIcon() {
        return this.icon;
    }

    @NotNull
    public final String getId() {
        return (String) o.getOrImplicitDefaultNullable(this.f31549a, f31548g[0].getName());
    }

    @NotNull
    public final PropertiesHelper.Property getLongText() {
        return this.longText;
    }

    @NotNull
    public final PropertiesHelper.Property getShortText() {
        return this.shortText;
    }

    public int hashCode() {
        return this.f31549a.hashCode();
    }

    @NotNull
    public String toString() {
        return "Shortcut(map=" + this.f31549a + ")";
    }
}
