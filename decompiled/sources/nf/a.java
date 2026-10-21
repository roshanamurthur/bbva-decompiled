package nf;

import com.google.crypto.tink.util.KeysDownloader;
import java.io.IOException;

/* JADX INFO: compiled from: KeysDownloader.java */
/* JADX INFO: loaded from: classes10.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ KeysDownloader f85219p0;

    public a(KeysDownloader keysDownloader) {
        this.f85219p0 = keysDownloader;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f85219p0.f47530c) {
            try {
                try {
                    this.f85219p0.a();
                    synchronized (this.f85219p0.f47531d) {
                        KeysDownloader keysDownloader = this.f85219p0;
                        if (keysDownloader.f47533f == this) {
                            keysDownloader.f47533f = null;
                        }
                    }
                } catch (IOException unused) {
                    synchronized (this.f85219p0.f47531d) {
                        KeysDownloader keysDownloader2 = this.f85219p0;
                        if (keysDownloader2.f47533f == this) {
                            keysDownloader2.f47533f = null;
                        }
                    }
                } catch (Throwable th2) {
                    synchronized (this.f85219p0.f47531d) {
                        KeysDownloader keysDownloader3 = this.f85219p0;
                        if (keysDownloader3.f47533f == this) {
                            keysDownloader3.f47533f = null;
                        }
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
