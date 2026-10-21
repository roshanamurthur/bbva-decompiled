package net.ipsoft.amelia.sdk.internal.b;

import android.util.JsonReader;
import android.util.JsonToken;
import com.bbva.zoomauth.facialauth.constant.AuthConstants;
import java.io.Reader;

/* JADX INFO: loaded from: classes12.dex */
public class u extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f84776a;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f84777i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f84778j;

    @Override // net.ipsoft.amelia.sdk.internal.b.o
    public void a(Reader reader) {
        JsonReader jsonReader = new JsonReader(reader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                if (AuthConstants.SESSION_ID.equals(strNextName) && jsonReader.peek() != JsonToken.NULL) {
                    this.f84776a = jsonReader.nextString();
                } else if (!"domainId".equals(strNextName) || jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                } else {
                    this.f84778j = jsonReader.nextString();
                }
            }
            jsonReader.endObject();
        } catch (Exception unused) {
        }
    }

    public String b() {
        return this.f84776a;
    }

    public String d() {
        return this.f84777i;
    }

    public String e() {
        return this.f84778j;
    }

    @Override // net.ipsoft.amelia.sdk.internal.b.o
    public String toString() {
        return "";
    }

    public void d(String str) {
        this.f84777i = str;
    }
}
