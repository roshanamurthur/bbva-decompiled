package com.bbva.component.dm.naturalauth.domain.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: NaturalAuthEndpoints.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\u0006\u0010\u0015\u001a\u00020\u0006\u0012\u0006\u0010\u0019\u001a\u00020\u0006\u0012\u0006\u0010\u001d\u001a\u00020\u0006\u0012\u0006\u0010!\u001a\u00020\u0006¢\u0006\u0004\b\"\u0010#J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\u0011\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\b\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\fR\"\u0010\u0015\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\b\u001a\u0004\b\u0013\u0010\n\"\u0004\b\u0014\u0010\fR\"\u0010\u0019\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\b\u001a\u0004\b\u0017\u0010\n\"\u0004\b\u0018\u0010\fR\"\u0010\u001d\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\b\u001a\u0004\b\u001b\u0010\n\"\u0004\b\u001c\u0010\fR\"\u0010!\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\b\u001a\u0004\b\u001f\u0010\n\"\u0004\b \u0010\f¨\u0006$"}, d2 = {"Lcom/bbva/component/dm/naturalauth/domain/model/NaturalAuthEndpoints;", "", "", "host", "", "refreshHost", "Lcom/bbva/component/dm/naturalauth/domain/model/Endpoint;", "a", "Lcom/bbva/component/dm/naturalauth/domain/model/Endpoint;", "getRegisterInit", "()Lcom/bbva/component/dm/naturalauth/domain/model/Endpoint;", "setRegisterInit", "(Lcom/bbva/component/dm/naturalauth/domain/model/Endpoint;)V", "registerInit", "b", "getRegisterFinish", "setRegisterFinish", "registerFinish", "c", "getListAuthenticators", "setListAuthenticators", "listAuthenticators", "d", "getDelete", "setDelete", "delete", "e", "getAuthenticationInit", "setAuthenticationInit", "authenticationInit", "f", "getAuthenticationFinish", "setAuthenticationFinish", "authenticationFinish", "<init>", "(Lcom/bbva/component/dm/naturalauth/domain/model/Endpoint;Lcom/bbva/component/dm/naturalauth/domain/model/Endpoint;Lcom/bbva/component/dm/naturalauth/domain/model/Endpoint;Lcom/bbva/component/dm/naturalauth/domain/model/Endpoint;Lcom/bbva/component/dm/naturalauth/domain/model/Endpoint;Lcom/bbva/component/dm/naturalauth/domain/model/Endpoint;)V", "component-dm-naturalauth_release"}, k = 1, mv = {1, 9, 0})
public final class NaturalAuthEndpoints {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public Endpoint registerInit;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public Endpoint registerFinish;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public Endpoint listAuthenticators;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public Endpoint delete;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public Endpoint authenticationInit;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public Endpoint authenticationFinish;

    public NaturalAuthEndpoints(@NotNull Endpoint registerInit, @NotNull Endpoint registerFinish, @NotNull Endpoint listAuthenticators, @NotNull Endpoint delete, @NotNull Endpoint authenticationInit, @NotNull Endpoint authenticationFinish) {
        Intrinsics.checkNotNullParameter(registerInit, "registerInit");
        Intrinsics.checkNotNullParameter(registerFinish, "registerFinish");
        Intrinsics.checkNotNullParameter(listAuthenticators, "listAuthenticators");
        Intrinsics.checkNotNullParameter(delete, "delete");
        Intrinsics.checkNotNullParameter(authenticationInit, "authenticationInit");
        Intrinsics.checkNotNullParameter(authenticationFinish, "authenticationFinish");
        this.registerInit = registerInit;
        this.registerFinish = registerFinish;
        this.listAuthenticators = listAuthenticators;
        this.delete = delete;
        this.authenticationInit = authenticationInit;
        this.authenticationFinish = authenticationFinish;
    }

    @NotNull
    public final Endpoint getAuthenticationFinish() {
        return this.authenticationFinish;
    }

    @NotNull
    public final Endpoint getAuthenticationInit() {
        return this.authenticationInit;
    }

    @NotNull
    public final Endpoint getDelete() {
        return this.delete;
    }

    @NotNull
    public final Endpoint getListAuthenticators() {
        return this.listAuthenticators;
    }

    @NotNull
    public final Endpoint getRegisterFinish() {
        return this.registerFinish;
    }

    @NotNull
    public final Endpoint getRegisterInit() {
        return this.registerInit;
    }

    public final void refreshHost(@NotNull String host) {
        Intrinsics.checkNotNullParameter(host, "host");
        this.registerInit.setHost(host);
        this.registerFinish.setHost(host);
        this.listAuthenticators.setHost(host);
        this.delete.setHost(host);
        this.authenticationInit.setHost(host);
        this.authenticationFinish.setHost(host);
    }

    public final void setAuthenticationFinish(@NotNull Endpoint endpoint) {
        Intrinsics.checkNotNullParameter(endpoint, "<set-?>");
        this.authenticationFinish = endpoint;
    }

    public final void setAuthenticationInit(@NotNull Endpoint endpoint) {
        Intrinsics.checkNotNullParameter(endpoint, "<set-?>");
        this.authenticationInit = endpoint;
    }

    public final void setDelete(@NotNull Endpoint endpoint) {
        Intrinsics.checkNotNullParameter(endpoint, "<set-?>");
        this.delete = endpoint;
    }

    public final void setListAuthenticators(@NotNull Endpoint endpoint) {
        Intrinsics.checkNotNullParameter(endpoint, "<set-?>");
        this.listAuthenticators = endpoint;
    }

    public final void setRegisterFinish(@NotNull Endpoint endpoint) {
        Intrinsics.checkNotNullParameter(endpoint, "<set-?>");
        this.registerFinish = endpoint;
    }

    public final void setRegisterInit(@NotNull Endpoint endpoint) {
        Intrinsics.checkNotNullParameter(endpoint, "<set-?>");
        this.registerInit = endpoint;
    }
}
