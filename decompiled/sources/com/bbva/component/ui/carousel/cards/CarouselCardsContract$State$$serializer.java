package com.bbva.component.ui.carousel.cards;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bbva.component.ui.carousel.cards.model.CarouselCardItem$$serializer;
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
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CarouselCardsContract.kt */
/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"com/bbva/component/ui/carousel/cards/CarouselCardsContract.State.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/bbva/component/ui/carousel/cards/CarouselCardsContract$State;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "component-ui-carousel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
public final class CarouselCardsContract$State$$serializer implements GeneratedSerializer<CarouselCardsContract.State> {
    public static final int $stable = 0;

    @NotNull
    public static final CarouselCardsContract$State$$serializer INSTANCE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f28255a;

    static {
        CarouselCardsContract$State$$serializer carouselCardsContract$State$$serializer = new CarouselCardsContract$State$$serializer();
        INSTANCE = carouselCardsContract$State$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.bbva.component.ui.carousel.cards.CarouselCardsContract.State", carouselCardsContract$State$$serializer, 2);
        pluginGeneratedSerialDescriptor.addElement("header", false);
        pluginGeneratedSerialDescriptor.addElement(FirebaseAnalytics.Param.ITEMS, false);
        f28255a = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{CarouselCardsContract$State$Header$$serializer.INSTANCE, new ArrayListSerializer(CarouselCardItem$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public CarouselCardsContract.State deserialize(@NotNull Decoder decoder) {
        Object objDecodeSerializableElement;
        Object objDecodeSerializableElement2;
        int i10;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            objDecodeSerializableElement = compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 0, CarouselCardsContract$State$Header$$serializer.INSTANCE, null);
            objDecodeSerializableElement2 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 1, new ArrayListSerializer(CarouselCardItem$$serializer.INSTANCE), null);
            i10 = 3;
        } else {
            boolean z10 = true;
            int i11 = 0;
            objDecodeSerializableElement = null;
            Object objDecodeSerializableElement3 = null;
            while (z10) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(descriptor);
                if (iDecodeElementIndex == -1) {
                    z10 = false;
                } else if (iDecodeElementIndex == 0) {
                    objDecodeSerializableElement = compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 0, CarouselCardsContract$State$Header$$serializer.INSTANCE, objDecodeSerializableElement);
                    i11 |= 1;
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    objDecodeSerializableElement3 = compositeDecoderBeginStructure.decodeSerializableElement(descriptor, 1, new ArrayListSerializer(CarouselCardItem$$serializer.INSTANCE), objDecodeSerializableElement3);
                    i11 |= 2;
                }
            }
            objDecodeSerializableElement2 = objDecodeSerializableElement3;
            i10 = i11;
        }
        compositeDecoderBeginStructure.endStructure(descriptor);
        return new CarouselCardsContract.State(i10, (CarouselCardsContract.State.Header) objDecodeSerializableElement, (List) objDecodeSerializableElement2, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    @NotNull
    public SerialDescriptor getDescriptor() {
        return f28255a;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(@NotNull Encoder encoder, @NotNull CarouselCardsContract.State value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor);
        CarouselCardsContract.State.write$Self(value, compositeEncoderBeginStructure, descriptor);
        compositeEncoderBeginStructure.endStructure(descriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
