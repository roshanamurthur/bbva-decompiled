package com.bumptech.glide.load.model.stream;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.model.GlideUrl;
import com.bumptech.glide.load.model.Headers;
import com.bumptech.glide.load.model.ModelCache;
import com.bumptech.glide.load.model.ModelLoader;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public abstract class BaseGlideUrlLoader<Model> implements ModelLoader<Model, InputStream> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ModelLoader<GlideUrl, InputStream> f38499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final ModelCache<Model, GlideUrl> f38500b;

    public BaseGlideUrlLoader(ModelLoader<GlideUrl, InputStream> modelLoader) {
        this(modelLoader, null);
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    @Nullable
    public ModelLoader.LoadData<InputStream> buildLoadData(@NonNull Model model, int i10, int i11, @NonNull Options options) {
        ModelCache<Model, GlideUrl> modelCache = this.f38500b;
        GlideUrl glideUrl = modelCache != null ? modelCache.get(model, i10, i11) : null;
        if (glideUrl == null) {
            String url = getUrl(model, i10, i11, options);
            if (TextUtils.isEmpty(url)) {
                return null;
            }
            GlideUrl glideUrl2 = new GlideUrl(url, getHeaders(model, i10, i11, options));
            if (modelCache != null) {
                modelCache.put(model, i10, i11, glideUrl2);
            }
            glideUrl = glideUrl2;
        }
        List<String> alternateUrls = getAlternateUrls(model, i10, i11, options);
        ModelLoader.LoadData<InputStream> loadDataBuildLoadData = this.f38499a.buildLoadData(glideUrl, i10, i11, options);
        if (loadDataBuildLoadData == null || alternateUrls.isEmpty()) {
            return loadDataBuildLoadData;
        }
        Key key = loadDataBuildLoadData.sourceKey;
        ArrayList arrayList = new ArrayList(alternateUrls.size());
        Iterator<String> it = alternateUrls.iterator();
        while (it.hasNext()) {
            arrayList.add(new GlideUrl(it.next()));
        }
        return new ModelLoader.LoadData<>(key, arrayList, loadDataBuildLoadData.fetcher);
    }

    public List<String> getAlternateUrls(Model model, int i10, int i11, Options options) {
        return Collections.emptyList();
    }

    @Nullable
    public Headers getHeaders(Model model, int i10, int i11, Options options) {
        return Headers.DEFAULT;
    }

    public abstract String getUrl(Model model, int i10, int i11, Options options);

    public BaseGlideUrlLoader(ModelLoader<GlideUrl, InputStream> modelLoader, @Nullable ModelCache<Model, GlideUrl> modelCache) {
        this.f38499a = modelLoader;
        this.f38500b = modelCache;
    }
}
