package com.bbva.document.scanner.plugin.model;

import ad.d;
import androidx.annotation.Keep;
import androidx.constraintlayout.core.parser.a;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ScanDocumentPreviewParam.kt */
/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/bbva/document/scanner/plugin/model/ScanDocumentPreviewParam;", "", "titleText", "", "primaryButtonText", "secondaryButtonText", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPrimaryButtonText", "()Ljava/lang/String;", "getSecondaryButtonText", "getTitleText", "component1", "component2", "component3", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "document-scanner-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class ScanDocumentPreviewParam {

    @Nullable
    private final String primaryButtonText;

    @Nullable
    private final String secondaryButtonText;

    @Nullable
    private final String titleText;

    public ScanDocumentPreviewParam() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ ScanDocumentPreviewParam copy$default(ScanDocumentPreviewParam scanDocumentPreviewParam, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = scanDocumentPreviewParam.titleText;
        }
        if ((i10 & 2) != 0) {
            str2 = scanDocumentPreviewParam.primaryButtonText;
        }
        if ((i10 & 4) != 0) {
            str3 = scanDocumentPreviewParam.secondaryButtonText;
        }
        return scanDocumentPreviewParam.copy(str, str2, str3);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitleText() {
        return this.titleText;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPrimaryButtonText() {
        return this.primaryButtonText;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSecondaryButtonText() {
        return this.secondaryButtonText;
    }

    @NotNull
    public final ScanDocumentPreviewParam copy(@Nullable String titleText, @Nullable String primaryButtonText, @Nullable String secondaryButtonText) {
        return new ScanDocumentPreviewParam(titleText, primaryButtonText, secondaryButtonText);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScanDocumentPreviewParam)) {
            return false;
        }
        ScanDocumentPreviewParam scanDocumentPreviewParam = (ScanDocumentPreviewParam) other;
        return Intrinsics.areEqual(this.titleText, scanDocumentPreviewParam.titleText) && Intrinsics.areEqual(this.primaryButtonText, scanDocumentPreviewParam.primaryButtonText) && Intrinsics.areEqual(this.secondaryButtonText, scanDocumentPreviewParam.secondaryButtonText);
    }

    @Nullable
    public final String getPrimaryButtonText() {
        return this.primaryButtonText;
    }

    @Nullable
    public final String getSecondaryButtonText() {
        return this.secondaryButtonText;
    }

    @Nullable
    public final String getTitleText() {
        return this.titleText;
    }

    public int hashCode() {
        String str = this.titleText;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.primaryButtonText;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.secondaryButtonText;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.titleText;
        String str2 = this.primaryButtonText;
        return d.f(a.c("ScanDocumentPreviewParam(titleText=", str, ", primaryButtonText=", str2, ", secondaryButtonText="), this.secondaryButtonText, ")");
    }

    public ScanDocumentPreviewParam(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.titleText = str;
        this.primaryButtonText = str2;
        this.secondaryButtonText = str3;
    }

    public /* synthetic */ ScanDocumentPreviewParam(String str, String str2, String str3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3);
    }
}
