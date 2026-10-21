package org.bouncycastle.pqc.crypto;

import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

/* JADX INFO: loaded from: classes13.dex */
public class DigestingStateAwareMessageSigner extends DigestingMessageSigner {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final StateAwareMessageSigner f90960d;

    public DigestingStateAwareMessageSigner(StateAwareMessageSigner stateAwareMessageSigner, Digest digest) {
        super(stateAwareMessageSigner, digest);
        this.f90960d = stateAwareMessageSigner;
    }

    public AsymmetricKeyParameter getUpdatedPrivateKey() {
        return this.f90960d.getUpdatedPrivateKey();
    }
}
