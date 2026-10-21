package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import androidx.core.util.Pools;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.DataRewinder;
import com.bumptech.glide.util.Preconditions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes9.dex */
public class LoadPath<Data, ResourceType, Transcode> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class<Data> f38212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Pools.Pool<List<Throwable>> f38213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<? extends DecodePath<Data, ResourceType, Transcode>> f38214c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f38215d;

    public LoadPath(Class<Data> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<DecodePath<Data, ResourceType, Transcode>> list, Pools.Pool<List<Throwable>> pool) {
        this.f38212a = cls;
        this.f38213b = pool;
        this.f38214c = (List) Preconditions.checkNotEmpty(list);
        this.f38215d = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public Class<Data> getDataClass() {
        return this.f38212a;
    }

    public Resource<Transcode> load(DataRewinder<Data> dataRewinder, @NonNull Options options, int i10, int i11, DecodePath.a<ResourceType> aVar) throws GlideException {
        Pools.Pool<List<Throwable>> pool = this.f38213b;
        List<Throwable> list = (List) Preconditions.checkNotNull(pool.acquire());
        try {
            List<? extends DecodePath<Data, ResourceType, Transcode>> list2 = this.f38214c;
            int size = list2.size();
            Resource<Transcode> resourceDecode = null;
            for (int i12 = 0; i12 < size; i12++) {
                try {
                    resourceDecode = list2.get(i12).decode(dataRewinder, i10, i11, options, aVar);
                } catch (GlideException e5) {
                    list.add(e5);
                }
                if (resourceDecode != null) {
                    break;
                }
            }
            if (resourceDecode != null) {
                pool.release(list);
                return resourceDecode;
            }
            throw new GlideException(this.f38215d, new ArrayList(list));
        } catch (Throwable th2) {
            pool.release(list);
            throw th2;
        }
    }

    public String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f38214c.toArray()) + AbstractJsonLexerKt.END_OBJ;
    }
}
