package net.ipsoft.amelia.sdk.internal.b;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.Reader;

/* JADX INFO: loaded from: classes12.dex */
public class e extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f84719a;

    @Override // net.ipsoft.amelia.sdk.internal.b.o
    public void a(Reader reader) {
        try {
            JsonReader jsonReader = new JsonReader(reader);
            jsonReader.beginObject();
            if (jsonReader.nextName().equals("success") && jsonReader.peek() != JsonToken.NULL) {
                this.f84719a = jsonReader.nextBoolean();
            }
            jsonReader.endObject();
        } catch (Exception unused) {
        }
    }

    public boolean b() {
        return this.f84719a;
    }

    @Override // net.ipsoft.amelia.sdk.internal.b.o
    public String toString() {
        return this.f84719a ? "Session is valid" : "Session is invalid";
    }
}
