package org.bouncycastle.crypto.commitments;

import java.security.SecureRandom;
import org.bouncycastle.crypto.Commitment;
import org.bouncycastle.crypto.Committer;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.ExtendedDigest;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class GeneralHashCommitter implements Committer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExtendedDigest f87971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f87972b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SecureRandom f87973c;

    public GeneralHashCommitter(ExtendedDigest extendedDigest, SecureRandom secureRandom) {
        this.f87971a = extendedDigest;
        this.f87972b = extendedDigest.getByteLength();
        this.f87973c = secureRandom;
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) {
        ExtendedDigest extendedDigest = this.f87971a;
        byte[] bArr3 = new byte[extendedDigest.getDigestSize()];
        extendedDigest.update(bArr, 0, bArr.length);
        extendedDigest.update(bArr2, 0, bArr2.length);
        extendedDigest.update((byte) (bArr2.length >>> 8));
        extendedDigest.update((byte) bArr2.length);
        extendedDigest.doFinal(bArr3, 0);
        return bArr3;
    }

    @Override // org.bouncycastle.crypto.Committer
    public Commitment commit(byte[] bArr) {
        int length = bArr.length;
        int i10 = this.f87972b;
        if (length > i10 / 2) {
            throw new DataLengthException("Message to be committed to too large for digest.");
        }
        byte[] bArr2 = new byte[i10 - bArr.length];
        this.f87973c.nextBytes(bArr2);
        return new Commitment(bArr2, a(bArr2, bArr));
    }

    @Override // org.bouncycastle.crypto.Committer
    public boolean isRevealed(Commitment commitment, byte[] bArr) {
        if (bArr.length + commitment.getSecret().length != this.f87972b) {
            throw new DataLengthException("Message and witness secret lengths do not match.");
        }
        return Arrays.constantTimeAreEqual(commitment.getCommitment(), a(commitment.getSecret(), bArr));
    }
}
