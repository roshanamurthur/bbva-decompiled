package com.bbva.plugin.digipassmanager.commands.params;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.google.android.gms.fido.u2f.api.common.ClientData;
import com.mypinpad.tsdk.isolation.y2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: GenerateOtpParams.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/bbva/plugin/digipassmanager/commands/params/GenerateOtpParams;", "", "deviceId", "", ClientData.KEY_CHALLENGE, "(Ljava/lang/String;Ljava/lang/String;)V", "getChallenge", "()Ljava/lang/String;", "getDeviceId", "component1", "component2", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "digipassmanager-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class GenerateOtpParams {

    @Nullable
    private final String challenge;

    @NotNull
    private final String deviceId;

    public GenerateOtpParams(@NotNull String deviceId, @Nullable String str) {
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        this.deviceId = deviceId;
        this.challenge = str;
    }

    public static /* synthetic */ GenerateOtpParams copy$default(GenerateOtpParams generateOtpParams, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = generateOtpParams.deviceId;
        }
        if ((i10 & 2) != 0) {
            str2 = generateOtpParams.challenge;
        }
        return generateOtpParams.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getChallenge() {
        return this.challenge;
    }

    @NotNull
    public final GenerateOtpParams copy(@NotNull String deviceId, @Nullable String challenge) {
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        return new GenerateOtpParams(deviceId, challenge);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GenerateOtpParams)) {
            return false;
        }
        GenerateOtpParams generateOtpParams = (GenerateOtpParams) other;
        return Intrinsics.areEqual(this.deviceId, generateOtpParams.deviceId) && Intrinsics.areEqual(this.challenge, generateOtpParams.challenge);
    }

    @Nullable
    public final String getChallenge() {
        return this.challenge;
    }

    @NotNull
    public final String getDeviceId() {
        return this.deviceId;
    }

    public int hashCode() {
        int iHashCode = this.deviceId.hashCode() * 31;
        String str = this.challenge;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("GenerateOtpParams(deviceId=");
        sb2.append(this.deviceId);
        sb2.append(", challenge=");
        return y2.b(sb2, this.challenge, RootService.CLOSE_BRACKET);
    }
}
