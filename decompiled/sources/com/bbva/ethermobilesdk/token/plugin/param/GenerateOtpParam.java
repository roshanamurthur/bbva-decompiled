package com.bbva.ethermobilesdk.token.plugin.param;

import androidx.annotation.Keep;
import androidx.constraintlayout.core.parser.a;
import com.bbva.ethermobilesdk.token.plugin.command.ActivateTokenCommand;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateOtpCommand;
import com.google.android.gms.fido.u2f.api.common.ClientData;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: GenerateOtpParam.kt */
/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J7\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\b\u0010\u0019\u001a\u00020\u0007H\u0016J\b\u0010\u001a\u001a\u00020\u0007H\u0002J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001c"}, d2 = {"Lcom/bbva/ethermobilesdk/token/plugin/param/GenerateOtpParam;", "Lcom/bbva/ethermobilesdk/token/plugin/param/MalformedParams;", "action", "", ActivateTokenCommand.TOKEN_ID, ClientData.KEY_CHALLENGE, "nextWindow", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getAction", "()Ljava/lang/String;", "getChallenge", "getNextWindow", "()Z", "getTokenId", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "isMalformed", "isValidAction", "toString", "ethertoken-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nGenerateOtpParam.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GenerateOtpParam.kt\ncom/bbva/ethermobilesdk/token/plugin/param/GenerateOtpParam\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,24:1\n12744#2,2:25\n*S KotlinDebug\n*F\n+ 1 GenerateOtpParam.kt\ncom/bbva/ethermobilesdk/token/plugin/param/GenerateOtpParam\n*L\n20#1:25,2\n*E\n"})
public final /* data */ class GenerateOtpParam implements MalformedParams {

    @SerializedName("action")
    @Nullable
    private final String action;

    @SerializedName(ClientData.KEY_CHALLENGE)
    @Nullable
    private final String challenge;

    @SerializedName("nextWindow")
    private final boolean nextWindow;

    @SerializedName(ActivateTokenCommand.TOKEN_ID)
    @Nullable
    private final String tokenId;

    public GenerateOtpParam() {
        this(null, null, null, false, 15, null);
    }

    public static /* synthetic */ GenerateOtpParam copy$default(GenerateOtpParam generateOtpParam, String str, String str2, String str3, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = generateOtpParam.action;
        }
        if ((i10 & 2) != 0) {
            str2 = generateOtpParam.tokenId;
        }
        if ((i10 & 4) != 0) {
            str3 = generateOtpParam.challenge;
        }
        if ((i10 & 8) != 0) {
            z10 = generateOtpParam.nextWindow;
        }
        return generateOtpParam.copy(str, str2, str3, z10);
    }

    private final boolean isValidAction() {
        for (GenerateOtpCommand.GenerateAction generateAction : GenerateOtpCommand.GenerateAction.values()) {
            if (Intrinsics.areEqual(generateAction.name(), this.action)) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTokenId() {
        return this.tokenId;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getChallenge() {
        return this.challenge;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getNextWindow() {
        return this.nextWindow;
    }

    @NotNull
    public final GenerateOtpParam copy(@Nullable String action, @Nullable String tokenId, @Nullable String challenge, boolean nextWindow) {
        return new GenerateOtpParam(action, tokenId, challenge, nextWindow);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GenerateOtpParam)) {
            return false;
        }
        GenerateOtpParam generateOtpParam = (GenerateOtpParam) other;
        return Intrinsics.areEqual(this.action, generateOtpParam.action) && Intrinsics.areEqual(this.tokenId, generateOtpParam.tokenId) && Intrinsics.areEqual(this.challenge, generateOtpParam.challenge) && this.nextWindow == generateOtpParam.nextWindow;
    }

    @Nullable
    public final String getAction() {
        return this.action;
    }

    @Nullable
    public final String getChallenge() {
        return this.challenge;
    }

    public final boolean getNextWindow() {
        return this.nextWindow;
    }

    @Nullable
    public final String getTokenId() {
        return this.tokenId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v6 */
    public int hashCode() {
        String str = this.action;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.tokenId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.challenge;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        boolean z10 = this.nextWindow;
        ?? r1 = z10;
        if (z10) {
            r1 = 1;
        }
        return iHashCode3 + r1;
    }

    @Override // com.bbva.ethermobilesdk.token.plugin.param.MalformedParams
    public boolean isMalformed() {
        String str = this.tokenId;
        return str == null || l.isBlank(str) || !isValidAction();
    }

    @NotNull
    public String toString() {
        String str = this.action;
        String str2 = this.tokenId;
        String str3 = this.challenge;
        boolean z10 = this.nextWindow;
        StringBuilder sbC = a.c("GenerateOtpParam(action=", str, ", tokenId=", str2, ", challenge=");
        sbC.append(str3);
        sbC.append(", nextWindow=");
        sbC.append(z10);
        sbC.append(")");
        return sbC.toString();
    }

    public GenerateOtpParam(@Nullable String str, @Nullable String str2, @Nullable String str3, boolean z10) {
        this.action = str;
        this.tokenId = str2;
        this.challenge = str3;
        this.nextWindow = z10;
    }

    public /* synthetic */ GenerateOtpParam(String str, String str2, String str3, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? false : z10);
    }
}
