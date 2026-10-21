package an;

import java.security.PrivilegedAction;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements PrivilegedAction {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f272a;

    public a(String str) {
        this.f272a = str;
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        try {
            return Class.forName(this.f272a);
        } catch (Exception unused) {
            return null;
        }
    }
}
