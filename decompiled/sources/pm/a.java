package pm;

import java.security.cert.CRLException;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends CRLException {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public Throwable f92700p0;

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f92700p0;
    }
}
