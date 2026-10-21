package sn;

import androidx.camera.camera2.internal.h0;
import com.bbva.network.constant.ConstantsKt;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;
import okhttp3.FormBody;
import okhttp3.Headers;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okio.Buffer;
import retrofit2.Converter;

/* JADX INFO: compiled from: ParameterHandler.java */
/* JADX INFO: loaded from: classes13.dex */
public abstract class d<T> {

    /* JADX INFO: compiled from: ParameterHandler.java */
    public static final class a<T> extends d<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Method f93246a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f93247b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Converter<T, RequestBody> f93248c;

        public a(Method method, int i10, Converter<T, RequestBody> converter) {
            this.f93246a = method;
            this.f93247b = i10;
            this.f93248c = converter;
        }

        @Override // sn.d
        public final void a(sn.e eVar, @Nullable T t10) {
            int i10 = this.f93247b;
            Method method = this.f93246a;
            if (t10 == null) {
                throw sn.i.j(method, i10, "Body parameter value must not be null.", new Object[0]);
            }
            try {
                eVar.f93300k = this.f93248c.convert(t10);
            } catch (IOException e5) {
                throw sn.i.k(method, e5, i10, androidx.collection.j.b("Unable to convert ", t10, " to RequestBody"), new Object[0]);
            }
        }
    }

    /* JADX INFO: compiled from: ParameterHandler.java */
    public static final class b<T> extends d<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f93249a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Converter<T, String> f93250b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f93251c;

        public b(String str, Converter<T, String> converter, boolean z10) {
            Objects.requireNonNull(str, ConstantsKt.NAME_NULL);
            this.f93249a = str;
            this.f93250b = converter;
            this.f93251c = z10;
        }

        @Override // sn.d
        public final void a(sn.e eVar, @Nullable T t10) throws IOException {
            String strConvert;
            if (t10 == null || (strConvert = this.f93250b.convert(t10)) == null) {
                return;
            }
            FormBody.Builder builder = eVar.f93299j;
            String str = this.f93249a;
            if (this.f93251c) {
                builder.addEncoded(str, strConvert);
            } else {
                builder.add(str, strConvert);
            }
        }
    }

    /* JADX INFO: compiled from: ParameterHandler.java */
    public static final class c<T> extends d<Map<String, T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Method f93252a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f93253b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Converter<T, String> f93254c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f93255d;

        public c(Method method, int i10, Converter<T, String> converter, boolean z10) {
            this.f93252a = method;
            this.f93253b = i10;
            this.f93254c = converter;
            this.f93255d = z10;
        }

        @Override // sn.d
        public final void a(sn.e eVar, @Nullable Object obj) throws IOException {
            Map map = (Map) obj;
            int i10 = this.f93253b;
            Method method = this.f93252a;
            if (map == null) {
                throw sn.i.j(method, i10, "Field map was null.", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw sn.i.j(method, i10, "Field map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw sn.i.j(method, i10, h0.b("Field map contained null value for key '", str, "'."), new Object[0]);
                }
                Converter<T, String> converter = this.f93254c;
                String strConvert = converter.convert((T) value);
                if (strConvert == null) {
                    throw sn.i.j(method, i10, "Field map value '" + value + "' converted to null by " + converter.getClass().getName() + " for key '" + str + "'.", new Object[0]);
                }
                FormBody.Builder builder = eVar.f93299j;
                if (this.f93255d) {
                    builder.addEncoded(str, strConvert);
                } else {
                    builder.add(str, strConvert);
                }
            }
        }
    }

    /* JADX INFO: renamed from: sn.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ParameterHandler.java */
    public static final class C0493d<T> extends d<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f93256a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Converter<T, String> f93257b;

        public C0493d(String str, Converter<T, String> converter) {
            Objects.requireNonNull(str, ConstantsKt.NAME_NULL);
            this.f93256a = str;
            this.f93257b = converter;
        }

        @Override // sn.d
        public final void a(sn.e eVar, @Nullable T t10) throws IOException {
            String strConvert;
            if (t10 == null || (strConvert = this.f93257b.convert(t10)) == null) {
                return;
            }
            eVar.a(this.f93256a, strConvert);
        }
    }

    /* JADX INFO: compiled from: ParameterHandler.java */
    public static final class e<T> extends d<Map<String, T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Method f93258a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f93259b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Converter<T, String> f93260c;

        public e(Method method, int i10, Converter<T, String> converter) {
            this.f93258a = method;
            this.f93259b = i10;
            this.f93260c = converter;
        }

        @Override // sn.d
        public final void a(sn.e eVar, @Nullable Object obj) throws IOException {
            Map map = (Map) obj;
            int i10 = this.f93259b;
            Method method = this.f93258a;
            if (map == null) {
                throw sn.i.j(method, i10, "Header map was null.", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw sn.i.j(method, i10, "Header map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw sn.i.j(method, i10, h0.b("Header map contained null value for key '", str, "'."), new Object[0]);
                }
                eVar.a(str, this.f93260c.convert((T) value));
            }
        }
    }

    /* JADX INFO: compiled from: ParameterHandler.java */
    public static final class f extends d<Headers> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Method f93261a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f93262b;

        public f(Method method, int i10) {
            this.f93261a = method;
            this.f93262b = i10;
        }

        @Override // sn.d
        public final void a(sn.e eVar, @Nullable Headers headers) throws IOException {
            Headers headers2 = headers;
            if (headers2 != null) {
                eVar.f93295f.addAll(headers2);
            } else {
                throw sn.i.j(this.f93261a, this.f93262b, "Headers parameter must not be null.", new Object[0]);
            }
        }
    }

    /* JADX INFO: compiled from: ParameterHandler.java */
    public static final class g<T> extends d<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Method f93263a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f93264b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Headers f93265c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Converter<T, RequestBody> f93266d;

        public g(Method method, int i10, Headers headers, Converter<T, RequestBody> converter) {
            this.f93263a = method;
            this.f93264b = i10;
            this.f93265c = headers;
            this.f93266d = converter;
        }

        @Override // sn.d
        public final void a(sn.e eVar, @Nullable T t10) {
            if (t10 == null) {
                return;
            }
            try {
                eVar.f93298i.addPart(this.f93265c, this.f93266d.convert(t10));
            } catch (IOException e5) {
                throw sn.i.j(this.f93263a, this.f93264b, androidx.collection.j.b("Unable to convert ", t10, " to RequestBody"), e5);
            }
        }
    }

    /* JADX INFO: compiled from: ParameterHandler.java */
    public static final class h<T> extends d<Map<String, T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Method f93267a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f93268b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Converter<T, RequestBody> f93269c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f93270d;

        public h(Method method, int i10, Converter<T, RequestBody> converter, String str) {
            this.f93267a = method;
            this.f93268b = i10;
            this.f93269c = converter;
            this.f93270d = str;
        }

        @Override // sn.d
        public final void a(sn.e eVar, @Nullable Object obj) throws IOException {
            Map map = (Map) obj;
            int i10 = this.f93268b;
            Method method = this.f93267a;
            if (map == null) {
                throw sn.i.j(method, i10, "Part map was null.", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw sn.i.j(method, i10, "Part map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw sn.i.j(method, i10, h0.b("Part map contained null value for key '", str, "'."), new Object[0]);
                }
                eVar.f93298i.addPart(Headers.of(ConstantsKt.CONTENT_DISPOSITION, h0.b("form-data; name=\"", str, "\""), "Content-Transfer-Encoding", this.f93270d), this.f93269c.convert((T) value));
            }
        }
    }

    /* JADX INFO: compiled from: ParameterHandler.java */
    public static final class i<T> extends d<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Method f93271a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f93272b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f93273c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Converter<T, String> f93274d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f93275e;

        public i(Method method, int i10, String str, Converter<T, String> converter, boolean z10) {
            this.f93271a = method;
            this.f93272b = i10;
            Objects.requireNonNull(str, ConstantsKt.NAME_NULL);
            this.f93273c = str;
            this.f93274d = converter;
            this.f93275e = z10;
        }

        @Override // sn.d
        public final void a(sn.e eVar, @Nullable T t10) throws IOException {
            String utf8;
            String str = this.f93273c;
            if (t10 == null) {
                throw sn.i.j(this.f93271a, this.f93272b, h0.b("Path parameter \"", str, "\" value must not be null."), new Object[0]);
            }
            String strConvert = this.f93274d.convert(t10);
            if (eVar.f93292c == null) {
                throw new AssertionError();
            }
            int length = strConvert.length();
            int iCharCount = 0;
            while (true) {
                if (iCharCount >= length) {
                    utf8 = strConvert;
                    break;
                }
                int iCodePointAt = strConvert.codePointAt(iCharCount);
                boolean z10 = this.f93275e;
                int i10 = 47;
                int i11 = -1;
                if (iCodePointAt < 32 || iCodePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(iCodePointAt) != -1 || (!z10 && (iCodePointAt == 47 || iCodePointAt == 37))) {
                    Buffer buffer = new Buffer();
                    buffer.writeUtf8(strConvert, 0, iCharCount);
                    Buffer buffer2 = null;
                    while (iCharCount < length) {
                        int iCodePointAt2 = strConvert.codePointAt(iCharCount);
                        if (!z10 || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
                            if (iCodePointAt2 < 32 || iCodePointAt2 >= 127 || " \"<>^`{}|\\?#".indexOf(iCodePointAt2) != i11 || (!z10 && (iCodePointAt2 == i10 || iCodePointAt2 == 37))) {
                                if (buffer2 == null) {
                                    buffer2 = new Buffer();
                                }
                                buffer2.writeUtf8CodePoint(iCodePointAt2);
                                while (!buffer2.exhausted()) {
                                    byte b10 = buffer2.readByte();
                                    buffer.writeByte(37);
                                    char[] cArr = sn.e.f93289l;
                                    buffer.writeByte((int) cArr[((b10 & 255) >> 4) & 15]);
                                    buffer.writeByte((int) cArr[b10 & 15]);
                                }
                            } else {
                                buffer.writeUtf8CodePoint(iCodePointAt2);
                            }
                        }
                        iCharCount += Character.charCount(iCodePointAt2);
                        i10 = 47;
                        i11 = -1;
                    }
                    utf8 = buffer.readUtf8();
                    break;
                }
                iCharCount += Character.charCount(iCodePointAt);
            }
            String strReplace = eVar.f93292c.replace("{" + str + "}", utf8);
            if (sn.e.m.matcher(strReplace).matches()) {
                throw new IllegalArgumentException("@Path parameters shouldn't perform path traversal ('.' or '..'): ".concat(strConvert));
            }
            eVar.f93292c = strReplace;
        }
    }

    /* JADX INFO: compiled from: ParameterHandler.java */
    public static final class j<T> extends d<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f93276a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Converter<T, String> f93277b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f93278c;

        public j(String str, Converter<T, String> converter, boolean z10) {
            Objects.requireNonNull(str, ConstantsKt.NAME_NULL);
            this.f93276a = str;
            this.f93277b = converter;
            this.f93278c = z10;
        }

        @Override // sn.d
        public final void a(sn.e eVar, @Nullable T t10) throws IOException {
            String strConvert;
            if (t10 == null || (strConvert = this.f93277b.convert(t10)) == null) {
                return;
            }
            eVar.b(this.f93276a, strConvert, this.f93278c);
        }
    }

    /* JADX INFO: compiled from: ParameterHandler.java */
    public static final class k<T> extends d<Map<String, T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Method f93279a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f93280b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Converter<T, String> f93281c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f93282d;

        public k(Method method, int i10, Converter<T, String> converter, boolean z10) {
            this.f93279a = method;
            this.f93280b = i10;
            this.f93281c = converter;
            this.f93282d = z10;
        }

        @Override // sn.d
        public final void a(sn.e eVar, @Nullable Object obj) throws IOException {
            Map map = (Map) obj;
            int i10 = this.f93280b;
            Method method = this.f93279a;
            if (map == null) {
                throw sn.i.j(method, i10, "Query map was null", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw sn.i.j(method, i10, "Query map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw sn.i.j(method, i10, h0.b("Query map contained null value for key '", str, "'."), new Object[0]);
                }
                Converter<T, String> converter = this.f93281c;
                String strConvert = converter.convert((T) value);
                if (strConvert == null) {
                    throw sn.i.j(method, i10, "Query map value '" + value + "' converted to null by " + converter.getClass().getName() + " for key '" + str + "'.", new Object[0]);
                }
                eVar.b(str, strConvert, this.f93282d);
            }
        }
    }

    /* JADX INFO: compiled from: ParameterHandler.java */
    public static final class l<T> extends d<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Converter<T, String> f93283a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f93284b;

        public l(Converter<T, String> converter, boolean z10) {
            this.f93283a = converter;
            this.f93284b = z10;
        }

        @Override // sn.d
        public final void a(sn.e eVar, @Nullable T t10) throws IOException {
            if (t10 == null) {
                return;
            }
            eVar.b(this.f93283a.convert(t10), null, this.f93284b);
        }
    }

    /* JADX INFO: compiled from: ParameterHandler.java */
    public static final class m extends d<MultipartBody.Part> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final m f93285a = new m();

        @Override // sn.d
        public final void a(sn.e eVar, @Nullable MultipartBody.Part part) throws IOException {
            MultipartBody.Part part2 = part;
            if (part2 != null) {
                eVar.f93298i.addPart(part2);
            }
        }
    }

    /* JADX INFO: compiled from: ParameterHandler.java */
    public static final class n extends d<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Method f93286a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f93287b;

        public n(Method method, int i10) {
            this.f93286a = method;
            this.f93287b = i10;
        }

        @Override // sn.d
        public final void a(sn.e eVar, @Nullable Object obj) {
            if (obj != null) {
                eVar.f93292c = obj.toString();
            } else {
                int i10 = this.f93287b;
                throw sn.i.j(this.f93286a, i10, "@Url parameter is null.", new Object[0]);
            }
        }
    }

    /* JADX INFO: compiled from: ParameterHandler.java */
    public static final class o<T> extends d<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class<T> f93288a;

        public o(Class<T> cls) {
            this.f93288a = cls;
        }

        @Override // sn.d
        public final void a(sn.e eVar, @Nullable T t10) {
            eVar.f93294e.tag(this.f93288a, t10);
        }
    }

    public abstract void a(sn.e eVar, @Nullable T t10) throws IOException;
}
