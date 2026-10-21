package com.bbva.component.ui.login.model;

import com.bbva.cells.componentkit.model.dsl.TextSettings;
import com.bbva.cells.componentkit.model.dsl.TextSettings$$serializer;
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
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"com/bbva/component/ui/login/model/BiometricState.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/bbva/component/ui/login/model/BiometricState;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "component-ui-login_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
public final class BiometricState$$serializer implements GeneratedSerializer<BiometricState> {

    @NotNull
    public static final BiometricState$$serializer INSTANCE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f28516a;

    static {
        BiometricState$$serializer biometricState$$serializer = new BiometricState$$serializer();
        INSTANCE = biometricState$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.bbva.component.ui.login.model.BiometricState", biometricState$$serializer, 3);
        pluginGeneratedSerialDescriptor.addElement("primaryButton", true);
        pluginGeneratedSerialDescriptor.addElement("secondaryButton", true);
        pluginGeneratedSerialDescriptor.addElement("accessingBiometricsMessage", true);
        f28516a = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public KSerializer<?>[] childSerializers() {
        Button$$serializer button$$serializer = Button$$serializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(button$$serializer), BuiltinSerializersKt.getNullable(button$$serializer), BuiltinSerializersKt.getNullable(TextSettings$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public BiometricState deserialize(@NotNull Decoder decoder) {
        int i10;
        Button button;
        Button button2;
        TextSettings textSettings;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor);
        Button button3 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            Button$$serializer button$$serializer = Button$$serializer.INSTANCE;
            Button button4 = (Button) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 0, button$$serializer, null);
            button2 = (Button) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 1, button$$serializer, null);
            textSettings = (TextSettings) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 2, TextSettings$$serializer.INSTANCE, null);
            i10 = 7;
            button = button4;
        } else {
            boolean z10 = true;
            int i11 = 0;
            Button button5 = null;
            TextSettings textSettings2 = null;
            while (z10) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor);
                if (iDecodeElementIndex == -1) {
                    z10 = false;
                } else if (iDecodeElementIndex == 0) {
                    button3 = (Button) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 0, Button$$serializer.INSTANCE, button3);
                    i11 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    button5 = (Button) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 1, Button$$serializer.INSTANCE, button5);
                    i11 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    textSettings2 = (TextSettings) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 2, TextSettings$$serializer.INSTANCE, textSettings2);
                    i11 |= 4;
                }
            }
            i10 = i11;
            button = button3;
            button2 = button5;
            textSettings = textSettings2;
        }
        compositeDecoderBeginStructure.endStructure(descriptor);
        return new BiometricState(i10, button, button2, textSettings, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    @NotNull
    public SerialDescriptor getDescriptor() {
        return f28516a;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(@NotNull Encoder encoder, @NotNull BiometricState value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor);
        BiometricState.write$Self(value, compositeEncoderBeginStructure, descriptor);
        compositeEncoderBeginStructure.endStructure(descriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
