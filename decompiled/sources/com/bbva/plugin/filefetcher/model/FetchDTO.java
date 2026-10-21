package com.bbva.plugin.filefetcher.model;

import ad.d;
import androidx.annotation.Keep;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Request.kt */
/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/bbva/plugin/filefetcher/model/FetchDTO;", "", "contentType", "", "(Ljava/lang/String;)V", "getContentType", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "filefetcher-plugin_release"}, k = 1, mv = {1, 1, 16})
public final /* data */ class FetchDTO {

    @Nullable
    private final String contentType;

    public FetchDTO(@Nullable String str) {
        this.contentType = str;
    }

    public static /* synthetic */ FetchDTO copy$default(FetchDTO fetchDTO, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = fetchDTO.contentType;
        }
        return fetchDTO.copy(str);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getContentType() {
        return this.contentType;
    }

    @NotNull
    public final FetchDTO copy(@Nullable String contentType) {
        return new FetchDTO(contentType);
    }

    public boolean equals(@Nullable Object other) {
        if (this != other) {
            return (other instanceof FetchDTO) && Intrinsics.areEqual(this.contentType, ((FetchDTO) other).contentType);
        }
        return true;
    }

    @Nullable
    public final String getContentType() {
        return this.contentType;
    }

    public int hashCode() {
        String str = this.contentType;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @NotNull
    public String toString() {
        return d.f(new StringBuilder("FetchDTO(contentType="), this.contentType, ")");
    }
}
