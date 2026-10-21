package com.bbva.ethermobilesdk.token.plugin.model;

import ad.d;
import com.bbva.androidtoolkit.plugin.response.ErrorMessage;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PluginEtherTokenError.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0004HÖ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¨\u0006\u0011"}, d2 = {"Lcom/bbva/ethermobilesdk/token/plugin/model/UnknownError;", "Lcom/bbva/androidtoolkit/plugin/response/ErrorMessage;", "", "getCode", "", "getMessage", "code", "message", "copy", "toString", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "<init>", "(ILjava/lang/String;)V", "ethertoken-plugin_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class UnknownError implements ErrorMessage {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final int f30183p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final String f30184q0;

    public UnknownError(int i10, @NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f30183p0 = i10;
        this.f30184q0 = message;
    }

    public static /* synthetic */ UnknownError copy$default(UnknownError unknownError, int i10, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = unknownError.f30183p0;
        }
        if ((i11 & 2) != 0) {
            str = unknownError.f30184q0;
        }
        return unknownError.copy(i10, str);
    }

    @NotNull
    public final UnknownError copy(int code, @NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        return new UnknownError(code, message);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnknownError)) {
            return false;
        }
        UnknownError unknownError = (UnknownError) other;
        return this.f30183p0 == unknownError.f30183p0 && Intrinsics.areEqual(this.f30184q0, unknownError.f30184q0);
    }

    @Override // com.bbva.androidtoolkit.plugin.response.ErrorMessage
    /* JADX INFO: renamed from: getCode, reason: from getter */
    public int getF30183p0() {
        return this.f30183p0;
    }

    @Override // com.bbva.androidtoolkit.plugin.response.ErrorMessage
    @NotNull
    /* JADX INFO: renamed from: getMessage, reason: from getter */
    public String getF30184q0() {
        return this.f30184q0;
    }

    public int hashCode() {
        return this.f30184q0.hashCode() + (this.f30183p0 * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("UnknownError(code=");
        sb2.append(this.f30183p0);
        sb2.append(", message=");
        return d.f(sb2, this.f30184q0, ")");
    }
}
