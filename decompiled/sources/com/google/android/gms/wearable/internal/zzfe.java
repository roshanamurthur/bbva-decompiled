package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.camera2.internal.n1;
import androidx.collection.f;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.MessageEvent;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes9.dex */
@SafeParcelable.Class(creator = "MessageEventParcelableCreator")
@SafeParcelable.Reserved({1})
public final class zzfe extends AbstractSafeParcelable implements MessageEvent {
    public static final Parcelable.Creator<zzfe> CREATOR = new zzff();

    @SafeParcelable.Field(getter = "getData", id = 4)
    private final byte[] data;

    @SafeParcelable.Field(getter = "getPath", id = 3)
    private final String zzcl;

    @SafeParcelable.Field(getter = "getRequestId", id = 2)
    private final int zzeh;

    @SafeParcelable.Field(getter = "getSourceNodeId", id = 5)
    private final String zzek;

    @SafeParcelable.Constructor
    public zzfe(@SafeParcelable.Param(id = 2) int i10, @SafeParcelable.Param(id = 3) String str, @SafeParcelable.Param(id = 4) byte[] bArr, @SafeParcelable.Param(id = 5) String str2) {
        this.zzeh = i10;
        this.zzcl = str;
        this.data = bArr;
        this.zzek = str2;
    }

    @Override // com.google.android.gms.wearable.MessageEvent
    public final byte[] getData() {
        return this.data;
    }

    @Override // com.google.android.gms.wearable.MessageEvent
    public final String getPath() {
        return this.zzcl;
    }

    @Override // com.google.android.gms.wearable.MessageEvent
    public final int getRequestId() {
        return this.zzeh;
    }

    @Override // com.google.android.gms.wearable.MessageEvent
    public final String getSourceNodeId() {
        return this.zzek;
    }

    public final String toString() {
        int i10 = this.zzeh;
        String str = this.zzcl;
        byte[] bArr = this.data;
        String strValueOf = String.valueOf(bArr == null ? AbstractJsonLexerKt.NULL : Integer.valueOf(bArr.length));
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + n1.b(str, 43));
        sb2.append("MessageEventParcelable[");
        sb2.append(i10);
        sb2.append(",");
        sb2.append(str);
        return f.c(sb2, ", size=", strValueOf, Constant.BRACKET_CLOSE);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, getRequestId());
        SafeParcelWriter.writeString(parcel, 3, getPath(), false);
        SafeParcelWriter.writeByteArray(parcel, 4, getData(), false);
        SafeParcelWriter.writeString(parcel, 5, getSourceNodeId(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
