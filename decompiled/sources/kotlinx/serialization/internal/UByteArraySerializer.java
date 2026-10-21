package kotlinx.serialization.internal;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PrimitiveArraysSerializers.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0006J\u0015\u0010\u0007\u001a\u00020\u0002H\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJ(\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0012H\u0014J*\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u000fH\u0014ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u001a\u001a\u00020\u000f*\u00020\u0002H\u0014ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0016\u0010\u001d\u001a\u00020\u0005*\u00020\u0002H\u0014ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001f\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006 "}, d2 = {"Lkotlinx/serialization/internal/UByteArraySerializer;", "Lkotlinx/serialization/KSerializer;", "Lkotlin/UByteArray;", "Lkotlinx/serialization/internal/PrimitiveArraySerializer;", "Lkotlin/UByte;", "Lkotlinx/serialization/internal/UByteArrayBuilder;", "()V", "empty", "empty-TcUX1vc", "()[B", "readElement", "", "decoder", "Lkotlinx/serialization/encoding/CompositeDecoder;", FirebaseAnalytics.Param.INDEX, "", "builder", "checkIndex", "", "writeContent", "encoder", "Lkotlinx/serialization/encoding/CompositeEncoder;", "content", "size", "writeContent-Coi6ktg", "(Lkotlinx/serialization/encoding/CompositeEncoder;[BI)V", "collectionSize", "collectionSize-GBYM_sE", "([B)I", "toBuilder", "toBuilder-GBYM_sE", "([B)Lkotlinx/serialization/internal/UByteArrayBuilder;", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ExperimentalSerializationApi
@ExperimentalUnsignedTypes
@PublishedApi
public final class UByteArraySerializer extends PrimitiveArraySerializer<UByte, UByteArray, UByteArrayBuilder> {

    @NotNull
    public static final UByteArraySerializer INSTANCE = new UByteArraySerializer();

    private UByteArraySerializer() {
        super(BuiltinSerializersKt.serializer(UByte.INSTANCE));
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public /* bridge */ /* synthetic */ int collectionSize(Object obj) {
        return m6026collectionSizeGBYM_sE(((UByteArray) obj).getF79396p0());
    }

    /* JADX INFO: renamed from: collectionSize-GBYM_sE, reason: not valid java name */
    public int m6026collectionSizeGBYM_sE(@NotNull byte[] collectionSize) {
        Intrinsics.checkNotNullParameter(collectionSize, "$this$collectionSize");
        return UByteArray.m5559getSizeimpl(collectionSize);
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public /* bridge */ /* synthetic */ UByteArray empty() {
        return UByteArray.m5551boximpl(m6027emptyTcUX1vc());
    }

    @NotNull
    /* JADX INFO: renamed from: empty-TcUX1vc, reason: not valid java name */
    public byte[] m6027emptyTcUX1vc() {
        return UByteArray.m5552constructorimpl(0);
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public /* bridge */ /* synthetic */ Object toBuilder(Object obj) {
        return m6028toBuilderGBYM_sE(((UByteArray) obj).getF79396p0());
    }

    @NotNull
    /* JADX INFO: renamed from: toBuilder-GBYM_sE, reason: not valid java name */
    public UByteArrayBuilder m6028toBuilderGBYM_sE(@NotNull byte[] toBuilder) {
        Intrinsics.checkNotNullParameter(toBuilder, "$this$toBuilder");
        return new UByteArrayBuilder(toBuilder, null);
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public /* bridge */ /* synthetic */ void writeContent(CompositeEncoder compositeEncoder, UByteArray uByteArray, int i10) {
        m6029writeContentCoi6ktg(compositeEncoder, uByteArray.getF79396p0(), i10);
    }

    /* JADX INFO: renamed from: writeContent-Coi6ktg, reason: not valid java name */
    public void m6029writeContentCoi6ktg(@NotNull CompositeEncoder encoder, @NotNull byte[] content, int size) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i10 = 0; i10 < size; i10++) {
            encoder.encodeInlineElement(getDescriptor(), i10).encodeByte(UByteArray.m5558getw2LRezQ(content, i10));
        }
    }

    @Override // kotlinx.serialization.internal.PrimitiveArraySerializer
    public void readElement(@NotNull CompositeDecoder decoder, int index, @NotNull UByteArrayBuilder builder, boolean checkIndex) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.m6024append7apg3OU$kotlinx_serialization_core(UByte.m5545constructorimpl(decoder.decodeInlineElement(getDescriptor(), index).decodeByte()));
    }
}
