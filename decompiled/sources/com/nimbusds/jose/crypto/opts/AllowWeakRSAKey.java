package com.nimbusds.jose.crypto.opts;

import com.nimbusds.jose.JWSSignerOption;
import net.jcip.annotations.Immutable;

/* JADX INFO: loaded from: classes10.dex */
@Immutable
public final class AllowWeakRSAKey implements JWSSignerOption {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AllowWeakRSAKey f62617a = new AllowWeakRSAKey();

    public static AllowWeakRSAKey getInstance() {
        return f62617a;
    }

    public String toString() {
        return "AllowWeakRSAKey";
    }
}
