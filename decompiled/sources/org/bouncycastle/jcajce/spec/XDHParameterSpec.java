package org.bouncycastle.jcajce.spec;

import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.asn1.edec.EdECObjectIdentifiers;

/* JADX INFO: loaded from: classes8.dex */
public class XDHParameterSpec implements AlgorithmParameterSpec {
    public static final String X25519 = "X25519";
    public static final String X448 = "X448";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f90310a;

    public XDHParameterSpec(String str) {
        if (!str.equalsIgnoreCase(X25519)) {
            if (!str.equalsIgnoreCase(X448)) {
                if (!str.equals(EdECObjectIdentifiers.id_X25519.getId())) {
                    if (!str.equals(EdECObjectIdentifiers.id_X448.getId())) {
                        throw new IllegalArgumentException("unrecognized curve name: ".concat(str));
                    }
                }
            }
            this.f90310a = X448;
            return;
        }
        this.f90310a = X25519;
    }

    public String getCurveName() {
        return this.f90310a;
    }
}
