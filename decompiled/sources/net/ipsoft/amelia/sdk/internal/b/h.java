package net.ipsoft.amelia.sdk.internal.b;

import android.util.JsonReader;
import android.util.JsonToken;
import android.util.JsonWriter;
import java.io.IOException;

/* JADX INFO: loaded from: classes12.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected int f84721a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected String f84722b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected String f84723c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected boolean f84724d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected String f84725e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected int f84726f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected int f84727g = 0;

    public int a() {
        return this.f84721a;
    }

    public String b() {
        return this.f84722b;
    }

    public String c() {
        return this.f84723c;
    }

    public boolean d() {
        return this.f84724d;
    }

    public String e() {
        return this.f84725e;
    }

    public int f() {
        return this.f84726f;
    }

    public int g() {
        return this.f84727g;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("{ id: ");
        sb2.append(this.f84721a);
        sb2.append(", name: ");
        sb2.append(this.f84722b);
        sb2.append(", path: ");
        sb2.append(this.f84723c);
        sb2.append(", isImage: ");
        sb2.append(this.f84724d);
        sb2.append(", description: ");
        sb2.append(this.f84725e);
        sb2.append(", domainId: ");
        sb2.append(this.f84726f);
        sb2.append(", parent_id: ");
        return androidx.appcompat.widget.a.c(sb2, this.f84727g, " }");
    }

    public static h a(JsonReader jsonReader) throws IOException {
        h hVar = new h();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if ("id".equals(strNextName) && jsonReader.peek() != JsonToken.NULL) {
                hVar.a(jsonReader.nextInt());
            } else if ("name".equals(strNextName) && jsonReader.peek() != JsonToken.NULL) {
                hVar.a(jsonReader.nextString());
            } else if ("path".equals(strNextName) && jsonReader.peek() != JsonToken.NULL) {
                hVar.b(jsonReader.nextString());
            } else if ("isImage".equals(strNextName) && jsonReader.peek() != JsonToken.NULL) {
                hVar.a(jsonReader.nextBoolean());
            } else if ("description".equals(strNextName) && jsonReader.peek() != JsonToken.NULL) {
                hVar.c(jsonReader.nextString());
            } else if ("domainId".equals(strNextName) && jsonReader.peek() != JsonToken.NULL) {
                hVar.b(jsonReader.nextInt());
            } else if (!"parent_id".equals(strNextName) || jsonReader.peek() == JsonToken.NULL) {
                jsonReader.skipValue();
            } else {
                hVar.c(jsonReader.nextInt());
            }
        }
        jsonReader.endObject();
        return hVar;
    }

    public void b(int i10) {
        this.f84726f = i10;
    }

    public void c(int i10) {
        this.f84727g = i10;
    }

    public void a(int i10) {
        this.f84721a = i10;
    }

    public void b(String str) {
        this.f84723c = str;
    }

    public void c(String str) {
        this.f84725e = str;
    }

    public void a(JsonWriter jsonWriter) throws IOException {
        jsonWriter.beginObject();
        jsonWriter.name("id");
        jsonWriter.value(this.f84721a);
        if (this.f84722b != null) {
            jsonWriter.name("name");
            jsonWriter.value(this.f84722b);
        }
        if (this.f84723c != null) {
            jsonWriter.name("path");
            jsonWriter.value(this.f84723c);
        }
        jsonWriter.name("isImage");
        jsonWriter.value(this.f84724d);
        if (this.f84725e != null) {
            jsonWriter.name("description");
            jsonWriter.value(this.f84725e);
        }
        jsonWriter.name("domainId");
        jsonWriter.value(this.f84726f);
        jsonWriter.name("parent_id");
        jsonWriter.value(this.f84727g);
        jsonWriter.endObject();
    }

    public void a(String str) {
        this.f84722b = str;
    }

    public void a(boolean z10) {
        this.f84724d = z10;
    }
}
