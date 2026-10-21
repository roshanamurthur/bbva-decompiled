package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: ExtensionSchemaLite.java */
/* JADX INFO: loaded from: classes10.dex */
public final class j extends i<GeneratedMessageLite.b> {

    /* JADX INFO: compiled from: ExtensionSchemaLite.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f47228a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f47228a = iArr;
            try {
                iArr[WireFormat.FieldType.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f47228a[WireFormat.FieldType.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f47228a[WireFormat.FieldType.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f47228a[WireFormat.FieldType.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f47228a[WireFormat.FieldType.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f47228a[WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f47228a[WireFormat.FieldType.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f47228a[WireFormat.FieldType.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f47228a[WireFormat.FieldType.UINT32.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f47228a[WireFormat.FieldType.SFIXED32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f47228a[WireFormat.FieldType.SFIXED64.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f47228a[WireFormat.FieldType.SINT32.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f47228a[WireFormat.FieldType.SINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f47228a[WireFormat.FieldType.ENUM.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f47228a[WireFormat.FieldType.BYTES.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f47228a[WireFormat.FieldType.STRING.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f47228a[WireFormat.FieldType.GROUP.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f47228a[WireFormat.FieldType.MESSAGE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.i
    public final int a(Map.Entry<?, ?> entry) {
        return ((GeneratedMessageLite.b) entry.getKey()).f47100q0;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.i
    public final GeneratedMessageLite.GeneratedExtension b(ExtensionRegistryLite extensionRegistryLite, MessageLite messageLite, int i10) {
        return extensionRegistryLite.findLiteExtensionByNumber(messageLite, i10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.i
    public final FieldSet<GeneratedMessageLite.b> c(Object obj) {
        return ((GeneratedMessageLite.ExtendableMessage) obj).extensions;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.i
    public final FieldSet<GeneratedMessageLite.b> d(Object obj) {
        return ((GeneratedMessageLite.ExtendableMessage) obj).p();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.i
    public final boolean e(MessageLite messageLite) {
        return messageLite instanceof GeneratedMessageLite.ExtendableMessage;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.i
    public final void f(Object obj) {
        ((GeneratedMessageLite.ExtendableMessage) obj).extensions.n();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.i
    public final <UT, UB> UB g(Object obj, o0 o0Var, Object obj2, ExtensionRegistryLite extensionRegistryLite, FieldSet<GeneratedMessageLite.b> fieldSet, UB ub2, v0<UT, UB> v0Var) throws IOException {
        Object objValueOf;
        Object objF;
        ArrayList arrayList;
        GeneratedMessageLite.GeneratedExtension generatedExtension = (GeneratedMessageLite.GeneratedExtension) obj2;
        int number = generatedExtension.getNumber();
        GeneratedMessageLite.b bVar = generatedExtension.f47094d;
        if (bVar.f47102s0 && bVar.f47103t0) {
            switch (a.f47228a[generatedExtension.getLiteType().ordinal()]) {
                case 1:
                    arrayList = new ArrayList();
                    ((e) o0Var).g(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    ((e) o0Var).l(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    ((e) o0Var).n(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    ((e) o0Var).v(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    ((e) o0Var).m(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    ((e) o0Var).k(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    ((e) o0Var).j(arrayList);
                    break;
                case 8:
                    arrayList = new ArrayList();
                    ((e) o0Var).d(arrayList);
                    break;
                case 9:
                    arrayList = new ArrayList();
                    ((e) o0Var).u(arrayList);
                    break;
                case 10:
                    arrayList = new ArrayList();
                    ((e) o0Var).p(arrayList);
                    break;
                case 11:
                    arrayList = new ArrayList();
                    ((e) o0Var).q(arrayList);
                    break;
                case 12:
                    arrayList = new ArrayList();
                    ((e) o0Var).r(arrayList);
                    break;
                case 13:
                    arrayList = new ArrayList();
                    ((e) o0Var).s(arrayList);
                    break;
                case 14:
                    arrayList = new ArrayList();
                    ((e) o0Var).h(arrayList);
                    ub2 = (UB) r0.z(obj, number, arrayList, bVar.f47099p0, ub2, v0Var);
                    break;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + bVar.f47101r0);
            }
            fieldSet.q(bVar, arrayList);
        } else {
            if (generatedExtension.getLiteType() != WireFormat.FieldType.ENUM) {
                switch (a.f47228a[generatedExtension.getLiteType().ordinal()]) {
                    case 1:
                        e eVar = (e) o0Var;
                        eVar.x(1);
                        objValueOf = Double.valueOf(eVar.f47209a.readDouble());
                        break;
                    case 2:
                        e eVar2 = (e) o0Var;
                        eVar2.x(5);
                        objValueOf = Float.valueOf(eVar2.f47209a.readFloat());
                        break;
                    case 3:
                        e eVar3 = (e) o0Var;
                        eVar3.x(0);
                        objValueOf = Long.valueOf(eVar3.f47209a.readInt64());
                        break;
                    case 4:
                        e eVar4 = (e) o0Var;
                        eVar4.x(0);
                        objValueOf = Long.valueOf(eVar4.f47209a.readUInt64());
                        break;
                    case 5:
                        e eVar5 = (e) o0Var;
                        eVar5.x(0);
                        objValueOf = Integer.valueOf(eVar5.f47209a.readInt32());
                        break;
                    case 6:
                        e eVar6 = (e) o0Var;
                        eVar6.x(1);
                        objValueOf = Long.valueOf(eVar6.f47209a.readFixed64());
                        break;
                    case 7:
                        e eVar7 = (e) o0Var;
                        eVar7.x(5);
                        objValueOf = Integer.valueOf(eVar7.f47209a.readFixed32());
                        break;
                    case 8:
                        e eVar8 = (e) o0Var;
                        eVar8.x(0);
                        objValueOf = Boolean.valueOf(eVar8.f47209a.readBool());
                        break;
                    case 9:
                        e eVar9 = (e) o0Var;
                        eVar9.x(0);
                        objValueOf = Integer.valueOf(eVar9.f47209a.readUInt32());
                        break;
                    case 10:
                        e eVar10 = (e) o0Var;
                        eVar10.x(5);
                        objValueOf = Integer.valueOf(eVar10.f47209a.readSFixed32());
                        break;
                    case 11:
                        e eVar11 = (e) o0Var;
                        eVar11.x(1);
                        objValueOf = Long.valueOf(eVar11.f47209a.readSFixed64());
                        break;
                    case 12:
                        e eVar12 = (e) o0Var;
                        eVar12.x(0);
                        objValueOf = Integer.valueOf(eVar12.f47209a.readSInt32());
                        break;
                    case 13:
                        e eVar13 = (e) o0Var;
                        eVar13.x(0);
                        objValueOf = Long.valueOf(eVar13.f47209a.readSInt64());
                        break;
                    case 14:
                        throw new IllegalStateException("Shouldn't reach here.");
                    case 15:
                        objValueOf = ((e) o0Var).e();
                        break;
                    case 16:
                        e eVar14 = (e) o0Var;
                        eVar14.x(2);
                        objValueOf = eVar14.f47209a.readString();
                        break;
                    case 17:
                        if (!generatedExtension.isRepeated()) {
                            Object objF2 = fieldSet.f(bVar);
                            if (objF2 instanceof GeneratedMessageLite) {
                                q0 q0VarB = l0.f47234c.b(objF2);
                                if (!((GeneratedMessageLite) objF2).j()) {
                                    Object objNewInstance = q0VarB.newInstance();
                                    q0VarB.a(objNewInstance, objF2);
                                    fieldSet.q(bVar, objNewInstance);
                                    objF2 = objNewInstance;
                                }
                                e eVar15 = (e) o0Var;
                                eVar15.x(3);
                                eVar15.b(objF2, q0VarB, extensionRegistryLite);
                                return ub2;
                            }
                        }
                        Class<?> cls = generatedExtension.getMessageDefaultInstance().getClass();
                        e eVar16 = (e) o0Var;
                        eVar16.x(3);
                        q0 q0VarA = l0.f47234c.a(cls);
                        Object objNewInstance2 = q0VarA.newInstance();
                        eVar16.b(objNewInstance2, q0VarA, extensionRegistryLite);
                        q0VarA.b(objNewInstance2);
                        objValueOf = objNewInstance2;
                        break;
                    case 18:
                        if (!generatedExtension.isRepeated()) {
                            Object objF3 = fieldSet.f(bVar);
                            if (objF3 instanceof GeneratedMessageLite) {
                                q0 q0VarB2 = l0.f47234c.b(objF3);
                                if (!((GeneratedMessageLite) objF3).j()) {
                                    Object objNewInstance3 = q0VarB2.newInstance();
                                    q0VarB2.a(objNewInstance3, objF3);
                                    fieldSet.q(bVar, objNewInstance3);
                                    objF3 = objNewInstance3;
                                }
                                e eVar17 = (e) o0Var;
                                eVar17.x(2);
                                eVar17.c(objF3, q0VarB2, extensionRegistryLite);
                                return ub2;
                            }
                        }
                        objValueOf = ((e) o0Var).o(generatedExtension.getMessageDefaultInstance().getClass(), extensionRegistryLite);
                        break;
                    default:
                        objValueOf = null;
                        break;
                }
            } else {
                e eVar18 = (e) o0Var;
                eVar18.x(0);
                int int32 = eVar18.f47209a.readInt32();
                if (bVar.f47099p0.findValueByNumber(int32) == null) {
                    return (UB) r0.D(obj, number, int32, ub2, v0Var);
                }
                objValueOf = Integer.valueOf(int32);
            }
            if (generatedExtension.isRepeated()) {
                fieldSet.a(bVar, objValueOf);
            } else {
                int i10 = a.f47228a[generatedExtension.getLiteType().ordinal()];
                if ((i10 == 17 || i10 == 18) && (objF = fieldSet.f(bVar)) != null) {
                    objValueOf = ((MessageLite) objF).toBuilder().mergeFrom((MessageLite) objValueOf).buildPartial();
                }
                fieldSet.q(bVar, objValueOf);
            }
        }
        return ub2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.i
    public final void h(o0 o0Var, Object obj, ExtensionRegistryLite extensionRegistryLite, FieldSet<GeneratedMessageLite.b> fieldSet) throws IOException {
        GeneratedMessageLite.GeneratedExtension generatedExtension = (GeneratedMessageLite.GeneratedExtension) obj;
        fieldSet.q(generatedExtension.f47094d, ((e) o0Var).o(generatedExtension.getMessageDefaultInstance().getClass(), extensionRegistryLite));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.i
    public final void i(ByteString byteString, Object obj, ExtensionRegistryLite extensionRegistryLite, FieldSet<GeneratedMessageLite.b> fieldSet) throws IOException {
        GeneratedMessageLite.GeneratedExtension generatedExtension = (GeneratedMessageLite.GeneratedExtension) obj;
        MessageLite.Builder builderNewBuilderForType = generatedExtension.getMessageDefaultInstance().newBuilderForType();
        CodedInputStream codedInputStreamNewCodedInput = byteString.newCodedInput();
        builderNewBuilderForType.mergeFrom(codedInputStreamNewCodedInput, extensionRegistryLite);
        fieldSet.q(generatedExtension.f47094d, builderNewBuilderForType.buildPartial());
        codedInputStreamNewCodedInput.checkLastTagWas(0);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.i
    public final void j(f fVar, Map.Entry entry) throws IOException {
        GeneratedMessageLite.b bVar = (GeneratedMessageLite.b) entry.getKey();
        boolean z10 = bVar.f47102s0;
        WireFormat.FieldType fieldType = bVar.f47101r0;
        int i10 = bVar.f47100q0;
        if (!z10) {
            switch (a.f47228a[fieldType.ordinal()]) {
                case 1:
                    fVar.c(i10, ((Double) entry.getValue()).doubleValue());
                    break;
                case 2:
                    fVar.g(i10, ((Float) entry.getValue()).floatValue());
                    break;
                case 3:
                    fVar.j(i10, ((Long) entry.getValue()).longValue());
                    break;
                case 4:
                    fVar.r(i10, ((Long) entry.getValue()).longValue());
                    break;
                case 5:
                    fVar.i(i10, ((Integer) entry.getValue()).intValue());
                    break;
                case 6:
                    fVar.f(i10, ((Long) entry.getValue()).longValue());
                    break;
                case 7:
                    fVar.e(i10, ((Integer) entry.getValue()).intValue());
                    break;
                case 8:
                    fVar.a(i10, ((Boolean) entry.getValue()).booleanValue());
                    break;
                case 9:
                    fVar.q(i10, ((Integer) entry.getValue()).intValue());
                    break;
                case 10:
                    fVar.m(i10, ((Integer) entry.getValue()).intValue());
                    break;
                case 11:
                    fVar.n(i10, ((Long) entry.getValue()).longValue());
                    break;
                case 12:
                    fVar.o(i10, ((Integer) entry.getValue()).intValue());
                    break;
                case 13:
                    fVar.p(i10, ((Long) entry.getValue()).longValue());
                    break;
                case 14:
                    fVar.i(i10, ((Integer) entry.getValue()).intValue());
                    break;
                case 15:
                    fVar.b(i10, (ByteString) entry.getValue());
                    break;
                case 16:
                    fVar.f47218a.writeString(i10, (String) entry.getValue());
                    break;
                case 17:
                    fVar.h(i10, l0.f47234c.a(entry.getValue().getClass()), entry.getValue());
                    break;
                case 18:
                    fVar.k(i10, l0.f47234c.a(entry.getValue().getClass()), entry.getValue());
                    break;
            }
        }
        int i11 = a.f47228a[fieldType.ordinal()];
        boolean z11 = bVar.f47103t0;
        switch (i11) {
            case 1:
                r0.G(i10, (List) entry.getValue(), fVar, z11);
                break;
            case 2:
                r0.K(i10, (List) entry.getValue(), fVar, z11);
                break;
            case 3:
                r0.N(i10, (List) entry.getValue(), fVar, z11);
                break;
            case 4:
                r0.V(i10, (List) entry.getValue(), fVar, z11);
                break;
            case 5:
                r0.M(i10, (List) entry.getValue(), fVar, z11);
                break;
            case 6:
                r0.J(i10, (List) entry.getValue(), fVar, z11);
                break;
            case 7:
                r0.I(i10, (List) entry.getValue(), fVar, z11);
                break;
            case 8:
                r0.E(i10, (List) entry.getValue(), fVar, z11);
                break;
            case 9:
                r0.U(i10, (List) entry.getValue(), fVar, z11);
                break;
            case 10:
                r0.P(i10, (List) entry.getValue(), fVar, z11);
                break;
            case 11:
                r0.Q(i10, (List) entry.getValue(), fVar, z11);
                break;
            case 12:
                r0.R(i10, (List) entry.getValue(), fVar, z11);
                break;
            case 13:
                r0.S(i10, (List) entry.getValue(), fVar, z11);
                break;
            case 14:
                r0.M(i10, (List) entry.getValue(), fVar, z11);
                break;
            case 15:
                r0.F(i10, (List) entry.getValue(), fVar);
                break;
            case 16:
                r0.T(i10, (List) entry.getValue(), fVar);
                break;
            case 17:
                List list = (List) entry.getValue();
                if (list != null && !list.isEmpty()) {
                    r0.L(i10, (List) entry.getValue(), fVar, l0.f47234c.a(list.get(0).getClass()));
                    break;
                }
                break;
            case 18:
                List list2 = (List) entry.getValue();
                if (list2 != null && !list2.isEmpty()) {
                    r0.O(i10, (List) entry.getValue(), fVar, l0.f47234c.a(list2.get(0).getClass()));
                    break;
                }
                break;
        }
    }
}
