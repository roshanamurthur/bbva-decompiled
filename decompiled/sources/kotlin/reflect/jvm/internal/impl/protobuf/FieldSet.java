package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite;

/* JADX INFO: loaded from: classes12.dex */
public final class FieldSet<FieldDescriptorType extends FieldDescriptorLite<FieldDescriptorType>> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final FieldSet f81389d = new FieldSet(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f81391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f81392c = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f81390a = new c(16);

    public interface FieldDescriptorLite<T extends FieldDescriptorLite<T>> extends Comparable<T> {
        WireFormat.JavaType getLiteJavaType();

        WireFormat.FieldType getLiteType();

        int getNumber();

        MessageLite.Builder internalMergeFrom(MessageLite.Builder builder, MessageLite messageLite);

        boolean isPacked();

        boolean isRepeated();
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f81393a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f81394b;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f81394b = iArr;
            try {
                iArr[WireFormat.FieldType.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f81394b[WireFormat.FieldType.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f81394b[WireFormat.FieldType.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f81394b[WireFormat.FieldType.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f81394b[WireFormat.FieldType.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f81394b[WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f81394b[WireFormat.FieldType.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f81394b[WireFormat.FieldType.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f81394b[WireFormat.FieldType.STRING.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f81394b[WireFormat.FieldType.BYTES.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f81394b[WireFormat.FieldType.UINT32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f81394b[WireFormat.FieldType.SFIXED32.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f81394b[WireFormat.FieldType.SFIXED64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f81394b[WireFormat.FieldType.SINT32.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f81394b[WireFormat.FieldType.SINT64.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f81394b[WireFormat.FieldType.GROUP.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f81394b[WireFormat.FieldType.MESSAGE.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f81394b[WireFormat.FieldType.ENUM.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[WireFormat.JavaType.values().length];
            f81393a = iArr2;
            try {
                iArr2[WireFormat.JavaType.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f81393a[WireFormat.JavaType.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f81393a[WireFormat.JavaType.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f81393a[WireFormat.JavaType.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f81393a[WireFormat.JavaType.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f81393a[WireFormat.JavaType.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f81393a[WireFormat.JavaType.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f81393a[WireFormat.JavaType.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f81393a[WireFormat.JavaType.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    public FieldSet() {
    }

    public static int a(WireFormat.FieldType fieldType, Object obj) {
        switch (a.f81394b[fieldType.ordinal()]) {
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
                return CodedOutputStream.computeStringSizeNoTag((String) obj);
            case 10:
                return obj instanceof ByteString ? CodedOutputStream.computeBytesSizeNoTag((ByteString) obj) : CodedOutputStream.computeByteArraySizeNoTag((byte[]) obj);
            case 11:
                return CodedOutputStream.computeUInt32SizeNoTag(((Integer) obj).intValue());
            case 12:
                return CodedOutputStream.computeSFixed32SizeNoTag(((Integer) obj).intValue());
            case 13:
                return CodedOutputStream.computeSFixed64SizeNoTag(((Long) obj).longValue());
            case 14:
                return CodedOutputStream.computeSInt32SizeNoTag(((Integer) obj).intValue());
            case 15:
                return CodedOutputStream.computeSInt64SizeNoTag(((Long) obj).longValue());
            case 16:
                return CodedOutputStream.computeGroupSizeNoTag((MessageLite) obj);
            case 17:
                return obj instanceof LazyField ? CodedOutputStream.computeLazyFieldSizeNoTag((LazyField) obj) : CodedOutputStream.computeMessageSizeNoTag((MessageLite) obj);
            case 18:
                return obj instanceof Internal.EnumLite ? CodedOutputStream.computeEnumSizeNoTag(((Internal.EnumLite) obj).getNumber()) : CodedOutputStream.computeEnumSizeNoTag(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static boolean b(Map.Entry entry) {
        FieldDescriptorLite fieldDescriptorLite = (FieldDescriptorLite) entry.getKey();
        if (fieldDescriptorLite.getLiteJavaType() == WireFormat.JavaType.MESSAGE) {
            if (fieldDescriptorLite.isRepeated()) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (!((MessageLite) it.next()).isInitialized()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (!(value instanceof MessageLite)) {
                    if (value instanceof LazyField) {
                        return true;
                    }
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
                if (!((MessageLite) value).isInitialized()) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int computeFieldSize(FieldDescriptorLite<?> fieldDescriptorLite, Object obj) {
        WireFormat.FieldType liteType = fieldDescriptorLite.getLiteType();
        int number = fieldDescriptorLite.getNumber();
        if (!fieldDescriptorLite.isRepeated()) {
            int iComputeTagSize = CodedOutputStream.computeTagSize(number);
            if (liteType == WireFormat.FieldType.GROUP) {
                iComputeTagSize *= 2;
            }
            return a(liteType, obj) + iComputeTagSize;
        }
        int iA = 0;
        if (fieldDescriptorLite.isPacked()) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                iA += a(liteType, it.next());
            }
            return CodedOutputStream.computeRawVarint32Size(iA) + CodedOutputStream.computeTagSize(number) + iA;
        }
        for (Object obj2 : (List) obj) {
            int iComputeTagSize2 = CodedOutputStream.computeTagSize(number);
            if (liteType == WireFormat.FieldType.GROUP) {
                iComputeTagSize2 *= 2;
            }
            iA += a(liteType, obj2) + iComputeTagSize2;
        }
        return iA;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:32:? A[RETURN, SYNTHETIC] */
    public static void d(WireFormat.FieldType fieldType, Object obj) {
        boolean z10;
        obj.getClass();
        switch (a.f81393a[fieldType.getJavaType().ordinal()]) {
            case 1:
                z10 = obj instanceof Integer;
                if (z10) {
                    return;
                }
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            case 2:
                z10 = obj instanceof Long;
                if (z10) {
                    return;
                }
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            case 3:
                z10 = obj instanceof Float;
                if (z10) {
                    return;
                }
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            case 4:
                z10 = obj instanceof Double;
                if (z10) {
                    return;
                }
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            case 5:
                z10 = obj instanceof Boolean;
                if (z10) {
                    return;
                }
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            case 6:
                z10 = obj instanceof String;
                if (z10) {
                    return;
                }
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            case 7:
                if ((obj instanceof ByteString) || (obj instanceof byte[])) {
                    return;
                }
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            case 8:
                if ((obj instanceof Integer) || (obj instanceof Internal.EnumLite)) {
                    return;
                }
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            case 9:
                if ((obj instanceof MessageLite) || (obj instanceof LazyField)) {
                    return;
                }
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            default:
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
    }

    public static void e(CodedOutputStream codedOutputStream, WireFormat.FieldType fieldType, int i10, Object obj) throws IOException {
        if (fieldType == WireFormat.FieldType.GROUP) {
            codedOutputStream.writeGroup(i10, (MessageLite) obj);
        } else {
            codedOutputStream.writeTag(i10, fieldType.getWireType());
            f(codedOutputStream, fieldType, obj);
        }
    }

    public static <T extends FieldDescriptorLite<T>> FieldSet<T> emptySet() {
        return f81389d;
    }

    public static void f(CodedOutputStream codedOutputStream, WireFormat.FieldType fieldType, Object obj) throws IOException {
        switch (a.f81394b[fieldType.ordinal()]) {
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
                codedOutputStream.writeStringNoTag((String) obj);
                break;
            case 10:
                if (!(obj instanceof ByteString)) {
                    codedOutputStream.writeByteArrayNoTag((byte[]) obj);
                } else {
                    codedOutputStream.writeBytesNoTag((ByteString) obj);
                }
                break;
            case 11:
                codedOutputStream.writeUInt32NoTag(((Integer) obj).intValue());
                break;
            case 12:
                codedOutputStream.writeSFixed32NoTag(((Integer) obj).intValue());
                break;
            case 13:
                codedOutputStream.writeSFixed64NoTag(((Long) obj).longValue());
                break;
            case 14:
                codedOutputStream.writeSInt32NoTag(((Integer) obj).intValue());
                break;
            case 15:
                codedOutputStream.writeSInt64NoTag(((Long) obj).longValue());
                break;
            case 16:
                codedOutputStream.writeGroupNoTag((MessageLite) obj);
                break;
            case 17:
                codedOutputStream.writeMessageNoTag((MessageLite) obj);
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

    public static <T extends FieldDescriptorLite<T>> FieldSet<T> newFieldSet() {
        return new FieldSet<>();
    }

    public static Object readPrimitiveField(CodedInputStream codedInputStream, WireFormat.FieldType fieldType, boolean z10) throws IOException {
        switch (a.f81394b[fieldType.ordinal()]) {
            case 1:
                return Double.valueOf(codedInputStream.readDouble());
            case 2:
                return Float.valueOf(codedInputStream.readFloat());
            case 3:
                return Long.valueOf(codedInputStream.readInt64());
            case 4:
                return Long.valueOf(codedInputStream.readUInt64());
            case 5:
                return Integer.valueOf(codedInputStream.readInt32());
            case 6:
                return Long.valueOf(codedInputStream.readFixed64());
            case 7:
                return Integer.valueOf(codedInputStream.readFixed32());
            case 8:
                return Boolean.valueOf(codedInputStream.readBool());
            case 9:
                return z10 ? codedInputStream.readStringRequireUtf8() : codedInputStream.readString();
            case 10:
                return codedInputStream.readBytes();
            case 11:
                return Integer.valueOf(codedInputStream.readUInt32());
            case 12:
                return Integer.valueOf(codedInputStream.readSFixed32());
            case 13:
                return Long.valueOf(codedInputStream.readSFixed64());
            case 14:
                return Integer.valueOf(codedInputStream.readSInt32());
            case 15:
                return Long.valueOf(codedInputStream.readSInt64());
            case 16:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case 17:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case 18:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static void writeField(FieldDescriptorLite<?> fieldDescriptorLite, Object obj, CodedOutputStream codedOutputStream) throws IOException {
        WireFormat.FieldType liteType = fieldDescriptorLite.getLiteType();
        int number = fieldDescriptorLite.getNumber();
        if (!fieldDescriptorLite.isRepeated()) {
            if (obj instanceof LazyField) {
                e(codedOutputStream, liteType, number, ((LazyField) obj).getValue());
                return;
            } else {
                e(codedOutputStream, liteType, number, obj);
                return;
            }
        }
        List list = (List) obj;
        if (!fieldDescriptorLite.isPacked()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                e(codedOutputStream, liteType, number, it.next());
            }
            return;
        }
        codedOutputStream.writeTag(number, 2);
        Iterator it2 = list.iterator();
        int iA = 0;
        while (it2.hasNext()) {
            iA += a(liteType, it2.next());
        }
        codedOutputStream.writeRawVarint32(iA);
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            f(codedOutputStream, liteType, it3.next());
        }
    }

    public void addRepeatedField(FieldDescriptorType fielddescriptortype, Object obj) {
        List arrayList;
        if (!fielddescriptortype.isRepeated()) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        d(fielddescriptortype.getLiteType(), obj);
        Object field = getField(fielddescriptortype);
        if (field == null) {
            arrayList = new ArrayList();
            this.f81390a.put(fielddescriptortype, arrayList);
        } else {
            arrayList = (List) field;
        }
        arrayList.add(obj);
    }

    public final void c(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof LazyField) {
            value = ((LazyField) value).getValue();
        }
        boolean zIsRepeated = key.isRepeated();
        c cVar = this.f81390a;
        if (zIsRepeated) {
            Object field = getField(key);
            if (field == null) {
                field = new ArrayList();
            }
            for (Object obj : (List) value) {
                List list = (List) field;
                if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    byte[] bArr2 = new byte[bArr.length];
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    obj = bArr2;
                }
                list.add(obj);
            }
            cVar.put(key, field);
            return;
        }
        if (key.getLiteJavaType() != WireFormat.JavaType.MESSAGE) {
            if (value instanceof byte[]) {
                byte[] bArr3 = (byte[]) value;
                byte[] bArr4 = new byte[bArr3.length];
                System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
                value = bArr4;
            }
            cVar.put(key, value);
            return;
        }
        Object field2 = getField(key);
        if (field2 != null) {
            cVar.put(key, key.internalMergeFrom(((MessageLite) field2).toBuilder(), (MessageLite) value).build());
            return;
        }
        if (value instanceof byte[]) {
            byte[] bArr5 = (byte[]) value;
            byte[] bArr6 = new byte[bArr5.length];
            System.arraycopy(bArr5, 0, bArr6, 0, bArr5.length);
            value = bArr6;
        }
        cVar.put(key, value);
    }

    public Object getField(FieldDescriptorType fielddescriptortype) {
        Object obj = this.f81390a.get(fielddescriptortype);
        return obj instanceof LazyField ? ((LazyField) obj).getValue() : obj;
    }

    public Object getRepeatedField(FieldDescriptorType fielddescriptortype, int i10) {
        if (!fielddescriptortype.isRepeated()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object field = getField(fielddescriptortype);
        if (field != null) {
            return ((List) field).get(i10);
        }
        throw new IndexOutOfBoundsException();
    }

    public int getRepeatedFieldCount(FieldDescriptorType fielddescriptortype) {
        if (!fielddescriptortype.isRepeated()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object field = getField(fielddescriptortype);
        if (field == null) {
            return 0;
        }
        return ((List) field).size();
    }

    public int getSerializedSize() {
        c cVar;
        int i10 = 0;
        int iComputeFieldSize = 0;
        while (true) {
            cVar = this.f81390a;
            if (i10 >= cVar.getNumArrayEntries()) {
                break;
            }
            Map.Entry<Object, Object> arrayEntryAt = cVar.getArrayEntryAt(i10);
            iComputeFieldSize += computeFieldSize((FieldDescriptorLite) arrayEntryAt.getKey(), arrayEntryAt.getValue());
            i10++;
        }
        for (Map.Entry<Object, Object> entry : cVar.getOverflowEntries()) {
            iComputeFieldSize += computeFieldSize((FieldDescriptorLite) entry.getKey(), entry.getValue());
        }
        return iComputeFieldSize;
    }

    public boolean hasField(FieldDescriptorType fielddescriptortype) {
        if (fielddescriptortype.isRepeated()) {
            throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }
        return this.f81390a.get(fielddescriptortype) != null;
    }

    public boolean isInitialized() {
        int i10 = 0;
        while (true) {
            c cVar = this.f81390a;
            if (i10 >= cVar.getNumArrayEntries()) {
                Iterator<Map.Entry<Object, Object>> it = cVar.getOverflowEntries().iterator();
                while (it.hasNext()) {
                    if (!b(it.next())) {
                        return false;
                    }
                }
                return true;
            }
            if (!b(cVar.getArrayEntryAt(i10))) {
                return false;
            }
            i10++;
        }
    }

    public Iterator<Map.Entry<FieldDescriptorType, Object>> iterator() {
        boolean z10 = this.f81392c;
        c cVar = this.f81390a;
        return z10 ? new LazyField.b(cVar.entrySet().iterator()) : (Iterator<Map.Entry<FieldDescriptorType, Object>>) cVar.entrySet().iterator();
    }

    public void makeImmutable() {
        if (this.f81391b) {
            return;
        }
        this.f81390a.makeImmutable();
        this.f81391b = true;
    }

    public void mergeFrom(FieldSet<FieldDescriptorType> fieldSet) {
        c cVar;
        int i10 = 0;
        while (true) {
            int numArrayEntries = fieldSet.f81390a.getNumArrayEntries();
            cVar = fieldSet.f81390a;
            if (i10 >= numArrayEntries) {
                break;
            }
            c(cVar.getArrayEntryAt(i10));
            i10++;
        }
        Iterator<Map.Entry<Object, Object>> it = cVar.getOverflowEntries().iterator();
        while (it.hasNext()) {
            c((Map.Entry) it.next());
        }
    }

    public void setField(FieldDescriptorType fielddescriptortype, Object obj) {
        if (!fielddescriptortype.isRepeated()) {
            d(fielddescriptortype.getLiteType(), obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                d(fielddescriptortype.getLiteType(), it.next());
            }
            obj = arrayList;
        }
        if (obj instanceof LazyField) {
            this.f81392c = true;
        }
        this.f81390a.put(fielddescriptortype, obj);
    }

    public FieldSet<FieldDescriptorType> clone() {
        c cVar;
        FieldSet<FieldDescriptorType> fieldSetNewFieldSet = newFieldSet();
        int i10 = 0;
        while (true) {
            cVar = this.f81390a;
            if (i10 >= cVar.getNumArrayEntries()) {
                break;
            }
            Map.Entry<Object, Object> arrayEntryAt = cVar.getArrayEntryAt(i10);
            fieldSetNewFieldSet.setField((FieldDescriptorLite) arrayEntryAt.getKey(), arrayEntryAt.getValue());
            i10++;
        }
        for (Map.Entry<Object, Object> entry : cVar.getOverflowEntries()) {
            fieldSetNewFieldSet.setField((FieldDescriptorLite) entry.getKey(), entry.getValue());
        }
        fieldSetNewFieldSet.f81392c = this.f81392c;
        return fieldSetNewFieldSet;
    }

    public FieldSet(int i10) {
        makeImmutable();
    }
}
