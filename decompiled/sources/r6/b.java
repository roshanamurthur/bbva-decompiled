package r6;

import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.androidtoolkit.plugin.response.Errors;
import com.bbva.document.scanner.plugin.command.ScanDocumentCommand;
import com.bbva.document.scanner.plugin.model.DocumentScannerErrors;
import com.bbva.document.scanner.presentation.capture.ScanResult;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: ScanDocumentCommand.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends Lambda implements Function1<ScanResult, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ ScanDocumentCommand f92939p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ CommandCallback f92940q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ScanDocumentCommand scanDocumentCommand, CommandCallback commandCallback) {
        super(1);
        this.f92939p0 = scanDocumentCommand;
        this.f92940q0 = commandCallback;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ScanResult scanResult) {
        ScanResult scanResult2 = scanResult;
        Intrinsics.checkNotNullParameter(scanResult2, "scanResult");
        boolean z10 = scanResult2 instanceof ScanResult.ScanSuccess;
        CommandCallback commandCallback = this.f92940q0;
        if (z10) {
            File file = new File(((ScanResult.ScanSuccess) scanResult2).getFile());
            ScanDocumentCommand scanDocumentCommand = this.f92939p0;
            BuildersKt__Builders_commonKt.launch$default((CoroutineScope) scanDocumentCommand.f29147p0.getValue(), null, null, new d(scanDocumentCommand, file, commandCallback, null), 3, null);
        } else if (scanResult2 instanceof ScanResult.ScanError) {
            commandCallback.sendError(new DocumentScannerErrors.ScanError(((ScanResult.ScanError) scanResult2).getErrorMessage()));
        } else if (scanResult2 instanceof ScanResult.ScanCancelled) {
            commandCallback.sendError(Errors.ErrorCanceled);
        }
        return Unit.INSTANCE;
    }
}
