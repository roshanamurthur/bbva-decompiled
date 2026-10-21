package javax.mail;

import java.io.IOException;
import java.net.URL;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: compiled from: Session.java */
/* JADX INFO: loaded from: classes12.dex */
public final class d implements PrivilegedAction<URL[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ClassLoader f78947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f78948b;

    public d(ClassLoader classLoader, String str) {
        this.f78947a = classLoader;
        this.f78948b = str;
    }

    @Override // java.security.PrivilegedAction
    public final URL[] run() {
        URL[] urlArr = null;
        try {
            ArrayList list = Collections.list(this.f78947a.getResources(this.f78948b));
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
