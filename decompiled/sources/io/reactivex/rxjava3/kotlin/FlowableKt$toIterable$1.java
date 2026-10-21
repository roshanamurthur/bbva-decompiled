package io.reactivex.rxjava3.kotlin;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: flowable.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u001c\n\u0002\u0010(\n\u0002\b\u0002\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096\u0002¨\u0006\u0004"}, d2 = {"io/reactivex/rxjava3/kotlin/FlowableKt$toIterable$1", "", "", "iterator", "rxkotlin"}, k = 1, mv = {1, 4, 0})
public final class FlowableKt$toIterable$1 implements Iterable<Object>, KMappedMarker {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Iterator f78108p0;

    public FlowableKt$toIterable$1(Iterator<Object> it) {
        this.f78108p0 = it;
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<Object> iterator() {
        return this.f78108p0;
    }
}
