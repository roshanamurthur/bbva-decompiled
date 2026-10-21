package com.bbva.ethermobilesdk.token.plugin.param;

import androidx.annotation.Keep;
import androidx.collection.k;
import androidx.constraintlayout.core.parser.a;
import com.bbva.ethermobilesdk.token.plugin.command.ActivateTokenCommand;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.google.gson.annotations.SerializedName;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ActivateTokenParam.kt */
/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u000fJJ\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\b\u0010!\u001a\u00020\u001cH\u0016J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000b\"\u0004\b\u0012\u0010\u0013¨\u0006#"}, d2 = {"Lcom/bbva/ethermobilesdk/token/plugin/param/ActivateTokenParam;", "Lcom/bbva/ethermobilesdk/token/plugin/param/MalformedParams;", ActivateTokenCommand.TOKEN_ID, "", "data", "configuration", "seed", "timestamp", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "getConfiguration", "()Ljava/lang/String;", "getData", "getSeed", "getTimestamp", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getTokenId", "setTokenId", "(Ljava/lang/String;)V", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lcom/bbva/ethermobilesdk/token/plugin/param/ActivateTokenParam;", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "isMalformed", "toString", "ethertoken-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class ActivateTokenParam implements MalformedParams {

    @SerializedName("configuration")
    @Nullable
    private final String configuration;

    @SerializedName("data")
    @Nullable
    private final String data;

    @SerializedName("seed")
    @Nullable
    private final String seed;

    @SerializedName("timestamp")
    @Nullable
    private final Long timestamp;

    @SerializedName(ActivateTokenCommand.TOKEN_ID)
    @Nullable
    private String tokenId;

    public ActivateTokenParam() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ ActivateTokenParam copy$default(ActivateTokenParam activateTokenParam, String str, String str2, String str3, String str4, Long l6, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = activateTokenParam.tokenId;
        }
        if ((i10 & 2) != 0) {
            str2 = activateTokenParam.data;
        }
        String str5 = str2;
        if ((i10 & 4) != 0) {
            str3 = activateTokenParam.configuration;
        }
        String str6 = str3;
        if ((i10 & 8) != 0) {
            str4 = activateTokenParam.seed;
        }
        String str7 = str4;
        if ((i10 & 16) != 0) {
            l6 = activateTokenParam.timestamp;
        }
        return activateTokenParam.copy(str, str5, str6, str7, l6);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTokenId() {
        return this.tokenId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getData() {
        return this.data;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getConfiguration() {
        return this.configuration;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSeed() {
        return this.seed;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    public final ActivateTokenParam copy(@Nullable String tokenId, @Nullable String data, @Nullable String configuration, @Nullable String seed, @Nullable Long timestamp) {
        return new ActivateTokenParam(tokenId, data, configuration, seed, timestamp);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActivateTokenParam)) {
            return false;
        }
        ActivateTokenParam activateTokenParam = (ActivateTokenParam) other;
        return Intrinsics.areEqual(this.tokenId, activateTokenParam.tokenId) && Intrinsics.areEqual(this.data, activateTokenParam.data) && Intrinsics.areEqual(this.configuration, activateTokenParam.configuration) && Intrinsics.areEqual(this.seed, activateTokenParam.seed) && Intrinsics.areEqual(this.timestamp, activateTokenParam.timestamp);
    }

    @Nullable
    public final String getConfiguration() {
        return this.configuration;
    }

    @Nullable
    public final String getData() {
        return this.data;
    }

    @Nullable
    public final String getSeed() {
        return this.seed;
    }

    @Nullable
    public final Long getTimestamp() {
        return this.timestamp;
    }

    @Nullable
    public final String getTokenId() {
        return this.tokenId;
    }

    public int hashCode() {
        String str = this.tokenId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.data;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.configuration;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.seed;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l6 = this.timestamp;
        return iHashCode4 + (l6 != null ? l6.hashCode() : 0);
    }

    @Override // com.bbva.ethermobilesdk.token.plugin.param.MalformedParams
    public boolean isMalformed() {
        String str;
        String str2;
        String str3;
        String str4 = this.tokenId;
        return str4 == null || l.isBlank(str4) || (str = this.data) == null || l.isBlank(str) || (str2 = this.configuration) == null || l.isBlank(str2) || (str3 = this.seed) == null || l.isBlank(str3) || this.timestamp == null;
    }

    public final void setTokenId(@Nullable String str) {
        this.tokenId = str;
    }

    @NotNull
    public String toString() {
        String str = this.tokenId;
        String str2 = this.data;
        String str3 = this.configuration;
        String str4 = this.seed;
        Long l6 = this.timestamp;
        StringBuilder sbC = a.c("ActivateTokenParam(tokenId=", str, ", data=", str2, ", configuration=");
        k.e(sbC, str3, ", seed=", str4, ", timestamp=");
        sbC.append(l6);
        sbC.append(")");
        return sbC.toString();
    }

    public ActivateTokenParam(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Long l6) {
        this.tokenId = str;
        this.data = str2;
        this.configuration = str3;
        this.seed = str4;
        this.timestamp = l6;
    }

    public /* synthetic */ ActivateTokenParam(String str, String str2, String str3, String str4, Long l6, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) == 0 ? str4 : null, (i10 & 16) != 0 ? Long.valueOf(Calendar.getInstance().getTimeInMillis()) : l6);
    }
}
