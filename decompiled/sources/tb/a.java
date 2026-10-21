package tb;

import com.bbva.qr.activity.ScannerActivity;
import com.bbva.qr.extension.BarcodeKt;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: ScannerActivity.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class a extends Lambda implements Function1<List<? extends Barcode>, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ ScannerActivity f93498p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ScannerActivity scannerActivity) {
        super(1);
        this.f93498p0 = scannerActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(List<? extends Barcode> list) {
        List<? extends Barcode> it = list;
        Intrinsics.checkNotNullParameter(it, "it");
        if (!it.isEmpty()) {
            Barcode barcode = (Barcode) CollectionsKt___CollectionsKt.first((List) it);
            ScannerActivity scannerActivity = this.f93498p0;
            BarcodeKt.setAsIntentResult(barcode, scannerActivity, ScannerActivity.class, Integer.valueOf(scannerActivity.f36278s0));
        }
        return Unit.INSTANCE;
    }
}
