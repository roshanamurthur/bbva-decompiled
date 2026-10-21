package com.nimbusds.jose;

import com.nimbusds.jose.util.Base64URL;
import net.jcip.annotations.Immutable;

/* JADX INFO: loaded from: classes10.dex */
@Immutable
public final class JWECryptoParts {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JWEHeader f62505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Base64URL f62506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Base64URL f62507c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Base64URL f62508d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Base64URL f62509e;

    public JWECryptoParts(Base64URL base64URL, Base64URL base64URL2, Base64URL base64URL3, Base64URL base64URL4) {
        this(null, base64URL, base64URL2, base64URL3, base64URL4);
    }

    public Base64URL getAuthenticationTag() {
        return this.f62509e;
    }

    public Base64URL getCipherText() {
        return this.f62508d;
    }

    public Base64URL getEncryptedKey() {
        return this.f62506b;
    }

    public JWEHeader getHeader() {
        return this.f62505a;
    }

    public Base64URL getInitializationVector() {
        return this.f62507c;
    }

    public JWECryptoParts(JWEHeader jWEHeader, Base64URL base64URL, Base64URL base64URL2, Base64URL base64URL3, Base64URL base64URL4) {
        this.f62505a = jWEHeader;
        this.f62506b = base64URL;
        this.f62507c = base64URL2;
        if (base64URL3 == null) {
            throw new IllegalArgumentException("The cipher text must not be null");
        }
        this.f62508d = base64URL3;
        this.f62509e = base64URL4;
    }
}
