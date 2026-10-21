package javax.mail;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: Session.java */
/* JADX INFO: loaded from: classes12.dex */
public final class b implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Session f78946a;

    public b(Session session) {
        this.f78946a = session;
    }

    @Override // javax.mail.f
    public final void a(InputStream inputStream) throws IOException {
        this.f78946a.f78918j.load(inputStream);
    }
}
