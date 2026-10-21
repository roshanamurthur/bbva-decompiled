package net.ipsoft.amelia.sdk.internal.b;

import android.util.JsonReader;
import java.io.Reader;

/* JADX INFO: loaded from: classes12.dex */
public class w extends o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public x f84781b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f84782c;

    @Override // net.ipsoft.amelia.sdk.internal.b.o
    public void a(Reader reader) {
        this.f84781b = x.a(new JsonReader(reader));
    }

    @Override // net.ipsoft.amelia.sdk.internal.b.o
    public void c(String str) {
        this.f84782c = str;
    }

    @Override // net.ipsoft.amelia.sdk.internal.b.o
    public String toString() {
        StringBuilder sb2 = new StringBuilder("{ data: ");
        x xVar = this.f84781b;
        sb2.append(xVar == null ? null : Integer.valueOf(xVar.hashCode()));
        sb2.append(", error: ");
        l lVar = this.f84764f;
        sb2.append(lVar != null ? Integer.valueOf(lVar.hashCode()) : null);
        sb2.append(" }");
        return sb2.toString();
    }
}
