package net.ipsoft.amelia.sdk.internal.b;

import android.util.JsonReader;
import java.io.Reader;
import java.util.ArrayList;
import net.ipsoft.amelia.sdk.BaseAuthSystem;

/* JADX INFO: loaded from: classes12.dex */
public class c extends o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList<BaseAuthSystem> f84718b = new ArrayList<>();

    @Override // net.ipsoft.amelia.sdk.internal.b.o
    public void a(Reader reader) {
        try {
            JsonReader jsonReader = new JsonReader(reader);
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                this.f84718b.add(new net.ipsoft.amelia.sdk.internal.common.e(jsonReader));
            }
            jsonReader.endArray();
        } catch (Exception unused) {
        }
    }

    @Override // net.ipsoft.amelia.sdk.internal.b.o
    public String toString() {
        StringBuilder sb2 = new StringBuilder("{ authSystems: ");
        ArrayList<BaseAuthSystem> arrayList = this.f84718b;
        sb2.append(arrayList == null ? null : Integer.valueOf(arrayList.hashCode()));
        sb2.append(", error: ");
        l lVar = this.f84764f;
        sb2.append(lVar != null ? Integer.valueOf(lVar.hashCode()) : null);
        sb2.append(" }");
        return sb2.toString();
    }
}
