package com.bbva.cells.componentkit.model.dsl;

import com.bbva.cells.component.kit.ui.property.impl.image.ImageScaleTypeHandler;
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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Settings.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 :2\u00020\u0001:\u0002;:B7\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b4\u00105BC\b\u0017\u0012\u0006\u00106\u001a\u00020\u0017\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u000f\u0012\b\u00108\u001a\u0004\u0018\u000107¢\u0006\u0004\b4\u00109J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0003J9\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000fHÆ\u0001J\t\u0010\u0016\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0018\u001a\u00020\u0017HÖ\u0001J\u0013\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003R$\u0010\u0011\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010\u0012\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R$\u0010\u0013\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R$\u0010\u0014\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103¨\u0006<"}, d2 = {"Lcom/bbva/cells/componentkit/model/dsl/ImageSettings;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "Lcom/bbva/cells/componentkit/model/dsl/ViewSettings;", "component1", "Lcom/bbva/cells/componentkit/model/dsl/Scale;", "component2", "Lcom/bbva/cells/componentkit/model/dsl/ResourceId;", "component3", "", "component4", "view", ImageScaleTypeHandler.ID, "source", "url", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Lcom/bbva/cells/componentkit/model/dsl/ViewSettings;", "getView", "()Lcom/bbva/cells/componentkit/model/dsl/ViewSettings;", "setView", "(Lcom/bbva/cells/componentkit/model/dsl/ViewSettings;)V", "b", "Lcom/bbva/cells/componentkit/model/dsl/Scale;", "getScale", "()Lcom/bbva/cells/componentkit/model/dsl/Scale;", "setScale", "(Lcom/bbva/cells/componentkit/model/dsl/Scale;)V", "c", "Lcom/bbva/cells/componentkit/model/dsl/ResourceId;", "getSource", "()Lcom/bbva/cells/componentkit/model/dsl/ResourceId;", "setSource", "(Lcom/bbva/cells/componentkit/model/dsl/ResourceId;)V", "d", "Ljava/lang/String;", "getUrl", "()Ljava/lang/String;", "setUrl", "(Ljava/lang/String;)V", "<init>", "(Lcom/bbva/cells/componentkit/model/dsl/ViewSettings;Lcom/bbva/cells/componentkit/model/dsl/Scale;Lcom/bbva/cells/componentkit/model/dsl/ResourceId;Ljava/lang/String;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/bbva/cells/componentkit/model/dsl/ViewSettings;Lcom/bbva/cells/componentkit/model/dsl/Scale;Lcom/bbva/cells/componentkit/model/dsl/ResourceId;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "componentkit_release"}, k = 1, mv = {1, 6, 0})
@Serializable
public final /* data */ class ImageSettings {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public ViewSettings view;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Scale scale;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public ResourceId source;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public String url;

    /* JADX INFO: compiled from: Settings.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/bbva/cells/componentkit/model/dsl/ImageSettings$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/bbva/cells/componentkit/model/dsl/ImageSettings;", "componentkit_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<ImageSettings> serializer() {
            return ImageSettings$$serializer.INSTANCE;
        }
    }

    public ImageSettings() {
        this((ViewSettings) null, (Scale) null, (ResourceId) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ ImageSettings copy$default(ImageSettings imageSettings, ViewSettings viewSettings, Scale scale, ResourceId resourceId, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            viewSettings = imageSettings.view;
        }
        if ((i10 & 2) != 0) {
            scale = imageSettings.scale;
        }
        if ((i10 & 4) != 0) {
            resourceId = imageSettings.source;
        }
        if ((i10 & 8) != 0) {
            str = imageSettings.url;
        }
        return imageSettings.copy(viewSettings, scale, resourceId, str);
    }

    @JvmStatic
    public static final void write$Self(@NotNull ImageSettings self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.view != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, ViewSettings$$serializer.INSTANCE, self.view);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.scale != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, Scale$$serializer.INSTANCE, self.scale);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.source != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, ResourceId$$serializer.INSTANCE, self.source);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 3) && self.url == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.url);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ViewSettings getView() {
        return this.view;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Scale getScale() {
        return this.scale;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ResourceId getSource() {
        return this.source;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    public final ImageSettings copy(@Nullable ViewSettings view, @Nullable Scale scale, @Nullable ResourceId source, @Nullable String url) {
        return new ImageSettings(view, scale, source, url);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImageSettings)) {
            return false;
        }
        ImageSettings imageSettings = (ImageSettings) other;
        return Intrinsics.areEqual(this.view, imageSettings.view) && this.scale == imageSettings.scale && Intrinsics.areEqual(this.source, imageSettings.source) && Intrinsics.areEqual(this.url, imageSettings.url);
    }

    @Nullable
    public final Scale getScale() {
        return this.scale;
    }

    @Nullable
    public final ResourceId getSource() {
        return this.source;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    @Nullable
    public final ViewSettings getView() {
        return this.view;
    }

    public int hashCode() {
        ViewSettings viewSettings = this.view;
        int iHashCode = (viewSettings == null ? 0 : viewSettings.hashCode()) * 31;
        Scale scale = this.scale;
        int iHashCode2 = (iHashCode + (scale == null ? 0 : scale.hashCode())) * 31;
        ResourceId resourceId = this.source;
        int iHashCode3 = (iHashCode2 + (resourceId == null ? 0 : resourceId.hashCode())) * 31;
        String str = this.url;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final void setScale(@Nullable Scale scale) {
        this.scale = scale;
    }

    public final void setSource(@Nullable ResourceId resourceId) {
        this.source = resourceId;
    }

    public final void setUrl(@Nullable String str) {
        this.url = str;
    }

    public final void setView(@Nullable ViewSettings viewSettings) {
        this.view = viewSettings;
    }

    @NotNull
    public String toString() {
        return "ImageSettings(view=" + this.view + ", scale=" + this.scale + ", source=" + this.source + ", url=" + ((Object) this.url) + RootService.CLOSE_BRACKET;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ ImageSettings(int i10, ViewSettings viewSettings, Scale scale, ResourceId resourceId, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i10 & 1) == 0) {
            this.view = null;
        } else {
            this.view = viewSettings;
        }
        if ((i10 & 2) == 0) {
            this.scale = null;
        } else {
            this.scale = scale;
        }
        if ((i10 & 4) == 0) {
            this.source = null;
        } else {
            this.source = resourceId;
        }
        if ((i10 & 8) == 0) {
            this.url = null;
        } else {
            this.url = str;
        }
    }

    public ImageSettings(@Nullable ViewSettings viewSettings, @Nullable Scale scale, @Nullable ResourceId resourceId, @Nullable String str) {
        this.view = viewSettings;
        this.scale = scale;
        this.source = resourceId;
        this.url = str;
    }

    public /* synthetic */ ImageSettings(ViewSettings viewSettings, Scale scale, ResourceId resourceId, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : viewSettings, (i10 & 2) != 0 ? null : scale, (i10 & 4) != 0 ? null : resourceId, (i10 & 8) != 0 ? null : str);
    }
}
