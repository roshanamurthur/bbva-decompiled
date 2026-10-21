package com.veridas.lib.entities.resources.mrz;

import com.veridas.lib.entities.resources.Region;
import com.veridas.lib.entities.resources.Region$$serializer;
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
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Mrz.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"com/veridas/lib/entities/resources/mrz/Mrz.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/veridas/lib/entities/resources/mrz/Mrz;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "common-core-jvm"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
public final class Mrz$$serializer implements GeneratedSerializer<Mrz> {

    @NotNull
    public static final Mrz$$serializer INSTANCE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f67215a;

    static {
        Mrz$$serializer mrz$$serializer = new Mrz$$serializer();
        INSTANCE = mrz$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.veridas.lib.entities.resources.mrz.Mrz", mrz$$serializer, 2);
        pluginGeneratedSerialDescriptor.addElement("r", false);
        pluginGeneratedSerialDescriptor.addElement("t", false);
        f67215a = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{Region$$serializer.INSTANCE, Mrz.f67212c[1]};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public Mrz deserialize(@NotNull Decoder decoder) {
        MrzType mrzType;
        Region region;
        int i10;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor);
        KSerializer[] kSerializerArr = Mrz.f67212c;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            region = (Region) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 0, Region$$serializer.INSTANCE, null);
            mrzType = (MrzType) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 1, kSerializerArr[1], null);
            i10 = 3;
        } else {
            boolean z10 = true;
            int i11 = 0;
            MrzType mrzType2 = null;
            Region region2 = null;
            while (z10) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor);
                if (iDecodeElementIndex == -1) {
                    z10 = false;
                } else if (iDecodeElementIndex == 0) {
                    region2 = (Region) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 0, Region$$serializer.INSTANCE, region2);
                    i11 |= 1;
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    mrzType2 = (MrzType) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 1, kSerializerArr[1], mrzType2);
                    i11 |= 2;
                }
            }
            mrzType = mrzType2;
            region = region2;
            i10 = i11;
        }
        compositeDecoderBeginStructure.endStructure(descriptor);
        return new Mrz(i10, region, mrzType, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    @NotNull
    public SerialDescriptor getDescriptor() {
        return f67215a;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(@NotNull Encoder encoder, @NotNull Mrz value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor);
        Mrz.write$Self$common_core_jvm(value, compositeEncoderBeginStructure, descriptor);
        compositeEncoderBeginStructure.endStructure(descriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
