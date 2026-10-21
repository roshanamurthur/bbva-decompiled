package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;
import java.util.AbstractMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class MapEntryLite<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b<K, V> f47132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final K f47133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final V f47134c;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f47135a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f47135a = iArr;
            try {
                iArr[WireFormat.FieldType.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f47135a[WireFormat.FieldType.ENUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f47135a[WireFormat.FieldType.GROUP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static class b<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WireFormat.FieldType f47136a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final K f47137b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final WireFormat.FieldType f47138c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final V f47139d;

        public b(WireFormat.FieldType fieldType, K k10, WireFormat.FieldType fieldType2, V v3) {
            this.f47136a = fieldType;
            this.f47137b = k10;
            this.f47138c = fieldType2;
            this.f47139d = v3;
        }
    }

    public MapEntryLite(WireFormat.FieldType fieldType, K k10, WireFormat.FieldType fieldType2, V v3) {
        this.f47132a = new b<>(fieldType, k10, fieldType2, v3);
        this.f47133b = k10;
        this.f47134c = v3;
    }

    public static <K, V> int a(b<K, V> bVar, K k10, V v3) {
        return FieldSet.c(bVar.f47138c, 2, v3) + FieldSet.c(bVar.f47136a, 1, k10);
    }

    public static <T> T b(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, WireFormat.FieldType fieldType, T t10) throws IOException {
        int i10 = a.f47135a[fieldType.ordinal()];
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
        FieldSet fieldSet = FieldSet.f47077d;
        return (T) WireFormat.a(codedInputStream, fieldType, WireFormat.b.STRICT);
    }

    public static <K, V> void c(CodedOutputStream codedOutputStream, b<K, V> bVar, K k10, V v3) throws IOException {
        FieldSet.s(codedOutputStream, bVar.f47136a, 1, k10);
        FieldSet.s(codedOutputStream, bVar.f47138c, 2, v3);
    }

    public static <K, V> MapEntryLite<K, V> newDefaultInstance(WireFormat.FieldType fieldType, K k10, WireFormat.FieldType fieldType2, V v3) {
        return new MapEntryLite<>(fieldType, k10, fieldType2, v3);
    }

    public int computeMessageSize(int i10, K k10, V v3) {
        int iComputeTagSize = CodedOutputStream.computeTagSize(i10);
        int iA = a(this.f47132a, k10, v3);
        return CodedOutputStream.computeUInt32SizeNoTag(iA) + iA + iComputeTagSize;
    }

    public K getKey() {
        return this.f47133b;
    }

    public V getValue() {
        return this.f47134c;
    }

    public Map.Entry<K, V> parseEntry(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        CodedInputStream codedInputStreamNewCodedInput = byteString.newCodedInput();
        b<K, V> bVar = this.f47132a;
        Object objB = bVar.f47137b;
        Object objB2 = bVar.f47139d;
        while (true) {
            int tag = codedInputStreamNewCodedInput.readTag();
            if (tag == 0) {
                break;
            }
            WireFormat.FieldType fieldType = bVar.f47136a;
            if (tag == (fieldType.getWireType() | 8)) {
                objB = b(codedInputStreamNewCodedInput, extensionRegistryLite, fieldType, objB);
            } else {
                WireFormat.FieldType fieldType2 = bVar.f47138c;
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
        b<K, V> bVar = this.f47132a;
        Object objB = bVar.f47137b;
        Object objB2 = bVar.f47139d;
        while (true) {
            int tag = codedInputStream.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == (bVar.f47136a.getWireType() | 8)) {
                objB = b(codedInputStream, extensionRegistryLite, bVar.f47136a, objB);
            } else if (tag == (bVar.f47138c.getWireType() | 16)) {
                objB2 = b(codedInputStream, extensionRegistryLite, bVar.f47138c, objB2);
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
        b<K, V> bVar = this.f47132a;
        codedOutputStream.writeUInt32NoTag(a(bVar, k10, v3));
        c(codedOutputStream, bVar, k10, v3);
    }
}
