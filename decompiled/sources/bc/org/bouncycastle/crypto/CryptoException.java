package bc.org.bouncycastle.crypto;

/* JADX INFO: loaded from: classes2.dex */
public class CryptoException extends Exception {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Throwable f24906p0;

    public CryptoException() {
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f24906p0;
    }

    public CryptoException(String str) {
        super(str);
    }

    public CryptoException(String str, Throwable th2) {
        super(str);
        this.f24906p0 = th2;
    }
}
