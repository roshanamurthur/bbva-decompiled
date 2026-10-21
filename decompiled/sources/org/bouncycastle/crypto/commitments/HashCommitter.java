package org.bouncycastle.crypto.commitments;

import java.security.SecureRandom;
import org.bouncycastle.crypto.Commitment;
import org.bouncycastle.crypto.Committer;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.ExtendedDigest;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class HashCommitter implements Committer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExtendedDigest f87974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f87975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SecureRandom f87976c;

    public HashCommitter(ExtendedDigest extendedDigest, SecureRandom secureRandom) {
        this.f87974a = extendedDigest;
        this.f87975b = extendedDigest.getByteLength();
        this.f87976c = secureRandom;
    }

    @Override // org.bouncycastle.crypto.Committer
    public Commitment commit(byte[] bArr) {
        int length = bArr.length;
        int i10 = this.f87975b;
        if (length > i10 / 2) {
            throw new DataLengthException("Message to be committed to too large for digest.");
        }
        int length2 = i10 - bArr.length;
        byte[] bArr2 = new byte[length2];
        this.f87976c.nextBytes(bArr2);
        ExtendedDigest extendedDigest = this.f87974a;
        byte[] bArr3 = new byte[extendedDigest.getDigestSize()];
        extendedDigest.update(bArr2, 0, length2);
        extendedDigest.update(bArr, 0, bArr.length);
        extendedDigest.doFinal(bArr3, 0);
        return new Commitment(bArr2, bArr3);
    }

    @Override // org.bouncycastle.crypto.Committer
    public boolean isRevealed(Commitment commitment, byte[] bArr) {
        if (bArr.length + commitment.getSecret().length != this.f87975b) {
            throw new DataLengthException("Message and witness secret lengths do not match.");
        }
        byte[] secret = commitment.getSecret();
        ExtendedDigest extendedDigest = this.f87974a;
        byte[] bArr2 = new byte[extendedDigest.getDigestSize()];
        extendedDigest.update(secret, 0, secret.length);
        extendedDigest.update(bArr, 0, bArr.length);
        extendedDigest.doFinal(bArr2, 0);
        return Arrays.constantTimeAreEqual(commitment.getCommitment(), bArr2);
    }
}
