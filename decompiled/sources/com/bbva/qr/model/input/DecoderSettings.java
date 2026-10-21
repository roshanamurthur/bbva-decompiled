package com.bbva.qr.model.input;

import androidx.annotation.Keep;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DecoderConfig.kt */
/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/bbva/qr/model/input/DecoderSettings;", "", "codeType", "Lcom/bbva/qr/model/input/BarcodeType;", "source", "Lcom/bbva/qr/model/input/Source;", "(Lcom/bbva/qr/model/input/BarcodeType;Lcom/bbva/qr/model/input/Source;)V", "getCodeType", "()Lcom/bbva/qr/model/input/BarcodeType;", "getSource", "()Lcom/bbva/qr/model/input/Source;", "component1", "component2", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "qr_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class DecoderSettings {

    @Nullable
    private final BarcodeType codeType;

    @Nullable
    private final Source source;

    /* JADX WARN: Multi-variable type inference failed */
    public DecoderSettings() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ DecoderSettings copy$default(DecoderSettings decoderSettings, BarcodeType barcodeType, Source source, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            barcodeType = decoderSettings.codeType;
        }
        if ((i10 & 2) != 0) {
            source = decoderSettings.source;
        }
        return decoderSettings.copy(barcodeType, source);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BarcodeType getCodeType() {
        return this.codeType;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Source getSource() {
        return this.source;
    }

    @NotNull
    public final DecoderSettings copy(@Nullable BarcodeType codeType, @Nullable Source source) {
        return new DecoderSettings(codeType, source);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DecoderSettings)) {
            return false;
        }
        DecoderSettings decoderSettings = (DecoderSettings) other;
        return this.codeType == decoderSettings.codeType && Intrinsics.areEqual(this.source, decoderSettings.source);
    }

    @Nullable
    public final BarcodeType getCodeType() {
        return this.codeType;
    }

    @Nullable
    public final Source getSource() {
        return this.source;
    }

    public int hashCode() {
        BarcodeType barcodeType = this.codeType;
        int iHashCode = (barcodeType == null ? 0 : barcodeType.hashCode()) * 31;
        Source source = this.source;
        return iHashCode + (source != null ? source.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "DecoderSettings(codeType=" + this.codeType + ", source=" + this.source + ")";
    }

    public DecoderSettings(@Nullable BarcodeType barcodeType, @Nullable Source source) {
        this.codeType = barcodeType;
        this.source = source;
    }

    public /* synthetic */ DecoderSettings(BarcodeType barcodeType, Source source, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? BarcodeType.QR : barcodeType, (i10 & 2) != 0 ? null : source);
    }
}
