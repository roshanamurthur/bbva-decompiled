package r6;

import android.app.Activity;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.document.scanner.plugin.command.ScanDocumentCommand;
import com.bbva.document.scanner.plugin.launcher.DocumentScannerActivityLauncher;
import com.bbva.document.scanner.plugin.model.CaptureDocumentParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: ScanDocumentCommand.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends Lambda implements Function2<DocumentScannerActivityLauncher, Activity, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ ScanDocumentCommand f92941p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ CaptureDocumentParams f92942q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ String f92943r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ CommandCallback f92944s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ScanDocumentCommand scanDocumentCommand, CaptureDocumentParams captureDocumentParams, String str, CommandCallback commandCallback) {
        super(2);
        this.f92941p0 = scanDocumentCommand;
        this.f92942q0 = captureDocumentParams;
        this.f92943r0 = str;
        this.f92944s0 = commandCallback;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(DocumentScannerActivityLauncher documentScannerActivityLauncher, Activity activity) {
        DocumentScannerActivityLauncher withScannerRequest = documentScannerActivityLauncher;
        Activity it = activity;
        Intrinsics.checkNotNullParameter(withScannerRequest, "$this$withScannerRequest");
        Intrinsics.checkNotNullParameter(it, "it");
        ScanDocumentCommand scanDocumentCommand = this.f92941p0;
        withScannerRequest.scanDocument(it, ScanDocumentCommand.access$toCaptureOptions(scanDocumentCommand, this.f92942q0, this.f92943r0), new b(scanDocumentCommand, this.f92944s0));
        return Unit.INSTANCE;
    }
}
