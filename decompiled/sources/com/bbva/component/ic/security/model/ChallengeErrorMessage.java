package com.bbva.component.ic.security.model;

import androidx.annotation.Keep;
import androidx.camera.camera2.internal.n1;
import androidx.camera.core.imagecapture.a;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: OtpChallengeError.kt */
/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/bbva/component/ic/security/model/ChallengeErrorMessage;", "", "code", "", "message", "parameters", "", "Lcom/bbva/component/ic/security/model/ChallengeErrorMessageParameter;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getCode", "()Ljava/lang/String;", "getMessage", "getParameters", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "component-ic-security_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ChallengeErrorMessage {

    @NotNull
    private final String code;

    @NotNull
    private final String message;

    @NotNull
    private final List<ChallengeErrorMessageParameter> parameters;

    public ChallengeErrorMessage(@NotNull String code, @NotNull String message, @NotNull List<ChallengeErrorMessageParameter> parameters) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        this.code = code;
        this.message = message;
        this.parameters = parameters;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChallengeErrorMessage copy$default(ChallengeErrorMessage challengeErrorMessage, String str, String str2, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = challengeErrorMessage.code;
        }
        if ((i10 & 2) != 0) {
            str2 = challengeErrorMessage.message;
        }
        if ((i10 & 4) != 0) {
            list = challengeErrorMessage.parameters;
        }
        return challengeErrorMessage.copy(str, str2, list);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public final List<ChallengeErrorMessageParameter> component3() {
        return this.parameters;
    }

    @NotNull
    public final ChallengeErrorMessage copy(@NotNull String code, @NotNull String message, @NotNull List<ChallengeErrorMessageParameter> parameters) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        return new ChallengeErrorMessage(code, message, parameters);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChallengeErrorMessage)) {
            return false;
        }
        ChallengeErrorMessage challengeErrorMessage = (ChallengeErrorMessage) other;
        return Intrinsics.areEqual(this.code, challengeErrorMessage.code) && Intrinsics.areEqual(this.message, challengeErrorMessage.message) && Intrinsics.areEqual(this.parameters, challengeErrorMessage.parameters);
    }

    @NotNull
    public final String getCode() {
        return this.code;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public final List<ChallengeErrorMessageParameter> getParameters() {
        return this.parameters;
    }

    public int hashCode() {
        return this.parameters.hashCode() + n1.c(this.message, this.code.hashCode() * 31, 31);
    }

    @NotNull
    public String toString() {
        String str = this.code;
        String str2 = this.message;
        return a.c(androidx.constraintlayout.core.parser.a.c("ChallengeErrorMessage(code=", str, ", message=", str2, ", parameters="), this.parameters, ")");
    }
}
