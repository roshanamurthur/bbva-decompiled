package com.bbva.plugin.biometrics.command.response;

import androidx.annotation.Keep;
import com.bbva.androidtoolkit.plugin.postmessage.PayloadDTO;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.mypinpad.tsdk.isolation.y2;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AuthenticationFailedDTO.kt */
/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/bbva/plugin/biometrics/command/response/AuthenticationFailedDTO;", "Lcom/bbva/androidtoolkit/plugin/postmessage/PayloadDTO;", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "biometrics-plugin_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class AuthenticationFailedDTO extends PayloadDTO {

    @NotNull
    private final String message;

    /* JADX WARN: Multi-variable type inference failed */
    public AuthenticationFailedDTO() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ AuthenticationFailedDTO copy$default(AuthenticationFailedDTO authenticationFailedDTO, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = authenticationFailedDTO.message;
        }
        return authenticationFailedDTO.copy(str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public final AuthenticationFailedDTO copy(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        return new AuthenticationFailedDTO(message);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AuthenticationFailedDTO) && Intrinsics.areEqual(this.message, ((AuthenticationFailedDTO) other).message);
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        return this.message.hashCode();
    }

    @NotNull
    public String toString() {
        return y2.b(new StringBuilder("AuthenticationFailedDTO(message="), this.message, RootService.CLOSE_BRACKET);
    }

    public /* synthetic */ AuthenticationFailedDTO(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "Authentication attempt failed" : str);
    }

    public AuthenticationFailedDTO(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.message = message;
    }
}
