package com.bbva.ethermobilesdk.plugin.param;

import androidx.annotation.Keep;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: JweKeyPairParam.kt */
/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\fJ2\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001J\b\u0010\u0018\u001a\u00020\u0014H\u0016J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\f¨\u0006\u001a"}, d2 = {"Lcom/bbva/ethermobilesdk/plugin/param/JweKeyPairParam;", "Lcom/bbva/ethermobilesdk/plugin/param/MalformedParams;", "keyAlgorithm", "", "contentAlgorithm", "length", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getContentAlgorithm", "()Ljava/lang/String;", "getKeyAlgorithm", "getLength", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/bbva/ethermobilesdk/plugin/param/JweKeyPairParam;", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "isMalformed", "toString", "cipher-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class JweKeyPairParam implements MalformedParams {

    @Nullable
    private final String contentAlgorithm;

    @Nullable
    private final String keyAlgorithm;

    @Nullable
    private final Integer length;

    public JweKeyPairParam() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ JweKeyPairParam copy$default(JweKeyPairParam jweKeyPairParam, String str, String str2, Integer num, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = jweKeyPairParam.keyAlgorithm;
        }
        if ((i10 & 2) != 0) {
            str2 = jweKeyPairParam.contentAlgorithm;
        }
        if ((i10 & 4) != 0) {
            num = jweKeyPairParam.length;
        }
        return jweKeyPairParam.copy(str, str2, num);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getKeyAlgorithm() {
        return this.keyAlgorithm;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getContentAlgorithm() {
        return this.contentAlgorithm;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getLength() {
        return this.length;
    }

    @NotNull
    public final JweKeyPairParam copy(@Nullable String keyAlgorithm, @Nullable String contentAlgorithm, @Nullable Integer length) {
        return new JweKeyPairParam(keyAlgorithm, contentAlgorithm, length);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof JweKeyPairParam)) {
            return false;
        }
        JweKeyPairParam jweKeyPairParam = (JweKeyPairParam) other;
        return Intrinsics.areEqual(this.keyAlgorithm, jweKeyPairParam.keyAlgorithm) && Intrinsics.areEqual(this.contentAlgorithm, jweKeyPairParam.contentAlgorithm) && Intrinsics.areEqual(this.length, jweKeyPairParam.length);
    }

    @Nullable
    public final String getContentAlgorithm() {
        return this.contentAlgorithm;
    }

    @Nullable
    public final String getKeyAlgorithm() {
        return this.keyAlgorithm;
    }

    @Nullable
    public final Integer getLength() {
        return this.length;
    }

    public int hashCode() {
        String str = this.keyAlgorithm;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.contentAlgorithm;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.length;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    @Override // com.bbva.ethermobilesdk.plugin.param.MalformedParams
    public boolean isMalformed() {
        String str;
        String str2 = this.keyAlgorithm;
        return str2 == null || str2.length() == 0 || (str = this.contentAlgorithm) == null || str.length() == 0;
    }

    @NotNull
    public String toString() {
        return "JweKeyPairParam(keyAlgorithm=" + this.keyAlgorithm + ", contentAlgorithm=" + this.contentAlgorithm + ", length=" + this.length + RootService.CLOSE_BRACKET;
    }

    public JweKeyPairParam(@Nullable String str, @Nullable String str2, @Nullable Integer num) {
        this.keyAlgorithm = str;
        this.contentAlgorithm = str2;
        this.length = num;
    }

    public /* synthetic */ JweKeyPairParam(String str, String str2, Integer num, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? 1024 : num);
    }
}
