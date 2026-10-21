package net.ipsoft.amelia.sdk.internal.b;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;

/* JADX INFO: loaded from: classes12.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected String f84733a;

    public String a() {
        return this.f84733a;
    }

    public String toString() {
        return ad.d.f(new StringBuilder("{ audio: "), this.f84733a, " }");
    }

    public static k a(JsonReader jsonReader) throws IOException {
        k kVar = new k();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if (!"audio".equals(jsonReader.nextName()) || jsonReader.peek() == JsonToken.NULL) {
                jsonReader.skipValue();
            } else {
                kVar.a(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return kVar;
    }

    public void a(String str) {
        this.f84733a = str;
    }
}
