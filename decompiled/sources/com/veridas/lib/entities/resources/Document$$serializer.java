package com.veridas.lib.entities.resources;

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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Document.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"com/veridas/lib/entities/resources/Document.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/veridas/lib/entities/resources/Document;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "common-core-jvm"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
public final class Document$$serializer implements GeneratedSerializer<Document> {

    @NotNull
    public static final Document$$serializer INSTANCE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f67187a;

    static {
        Document$$serializer document$$serializer = new Document$$serializer();
        INSTANCE = document$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.veridas.lib.entities.resources.Document", document$$serializer, 8);
        pluginGeneratedSerialDescriptor.addElement("i", false);
        pluginGeneratedSerialDescriptor.addElement("g", false);
        pluginGeneratedSerialDescriptor.addElement("w", false);
        pluginGeneratedSerialDescriptor.addElement("h", false);
        pluginGeneratedSerialDescriptor.addElement("mbpa", false);
        pluginGeneratedSerialDescriptor.addElement("n", false);
        pluginGeneratedSerialDescriptor.addElement("o", true);
        pluginGeneratedSerialDescriptor.addElement("r", true);
        f67187a = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = Document.f67178i;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        DocumentFace$$serializer documentFace$$serializer = DocumentFace$$serializer.INSTANCE;
        return new KSerializer[]{StringSerializer.INSTANCE, kSerializerArr[1], intSerializer, intSerializer, booleanSerializer, booleanSerializer, BuiltinSerializersKt.getNullable(documentFace$$serializer), BuiltinSerializersKt.getNullable(documentFace$$serializer)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public Document deserialize(@NotNull Decoder decoder) {
        boolean z10;
        DocumentFace documentFace;
        DocumentFace documentFace2;
        List list;
        int i10;
        boolean z11;
        int i11;
        int i12;
        String str;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor);
        KSerializer[] kSerializerArr = Document.f67178i;
        int i13 = 7;
        int i14 = 6;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(descriptor, 0);
            List list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 1, kSerializerArr[1], null);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(descriptor, 2);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(descriptor, 3);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(descriptor, 4);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(descriptor, 5);
            DocumentFace$$serializer documentFace$$serializer = DocumentFace$$serializer.INSTANCE;
            DocumentFace documentFace3 = (DocumentFace) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 6, documentFace$$serializer, null);
            list = list2;
            str = strDecodeStringElement;
            documentFace = (DocumentFace) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 7, documentFace$$serializer, null);
            documentFace2 = documentFace3;
            z10 = zDecodeBooleanElement2;
            i10 = iDecodeIntElement2;
            z11 = zDecodeBooleanElement;
            i11 = iDecodeIntElement;
            i12 = 255;
        } else {
            boolean z12 = true;
            boolean zDecodeBooleanElement3 = false;
            boolean zDecodeBooleanElement4 = false;
            int iDecodeIntElement3 = 0;
            int i15 = 0;
            DocumentFace documentFace4 = null;
            DocumentFace documentFace5 = null;
            String strDecodeStringElement2 = null;
            List list3 = null;
            int iDecodeIntElement4 = 0;
            while (z12) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z12 = false;
                        i13 = 7;
                        i14 = 6;
                        break;
                    case 0:
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(descriptor, 0);
                        i15 |= 1;
                        i13 = 7;
                        i14 = 6;
                        break;
                    case 1:
                        list3 = (List) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 1, kSerializerArr[1], list3);
                        i15 |= 2;
                        i13 = 7;
                        i14 = 6;
                        break;
                    case 2:
                        i15 |= 4;
                        iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(descriptor, 2);
                        break;
                    case 3:
                        iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(descriptor, 3);
                        i15 |= 8;
                        break;
                    case 4:
                        zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(descriptor, 4);
                        i15 |= 16;
                        break;
                    case 5:
                        zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(descriptor, 5);
                        i15 |= 32;
                        break;
                    case 6:
                        documentFace5 = (DocumentFace) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, i14, DocumentFace$$serializer.INSTANCE, documentFace5);
                        i15 |= 64;
                        break;
                    case 7:
                        documentFace4 = (DocumentFace) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, i13, DocumentFace$$serializer.INSTANCE, documentFace4);
                        i15 |= 128;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            z10 = zDecodeBooleanElement3;
            documentFace = documentFace4;
            documentFace2 = documentFace5;
            list = list3;
            i10 = iDecodeIntElement4;
            z11 = zDecodeBooleanElement4;
            i11 = iDecodeIntElement3;
            i12 = i15;
            str = strDecodeStringElement2;
        }
        compositeDecoderBeginStructure.endStructure(descriptor);
        return new Document(i12, str, list, i11, i10, z11, z10, documentFace2, documentFace, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    @NotNull
    public SerialDescriptor getDescriptor() {
        return f67187a;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(@NotNull Encoder encoder, @NotNull Document value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor);
        Document.write$Self$common_core_jvm(value, compositeEncoderBeginStructure, descriptor);
        compositeEncoderBeginStructure.endStructure(descriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
