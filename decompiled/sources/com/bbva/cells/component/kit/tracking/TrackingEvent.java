package com.bbva.cells.component.kit.tracking;

import androidx.activity.a;
import java.util.HashMap;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes2.dex */
public class TrackingEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f26690b;

    public TrackingEvent(String str) {
        this.f26689a = str;
    }

    public String getId() {
        return this.f26689a;
    }

    public int getType() {
        return this.f26690b;
    }

    public Map<String, Object> toMap() {
        HashMap map = new HashMap();
        map.put("id", this.f26689a);
        map.put("type", Integer.valueOf(this.f26690b));
        return map;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("TrackingEvent{mId='");
        sb2.append(this.f26689a);
        sb2.append("', mType=");
        return a.d(sb2, this.f26690b, AbstractJsonLexerKt.END_OBJ);
    }

    public TrackingEvent(int i10, String str) {
        this.f26689a = str;
        this.f26690b = i10;
    }
}
