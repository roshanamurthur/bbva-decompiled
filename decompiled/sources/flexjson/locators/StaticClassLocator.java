package flexjson.locators;

import flexjson.ClassLocator;
import flexjson.ObjectBinder;
import flexjson.Path;

/* JADX INFO: loaded from: classes7.dex */
public class StaticClassLocator implements ClassLocator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f68517a;

    public StaticClassLocator(Class cls) {
        this.f68517a = cls;
    }

    @Override // flexjson.ClassLocator
    public Class locate(ObjectBinder objectBinder, Path path) {
        return this.f68517a;
    }
}
