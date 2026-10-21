package flexjson.transformer;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes7.dex */
public class HibernateTransformer extends ObjectTransformer {
    public Class<?> findBeanClass(Object obj) {
        try {
            Object objInvoke = obj.getClass().getMethod("getHibernateLazyInitializer", new Class[0]).invoke(obj, new Object[0]);
            return (Class) objInvoke.getClass().getMethod("getPersistentClass", new Class[0]).invoke(objInvoke, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return obj.getClass();
        }
    }

    @Override // flexjson.transformer.ObjectTransformer
    public Class resolveClass(Object obj) {
        return findBeanClass(obj);
    }
}
