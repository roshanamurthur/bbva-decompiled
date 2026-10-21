package com.bbva.dcaptureplugin.command;

import android.content.Context;
import com.dasnano.vddocumentcapture.VDDocumentCapture;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DocumentCapturable.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J:\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\fH&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\u000e\u001a\u00020\nH&J \u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\n0\u0010j\b\u0012\u0004\u0012\u00020\n`\u00112\u0006\u0010\u0006\u001a\u00020\u0007H&J\"\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\f2\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\u0013"}, d2 = {"Lcom/bbva/dcaptureplugin/command/DocumentCapturable;", "", "startWithDocumentIDs", "", "delegate", "Lcom/dasnano/vddocumentcapture/VDDocumentCapture$IVDDocumentCapture;", "context", "Landroid/content/Context;", "documents", "", "", "configuration", "", "stopDocumentCaptureProcess", "getVersion", "getConfigurationKeys", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getCountryDocuments", "document-capture-plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface DocumentCapturable {
    @NotNull
    ArrayList<String> getConfigurationKeys(@NotNull Context context);

    @NotNull
    Map<String, List<String>> getCountryDocuments(@NotNull Context context);

    @NotNull
    String getVersion();

    void startWithDocumentIDs(@NotNull VDDocumentCapture.IVDDocumentCapture delegate, @NotNull Context context, @NotNull List<String> documents, @NotNull Map<String, String> configuration);

    void stopDocumentCaptureProcess(@NotNull Context context);
}
