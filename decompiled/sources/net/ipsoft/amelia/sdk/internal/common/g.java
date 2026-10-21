package net.ipsoft.amelia.sdk.internal.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.JsonReader;
import android.util.JsonToken;
import android.util.JsonWriter;
import com.bbva.ui.component.menu.model.BaseMenuItem;
import java.io.IOException;
import net.ipsoft.amelia.sdk.BaseDomain;

/* JADX INFO: loaded from: classes12.dex */
public class g extends BaseDomain {
    public static final Parcelable.Creator<g> CREATOR = new a();

    public static class a implements Parcelable.Creator<g> {
        @Override // android.os.Parcelable.Creator
        public final g createFromParcel(Parcel parcel) {
            g gVar = new g();
            ((BaseDomain) gVar).f84537a = parcel.readString();
            ((BaseDomain) gVar).f84538b = parcel.readString();
            ((BaseDomain) gVar).f84539c = parcel.readString();
            ((BaseDomain) gVar).f84540d = parcel.readString();
            ((BaseDomain) gVar).f84541e = parcel.readString();
            ((BaseDomain) gVar).f84542f = parcel.readInt() != 0;
            ((BaseDomain) gVar).f84543g = parcel.readInt() != 0;
            return gVar;
        }

        @Override // android.os.Parcelable.Creator
        public final g[] newArray(int i10) {
            return new g[i10];
        }
    }

    public g() {
    }

    public void a(JsonWriter jsonWriter) throws IOException {
        jsonWriter.beginObject();
        jsonWriter.name("domainId");
        jsonWriter.value(this.f84537a);
        if (this.f84538b != null) {
            jsonWriter.name("name");
            jsonWriter.value(this.f84538b);
        }
        if (this.f84539c != null) {
            jsonWriter.name("code");
            jsonWriter.value(this.f84539c);
        }
        if (this.f84540d != null) {
            jsonWriter.name("localeDisplayName");
            jsonWriter.value(this.f84540d);
        }
        if (this.f84541e != null) {
            jsonWriter.name("localeLanguageTag");
            jsonWriter.value(this.f84541e);
        }
        jsonWriter.name("requireLogin");
        jsonWriter.value(this.f84542f);
        jsonWriter.name(BaseMenuItem.STATE_HIDDEN);
        jsonWriter.value(this.f84543g);
        jsonWriter.endObject();
    }

    @Override // net.ipsoft.amelia.sdk.BaseDomain
    public boolean allowsConversations() {
        return this.f84544h;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // net.ipsoft.amelia.sdk.BaseDomain
    public String getCode() {
        return this.f84539c;
    }

    @Override // net.ipsoft.amelia.sdk.BaseDomain
    public String getDomainId() {
        return this.f84537a;
    }

    @Override // net.ipsoft.amelia.sdk.BaseDomain
    public boolean getHidden() {
        return this.f84543g;
    }

    @Override // net.ipsoft.amelia.sdk.BaseDomain
    public String getLocaleDisplayName() {
        return this.f84540d;
    }

    @Override // net.ipsoft.amelia.sdk.BaseDomain
    public String getLocaleLanguageTag() {
        return this.f84541e;
    }

    @Override // net.ipsoft.amelia.sdk.BaseDomain
    public String getName() {
        return this.f84538b;
    }

    @Override // net.ipsoft.amelia.sdk.BaseDomain
    public boolean getRequireLogin() {
        return this.f84542f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f84537a);
        parcel.writeString(this.f84538b);
        parcel.writeString(this.f84539c);
        parcel.writeString(this.f84540d);
        parcel.writeString(this.f84541e);
        parcel.writeInt(this.f84542f ? 1 : 0);
        parcel.writeInt(this.f84543g ? 1 : 0);
    }

    public g(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (("id".equals(strNextName) || "domainId".equals(strNextName)) && jsonReader.peek() != JsonToken.NULL) {
                a(jsonReader.nextString());
            } else if ("name".equals(strNextName) && jsonReader.peek() != JsonToken.NULL) {
                b(jsonReader.nextString());
            } else if ("code".equals(strNextName) && jsonReader.peek() != JsonToken.NULL) {
                c(jsonReader.nextString());
            } else if ("localeDisplayName".equals(strNextName) && jsonReader.peek() != JsonToken.NULL) {
                d(jsonReader.nextString());
            } else if ("localeLanguageTag".equals(strNextName) && jsonReader.peek() != JsonToken.NULL) {
                e(jsonReader.nextString());
            } else if ("requireLogin".equals(strNextName) && jsonReader.peek() != JsonToken.NULL) {
                b(jsonReader.nextBoolean());
            } else if (BaseMenuItem.STATE_HIDDEN.equals(strNextName) && jsonReader.peek() != JsonToken.NULL) {
                c(jsonReader.nextBoolean());
            } else if (!"allowsConversations".equals(strNextName) || jsonReader.peek() == JsonToken.NULL) {
                jsonReader.skipValue();
            } else {
                a(jsonReader.nextBoolean());
            }
        }
        jsonReader.endObject();
    }

    public void a(String str) {
        this.f84537a = str;
    }

    public void b(String str) {
        this.f84538b = str;
    }

    public void c(String str) {
        this.f84539c = str;
    }

    public void d(String str) {
        this.f84540d = str;
    }

    public void e(String str) {
        this.f84541e = str;
    }

    public void a(boolean z10) {
        this.f84544h = z10;
    }

    public void b(boolean z10) {
        this.f84542f = z10;
    }

    public void c(boolean z10) {
        this.f84543g = z10;
    }
}
