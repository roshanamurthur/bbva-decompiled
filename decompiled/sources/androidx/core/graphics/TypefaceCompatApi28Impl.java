package androidx.core.graphics;

import android.content.Context;
import android.graphics.Typeface;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(28)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class TypefaceCompatApi28Impl extends TypefaceCompatApi26Impl {
    @Override // androidx.core.graphics.TypefaceCompatApi26Impl, androidx.core.graphics.r, androidx.core.graphics.t
    @NonNull
    public final Typeface a(@NonNull Context context, @NonNull Typeface typeface, int i10, boolean z10) {
        return Typeface.create(typeface, i10, z10);
    }

    @Override // androidx.core.graphics.TypefaceCompatApi26Impl
    public Typeface createFromFamiliesWithDefault(Object obj) {
        try {
            Object objNewInstance = Array.newInstance(this.mFontFamily, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.mCreateFromFamiliesWithDefault.invoke(null, objNewInstance, "sans-serif", -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e5) {
            throw new RuntimeException(e5);
        }
    }

    @Override // androidx.core.graphics.TypefaceCompatApi26Impl
    public Method obtainCreateFromFamiliesWithDefaultMethod(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), String.class, cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
