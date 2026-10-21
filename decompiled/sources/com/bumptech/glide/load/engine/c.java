package com.bumptech.glide.load.engine;

import com.bumptech.glide.GlideContext;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.resource.UnitTransformation;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: DecodeHelper.java */
/* JADX INFO: loaded from: classes9.dex */
public final class c<Transcode> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f38265a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f38266b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public GlideContext f38267c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f38268d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f38269e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f38270f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Class<?> f38271g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public d.e f38272h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Options f38273i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Map<Class<?>, Transformation<?>> f38274j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Class<Transcode> f38275k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f38276l;
    public boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Key f38277n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Priority f38278o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public DiskCacheStrategy f38279p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f38280q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f38281r;

    public final ArrayList a() {
        boolean z10 = this.m;
        ArrayList arrayList = this.f38266b;
        if (!z10) {
            this.m = true;
            arrayList.clear();
            ArrayList arrayListB = b();
            int size = arrayListB.size();
            for (int i10 = 0; i10 < size; i10++) {
                ModelLoader.LoadData loadData = (ModelLoader.LoadData) arrayListB.get(i10);
                if (!arrayList.contains(loadData.sourceKey)) {
                    arrayList.add(loadData.sourceKey);
                }
                for (int i11 = 0; i11 < loadData.alternateKeys.size(); i11++) {
                    if (!arrayList.contains(loadData.alternateKeys.get(i11))) {
                        arrayList.add(loadData.alternateKeys.get(i11));
                    }
                }
            }
        }
        return arrayList;
    }

    public final ArrayList b() {
        boolean z10 = this.f38276l;
        ArrayList arrayList = this.f38265a;
        if (!z10) {
            this.f38276l = true;
            arrayList.clear();
            List modelLoaders = this.f38267c.getRegistry().getModelLoaders(this.f38268d);
            int size = modelLoaders.size();
            for (int i10 = 0; i10 < size; i10++) {
                ModelLoader.LoadData loadDataBuildLoadData = ((ModelLoader) modelLoaders.get(i10)).buildLoadData(this.f38268d, this.f38269e, this.f38270f, this.f38273i);
                if (loadDataBuildLoadData != null) {
                    arrayList.add(loadDataBuildLoadData);
                }
            }
        }
        return arrayList;
    }

    public final <Z> Transformation<Z> c(Class<Z> cls) {
        Transformation<Z> transformation = (Transformation) this.f38274j.get(cls);
        if (transformation == null) {
            for (Map.Entry<Class<?>, Transformation<?>> entry : this.f38274j.entrySet()) {
                if (entry.getKey().isAssignableFrom(cls)) {
                    transformation = (Transformation) entry.getValue();
                    break;
                }
            }
        }
        if (transformation != null) {
            return transformation;
        }
        if (!this.f38274j.isEmpty() || !this.f38280q) {
            return UnitTransformation.get();
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }
}
