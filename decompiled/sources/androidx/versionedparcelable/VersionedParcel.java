package androidx.versionedparcelable;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.NetworkOnMainThreadException;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseBooleanArray;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.camera.camera2.internal.h0;
import androidx.collection.ArrayMap;
import androidx.collection.ArraySet;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public abstract class VersionedParcel {
    protected final ArrayMap<String, Class> mParcelizerCache;
    protected final ArrayMap<String, Method> mReadCache;
    protected final ArrayMap<String, Method> mWriteCache;

    public static class ParcelException extends RuntimeException {
        public ParcelException(Throwable th2) {
            super(th2);
        }
    }

    public class a extends ObjectInputStream {
        @Override // java.io.ObjectInputStream
        public final Class<?> resolveClass(ObjectStreamClass objectStreamClass) throws ClassNotFoundException, IOException {
            Class<?> cls = Class.forName(objectStreamClass.getName(), false, a.class.getClassLoader());
            return cls != null ? cls : super.resolveClass(objectStreamClass);
        }
    }

    public VersionedParcel(ArrayMap<String, Method> arrayMap, ArrayMap<String, Method> arrayMap2, ArrayMap<String, Class> arrayMap3) {
        this.mReadCache = arrayMap;
        this.mWriteCache = arrayMap2;
        this.mParcelizerCache = arrayMap3;
    }

    public static int c(Object obj) {
        if (obj instanceof String) {
            return 4;
        }
        if (obj instanceof Parcelable) {
            return 2;
        }
        if (obj instanceof VersionedParcelable) {
            return 1;
        }
        if (obj instanceof Serializable) {
            return 3;
        }
        if (obj instanceof IBinder) {
            return 5;
        }
        if (obj instanceof Integer) {
            return 7;
        }
        if (obj instanceof Float) {
            return 8;
        }
        throw new IllegalArgumentException(obj.getClass().getName().concat(" cannot be VersionedParcelled"));
    }

    @NonNull
    public static Throwable getRootCause(@NonNull Throwable th2) {
        while (th2.getCause() != null) {
            th2 = th2.getCause();
        }
        return th2;
    }

    public final Class a(Class<? extends VersionedParcelable> cls) throws ClassNotFoundException {
        Class cls2 = this.mParcelizerCache.get(cls.getName());
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
        this.mParcelizerCache.put(cls.getName(), cls3);
        return cls3;
    }

    public final Method b(String str) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        Method method = this.mReadCache.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, VersionedParcel.class.getClassLoader()).getDeclaredMethod("read", VersionedParcel.class);
        this.mReadCache.put(str, declaredMethod);
        return declaredMethod;
    }

    public abstract void closeField();

    public abstract VersionedParcel createSubParcel();

    /* JADX WARN: Multi-variable type inference failed */
    public final Method d(Class cls) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        Method method = this.mWriteCache.get(cls.getName());
        if (method != null) {
            return method;
        }
        Class clsA = a(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsA.getDeclaredMethod("write", cls, VersionedParcel.class);
        this.mWriteCache.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public final <T, S extends Collection<T>> S e(S s4) {
        int i10 = readInt();
        if (i10 < 0) {
            return null;
        }
        if (i10 != 0) {
            int i11 = readInt();
            if (i10 < 0) {
                return null;
            }
            if (i11 == 1) {
                while (i10 > 0) {
                    s4.add(readVersionedParcelable());
                    i10--;
                }
            } else if (i11 == 2) {
                while (i10 > 0) {
                    s4.add(readParcelable());
                    i10--;
                }
            } else if (i11 == 3) {
                while (i10 > 0) {
                    s4.add(readSerializable());
                    i10--;
                }
            } else if (i11 == 4) {
                while (i10 > 0) {
                    s4.add(readString());
                    i10--;
                }
            } else if (i11 == 5) {
                while (i10 > 0) {
                    s4.add(readStrongBinder());
                    i10--;
                }
            }
        }
        return s4;
    }

    public final <T> void f(Collection<T> collection) {
        if (collection == null) {
            writeInt(-1);
        }
        int size = collection.size();
        writeInt(size);
        if (size > 0) {
            int iC = c(collection.iterator().next());
            writeInt(iC);
            switch (iC) {
                case 1:
                    Iterator<T> it = collection.iterator();
                    while (it.hasNext()) {
                        writeVersionedParcelable((VersionedParcelable) it.next());
                    }
                    break;
                case 2:
                    Iterator<T> it2 = collection.iterator();
                    while (it2.hasNext()) {
                        writeParcelable((Parcelable) it2.next());
                    }
                    break;
                case 3:
                    Iterator<T> it3 = collection.iterator();
                    while (it3.hasNext()) {
                        g((Serializable) it3.next());
                    }
                    break;
                case 4:
                    Iterator<T> it4 = collection.iterator();
                    while (it4.hasNext()) {
                        writeString((String) it4.next());
                    }
                    break;
                case 5:
                    Iterator<T> it5 = collection.iterator();
                    while (it5.hasNext()) {
                        writeStrongBinder((IBinder) it5.next());
                    }
                    break;
                case 7:
                    Iterator<T> it6 = collection.iterator();
                    while (it6.hasNext()) {
                        writeInt(((Integer) it6.next()).intValue());
                    }
                    break;
                case 8:
                    Iterator<T> it7 = collection.iterator();
                    while (it7.hasNext()) {
                        writeFloat(((Float) it7.next()).floatValue());
                    }
                    break;
            }
        }
    }

    public final void g(Serializable serializable) {
        if (serializable == null) {
            writeString(null);
            return;
        }
        String name = serializable.getClass().getName();
        writeString(name);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(serializable);
            objectOutputStream.close();
            writeByteArray(byteArrayOutputStream.toByteArray());
        } catch (IOException e5) {
            throw new RuntimeException(h0.b("VersionedParcelable encountered IOException writing serializable object (name = ", name, ")"), e5);
        }
    }

    public boolean isStream() {
        return false;
    }

    public <T> T[] readArray(T[] tArr, int i10) {
        return !readField(i10) ? tArr : (T[]) readArray(tArr);
    }

    public abstract boolean readBoolean();

    public boolean readBoolean(boolean z10, int i10) {
        return !readField(i10) ? z10 : readBoolean();
    }

    public boolean[] readBooleanArray(boolean[] zArr, int i10) {
        return !readField(i10) ? zArr : readBooleanArray();
    }

    public abstract Bundle readBundle();

    public Bundle readBundle(Bundle bundle, int i10) {
        return !readField(i10) ? bundle : readBundle();
    }

    public byte readByte(byte b10, int i10) {
        return !readField(i10) ? b10 : (byte) (readInt() & 255);
    }

    public abstract byte[] readByteArray();

    public byte[] readByteArray(byte[] bArr, int i10) {
        return !readField(i10) ? bArr : readByteArray();
    }

    public char[] readCharArray(char[] cArr, int i10) {
        if (!readField(i10)) {
            return cArr;
        }
        int i11 = readInt();
        if (i11 < 0) {
            return null;
        }
        char[] cArr2 = new char[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            cArr2[i12] = (char) readInt();
        }
        return cArr2;
    }

    public abstract CharSequence readCharSequence();

    public CharSequence readCharSequence(CharSequence charSequence, int i10) {
        return !readField(i10) ? charSequence : readCharSequence();
    }

    public abstract double readDouble();

    public double readDouble(double d2, int i10) {
        return !readField(i10) ? d2 : readDouble();
    }

    public double[] readDoubleArray(double[] dArr, int i10) {
        return !readField(i10) ? dArr : readDoubleArray();
    }

    public Exception readException(Exception exc, int i10) {
        int i11;
        if (!readField(i10) || (i11 = readInt()) == 0) {
            return exc;
        }
        String string = readString();
        switch (i11) {
            case -9:
                return (Exception) readParcelable();
            case -8:
            default:
                return new RuntimeException("Unknown exception code: " + i11 + " msg " + string);
            case -7:
                return new UnsupportedOperationException(string);
            case -6:
                return new NetworkOnMainThreadException();
            case -5:
                return new IllegalStateException(string);
            case -4:
                return new NullPointerException(string);
            case -3:
                return new IllegalArgumentException(string);
            case -2:
                return new BadParcelableException(string);
            case -1:
                return new SecurityException(string);
        }
    }

    public abstract boolean readField(int i10);

    public abstract float readFloat();

    public float readFloat(float f6, int i10) {
        return !readField(i10) ? f6 : readFloat();
    }

    public float[] readFloatArray(float[] fArr, int i10) {
        return !readField(i10) ? fArr : readFloatArray();
    }

    public <T extends VersionedParcelable> T readFromParcel(String str, VersionedParcel versionedParcel) {
        try {
            return (T) b(str).invoke(null, versionedParcel);
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e5);
        } catch (IllegalAccessException e7) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e7);
        } catch (NoSuchMethodException e10) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e10);
        } catch (InvocationTargetException e11) {
            if (e11.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e11.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e11);
        }
    }

    public abstract int readInt();

    public int readInt(int i10, int i11) {
        return !readField(i11) ? i10 : readInt();
    }

    public int[] readIntArray(int[] iArr, int i10) {
        return !readField(i10) ? iArr : readIntArray();
    }

    public <T> List<T> readList(List<T> list, int i10) {
        return !readField(i10) ? list : (List) e(new ArrayList());
    }

    public abstract long readLong();

    public long readLong(long j10, int i10) {
        return !readField(i10) ? j10 : readLong();
    }

    public long[] readLongArray(long[] jArr, int i10) {
        return !readField(i10) ? jArr : readLongArray();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <K, V> Map<K, V> readMap(Map<K, V> map, int i10) {
        if (!readField(i10)) {
            return map;
        }
        int i11 = readInt();
        if (i11 < 0) {
            return null;
        }
        ArrayMap arrayMap = new ArrayMap();
        if (i11 == 0) {
            return arrayMap;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        e(arrayList);
        e(arrayList2);
        for (int i12 = 0; i12 < i11; i12++) {
            arrayMap.put(arrayList.get(i12), arrayList2.get(i12));
        }
        return arrayMap;
    }

    public abstract <T extends Parcelable> T readParcelable();

    public <T extends Parcelable> T readParcelable(T t10, int i10) {
        return !readField(i10) ? t10 : (T) readParcelable();
    }

    public Serializable readSerializable() {
        String string = readString();
        if (string == null) {
            return null;
        }
        try {
            return (Serializable) new a(new ByteArrayInputStream(readByteArray())).readObject();
        } catch (IOException e5) {
            throw new RuntimeException(h0.b("VersionedParcelable encountered IOException reading a Serializable object (name = ", string, ")"), e5);
        } catch (ClassNotFoundException e7) {
            throw new RuntimeException(h0.b("VersionedParcelable encountered ClassNotFoundException reading a Serializable object (name = ", string, ")"), e7);
        }
    }

    public <T> Set<T> readSet(Set<T> set, int i10) {
        return !readField(i10) ? set : (Set) e(new ArraySet());
    }

    @RequiresApi(api = 21)
    public Size readSize(Size size, int i10) {
        if (!readField(i10)) {
            return size;
        }
        if (readBoolean()) {
            return new Size(readInt(), readInt());
        }
        return null;
    }

    @RequiresApi(api = 21)
    public SizeF readSizeF(SizeF sizeF, int i10) {
        if (!readField(i10)) {
            return sizeF;
        }
        if (readBoolean()) {
            return new SizeF(readFloat(), readFloat());
        }
        return null;
    }

    public SparseBooleanArray readSparseBooleanArray(SparseBooleanArray sparseBooleanArray, int i10) {
        if (!readField(i10)) {
            return sparseBooleanArray;
        }
        int i11 = readInt();
        if (i11 < 0) {
            return null;
        }
        SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray(i11);
        for (int i12 = 0; i12 < i11; i12++) {
            sparseBooleanArray2.put(readInt(), readBoolean());
        }
        return sparseBooleanArray2;
    }

    public abstract String readString();

    public String readString(String str, int i10) {
        return !readField(i10) ? str : readString();
    }

    public abstract IBinder readStrongBinder();

    public IBinder readStrongBinder(IBinder iBinder, int i10) {
        return !readField(i10) ? iBinder : readStrongBinder();
    }

    public <T extends VersionedParcelable> T readVersionedParcelable(T t10, int i10) {
        return !readField(i10) ? t10 : (T) readVersionedParcelable();
    }

    public abstract void setOutputField(int i10);

    public <T> void writeArray(T[] tArr, int i10) {
        setOutputField(i10);
        writeArray(tArr);
    }

    public abstract void writeBoolean(boolean z10);

    public void writeBoolean(boolean z10, int i10) {
        setOutputField(i10);
        writeBoolean(z10);
    }

    public void writeBooleanArray(boolean[] zArr, int i10) {
        setOutputField(i10);
        writeBooleanArray(zArr);
    }

    public abstract void writeBundle(Bundle bundle);

    public void writeBundle(Bundle bundle, int i10) {
        setOutputField(i10);
        writeBundle(bundle);
    }

    public void writeByte(byte b10, int i10) {
        setOutputField(i10);
        writeInt(b10);
    }

    public abstract void writeByteArray(byte[] bArr);

    public void writeByteArray(byte[] bArr, int i10) {
        setOutputField(i10);
        writeByteArray(bArr);
    }

    public abstract void writeByteArray(byte[] bArr, int i10, int i11);

    public void writeCharArray(char[] cArr, int i10) {
        setOutputField(i10);
        if (cArr == null) {
            writeInt(-1);
            return;
        }
        writeInt(cArr.length);
        for (char c10 : cArr) {
            writeInt(c10);
        }
    }

    public abstract void writeCharSequence(CharSequence charSequence);

    public void writeCharSequence(CharSequence charSequence, int i10) {
        setOutputField(i10);
        writeCharSequence(charSequence);
    }

    public abstract void writeDouble(double d2);

    public void writeDouble(double d2, int i10) {
        setOutputField(i10);
        writeDouble(d2);
    }

    public void writeDoubleArray(double[] dArr, int i10) {
        setOutputField(i10);
        writeDoubleArray(dArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void writeException(Exception exc, int i10) {
        int i11;
        setOutputField(i10);
        if (exc == 0) {
            writeNoException();
            return;
        }
        if ((exc instanceof Parcelable) && exc.getClass().getClassLoader() == Parcelable.class.getClassLoader()) {
            i11 = -9;
        } else if (exc instanceof SecurityException) {
            i11 = -1;
        } else if (exc instanceof BadParcelableException) {
            i11 = -2;
        } else if (exc instanceof IllegalArgumentException) {
            i11 = -3;
        } else if (exc instanceof NullPointerException) {
            i11 = -4;
        } else if (exc instanceof IllegalStateException) {
            i11 = -5;
        } else if (exc instanceof NetworkOnMainThreadException) {
            i11 = -6;
        } else {
            i11 = exc instanceof UnsupportedOperationException ? -7 : 0;
        }
        writeInt(i11);
        if (i11 == 0) {
            if (!(exc instanceof RuntimeException)) {
                throw new RuntimeException(exc);
            }
            throw ((RuntimeException) exc);
        }
        writeString(exc.getMessage());
        if (i11 != -9) {
            return;
        }
        writeParcelable((Parcelable) exc);
    }

    public abstract void writeFloat(float f6);

    public void writeFloat(float f6, int i10) {
        setOutputField(i10);
        writeFloat(f6);
    }

    public void writeFloatArray(float[] fArr, int i10) {
        setOutputField(i10);
        writeFloatArray(fArr);
    }

    public abstract void writeInt(int i10);

    public void writeInt(int i10, int i11) {
        setOutputField(i11);
        writeInt(i10);
    }

    public void writeIntArray(int[] iArr, int i10) {
        setOutputField(i10);
        writeIntArray(iArr);
    }

    public <T> void writeList(List<T> list, int i10) {
        setOutputField(i10);
        f(list);
    }

    public abstract void writeLong(long j10);

    public void writeLong(long j10, int i10) {
        setOutputField(i10);
        writeLong(j10);
    }

    public void writeLongArray(long[] jArr, int i10) {
        setOutputField(i10);
        writeLongArray(jArr);
    }

    public <K, V> void writeMap(Map<K, V> map, int i10) {
        setOutputField(i10);
        if (map == null) {
            writeInt(-1);
            return;
        }
        int size = map.size();
        writeInt(size);
        if (size == 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            arrayList.add(entry.getKey());
            arrayList2.add(entry.getValue());
        }
        f(arrayList);
        f(arrayList2);
    }

    public void writeNoException() {
        writeInt(0);
    }

    public abstract void writeParcelable(Parcelable parcelable);

    public void writeParcelable(Parcelable parcelable, int i10) {
        setOutputField(i10);
        writeParcelable(parcelable);
    }

    public void writeSerializable(Serializable serializable, int i10) {
        setOutputField(i10);
        g(serializable);
    }

    public <T> void writeSet(Set<T> set, int i10) {
        setOutputField(i10);
        f(set);
    }

    @RequiresApi(api = 21)
    public void writeSize(Size size, int i10) {
        setOutputField(i10);
        writeBoolean(size != null);
        if (size != null) {
            writeInt(size.getWidth());
            writeInt(size.getHeight());
        }
    }

    @RequiresApi(api = 21)
    public void writeSizeF(SizeF sizeF, int i10) {
        setOutputField(i10);
        writeBoolean(sizeF != null);
        if (sizeF != null) {
            writeFloat(sizeF.getWidth());
            writeFloat(sizeF.getHeight());
        }
    }

    public void writeSparseBooleanArray(SparseBooleanArray sparseBooleanArray, int i10) {
        setOutputField(i10);
        if (sparseBooleanArray == null) {
            writeInt(-1);
            return;
        }
        int size = sparseBooleanArray.size();
        writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            writeInt(sparseBooleanArray.keyAt(i11));
            writeBoolean(sparseBooleanArray.valueAt(i11));
        }
    }

    public abstract void writeString(String str);

    public void writeString(String str, int i10) {
        setOutputField(i10);
        writeString(str);
    }

    public abstract void writeStrongBinder(IBinder iBinder);

    public void writeStrongBinder(IBinder iBinder, int i10) {
        setOutputField(i10);
        writeStrongBinder(iBinder);
    }

    public abstract void writeStrongInterface(IInterface iInterface);

    public void writeStrongInterface(IInterface iInterface, int i10) {
        setOutputField(i10);
        writeStrongInterface(iInterface);
    }

    public <T extends VersionedParcelable> void writeToParcel(T t10, VersionedParcel versionedParcel) {
        try {
            d(t10.getClass()).invoke(null, t10, versionedParcel);
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e5);
        } catch (IllegalAccessException e7) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e7);
        } catch (NoSuchMethodException e10) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e10);
        } catch (InvocationTargetException e11) {
            if (!(e11.getCause() instanceof RuntimeException)) {
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e11);
            }
            throw ((RuntimeException) e11.getCause());
        }
    }

    public void writeVersionedParcelable(VersionedParcelable versionedParcelable, int i10) {
        setOutputField(i10);
        writeVersionedParcelable(versionedParcelable);
    }

    public <T> T[] readArray(T[] tArr) {
        int i10 = readInt();
        if (i10 < 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(i10);
        if (i10 != 0) {
            int i11 = readInt();
            if (i10 < 0) {
                return null;
            }
            if (i11 == 1) {
                while (i10 > 0) {
                    arrayList.add(readVersionedParcelable());
                    i10--;
                }
            } else if (i11 == 2) {
                while (i10 > 0) {
                    arrayList.add(readParcelable());
                    i10--;
                }
            } else if (i11 == 3) {
                while (i10 > 0) {
                    arrayList.add(readSerializable());
                    i10--;
                }
            } else if (i11 == 4) {
                while (i10 > 0) {
                    arrayList.add(readString());
                    i10--;
                }
            } else if (i11 == 5) {
                while (i10 > 0) {
                    arrayList.add(readStrongBinder());
                    i10--;
                }
            }
        }
        return (T[]) arrayList.toArray(tArr);
    }

    public boolean[] readBooleanArray() {
        int i10 = readInt();
        if (i10 < 0) {
            return null;
        }
        boolean[] zArr = new boolean[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            zArr[i11] = readInt() != 0;
        }
        return zArr;
    }

    public double[] readDoubleArray() {
        int i10 = readInt();
        if (i10 < 0) {
            return null;
        }
        double[] dArr = new double[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            dArr[i11] = readDouble();
        }
        return dArr;
    }

    public float[] readFloatArray() {
        int i10 = readInt();
        if (i10 < 0) {
            return null;
        }
        float[] fArr = new float[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            fArr[i11] = readFloat();
        }
        return fArr;
    }

    public int[] readIntArray() {
        int i10 = readInt();
        if (i10 < 0) {
            return null;
        }
        int[] iArr = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            iArr[i11] = readInt();
        }
        return iArr;
    }

    public long[] readLongArray() {
        int i10 = readInt();
        if (i10 < 0) {
            return null;
        }
        long[] jArr = new long[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            jArr[i11] = readLong();
        }
        return jArr;
    }

    public <T extends VersionedParcelable> T readVersionedParcelable() {
        String string = readString();
        if (string == null) {
            return null;
        }
        return (T) readFromParcel(string, createSubParcel());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> void writeArray(T[] tArr) {
        if (tArr == 0) {
            writeInt(-1);
            return;
        }
        int length = tArr.length;
        writeInt(length);
        if (length > 0) {
            int i10 = 0;
            int iC = c(tArr[0]);
            writeInt(iC);
            if (iC == 1) {
                while (i10 < length) {
                    writeVersionedParcelable((VersionedParcelable) tArr[i10]);
                    i10++;
                }
                return;
            }
            if (iC == 2) {
                while (i10 < length) {
                    writeParcelable((Parcelable) tArr[i10]);
                    i10++;
                }
                return;
            }
            if (iC == 3) {
                while (i10 < length) {
                    g((Serializable) tArr[i10]);
                    i10++;
                }
            } else if (iC == 4) {
                while (i10 < length) {
                    writeString((String) tArr[i10]);
                    i10++;
                }
            } else {
                if (iC != 5) {
                    return;
                }
                while (i10 < length) {
                    writeStrongBinder((IBinder) tArr[i10]);
                    i10++;
                }
            }
        }
    }

    public void writeBooleanArray(boolean[] zArr) {
        if (zArr != null) {
            writeInt(zArr.length);
            for (boolean z10 : zArr) {
                writeInt(z10 ? 1 : 0);
            }
            return;
        }
        writeInt(-1);
    }

    public void writeByteArray(byte[] bArr, int i10, int i11, int i12) {
        setOutputField(i12);
        writeByteArray(bArr, i10, i11);
    }

    public void writeDoubleArray(double[] dArr) {
        if (dArr != null) {
            writeInt(dArr.length);
            for (double d2 : dArr) {
                writeDouble(d2);
            }
            return;
        }
        writeInt(-1);
    }

    public void writeFloatArray(float[] fArr) {
        if (fArr != null) {
            writeInt(fArr.length);
            for (float f6 : fArr) {
                writeFloat(f6);
            }
            return;
        }
        writeInt(-1);
    }

    public void writeIntArray(int[] iArr) {
        if (iArr != null) {
            writeInt(iArr.length);
            for (int i10 : iArr) {
                writeInt(i10);
            }
            return;
        }
        writeInt(-1);
    }

    public void writeLongArray(long[] jArr) {
        if (jArr != null) {
            writeInt(jArr.length);
            for (long j10 : jArr) {
                writeLong(j10);
            }
            return;
        }
        writeInt(-1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void writeVersionedParcelable(VersionedParcelable versionedParcelable) {
        if (versionedParcelable == null) {
            writeString(null);
            return;
        }
        try {
            writeString(a(versionedParcelable.getClass()).getName());
            VersionedParcel versionedParcelCreateSubParcel = createSubParcel();
            writeToParcel(versionedParcelable, versionedParcelCreateSubParcel);
            versionedParcelCreateSubParcel.closeField();
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException(versionedParcelable.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
        }
    }

    public void setSerializationFlags(boolean z10, boolean z11) {
    }
}
