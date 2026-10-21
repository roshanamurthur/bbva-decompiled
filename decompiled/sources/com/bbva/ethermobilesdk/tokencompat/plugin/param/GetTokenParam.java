package com.bbva.ethermobilesdk.tokencompat.plugin.param;

import androidx.annotation.Keep;
import androidx.camera.camera2.internal.h0;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.ethermobilesdk.tokencompat.plugin.extension.ExtensionKt;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: GetTokenParam.kt */
/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\b\u0010\u000f\u001a\u00020\nH\u0016J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/bbva/ethermobilesdk/tokencompat/plugin/param/GetTokenParam;", "Lcom/bbva/ethermobilesdk/tokencompat/plugin/param/MalformedParams;", "refToken", "", "(Ljava/lang/String;)V", "getRefToken", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "isMalformed", "toString", "ethertoken-compat-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class GetTokenParam implements MalformedParams {

    @SerializedName("ref_token")
    @Nullable
    private final String refToken;

    /* JADX WARN: Multi-variable type inference failed */
    public GetTokenParam() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ GetTokenParam copy$default(GetTokenParam getTokenParam, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = getTokenParam.refToken;
        }
        return getTokenParam.copy(str);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRefToken() {
        return this.refToken;
    }

    @NotNull
    public final GetTokenParam copy(@Nullable String refToken) {
        return new GetTokenParam(refToken);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof GetTokenParam) && Intrinsics.areEqual(this.refToken, ((GetTokenParam) other).refToken);
    }

    @Nullable
    public final String getRefToken() {
        return this.refToken;
    }

    public int hashCode() {
        String str = this.refToken;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @Override // com.bbva.ethermobilesdk.tokencompat.plugin.param.MalformedParams
    public boolean isMalformed() {
        return ExtensionKt.isMalformedParam(this.refToken);
    }

    @NotNull
    public String toString() {
        return h0.b("GetTokenParam(refToken=", this.refToken, ")");
    }

    public GetTokenParam(@Nullable String str) {
        this.refToken = str;
    }

    public /* synthetic */ GetTokenParam(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str);
    }
}
