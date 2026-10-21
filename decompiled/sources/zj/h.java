package zj;

import java.io.IOException;
import java.net.URL;
import java.security.PrivilegedExceptionAction;

/* JADX INFO: compiled from: SecuritySupport.java */
/* JADX INFO: loaded from: classes12.dex */
public final class h implements PrivilegedExceptionAction {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ URL f95090a;

    public h(URL url) {
        this.f95090a = url;
    }

    @Override // java.security.PrivilegedExceptionAction
    public final Object run() throws IOException {
        return this.f95090a.openStream();
    }
}
