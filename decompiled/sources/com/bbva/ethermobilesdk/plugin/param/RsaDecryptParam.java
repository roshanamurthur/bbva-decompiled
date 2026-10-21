package com.bbva.ethermobilesdk.plugin.param;

import androidx.annotation.Keep;
import androidx.camera.camera2.internal.n1;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.mypinpad.tsdk.isolation.y2;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: RsaDecryptParam.kt */
/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J5\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\b\u0010\u0018\u001a\u00020\u0013H\u0016J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u001a"}, d2 = {"Lcom/bbva/ethermobilesdk/plugin/param/RsaDecryptParam;", "Lcom/bbva/ethermobilesdk/plugin/param/MalformedParams;", "data", "", "privateKey", "mode", "padding", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getData", "()Ljava/lang/String;", "getMode", "getPadding", "getPrivateKey", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "isMalformed", "toString", "cipher-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class RsaDecryptParam implements MalformedParams {

    @Nullable
    private final String data;

    @NotNull
    private final String mode;

    @NotNull
    private final String padding;

    @Nullable
    private final String privateKey;

    public RsaDecryptParam() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ RsaDecryptParam copy$default(RsaDecryptParam rsaDecryptParam, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = rsaDecryptParam.data;
        }
        if ((i10 & 2) != 0) {
            str2 = rsaDecryptParam.privateKey;
        }
        if ((i10 & 4) != 0) {
            str3 = rsaDecryptParam.mode;
        }
        if ((i10 & 8) != 0) {
            str4 = rsaDecryptParam.padding;
        }
        return rsaDecryptParam.copy(str, str2, str3, str4);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getData() {
        return this.data;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPrivateKey() {
        return this.privateKey;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMode() {
        return this.mode;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPadding() {
        return this.padding;
    }

    @NotNull
    public final RsaDecryptParam copy(@Nullable String data, @Nullable String privateKey, @NotNull String mode, @NotNull String padding) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(padding, "padding");
        return new RsaDecryptParam(data, privateKey, mode, padding);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RsaDecryptParam)) {
            return false;
        }
        RsaDecryptParam rsaDecryptParam = (RsaDecryptParam) other;
        return Intrinsics.areEqual(this.data, rsaDecryptParam.data) && Intrinsics.areEqual(this.privateKey, rsaDecryptParam.privateKey) && Intrinsics.areEqual(this.mode, rsaDecryptParam.mode) && Intrinsics.areEqual(this.padding, rsaDecryptParam.padding);
    }

    @Nullable
    public final String getData() {
        return this.data;
    }

    @NotNull
    public final String getMode() {
        return this.mode;
    }

    @NotNull
    public final String getPadding() {
        return this.padding;
    }

    @Nullable
    public final String getPrivateKey() {
        return this.privateKey;
    }

    public int hashCode() {
        String str = this.data;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.privateKey;
        return this.padding.hashCode() + n1.c(this.mode, (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31);
    }

    @Override // com.bbva.ethermobilesdk.plugin.param.MalformedParams
    public boolean isMalformed() {
        String str;
        String str2 = this.data;
        return str2 == null || str2.length() == 0 || (str = this.privateKey) == null || str.length() == 0;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("RsaDecryptParam(data=");
        sb2.append(this.data);
        sb2.append(", privateKey=");
        sb2.append(this.privateKey);
        sb2.append(", mode=");
        sb2.append(this.mode);
        sb2.append(", padding=");
        return y2.b(sb2, this.padding, RootService.CLOSE_BRACKET);
    }

    public RsaDecryptParam(@Nullable String str, @Nullable String str2, @NotNull String mode, @NotNull String padding) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(padding, "padding");
        this.data = str;
        this.privateKey = str2;
        this.mode = mode;
        this.padding = padding;
    }

    public /* synthetic */ RsaDecryptParam(String str, String str2, String str3, String str4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? "none" : str3, (i10 & 8) != 0 ? "OAEPwithSHA-256andMGF1Padding" : str4);
    }
}
