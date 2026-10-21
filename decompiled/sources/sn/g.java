package sn;

import androidx.camera.camera2.internal.h0;
import com.bbva.library.digipassmanager.constants.DigipassManagerConstants;
import com.bbva.network.constant.ConstantsKt;
import com.salesforce.marketingcloud.sfmcsdk.components.http.Request;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.net.URI;
import java.util.Map;
import javax.annotation.Nullable;
import kotlin.coroutines.Continuation;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.CallAdapter;
import retrofit2.Converter;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.SkipCallbackExecutor;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.HEAD;
import retrofit2.http.HTTP;
import retrofit2.http.Header;
import retrofit2.http.HeaderMap;
import retrofit2.http.Multipart;
import retrofit2.http.OPTIONS;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Part;
import retrofit2.http.PartMap;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import retrofit2.http.QueryName;
import retrofit2.http.Tag;
import retrofit2.http.Url;

/* JADX INFO: compiled from: ServiceMethod.java */
/* JADX INFO: loaded from: classes13.dex */
public abstract class g<T> {
    /* JADX WARN: Code duplicated, block: B:386:0x08db A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:387:0x08dd  */
    /* JADX WARN: Code duplicated, block: B:572:0x08f5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:579:0x08df A[SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static a b(Retrofit retrofit, Method method) {
        Type genericReturnType;
        boolean z10;
        Annotation[][] annotationArr;
        int i10;
        String str;
        int i11;
        d<?>[] dVarArr;
        boolean z11;
        d<?> dVar;
        String str2;
        d<?>[] dVarArr2;
        boolean z12;
        d<?> aVar;
        d<?> oVar;
        d<?> cVar;
        d<?> lVar;
        f.a aVar2 = new f.a(retrofit, method);
        Annotation[] annotationArr2 = aVar2.f93318c;
        int length = annotationArr2.length;
        boolean z13 = false;
        int i12 = 0;
        while (true) {
            boolean z14 = true;
            String str3 = "HEAD";
            Method method2 = aVar2.f93317b;
            if (i12 >= length) {
                if (aVar2.f93328n == null) {
                    throw i.i(method2, null, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
                }
                if (!aVar2.f93329o) {
                    if (aVar2.f93331q) {
                        throw i.i(method2, null, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    }
                    if (aVar2.f93330p) {
                        throw i.i(method2, null, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    }
                }
                Annotation[][] annotationArr3 = aVar2.f93319d;
                int length2 = annotationArr3.length;
                aVar2.f93336v = new d[length2];
                int i13 = length2 - 1;
                int i14 = 0;
                while (i14 < length2) {
                    d<?>[] dVarArr3 = aVar2.f93336v;
                    Type type = aVar2.f93320e[i14];
                    Annotation[] annotationArr4 = annotationArr3[i14];
                    boolean z15 = i14 == i13 ? z14 : z13;
                    if (annotationArr4 != null) {
                        int length3 = annotationArr4.length;
                        int i15 = 0;
                        dVar = null;
                        while (true) {
                            annotationArr = annotationArr3;
                            if (i15 >= length3) {
                                i10 = length2;
                                str = str3;
                                i11 = i13;
                                dVarArr = dVarArr3;
                                z11 = z15;
                                break;
                            }
                            Annotation annotation = annotationArr4[i15];
                            int i16 = length3;
                            int i17 = length2;
                            int i18 = i13;
                            if (annotation instanceof Url) {
                                aVar2.c(i14, type);
                                if (aVar2.m) {
                                    throw i.j(method2, i14, "Multiple @Url method annotations found.", new Object[0]);
                                }
                                if (aVar2.f93324i) {
                                    throw i.j(method2, i14, "@Path parameters may not be used with @Url.", new Object[0]);
                                }
                                if (aVar2.f93325j) {
                                    throw i.j(method2, i14, "A @Url parameter must not come after a @Query.", new Object[0]);
                                }
                                if (aVar2.f93326k) {
                                    throw i.j(method2, i14, "A @Url parameter must not come after a @QueryName.", new Object[0]);
                                }
                                if (aVar2.f93327l) {
                                    throw i.j(method2, i14, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
                                }
                                if (aVar2.f93332r != null) {
                                    throw i.j(method2, i14, "@Url cannot be used with @%s URL", aVar2.f93328n);
                                }
                                aVar2.m = true;
                                if (type != HttpUrl.class && type != String.class && type != URI.class && (!(type instanceof Class) || !"android.net.Uri".equals(((Class) type).getName()))) {
                                    throw i.j(method2, i14, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
                                }
                                aVar = new d.n(method2, i14);
                            } else {
                                boolean z16 = annotation instanceof Path;
                                Retrofit retrofit3 = aVar2.f93316a;
                                if (z16) {
                                    aVar2.c(i14, type);
                                    if (aVar2.f93325j) {
                                        throw i.j(method2, i14, "A @Path parameter must not come after a @Query.", new Object[0]);
                                    }
                                    if (aVar2.f93326k) {
                                        throw i.j(method2, i14, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                                    }
                                    if (aVar2.f93327l) {
                                        throw i.j(method2, i14, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                                    }
                                    if (aVar2.m) {
                                        throw i.j(method2, i14, "@Path parameters may not be used with @Url.", new Object[0]);
                                    }
                                    if (aVar2.f93332r == null) {
                                        throw i.j(method2, i14, "@Path can only be used with relative url on @%s", aVar2.f93328n);
                                    }
                                    aVar2.f93324i = true;
                                    Path path = (Path) annotation;
                                    String strValue = path.value();
                                    if (!f.a.f93315y.matcher(strValue).matches()) {
                                        throw i.j(method2, i14, "@Path parameter name must match %s. Found: %s", f.a.f93314x.pattern(), strValue);
                                    }
                                    if (!aVar2.f93335u.contains(strValue)) {
                                        throw i.j(method2, i14, "URL \"%s\" does not contain \"{%s}\".", aVar2.f93332r, strValue);
                                    }
                                    aVar = new d.i(aVar2.f93317b, i14, strValue, retrofit3.stringConverter(type, annotationArr4), path.encoded());
                                } else {
                                    str2 = str3;
                                    if (annotation instanceof Query) {
                                        aVar2.c(i14, type);
                                        Query query = (Query) annotation;
                                        String strValue2 = query.value();
                                        boolean zEncoded = query.encoded();
                                        Class<?> clsE = i.e(type);
                                        dVarArr2 = dVarArr3;
                                        aVar2.f93325j = true;
                                        if (Iterable.class.isAssignableFrom(clsE)) {
                                            if (!(type instanceof ParameterizedType)) {
                                                throw i.j(method2, i14, clsE.getSimpleName() + " must include generic type (e.g., " + clsE.getSimpleName() + "<String>)", new Object[0]);
                                            }
                                            aVar = new b(new d.j(strValue2, retrofit3.stringConverter(i.d(0, (ParameterizedType) type), annotationArr4), zEncoded));
                                        } else if (clsE.isArray()) {
                                            aVar = new c(new d.j(strValue2, retrofit3.stringConverter(f.a.a(clsE.getComponentType()), annotationArr4), zEncoded));
                                        } else {
                                            lVar = new d.j<>(strValue2, retrofit3.stringConverter(type, annotationArr4), zEncoded);
                                            aVar = lVar;
                                        }
                                        z12 = z15;
                                    } else {
                                        dVarArr2 = dVarArr3;
                                        if (annotation instanceof QueryName) {
                                            aVar2.c(i14, type);
                                            boolean zEncoded2 = ((QueryName) annotation).encoded();
                                            Class<?> clsE2 = i.e(type);
                                            aVar2.f93326k = true;
                                            if (Iterable.class.isAssignableFrom(clsE2)) {
                                                if (!(type instanceof ParameterizedType)) {
                                                    throw i.j(method2, i14, clsE2.getSimpleName() + " must include generic type (e.g., " + clsE2.getSimpleName() + "<String>)", new Object[0]);
                                                }
                                                aVar = new b(new d.l(retrofit3.stringConverter(i.d(0, (ParameterizedType) type), annotationArr4), zEncoded2));
                                            } else if (clsE2.isArray()) {
                                                aVar = new c(new d.l(retrofit3.stringConverter(f.a.a(clsE2.getComponentType()), annotationArr4), zEncoded2));
                                            } else {
                                                lVar = new d.l<>(retrofit3.stringConverter(type, annotationArr4), zEncoded2);
                                                aVar = lVar;
                                            }
                                            z12 = z15;
                                        } else {
                                            z12 = z15;
                                            if (annotation instanceof QueryMap) {
                                                aVar2.c(i14, type);
                                                Class<?> clsE3 = i.e(type);
                                                aVar2.f93327l = true;
                                                if (!Map.class.isAssignableFrom(clsE3)) {
                                                    throw i.j(method2, i14, "@QueryMap parameter type must be Map.", new Object[0]);
                                                }
                                                Type typeF = i.f(type, clsE3);
                                                if (!(typeF instanceof ParameterizedType)) {
                                                    throw i.j(method2, i14, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                }
                                                ParameterizedType parameterizedType = (ParameterizedType) typeF;
                                                Type typeD = i.d(0, parameterizedType);
                                                if (String.class != typeD) {
                                                    throw i.j(method2, i14, "@QueryMap keys must be of type String: " + typeD, new Object[0]);
                                                }
                                                cVar = new d.k<>(method2, i14, retrofit3.stringConverter(i.d(1, parameterizedType), annotationArr4), ((QueryMap) annotation).encoded());
                                            } else if (annotation instanceof Header) {
                                                aVar2.c(i14, type);
                                                String strValue3 = ((Header) annotation).value();
                                                Class<?> clsE4 = i.e(type);
                                                if (Iterable.class.isAssignableFrom(clsE4)) {
                                                    if (!(type instanceof ParameterizedType)) {
                                                        throw i.j(method2, i14, clsE4.getSimpleName() + " must include generic type (e.g., " + clsE4.getSimpleName() + "<String>)", new Object[0]);
                                                    }
                                                    aVar = new b(new d.C0493d(strValue3, retrofit3.stringConverter(i.d(0, (ParameterizedType) type), annotationArr4)));
                                                } else if (clsE4.isArray()) {
                                                    aVar = new c(new d.C0493d(strValue3, retrofit3.stringConverter(f.a.a(clsE4.getComponentType()), annotationArr4)));
                                                } else {
                                                    cVar = new d.C0493d<>(strValue3, retrofit3.stringConverter(type, annotationArr4));
                                                }
                                                i15 = i15;
                                            } else if (annotation instanceof HeaderMap) {
                                                if (type == Headers.class) {
                                                    aVar = new d.f(method2, i14);
                                                } else {
                                                    aVar2.c(i14, type);
                                                    Class<?> clsE5 = i.e(type);
                                                    if (!Map.class.isAssignableFrom(clsE5)) {
                                                        throw i.j(method2, i14, "@HeaderMap parameter type must be Map.", new Object[0]);
                                                    }
                                                    Type typeF2 = i.f(type, clsE5);
                                                    if (!(typeF2 instanceof ParameterizedType)) {
                                                        throw i.j(method2, i14, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                    }
                                                    ParameterizedType parameterizedType2 = (ParameterizedType) typeF2;
                                                    Type typeD2 = i.d(0, parameterizedType2);
                                                    if (String.class != typeD2) {
                                                        throw i.j(method2, i14, "@HeaderMap keys must be of type String: " + typeD2, new Object[0]);
                                                    }
                                                    cVar = new d.e<>(method2, i14, retrofit3.stringConverter(i.d(1, parameterizedType2), annotationArr4));
                                                }
                                                i15 = i15;
                                            } else if (annotation instanceof Field) {
                                                aVar2.c(i14, type);
                                                if (!aVar2.f93330p) {
                                                    throw i.j(method2, i14, "@Field parameters can only be used with form encoding.", new Object[0]);
                                                }
                                                Field field = (Field) annotation;
                                                String strValue4 = field.value();
                                                boolean zEncoded3 = field.encoded();
                                                aVar2.f93321f = true;
                                                Class<?> clsE6 = i.e(type);
                                                if (Iterable.class.isAssignableFrom(clsE6)) {
                                                    if (!(type instanceof ParameterizedType)) {
                                                        throw i.j(method2, i14, clsE6.getSimpleName() + " must include generic type (e.g., " + clsE6.getSimpleName() + "<String>)", new Object[0]);
                                                    }
                                                    aVar = new b(new d.b(strValue4, retrofit3.stringConverter(i.d(0, (ParameterizedType) type), annotationArr4), zEncoded3));
                                                } else if (clsE6.isArray()) {
                                                    aVar = new c(new d.b(strValue4, retrofit3.stringConverter(f.a.a(clsE6.getComponentType()), annotationArr4), zEncoded3));
                                                } else {
                                                    cVar = new d.b<>(strValue4, retrofit3.stringConverter(type, annotationArr4), zEncoded3);
                                                }
                                                i15 = i15;
                                            } else if (annotation instanceof FieldMap) {
                                                aVar2.c(i14, type);
                                                if (!aVar2.f93330p) {
                                                    throw i.j(method2, i14, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
                                                }
                                                Class<?> clsE7 = i.e(type);
                                                if (!Map.class.isAssignableFrom(clsE7)) {
                                                    throw i.j(method2, i14, "@FieldMap parameter type must be Map.", new Object[0]);
                                                }
                                                Type typeF3 = i.f(type, clsE7);
                                                if (!(typeF3 instanceof ParameterizedType)) {
                                                    throw i.j(method2, i14, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                }
                                                ParameterizedType parameterizedType3 = (ParameterizedType) typeF3;
                                                Type typeD3 = i.d(0, parameterizedType3);
                                                if (String.class != typeD3) {
                                                    throw i.j(method2, i14, "@FieldMap keys must be of type String: " + typeD3, new Object[0]);
                                                }
                                                Converter<T, String> converterStringConverter = retrofit3.stringConverter(i.d(1, parameterizedType3), annotationArr4);
                                                aVar2.f93321f = true;
                                                cVar = new d.c<>(method2, i14, converterStringConverter, ((FieldMap) annotation).encoded());
                                            } else {
                                                i15 = i15;
                                                if (annotation instanceof Part) {
                                                    aVar2.c(i14, type);
                                                    if (!aVar2.f93331q) {
                                                        throw i.j(method2, i14, "@Part parameters can only be used with multipart encoding.", new Object[0]);
                                                    }
                                                    Part part = (Part) annotation;
                                                    aVar2.f93322g = true;
                                                    String strValue5 = part.value();
                                                    Class<?> clsE8 = i.e(type);
                                                    if (strValue5.isEmpty()) {
                                                        boolean zIsAssignableFrom = Iterable.class.isAssignableFrom(clsE8);
                                                        oVar = d.m.f93285a;
                                                        if (zIsAssignableFrom) {
                                                            if (!(type instanceof ParameterizedType)) {
                                                                throw i.j(method2, i14, clsE8.getSimpleName() + " must include generic type (e.g., " + clsE8.getSimpleName() + "<String>)", new Object[0]);
                                                            }
                                                            if (!MultipartBody.Part.class.isAssignableFrom(i.e(i.d(0, (ParameterizedType) type)))) {
                                                                throw i.j(method2, i14, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                            }
                                                            aVar = new b(oVar);
                                                        } else if (!clsE8.isArray()) {
                                                            if (!MultipartBody.Part.class.isAssignableFrom(clsE8)) {
                                                                throw i.j(method2, i14, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                            }
                                                            aVar = oVar;
                                                        } else {
                                                            if (!MultipartBody.Part.class.isAssignableFrom(clsE8.getComponentType())) {
                                                                throw i.j(method2, i14, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                            }
                                                            aVar = new c(oVar);
                                                        }
                                                    } else {
                                                        Headers headersOf = Headers.of(ConstantsKt.CONTENT_DISPOSITION, h0.b("form-data; name=\"", strValue5, "\""), "Content-Transfer-Encoding", part.encoding());
                                                        if (Iterable.class.isAssignableFrom(clsE8)) {
                                                            if (!(type instanceof ParameterizedType)) {
                                                                throw i.j(method2, i14, clsE8.getSimpleName() + " must include generic type (e.g., " + clsE8.getSimpleName() + "<String>)", new Object[0]);
                                                            }
                                                            Type typeD4 = i.d(0, (ParameterizedType) type);
                                                            if (MultipartBody.Part.class.isAssignableFrom(i.e(typeD4))) {
                                                                throw i.j(method2, i14, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                            }
                                                            aVar = new b(new d.g(method2, i14, headersOf, retrofit3.requestBodyConverter(typeD4, annotationArr4, annotationArr2)));
                                                        } else if (clsE8.isArray()) {
                                                            Class<?> clsA = f.a.a(clsE8.getComponentType());
                                                            if (MultipartBody.Part.class.isAssignableFrom(clsA)) {
                                                                throw i.j(method2, i14, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                            }
                                                            aVar = new c(new d.g(method2, i14, headersOf, retrofit3.requestBodyConverter(clsA, annotationArr4, annotationArr2)));
                                                        } else {
                                                            if (MultipartBody.Part.class.isAssignableFrom(clsE8)) {
                                                                throw i.j(method2, i14, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                            }
                                                            oVar = new d.g<>(method2, i14, headersOf, retrofit3.requestBodyConverter(type, annotationArr4, annotationArr2));
                                                            aVar = oVar;
                                                        }
                                                    }
                                                } else {
                                                    if (annotation instanceof PartMap) {
                                                        aVar2.c(i14, type);
                                                        if (!aVar2.f93331q) {
                                                            throw i.j(method2, i14, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
                                                        }
                                                        aVar2.f93322g = true;
                                                        Class<?> clsE9 = i.e(type);
                                                        if (!Map.class.isAssignableFrom(clsE9)) {
                                                            throw i.j(method2, i14, "@PartMap parameter type must be Map.", new Object[0]);
                                                        }
                                                        Type typeF4 = i.f(type, clsE9);
                                                        if (!(typeF4 instanceof ParameterizedType)) {
                                                            throw i.j(method2, i14, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                        }
                                                        ParameterizedType parameterizedType4 = (ParameterizedType) typeF4;
                                                        Type typeD5 = i.d(0, parameterizedType4);
                                                        if (String.class != typeD5) {
                                                            throw i.j(method2, i14, "@PartMap keys must be of type String: " + typeD5, new Object[0]);
                                                        }
                                                        Type typeD6 = i.d(1, parameterizedType4);
                                                        if (MultipartBody.Part.class.isAssignableFrom(i.e(typeD6))) {
                                                            throw i.j(method2, i14, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                                                        }
                                                        oVar = new d.h<>(method2, i14, retrofit3.requestBodyConverter(typeD6, annotationArr4, annotationArr2), ((PartMap) annotation).encoding());
                                                    } else if (annotation instanceof Body) {
                                                        aVar2.c(i14, type);
                                                        if (aVar2.f93330p || aVar2.f93331q) {
                                                            throw i.j(method2, i14, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                                                        }
                                                        if (aVar2.f93323h) {
                                                            throw i.j(method2, i14, "Multiple @Body method annotations found.", new Object[0]);
                                                        }
                                                        try {
                                                            Converter<T, RequestBody> converterRequestBodyConverter = retrofit3.requestBodyConverter(type, annotationArr4, annotationArr2);
                                                            aVar2.f93323h = true;
                                                            aVar = new d.a(method2, i14, converterRequestBodyConverter);
                                                        } catch (RuntimeException e5) {
                                                            throw i.k(method2, e5, i14, "Unable to create @Body converter for %s", type);
                                                        }
                                                    } else if (annotation instanceof Tag) {
                                                        aVar2.c(i14, type);
                                                        Class<?> clsE10 = i.e(type);
                                                        for (int i19 = i14 - 1; i19 >= 0; i19--) {
                                                            d<?> dVar2 = aVar2.f93336v[i19];
                                                            if ((dVar2 instanceof d.o) && ((d.o) dVar2).f93288a.equals(clsE10)) {
                                                                throw i.j(method2, i14, "@Tag type " + clsE10.getName() + " is duplicate of parameter #" + (i19 + 1) + " and would always overwrite its value.", new Object[0]);
                                                            }
                                                        }
                                                        oVar = new d.o<>(clsE10);
                                                    } else {
                                                        aVar = null;
                                                    }
                                                    aVar = oVar;
                                                }
                                            }
                                            aVar = cVar;
                                            i15 = i15;
                                        }
                                    }
                                }
                                if (aVar != null) {
                                    if (dVar == null) {
                                        throw i.j(method2, i14, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                                    }
                                    dVar = aVar;
                                }
                                i15++;
                                str3 = str2;
                                dVarArr3 = dVarArr2;
                                z15 = z12;
                                annotationArr3 = annotationArr;
                                length3 = i16;
                                length2 = i17;
                                i13 = i18;
                            }
                            str2 = str3;
                            dVarArr2 = dVarArr3;
                            z12 = z15;
                            if (aVar != null) {
                                if (dVar == null) {
                                    throw i.j(method2, i14, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                                }
                                dVar = aVar;
                            }
                            i15++;
                            str3 = str2;
                            dVarArr3 = dVarArr2;
                            z15 = z12;
                            annotationArr3 = annotationArr;
                            length3 = i16;
                            length2 = i17;
                            i13 = i18;
                        }
                    } else {
                        annotationArr = annotationArr3;
                        i10 = length2;
                        str = str3;
                        i11 = i13;
                        dVarArr = dVarArr3;
                        z11 = z15;
                        dVar = null;
                    }
                    if (dVar == null) {
                        if (z11) {
                            try {
                                if (i.e(type) == Continuation.class) {
                                    aVar2.f93337w = true;
                                    dVar = null;
                                }
                            } catch (NoClassDefFoundError unused) {
                            }
                        }
                        throw i.j(method2, i14, "No Retrofit annotation found.", new Object[0]);
                    }
                    dVarArr[i14] = dVar;
                    i14++;
                    str3 = str;
                    annotationArr3 = annotationArr;
                    length2 = i10;
                    i13 = i11;
                    z13 = false;
                    z14 = true;
                }
                String str4 = str3;
                if (aVar2.f93332r == null && !aVar2.m) {
                    throw i.i(method2, null, "Missing either @%s URL or @Url parameter.", aVar2.f93328n);
                }
                boolean z17 = aVar2.f93330p;
                if (!z17 && !aVar2.f93331q && !aVar2.f93329o && aVar2.f93323h) {
                    throw i.i(method2, null, "Non-body HTTP method cannot contain @Body.", new Object[0]);
                }
                if (z17 && !aVar2.f93321f) {
                    throw i.i(method2, null, "Form-encoded method must contain at least one @Field.", new Object[0]);
                }
                if (aVar2.f93331q && !aVar2.f93322g) {
                    throw i.i(method2, null, "Multipart method must contain at least one @Part.", new Object[0]);
                }
                f fVar = new f(aVar2);
                Type genericReturnType2 = method.getGenericReturnType();
                if (i.g(genericReturnType2)) {
                    throw i.i(method, null, "Method return type must not include a type variable or wildcard: %s", genericReturnType2);
                }
                if (genericReturnType2 == Void.TYPE) {
                    throw i.i(method, null, "Service methods cannot return void.", new Object[0]);
                }
                Annotation[] annotations = method.getAnnotations();
                boolean z18 = fVar.f93313k;
                if (z18) {
                    Type[] genericParameterTypes = method.getGenericParameterTypes();
                    Type typeD7 = ((ParameterizedType) genericParameterTypes[genericParameterTypes.length - 1]).getActualTypeArguments()[0];
                    if (typeD7 instanceof WildcardType) {
                        typeD7 = ((WildcardType) typeD7).getLowerBounds()[0];
                    }
                    if (i.e(typeD7) == Response.class && (typeD7 instanceof ParameterizedType)) {
                        typeD7 = i.d(0, (ParameterizedType) typeD7);
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    genericReturnType = new i.b(null, Call.class, typeD7);
                    if (!i.h(SkipCallbackExecutor.class, annotations)) {
                        Annotation[] annotationArr5 = new Annotation[annotations.length + 1];
                        annotationArr5[0] = h.f93338a;
                        System.arraycopy(annotations, 0, annotationArr5, 1, annotations.length);
                        annotations = annotationArr5;
                    }
                } else {
                    genericReturnType = method.getGenericReturnType();
                    z10 = false;
                }
                try {
                    CallAdapter<?, ?> callAdapter = retrofit.callAdapter(genericReturnType, annotations);
                    Type typeResponseType = callAdapter.responseType();
                    if (typeResponseType == okhttp3.Response.class) {
                        throw i.i(method, null, "'" + i.e(typeResponseType).getName() + "' is not a valid response body type. Did you mean ResponseBody?", new Object[0]);
                    }
                    if (typeResponseType == Response.class) {
                        throw i.i(method, null, "Response must include generic type (e.g., Response<String>)", new Object[0]);
                    }
                    if (fVar.f93305c.equals(str4) && !Void.class.equals(typeResponseType)) {
                        throw i.i(method, null, "HEAD method must use Void as response type.", new Object[0]);
                    }
                    try {
                        Converter<ResponseBody, T> converterResponseBodyConverter = retrofit.responseBodyConverter(typeResponseType, method.getAnnotations());
                        okhttp3.Call.Factory factory = retrofit.f93022b;
                        if (z18) {
                            return z10 ? new a.c(fVar, factory, converterResponseBodyConverter, callAdapter) : new a.b(fVar, factory, converterResponseBodyConverter, callAdapter);
                        }
                        return new a.C0492a(fVar, factory, converterResponseBodyConverter, callAdapter);
                    } catch (RuntimeException e7) {
                        throw i.i(method, e7, "Unable to create converter for %s", typeResponseType);
                    }
                } catch (RuntimeException e10) {
                    throw i.i(method, e10, "Unable to create call adapter for %s", genericReturnType);
                }
            }
            Annotation annotation2 = annotationArr2[i12];
            if (annotation2 instanceof DELETE) {
                aVar2.b("DELETE", ((DELETE) annotation2).value(), false);
            } else if (annotation2 instanceof GET) {
                aVar2.b("GET", ((GET) annotation2).value(), false);
            } else if (annotation2 instanceof HEAD) {
                aVar2.b("HEAD", ((HEAD) annotation2).value(), false);
            } else if (annotation2 instanceof PATCH) {
                aVar2.b("PATCH", ((PATCH) annotation2).value(), true);
            } else if (annotation2 instanceof POST) {
                aVar2.b("POST", ((POST) annotation2).value(), true);
            } else if (annotation2 instanceof PUT) {
                aVar2.b(Request.PUT, ((PUT) annotation2).value(), true);
            } else if (annotation2 instanceof OPTIONS) {
                aVar2.b("OPTIONS", ((OPTIONS) annotation2).value(), false);
            } else if (annotation2 instanceof HTTP) {
                HTTP http = (HTTP) annotation2;
                aVar2.b(http.method(), http.path(), http.hasBody());
            } else if (annotation2 instanceof retrofit2.http.Headers) {
                String[] strArrValue = ((retrofit2.http.Headers) annotation2).value();
                if (strArrValue.length == 0) {
                    throw i.i(method2, null, "@Headers annotation is empty.", new Object[0]);
                }
                Headers.Builder builder = new Headers.Builder();
                for (String str5 : strArrValue) {
                    int iIndexOf = str5.indexOf(58);
                    if (iIndexOf == -1 || iIndexOf == 0 || iIndexOf == str5.length() - 1) {
                        throw i.i(method2, null, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str5);
                    }
                    String strSubstring = str5.substring(0, iIndexOf);
                    String strTrim = str5.substring(iIndexOf + 1).trim();
                    if (DigipassManagerConstants.KEY_CONTENT_TYPE.equalsIgnoreCase(strSubstring)) {
                        try {
                            aVar2.f93334t = MediaType.get(strTrim);
                        } catch (IllegalArgumentException e11) {
                            throw i.i(method2, e11, "Malformed content type: %s", strTrim);
                        }
                    } else {
                        builder.add(strSubstring, strTrim);
                    }
                }
                aVar2.f93333s = builder.build();
            } else if (annotation2 instanceof Multipart) {
                if (aVar2.f93330p) {
                    throw i.i(method2, null, "Only one encoding annotation is allowed.", new Object[0]);
                }
                aVar2.f93331q = true;
            } else if (!(annotation2 instanceof FormUrlEncoded)) {
                continue;
            } else {
                if (aVar2.f93331q) {
                    throw i.i(method2, null, "Only one encoding annotation is allowed.", new Object[0]);
                }
                aVar2.f93330p = true;
            }
            i12++;
        }
    }

    @Nullable
    public abstract T a(Object[] objArr);
}
