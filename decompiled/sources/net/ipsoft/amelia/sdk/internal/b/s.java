package net.ipsoft.amelia.sdk.internal.b;

import android.util.JsonReader;
import android.util.JsonToken;
import android.util.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import net.ipsoft.amelia.sdk.BaseDomain;
import net.ipsoft.amelia.sdk.ISessionInfo;

/* JADX INFO: loaded from: classes12.dex */
public class s implements ISessionInfo {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected boolean f84769c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected boolean f84770d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected net.ipsoft.amelia.sdk.internal.common.d f84772f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected String f84767a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected String f84768b = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected ArrayList<BaseDomain> f84771e = new ArrayList<>();

    public String a() {
        return this.f84767a;
    }

    @Override // net.ipsoft.amelia.sdk.ISessionInfo
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public net.ipsoft.amelia.sdk.internal.common.d getUser() {
        return this.f84772f;
    }

    @Override // net.ipsoft.amelia.sdk.ISessionInfo
    public String getSESSION() {
        return this.f84768b;
    }

    @Override // net.ipsoft.amelia.sdk.ISessionInfo
    public boolean isAnonymousAllowed() {
        return this.f84770d;
    }

    @Override // net.ipsoft.amelia.sdk.ISessionInfo
    public boolean isLoggedIn() {
        return this.f84769c;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("{ csrfToken: ");
        sb2.append(this.f84767a);
        sb2.append(", SESSION: ");
        return ad.d.f(sb2, this.f84768b, " }");
    }

    public static s a(JsonReader jsonReader) throws IOException {
        s sVar = new s();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if ("csrfToken".equals(strNextName) && jsonReader.peek() != JsonToken.NULL) {
                sVar.a(jsonReader.nextString());
            } else if ("SESSION".equals(strNextName) && jsonReader.peek() != JsonToken.NULL) {
                sVar.b(jsonReader.nextString());
            } else if ("loggedIn".equals(strNextName) && jsonReader.peek() != JsonToken.NULL) {
                sVar.a(jsonReader.nextBoolean());
            } else if ("user".equals(strNextName) && jsonReader.peek() != JsonToken.NULL) {
                sVar.a(new net.ipsoft.amelia.sdk.internal.common.d(jsonReader));
            } else if (!"appConfig".equals(strNextName) || jsonReader.peek() == JsonToken.NULL) {
                jsonReader.skipValue();
            } else {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName2 = jsonReader.nextName();
                    if ("allowAnonymous".equals(strNextName2) && jsonReader.peek() != JsonToken.NULL) {
                        sVar.f84770d = jsonReader.nextBoolean();
                    } else if (!"allDomains".equals(strNextName2) || jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.skipValue();
                    } else {
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            sVar.f84771e.add(new net.ipsoft.amelia.sdk.internal.common.g(jsonReader));
                        }
                        jsonReader.endArray();
                    }
                }
                jsonReader.endObject();
            }
        }
        jsonReader.endObject();
        return sVar;
    }

    public void b(String str) {
        this.f84768b = str;
    }

    public void a(JsonWriter jsonWriter) throws IOException {
        jsonWriter.beginObject();
        if (this.f84767a != null) {
            jsonWriter.name("csrfToken");
            jsonWriter.value(this.f84767a);
        }
        if (this.f84768b != null) {
            jsonWriter.name("SESSION");
            jsonWriter.value(this.f84768b);
        }
        jsonWriter.endObject();
    }

    public void b(boolean z10) {
        this.f84770d = z10;
    }

    public void a(String str) {
        this.f84767a = str;
    }

    public void a(net.ipsoft.amelia.sdk.internal.common.d dVar) {
        this.f84772f = dVar;
    }

    public void a(boolean z10) {
        this.f84769c = z10;
    }
}
