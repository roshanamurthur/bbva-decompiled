package com.bbva.document.scanner.plugin.model;

import ad.d;
import androidx.annotation.Keep;
import com.bbva.document.scanner.plugin.command.PreviewDocumentCommand;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CaptureDocumentParams.kt */
/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B_\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0011\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jc\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006*"}, d2 = {"Lcom/bbva/document/scanner/plugin/model/CaptureDocumentParams;", "", "buttonText", "", "notification", "Lcom/bbva/document/scanner/plugin/model/NotificationParam;", "ratio", "Lcom/bbva/document/scanner/plugin/model/RatioParam;", "filters", "", "Lcom/bbva/document/scanner/plugin/model/FiltersParam;", "compression", PreviewDocumentCommand.ID, "Lcom/bbva/document/scanner/plugin/model/ScanDocumentPreviewParam;", "processingImageText", "(Ljava/lang/String;Lcom/bbva/document/scanner/plugin/model/NotificationParam;Lcom/bbva/document/scanner/plugin/model/RatioParam;Ljava/util/List;Ljava/lang/String;Lcom/bbva/document/scanner/plugin/model/ScanDocumentPreviewParam;Ljava/lang/String;)V", "getButtonText", "()Ljava/lang/String;", "getCompression", "getFilters", "()Ljava/util/List;", "getNotification", "()Lcom/bbva/document/scanner/plugin/model/NotificationParam;", "getPreview", "()Lcom/bbva/document/scanner/plugin/model/ScanDocumentPreviewParam;", "getProcessingImageText", "getRatio", "()Lcom/bbva/document/scanner/plugin/model/RatioParam;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "document-scanner-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class CaptureDocumentParams {

    @Nullable
    private final String buttonText;

    @Nullable
    private final String compression;

    @Nullable
    private final List<FiltersParam> filters;

    @Nullable
    private final NotificationParam notification;

    @Nullable
    private final ScanDocumentPreviewParam preview;

    @Nullable
    private final String processingImageText;

    @Nullable
    private final RatioParam ratio;

    public CaptureDocumentParams() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CaptureDocumentParams copy$default(CaptureDocumentParams captureDocumentParams, String str, NotificationParam notificationParam, RatioParam ratioParam, List list, String str2, ScanDocumentPreviewParam scanDocumentPreviewParam, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = captureDocumentParams.buttonText;
        }
        if ((i10 & 2) != 0) {
            notificationParam = captureDocumentParams.notification;
        }
        NotificationParam notificationParam2 = notificationParam;
        if ((i10 & 4) != 0) {
            ratioParam = captureDocumentParams.ratio;
        }
        RatioParam ratioParam2 = ratioParam;
        if ((i10 & 8) != 0) {
            list = captureDocumentParams.filters;
        }
        List list2 = list;
        if ((i10 & 16) != 0) {
            str2 = captureDocumentParams.compression;
        }
        String str4 = str2;
        if ((i10 & 32) != 0) {
            scanDocumentPreviewParam = captureDocumentParams.preview;
        }
        ScanDocumentPreviewParam scanDocumentPreviewParam2 = scanDocumentPreviewParam;
        if ((i10 & 64) != 0) {
            str3 = captureDocumentParams.processingImageText;
        }
        return captureDocumentParams.copy(str, notificationParam2, ratioParam2, list2, str4, scanDocumentPreviewParam2, str3);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getButtonText() {
        return this.buttonText;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final NotificationParam getNotification() {
        return this.notification;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final RatioParam getRatio() {
        return this.ratio;
    }

    @Nullable
    public final List<FiltersParam> component4() {
        return this.filters;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCompression() {
        return this.compression;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final ScanDocumentPreviewParam getPreview() {
        return this.preview;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getProcessingImageText() {
        return this.processingImageText;
    }

    @NotNull
    public final CaptureDocumentParams copy(@Nullable String buttonText, @Nullable NotificationParam notification, @Nullable RatioParam ratio, @Nullable List<FiltersParam> filters, @Nullable String compression, @Nullable ScanDocumentPreviewParam preview, @Nullable String processingImageText) {
        return new CaptureDocumentParams(buttonText, notification, ratio, filters, compression, preview, processingImageText);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CaptureDocumentParams)) {
            return false;
        }
        CaptureDocumentParams captureDocumentParams = (CaptureDocumentParams) other;
        return Intrinsics.areEqual(this.buttonText, captureDocumentParams.buttonText) && Intrinsics.areEqual(this.notification, captureDocumentParams.notification) && Intrinsics.areEqual(this.ratio, captureDocumentParams.ratio) && Intrinsics.areEqual(this.filters, captureDocumentParams.filters) && Intrinsics.areEqual(this.compression, captureDocumentParams.compression) && Intrinsics.areEqual(this.preview, captureDocumentParams.preview) && Intrinsics.areEqual(this.processingImageText, captureDocumentParams.processingImageText);
    }

    @Nullable
    public final String getButtonText() {
        return this.buttonText;
    }

    @Nullable
    public final String getCompression() {
        return this.compression;
    }

    @Nullable
    public final List<FiltersParam> getFilters() {
        return this.filters;
    }

    @Nullable
    public final NotificationParam getNotification() {
        return this.notification;
    }

    @Nullable
    public final ScanDocumentPreviewParam getPreview() {
        return this.preview;
    }

    @Nullable
    public final String getProcessingImageText() {
        return this.processingImageText;
    }

    @Nullable
    public final RatioParam getRatio() {
        return this.ratio;
    }

    public int hashCode() {
        String str = this.buttonText;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        NotificationParam notificationParam = this.notification;
        int iHashCode2 = (iHashCode + (notificationParam == null ? 0 : notificationParam.hashCode())) * 31;
        RatioParam ratioParam = this.ratio;
        int iHashCode3 = (iHashCode2 + (ratioParam == null ? 0 : ratioParam.hashCode())) * 31;
        List<FiltersParam> list = this.filters;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.compression;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ScanDocumentPreviewParam scanDocumentPreviewParam = this.preview;
        int iHashCode6 = (iHashCode5 + (scanDocumentPreviewParam == null ? 0 : scanDocumentPreviewParam.hashCode())) * 31;
        String str3 = this.processingImageText;
        return iHashCode6 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.buttonText;
        NotificationParam notificationParam = this.notification;
        RatioParam ratioParam = this.ratio;
        List<FiltersParam> list = this.filters;
        String str2 = this.compression;
        ScanDocumentPreviewParam scanDocumentPreviewParam = this.preview;
        String str3 = this.processingImageText;
        StringBuilder sb2 = new StringBuilder("CaptureDocumentParams(buttonText=");
        sb2.append(str);
        sb2.append(", notification=");
        sb2.append(notificationParam);
        sb2.append(", ratio=");
        sb2.append(ratioParam);
        sb2.append(", filters=");
        sb2.append(list);
        sb2.append(", compression=");
        sb2.append(str2);
        sb2.append(", preview=");
        sb2.append(scanDocumentPreviewParam);
        sb2.append(", processingImageText=");
        return d.f(sb2, str3, ")");
    }

    public CaptureDocumentParams(@Nullable String str, @Nullable NotificationParam notificationParam, @Nullable RatioParam ratioParam, @Nullable List<FiltersParam> list, @Nullable String str2, @Nullable ScanDocumentPreviewParam scanDocumentPreviewParam, @Nullable String str3) {
        this.buttonText = str;
        this.notification = notificationParam;
        this.ratio = ratioParam;
        this.filters = list;
        this.compression = str2;
        this.preview = scanDocumentPreviewParam;
        this.processingImageText = str3;
    }

    public /* synthetic */ CaptureDocumentParams(String str, NotificationParam notificationParam, RatioParam ratioParam, List list, String str2, ScanDocumentPreviewParam scanDocumentPreviewParam, String str3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : notificationParam, (i10 & 4) != 0 ? null : ratioParam, (i10 & 8) != 0 ? null : list, (i10 & 16) != 0 ? null : str2, (i10 & 32) != 0 ? null : scanDocumentPreviewParam, (i10 & 64) != 0 ? null : str3);
    }
}
