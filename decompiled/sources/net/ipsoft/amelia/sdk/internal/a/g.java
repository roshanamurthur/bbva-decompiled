package net.ipsoft.amelia.sdk.internal.a;

import android.util.JsonReader;
import android.util.JsonToken;
import android.util.JsonWriter;
import java.io.IOException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected String f84637a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected String f84638b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected String f84639c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected String f84640d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected String f84641e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected String f84642f = null;

    public g(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if ("prefixSingle".equals(strNextName) && jsonReader.peek() != JsonToken.NULL) {
                d(jsonReader.nextString());
            } else if ("prefixMultiple".equals(strNextName) && jsonReader.peek() != JsonToken.NULL) {
                e(jsonReader.nextString());
            } else if ("conjunction".equals(strNextName) && jsonReader.peek() != JsonToken.NULL) {
                f(jsonReader.nextString());
            } else if ("staticUtterance".equals(strNextName) && jsonReader.peek() != JsonToken.NULL) {
                c(jsonReader.nextString());
            } else if ("suffixSingle".equals(strNextName) && jsonReader.peek() != JsonToken.NULL) {
                a(jsonReader.nextString());
            } else if (!"suffixMultiple".equals(strNextName) || jsonReader.peek() == JsonToken.NULL) {
                jsonReader.skipValue();
            } else {
                b(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
    }

    public String a() {
        return this.f84639c;
    }

    public String b() {
        return this.f84640d;
    }

    public String c() {
        return this.f84641e;
    }

    public String d() {
        return this.f84637a;
    }

    public String e() {
        return this.f84638b;
    }

    public String f() {
        return this.f84642f;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("{ prefixSingle: ");
        sb2.append(this.f84637a);
        sb2.append(", prefixMultiple: ");
        sb2.append(this.f84638b);
        sb2.append(", conjunction: ");
        return ad.d.f(sb2, this.f84642f, " }");
    }

    public g(JSONObject jSONObject) {
        if (jSONObject.has("prefixSingle") && !jSONObject.isNull("prefixSingle")) {
            d(jSONObject.getString("prefixSingle"));
        }
        if (jSONObject.has("prefixMultiple") && !jSONObject.isNull("prefixMultiple")) {
            e(jSONObject.getString("prefixMultiple"));
        }
        if (jSONObject.has("conjunction") && !jSONObject.isNull("conjunction")) {
            f(jSONObject.getString("conjunction"));
        }
        if (jSONObject.has("suffixSingle") && !jSONObject.isNull("suffixSingle")) {
            f(jSONObject.getString("suffixSingle"));
        }
        if (!jSONObject.has("staticUtterance") || jSONObject.isNull("staticUtterance")) {
            return;
        }
        f(jSONObject.getString("staticUtterance"));
    }

    public void a(JsonWriter jsonWriter) throws IOException {
        jsonWriter.beginObject();
        if (this.f84637a != null) {
            jsonWriter.name("prefixSingle");
            jsonWriter.value(this.f84637a);
        }
        if (this.f84638b != null) {
            jsonWriter.name("prefixMultiple");
            jsonWriter.value(this.f84638b);
        }
        if (this.f84642f != null) {
            jsonWriter.name("conjunction");
            jsonWriter.value(this.f84642f);
        }
        if (this.f84641e != null) {
            jsonWriter.name("staticUtterance");
            jsonWriter.value(this.f84641e);
        }
        if (this.f84639c != null) {
            jsonWriter.name("suffixSingle");
            jsonWriter.value(this.f84639c);
        }
        if (this.f84640d != null) {
            jsonWriter.name("suffixMultiple");
            jsonWriter.value(this.f84640d);
        }
        jsonWriter.endObject();
    }

    public void b(String str) {
        this.f84640d = str;
    }

    public void c(String str) {
        this.f84641e = str;
    }

    public void d(String str) {
        this.f84637a = str;
    }

    public void e(String str) {
        this.f84638b = str;
    }

    public void f(String str) {
        this.f84642f = str;
    }

    public void a(String str) {
        this.f84639c = str;
    }
}
