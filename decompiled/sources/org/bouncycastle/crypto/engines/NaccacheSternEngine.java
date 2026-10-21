package org.bouncycastle.crypto.engines;

import java.io.PrintStream;
import java.math.BigInteger;
import java.util.Vector;
import org.bouncycastle.crypto.AsymmetricBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.params.NaccacheSternKeyParameters;
import org.bouncycastle.crypto.params.NaccacheSternPrivateKeyParameters;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class NaccacheSternEngine implements AsymmetricBlockCipher {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final BigInteger f88494e = BigInteger.valueOf(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final BigInteger f88495f = BigInteger.valueOf(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f88496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public NaccacheSternKeyParameters f88497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Vector[] f88498c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f88499d = false;

    public byte[] addCryptedBlocks(byte[] bArr, byte[] bArr2) throws InvalidCipherTextException {
        if (this.f88496a) {
            if (bArr.length > getOutputBlockSize() || bArr2.length > getOutputBlockSize()) {
                throw new InvalidCipherTextException("BlockLength too large for simple addition.\n");
            }
        } else if (bArr.length > getInputBlockSize() || bArr2.length > getInputBlockSize()) {
            throw new InvalidCipherTextException("BlockLength too large for simple addition.\n");
        }
        BigInteger bigInteger = new BigInteger(1, bArr);
        BigInteger bigInteger2 = new BigInteger(1, bArr2);
        BigInteger bigIntegerMod = bigInteger.multiply(bigInteger2).mod(this.f88497b.getModulus());
        if (this.f88499d) {
            PrintStream printStream = System.out;
            printStream.println("c(m1) as BigInteger:....... " + bigInteger);
            printStream.println("c(m2) as BigInteger:....... " + bigInteger2);
            printStream.println("c(m1)*c(m2)%n = c(m1+m2)%n: " + bigIntegerMod);
        }
        byte[] byteArray = this.f88497b.getModulus().toByteArray();
        Arrays.fill(byteArray, (byte) 0);
        System.arraycopy(bigIntegerMod.toByteArray(), 0, byteArray, byteArray.length - bigIntegerMod.toByteArray().length, bigIntegerMod.toByteArray().length);
        return byteArray;
    }

    public byte[] encrypt(BigInteger bigInteger) {
        byte[] byteArray = this.f88497b.getModulus().toByteArray();
        Arrays.fill(byteArray, (byte) 0);
        byte[] byteArray2 = this.f88497b.getG().modPow(bigInteger, this.f88497b.getModulus()).toByteArray();
        System.arraycopy(byteArray2, 0, byteArray, byteArray.length - byteArray2.length, byteArray2.length);
        if (this.f88499d) {
            System.out.println("Encrypted value is:  " + new BigInteger(byteArray));
        }
        return byteArray;
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public int getInputBlockSize() {
        return this.f88496a ? ((this.f88497b.getLowerSigmaBound() + 7) / 8) - 1 : this.f88497b.getModulus().toByteArray().length;
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public int getOutputBlockSize() {
        return this.f88496a ? this.f88497b.getModulus().toByteArray().length : ((this.f88497b.getLowerSigmaBound() + 7) / 8) - 1;
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public void init(boolean z10, CipherParameters cipherParameters) {
        this.f88496a = z10;
        if (cipherParameters instanceof ParametersWithRandom) {
            cipherParameters = ((ParametersWithRandom) cipherParameters).getParameters();
        }
        this.f88497b = (NaccacheSternKeyParameters) cipherParameters;
        if (this.f88496a) {
            return;
        }
        if (this.f88499d) {
            System.out.println("Constructing lookup Array");
        }
        NaccacheSternPrivateKeyParameters naccacheSternPrivateKeyParameters = (NaccacheSternPrivateKeyParameters) this.f88497b;
        Vector smallPrimes = naccacheSternPrivateKeyParameters.getSmallPrimes();
        this.f88498c = new Vector[smallPrimes.size()];
        for (int i10 = 0; i10 < smallPrimes.size(); i10++) {
            BigInteger bigInteger = (BigInteger) smallPrimes.elementAt(i10);
            int iIntValue = bigInteger.intValue();
            this.f88498c[i10] = new Vector();
            this.f88498c[i10].addElement(f88495f);
            if (this.f88499d) {
                System.out.println("Constructing lookup ArrayList for " + iIntValue);
            }
            BigInteger bigIntegerAdd = f88494e;
            for (int i11 = 1; i11 < iIntValue; i11++) {
                bigIntegerAdd = bigIntegerAdd.add(naccacheSternPrivateKeyParameters.getPhi_n());
                this.f88498c[i10].addElement(naccacheSternPrivateKeyParameters.getG().modPow(bigIntegerAdd.divide(bigInteger), naccacheSternPrivateKeyParameters.getModulus()));
            }
        }
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public byte[] processBlock(byte[] bArr, int i10, int i11) throws InvalidCipherTextException {
        if (this.f88497b == null) {
            throw new IllegalStateException("NaccacheStern engine not initialised");
        }
        if (i11 > getInputBlockSize() + 1) {
            throw new DataLengthException("input too large for Naccache-Stern cipher.\n");
        }
        if (!this.f88496a && i11 < getInputBlockSize()) {
            throw new InvalidCipherTextException("BlockLength does not match modulus for Naccache-Stern cipher.\n");
        }
        int i12 = 0;
        if (i10 != 0 || i11 != bArr.length) {
            byte[] bArr2 = new byte[i11];
            System.arraycopy(bArr, i10, bArr2, 0, i11);
            bArr = bArr2;
        }
        BigInteger bigInteger = new BigInteger(1, bArr);
        if (this.f88499d) {
            System.out.println("input as BigInteger: " + bigInteger);
        }
        if (this.f88496a) {
            return encrypt(bigInteger);
        }
        Vector vector = new Vector();
        NaccacheSternPrivateKeyParameters naccacheSternPrivateKeyParameters = (NaccacheSternPrivateKeyParameters) this.f88497b;
        Vector smallPrimes = naccacheSternPrivateKeyParameters.getSmallPrimes();
        for (int i13 = 0; i13 < smallPrimes.size(); i13++) {
            BigInteger bigIntegerModPow = bigInteger.modPow(naccacheSternPrivateKeyParameters.getPhi_n().divide((BigInteger) smallPrimes.elementAt(i13)), naccacheSternPrivateKeyParameters.getModulus());
            Vector vector2 = this.f88498c[i13];
            if (vector2.size() != ((BigInteger) smallPrimes.elementAt(i13)).intValue()) {
                if (this.f88499d) {
                    System.out.println("Prime is " + smallPrimes.elementAt(i13) + ", lookup table has size " + vector2.size());
                }
                throw new InvalidCipherTextException("Error in lookup Array for " + ((BigInteger) smallPrimes.elementAt(i13)).intValue() + ": Size mismatch. Expected ArrayList with length " + ((BigInteger) smallPrimes.elementAt(i13)).intValue() + " but found ArrayList of length " + this.f88498c[i13].size());
            }
            int iIndexOf = vector2.indexOf(bigIntegerModPow);
            if (iIndexOf == -1) {
                if (this.f88499d) {
                    PrintStream printStream = System.out;
                    printStream.println("Actual prime is " + smallPrimes.elementAt(i13));
                    printStream.println("Decrypted value is " + bigIntegerModPow);
                    printStream.println("LookupList for " + smallPrimes.elementAt(i13) + " with size " + this.f88498c[i13].size() + " is: ");
                    while (i12 < this.f88498c[i13].size()) {
                        System.out.println(this.f88498c[i13].elementAt(i12));
                        i12++;
                    }
                }
                throw new InvalidCipherTextException("Lookup failed");
            }
            vector.addElement(BigInteger.valueOf(iIndexOf));
        }
        BigInteger bigIntegerMultiply = f88495f;
        for (int i14 = 0; i14 < smallPrimes.size(); i14++) {
            bigIntegerMultiply = bigIntegerMultiply.multiply((BigInteger) smallPrimes.elementAt(i14));
        }
        BigInteger bigIntegerAdd = f88494e;
        while (i12 < smallPrimes.size()) {
            BigInteger bigInteger2 = (BigInteger) smallPrimes.elementAt(i12);
            BigInteger bigIntegerDivide = bigIntegerMultiply.divide(bigInteger2);
            bigIntegerAdd = bigIntegerAdd.add(bigIntegerDivide.multiply(bigIntegerDivide.modInverse(bigInteger2)).multiply((BigInteger) vector.elementAt(i12)));
            i12++;
        }
        return bigIntegerAdd.mod(bigIntegerMultiply).toByteArray();
    }

    public byte[] processData(byte[] bArr) throws InvalidCipherTextException {
        byte[] bArrProcessBlock;
        if (this.f88499d) {
            System.out.println();
        }
        if (bArr.length <= getInputBlockSize()) {
            if (this.f88499d) {
                System.out.println("data size is less then input block size, processing directly");
            }
            return processBlock(bArr, 0, bArr.length);
        }
        int inputBlockSize = getInputBlockSize();
        int outputBlockSize = getOutputBlockSize();
        if (this.f88499d) {
            PrintStream printStream = System.out;
            printStream.println("Input blocksize is:  " + inputBlockSize + " bytes");
            printStream.println("Output blocksize is: " + outputBlockSize + " bytes");
            printStream.println("Data has length:.... " + bArr.length + " bytes");
        }
        byte[] bArr2 = new byte[((bArr.length / inputBlockSize) + 1) * outputBlockSize];
        int length = 0;
        int length2 = 0;
        while (length < bArr.length) {
            int i10 = length + inputBlockSize;
            if (i10 < bArr.length) {
                bArrProcessBlock = processBlock(bArr, length, inputBlockSize);
                length = i10;
            } else {
                bArrProcessBlock = processBlock(bArr, length, bArr.length - length);
                length = (bArr.length - length) + length;
            }
            if (this.f88499d) {
                System.out.println("new datapos is " + length);
            }
            if (bArrProcessBlock == null) {
                if (this.f88499d) {
                    System.out.println("cipher returned null");
                }
                throw new InvalidCipherTextException("cipher returned null");
            }
            System.arraycopy(bArrProcessBlock, 0, bArr2, length2, bArrProcessBlock.length);
            length2 += bArrProcessBlock.length;
        }
        byte[] bArr3 = new byte[length2];
        System.arraycopy(bArr2, 0, bArr3, 0, length2);
        if (this.f88499d) {
            System.out.println("returning " + length2 + " bytes");
        }
        return bArr3;
    }

    public void setDebug(boolean z10) {
        this.f88499d = z10;
    }
}
