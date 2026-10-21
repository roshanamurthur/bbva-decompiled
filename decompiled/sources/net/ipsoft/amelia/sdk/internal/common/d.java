package net.ipsoft.amelia.sdk.internal.common;

import android.util.JsonReader;
import android.util.JsonToken;
import com.bbva.component.dm.naturalauth.Constants;
import java.io.IOException;
import java.util.ArrayList;
import net.ipsoft.amelia.sdk.BaseDomain;
import net.ipsoft.amelia.sdk.IAmeliaUser;

/* JADX INFO: loaded from: classes12.dex */
public class d implements IAmeliaUser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f84845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f84846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f84847c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f84848d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList<String> f84849e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList<BaseDomain> f84850f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList<String> f84851g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayList<String> f84852h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f84853i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f84854j;

    public d() {
    }

    public d(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (Constants.backendRequestUserId.equals(strNextName) && jsonReader.peek() != JsonToken.NULL) {
                c(jsonReader.nextString());
            } else if ("name".equals(strNextName) && jsonReader.peek() != JsonToken.NULL) {
                a(jsonReader.nextString());
            } else if ("email".equals(strNextName) && jsonReader.peek() != JsonToken.NULL) {
                b(jsonReader.nextString());
            } else if ("anonymous".equals(strNextName) && jsonReader.peek() != JsonToken.NULL) {
                a(jsonReader.nextBoolean());
            } else if (!"agent".equals(strNextName) || jsonReader.peek() == JsonToken.NULL) {
                if ("domains".equals(strNextName) && jsonReader.peek() != JsonToken.NULL) {
                    this.f84850f = new ArrayList<>();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        jsonReader.skipValue();
                        this.f84850f.add(new g(jsonReader));
                    }
                } else if ("domainCodes".equals(strNextName) && jsonReader.peek() != JsonToken.NULL) {
                    this.f84851g = new ArrayList<>();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        this.f84851g.add(jsonReader.nextName());
                        jsonReader.skipValue();
                    }
                } else if (!"defaultConversationDomainId".equals(strNextName) || jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                } else {
                    d(jsonReader.nextString());
                }
                jsonReader.endObject();
            } else {
                b(jsonReader.nextBoolean());
            }
        }
        jsonReader.endObject();
    }

    public void a(String str) {
        this.f84845a = str;
    }

    public void b(String str) {
        this.f84846b = str;
    }

    public void c(String str) {
        this.f84847c = str;
    }

    public void d(String str) {
        this.f84848d = str;
    }

    @Override // net.ipsoft.amelia.sdk.IAmeliaUser
    public String getDefaultConversationDomainId() {
        return this.f84848d;
    }

    @Override // net.ipsoft.amelia.sdk.IAmeliaUser
    public ArrayList<String> getDomainAuthorities() {
        return this.f84852h;
    }

    @Override // net.ipsoft.amelia.sdk.IAmeliaUser
    public ArrayList<String> getDomainCodes() {
        return this.f84851g;
    }

    @Override // net.ipsoft.amelia.sdk.IAmeliaUser
    public ArrayList<BaseDomain> getDomains() {
        return this.f84850f;
    }

    @Override // net.ipsoft.amelia.sdk.IAmeliaUser
    public String getEmail() {
        return this.f84846b;
    }

    @Override // net.ipsoft.amelia.sdk.IAmeliaUser
    public ArrayList<String> getGlobalAuthorities() {
        return this.f84849e;
    }

    @Override // net.ipsoft.amelia.sdk.IAmeliaUser
    public String getName() {
        return this.f84845a;
    }

    @Override // net.ipsoft.amelia.sdk.IAmeliaUser
    public String getUserId() {
        return this.f84847c;
    }

    @Override // net.ipsoft.amelia.sdk.IAmeliaUser
    public boolean isAgent() {
        return this.f84854j;
    }

    @Override // net.ipsoft.amelia.sdk.IAmeliaUser
    public boolean isAnonymous() {
        return this.f84853i;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("{ name: ");
        sb2.append(this.f84845a);
        sb2.append(", email: ");
        sb2.append(this.f84846b);
        sb2.append(", isAnonymous: ");
        return androidx.appcompat.app.i.c(sb2, this.f84853i, " }");
    }

    public void a(ArrayList<String> arrayList) {
        this.f84849e = arrayList;
    }

    public void b(ArrayList<BaseDomain> arrayList) {
        this.f84850f = arrayList;
    }

    public void c(ArrayList<String> arrayList) {
        this.f84851g = arrayList;
    }

    public void d(ArrayList<String> arrayList) {
        this.f84852h = arrayList;
    }

    public void a(boolean z10) {
        this.f84853i = z10;
    }

    public void b(boolean z10) {
        this.f84854j = z10;
    }
}
