package com.bbva.component.ui.landing.access.model;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bbva.androidtoolkit.utils.PluginUtils;
import com.bbva.cells.componentkit.model.dsl.ResourceId;
import com.bbva.cells.componentkit.model.dsl.ResourceId$$serializer;
import com.bbva.cells.componentkit.model.dsl.TextSettings;
import com.bbva.cells.componentkit.model.dsl.TextSettings$$serializer;
import com.bbva.cells.componentkit.resource.ResourceStringKt;
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

/* JADX INFO: compiled from: LandingAccessConfiguration.kt */
/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000210B!\u0012\u0006\u0010\u0015\u001a\u00020\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0013¢\u0006\u0004\b*\u0010+B9\b\u0011\u0012\u0006\u0010,\u001a\u00020\r\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010.\u001a\u0004\u0018\u00010-¢\u0006\u0004\b*\u0010/J(\u0010\n\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÁ\u0001¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bJ\t\u0010\u0010\u001a\u00020\u000fHÆ\u0003J\t\u0010\u0012\u001a\u00020\u0011HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0013HÆ\u0003J'\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u000f2\b\b\u0002\u0010\u0016\u001a\u00020\u00112\b\b\u0002\u0010\u0017\u001a\u00020\u0013HÆ\u0001J\t\u0010\u0019\u001a\u00020\u000fHÖ\u0001J\t\u0010\u001a\u001a\u00020\rHÖ\u0001J\u0013\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0015\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0016\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0017\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u00062"}, d2 = {"Lcom/bbva/component/ui/landing/access/model/LandingAccessLink;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$component_ui_landing_access_release", "(Lcom/bbva/component/ui/landing/access/model/LandingAccessLink;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Landroid/content/Context;", "context", "", "getDrawableId", "", "component1", "Lcom/bbva/cells/componentkit/model/dsl/TextSettings;", "component2", "Lcom/bbva/cells/componentkit/model/dsl/ResourceId;", "component3", "id", "label", PluginUtils.IDENTIFIER_DRAWABLE, "copy", "toString", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "b", "Lcom/bbva/cells/componentkit/model/dsl/TextSettings;", "getLabel", "()Lcom/bbva/cells/componentkit/model/dsl/TextSettings;", "c", "Lcom/bbva/cells/componentkit/model/dsl/ResourceId;", "getDrawable", "()Lcom/bbva/cells/componentkit/model/dsl/ResourceId;", "<init>", "(Ljava/lang/String;Lcom/bbva/cells/componentkit/model/dsl/TextSettings;Lcom/bbva/cells/componentkit/model/dsl/ResourceId;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/bbva/cells/componentkit/model/dsl/TextSettings;Lcom/bbva/cells/componentkit/model/dsl/ResourceId;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "component-ui-landing-access_release"}, k = 1, mv = {1, 9, 0})
@Serializable
public final /* data */ class LandingAccessLink {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TextSettings label;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ResourceId drawable;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: compiled from: LandingAccessConfiguration.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/bbva/component/ui/landing/access/model/LandingAccessLink$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/bbva/component/ui/landing/access/model/LandingAccessLink;", "component-ui-landing-access_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<LandingAccessLink> serializer() {
            return LandingAccessLink$$serializer.INSTANCE;
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ LandingAccessLink(int i10, String str, TextSettings textSettings, ResourceId resourceId, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i10 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i10, 3, LandingAccessLink$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.label = textSettings;
        if ((i10 & 4) == 0) {
            this.drawable = new ResourceId((String) null, (Integer) null, 3, (DefaultConstructorMarker) null);
        } else {
            this.drawable = resourceId;
        }
    }

    public static /* synthetic */ LandingAccessLink copy$default(LandingAccessLink landingAccessLink, String str, TextSettings textSettings, ResourceId resourceId, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = landingAccessLink.id;
        }
        if ((i10 & 2) != 0) {
            textSettings = landingAccessLink.label;
        }
        if ((i10 & 4) != 0) {
            resourceId = landingAccessLink.drawable;
        }
        return landingAccessLink.copy(str, textSettings, resourceId);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$component_ui_landing_access_release(LandingAccessLink self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.id);
        output.encodeSerializableElement(serialDesc, 1, TextSettings$$serializer.INSTANCE, self.label);
        boolean zShouldEncodeElementDefault = output.shouldEncodeElementDefault(serialDesc, 2);
        ResourceId resourceId = self.drawable;
        if (!zShouldEncodeElementDefault && Intrinsics.areEqual(resourceId, new ResourceId((String) null, (Integer) null, 3, (DefaultConstructorMarker) null))) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 2, ResourceId$$serializer.INSTANCE, resourceId);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TextSettings getLabel() {
        return this.label;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ResourceId getDrawable() {
        return this.drawable;
    }

    @NotNull
    public final LandingAccessLink copy(@NotNull String id, @NotNull TextSettings label, @NotNull ResourceId drawable) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        return new LandingAccessLink(id, label, drawable);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LandingAccessLink)) {
            return false;
        }
        LandingAccessLink landingAccessLink = (LandingAccessLink) other;
        return Intrinsics.areEqual(this.id, landingAccessLink.id) && Intrinsics.areEqual(this.label, landingAccessLink.label) && Intrinsics.areEqual(this.drawable, landingAccessLink.drawable);
    }

    @NotNull
    public final ResourceId getDrawable() {
        return this.drawable;
    }

    public final int getDrawableId(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ResourceId resourceId = this.drawable;
        if (resourceId.getAndroidId() != null) {
            Integer androidId = resourceId.getAndroidId();
            Intrinsics.checkNotNull(androidId);
            return androidId.intValue();
        }
        if (resourceId.getValue() == null) {
            return 0;
        }
        String value = resourceId.getValue();
        Intrinsics.checkNotNull(value);
        return ResourceStringKt.toDrawableId(value, context);
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final TextSettings getLabel() {
        return this.label;
    }

    public int hashCode() {
        return this.drawable.hashCode() + ((this.label.hashCode() + (this.id.hashCode() * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "LandingAccessLink(id=" + this.id + ", label=" + this.label + ", drawable=" + this.drawable + ")";
    }

    public LandingAccessLink(@NotNull String id, @NotNull TextSettings label, @NotNull ResourceId drawable) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        this.id = id;
        this.label = label;
        this.drawable = drawable;
    }

    public /* synthetic */ LandingAccessLink(String str, TextSettings textSettings, ResourceId resourceId, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, textSettings, (i10 & 4) != 0 ? new ResourceId((String) null, (Integer) null, 3, (DefaultConstructorMarker) null) : resourceId);
    }
}
