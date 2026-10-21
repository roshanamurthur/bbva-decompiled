package net.ipsoft.amelia.sdk.internal.b;

import android.util.JsonReader;
import android.util.JsonToken;
import android.util.JsonWriter;
import com.bbva.zoomauth.facialauth.constant.AuthConstants;
import java.io.IOException;

/* JADX INFO: loaded from: classes12.dex */
public class ag {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected String f84697a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected String f84698b = null;

    public String a() {
        return this.f84697a;
    }

    public String b() {
        return this.f84698b;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("{ sessionId: ");
        sb2.append(this.f84697a);
        sb2.append(", conversationId: ");
        return ad.d.f(sb2, this.f84698b, " }");
    }

    public static ag a(JsonReader jsonReader) throws IOException {
        ag agVar = new ag();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (AuthConstants.SESSION_ID.equals(strNextName) && jsonReader.peek() != JsonToken.NULL) {
                agVar.a(jsonReader.nextString());
            } else if (!"conversationId".equals(strNextName) || jsonReader.peek() == JsonToken.NULL) {
                jsonReader.skipValue();
            } else {
                agVar.b(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return agVar;
    }

    public void b(String str) {
        this.f84698b = str;
    }

    public void a(JsonWriter jsonWriter) throws IOException {
        jsonWriter.beginObject();
        jsonWriter.name(AuthConstants.SESSION_ID);
        jsonWriter.value(this.f84697a);
        jsonWriter.name("conversationId");
        jsonWriter.value(this.f84698b);
        jsonWriter.endObject();
    }

    public void a(String str) {
        this.f84697a = str;
    }
}
