package javax.mail;

import androidx.camera.camera2.internal.compat.u;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes12.dex */
public class Provider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Type f78898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f78899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f78900c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f78901d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f78902e;

    public static class Type {
        public static final Type STORE = new Type("STORE");
        public static final Type TRANSPORT = new Type("TRANSPORT");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f78903a;

        public Type(String str) {
            this.f78903a = str;
        }

        public String toString() {
            return this.f78903a;
        }
    }

    public Provider(Type type, String str, String str2, String str3, String str4) {
        this.f78898a = type;
        this.f78899b = str;
        this.f78900c = str2;
        this.f78901d = str3;
        this.f78902e = str4;
    }

    public String getClassName() {
        return this.f78900c;
    }

    public String getProtocol() {
        return this.f78899b;
    }

    public Type getType() {
        return this.f78898a;
    }

    public String getVendor() {
        return this.f78901d;
    }

    public String getVersion() {
        return this.f78902e;
    }

    public String toString() {
        String strB = "javax.mail.Provider[" + this.f78898a + "," + this.f78899b + "," + this.f78900c;
        String str = this.f78901d;
        if (str != null) {
            strB = androidx.camera.core.impl.utils.a.b(strB, ",", str);
        }
        String str2 = this.f78902e;
        if (str2 != null) {
            strB = androidx.camera.core.impl.utils.a.b(strB, ",", str2);
        }
        return u.f(strB, Constant.BRACKET_CLOSE);
    }
}
