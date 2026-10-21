package com.bbva.qr.extension;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.bbva.qr.model.input.BarcodeType;
import com.google.mlkit.vision.barcode.BarcodeScanner;
import com.google.mlkit.vision.barcode.BarcodeScannerOptions;
import com.google.mlkit.vision.barcode.BarcodeScanning;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mk.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Context.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001\u001a\u0016\u0010\u0004\u001a\u00020\u0005*\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0000¨\u0006\b"}, d2 = {"dpToPx", "", "Landroid/content/Context;", "dpValue", "generateBarcodeDetector", "Lcom/google/mlkit/vision/barcode/BarcodeScanner;", "barcodeType", "Lcom/bbva/qr/model/input/BarcodeType;", "qr_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ContextKt {
    public static final int dpToPx(@NotNull Context context, int i10) {
        DisplayMetrics displayMetrics;
        Intrinsics.checkNotNullParameter(context, "<this>");
        Resources resources = context.getResources();
        return c.roundToInt(i10 * ((resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) ? 0.0f : displayMetrics.density));
    }

    @NotNull
    public static final BarcodeScanner generateBarcodeDetector(@NotNull Context context, @Nullable BarcodeType barcodeType) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        BarcodeScanner client = BarcodeScanning.getClient(DetectorKt.addBarcodeFormats(new BarcodeScannerOptions.Builder(), barcodeType));
        Intrinsics.checkNotNullExpressionValue(client, "getClient(\n        Barco…ormats(barcodeType)\n    )");
        return client;
    }
}
