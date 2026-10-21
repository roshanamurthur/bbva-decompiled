package com.bumptech.glide.module;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import androidx.databinding.c;
import androidx.datastore.preferences.protobuf.q;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes9.dex */
@Deprecated
public final class ManifestParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f38738a;

    public ManifestParser(Context context) {
        this.f38738a = context;
    }

    public static GlideModule a(String str) {
        try {
            Class<?> cls = Class.forName(str);
            try {
                Object objNewInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                if (objNewInstance instanceof GlideModule) {
                    return (GlideModule) objNewInstance;
                }
                throw new RuntimeException(c.c("Expected instanceof GlideModule, but found: ", objNewInstance));
            } catch (IllegalAccessException e5) {
                b(cls, e5);
                throw null;
            } catch (InstantiationException e7) {
                b(cls, e7);
                throw null;
            } catch (NoSuchMethodException e10) {
                b(cls, e10);
                throw null;
            } catch (InvocationTargetException e11) {
                b(cls, e11);
                throw null;
            }
        } catch (ClassNotFoundException e12) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e12);
        }
    }

    public static void b(Class cls, ReflectiveOperationException reflectiveOperationException) {
        throw new RuntimeException(q.c("Unable to instantiate GlideModule implementation for ", cls), reflectiveOperationException);
    }

    public List<GlideModule> parse() {
        ArrayList arrayList = new ArrayList();
        try {
            Context context = this.f38738a;
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo != null && applicationInfo.metaData != null) {
                if (Log.isLoggable("ManifestParser", 2)) {
                    Objects.toString(applicationInfo.metaData);
                }
                for (String str : applicationInfo.metaData.keySet()) {
                    if ("GlideModule".equals(applicationInfo.metaData.get(str))) {
                        arrayList.add(a(str));
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return arrayList;
    }
}
