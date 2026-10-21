package net.ipsoft.amelia.sdk.internal.b;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Iterator;
import net.ipsoft.amelia.sdk.BaseDomain;

/* JADX INFO: loaded from: classes12.dex */
public class g extends o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList<BaseDomain> f84720b = new ArrayList<>();

    @Override // net.ipsoft.amelia.sdk.internal.b.o
    public void a(Reader reader) throws IOException {
        JsonReader jsonReader = new JsonReader(reader);
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if (!jsonReader.nextName().equalsIgnoreCase("content") || jsonReader.peek() == JsonToken.NULL) {
                jsonReader.skipValue();
            } else {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    this.f84720b.add(new net.ipsoft.amelia.sdk.internal.common.g(jsonReader));
                }
                jsonReader.endArray();
            }
        }
        jsonReader.endObject();
    }

    @Override // net.ipsoft.amelia.sdk.internal.b.o
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        ArrayList<BaseDomain> arrayList = this.f84720b;
        if (arrayList != null) {
            Iterator<BaseDomain> it = arrayList.iterator();
            while (it.hasNext()) {
                stringBuffer.append(it.next().toString());
            }
        }
        StringBuilder sb2 = new StringBuilder("{ domains: ");
        sb2.append(this.f84720b == null ? null : stringBuffer.toString());
        sb2.append(", error: ");
        l lVar = this.f84764f;
        sb2.append(lVar != null ? Integer.valueOf(lVar.hashCode()) : null);
        sb2.append(" }");
        return sb2.toString();
    }
}
