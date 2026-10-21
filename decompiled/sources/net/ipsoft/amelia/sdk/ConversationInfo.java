package net.ipsoft.amelia.sdk;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;

/* JADX INFO: loaded from: classes12.dex */
public class ConversationInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f84547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f84548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f84549c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double f84550d;

    public ConversationInfo() {
    }

    public ConversationInfo(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if ("conversationId".equals(strNextName) && jsonReader.peek() != JsonToken.NULL) {
                this.f84547a = jsonReader.nextString();
            } else if ("domainId".equals(strNextName) && jsonReader.peek() != JsonToken.NULL) {
                this.f84548b = jsonReader.nextString();
            } else if ("localeDisplayName".equals(strNextName) && jsonReader.peek() != JsonToken.NULL) {
                this.f84550d = jsonReader.nextDouble();
            } else if (!"sessionMode".equals(strNextName) || jsonReader.peek() == JsonToken.NULL) {
                jsonReader.skipValue();
            } else {
                this.f84549c = jsonReader.nextString();
            }
        }
        jsonReader.endObject();
    }

    public String getConversationId() {
        return this.f84547a;
    }

    public String getDomainId() {
        return this.f84548b;
    }

    public double getLastAccessed() {
        return this.f84550d;
    }

    public String getSessionMode() {
        return this.f84549c;
    }
}
