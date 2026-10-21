package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import kotlin.UShort;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes2.dex */
public class FlexBuffers {
    public static final int FBT_BLOB = 25;
    public static final int FBT_BOOL = 26;
    public static final int FBT_FLOAT = 3;
    public static final int FBT_INDIRECT_FLOAT = 8;
    public static final int FBT_INDIRECT_INT = 6;
    public static final int FBT_INDIRECT_UINT = 7;
    public static final int FBT_INT = 1;
    public static final int FBT_KEY = 4;
    public static final int FBT_MAP = 9;
    public static final int FBT_NULL = 0;
    public static final int FBT_STRING = 5;
    public static final int FBT_UINT = 2;
    public static final int FBT_VECTOR = 10;
    public static final int FBT_VECTOR_BOOL = 36;
    public static final int FBT_VECTOR_FLOAT = 13;
    public static final int FBT_VECTOR_FLOAT2 = 18;
    public static final int FBT_VECTOR_FLOAT3 = 21;
    public static final int FBT_VECTOR_FLOAT4 = 24;
    public static final int FBT_VECTOR_INT = 11;
    public static final int FBT_VECTOR_INT2 = 16;
    public static final int FBT_VECTOR_INT3 = 19;
    public static final int FBT_VECTOR_INT4 = 22;
    public static final int FBT_VECTOR_KEY = 14;
    public static final int FBT_VECTOR_STRING_DEPRECATED = 15;
    public static final int FBT_VECTOR_UINT = 12;
    public static final int FBT_VECTOR_UINT2 = 17;
    public static final int FBT_VECTOR_UINT3 = 20;
    public static final int FBT_VECTOR_UINT4 = 23;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ArrayReadWriteBuf f21354a = new ArrayReadWriteBuf(new byte[]{0}, 1);

    public static class Blob extends b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final Blob f21355d = new Blob(FlexBuffers.f21354a, 1, 1);

        public static Blob empty() {
            return f21355d;
        }

        public ByteBuffer data() {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(this.f21368a.data());
            int i10 = this.f21369b;
            byteBufferWrap.position(i10);
            byteBufferWrap.limit(size() + i10);
            return byteBufferWrap.asReadOnlyBuffer().slice();
        }

        public byte get(int i10) {
            return this.f21368a.get(this.f21369b + i10);
        }

        public byte[] getBytes() {
            int size = size();
            byte[] bArr = new byte[size];
            for (int i10 = 0; i10 < size; i10++) {
                bArr[i10] = this.f21368a.get(this.f21369b + i10);
            }
            return bArr;
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.b
        public /* bridge */ /* synthetic */ int size() {
            return super.size();
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.a
        public String toString() {
            return this.f21368a.getString(this.f21369b, size());
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.a
        public StringBuilder toString(StringBuilder sb2) {
            sb2.append('\"');
            sb2.append(this.f21368a.getString(this.f21369b, size()));
            sb2.append('\"');
            return sb2;
        }
    }

    public static class FlexBufferException extends RuntimeException {
    }

    public static class Key extends a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final Key f21356d = new Key(FlexBuffers.f21354a, 0, 0);

        public static Key empty() {
            return f21356d;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof Key)) {
                return false;
            }
            Key key = (Key) obj;
            return key.f21369b == this.f21369b && key.f21370c == this.f21370c;
        }

        public int hashCode() {
            return this.f21369b ^ this.f21370c;
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.a
        public StringBuilder toString(StringBuilder sb2) {
            sb2.append(toString());
            return sb2;
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.a
        public String toString() {
            int i10 = this.f21369b;
            int i11 = i10;
            while (true) {
                androidx.emoji2.text.flatbuffer.b bVar = this.f21368a;
                if (bVar.get(i11) == 0) {
                    return bVar.getString(i10, i11 - i10);
                }
                i11++;
            }
        }
    }

    public static class KeyVector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TypedVector f21357a;

        public KeyVector(TypedVector typedVector) {
            this.f21357a = typedVector;
        }

        public Key get(int i10) {
            if (i10 >= size()) {
                return Key.f21356d;
            }
            TypedVector typedVector = this.f21357a;
            int i11 = (i10 * typedVector.f21370c) + typedVector.f21369b;
            androidx.emoji2.text.flatbuffer.b bVar = typedVector.f21368a;
            return new Key(bVar, FlexBuffers.a(bVar, i11, typedVector.f21370c), 1);
        }

        public int size() {
            return this.f21357a.size();
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
            int i10 = 0;
            while (true) {
                TypedVector typedVector = this.f21357a;
                if (i10 >= typedVector.size()) {
                    sb2.append(Constant.BRACKET_CLOSE);
                    return sb2.toString();
                }
                typedVector.get(i10).a(sb2);
                if (i10 != typedVector.size() - 1) {
                    sb2.append(", ");
                }
                i10++;
            }
        }
    }

    public static class Map extends Vector {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final Map f21358e = new Map(FlexBuffers.f21354a, 1, 1);

        public static Map empty() {
            return f21358e;
        }

        public Reference get(String str) {
            return get(str.getBytes(StandardCharsets.UTF_8));
        }

        public KeyVector keys() {
            int i10 = this.f21370c;
            int i11 = this.f21369b - (i10 * 3);
            androidx.emoji2.text.flatbuffer.b bVar = this.f21368a;
            return new KeyVector(new TypedVector(bVar, FlexBuffers.a(bVar, i11, i10), (int) FlexBuffers.c(bVar, i11 + i10, i10), 4));
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Vector, androidx.emoji2.text.flatbuffer.FlexBuffers.a
        public StringBuilder toString(StringBuilder sb2) {
            sb2.append("{ ");
            KeyVector keyVectorKeys = keys();
            int size = size();
            Vector vectorValues = values();
            for (int i10 = 0; i10 < size; i10++) {
                sb2.append('\"');
                sb2.append(keyVectorKeys.get(i10).toString());
                sb2.append("\" : ");
                sb2.append(vectorValues.get(i10).toString());
                if (i10 != size - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append(" }");
            return sb2;
        }

        public Vector values() {
            return new Vector(this.f21368a, this.f21369b, this.f21370c);
        }

        public Reference get(byte[] bArr) {
            int i10;
            byte b10;
            byte b11;
            KeyVector keyVectorKeys = keys();
            int size = keyVectorKeys.size();
            int size2 = keyVectorKeys.size() - 1;
            int i11 = 0;
            while (true) {
                if (i11 > size2) {
                    i10 = -(i11 + 1);
                    break;
                }
                i10 = (i11 + size2) >>> 1;
                Key key = keyVectorKeys.get(i10);
                int i12 = key.f21369b;
                int i13 = 0;
                do {
                    b10 = key.f21368a.get(i12);
                    b11 = bArr[i13];
                    if (b10 == 0) {
                        break;
                    }
                    i12++;
                    i13++;
                    if (i13 == bArr.length) {
                        break;
                    }
                } while (b10 == b11);
                int i14 = b10 - b11;
                if (i14 >= 0) {
                    if (i14 <= 0) {
                        break;
                    }
                    size2 = i10 - 1;
                } else {
                    i11 = i10 + 1;
                }
            }
            return (i10 < 0 || i10 >= size) ? Reference.f21359f : get(i10);
        }
    }

    public static class Reference {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final Reference f21359f = new Reference(FlexBuffers.f21354a, 0, 1, 0);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final androidx.emoji2.text.flatbuffer.b f21360a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f21361b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f21362c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f21363d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f21364e;

        public Reference(androidx.emoji2.text.flatbuffer.b bVar, int i10, int i11, int i12) {
            this(bVar, i10, i11, 1 << (i12 & 3), i12 >> 2);
        }

        public final StringBuilder a(StringBuilder sb2) {
            int i10 = this.f21364e;
            if (i10 != 36) {
                switch (i10) {
                    case 0:
                        sb2.append(AbstractJsonLexerKt.NULL);
                        return sb2;
                    case 1:
                    case 6:
                        sb2.append(asLong());
                        return sb2;
                    case 2:
                    case 7:
                        sb2.append(asUInt());
                        return sb2;
                    case 3:
                    case 8:
                        sb2.append(asFloat());
                        return sb2;
                    case 4:
                        Key keyAsKey = asKey();
                        sb2.append('\"');
                        StringBuilder string = keyAsKey.toString(sb2);
                        string.append('\"');
                        return string;
                    case 5:
                        sb2.append('\"');
                        sb2.append(asString());
                        sb2.append('\"');
                        return sb2;
                    case 9:
                        return asMap().toString(sb2);
                    case 10:
                        return asVector().toString(sb2);
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                        break;
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                        throw new FlexBufferException("not_implemented:" + i10);
                    case 25:
                        return asBlob().toString(sb2);
                    case 26:
                        sb2.append(asBoolean());
                        return sb2;
                    default:
                        return sb2;
                }
            }
            sb2.append(asVector());
            return sb2;
        }

        public Blob asBlob() {
            if (!isBlob() && !isString()) {
                return Blob.empty();
            }
            int i10 = this.f21361b;
            int i11 = this.f21362c;
            androidx.emoji2.text.flatbuffer.b bVar = this.f21360a;
            return new Blob(bVar, FlexBuffers.a(bVar, i10, i11), this.f21363d);
        }

        public boolean asBoolean() {
            if (isBoolean()) {
                return this.f21360a.get(this.f21361b) != 0;
            }
            return asUInt() != 0;
        }

        public double asFloat() {
            int i10 = this.f21362c;
            int i11 = this.f21361b;
            androidx.emoji2.text.flatbuffer.b bVar = this.f21360a;
            int i12 = this.f21364e;
            if (i12 == 3) {
                return FlexBuffers.b(bVar, i11, i10);
            }
            if (i12 == 1) {
                return (int) FlexBuffers.c(bVar, i11, i10);
            }
            if (i12 != 2) {
                if (i12 == 5) {
                    return Double.parseDouble(asString());
                }
                int i13 = this.f21363d;
                if (i12 == 6) {
                    return (int) FlexBuffers.c(bVar, FlexBuffers.a(bVar, i11, i10), i13);
                }
                if (i12 == 7) {
                    return FlexBuffers.d(bVar, FlexBuffers.a(bVar, i11, i10), i13);
                }
                if (i12 == 8) {
                    return FlexBuffers.b(bVar, FlexBuffers.a(bVar, i11, i10), i13);
                }
                if (i12 == 10) {
                    return asVector().size();
                }
                if (i12 != 26) {
                    return 0.0d;
                }
            }
            return FlexBuffers.d(bVar, i11, i10);
        }

        public int asInt() {
            int i10 = this.f21361b;
            androidx.emoji2.text.flatbuffer.b bVar = this.f21360a;
            int i11 = this.f21362c;
            int i12 = this.f21364e;
            if (i12 == 1) {
                return (int) FlexBuffers.c(bVar, i10, i11);
            }
            if (i12 == 2) {
                return (int) FlexBuffers.d(bVar, i10, i11);
            }
            if (i12 == 3) {
                return (int) FlexBuffers.b(bVar, i10, i11);
            }
            if (i12 == 5) {
                return Integer.parseInt(asString());
            }
            int i13 = this.f21363d;
            if (i12 == 6) {
                return (int) FlexBuffers.c(bVar, FlexBuffers.a(bVar, i10, i11), i13);
            }
            if (i12 == 7) {
                return (int) FlexBuffers.d(bVar, FlexBuffers.a(bVar, i10, i11), i11);
            }
            if (i12 == 8) {
                return (int) FlexBuffers.b(bVar, FlexBuffers.a(bVar, i10, i11), i13);
            }
            if (i12 == 10) {
                return asVector().size();
            }
            if (i12 != 26) {
                return 0;
            }
            return (int) FlexBuffers.c(bVar, i10, i11);
        }

        public Key asKey() {
            if (!isKey()) {
                return Key.empty();
            }
            int i10 = this.f21361b;
            int i11 = this.f21362c;
            androidx.emoji2.text.flatbuffer.b bVar = this.f21360a;
            return new Key(bVar, FlexBuffers.a(bVar, i10, i11), this.f21363d);
        }

        public long asLong() {
            int i10 = this.f21361b;
            androidx.emoji2.text.flatbuffer.b bVar = this.f21360a;
            int i11 = this.f21362c;
            int i12 = this.f21364e;
            if (i12 == 1) {
                return FlexBuffers.c(bVar, i10, i11);
            }
            if (i12 == 2) {
                return FlexBuffers.d(bVar, i10, i11);
            }
            if (i12 == 3) {
                return (long) FlexBuffers.b(bVar, i10, i11);
            }
            if (i12 == 5) {
                try {
                    return Long.parseLong(asString());
                } catch (NumberFormatException unused) {
                    return 0L;
                }
            }
            int i13 = this.f21363d;
            if (i12 == 6) {
                return FlexBuffers.c(bVar, FlexBuffers.a(bVar, i10, i11), i13);
            }
            if (i12 == 7) {
                return FlexBuffers.d(bVar, FlexBuffers.a(bVar, i10, i11), i11);
            }
            if (i12 == 8) {
                return (long) FlexBuffers.b(bVar, FlexBuffers.a(bVar, i10, i11), i13);
            }
            if (i12 == 10) {
                return asVector().size();
            }
            if (i12 != 26) {
                return 0L;
            }
            return (int) FlexBuffers.c(bVar, i10, i11);
        }

        public Map asMap() {
            if (!isMap()) {
                return Map.empty();
            }
            int i10 = this.f21361b;
            int i11 = this.f21362c;
            androidx.emoji2.text.flatbuffer.b bVar = this.f21360a;
            return new Map(bVar, FlexBuffers.a(bVar, i10, i11), this.f21363d);
        }

        public String asString() {
            boolean zIsString = isString();
            int i10 = this.f21363d;
            int i11 = this.f21361b;
            androidx.emoji2.text.flatbuffer.b bVar = this.f21360a;
            if (zIsString) {
                int iA = FlexBuffers.a(bVar, i11, this.f21362c);
                return bVar.getString(iA, (int) FlexBuffers.d(bVar, iA - i10, i10));
            }
            if (!isKey()) {
                return "";
            }
            int iA2 = FlexBuffers.a(bVar, i11, i10);
            int i12 = iA2;
            while (bVar.get(i12) != 0) {
                i12++;
            }
            return bVar.getString(iA2, i12 - iA2);
        }

        public long asUInt() {
            int i10 = this.f21361b;
            androidx.emoji2.text.flatbuffer.b bVar = this.f21360a;
            int i11 = this.f21362c;
            int i12 = this.f21364e;
            if (i12 == 2) {
                return FlexBuffers.d(bVar, i10, i11);
            }
            if (i12 == 1) {
                return FlexBuffers.c(bVar, i10, i11);
            }
            if (i12 == 3) {
                return (long) FlexBuffers.b(bVar, i10, i11);
            }
            if (i12 == 10) {
                return asVector().size();
            }
            if (i12 == 26) {
                return (int) FlexBuffers.c(bVar, i10, i11);
            }
            if (i12 == 5) {
                return Long.parseLong(asString());
            }
            int i13 = this.f21363d;
            if (i12 == 6) {
                return FlexBuffers.c(bVar, FlexBuffers.a(bVar, i10, i11), i13);
            }
            if (i12 == 7) {
                return FlexBuffers.d(bVar, FlexBuffers.a(bVar, i10, i11), i13);
            }
            if (i12 != 8) {
                return 0L;
            }
            return (long) FlexBuffers.b(bVar, FlexBuffers.a(bVar, i10, i11), i11);
        }

        public Vector asVector() {
            boolean zIsVector = isVector();
            int i10 = this.f21363d;
            int i11 = this.f21362c;
            int i12 = this.f21361b;
            androidx.emoji2.text.flatbuffer.b bVar = this.f21360a;
            if (zIsVector) {
                return new Vector(bVar, FlexBuffers.a(bVar, i12, i11), i10);
            }
            int i13 = this.f21364e;
            if (i13 == 15) {
                return new TypedVector(bVar, FlexBuffers.a(bVar, i12, i11), i10, 4);
            }
            return ((i13 < 11 || i13 > 15) && i13 != 36) ? Vector.empty() : new TypedVector(bVar, FlexBuffers.a(bVar, i12, i11), i10, i13 - 10);
        }

        public int getType() {
            return this.f21364e;
        }

        public boolean isBlob() {
            return this.f21364e == 25;
        }

        public boolean isBoolean() {
            return this.f21364e == 26;
        }

        public boolean isFloat() {
            int i10 = this.f21364e;
            return i10 == 3 || i10 == 8;
        }

        public boolean isInt() {
            int i10 = this.f21364e;
            return i10 == 1 || i10 == 6;
        }

        public boolean isIntOrUInt() {
            return isInt() || isUInt();
        }

        public boolean isKey() {
            return this.f21364e == 4;
        }

        public boolean isMap() {
            return this.f21364e == 9;
        }

        public boolean isNull() {
            return this.f21364e == 0;
        }

        public boolean isNumeric() {
            return isIntOrUInt() || isFloat();
        }

        public boolean isString() {
            return this.f21364e == 5;
        }

        public boolean isTypedVector() {
            int i10 = this.f21364e;
            return (i10 >= 11 && i10 <= 15) || i10 == 36;
        }

        public boolean isUInt() {
            int i10 = this.f21364e;
            return i10 == 2 || i10 == 7;
        }

        public boolean isVector() {
            int i10 = this.f21364e;
            return i10 == 10 || i10 == 9;
        }

        public String toString() {
            return a(new StringBuilder(128)).toString();
        }

        public Reference(androidx.emoji2.text.flatbuffer.b bVar, int i10, int i11, int i12, int i13) {
            this.f21360a = bVar;
            this.f21361b = i10;
            this.f21362c = i11;
            this.f21363d = i12;
            this.f21364e = i13;
        }
    }

    public static class TypedVector extends Vector {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final TypedVector f21365f = new TypedVector(FlexBuffers.f21354a, 1, 1, 1);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f21366e;

        public TypedVector(androidx.emoji2.text.flatbuffer.b bVar, int i10, int i11, int i12) {
            super(bVar, i10, i11);
            this.f21366e = i12;
        }

        public static TypedVector empty() {
            return f21365f;
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Vector
        public Reference get(int i10) {
            if (i10 >= size()) {
                return Reference.f21359f;
            }
            return new Reference(this.f21368a, (i10 * this.f21370c) + this.f21369b, this.f21370c, 1, this.f21366e);
        }

        public int getElemType() {
            return this.f21366e;
        }

        public boolean isEmptyVector() {
            return this == f21365f;
        }
    }

    public static class Vector extends b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final Vector f21367d = new Vector(FlexBuffers.f21354a, 1, 1);

        public static Vector empty() {
            return f21367d;
        }

        public Reference get(int i10) {
            long size = size();
            long j10 = i10;
            if (j10 >= size) {
                return Reference.f21359f;
            }
            int i11 = this.f21369b;
            int i12 = this.f21370c;
            int iA = (int) androidx.emoji2.text.flatbuffer.a.a(size, i12, i11, j10);
            androidx.emoji2.text.flatbuffer.b bVar = this.f21368a;
            return new Reference(bVar, (i10 * i12) + i11, i12, bVar.get(iA) & 255);
        }

        public boolean isEmpty() {
            return this == f21367d;
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.b
        public /* bridge */ /* synthetic */ int size() {
            return super.size();
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.a
        public /* bridge */ /* synthetic */ String toString() {
            return super.toString();
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.a
        public StringBuilder toString(StringBuilder sb2) {
            sb2.append("[ ");
            int size = size();
            for (int i10 = 0; i10 < size; i10++) {
                get(i10).a(sb2);
                if (i10 != size - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append(" ]");
            return sb2;
        }
    }

    public static abstract class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final androidx.emoji2.text.flatbuffer.b f21368a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f21369b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f21370c;

        public a(androidx.emoji2.text.flatbuffer.b bVar, int i10, int i11) {
            this.f21368a = bVar;
            this.f21369b = i10;
            this.f21370c = i11;
        }

        public String toString() {
            return toString(new StringBuilder(128)).toString();
        }

        public abstract StringBuilder toString(StringBuilder sb2);
    }

    public static abstract class b extends a {
        protected final int size;

        public b(androidx.emoji2.text.flatbuffer.b bVar, int i10, int i11) {
            super(bVar, i10, i11);
            this.size = (int) FlexBuffers.c(bVar, i10 - i11, i11);
        }

        public int size() {
            return this.size;
        }
    }

    public static int a(androidx.emoji2.text.flatbuffer.b bVar, int i10, int i11) {
        return (int) (((long) i10) - d(bVar, i10, i11));
    }

    public static double b(androidx.emoji2.text.flatbuffer.b bVar, int i10, int i11) {
        if (i11 == 4) {
            return bVar.getFloat(i10);
        }
        if (i11 != 8) {
            return -1.0d;
        }
        return bVar.getDouble(i10);
    }

    public static long c(androidx.emoji2.text.flatbuffer.b bVar, int i10, int i11) {
        int i12;
        if (i11 == 1) {
            i12 = bVar.get(i10);
        } else if (i11 == 2) {
            i12 = bVar.getShort(i10);
        } else {
            if (i11 != 4) {
                if (i11 != 8) {
                    return -1L;
                }
                return bVar.getLong(i10);
            }
            i12 = bVar.getInt(i10);
        }
        return i12;
    }

    public static long d(androidx.emoji2.text.flatbuffer.b bVar, int i10, int i11) {
        if (i11 == 1) {
            return bVar.get(i10) & 255;
        }
        if (i11 == 2) {
            return bVar.getShort(i10) & UShort.MAX_VALUE;
        }
        if (i11 == 4) {
            return ((long) bVar.getInt(i10)) & 4294967295L;
        }
        if (i11 != 8) {
            return -1L;
        }
        return bVar.getLong(i10);
    }

    public static int e(int i10, int i11) {
        if (i11 == 0) {
            return i10 + 10;
        }
        if (i11 == 2) {
            return i10 + 15;
        }
        if (i11 == 3) {
            return i10 + 18;
        }
        if (i11 != 4) {
            return 0;
        }
        return i10 + 21;
    }

    @Deprecated
    public static Reference getRoot(ByteBuffer byteBuffer) {
        return getRoot(byteBuffer.hasArray() ? new ArrayReadWriteBuf(byteBuffer.array(), byteBuffer.limit()) : new ByteBufferReadWriteBuf(byteBuffer));
    }

    public static Reference getRoot(androidx.emoji2.text.flatbuffer.b bVar) {
        int iLimit = bVar.limit();
        byte b10 = bVar.get(iLimit - 1);
        int i10 = iLimit - 2;
        return new Reference(bVar, i10 - b10, b10, bVar.get(i10) & 255);
    }
}
