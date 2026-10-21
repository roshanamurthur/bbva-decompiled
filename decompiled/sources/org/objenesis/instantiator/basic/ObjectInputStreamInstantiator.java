package org.objenesis.instantiator.basic;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.io.Serializable;
import org.objenesis.ObjenesisException;
import org.objenesis.instantiator.ObjectInstantiator;
import org.objenesis.instantiator.annotations.Instantiator;
import org.objenesis.instantiator.annotations.Typology;

/* JADX INFO: loaded from: classes13.dex */
@Instantiator(Typology.SERIALIZATION)
public class ObjectInputStreamInstantiator<T> implements ObjectInstantiator<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ObjectInputStream f92516a;

    public ObjectInputStreamInstantiator(Class<T> cls) {
        if (Serializable.class.isAssignableFrom(cls)) {
            try {
                this.f92516a = new ObjectInputStream(new a(cls));
            } catch (IOException e5) {
                throw new Error(androidx.camera.core.impl.a.d(e5, new StringBuilder("IOException: ")));
            }
        } else {
            throw new ObjenesisException(new NotSerializableException(cls + " not serializable"));
        }
    }

    @Override // org.objenesis.instantiator.ObjectInstantiator
    public T newInstance() {
        try {
            return (T) this.f92516a.readObject();
        } catch (ClassNotFoundException e5) {
            throw new Error("ClassNotFoundException: " + e5.getMessage());
        } catch (Exception e7) {
            throw new ObjenesisException(e7);
        }
    }

    public static class a extends InputStream {

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public static final int[] f92517t0 = {1, 2, 2};

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public static final byte[] f92518u0;
        public static final byte[] v0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final byte[][] f92522s0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f92519p0 = 0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f92521r0 = 0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public byte[] f92520q0 = f92518u0;

        static {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                dataOutputStream.writeShort(-21267);
                dataOutputStream.writeShort(5);
                f92518u0 = byteArrayOutputStream.toByteArray();
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                DataOutputStream dataOutputStream2 = new DataOutputStream(byteArrayOutputStream2);
                dataOutputStream2.writeByte(115);
                dataOutputStream2.writeByte(113);
                dataOutputStream2.writeInt(8257536);
                v0 = byteArrayOutputStream2.toByteArray();
            } catch (IOException e5) {
                throw new Error(androidx.camera.core.impl.a.d(e5, new StringBuilder("IOException: ")));
            }
        }

        public a(Class<?> cls) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            try {
                dataOutputStream.writeByte(115);
                dataOutputStream.writeByte(114);
                dataOutputStream.writeUTF(cls.getName());
                dataOutputStream.writeLong(ObjectStreamClass.lookup(cls).getSerialVersionUID());
                dataOutputStream.writeByte(2);
                dataOutputStream.writeShort(0);
                dataOutputStream.writeByte(120);
                dataOutputStream.writeByte(112);
                this.f92522s0 = new byte[][]{f92518u0, byteArrayOutputStream.toByteArray(), v0};
            } catch (IOException e5) {
                throw new Error(androidx.camera.core.impl.a.d(e5, new StringBuilder("IOException: ")));
            }
        }

        @Override // java.io.InputStream
        public final int available() {
            return Integer.MAX_VALUE;
        }

        @Override // java.io.InputStream
        public final int read() {
            byte[] bArr = this.f92520q0;
            int i10 = this.f92519p0;
            int i11 = i10 + 1;
            this.f92519p0 = i11;
            byte b10 = bArr[i10];
            if (i11 >= bArr.length) {
                this.f92519p0 = 0;
                int i12 = f92517t0[this.f92521r0];
                this.f92521r0 = i12;
                this.f92520q0 = this.f92522s0[i12];
            }
            return b10;
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i10, int i11) {
            int length = this.f92520q0.length - this.f92519p0;
            int i12 = i11;
            while (length <= i12) {
                System.arraycopy(this.f92520q0, this.f92519p0, bArr, i10, length);
                i10 += length;
                i12 -= length;
                this.f92519p0 = 0;
                int i13 = f92517t0[this.f92521r0];
                this.f92521r0 = i13;
                byte[] bArr2 = this.f92522s0[i13];
                this.f92520q0 = bArr2;
                length = bArr2.length;
            }
            if (i12 > 0) {
                System.arraycopy(this.f92520q0, this.f92519p0, bArr, i10, i12);
                this.f92519p0 += i12;
            }
            return i11;
        }
    }
}
