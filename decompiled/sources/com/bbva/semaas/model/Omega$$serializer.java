package com.bbva.semaas.model;

import com.bbva.component.dm.naturalauth.Constants;
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
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"com/bbva/semaas/model/Omega.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/bbva/semaas/model/Omega;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "semaas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
public final class Omega$$serializer implements GeneratedSerializer<Omega> {

    @NotNull
    public static final Omega$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        Omega$$serializer omega$$serializer = new Omega$$serializer();
        INSTANCE = omega$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.bbva.semaas.model.Omega", omega$$serializer, 7);
        pluginGeneratedSerialDescriptor.addElement("mrId", false);
        pluginGeneratedSerialDescriptor.addElement("spanId", false);
        pluginGeneratedSerialDescriptor.addElement("traceId", false);
        pluginGeneratedSerialDescriptor.addElement(LogKeysKt.PROPERTIES, false);
        pluginGeneratedSerialDescriptor.addElement(Constants.creationDate, false);
        pluginGeneratedSerialDescriptor.addElement("level", false);
        pluginGeneratedSerialDescriptor.addElement("message", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private Omega$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(new LinkedHashMapSerializer(stringSerializer, stringSerializer)), LongSerializer.INSTANCE, stringSerializer, stringSerializer};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public Omega deserialize(@NotNull Decoder decoder) {
        int i10;
        String str;
        long j10;
        String str2;
        String str3;
        Object objDecodeNullableSerializableElement;
        String str4;
        String strDecodeStringElement;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor2);
        int i11 = 6;
        String strDecodeStringElement2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 0);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 1);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 2);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            objDecodeNullableSerializableElement = compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor2, 3, new LinkedHashMapSerializer(stringSerializer, stringSerializer), null);
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(descriptor2, 4);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 5);
            str = strDecodeStringElement3;
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 6);
            str4 = strDecodeStringElement6;
            i10 = 127;
            str3 = strDecodeStringElement5;
            str2 = strDecodeStringElement4;
            j10 = jDecodeLongElement;
        } else {
            long jDecodeLongElement2 = 0;
            boolean z10 = true;
            int i12 = 0;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            Object objDecodeNullableSerializableElement2 = null;
            String strDecodeStringElement9 = null;
            String strDecodeStringElement10 = null;
            while (z10) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        z10 = false;
                        i11 = 6;
                        break;
                    case 0:
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 0);
                        i12 |= 1;
                        i11 = 6;
                        break;
                    case 1:
                        strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 1);
                        i12 |= 2;
                        i11 = 6;
                        break;
                    case 2:
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 2);
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
                        jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(descriptor2, 4);
                        i12 |= 16;
                        break;
                    case 5:
                        strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(descriptor2, 5);
                        i12 |= 32;
                        break;
                    case 6:
                        strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(descriptor2, i11);
                        i12 |= 64;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i10 = i12;
            str = strDecodeStringElement2;
            j10 = jDecodeLongElement2;
            str2 = strDecodeStringElement7;
            str3 = strDecodeStringElement8;
            objDecodeNullableSerializableElement = objDecodeNullableSerializableElement2;
            str4 = strDecodeStringElement9;
            strDecodeStringElement = strDecodeStringElement10;
        }
        compositeDecoderBeginStructure.endStructure(descriptor2);
        return new Omega(i10, str, str2, str3, (Map) objDecodeNullableSerializableElement, j10, str4, strDecodeStringElement, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    @NotNull
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(@NotNull Encoder encoder, @NotNull Omega value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor2);
        Omega.write$Self(value, compositeEncoderBeginStructure, descriptor2);
        compositeEncoderBeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
