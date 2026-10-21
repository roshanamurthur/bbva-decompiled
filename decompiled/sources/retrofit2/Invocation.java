package retrofit2;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes13.dex */
public final class Invocation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Method f93006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<?> f93007b;

    public Invocation(Method method, ArrayList arrayList) {
        this.f93006a = method;
        this.f93007b = Collections.unmodifiableList(arrayList);
    }

    public static Invocation of(Method method, List<?> list) {
        Objects.requireNonNull(method, "method == null");
        Objects.requireNonNull(list, "arguments == null");
        return new Invocation(method, new ArrayList(list));
    }

    public List<?> arguments() {
        return this.f93007b;
    }

    public Method method() {
        return this.f93006a;
    }

    public String toString() {
        Method method = this.f93006a;
        return String.format("%s.%s() %s", method.getDeclaringClass().getName(), method.getName(), this.f93007b);
    }
}
