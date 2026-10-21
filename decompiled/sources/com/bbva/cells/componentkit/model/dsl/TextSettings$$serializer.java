package com.bbva.cells.componentkit.model.dsl;

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

/* JADX INFO: compiled from: Settings.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"com/bbva/cells/componentkit/model/dsl/TextSettings.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/bbva/cells/componentkit/model/dsl/TextSettings;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "componentkit_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
public final class TextSettings$$serializer implements GeneratedSerializer<TextSettings> {

    @NotNull
    public static final TextSettings$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        TextSettings$$serializer textSettings$$serializer = new TextSettings$$serializer();
        INSTANCE = textSettings$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.bbva.cells.componentkit.model.dsl.TextSettings", textSettings$$serializer, 10);
        pluginGeneratedSerialDescriptor.addElement("view", true);
        pluginGeneratedSerialDescriptor.addElement("text", true);
        pluginGeneratedSerialDescriptor.addElement("hint", true);
        pluginGeneratedSerialDescriptor.addElement("input", true);
        pluginGeneratedSerialDescriptor.addElement("color", true);
        pluginGeneratedSerialDescriptor.addElement("colorState", true);
        pluginGeneratedSerialDescriptor.addElement("font", true);
        pluginGeneratedSerialDescriptor.addElement("hintColor", true);
        pluginGeneratedSerialDescriptor.addElement("hintColorState", true);
        pluginGeneratedSerialDescriptor.addElement("size", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public KSerializer<?>[] childSerializers() {
        Resource$$serializer resource$$serializer = Resource$$serializer.INSTANCE;
        ResourceId$$serializer resourceId$$serializer = ResourceId$$serializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(ViewSettings$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(resource$$serializer), BuiltinSerializersKt.getNullable(resource$$serializer), BuiltinSerializersKt.getNullable(InputType$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(resource$$serializer), BuiltinSerializersKt.getNullable(resourceId$$serializer), BuiltinSerializersKt.getNullable(resourceId$$serializer), BuiltinSerializersKt.getNullable(resource$$serializer), BuiltinSerializersKt.getNullable(resourceId$$serializer), BuiltinSerializersKt.getNullable(Dimension$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public TextSettings deserialize(@NotNull Decoder decoder) {
        Object objDecodeNullableSerializableElement;
        Object objDecodeNullableSerializableElement2;
        Object objDecodeNullableSerializableElement3;
        Object objDecodeNullableSerializableElement4;
        Object objDecodeNullableSerializableElement5;
        Object objDecodeNullableSerializableElement6;
        Object objDecodeNullableSerializableElement7;
        Object objDecodeNullableSerializableElement8;
        Object objDecodeNullableSerializableElement9;
        int i10;
        Object objDecodeNullableSerializableElement10;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor2);
        int i11 = 9;
        Object objDecodeNullableSerializableElement11 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            objDecodeNullableSerializableElement10 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 0, ViewSettings$$serializer.INSTANCE, null);
            Resource$$serializer resource$$serializer = Resource$$serializer.INSTANCE;
            objDecodeNullableSerializableElement8 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 1, resource$$serializer, null);
            objDecodeNullableSerializableElement9 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 2, resource$$serializer, null);
            objDecodeNullableSerializableElement7 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 3, InputType$$serializer.INSTANCE, null);
            objDecodeNullableSerializableElement6 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 4, resource$$serializer, null);
            ResourceId$$serializer resourceId$$serializer = ResourceId$$serializer.INSTANCE;
            objDecodeNullableSerializableElement5 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 5, resourceId$$serializer, null);
            objDecodeNullableSerializableElement3 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 6, resourceId$$serializer, null);
            objDecodeNullableSerializableElement4 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 7, resource$$serializer, null);
            objDecodeNullableSerializableElement2 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 8, resourceId$$serializer, null);
            objDecodeNullableSerializableElement = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 9, Dimension$$serializer.INSTANCE, null);
            i10 = 1023;
        } else {
            boolean z10 = true;
            int i12 = 0;
            Object objDecodeNullableSerializableElement12 = null;
            Object objDecodeNullableSerializableElement13 = null;
            Object objDecodeNullableSerializableElement14 = null;
            Object objDecodeNullableSerializableElement15 = null;
            Object objDecodeNullableSerializableElement16 = null;
            Object objDecodeNullableSerializableElement17 = null;
            Object objDecodeNullableSerializableElement18 = null;
            Object objDecodeNullableSerializableElement19 = null;
            Object objDecodeNullableSerializableElement20 = null;
            while (z10) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        z10 = false;
                        i11 = 9;
                        break;
                    case 0:
                        objDecodeNullableSerializableElement11 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 0, ViewSettings$$serializer.INSTANCE, objDecodeNullableSerializableElement11);
                        i12 |= 1;
                        i11 = 9;
                        break;
                    case 1:
                        objDecodeNullableSerializableElement19 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 1, Resource$$serializer.INSTANCE, objDecodeNullableSerializableElement19);
                        i12 |= 2;
                        i11 = 9;
                        break;
                    case 2:
                        objDecodeNullableSerializableElement20 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 2, Resource$$serializer.INSTANCE, objDecodeNullableSerializableElement20);
                        i12 |= 4;
                        i11 = 9;
                        break;
                    case 3:
                        objDecodeNullableSerializableElement18 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 3, InputType$$serializer.INSTANCE, objDecodeNullableSerializableElement18);
                        i12 |= 8;
                        i11 = 9;
                        break;
                    case 4:
                        objDecodeNullableSerializableElement17 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 4, Resource$$serializer.INSTANCE, objDecodeNullableSerializableElement17);
                        i12 |= 16;
                        i11 = 9;
                        break;
                    case 5:
                        objDecodeNullableSerializableElement16 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 5, ResourceId$$serializer.INSTANCE, objDecodeNullableSerializableElement16);
                        i12 |= 32;
                        i11 = 9;
                        break;
                    case 6:
                        objDecodeNullableSerializableElement14 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 6, ResourceId$$serializer.INSTANCE, objDecodeNullableSerializableElement14);
                        i12 |= 64;
                        i11 = 9;
                        break;
                    case 7:
                        objDecodeNullableSerializableElement15 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 7, Resource$$serializer.INSTANCE, objDecodeNullableSerializableElement15);
                        i12 |= 128;
                        i11 = 9;
                        break;
                    case 8:
                        objDecodeNullableSerializableElement13 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 8, ResourceId$$serializer.INSTANCE, objDecodeNullableSerializableElement13);
                        i12 |= 256;
                        break;
                    case 9:
                        objDecodeNullableSerializableElement12 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, i11, Dimension$$serializer.INSTANCE, objDecodeNullableSerializableElement12);
                        i12 |= 512;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            objDecodeNullableSerializableElement = objDecodeNullableSerializableElement12;
            objDecodeNullableSerializableElement2 = objDecodeNullableSerializableElement13;
            objDecodeNullableSerializableElement3 = objDecodeNullableSerializableElement14;
            objDecodeNullableSerializableElement4 = objDecodeNullableSerializableElement15;
            objDecodeNullableSerializableElement5 = objDecodeNullableSerializableElement16;
            objDecodeNullableSerializableElement6 = objDecodeNullableSerializableElement17;
            objDecodeNullableSerializableElement7 = objDecodeNullableSerializableElement18;
            objDecodeNullableSerializableElement8 = objDecodeNullableSerializableElement19;
            objDecodeNullableSerializableElement9 = objDecodeNullableSerializableElement20;
            Object obj = objDecodeNullableSerializableElement11;
            i10 = i12;
            objDecodeNullableSerializableElement10 = obj;
        }
        compositeDecoderBeginStructure.endStructure(descriptor2);
        return new TextSettings(i10, (ViewSettings) objDecodeNullableSerializableElement10, (Resource) objDecodeNullableSerializableElement8, (Resource) objDecodeNullableSerializableElement9, (InputType) objDecodeNullableSerializableElement7, (Resource) objDecodeNullableSerializableElement6, (ResourceId) objDecodeNullableSerializableElement5, (ResourceId) objDecodeNullableSerializableElement3, (Resource) objDecodeNullableSerializableElement4, (ResourceId) objDecodeNullableSerializableElement2, (Dimension) objDecodeNullableSerializableElement, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    @NotNull
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(@NotNull Encoder encoder, @NotNull TextSettings value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor2);
        TextSettings.write$Self(value, compositeEncoderBeginStructure, descriptor2);
        compositeEncoderBeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
