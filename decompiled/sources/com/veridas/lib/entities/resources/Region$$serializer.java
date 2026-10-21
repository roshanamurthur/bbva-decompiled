package com.veridas.lib.entities.resources;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Region.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"com/veridas/lib/entities/resources/Region.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/veridas/lib/entities/resources/Region;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "common-core-jvm"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
public final class Region$$serializer implements GeneratedSerializer<Region> {

    @NotNull
    public static final Region$$serializer INSTANCE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f67204a;

    static {
        Region$$serializer region$$serializer = new Region$$serializer();
        INSTANCE = region$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.veridas.lib.entities.resources.Region", region$$serializer, 4);
        pluginGeneratedSerialDescriptor.addElement("x", false);
        pluginGeneratedSerialDescriptor.addElement("y", false);
        pluginGeneratedSerialDescriptor.addElement("w", false);
        pluginGeneratedSerialDescriptor.addElement("h", false);
        f67204a = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public KSerializer<?>[] childSerializers() {
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        return new KSerializer[]{floatSerializer, floatSerializer, floatSerializer, floatSerializer};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public Region deserialize(@NotNull Decoder decoder) {
        float f6;
        float fDecodeFloatElement;
        float f10;
        float f11;
        int i10;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            float fDecodeFloatElement2 = compositeDecoderBeginStructure.decodeFloatElement(descriptor, 0);
            float fDecodeFloatElement3 = compositeDecoderBeginStructure.decodeFloatElement(descriptor, 1);
            float fDecodeFloatElement4 = compositeDecoderBeginStructure.decodeFloatElement(descriptor, 2);
            f6 = fDecodeFloatElement2;
            fDecodeFloatElement = compositeDecoderBeginStructure.decodeFloatElement(descriptor, 3);
            f10 = fDecodeFloatElement4;
            f11 = fDecodeFloatElement3;
            i10 = 15;
        } else {
            float fDecodeFloatElement5 = 0.0f;
            float fDecodeFloatElement6 = 0.0f;
            float fDecodeFloatElement7 = 0.0f;
            float fDecodeFloatElement8 = 0.0f;
            boolean z10 = true;
            int i11 = 0;
            while (z10) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor);
                if (iDecodeElementIndex == -1) {
                    z10 = false;
                } else if (iDecodeElementIndex == 0) {
                    fDecodeFloatElement5 = compositeDecoderBeginStructure.decodeFloatElement(descriptor, 0);
                    i11 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    fDecodeFloatElement8 = compositeDecoderBeginStructure.decodeFloatElement(descriptor, 1);
                    i11 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    fDecodeFloatElement7 = compositeDecoderBeginStructure.decodeFloatElement(descriptor, 2);
                    i11 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    fDecodeFloatElement6 = compositeDecoderBeginStructure.decodeFloatElement(descriptor, 3);
                    i11 |= 8;
                }
            }
            f6 = fDecodeFloatElement5;
            fDecodeFloatElement = fDecodeFloatElement6;
            f10 = fDecodeFloatElement7;
            f11 = fDecodeFloatElement8;
            i10 = i11;
        }
        compositeDecoderBeginStructure.endStructure(descriptor);
        return new Region(i10, f6, f11, f10, fDecodeFloatElement, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    @NotNull
    public SerialDescriptor getDescriptor() {
        return f67204a;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(@NotNull Encoder encoder, @NotNull Region value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor);
        Region.write$Self$common_core_jvm(value, compositeEncoderBeginStructure, descriptor);
        compositeEncoderBeginStructure.endStructure(descriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
