package com.bbva.ethermobilesdk.plugin.param;

import androidx.annotation.Keep;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.zoomauth.facialauth.FacialAuthFragment;
import com.mypinpad.tsdk.isolation.y2;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: JweDecryptParam.kt */
/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\b\u0010\u0019\u001a\u00020\u0014H\u0016J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/bbva/ethermobilesdk/plugin/param/JweDecryptParam;", "Lcom/bbva/ethermobilesdk/plugin/param/MalformedParams;", "data", "", "privateKey", FacialAuthFragment.PUBLIC_KEY, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getData", "()Ljava/lang/String;", "setData", "(Ljava/lang/String;)V", "getPrivateKey", "setPrivateKey", "getPublicKey", "setPublicKey", "component1", "component2", "component3", "copy", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "isMalformed", "toString", "cipher-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class JweDecryptParam implements MalformedParams {

    @Nullable
    private String data;

    @Nullable
    private String privateKey;

    @Nullable
    private String publicKey;

    public JweDecryptParam() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ JweDecryptParam copy$default(JweDecryptParam jweDecryptParam, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = jweDecryptParam.data;
        }
        if ((i10 & 2) != 0) {
            str2 = jweDecryptParam.privateKey;
        }
        if ((i10 & 4) != 0) {
            str3 = jweDecryptParam.publicKey;
        }
        return jweDecryptParam.copy(str, str2, str3);
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

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPublicKey() {
        return this.publicKey;
    }

    @NotNull
    public final JweDecryptParam copy(@Nullable String data, @Nullable String privateKey, @Nullable String publicKey) {
        return new JweDecryptParam(data, privateKey, publicKey);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof JweDecryptParam)) {
            return false;
        }
        JweDecryptParam jweDecryptParam = (JweDecryptParam) other;
        return Intrinsics.areEqual(this.data, jweDecryptParam.data) && Intrinsics.areEqual(this.privateKey, jweDecryptParam.privateKey) && Intrinsics.areEqual(this.publicKey, jweDecryptParam.publicKey);
    }

    @Nullable
    public final String getData() {
        return this.data;
    }

    @Nullable
    public final String getPrivateKey() {
        return this.privateKey;
    }

    @Nullable
    public final String getPublicKey() {
        return this.publicKey;
    }

    public int hashCode() {
        String str = this.data;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.privateKey;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.publicKey;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.bbva.ethermobilesdk.plugin.param.MalformedParams
    public boolean isMalformed() {
        String str;
        String str2;
        String str3 = this.data;
        return str3 == null || str3.length() == 0 || (str = this.privateKey) == null || str.length() == 0 || (str2 = this.publicKey) == null || str2.length() == 0;
    }

    public final void setData(@Nullable String str) {
        this.data = str;
    }

    public final void setPrivateKey(@Nullable String str) {
        this.privateKey = str;
    }

    public final void setPublicKey(@Nullable String str) {
        this.publicKey = str;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("JweDecryptParam(data=");
        sb2.append(this.data);
        sb2.append(", privateKey=");
        sb2.append(this.privateKey);
        sb2.append(", publicKey=");
        return y2.b(sb2, this.publicKey, RootService.CLOSE_BRACKET);
    }

    public JweDecryptParam(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.data = str;
        this.privateKey = str2;
        this.publicKey = str3;
    }

    public /* synthetic */ JweDecryptParam(String str, String str2, String str3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3);
    }
}
