package com.esotericsoftware.kryo.serializers;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes9.dex */
public class DefaultArraySerializers {

    public static class BooleanArraySerializer extends Serializer<boolean[]> {
        public BooleanArraySerializer() {
            setAcceptsNull(true);
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public boolean[] copy(Kryo kryo, boolean[] zArr) {
            int length = zArr.length;
            boolean[] zArr2 = new boolean[length];
            System.arraycopy(zArr, 0, zArr2, 0, length);
            return zArr2;
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public boolean[] read(Kryo kryo, Input input, Class<? extends boolean[]> cls) {
            int varInt = input.readVarInt(true);
            if (varInt == 0) {
                return null;
            }
            int i10 = varInt - 1;
            boolean[] zArr = new boolean[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                zArr[i11] = input.readBoolean();
            }
            return zArr;
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public void write(Kryo kryo, Output output, boolean[] zArr) {
            if (zArr == null) {
                output.writeByte((byte) 0);
                return;
            }
            output.writeVarInt(zArr.length + 1, true);
            for (boolean z10 : zArr) {
                output.writeBoolean(z10);
            }
        }
    }

    public static class ByteArraySerializer extends Serializer<byte[]> {
        public ByteArraySerializer() {
            setAcceptsNull(true);
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public byte[] copy(Kryo kryo, byte[] bArr) {
            int length = bArr.length;
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, 0, bArr2, 0, length);
            return bArr2;
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public byte[] read(Kryo kryo, Input input, Class<? extends byte[]> cls) {
            int varInt = input.readVarInt(true);
            if (varInt == 0) {
                return null;
            }
            return input.readBytes(varInt - 1);
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public void write(Kryo kryo, Output output, byte[] bArr) {
            if (bArr == null) {
                output.writeByte((byte) 0);
            } else {
                output.writeVarInt(bArr.length + 1, true);
                output.writeBytes(bArr);
            }
        }
    }

    public static class CharArraySerializer extends Serializer<char[]> {
        public CharArraySerializer() {
            setAcceptsNull(true);
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public char[] copy(Kryo kryo, char[] cArr) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            System.arraycopy(cArr, 0, cArr2, 0, length);
            return cArr2;
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public char[] read(Kryo kryo, Input input, Class<? extends char[]> cls) {
            int varInt = input.readVarInt(true);
            if (varInt == 0) {
                return null;
            }
            return input.readChars(varInt - 1);
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public void write(Kryo kryo, Output output, char[] cArr) {
            if (cArr == null) {
                output.writeByte((byte) 0);
            } else {
                output.writeVarInt(cArr.length + 1, true);
                output.writeChars(cArr, 0, cArr.length);
            }
        }
    }

    public static class DoubleArraySerializer extends Serializer<double[]> {
        public DoubleArraySerializer() {
            setAcceptsNull(true);
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public double[] copy(Kryo kryo, double[] dArr) {
            int length = dArr.length;
            double[] dArr2 = new double[length];
            System.arraycopy(dArr, 0, dArr2, 0, length);
            return dArr2;
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public double[] read(Kryo kryo, Input input, Class<? extends double[]> cls) {
            int varInt = input.readVarInt(true);
            if (varInt == 0) {
                return null;
            }
            return input.readDoubles(varInt - 1);
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public void write(Kryo kryo, Output output, double[] dArr) {
            if (dArr == null) {
                output.writeByte((byte) 0);
            } else {
                output.writeVarInt(dArr.length + 1, true);
                output.writeDoubles(dArr, 0, dArr.length);
            }
        }
    }

    public static class FloatArraySerializer extends Serializer<float[]> {
        public FloatArraySerializer() {
            setAcceptsNull(true);
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public float[] copy(Kryo kryo, float[] fArr) {
            int length = fArr.length;
            float[] fArr2 = new float[length];
            System.arraycopy(fArr, 0, fArr2, 0, length);
            return fArr2;
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public float[] read(Kryo kryo, Input input, Class<? extends float[]> cls) {
            int varInt = input.readVarInt(true);
            if (varInt == 0) {
                return null;
            }
            return input.readFloats(varInt - 1);
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public void write(Kryo kryo, Output output, float[] fArr) {
            if (fArr == null) {
                output.writeByte((byte) 0);
            } else {
                output.writeVarInt(fArr.length + 1, true);
                output.writeFloats(fArr, 0, fArr.length);
            }
        }
    }

    public static class IntArraySerializer extends Serializer<int[]> {
        public IntArraySerializer() {
            setAcceptsNull(true);
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public int[] copy(Kryo kryo, int[] iArr) {
            int length = iArr.length;
            int[] iArr2 = new int[length];
            System.arraycopy(iArr, 0, iArr2, 0, length);
            return iArr2;
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public int[] read(Kryo kryo, Input input, Class<? extends int[]> cls) {
            int varInt = input.readVarInt(true);
            if (varInt == 0) {
                return null;
            }
            return input.readInts(varInt - 1, false);
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public void write(Kryo kryo, Output output, int[] iArr) {
            if (iArr == null) {
                output.writeByte((byte) 0);
            } else {
                output.writeVarInt(iArr.length + 1, true);
                output.writeInts(iArr, 0, iArr.length, false);
            }
        }
    }

    public static class LongArraySerializer extends Serializer<long[]> {
        public LongArraySerializer() {
            setAcceptsNull(true);
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public long[] copy(Kryo kryo, long[] jArr) {
            int length = jArr.length;
            long[] jArr2 = new long[length];
            System.arraycopy(jArr, 0, jArr2, 0, length);
            return jArr2;
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public long[] read(Kryo kryo, Input input, Class<? extends long[]> cls) {
            int varInt = input.readVarInt(true);
            if (varInt == 0) {
                return null;
            }
            return input.readLongs(varInt - 1, false);
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public void write(Kryo kryo, Output output, long[] jArr) {
            if (jArr == null) {
                output.writeByte((byte) 0);
            } else {
                output.writeVarInt(jArr.length + 1, true);
                output.writeLongs(jArr, 0, jArr.length, false);
            }
        }
    }

    public static class ObjectArraySerializer extends Serializer<Object[]> {
        private boolean elementsAreSameType;
        private boolean elementsCanBeNull = true;
        private final Class type;

        public ObjectArraySerializer(Kryo kryo, Class cls) {
            setAcceptsNull(true);
            this.type = cls;
            if ((cls.getComponentType().getModifiers() & 16) != 0) {
                setElementsAreSameType(true);
            }
        }

        public void setElementsAreSameType(boolean z10) {
            this.elementsAreSameType = z10;
        }

        public void setElementsCanBeNull(boolean z10) {
            this.elementsCanBeNull = z10;
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public Object[] copy(Kryo kryo, Object[] objArr) {
            int length = objArr.length;
            Object[] objArr2 = (Object[]) androidx.collection.a.b(objArr, length);
            kryo.reference(objArr2);
            for (int i10 = 0; i10 < length; i10++) {
                objArr2[i10] = kryo.copy(objArr[i10]);
            }
            return objArr2;
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public Object[] read(Kryo kryo, Input input, Class<? extends Object[]> cls) {
            int varInt = input.readVarInt(true);
            if (varInt == 0) {
                return null;
            }
            int i10 = varInt - 1;
            Object[] objArr = (Object[]) Array.newInstance(cls.getComponentType(), i10);
            kryo.reference(objArr);
            Class componentType = cls.getComponentType();
            int i11 = 0;
            if (this.elementsAreSameType || kryo.isFinal(componentType)) {
                Serializer serializer = kryo.getSerializer(componentType);
                if (this.elementsCanBeNull) {
                    while (i11 < i10) {
                        objArr[i11] = kryo.readObjectOrNull(input, componentType, serializer);
                        i11++;
                    }
                } else {
                    while (i11 < i10) {
                        objArr[i11] = kryo.readObject(input, componentType, serializer);
                        i11++;
                    }
                }
            } else {
                while (i11 < i10) {
                    objArr[i11] = kryo.readClassAndObject(input);
                    i11++;
                }
            }
            return objArr;
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public void write(Kryo kryo, Output output, Object[] objArr) {
            int i10 = 0;
            if (objArr == null) {
                output.writeByte((byte) 0);
                return;
            }
            int length = objArr.length;
            output.writeVarInt(length + 1, true);
            Class<?> componentType = objArr.getClass().getComponentType();
            if (!this.elementsAreSameType && !kryo.isFinal(componentType)) {
                while (i10 < length) {
                    kryo.writeClassAndObject(output, objArr[i10]);
                    i10++;
                }
                return;
            }
            Serializer serializer = kryo.getSerializer(componentType);
            if (this.elementsCanBeNull) {
                while (i10 < length) {
                    kryo.writeObjectOrNull(output, objArr[i10], serializer);
                    i10++;
                }
            } else {
                while (i10 < length) {
                    kryo.writeObject(output, objArr[i10], serializer);
                    i10++;
                }
            }
        }
    }

    public static class ShortArraySerializer extends Serializer<short[]> {
        public ShortArraySerializer() {
            setAcceptsNull(true);
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public short[] copy(Kryo kryo, short[] sArr) {
            int length = sArr.length;
            short[] sArr2 = new short[length];
            System.arraycopy(sArr, 0, sArr2, 0, length);
            return sArr2;
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public short[] read(Kryo kryo, Input input, Class<? extends short[]> cls) {
            int varInt = input.readVarInt(true);
            if (varInt == 0) {
                return null;
            }
            return input.readShorts(varInt - 1);
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public void write(Kryo kryo, Output output, short[] sArr) {
            if (sArr == null) {
                output.writeByte((byte) 0);
            } else {
                output.writeVarInt(sArr.length + 1, true);
                output.writeShorts(sArr, 0, sArr.length);
            }
        }
    }

    public static class StringArraySerializer extends Serializer<String[]> {
        public StringArraySerializer() {
            setAcceptsNull(true);
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public String[] copy(Kryo kryo, String[] strArr) {
            int length = strArr.length;
            String[] strArr2 = new String[length];
            System.arraycopy(strArr, 0, strArr2, 0, length);
            return strArr2;
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public String[] read(Kryo kryo, Input input, Class<? extends String[]> cls) {
            int varInt = input.readVarInt(true);
            if (varInt == 0) {
                return null;
            }
            int i10 = varInt - 1;
            String[] strArr = new String[i10];
            int i11 = 0;
            if (kryo.getReferences() && kryo.getReferenceResolver().useReferences(String.class)) {
                Serializer serializer = kryo.getSerializer(String.class);
                while (i11 < i10) {
                    strArr[i11] = (String) kryo.readObjectOrNull(input, String.class, serializer);
                    i11++;
                }
            } else {
                while (i11 < i10) {
                    strArr[i11] = input.readString();
                    i11++;
                }
            }
            return strArr;
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public void write(Kryo kryo, Output output, String[] strArr) {
            int i10 = 0;
            if (strArr == null) {
                output.writeByte((byte) 0);
                return;
            }
            output.writeVarInt(strArr.length + 1, true);
            if (!kryo.getReferences() || !kryo.getReferenceResolver().useReferences(String.class)) {
                int length = strArr.length;
                while (i10 < length) {
                    output.writeString(strArr[i10]);
                    i10++;
                }
                return;
            }
            Serializer serializer = kryo.getSerializer(String.class);
            int length2 = strArr.length;
            while (i10 < length2) {
                kryo.writeObjectOrNull(output, strArr[i10], serializer);
                i10++;
            }
        }
    }
}
