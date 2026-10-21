package flexjson;

import flexjson.factories.ArrayObjectFactory;
import flexjson.factories.BeanObjectFactory;
import flexjson.factories.BigDecimalFactory;
import flexjson.factories.BigIntegerFactory;
import flexjson.factories.BooleanObjectFactory;
import flexjson.factories.ByteObjectFactory;
import flexjson.factories.CharacterObjectFactory;
import flexjson.factories.ClassLocatorObjectFactory;
import flexjson.factories.DateObjectFactory;
import flexjson.factories.DoubleObjectFactory;
import flexjson.factories.EnumObjectFactory;
import flexjson.factories.FloatObjectFactory;
import flexjson.factories.IntegerObjectFactory;
import flexjson.factories.JsonNumberObjectFactory;
import flexjson.factories.ListObjectFactory;
import flexjson.factories.LongObjectFactory;
import flexjson.factories.MapObjectFactory;
import flexjson.factories.SetObjectFactory;
import flexjson.factories.ShortObjectFactory;
import flexjson.factories.SortedSetObjectFactory;
import flexjson.factories.StringObjectFactory;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import mx.openpay.library.domain.util.Constant;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: loaded from: classes7.dex */
public class ObjectBinder {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f68500d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedList<Object> f68497a = new LinkedList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedList<Object> f68498b = new LinkedList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Path f68499c = new Path();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap f68501e = new HashMap();

    public ObjectBinder() {
        HashMap map = new HashMap();
        this.f68500d = map;
        map.put(Object.class, new BeanObjectFactory());
        map.put(Collection.class, new ListObjectFactory());
        map.put(List.class, new ListObjectFactory());
        map.put(Set.class, new SetObjectFactory());
        map.put(SortedSet.class, new SortedSetObjectFactory());
        map.put(Map.class, new MapObjectFactory());
        map.put(Integer.class, new IntegerObjectFactory());
        map.put(Integer.TYPE, new IntegerObjectFactory());
        map.put(Float.class, new FloatObjectFactory());
        map.put(Float.TYPE, new FloatObjectFactory());
        map.put(Double.class, new DoubleObjectFactory());
        map.put(Double.TYPE, new DoubleObjectFactory());
        map.put(Short.class, new ShortObjectFactory());
        map.put(Short.TYPE, new ShortObjectFactory());
        map.put(Long.class, new LongObjectFactory());
        map.put(Long.TYPE, new LongObjectFactory());
        map.put(Byte.class, new ByteObjectFactory());
        map.put(Byte.TYPE, new ByteObjectFactory());
        map.put(Boolean.class, new BooleanObjectFactory());
        map.put(Boolean.TYPE, new BooleanObjectFactory());
        map.put(Character.class, new CharacterObjectFactory());
        map.put(Character.TYPE, new CharacterObjectFactory());
        map.put(Enum.class, new EnumObjectFactory());
        map.put(Date.class, new DateObjectFactory());
        map.put(String.class, new StringObjectFactory());
        map.put(Array.class, new ArrayObjectFactory());
        map.put(BigDecimal.class, new BigDecimalFactory());
        map.put(BigInteger.class, new BigIntegerFactory());
        map.put(JsonNumber.class, new JsonNumberObjectFactory());
    }

    public final ObjectFactory a(Class cls) {
        ObjectFactory objectFactory = (ObjectFactory) this.f68500d.get(cls);
        if (objectFactory != null || cls == null) {
            return objectFactory;
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            ObjectFactory objectFactoryA = a(cls2);
            if (objectFactoryA != null) {
                return objectFactoryA;
            }
        }
        if (cls.getSuperclass() != null) {
            return a(cls.getSuperclass());
        }
        return null;
    }

    public final Class b(Type type) {
        if (type == null) {
            return null;
        }
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return (Class) ((ParameterizedType) type).getRawType();
        }
        if (type instanceof GenericArrayType) {
            return Array.class;
        }
        if ((type instanceof WildcardType) || (type instanceof TypeVariable)) {
            return null;
        }
        throw new JSONException(this.f68499c + ":  Unknown type " + type);
    }

    public Object bind(Object obj) {
        return bind(obj, (Type) null);
    }

    public <T extends Collection<Object>> T bindIntoCollection(Collection collection, T t10, Type type) {
        Type type2 = type instanceof ParameterizedType ? ((ParameterizedType) type).getActualTypeArguments()[0] : null;
        LinkedList<Object> linkedList = this.f68498b;
        linkedList.add(collection);
        LinkedList<Object> linkedList2 = this.f68497a;
        linkedList2.add(t10);
        getCurrentPath().enqueue("values");
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            t10.add(bind(it.next(), type2));
        }
        getCurrentPath().pop();
        linkedList2.removeLast();
        linkedList.removeLast();
        return t10;
    }

    public Object bindIntoMap(Map map, Map<Object, Object> map2, Type type, Type type2) {
        LinkedList<Object> linkedList = this.f68498b;
        linkedList.add(map);
        LinkedList<Object> linkedList2 = this.f68497a;
        linkedList2.add(map2);
        for (Object obj : map.keySet()) {
            Path path = this.f68499c;
            path.enqueue("keys");
            Object objBind = bind(obj, type);
            path.pop();
            path.enqueue("values");
            Object objBind2 = bind(map.get(obj), type2);
            path.pop();
            map2.put(objBind, objBind2);
        }
        linkedList2.removeLast();
        linkedList.removeLast();
        return map2;
    }

    public Object bindIntoObject(Map map, Object obj, Type type) {
        Path path = this.f68499c;
        LinkedList<Object> linkedList = this.f68497a;
        try {
            linkedList.add(obj);
            for (BeanProperty beanProperty : BeanAnalyzer.analyze(obj.getClass()).getProperties()) {
                if (!map.containsKey(beanProperty.getJsonName())) {
                    String jsonName = beanProperty.getJsonName();
                    if (!map.containsKey(Character.toUpperCase(jsonName.charAt(0)) + jsonName.substring(1))) {
                        continue;
                    }
                }
                Object obj2 = map.get(beanProperty.getJsonName());
                if (obj2 == null) {
                    String jsonName2 = beanProperty.getJsonName();
                    obj2 = map.get(Character.toUpperCase(jsonName2.charAt(0)) + jsonName2.substring(1));
                }
                if (beanProperty.isWritable().booleanValue()) {
                    path.enqueue(beanProperty.getName());
                    Method writeMethod = beanProperty.getWriteMethod();
                    if (writeMethod != null) {
                        Type[] genericParameterTypes = writeMethod.getGenericParameterTypes();
                        if (genericParameterTypes.length != 1) {
                            throw new JSONException(path + ":  Expected a single parameter for method " + obj.getClass().getName() + Constant.DOT_STRING + writeMethod.getName() + " but got " + genericParameterTypes.length);
                        }
                        writeMethod.invoke(linkedList.getLast(), bind(obj2, c(genericParameterTypes[0], type)));
                    } else {
                        Field property = beanProperty.getProperty();
                        if (property != null) {
                            property.setAccessible(true);
                            property.set(obj, bind(obj2, property.getGenericType()));
                        }
                    }
                    path.pop();
                } else {
                    continue;
                }
            }
            return linkedList.removeLast();
        } catch (IllegalAccessException e5) {
            throw new JSONException(path + ":  Could not access the no-arg constructor for " + obj.getClass().getName(), e5);
        } catch (InvocationTargetException e7) {
            throw new JSONException(path + ":  Exception while trying to invoke setter method.", e7);
        }
    }

    public Object bindPrimitive(Object obj, Class cls) {
        if (obj.getClass() == cls) {
            return obj;
        }
        if (obj instanceof Number) {
            if (cls.equals(Double.class)) {
                return Double.valueOf(((Number) obj).doubleValue());
            }
            if (cls.equals(Integer.class)) {
                return Integer.valueOf(((Number) obj).intValue());
            }
            if (cls.equals(Long.class)) {
                return Long.valueOf(((Number) obj).longValue());
            }
            if (cls.equals(Short.class)) {
                return Short.valueOf(((Number) obj).shortValue());
            }
            if (cls.equals(Byte.class)) {
                return Byte.valueOf(((Number) obj).byteValue());
            }
            if (cls.equals(Float.class)) {
                return Float.valueOf(((Number) obj).floatValue());
            }
            if (cls == Date.class) {
                return new Date(((Number) obj).longValue());
            }
        } else if ((obj instanceof Boolean) && cls.equals(Boolean.class)) {
            return obj;
        }
        throw new JSONException(String.format("%s: Don't know how to bind %s into class %s.  You might need to use an ObjectFactory instead of a plain class.", getCurrentPath().toString(), obj, cls.getName()));
    }

    public final Type c(Type type, Type type2) {
        if ((type instanceof Class) || (type instanceof ParameterizedType)) {
            return type;
        }
        if ((type instanceof TypeVariable) || (type instanceof WildcardType)) {
            return type2;
        }
        if (type instanceof GenericArrayType) {
            return ((GenericArrayType) type).getGenericComponentType();
        }
        throw new JSONException(this.f68499c + ":  Unknown generic type " + type + Constant.DOT_STRING);
    }

    public JSONException cannotConvertValueToTargetType(Object obj, Class cls) {
        return new JSONException(String.format("%s:  Can not convert %s into %s", this.f68499c, obj.getClass().getName(), cls.getName()));
    }

    public Class findClassAtPath(Path path) throws ClassNotFoundException {
        ObjectFactory objectFactory = (ObjectFactory) this.f68501e.get(path);
        if (objectFactory instanceof ClassLocatorObjectFactory) {
            return ((ClassLocatorObjectFactory) objectFactory).getLocator().locate(this, path);
        }
        return null;
    }

    public Class findClassInMap(Map map, Class cls) {
        if (cls != null) {
            return cls;
        }
        String str = (String) map.get(Name.LABEL);
        if (str == null) {
            return null;
        }
        try {
            ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
            return contextClassLoader != null ? contextClassLoader.loadClass(str) : Class.forName(str);
        } catch (ClassNotFoundException e5) {
            throw new JSONException(String.format("%s:  Could not load %s", this.f68499c, str), e5);
        }
    }

    public Path getCurrentPath() {
        return this.f68499c;
    }

    public Object getSource() {
        return this.f68498b.getLast();
    }

    public Object getTarget() {
        return this.f68497a.getLast();
    }

    public Object instantiate(Class cls) {
        Path path = this.f68499c;
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            declaredConstructor.setAccessible(true);
            return declaredConstructor.newInstance(new Object[0]);
        } catch (IllegalAccessException e5) {
            throw new JSONException(path + ":There was an exception trying to instantiate an instance of " + cls.getName(), e5);
        } catch (InstantiationException e7) {
            throw new JSONException(path + ":There was an exception trying to instantiate an instance of " + cls.getName(), e7);
        } catch (NoSuchMethodException e10) {
            throw new JSONException(path + ": " + cls.getName() + " lacks a no argument constructor.  Flexjson will instantiate any protected, private, or public no-arg constructor.", e10);
        } catch (InvocationTargetException e11) {
            throw new JSONException(path + ":There was an exception trying to instantiate an instance of " + cls.getName(), e11);
        }
    }

    public ObjectBinder use(Path path, ObjectFactory objectFactory) {
        this.f68501e.put(path, objectFactory);
        return this;
    }

    public Class useMostSpecific(Class cls, Class cls2) {
        if (cls != null && cls2 != null) {
            return cls2.isAssignableFrom(cls) ? cls : cls2;
        }
        if (cls2 != null) {
            return cls2;
        }
        if (cls != null) {
            return cls;
        }
        return null;
    }

    public Object bind(Object obj, Object obj2) {
        if (obj2 instanceof Map) {
            bindIntoMap((Map) obj, (Map) obj2, null, null);
        } else if (obj2 instanceof Collection) {
            bindIntoCollection((Collection) obj, (Collection) obj2, null);
        } else {
            bindIntoObject((Map) obj, obj2, obj2.getClass());
        }
        return obj2;
    }

    public ObjectBinder use(Class cls, ObjectFactory objectFactory) {
        this.f68500d.put(cls, objectFactory);
        return this;
    }

    public Object bind(Object obj, Type type) {
        Path path = this.f68499c;
        LinkedList<Object> linkedList = this.f68498b;
        linkedList.add(obj);
        Class<?> clsUseMostSpecific = null;
        if (obj == null) {
            linkedList.removeLast();
            return null;
        }
        try {
            Class clsB = b(type);
            HashMap map = this.f68501e;
            if (!map.containsKey(path)) {
                clsUseMostSpecific = useMostSpecific(obj instanceof Map ? findClassInMap((Map) obj, null) : null, clsB);
                if (clsUseMostSpecific == null) {
                    clsUseMostSpecific = obj.getClass();
                }
            }
            ObjectFactory objectFactoryA = (ObjectFactory) map.get(path);
            if (objectFactoryA == null) {
                objectFactoryA = (clsUseMostSpecific == null || !clsUseMostSpecific.isArray()) ? a(clsUseMostSpecific) : (ObjectFactory) this.f68500d.get(Array.class);
            }
            if (objectFactoryA != null) {
                Object objInstantiate = objectFactoryA.instantiate(this, obj, type, clsUseMostSpecific);
                linkedList.removeLast();
                return objInstantiate;
            }
            throw new JSONException(path + ": + Could not find a suitable ObjectFactory for " + clsUseMostSpecific);
        } catch (Throwable th2) {
            linkedList.removeLast();
            throw th2;
        }
    }
}
