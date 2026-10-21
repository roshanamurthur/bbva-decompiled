package androidx.fragment.app;

import java.io.Writer;

/* JADX INFO: compiled from: LogWriter.java */
/* JADX INFO: loaded from: classes2.dex */
public final class a0 extends Writer {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final StringBuilder f21668p0 = new StringBuilder(128);

    public final void b() {
        StringBuilder sb2 = this.f21668p0;
        if (sb2.length() > 0) {
            sb2.toString();
            sb2.delete(0, sb2.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        b();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        b();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            char c10 = cArr[i10 + i12];
            if (c10 == '\n') {
                b();
            } else {
                this.f21668p0.append(c10);
            }
        }
    }
}
