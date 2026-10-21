package com.bbva.document.scanner.plugin.model;

import androidx.annotation.Keep;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.glomohybrid.login.domain.usecase.ValidatePasswordQualityUseCase;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CompressionParam.kt */
/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/bbva/document/scanner/plugin/model/CompressionParam;", "", "id", "", ValidatePasswordQualityUseCase.KEY_PASSWORD_QUALITY, "", "(Ljava/lang/String;I)V", "getId", "()Ljava/lang/String;", "getQuality", "()I", "component1", "component2", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "toString", "document-scanner-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class CompressionParam {

    @NotNull
    private final String id;
    private final int quality;

    public CompressionParam(@NotNull String id, int i10) {
        Intrinsics.checkNotNullParameter(id, "id");
        this.id = id;
        this.quality = i10;
    }

    public static /* synthetic */ CompressionParam copy$default(CompressionParam compressionParam, String str, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = compressionParam.id;
        }
        if ((i11 & 2) != 0) {
            i10 = compressionParam.quality;
        }
        return compressionParam.copy(str, i10);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getQuality() {
        return this.quality;
    }

    @NotNull
    public final CompressionParam copy(@NotNull String id, int quality) {
        Intrinsics.checkNotNullParameter(id, "id");
        return new CompressionParam(id, quality);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CompressionParam)) {
            return false;
        }
        CompressionParam compressionParam = (CompressionParam) other;
        return Intrinsics.areEqual(this.id, compressionParam.id) && this.quality == compressionParam.quality;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public final int getQuality() {
        return this.quality;
    }

    public int hashCode() {
        return (this.id.hashCode() * 31) + this.quality;
    }

    @NotNull
    public String toString() {
        return "CompressionParam(id=" + this.id + ", quality=" + this.quality + ")";
    }
}
