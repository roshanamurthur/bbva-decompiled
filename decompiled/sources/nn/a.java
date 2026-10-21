package nn;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.List;

/* JADX INFO: compiled from: NoGenericTypeParametersValidator.java */
/* JADX INFO: loaded from: classes13.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Method f85225a;

    public a(Method method) {
        this.f85225a = method;
    }

    public final void a(Type type, List<Throwable> list) {
        if (type instanceof TypeVariable) {
            list.add(new Exception("Method " + this.f85225a.getName() + "() contains unresolved type variable " + type));
            return;
        }
        int i10 = 0;
        if (type instanceof ParameterizedType) {
            Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
            int length = actualTypeArguments.length;
            while (i10 < length) {
                a(actualTypeArguments[i10], list);
                i10++;
            }
            return;
        }
        if (!(type instanceof WildcardType)) {
            if (type instanceof GenericArrayType) {
                a(((GenericArrayType) type).getGenericComponentType(), list);
                return;
            }
            return;
        }
        WildcardType wildcardType = (WildcardType) type;
        for (Type type2 : wildcardType.getUpperBounds()) {
            a(type2, list);
        }
        Type[] lowerBounds = wildcardType.getLowerBounds();
        int length2 = lowerBounds.length;
        while (i10 < length2) {
            a(lowerBounds[i10], list);
            i10++;
        }
    }
}
