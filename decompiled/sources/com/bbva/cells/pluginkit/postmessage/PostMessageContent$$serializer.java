package com.bbva.cells.pluginkit.postmessage;

import androidx.exifinterface.media.ExifInterface;
import com.bbva.notifications.model.constants.BanxicoConstants;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Model.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000*\u0004\b\u0001\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0004B\u0015\b\u0017\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0018\u0010\f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\rHÖ\u0001¢\u0006\u0002\u0010\u000eJ\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\u001f\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003HÖ\u0001J\u0018\u0010\u0017\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\rHÖ\u0001¢\u0006\u0002\u0010\u000eR\u0014\u0010\b\u001a\u00020\t8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018"}, d2 = {"com/bbva/cells/pluginkit/postmessage/PostMessageContent.$serializer", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/bbva/cells/pluginkit/postmessage/PostMessageContent;", "()V", "typeSerial0", "Lkotlinx/serialization/KSerializer;", "(Lkotlinx/serialization/KSerializer;)V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "typeParametersSerializers", "pluginkit_release"}, k = 1, mv = {1, 4, 1})
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
public final class PostMessageContent$$serializer<T> implements GeneratedSerializer<PostMessageContent<T>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PluginGeneratedSerialDescriptor f26843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ KSerializer f26844b;

    public PostMessageContent$$serializer() {
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ PostMessageContent$$serializer(KSerializer<T> typeSerial0) {
        Intrinsics.checkNotNullParameter(typeSerial0, "typeSerial0");
        this.f26844b = typeSerial0;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.bbva.cells.pluginkit.postmessage.PostMessageContent", this, 4);
        pluginGeneratedSerialDescriptor.addElement("pluginName", false);
        pluginGeneratedSerialDescriptor.addElement("origin", false);
        pluginGeneratedSerialDescriptor.addElement("action", false);
        pluginGeneratedSerialDescriptor.addElement(BanxicoConstants.KEY_HISTORICAL_PAYLOAD, false);
        this.f26843a = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, this.f26844b};
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public PostMessageContent<T> deserialize(@NotNull Decoder decoder) {
        String str;
        Object objDecodeSerializableElement;
        int i10;
        String str2;
        String str3;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = this.f26843a;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
        boolean zDecodeSequentially = compositeDecoderBeginStructure.decodeSequentially();
        KSerializer kSerializer = this.f26844b;
        if (!zDecodeSequentially) {
            String strDecodeStringElement = null;
            Object objDecodeSerializableElement2 = null;
            String strDecodeStringElement2 = null;
            String strDecodeStringElement3 = null;
            int i11 = 0;
            while (true) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                if (iDecodeElementIndex == -1) {
                    str = strDecodeStringElement;
                    objDecodeSerializableElement = objDecodeSerializableElement2;
                    i10 = i11;
                    str2 = strDecodeStringElement2;
                    str3 = strDecodeStringElement3;
                    break;
                }
                if (iDecodeElementIndex == 0) {
                    strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                    i11 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
                    i11 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 2);
                    i11 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    objDecodeSerializableElement2 = compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 3, kSerializer, objDecodeSerializableElement2);
                    i11 |= 8;
                }
            }
        } else {
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 1);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 2);
            str = strDecodeStringElement4;
            objDecodeSerializableElement = compositeDecoderBeginStructure.decodeSerializableElement(pluginGeneratedSerialDescriptor, 3, kSerializer);
            i10 = Integer.MAX_VALUE;
            str2 = strDecodeStringElement6;
            str3 = strDecodeStringElement5;
        }
        compositeDecoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
        return new PostMessageContent<>(i10, str, str3, str2, objDecodeSerializableElement, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    @NotNull
    public SerialDescriptor getDescriptor() {
        return this.f26843a;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(@NotNull Encoder encoder, @NotNull PostMessageContent<T> value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = this.f26843a;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
        PostMessageContent.write$Self(value, compositeEncoderBeginStructure, pluginGeneratedSerialDescriptor, this.f26844b);
        compositeEncoderBeginStructure.endStructure(pluginGeneratedSerialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return new KSerializer[]{this.f26844b};
    }
}
