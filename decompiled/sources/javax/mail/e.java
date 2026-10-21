package javax.mail;

import java.io.IOException;
import java.net.URL;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: compiled from: Session.java */
/* JADX INFO: loaded from: classes12.dex */
public final class e implements PrivilegedAction<URL[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f78949a;

    public e(String str) {
        this.f78949a = str;
    }

    @Override // java.security.PrivilegedAction
    public final URL[] run() {
        URL[] urlArr = null;
        try {
            ArrayList list = Collections.list(ClassLoader.getSystemResources(this.f78949a));
            if (list.isEmpty()) {
                return null;
            }
            urlArr = new URL[list.size()];
            list.toArray(urlArr);
            return urlArr;
        } catch (IOException | SecurityException unused) {
            return urlArr;
        }
    }
}
