package com.bbva.component.ic.security.model;

import androidx.annotation.Keep;
import androidx.camera.camera2.internal.h0;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ForbiddenBodyModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\b\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/bbva/component/ic/security/model/ForbiddenMessage;", "", "code", "", "<init>", "(Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "isForbidden", "", "()Z", "component1", "copy", "equals", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "component-ic-security_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ForbiddenMessage {

    @NotNull
    private final String code;

    public ForbiddenMessage(@NotNull String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        this.code = code;
    }

    public static /* synthetic */ ForbiddenMessage copy$default(ForbiddenMessage forbiddenMessage, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = forbiddenMessage.code;
        }
        return forbiddenMessage.copy(str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    @NotNull
    public final ForbiddenMessage copy(@NotNull String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        return new ForbiddenMessage(code);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ForbiddenMessage) && Intrinsics.areEqual(this.code, ((ForbiddenMessage) other).code);
    }

    @NotNull
    public final String getCode() {
        return this.code;
    }

    public int hashCode() {
        return this.code.hashCode();
    }

    public final boolean isForbidden() {
        return Intrinsics.areEqual(this.code, "forbidden");
    }

    @NotNull
    public String toString() {
        return h0.b("ForbiddenMessage(code=", this.code, ")");
    }
}
