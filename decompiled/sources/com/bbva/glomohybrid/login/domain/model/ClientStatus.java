package com.bbva.glomohybrid.login.domain.model;

import ad.d;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ClientStatus.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0015\u0010\u0005\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/bbva/glomohybrid/login/domain/model/ClientStatus;", "", "", "component1", "status", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getStatus", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "Login_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0})
public final /* data */ class ClientStatus {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String status;

    public ClientStatus(@Nullable String str) {
        this.status = str;
    }

    public static /* synthetic */ ClientStatus copy$default(ClientStatus clientStatus, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = clientStatus.status;
        }
        return clientStatus.copy(str);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @NotNull
    public final ClientStatus copy(@Nullable String status) {
        return new ClientStatus(status);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ClientStatus) && Intrinsics.areEqual(this.status, ((ClientStatus) other).status);
    }

    @Nullable
    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        String str = this.status;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @NotNull
    public String toString() {
        return d.f(new StringBuilder("ClientStatus(status="), this.status, ")");
    }
}
