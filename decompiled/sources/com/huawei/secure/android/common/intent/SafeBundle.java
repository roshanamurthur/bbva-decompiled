package com.huawei.secure.android.common.intent;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import androidx.datastore.preferences.protobuf.q;
import com.huawei.secure.android.common.activity.a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public class SafeBundle {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f50638b = "SafeBundle";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f50639c = "";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Bundle f50640a;

    public SafeBundle() {
        this(new Bundle());
    }

    public void clear() {
        try {
            this.f50640a.clear();
        } catch (Exception unused) {
            a.a(f50638b, "clear exception.");
        }
    }

    public boolean containsKey(String str) {
        try {
            return this.f50640a.containsKey(str);
        } catch (Exception unused) {
            a.a(f50638b, "containsKey exception. key:");
            return false;
        }
    }

    public Object get(String str) {
        try {
            return this.f50640a.get(str);
        } catch (Exception e5) {
            q.f(e5, new StringBuilder("get exception: "), f50638b, true);
            return null;
        }
    }

    @SuppressLint({"NewApi"})
    public IBinder getBinder(@Nullable String str) {
        try {
            return this.f50640a.getBinder(str);
        } catch (Exception e5) {
            q.f(e5, new StringBuilder("getBinder exception: "), f50638b, true);
            return null;
        }
    }

    public boolean getBoolean(String str) {
        return getBoolean(str, false);
    }

    public boolean[] getBooleanArray(String str) {
        try {
            return this.f50640a.getBooleanArray(str);
        } catch (Exception e5) {
            q.f(e5, new StringBuilder("getBooleanArray exception: "), f50638b, true);
            return new boolean[0];
        }
    }

    public boolean[] getBooleanArrayReturnNotNull(String str) {
        try {
            boolean[] booleanArray = this.f50640a.getBooleanArray(str);
            return booleanArray == null ? new boolean[0] : booleanArray;
        } catch (Exception e5) {
            q.f(e5, new StringBuilder("getBooleanArray exception: "), f50638b, true);
            return new boolean[0];
        }
    }

    public Bundle getBundle() {
        return this.f50640a;
    }

    public Bundle getBundleReturnNotNull(@Nullable String str) {
        try {
            Bundle bundle = this.f50640a.getBundle(str);
            return bundle == null ? new Bundle() : bundle;
        } catch (Exception e5) {
            a.a(f50638b, "getBundle exception: " + e5.getMessage(), true);
            return new Bundle();
        }
    }

    public byte getByte(String str) {
        try {
            return this.f50640a.getByte(str);
        } catch (Exception unused) {
            return (byte) 0;
        }
    }

    public byte[] getByteArray(String str) {
        try {
            return this.f50640a.getByteArray(str);
        } catch (Exception e5) {
            q.f(e5, new StringBuilder("getByteArray exception: "), f50638b, true);
            return new byte[0];
        }
    }

    public byte[] getByteArrayReturnNotNull(String str) {
        try {
            byte[] byteArray = this.f50640a.getByteArray(str);
            return byteArray == null ? new byte[0] : byteArray;
        } catch (Exception e5) {
            q.f(e5, new StringBuilder("getByteArray exception: "), f50638b, true);
            return new byte[0];
        }
    }

    public char getChar(String str) {
        try {
            return this.f50640a.getChar(str);
        } catch (Exception unused) {
            return (char) 0;
        }
    }

    public char[] getCharArray(String str) {
        try {
            return this.f50640a.getCharArray(str);
        } catch (Exception e5) {
            q.f(e5, new StringBuilder("getCharArray exception: "), f50638b, true);
            return new char[0];
        }
    }

    public char[] getCharArrayReturnNotNull(String str) {
        try {
            char[] charArray = this.f50640a.getCharArray(str);
            return charArray == null ? new char[0] : charArray;
        } catch (Exception e5) {
            q.f(e5, new StringBuilder("getCharArray exception: "), f50638b, true);
            return new char[0];
        }
    }

    public CharSequence getCharSequence(String str) {
        try {
            return this.f50640a.getCharSequence(str);
        } catch (Exception unused) {
            return "";
        }
    }

    public CharSequence[] getCharSequenceArray(String str) {
        try {
            return this.f50640a.getCharSequenceArray(str);
        } catch (Exception e5) {
            q.f(e5, new StringBuilder("getCharSequenceArray exception: "), f50638b, true);
            return new CharSequence[0];
        }
    }

    public ArrayList<CharSequence> getCharSequenceArrayList(String str) {
        try {
            return this.f50640a.getCharSequenceArrayList(str);
        } catch (Exception e5) {
            a.a(f50638b, "getCharSequenceArrayList exception: " + e5.getMessage(), true);
            return new ArrayList<>();
        }
    }

    public ArrayList<CharSequence> getCharSequenceArrayListReturnNotNull(String str) {
        try {
            ArrayList<CharSequence> charSequenceArrayList = this.f50640a.getCharSequenceArrayList(str);
            return charSequenceArrayList == null ? new ArrayList<>() : charSequenceArrayList;
        } catch (Exception e5) {
            a.a(f50638b, "getCharSequenceArrayList exception: " + e5.getMessage(), true);
            return new ArrayList<>();
        }
    }

    public CharSequence[] getCharSequenceArrayReturnNotNull(String str) {
        try {
            CharSequence[] charSequenceArray = this.f50640a.getCharSequenceArray(str);
            return charSequenceArray == null ? new CharSequence[0] : charSequenceArray;
        } catch (Exception e5) {
            q.f(e5, new StringBuilder("getCharSequenceArrayReturnNotNull exception: "), f50638b, true);
            return new CharSequence[0];
        }
    }

    public CharSequence getCharSequenceReturnNotNull(String str) {
        CharSequence charSequence;
        try {
            charSequence = this.f50640a.getCharSequence(str);
        } catch (Exception e5) {
            q.f(e5, new StringBuilder("getCharSequenceReturnNotNull exception: "), f50638b, true);
            charSequence = "";
        }
        return TextUtils.isEmpty(charSequence) ? "" : charSequence;
    }

    public double getDouble(String str) {
        return getDouble(str, 0.0d);
    }

    public double[] getDoubleArray(String str) {
        try {
            return this.f50640a.getDoubleArray(str);
        } catch (Exception e5) {
            q.f(e5, new StringBuilder("getDoubleArray exception: "), f50638b, true);
            return new double[0];
        }
    }

    public double[] getDoubleArrayReturnNotNull(String str) {
        try {
            double[] doubleArray = this.f50640a.getDoubleArray(str);
            return doubleArray == null ? new double[0] : doubleArray;
        } catch (Exception e5) {
            q.f(e5, new StringBuilder("getDoubleArray exception: "), f50638b, true);
            return new double[0];
        }
    }

    public float getFloat(String str) {
        return getFloat(str, 0.0f);
    }

    public float[] getFloatArray(String str) {
        try {
            return this.f50640a.getFloatArray(str);
        } catch (Exception e5) {
            q.f(e5, new StringBuilder("getFloatArray exception: "), f50638b, true);
            return new float[0];
        }
    }

    public float[] getFloatArrayReturnNotNull(String str) {
        try {
            float[] floatArray = this.f50640a.getFloatArray(str);
            return floatArray == null ? new float[0] : floatArray;
        } catch (Exception e5) {
            q.f(e5, new StringBuilder("getFloatArray exception: "), f50638b, true);
            return new float[0];
        }
    }

    public int getInt(String str) {
        return getInt(str, 0);
    }

    public int[] getIntArray(String str) {
        try {
            return this.f50640a.getIntArray(str);
        } catch (Exception e5) {
            q.f(e5, new StringBuilder("getIntArray exception: "), f50638b, true);
            return new int[0];
        }
    }

    public int[] getIntArrayReturnNotNull(String str) {
        try {
            int[] intArray = this.f50640a.getIntArray(str);
            return intArray == null ? new int[0] : intArray;
        } catch (Exception e5) {
            q.f(e5, new StringBuilder("getIntArray exception: "), f50638b, true);
            return new int[0];
        }
    }

    public ArrayList<Integer> getIntegerArrayList(String str) {
        try {
            return this.f50640a.getIntegerArrayList(str);
        } catch (Exception e5) {
            a.a(f50638b, "getIntegerArrayList exception: " + e5.getMessage(), true);
            return new ArrayList<>();
        }
    }

    public ArrayList<Integer> getIntegerArrayListReturnNotNull(String str) {
        try {
            ArrayList<Integer> integerArrayList = this.f50640a.getIntegerArrayList(str);
            return integerArrayList == null ? new ArrayList<>() : integerArrayList;
        } catch (Exception e5) {
            a.a(f50638b, "getIntegerArrayList exception: " + e5.getMessage(), true);
            return new ArrayList<>();
        }
    }

    public long getLong(String str) {
        return getLong(str, 0L);
    }

    public long[] getLongArray(String str) {
        try {
            return this.f50640a.getLongArray(str);
        } catch (Exception e5) {
            q.f(e5, new StringBuilder("getLongArray exception: "), f50638b, true);
            return new long[0];
        }
    }

    public long[] getLongArrayReturnNotNull(String str) {
        try {
            long[] longArray = this.f50640a.getLongArray(str);
            return longArray == null ? new long[0] : longArray;
        } catch (Exception e5) {
            q.f(e5, new StringBuilder("getLongArray exception: "), f50638b, true);
            return new long[0];
        }
    }

    public <T extends Parcelable> T getParcelable(String str) {
        try {
            return (T) this.f50640a.getParcelable(str);
        } catch (Exception e5) {
            q.f(e5, new StringBuilder("getParcelable exception: "), f50638b, true);
            return null;
        }
    }

    public Parcelable[] getParcelableArray(String str) {
        try {
            return this.f50640a.getParcelableArray(str);
        } catch (Exception e5) {
            q.f(e5, new StringBuilder("getParcelableArray exception: "), f50638b, true);
            return new Parcelable[0];
        }
    }

    public <T extends Parcelable> ArrayList<T> getParcelableArrayList(String str) {
        try {
            return this.f50640a.getParcelableArrayList(str);
        } catch (Exception e5) {
            q.f(e5, new StringBuilder("getParcelableArrayList exception: "), f50638b, true);
            return null;
        }
    }

    public Parcelable[] getParcelableArrayReturnNotNull(String str) {
        try {
            Parcelable[] parcelableArray = this.f50640a.getParcelableArray(str);
            return parcelableArray == null ? new Parcelable[0] : parcelableArray;
        } catch (Exception e5) {
            q.f(e5, new StringBuilder("getParcelableArray exception: "), f50638b, true);
            return new Parcelable[0];
        }
    }

    public Object getReturnNotNull(String str) {
        try {
            Object obj = this.f50640a.get(str);
            return obj == null ? new Object() : obj;
        } catch (Exception e5) {
            a.a(f50638b, "get exception: " + e5.getMessage(), true);
            return new Object();
        }
    }

    public Serializable getSerializable(String str) {
        try {
            return this.f50640a.getSerializable(str);
        } catch (Exception e5) {
            q.f(e5, new StringBuilder("getSerializable exception: "), f50638b, true);
            return null;
        }
    }

    public short getShort(String str) {
        try {
            return this.f50640a.getShort(str);
        } catch (Exception unused) {
            return (short) 0;
        }
    }

    public short[] getShortArray(String str) {
        try {
            return this.f50640a.getShortArray(str);
        } catch (Exception e5) {
            q.f(e5, new StringBuilder("getShortArray exception: "), f50638b, true);
            return new short[0];
        }
    }

    public short[] getShortArrayReturnNotNull(String str) {
        try {
            short[] shortArray = this.f50640a.getShortArray(str);
            return shortArray == null ? new short[0] : shortArray;
        } catch (Exception e5) {
            q.f(e5, new StringBuilder("getShortArray exception: "), f50638b, true);
            return new short[0];
        }
    }

    public Size getSize(String str) {
        try {
            return this.f50640a.getSize(str);
        } catch (Exception e5) {
            q.f(e5, new StringBuilder("getSize exception: "), f50638b, true);
            return null;
        }
    }

    public SizeF getSizeF(String str) {
        try {
            return this.f50640a.getSizeF(str);
        } catch (Exception e5) {
            q.f(e5, new StringBuilder("getSizeF exception: "), f50638b, true);
            return null;
        }
    }

    public <T extends Parcelable> SparseArray<T> getSparseParcelableArray(String str) {
        try {
            return this.f50640a.getSparseParcelableArray(str);
        } catch (Exception e5) {
            q.f(e5, new StringBuilder("getSparseParcelableArray exception: "), f50638b, true);
            return null;
        }
    }

    public String getString(String str) {
        try {
            return this.f50640a.getString(str);
        } catch (Exception e5) {
            q.f(e5, new StringBuilder("getString exception: "), f50638b, true);
            return "";
        }
    }

    public String[] getStringArray(String str) {
        try {
            return this.f50640a.getStringArray(str);
        } catch (Exception e5) {
            q.f(e5, new StringBuilder("getStringArray exception: "), f50638b, true);
            return new String[0];
        }
    }

    public ArrayList<String> getStringArrayList(String str) {
        try {
            return this.f50640a.getStringArrayList(str);
        } catch (Exception e5) {
            a.a(f50638b, "getStringArrayList exception: " + e5.getMessage(), true);
            return new ArrayList<>();
        }
    }

    public ArrayList<String> getStringArrayListReturnNotNull(String str) {
        try {
            ArrayList<String> stringArrayList = this.f50640a.getStringArrayList(str);
            return stringArrayList == null ? new ArrayList<>() : stringArrayList;
        } catch (Exception e5) {
            a.a(f50638b, "getStringArrayList exception: " + e5.getMessage(), true);
            return new ArrayList<>();
        }
    }

    public String[] getStringArrayReturnNotNull(String str) {
        try {
            String[] stringArray = this.f50640a.getStringArray(str);
            return stringArray == null ? new String[0] : stringArray;
        } catch (Exception e5) {
            q.f(e5, new StringBuilder("getStringArray exception: "), f50638b, true);
            return new String[0];
        }
    }

    public String getStringReturnNotNull(String str) {
        String string;
        try {
            string = this.f50640a.getString(str);
        } catch (Exception e5) {
            q.f(e5, new StringBuilder("getString exception: "), f50638b, true);
            string = "";
        }
        return TextUtils.isEmpty(string) ? "" : string;
    }

    public boolean isEmpty() {
        try {
            return this.f50640a.isEmpty();
        } catch (Exception unused) {
            a.a(f50638b, "isEmpty exception");
            return true;
        }
    }

    public Set<String> keySet() {
        try {
            return this.f50640a.keySet();
        } catch (Exception unused) {
            a.a(f50638b, "keySet exception.");
            return null;
        }
    }

    public SafeBundle putAll(Bundle bundle) {
        if (bundle != null) {
            try {
                this.f50640a.putAll(bundle);
            } catch (Exception unused) {
                a.a(f50638b, "putAll exception");
            }
        }
        return this;
    }

    @SuppressLint({"NewApi"})
    public SafeBundle putBinder(@Nullable String str, @Nullable IBinder iBinder) {
        try {
            this.f50640a.putBinder(str, iBinder);
        } catch (Exception e5) {
            q.f(e5, new StringBuilder("putBundle exception: "), f50638b, true);
        }
        return this;
    }

    public SafeBundle putBoolean(@Nullable String str, boolean z10) {
        try {
            this.f50640a.putBoolean(str, z10);
        } catch (Exception e5) {
            q.f(e5, new StringBuilder("putBoolean exception: "), f50638b, true);
        }
        return this;
    }

    public SafeBundle putBooleanArray(@Nullable String str, @Nullable boolean[] zArr) {
        try {
            this.f50640a.putBooleanArray(str, zArr);
        } catch (Exception e5) {
            q.f(e5, new StringBuilder("putBooleanArray exception: "), f50638b, true);
        }
        return this;
    }

    public SafeBundle putBundle(@Nullable String str, @Nullable Bundle bundle) {
        try {
            this.f50640a.putBundle(str, bundle);
        } catch (Exception e5) {
            q.f(e5, new StringBuilder("putBundle exception: "), f50638b, true);
        }
        return this;
    }

    public SafeBundle putByte(@Nullable String str, byte b10) {
        try {
            this.f50640a.putByte(str, b10);
        } catch (Exception e5) {
            q.f(e5, new StringBuilder("putByte exception: "), f50638b, true);
        }
        return this;
    }

    public SafeBundle putByteArray(@Nullable String str, @Nullable byte[] bArr) {
        try {
            this.f50640a.putByteArray(str, bArr);
        } catch (Exception e5) {
            q.f(e5, new StringBuilder("putByteArray exception: "), f50638b, true);
        }
        return this;
    }

    public SafeBundle putChar(@Nullable String str, char c10) {
        try {
            this.f50640a.putChar(str, c10);
        } catch (Exception e5) {
            q.f(e5, new StringBuilder("putChar exception: "), f50638b, true);
        }
        return this;
    }

    public SafeBundle putCharArray(@Nullable String str, @Nullable char[] cArr) {
        try {
            this.f50640a.putCharArray(str, cArr);
        } catch (Exception e5) {
            q.f(e5, new StringBuilder("putCharArray exception: "), f50638b, true);
        }
        return this;
    }

    public SafeBundle putCharSequence(@Nullable String str, @Nullable CharSequence charSequence) {
        try {
            this.f50640a.putCharSequence(str, charSequence);
        } catch (Exception e5) {
            q.f(e5, new StringBuilder("putCharSequence exception: "), f50638b, true);
        }
        return this;
    }

    public SafeBundle putCharSequenceArray(@Nullable String str, @Nullable CharSequence[] charSequenceArr) {
        try {
            this.f50640a.putCharSequenceArray(str, charSequenceArr);
        } catch (Exception e5) {
            q.f(e5, new StringBuilder("putCharSequenceArray exception: "), f50638b, true);
        }
        return this;
    }

    public SafeBundle putCharSequenceArrayList(@Nullable String str, @Nullable ArrayList<CharSequence> arrayList) {
        try {
            this.f50640a.putCharSequenceArrayList(str, arrayList);
        } catch (Exception e5) {
            q.f(e5, new StringBuilder("putCharSequenceArrayList exception: "), f50638b, true);
        }
        return this;
    }

    public SafeBundle putDouble(@Nullable String str, double d2) {
        try {
            this.f50640a.putDouble(str, d2);
        } catch (Exception e5) {
            q.f(e5, new StringBuilder("putDouble exception: "), f50638b, true);
        }
        return this;
    }

    public SafeBundle putDoubleArray(@Nullable String str, @Nullable double[] dArr) {
        try {
            this.f50640a.putDoubleArray(str, dArr);
        } catch (Exception e5) {
            q.f(e5, new StringBuilder("putDoubleArray exception: "), f50638b, true);
        }
        return this;
    }

    public SafeBundle putFloat(@Nullable String str, float f6) {
        try {
            this.f50640a.putFloat(str, f6);
        } catch (Exception e5) {
            q.f(e5, new StringBuilder("putFloat exception: "), f50638b, true);
        }
        return this;
    }

    public SafeBundle putFloatArray(@Nullable String str, @Nullable float[] fArr) {
        try {
            this.f50640a.putFloatArray(str, fArr);
        } catch (Exception e5) {
            q.f(e5, new StringBuilder("putFloatArray exception: "), f50638b, true);
        }
        return this;
    }

    public SafeBundle putInt(@Nullable String str, int i10) {
        try {
            this.f50640a.putInt(str, i10);
        } catch (Exception e5) {
            q.f(e5, new StringBuilder("putInt exception: "), f50638b, true);
        }
        return this;
    }

    public SafeBundle putIntArray(@Nullable String str, @Nullable int[] iArr) {
        try {
            this.f50640a.putIntArray(str, iArr);
        } catch (Exception e5) {
            q.f(e5, new StringBuilder("putIntArray exception: "), f50638b, true);
        }
        return this;
    }

    public SafeBundle putIntegerArrayList(@Nullable String str, @Nullable ArrayList<Integer> arrayList) {
        try {
            this.f50640a.putIntegerArrayList(str, arrayList);
        } catch (Exception e5) {
            q.f(e5, new StringBuilder("putIntegerArrayList exception: "), f50638b, true);
        }
        return this;
    }

    public SafeBundle putLong(@Nullable String str, long j10) {
        try {
            this.f50640a.putLong(str, j10);
        } catch (Exception e5) {
            q.f(e5, new StringBuilder("putLong exception: "), f50638b, true);
        }
        return this;
    }

    public SafeBundle putLongArray(@Nullable String str, @Nullable long[] jArr) {
        try {
            this.f50640a.putLongArray(str, jArr);
        } catch (Exception e5) {
            q.f(e5, new StringBuilder("putLongArray exception: "), f50638b, true);
        }
        return this;
    }

    public SafeBundle putParcelable(@Nullable String str, @Nullable Parcelable parcelable) {
        try {
            this.f50640a.putParcelable(str, parcelable);
        } catch (Exception e5) {
            q.f(e5, new StringBuilder("putParcelable exception: "), f50638b, true);
        }
        return this;
    }

    public SafeBundle putParcelableArray(@Nullable String str, @Nullable Parcelable[] parcelableArr) {
        try {
            this.f50640a.putParcelableArray(str, parcelableArr);
        } catch (Exception e5) {
            q.f(e5, new StringBuilder("putParcelableArray exception: "), f50638b, true);
        }
        return this;
    }

    public SafeBundle putParcelableArrayList(@Nullable String str, @Nullable ArrayList<? extends Parcelable> arrayList) {
        try {
            this.f50640a.putParcelableArrayList(str, arrayList);
        } catch (Exception e5) {
            q.f(e5, new StringBuilder("putParcelableArrayList exception: "), f50638b, true);
        }
        return this;
    }

    public SafeBundle putSerializable(@Nullable String str, @Nullable Serializable serializable) {
        try {
            this.f50640a.putSerializable(str, serializable);
        } catch (Exception e5) {
            q.f(e5, new StringBuilder("putSerializable exception: "), f50638b, true);
        }
        return this;
    }

    public SafeBundle putShort(@Nullable String str, short s4) {
        try {
            this.f50640a.putShort(str, s4);
        } catch (Exception e5) {
            q.f(e5, new StringBuilder("putShort exception: "), f50638b, true);
        }
        return this;
    }

    public SafeBundle putShortArray(@Nullable String str, @Nullable short[] sArr) {
        try {
            this.f50640a.putShortArray(str, sArr);
        } catch (Exception e5) {
            q.f(e5, new StringBuilder("putShortArray exception: "), f50638b, true);
        }
        return this;
    }

    @TargetApi(21)
    public SafeBundle putSize(@Nullable String str, @Nullable Size size) {
        try {
            this.f50640a.putSize(str, size);
        } catch (Exception e5) {
            q.f(e5, new StringBuilder("putSize exception: "), f50638b, true);
        }
        return this;
    }

    @TargetApi(21)
    public SafeBundle putSizeF(@Nullable String str, @Nullable SizeF sizeF) {
        try {
            this.f50640a.putSizeF(str, sizeF);
        } catch (Exception e5) {
            q.f(e5, new StringBuilder("putSizeF exception: "), f50638b, true);
        }
        return this;
    }

    public SafeBundle putSparseParcelableArray(@Nullable String str, @Nullable SparseArray<? extends Parcelable> sparseArray) {
        try {
            this.f50640a.putSparseParcelableArray(str, sparseArray);
        } catch (Exception e5) {
            q.f(e5, new StringBuilder("putSparseParcelableArray exception: "), f50638b, true);
        }
        return this;
    }

    public SafeBundle putString(@Nullable String str, @Nullable String str2) {
        try {
            this.f50640a.putString(str, str2);
        } catch (Exception e5) {
            q.f(e5, new StringBuilder("putString exception: "), f50638b, true);
        }
        return this;
    }

    public SafeBundle putStringArray(@Nullable String str, @Nullable String[] strArr) {
        try {
            this.f50640a.putStringArray(str, strArr);
        } catch (Exception e5) {
            q.f(e5, new StringBuilder("putStringArray exception: "), f50638b, true);
        }
        return this;
    }

    public SafeBundle putStringArrayList(@Nullable String str, @Nullable ArrayList<String> arrayList) {
        try {
            this.f50640a.putStringArrayList(str, arrayList);
        } catch (Exception e5) {
            q.f(e5, new StringBuilder("putStringArrayList exception: "), f50638b, true);
        }
        return this;
    }

    public void remove(String str) {
        try {
            this.f50640a.remove(str);
        } catch (Exception unused) {
            a.a(f50638b, "remove exception. key:");
        }
    }

    public int size() {
        try {
            return this.f50640a.size();
        } catch (Exception unused) {
            a.a(f50638b, "size exception");
            return 0;
        }
    }

    public String toString() {
        return this.f50640a.toString();
    }

    public SafeBundle(Bundle bundle) {
        this.f50640a = bundle == null ? new Bundle() : bundle;
    }

    public boolean getBoolean(String str, boolean z10) {
        try {
            return this.f50640a.getBoolean(str, z10);
        } catch (Exception e5) {
            q.f(e5, new StringBuilder("getBoolean exception : "), f50638b, true);
            return z10;
        }
    }

    public Bundle getBundle(@Nullable String str) {
        try {
            return this.f50640a.getBundle(str);
        } catch (Exception e5) {
            q.f(e5, new StringBuilder("getBundle exception: "), f50638b, true);
            return null;
        }
    }

    public byte getByte(String str, byte b10) {
        try {
            return this.f50640a.getByte(str, b10).byteValue();
        } catch (Exception e5) {
            q.f(e5, new StringBuilder("getByte exception: "), f50638b, true);
            return b10;
        }
    }

    public char getChar(String str, char c10) {
        try {
            return this.f50640a.getChar(str, c10);
        } catch (Exception e5) {
            q.f(e5, new StringBuilder("getChar exception: "), f50638b, true);
            return c10;
        }
    }

    @SuppressLint({"NewApi"})
    public CharSequence getCharSequence(String str, CharSequence charSequence) {
        try {
            return this.f50640a.getCharSequence(str, charSequence);
        } catch (Exception e5) {
            q.f(e5, new StringBuilder("getCharSequence exception: "), f50638b, true);
            return charSequence;
        }
    }

    public double getDouble(String str, double d2) {
        try {
            return this.f50640a.getDouble(str, d2);
        } catch (Exception e5) {
            q.f(e5, new StringBuilder("getDouble exception: "), f50638b, true);
            return d2;
        }
    }

    public float getFloat(String str, float f6) {
        try {
            return this.f50640a.getFloat(str, f6);
        } catch (Exception e5) {
            q.f(e5, new StringBuilder("getFloat exception: "), f50638b, true);
            return f6;
        }
    }

    public int getInt(String str, int i10) {
        try {
            return this.f50640a.getInt(str, i10);
        } catch (Exception e5) {
            q.f(e5, new StringBuilder("getInt exception: "), f50638b, true);
            return i10;
        }
    }

    public long getLong(String str, long j10) {
        try {
            return this.f50640a.getLong(str, j10);
        } catch (Exception e5) {
            q.f(e5, new StringBuilder("getLong exception: "), f50638b, true);
            return j10;
        }
    }

    public short getShort(String str, short s4) {
        try {
            return this.f50640a.getShort(str, s4);
        } catch (Exception e5) {
            q.f(e5, new StringBuilder("getShort exception: "), f50638b, true);
            return s4;
        }
    }

    public <T extends Parcelable> T getParcelable(String str, Class<T> cls) {
        try {
            Parcelable parcelable = this.f50640a.getParcelable(str);
            if (cls.isInstance(parcelable)) {
                return cls.cast(parcelable);
            }
            return null;
        } catch (Exception e5) {
            q.f(e5, new StringBuilder("getParcelable exception: "), f50638b, true);
            return null;
        }
    }

    public <T extends Serializable> T getSerializable(String str, Class<T> cls) {
        try {
            Serializable serializable = this.f50640a.getSerializable(str);
            if (cls.isInstance(serializable)) {
                return cls.cast(serializable);
            }
            return null;
        } catch (Exception e5) {
            q.f(e5, new StringBuilder("getSerializable exception: "), f50638b, true);
            return null;
        }
    }

    @SuppressLint({"NewApi"})
    public String getString(String str, String str2) {
        try {
            return this.f50640a.getString(str, str2);
        } catch (Exception e5) {
            q.f(e5, new StringBuilder("getString exception: "), f50638b, true);
            return str2;
        }
    }

    @SuppressLint({"NewApi"})
    public CharSequence getCharSequenceReturnNotNull(String str, CharSequence charSequence) {
        try {
            CharSequence charSequence2 = this.f50640a.getCharSequence(str, charSequence);
            return charSequence2 == null ? "" : charSequence2;
        } catch (Exception e5) {
            q.f(e5, new StringBuilder("getCharSequence exception: "), f50638b, true);
            return charSequence;
        }
    }

    @SuppressLint({"NewApi"})
    public String getStringReturnNotNull(String str, String str2) {
        try {
            String string = this.f50640a.getString(str, str2);
            return string == null ? str2 : string;
        } catch (Exception e5) {
            q.f(e5, new StringBuilder("getString exception: "), f50638b, true);
            return str2;
        }
    }
}
