package com.salesforce.marketingcloud.events;

import com.salesforce.marketingcloud.MCKeep;
import com.salesforce.marketingcloud.storage.db.k;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@MCKeep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0014\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007H&J\b\u0010\t\u001a\u00020\bH&J\b\u0010\n\u001a\u00020\u000bH\u0016R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lcom/salesforce/marketingcloud/events/Event;", "", "producer", "Lcom/salesforce/marketingcloud/sfmcsdk/components/events/Event$Producer;", "getProducer", "()Lcom/salesforce/marketingcloud/sfmcsdk/components/events/Event$Producer;", k.a.f65041h, "", "", "name", "track", "", "sdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface Event {
    @NotNull
    Map<String, Object> attributes();

    @NotNull
    com.salesforce.marketingcloud.sfmcsdk.components.events.Event.Producer getProducer();

    @NotNull
    String name();

    void track();
}
