package com.bbva.document.scanner.plugin.command;

import android.app.Application;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.androidtoolkit.plugin.filesystem.WebFile;
import com.bbva.document.scanner.CaptureOptions;
import com.bbva.document.scanner.Compression;
import com.bbva.document.scanner.Ratio;
import com.bbva.document.scanner.plugin.model.CaptureDocumentParams;
import com.bbva.document.scanner.plugin.model.FiltersParamKt;
import com.bbva.document.scanner.plugin.model.NotificationParamKt;
import com.bbva.document.scanner.plugin.model.RatioParamKt;
import com.bbva.document.scanner.plugin.validators.ScanDocumentParamsValidator;
import ik.e;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import mx.openpay.library.domain.util.Constant;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import r6.c;

/* JADX INFO: compiled from: ScanDocumentCommand.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¨\u0006\u000b"}, d2 = {"Lcom/bbva/document/scanner/plugin/command/ScanDocumentCommand;", "Lcom/bbva/document/scanner/plugin/command/ActivityAwareCommand;", "Lcom/bbva/document/scanner/plugin/model/CaptureDocumentParams;", "params", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "callback", "", "execute", "<init>", "()V", "Companion", "document-scanner-plugin_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nScanDocumentCommand.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScanDocumentCommand.kt\ncom/bbva/document/scanner/plugin/command/ScanDocumentCommand\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,113:1\n1#2:114\n*E\n"})
public final class ScanDocumentCommand extends ActivityAwareCommand<CaptureDocumentParams> {

    @NotNull
    public static final String EXTENSION = "extension";

    @NotNull
    public static final String ID = "scan";

    @NotNull
    public static final String NAME = "name";

    @NotNull
    public static final String SIZE = "size";

    @NotNull
    public static final String URI = "uri";

    @NotNull
    public static final String URL = "url";

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final Lazy f29147p0;

    /* JADX INFO: compiled from: ScanDocumentCommand.kt */
    public static final class a extends Lambda implements Function0<CoroutineScope> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f29148p0 = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final CoroutineScope invoke() {
            return CoroutineScopeKt.MainScope();
        }
    }

    public ScanDocumentCommand() {
        super(CaptureDocumentParams.class, new ScanDocumentParamsValidator());
        this.f29147p0 = LazyKt__LazyJVMKt.lazy(a.f29148p0);
    }

    public static final CaptureOptions access$toCaptureOptions(ScanDocumentCommand scanDocumentCommand, CaptureDocumentParams captureDocumentParams, String str) {
        scanDocumentCommand.getClass();
        Ratio ratio = RatioParamKt.toRatio(captureDocumentParams.getRatio());
        String compression = captureDocumentParams.getCompression();
        return new CaptureOptions(str, captureDocumentParams.getButtonText(), ratio, NotificationParamKt.toNotificationConfig(captureDocumentParams.getNotification()), compression != null ? new Compression(compression, 0, 2, null) : new Compression(null, 0, 3, null), FiltersParamKt.toImageTransformations(captureDocumentParams.getFilters()), captureDocumentParams.getProcessingImageText());
    }

    public static final JSONObject access$toResponse(ScanDocumentCommand scanDocumentCommand, WebFile webFile) throws JSONException {
        scanDocumentCommand.getClass();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", webFile.getFile().getName());
        jSONObject.put("size", webFile.getFile().length());
        jSONObject.put("uri", webFile.getFile().getAbsolutePath());
        jSONObject.put("extension", e.getExtension(webFile.getFile()));
        jSONObject.put("url", webFile.getUrl().toString());
        return jSONObject;
    }

    public static final Object access$toWebFile(ScanDocumentCommand scanDocumentCommand, File file, Application application, Continuation continuation) {
        scanDocumentCommand.getClass();
        File file2 = new File(scanDocumentCommand.mApplication.getCacheDir(), "cells_plugin");
        if (!file2.exists()) {
            file2.mkdir();
        }
        return WebFile.INSTANCE.from(application, new FileInputStream(file), e.getExtension(file), (Continuation<? super WebFile>) continuation);
    }

    @Override // com.bbva.androidtoolkit.plugin.command.AbstractCommand
    public void execute(@NotNull CaptureDocumentParams params, @NotNull CommandCallback callback) throws IOException {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(callback, "callback");
        String compression = params.getCompression();
        if (compression == null) {
            compression = new Compression(null, 0, 3, null).getId();
        }
        File file = new File(this.mApplication.getCacheDir(), UUID.randomUUID() + Constant.DOT_STRING + compression);
        file.createNewFile();
        String absolutePath = file.getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "createTempFile(extension).absolutePath");
        withScannerRequest(callback, new c(this, params, absolutePath, callback));
    }
}
