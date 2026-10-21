package com.bbva.qrcreator;

import android.graphics.Bitmap;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.qrcreator.creator.impl.BarcodeCreator;
import com.bbva.qrcreator.creator.impl.QRCreator;
import com.bbva.qrcreator.formatter.Formatter;
import com.bbva.qrcreator.model.Barcode;
import com.bbva.qrcreator.model.Qr;
import com.google.mlkit.common.sdkinternal.OptionalModuleUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CodeCreator.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J'\u0010\u0003\u001a\u0002H\u0007\"\u0004\b\u0000\u0010\u00072\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00070\t¢\u0006\u0002\u0010\nJ\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rJ'\u0010\u000b\u001a\u0002H\u0007\"\u0004\b\u0000\u0010\u00072\u0006\u0010\f\u001a\u00020\r2\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00070\t¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/bbva/qrcreator/CodeCreator;", "", "()V", "createBarcode", "Landroid/graphics/Bitmap;", OptionalModuleUtils.BARCODE, "Lcom/bbva/qrcreator/model/Barcode;", ExifInterface.GPS_DIRECTION_TRUE, "format", "Lcom/bbva/qrcreator/formatter/Formatter;", "(Lcom/bbva/qrcreator/model/Barcode;Lcom/bbva/qrcreator/formatter/Formatter;)Ljava/lang/Object;", "createQrCode", "params", "Lcom/bbva/qrcreator/model/Qr;", "(Lcom/bbva/qrcreator/model/Qr;Lcom/bbva/qrcreator/formatter/Formatter;)Ljava/lang/Object;", "qrcreator_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CodeCreator {
    @NotNull
    public final Bitmap createBarcode(@NotNull Barcode barcode) throws IllegalStateException {
        Intrinsics.checkNotNullParameter(barcode, "barcode");
        return new BarcodeCreator().create(barcode);
    }

    @NotNull
    public final Bitmap createQrCode(@NotNull Qr params) throws IllegalStateException {
        Intrinsics.checkNotNullParameter(params, "params");
        return new QRCreator().create(params);
    }

    public final <T> T createBarcode(@NotNull Barcode barcode, @NotNull Formatter<T> format) throws IllegalStateException {
        Intrinsics.checkNotNullParameter(barcode, "barcode");
        Intrinsics.checkNotNullParameter(format, "format");
        return format.format(new BarcodeCreator().create(barcode));
    }

    public final <T> T createQrCode(@NotNull Qr params, @NotNull Formatter<T> format) throws IllegalStateException {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(format, "format");
        return format.format(new QRCreator().create(params));
    }
}
