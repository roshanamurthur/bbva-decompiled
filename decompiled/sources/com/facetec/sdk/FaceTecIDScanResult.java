package com.facetec.sdk;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public final class FaceTecIDScanResult implements Parcelable {
    public static final Parcelable.Creator<FaceTecIDScanResult> CREATOR = new Parcelable.Creator<FaceTecIDScanResult>() { // from class: com.facetec.sdk.FaceTecIDScanResult.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ FaceTecIDScanResult createFromParcel(Parcel parcel) {
            return new FaceTecIDScanResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ FaceTecIDScanResult[] newArray(int i10) {
            return new FaceTecIDScanResult[i10];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    ArrayList<String> f40099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final FaceTecIDScanStatus f40100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    String f40101c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    byte[] f40102d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    ArrayList<String> f40103e;

    public FaceTecIDScanResult(Parcel parcel) {
        this.f40103e = new ArrayList<>();
        this.f40099a = new ArrayList<>();
        this.f40100b = (FaceTecIDScanStatus) parcel.readSerializable();
        this.f40103e = (ArrayList) cd.aZ_(parcel);
        this.f40099a = (ArrayList) cd.aZ_(parcel);
        this.f40102d = (byte[]) cd.aZ_(parcel);
        this.f40101c = (String) cd.aZ_(parcel);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @NonNull
    public final ArrayList<String> getBackImagesCompressedBase64() {
        return this.f40099a;
    }

    @NonNull
    public final ArrayList<String> getFrontImagesCompressedBase64() {
        return this.f40103e;
    }

    @Nullable
    public final byte[] getIDScan() {
        byte[] bArr = new byte[0];
        byte[] bArr2 = this.f40102d;
        return bArr2 != null ? bArr2 : bArr;
    }

    public final String getIDScanBase64() {
        byte[] bArr = new byte[0];
        byte[] bArr2 = this.f40102d;
        if (bArr2 != null) {
            bArr = bArr2;
        }
        return Base64.encodeToString(bArr, 2);
    }

    @Nullable
    public final String getSessionId() {
        return this.f40101c;
    }

    public final FaceTecIDScanStatus getStatus() {
        return this.f40100b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeSerializable(this.f40100b);
        cd.aY_(this.f40103e, parcel);
        cd.aY_(this.f40099a, parcel);
        cd.aY_(this.f40102d, parcel);
        cd.aY_(this.f40101c, parcel);
    }

    public FaceTecIDScanResult(@NonNull FaceTecIDScanStatus faceTecIDScanStatus) {
        this.f40103e = new ArrayList<>();
        this.f40099a = new ArrayList<>();
        this.f40100b = faceTecIDScanStatus;
    }
}
