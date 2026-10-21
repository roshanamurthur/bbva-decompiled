package com.mypinpad.tsdk.api.models.authorization;

import com.bbva.component.request.header.customerid.CustomerIdInterceptor;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006"}, d2 = {"Lcom/mypinpad/tsdk/api/models/authorization/ClientCredentialsGrant;", "Lcom/mypinpad/tsdk/api/models/authorization/AuthorizationGrant;", "", "b", "Ljava/lang/String;", "getClientId", "()Ljava/lang/String;", CustomerIdInterceptor.CLIENT_ID, "c", "getClientSecret", "clientSecret", "scope", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V"}, k = 1, mv = {1, 8, 0})
public final class ClientCredentialsGrant extends AuthorizationGrant {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f51726d;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String clientId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String clientSecret;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClientCredentialsGrant(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        super(str, null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.clientId = str2;
        this.clientSecret = str3;
    }

    @JvmName(name = "getClientId")
    @NotNull
    public final String getClientId() {
        int i10 = f51726d + 65;
        int i11 = i10 % 128;
        if (i10 % 2 != 0) {
            return this.clientId;
        }
        throw null;
    }

    @JvmName(name = "getClientSecret")
    @NotNull
    public final String getClientSecret() {
        int i10 = f51726d;
        int i11 = (i10 & (-118)) | ((~i10) & 117);
        int i12 = (i10 & 117) << 1;
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        int i14 = i13 % 128;
        int i15 = i13 % 2;
        int i16 = i14 + 81;
        f51726d = i16 % 128;
        if (i16 % 2 == 0) {
            return this.clientSecret;
        }
        throw null;
    }
}
