package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class FieldSet<T extends FieldDescriptorLite<T>> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final FieldSet f47077d = new FieldSet(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t0<T, Object> f47078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f47079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f47080c;

    public interface FieldDescriptorLite<T extends FieldDescriptorLite<T>> extends Comparable<T> {
        Internal.EnumLiteMap<?> getEnumType();

        WireFormat.JavaType getLiteJavaType();

        WireFormat.FieldType getLiteType();

        int getNumber();

        MessageLite.Builder internalMergeFrom(MessageLite.Builder builder, MessageLite messageLite);

        boolean isPacked();

        boolean isRepeated();
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f47081a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f47082b;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f47082b = iArr;
            try {
                iArr[WireFormat.FieldType.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f47082b[WireFormat.FieldType.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f47082b[WireFormat.FieldType.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f47082b[WireFormat.FieldType.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f47082b[WireFormat.FieldType.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f47082b[WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f47082b[WireFormat.FieldType.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f47082b[WireFormat.FieldType.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f47082b[WireFormat.FieldType.GROUP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f47082b[WireFormat.FieldType.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f47082b[WireFormat.FieldType.STRING.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f47082b[WireFormat.FieldType.BYTES.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f47082b[WireFormat.FieldType.UINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f47082b[WireFormat.FieldType.SFIXED32.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f47082b[WireFormat.FieldType.SFIXED64.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f47082b[WireFormat.FieldType.SINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f47082b[WireFormat.FieldType.SINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f47082b[WireFormat.FieldType.ENUM.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[WireFormat.JavaType.values().length];
            f47081a = iArr2;
            try {
                iArr2[WireFormat.JavaType.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f47081a[WireFormat.JavaType.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f47081a[WireFormat.JavaType.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f47081a[WireFormat.JavaType.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f47081a[WireFormat.JavaType.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f47081a[WireFormat.JavaType.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f47081a[WireFormat.JavaType.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f47081a[WireFormat.JavaType.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f47081a[WireFormat.JavaType.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    public FieldSet() {
        this.f47078a = new s0(16);
    }

    public static int c(WireFormat.FieldType fieldType, int i10, Object obj) {
        int iComputeTagSize = CodedOutputStream.computeTagSize(i10);
        if (fieldType == WireFormat.FieldType.GROUP) {
            iComputeTagSize *= 2;
        }
        return d(fieldType, obj) + iComputeTagSize;
    }

    public static int d(WireFormat.FieldType fieldType, Object obj) {
        switch (a.f47082b[fieldType.ordinal()]) {
            case 1:
                return CodedOutputStream.computeDoubleSizeNoTag(((Double) obj).doubleValue());
            case 2:
                return CodedOutputStream.computeFloatSizeNoTag(((Float) obj).floatValue());
            case 3:
                return CodedOutputStream.computeInt64SizeNoTag(((Long) obj).longValue());
            case 4:
                return CodedOutputStream.computeUInt64SizeNoTag(((Long) obj).longValue());
            case 5:
                return CodedOutputStream.computeInt32SizeNoTag(((Integer) obj).intValue());
            case 6:
                return CodedOutputStream.computeFixed64SizeNoTag(((Long) obj).longValue());
            case 7:
                return CodedOutputStream.computeFixed32SizeNoTag(((Integer) obj).intValue());
            case 8:
                return CodedOutputStream.computeBoolSizeNoTag(((Boolean) obj).booleanValue());
            case 9:
                return CodedOutputStream.computeGroupSizeNoTag((MessageLite) obj);
            case 10:
                return obj instanceof LazyField ? CodedOutputStream.computeLazyFieldSizeNoTag((LazyField) obj) : CodedOutputStream.computeMessageSizeNoTag((MessageLite) obj);
            case 11:
                return obj instanceof ByteString ? CodedOutputStream.computeBytesSizeNoTag((ByteString) obj) : CodedOutputStream.computeStringSizeNoTag((String) obj);
            case 12:
                return obj instanceof ByteString ? CodedOutputStream.computeBytesSizeNoTag((ByteString) obj) : CodedOutputStream.computeByteArraySizeNoTag((byte[]) obj);
            case 13:
                return CodedOutputStream.computeUInt32SizeNoTag(((Integer) obj).intValue());
            case 14:
                return CodedOutputStream.computeSFixed32SizeNoTag(((Integer) obj).intValue());
            case 15:
                return CodedOutputStream.computeSFixed64SizeNoTag(((Long) obj).longValue());
            case 16:
                return CodedOutputStream.computeSInt32SizeNoTag(((Integer) obj).intValue());
            case 17:
                return CodedOutputStream.computeSInt64SizeNoTag(((Long) obj).longValue());
            case 18:
                return obj instanceof Internal.EnumLite ? CodedOutputStream.computeEnumSizeNoTag(((Internal.EnumLite) obj).getNumber()) : CodedOutputStream.computeEnumSizeNoTag(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int e(FieldDescriptorLite<?> fieldDescriptorLite, Object obj) {
        WireFormat.FieldType liteType = fieldDescriptorLite.getLiteType();
        int number = fieldDescriptorLite.getNumber();
        if (!fieldDescriptorLite.isRepeated()) {
            return c(liteType, number, obj);
        }
        int iC = 0;
        if (!fieldDescriptorLite.isPacked()) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                iC += c(liteType, number, it.next());
            }
            return iC;
        }
        Iterator it2 = ((List) obj).iterator();
        while (it2.hasNext()) {
            iC += d(liteType, it2.next());
        }
        return CodedOutputStream.computeUInt32SizeNoTag(iC) + CodedOutputStream.computeTagSize(number) + iC;
    }

    public static int h(Map.Entry entry) {
        FieldDescriptorLite fieldDescriptorLite = (FieldDescriptorLite) entry.getKey();
        Object value = entry.getValue();
        if (fieldDescriptorLite.getLiteJavaType() != WireFormat.JavaType.MESSAGE || fieldDescriptorLite.isRepeated() || fieldDescriptorLite.isPacked()) {
            return e(fieldDescriptorLite, value);
        }
        return value instanceof LazyField ? CodedOutputStream.computeLazyFieldMessageSetExtensionSize(((FieldDescriptorLite) entry.getKey()).getNumber(), (LazyField) value) : CodedOutputStream.computeMessageSetExtensionSize(((FieldDescriptorLite) entry.getKey()).getNumber(), (MessageLite) value);
    }

    public static <T extends FieldDescriptorLite<T>> boolean l(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.getLiteJavaType() == WireFormat.JavaType.MESSAGE) {
            if (!key.isRepeated()) {
                Object value = entry.getValue();
                if (value instanceof MessageLiteOrBuilder) {
                    return ((MessageLiteOrBuilder) value).isInitialized();
                }
                if (value instanceof LazyField) {
                    return true;
                }
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            for (Object obj : (List) entry.getValue()) {
                if (obj instanceof MessageLiteOrBuilder) {
                    if (!((MessageLiteOrBuilder) obj).isInitialized()) {
                        return false;
                    }
                } else if (!(obj instanceof LazyField)) {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:32:? A[RETURN, SYNTHETIC] */
    public static void r(FieldDescriptorLite fieldDescriptorLite, Object obj) {
        boolean z10;
        WireFormat.FieldType liteType = fieldDescriptorLite.getLiteType();
        Charset charset = Internal.f47106a;
        obj.getClass();
        switch (a.f47081a[liteType.getJavaType().ordinal()]) {
            case 1:
                z10 = obj instanceof Integer;
                if (z10) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(fieldDescriptorLite.getNumber()), fieldDescriptorLite.getLiteType().getJavaType(), obj.getClass().getName()));
            case 2:
                z10 = obj instanceof Long;
                if (z10) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(fieldDescriptorLite.getNumber()), fieldDescriptorLite.getLiteType().getJavaType(), obj.getClass().getName()));
            case 3:
                z10 = obj instanceof Float;
                if (z10) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(fieldDescriptorLite.getNumber()), fieldDescriptorLite.getLiteType().getJavaType(), obj.getClass().getName()));
            case 4:
                z10 = obj instanceof Double;
                if (z10) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(fieldDescriptorLite.getNumber()), fieldDescriptorLite.getLiteType().getJavaType(), obj.getClass().getName()));
            case 5:
                z10 = obj instanceof Boolean;
                if (z10) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(fieldDescriptorLite.getNumber()), fieldDescriptorLite.getLiteType().getJavaType(), obj.getClass().getName()));
            case 6:
                z10 = obj instanceof String;
                if (z10) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(fieldDescriptorLite.getNumber()), fieldDescriptorLite.getLiteType().getJavaType(), obj.getClass().getName()));
            case 7:
                if ((obj instanceof ByteString) || (obj instanceof byte[])) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(fieldDescriptorLite.getNumber()), fieldDescriptorLite.getLiteType().getJavaType(), obj.getClass().getName()));
            case 8:
                if ((obj instanceof Integer) || (obj instanceof Internal.EnumLite)) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(fieldDescriptorLite.getNumber()), fieldDescriptorLite.getLiteType().getJavaType(), obj.getClass().getName()));
            case 9:
                if ((obj instanceof MessageLite) || (obj instanceof LazyField)) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(fieldDescriptorLite.getNumber()), fieldDescriptorLite.getLiteType().getJavaType(), obj.getClass().getName()));
            default:
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(fieldDescriptorLite.getNumber()), fieldDescriptorLite.getLiteType().getJavaType(), obj.getClass().getName()));
        }
    }

    public static void s(CodedOutputStream codedOutputStream, WireFormat.FieldType fieldType, int i10, Object obj) throws IOException {
        if (fieldType == WireFormat.FieldType.GROUP) {
            codedOutputStream.writeGroup(i10, (MessageLite) obj);
        } else {
            codedOutputStream.writeTag(i10, fieldType.getWireType());
            t(codedOutputStream, fieldType, obj);
        }
    }

    public static void t(CodedOutputStream codedOutputStream, WireFormat.FieldType fieldType, Object obj) throws IOException {
        switch (a.f47082b[fieldType.ordinal()]) {
            case 1:
                codedOutputStream.writeDoubleNoTag(((Double) obj).doubleValue());
                break;
            case 2:
                codedOutputStream.writeFloatNoTag(((Float) obj).floatValue());
                break;
            case 3:
                codedOutputStream.writeInt64NoTag(((Long) obj).longValue());
                break;
            case 4:
                codedOutputStream.writeUInt64NoTag(((Long) obj).longValue());
                break;
            case 5:
                codedOutputStream.writeInt32NoTag(((Integer) obj).intValue());
                break;
            case 6:
                codedOutputStream.writeFixed64NoTag(((Long) obj).longValue());
                break;
            case 7:
                codedOutputStream.writeFixed32NoTag(((Integer) obj).intValue());
                break;
            case 8:
                codedOutputStream.writeBoolNoTag(((Boolean) obj).booleanValue());
                break;
            case 9:
                codedOutputStream.writeGroupNoTag((MessageLite) obj);
                break;
            case 10:
                codedOutputStream.writeMessageNoTag((MessageLite) obj);
                break;
            case 11:
                if (!(obj instanceof ByteString)) {
                    codedOutputStream.writeStringNoTag((String) obj);
                } else {
                    codedOutputStream.writeBytesNoTag((ByteString) obj);
                }
                break;
            case 12:
                if (!(obj instanceof ByteString)) {
                    codedOutputStream.writeByteArrayNoTag((byte[]) obj);
                } else {
                    codedOutputStream.writeBytesNoTag((ByteString) obj);
                }
                break;
            case 13:
                codedOutputStream.writeUInt32NoTag(((Integer) obj).intValue());
                break;
            case 14:
                codedOutputStream.writeSFixed32NoTag(((Integer) obj).intValue());
                break;
            case 15:
                codedOutputStream.writeSFixed64NoTag(((Long) obj).longValue());
                break;
            case 16:
                codedOutputStream.writeSInt32NoTag(((Integer) obj).intValue());
                break;
            case 17:
                codedOutputStream.writeSInt64NoTag(((Long) obj).longValue());
                break;
            case 18:
                if (!(obj instanceof Internal.EnumLite)) {
                    codedOutputStream.writeEnumNoTag(((Integer) obj).intValue());
                } else {
                    codedOutputStream.writeEnumNoTag(((Internal.EnumLite) obj).getNumber());
                }
                break;
        }
    }

    public final void a(GeneratedMessageLite.b bVar, Object obj) {
        List arrayList;
        if (!bVar.f47102s0) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        r(bVar, obj);
        Object objF = f(bVar);
        if (objF == null) {
            arrayList = new ArrayList();
            this.f47078a.put(bVar, arrayList);
        } else {
            arrayList = (List) objF;
        }
        arrayList.add(obj);
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final FieldSet<T> clone() {
        t0<T, Object> t0Var;
        FieldSet<T> fieldSet = new FieldSet<>();
        int i10 = 0;
        while (true) {
            t0Var = this.f47078a;
            if (i10 >= t0Var.f47278q0.size()) {
                break;
            }
            Map.Entry<K, Object> entryC = t0Var.c(i10);
            fieldSet.q((FieldDescriptorLite) entryC.getKey(), entryC.getValue());
            i10++;
        }
        Iterator it = t0Var.d().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            fieldSet.q((FieldDescriptorLite) entry.getKey(), entry.getValue());
        }
        fieldSet.f47080c = this.f47080c;
        return fieldSet;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FieldSet) {
            return this.f47078a.equals(((FieldSet) obj).f47078a);
        }
        return false;
    }

    public final Object f(T t10) {
        Object obj = this.f47078a.get(t10);
        return obj instanceof LazyField ? ((LazyField) obj).getValue() : obj;
    }

    public final int g() {
        t0<T, Object> t0Var;
        int i10 = 0;
        int iH = 0;
        while (true) {
            t0Var = this.f47078a;
            if (i10 >= t0Var.f47278q0.size()) {
                break;
            }
            iH += h(t0Var.c(i10));
            i10++;
        }
        Iterator it = t0Var.d().iterator();
        while (it.hasNext()) {
            iH += h((Map.Entry) it.next());
        }
        return iH;
    }

    public final int hashCode() {
        return this.f47078a.hashCode();
    }

    public final int i() {
        t0<T, Object> t0Var;
        int i10 = 0;
        int iE = 0;
        while (true) {
            t0Var = this.f47078a;
            if (i10 >= t0Var.f47278q0.size()) {
                break;
            }
            Map.Entry<K, Object> entryC = t0Var.c(i10);
            iE += e((FieldDescriptorLite) entryC.getKey(), entryC.getValue());
            i10++;
        }
        Iterator it = t0Var.d().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            iE += e((FieldDescriptorLite) entry.getKey(), entry.getValue());
        }
        return iE;
    }

    public final boolean j() {
        return this.f47078a.isEmpty();
    }

    public final boolean k() {
        int i10 = 0;
        while (true) {
            t0<T, Object> t0Var = this.f47078a;
            if (i10 >= t0Var.f47278q0.size()) {
                Iterator it = t0Var.d().iterator();
                while (it.hasNext()) {
                    if (!l((Map.Entry) it.next())) {
                        return false;
                    }
                }
                return true;
            }
            if (!l(t0Var.c(i10))) {
                return false;
            }
            i10++;
        }
    }

    public final Iterator<Map.Entry<T, Object>> m() {
        boolean z10 = this.f47080c;
        t0<T, Object> t0Var = this.f47078a;
        return z10 ? new LazyField.b(t0Var.entrySet().iterator()) : t0Var.entrySet().iterator();
    }

    public final void n() {
        if (this.f47079b) {
            return;
        }
        int i10 = 0;
        while (true) {
            t0<T, Object> t0Var = this.f47078a;
            if (i10 >= t0Var.f47278q0.size()) {
                t0Var.f();
                this.f47079b = true;
                return;
            } else {
                Map.Entry<K, Object> entryC = t0Var.c(i10);
                if (entryC.getValue() instanceof GeneratedMessageLite) {
                    ((GeneratedMessageLite) entryC.getValue()).makeImmutable();
                }
                i10++;
            }
        }
    }

    public final void o(FieldSet<T> fieldSet) {
        t0<T, Object> t0Var;
        int i10 = 0;
        while (true) {
            int size = fieldSet.f47078a.f47278q0.size();
            t0Var = fieldSet.f47078a;
            if (i10 >= size) {
                break;
            }
            p(t0Var.c(i10));
            i10++;
        }
        Iterator it = t0Var.d().iterator();
        while (it.hasNext()) {
            p((Map.Entry) it.next());
        }
    }

    public final void p(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof LazyField) {
            value = ((LazyField) value).getValue();
        }
        boolean zIsRepeated = key.isRepeated();
        t0<T, Object> t0Var = this.f47078a;
        if (zIsRepeated) {
            Object objF = f(key);
            if (objF == null) {
                objF = new ArrayList();
            }
            for (Object obj : (List) value) {
                List list = (List) objF;
                if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    byte[] bArr2 = new byte[bArr.length];
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    obj = bArr2;
                }
                list.add(obj);
            }
            t0Var.put(key, objF);
            return;
        }
        if (key.getLiteJavaType() != WireFormat.JavaType.MESSAGE) {
            if (value instanceof byte[]) {
                byte[] bArr3 = (byte[]) value;
                byte[] bArr4 = new byte[bArr3.length];
                System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
                value = bArr4;
            }
            t0Var.put(key, value);
            return;
        }
        Object objF2 = f(key);
        if (objF2 != null) {
            t0Var.put(key, key.internalMergeFrom(((MessageLite) objF2).toBuilder(), (MessageLite) value).build());
            return;
        }
        if (value instanceof byte[]) {
            byte[] bArr5 = (byte[]) value;
            byte[] bArr6 = new byte[bArr5.length];
            System.arraycopy(bArr5, 0, bArr6, 0, bArr5.length);
            value = bArr6;
        }
        t0Var.put(key, value);
    }

    public final void q(T t10, Object obj) {
        if (!t10.isRepeated()) {
            r(t10, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                r(t10, it.next());
            }
            obj = arrayList;
        }
        if (obj instanceof LazyField) {
            this.f47080c = true;
        }
        this.f47078a.put(t10, obj);
    }

    public FieldSet(int i10) {
        int i11 = t0.f47276w0;
        this.f47078a = new s0(0);
        n();
        n();
    }
}
