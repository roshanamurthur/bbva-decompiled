package com.bbva.component.ui.message.card.model;

import ad.d;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.zoomauth.facialauth.constant.AuthConstants;
import com.google.android.gms.measurement.internal.a;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: MessageCardState.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 M2\u00020\u0001:\u0002NMB\u0081\u0001\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\f\u0012\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\f0\u000e\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\bG\u0010HB\u0085\u0001\b\u0017\u0012\u0006\u0010I\u001a\u00020\u001d\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\f\u0012\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000e\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010K\u001a\u0004\u0018\u00010J¢\u0006\u0004\bG\u0010LJ\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000eHÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0083\u0001\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00042\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\f2\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\f0\u000e2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\u001c\u001a\u00020\u0002HÖ\u0001J\t\u0010\u001e\u001a\u00020\u001dHÖ\u0001J\u0013\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J!\u0010(\u001a\u00020'2\u0006\u0010\"\u001a\u00020\u00002\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%HÇ\u0001R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b1\u0010*\u001a\u0004\b2\u0010,R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b7\u0010*\u001a\u0004\b8\u0010,R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b9\u0010*\u001a\u0004\b:\u0010,R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b;\u0010*\u001a\u0004\b<\u0010,R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\f0\u000e8\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bE\u0010*\u001a\u0004\bF\u0010,¨\u0006O"}, d2 = {"Lcom/bbva/component/ui/message/card/model/MessageCardState;", "", "", "component1", "Lcom/bbva/component/ui/message/card/model/TypeMessage;", "component2", "component3", "Lcom/bbva/component/ui/message/card/model/ImageSize;", "component4", "component5", "component6", "component7", "Lcom/bbva/component/ui/message/card/model/Button;", "component8", "", "component9", "component10", "id", "type", AuthConstants.IMAGE, "imageSize", "title", "primaryText", "secondaryText", "messageLink", "buttons", "closeButtonAccessibility", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "b", "Lcom/bbva/component/ui/message/card/model/TypeMessage;", "getType", "()Lcom/bbva/component/ui/message/card/model/TypeMessage;", "c", "getImage", "d", "Lcom/bbva/component/ui/message/card/model/ImageSize;", "getImageSize", "()Lcom/bbva/component/ui/message/card/model/ImageSize;", "e", "getTitle", "f", "getPrimaryText", "g", "getSecondaryText", "h", "Lcom/bbva/component/ui/message/card/model/Button;", "getMessageLink", "()Lcom/bbva/component/ui/message/card/model/Button;", "i", "Ljava/util/List;", "getButtons", "()Ljava/util/List;", "j", "getCloseButtonAccessibility", "<init>", "(Ljava/lang/String;Lcom/bbva/component/ui/message/card/model/TypeMessage;Ljava/lang/String;Lcom/bbva/component/ui/message/card/model/ImageSize;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/bbva/component/ui/message/card/model/Button;Ljava/util/List;Ljava/lang/String;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/bbva/component/ui/message/card/model/TypeMessage;Ljava/lang/String;Lcom/bbva/component/ui/message/card/model/ImageSize;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/bbva/component/ui/message/card/model/Button;Ljava/util/List;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "component-ui-message-card_release"}, k = 1, mv = {1, 8, 0})
@Serializable
public final /* data */ class MessageCardState {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TypeMessage type;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String image;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final ImageSize imageSize;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String title;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String primaryText;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String secondaryText;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Button messageLink;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<Button> buttons;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String closeButtonAccessibility;

    /* JADX INFO: compiled from: MessageCardState.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/bbva/component/ui/message/card/model/MessageCardState$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/bbva/component/ui/message/card/model/MessageCardState;", "component-ui-message-card_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<MessageCardState> serializer() {
            return MessageCardState$$serializer.INSTANCE;
        }
    }

    public MessageCardState() {
        this((String) null, (TypeMessage) null, (String) null, (ImageSize) null, (String) null, (String) null, (String) null, (Button) null, (List) null, (String) null, 1023, (DefaultConstructorMarker) null);
    }

    @JvmStatic
    public static final void write$Self(@NotNull MessageCardState self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.id != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.id);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.type != TypeMessage.MESSAGE) {
            output.encodeSerializableElement(serialDesc, 1, EnumsKt.createSimpleEnumSerializer("com.bbva.component.ui.message.card.model.TypeMessage", TypeMessage.values()), self.type);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.image != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.image);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.imageSize != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, EnumsKt.createSimpleEnumSerializer("com.bbva.component.ui.message.card.model.ImageSize", ImageSize.values()), self.imageSize);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.title != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.title);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.primaryText != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, self.primaryText);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.secondaryText != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, StringSerializer.INSTANCE, self.secondaryText);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.messageLink != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, Button$$serializer.INSTANCE, self.messageLink);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || !Intrinsics.areEqual(self.buttons, CollectionsKt__CollectionsKt.emptyList())) {
            output.encodeSerializableElement(serialDesc, 8, new ArrayListSerializer(Button$$serializer.INSTANCE), self.buttons);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 9) && self.closeButtonAccessibility == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 9, StringSerializer.INSTANCE, self.closeButtonAccessibility);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getCloseButtonAccessibility() {
        return this.closeButtonAccessibility;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TypeMessage getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final ImageSize getImageSize() {
        return this.imageSize;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getPrimaryText() {
        return this.primaryText;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getSecondaryText() {
        return this.secondaryText;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Button getMessageLink() {
        return this.messageLink;
    }

    @NotNull
    public final List<Button> component9() {
        return this.buttons;
    }

    @NotNull
    public final MessageCardState copy(@Nullable String id, @NotNull TypeMessage type, @Nullable String image, @Nullable ImageSize imageSize, @Nullable String title, @Nullable String primaryText, @Nullable String secondaryText, @Nullable Button messageLink, @NotNull List<Button> buttons, @Nullable String closeButtonAccessibility) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        return new MessageCardState(id, type, image, imageSize, title, primaryText, secondaryText, messageLink, buttons, closeButtonAccessibility);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageCardState)) {
            return false;
        }
        MessageCardState messageCardState = (MessageCardState) other;
        return Intrinsics.areEqual(this.id, messageCardState.id) && this.type == messageCardState.type && Intrinsics.areEqual(this.image, messageCardState.image) && this.imageSize == messageCardState.imageSize && Intrinsics.areEqual(this.title, messageCardState.title) && Intrinsics.areEqual(this.primaryText, messageCardState.primaryText) && Intrinsics.areEqual(this.secondaryText, messageCardState.secondaryText) && Intrinsics.areEqual(this.messageLink, messageCardState.messageLink) && Intrinsics.areEqual(this.buttons, messageCardState.buttons) && Intrinsics.areEqual(this.closeButtonAccessibility, messageCardState.closeButtonAccessibility);
    }

    @NotNull
    public final List<Button> getButtons() {
        return this.buttons;
    }

    @Nullable
    public final String getCloseButtonAccessibility() {
        return this.closeButtonAccessibility;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getImage() {
        return this.image;
    }

    @Nullable
    public final ImageSize getImageSize() {
        return this.imageSize;
    }

    @Nullable
    public final Button getMessageLink() {
        return this.messageLink;
    }

    @Nullable
    public final String getPrimaryText() {
        return this.primaryText;
    }

    @Nullable
    public final String getSecondaryText() {
        return this.secondaryText;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final TypeMessage getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (this.type.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
        String str2 = this.image;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        ImageSize imageSize = this.imageSize;
        int iHashCode3 = (iHashCode2 + (imageSize == null ? 0 : imageSize.hashCode())) * 31;
        String str3 = this.title;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.primaryText;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.secondaryText;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Button button = this.messageLink;
        int iA = a.a(this.buttons, (iHashCode6 + (button == null ? 0 : button.hashCode())) * 31, 31);
        String str6 = this.closeButtonAccessibility;
        return iA + (str6 != null ? str6.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("MessageCardState(id=");
        sb2.append(this.id);
        sb2.append(", type=");
        sb2.append(this.type);
        sb2.append(", image=");
        sb2.append(this.image);
        sb2.append(", imageSize=");
        sb2.append(this.imageSize);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", primaryText=");
        sb2.append(this.primaryText);
        sb2.append(", secondaryText=");
        sb2.append(this.secondaryText);
        sb2.append(", messageLink=");
        sb2.append(this.messageLink);
        sb2.append(", buttons=");
        sb2.append(this.buttons);
        sb2.append(", closeButtonAccessibility=");
        return d.f(sb2, this.closeButtonAccessibility, ")");
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ MessageCardState(int i10, String str, TypeMessage typeMessage, String str2, ImageSize imageSize, String str3, String str4, String str5, Button button, List list, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i10 & 1) == 0) {
            this.id = null;
        } else {
            this.id = str;
        }
        if ((i10 & 2) == 0) {
            this.type = TypeMessage.MESSAGE;
        } else {
            this.type = typeMessage;
        }
        if ((i10 & 4) == 0) {
            this.image = null;
        } else {
            this.image = str2;
        }
        if ((i10 & 8) == 0) {
            this.imageSize = null;
        } else {
            this.imageSize = imageSize;
        }
        if ((i10 & 16) == 0) {
            this.title = null;
        } else {
            this.title = str3;
        }
        if ((i10 & 32) == 0) {
            this.primaryText = null;
        } else {
            this.primaryText = str4;
        }
        if ((i10 & 64) == 0) {
            this.secondaryText = null;
        } else {
            this.secondaryText = str5;
        }
        if ((i10 & 128) == 0) {
            this.messageLink = null;
        } else {
            this.messageLink = button;
        }
        if ((i10 & 256) == 0) {
            this.buttons = CollectionsKt__CollectionsKt.emptyList();
        } else {
            this.buttons = list;
        }
        if ((i10 & 512) == 0) {
            this.closeButtonAccessibility = null;
        } else {
            this.closeButtonAccessibility = str6;
        }
    }

    public MessageCardState(@Nullable String str, @NotNull TypeMessage type, @Nullable String str2, @Nullable ImageSize imageSize, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Button button, @NotNull List<Button> buttons, @Nullable String str6) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        this.id = str;
        this.type = type;
        this.image = str2;
        this.imageSize = imageSize;
        this.title = str3;
        this.primaryText = str4;
        this.secondaryText = str5;
        this.messageLink = button;
        this.buttons = buttons;
        this.closeButtonAccessibility = str6;
    }

    public /* synthetic */ MessageCardState(String str, TypeMessage typeMessage, String str2, ImageSize imageSize, String str3, String str4, String str5, Button button, List list, String str6, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? TypeMessage.MESSAGE : typeMessage, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? null : imageSize, (i10 & 16) != 0 ? null : str3, (i10 & 32) != 0 ? null : str4, (i10 & 64) != 0 ? null : str5, (i10 & 128) != 0 ? null : button, (i10 & 256) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i10 & 512) == 0 ? str6 : null);
    }
}
