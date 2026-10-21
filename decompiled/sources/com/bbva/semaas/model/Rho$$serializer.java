package com.bbva.semaas.model;

import com.bbva.glomohybrid.logs.LogKeysKt;
import java.util.Map;
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
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Events.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"com/bbva/semaas/model/Rho.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/bbva/semaas/model/Rho;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "semaas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
public final class Rho$$serializer implements GeneratedSerializer<Rho> {

    @NotNull
    public static final Rho$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        Rho$$serializer rho$$serializer = new Rho$$serializer();
        INSTANCE = rho$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.bbva.semaas.model.Rho", rho$$serializer, 7);
        pluginGeneratedSerialDescriptor.addElement("mrId", false);
        pluginGeneratedSerialDescriptor.addElement("spanId", false);
        pluginGeneratedSerialDescriptor.addElement("traceId", false);
        pluginGeneratedSerialDescriptor.addElement(LogKeysKt.PROPERTIES, false);
        pluginGeneratedSerialDescriptor.addElement("name", false);
        pluginGeneratedSerialDescriptor.addElement(LogKeysKt.START_DATE, false);
        pluginGeneratedSerialDescriptor.addElement("finishDate", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private Rho$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(new LinkedHashMapSerializer(stringSerializer, stringSerializer)), stringSerializer, longSerializer, longSerializer};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public Rho deserialize(@NotNull Decoder decoder) {
        String str;
        Object objDecodeNullableSerializableElement;
        String str2;
        long jDecodeLongElement;
        long j10;
        String str3;
        String str4;
        int i10;
        boolean z10;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor2);
        int i11 = 6;
        String strDecodeStringElement = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 0);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 1);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 2);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            objDecodeNullableSerializableElement = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 3, new LinkedHashMapSerializer(stringSerializer, stringSerializer), null);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 4);
            long jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(descriptor2, 5);
            str2 = strDecodeStringElement2;
            jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(descriptor2, 6);
            str4 = strDecodeStringElement5;
            str3 = strDecodeStringElement4;
            str = strDecodeStringElement3;
            j10 = jDecodeLongElement2;
            i10 = 127;
        } else {
            long jDecodeLongElement3 = 0;
            boolean z11 = true;
            int i12 = 0;
            String strDecodeStringElement6 = null;
            Object objDecodeNullableSerializableElement2 = null;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            long jDecodeLongElement4 = 0;
            while (z11) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        z11 = false;
                        break;
                    case 0:
                        z10 = true;
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 0);
                        i12 |= 1;
                        i11 = 6;
                        break;
                    case 1:
                        z10 = true;
                        strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 1);
                        i12 |= 2;
                        i11 = 6;
                        break;
                    case 2:
                        strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 2);
                        i12 |= 4;
                        i11 = 6;
                        break;
                    case 3:
                        StringSerializer stringSerializer2 = StringSerializer.INSTANCE;
                        objDecodeNullableSerializableElement2 = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 3, new LinkedHashMapSerializer(stringSerializer2, stringSerializer2), objDecodeNullableSerializableElement2);
                        i12 |= 8;
                        i11 = 6;
                        break;
                    case 4:
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 4);
                        i12 |= 16;
                        break;
                    case 5:
                        jDecodeLongElement4 = compositeDecoderBeginStructure.decodeLongElement(descriptor2, 5);
                        i12 |= 32;
                        break;
                    case 6:
                        jDecodeLongElement3 = compositeDecoderBeginStructure.decodeLongElement(descriptor2, i11);
                        i12 |= 64;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = strDecodeStringElement6;
            objDecodeNullableSerializableElement = objDecodeNullableSerializableElement2;
            str2 = strDecodeStringElement;
            jDecodeLongElement = jDecodeLongElement3;
            j10 = jDecodeLongElement4;
            str3 = strDecodeStringElement7;
            str4 = strDecodeStringElement8;
            i10 = i12;
        }
        compositeDecoderBeginStructure.endStructure(descriptor2);
        return new Rho(i10, str2, str, str3, (Map) objDecodeNullableSerializableElement, str4, j10, jDecodeLongElement, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    @NotNull
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(@NotNull Encoder encoder, @NotNull Rho value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor2);
        Rho.write$Self(value, compositeEncoderBeginStructure, descriptor2);
        compositeEncoderBeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
