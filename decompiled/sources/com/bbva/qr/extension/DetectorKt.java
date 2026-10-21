package com.bbva.qr.extension;

import com.bbva.qr.model.input.BarcodeType;
import com.google.mlkit.vision.barcode.BarcodeScannerOptions;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Detector.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0016\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000¨\u0006\u0005"}, d2 = {"Lcom/google/mlkit/vision/barcode/BarcodeScannerOptions$Builder;", "Lcom/bbva/qr/model/input/BarcodeType;", "codeType", "Lcom/google/mlkit/vision/barcode/BarcodeScannerOptions;", "addBarcodeFormats", "qr_release"}, k = 2, mv = {1, 8, 0})
public final class DetectorKt {

    /* JADX INFO: compiled from: Detector.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BarcodeType.values().length];
            try {
                iArr[BarcodeType.QR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BarcodeType.BARCODE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final BarcodeScannerOptions addBarcodeFormats(@NotNull BarcodeScannerOptions.Builder builder, @Nullable BarcodeType barcodeType) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        if (barcodeType != null) {
            int i10 = WhenMappings.$EnumSwitchMapping$0[barcodeType.ordinal()];
            if (i10 == 1) {
                builder.setBarcodeFormats(256, new int[0]);
            } else {
                if (i10 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                builder.setBarcodeFormats(3819, new int[0]);
            }
        }
        BarcodeScannerOptions barcodeScannerOptionsBuild = builder.build();
        Intrinsics.checkNotNullExpressionValue(barcodeScannerOptionsBuild, "build()");
        return barcodeScannerOptionsBuild;
    }
}
