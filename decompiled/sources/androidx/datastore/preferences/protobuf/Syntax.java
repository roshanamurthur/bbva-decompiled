package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes2.dex */
public enum Syntax implements Internal.EnumLite {
    SYNTAX_PROTO2(0),
    SYNTAX_PROTO3(1),
    UNRECOGNIZED(-1);

    public static final int SYNTAX_PROTO2_VALUE = 0;
    public static final int SYNTAX_PROTO3_VALUE = 1;
    private static final Internal.EnumLiteMap<Syntax> internalValueMap = new a();
    private final int value;

    public static class a implements Internal.EnumLiteMap<Syntax> {
        @Override // androidx.datastore.preferences.protobuf.Internal.EnumLiteMap
        public final Internal.EnumLite findValueByNumber(int i10) {
            return Syntax.forNumber(i10);
        }
    }

    public static final class b implements Internal.EnumVerifier {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f20997a = new b();

        @Override // androidx.datastore.preferences.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i10) {
            return Syntax.forNumber(i10) != null;
        }
    }

    Syntax(int i10) {
        this.value = i10;
    }

    public static Syntax forNumber(int i10) {
        if (i10 == 0) {
            return SYNTAX_PROTO2;
        }
        if (i10 != 1) {
            return null;
        }
        return SYNTAX_PROTO3;
    }

    public static Internal.EnumLiteMap<Syntax> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f20997a;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static Syntax valueOf(int i10) {
        return forNumber(i10);
    }
}
