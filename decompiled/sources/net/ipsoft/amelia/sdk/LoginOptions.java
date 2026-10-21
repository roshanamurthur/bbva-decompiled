package net.ipsoft.amelia.sdk;

import ad.d;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RequiresApi;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class LoginOptions implements Parcelable {
    public static final Parcelable.Creator<LoginOptions> CREATOR = new a();
    public final BaseAuthSystem authSystem;
    public final Context context;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public Map<String, String> f84571p0;
    public final String password;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public Map<String, String> f84572q0;
    public final String sessionCookie;
    public final String username;

    public static class a implements Parcelable.Creator<LoginOptions> {
        @Override // android.os.Parcelable.Creator
        public final LoginOptions createFromParcel(Parcel parcel) {
            return new LoginOptions((BaseAuthSystem) parcel.readParcelable(a.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), null);
        }

        @Override // android.os.Parcelable.Creator
        public final LoginOptions[] newArray(int i10) {
            return new LoginOptions[i10];
        }
    }

    @RequiresApi(api = 21)
    public LoginOptions(BaseAuthSystem baseAuthSystem) {
        this(baseAuthSystem, null, null, null, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Map<String, String> getInitialAttributes() {
        return this.f84571p0;
    }

    public Map<String, String> getInitialBpnVariables() {
        return this.f84572q0;
    }

    public void setInitialAttributes(Map<String, String> map) {
        this.f84571p0 = map;
    }

    public void setInitialBpnVariables(Map<String, String> map) {
        this.f84572q0 = map;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("{ authSystem: ");
        sb2.append(this.authSystem);
        sb2.append(", username: ");
        sb2.append(this.username);
        sb2.append(", password: ");
        sb2.append(this.password);
        sb2.append(", sessionCookie: ");
        return d.f(sb2, this.sessionCookie, " }");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.authSystem, 0);
        parcel.writeString(this.username);
        parcel.writeString(this.password);
        parcel.writeString(this.sessionCookie);
    }

    public LoginOptions(BaseAuthSystem baseAuthSystem, Context context) {
        this(baseAuthSystem, null, null, null, context);
    }

    public LoginOptions(BaseAuthSystem baseAuthSystem, String str) {
        this(baseAuthSystem, null, null, str, null);
    }

    public LoginOptions(BaseAuthSystem baseAuthSystem, String str, String str2) {
        this(baseAuthSystem, str, str2, null, null);
    }

    public LoginOptions(BaseAuthSystem baseAuthSystem, String str, String str2, String str3, Context context) {
        this.authSystem = baseAuthSystem;
        this.username = str;
        this.password = str2;
        this.sessionCookie = str3;
        this.context = context;
    }
}
