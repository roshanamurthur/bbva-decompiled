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

/* JADX INFO: compiled from: SaltParam.kt */
/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J&\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\b\u0010\u0015\u001a\u00020\u0011H\u0016J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/bbva/ethermobilesdk/plugin/param/SaltParam;", "Lcom/bbva/ethermobilesdk/plugin/param/MalformedParams;", "length", "", "seed", "", "(Ljava/lang/Integer;Ljava/lang/String;)V", "getLength", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSeed", "()Ljava/lang/String;", "component1", "component2", "copy", "(Ljava/lang/Integer;Ljava/lang/String;)Lcom/bbva/ethermobilesdk/plugin/param/SaltParam;", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "isMalformed", "toString", "cipher-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class SaltParam implements MalformedParams {

    @Nullable
    private final Integer length;

    @Nullable
    private final String seed;

    /* JADX WARN: Multi-variable type inference failed */
    public SaltParam() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ SaltParam copy$default(SaltParam saltParam, Integer num, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = saltParam.length;
        }
        if ((i10 & 2) != 0) {
            str = saltParam.seed;
        }
        return saltParam.copy(num, str);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getLength() {
        return this.length;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSeed() {
        return this.seed;
    }

    @NotNull
    public final SaltParam copy(@Nullable Integer length, @Nullable String seed) {
        return new SaltParam(length, seed);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SaltParam)) {
            return false;
        }
        SaltParam saltParam = (SaltParam) other;
        return Intrinsics.areEqual(this.length, saltParam.length) && Intrinsics.areEqual(this.seed, saltParam.seed);
    }

    @Nullable
    public final Integer getLength() {
        return this.length;
    }

    @Nullable
    public final String getSeed() {
        return this.seed;
    }

    public int hashCode() {
        Integer num = this.length;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.seed;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // com.bbva.ethermobilesdk.plugin.param.MalformedParams
    public boolean isMalformed() {
        return this.length == null;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("SaltParam(length=");
        sb2.append(this.length);
        sb2.append(", seed=");
        return y2.b(sb2, this.seed, RootService.CLOSE_BRACKET);
    }

    public SaltParam(@Nullable Integer num, @Nullable String str) {
        this.length = num;
        this.seed = str;
    }

    public /* synthetic */ SaltParam(Integer num, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : num, (i10 & 2) != 0 ? null : str);
    }
}
