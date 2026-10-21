package androidx.versionedparcelable;

import ad.d;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import androidx.annotation.RestrictTo;
import androidx.collection.ArrayMap;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: VersionedParcelParcel.java */
/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class a extends VersionedParcel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseIntArray f23846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Parcel f23847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f23848c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f23849d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f23850e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f23851f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f23852g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f23853h;

    public a(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new ArrayMap(), new ArrayMap(), new ArrayMap());
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void closeField() {
        int i10 = this.f23851f;
        if (i10 >= 0) {
            int i11 = this.f23846a.get(i10);
            Parcel parcel = this.f23847b;
            int iDataPosition = parcel.dataPosition();
            parcel.setDataPosition(i11);
            parcel.writeInt(iDataPosition - i11);
            parcel.setDataPosition(iDataPosition);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final VersionedParcel createSubParcel() {
        Parcel parcel = this.f23847b;
        int iDataPosition = parcel.dataPosition();
        int i10 = this.f23852g;
        if (i10 == this.f23848c) {
            i10 = this.f23849d;
        }
        return new a(parcel, iDataPosition, i10, d.f(new StringBuilder(), this.f23850e, "  "), this.mReadCache, this.mWriteCache, this.mParcelizerCache);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final boolean readBoolean() {
        return this.f23847b.readInt() != 0;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final Bundle readBundle() {
        return this.f23847b.readBundle(a.class.getClassLoader());
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final byte[] readByteArray() {
        Parcel parcel = this.f23847b;
        int i10 = parcel.readInt();
        if (i10 < 0) {
            return null;
        }
        byte[] bArr = new byte[i10];
        parcel.readByteArray(bArr);
        return bArr;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final CharSequence readCharSequence() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f23847b);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final double readDouble() {
        return this.f23847b.readDouble();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final boolean readField(int i10) {
        while (this.f23852g < this.f23849d) {
            int i11 = this.f23853h;
            if (i11 == i10) {
                return true;
            }
            if (String.valueOf(i11).compareTo(String.valueOf(i10)) > 0) {
                return false;
            }
            int i12 = this.f23852g;
            Parcel parcel = this.f23847b;
            parcel.setDataPosition(i12);
            int i13 = parcel.readInt();
            this.f23853h = parcel.readInt();
            this.f23852g += i13;
        }
        return this.f23853h == i10;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final float readFloat() {
        return this.f23847b.readFloat();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final int readInt() {
        return this.f23847b.readInt();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final long readLong() {
        return this.f23847b.readLong();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final <T extends Parcelable> T readParcelable() {
        return (T) this.f23847b.readParcelable(a.class.getClassLoader());
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final String readString() {
        return this.f23847b.readString();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final IBinder readStrongBinder() {
        return this.f23847b.readStrongBinder();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void setOutputField(int i10) {
        closeField();
        this.f23851f = i10;
        this.f23846a.put(i10, this.f23847b.dataPosition());
        writeInt(0);
        writeInt(i10);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void writeBoolean(boolean z10) {
        this.f23847b.writeInt(z10 ? 1 : 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void writeBundle(Bundle bundle) {
        this.f23847b.writeBundle(bundle);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void writeByteArray(byte[] bArr) {
        Parcel parcel = this.f23847b;
        if (bArr == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void writeCharSequence(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f23847b, 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void writeDouble(double d2) {
        this.f23847b.writeDouble(d2);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void writeFloat(float f6) {
        this.f23847b.writeFloat(f6);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void writeInt(int i10) {
        this.f23847b.writeInt(i10);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void writeLong(long j10) {
        this.f23847b.writeLong(j10);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void writeParcelable(Parcelable parcelable) {
        this.f23847b.writeParcelable(parcelable, 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void writeString(String str) {
        this.f23847b.writeString(str);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void writeStrongBinder(IBinder iBinder) {
        this.f23847b.writeStrongBinder(iBinder);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void writeStrongInterface(IInterface iInterface) {
        this.f23847b.writeStrongInterface(iInterface);
    }

    public a(Parcel parcel, int i10, int i11, String str, ArrayMap<String, Method> arrayMap, ArrayMap<String, Method> arrayMap2, ArrayMap<String, Class> arrayMap3) {
        super(arrayMap, arrayMap2, arrayMap3);
        this.f23846a = new SparseIntArray();
        this.f23851f = -1;
        this.f23853h = -1;
        this.f23847b = parcel;
        this.f23848c = i10;
        this.f23849d = i11;
        this.f23852g = i10;
        this.f23850e = str;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void writeByteArray(byte[] bArr, int i10, int i11) {
        Parcel parcel = this.f23847b;
        if (bArr != null) {
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr, i10, i11);
        } else {
            parcel.writeInt(-1);
        }
    }
}
