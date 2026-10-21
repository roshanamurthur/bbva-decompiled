package org.junit.experimental.runners;

import java.lang.reflect.Modifier;
import java.util.ArrayList;
import org.junit.runners.Suite;
import org.junit.runners.model.RunnerBuilder;

/* JADX INFO: loaded from: classes13.dex */
public class Enclosed extends Suite {
    public Enclosed(Class<?> cls, RunnerBuilder runnerBuilder) throws Throwable {
        Class<?>[] classes = cls.getClasses();
        ArrayList arrayList = new ArrayList(classes.length);
        for (Class<?> cls2 : classes) {
            if (!Modifier.isAbstract(cls2.getModifiers())) {
                arrayList.add(cls2);
            }
        }
        super(runnerBuilder, cls, (Class[]) arrayList.toArray(new Class[arrayList.size()]));
    }
}
