package androidx.versionedparcelable;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.g0;
import androidx.collection.ArrayMap;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.Set;

/* JADX INFO: compiled from: VersionedParcelStream.java */
/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class b extends VersionedParcel {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Charset f23854j = Charset.forName("UTF-16");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DataInputStream f23855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DataOutputStream f23856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DataInputStream f23857c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public DataOutputStream f23858d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C0107b f23859e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f23860f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f23861g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f23862h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f23863i;

    /* JADX INFO: renamed from: androidx.versionedparcelable.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: VersionedParcelStream.java */
    public static class C0107b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ByteArrayOutputStream f23865a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final DataOutputStream f23866b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f23867c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final DataOutputStream f23868d;

        public C0107b(int i10, DataOutputStream dataOutputStream) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            this.f23865a = byteArrayOutputStream;
            this.f23866b = new DataOutputStream(byteArrayOutputStream);
            this.f23867c = i10;
            this.f23868d = dataOutputStream;
        }
    }

    public b(InputStream inputStream, OutputStream outputStream) {
        this(inputStream, outputStream, new ArrayMap(), new ArrayMap(), new ArrayMap());
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void closeField() {
        C0107b c0107b = this.f23859e;
        if (c0107b != null) {
            try {
                if (c0107b.f23865a.size() != 0) {
                    C0107b c0107b2 = this.f23859e;
                    c0107b2.f23866b.flush();
                    ByteArrayOutputStream byteArrayOutputStream = c0107b2.f23865a;
                    int size = byteArrayOutputStream.size();
                    int i10 = c0107b2.f23867c << 16;
                    int i11 = size >= 65535 ? 65535 : size;
                    DataOutputStream dataOutputStream = c0107b2.f23868d;
                    dataOutputStream.writeInt(i10 | i11);
                    if (size >= 65535) {
                        dataOutputStream.writeInt(size);
                    }
                    byteArrayOutputStream.writeTo(dataOutputStream);
                }
                this.f23859e = null;
            } catch (IOException e5) {
                throw new VersionedParcel.ParcelException(e5);
            }
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final VersionedParcel createSubParcel() {
        return new b(this.f23857c, this.f23858d, this.mReadCache, this.mWriteCache, this.mParcelizerCache);
    }

    public final void h(Object obj) {
        if (obj == null) {
            writeInt(0);
            return;
        }
        if (obj instanceof Bundle) {
            writeInt(1);
            writeBundle((Bundle) obj);
            return;
        }
        if (obj instanceof String) {
            writeInt(3);
            writeString((String) obj);
            return;
        }
        if (obj instanceof String[]) {
            writeInt(4);
            writeArray((String[]) obj);
            return;
        }
        if (obj instanceof Boolean) {
            writeInt(5);
            writeBoolean(((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof boolean[]) {
            writeInt(6);
            writeBooleanArray((boolean[]) obj);
            return;
        }
        if (obj instanceof Double) {
            writeInt(7);
            writeDouble(((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof double[]) {
            writeInt(8);
            writeDoubleArray((double[]) obj);
            return;
        }
        if (obj instanceof Integer) {
            writeInt(9);
            writeInt(((Integer) obj).intValue());
            return;
        }
        if (obj instanceof int[]) {
            writeInt(10);
            writeIntArray((int[]) obj);
            return;
        }
        if (obj instanceof Long) {
            writeInt(11);
            writeLong(((Long) obj).longValue());
            return;
        }
        if (obj instanceof long[]) {
            writeInt(12);
            writeLongArray((long[]) obj);
        } else if (obj instanceof Float) {
            writeInt(13);
            writeFloat(((Float) obj).floatValue());
        } else if (obj instanceof float[]) {
            writeInt(14);
            writeFloatArray((float[]) obj);
        } else {
            throw new IllegalArgumentException("Unsupported type " + obj.getClass());
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final boolean isStream() {
        return true;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final boolean readBoolean() {
        try {
            return this.f23857c.readBoolean();
        } catch (IOException e5) {
            throw new VersionedParcel.ParcelException(e5);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final Bundle readBundle() {
        int i10 = readInt();
        if (i10 < 0) {
            return null;
        }
        Bundle bundle = new Bundle();
        for (int i11 = 0; i11 < i10; i11++) {
            String string = readString();
            int i12 = readInt();
            switch (i12) {
                case 0:
                    bundle.putParcelable(string, null);
                    break;
                case 1:
                    bundle.putBundle(string, readBundle());
                    break;
                case 2:
                    bundle.putBundle(string, readBundle());
                    break;
                case 3:
                    bundle.putString(string, readString());
                    break;
                case 4:
                    bundle.putStringArray(string, (String[]) readArray(new String[0]));
                    break;
                case 5:
                    bundle.putBoolean(string, readBoolean());
                    break;
                case 6:
                    bundle.putBooleanArray(string, readBooleanArray());
                    break;
                case 7:
                    bundle.putDouble(string, readDouble());
                    break;
                case 8:
                    bundle.putDoubleArray(string, readDoubleArray());
                    break;
                case 9:
                    bundle.putInt(string, readInt());
                    break;
                case 10:
                    bundle.putIntArray(string, readIntArray());
                    break;
                case 11:
                    bundle.putLong(string, readLong());
                    break;
                case 12:
                    bundle.putLongArray(string, readLongArray());
                    break;
                case 13:
                    bundle.putFloat(string, readFloat());
                    break;
                case 14:
                    bundle.putFloatArray(string, readFloatArray());
                    break;
                default:
                    throw new RuntimeException(g0.c("Unknown type ", i12));
            }
        }
        return bundle;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final byte[] readByteArray() {
        DataInputStream dataInputStream = this.f23857c;
        try {
            int i10 = dataInputStream.readInt();
            if (i10 <= 0) {
                return null;
            }
            byte[] bArr = new byte[i10];
            dataInputStream.readFully(bArr);
            return bArr;
        } catch (IOException e5) {
            throw new VersionedParcel.ParcelException(e5);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final CharSequence readCharSequence() {
        return null;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final double readDouble() {
        try {
            return this.f23857c.readDouble();
        } catch (IOException e5) {
            throw new VersionedParcel.ParcelException(e5);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final boolean readField(int i10) {
        while (true) {
            try {
                int i11 = this.f23862h;
                if (i11 == i10) {
                    return true;
                }
                if (String.valueOf(i11).compareTo(String.valueOf(i10)) > 0) {
                    return false;
                }
                int i12 = this.f23861g;
                int i13 = this.f23863i;
                DataInputStream dataInputStream = this.f23855a;
                if (i12 < i13) {
                    dataInputStream.skip(i13 - i12);
                }
                this.f23863i = -1;
                int i14 = dataInputStream.readInt();
                this.f23861g = 0;
                int i15 = i14 & 65535;
                if (i15 == 65535) {
                    i15 = dataInputStream.readInt();
                }
                this.f23862h = (i14 >> 16) & 65535;
                this.f23863i = i15;
            } catch (IOException unused) {
                return false;
            }
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final float readFloat() {
        try {
            return this.f23857c.readFloat();
        } catch (IOException e5) {
            throw new VersionedParcel.ParcelException(e5);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final int readInt() {
        try {
            return this.f23857c.readInt();
        } catch (IOException e5) {
            throw new VersionedParcel.ParcelException(e5);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final long readLong() {
        try {
            return this.f23857c.readLong();
        } catch (IOException e5) {
            throw new VersionedParcel.ParcelException(e5);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final <T extends Parcelable> T readParcelable() {
        return null;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final String readString() {
        DataInputStream dataInputStream = this.f23857c;
        try {
            int i10 = dataInputStream.readInt();
            if (i10 <= 0) {
                return null;
            }
            byte[] bArr = new byte[i10];
            dataInputStream.readFully(bArr);
            return new String(bArr, f23854j);
        } catch (IOException e5) {
            throw new VersionedParcel.ParcelException(e5);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final IBinder readStrongBinder() {
        return null;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void setOutputField(int i10) {
        closeField();
        C0107b c0107b = new C0107b(i10, this.f23856b);
        this.f23859e = c0107b;
        this.f23858d = c0107b.f23866b;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void setSerializationFlags(boolean z10, boolean z11) {
        if (!z10) {
            throw new RuntimeException("Serialization of this object is not allowed");
        }
        this.f23860f = z11;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void writeBoolean(boolean z10) {
        try {
            this.f23858d.writeBoolean(z10);
        } catch (IOException e5) {
            throw new VersionedParcel.ParcelException(e5);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void writeBundle(Bundle bundle) {
        try {
            if (bundle == null) {
                this.f23858d.writeInt(-1);
                return;
            }
            Set<String> setKeySet = bundle.keySet();
            this.f23858d.writeInt(setKeySet.size());
            for (String str : setKeySet) {
                writeString(str);
                h(bundle.get(str));
            }
        } catch (IOException e5) {
            throw new VersionedParcel.ParcelException(e5);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void writeByteArray(byte[] bArr) {
        try {
            if (bArr != null) {
                this.f23858d.writeInt(bArr.length);
                this.f23858d.write(bArr);
            } else {
                this.f23858d.writeInt(-1);
            }
        } catch (IOException e5) {
            throw new VersionedParcel.ParcelException(e5);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void writeCharSequence(CharSequence charSequence) {
        if (!this.f23860f) {
            throw new RuntimeException("CharSequence cannot be written to an OutputStream");
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void writeDouble(double d2) {
        try {
            this.f23858d.writeDouble(d2);
        } catch (IOException e5) {
            throw new VersionedParcel.ParcelException(e5);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void writeFloat(float f6) {
        try {
            this.f23858d.writeFloat(f6);
        } catch (IOException e5) {
            throw new VersionedParcel.ParcelException(e5);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void writeInt(int i10) {
        try {
            this.f23858d.writeInt(i10);
        } catch (IOException e5) {
            throw new VersionedParcel.ParcelException(e5);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void writeLong(long j10) {
        try {
            this.f23858d.writeLong(j10);
        } catch (IOException e5) {
            throw new VersionedParcel.ParcelException(e5);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void writeParcelable(Parcelable parcelable) {
        if (!this.f23860f) {
            throw new RuntimeException("Parcelables cannot be written to an OutputStream");
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void writeString(String str) {
        try {
            if (str != null) {
                byte[] bytes = str.getBytes(f23854j);
                this.f23858d.writeInt(bytes.length);
                this.f23858d.write(bytes);
            } else {
                this.f23858d.writeInt(-1);
            }
        } catch (IOException e5) {
            throw new VersionedParcel.ParcelException(e5);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void writeStrongBinder(IBinder iBinder) {
        if (!this.f23860f) {
            throw new RuntimeException("Binders cannot be written to an OutputStream");
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void writeStrongInterface(IInterface iInterface) {
        if (!this.f23860f) {
            throw new RuntimeException("Binders cannot be written to an OutputStream");
        }
    }

    public b(InputStream inputStream, OutputStream outputStream, ArrayMap<String, Method> arrayMap, ArrayMap<String, Method> arrayMap2, ArrayMap<String, Class> arrayMap3) {
        super(arrayMap, arrayMap2, arrayMap3);
        this.f23861g = 0;
        this.f23862h = -1;
        this.f23863i = -1;
        DataInputStream dataInputStream = inputStream != null ? new DataInputStream(new a(inputStream)) : null;
        this.f23855a = dataInputStream;
        DataOutputStream dataOutputStream = outputStream != null ? new DataOutputStream(outputStream) : null;
        this.f23856b = dataOutputStream;
        this.f23857c = dataInputStream;
        this.f23858d = dataOutputStream;
    }

    /* JADX INFO: compiled from: VersionedParcelStream.java */
    public class a extends FilterInputStream {
        public a(InputStream inputStream) {
            super(inputStream);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final int read() throws IOException {
            b bVar = b.this;
            int i10 = bVar.f23863i;
            if (i10 != -1 && bVar.f23861g >= i10) {
                throw new IOException();
            }
            int i11 = super.read();
            bVar.f23861g++;
            return i11;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final long skip(long j10) throws IOException {
            b bVar = b.this;
            int i10 = bVar.f23863i;
            if (i10 != -1 && bVar.f23861g >= i10) {
                throw new IOException();
            }
            long jSkip = super.skip(j10);
            if (jSkip > 0) {
                bVar.f23861g += (int) jSkip;
            }
            return jSkip;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final int read(byte[] bArr, int i10, int i11) throws IOException {
            b bVar = b.this;
            int i12 = bVar.f23863i;
            if (i12 != -1 && bVar.f23861g >= i12) {
                throw new IOException();
            }
            int i13 = super.read(bArr, i10, i11);
            if (i13 > 0) {
                bVar.f23861g += i13;
            }
            return i13;
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void writeByteArray(byte[] bArr, int i10, int i11) {
        try {
            if (bArr != null) {
                this.f23858d.writeInt(i11);
                this.f23858d.write(bArr, i10, i11);
            } else {
                this.f23858d.writeInt(-1);
            }
        } catch (IOException e5) {
            throw new VersionedParcel.ParcelException(e5);
        }
    }
}
