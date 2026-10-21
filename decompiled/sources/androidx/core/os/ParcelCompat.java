package androidx.core.os;

import android.annotation.SuppressLint;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.widget.o1;
import androidx.datastore.preferences.protobuf.e;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class ParcelCompat {

    @RequiresApi(29)
    public static class a {
        @DoNotInline
        public static <T extends Parcelable> List<T> a(@NonNull Parcel parcel, @NonNull List<T> list, @Nullable ClassLoader classLoader) {
            return parcel.readParcelableList(list, classLoader);
        }
    }

    @RequiresApi(30)
    public static class b {
        @DoNotInline
        public static Parcelable.Creator<?> a(@NonNull Parcel parcel, @Nullable ClassLoader classLoader) {
            return parcel.readParcelableCreator(classLoader);
        }
    }

    @RequiresApi(33)
    public static class c {
        @DoNotInline
        public static <T> T[] a(Parcel parcel, ClassLoader classLoader, Class<T> cls) {
            return (T[]) parcel.readArray(classLoader, cls);
        }

        @DoNotInline
        public static <T> ArrayList<T> b(Parcel parcel, ClassLoader classLoader, Class<? extends T> cls) {
            return parcel.readArrayList(classLoader, cls);
        }

        @DoNotInline
        public static <V, K> HashMap<K, V> c(Parcel parcel, ClassLoader classLoader, Class<? extends K> cls, Class<? extends V> cls2) {
            return parcel.readHashMap(classLoader, cls, cls2);
        }

        @DoNotInline
        public static <T> void d(@NonNull Parcel parcel, @NonNull List<? super T> list, @Nullable ClassLoader classLoader, @NonNull Class<T> cls) {
            parcel.readList(list, classLoader, cls);
        }

        @DoNotInline
        public static <K, V> void e(Parcel parcel, Map<? super K, ? super V> map, ClassLoader classLoader, Class<K> cls, Class<V> cls2) {
            parcel.readMap(map, classLoader, cls, cls2);
        }

        @DoNotInline
        public static <T extends Parcelable> T f(@NonNull Parcel parcel, @Nullable ClassLoader classLoader, @NonNull Class<T> cls) {
            return (T) parcel.readParcelable(classLoader, cls);
        }

        @DoNotInline
        public static <T> T[] g(@NonNull Parcel parcel, @Nullable ClassLoader classLoader, @NonNull Class<T> cls) {
            return (T[]) parcel.readParcelableArray(classLoader, cls);
        }

        @DoNotInline
        public static <T> Parcelable.Creator<T> h(Parcel parcel, ClassLoader classLoader, Class<T> cls) {
            return parcel.readParcelableCreator(classLoader, cls);
        }

        @DoNotInline
        public static <T> List<T> i(@NonNull Parcel parcel, @NonNull List<T> list, @Nullable ClassLoader classLoader, @NonNull Class<T> cls) {
            return parcel.readParcelableList(list, classLoader, cls);
        }

        @DoNotInline
        public static <T extends Serializable> T j(@NonNull Parcel parcel, @Nullable ClassLoader classLoader, @NonNull Class<T> cls) {
            return (T) parcel.readSerializable(classLoader, cls);
        }

        @DoNotInline
        public static <T> SparseArray<T> k(Parcel parcel, ClassLoader classLoader, Class<? extends T> cls) {
            return parcel.readSparseArray(classLoader, cls);
        }
    }

    @Nullable
    @SuppressLint({"ArrayReturn", "NullableCollection"})
    public static <T> Object[] readArray(@NonNull Parcel parcel, @Nullable ClassLoader classLoader, @NonNull Class<T> cls) {
        return Build.VERSION.SDK_INT >= 34 ? c.a(parcel, classLoader, cls) : parcel.readArray(classLoader);
    }

    @Nullable
    @SuppressLint({"ConcreteCollection", "NullableCollection"})
    public static <T> ArrayList<T> readArrayList(@NonNull Parcel parcel, @Nullable ClassLoader classLoader, @NonNull Class<? extends T> cls) {
        return Build.VERSION.SDK_INT >= 34 ? c.b(parcel, classLoader, cls) : parcel.readArrayList(classLoader);
    }

    public static boolean readBoolean(@NonNull Parcel parcel) {
        return parcel.readInt() != 0;
    }

    @Nullable
    @SuppressLint({"ConcreteCollection", "NullableCollection"})
    public static <K, V> HashMap<K, V> readHashMap(@NonNull Parcel parcel, @Nullable ClassLoader classLoader, @NonNull Class<? extends K> cls, @NonNull Class<? extends V> cls2) {
        return Build.VERSION.SDK_INT >= 34 ? c.c(parcel, classLoader, cls, cls2) : parcel.readHashMap(classLoader);
    }

    public static <T> void readList(@NonNull Parcel parcel, @NonNull List<? super T> list, @Nullable ClassLoader classLoader, @NonNull Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            c.d(parcel, list, classLoader, cls);
        } else {
            parcel.readList(list, classLoader);
        }
    }

    public static <K, V> void readMap(@NonNull Parcel parcel, @NonNull Map<? super K, ? super V> map, @Nullable ClassLoader classLoader, @NonNull Class<K> cls, @NonNull Class<V> cls2) {
        if (Build.VERSION.SDK_INT >= 34) {
            c.e(parcel, map, classLoader, cls, cls2);
        } else {
            parcel.readMap(map, classLoader);
        }
    }

    @Nullable
    public static <T extends Parcelable> T readParcelable(@NonNull Parcel parcel, @Nullable ClassLoader classLoader, @NonNull Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return (T) c.f(parcel, classLoader, cls);
        }
        T t10 = (T) parcel.readParcelable(classLoader);
        if (t10 == null || cls.isInstance(t10)) {
            return t10;
        }
        throw new BadParcelableException("Parcelable " + t10.getClass() + " is not a subclass of required class " + cls.getName() + " provided in the parameter");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    @SuppressLint({"ArrayReturn", "NullableCollection"})
    @Deprecated
    public static <T> T[] readParcelableArray(@NonNull Parcel parcel, @Nullable ClassLoader classLoader, @NonNull Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return (T[]) c.g(parcel, classLoader, cls);
        }
        T[] tArr = (T[]) parcel.readParcelableArray(classLoader);
        if (cls.isAssignableFrom(Parcelable.class)) {
            return tArr;
        }
        T[] tArr2 = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, tArr.length));
        for (int i10 = 0; i10 < tArr.length; i10++) {
            try {
                tArr2[i10] = cls.cast(tArr[i10]);
            } catch (ClassCastException unused) {
                throw new BadParcelableException(e.e(cls, o1.c("Parcelable at index ", i10, " is not a subclass of required class "), " provided in the parameter"));
            }
        }
        return tArr2;
    }

    @Nullable
    @SuppressLint({"ArrayReturn", "NullableCollection"})
    public static <T> Parcelable[] readParcelableArrayTyped(@NonNull Parcel parcel, @Nullable ClassLoader classLoader, @NonNull Class<T> cls) {
        return Build.VERSION.SDK_INT >= 34 ? (Parcelable[]) c.g(parcel, classLoader, cls) : parcel.readParcelableArray(classLoader);
    }

    @Nullable
    @RequiresApi(30)
    public static <T> Parcelable.Creator<T> readParcelableCreator(@NonNull Parcel parcel, @Nullable ClassLoader classLoader, @NonNull Class<T> cls) {
        return Build.VERSION.SDK_INT >= 34 ? c.h(parcel, classLoader, cls) : (Parcelable.Creator<T>) b.a(parcel, classLoader);
    }

    @NonNull
    @RequiresApi(api = 29)
    public static <T> List<T> readParcelableList(@NonNull Parcel parcel, @NonNull List<T> list, @Nullable ClassLoader classLoader, @NonNull Class<T> cls) {
        return Build.VERSION.SDK_INT >= 34 ? c.i(parcel, list, classLoader, cls) : a.a(parcel, list, classLoader);
    }

    @Nullable
    public static <T extends Serializable> T readSerializable(@NonNull Parcel parcel, @Nullable ClassLoader classLoader, @NonNull Class<T> cls) {
        return Build.VERSION.SDK_INT >= 33 ? (T) c.j(parcel, classLoader, cls) : (T) parcel.readSerializable();
    }

    @Nullable
    public static <T> SparseArray<T> readSparseArray(@NonNull Parcel parcel, @Nullable ClassLoader classLoader, @NonNull Class<? extends T> cls) {
        return Build.VERSION.SDK_INT >= 34 ? c.k(parcel, classLoader, cls) : parcel.readSparseArray(classLoader);
    }

    public static void writeBoolean(@NonNull Parcel parcel, boolean z10) {
        parcel.writeInt(z10 ? 1 : 0);
    }
}
