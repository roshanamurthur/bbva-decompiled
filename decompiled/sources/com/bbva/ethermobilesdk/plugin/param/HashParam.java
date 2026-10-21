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

/* JADX INFO: compiled from: HashParam.kt */
/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\b\u0010\u0012\u001a\u00020\rH\u0016J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/bbva/ethermobilesdk/plugin/param/HashParam;", "Lcom/bbva/ethermobilesdk/plugin/param/MalformedParams;", "alg", "", "data", "(Ljava/lang/String;Ljava/lang/String;)V", "getAlg", "()Ljava/lang/String;", "getData", "component1", "component2", "copy", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "isMalformed", "toString", "cipher-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class HashParam implements MalformedParams {

    @Nullable
    private final String alg;

    @Nullable
    private final String data;

    /* JADX WARN: Multi-variable type inference failed */
    public HashParam() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ HashParam copy$default(HashParam hashParam, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = hashParam.alg;
        }
        if ((i10 & 2) != 0) {
            str2 = hashParam.data;
        }
        return hashParam.copy(str, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAlg() {
        return this.alg;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getData() {
        return this.data;
    }

    @NotNull
    public final HashParam copy(@Nullable String alg, @Nullable String data) {
        return new HashParam(alg, data);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HashParam)) {
            return false;
        }
        HashParam hashParam = (HashParam) other;
        return Intrinsics.areEqual(this.alg, hashParam.alg) && Intrinsics.areEqual(this.data, hashParam.data);
    }

    @Nullable
    public final String getAlg() {
        return this.alg;
    }

    @Nullable
    public final String getData() {
        return this.data;
    }

    public int hashCode() {
        String str = this.alg;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.data;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.bbva.ethermobilesdk.plugin.param.MalformedParams
    public boolean isMalformed() {
        String str;
        String str2 = this.alg;
        return str2 == null || str2.length() == 0 || (str = this.data) == null || str.length() == 0;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("HashParam(alg=");
        sb2.append(this.alg);
        sb2.append(", data=");
        return y2.b(sb2, this.data, RootService.CLOSE_BRACKET);
    }

    public HashParam(@Nullable String str, @Nullable String str2) {
        this.alg = str;
        this.data = str2;
    }

    public /* synthetic */ HashParam(String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2);
    }
}
