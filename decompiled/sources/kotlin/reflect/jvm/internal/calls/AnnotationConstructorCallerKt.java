package kotlin.reflect.jvm.internal.calls;

import ad.d;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import java.io.IOException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.text.Typography;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AnnotationConstructorCaller.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u001aK\u0010\n\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00000\u00042\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000f²\u0006\u0016\u0010\r\u001a\u00020\f\"\b\b\u0000\u0010\u0001*\u00020\u00008\nX\u008a\u0084\u0002²\u0006\u0016\u0010\u000e\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"", ExifInterface.GPS_DIRECTION_TRUE, "Ljava/lang/Class;", "annotationClass", "", "", "values", "", "Ljava/lang/reflect/Method;", "methods", "createAnnotationInstance", "(Ljava/lang/Class;Ljava/util/Map;Ljava/util/List;)Ljava/lang/Object;", "", GenerateActivationFormCommand.HASH_CODE, "toString", "kotlin-reflection"}, k = 2, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nAnnotationConstructorCaller.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotationConstructorCaller.kt\nkotlin/reflect/jvm/internal/calls/AnnotationConstructorCallerKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,181:1\n11065#2:182\n11400#2,3:183\n37#3,2:186\n18#3:195\n1549#4:188\n1620#4,3:189\n1726#4,3:192\n26#5:196\n*S KotlinDebug\n*F\n+ 1 AnnotationConstructorCaller.kt\nkotlin/reflect/jvm/internal/calls/AnnotationConstructorCallerKt\n*L\n75#1:182\n75#1:183,3\n75#1:186,2\n173#1:195\n102#1:188\n102#1:189,3\n106#1:192,3\n173#1:196\n*E\n"})
public final class AnnotationConstructorCallerKt {

    /* JADX INFO: compiled from: AnnotationConstructorCaller.kt */
    public static final class a extends Lambda implements Function0<Integer> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Map<String, Object> f80045p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Map<String, ? extends Object> map) {
            super(0);
            this.f80045p0 = map;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Integer invoke() {
            int iHashCode;
            Iterator<T> it = this.f80045p0.entrySet().iterator();
            int iHashCode2 = 0;
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (value instanceof boolean[]) {
                    iHashCode = Arrays.hashCode((boolean[]) value);
                } else if (value instanceof char[]) {
                    iHashCode = Arrays.hashCode((char[]) value);
                } else if (value instanceof byte[]) {
                    iHashCode = Arrays.hashCode((byte[]) value);
                } else if (value instanceof short[]) {
                    iHashCode = Arrays.hashCode((short[]) value);
                } else if (value instanceof int[]) {
                    iHashCode = Arrays.hashCode((int[]) value);
                } else if (value instanceof float[]) {
                    iHashCode = Arrays.hashCode((float[]) value);
                } else if (value instanceof long[]) {
                    iHashCode = Arrays.hashCode((long[]) value);
                } else if (value instanceof double[]) {
                    iHashCode = Arrays.hashCode((double[]) value);
                } else {
                    iHashCode = value instanceof Object[] ? Arrays.hashCode((Object[]) value) : value.hashCode();
                }
                iHashCode2 += iHashCode ^ (str.hashCode() * 127);
            }
            return Integer.valueOf(iHashCode2);
        }
    }

    /* JADX INFO: compiled from: AnnotationConstructorCaller.kt */
    public static final class b extends Lambda implements Function0<String> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Class<T> f80046p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Map<String, Object> f80047q0;

        /* JADX INFO: compiled from: AnnotationConstructorCaller.kt */
        public static final class a extends Lambda implements Function1<Map.Entry<? extends String, ? extends Object>, CharSequence> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public static final a f80048p0 = new a(1);

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ CharSequence invoke(Map.Entry<? extends String, ? extends Object> entry) {
                return invoke2((Map.Entry<String, ? extends Object>) entry);
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final CharSequence invoke2(@NotNull Map.Entry<String, ? extends Object> entry) {
                String string;
                Intrinsics.checkNotNullParameter(entry, "entry");
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value instanceof boolean[]) {
                    string = Arrays.toString((boolean[]) value);
                    Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                } else if (value instanceof char[]) {
                    string = Arrays.toString((char[]) value);
                    Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                } else if (value instanceof byte[]) {
                    string = Arrays.toString((byte[]) value);
                    Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                } else if (value instanceof short[]) {
                    string = Arrays.toString((short[]) value);
                    Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                } else if (value instanceof int[]) {
                    string = Arrays.toString((int[]) value);
                    Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                } else if (value instanceof float[]) {
                    string = Arrays.toString((float[]) value);
                    Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                } else if (value instanceof long[]) {
                    string = Arrays.toString((long[]) value);
                    Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                } else if (value instanceof double[]) {
                    string = Arrays.toString((double[]) value);
                    Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                } else if (value instanceof Object[]) {
                    string = Arrays.toString((Object[]) value);
                    Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                } else {
                    string = value.toString();
                }
                return d.e(key, '=', string);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Class<T> cls, Map<String, ? extends Object> map) {
            super(0);
            this.f80046p0 = cls;
            this.f80047q0 = map;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() throws IOException {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('@');
            sb2.append(this.f80046p0.getCanonicalName());
            CollectionsKt___CollectionsKt.joinTo(this.f80047q0.entrySet(), sb2, (112 & 2) != 0 ? ", " : ", ", (112 & 4) != 0 ? "" : "(", (112 & 8) == 0 ? ")" : "", (112 & 16) != 0 ? -1 : 0, (112 & 32) != 0 ? "..." : null, (112 & 64) != 0 ? null : a.f80048p0);
            String string = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return string;
        }
    }

    public static final Void access$throwIllegalArgumentType(int i10, String str, Class cls) {
        KClass orCreateKotlinClass;
        String qualifiedName;
        if (Intrinsics.areEqual(cls, Class.class)) {
            orCreateKotlinClass = Reflection.getOrCreateKotlinClass(KClass.class);
        } else {
            orCreateKotlinClass = (cls.isArray() && Intrinsics.areEqual(cls.getComponentType(), Class.class)) ? Reflection.getOrCreateKotlinClass(KClass[].class) : JvmClassMappingKt.getKotlinClass(cls);
        }
        if (Intrinsics.areEqual(orCreateKotlinClass.getQualifiedName(), Reflection.getOrCreateKotlinClass(Object[].class).getQualifiedName())) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(orCreateKotlinClass.getQualifiedName());
            sb2.append(Typography.less);
            Class<?> componentType = JvmClassMappingKt.getJavaClass(orCreateKotlinClass).getComponentType();
            Intrinsics.checkNotNullExpressionValue(componentType, "getComponentType(...)");
            sb2.append(JvmClassMappingKt.getKotlinClass(componentType).getQualifiedName());
            sb2.append(Typography.greater);
            qualifiedName = sb2.toString();
        } else {
            qualifiedName = orCreateKotlinClass.getQualifiedName();
        }
        throw new IllegalArgumentException("Argument #" + i10 + ' ' + str + " is not of the required type " + qualifiedName);
    }

    public static final Object access$transformKotlinToJvm(Object obj, Class cls) {
        if (obj instanceof Class) {
            return null;
        }
        if (obj instanceof KClass) {
            obj = JvmClassMappingKt.getJavaClass((KClass) obj);
        } else if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr instanceof Class[]) {
                return null;
            }
            if (objArr instanceof KClass[]) {
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.reflect.KClass<*>>");
                KClass[] kClassArr = (KClass[]) obj;
                ArrayList arrayList = new ArrayList(kClassArr.length);
                for (KClass kClass : kClassArr) {
                    arrayList.add(JvmClassMappingKt.getJavaClass(kClass));
                }
                obj = arrayList.toArray(new Class[0]);
            } else {
                obj = objArr;
            }
        }
        if (cls.isInstance(obj)) {
            return obj;
        }
        return null;
    }

    @NotNull
    public static final <T> T createAnnotationInstance(@NotNull Class<T> annotationClass, @NotNull Map<String, ? extends Object> values, @NotNull List<Method> methods) {
        Intrinsics.checkNotNullParameter(annotationClass, "annotationClass");
        Intrinsics.checkNotNullParameter(values, "values");
        Intrinsics.checkNotNullParameter(methods, "methods");
        Lazy lazy = LazyKt__LazyJVMKt.lazy(new a(values));
        T t10 = (T) Proxy.newProxyInstance(annotationClass.getClassLoader(), new Class[]{annotationClass}, new sk.a(annotationClass, values, LazyKt__LazyJVMKt.lazy(new b(annotationClass, values)), lazy, methods));
        Intrinsics.checkNotNull(t10, "null cannot be cast to non-null type T of kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt.createAnnotationInstance");
        return t10;
    }

    public static /* synthetic */ Object createAnnotationInstance$default(Class cls, Map map, List list, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            Set setKeySet = map.keySet();
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(setKeySet, 10));
            Iterator it = setKeySet.iterator();
            while (it.hasNext()) {
                arrayList.add(cls.getDeclaredMethod((String) it.next(), new Class[0]));
            }
            list = arrayList;
        }
        return createAnnotationInstance(cls, map, list);
    }
}
