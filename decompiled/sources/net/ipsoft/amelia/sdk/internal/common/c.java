package net.ipsoft.amelia.sdk.internal.common;

import android.os.Parcel;
import android.os.Parcelable;
import net.ipsoft.amelia.sdk.IAmeliaError;

/* JADX INFO: loaded from: classes12.dex */
public class c implements Parcelable, IAmeliaError {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IAmeliaError.Code f84841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f84842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Throwable f84843c;

    public static class a implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        public final c createFromParcel(Parcel parcel) {
            return new c(IAmeliaError.Code.values()[Integer.valueOf(parcel.readInt()).intValue()], parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final c[] newArray(int i10) {
            return new c[i10];
        }
    }

    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f84844a;

        static {
            int[] iArr = new int[net.ipsoft.amelia.sdk.internal.b.l.a.values().length];
            f84844a = iArr;
            try {
                iArr[net.ipsoft.amelia.sdk.internal.b.l.a.networkError.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f84844a[net.ipsoft.amelia.sdk.internal.b.l.a.backendError.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f84844a[net.ipsoft.amelia.sdk.internal.b.l.a.badRequestError.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public c(String str) {
        this(IAmeliaError.Code.error, str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // net.ipsoft.amelia.sdk.IAmeliaError
    public Throwable getCause() {
        return this.f84843c;
    }

    @Override // net.ipsoft.amelia.sdk.IAmeliaError
    public IAmeliaError.Code getCode() {
        return this.f84841a;
    }

    @Override // net.ipsoft.amelia.sdk.IAmeliaError
    public String getMessage() {
        return this.f84842b;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("{ code: ");
        sb2.append(this.f84841a);
        sb2.append(", message: ");
        return ad.d.f(sb2, this.f84842b, " }");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f84841a.ordinal());
        parcel.writeString(this.f84842b);
    }

    public c(String str, Throwable th2) {
        this(IAmeliaError.Code.error, str, th2);
    }

    public c(IAmeliaError.Code code, String str) {
        this.f84841a = code;
        this.f84842b = str;
        this.f84843c = null;
    }

    public c(IAmeliaError.Code code, String str, Throwable th2) {
        this.f84841a = code;
        this.f84842b = str;
        this.f84843c = th2;
    }

    public c(net.ipsoft.amelia.sdk.internal.b.l lVar, String str) {
        String str2;
        IAmeliaError.Code code;
        if (str != null) {
            this.f84842b = str;
            int i10 = b.f84844a[lVar.f84734a.ordinal()];
            if (i10 == 1) {
                code = IAmeliaError.Code.networkError;
            } else if (i10 != 2) {
                code = IAmeliaError.Code.error;
            } else {
                int i11 = lVar.f84735b;
                code = i11 != 302 ? i11 != 410 ? IAmeliaError.Code.unexpectedResponse : IAmeliaError.Code.unsupportedSdkVersion : IAmeliaError.Code.invalidSession;
            }
            this.f84841a = code;
        } else {
            int i12 = b.f84844a[lVar.f84734a.ordinal()];
            if (i12 == 1) {
                this.f84841a = IAmeliaError.Code.networkError;
                str2 = "Network error";
            } else if (i12 != 2) {
                this.f84841a = i12 != 3 ? IAmeliaError.Code.error : IAmeliaError.Code.invalidContent;
                str2 = lVar.f84736c;
            } else {
                this.f84841a = IAmeliaError.Code.unexpectedResponse;
                str2 = "Internal server error";
            }
            this.f84842b = str2;
        }
        this.f84843c = lVar.f84737d;
    }
}
