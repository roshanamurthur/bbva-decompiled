package com.bbva.qrcreator.creator;

import android.graphics.Bitmap;
import android.graphics.Color;
import com.google.zxing.common.BitMatrix;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Creator.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a \u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005¨\u0006\u0007"}, d2 = {"matrixToBitmap", "Landroid/graphics/Bitmap;", "matrix", "Lcom/google/zxing/common/BitMatrix;", "darkColor", "", "lightColor", "qrcreator_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class CreatorKt {
    @NotNull
    public static final Bitmap matrixToBitmap(@Nullable BitMatrix bitMatrix, @NotNull String darkColor, @NotNull String lightColor) {
        Intrinsics.checkNotNullParameter(darkColor, "darkColor");
        Intrinsics.checkNotNullParameter(lightColor, "lightColor");
        if (bitMatrix == null) {
            throw new IllegalStateException();
        }
        int color = Color.parseColor(darkColor);
        int color2 = Color.parseColor(lightColor);
        int height = bitMatrix.getHeight() * bitMatrix.getWidth();
        int[] iArr = new int[height];
        for (int i10 = 0; i10 < height; i10++) {
            iArr[i10] = bitMatrix.get(i10 % bitMatrix.getWidth(), i10 / bitMatrix.getWidth()) ? color : color2;
        }
        SystemBitmap systemBitmap = SystemBitmap.INSTANCE;
        return systemBitmap.createBitmapObject(iArr, bitMatrix.getWidth(), bitMatrix.getHeight(), systemBitmap.getBitmapConfig());
    }
}
