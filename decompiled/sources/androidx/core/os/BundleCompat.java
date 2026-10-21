package androidx.core.os;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class BundleCompat {

    @RequiresApi(18)
    public static class a {
        @DoNotInline
        public static IBinder a(Bundle bundle, String str) {
            return bundle.getBinder(str);
        }

        @DoNotInline
        public static void b(Bundle bundle, String str, IBinder iBinder) {
            bundle.putBinder(str, iBinder);
        }
    }

    @RequiresApi(33)
    public static class b {
        @DoNotInline
        public static <T> T a(@NonNull Bundle bundle, @Nullable String str, @NonNull Class<T> cls) {
            return (T) bundle.getParcelable(str, cls);
        }

        @DoNotInline
        public static <T> T[] b(@NonNull Bundle bundle, @Nullable String str, @NonNull Class<T> cls) {
            return (T[]) bundle.getParcelableArray(str, cls);
        }

        @DoNotInline
        public static <T> ArrayList<T> c(@NonNull Bundle bundle, @Nullable String str, @NonNull Class<? extends T> cls) {
            return bundle.getParcelableArrayList(str, cls);
        }

        @DoNotInline
        public static <T> SparseArray<T> d(@NonNull Bundle bundle, @Nullable String str, @NonNull Class<? extends T> cls) {
            return bundle.getSparseParcelableArray(str, cls);
        }
    }

    @Nullable
    public static IBinder getBinder(@NonNull Bundle bundle, @Nullable String str) {
        return a.a(bundle, str);
    }

    @Nullable
    public static <T> T getParcelable(@NonNull Bundle bundle, @Nullable String str, @NonNull Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return (T) b.a(bundle, str, cls);
        }
        T t10 = (T) bundle.getParcelable(str);
        if (cls.isInstance(t10)) {
            return t10;
        }
        return null;
    }

    @Nullable
    @SuppressLint({"ArrayReturn", "NullableCollection"})
    public static Parcelable[] getParcelableArray(@NonNull Bundle bundle, @Nullable String str, @NonNull Class<? extends Parcelable> cls) {
        return Build.VERSION.SDK_INT >= 34 ? (Parcelable[]) b.b(bundle, str, cls) : bundle.getParcelableArray(str);
    }

    @Nullable
    @SuppressLint({"ConcreteCollection", "NullableCollection"})
    public static <T> ArrayList<T> getParcelableArrayList(@NonNull Bundle bundle, @Nullable String str, @NonNull Class<? extends T> cls) {
        return Build.VERSION.SDK_INT >= 34 ? b.c(bundle, str, cls) : bundle.getParcelableArrayList(str);
    }

    @Nullable
    public static <T> SparseArray<T> getSparseParcelableArray(@NonNull Bundle bundle, @Nullable String str, @NonNull Class<? extends T> cls) {
        return Build.VERSION.SDK_INT >= 34 ? b.d(bundle, str, cls) : bundle.getSparseParcelableArray(str);
    }

    public static void putBinder(@NonNull Bundle bundle, @Nullable String str, @Nullable IBinder iBinder) {
        a.b(bundle, str, iBinder);
    }
}
