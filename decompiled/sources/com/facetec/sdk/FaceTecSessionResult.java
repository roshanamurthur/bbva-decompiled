package com.facetec.sdk;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public final class FaceTecSessionResult implements Parcelable {
    public static final Parcelable.Creator<FaceTecSessionResult> CREATOR = new Parcelable.Creator<FaceTecSessionResult>() { // from class: com.facetec.sdk.FaceTecSessionResult.2
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ FaceTecSessionResult createFromParcel(Parcel parcel) {
            return new FaceTecSessionResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ FaceTecSessionResult[] newArray(int i10) {
            return new FaceTecSessionResult[i10];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final byte[] f40126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private String f40127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final FaceTecSessionStatus f40128c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final byte[][] f40129d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final byte[][] f40130e;

    public FaceTecSessionResult(Parcel parcel) {
        this.f40128c = FaceTecSessionStatus.valueOf(parcel.readString());
        this.f40127b = parcel.readString();
        this.f40129d = (byte[][]) cd.aZ_(parcel);
        this.f40130e = (byte[][]) cd.aZ_(parcel);
        this.f40126a = (byte[]) cd.aZ_(parcel);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void e(String str) {
        this.f40127b = str;
    }

    @NonNull
    public final String[] getAuditTrailCompressedBase64() {
        byte[][] bArr = this.f40129d;
        int i10 = 0;
        if (bArr == null) {
            return new String[0];
        }
        String[] strArr = new String[bArr.length];
        while (true) {
            byte[][] bArr2 = this.f40129d;
            if (i10 >= bArr2.length) {
                return strArr;
            }
            strArr[i10] = Base64.encodeToString(bArr2[i10], 2);
            i10++;
        }
    }

    @Nullable
    public final byte[] getFaceScan() {
        byte[] bArr = new byte[0];
        byte[] bArr2 = this.f40126a;
        return bArr2 != null ? bArr2 : bArr;
    }

    public final String getFaceScanBase64() {
        byte[] bArr = new byte[0];
        byte[] bArr2 = this.f40126a;
        if (bArr2 != null) {
            bArr = bArr2;
        }
        return Base64.encodeToString(bArr, 2);
    }

    @NonNull
    public final String[] getLowQualityAuditTrailCompressedBase64() {
        byte[][] bArr = this.f40130e;
        int i10 = 0;
        if (bArr == null) {
            return new String[0];
        }
        String[] strArr = new String[bArr.length];
        while (true) {
            byte[][] bArr2 = this.f40130e;
            if (i10 >= bArr2.length) {
                return strArr;
            }
            strArr[i10] = Base64.encodeToString(bArr2[i10], 2);
            i10++;
        }
    }

    @Nullable
    public final String getSessionId() {
        return this.f40127b;
    }

    public final FaceTecSessionStatus getStatus() {
        return this.f40128c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f40128c.name());
        parcel.writeString(this.f40127b);
        cd.aY_(this.f40129d, parcel);
        cd.aY_(this.f40130e, parcel);
        cd.aY_(this.f40126a, parcel);
    }

    public FaceTecSessionResult(FaceTecSessionStatus faceTecSessionStatus, byte[][] bArr, byte[][] bArr2, byte[] bArr3) {
        this.f40128c = faceTecSessionStatus;
        this.f40129d = bArr;
        this.f40130e = bArr2;
        this.f40126a = bArr3;
    }
}
