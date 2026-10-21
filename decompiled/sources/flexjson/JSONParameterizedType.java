package flexjson;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes7.dex */
public class JSONParameterizedType implements ParameterizedType {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Class f68485p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Type[] f68486q0;

    public JSONParameterizedType(Class cls, Type... typeArr) {
        this.f68485p0 = cls;
        this.f68486q0 = typeArr;
    }

    @Override // java.lang.reflect.ParameterizedType
    public Type[] getActualTypeArguments() {
        return this.f68486q0;
    }

    @Override // java.lang.reflect.ParameterizedType
    public Type getOwnerType() {
        return this.f68485p0;
    }

    @Override // java.lang.reflect.ParameterizedType
    public Type getRawType() {
        return this.f68485p0;
    }
}
