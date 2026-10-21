package org.junit.experimental.theories.internal;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes13.dex */
public class ParameterizedAssertionError extends AssertionError {
    public ParameterizedAssertionError(Throwable th2, String str, Object... objArr) {
        super(String.format("%s(%s)", str, join(", ", objArr)));
        initCause(th2);
    }

    public static String join(String str, Object... objArr) {
        return join(str, Arrays.asList(objArr));
    }

    public boolean equals(Object obj) {
        return (obj instanceof ParameterizedAssertionError) && toString().equals(obj.toString());
    }

    public int hashCode() {
        return toString().hashCode();
    }

    public static String join(String str, Collection<Object> collection) {
        String strValueOf;
        StringBuilder sb2 = new StringBuilder();
        Iterator<Object> it = collection.iterator();
        while (it.hasNext()) {
            try {
                strValueOf = String.valueOf(it.next());
            } catch (Throwable unused) {
                strValueOf = "[toString failed]";
            }
            sb2.append(strValueOf);
            if (it.hasNext()) {
                sb2.append(str);
            }
        }
        return sb2.toString();
    }
}
