package com.bbva.component.ui.login.model;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
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

/* JADX INFO: compiled from: LoginCredentialsState.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"com/bbva/component/ui/login/model/DocumentListConfig.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/bbva/component/ui/login/model/DocumentListConfig;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "component-ui-login_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
public final class DocumentListConfig$$serializer implements GeneratedSerializer<DocumentListConfig> {

    @NotNull
    public static final DocumentListConfig$$serializer INSTANCE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f28530a;

    static {
        DocumentListConfig$$serializer documentListConfig$$serializer = new DocumentListConfig$$serializer();
        INSTANCE = documentListConfig$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.bbva.component.ui.login.model.DocumentListConfig", documentListConfig$$serializer, 4);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement(FirebaseAnalytics.Param.ITEMS, false);
        pluginGeneratedSerialDescriptor.addElement("negativeButtonTitle", false);
        pluginGeneratedSerialDescriptor.addElement("positiveButtonTitle", false);
        f28530a = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = DocumentListConfig.f28525e;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, kSerializerArr[1], stringSerializer, stringSerializer};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public DocumentListConfig deserialize(@NotNull Decoder decoder) {
        int i10;
        String str;
        List list;
        String str2;
        String strDecodeStringElement;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor);
        KSerializer[] kSerializerArr = DocumentListConfig.f28525e;
        String strDecodeStringElement2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(descriptor, 0);
            List list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 1, kSerializerArr[1], null);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(descriptor, 2);
            list = list2;
            str = strDecodeStringElement3;
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(descriptor, 3);
            str2 = strDecodeStringElement4;
            i10 = 15;
        } else {
            boolean z10 = true;
            int i11 = 0;
            List list3 = null;
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            while (z10) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor);
                if (iDecodeElementIndex == -1) {
                    z10 = false;
                } else if (iDecodeElementIndex == 0) {
                    strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(descriptor, 0);
                    i11 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    list3 = (List) compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 1, kSerializerArr[1], list3);
                    i11 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(descriptor, 2);
                    i11 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(descriptor, 3);
                    i11 |= 8;
                }
            }
            i10 = i11;
            str = strDecodeStringElement2;
            list = list3;
            str2 = strDecodeStringElement5;
            strDecodeStringElement = strDecodeStringElement6;
        }
        compositeDecoderBeginStructure.endStructure(descriptor);
        return new DocumentListConfig(i10, str, list, str2, strDecodeStringElement, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    @NotNull
    public SerialDescriptor getDescriptor() {
        return f28530a;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(@NotNull Encoder encoder, @NotNull DocumentListConfig value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor);
        DocumentListConfig.write$Self(value, compositeEncoderBeginStructure, descriptor);
        compositeEncoderBeginStructure.endStructure(descriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
