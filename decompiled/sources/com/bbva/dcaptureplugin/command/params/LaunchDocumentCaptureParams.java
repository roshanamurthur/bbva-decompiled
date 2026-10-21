package com.bbva.dcaptureplugin.command.params;

import androidx.annotation.Keep;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LaunchDocumentCaptureParams.kt */
/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0015\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0006HÆ\u0003J/\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/bbva/dcaptureplugin/command/params/LaunchDocumentCaptureParams;", "", "documents", "", "", "configuration", "", "<init>", "(Ljava/util/List;Ljava/util/Map;)V", "getDocuments", "()Ljava/util/List;", "getConfiguration", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "document-capture-plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class LaunchDocumentCaptureParams {

    @NotNull
    private final Map<String, String> configuration;

    @NotNull
    private final List<String> documents;

    public LaunchDocumentCaptureParams(@NotNull List<String> documents, @NotNull Map<String, String> configuration) {
        Intrinsics.checkNotNullParameter(documents, "documents");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.documents = documents;
        this.configuration = configuration;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LaunchDocumentCaptureParams copy$default(LaunchDocumentCaptureParams launchDocumentCaptureParams, List list, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = launchDocumentCaptureParams.documents;
        }
        if ((i10 & 2) != 0) {
            map = launchDocumentCaptureParams.configuration;
        }
        return launchDocumentCaptureParams.copy(list, map);
    }

    @NotNull
    public final List<String> component1() {
        return this.documents;
    }

    @NotNull
    public final Map<String, String> component2() {
        return this.configuration;
    }

    @NotNull
    public final LaunchDocumentCaptureParams copy(@NotNull List<String> documents, @NotNull Map<String, String> configuration) {
        Intrinsics.checkNotNullParameter(documents, "documents");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        return new LaunchDocumentCaptureParams(documents, configuration);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LaunchDocumentCaptureParams)) {
            return false;
        }
        LaunchDocumentCaptureParams launchDocumentCaptureParams = (LaunchDocumentCaptureParams) other;
        return Intrinsics.areEqual(this.documents, launchDocumentCaptureParams.documents) && Intrinsics.areEqual(this.configuration, launchDocumentCaptureParams.configuration);
    }

    @NotNull
    public final Map<String, String> getConfiguration() {
        return this.configuration;
    }

    @NotNull
    public final List<String> getDocuments() {
        return this.documents;
    }

    public int hashCode() {
        return this.configuration.hashCode() + (this.documents.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "LaunchDocumentCaptureParams(documents=" + this.documents + ", configuration=" + this.configuration + ")";
    }
}
