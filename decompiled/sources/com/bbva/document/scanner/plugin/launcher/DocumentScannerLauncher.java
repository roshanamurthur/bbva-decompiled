package com.bbva.document.scanner.plugin.launcher;

import android.app.Activity;
import com.bbva.androidtoolkit.plugin.activity.result.ActivityLauncher;
import com.bbva.androidtoolkit.plugin.activity.result.ActivityResult;
import com.bbva.androidtoolkit.plugin.activity.result.ActivityResultRequest;
import com.bbva.document.scanner.CaptureOptions;
import com.bbva.document.scanner.DocumentScanner;
import com.bbva.document.scanner.PreviewOptions;
import com.bbva.document.scanner.presentation.DocumentScannerRequest;
import com.bbva.document.scanner.presentation.capture.ScanResult;
import com.bbva.document.scanner.presentation.preview.PreviewResult;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DocumentScannerLauncher.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0013\u0010\u0014J,\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0016J,\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u000b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b0\u0006H\u0016¨\u0006\u0015"}, d2 = {"Lcom/bbva/document/scanner/plugin/launcher/DocumentScannerLauncher;", "Lcom/bbva/document/scanner/plugin/launcher/DocumentScannerActivityLauncher;", "Landroid/app/Activity;", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "Lcom/bbva/document/scanner/CaptureOptions;", "options", "Lkotlin/Function1;", "Lcom/bbva/document/scanner/presentation/capture/ScanResult;", "", "onResult", "scanDocument", "Lcom/bbva/document/scanner/PreviewOptions;", "Lcom/bbva/document/scanner/presentation/preview/PreviewResult;", "previewDocument", "Lcom/bbva/document/scanner/DocumentScanner;", "documentScanner", "Lkotlin/Function0;", "Lcom/bbva/androidtoolkit/plugin/activity/result/ActivityLauncher;", "activityLauncher", "<init>", "(Lcom/bbva/document/scanner/DocumentScanner;Lkotlin/jvm/functions/Function0;)V", "document-scanner-plugin_release"}, k = 1, mv = {1, 8, 0})
public final class DocumentScannerLauncher implements DocumentScannerActivityLauncher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final DocumentScanner f29150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Function0<ActivityLauncher> f29151b;

    /* JADX INFO: compiled from: DocumentScannerLauncher.kt */
    public static final class a extends Lambda implements Function0<ActivityLauncher> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f29152p0 = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final ActivityLauncher invoke() {
            return new ActivityLauncher();
        }
    }

    /* JADX INFO: compiled from: DocumentScannerLauncher.kt */
    public static final class b extends Lambda implements Function1<ActivityResultRequest.Builder, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ DocumentScannerRequest f29153p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(DocumentScannerRequest documentScannerRequest) {
            super(1);
            this.f29153p0 = documentScannerRequest;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ActivityResultRequest.Builder builder) {
            ActivityResultRequest.Builder create = builder;
            Intrinsics.checkNotNullParameter(create, "$this$create");
            DocumentScannerRequest documentScannerRequest = this.f29153p0;
            create.setUri(documentScannerRequest.getUri());
            create.setExtras(documentScannerRequest.getParameters());
            create.setTarget(documentScannerRequest.getTarget());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: DocumentScannerLauncher.kt */
    public static final class c extends Lambda implements Function1<ActivityResult, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function1<PreviewResult, Unit> f29154p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ DocumentScannerLauncher f29155q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(Function1<? super PreviewResult, Unit> function1, DocumentScannerLauncher documentScannerLauncher) {
            super(1);
            this.f29154p0 = function1;
            this.f29155q0 = documentScannerLauncher;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ActivityResult activityResult) {
            ActivityResult it = activityResult;
            Intrinsics.checkNotNullParameter(it, "it");
            boolean z10 = it instanceof ActivityResult.Success;
            Function1<PreviewResult, Unit> function1 = this.f29154p0;
            if (z10) {
                function1.invoke(this.f29155q0.f29150a.previewResult(((ActivityResult.Success) it).getIntent()));
            } else if (it instanceof ActivityResult.Cancel) {
                function1.invoke(PreviewResult.Cancel.INSTANCE);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: DocumentScannerLauncher.kt */
    public static final class d extends Lambda implements Function1<ActivityResultRequest.Builder, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ DocumentScannerRequest f29156p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(DocumentScannerRequest documentScannerRequest) {
            super(1);
            this.f29156p0 = documentScannerRequest;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ActivityResultRequest.Builder builder) {
            ActivityResultRequest.Builder create = builder;
            Intrinsics.checkNotNullParameter(create, "$this$create");
            DocumentScannerRequest documentScannerRequest = this.f29156p0;
            create.setUri(documentScannerRequest.getUri());
            create.setExtras(documentScannerRequest.getParameters());
            create.setTarget(documentScannerRequest.getTarget());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: DocumentScannerLauncher.kt */
    public static final class e extends Lambda implements Function1<ActivityResult, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function1<ScanResult, Unit> f29157p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ DocumentScannerLauncher f29158q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(Function1<? super ScanResult, Unit> function1, DocumentScannerLauncher documentScannerLauncher) {
            super(1);
            this.f29157p0 = function1;
            this.f29158q0 = documentScannerLauncher;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ActivityResult activityResult) {
            ActivityResult it = activityResult;
            Intrinsics.checkNotNullParameter(it, "it");
            boolean z10 = it instanceof ActivityResult.Success;
            Function1<ScanResult, Unit> function1 = this.f29157p0;
            if (z10) {
                function1.invoke(this.f29158q0.f29150a.documentResult(((ActivityResult.Success) it).getIntent()));
            } else if (it instanceof ActivityResult.Cancel) {
                function1.invoke(ScanResult.ScanCancelled.INSTANCE);
            }
            return Unit.INSTANCE;
        }
    }

    public DocumentScannerLauncher(@NotNull DocumentScanner documentScanner, @NotNull Function0<ActivityLauncher> activityLauncher) {
        Intrinsics.checkNotNullParameter(documentScanner, "documentScanner");
        Intrinsics.checkNotNullParameter(activityLauncher, "activityLauncher");
        this.f29150a = documentScanner;
        this.f29151b = activityLauncher;
    }

    @Override // com.bbva.document.scanner.plugin.launcher.DocumentScannerActivityLauncher
    public void previewDocument(@NotNull Activity activity, @NotNull PreviewOptions options, @NotNull Function1<? super PreviewResult, Unit> onResult) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        this.f29151b.invoke().create(new b(this.f29150a.previewDocument(options))).listen(new c(onResult, this)).launch(activity);
    }

    @Override // com.bbva.document.scanner.plugin.launcher.DocumentScannerActivityLauncher
    public void scanDocument(@NotNull Activity activity, @NotNull CaptureOptions options, @NotNull Function1<? super ScanResult, Unit> onResult) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        this.f29151b.invoke().create(new d(this.f29150a.scanDocument(options))).listen(new e(onResult, this)).launch(activity);
    }

    public /* synthetic */ DocumentScannerLauncher(DocumentScanner documentScanner, Function0 function0, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(documentScanner, (i10 & 2) != 0 ? a.f29152p0 : function0);
    }
}
