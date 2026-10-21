package net.ipsoft.amelia.sdk.internal.a;

import android.util.JsonWriter;
import java.io.IOException;

/* JADX INFO: loaded from: classes12.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected String f84578a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected boolean f84579b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected b f84580c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected c f84581d = null;

    public String a() {
        return this.f84578a;
    }

    public boolean b() {
        return this.f84579b;
    }

    public b c() {
        return this.f84580c;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("{ messageText: ");
        sb2.append(this.f84578a);
        sb2.append(", attributes: ");
        b bVar = this.f84580c;
        sb2.append(bVar == null ? null : Integer.valueOf(bVar.hashCode()));
        sb2.append(", secure: ");
        sb2.append(b());
        sb2.append(" }");
        return sb2.toString();
    }

    public void a(JsonWriter jsonWriter) throws IOException {
        jsonWriter.beginObject();
        if (this.f84578a != null) {
            jsonWriter.name("messageText");
            jsonWriter.value(this.f84578a);
        }
        if (this.f84580c != null) {
            jsonWriter.name(com.salesforce.marketingcloud.storage.db.k.a.f65041h);
            this.f84580c.a(jsonWriter);
        }
        if (this.f84581d != null) {
            jsonWriter.name("customAttributes");
            this.f84581d.a(jsonWriter);
        }
        jsonWriter.name("secure").value(this.f84579b);
        jsonWriter.endObject();
    }

    public void a(String str) {
        this.f84578a = str;
    }

    public void a(b bVar) {
        this.f84580c = bVar;
    }

    public void a(c cVar) {
        this.f84581d = cVar;
    }

    public void a(boolean z10) {
        this.f84579b = z10;
    }
}
