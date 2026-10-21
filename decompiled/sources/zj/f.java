package zj;

import java.io.IOException;
import java.net.URL;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Enumeration;

/* JADX INFO: compiled from: SecuritySupport.java */
/* JADX INFO: loaded from: classes12.dex */
public final class f implements PrivilegedAction {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ClassLoader f95087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f95088b;

    public f(ClassLoader classLoader, String str) {
        this.f95087a = classLoader;
        this.f95088b = str;
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        URL[] urlArr = null;
        try {
            ArrayList arrayList = new ArrayList();
            Enumeration<URL> resources = this.f95087a.getResources(this.f95088b);
            while (resources != null && resources.hasMoreElements()) {
                URL urlNextElement = resources.nextElement();
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
