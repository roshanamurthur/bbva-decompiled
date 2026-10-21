package flexjson.factories;

import flexjson.ObjectBinder;
import flexjson.ObjectFactory;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes7.dex */
public class CharacterObjectFactory implements ObjectFactory {
    @Override // flexjson.ObjectFactory
    public Object instantiate(ObjectBinder objectBinder, Object obj, Type type, Class cls) {
        return Character.valueOf(obj.toString().charAt(0));
    }
}
