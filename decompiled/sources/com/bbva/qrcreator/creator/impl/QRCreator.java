package com.bbva.qrcreator.creator.impl;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import bk.q;
import com.bbva.qrcreator.creator.Creator;
import com.bbva.qrcreator.creator.CreatorKt;
import com.bbva.qrcreator.model.Qr;
import com.budiyev.android.codescanner.BarcodeUtils;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: QRCreator.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"Lcom/bbva/qrcreator/creator/impl/QRCreator;", "Lcom/bbva/qrcreator/creator/Creator;", "Lcom/bbva/qrcreator/model/Qr;", "()V", "create", "Landroid/graphics/Bitmap;", "params", "qrcreator_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class QRCreator implements Creator<Qr> {
    @Override // com.bbva.qrcreator.creator.Creator
    @NotNull
    public Bitmap create(@NotNull Qr params) {
        Intrinsics.checkNotNullParameter(params, "params");
        Bitmap bitmapMatrixToBitmap = CreatorKt.matrixToBitmap(BarcodeUtils.encodeBitMatrix(params.getContent(), BarcodeFormat.QR_CODE, params.getWidth(), params.getHeight(), q.mapOf(TuplesKt.to(EncodeHintType.CHARACTER_SET, "UTF-8"), TuplesKt.to(EncodeHintType.ERROR_CORRECTION, params.getCorrectionLevel().toZxing$qrcreator_release()), TuplesKt.to(EncodeHintType.MARGIN, Integer.valueOf(params.getMargin())))), params.getColorDark(), params.getColorLight());
        if (params.getLogo() == null) {
            return bitmapMatrixToBitmap;
        }
        float width = (bitmapMatrixToBitmap.getWidth() / 2.0f) - (params.getLogo().getWidth() / 2.0f);
        float height = (bitmapMatrixToBitmap.getHeight() / 2.0f) - (params.getLogo().getHeight() / 2.0f);
        Bitmap copy = bitmapMatrixToBitmap.copy(Bitmap.Config.ARGB_8888, true);
        new Canvas(copy).drawBitmap(params.getLogo(), width, height, (Paint) null);
        Intrinsics.checkNotNullExpressionValue(copy, "copy");
        return copy;
    }
}
