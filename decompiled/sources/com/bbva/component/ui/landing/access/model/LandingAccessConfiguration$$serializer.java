package com.bbva.component.ui.landing.access.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bbva.cells.componentkit.model.dsl.TextSettings;
import com.bbva.cells.componentkit.model.dsl.TextSettings$$serializer;
import com.bbva.zoomauth.facialauth.constant.AuthConstants;
import com.google.firebase.dynamiclinks.DynamicLink;
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

/* JADX INFO: compiled from: LandingAccessConfiguration.kt */
/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"com/bbva/component/ui/landing/access/model/LandingAccessConfiguration.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/bbva/component/ui/landing/access/model/LandingAccessConfiguration;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "component-ui-landing-access_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
public final class LandingAccessConfiguration$$serializer implements GeneratedSerializer<LandingAccessConfiguration> {
    public static final int $stable = 0;

    @NotNull
    public static final LandingAccessConfiguration$$serializer INSTANCE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f28413a;

    static {
        LandingAccessConfiguration$$serializer landingAccessConfiguration$$serializer = new LandingAccessConfiguration$$serializer();
        INSTANCE = landingAccessConfiguration$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.bbva.component.ui.landing.access.model.LandingAccessConfiguration", landingAccessConfiguration$$serializer, 6);
        pluginGeneratedSerialDescriptor.addElement(AuthConstants.IMAGE, false);
        pluginGeneratedSerialDescriptor.addElement("greeting", false);
        pluginGeneratedSerialDescriptor.addElement("name", true);
        pluginGeneratedSerialDescriptor.addElement("extendedGreeting", false);
        pluginGeneratedSerialDescriptor.addElement(DynamicLink.Builder.KEY_LINK, true);
        pluginGeneratedSerialDescriptor.addElement("button", true);
        f28413a = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public KSerializer<?>[] childSerializers() {
        TextSettings$$serializer textSettings$$serializer = TextSettings$$serializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(LandingImage$$serializer.INSTANCE), textSettings$$serializer, BuiltinSerializersKt.getNullable(textSettings$$serializer), BuiltinSerializersKt.getNullable(textSettings$$serializer), BuiltinSerializersKt.getNullable(LandingAccessLink$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(LandingAccessButton$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public LandingAccessConfiguration deserialize(@NotNull Decoder decoder) {
        int i10;
        LandingImage landingImage;
        TextSettings textSettings;
        TextSettings textSettings2;
        TextSettings textSettings3;
        LandingAccessLink landingAccessLink;
        LandingAccessButton landingAccessButton;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor);
        int i11 = 5;
        LandingImage landingImage2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            LandingImage landingImage3 = (LandingImage) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 0, LandingImage$$serializer.INSTANCE, null);
            TextSettings$$serializer textSettings$$serializer = TextSettings$$serializer.INSTANCE;
            TextSettings textSettings4 = (TextSettings) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 1, textSettings$$serializer, null);
            TextSettings textSettings5 = (TextSettings) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 2, textSettings$$serializer, null);
            TextSettings textSettings6 = (TextSettings) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 3, textSettings$$serializer, null);
            LandingAccessLink landingAccessLink2 = (LandingAccessLink) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 4, LandingAccessLink$$serializer.INSTANCE, null);
            landingImage = landingImage3;
            landingAccessButton = (LandingAccessButton) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 5, LandingAccessButton$$serializer.INSTANCE, null);
            textSettings3 = textSettings6;
            landingAccessLink = landingAccessLink2;
            textSettings2 = textSettings5;
            textSettings = textSettings4;
            i10 = 63;
        } else {
            boolean z10 = true;
            int i12 = 0;
            TextSettings textSettings7 = null;
            TextSettings textSettings8 = null;
            TextSettings textSettings9 = null;
            LandingAccessLink landingAccessLink3 = null;
            LandingAccessButton landingAccessButton2 = null;
            while (z10) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z10 = false;
                        i11 = 5;
                        break;
                    case 0:
                        landingImage2 = (LandingImage) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 0, LandingImage$$serializer.INSTANCE, landingImage2);
                        i12 |= 1;
                        i11 = 5;
                        break;
                    case 1:
                        textSettings7 = (TextSettings) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 1, TextSettings$$serializer.INSTANCE, textSettings7);
                        i12 |= 2;
                        break;
                    case 2:
                        textSettings8 = (TextSettings) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 2, TextSettings$$serializer.INSTANCE, textSettings8);
                        i12 |= 4;
                        break;
                    case 3:
                        textSettings9 = (TextSettings) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 3, TextSettings$$serializer.INSTANCE, textSettings9);
                        i12 |= 8;
                        break;
                    case 4:
                        landingAccessLink3 = (LandingAccessLink) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 4, LandingAccessLink$$serializer.INSTANCE, landingAccessLink3);
                        i12 |= 16;
                        break;
                    case 5:
                        landingAccessButton2 = (LandingAccessButton) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, i11, LandingAccessButton$$serializer.INSTANCE, landingAccessButton2);
                        i12 |= 32;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i10 = i12;
            landingImage = landingImage2;
            textSettings = textSettings7;
            textSettings2 = textSettings8;
            textSettings3 = textSettings9;
            landingAccessLink = landingAccessLink3;
            landingAccessButton = landingAccessButton2;
        }
        compositeDecoderBeginStructure.endStructure(descriptor);
        return new LandingAccessConfiguration(i10, landingImage, textSettings, textSettings2, textSettings3, landingAccessLink, landingAccessButton, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    @NotNull
    public SerialDescriptor getDescriptor() {
        return f28413a;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(@NotNull Encoder encoder, @NotNull LandingAccessConfiguration value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor);
        LandingAccessConfiguration.write$Self$component_ui_landing_access_release(value, compositeEncoderBeginStructure, descriptor);
        compositeEncoderBeginStructure.endStructure(descriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
