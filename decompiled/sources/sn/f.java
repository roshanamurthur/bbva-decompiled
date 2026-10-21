package sn;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import retrofit2.Retrofit;

/* JADX INFO: compiled from: RequestFactory.java */
/* JADX INFO: loaded from: classes13.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Method f93303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HttpUrl f93304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f93305c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final String f93306d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final Headers f93307e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final MediaType f93308f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f93309g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f93310h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f93311i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final d<?>[] f93312j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f93313k;

    /* JADX INFO: compiled from: RequestFactory.java */
    public static final class a {

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static final Pattern f93314x = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public static final Pattern f93315y = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Retrofit f93316a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Method f93317b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Annotation[] f93318c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Annotation[][] f93319d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Type[] f93320e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f93321f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f93322g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f93323h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f93324i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f93325j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f93326k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f93327l;
        public boolean m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        @Nullable
        public String f93328n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public boolean f93329o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public boolean f93330p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public boolean f93331q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        @Nullable
        public String f93332r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        @Nullable
        public Headers f93333s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        @Nullable
        public MediaType f93334t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        @Nullable
        public LinkedHashSet f93335u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        @Nullable
        public d<?>[] f93336v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public boolean f93337w;

        public a(Retrofit retrofit, Method method) {
            this.f93316a = retrofit;
            this.f93317b = method;
            this.f93318c = method.getAnnotations();
            this.f93320e = method.getGenericParameterTypes();
            this.f93319d = method.getParameterAnnotations();
        }

        public static Class<?> a(Class<?> cls) {
            if (Boolean.TYPE == cls) {
                return Boolean.class;
            }
            if (Byte.TYPE == cls) {
                return Byte.class;
            }
            if (Character.TYPE == cls) {
                return Character.class;
            }
            if (Double.TYPE == cls) {
                return Double.class;
            }
            if (Float.TYPE == cls) {
                return Float.class;
            }
            if (Integer.TYPE == cls) {
                return Integer.class;
            }
            if (Long.TYPE == cls) {
                return Long.class;
            }
            return Short.TYPE == cls ? Short.class : cls;
        }

        public final void b(String str, String str2, boolean z10) {
            String str3 = this.f93328n;
            Method method = this.f93317b;
            if (str3 != null) {
                throw i.i(method, null, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
            }
            this.f93328n = str;
            this.f93329o = z10;
            if (str2.isEmpty()) {
                return;
            }
            int iIndexOf = str2.indexOf(63);
            Pattern pattern = f93314x;
            if (iIndexOf != -1 && iIndexOf < str2.length() - 1) {
                String strSubstring = str2.substring(iIndexOf + 1);
                if (pattern.matcher(strSubstring).find()) {
                    throw i.i(method, null, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", strSubstring);
                }
            }
            this.f93332r = str2;
            Matcher matcher = pattern.matcher(str2);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (matcher.find()) {
                linkedHashSet.add(matcher.group(1));
            }
            this.f93335u = linkedHashSet;
        }

        public final void c(int i10, Type type) {
            if (i.g(type)) {
                throw i.j(this.f93317b, i10, "Parameter type must not include a type variable or wildcard: %s", type);
            }
        }
    }

    public f(a aVar) {
        this.f93303a = aVar.f93317b;
        this.f93304b = aVar.f93316a.f93023c;
        this.f93305c = aVar.f93328n;
        this.f93306d = aVar.f93332r;
        this.f93307e = aVar.f93333s;
        this.f93308f = aVar.f93334t;
        this.f93309g = aVar.f93329o;
        this.f93310h = aVar.f93330p;
        this.f93311i = aVar.f93331q;
        this.f93312j = aVar.f93336v;
        this.f93313k = aVar.f93337w;
    }
}
