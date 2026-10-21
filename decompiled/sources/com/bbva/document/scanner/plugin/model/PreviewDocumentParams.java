package com.bbva.document.scanner.plugin.model;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PreviewDocumentParams.kt */
/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u0011"}, d2 = {"Lcom/bbva/document/scanner/plugin/model/PreviewDocumentParams;", "", "uri", "", "titleText", "ratio", "Lcom/bbva/document/scanner/plugin/model/RatioParam;", "primaryButtonText", "secondaryButtonText", "(Ljava/lang/String;Ljava/lang/String;Lcom/bbva/document/scanner/plugin/model/RatioParam;Ljava/lang/String;Ljava/lang/String;)V", "getPrimaryButtonText", "()Ljava/lang/String;", "getRatio", "()Lcom/bbva/document/scanner/plugin/model/RatioParam;", "getSecondaryButtonText", "getTitleText", "getUri", "document-scanner-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PreviewDocumentParams {

    @Nullable
    private final String primaryButtonText;

    @Nullable
    private final RatioParam ratio;

    @Nullable
    private final String secondaryButtonText;

    @Nullable
    private final String titleText;

    @Nullable
    private final String uri;

    public PreviewDocumentParams() {
        this(null, null, null, null, null, 31, null);
    }

    @Nullable
    public final String getPrimaryButtonText() {
        return this.primaryButtonText;
    }

    @Nullable
    public final RatioParam getRatio() {
        return this.ratio;
    }

    @Nullable
    public final String getSecondaryButtonText() {
        return this.secondaryButtonText;
    }

    @Nullable
    public final String getTitleText() {
        return this.titleText;
    }

    @Nullable
    public final String getUri() {
        return this.uri;
    }

    public PreviewDocumentParams(@Nullable String str, @Nullable String str2, @Nullable RatioParam ratioParam, @Nullable String str3, @Nullable String str4) {
        this.uri = str;
        this.titleText = str2;
        this.ratio = ratioParam;
        this.primaryButtonText = str3;
        this.secondaryButtonText = str4;
    }

    public /* synthetic */ PreviewDocumentParams(String str, String str2, RatioParam ratioParam, String str3, String str4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : ratioParam, (i10 & 8) != 0 ? null : str3, (i10 & 16) != 0 ? null : str4);
    }
}
