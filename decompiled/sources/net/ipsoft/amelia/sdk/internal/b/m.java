package net.ipsoft.amelia.sdk.internal.b;

import java.io.File;
import java.util.LinkedHashMap;
import net.ipsoft.amelia.sdk.BuildConfig;
import okhttp3.Request;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public abstract class m {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f84738e = "application/json;charset=UTF-8";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f84739f = "text/plain; text/html;";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f84740g = "multipart/form-data;";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected LinkedHashMap<String, String> f84741h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected JSONObject f84742i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected File f84743j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f84744k;

    public m() {
        this(null);
    }

    public abstract String a(String str);

    public JSONObject a() {
        return this.f84742i;
    }

    public String c() {
        return f84738e;
    }

    public LinkedHashMap<String, String> d() {
        return this.f84741h;
    }

    public File e() {
        return this.f84743j;
    }

    public String f() {
        return f84738e;
    }

    public String g() {
        return null;
    }

    public String h() {
        return null;
    }

    public String toString() {
        return ad.d.f(new StringBuilder("{ xCsrfToken: "), this.f84744k, " }");
    }

    public m(String str) {
        this.f84744k = str;
    }

    public void a(Request.Builder builder) {
        String str = this.f84744k;
        if (str != null) {
            builder.header("X-CSRF-TOKEN", str);
        }
        builder.header("X-Amelia-SDK", BuildConfig.X_AMELIA_SDK_VERSION);
        builder.header("X-Amelia-Protocol", BuildConfig.X_AMELIA_PROTOCOL_VERSION);
        builder.header("Cache-Control", "no-cache");
    }

    public void b() {
    }
}
