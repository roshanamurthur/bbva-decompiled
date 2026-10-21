package com.bbva.qr.decoder;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import com.bbva.ethermobile.help.kit.result.Result;
import com.bbva.qr.model.input.DecoderSettings;
import com.bbva.qr.model.input.ImageSourceType;
import com.bbva.qr.model.response.BarcodeResult;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ImageDecoder.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J+\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lcom/bbva/qr/decoder/Base64Decoder;", "Lcom/bbva/qr/decoder/ImageDecoder;", "()V", "decode", "Landroid/graphics/Bitmap;", "context", "Landroid/content/Context;", "content", "", "contentType", "Lcom/bbva/qr/model/input/ImageSourceType;", "(Landroid/content/Context;Ljava/lang/String;Lcom/bbva/qr/model/input/ImageSourceType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "qr_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Base64Decoder implements ImageDecoder {

    @NotNull
    public static final Base64Decoder INSTANCE = new Base64Decoder();

    @Override // com.bbva.qr.decoder.ImageDecoder
    @Nullable
    public Object decode(@NotNull Context context, @NotNull String str, @Nullable ImageSourceType imageSourceType, @NotNull Continuation<? super Bitmap> continuation) {
        byte[] bArrDecode = Base64.decode(str, 0);
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
        Intrinsics.checkNotNullExpressionValue(bitmapDecodeByteArray, "decodeByteArray(imageBytes, 0, imageBytes.size)");
        return bitmapDecodeByteArray;
    }

    @Override // com.bbva.qr.decoder.ImageDecoder
    @Nullable
    public Object detectInDecodedImage(@NotNull Context context, @NotNull DecoderSettings decoderSettings, @NotNull Continuation<? super Result<BarcodeResult>> continuation) {
        return ImageDecoder.DefaultImpls.detectInDecodedImage(this, context, decoderSettings, continuation);
    }
}
