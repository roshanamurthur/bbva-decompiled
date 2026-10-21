package com.bbva.qr.scanner.detectors;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.gms.tasks.Tasks;
import com.google.mlkit.vision.barcode.BarcodeScanner;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.google.mlkit.vision.common.InputImage;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Detector.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0018\u0010\u000b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u000e"}, d2 = {"Lcom/bbva/qr/scanner/detectors/Detector;", "", "Lcom/google/mlkit/vision/common/InputImage;", TypedValues.AttributesType.S_FRAME, "", "detect", "Lcom/google/mlkit/vision/barcode/BarcodeScanner;", "delegate", "Lkotlin/Function1;", "", "Lcom/google/mlkit/vision/barcode/common/Barcode;", "success", "<init>", "(Lcom/google/mlkit/vision/barcode/BarcodeScanner;Lkotlin/jvm/functions/Function1;)V", "qr_release"}, k = 1, mv = {1, 8, 0})
public final class Detector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final BarcodeScanner f36316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Function1<List<? extends Barcode>, Unit> f36317b;

    /* JADX WARN: Multi-variable type inference failed */
    public Detector(@NotNull BarcodeScanner delegate, @NotNull Function1<? super List<? extends Barcode>, Unit> success) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(success, "success");
        this.f36316a = delegate;
        this.f36317b = success;
    }

    public final void detect(@NotNull InputImage frame) {
        Intrinsics.checkNotNullParameter(frame, "frame");
        List<? extends Barcode> barcodes = (List) Tasks.await(this.f36316a.process(frame));
        Intrinsics.checkNotNullExpressionValue(barcodes, "barcodes");
        this.f36317b.invoke(barcodes);
    }
}
