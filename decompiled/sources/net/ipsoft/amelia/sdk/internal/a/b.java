package net.ipsoft.amelia.sdk.internal.a;

import android.util.JsonWriter;
import java.io.IOException;
import net.ipsoft.amelia.sdk.FormInputData;

/* JADX INFO: loaded from: classes12.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected FormInputData f84582a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected String f84583b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected String f84584c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected String f84585d = null;

    public String a() {
        return this.f84583b;
    }

    public String b() {
        return this.f84584c;
    }

    public FormInputData c() {
        return this.f84582a;
    }

    public String d() {
        return this.f84585d;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("{ formInputAttributes: ");
        sb2.append(this.f84582a.toString());
        sb2.append(", processName: ");
        sb2.append(this.f84583b);
        sb2.append(", processArgs: ");
        return ad.d.f(sb2, this.f84584c, " }");
    }

    public void a(JsonWriter jsonWriter) throws IOException {
        jsonWriter.beginObject();
        if (this.f84582a != null) {
            jsonWriter.name("formInputAttributes");
            this.f84582a.serializeSelectedFields(jsonWriter);
        }
        if (this.f84583b != null) {
            jsonWriter.name("processName");
            jsonWriter.value(this.f84583b);
        }
        if (this.f84584c != null) {
            jsonWriter.name("processArgs");
            jsonWriter.value(this.f84584c);
        }
        if (this.f84585d != null) {
            jsonWriter.name("request_confirmation_action");
            jsonWriter.value(this.f84585d);
        }
        jsonWriter.endObject();
    }

    public void b(String str) {
        this.f84584c = str;
    }

    public void c(String str) {
        this.f84585d = str;
    }

    public void a(String str) {
        this.f84583b = str;
    }

    public void a(FormInputData formInputData) {
        this.f84582a = formInputData;
    }
}
