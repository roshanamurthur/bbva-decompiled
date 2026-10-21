package com.bbva.component.ui.login.model;

import com.bbva.cells.componentkit.model.dsl.TextSettings;
import com.bbva.cells.componentkit.model.dsl.TextSettings$$serializer;
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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: RememberedUserState.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"com/bbva/component/ui/login/model/RememberedUserState.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/bbva/component/ui/login/model/RememberedUserState;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "component-ui-login_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
public final class RememberedUserState$$serializer implements GeneratedSerializer<RememberedUserState> {

    @NotNull
    public static final RememberedUserState$$serializer INSTANCE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f28582a;

    static {
        RememberedUserState$$serializer rememberedUserState$$serializer = new RememberedUserState$$serializer();
        INSTANCE = rememberedUserState$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.bbva.component.ui.login.model.RememberedUserState", rememberedUserState$$serializer, 8);
        pluginGeneratedSerialDescriptor.addElement(AuthConstants.IMAGE, false);
        pluginGeneratedSerialDescriptor.addElement("greeting", false);
        pluginGeneratedSerialDescriptor.addElement("userName", true);
        pluginGeneratedSerialDescriptor.addElement("passwordInputFieldConfig", true);
        pluginGeneratedSerialDescriptor.addElement("rememberPassword", true);
        pluginGeneratedSerialDescriptor.addElement("primaryButton", true);
        pluginGeneratedSerialDescriptor.addElement("biometricState", true);
        pluginGeneratedSerialDescriptor.addElement("rememberedUserType", false);
        f28582a = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = RememberedUserState.f28573i;
        TextSettings$$serializer textSettings$$serializer = TextSettings$$serializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(RememberedUserImage$$serializer.INSTANCE), textSettings$$serializer, BuiltinSerializersKt.getNullable(textSettings$$serializer), BuiltinSerializersKt.getNullable(InputFieldConfig$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(ButtonLink$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(Button$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(BiometricState$$serializer.INSTANCE), kSerializerArr[7]};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public RememberedUserState deserialize(@NotNull Decoder decoder) {
        int i10;
        RememberedUserType rememberedUserType;
        BiometricState biometricState;
        Button button;
        ButtonLink buttonLink;
        RememberedUserImage rememberedUserImage;
        TextSettings textSettings;
        TextSettings textSettings2;
        InputFieldConfig inputFieldConfig;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor);
        KSerializer[] kSerializerArr = RememberedUserState.f28573i;
        int i11 = 6;
        RememberedUserImage rememberedUserImage2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            RememberedUserImage rememberedUserImage3 = (RememberedUserImage) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 0, RememberedUserImage$$serializer.INSTANCE, null);
            TextSettings$$serializer textSettings$$serializer = TextSettings$$serializer.INSTANCE;
            TextSettings textSettings3 = (TextSettings) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 1, textSettings$$serializer, null);
            TextSettings textSettings4 = (TextSettings) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 2, textSettings$$serializer, null);
            InputFieldConfig inputFieldConfig2 = (InputFieldConfig) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 3, InputFieldConfig$$serializer.INSTANCE, null);
            ButtonLink buttonLink2 = (ButtonLink) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 4, ButtonLink$$serializer.INSTANCE, null);
            Button button2 = (Button) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 5, Button$$serializer.INSTANCE, null);
            BiometricState biometricState2 = (BiometricState) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 6, BiometricState$$serializer.INSTANCE, null);
            rememberedUserType = (RememberedUserType) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 7, kSerializerArr[7], null);
            rememberedUserImage = rememberedUserImage3;
            biometricState = biometricState2;
            button = button2;
            inputFieldConfig = inputFieldConfig2;
            buttonLink = buttonLink2;
            textSettings2 = textSettings4;
            i10 = 255;
            textSettings = textSettings3;
        } else {
            boolean z10 = true;
            int i12 = 0;
            RememberedUserType rememberedUserType2 = null;
            BiometricState biometricState3 = null;
            Button button3 = null;
            ButtonLink buttonLink3 = null;
            TextSettings textSettings5 = null;
            TextSettings textSettings6 = null;
            InputFieldConfig inputFieldConfig3 = null;
            while (z10) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z10 = false;
                        i11 = 6;
                        break;
                    case 0:
                        rememberedUserImage2 = (RememberedUserImage) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 0, RememberedUserImage$$serializer.INSTANCE, rememberedUserImage2);
                        i12 |= 1;
                        i11 = 6;
                        break;
                    case 1:
                        textSettings5 = (TextSettings) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 1, TextSettings$$serializer.INSTANCE, textSettings5);
                        i12 |= 2;
                        i11 = 6;
                        break;
                    case 2:
                        textSettings6 = (TextSettings) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 2, TextSettings$$serializer.INSTANCE, textSettings6);
                        i12 |= 4;
                        i11 = 6;
                        break;
                    case 3:
                        inputFieldConfig3 = (InputFieldConfig) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 3, InputFieldConfig$$serializer.INSTANCE, inputFieldConfig3);
                        i12 |= 8;
                        i11 = 6;
                        break;
                    case 4:
                        buttonLink3 = (ButtonLink) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 4, ButtonLink$$serializer.INSTANCE, buttonLink3);
                        i12 |= 16;
                        i11 = 6;
                        break;
                    case 5:
                        button3 = (Button) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 5, Button$$serializer.INSTANCE, button3);
                        i12 |= 32;
                        break;
                    case 6:
                        biometricState3 = (BiometricState) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, i11, BiometricState$$serializer.INSTANCE, biometricState3);
                        i12 |= 64;
                        break;
                    case 7:
                        rememberedUserType2 = (RememberedUserType) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 7, kSerializerArr[7], rememberedUserType2);
                        i12 |= 128;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i10 = i12;
            rememberedUserType = rememberedUserType2;
            biometricState = biometricState3;
            button = button3;
            buttonLink = buttonLink3;
            rememberedUserImage = rememberedUserImage2;
            textSettings = textSettings5;
            textSettings2 = textSettings6;
            inputFieldConfig = inputFieldConfig3;
        }
        compositeDecoderBeginStructure.endStructure(descriptor);
        return new RememberedUserState(i10, rememberedUserImage, textSettings, textSettings2, inputFieldConfig, buttonLink, button, biometricState, rememberedUserType, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    @NotNull
    public SerialDescriptor getDescriptor() {
        return f28582a;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(@NotNull Encoder encoder, @NotNull RememberedUserState value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor);
        RememberedUserState.write$Self(value, compositeEncoderBeginStructure, descriptor);
        compositeEncoderBeginStructure.endStructure(descriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
