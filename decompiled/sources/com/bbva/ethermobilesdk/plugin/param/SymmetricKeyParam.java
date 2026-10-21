package com.bbva.ethermobilesdk.plugin.param;

import androidx.annotation.Keep;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SymmetricKeyParam.kt */
/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\tJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\rJJ\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÖ\u0001J\b\u0010\u001e\u001a\u00020\u001aH\u0016J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000bR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0011\u0010\r¨\u0006 "}, d2 = {"Lcom/bbva/ethermobilesdk/plugin/param/SymmetricKeyParam;", "Lcom/bbva/ethermobilesdk/plugin/param/MalformedParams;", "password", "", "alg", "iterations", "", "salt", "saltLength", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;)V", "getAlg", "()Ljava/lang/String;", "getIterations", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPassword", "getSalt", "getSaltLength", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;)Lcom/bbva/ethermobilesdk/plugin/param/SymmetricKeyParam;", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "isMalformed", "toString", "cipher-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class SymmetricKeyParam implements MalformedParams {

    @Nullable
    private final String alg;

    @Nullable
    private final Integer iterations;

    @Nullable
    private final String password;

    @Nullable
    private final String salt;

    @Nullable
    private final Integer saltLength;

    public SymmetricKeyParam() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ SymmetricKeyParam copy$default(SymmetricKeyParam symmetricKeyParam, String str, String str2, Integer num, String str3, Integer num2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = symmetricKeyParam.password;
        }
        if ((i10 & 2) != 0) {
            str2 = symmetricKeyParam.alg;
        }
        String str4 = str2;
        if ((i10 & 4) != 0) {
            num = symmetricKeyParam.iterations;
        }
        Integer num3 = num;
        if ((i10 & 8) != 0) {
            str3 = symmetricKeyParam.salt;
        }
        String str5 = str3;
        if ((i10 & 16) != 0) {
            num2 = symmetricKeyParam.saltLength;
        }
        return symmetricKeyParam.copy(str, str4, num3, str5, num2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPassword() {
        return this.password;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAlg() {
        return this.alg;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getIterations() {
        return this.iterations;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSalt() {
        return this.salt;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getSaltLength() {
        return this.saltLength;
    }

    @NotNull
    public final SymmetricKeyParam copy(@Nullable String password, @Nullable String alg, @Nullable Integer iterations, @Nullable String salt, @Nullable Integer saltLength) {
        return new SymmetricKeyParam(password, alg, iterations, salt, saltLength);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SymmetricKeyParam)) {
            return false;
        }
        SymmetricKeyParam symmetricKeyParam = (SymmetricKeyParam) other;
        return Intrinsics.areEqual(this.password, symmetricKeyParam.password) && Intrinsics.areEqual(this.alg, symmetricKeyParam.alg) && Intrinsics.areEqual(this.iterations, symmetricKeyParam.iterations) && Intrinsics.areEqual(this.salt, symmetricKeyParam.salt) && Intrinsics.areEqual(this.saltLength, symmetricKeyParam.saltLength);
    }

    @Nullable
    public final String getAlg() {
        return this.alg;
    }

    @Nullable
    public final Integer getIterations() {
        return this.iterations;
    }

    @Nullable
    public final String getPassword() {
        return this.password;
    }

    @Nullable
    public final String getSalt() {
        return this.salt;
    }

    @Nullable
    public final Integer getSaltLength() {
        return this.saltLength;
    }

    public int hashCode() {
        String str = this.password;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.alg;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.iterations;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.salt;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num2 = this.saltLength;
        return iHashCode4 + (num2 != null ? num2.hashCode() : 0);
    }

    @Override // com.bbva.ethermobilesdk.plugin.param.MalformedParams
    public boolean isMalformed() {
        String str;
        String str2 = this.alg;
        return str2 == null || str2.length() == 0 || (str = this.password) == null || str.length() == 0;
    }

    @NotNull
    public String toString() {
        return "SymmetricKeyParam(password=" + this.password + ", alg=" + this.alg + ", iterations=" + this.iterations + ", salt=" + this.salt + ", saltLength=" + this.saltLength + RootService.CLOSE_BRACKET;
    }

    public SymmetricKeyParam(@Nullable String str, @Nullable String str2, @Nullable Integer num, @Nullable String str3, @Nullable Integer num2) {
        this.password = str;
        this.alg = str2;
        this.iterations = num;
        this.salt = str3;
        this.saltLength = num2;
    }

    public /* synthetic */ SymmetricKeyParam(String str, String str2, Integer num, String str3, Integer num2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : num, (i10 & 8) != 0 ? null : str3, (i10 & 16) != 0 ? null : num2);
    }
}
