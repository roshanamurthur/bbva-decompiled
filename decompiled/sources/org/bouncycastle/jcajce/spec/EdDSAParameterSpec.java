package org.bouncycastle.jcajce.spec;

import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.asn1.edec.EdECObjectIdentifiers;

/* JADX INFO: loaded from: classes8.dex */
public class EdDSAParameterSpec implements AlgorithmParameterSpec {
    public static final String Ed25519 = "Ed25519";
    public static final String Ed448 = "Ed448";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f90266a;

    public EdDSAParameterSpec(String str) {
        if (!str.equalsIgnoreCase(Ed25519)) {
            if (!str.equalsIgnoreCase(Ed448)) {
                if (!str.equals(EdECObjectIdentifiers.id_Ed25519.getId())) {
                    if (!str.equals(EdECObjectIdentifiers.id_Ed448.getId())) {
                        throw new IllegalArgumentException("unrecognized curve name: ".concat(str));
                    }
                }
            }
            this.f90266a = Ed448;
            return;
        }
        this.f90266a = Ed25519;
    }

    public String getCurveName() {
        return this.f90266a;
    }
}
