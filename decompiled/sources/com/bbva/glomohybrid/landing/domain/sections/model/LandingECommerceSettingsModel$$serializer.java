package com.bbva.glomohybrid.landing.domain.sections.model;

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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: LandingSettingsModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"com/bbva/glomohybrid/landing/domain/sections/model/LandingECommerceSettingsModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/bbva/glomohybrid/landing/domain/sections/model/LandingECommerceSettingsModel;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
public final class LandingECommerceSettingsModel$$serializer implements GeneratedSerializer<LandingECommerceSettingsModel> {

    @NotNull
    public static final LandingECommerceSettingsModel$$serializer INSTANCE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f32758a;

    static {
        LandingECommerceSettingsModel$$serializer landingECommerceSettingsModel$$serializer = new LandingECommerceSettingsModel$$serializer();
        INSTANCE = landingECommerceSettingsModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.bbva.glomohybrid.landing.domain.sections.model.LandingECommerceSettingsModel", landingECommerceSettingsModel$$serializer, 3);
        pluginGeneratedSerialDescriptor.addElement("isActive", true);
        pluginGeneratedSerialDescriptor.addElement("isActiveByDefault", true);
        pluginGeneratedSerialDescriptor.addElement("hasCards", true);
        f32758a = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public KSerializer<?>[] childSerializers() {
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(booleanSerializer), booleanSerializer, booleanSerializer};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public LandingECommerceSettingsModel deserialize(@NotNull Decoder decoder) {
        boolean zDecodeBooleanElement;
        boolean z10;
        int i10;
        Boolean bool;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            Boolean bool2 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 0, BooleanSerializer.INSTANCE, null);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(descriptor, 1);
            bool = bool2;
            zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(descriptor, 2);
            z10 = zDecodeBooleanElement2;
            i10 = 7;
        } else {
            boolean z11 = true;
            boolean zDecodeBooleanElement3 = false;
            int i11 = 0;
            Boolean bool3 = null;
            boolean zDecodeBooleanElement4 = false;
            while (z11) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor);
                if (iDecodeElementIndex == -1) {
                    z11 = false;
                } else if (iDecodeElementIndex == 0) {
                    bool3 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 0, BooleanSerializer.INSTANCE, bool3);
                    i11 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(descriptor, 1);
                    i11 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(descriptor, 2);
                    i11 |= 4;
                }
            }
            zDecodeBooleanElement = zDecodeBooleanElement3;
            z10 = zDecodeBooleanElement4;
            i10 = i11;
            bool = bool3;
        }
        compositeDecoderBeginStructure.endStructure(descriptor);
        return new LandingECommerceSettingsModel(i10, bool, z10, zDecodeBooleanElement, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    @NotNull
    public SerialDescriptor getDescriptor() {
        return f32758a;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(@NotNull Encoder encoder, @NotNull LandingECommerceSettingsModel value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor);
        LandingECommerceSettingsModel.write$Self(value, compositeEncoderBeginStructure, descriptor);
        compositeEncoderBeginStructure.endStructure(descriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
