package com.salesforce.marketingcloud.proximity;

import androidx.annotation.NonNull;
import com.salesforce.marketingcloud.InitializationStatus;
import com.salesforce.marketingcloud.g;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
class d extends e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f64857i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final JSONObject f64858j;

    public d(boolean z10, JSONObject jSONObject) {
        this.f64857i = z10;
        this.f64858j = jSONObject;
    }

    @Override // com.salesforce.marketingcloud.f
    public void a(@NonNull InitializationStatus.a aVar) {
        aVar.d(this.f64857i);
    }

    @Override // com.salesforce.marketingcloud.proximity.e
    public void b(@NonNull e.a aVar) {
        String str = e.f64863h;
        Object[] objArr = new Object[1];
        objArr[0] = aVar != null ? aVar.getClass().getSimpleName() : AbstractJsonLexerKt.NULL;
        g.d(str, "unregisterProximityEventListener(%s) call ignored because of unsupported device.", objArr);
    }

    @Override // com.salesforce.marketingcloud.proximity.e
    public void c() {
        g.d(e.f64863h, "stopMonitoringBeaconRegions() call ignored because of unsupported device.", new Object[0]);
    }

    @Override // com.salesforce.marketingcloud.d
    public JSONObject componentState() {
        return this.f64858j;
    }

    @Override // com.salesforce.marketingcloud.proximity.e
    public void a(@NonNull e.a aVar) {
        String str = e.f64863h;
        Object[] objArr = new Object[1];
        objArr[0] = aVar != null ? aVar.getClass().getSimpleName() : AbstractJsonLexerKt.NULL;
        g.d(str, "registerProximityEventListener(%s) call ignored because of unsupported device.", objArr);
    }

    @Override // com.salesforce.marketingcloud.proximity.e
    public void b(List<c> list) {
        g.d(e.f64863h, "unmonitorBeaconRegions call ignored because of unsupported device.", new Object[0]);
    }

    @Override // com.salesforce.marketingcloud.proximity.e
    public void a(List<c> list) {
        g.d(e.f64863h, "monitorBeaconRegions call ignored because of unsupported device.", new Object[0]);
    }
}
