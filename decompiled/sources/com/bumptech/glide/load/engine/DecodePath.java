package com.bumptech.glide.load.engine;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.core.util.Pools;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.EncodeStrategy;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.ResourceEncoder;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.data.DataRewinder;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.resource.transcode.ResourceTranscoder;
import com.bumptech.glide.util.Preconditions;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import tc.i;
import tc.j;

/* JADX INFO: loaded from: classes9.dex */
public class DecodePath<DataType, ResourceType, Transcode> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class<DataType> f38173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<? extends ResourceDecoder<DataType, ResourceType>> f38174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ResourceTranscoder<ResourceType, Transcode> f38175c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Pools.Pool<List<Throwable>> f38176d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f38177e;

    public interface a<ResourceType> {
    }

    public DecodePath(Class<DataType> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<? extends ResourceDecoder<DataType, ResourceType>> list, ResourceTranscoder<ResourceType, Transcode> resourceTranscoder, Pools.Pool<List<Throwable>> pool) {
        this.f38173a = cls;
        this.f38174b = list;
        this.f38175c = resourceTranscoder;
        this.f38176d = pool;
        this.f38177e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    @NonNull
    public final Resource<ResourceType> a(DataRewinder<DataType> dataRewinder, int i10, int i11, @NonNull Options options, List<Throwable> list) throws GlideException {
        List<? extends ResourceDecoder<DataType, ResourceType>> list2 = this.f38174b;
        int size = list2.size();
        Resource<ResourceType> resourceDecode = null;
        for (int i12 = 0; i12 < size; i12++) {
            ResourceDecoder<DataType, ResourceType> resourceDecoder = list2.get(i12);
            try {
                if (resourceDecoder.handles(dataRewinder.rewindAndGet(), options)) {
                    resourceDecode = resourceDecoder.decode(dataRewinder.rewindAndGet(), i10, i11, options);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e5) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Objects.toString(resourceDecoder);
                }
                list.add(e5);
            }
            if (resourceDecode != null) {
                break;
            }
        }
        if (resourceDecode != null) {
            return resourceDecode;
        }
        throw new GlideException(this.f38177e, new ArrayList(list));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public Resource<Transcode> decode(DataRewinder<DataType> dataRewinder, int i10, int i11, @NonNull Options options, a<ResourceType> aVar) throws GlideException {
        Resource resourceTransform;
        Transformation transformation;
        EncodeStrategy encodeStrategy;
        boolean z10;
        Object obj;
        Key cVar;
        Pools.Pool<List<Throwable>> pool = this.f38176d;
        List<Throwable> list = (List) Preconditions.checkNotNull(pool.acquire());
        try {
            Resource<ResourceType> resourceA = a(dataRewinder, i10, i11, options, list);
            pool.release(list);
            d.c cVar2 = (d.c) aVar;
            d dVar = d.this;
            dVar.getClass();
            Class<?> cls = resourceA.get().getClass();
            DataSource dataSource = DataSource.RESOURCE_DISK_CACHE;
            DataSource dataSource2 = cVar2.f38330a;
            c<R> cVar3 = dVar.f38318p0;
            ResourceEncoder resourceEncoder = null;
            if (dataSource2 != dataSource) {
                Transformation transformationC = cVar3.c((Class<Z>) cls);
                transformation = transformationC;
                resourceTransform = transformationC.transform(dVar.f38324w0, resourceA, dVar.F0, dVar.G0);
            } else {
                resourceTransform = resourceA;
                transformation = null;
            }
            if (!resourceA.equals(resourceTransform)) {
                resourceA.recycle();
            }
            if (cVar3.f38267c.getRegistry().isResourceEncoderAvailable(resourceTransform)) {
                ResourceEncoder resultEncoder = cVar3.f38267c.getRegistry().getResultEncoder(resourceTransform);
                encodeStrategy = resultEncoder.getEncodeStrategy(dVar.I0);
                resourceEncoder = resultEncoder;
            } else {
                encodeStrategy = EncodeStrategy.NONE;
            }
            Key key = dVar.R0;
            ArrayList arrayListB = cVar3.b();
            int size = arrayListB.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size) {
                    z10 = false;
                    break;
                }
                if (((ModelLoader.LoadData) arrayListB.get(i12)).sourceKey.equals(key)) {
                    z10 = true;
                    break;
                }
                i12++;
            }
            if (!dVar.H0.isResourceCacheable(!z10, dataSource2, encodeStrategy)) {
                obj = resourceTransform;
            } else {
                if (resourceEncoder == null) {
                    throw new Registry.NoResultEncoderAvailableException(resourceTransform.get().getClass());
                }
                int i13 = d.a.f38329c[encodeStrategy.ordinal()];
                if (i13 == 1) {
                    cVar = new tc.c(dVar.R0, dVar.f38325x0);
                } else {
                    if (i13 != 2) {
                        throw new IllegalArgumentException("Unknown strategy: " + encodeStrategy);
                    }
                    cVar = new j(cVar3.f38267c.getArrayPool(), dVar.R0, dVar.f38325x0, dVar.F0, dVar.G0, transformation, cls, dVar.I0);
                }
                i<Z> iVar = (i) Preconditions.checkNotNull(i.f93519t0.acquire());
                iVar.f93523s0 = 0;
                iVar.f93522r0 = 1;
                iVar.f93521q0 = resourceTransform;
                d.C0172d<?> c0172d = dVar.f38323u0;
                c0172d.f38332a = cVar;
                c0172d.f38333b = resourceEncoder;
                c0172d.f38334c = iVar;
                obj = iVar;
            }
            return this.f38175c.transcode(obj, options);
        } catch (Throwable th2) {
            pool.release(list);
            throw th2;
        }
    }

    public String toString() {
        return "DecodePath{ dataClass=" + this.f38173a + ", decoders=" + this.f38174b + ", transcoder=" + this.f38175c + AbstractJsonLexerKt.END_OBJ;
    }
}
