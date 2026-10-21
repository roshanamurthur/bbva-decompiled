package com.bbva.component.ui.modal.halfmodal.model;

import com.bbva.zoomauth.facialauth.constant.AuthConstants;
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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: HalfModalState.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"com/bbva/component/ui/modal/halfmodal/model/HalfModalState.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/bbva/component/ui/modal/halfmodal/model/HalfModalState;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "component-ui-modal_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
public final class HalfModalState$$serializer implements GeneratedSerializer<HalfModalState> {

    @NotNull
    public static final HalfModalState$$serializer INSTANCE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f28706a;

    static {
        HalfModalState$$serializer halfModalState$$serializer = new HalfModalState$$serializer();
        INSTANCE = halfModalState$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.bbva.component.ui.modal.halfmodal.model.HalfModalState", halfModalState$$serializer, 8);
        pluginGeneratedSerialDescriptor.addElement("type", false);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement("actionIcon", false);
        pluginGeneratedSerialDescriptor.addElement(AuthConstants.IMAGE, true);
        pluginGeneratedSerialDescriptor.addElement("legend", true);
        pluginGeneratedSerialDescriptor.addElement("message", false);
        pluginGeneratedSerialDescriptor.addElement("primaryButtonText", true);
        pluginGeneratedSerialDescriptor.addElement("secondaryButtonText", true);
        f28706a = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        ButtonConfig$$serializer buttonConfig$$serializer = ButtonConfig$$serializer.INSTANCE;
        return new KSerializer[]{HalfModalState.f28697i[0], stringSerializer, intSerializer, BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer, BuiltinSerializersKt.getNullable(buttonConfig$$serializer), BuiltinSerializersKt.getNullable(buttonConfig$$serializer)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public HalfModalState deserialize(@NotNull Decoder decoder) {
        int i10;
        ButtonConfig buttonConfig;
        ButtonConfig buttonConfig2;
        String str;
        int i11;
        HalfModalType halfModalType;
        String str2;
        Integer num;
        String str3;
        char c10;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor);
        KSerializer[] kSerializerArr = HalfModalState.f28697i;
        int i12 = 7;
        int i13 = 6;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            HalfModalType halfModalType2 = (HalfModalType) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 0, kSerializerArr[0], null);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(descriptor, 1);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(descriptor, 2);
            Integer num2 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 3, IntSerializer.INSTANCE, null);
            String str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 4, StringSerializer.INSTANCE, null);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(descriptor, 5);
            ButtonConfig$$serializer buttonConfig$$serializer = ButtonConfig$$serializer.INSTANCE;
            ButtonConfig buttonConfig3 = (ButtonConfig) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 6, buttonConfig$$serializer, null);
            halfModalType = halfModalType2;
            str2 = strDecodeStringElement;
            buttonConfig = (ButtonConfig) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 7, buttonConfig$$serializer, null);
            buttonConfig2 = buttonConfig3;
            str3 = strDecodeStringElement2;
            num = num2;
            str = str4;
            i10 = iDecodeIntElement;
            i11 = 255;
        } else {
            boolean z10 = true;
            int iDecodeIntElement2 = 0;
            ButtonConfig buttonConfig4 = null;
            ButtonConfig buttonConfig5 = null;
            HalfModalType halfModalType3 = null;
            String strDecodeStringElement3 = null;
            Integer num3 = null;
            String strDecodeStringElement4 = null;
            String str5 = null;
            int i14 = 0;
            while (z10) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z10 = false;
                        i12 = 7;
                        break;
                    case 0:
                        halfModalType3 = (HalfModalType) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 0, kSerializerArr[0], halfModalType3);
                        i14 |= 1;
                        i12 = 7;
                        i13 = 6;
                        break;
                    case 1:
                        i14 |= 2;
                        strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(descriptor, 1);
                        i12 = 7;
                        break;
                    case 2:
                        c10 = 3;
                        iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(descriptor, 2);
                        i14 |= 4;
                        i12 = 7;
                        break;
                    case 3:
                        c10 = 3;
                        num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 3, IntSerializer.INSTANCE, num3);
                        i14 |= 8;
                        i12 = 7;
                        break;
                    case 4:
                        str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 4, StringSerializer.INSTANCE, str5);
                        i14 |= 16;
                        break;
                    case 5:
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(descriptor, 5);
                        i14 |= 32;
                        break;
                    case 6:
                        buttonConfig5 = (ButtonConfig) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, i13, ButtonConfig$$serializer.INSTANCE, buttonConfig5);
                        i14 |= 64;
                        break;
                    case 7:
                        buttonConfig4 = (ButtonConfig) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, i12, ButtonConfig$$serializer.INSTANCE, buttonConfig4);
                        i14 |= 128;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i10 = iDecodeIntElement2;
            buttonConfig = buttonConfig4;
            buttonConfig2 = buttonConfig5;
            str = str5;
            i11 = i14;
            halfModalType = halfModalType3;
            str2 = strDecodeStringElement3;
            num = num3;
            str3 = strDecodeStringElement4;
        }
        compositeDecoderBeginStructure.endStructure(descriptor);
        return new HalfModalState(i11, halfModalType, str2, i10, num, str, str3, buttonConfig2, buttonConfig, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    @NotNull
    public SerialDescriptor getDescriptor() {
        return f28706a;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(@NotNull Encoder encoder, @NotNull HalfModalState value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor);
        HalfModalState.write$Self(value, compositeEncoderBeginStructure, descriptor);
        compositeEncoderBeginStructure.endStructure(descriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
