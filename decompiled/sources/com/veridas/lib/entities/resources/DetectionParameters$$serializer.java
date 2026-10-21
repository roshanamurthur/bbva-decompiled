package com.veridas.lib.entities.resources;

import androidx.core.view.accessibility.AccessibilityEventCompat;
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
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DetectionParameters.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"com/veridas/lib/entities/resources/DetectionParameters.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/veridas/lib/entities/resources/DetectionParameters;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "common-core-jvm"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
public final class DetectionParameters$$serializer implements GeneratedSerializer<DetectionParameters> {

    @NotNull
    public static final DetectionParameters$$serializer INSTANCE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f67177a;

    static {
        DetectionParameters$$serializer detectionParameters$$serializer = new DetectionParameters$$serializer();
        INSTANCE = detectionParameters$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.veridas.lib.entities.resources.DetectionParameters", detectionParameters$$serializer, 27);
        pluginGeneratedSerialDescriptor.addElement("i", true);
        pluginGeneratedSerialDescriptor.addElement("tn", true);
        pluginGeneratedSerialDescriptor.addElement("cn", true);
        pluginGeneratedSerialDescriptor.addElement("pr", true);
        pluginGeneratedSerialDescriptor.addElement("pf", true);
        pluginGeneratedSerialDescriptor.addElement("ig", true);
        pluginGeneratedSerialDescriptor.addElement("rf", true);
        pluginGeneratedSerialDescriptor.addElement("mfit", true);
        pluginGeneratedSerialDescriptor.addElement("ta", true);
        pluginGeneratedSerialDescriptor.addElement("pm", true);
        pluginGeneratedSerialDescriptor.addElement("r", true);
        pluginGeneratedSerialDescriptor.addElement("s", true);
        pluginGeneratedSerialDescriptor.addElement("mdh", true);
        pluginGeneratedSerialDescriptor.addElement("mdw", true);
        pluginGeneratedSerialDescriptor.addElement("mds", true);
        pluginGeneratedSerialDescriptor.addElement("mdhv", true);
        pluginGeneratedSerialDescriptor.addElement("mdwv", true);
        pluginGeneratedSerialDescriptor.addElement("n", true);
        pluginGeneratedSerialDescriptor.addElement("ms", true);
        pluginGeneratedSerialDescriptor.addElement("xtfx", true);
        pluginGeneratedSerialDescriptor.addElement("ytfy", true);
        pluginGeneratedSerialDescriptor.addElement("wtfw", true);
        pluginGeneratedSerialDescriptor.addElement("htfh", true);
        pluginGeneratedSerialDescriptor.addElement("xtft", true);
        pluginGeneratedSerialDescriptor.addElement("ytft", true);
        pluginGeneratedSerialDescriptor.addElement("wtft", true);
        pluginGeneratedSerialDescriptor.addElement("htft", true);
        f67177a = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        DoubleSerializer doubleSerializer = DoubleSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), intSerializer, doubleSerializer, booleanSerializer, doubleSerializer, doubleSerializer, intSerializer, intSerializer, booleanSerializer, doubleSerializer, doubleSerializer, doubleSerializer, doubleSerializer, doubleSerializer, doubleSerializer, intSerializer, doubleSerializer, doubleSerializer, doubleSerializer, doubleSerializer, doubleSerializer, doubleSerializer, doubleSerializer, doubleSerializer, doubleSerializer};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public DetectionParameters deserialize(@NotNull Decoder decoder) {
        int i10;
        String str;
        String str2;
        String str3;
        int i11;
        int i12;
        boolean z10;
        int i13;
        int i14;
        boolean z11;
        double d2;
        double d3;
        double d7;
        double d10;
        double d11;
        double d12;
        double d13;
        double d14;
        double d15;
        double d16;
        double d17;
        double d18;
        double d19;
        double d20;
        double d21;
        double dDecodeDoubleElement;
        double dDecodeDoubleElement2;
        double dDecodeDoubleElement3;
        int i15;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor);
        int i16 = 3;
        int i17 = 8;
        int i18 = 4;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 0, stringSerializer, null);
            String str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 1, stringSerializer, null);
            String str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 2, stringSerializer, null);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(descriptor, 3);
            double dDecodeDoubleElement4 = compositeDecoderBeginStructure.decodeDoubleElement(descriptor, 4);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(descriptor, 5);
            double dDecodeDoubleElement5 = compositeDecoderBeginStructure.decodeDoubleElement(descriptor, 6);
            double dDecodeDoubleElement6 = compositeDecoderBeginStructure.decodeDoubleElement(descriptor, 7);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(descriptor, 8);
            int iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(descriptor, 9);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(descriptor, 10);
            double dDecodeDoubleElement7 = compositeDecoderBeginStructure.decodeDoubleElement(descriptor, 11);
            double dDecodeDoubleElement8 = compositeDecoderBeginStructure.decodeDoubleElement(descriptor, 12);
            double dDecodeDoubleElement9 = compositeDecoderBeginStructure.decodeDoubleElement(descriptor, 13);
            double dDecodeDoubleElement10 = compositeDecoderBeginStructure.decodeDoubleElement(descriptor, 14);
            double dDecodeDoubleElement11 = compositeDecoderBeginStructure.decodeDoubleElement(descriptor, 15);
            double dDecodeDoubleElement12 = compositeDecoderBeginStructure.decodeDoubleElement(descriptor, 16);
            int iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(descriptor, 17);
            double dDecodeDoubleElement13 = compositeDecoderBeginStructure.decodeDoubleElement(descriptor, 18);
            double dDecodeDoubleElement14 = compositeDecoderBeginStructure.decodeDoubleElement(descriptor, 19);
            double dDecodeDoubleElement15 = compositeDecoderBeginStructure.decodeDoubleElement(descriptor, 20);
            double dDecodeDoubleElement16 = compositeDecoderBeginStructure.decodeDoubleElement(descriptor, 21);
            double dDecodeDoubleElement17 = compositeDecoderBeginStructure.decodeDoubleElement(descriptor, 22);
            double dDecodeDoubleElement18 = compositeDecoderBeginStructure.decodeDoubleElement(descriptor, 23);
            i10 = 134217727;
            i12 = iDecodeIntElement;
            z10 = zDecodeBooleanElement;
            i13 = iDecodeIntElement2;
            i14 = iDecodeIntElement3;
            str3 = str5;
            str = str4;
            z11 = zDecodeBooleanElement2;
            d2 = dDecodeDoubleElement7;
            d3 = dDecodeDoubleElement8;
            d7 = dDecodeDoubleElement5;
            i11 = iDecodeIntElement4;
            d10 = dDecodeDoubleElement12;
            d11 = dDecodeDoubleElement10;
            str2 = str6;
            d12 = dDecodeDoubleElement4;
            d13 = dDecodeDoubleElement6;
            d14 = dDecodeDoubleElement9;
            d15 = dDecodeDoubleElement11;
            d16 = dDecodeDoubleElement13;
            d17 = dDecodeDoubleElement14;
            d18 = dDecodeDoubleElement15;
            d19 = dDecodeDoubleElement16;
            d20 = dDecodeDoubleElement17;
            d21 = dDecodeDoubleElement18;
            dDecodeDoubleElement = compositeDecoderBeginStructure.decodeDoubleElement(descriptor, 24);
            dDecodeDoubleElement2 = compositeDecoderBeginStructure.decodeDoubleElement(descriptor, 25);
            dDecodeDoubleElement3 = compositeDecoderBeginStructure.decodeDoubleElement(descriptor, 26);
        } else {
            boolean z12 = true;
            int i19 = 0;
            int iDecodeIntElement5 = 0;
            int iDecodeIntElement6 = 0;
            boolean zDecodeBooleanElement3 = false;
            String str7 = null;
            String str8 = null;
            double dDecodeDoubleElement19 = 0.0d;
            double dDecodeDoubleElement20 = 0.0d;
            double dDecodeDoubleElement21 = 0.0d;
            double dDecodeDoubleElement22 = 0.0d;
            double dDecodeDoubleElement23 = 0.0d;
            double dDecodeDoubleElement24 = 0.0d;
            double dDecodeDoubleElement25 = 0.0d;
            double dDecodeDoubleElement26 = 0.0d;
            double dDecodeDoubleElement27 = 0.0d;
            double dDecodeDoubleElement28 = 0.0d;
            double dDecodeDoubleElement29 = 0.0d;
            double dDecodeDoubleElement30 = 0.0d;
            double dDecodeDoubleElement31 = 0.0d;
            double dDecodeDoubleElement32 = 0.0d;
            double dDecodeDoubleElement33 = 0.0d;
            double dDecodeDoubleElement34 = 0.0d;
            double dDecodeDoubleElement35 = 0.0d;
            double dDecodeDoubleElement36 = 0.0d;
            int iDecodeIntElement7 = 0;
            boolean zDecodeBooleanElement4 = false;
            String str9 = null;
            int iDecodeIntElement8 = 0;
            while (z12) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z12 = false;
                        i18 = 4;
                        i17 = 8;
                        break;
                    case 0:
                        str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 0, StringSerializer.INSTANCE, str8);
                        i19 |= 1;
                        i16 = 3;
                        i18 = 4;
                        i17 = 8;
                        break;
                    case 1:
                        str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 1, StringSerializer.INSTANCE, str9);
                        i19 |= 2;
                        i16 = 3;
                        i18 = 4;
                        break;
                    case 2:
                        str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 2, StringSerializer.INSTANCE, str7);
                        i19 |= 4;
                        i16 = 3;
                        i18 = 4;
                        break;
                    case 3:
                        iDecodeIntElement7 = compositeDecoderBeginStructure.decodeIntElement(descriptor, i16);
                        i19 |= 8;
                        break;
                    case 4:
                        dDecodeDoubleElement24 = compositeDecoderBeginStructure.decodeDoubleElement(descriptor, i18);
                        i19 |= 16;
                        break;
                    case 5:
                        zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(descriptor, 5);
                        i19 |= 32;
                        break;
                    case 6:
                        dDecodeDoubleElement21 = compositeDecoderBeginStructure.decodeDoubleElement(descriptor, 6);
                        i19 |= 64;
                        break;
                    case 7:
                        dDecodeDoubleElement25 = compositeDecoderBeginStructure.decodeDoubleElement(descriptor, 7);
                        i19 |= 128;
                        break;
                    case 8:
                        iDecodeIntElement5 = compositeDecoderBeginStructure.decodeIntElement(descriptor, i17);
                        i19 |= 256;
                        break;
                    case 9:
                        iDecodeIntElement6 = compositeDecoderBeginStructure.decodeIntElement(descriptor, 9);
                        i19 |= 512;
                        break;
                    case 10:
                        zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(descriptor, 10);
                        i19 |= 1024;
                        break;
                    case 11:
                        dDecodeDoubleElement19 = compositeDecoderBeginStructure.decodeDoubleElement(descriptor, 11);
                        i19 |= 2048;
                        break;
                    case 12:
                        dDecodeDoubleElement20 = compositeDecoderBeginStructure.decodeDoubleElement(descriptor, 12);
                        i19 |= 4096;
                        break;
                    case 13:
                        dDecodeDoubleElement26 = compositeDecoderBeginStructure.decodeDoubleElement(descriptor, 13);
                        i19 |= 8192;
                        break;
                    case 14:
                        dDecodeDoubleElement23 = compositeDecoderBeginStructure.decodeDoubleElement(descriptor, 14);
                        i19 |= 16384;
                        break;
                    case 15:
                        dDecodeDoubleElement27 = compositeDecoderBeginStructure.decodeDoubleElement(descriptor, 15);
                        i19 |= 32768;
                        break;
                    case 16:
                        dDecodeDoubleElement22 = compositeDecoderBeginStructure.decodeDoubleElement(descriptor, 16);
                        i19 |= 65536;
                        break;
                    case 17:
                        i19 |= 131072;
                        iDecodeIntElement8 = compositeDecoderBeginStructure.decodeIntElement(descriptor, 17);
                        break;
                    case 18:
                        dDecodeDoubleElement28 = compositeDecoderBeginStructure.decodeDoubleElement(descriptor, 18);
                        i19 |= 262144;
                        break;
                    case 19:
                        dDecodeDoubleElement29 = compositeDecoderBeginStructure.decodeDoubleElement(descriptor, 19);
                        i19 |= 524288;
                        break;
                    case 20:
                        dDecodeDoubleElement30 = compositeDecoderBeginStructure.decodeDoubleElement(descriptor, 20);
                        i15 = 1048576;
                        i19 |= i15;
                        break;
                    case 21:
                        dDecodeDoubleElement31 = compositeDecoderBeginStructure.decodeDoubleElement(descriptor, 21);
                        i15 = 2097152;
                        i19 |= i15;
                        break;
                    case 22:
                        dDecodeDoubleElement32 = compositeDecoderBeginStructure.decodeDoubleElement(descriptor, 22);
                        i15 = 4194304;
                        i19 |= i15;
                        break;
                    case 23:
                        dDecodeDoubleElement33 = compositeDecoderBeginStructure.decodeDoubleElement(descriptor, 23);
                        i15 = 8388608;
                        i19 |= i15;
                        break;
                    case 24:
                        dDecodeDoubleElement34 = compositeDecoderBeginStructure.decodeDoubleElement(descriptor, 24);
                        i15 = 16777216;
                        i19 |= i15;
                        break;
                    case 25:
                        dDecodeDoubleElement35 = compositeDecoderBeginStructure.decodeDoubleElement(descriptor, 25);
                        i15 = 33554432;
                        i19 |= i15;
                        break;
                    case 26:
                        dDecodeDoubleElement36 = compositeDecoderBeginStructure.decodeDoubleElement(descriptor, 26);
                        i15 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                        i19 |= i15;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i10 = i19;
            str = str8;
            str2 = str7;
            str3 = str9;
            i11 = iDecodeIntElement8;
            i12 = iDecodeIntElement7;
            z10 = zDecodeBooleanElement4;
            i13 = iDecodeIntElement5;
            i14 = iDecodeIntElement6;
            z11 = zDecodeBooleanElement3;
            d2 = dDecodeDoubleElement19;
            d3 = dDecodeDoubleElement20;
            d7 = dDecodeDoubleElement21;
            d10 = dDecodeDoubleElement22;
            d11 = dDecodeDoubleElement23;
            d12 = dDecodeDoubleElement24;
            d13 = dDecodeDoubleElement25;
            d14 = dDecodeDoubleElement26;
            d15 = dDecodeDoubleElement27;
            d16 = dDecodeDoubleElement28;
            d17 = dDecodeDoubleElement29;
            d18 = dDecodeDoubleElement30;
            d19 = dDecodeDoubleElement31;
            d20 = dDecodeDoubleElement32;
            d21 = dDecodeDoubleElement33;
            dDecodeDoubleElement = dDecodeDoubleElement34;
            dDecodeDoubleElement2 = dDecodeDoubleElement35;
            dDecodeDoubleElement3 = dDecodeDoubleElement36;
        }
        compositeDecoderBeginStructure.endStructure(descriptor);
        return new DetectionParameters(i10, str, str3, str2, i12, d12, z10, d7, d13, i13, i14, z11, d2, d3, d14, d11, d15, d10, i11, d16, d17, d18, d19, d20, d21, dDecodeDoubleElement, dDecodeDoubleElement2, dDecodeDoubleElement3, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    @NotNull
    public SerialDescriptor getDescriptor() {
        return f67177a;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(@NotNull Encoder encoder, @NotNull DetectionParameters value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor);
        DetectionParameters.write$Self$common_core_jvm(value, compositeEncoderBeginStructure, descriptor);
        compositeEncoderBeginStructure.endStructure(descriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
