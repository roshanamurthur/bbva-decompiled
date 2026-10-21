package com.bbva.ethermobilesdk.token.plugin.param;

import androidx.annotation.Keep;
import androidx.camera.camera2.internal.h0;
import com.bbva.ethermobilesdk.token.plugin.command.ActivateTokenCommand;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DeleteTokenParam.kt */
/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\b\u0010\u000f\u001a\u00020\nH\u0016J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/bbva/ethermobilesdk/token/plugin/param/DeleteTokenParam;", "Lcom/bbva/ethermobilesdk/token/plugin/param/MalformedParams;", ActivateTokenCommand.TOKEN_ID, "", "(Ljava/lang/String;)V", "getTokenId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "isMalformed", "toString", "ethertoken-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class DeleteTokenParam implements MalformedParams {

    @SerializedName(ActivateTokenCommand.TOKEN_ID)
    @Nullable
    private final String tokenId;

    /* JADX WARN: Multi-variable type inference failed */
    public DeleteTokenParam() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ DeleteTokenParam copy$default(DeleteTokenParam deleteTokenParam, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = deleteTokenParam.tokenId;
        }
        return deleteTokenParam.copy(str);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTokenId() {
        return this.tokenId;
    }

    @NotNull
    public final DeleteTokenParam copy(@Nullable String tokenId) {
        return new DeleteTokenParam(tokenId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DeleteTokenParam) && Intrinsics.areEqual(this.tokenId, ((DeleteTokenParam) other).tokenId);
    }

    @Nullable
    public final String getTokenId() {
        return this.tokenId;
    }

    public int hashCode() {
        String str = this.tokenId;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @Override // com.bbva.ethermobilesdk.token.plugin.param.MalformedParams
    public boolean isMalformed() {
        String str = this.tokenId;
        return str == null || l.isBlank(str);
    }

    @NotNull
    public String toString() {
        return h0.b("DeleteTokenParam(tokenId=", this.tokenId, ")");
    }

    public DeleteTokenParam(@Nullable String str) {
        this.tokenId = str;
    }

    public /* synthetic */ DeleteTokenParam(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str);
    }
}
