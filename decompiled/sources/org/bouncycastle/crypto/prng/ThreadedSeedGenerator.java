package org.bouncycastle.crypto.prng;

/* JADX INFO: loaded from: classes5.dex */
public class ThreadedSeedGenerator {

    public class a implements Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public volatile int f89436p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public volatile boolean f89437q0;

        @Override // java.lang.Runnable
        public final void run() {
            while (!this.f89437q0) {
                this.f89436p0++;
            }
        }
    }

    public byte[] generateSeed(int i10, boolean z10) {
        a aVar = new a();
        aVar.f89436p0 = 0;
        aVar.f89437q0 = false;
        Thread thread = new Thread(aVar);
        byte[] bArr = new byte[i10];
        aVar.f89436p0 = 0;
        aVar.f89437q0 = false;
        thread.start();
        if (!z10) {
            i10 *= 8;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            while (aVar.f89436p0 == i11) {
                try {
                    Thread.sleep(1L);
                } catch (InterruptedException unused) {
                }
            }
            i11 = aVar.f89436p0;
            if (z10) {
                bArr[i12] = (byte) (i11 & 255);
            } else {
                int i13 = i12 / 8;
                bArr[i13] = (byte) ((bArr[i13] << 1) | (i11 & 1));
            }
        }
        aVar.f89437q0 = true;
        return bArr;
    }
}
