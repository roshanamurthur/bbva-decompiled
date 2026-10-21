package com.facetec.sdk;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes9.dex */
final class gc extends fw {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Class f41765c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f41766a = b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Field f41767b = a();

    private static Field a() {
        try {
            return AccessibleObject.class.getDeclaredField("override");
        } catch (NoSuchFieldException unused) {
            return null;
        }
    }

    private boolean b(AccessibleObject accessibleObject) {
        if (this.f41766a != null && this.f41767b != null) {
            try {
                f41765c.getMethod("putBoolean", Object.class, Long.TYPE, Boolean.TYPE).invoke(this.f41766a, accessibleObject, Long.valueOf(((Long) f41765c.getMethod("objectFieldOffset", Field.class).invoke(this.f41766a, this.f41767b)).longValue()), Boolean.TRUE);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    @Override // com.facetec.sdk.fw
    public final void e(AccessibleObject accessibleObject) {
        if (b(accessibleObject)) {
            return;
        }
        try {
            accessibleObject.setAccessible(true);
        } catch (SecurityException e5) {
            StringBuilder sb2 = new StringBuilder("Gson couldn't modify fields for ");
            sb2.append(accessibleObject);
            sb2.append("\nand sun.misc.Unsafe not found.\nEither write a custom type adapter, or make fields accessible, or include sun.misc.Unsafe.");
            throw new ed(sb2.toString(), e5);
        }
    }

    private static Object b() {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            f41765c = cls;
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            return declaredField.get(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
