package com.bumptech.glide.load.resource.transcode;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class TranscoderRegistry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f38689a = new ArrayList();

    public static final class a<Z, R> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class<Z> f38690a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Class<R> f38691b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ResourceTranscoder<Z, R> f38692c;

        public a(@NonNull Class<Z> cls, @NonNull Class<R> cls2, @NonNull ResourceTranscoder<Z, R> resourceTranscoder) {
            this.f38690a = cls;
            this.f38691b = cls2;
            this.f38692c = resourceTranscoder;
        }
    }

    @NonNull
    public synchronized <Z, R> ResourceTranscoder<Z, R> get(@NonNull Class<Z> cls, @NonNull Class<R> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return UnitTranscoder.get();
        }
        for (a aVar : this.f38689a) {
            if (aVar.f38690a.isAssignableFrom(cls) && cls2.isAssignableFrom(aVar.f38691b)) {
                return aVar.f38692c;
            }
        }
        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls + " to " + cls2);
    }

    @NonNull
    public synchronized <Z, R> List<Class<R>> getTranscodeClasses(@NonNull Class<Z> cls, @NonNull Class<R> cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (a aVar : this.f38689a) {
            if (aVar.f38690a.isAssignableFrom(cls) && cls2.isAssignableFrom(aVar.f38691b) && !arrayList.contains(aVar.f38691b)) {
                arrayList.add(aVar.f38691b);
            }
        }
        return arrayList;
    }

    public synchronized <Z, R> void register(@NonNull Class<Z> cls, @NonNull Class<R> cls2, @NonNull ResourceTranscoder<Z, R> resourceTranscoder) {
        this.f38689a.add(new a(cls, cls2, resourceTranscoder));
    }
}
