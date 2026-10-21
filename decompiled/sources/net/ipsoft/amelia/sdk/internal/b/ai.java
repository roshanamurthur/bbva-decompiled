package net.ipsoft.amelia.sdk.internal.b;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.Reader;
import java.util.ArrayList;
import net.ipsoft.amelia.sdk.ConversationInfo;

/* JADX INFO: loaded from: classes12.dex */
public class ai extends o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList<ConversationInfo> f84699b = new ArrayList<>();

    @Override // net.ipsoft.amelia.sdk.internal.b.o
    public void a(Reader reader) {
        try {
            JsonReader jsonReader = new JsonReader(reader);
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (!"content".equals(jsonReader.nextName()) || jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                } else {
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        this.f84699b.add(new ConversationInfo(jsonReader));
                    }
                    jsonReader.endArray();
                }
            }
            jsonReader.endObject();
        } catch (Exception unused) {
        }
    }

    @Override // net.ipsoft.amelia.sdk.internal.b.o
    public String toString() {
        return "{}";
    }
}
