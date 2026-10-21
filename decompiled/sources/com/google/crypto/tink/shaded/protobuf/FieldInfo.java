package com.google.crypto.tink.shaded.protobuf;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes10.dex */
public final class FieldInfo implements Comparable<FieldInfo> {
    public final Object E0;
    public final Internal.EnumVerifier F0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final java.lang.reflect.Field f47056p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final FieldType f47057q0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final int f47059s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final java.lang.reflect.Field f47060t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final int f47061u0;
    public final boolean v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final boolean f47062w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final java.lang.reflect.Field f47063x0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Class<?> f47058r0 = null;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final Class<?> f47064y0 = null;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public java.lang.reflect.Field f47065a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public FieldType f47066b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f47067c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public java.lang.reflect.Field f47068d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f47069e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f47070f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f47071g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Object f47072h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public Internal.EnumVerifier f47073i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public java.lang.reflect.Field f47074j;

        public FieldInfo build() {
            Object obj = this.f47072h;
            if (obj != null) {
                java.lang.reflect.Field field = this.f47065a;
                int i10 = this.f47067c;
                Internal.EnumVerifier enumVerifier = this.f47073i;
                Charset charset = Internal.f47106a;
                FieldInfo.a(i10);
                if (field != null) {
                    return new FieldInfo(field, i10, FieldType.MAP, null, 0, false, true, obj, enumVerifier, null);
                }
                throw new NullPointerException("field");
            }
            java.lang.reflect.Field field2 = this.f47068d;
            if (field2 != null) {
                if (this.f47070f) {
                    java.lang.reflect.Field field3 = this.f47065a;
                    int i11 = this.f47067c;
                    FieldType fieldType = this.f47066b;
                    int i12 = this.f47069e;
                    boolean z10 = this.f47071g;
                    Internal.EnumVerifier enumVerifier2 = this.f47073i;
                    FieldInfo.a(i11);
                    Charset charset2 = Internal.f47106a;
                    if (field3 == null) {
                        throw new NullPointerException("field");
                    }
                    if (fieldType == null) {
                        throw new NullPointerException("fieldType");
                    }
                    if (i12 == 0 || ((i12 - 1) & i12) != 0) {
                        throw new IllegalArgumentException(androidx.appcompat.widget.g0.c("presenceMask must have exactly one bit set: ", i12));
                    }
                    return new FieldInfo(field3, i11, fieldType, field2, i12, true, z10, null, enumVerifier2, null);
                }
                java.lang.reflect.Field field4 = this.f47065a;
                int i13 = this.f47067c;
                FieldType fieldType2 = this.f47066b;
                int i14 = this.f47069e;
                boolean z11 = this.f47071g;
                Internal.EnumVerifier enumVerifier3 = this.f47073i;
                FieldInfo.a(i13);
                Charset charset3 = Internal.f47106a;
                if (field4 == null) {
                    throw new NullPointerException("field");
                }
                if (fieldType2 == null) {
                    throw new NullPointerException("fieldType");
                }
                if (i14 == 0 || ((i14 - 1) & i14) != 0) {
                    throw new IllegalArgumentException(androidx.appcompat.widget.g0.c("presenceMask must have exactly one bit set: ", i14));
                }
                return new FieldInfo(field4, i13, fieldType2, field2, i14, false, z11, null, enumVerifier3, null);
            }
            Internal.EnumVerifier enumVerifier4 = this.f47073i;
            if (enumVerifier4 != null) {
                java.lang.reflect.Field field5 = this.f47074j;
                if (field5 == null) {
                    java.lang.reflect.Field field6 = this.f47065a;
                    int i15 = this.f47067c;
                    FieldType fieldType3 = this.f47066b;
                    FieldInfo.a(i15);
                    Charset charset4 = Internal.f47106a;
                    if (field6 != null) {
                        return new FieldInfo(field6, i15, fieldType3, null, 0, false, false, null, enumVerifier4, null);
                    }
                    throw new NullPointerException("field");
                }
                java.lang.reflect.Field field7 = this.f47065a;
                int i16 = this.f47067c;
                FieldType fieldType4 = this.f47066b;
                FieldInfo.a(i16);
                Charset charset5 = Internal.f47106a;
                if (field7 != null) {
                    return new FieldInfo(field7, i16, fieldType4, null, 0, false, false, null, enumVerifier4, field5);
                }
                throw new NullPointerException("field");
            }
            java.lang.reflect.Field field8 = this.f47074j;
            if (field8 != null) {
                java.lang.reflect.Field field9 = this.f47065a;
                int i17 = this.f47067c;
                FieldType fieldType5 = this.f47066b;
                FieldInfo.a(i17);
                Charset charset6 = Internal.f47106a;
                if (field9 == null) {
                    throw new NullPointerException("field");
                }
                if (fieldType5 == null) {
                    throw new NullPointerException("fieldType");
                }
                if (fieldType5 == FieldType.MESSAGE_LIST || fieldType5 == FieldType.GROUP_LIST) {
                    throw new IllegalStateException("Shouldn't be called for repeated message fields.");
                }
                return new FieldInfo(field9, i17, fieldType5, null, 0, false, false, null, null, field8);
            }
            java.lang.reflect.Field field10 = this.f47065a;
            int i18 = this.f47067c;
            FieldType fieldType6 = this.f47066b;
            boolean z12 = this.f47071g;
            FieldInfo.a(i18);
            Charset charset7 = Internal.f47106a;
            if (field10 == null) {
                throw new NullPointerException("field");
            }
            if (fieldType6 == null) {
                throw new NullPointerException("fieldType");
            }
            if (fieldType6 == FieldType.MESSAGE_LIST || fieldType6 == FieldType.GROUP_LIST) {
                throw new IllegalStateException("Shouldn't be called for repeated message fields.");
            }
            return new FieldInfo(field10, i18, fieldType6, null, 0, false, z12, null, null, null);
        }

        public Builder withCachedSizeField(java.lang.reflect.Field field) {
            this.f47074j = field;
            return this;
        }

        public Builder withEnforceUtf8(boolean z10) {
            this.f47071g = z10;
            return this;
        }

        public Builder withEnumVerifier(Internal.EnumVerifier enumVerifier) {
            this.f47073i = enumVerifier;
            return this;
        }

        public Builder withField(java.lang.reflect.Field field) {
            this.f47065a = field;
            return this;
        }

        public Builder withFieldNumber(int i10) {
            this.f47067c = i10;
            return this;
        }

        public Builder withMapDefaultEntry(Object obj) {
            this.f47072h = obj;
            return this;
        }

        public Builder withOneof(j0 j0Var, Class<?> cls) {
            if (this.f47065a == null && this.f47068d == null) {
                return this;
            }
            throw new IllegalStateException("Cannot set oneof when field or presenceField have been provided");
        }

        public Builder withPresence(java.lang.reflect.Field field, int i10) {
            Charset charset = Internal.f47106a;
            if (field == null) {
                throw new NullPointerException("presenceField");
            }
            this.f47068d = field;
            this.f47069e = i10;
            return this;
        }

        public Builder withRequired(boolean z10) {
            this.f47070f = z10;
            return this;
        }

        public Builder withType(FieldType fieldType) {
            this.f47066b = fieldType;
            return this;
        }
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f47075a;

        static {
            int[] iArr = new int[FieldType.values().length];
            f47075a = iArr;
            try {
                iArr[FieldType.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f47075a[FieldType.GROUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f47075a[FieldType.MESSAGE_LIST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f47075a[FieldType.GROUP_LIST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public FieldInfo(java.lang.reflect.Field field, int i10, FieldType fieldType, java.lang.reflect.Field field2, int i11, boolean z10, boolean z11, Object obj, Internal.EnumVerifier enumVerifier, java.lang.reflect.Field field3) {
        this.f47056p0 = field;
        this.f47057q0 = fieldType;
        this.f47059s0 = i10;
        this.f47060t0 = field2;
        this.f47061u0 = i11;
        this.v0 = z10;
        this.f47062w0 = z11;
        this.E0 = obj;
        this.F0 = enumVerifier;
        this.f47063x0 = field3;
    }

    public static void a(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException(androidx.appcompat.widget.g0.c("fieldNumber must be positive: ", i10));
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(FieldInfo fieldInfo) {
        return this.f47059s0 - fieldInfo.f47059s0;
    }
}
