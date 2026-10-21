package com.bbva.qr.decoder;

import android.content.Context;
import android.graphics.Bitmap;
import com.bbva.ethermobile.help.kit.result.Result;
import com.bbva.qr.model.input.DecoderSettings;
import com.bbva.qr.model.input.ImageSourceType;
import com.bbva.qr.model.response.BarcodeResult;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ImageDecoder.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/qr/decoder/BarcodeImageDecoder;", "Lcom/bbva/qr/decoder/ImageDecoder;", "()V", "qr_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class BarcodeImageDecoder implements ImageDecoder {

    @NotNull
    public static final BarcodeImageDecoder INSTANCE = new BarcodeImageDecoder();

    @Override // com.bbva.qr.decoder.ImageDecoder
    @Nullable
    public Object decode(@NotNull Context context, @NotNull String str, @Nullable ImageSourceType imageSourceType, @NotNull Continuation<? super Bitmap> continuation) {
        return ImageDecoder.DefaultImpls.decode(this, context, str, imageSourceType, continuation);
    }

    @Override // com.bbva.qr.decoder.ImageDecoder
    @Nullable
    public Object detectInDecodedImage(@NotNull Context context, @NotNull DecoderSettings decoderSettings, @NotNull Continuation<? super Result<BarcodeResult>> continuation) {
        return ImageDecoder.DefaultImpls.detectInDecodedImage(this, context, decoderSettings, continuation);
    }
}
