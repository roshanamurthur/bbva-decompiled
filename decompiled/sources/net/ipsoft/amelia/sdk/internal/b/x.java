package net.ipsoft.amelia.sdk.internal.b;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;

/* JADX INFO: loaded from: classes12.dex */
public class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected boolean f84783a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected boolean f84784b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected net.ipsoft.amelia.sdk.internal.common.d f84785c;

    public static x a(JsonReader jsonReader) throws IOException {
        x xVar = new x();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if ("expirationWarning".equals(strNextName) && jsonReader.peek() != JsonToken.NULL) {
                xVar.f84783a = jsonReader.nextBoolean();
            } else if (!"user".equals(strNextName) || jsonReader.peek() == JsonToken.NULL) {
                jsonReader.skipValue();
            } else {
                xVar.f84784b = true;
                xVar.f84785c = new net.ipsoft.amelia.sdk.internal.common.d(jsonReader);
            }
        }
        jsonReader.endObject();
        return xVar;
    }

    public boolean b() {
        return this.f84784b;
    }

    public net.ipsoft.amelia.sdk.internal.common.d c() {
        return this.f84785c;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("{ expirationWarning: ");
        sb2.append(this.f84783a);
        sb2.append(", success: ");
        return androidx.appcompat.app.i.c(sb2, this.f84784b, " }");
    }

    public boolean a() {
        return this.f84783a;
    }
}
