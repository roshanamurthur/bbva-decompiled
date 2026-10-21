package zj;

import java.io.IOException;
import java.net.URL;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Enumeration;

/* JADX INFO: compiled from: SecuritySupport.java */
/* JADX INFO: loaded from: classes12.dex */
public final class g implements PrivilegedAction {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f95089a;

    public g(String str) {
        this.f95089a = str;
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        URL[] urlArr = null;
        try {
            ArrayList arrayList = new ArrayList();
            Enumeration<URL> systemResources = ClassLoader.getSystemResources(this.f95089a);
            while (systemResources != null && systemResources.hasMoreElements()) {
                URL urlNextElement = systemResources.nextElement();
                if (urlNextElement != null) {
                    arrayList.add(urlNextElement);
                }
            }
            if (arrayList.size() <= 0) {
                return null;
            }
            urlArr = new URL[arrayList.size()];
            return (URL[]) arrayList.toArray(urlArr);
        } catch (IOException | SecurityException unused) {
            return urlArr;
        }
    }
}
