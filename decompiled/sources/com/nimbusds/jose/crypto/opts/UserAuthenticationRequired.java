package com.nimbusds.jose.crypto.opts;

import com.nimbusds.jose.JWSSignerOption;
import net.jcip.annotations.Immutable;

/* JADX INFO: loaded from: classes10.dex */
@Immutable
public final class UserAuthenticationRequired implements JWSSignerOption {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final UserAuthenticationRequired f62618a = new UserAuthenticationRequired();

    public static UserAuthenticationRequired getInstance() {
        return f62618a;
    }

    public String toString() {
        return "UserAuthenticationRequired";
    }
}
