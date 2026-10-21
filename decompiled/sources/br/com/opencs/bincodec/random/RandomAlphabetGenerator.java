package br.com.opencs.bincodec.random;

/* JADX INFO: loaded from: classes2.dex */
public class RandomAlphabetGenerator {
    public static final char[] QRCODE_ALPHANUMERIC = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ $%*+-./:".toCharArray();
    public static final char[] QRCODE_ALPHANUMERIC_NO_SPACE = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ$%*+-./:".toCharArray();

    public static char[] generateRandom(long j10, int i10, char[] cArr, int i11) {
        if (cArr.length < i11) {
            throw new IllegalArgumentException("The number of candidates must be at least as large as the target size.");
        }
        char[] cArr2 = (char[]) cArr.clone();
        shuffle(j10, i10, cArr2);
        if (cArr2.length == i11) {
            return cArr2;
        }
        char[] cArr3 = new char[i11];
        System.arraycopy(cArr2, 0, cArr3, 0, i11);
        return cArr3;
    }

    public static void shuffle(long j10, int i10, char[] cArr) {
        RandomSource randomSource = new RandomSource(j10);
        for (int i11 = 0; i11 < i10; i11++) {
            for (int i12 = 0; i12 < cArr.length; i12++) {
                int next = randomSource.next() % cArr.length;
                char c10 = cArr[i12];
                cArr[i12] = cArr[next];
                cArr[next] = c10;
            }
        }
    }
}
