package si;

import java.io.File;
import java.io.IOException;

/* JADX INFO: compiled from: TempFile.java */
/* JADX INFO: loaded from: classes9.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f93220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f93221b;

    public e(File file) throws IOException {
        File fileCreateTempFile = File.createTempFile("pop3.", ".mbox", file);
        this.f93220a = fileCreateTempFile;
        fileCreateTempFile.deleteOnExit();
        this.f93221b = new f(fileCreateTempFile);
    }

    public final void a() {
        try {
            this.f93221b.close();
        } catch (IOException unused) {
        }
        this.f93220a.delete();
    }

    public final a b() throws IOException {
        a aVar;
        f fVar = this.f93221b;
        synchronized (fVar) {
            if (fVar.f93223s0 != null) {
                throw new IOException("POP3 file cache only supports single threaded access");
            }
            aVar = new a(fVar);
            fVar.f93223s0 = aVar;
        }
        return aVar;
    }

    public final void finalize() throws Throwable {
        try {
            a();
        } finally {
            super.finalize();
        }
    }
}
