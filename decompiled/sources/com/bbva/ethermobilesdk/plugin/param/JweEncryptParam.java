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

/* JADX INFO: compiled from: JweEncryptParam.kt */
/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\b\u0010\u0015\u001a\u00020\u0010H\u0016J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/bbva/ethermobilesdk/plugin/param/JweEncryptParam;", "Lcom/bbva/ethermobilesdk/plugin/param/MalformedParams;", "data", "", FacialAuthFragment.PUBLIC_KEY, "(Ljava/lang/String;Ljava/lang/String;)V", "getData", "()Ljava/lang/String;", "setData", "(Ljava/lang/String;)V", "getPublicKey", "setPublicKey", "component1", "component2", "copy", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "isMalformed", "toString", "cipher-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class JweEncryptParam implements MalformedParams {

    @Nullable
    private String data;

    @Nullable
    private String publicKey;

    /* JADX WARN: Multi-variable type inference failed */
    public JweEncryptParam() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ JweEncryptParam copy$default(JweEncryptParam jweEncryptParam, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = jweEncryptParam.data;
        }
        if ((i10 & 2) != 0) {
            str2 = jweEncryptParam.publicKey;
        }
        return jweEncryptParam.copy(str, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getData() {
        return this.data;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPublicKey() {
        return this.publicKey;
    }

    @NotNull
    public final JweEncryptParam copy(@Nullable String data, @Nullable String publicKey) {
        return new JweEncryptParam(data, publicKey);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof JweEncryptParam)) {
            return false;
        }
        JweEncryptParam jweEncryptParam = (JweEncryptParam) other;
        return Intrinsics.areEqual(this.data, jweEncryptParam.data) && Intrinsics.areEqual(this.publicKey, jweEncryptParam.publicKey);
    }

    @Nullable
    public final String getData() {
        return this.data;
    }

    @Nullable
    public final String getPublicKey() {
        return this.publicKey;
    }

    public int hashCode() {
        String str = this.data;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.publicKey;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.bbva.ethermobilesdk.plugin.param.MalformedParams
    public boolean isMalformed() {
        String str;
        String str2 = this.data;
        return str2 == null || str2.length() == 0 || (str = this.publicKey) == null || str.length() == 0;
    }

    public final void setData(@Nullable String str) {
        this.data = str;
    }

    public final void setPublicKey(@Nullable String str) {
        this.publicKey = str;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("JweEncryptParam(data=");
        sb2.append(this.data);
        sb2.append(", publicKey=");
        return y2.b(sb2, this.publicKey, RootService.CLOSE_BRACKET);
    }

    public JweEncryptParam(@Nullable String str, @Nullable String str2) {
        this.data = str;
        this.publicKey = str2;
    }

    public /* synthetic */ JweEncryptParam(String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2);
    }
}
