package org.junit.runners.model;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class InvalidTestClassError extends InitializationError {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final String f92047q0;

    public InvalidTestClassError(Class<?> cls, List<Throwable> list) {
        super(list);
        StringBuilder sb2 = new StringBuilder();
        int i10 = 1;
        sb2.append(String.format("Invalid test class '%s':", cls.getName()));
        Iterator<Throwable> it = list.iterator();
        while (it.hasNext()) {
            sb2.append("\n  " + i10 + ". " + it.next().getMessage());
            i10++;
        }
        this.f92047q0 = sb2.toString();
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f92047q0;
    }
}
