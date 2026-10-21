package com.bbva.component.ic.security.model;

import androidx.annotation.Keep;
import androidx.camera.camera2.internal.h0;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: OtpChallengeError.kt */
/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/bbva/component/ic/security/model/ChallengeErrorMessageParameter;", "", "name", "", "<init>", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "component-ic-security_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ChallengeErrorMessageParameter {

    @NotNull
    private final String name;

    public ChallengeErrorMessageParameter(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
    }

    public static /* synthetic */ ChallengeErrorMessageParameter copy$default(ChallengeErrorMessageParameter challengeErrorMessageParameter, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = challengeErrorMessageParameter.name;
        }
        return challengeErrorMessageParameter.copy(str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final ChallengeErrorMessageParameter copy(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new ChallengeErrorMessageParameter(name);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ChallengeErrorMessageParameter) && Intrinsics.areEqual(this.name, ((ChallengeErrorMessageParameter) other).name);
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.name.hashCode();
    }

    @NotNull
    public String toString() {
        return h0.b("ChallengeErrorMessageParameter(name=", this.name, ")");
    }
}
