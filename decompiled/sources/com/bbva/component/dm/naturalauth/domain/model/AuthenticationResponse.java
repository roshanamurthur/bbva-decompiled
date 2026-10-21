package com.bbva.component.dm.naturalauth.domain.model;

import ad.d;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AuthenticationResponse.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J'\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0012\u001a\u0004\b\u001a\u0010\u0014¨\u0006\u001d"}, d2 = {"Lcom/bbva/component/dm/naturalauth/domain/model/AuthenticationResponse;", "", "", "component1", "", "component2", "component3", "message", "lifetime", "id", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "b", "J", "getLifetime", "()J", "c", "getId", "<init>", "(Ljava/lang/String;JLjava/lang/String;)V", "component-dm-naturalauth_release"}, k = 1, mv = {1, 9, 0})
public final /* data */ class AuthenticationResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String message;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final long lifetime;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String id;

    public AuthenticationResponse(@NotNull String message, long j10, @NotNull String id) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(id, "id");
        this.message = message;
        this.lifetime = j10;
        this.id = id;
    }

    public static /* synthetic */ AuthenticationResponse copy$default(AuthenticationResponse authenticationResponse, String str, long j10, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = authenticationResponse.message;
        }
        if ((i10 & 2) != 0) {
            j10 = authenticationResponse.lifetime;
        }
        if ((i10 & 4) != 0) {
            str2 = authenticationResponse.id;
        }
        return authenticationResponse.copy(str, j10, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getLifetime() {
        return this.lifetime;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final AuthenticationResponse copy(@NotNull String message, long lifetime, @NotNull String id) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(id, "id");
        return new AuthenticationResponse(message, lifetime, id);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AuthenticationResponse)) {
            return false;
        }
        AuthenticationResponse authenticationResponse = (AuthenticationResponse) other;
        return Intrinsics.areEqual(this.message, authenticationResponse.message) && this.lifetime == authenticationResponse.lifetime && Intrinsics.areEqual(this.id, authenticationResponse.id);
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public final long getLifetime() {
        return this.lifetime;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        int iHashCode = this.message.hashCode() * 31;
        long j10 = this.lifetime;
        return this.id.hashCode() + ((iHashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("AuthenticationResponse(message=");
        sb2.append(this.message);
        sb2.append(", lifetime=");
        sb2.append(this.lifetime);
        sb2.append(", id=");
        return d.f(sb2, this.id, ")");
    }
}
