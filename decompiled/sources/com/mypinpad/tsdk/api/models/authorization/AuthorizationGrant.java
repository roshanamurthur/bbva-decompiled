package com.mypinpad.tsdk.api.models.authorization;

import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0001\b"}, d2 = {"Lcom/mypinpad/tsdk/api/models/authorization/AuthorizationGrant;", "", "", "a", "Ljava/lang/String;", "getScope", "()Ljava/lang/String;", "scope", "Lcom/mypinpad/tsdk/api/models/authorization/ClientCredentialsGrant;"}, k = 1, mv = {1, 8, 0})
public abstract class AuthorizationGrant {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String scope;

    public AuthorizationGrant(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this.scope = str;
    }

    @JvmName(name = "getScope")
    @NotNull
    public final String getScope() {
        return this.scope;
    }
}
