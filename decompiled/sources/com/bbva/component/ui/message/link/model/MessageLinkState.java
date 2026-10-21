package com.bbva.component.ui.message.link.model;

import com.bbva.cells.componentkit.model.dsl.ImageSettings;
import com.bbva.cells.componentkit.model.dsl.ImageSettings$$serializer;
import com.bbva.cells.componentkit.model.dsl.TextSettings;
import com.bbva.cells.componentkit.model.dsl.TextSettings$$serializer;
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
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: MessageLinkState.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000243B+\u0012\u0006\u0010\u0011\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b-\u0010.BC\b\u0017\u0012\u0006\u0010/\u001a\u00020\u0018\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u000f\u0012\b\u00101\u001a\u0004\u0018\u000100¢\u0006\u0004\b-\u00102J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0003J\t\u0010\u0010\u001a\u00020\u000fHÆ\u0003J3\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0014\u001a\u00020\u000fHÆ\u0001J\t\u0010\u0017\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0018HÖ\u0001J\u0013\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0011\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0012\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,¨\u00065"}, d2 = {"Lcom/bbva/component/ui/message/link/model/MessageLinkState;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "Lcom/bbva/cells/componentkit/model/dsl/ImageSettings;", "component1", "Lcom/bbva/cells/componentkit/model/dsl/TextSettings;", "component2", "Lcom/bbva/component/ui/message/link/model/MessageLinkBackground;", "component3", "Lcom/bbva/component/ui/message/link/model/MessageLinkButton;", "component4", "icon", "label", "background", "button", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Lcom/bbva/cells/componentkit/model/dsl/ImageSettings;", "getIcon", "()Lcom/bbva/cells/componentkit/model/dsl/ImageSettings;", "b", "Lcom/bbva/cells/componentkit/model/dsl/TextSettings;", "getLabel", "()Lcom/bbva/cells/componentkit/model/dsl/TextSettings;", "c", "Lcom/bbva/component/ui/message/link/model/MessageLinkBackground;", "getBackground", "()Lcom/bbva/component/ui/message/link/model/MessageLinkBackground;", "d", "Lcom/bbva/component/ui/message/link/model/MessageLinkButton;", "getButton", "()Lcom/bbva/component/ui/message/link/model/MessageLinkButton;", "<init>", "(Lcom/bbva/cells/componentkit/model/dsl/ImageSettings;Lcom/bbva/cells/componentkit/model/dsl/TextSettings;Lcom/bbva/component/ui/message/link/model/MessageLinkBackground;Lcom/bbva/component/ui/message/link/model/MessageLinkButton;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/bbva/cells/componentkit/model/dsl/ImageSettings;Lcom/bbva/cells/componentkit/model/dsl/TextSettings;Lcom/bbva/component/ui/message/link/model/MessageLinkBackground;Lcom/bbva/component/ui/message/link/model/MessageLinkButton;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "component-ui-message-link_release"}, k = 1, mv = {1, 8, 0})
@Serializable
public final /* data */ class MessageLinkState {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ImageSettings icon;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TextSettings label;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final MessageLinkBackground background;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MessageLinkButton button;

    /* JADX INFO: compiled from: MessageLinkState.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/bbva/component/ui/message/link/model/MessageLinkState$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/bbva/component/ui/message/link/model/MessageLinkState;", "component-ui-message-link_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<MessageLinkState> serializer() {
            return MessageLinkState$$serializer.INSTANCE;
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ MessageLinkState(int i10, ImageSettings imageSettings, TextSettings textSettings, MessageLinkBackground messageLinkBackground, MessageLinkButton messageLinkButton, SerializationConstructorMarker serializationConstructorMarker) {
        if (11 != (i10 & 11)) {
            PluginExceptionsKt.throwMissingFieldException(i10, 11, MessageLinkState$$serializer.INSTANCE.getDescriptor());
        }
        this.icon = imageSettings;
        this.label = textSettings;
        if ((i10 & 4) == 0) {
            this.background = null;
        } else {
            this.background = messageLinkBackground;
        }
        this.button = messageLinkButton;
    }

    public static /* synthetic */ MessageLinkState copy$default(MessageLinkState messageLinkState, ImageSettings imageSettings, TextSettings textSettings, MessageLinkBackground messageLinkBackground, MessageLinkButton messageLinkButton, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            imageSettings = messageLinkState.icon;
        }
        if ((i10 & 2) != 0) {
            textSettings = messageLinkState.label;
        }
        if ((i10 & 4) != 0) {
            messageLinkBackground = messageLinkState.background;
        }
        if ((i10 & 8) != 0) {
            messageLinkButton = messageLinkState.button;
        }
        return messageLinkState.copy(imageSettings, textSettings, messageLinkBackground, messageLinkButton);
    }

    @JvmStatic
    public static final void write$Self(@NotNull MessageLinkState self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        output.encodeSerializableElement(serialDesc, 0, ImageSettings$$serializer.INSTANCE, self.icon);
        output.encodeSerializableElement(serialDesc, 1, TextSettings$$serializer.INSTANCE, self.label);
        boolean zShouldEncodeElementDefault = output.shouldEncodeElementDefault(serialDesc, 2);
        MessageLinkBackground messageLinkBackground = self.background;
        if (zShouldEncodeElementDefault || messageLinkBackground != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, MessageLinkBackground$$serializer.INSTANCE, messageLinkBackground);
        }
        output.encodeSerializableElement(serialDesc, 3, MessageLinkButton$$serializer.INSTANCE, self.button);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ImageSettings getIcon() {
        return this.icon;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TextSettings getLabel() {
        return this.label;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final MessageLinkBackground getBackground() {
        return this.background;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final MessageLinkButton getButton() {
        return this.button;
    }

    @NotNull
    public final MessageLinkState copy(@NotNull ImageSettings icon, @NotNull TextSettings label, @Nullable MessageLinkBackground background, @NotNull MessageLinkButton button) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(button, "button");
        return new MessageLinkState(icon, label, background, button);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageLinkState)) {
            return false;
        }
        MessageLinkState messageLinkState = (MessageLinkState) other;
        return Intrinsics.areEqual(this.icon, messageLinkState.icon) && Intrinsics.areEqual(this.label, messageLinkState.label) && Intrinsics.areEqual(this.background, messageLinkState.background) && Intrinsics.areEqual(this.button, messageLinkState.button);
    }

    @Nullable
    public final MessageLinkBackground getBackground() {
        return this.background;
    }

    @NotNull
    public final MessageLinkButton getButton() {
        return this.button;
    }

    @NotNull
    public final ImageSettings getIcon() {
        return this.icon;
    }

    @NotNull
    public final TextSettings getLabel() {
        return this.label;
    }

    public int hashCode() {
        int iHashCode = (this.label.hashCode() + (this.icon.hashCode() * 31)) * 31;
        MessageLinkBackground messageLinkBackground = this.background;
        return this.button.hashCode() + ((iHashCode + (messageLinkBackground == null ? 0 : messageLinkBackground.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        return "MessageLinkState(icon=" + this.icon + ", label=" + this.label + ", background=" + this.background + ", button=" + this.button + RootService.CLOSE_BRACKET;
    }

    public MessageLinkState(@NotNull ImageSettings icon, @NotNull TextSettings label, @Nullable MessageLinkBackground messageLinkBackground, @NotNull MessageLinkButton button) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(button, "button");
        this.icon = icon;
        this.label = label;
        this.background = messageLinkBackground;
        this.button = button;
    }

    public /* synthetic */ MessageLinkState(ImageSettings imageSettings, TextSettings textSettings, MessageLinkBackground messageLinkBackground, MessageLinkButton messageLinkButton, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(imageSettings, textSettings, (i10 & 4) != 0 ? null : messageLinkBackground, messageLinkButton);
    }
}
