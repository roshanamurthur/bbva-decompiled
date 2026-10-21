package com.bbva.semaas;

import androidx.exifinterface.media.ExifInterface;
import com.bbva.component.dm.analytics.constants.AnalyticsConstants;
import com.bbva.semaas.datasource.DataSource;
import com.bbva.semaas.datasource.RequestResult;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.jakewharton.rxrelay3.PublishRelay;
import com.jakewharton.rxrelay3.Relay;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ReactiveRepository.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B5\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0002\u0010\nJ\u0013\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00028\u0000¢\u0006\u0002\u0010\u0018J\"\u0010\u0019\u001a\u00020\u00132\u0018\u0010\u001a\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000f0\u001c0\u001bH\u0002J\u0006\u0010\u001d\u001a\u00020\u0016J\u0006\u0010\u001e\u001a\u00020\u0016J\u001c\u0010\u001f\u001a\u00020\u00162\u0012\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000f0\u001cH\u0002J\u001c\u0010!\u001a\u00020\u00162\u0012\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000f0\u001cH\u0002R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R-\u0010\r\u001a!\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00028\u0000 \u0010*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000f0\u000f0\u000e¢\u0006\u0002\b\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R!\u0010\u0012\u001a\u0015\u0012\f\u0012\n \u0010*\u0004\u0018\u00010\u00130\u00130\u000e¢\u0006\u0002\b\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R-\u0010\u0014\u001a!\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00028\u0000 \u0010*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000f0\u000f0\u000e¢\u0006\u0002\b\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/bbva/semaas/ReactiveRepository;", ExifInterface.GPS_DIRECTION_TRUE, "", "localCache", "Lcom/bbva/semaas/FileCache;", "timeSpan", "", "count", "dataSource", "Lcom/bbva/semaas/datasource/DataSource;", "(Lcom/bbva/semaas/FileCache;IILcom/bbva/semaas/datasource/DataSource;)V", "disposables", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "mainSubject", "Lcom/jakewharton/rxrelay3/Relay;", "Lcom/bbva/semaas/CacheEntry;", "kotlin.jvm.PlatformType", "Lio/reactivex/rxjava3/annotations/NonNull;", "retrySignal", "", "retrySubject", "add", "", AnalyticsConstants.Key.ITEM, "(Ljava/lang/Object;)V", "configureBuffer", "observable", "Lio/reactivex/rxjava3/core/Observable;", "", "flush", "loadFromCache", "queuedToRetry", FirebaseAnalytics.Param.ITEMS, "save", "semaas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nReactiveRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReactiveRepository.kt\ncom/bbva/semaas/ReactiveRepository\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,66:1\n125#2:67\n152#2,3:68\n1549#3:71\n1620#3,3:72\n1855#3,2:76\n1#4:75\n*S KotlinDebug\n*F\n+ 1 ReactiveRepository.kt\ncom/bbva/semaas/ReactiveRepository\n*L\n36#1:67\n36#1:68,3\n44#1:71\n44#1:72,3\n55#1:76,2\n*E\n"})
public final class ReactiveRepository<T> {
    private final int count;

    @NotNull
    private final DataSource<T> dataSource;

    @NotNull
    private final CompositeDisposable disposables;

    @NotNull
    private final FileCache<T> localCache;

    @NotNull
    private final Relay<CacheEntry<T>> mainSubject;

    @NotNull
    private final Relay<Boolean> retrySignal;

    @NotNull
    private final Relay<CacheEntry<T>> retrySubject;

    public ReactiveRepository(@NotNull FileCache<T> localCache, int i10, int i11, @NotNull DataSource<T> dataSource) {
        Intrinsics.checkNotNullParameter(localCache, "localCache");
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        this.localCache = localCache;
        this.count = i11;
        this.dataSource = dataSource;
        Relay<T> serialized = PublishRelay.create().toSerialized();
        Intrinsics.checkNotNullExpressionValue(serialized, "create<CacheEntry<T>>().toSerialized()");
        this.mainSubject = serialized;
        Relay<T> serialized2 = PublishRelay.create().toSerialized();
        Intrinsics.checkNotNullExpressionValue(serialized2, "create<CacheEntry<T>>().toSerialized()");
        this.retrySubject = serialized2;
        Relay<T> serialized3 = PublishRelay.create().toSerialized();
        Intrinsics.checkNotNullExpressionValue(serialized3, "create<Boolean>().toSerialized()");
        this.retrySignal = serialized3;
        this.disposables = new CompositeDisposable();
        Observable<List<CacheEntry<T>>> observableBuffer = serialized.buffer(i10, TimeUnit.SECONDS, i11);
        Intrinsics.checkNotNullExpressionValue(observableBuffer, "mainSubject.buffer(timeS… TimeUnit.SECONDS, count)");
        configureBuffer(observableBuffer);
        Observable<List<CacheEntry<T>>> observableBuffer2 = serialized2.buffer(serialized3);
        Intrinsics.checkNotNullExpressionValue(observableBuffer2, "retrySubject.buffer(retrySignal)");
        configureBuffer(observableBuffer2);
    }

    private final boolean configureBuffer(Observable<List<CacheEntry<T>>> observable) {
        Disposable disposableSubscribe = observable.filter(new Predicate() { // from class: com.bbva.semaas.ReactiveRepository.configureBuffer.1
            @Override // io.reactivex.rxjava3.functions.Predicate
            public final boolean test(@NotNull List<CacheEntry<T>> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return !it.isEmpty();
            }
        }).flatMap(new Function(this) { // from class: com.bbva.semaas.ReactiveRepository.configureBuffer.2
            final /* synthetic */ ReactiveRepository<T> this$0;

            {
                this.this$0 = this;
            }

            @Override // io.reactivex.rxjava3.functions.Function
            @NotNull
            public final ObservableSource<? extends List<CacheEntry<T>>> apply(@NotNull List<CacheEntry<T>> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Observable.fromIterable(CollectionsKt___CollectionsKt.chunked(it, ((ReactiveRepository) this.this$0).count));
            }
        }).observeOn(Schedulers.io()).subscribe(new Consumer(this) { // from class: com.bbva.semaas.ReactiveRepository.configureBuffer.3
            final /* synthetic */ ReactiveRepository<T> $tmp0;

            {
                this.$tmp0 = this;
            }

            @Override // io.reactivex.rxjava3.functions.Consumer
            public final void accept(@NotNull List<CacheEntry<T>> p4) {
                Intrinsics.checkNotNullParameter(p4, "p0");
                this.$tmp0.save(p4);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "private fun configureBuf…      .addTo(disposables)");
        return ReactiveRepositoryKt.addTo(disposableSubscribe, this.disposables);
    }

    private final void queuedToRetry(List<CacheEntry<T>> items) {
        this.localCache.addEntries(items);
        Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            this.retrySubject.accept((CacheEntry) it.next());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void save(List<CacheEntry<T>> items) {
        DataSource<T> dataSource = this.dataSource;
        List<CacheEntry<T>> list = items;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((CacheEntry) it.next()).getValue());
        }
        RequestResult requestResultExecute = dataSource.execute(arrayList);
        if (Intrinsics.areEqual(requestResultExecute, RequestResult.Success.INSTANCE)) {
            this.localCache.removeEntry(items);
            flush();
        } else if (Intrinsics.areEqual(requestResultExecute, RequestResult.Error.INSTANCE)) {
            queuedToRetry(items);
        }
    }

    public final void add(T item) {
        Relay<CacheEntry<T>> relay = this.mainSubject;
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "randomUUID().toString()");
        relay.accept(new CacheEntry<>(string, item));
    }

    public final void flush() {
        this.retrySignal.accept(Boolean.TRUE);
    }

    public final void loadFromCache() {
        this.localCache.load();
        Map<String, CacheEntry<T>> values = this.localCache.getValues();
        ArrayList arrayList = new ArrayList(values.size());
        Iterator<Map.Entry<String, CacheEntry<T>>> it = values.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getValue());
        }
        queuedToRetry(arrayList);
    }

    public /* synthetic */ ReactiveRepository(FileCache fileCache, int i10, int i11, DataSource dataSource, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(fileCache, (i12 & 2) != 0 ? 10 : i10, (i12 & 4) != 0 ? 100 : i11, dataSource);
    }
}
