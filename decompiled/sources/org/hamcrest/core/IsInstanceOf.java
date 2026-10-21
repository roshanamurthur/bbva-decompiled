package org.hamcrest.core;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.hamcrest.Description;
import org.hamcrest.DiagnosingMatcher;
import org.hamcrest.Factory;
import org.hamcrest.Matcher;

/* JADX INFO: loaded from: classes13.dex */
public class IsInstanceOf extends DiagnosingMatcher<Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Class<?> f91781p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Class<?> f91782q0;

    public IsInstanceOf(Class<?> cls) {
        this.f91781p0 = cls;
        if (Boolean.TYPE.equals(cls)) {
            cls = Boolean.class;
        } else if (Byte.TYPE.equals(cls)) {
            cls = Byte.class;
        } else if (Character.TYPE.equals(cls)) {
            cls = Character.class;
        } else if (Double.TYPE.equals(cls)) {
            cls = Double.class;
        } else if (Float.TYPE.equals(cls)) {
            cls = Float.class;
        } else if (Integer.TYPE.equals(cls)) {
            cls = Integer.class;
        } else if (Long.TYPE.equals(cls)) {
            cls = Long.class;
        } else if (Short.TYPE.equals(cls)) {
            cls = Short.class;
        }
        this.f91782q0 = cls;
    }

    @Factory
    public static <T> Matcher<T> any(Class<T> cls) {
        return new IsInstanceOf(cls);
    }

    @Factory
    public static <T> Matcher<T> instanceOf(Class<?> cls) {
        return new IsInstanceOf(cls);
    }

    @Override // org.hamcrest.SelfDescribing
    public void describeTo(Description description) {
        description.appendText("an instance of ").appendText(this.f91781p0.getName());
    }

    @Override // org.hamcrest.DiagnosingMatcher
    public boolean matches(Object obj, Description description) {
        if (obj == null) {
            description.appendText(AbstractJsonLexerKt.NULL);
            return false;
        }
        if (this.f91782q0.isInstance(obj)) {
            return true;
        }
        description.appendValue(obj).appendText(" is a ".concat(obj.getClass().getName()));
        return false;
    }
}
