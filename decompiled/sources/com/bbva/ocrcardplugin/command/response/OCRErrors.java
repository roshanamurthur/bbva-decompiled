package com.bbva.ocrcardplugin.command.response;

import androidx.annotation.Keep;
import com.bbva.androidtoolkit.plugin.response.ErrorMessage;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: OCRErrors.kt */
/* JADX INFO: loaded from: classes7.dex */
@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0081\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0017\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\u0004H\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/bbva/ocrcardplugin/command/response/OCRErrors;", "", "Lcom/bbva/androidtoolkit/plugin/response/ErrorMessage;", "code", "", "description", "", "(Ljava/lang/String;IILjava/lang/String;)V", "getCode", "getMessage", "ERROR_SCANNED_BUT_NO_RESULT", "ocrcard-plugin_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public enum OCRErrors implements ErrorMessage {
    ERROR_SCANNED_BUT_NO_RESULT(1381, "Card was scanned but no result");

    private final int code;

    @NotNull
    private final String description;

    OCRErrors(int i10, String str) {
        this.code = i10;
        this.description = str;
    }

    @Override // com.bbva.androidtoolkit.plugin.response.ErrorMessage
    public int getCode() {
        return this.code;
    }

    @Override // com.bbva.androidtoolkit.plugin.response.ErrorMessage
    @NotNull
    /* JADX INFO: renamed from: getMessage, reason: from getter */
    public String getDescription() {
        return this.description;
    }
}
