package com.fasterxml.jackson.databind.introspect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes9.dex */
public final class MemberKey {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Class<?>[] f43351c = new Class[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class<?>[] f43353b;

    public MemberKey(Method method) {
        this(method.getName(), method.getParameterTypes());
    }

    public int argCount() {
        return this.f43353b.length;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != MemberKey.class) {
            return false;
        }
        MemberKey memberKey = (MemberKey) obj;
        if (!this.f43352a.equals(memberKey.f43352a)) {
            return false;
        }
        Class<?>[] clsArr = this.f43353b;
        int length = clsArr.length;
        Class<?>[] clsArr2 = memberKey.f43353b;
        if (clsArr2.length != length) {
            return false;
        }
        for (int i10 = 0; i10 < length; i10++) {
            if (clsArr2[i10] != clsArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public String getName() {
        return this.f43352a;
    }

    public int hashCode() {
        return this.f43352a.hashCode() + this.f43353b.length;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f43352a);
        sb2.append("(");
        return androidx.appcompat.widget.a.c(sb2, this.f43353b.length, "-args)");
    }

    public MemberKey(Constructor<?> constructor) {
        this("", constructor.getParameterTypes());
    }

    public MemberKey(String str, Class<?>[] clsArr) {
        this.f43352a = str;
        this.f43353b = clsArr == null ? f43351c : clsArr;
    }
}
