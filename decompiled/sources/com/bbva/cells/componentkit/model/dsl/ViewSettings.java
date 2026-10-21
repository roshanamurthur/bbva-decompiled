package com.bbva.cells.componentkit.model.dsl;

import com.bbva.cells.component.kit.ui.property.impl.view.EnableHandler;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Settings.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 C2\u00020\u0001:\u0002DCBC\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b=\u0010>BM\b\u0017\u0012\u0006\u0010?\u001a\u00020\u001c\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010A\u001a\u0004\u0018\u00010@¢\u0006\u0004\b=\u0010BJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÆ\u0003JL\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0012HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u001b\u001a\u00020\u0012HÖ\u0001J\t\u0010\u001d\u001a\u00020\u001cHÖ\u0001J\u0013\u0010\u001f\u001a\u00020\r2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R$\u0010\u0014\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R$\u0010\u0015\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R$\u0010\u0016\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010\u000f\"\u0004\b/\u00100R$\u0010\u0017\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R$\u0010\u0018\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<¨\u0006E"}, d2 = {"Lcom/bbva/cells/componentkit/model/dsl/ViewSettings;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "Lcom/bbva/cells/componentkit/model/dsl/Resource;", "component1", "Lcom/bbva/cells/componentkit/model/dsl/ResourceId;", "component2", "", "component3", "()Ljava/lang/Boolean;", "Lcom/bbva/cells/componentkit/model/dsl/Visibility;", "component4", "", "component5", "backgroundColor", "backgroundColorState", EnableHandler.ID, "visibility", "accessibilityLabel", "copy", "(Lcom/bbva/cells/componentkit/model/dsl/Resource;Lcom/bbva/cells/componentkit/model/dsl/ResourceId;Ljava/lang/Boolean;Lcom/bbva/cells/componentkit/model/dsl/Visibility;Ljava/lang/String;)Lcom/bbva/cells/componentkit/model/dsl/ViewSettings;", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "equals", "a", "Lcom/bbva/cells/componentkit/model/dsl/Resource;", "getBackgroundColor", "()Lcom/bbva/cells/componentkit/model/dsl/Resource;", "setBackgroundColor", "(Lcom/bbva/cells/componentkit/model/dsl/Resource;)V", "b", "Lcom/bbva/cells/componentkit/model/dsl/ResourceId;", "getBackgroundColorState", "()Lcom/bbva/cells/componentkit/model/dsl/ResourceId;", "setBackgroundColorState", "(Lcom/bbva/cells/componentkit/model/dsl/ResourceId;)V", "c", "Ljava/lang/Boolean;", "getEnable", "setEnable", "(Ljava/lang/Boolean;)V", "d", "Lcom/bbva/cells/componentkit/model/dsl/Visibility;", "getVisibility", "()Lcom/bbva/cells/componentkit/model/dsl/Visibility;", "setVisibility", "(Lcom/bbva/cells/componentkit/model/dsl/Visibility;)V", "e", "Ljava/lang/String;", "getAccessibilityLabel", "()Ljava/lang/String;", "setAccessibilityLabel", "(Ljava/lang/String;)V", "<init>", "(Lcom/bbva/cells/componentkit/model/dsl/Resource;Lcom/bbva/cells/componentkit/model/dsl/ResourceId;Ljava/lang/Boolean;Lcom/bbva/cells/componentkit/model/dsl/Visibility;Ljava/lang/String;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/bbva/cells/componentkit/model/dsl/Resource;Lcom/bbva/cells/componentkit/model/dsl/ResourceId;Ljava/lang/Boolean;Lcom/bbva/cells/componentkit/model/dsl/Visibility;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "componentkit_release"}, k = 1, mv = {1, 6, 0})
@Serializable
public final /* data */ class ViewSettings {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Resource backgroundColor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public ResourceId backgroundColorState;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Boolean enable;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Visibility visibility;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public String accessibilityLabel;

    /* JADX INFO: compiled from: Settings.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/bbva/cells/componentkit/model/dsl/ViewSettings$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/bbva/cells/componentkit/model/dsl/ViewSettings;", "componentkit_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<ViewSettings> serializer() {
            return ViewSettings$$serializer.INSTANCE;
        }
    }

    public ViewSettings() {
        this((Resource) null, (ResourceId) null, (Boolean) null, (Visibility) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ ViewSettings copy$default(ViewSettings viewSettings, Resource resource, ResourceId resourceId, Boolean bool, Visibility visibility, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            resource = viewSettings.backgroundColor;
        }
        if ((i10 & 2) != 0) {
            resourceId = viewSettings.backgroundColorState;
        }
        ResourceId resourceId2 = resourceId;
        if ((i10 & 4) != 0) {
            bool = viewSettings.enable;
        }
        Boolean bool2 = bool;
        if ((i10 & 8) != 0) {
            visibility = viewSettings.visibility;
        }
        Visibility visibility2 = visibility;
        if ((i10 & 16) != 0) {
            str = viewSettings.accessibilityLabel;
        }
        return viewSettings.copy(resource, resourceId2, bool2, visibility2, str);
    }

    @JvmStatic
    public static final void write$Self(@NotNull ViewSettings self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.backgroundColor != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, Resource$$serializer.INSTANCE, self.backgroundColor);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.backgroundColorState != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, ResourceId$$serializer.INSTANCE, self.backgroundColorState);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.enable != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, BooleanSerializer.INSTANCE, self.enable);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.visibility != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, Visibility$$serializer.INSTANCE, self.visibility);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 4) && self.accessibilityLabel == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.accessibilityLabel);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Resource getBackgroundColor() {
        return this.backgroundColor;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ResourceId getBackgroundColorState() {
        return this.backgroundColorState;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getEnable() {
        return this.enable;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Visibility getVisibility() {
        return this.visibility;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getAccessibilityLabel() {
        return this.accessibilityLabel;
    }

    @NotNull
    public final ViewSettings copy(@Nullable Resource backgroundColor, @Nullable ResourceId backgroundColorState, @Nullable Boolean enable, @Nullable Visibility visibility, @Nullable String accessibilityLabel) {
        return new ViewSettings(backgroundColor, backgroundColorState, enable, visibility, accessibilityLabel);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ViewSettings)) {
            return false;
        }
        ViewSettings viewSettings = (ViewSettings) other;
        return Intrinsics.areEqual(this.backgroundColor, viewSettings.backgroundColor) && Intrinsics.areEqual(this.backgroundColorState, viewSettings.backgroundColorState) && Intrinsics.areEqual(this.enable, viewSettings.enable) && this.visibility == viewSettings.visibility && Intrinsics.areEqual(this.accessibilityLabel, viewSettings.accessibilityLabel);
    }

    @Nullable
    public final String getAccessibilityLabel() {
        return this.accessibilityLabel;
    }

    @Nullable
    public final Resource getBackgroundColor() {
        return this.backgroundColor;
    }

    @Nullable
    public final ResourceId getBackgroundColorState() {
        return this.backgroundColorState;
    }

    @Nullable
    public final Boolean getEnable() {
        return this.enable;
    }

    @Nullable
    public final Visibility getVisibility() {
        return this.visibility;
    }

    public int hashCode() {
        Resource resource = this.backgroundColor;
        int iHashCode = (resource == null ? 0 : resource.hashCode()) * 31;
        ResourceId resourceId = this.backgroundColorState;
        int iHashCode2 = (iHashCode + (resourceId == null ? 0 : resourceId.hashCode())) * 31;
        Boolean bool = this.enable;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Visibility visibility = this.visibility;
        int iHashCode4 = (iHashCode3 + (visibility == null ? 0 : visibility.hashCode())) * 31;
        String str = this.accessibilityLabel;
        return iHashCode4 + (str != null ? str.hashCode() : 0);
    }

    public final void setAccessibilityLabel(@Nullable String str) {
        this.accessibilityLabel = str;
    }

    public final void setBackgroundColor(@Nullable Resource resource) {
        this.backgroundColor = resource;
    }

    public final void setBackgroundColorState(@Nullable ResourceId resourceId) {
        this.backgroundColorState = resourceId;
    }

    public final void setEnable(@Nullable Boolean bool) {
        this.enable = bool;
    }

    public final void setVisibility(@Nullable Visibility visibility) {
        this.visibility = visibility;
    }

    @NotNull
    public String toString() {
        return "ViewSettings(backgroundColor=" + this.backgroundColor + ", backgroundColorState=" + this.backgroundColorState + ", enable=" + this.enable + ", visibility=" + this.visibility + ", accessibilityLabel=" + ((Object) this.accessibilityLabel) + RootService.CLOSE_BRACKET;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ ViewSettings(int i10, Resource resource, ResourceId resourceId, Boolean bool, Visibility visibility, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i10 & 1) == 0) {
            this.backgroundColor = null;
        } else {
            this.backgroundColor = resource;
        }
        if ((i10 & 2) == 0) {
            this.backgroundColorState = null;
        } else {
            this.backgroundColorState = resourceId;
        }
        if ((i10 & 4) == 0) {
            this.enable = null;
        } else {
            this.enable = bool;
        }
        if ((i10 & 8) == 0) {
            this.visibility = null;
        } else {
            this.visibility = visibility;
        }
        if ((i10 & 16) == 0) {
            this.accessibilityLabel = null;
        } else {
            this.accessibilityLabel = str;
        }
    }

    public ViewSettings(@Nullable Resource resource, @Nullable ResourceId resourceId, @Nullable Boolean bool, @Nullable Visibility visibility, @Nullable String str) {
        this.backgroundColor = resource;
        this.backgroundColorState = resourceId;
        this.enable = bool;
        this.visibility = visibility;
        this.accessibilityLabel = str;
    }

    public /* synthetic */ ViewSettings(Resource resource, ResourceId resourceId, Boolean bool, Visibility visibility, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : resource, (i10 & 2) != 0 ? null : resourceId, (i10 & 4) != 0 ? null : bool, (i10 & 8) != 0 ? null : visibility, (i10 & 16) != 0 ? null : str);
    }
}
