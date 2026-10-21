package com.bbva.qrcreator.creator.impl;

import android.graphics.Bitmap;
import bk.p;
import com.bbva.qrcreator.creator.Creator;
import com.bbva.qrcreator.creator.CreatorKt;
import com.bbva.qrcreator.model.Barcode;
import com.budiyev.android.codescanner.BarcodeUtils;
import com.google.zxing.EncodeHintType;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: BarcodeCreator.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"Lcom/bbva/qrcreator/creator/impl/BarcodeCreator;", "Lcom/bbva/qrcreator/creator/Creator;", "Lcom/bbva/qrcreator/model/Barcode;", "()V", "create", "Landroid/graphics/Bitmap;", "params", "qrcreator_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class BarcodeCreator implements Creator<Barcode> {
    @Override // com.bbva.qrcreator.creator.Creator
    @NotNull
    public Bitmap create(@NotNull Barcode params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return CreatorKt.matrixToBitmap(BarcodeUtils.encodeBitMatrix(params.getContent(), params.getFormat().toZxing$qrcreator_release(), params.getWidth(), params.getHeight(), p.mapOf(TuplesKt.to(EncodeHintType.CHARACTER_SET, "UTF-8"))), params.getColorDark(), params.getColorLight());
    }
}
