package net.ipsoft.amelia.sdk.internal.common;

import android.os.Parcel;
import android.os.Parcelable;
import net.ipsoft.amelia.sdk.BaseConversation;
import net.ipsoft.amelia.sdk.BaseDomain;

/* JADX INFO: loaded from: classes12.dex */
public class f extends BaseConversation {
    public static final Parcelable.Creator<BaseConversation> CREATOR = new a();
    public BaseDomain E0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final String f84855p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final String f84856q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final String f84857r0;
    public boolean v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public boolean f84861w0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public boolean f84858s0 = true;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public boolean f84859t0 = false;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public boolean f84860u0 = false;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public long f84862x0 = System.currentTimeMillis();

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public String f84863y0 = "HAPPY";

    public static class a implements Parcelable.Creator<BaseConversation> {
        @Override // android.os.Parcelable.Creator
        public final BaseConversation createFromParcel(Parcel parcel) {
            f fVar = new f(parcel.readString(), parcel.readString(), parcel.readString());
            fVar.f84858s0 = parcel.readInt() != 0;
            fVar.f84859t0 = parcel.readInt() != 0;
            fVar.f84860u0 = parcel.readInt() != 0;
            fVar.f84861w0 = parcel.readInt() != 0;
            fVar.f84862x0 = parcel.readLong();
            fVar.f84863y0 = parcel.readString();
            fVar.E0 = (BaseDomain) parcel.readParcelable(null);
            fVar.v0 = parcel.readInt() != 0;
            return fVar;
        }

        @Override // android.os.Parcelable.Creator
        public final BaseConversation[] newArray(int i10) {
            return new f[i10];
        }
    }

    public f(String str, String str2, String str3) {
        this.f84856q0 = str2;
        this.f84857r0 = str3;
        this.f84855p0 = str;
    }

    public String a() {
        return this.f84855p0;
    }

    public String b() {
        return this.f84856q0;
    }

    public void c(boolean z10) {
        this.f84860u0 = z10;
    }

    public void d(boolean z10) {
        this.f84861w0 = z10;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void e(boolean z10) {
        this.v0 = z10;
    }

    @Override // net.ipsoft.amelia.sdk.BaseConversation
    public String getConversationId() {
        return this.f84857r0;
    }

    @Override // net.ipsoft.amelia.sdk.BaseConversation
    public BaseDomain getInitialDomain() {
        return this.E0;
    }

    @Override // net.ipsoft.amelia.sdk.BaseConversation
    public String getMood() {
        return this.f84863y0;
    }

    @Override // net.ipsoft.amelia.sdk.BaseConversation
    public long getTimeOfLastMessage() {
        return this.f84862x0;
    }

    @Override // net.ipsoft.amelia.sdk.BaseConversation
    public boolean isExistingConversation() {
        return this.f84861w0;
    }

    @Override // net.ipsoft.amelia.sdk.BaseConversation
    public boolean isInputEnabled() {
        return this.f84858s0;
    }

    @Override // net.ipsoft.amelia.sdk.BaseConversation
    public boolean isMuted() {
        return this.f84860u0;
    }

    @Override // net.ipsoft.amelia.sdk.BaseConversation
    public boolean isSecureInputEnabled() {
        return this.f84859t0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f84855p0);
        parcel.writeString(this.f84856q0);
        parcel.writeString(this.f84857r0);
        parcel.writeInt(this.f84858s0 ? 1 : 0);
        parcel.writeInt(this.f84859t0 ? 1 : 0);
        parcel.writeInt(this.f84860u0 ? 1 : 0);
        parcel.writeInt(this.f84861w0 ? 1 : 0);
        parcel.writeLong(this.f84862x0);
        parcel.writeString(this.f84863y0);
        parcel.writeParcelable(this.E0, 0);
        parcel.writeInt(this.v0 ? 1 : 0);
    }

    public void a(long j10) {
        this.f84862x0 = j10;
    }

    public void b(boolean z10) {
        this.f84859t0 = z10;
    }

    public boolean c() {
        return this.v0;
    }

    public void a(String str) {
        this.f84863y0 = str;
    }

    public void a(BaseDomain baseDomain) {
        this.E0 = baseDomain;
    }

    public void a(boolean z10) {
        this.f84858s0 = z10;
    }
}
