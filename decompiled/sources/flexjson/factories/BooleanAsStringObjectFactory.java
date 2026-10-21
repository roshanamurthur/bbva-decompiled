package flexjson.factories;

import flexjson.ObjectBinder;
import flexjson.ObjectFactory;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes7.dex */
public class BooleanAsStringObjectFactory implements ObjectFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f68513a;

    public BooleanAsStringObjectFactory(String str, String str2) {
        this.f68513a = str;
    }

    @Override // flexjson.ObjectFactory
    public Object instantiate(ObjectBinder objectBinder, Object obj, Type type, Class cls) {
        return this.f68513a.equalsIgnoreCase(obj.toString()) ? Boolean.TRUE : Boolean.FALSE;
    }
}
