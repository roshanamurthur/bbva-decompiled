package com.bumptech.glide.load.engine.bitmap_recycle;

import android.util.Log;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.util.Preconditions;
import java.util.HashMap;
import java.util.NavigableMap;
import java.util.TreeMap;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import uc.c;
import uc.e;

/* JADX INFO: loaded from: classes9.dex */
public final class LruArrayPool implements ArrayPool {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c<a, Object> f38234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f38235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f38236c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f38237d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f38238e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f38239f;

    public static final class a implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f38240a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f38241b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Class<?> f38242c;

        public a(b bVar) {
            this.f38240a = bVar;
        }

        @Override // uc.e
        public final void a() {
            this.f38240a.a(this);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f38241b == aVar.f38241b && this.f38242c == aVar.f38242c;
        }

        public final int hashCode() {
            int i10 = this.f38241b * 31;
            Class<?> cls = this.f38242c;
            return i10 + (cls != null ? cls.hashCode() : 0);
        }

        public final String toString() {
            return "Key{size=" + this.f38241b + "array=" + this.f38242c + AbstractJsonLexerKt.END_OBJ;
        }
    }

    public static final class b extends uc.b<a> {
        public final e b() {
            return new a(this);
        }
    }

    @VisibleForTesting
    public LruArrayPool() {
        this.f38234a = new c<>();
        this.f38235b = new b();
        this.f38236c = new HashMap();
        this.f38237d = new HashMap();
        this.f38238e = 4194304;
    }

    public final void a(int i10, Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMapE = e(cls);
        Integer num = navigableMapE.get(Integer.valueOf(i10));
        if (num != null) {
            if (num.intValue() == 1) {
                navigableMapE.remove(Integer.valueOf(i10));
                return;
            } else {
                navigableMapE.put(Integer.valueOf(i10), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i10 + ", this: " + this);
    }

    public final void b(int i10) {
        while (this.f38239f > i10) {
            Object objC = this.f38234a.c();
            Preconditions.checkNotNull(objC);
            uc.a aVarC = c(objC.getClass());
            this.f38239f -= aVarC.getElementSizeInBytes() * aVarC.getArrayLength(objC);
            a(aVarC.getArrayLength(objC), objC.getClass());
            if (Log.isLoggable(aVarC.getTag(), 2)) {
                aVarC.getTag();
                aVarC.getArrayLength(objC);
            }
        }
    }

    public final <T> uc.a<T> c(Class<T> cls) {
        HashMap map = this.f38237d;
        uc.a<T> byteArrayAdapter = (uc.a) map.get(cls);
        if (byteArrayAdapter == null) {
            if (cls.equals(int[].class)) {
                byteArrayAdapter = new IntegerArrayAdapter();
            } else {
                if (!cls.equals(byte[].class)) {
                    throw new IllegalArgumentException("No array pool found for: ".concat(cls.getSimpleName()));
                }
                byteArrayAdapter = new ByteArrayAdapter();
            }
            map.put(cls, byteArrayAdapter);
        }
        return byteArrayAdapter;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool
    public synchronized void clearMemory() {
        b(0);
    }

    public final <T> T d(a aVar, Class<T> cls) {
        uc.a<T> aVarC = c(cls);
        T t10 = (T) this.f38234a.a(aVar);
        if (t10 != null) {
            this.f38239f -= aVarC.getElementSizeInBytes() * aVarC.getArrayLength(t10);
            a(aVarC.getArrayLength(t10), cls);
        }
        if (t10 != null) {
            return t10;
        }
        if (Log.isLoggable(aVarC.getTag(), 2)) {
            aVarC.getTag();
        }
        return aVarC.newArray(aVar.f38241b);
    }

    public final NavigableMap<Integer, Integer> e(Class<?> cls) {
        HashMap map = this.f38236c;
        NavigableMap<Integer, Integer> navigableMap = (NavigableMap) map.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        map.put(cls, treeMap);
        return treeMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool
    public synchronized <T> T get(int i10, Class<T> cls) {
        a aVar;
        int i11;
        try {
            Integer numCeilingKey = e(cls).ceilingKey(Integer.valueOf(i10));
            if (numCeilingKey == null || ((i11 = this.f38239f) != 0 && this.f38238e / i11 < 2 && numCeilingKey.intValue() > i10 * 8)) {
                b bVar = this.f38235b;
                e eVarB = (e) bVar.f93771a.poll();
                if (eVarB == null) {
                    eVarB = bVar.b();
                }
                aVar = (a) eVarB;
                aVar.f38241b = i10;
                aVar.f38242c = cls;
            } else {
                b bVar2 = this.f38235b;
                int iIntValue = numCeilingKey.intValue();
                e eVarB2 = (e) bVar2.f93771a.poll();
                if (eVarB2 == null) {
                    eVarB2 = bVar2.b();
                }
                aVar = (a) eVarB2;
                aVar.f38241b = iIntValue;
                aVar.f38242c = cls;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (T) d(aVar, cls);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool
    public synchronized <T> T getExact(int i10, Class<T> cls) {
        a aVar;
        b bVar = this.f38235b;
        e eVarB = (e) bVar.f93771a.poll();
        if (eVarB == null) {
            eVarB = bVar.b();
        }
        aVar = (a) eVarB;
        aVar.f38241b = i10;
        aVar.f38242c = cls;
        return (T) d(aVar, cls);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool
    @Deprecated
    public <T> void put(T t10, Class<T> cls) {
        put(t10);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool
    public synchronized void trimMemory(int i10) {
        try {
            if (i10 >= 40) {
                clearMemory();
            } else if (i10 >= 20 || i10 == 15) {
                b(this.f38238e / 2);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool
    public synchronized <T> void put(T t10) {
        Class<?> cls = t10.getClass();
        uc.a<T> aVarC = c(cls);
        int arrayLength = aVarC.getArrayLength(t10);
        int elementSizeInBytes = aVarC.getElementSizeInBytes() * arrayLength;
        if (elementSizeInBytes <= this.f38238e / 2) {
            b bVar = this.f38235b;
            e eVarB = (e) bVar.f93771a.poll();
            if (eVarB == null) {
                eVarB = bVar.b();
            }
            a aVar = (a) eVarB;
            aVar.f38241b = arrayLength;
            aVar.f38242c = cls;
            this.f38234a.b(aVar, t10);
            NavigableMap<Integer, Integer> navigableMapE = e(cls);
            Integer num = navigableMapE.get(Integer.valueOf(aVar.f38241b));
            Integer numValueOf = Integer.valueOf(aVar.f38241b);
            int iIntValue = 1;
            if (num != null) {
                iIntValue = 1 + num.intValue();
            }
            navigableMapE.put(numValueOf, Integer.valueOf(iIntValue));
            this.f38239f += elementSizeInBytes;
            b(this.f38238e);
        }
    }

    public LruArrayPool(int i10) {
        this.f38234a = new c<>();
        this.f38235b = new b();
        this.f38236c = new HashMap();
        this.f38237d = new HashMap();
        this.f38238e = i10;
    }
}
