package bc.org.bouncycastle.crypto;

/* JADX INFO: loaded from: classes2.dex */
public interface BlockCipher {
    String getAlgorithmName();

    int getBlockSize();

    void init(boolean z10, CipherParameters cipherParameters) throws IllegalArgumentException;

    int processBlock(byte[] bArr, int i10, byte[] bArr2, int i11) throws IllegalStateException, DataLengthException;

    void reset();
}
