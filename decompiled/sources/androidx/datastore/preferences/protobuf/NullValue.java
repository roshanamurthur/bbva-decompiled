package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes2.dex */
public enum NullValue implements Internal.EnumLite {
    NULL_VALUE(0),
    UNRECOGNIZED(-1);

    public static final int NULL_VALUE_VALUE = 0;
    private static final Internal.EnumLiteMap<NullValue> internalValueMap = new a();
    private final int value;

    public static class a implements Internal.EnumLiteMap<NullValue> {
        @Override // androidx.datastore.preferences.protobuf.Internal.EnumLiteMap
        public final Internal.EnumLite findValueByNumber(int i10) {
            return NullValue.forNumber(i10);
        }
    }

    public static final class b implements Internal.EnumVerifier {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f20980a = new b();

        @Override // androidx.datastore.preferences.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i10) {
            return NullValue.forNumber(i10) != null;
        }
    }

    NullValue(int i10) {
        this.value = i10;
    }

    public static NullValue forNumber(int i10) {
        if (i10 != 0) {
            return null;
        }
        return NULL_VALUE;
    }

    public static Internal.EnumLiteMap<NullValue> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f20980a;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static NullValue valueOf(int i10) {
        return forNumber(i10);
    }
}
