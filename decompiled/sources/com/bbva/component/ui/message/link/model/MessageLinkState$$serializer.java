package com.bbva.component.ui.message.link.model;

import com.bbva.cells.componentkit.model.dsl.ImageSettings;
import com.bbva.cells.componentkit.model.dsl.ImageSettings$$serializer;
import com.bbva.cells.componentkit.model.dsl.TextSettings;
import com.bbva.cells.componentkit.model.dsl.TextSettings$$serializer;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: MessageLinkState.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"com/bbva/component/ui/message/link/model/MessageLinkState.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/bbva/component/ui/message/link/model/MessageLinkState;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "component-ui-message-link_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
public final class MessageLinkState$$serializer implements GeneratedSerializer<MessageLinkState> {

    @NotNull
    public static final MessageLinkState$$serializer INSTANCE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f28671a;

    static {
        MessageLinkState$$serializer messageLinkState$$serializer = new MessageLinkState$$serializer();
        INSTANCE = messageLinkState$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.bbva.component.ui.message.link.model.MessageLinkState", messageLinkState$$serializer, 4);
        pluginGeneratedSerialDescriptor.addElement("icon", false);
        pluginGeneratedSerialDescriptor.addElement("label", false);
        pluginGeneratedSerialDescriptor.addElement("background", true);
        pluginGeneratedSerialDescriptor.addElement("button", false);
        f28671a = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{ImageSettings$$serializer.INSTANCE, TextSettings$$serializer.INSTANCE, BuiltinSerializersKt.getNullable(MessageLinkBackground$$serializer.INSTANCE), MessageLinkButton$$serializer.INSTANCE};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public MessageLinkState deserialize(@NotNull Decoder decoder) {
        Object objDecodeSerializableElement;
        Object objDecodeNullableSerializableElement;
        Object objDecodeSerializableElement2;
        int i10;
        Object objDecodeSerializableElement3;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor);
        Object objDecodeSerializableElement4 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            objDecodeSerializableElement3 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 0, ImageSettings$$serializer.INSTANCE, null);
            objDecodeSerializableElement = compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 1, TextSettings$$serializer.INSTANCE, null);
            objDecodeNullableSerializableElement = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 2, MessageLinkBackground$$serializer.INSTANCE, null);
            objDecodeSerializableElement2 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 3, MessageLinkButton$$serializer.INSTANCE, null);
            i10 = 15;
        } else {
            boolean z10 = true;
            int i11 = 0;
            Object objDecodeSerializableElement5 = null;
            Object objDecodeNullableSerializableElement2 = null;
            Object objDecodeSerializableElement6 = null;
            while (z10) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor);
                if (iDecodeElementIndex == -1) {
                    z10 = false;
                } else if (iDecodeElementIndex == 0) {
                    objDecodeSerializableElement4 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 0, ImageSettings$$serializer.INSTANCE, objDecodeSerializableElement4);
                    i11 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    objDecodeSerializableElement5 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 1, TextSettings$$serializer.INSTANCE, objDecodeSerializableElement5);
                    i11 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    objDecodeNullableSerializableElement2 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 2, MessageLinkBackground$$serializer.INSTANCE, objDecodeNullableSerializableElement2);
                    i11 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    objDecodeSerializableElement6 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 3, MessageLinkButton$$serializer.INSTANCE, objDecodeSerializableElement6);
                    i11 |= 8;
                }
            }
            objDecodeSerializableElement = objDecodeSerializableElement5;
            objDecodeNullableSerializableElement = objDecodeNullableSerializableElement2;
            objDecodeSerializableElement2 = objDecodeSerializableElement6;
            Object obj = objDecodeSerializableElement4;
            i10 = i11;
            objDecodeSerializableElement3 = obj;
        }
        compositeDecoderBeginStructure.endStructure(descriptor);
        return new MessageLinkState(i10, (ImageSettings) objDecodeSerializableElement3, (TextSettings) objDecodeSerializableElement, (MessageLinkBackground) objDecodeNullableSerializableElement, (MessageLinkButton) objDecodeSerializableElement2, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    @NotNull
    public SerialDescriptor getDescriptor() {
        return f28671a;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(@NotNull Encoder encoder, @NotNull MessageLinkState value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor);
        MessageLinkState.write$Self(value, compositeEncoderBeginStructure, descriptor);
        compositeEncoderBeginStructure.endStructure(descriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
