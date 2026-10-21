package com.bbva.component.ui.shortcuts.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bbva.cells.componentkit.model.dsl.ImageSettings;
import com.bbva.cells.componentkit.model.dsl.ImageSettings$$serializer;
import com.bbva.cells.componentkit.model.dsl.TextSettings;
import com.bbva.cells.componentkit.model.dsl.TextSettings$$serializer;
import com.bbva.cells.componentkit.model.dsl.ViewSettings;
import com.bbva.cells.componentkit.model.dsl.ViewSettings$$serializer;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ShortcutsConfiguration.kt */
/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 42\u00020\u0001:\u000254B+\u0012\u0006\u0010\u0013\u001a\u00020\u000b\u0012\u0006\u0010\u0014\u001a\u00020\r\u0012\u0006\u0010\u0015\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b.\u0010/BC\b\u0011\u0012\u0006\u00100\u001a\u00020\u0019\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0011\u0012\b\u00102\u001a\u0004\u0018\u000101¢\u0006\u0004\b.\u00103J(\u0010\n\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÁ\u0001¢\u0006\u0004\b\b\u0010\tJ\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\t\u0010\u000e\u001a\u00020\rHÆ\u0003J\t\u0010\u0010\u001a\u00020\u000fHÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÆ\u0003J3\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u000b2\b\b\u0002\u0010\u0014\u001a\u00020\r2\b\b\u0002\u0010\u0015\u001a\u00020\u000f2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0011HÆ\u0001J\t\u0010\u0018\u001a\u00020\u000bHÖ\u0001J\t\u0010\u001a\u001a\u00020\u0019HÖ\u0001J\u0013\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0013\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0014\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0015\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-¨\u00066"}, d2 = {"Lcom/bbva/component/ui/shortcuts/model/ShortcutItem;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$component_ui_shortcuts_release", "(Lcom/bbva/component/ui/shortcuts/model/ShortcutItem;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "component1", "Lcom/bbva/cells/componentkit/model/dsl/ImageSettings;", "component2", "Lcom/bbva/cells/componentkit/model/dsl/TextSettings;", "component3", "Lcom/bbva/cells/componentkit/model/dsl/ViewSettings;", "component4", "id", "icon", "label", "view", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "b", "Lcom/bbva/cells/componentkit/model/dsl/ImageSettings;", "getIcon", "()Lcom/bbva/cells/componentkit/model/dsl/ImageSettings;", "c", "Lcom/bbva/cells/componentkit/model/dsl/TextSettings;", "getLabel", "()Lcom/bbva/cells/componentkit/model/dsl/TextSettings;", "d", "Lcom/bbva/cells/componentkit/model/dsl/ViewSettings;", "getView", "()Lcom/bbva/cells/componentkit/model/dsl/ViewSettings;", "<init>", "(Ljava/lang/String;Lcom/bbva/cells/componentkit/model/dsl/ImageSettings;Lcom/bbva/cells/componentkit/model/dsl/TextSettings;Lcom/bbva/cells/componentkit/model/dsl/ViewSettings;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/bbva/cells/componentkit/model/dsl/ImageSettings;Lcom/bbva/cells/componentkit/model/dsl/TextSettings;Lcom/bbva/cells/componentkit/model/dsl/ViewSettings;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "component-ui-shortcuts_release"}, k = 1, mv = {1, 9, 0})
@Serializable
public final /* data */ class ShortcutItem {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ImageSettings icon;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TextSettings label;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final ViewSettings view;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: compiled from: ShortcutsConfiguration.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/bbva/component/ui/shortcuts/model/ShortcutItem$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/bbva/component/ui/shortcuts/model/ShortcutItem;", "component-ui-shortcuts_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<ShortcutItem> serializer() {
            return ShortcutItem$$serializer.INSTANCE;
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ ShortcutItem(int i10, String str, ImageSettings imageSettings, TextSettings textSettings, ViewSettings viewSettings, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i10 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i10, 7, ShortcutItem$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.icon = imageSettings;
        this.label = textSettings;
        if ((i10 & 8) == 0) {
            this.view = null;
        } else {
            this.view = viewSettings;
        }
    }

    public static /* synthetic */ ShortcutItem copy$default(ShortcutItem shortcutItem, String str, ImageSettings imageSettings, TextSettings textSettings, ViewSettings viewSettings, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = shortcutItem.id;
        }
        if ((i10 & 2) != 0) {
            imageSettings = shortcutItem.icon;
        }
        if ((i10 & 4) != 0) {
            textSettings = shortcutItem.label;
        }
        if ((i10 & 8) != 0) {
            viewSettings = shortcutItem.view;
        }
        return shortcutItem.copy(str, imageSettings, textSettings, viewSettings);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$component_ui_shortcuts_release(ShortcutItem self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.id);
        output.encodeSerializableElement(serialDesc, 1, ImageSettings$$serializer.INSTANCE, self.icon);
        output.encodeSerializableElement(serialDesc, 2, TextSettings$$serializer.INSTANCE, self.label);
        boolean zShouldEncodeElementDefault = output.shouldEncodeElementDefault(serialDesc, 3);
        ViewSettings viewSettings = self.view;
        if (!zShouldEncodeElementDefault && viewSettings == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 3, ViewSettings$$serializer.INSTANCE, viewSettings);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ImageSettings getIcon() {
        return this.icon;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final TextSettings getLabel() {
        return this.label;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final ViewSettings getView() {
        return this.view;
    }

    @NotNull
    public final ShortcutItem copy(@NotNull String id, @NotNull ImageSettings icon, @NotNull TextSettings label, @Nullable ViewSettings view) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(label, "label");
        return new ShortcutItem(id, icon, label, view);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShortcutItem)) {
            return false;
        }
        ShortcutItem shortcutItem = (ShortcutItem) other;
        return Intrinsics.areEqual(this.id, shortcutItem.id) && Intrinsics.areEqual(this.icon, shortcutItem.icon) && Intrinsics.areEqual(this.label, shortcutItem.label) && Intrinsics.areEqual(this.view, shortcutItem.view);
    }

    @NotNull
    public final ImageSettings getIcon() {
        return this.icon;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final TextSettings getLabel() {
        return this.label;
    }

    @Nullable
    public final ViewSettings getView() {
        return this.view;
    }

    public int hashCode() {
        int iHashCode = (this.label.hashCode() + ((this.icon.hashCode() + (this.id.hashCode() * 31)) * 31)) * 31;
        ViewSettings viewSettings = this.view;
        return iHashCode + (viewSettings == null ? 0 : viewSettings.hashCode());
    }

    @NotNull
    public String toString() {
        return "ShortcutItem(id=" + this.id + ", icon=" + this.icon + ", label=" + this.label + ", view=" + this.view + ")";
    }

    public ShortcutItem(@NotNull String id, @NotNull ImageSettings icon, @NotNull TextSettings label, @Nullable ViewSettings viewSettings) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(label, "label");
        this.id = id;
        this.icon = icon;
        this.label = label;
        this.view = viewSettings;
    }

    public /* synthetic */ ShortcutItem(String str, ImageSettings imageSettings, TextSettings textSettings, ViewSettings viewSettings, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, imageSettings, textSettings, (i10 & 8) != 0 ? null : viewSettings);
    }
}
