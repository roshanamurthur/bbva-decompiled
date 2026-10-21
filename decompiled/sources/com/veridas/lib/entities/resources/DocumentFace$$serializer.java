package com.veridas.lib.entities.resources;

import com.veridas.lib.entities.resources.mrz.Mrz;
import com.veridas.lib.entities.resources.mrz.Mrz$$serializer;
import java.util.List;
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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DocumentFace.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"com/veridas/lib/entities/resources/DocumentFace.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/veridas/lib/entities/resources/DocumentFace;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "common-core-jvm"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
public final class DocumentFace$$serializer implements GeneratedSerializer<DocumentFace> {

    @NotNull
    public static final DocumentFace$$serializer INSTANCE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f67197a;

    static {
        DocumentFace$$serializer documentFace$$serializer = new DocumentFace$$serializer();
        INSTANCE = documentFace$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.veridas.lib.entities.resources.DocumentFace", documentFace$$serializer, 8);
        pluginGeneratedSerialDescriptor.addElement("s", false);
        pluginGeneratedSerialDescriptor.addElement("m", false);
        pluginGeneratedSerialDescriptor.addElement("p", true);
        pluginGeneratedSerialDescriptor.addElement("t", true);
        pluginGeneratedSerialDescriptor.addElement("z", true);
        pluginGeneratedSerialDescriptor.addElement("f", true);
        pluginGeneratedSerialDescriptor.addElement("b", true);
        pluginGeneratedSerialDescriptor.addElement("d", true);
        f67197a = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = DocumentFace.f67188i;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new KSerializer[]{kSerializerArr[0], booleanSerializer, BuiltinSerializersKt.getNullable(PersonFace$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable(Mrz$$serializer.INSTANCE), booleanSerializer, BuiltinSerializersKt.getNullable(kSerializerArr[6]), BuiltinSerializersKt.getNullable(DetectionParameters$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public DocumentFace deserialize(@NotNull Decoder decoder) {
        boolean z10;
        DetectionParameters detectionParameters;
        List list;
        Mrz mrz;
        String str;
        int i10;
        boolean z11;
        Side side;
        PersonFace personFace;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor);
        KSerializer[] kSerializerArr = DocumentFace.f67188i;
        int i11 = 7;
        int i12 = 5;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            Side side2 = (Side) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 0, kSerializerArr[0], null);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(descriptor, 1);
            PersonFace personFace2 = (PersonFace) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 2, PersonFace$$serializer.INSTANCE, null);
            String str2 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 3, StringSerializer.INSTANCE, null);
            Mrz mrz2 = (Mrz) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 4, Mrz$$serializer.INSTANCE, null);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(descriptor, 5);
            list = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 6, kSerializerArr[6], null);
            side = side2;
            detectionParameters = (DetectionParameters) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 7, DetectionParameters$$serializer.INSTANCE, null);
            z10 = zDecodeBooleanElement2;
            str = str2;
            mrz = mrz2;
            personFace = personFace2;
            i10 = 255;
            z11 = zDecodeBooleanElement;
        } else {
            boolean z12 = true;
            boolean zDecodeBooleanElement3 = false;
            boolean zDecodeBooleanElement4 = false;
            DetectionParameters detectionParameters2 = null;
            List list2 = null;
            Mrz mrz3 = null;
            Side side3 = null;
            PersonFace personFace3 = null;
            String str3 = null;
            int i13 = 0;
            while (z12) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z12 = false;
                        i11 = 7;
                        break;
                    case 0:
                        side3 = (Side) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 0, kSerializerArr[0], side3);
                        i13 |= 1;
                        i11 = 7;
                        i12 = 5;
                        break;
                    case 1:
                        zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(descriptor, 1);
                        i13 |= 2;
                        i11 = 7;
                        break;
                    case 2:
                        personFace3 = (PersonFace) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 2, PersonFace$$serializer.INSTANCE, personFace3);
                        i13 |= 4;
                        i11 = 7;
                        break;
                    case 3:
                        str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 3, StringSerializer.INSTANCE, str3);
                        i13 |= 8;
                        i11 = 7;
                        break;
                    case 4:
                        mrz3 = (Mrz) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 4, Mrz$$serializer.INSTANCE, mrz3);
                        i13 |= 16;
                        i11 = 7;
                        break;
                    case 5:
                        zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(descriptor, i12);
                        i13 |= 32;
                        break;
                    case 6:
                        list2 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 6, kSerializerArr[6], list2);
                        i13 |= 64;
                        break;
                    case 7:
                        detectionParameters2 = (DetectionParameters) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, i11, DetectionParameters$$serializer.INSTANCE, detectionParameters2);
                        i13 |= 128;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            z10 = zDecodeBooleanElement3;
            detectionParameters = detectionParameters2;
            list = list2;
            mrz = mrz3;
            str = str3;
            i10 = i13;
            z11 = zDecodeBooleanElement4;
            side = side3;
            personFace = personFace3;
        }
        compositeDecoderBeginStructure.endStructure(descriptor);
        return new DocumentFace(i10, side, z11, personFace, str, mrz, z10, list, detectionParameters, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    @NotNull
    public SerialDescriptor getDescriptor() {
        return f67197a;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(@NotNull Encoder encoder, @NotNull DocumentFace value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor);
        DocumentFace.write$Self$common_core_jvm(value, compositeEncoderBeginStructure, descriptor);
        compositeEncoderBeginStructure.endStructure(descriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
