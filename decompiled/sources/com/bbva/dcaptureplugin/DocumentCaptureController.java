package com.bbva.dcaptureplugin;

import android.content.Context;
import com.bbva.dcaptureplugin.command.DocumentCapturable;
import com.dasnano.vddocumentcapture.VDDocumentCapture;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DocumentCaptureController.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J:\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\u0010\u001a\u00020\fH\u0016J \u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\f0\u0012j\b\u0012\u0004\u0012\u00020\f`\u00132\u0006\u0010\b\u001a\u00020\tH\u0016J\"\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u000e2\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\u0015"}, d2 = {"Lcom/bbva/dcaptureplugin/DocumentCaptureController;", "Lcom/bbva/dcaptureplugin/command/DocumentCapturable;", "<init>", "()V", "startWithDocumentIDs", "", "delegate", "Lcom/dasnano/vddocumentcapture/VDDocumentCapture$IVDDocumentCapture;", "context", "Landroid/content/Context;", "documents", "", "", "configuration", "", "stopDocumentCaptureProcess", "getVersion", "getConfigurationKeys", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getCountryDocuments", "document-capture-plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DocumentCaptureController implements DocumentCapturable {
    @Override // com.bbva.dcaptureplugin.command.DocumentCapturable
    @NotNull
    public ArrayList<String> getConfigurationKeys(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ArrayList<String> configurationKeys = VDDocumentCapture.getConfigurationKeys(context);
        Intrinsics.checkNotNullExpressionValue(configurationKeys, "getConfigurationKeys(...)");
        return configurationKeys;
    }

    @Override // com.bbva.dcaptureplugin.command.DocumentCapturable
    @NotNull
    public Map<String, List<String>> getCountryDocuments(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Map<String, List<String>> countryDocuments = VDDocumentCapture.getCountryDocuments(context);
        Intrinsics.checkNotNullExpressionValue(countryDocuments, "getCountryDocuments(...)");
        return countryDocuments;
    }

    @Override // com.bbva.dcaptureplugin.command.DocumentCapturable
    @NotNull
    public String getVersion() {
        String version = VDDocumentCapture.getVersion();
        Intrinsics.checkNotNullExpressionValue(version, "getVersion(...)");
        return version;
    }

    @Override // com.bbva.dcaptureplugin.command.DocumentCapturable
    public void startWithDocumentIDs(@NotNull VDDocumentCapture.IVDDocumentCapture delegate, @NotNull Context context, @NotNull List<String> documents, @NotNull Map<String, String> configuration) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(documents, "documents");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        if (VDDocumentCapture.isStarted()) {
            return;
        }
        VDDocumentCapture.startWithDocumentIDs(delegate, context, documents, configuration);
    }

    @Override // com.bbva.dcaptureplugin.command.DocumentCapturable
    public void stopDocumentCaptureProcess(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        VDDocumentCapture.stop(context);
    }
}
