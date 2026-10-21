package com.bbva.component.ui.message.link.model;

import com.bbva.androidtoolkit.utils.PluginUtils;
import com.bbva.cells.componentkit.model.dsl.ResourceId;
import com.bbva.cells.componentkit.model.dsl.ResourceId$$serializer;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: MessageLinkState.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002#\"B\u001b\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u001c\u0010\u001dB/\b\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u0011\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b\u001c\u0010!J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\u000b\u001a\u00020\tHÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\tHÆ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019¨\u0006$"}, d2 = {"Lcom/bbva/component/ui/message/link/model/MessageLinkBackground;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "Lcom/bbva/cells/componentkit/model/dsl/ResourceId;", "component1", "component2", "color", PluginUtils.IDENTIFIER_DRAWABLE, "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Lcom/bbva/cells/componentkit/model/dsl/ResourceId;", "getColor", "()Lcom/bbva/cells/componentkit/model/dsl/ResourceId;", "b", "getDrawable", "<init>", "(Lcom/bbva/cells/componentkit/model/dsl/ResourceId;Lcom/bbva/cells/componentkit/model/dsl/ResourceId;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/bbva/cells/componentkit/model/dsl/ResourceId;Lcom/bbva/cells/componentkit/model/dsl/ResourceId;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "component-ui-message-link_release"}, k = 1, mv = {1, 8, 0})
@Serializable
public final /* data */ class MessageLinkBackground {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ResourceId color;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ResourceId drawable;

    /* JADX INFO: compiled from: MessageLinkState.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/bbva/component/ui/message/link/model/MessageLinkBackground$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/bbva/component/ui/message/link/model/MessageLinkBackground;", "component-ui-message-link_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<MessageLinkBackground> serializer() {
            return MessageLinkBackground$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MessageLinkBackground() {
        this((ResourceId) null, (ResourceId) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ MessageLinkBackground copy$default(MessageLinkBackground messageLinkBackground, ResourceId resourceId, ResourceId resourceId2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            resourceId = messageLinkBackground.color;
        }
        if ((i10 & 2) != 0) {
            resourceId2 = messageLinkBackground.drawable;
        }
        return messageLinkBackground.copy(resourceId, resourceId2);
    }

    @JvmStatic
    public static final void write$Self(@NotNull MessageLinkBackground self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !Intrinsics.areEqual(self.color, new ResourceId((String) null, (Integer) null, 3, (DefaultConstructorMarker) null))) {
            output.encodeSerializableElement(serialDesc, 0, ResourceId$$serializer.INSTANCE, self.color);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 1) && Intrinsics.areEqual(self.drawable, new ResourceId((String) null, (Integer) null, 3, (DefaultConstructorMarker) null))) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 1, ResourceId$$serializer.INSTANCE, self.drawable);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ResourceId getColor() {
        return this.color;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ResourceId getDrawable() {
        return this.drawable;
    }

    @NotNull
    public final MessageLinkBackground copy(@NotNull ResourceId color, @NotNull ResourceId drawable) {
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        return new MessageLinkBackground(color, drawable);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageLinkBackground)) {
            return false;
        }
        MessageLinkBackground messageLinkBackground = (MessageLinkBackground) other;
        return Intrinsics.areEqual(this.color, messageLinkBackground.color) && Intrinsics.areEqual(this.drawable, messageLinkBackground.drawable);
    }

    @NotNull
    public final ResourceId getColor() {
        return this.color;
    }

    @NotNull
    public final ResourceId getDrawable() {
        return this.drawable;
    }

    public int hashCode() {
        return this.drawable.hashCode() + (this.color.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "MessageLinkBackground(color=" + this.color + ", drawable=" + this.drawable + RootService.CLOSE_BRACKET;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ MessageLinkBackground(int i10, ResourceId resourceId, ResourceId resourceId2, SerializationConstructorMarker serializationConstructorMarker) {
        this.color = (i10 & 1) == 0 ? new ResourceId((String) null, (Integer) null, 3, (DefaultConstructorMarker) null) : resourceId;
        if ((i10 & 2) == 0) {
            this.drawable = new ResourceId((String) null, (Integer) null, 3, (DefaultConstructorMarker) null);
        } else {
            this.drawable = resourceId2;
        }
    }

    public MessageLinkBackground(@NotNull ResourceId color, @NotNull ResourceId drawable) {
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        this.color = color;
        this.drawable = drawable;
    }

    public /* synthetic */ MessageLinkBackground(ResourceId resourceId, ResourceId resourceId2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new ResourceId((String) null, (Integer) null, 3, (DefaultConstructorMarker) null) : resourceId, (i10 & 2) != 0 ? new ResourceId((String) null, (Integer) null, 3, (DefaultConstructorMarker) null) : resourceId2);
    }
}
