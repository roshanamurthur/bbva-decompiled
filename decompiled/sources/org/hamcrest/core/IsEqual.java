package org.hamcrest.core;

import java.lang.reflect.Array;
import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Factory;
import org.hamcrest.Matcher;

/* JADX INFO: loaded from: classes13.dex */
public class IsEqual<T> extends BaseMatcher<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Object f91780p0;

    public IsEqual(T t10) {
        this.f91780p0 = t10;
    }

    public static boolean a(Object obj, Object obj2) {
        for (int i10 = 0; i10 < Array.getLength(obj); i10++) {
            if (!b(Array.get(obj, i10), Array.get(obj2, i10))) {
                return false;
            }
        }
        return true;
    }

    public static boolean b(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        if (obj2 == null || !obj.getClass().isArray()) {
            return obj.equals(obj2);
        }
        return obj2.getClass().isArray() && Array.getLength(obj) == Array.getLength(obj2) && a(obj, obj2);
    }

    @Factory
    public static <T> Matcher<T> equalTo(T t10) {
        return new IsEqual(t10);
    }

    @Override // org.hamcrest.SelfDescribing
    public void describeTo(Description description) {
        description.appendValue(this.f91780p0);
    }

    @Override // org.hamcrest.Matcher
    public boolean matches(Object obj) {
        return b(obj, this.f91780p0);
    }
}
