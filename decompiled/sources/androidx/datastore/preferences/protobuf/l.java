package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: ExtensionSchemaLite.java */
/* JADX INFO: loaded from: classes2.dex */
public final class l extends k<GeneratedMessageLite.b> {

    /* JADX INFO: compiled from: ExtensionSchemaLite.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21076a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f21076a = iArr;
            try {
                iArr[WireFormat.FieldType.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21076a[WireFormat.FieldType.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21076a[WireFormat.FieldType.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21076a[WireFormat.FieldType.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21076a[WireFormat.FieldType.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21076a[WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21076a[WireFormat.FieldType.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f21076a[WireFormat.FieldType.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f21076a[WireFormat.FieldType.UINT32.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f21076a[WireFormat.FieldType.SFIXED32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f21076a[WireFormat.FieldType.SFIXED64.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f21076a[WireFormat.FieldType.SINT32.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f21076a[WireFormat.FieldType.SINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f21076a[WireFormat.FieldType.ENUM.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f21076a[WireFormat.FieldType.BYTES.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f21076a[WireFormat.FieldType.STRING.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f21076a[WireFormat.FieldType.GROUP.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f21076a[WireFormat.FieldType.MESSAGE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public final int a(Map.Entry<?, ?> entry) {
        return ((GeneratedMessageLite.b) entry.getKey()).f20937q0;
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public final GeneratedMessageLite.GeneratedExtension b(ExtensionRegistryLite extensionRegistryLite, MessageLite messageLite, int i10) {
        return extensionRegistryLite.findLiteExtensionByNumber(messageLite, i10);
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public final FieldSet<GeneratedMessageLite.b> c(Object obj) {
        return ((GeneratedMessageLite.ExtendableMessage) obj).extensions;
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public final FieldSet<GeneratedMessageLite.b> d(Object obj) {
        return ((GeneratedMessageLite.ExtendableMessage) obj).k();
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public final boolean e(MessageLite messageLite) {
        return messageLite instanceof GeneratedMessageLite.ExtendableMessage;
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public final void f(Object obj) {
        ((GeneratedMessageLite.ExtendableMessage) obj).extensions.n();
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public final <UT, UB> UB g(m0 m0Var, Object obj, ExtensionRegistryLite extensionRegistryLite, FieldSet<GeneratedMessageLite.b> fieldSet, UB ub2, t0<UT, UB> t0Var) throws IOException {
        Object objValueOf;
        Object objF;
        ArrayList arrayList;
        GeneratedMessageLite.GeneratedExtension generatedExtension = (GeneratedMessageLite.GeneratedExtension) obj;
        int number = generatedExtension.getNumber();
        GeneratedMessageLite.b bVar = generatedExtension.f20931d;
        boolean z10 = bVar.f20939s0;
        Internal.EnumLiteMap<?> enumLiteMap = bVar.f20936p0;
        if (z10 && bVar.f20940t0) {
            switch (a.f21076a[generatedExtension.getLiteType().ordinal()]) {
                case 1:
                    arrayList = new ArrayList();
                    m0Var.M(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    m0Var.H(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    m0Var.i(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    m0Var.g(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    m0Var.A(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    m0Var.r(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    m0Var.C(arrayList);
                    break;
                case 8:
                    arrayList = new ArrayList();
                    m0Var.m(arrayList);
                    break;
                case 9:
                    arrayList = new ArrayList();
                    m0Var.w(arrayList);
                    break;
                case 10:
                    arrayList = new ArrayList();
                    m0Var.c(arrayList);
                    break;
                case 11:
                    arrayList = new ArrayList();
                    m0Var.z(arrayList);
                    break;
                case 12:
                    arrayList = new ArrayList();
                    m0Var.t(arrayList);
                    break;
                case 13:
                    arrayList = new ArrayList();
                    m0Var.d(arrayList);
                    break;
                case 14:
                    arrayList = new ArrayList();
                    m0Var.j(arrayList);
                    ub2 = (UB) p0.z(number, arrayList, enumLiteMap, ub2, t0Var);
                    break;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + bVar.f20938r0);
            }
            fieldSet.q(bVar, arrayList);
        } else {
            if (generatedExtension.getLiteType() != WireFormat.FieldType.ENUM) {
                switch (a.f21076a[generatedExtension.getLiteType().ordinal()]) {
                    case 1:
                        objValueOf = Double.valueOf(m0Var.readDouble());
                        break;
                    case 2:
                        objValueOf = Float.valueOf(m0Var.readFloat());
                        break;
                    case 3:
                        objValueOf = Long.valueOf(m0Var.N());
                        break;
                    case 4:
                        objValueOf = Long.valueOf(m0Var.u());
                        break;
                    case 5:
                        objValueOf = Integer.valueOf(m0Var.p());
                        break;
                    case 6:
                        objValueOf = Long.valueOf(m0Var.b());
                        break;
                    case 7:
                        objValueOf = Integer.valueOf(m0Var.x());
                        break;
                    case 8:
                        objValueOf = Boolean.valueOf(m0Var.e());
                        break;
                    case 9:
                        objValueOf = Integer.valueOf(m0Var.h());
                        break;
                    case 10:
                        objValueOf = Integer.valueOf(m0Var.K());
                        break;
                    case 11:
                        objValueOf = Long.valueOf(m0Var.f());
                        break;
                    case 12:
                        objValueOf = Integer.valueOf(m0Var.l());
                        break;
                    case 13:
                        objValueOf = Long.valueOf(m0Var.D());
                        break;
                    case 14:
                        throw new IllegalStateException("Shouldn't reach here.");
                    case 15:
                        objValueOf = m0Var.o();
                        break;
                    case 16:
                        objValueOf = m0Var.E();
                        break;
                    case 17:
                        objValueOf = m0Var.y(generatedExtension.getMessageDefaultInstance().getClass(), extensionRegistryLite);
                        break;
                    case 18:
                        objValueOf = m0Var.v(generatedExtension.getMessageDefaultInstance().getClass(), extensionRegistryLite);
                        break;
                    default:
                        objValueOf = null;
                        break;
                }
            } else {
                int iP = m0Var.p();
                if (enumLiteMap.findValueByNumber(iP) == null) {
                    return (UB) p0.D(number, iP, ub2, t0Var);
                }
                objValueOf = Integer.valueOf(iP);
            }
            if (generatedExtension.isRepeated()) {
                fieldSet.a(bVar, objValueOf);
            } else {
                int i10 = a.f21076a[generatedExtension.getLiteType().ordinal()];
                if ((i10 == 17 || i10 == 18) && (objF = fieldSet.f(bVar)) != null) {
                    objValueOf = Internal.a(objF, objValueOf);
                }
                fieldSet.q(bVar, objValueOf);
            }
        }
        return ub2;
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public final void h(m0 m0Var, Object obj, ExtensionRegistryLite extensionRegistryLite, FieldSet<GeneratedMessageLite.b> fieldSet) throws IOException {
        GeneratedMessageLite.GeneratedExtension generatedExtension = (GeneratedMessageLite.GeneratedExtension) obj;
        fieldSet.q(generatedExtension.f20931d, m0Var.v(generatedExtension.getMessageDefaultInstance().getClass(), extensionRegistryLite));
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public final void i(ByteString byteString, Object obj, ExtensionRegistryLite extensionRegistryLite, FieldSet<GeneratedMessageLite.b> fieldSet) throws IOException {
        GeneratedMessageLite.GeneratedExtension generatedExtension = (GeneratedMessageLite.GeneratedExtension) obj;
        MessageLite messageLiteBuildPartial = generatedExtension.getMessageDefaultInstance().newBuilderForType().buildPartial();
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(byteString.toByteArray());
        if (!byteBufferWrap.hasArray()) {
            throw new IllegalArgumentException("Direct buffers not yet supported");
        }
        d.b bVar = new d.b(byteBufferWrap);
        j0 j0Var = j0.f21070c;
        j0Var.getClass();
        j0Var.a(messageLiteBuildPartial.getClass()).g(messageLiteBuildPartial, bVar, extensionRegistryLite);
        fieldSet.q(generatedExtension.f20931d, messageLiteBuildPartial);
        if (bVar.F() != Integer.MAX_VALUE) {
            throw InvalidProtocolBufferException.a();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public final void j(h hVar, Map.Entry entry) throws IOException {
        GeneratedMessageLite.b bVar = (GeneratedMessageLite.b) entry.getKey();
        boolean z10 = bVar.f20939s0;
        WireFormat.FieldType fieldType = bVar.f20938r0;
        int i10 = bVar.f20937q0;
        if (!z10) {
            switch (a.f21076a[fieldType.ordinal()]) {
                case 1:
                    hVar.c(i10, ((Double) entry.getValue()).doubleValue());
                    break;
                case 2:
                    hVar.g(i10, ((Float) entry.getValue()).floatValue());
                    break;
                case 3:
                    hVar.j(i10, ((Long) entry.getValue()).longValue());
                    break;
                case 4:
                    hVar.r(i10, ((Long) entry.getValue()).longValue());
                    break;
                case 5:
                    hVar.i(i10, ((Integer) entry.getValue()).intValue());
                    break;
                case 6:
                    hVar.f(i10, ((Long) entry.getValue()).longValue());
                    break;
                case 7:
                    hVar.e(i10, ((Integer) entry.getValue()).intValue());
                    break;
                case 8:
                    hVar.a(i10, ((Boolean) entry.getValue()).booleanValue());
                    break;
                case 9:
                    hVar.q(i10, ((Integer) entry.getValue()).intValue());
                    break;
                case 10:
                    hVar.m(i10, ((Integer) entry.getValue()).intValue());
                    break;
                case 11:
                    hVar.n(i10, ((Long) entry.getValue()).longValue());
                    break;
                case 12:
                    hVar.o(i10, ((Integer) entry.getValue()).intValue());
                    break;
                case 13:
                    hVar.p(i10, ((Long) entry.getValue()).longValue());
                    break;
                case 14:
                    hVar.i(i10, ((Integer) entry.getValue()).intValue());
                    break;
                case 15:
                    hVar.b(i10, (ByteString) entry.getValue());
                    break;
                case 16:
                    hVar.f21064a.writeString(i10, (String) entry.getValue());
                    break;
                case 17:
                    hVar.h(i10, j0.f21070c.a(entry.getValue().getClass()), entry.getValue());
                    break;
                case 18:
                    hVar.k(i10, j0.f21070c.a(entry.getValue().getClass()), entry.getValue());
                    break;
            }
        }
        int i11 = a.f21076a[fieldType.ordinal()];
        boolean z11 = bVar.f20940t0;
        switch (i11) {
            case 1:
                p0.G(i10, (List) entry.getValue(), hVar, z11);
                break;
            case 2:
                p0.K(i10, (List) entry.getValue(), hVar, z11);
                break;
            case 3:
                p0.N(i10, (List) entry.getValue(), hVar, z11);
                break;
            case 4:
                p0.V(i10, (List) entry.getValue(), hVar, z11);
                break;
            case 5:
                p0.M(i10, (List) entry.getValue(), hVar, z11);
                break;
            case 6:
                p0.J(i10, (List) entry.getValue(), hVar, z11);
                break;
            case 7:
                p0.I(i10, (List) entry.getValue(), hVar, z11);
                break;
            case 8:
                p0.E(i10, (List) entry.getValue(), hVar, z11);
                break;
            case 9:
                p0.U(i10, (List) entry.getValue(), hVar, z11);
                break;
            case 10:
                p0.P(i10, (List) entry.getValue(), hVar, z11);
                break;
            case 11:
                p0.Q(i10, (List) entry.getValue(), hVar, z11);
                break;
            case 12:
                p0.R(i10, (List) entry.getValue(), hVar, z11);
                break;
            case 13:
                p0.S(i10, (List) entry.getValue(), hVar, z11);
                break;
            case 14:
                p0.M(i10, (List) entry.getValue(), hVar, z11);
                break;
            case 15:
                p0.F(i10, (List) entry.getValue(), hVar);
                break;
            case 16:
                p0.T(i10, (List) entry.getValue(), hVar);
                break;
            case 17:
                List list = (List) entry.getValue();
                if (list != null && !list.isEmpty()) {
                    p0.L(i10, (List) entry.getValue(), hVar, j0.f21070c.a(list.get(0).getClass()));
                    break;
                }
                break;
            case 18:
                List list2 = (List) entry.getValue();
                if (list2 != null && !list2.isEmpty()) {
                    p0.O(i10, (List) entry.getValue(), hVar, j0.f21070c.a(list2.get(0).getClass()));
                    break;
                }
                break;
        }
    }
}
