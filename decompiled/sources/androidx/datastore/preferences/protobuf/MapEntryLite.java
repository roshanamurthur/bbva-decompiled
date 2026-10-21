package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.AbstractMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class MapEntryLite<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b<K, V> f20968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final K f20969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final V f20970c;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f20971a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f20971a = iArr;
            try {
                iArr[WireFormat.FieldType.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20971a[WireFormat.FieldType.ENUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20971a[WireFormat.FieldType.GROUP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static class b<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WireFormat.FieldType f20972a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final K f20973b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final WireFormat.FieldType f20974c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final V f20975d;

        public b(WireFormat.FieldType fieldType, K k10, WireFormat.FieldType fieldType2, V v3) {
            this.f20972a = fieldType;
            this.f20973b = k10;
            this.f20974c = fieldType2;
            this.f20975d = v3;
        }
    }

    public MapEntryLite(WireFormat.FieldType fieldType, K k10, WireFormat.FieldType fieldType2, V v3) {
        this.f20968a = new b<>(fieldType, k10, fieldType2, v3);
        this.f20969b = k10;
        this.f20970c = v3;
    }

    public static <K, V> int a(b<K, V> bVar, K k10, V v3) {
        return FieldSet.c(bVar.f20974c, 2, v3) + FieldSet.c(bVar.f20972a, 1, k10);
    }

    public static <T> T b(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, WireFormat.FieldType fieldType, T t10) throws IOException {
        int i10 = a.f20971a[fieldType.ordinal()];
        if (i10 == 1) {
            MessageLite.Builder builder = ((MessageLite) t10).toBuilder();
            codedInputStream.readMessage(builder, extensionRegistryLite);
            return (T) builder.buildPartial();
        }
        if (i10 == 2) {
            return (T) Integer.valueOf(codedInputStream.readEnum());
        }
        if (i10 == 3) {
            throw new RuntimeException("Groups are not allowed in maps.");
        }
        FieldSet fieldSet = FieldSet.f20913d;
        return (T) WireFormat.a(codedInputStream, fieldType, WireFormat.b.STRICT);
    }

    public static <K, V> void c(CodedOutputStream codedOutputStream, b<K, V> bVar, K k10, V v3) throws IOException {
        FieldSet.s(codedOutputStream, bVar.f20972a, 1, k10);
        FieldSet.s(codedOutputStream, bVar.f20974c, 2, v3);
    }

    public static <K, V> MapEntryLite<K, V> newDefaultInstance(WireFormat.FieldType fieldType, K k10, WireFormat.FieldType fieldType2, V v3) {
        return new MapEntryLite<>(fieldType, k10, fieldType2, v3);
    }

    public int computeMessageSize(int i10, K k10, V v3) {
        int iComputeTagSize = CodedOutputStream.computeTagSize(i10);
        int iA = a(this.f20968a, k10, v3);
        return CodedOutputStream.computeUInt32SizeNoTag(iA) + iA + iComputeTagSize;
    }

    public K getKey() {
        return this.f20969b;
    }

    public V getValue() {
        return this.f20970c;
    }

    public Map.Entry<K, V> parseEntry(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        CodedInputStream codedInputStreamNewCodedInput = byteString.newCodedInput();
        b<K, V> bVar = this.f20968a;
        Object objB = bVar.f20973b;
        Object objB2 = bVar.f20975d;
        while (true) {
            int tag = codedInputStreamNewCodedInput.readTag();
            if (tag == 0) {
                break;
            }
            WireFormat.FieldType fieldType = bVar.f20972a;
            if (tag == (fieldType.getWireType() | 8)) {
                objB = b(codedInputStreamNewCodedInput, extensionRegistryLite, fieldType, objB);
            } else {
                WireFormat.FieldType fieldType2 = bVar.f20974c;
                if (tag == (fieldType2.getWireType() | 16)) {
                    objB2 = b(codedInputStreamNewCodedInput, extensionRegistryLite, fieldType2, objB2);
                } else if (!codedInputStreamNewCodedInput.skipField(tag)) {
                    break;
                }
            }
        }
        return new AbstractMap.SimpleImmutableEntry(objB, objB2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void parseInto(MapFieldLite<K, V> mapFieldLite, CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
        b<K, V> bVar = this.f20968a;
        Object objB = bVar.f20973b;
        Object objB2 = bVar.f20975d;
        while (true) {
            int tag = codedInputStream.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == (bVar.f20972a.getWireType() | 8)) {
                objB = b(codedInputStream, extensionRegistryLite, bVar.f20972a, objB);
            } else if (tag == (bVar.f20974c.getWireType() | 16)) {
                objB2 = b(codedInputStream, extensionRegistryLite, bVar.f20974c, objB2);
            } else if (!codedInputStream.skipField(tag)) {
                break;
            }
        }
        codedInputStream.checkLastTagWas(0);
        codedInputStream.popLimit(iPushLimit);
        mapFieldLite.put(objB, objB2);
    }

    public void serializeTo(CodedOutputStream codedOutputStream, int i10, K k10, V v3) throws IOException {
        codedOutputStream.writeTag(i10, 2);
        b<K, V> bVar = this.f20968a;
        codedOutputStream.writeUInt32NoTag(a(bVar, k10, v3));
        c(codedOutputStream, bVar, k10, v3);
    }
}
