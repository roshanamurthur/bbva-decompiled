package com.salesforce.marketingcloud.events;

import bk.q;
import com.salesforce.marketingcloud.storage.db.k;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0014\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004H\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\u000bR\u001a\u0010\u0011\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/salesforce/marketingcloud/events/b;", "Lcom/salesforce/marketingcloud/events/Event;", "", "name", "", "", k.a.f65041h, "a", "Ljava/lang/String;", "b", "Ljava/util/Map;", "()Ljava/util/Map;", "Lcom/salesforce/marketingcloud/sfmcsdk/components/events/Event$Producer;", "c", "Lcom/salesforce/marketingcloud/sfmcsdk/components/events/Event$Producer;", "getProducer", "()Lcom/salesforce/marketingcloud/sfmcsdk/components/events/Event$Producer;", "producer", "<init>", "(Ljava/lang/String;Ljava/util/Map;Lcom/salesforce/marketingcloud/sfmcsdk/components/events/Event$Producer;)V", "sdk_release"}, k = 1, mv = {1, 8, 0})
public final class b implements Event {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    private final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    private final Map<String, Object> attributes;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    private final com.salesforce.marketingcloud.sfmcsdk.components.events.Event.Producer producer;

    public b(@NotNull String name, @NotNull Map<String, ? extends Object> attributes, @NotNull com.salesforce.marketingcloud.sfmcsdk.components.events.Event.Producer producer) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Intrinsics.checkNotNullParameter(producer, "producer");
        this.name = name;
        this.attributes = attributes;
        this.producer = producer;
    }

    @NotNull
    public final Map<String, Object> a() {
        return this.attributes;
    }

    @Override // com.salesforce.marketingcloud.events.Event
    @NotNull
    public Map<String, Object> attributes() {
        return this.attributes;
    }

    @Override // com.salesforce.marketingcloud.events.Event
    @NotNull
    public com.salesforce.marketingcloud.sfmcsdk.components.events.Event.Producer getProducer() {
        return this.producer;
    }

    @Override // com.salesforce.marketingcloud.events.Event
    @NotNull
    /* JADX INFO: renamed from: name, reason: from getter */
    public String getName() {
        return this.name;
    }

    @Override // com.salesforce.marketingcloud.events.Event
    public final /* synthetic */ void track() {
        i.b(this);
    }

    public /* synthetic */ b(String str, Map map, com.salesforce.marketingcloud.sfmcsdk.components.events.Event.Producer producer, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? q.emptyMap() : map, (i10 & 4) != 0 ? com.salesforce.marketingcloud.sfmcsdk.components.events.Event.Producer.PUSH : producer);
    }
}
