package org.bouncycastle.crypto.engines;

import java.util.ArrayList;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.Wrapper;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class DSTU7624WrapEngine implements Wrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f88395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DSTU7624Engine f88396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f88397c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f88398d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f88399e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f88400f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList<byte[]> f88401g;

    public DSTU7624WrapEngine(int i10) {
        DSTU7624Engine dSTU7624Engine = new DSTU7624Engine(i10);
        this.f88396b = dSTU7624Engine;
        this.f88397c = new byte[dSTU7624Engine.getBlockSize() / 2];
        this.f88399e = new byte[dSTU7624Engine.getBlockSize()];
        this.f88400f = new byte[dSTU7624Engine.getBlockSize()];
        this.f88401g = new ArrayList<>();
        this.f88398d = new byte[4];
    }

    public static void a(int i10, byte[] bArr) {
        bArr[3] = (byte) (i10 >> 24);
        bArr[2] = (byte) (i10 >> 16);
        bArr[1] = (byte) (i10 >> 8);
        bArr[0] = (byte) i10;
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public String getAlgorithmName() {
        return "DSTU7624WrapEngine";
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public void init(boolean z10, CipherParameters cipherParameters) {
        if (cipherParameters instanceof ParametersWithRandom) {
            cipherParameters = ((ParametersWithRandom) cipherParameters).getParameters();
        }
        this.f88395a = z10;
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException("invalid parameters passed to DSTU7624WrapEngine");
        }
        this.f88396b.init(z10, cipherParameters);
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public byte[] unwrap(byte[] bArr, int i10, int i11) throws InvalidCipherTextException {
        if (this.f88395a) {
            throw new IllegalStateException("not set for unwrapping");
        }
        DSTU7624Engine dSTU7624Engine = this.f88396b;
        if (i11 % dSTU7624Engine.getBlockSize() != 0) {
            throw new DataLengthException("unwrap data must be a multiple of " + dSTU7624Engine.getBlockSize() + " bytes");
        }
        int blockSize = (i11 * 2) / dSTU7624Engine.getBlockSize();
        int i12 = blockSize - 1;
        int i13 = i12 * 6;
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        byte[] bArr3 = new byte[dSTU7624Engine.getBlockSize() / 2];
        System.arraycopy(bArr2, 0, bArr3, 0, dSTU7624Engine.getBlockSize() / 2);
        ArrayList<byte[]> arrayList = this.f88401g;
        arrayList.clear();
        int blockSize2 = i11 - (dSTU7624Engine.getBlockSize() / 2);
        int blockSize3 = dSTU7624Engine.getBlockSize() / 2;
        while (blockSize2 != 0) {
            byte[] bArr4 = new byte[dSTU7624Engine.getBlockSize() / 2];
            System.arraycopy(bArr2, blockSize3, bArr4, 0, dSTU7624Engine.getBlockSize() / 2);
            arrayList.add(bArr4);
            blockSize2 -= dSTU7624Engine.getBlockSize() / 2;
            blockSize3 += dSTU7624Engine.getBlockSize() / 2;
        }
        for (int i14 = 0; i14 < i13; i14++) {
            System.arraycopy(arrayList.get(blockSize - 2), 0, bArr2, 0, dSTU7624Engine.getBlockSize() / 2);
            System.arraycopy(bArr3, 0, bArr2, dSTU7624Engine.getBlockSize() / 2, dSTU7624Engine.getBlockSize() / 2);
            byte[] bArr5 = this.f88398d;
            a(i13 - i14, bArr5);
            for (int i15 = 0; i15 < 4; i15++) {
                int blockSize4 = (dSTU7624Engine.getBlockSize() / 2) + i15;
                bArr2[blockSize4] = (byte) (bArr2[blockSize4] ^ bArr5[i15]);
            }
            dSTU7624Engine.processBlock(bArr2, 0, bArr2, 0);
            System.arraycopy(bArr2, 0, bArr3, 0, dSTU7624Engine.getBlockSize() / 2);
            for (int i16 = 2; i16 < blockSize; i16++) {
                int i17 = blockSize - i16;
                System.arraycopy(arrayList.get(i17 - 1), 0, arrayList.get(i17), 0, dSTU7624Engine.getBlockSize() / 2);
            }
            System.arraycopy(bArr2, dSTU7624Engine.getBlockSize() / 2, arrayList.get(0), 0, dSTU7624Engine.getBlockSize() / 2);
        }
        System.arraycopy(bArr3, 0, bArr2, 0, dSTU7624Engine.getBlockSize() / 2);
        int blockSize5 = dSTU7624Engine.getBlockSize() / 2;
        for (int i18 = 0; i18 < i12; i18++) {
            System.arraycopy(arrayList.get(i18), 0, bArr2, blockSize5, dSTU7624Engine.getBlockSize() / 2);
            blockSize5 += dSTU7624Engine.getBlockSize() / 2;
        }
        int blockSize6 = i11 - dSTU7624Engine.getBlockSize();
        int blockSize7 = dSTU7624Engine.getBlockSize();
        byte[] bArr6 = this.f88399e;
        System.arraycopy(bArr2, blockSize6, bArr6, 0, blockSize7);
        byte[] bArr7 = new byte[i11 - dSTU7624Engine.getBlockSize()];
        if (!Arrays.areEqual(bArr6, this.f88400f)) {
            throw new InvalidCipherTextException("checksum failed");
        }
        System.arraycopy(bArr2, 0, bArr7, 0, i11 - dSTU7624Engine.getBlockSize());
        return bArr7;
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public byte[] wrap(byte[] bArr, int i10, int i11) {
        if (!this.f88395a) {
            throw new IllegalStateException("not set for wrapping");
        }
        DSTU7624Engine dSTU7624Engine = this.f88396b;
        if (i11 % dSTU7624Engine.getBlockSize() != 0) {
            throw new DataLengthException("wrap data must be a multiple of " + dSTU7624Engine.getBlockSize() + " bytes");
        }
        if (i10 + i11 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        int blockSize = ((i11 / dSTU7624Engine.getBlockSize()) + 1) * 2;
        int i12 = blockSize - 1;
        int i13 = i12 * 6;
        int blockSize2 = dSTU7624Engine.getBlockSize() + i11;
        byte[] bArr2 = new byte[blockSize2];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        int blockSize3 = dSTU7624Engine.getBlockSize() / 2;
        byte[] bArr3 = this.f88397c;
        System.arraycopy(bArr2, 0, bArr3, 0, blockSize3);
        ArrayList<byte[]> arrayList = this.f88401g;
        arrayList.clear();
        int blockSize4 = blockSize2 - (dSTU7624Engine.getBlockSize() / 2);
        int blockSize5 = dSTU7624Engine.getBlockSize() / 2;
        while (blockSize4 != 0) {
            byte[] bArr4 = new byte[dSTU7624Engine.getBlockSize() / 2];
            System.arraycopy(bArr2, blockSize5, bArr4, 0, dSTU7624Engine.getBlockSize() / 2);
            arrayList.add(bArr4);
            blockSize4 -= dSTU7624Engine.getBlockSize() / 2;
            blockSize5 += dSTU7624Engine.getBlockSize() / 2;
        }
        int i14 = 0;
        while (i14 < i13) {
            System.arraycopy(bArr3, 0, bArr2, 0, dSTU7624Engine.getBlockSize() / 2);
            System.arraycopy(arrayList.get(0), 0, bArr2, dSTU7624Engine.getBlockSize() / 2, dSTU7624Engine.getBlockSize() / 2);
            dSTU7624Engine.processBlock(bArr2, 0, bArr2, 0);
            i14++;
            byte[] bArr5 = this.f88398d;
            a(i14, bArr5);
            for (int i15 = 0; i15 < 4; i15++) {
                int blockSize6 = (dSTU7624Engine.getBlockSize() / 2) + i15;
                bArr2[blockSize6] = (byte) (bArr2[blockSize6] ^ bArr5[i15]);
            }
            System.arraycopy(bArr2, dSTU7624Engine.getBlockSize() / 2, bArr3, 0, dSTU7624Engine.getBlockSize() / 2);
            for (int i16 = 2; i16 < blockSize; i16++) {
                System.arraycopy(arrayList.get(i16 - 1), 0, arrayList.get(i16 - 2), 0, dSTU7624Engine.getBlockSize() / 2);
            }
            System.arraycopy(bArr2, 0, arrayList.get(blockSize - 2), 0, dSTU7624Engine.getBlockSize() / 2);
        }
        System.arraycopy(bArr3, 0, bArr2, 0, dSTU7624Engine.getBlockSize() / 2);
        int blockSize7 = dSTU7624Engine.getBlockSize() / 2;
        for (int i17 = 0; i17 < i12; i17++) {
            System.arraycopy(arrayList.get(i17), 0, bArr2, blockSize7, dSTU7624Engine.getBlockSize() / 2);
            blockSize7 += dSTU7624Engine.getBlockSize() / 2;
        }
        return bArr2;
    }
}
