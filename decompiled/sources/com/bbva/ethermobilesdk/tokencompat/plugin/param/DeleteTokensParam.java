package com.bbva.ethermobilesdk.tokencompat.plugin.param;

import androidx.annotation.Keep;
import androidx.camera.camera2.internal.h0;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DeleteTokensParam.kt */
/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/bbva/ethermobilesdk/tokencompat/plugin/param/DeleteTokensParam;", "", "authPrefix", "", "(Ljava/lang/String;)V", "getAuthPrefix", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "ethertoken-compat-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class DeleteTokensParam {

    @SerializedName("auth_prefix")
    @Nullable
    private final String authPrefix;

    /* JADX WARN: Multi-variable type inference failed */
    public DeleteTokensParam() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ DeleteTokensParam copy$default(DeleteTokensParam deleteTokensParam, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = deleteTokensParam.authPrefix;
        }
        return deleteTokensParam.copy(str);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAuthPrefix() {
        return this.authPrefix;
    }

    @NotNull
    public final DeleteTokensParam copy(@Nullable String authPrefix) {
        return new DeleteTokensParam(authPrefix);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DeleteTokensParam) && Intrinsics.areEqual(this.authPrefix, ((DeleteTokensParam) other).authPrefix);
    }

    @Nullable
    public final String getAuthPrefix() {
        return this.authPrefix;
    }

    public int hashCode() {
        String str = this.authPrefix;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @NotNull
    public String toString() {
        return h0.b("DeleteTokensParam(authPrefix=", this.authPrefix, ")");
    }

    public DeleteTokensParam(@Nullable String str) {
        this.authPrefix = str;
    }

    public /* synthetic */ DeleteTokensParam(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str);
    }
}
