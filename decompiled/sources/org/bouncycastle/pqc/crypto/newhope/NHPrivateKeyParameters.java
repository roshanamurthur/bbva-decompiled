package org.bouncycastle.pqc.crypto.newhope;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes13.dex */
public class NHPrivateKeyParameters extends AsymmetricKeyParameter {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final short[] f91198q0;

    public NHPrivateKeyParameters(short[] sArr) {
        super(true);
        this.f91198q0 = Arrays.clone(sArr);
    }

    public short[] getSecData() {
        return Arrays.clone(this.f91198q0);
    }
}
