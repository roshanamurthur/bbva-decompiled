package com.bbva.component.ui.login.model;

import com.bbva.nativesettings.common.Constants;
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

/* JADX INFO: compiled from: LoginCredentialsState.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"com/bbva/component/ui/login/model/InputFieldConfig.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/bbva/component/ui/login/model/InputFieldConfig;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "component-ui-login_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
public final class InputFieldConfig$$serializer implements GeneratedSerializer<InputFieldConfig> {

    @NotNull
    public static final InputFieldConfig$$serializer INSTANCE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f28547a;

    static {
        InputFieldConfig$$serializer inputFieldConfig$$serializer = new InputFieldConfig$$serializer();
        INSTANCE = inputFieldConfig$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.bbva.component.ui.login.model.InputFieldConfig", inputFieldConfig$$serializer, 10);
        pluginGeneratedSerialDescriptor.addElement("inputFieldIdentifier", false);
        pluginGeneratedSerialDescriptor.addElement("hint", false);
        pluginGeneratedSerialDescriptor.addElement("showLeftIcon", false);
        pluginGeneratedSerialDescriptor.addElement("inputType", false);
        pluginGeneratedSerialDescriptor.addElement("maxLength", false);
        pluginGeneratedSerialDescriptor.addElement("mask", true);
        pluginGeneratedSerialDescriptor.addElement("customCharactersRegex", true);
        pluginGeneratedSerialDescriptor.addElement("validations", true);
        pluginGeneratedSerialDescriptor.addElement(Constants.ACCESSIBILITY, true);
        pluginGeneratedSerialDescriptor.addElement("hasFocus", true);
        f28547a = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = InputFieldConfig.f28536k;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{kSerializerArr[0], ResourceType$$serializer.INSTANCE, booleanSerializer, stringSerializer, IntSerializer.INSTANCE, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(kSerializerArr[7]), BuiltinSerializersKt.getNullable(Accessibility$$serializer.INSTANCE), booleanSerializer};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public InputFieldConfig deserialize(@NotNull Decoder decoder) {
        boolean zDecodeBooleanElement;
        ResourceType resourceType;
        List list;
        InputFieldIdentifier inputFieldIdentifier;
        Accessibility accessibility;
        String str;
        String str2;
        int i10;
        int i11;
        boolean z10;
        String str3;
        char c10;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor);
        KSerializer[] kSerializerArr = InputFieldConfig.f28536k;
        int i12 = 9;
        int i13 = 6;
        int i14 = 8;
        int i15 = 0;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            InputFieldIdentifier inputFieldIdentifier2 = (InputFieldIdentifier) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 0, kSerializerArr[0], null);
            ResourceType resourceType2 = (ResourceType) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 1, ResourceType$$serializer.INSTANCE, null);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(descriptor, 2);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(descriptor, 3);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(descriptor, 4);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 5, stringSerializer, null);
            String str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 6, stringSerializer, null);
            List list2 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 7, kSerializerArr[7], null);
            Accessibility accessibility2 = (Accessibility) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 8, Accessibility$$serializer.INSTANCE, null);
            list = list2;
            inputFieldIdentifier = inputFieldIdentifier2;
            zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(descriptor, 9);
            str = str5;
            str2 = str4;
            str3 = strDecodeStringElement;
            accessibility = accessibility2;
            i11 = iDecodeIntElement;
            z10 = zDecodeBooleanElement2;
            i10 = 1023;
            resourceType = resourceType2;
        } else {
            boolean z11 = true;
            boolean zDecodeBooleanElement3 = false;
            boolean zDecodeBooleanElement4 = false;
            List list3 = null;
            Accessibility accessibility3 = null;
            String str6 = null;
            String str7 = null;
            InputFieldIdentifier inputFieldIdentifier3 = null;
            ResourceType resourceType3 = null;
            String strDecodeStringElement2 = null;
            int iDecodeIntElement2 = 0;
            while (z11) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z11 = false;
                        i12 = 9;
                        i13 = 6;
                        i14 = 8;
                        break;
                    case 0:
                        inputFieldIdentifier3 = (InputFieldIdentifier) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 0, kSerializerArr[0], inputFieldIdentifier3);
                        i15 |= 1;
                        i12 = 9;
                        i13 = 6;
                        i14 = 8;
                        break;
                    case 1:
                        i15 |= 2;
                        resourceType3 = (ResourceType) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 1, ResourceType$$serializer.INSTANCE, resourceType3);
                        i12 = 9;
                        i13 = 6;
                        break;
                    case 2:
                        i15 |= 4;
                        zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(descriptor, 2);
                        i12 = 9;
                        break;
                    case 3:
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(descriptor, 3);
                        i15 |= 8;
                        i12 = 9;
                        break;
                    case 4:
                        c10 = 5;
                        iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(descriptor, 4);
                        i15 |= 16;
                        i12 = 9;
                        break;
                    case 5:
                        c10 = 5;
                        str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 5, StringSerializer.INSTANCE, str7);
                        i15 |= 32;
                        i12 = 9;
                        break;
                    case 6:
                        str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, i13, StringSerializer.INSTANCE, str6);
                        i15 |= 64;
                        break;
                    case 7:
                        list3 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 7, kSerializerArr[7], list3);
                        i15 |= 128;
                        break;
                    case 8:
                        accessibility3 = (Accessibility) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, i14, Accessibility$$serializer.INSTANCE, accessibility3);
                        i15 |= 256;
                        break;
                    case 9:
                        zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(descriptor, i12);
                        i15 |= 512;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            zDecodeBooleanElement = zDecodeBooleanElement3;
            resourceType = resourceType3;
            list = list3;
            inputFieldIdentifier = inputFieldIdentifier3;
            accessibility = accessibility3;
            str = str6;
            str2 = str7;
            i10 = i15;
            i11 = iDecodeIntElement2;
            z10 = zDecodeBooleanElement4;
            str3 = strDecodeStringElement2;
        }
        compositeDecoderBeginStructure.endStructure(descriptor);
        return new InputFieldConfig(i10, inputFieldIdentifier, resourceType, z10, str3, i11, str2, str, list, accessibility, zDecodeBooleanElement, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    @NotNull
    public SerialDescriptor getDescriptor() {
        return f28547a;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(@NotNull Encoder encoder, @NotNull InputFieldConfig value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor);
        InputFieldConfig.write$Self(value, compositeEncoderBeginStructure, descriptor);
        compositeEncoderBeginStructure.endStructure(descriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
