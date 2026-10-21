package com.bbva.component.ui.login.model;

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

/* JADX INFO: compiled from: LoginCredentialsState.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"com/bbva/component/ui/login/model/Accessibility.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/bbva/component/ui/login/model/Accessibility;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "component-ui-login_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
public final class Accessibility$$serializer implements GeneratedSerializer<Accessibility> {

    @NotNull
    public static final Accessibility$$serializer INSTANCE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f28512a;

    static {
        Accessibility$$serializer accessibility$$serializer = new Accessibility$$serializer();
        INSTANCE = accessibility$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.bbva.component.ui.login.model.Accessibility", accessibility$$serializer, 4);
        pluginGeneratedSerialDescriptor.addElement("description", false);
        pluginGeneratedSerialDescriptor.addElement("rightIcon", true);
        pluginGeneratedSerialDescriptor.addElement("passwordIconShow", true);
        pluginGeneratedSerialDescriptor.addElement("passwordIconHide", true);
        f28512a = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public KSerializer<?>[] childSerializers() {
        ResourceType$$serializer resourceType$$serializer = ResourceType$$serializer.INSTANCE;
        return new KSerializer[]{resourceType$$serializer, BuiltinSerializersKt.getNullable(resourceType$$serializer), BuiltinSerializersKt.getNullable(resourceType$$serializer), BuiltinSerializersKt.getNullable(resourceType$$serializer)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public Accessibility deserialize(@NotNull Decoder decoder) {
        int i10;
        ResourceType resourceType;
        ResourceType resourceType2;
        ResourceType resourceType3;
        ResourceType resourceType4;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor);
        ResourceType resourceType5 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            ResourceType$$serializer resourceType$$serializer = ResourceType$$serializer.INSTANCE;
            ResourceType resourceType6 = (ResourceType) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 0, resourceType$$serializer, null);
            ResourceType resourceType7 = (ResourceType) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 1, resourceType$$serializer, null);
            ResourceType resourceType8 = (ResourceType) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 2, resourceType$$serializer, null);
            resourceType4 = (ResourceType) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 3, resourceType$$serializer, null);
            i10 = 15;
            resourceType3 = resourceType8;
            resourceType2 = resourceType7;
            resourceType = resourceType6;
        } else {
            boolean z10 = true;
            int i11 = 0;
            ResourceType resourceType9 = null;
            ResourceType resourceType10 = null;
            ResourceType resourceType11 = null;
            while (z10) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor);
                if (iDecodeElementIndex == -1) {
                    z10 = false;
                } else if (iDecodeElementIndex == 0) {
                    resourceType5 = (ResourceType) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 0, ResourceType$$serializer.INSTANCE, resourceType5);
                    i11 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    resourceType9 = (ResourceType) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 1, ResourceType$$serializer.INSTANCE, resourceType9);
                    i11 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    resourceType10 = (ResourceType) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 2, ResourceType$$serializer.INSTANCE, resourceType10);
                    i11 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    resourceType11 = (ResourceType) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 3, ResourceType$$serializer.INSTANCE, resourceType11);
                    i11 |= 8;
                }
            }
            i10 = i11;
            resourceType = resourceType5;
            resourceType2 = resourceType9;
            resourceType3 = resourceType10;
            resourceType4 = resourceType11;
        }
        compositeDecoderBeginStructure.endStructure(descriptor);
        return new Accessibility(i10, resourceType, resourceType2, resourceType3, resourceType4, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    @NotNull
    public SerialDescriptor getDescriptor() {
        return f28512a;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(@NotNull Encoder encoder, @NotNull Accessibility value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor);
        Accessibility.write$Self(value, compositeEncoderBeginStructure, descriptor);
        compositeEncoderBeginStructure.endStructure(descriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
