package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import sn.i;

/* JADX INFO: loaded from: classes13.dex */
public interface CallAdapter<R, T> {

    public static abstract class Factory {
        public static Type getParameterUpperBound(int i10, ParameterizedType parameterizedType) {
            return i.d(i10, parameterizedType);
        }

        public static Class<?> getRawType(Type type) {
            return i.e(type);
        }

        @Nullable
        public abstract CallAdapter<?, ?> get(Type type, Annotation[] annotationArr, Retrofit retrofit);
    }

    T adapt(Call<R> call);

    Type responseType();
}
