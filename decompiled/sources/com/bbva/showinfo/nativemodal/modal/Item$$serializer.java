package com.bbva.showinfo.nativemodal.modal;

import com.bbva.glomohybrid.logs.LogKeysKt;
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

/* JADX INFO: compiled from: NativeListModalConfiguration.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"com/bbva/showinfo/nativemodal/modal/Item.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/bbva/showinfo/nativemodal/modal/Item;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "showinfo_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
public final class Item$$serializer implements GeneratedSerializer<Item> {

    @NotNull
    public static final Item$$serializer INSTANCE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f36546a;

    static {
        Item$$serializer item$$serializer = new Item$$serializer();
        INSTANCE = item$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.bbva.showinfo.nativemodal.modal.Item", item$$serializer, 5);
        pluginGeneratedSerialDescriptor.addElement(LogKeysKt.TAG, false);
        pluginGeneratedSerialDescriptor.addElement("text", false);
        pluginGeneratedSerialDescriptor.addElement("_accessibleText", false);
        pluginGeneratedSerialDescriptor.addElement("accessibleTextOnClick", false);
        pluginGeneratedSerialDescriptor.addElement("selected", true);
        f36546a = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BooleanSerializer.INSTANCE};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public Item deserialize(@NotNull Decoder decoder) {
        boolean zDecodeBooleanElement;
        int i10;
        String str;
        String str2;
        String str3;
        String str4;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(descriptor, 0);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(descriptor, 1);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 2, stringSerializer, null);
            str = strDecodeStringElement;
            str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 3, stringSerializer, null);
            zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(descriptor, 4);
            str3 = str5;
            str2 = strDecodeStringElement2;
            i10 = 31;
        } else {
            boolean z10 = true;
            boolean zDecodeBooleanElement2 = false;
            String strDecodeStringElement3 = null;
            String strDecodeStringElement4 = null;
            String str6 = null;
            String str7 = null;
            int i11 = 0;
            while (z10) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor);
                if (iDecodeElementIndex == -1) {
                    z10 = false;
                } else if (iDecodeElementIndex == 0) {
                    strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(descriptor, 0);
                    i11 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(descriptor, 1);
                    i11 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 2, StringSerializer.INSTANCE, str6);
                    i11 |= 4;
                } else if (iDecodeElementIndex == 3) {
                    str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(descriptor, 3, StringSerializer.INSTANCE, str7);
                    i11 |= 8;
                } else {
                    if (iDecodeElementIndex != 4) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(descriptor, 4);
                    i11 |= 16;
                }
            }
            zDecodeBooleanElement = zDecodeBooleanElement2;
            i10 = i11;
            str = strDecodeStringElement3;
            str2 = strDecodeStringElement4;
            str3 = str6;
            str4 = str7;
        }
        compositeDecoderBeginStructure.endStructure(descriptor);
        return new Item(i10, str, str2, str3, str4, zDecodeBooleanElement, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    @NotNull
    public SerialDescriptor getDescriptor() {
        return f36546a;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(@NotNull Encoder encoder, @NotNull Item value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor);
        Item.write$Self$showinfo_release(value, compositeEncoderBeginStructure, descriptor);
        compositeEncoderBeginStructure.endStructure(descriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
