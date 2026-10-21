package com.bbva.ethermobilesdk.plugin.param;

import androidx.annotation.Keep;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.mypinpad.tsdk.isolation.y2;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SymmetricEncDecParam.kt */
/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\b\u0010\u001b\u001a\u00020\u0016H\u0016J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001d"}, d2 = {"Lcom/bbva/ethermobilesdk/plugin/param/SymmetricEncDecParam;", "Lcom/bbva/ethermobilesdk/plugin/param/MalformedParams;", "alg", "", "key", "data", "iv", "mode", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAlg", "()Ljava/lang/String;", "getData", "getIv", "getKey", "getMode", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "isMalformed", "toString", "cipher-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class SymmetricEncDecParam implements MalformedParams {

    @Nullable
    private final String alg;

    @Nullable
    private final String data;

    @Nullable
    private final String iv;

    @Nullable
    private final String key;

    @Nullable
    private final String mode;

    public SymmetricEncDecParam() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ SymmetricEncDecParam copy$default(SymmetricEncDecParam symmetricEncDecParam, String str, String str2, String str3, String str4, String str5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = symmetricEncDecParam.alg;
        }
        if ((i10 & 2) != 0) {
            str2 = symmetricEncDecParam.key;
        }
        String str6 = str2;
        if ((i10 & 4) != 0) {
            str3 = symmetricEncDecParam.data;
        }
        String str7 = str3;
        if ((i10 & 8) != 0) {
            str4 = symmetricEncDecParam.iv;
        }
        String str8 = str4;
        if ((i10 & 16) != 0) {
            str5 = symmetricEncDecParam.mode;
        }
        return symmetricEncDecParam.copy(str, str6, str7, str8, str5);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAlg() {
        return this.alg;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getData() {
        return this.data;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getIv() {
        return this.iv;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getMode() {
        return this.mode;
    }

    @NotNull
    public final SymmetricEncDecParam copy(@Nullable String alg, @Nullable String key, @Nullable String data, @Nullable String iv, @Nullable String mode) {
        return new SymmetricEncDecParam(alg, key, data, iv, mode);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SymmetricEncDecParam)) {
            return false;
        }
        SymmetricEncDecParam symmetricEncDecParam = (SymmetricEncDecParam) other;
        return Intrinsics.areEqual(this.alg, symmetricEncDecParam.alg) && Intrinsics.areEqual(this.key, symmetricEncDecParam.key) && Intrinsics.areEqual(this.data, symmetricEncDecParam.data) && Intrinsics.areEqual(this.iv, symmetricEncDecParam.iv) && Intrinsics.areEqual(this.mode, symmetricEncDecParam.mode);
    }

    @Nullable
    public final String getAlg() {
        return this.alg;
    }

    @Nullable
    public final String getData() {
        return this.data;
    }

    @Nullable
    public final String getIv() {
        return this.iv;
    }

    @Nullable
    public final String getKey() {
        return this.key;
    }

    @Nullable
    public final String getMode() {
        return this.mode;
    }

    public int hashCode() {
        String str = this.alg;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.key;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.data;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.iv;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.mode;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    @Override // com.bbva.ethermobilesdk.plugin.param.MalformedParams
    public boolean isMalformed() {
        String str;
        String str2;
        String str3;
        String str4 = this.alg;
        return str4 == null || str4.length() == 0 || (str = this.key) == null || str.length() == 0 || (str2 = this.data) == null || str2.length() == 0 || (str3 = this.mode) == null || str3.length() == 0;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("SymmetricEncDecParam(alg=");
        sb2.append(this.alg);
        sb2.append(", key=");
        sb2.append(this.key);
        sb2.append(", data=");
        sb2.append(this.data);
        sb2.append(", iv=");
        sb2.append(this.iv);
        sb2.append(", mode=");
        return y2.b(sb2, this.mode, RootService.CLOSE_BRACKET);
    }

    public SymmetricEncDecParam(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        this.alg = str;
        this.key = str2;
        this.data = str3;
        this.iv = str4;
        this.mode = str5;
    }

    public /* synthetic */ SymmetricEncDecParam(String str, String str2, String str3, String str4, String str5, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : str5);
    }
}
