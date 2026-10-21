package com.mypinpad.tsdk.isolation;

import com.mypinpad.tsdk.api.models.authorization.AuthorizationGrant;
import com.mypinpad.tsdk.api.models.authorization.ClientCredentialsGrant;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class su {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f60934a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f60935b = 1;

    @NotNull
    public static final st setCompoundDrawableTintBlendMode(@NotNull AuthorizationGrant authorizationGrant) {
        return (st) setY(new Object[]{authorizationGrant}, 110887923, -110887923, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        AuthorizationGrant authorizationGrant = (AuthorizationGrant) objArr[0];
        int i13 = f60934a;
        int i14 = (i13 ^ 95) + ((i13 & 95) << 1);
        f60935b = i14 % 128;
        if (i14 % 2 == 0) {
            Intrinsics.checkNotNullParameter(authorizationGrant, "");
            boolean z10 = authorizationGrant instanceof ClientCredentialsGrant;
            throw null;
        }
        Intrinsics.checkNotNullParameter(authorizationGrant, "");
        if (!(authorizationGrant instanceof ClientCredentialsGrant)) {
            throw new NoWhenBranchMatchedException();
        }
        String scope = authorizationGrant.getScope();
        ClientCredentialsGrant clientCredentialsGrant = (ClientCredentialsGrant) authorizationGrant;
        st stVar = new st(scope, clientCredentialsGrant.getClientId(), clientCredentialsGrant.getClientSecret());
        int i15 = f60935b;
        int i16 = ((i15 | 31) << 1) - (i15 ^ 31);
        f60934a = i16 % 128;
        if (i16 % 2 == 0) {
            return stVar;
        }
        throw null;
    }
}
