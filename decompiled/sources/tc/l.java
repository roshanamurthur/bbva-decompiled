package tc;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.engine.DataFetcherGenerator;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.model.ModelLoader;

/* JADX INFO: compiled from: SourceGenerator.java */
/* JADX INFO: loaded from: classes9.dex */
public final class l implements DataFetcher.DataCallback<Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ ModelLoader.LoadData f93535p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ com.bumptech.glide.load.engine.h f93536q0;

    public l(com.bumptech.glide.load.engine.h hVar, ModelLoader.LoadData loadData) {
        this.f93536q0 = hVar;
        this.f93535p0 = loadData;
    }

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
    @Override // com.bumptech.glide.load.data.DataFetcher.DataCallback
    public final void onDataReady(@Nullable Object obj) {
        com.bumptech.glide.load.engine.h hVar = this.f93536q0;
        ModelLoader.LoadData<?> loadData = this.f93535p0;
        ModelLoader.LoadData<?> loadData2 = hVar.f38391u0;
        if (loadData2 == null || loadData2 != loadData) {
            return;
        }
        com.bumptech.glide.load.engine.h hVar2 = this.f93536q0;
        ModelLoader.LoadData loadData3 = this.f93535p0;
        DiskCacheStrategy diskCacheStrategy = hVar2.f38386p0.f38279p;
        if (obj != null && diskCacheStrategy.isDataCacheable(loadData3.fetcher.getDataSource())) {
            hVar2.f38390t0 = obj;
            hVar2.f38387q0.reschedule();
        } else {
            DataFetcherGenerator.FetcherReadyCallback fetcherReadyCallback = hVar2.f38387q0;
            Key key = loadData3.sourceKey;
            DataFetcher<Data> dataFetcher = loadData3.fetcher;
            fetcherReadyCallback.onDataFetcherReady(key, obj, dataFetcher, dataFetcher.getDataSource(), hVar2.v0);
        }
    }

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
    @Override // com.bumptech.glide.load.data.DataFetcher.DataCallback
    public final void onLoadFailed(@NonNull Exception exc) {
        com.bumptech.glide.load.engine.h hVar = this.f93536q0;
        ModelLoader.LoadData<?> loadData = this.f93535p0;
        ModelLoader.LoadData<?> loadData2 = hVar.f38391u0;
        if (loadData2 == null || loadData2 != loadData) {
            return;
        }
        com.bumptech.glide.load.engine.h hVar2 = this.f93536q0;
        ModelLoader.LoadData loadData3 = this.f93535p0;
        DataFetcherGenerator.FetcherReadyCallback fetcherReadyCallback = hVar2.f38387q0;
        Key key = hVar2.v0;
        DataFetcher<Data> dataFetcher = loadData3.fetcher;
        fetcherReadyCallback.onDataFetcherFailed(key, exc, dataFetcher, dataFetcher.getDataSource());
    }
}
