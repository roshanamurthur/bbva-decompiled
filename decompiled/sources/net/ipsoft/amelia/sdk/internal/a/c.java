package net.ipsoft.amelia.sdk.internal.a;

import android.util.JsonWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<String, String> f84586a;

    public c(Map<String, String> map) {
        new HashMap();
        this.f84586a = map;
    }

    public Map<String, String> a() {
        return this.f84586a;
    }

    public void a(JsonWriter jsonWriter) throws IOException {
        jsonWriter.beginObject();
        for (Map.Entry<String, String> entry : this.f84586a.entrySet()) {
            jsonWriter.name(entry.getKey());
            jsonWriter.value(entry.getValue());
        }
        jsonWriter.endObject();
    }
}
