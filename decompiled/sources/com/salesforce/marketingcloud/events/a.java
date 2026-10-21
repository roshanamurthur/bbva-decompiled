package com.salesforce.marketingcloud.events;

import bk.q;
import com.salesforce.marketingcloud.storage.db.k;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0014\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¨\u0006\t"}, d2 = {"Lcom/salesforce/marketingcloud/events/a;", "Lcom/salesforce/marketingcloud/events/Event;", "", "name", "", "", k.a.f65041h, "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 8, 0})
public final class a implements Event {
    @Override // com.salesforce.marketingcloud.events.Event
    @NotNull
    public Map<String, Object> attributes() {
        return q.emptyMap();
    }

    @Override // com.salesforce.marketingcloud.events.Event
    public final /* synthetic */ com.salesforce.marketingcloud.sfmcsdk.components.events.Event.Producer getProducer() {
        return i.a(this);
    }

    @Override // com.salesforce.marketingcloud.events.Event
    @NotNull
    public String name() {
        return "$appOpen";
    }

    @Override // com.salesforce.marketingcloud.events.Event
    public final /* synthetic */ void track() {
        i.b(this);
    }
}
