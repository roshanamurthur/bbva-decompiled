package com.bbva.selfiecapture.plugin.command.params;

import androidx.annotation.Keep;
import androidx.camera.camera2.internal.h0;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.google.android.gms.fido.u2f.api.common.ClientData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: UpdateChallengeParams.kt */
/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/bbva/selfiecapture/plugin/command/params/UpdateChallengeParams;", "", ClientData.KEY_CHALLENGE, "", "<init>", "(Ljava/lang/String;)V", "getChallenge", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "selfie-capture-plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UpdateChallengeParams {

    @NotNull
    private final String challenge;

    public UpdateChallengeParams(@NotNull String challenge) {
        Intrinsics.checkNotNullParameter(challenge, "challenge");
        this.challenge = challenge;
    }

    public static /* synthetic */ UpdateChallengeParams copy$default(UpdateChallengeParams updateChallengeParams, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = updateChallengeParams.challenge;
        }
        return updateChallengeParams.copy(str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getChallenge() {
        return this.challenge;
    }

    @NotNull
    public final UpdateChallengeParams copy(@NotNull String challenge) {
        Intrinsics.checkNotNullParameter(challenge, "challenge");
        return new UpdateChallengeParams(challenge);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof UpdateChallengeParams) && Intrinsics.areEqual(this.challenge, ((UpdateChallengeParams) other).challenge);
    }

    @NotNull
    public final String getChallenge() {
        return this.challenge;
    }

    public int hashCode() {
        return this.challenge.hashCode();
    }

    @NotNull
    public String toString() {
        return h0.b("UpdateChallengeParams(challenge=", this.challenge, ")");
    }
}
