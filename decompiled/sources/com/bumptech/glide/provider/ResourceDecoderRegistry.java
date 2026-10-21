package com.bumptech.glide.provider;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.ResourceDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class ResourceDecoderRegistry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f38748a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f38749b = new HashMap();

    public static class a<T, R> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class<T> f38750a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Class<R> f38751b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ResourceDecoder<T, R> f38752c;

        public a(@NonNull Class<T> cls, @NonNull Class<R> cls2, ResourceDecoder<T, R> resourceDecoder) {
            this.f38750a = cls;
            this.f38751b = cls2;
            this.f38752c = resourceDecoder;
        }
    }

    @NonNull
    public final synchronized List<a<?, ?>> a(@NonNull String str) {
        List<a<?, ?>> arrayList;
        try {
            if (!this.f38748a.contains(str)) {
                this.f38748a.add(str);
            }
            arrayList = (List) this.f38749b.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.f38749b.put(str, arrayList);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return arrayList;
    }

    public synchronized <T, R> void append(@NonNull String str, @NonNull ResourceDecoder<T, R> resourceDecoder, @NonNull Class<T> cls, @NonNull Class<R> cls2) {
        a(str).add(new a<>(cls, cls2, resourceDecoder));
    }

    @NonNull
    public synchronized <T, R> List<ResourceDecoder<T, R>> getDecoders(@NonNull Class<T> cls, @NonNull Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f38748a.iterator();
        while (it.hasNext()) {
            List<a> list = (List) this.f38749b.get((String) it.next());
            if (list != null) {
                for (a aVar : list) {
                    if (aVar.f38750a.isAssignableFrom(cls) && cls2.isAssignableFrom(aVar.f38751b)) {
                        arrayList.add(aVar.f38752c);
                    }
                }
            }
        }
        return arrayList;
    }

    @NonNull
    public synchronized <T, R> List<Class<R>> getResourceClasses(@NonNull Class<T> cls, @NonNull Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f38748a.iterator();
        while (it.hasNext()) {
            List<a> list = (List) this.f38749b.get((String) it.next());
            if (list != null) {
                for (a aVar : list) {
                    if (aVar.f38750a.isAssignableFrom(cls) && cls2.isAssignableFrom(aVar.f38751b) && !arrayList.contains(aVar.f38751b)) {
                        arrayList.add(aVar.f38751b);
                    }
                }
            }
        }
        return arrayList;
    }

    public synchronized <T, R> void prepend(@NonNull String str, @NonNull ResourceDecoder<T, R> resourceDecoder, @NonNull Class<T> cls, @NonNull Class<R> cls2) {
        a(str).add(0, new a<>(cls, cls2, resourceDecoder));
    }

    public synchronized void setBucketPriorityList(@NonNull List<String> list) {
        try {
            ArrayList<String> arrayList = new ArrayList(this.f38748a);
            this.f38748a.clear();
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                this.f38748a.add(it.next());
            }
            for (String str : arrayList) {
                if (!list.contains(str)) {
                    this.f38748a.add(str);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
