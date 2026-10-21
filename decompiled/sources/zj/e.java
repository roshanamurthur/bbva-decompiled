package zj;

import java.io.IOException;
import java.security.PrivilegedExceptionAction;

/* JADX INFO: compiled from: SecuritySupport.java */
/* JADX INFO: loaded from: classes12.dex */
public final class e implements PrivilegedExceptionAction {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Class f95085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f95086b;

    public e(Class cls, String str) {
        this.f95085a = cls;
        this.f95086b = str;
    }

    @Override // java.security.PrivilegedExceptionAction
    public final Object run() throws IOException {
        return this.f95085a.getResourceAsStream(this.f95086b);
    }
}
