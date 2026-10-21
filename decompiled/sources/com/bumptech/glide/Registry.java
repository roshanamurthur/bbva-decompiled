package com.bumptech.glide;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.Pools;
import androidx.datastore.preferences.protobuf.q;
import com.bumptech.glide.load.Encoder;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.ResourceEncoder;
import com.bumptech.glide.load.data.DataRewinder;
import com.bumptech.glide.load.data.DataRewinderRegistry;
import com.bumptech.glide.load.engine.DecodePath;
import com.bumptech.glide.load.engine.LoadPath;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.model.ModelLoaderFactory;
import com.bumptech.glide.load.model.ModelLoaderRegistry;
import com.bumptech.glide.load.resource.transcode.ResourceTranscoder;
import com.bumptech.glide.load.resource.transcode.TranscoderRegistry;
import com.bumptech.glide.provider.EncoderRegistry;
import com.bumptech.glide.provider.ImageHeaderParserRegistry;
import com.bumptech.glide.provider.LoadPathCache;
import com.bumptech.glide.provider.ModelToResourceClassCache;
import com.bumptech.glide.provider.ResourceDecoderRegistry;
import com.bumptech.glide.provider.ResourceEncoderRegistry;
import com.bumptech.glide.util.pool.FactoryPools;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class Registry {
    public static final String BUCKET_ANIMATION = "Animation";
    public static final String BUCKET_BITMAP = "Bitmap";
    public static final String BUCKET_BITMAP_DRAWABLE = "BitmapDrawable";

    @Deprecated
    public static final String BUCKET_GIF = "Animation";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ModelLoaderRegistry f38029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EncoderRegistry f38030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ResourceDecoderRegistry f38031c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ResourceEncoderRegistry f38032d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final DataRewinderRegistry f38033e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TranscoderRegistry f38034f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ImageHeaderParserRegistry f38035g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ModelToResourceClassCache f38036h = new ModelToResourceClassCache();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final LoadPathCache f38037i = new LoadPathCache();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Pools.Pool<List<Throwable>> f38038j;

    public static class MissingComponentException extends RuntimeException {
        public MissingComponentException(@NonNull String str) {
            super(str);
        }
    }

    public static final class NoImageHeaderParserException extends MissingComponentException {
        public NoImageHeaderParserException() {
            super("Failed to find image header parser.");
        }
    }

    public static class NoModelLoaderAvailableException extends MissingComponentException {
        public NoModelLoaderAvailableException(@NonNull Object obj) {
            super("Failed to find any ModelLoaders registered for model class: " + obj.getClass());
        }

        public <M> NoModelLoaderAvailableException(@NonNull M m, @NonNull List<ModelLoader<M, ?>> list) {
            super("Found ModelLoaders for model class: " + list + ", but none that handle this specific model instance: " + m);
        }

        public NoModelLoaderAvailableException(@NonNull Class<?> cls, @NonNull Class<?> cls2) {
            super("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        }
    }

    public static class NoResultEncoderAvailableException extends MissingComponentException {
        public NoResultEncoderAvailableException(@NonNull Class<?> cls) {
            super("Failed to find result encoder for resource class: " + cls + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        }
    }

    public static class NoSourceEncoderAvailableException extends MissingComponentException {
        public NoSourceEncoderAvailableException(@NonNull Class<?> cls) {
            super(q.c("Failed to find source encoder for data class: ", cls));
        }
    }

    public Registry() {
        Pools.Pool<List<Throwable>> poolThreadSafeList = FactoryPools.threadSafeList();
        this.f38038j = poolThreadSafeList;
        this.f38029a = new ModelLoaderRegistry(poolThreadSafeList);
        this.f38030b = new EncoderRegistry();
        this.f38031c = new ResourceDecoderRegistry();
        this.f38032d = new ResourceEncoderRegistry();
        this.f38033e = new DataRewinderRegistry();
        this.f38034f = new TranscoderRegistry();
        this.f38035g = new ImageHeaderParserRegistry();
        setResourceDecoderBucketPriorityList(Arrays.asList("Animation", BUCKET_BITMAP, BUCKET_BITMAP_DRAWABLE));
    }

    @NonNull
    public <Data> Registry append(@NonNull Class<Data> cls, @NonNull Encoder<Data> encoder) {
        this.f38030b.append(cls, encoder);
        return this;
    }

    @NonNull
    public List<ImageHeaderParser> getImageHeaderParsers() {
        List<ImageHeaderParser> parsers = this.f38035g.getParsers();
        if (parsers.isEmpty()) {
            throw new NoImageHeaderParserException();
        }
        return parsers;
    }

    @Nullable
    public <Data, TResource, Transcode> LoadPath<Data, TResource, Transcode> getLoadPath(@NonNull Class<Data> cls, @NonNull Class<TResource> cls2, @NonNull Class<Transcode> cls3) {
        LoadPathCache loadPathCache = this.f38037i;
        LoadPath<Data, TResource, Transcode> loadPath = loadPathCache.get(cls, cls2, cls3);
        if (loadPathCache.isEmptyLoadPath(loadPath)) {
            return null;
        }
        if (loadPath == null) {
            ArrayList arrayList = new ArrayList();
            ResourceDecoderRegistry resourceDecoderRegistry = this.f38031c;
            for (Class cls4 : resourceDecoderRegistry.getResourceClasses(cls, cls2)) {
                TranscoderRegistry transcoderRegistry = this.f38034f;
                for (Class cls5 : transcoderRegistry.getTranscodeClasses(cls4, cls3)) {
                    arrayList.add(new DecodePath(cls, cls4, cls5, resourceDecoderRegistry.getDecoders(cls, cls4), transcoderRegistry.get(cls4, cls5), this.f38038j));
                    cls4 = cls4;
                    transcoderRegistry = transcoderRegistry;
                }
            }
            loadPath = arrayList.isEmpty() ? null : new LoadPath<>(cls, cls2, cls3, arrayList, this.f38038j);
            loadPathCache.put(cls, cls2, cls3, loadPath);
        }
        return loadPath;
    }

    @NonNull
    public <Model> List<ModelLoader<Model, ?>> getModelLoaders(@NonNull Model model) {
        return this.f38029a.getModelLoaders(model);
    }

    @NonNull
    public <Model, TResource, Transcode> List<Class<?>> getRegisteredResourceClasses(@NonNull Class<Model> cls, @NonNull Class<TResource> cls2, @NonNull Class<Transcode> cls3) {
        ModelToResourceClassCache modelToResourceClassCache = this.f38036h;
        List<Class<?>> list = modelToResourceClassCache.get(cls, cls2, cls3);
        List<Class<?>> list2 = list;
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            Iterator<Class<?>> it = this.f38029a.getDataClasses(cls).iterator();
            while (it.hasNext()) {
                for (Class cls4 : this.f38031c.getResourceClasses(it.next(), cls2)) {
                    if (!this.f38034f.getTranscodeClasses(cls4, cls3).isEmpty() && !arrayList.contains(cls4)) {
                        arrayList.add(cls4);
                    }
                }
            }
            modelToResourceClassCache.put(cls, cls2, cls3, Collections.unmodifiableList(arrayList));
            list2 = arrayList;
        }
        return list2;
    }

    @NonNull
    public <X> ResourceEncoder<X> getResultEncoder(@NonNull Resource<X> resource) throws NoResultEncoderAvailableException {
        ResourceEncoder<X> resourceEncoder = this.f38032d.get(resource.getResourceClass());
        if (resourceEncoder != null) {
            return resourceEncoder;
        }
        throw new NoResultEncoderAvailableException(resource.getResourceClass());
    }

    @NonNull
    public <X> DataRewinder<X> getRewinder(@NonNull X x4) {
        return this.f38033e.build(x4);
    }

    @NonNull
    public <X> Encoder<X> getSourceEncoder(@NonNull X x4) throws NoSourceEncoderAvailableException {
        Encoder<X> encoder = this.f38030b.getEncoder(x4.getClass());
        if (encoder != null) {
            return encoder;
        }
        throw new NoSourceEncoderAvailableException(x4.getClass());
    }

    public boolean isResourceEncoderAvailable(@NonNull Resource<?> resource) {
        return this.f38032d.get(resource.getResourceClass()) != null;
    }

    @NonNull
    public <Data> Registry prepend(@NonNull Class<Data> cls, @NonNull Encoder<Data> encoder) {
        this.f38030b.prepend(cls, encoder);
        return this;
    }

    @NonNull
    @Deprecated
    public <Data> Registry register(@NonNull Class<Data> cls, @NonNull Encoder<Data> encoder) {
        return append(cls, encoder);
    }

    @NonNull
    public <Model, Data> Registry replace(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull ModelLoaderFactory<? extends Model, ? extends Data> modelLoaderFactory) {
        this.f38029a.replace(cls, cls2, modelLoaderFactory);
        return this;
    }

    @NonNull
    public final Registry setResourceDecoderBucketPriorityList(@NonNull List<String> list) {
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.add("legacy_prepend_all");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        arrayList.add("legacy_append");
        this.f38031c.setBucketPriorityList(arrayList);
        return this;
    }

    @NonNull
    public <Data, TResource> Registry append(@NonNull Class<Data> cls, @NonNull Class<TResource> cls2, @NonNull ResourceDecoder<Data, TResource> resourceDecoder) {
        append("legacy_append", cls, cls2, resourceDecoder);
        return this;
    }

    @NonNull
    public <Data, TResource> Registry prepend(@NonNull Class<Data> cls, @NonNull Class<TResource> cls2, @NonNull ResourceDecoder<Data, TResource> resourceDecoder) {
        prepend("legacy_prepend_all", cls, cls2, resourceDecoder);
        return this;
    }

    @NonNull
    @Deprecated
    public <TResource> Registry register(@NonNull Class<TResource> cls, @NonNull ResourceEncoder<TResource> resourceEncoder) {
        return append((Class) cls, (ResourceEncoder) resourceEncoder);
    }

    @NonNull
    public <Data, TResource> Registry append(@NonNull String str, @NonNull Class<Data> cls, @NonNull Class<TResource> cls2, @NonNull ResourceDecoder<Data, TResource> resourceDecoder) {
        this.f38031c.append(str, resourceDecoder, cls, cls2);
        return this;
    }

    @NonNull
    public <Data, TResource> Registry prepend(@NonNull String str, @NonNull Class<Data> cls, @NonNull Class<TResource> cls2, @NonNull ResourceDecoder<Data, TResource> resourceDecoder) {
        this.f38031c.prepend(str, resourceDecoder, cls, cls2);
        return this;
    }

    @NonNull
    public Registry register(@NonNull DataRewinder.Factory<?> factory) {
        this.f38033e.register(factory);
        return this;
    }

    @NonNull
    public <TResource> Registry append(@NonNull Class<TResource> cls, @NonNull ResourceEncoder<TResource> resourceEncoder) {
        this.f38032d.append(cls, resourceEncoder);
        return this;
    }

    @NonNull
    public <TResource> Registry prepend(@NonNull Class<TResource> cls, @NonNull ResourceEncoder<TResource> resourceEncoder) {
        this.f38032d.prepend(cls, resourceEncoder);
        return this;
    }

    @NonNull
    public <TResource, Transcode> Registry register(@NonNull Class<TResource> cls, @NonNull Class<Transcode> cls2, @NonNull ResourceTranscoder<TResource, Transcode> resourceTranscoder) {
        this.f38034f.register(cls, cls2, resourceTranscoder);
        return this;
    }

    @NonNull
    public <Model, Data> Registry append(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull ModelLoaderFactory<Model, Data> modelLoaderFactory) {
        this.f38029a.append(cls, cls2, modelLoaderFactory);
        return this;
    }

    @NonNull
    public <Model, Data> Registry prepend(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull ModelLoaderFactory<Model, Data> modelLoaderFactory) {
        this.f38029a.prepend(cls, cls2, modelLoaderFactory);
        return this;
    }

    @NonNull
    public Registry register(@NonNull ImageHeaderParser imageHeaderParser) {
        this.f38035g.add(imageHeaderParser);
        return this;
    }
}
