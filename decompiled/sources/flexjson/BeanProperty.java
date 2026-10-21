package flexjson;

import flexjson.transformer.Transformer;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes7.dex */
public class BeanProperty {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f68460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f68461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BeanAnalyzer f68462c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Class f68463d;
    protected final Field property;
    protected Method readMethod;
    protected Method writeMethod;
    protected Map<Class<?>, Method> writeMethods = new HashMap();
    protected DeferredInstantiation<? extends Transformer> transformer = null;
    protected DeferredInstantiation<? extends ObjectFactory> objectFactory = null;
    protected Boolean included = null;

    public BeanProperty(String str, BeanAnalyzer beanAnalyzer) {
        this.f68461b = str;
        this.f68460a = str;
        this.f68462c = beanAnalyzer;
        Field declaredField = beanAnalyzer.getDeclaredField(str);
        this.property = declaredField;
        if (declaredField == null || !declaredField.isAnnotationPresent(JSON.class)) {
            return;
        }
        a((JSON) declaredField.getAnnotation(JSON.class));
    }

    public final void a(JSON json) {
        this.f68461b = json.name().length() > 0 ? json.name() : this.f68460a;
        this.transformer = json.transformer() == Transformer.class ? null : new DeferredInstantiation<>(json.transformer());
        this.objectFactory = json.objectFactory() != ObjectFactory.class ? new DeferredInstantiation<>(json.objectFactory()) : null;
        this.included = Boolean.valueOf(json.include());
    }

    public void addWriteMethod(Method method) {
        Class<?> cls = method.getParameterTypes()[0];
        if (this.f68463d == null) {
            this.f68463d = cls;
        }
        this.writeMethods.put(cls, method);
        method.setAccessible(true);
    }

    public String getJsonName() {
        return this.f68461b;
    }

    public String getName() {
        return this.f68460a;
    }

    public ObjectFactory getObjectFactory() throws IllegalAccessException, InstantiationException {
        DeferredInstantiation<? extends ObjectFactory> deferredInstantiation = this.objectFactory;
        if (deferredInstantiation != null) {
            return deferredInstantiation.get();
        }
        return null;
    }

    public Field getProperty() {
        return this.property;
    }

    public Class getPropertyType() {
        return this.f68463d;
    }

    public Method getReadMethod() {
        if (this.readMethod == null) {
            BeanAnalyzer beanAnalyzer = this.f68462c;
            if (beanAnalyzer.getSuperBean() != null) {
                BeanAnalyzer superBean = beanAnalyzer.getSuperBean();
                String str = this.f68460a;
                if (superBean.hasProperty(str)) {
                    return beanAnalyzer.getSuperBean().getProperty(str).getReadMethod();
                }
            }
        }
        return this.readMethod;
    }

    public Transformer getTransformer() throws IllegalAccessException, InstantiationException {
        DeferredInstantiation<? extends Transformer> deferredInstantiation = this.transformer;
        if (deferredInstantiation != null) {
            return deferredInstantiation.get();
        }
        return null;
    }

    public Object getValue(Object obj) {
        String str = this.f68460a;
        try {
            Method readMethod = getReadMethod();
            if (readMethod != null) {
                return readMethod.invoke(obj, null);
            }
            Field field = this.property;
            if (field != null) {
                return field.get(obj);
            }
            return null;
        } catch (IllegalAccessException e5) {
            throw new JSONException("Error while reading property " + this.f68463d.getName() + Constant.DOT_STRING + str, e5);
        } catch (InvocationTargetException e7) {
            throw new JSONException("Error while reading property " + this.f68463d.getName() + Constant.DOT_STRING + str, e7);
        }
    }

    public Method getWriteMethod() {
        if (this.writeMethod == null) {
            Method method = this.writeMethods.get(this.f68463d);
            this.writeMethod = method;
            if (method == null) {
                BeanAnalyzer beanAnalyzer = this.f68462c;
                if (beanAnalyzer.getSuperBean() != null) {
                    BeanAnalyzer superBean = beanAnalyzer.getSuperBean();
                    String str = this.f68460a;
                    if (superBean.hasProperty(str)) {
                        return beanAnalyzer.getSuperBean().getProperty(str).getWriteMethod();
                    }
                }
            }
        }
        return this.writeMethod;
    }

    public Collection<Method> getWriteMethods() {
        return this.writeMethods.values();
    }

    public Boolean isIncluded() {
        return this.included;
    }

    public boolean isNonProperty() {
        return getReadMethod() == null && getWriteMethod() == null && !Modifier.isPublic(this.property.getModifiers());
    }

    public Boolean isReadable() {
        Field field;
        Method readMethod = getReadMethod();
        return Boolean.valueOf(((readMethod == null || Modifier.isStatic(readMethod.getModifiers())) && ((field = this.property) == null || Modifier.isStatic(field.getModifiers()) || Modifier.isTransient(this.property.getModifiers()))) ? false : true);
    }

    public Boolean isTransient() {
        Field field = this.property;
        return Boolean.valueOf(field != null && Modifier.isTransient(field.getModifiers()));
    }

    public Boolean isWritable() {
        Field field;
        return Boolean.valueOf((getWriteMethod() == null && ((field = this.property) == null || !Modifier.isPublic(field.getModifiers()) || Modifier.isTransient(this.property.getModifiers()))) ? false : true);
    }

    public void setReadMethod(Method method) {
        if (this.f68463d == null) {
            this.f68463d = method.getReturnType();
            this.readMethod = method;
            method.setAccessible(true);
        } else if (method.getReturnType().isAssignableFrom(this.f68463d)) {
            this.readMethod = method;
            method.setAccessible(true);
        }
        Method method2 = this.readMethod;
        if (method2 == null || !method2.isAnnotationPresent(JSON.class)) {
            return;
        }
        a((JSON) this.readMethod.getAnnotation(JSON.class));
    }

    public BeanProperty(Field field, BeanAnalyzer beanAnalyzer) {
        String name = field.getName();
        this.f68461b = name;
        this.f68460a = name;
        this.f68462c = beanAnalyzer;
        this.property = field;
        this.f68463d = field.getType();
        if (field.isAnnotationPresent(JSON.class)) {
            a((JSON) field.getAnnotation(JSON.class));
        }
    }
}
