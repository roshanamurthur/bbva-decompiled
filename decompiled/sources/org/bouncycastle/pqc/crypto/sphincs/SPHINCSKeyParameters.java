package org.bouncycastle.pqc.crypto.sphincs;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

/* JADX INFO: loaded from: classes13.dex */
public class SPHINCSKeyParameters extends AsymmetricKeyParameter {
    public static final String SHA3_256 = "SHA3-256";
    public static final String SHA512_256 = "SHA-512/256";

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final String f91261q0;

    public SPHINCSKeyParameters(boolean z10, String str) {
        super(z10);
        this.f91261q0 = str;
    }

    public String getTreeDigest() {
        return this.f91261q0;
    }
}
