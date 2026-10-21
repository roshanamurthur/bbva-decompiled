package com.bbva.image.compressor;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CompressorFactory.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lcom/bbva/image/compressor/CompressorFactory;", "", "()V", "create", "Lcom/bbva/image/compressor/ImageCompressor;", "compressor", "", "factor", "", "image-transform_release"}, k = 1, mv = {1, 4, 2})
public final class CompressorFactory {

    @NotNull
    public static final CompressorFactory INSTANCE = new CompressorFactory();

    public static /* synthetic */ ImageCompressor create$default(CompressorFactory compressorFactory, String str, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 100;
        }
        return compressorFactory.create(str, i10);
    }

    @NotNull
    public final ImageCompressor create(@NotNull String compressor, int factor) {
        Intrinsics.checkNotNullParameter(compressor, "compressor");
        return (compressor.hashCode() == 111145 && compressor.equals(PngCompressor.ID)) ? new PngCompressor() : new JpegCompressor(factor);
    }
}
