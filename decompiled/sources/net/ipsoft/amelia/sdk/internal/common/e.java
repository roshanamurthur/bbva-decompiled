package net.ipsoft.amelia.sdk.internal.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import net.ipsoft.amelia.sdk.BaseAuthSystem;

/* JADX INFO: loaded from: classes12.dex */
public class e extends BaseAuthSystem {
    public static final Parcelable.Creator<e> CREATOR = new a();

    public static class a implements Parcelable.Creator<e> {
        @Override // android.os.Parcelable.Creator
        public final e createFromParcel(Parcel parcel) {
            e eVar = new e();
            ((BaseAuthSystem) eVar).f84531a = parcel.readInt() != 0;
            ((BaseAuthSystem) eVar).f84532b = parcel.readInt() != 0;
            ((BaseAuthSystem) eVar).f84533c = parcel.readString();
            ((BaseAuthSystem) eVar).f84534d = parcel.readString();
            ((BaseAuthSystem) eVar).f84535e = parcel.readString();
            ((BaseAuthSystem) eVar).f84536f = parcel.readString();
            return eVar;
        }

        @Override // android.os.Parcelable.Creator
        public final e[] newArray(int i10) {
            return new e[i10];
        }
    }

    public e() {
    }

    public static e a() {
        e eVar = new e();
        eVar.c("");
        eVar.a("internal");
        eVar.d("/login");
        eVar.b("Internal");
        eVar.a(false);
        return eVar;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // net.ipsoft.amelia.sdk.BaseAuthSystem
    public String getCustomProviderClass() {
        return this.f84535e;
    }

    @Override // net.ipsoft.amelia.sdk.BaseAuthSystem
    public String getIdentifier() {
        return this.f84533c;
    }

    @Override // net.ipsoft.amelia.sdk.BaseAuthSystem
    public boolean getImmediate() {
        return this.f84532b;
    }

    @Override // net.ipsoft.amelia.sdk.BaseAuthSystem
    public String getLoginPath() {
        return this.f84536f;
    }

    @Override // net.ipsoft.amelia.sdk.BaseAuthSystem
    public String getName() {
        return this.f84534d;
    }

    @Override // net.ipsoft.amelia.sdk.BaseAuthSystem
    public boolean getRedirect() {
        return this.f84531a;
    }

    @Override // net.ipsoft.amelia.sdk.BaseAuthSystem
    public String toString() {
        StringBuilder sb2 = new StringBuilder("{ redirect: ");
        sb2.append(this.f84531a);
        sb2.append(", immediate: ");
        sb2.append(this.f84532b);
        sb2.append(", identifier: ");
        sb2.append(this.f84533c);
        sb2.append(", name: ");
        sb2.append(this.f84534d);
        sb2.append(",  customProviderClass: ");
        sb2.append(this.f84535e);
        sb2.append(", loginPath: ");
        return ad.d.f(sb2, this.f84536f, " }");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f84531a ? 1 : 0);
        parcel.writeInt(this.f84532b ? 1 : 0);
        parcel.writeString(this.f84533c);
        parcel.writeString(this.f84534d);
        parcel.writeString(this.f84535e);
        parcel.writeString(this.f84536f);
    }

    public e(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if ("redirect".equals(strNextName) && jsonReader.peek() != JsonToken.NULL) {
                a(jsonReader.nextBoolean());
            } else if ("immediate".equals(strNextName) && jsonReader.peek() != JsonToken.NULL) {
                b(jsonReader.nextBoolean());
            } else if ("id".equals(strNextName) && jsonReader.peek() != JsonToken.NULL) {
                a(jsonReader.nextString());
            } else if ("name".equals(strNextName) && jsonReader.peek() != JsonToken.NULL) {
                b(jsonReader.nextString());
            } else if ("customProviderClass".equals(strNextName) && jsonReader.peek() != JsonToken.NULL) {
                c(jsonReader.nextString());
            } else if (!"loginPath".equals(strNextName) || jsonReader.peek() == JsonToken.NULL) {
                jsonReader.skipValue();
            } else {
                d(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
    }

    public void a(String str) {
        this.f84533c = str;
    }

    public void b(String str) {
        this.f84534d = str;
    }

    public void c(String str) {
        this.f84535e = str;
    }

    public void d(String str) {
        this.f84536f = str;
    }

    public void a(boolean z10) {
        this.f84531a = z10;
    }

    public void b(boolean z10) {
        this.f84532b = z10;
    }
}
