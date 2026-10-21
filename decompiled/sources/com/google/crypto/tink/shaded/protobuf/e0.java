package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: MessageSetSchema.java */
/* JADX INFO: loaded from: classes10.dex */
public final class e0<T> implements q0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MessageLite f47214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v0<?, ?> f47215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f47216c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i<?> f47217d;

    public e0(v0<?, ?> v0Var, i<?> iVar, MessageLite messageLite) {
        this.f47215b = v0Var;
        this.f47216c = iVar.e(messageLite);
        this.f47217d = iVar;
        this.f47214a = messageLite;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q0
    public final void a(T t10, T t11) {
        Class<?> cls = r0.f47264a;
        v0<?, ?> v0Var = this.f47215b;
        v0Var.o(t10, v0Var.k(v0Var.g(t10), v0Var.g(t11)));
        if (this.f47216c) {
            i<?> iVar = this.f47217d;
            FieldSet<T> fieldSetC = iVar.c(t11);
            if (fieldSetC.f47078a.isEmpty()) {
                return;
            }
            iVar.d(t10).o(fieldSetC);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q0
    public final void b(T t10) {
        this.f47215b.j(t10);
        this.f47217d.f(t10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q0
    public final boolean c(T t10) {
        return this.f47217d.c(t10).k();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q0
    public final int d(T t10) {
        v0<?, ?> v0Var = this.f47215b;
        int i10 = v0Var.i(v0Var.g(t10));
        return this.f47216c ? i10 + this.f47217d.c(t10).g() : i10;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q0
    public final int e(T t10) {
        int iHashCode = this.f47215b.g(t10).hashCode();
        return this.f47216c ? (iHashCode * 53) + this.f47217d.c(t10).f47078a.hashCode() : iHashCode;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q0
    public final boolean f(T t10, T t11) {
        v0<?, ?> v0Var = this.f47215b;
        if (!v0Var.g(t10).equals(v0Var.g(t11))) {
            return false;
        }
        if (!this.f47216c) {
            return true;
        }
        i<?> iVar = this.f47217d;
        return iVar.c(t10).equals(iVar.c(t11));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q0
    public final void g(Object obj, f fVar) throws IOException {
        Iterator itM = this.f47217d.c(obj).m();
        while (itM.hasNext()) {
            Map.Entry entry = (Map.Entry) itM.next();
            FieldSet.FieldDescriptorLite fieldDescriptorLite = (FieldSet.FieldDescriptorLite) entry.getKey();
            if (fieldDescriptorLite.getLiteJavaType() != WireFormat.JavaType.MESSAGE || fieldDescriptorLite.isRepeated() || fieldDescriptorLite.isPacked()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof LazyField.a) {
                fVar.l(fieldDescriptorLite.getNumber(), ((LazyField.a) entry).f47123p0.getValue().toByteString());
            } else {
                fVar.l(fieldDescriptorLite.getNumber(), entry.getValue());
            }
        }
        v0<?, ?> v0Var = this.f47215b;
        v0Var.r(v0Var.g(obj), fVar);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:35:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d1 A[EDGE_INSN: B:52:0x00d1->B:36:0x00d1 BREAK  A[LOOP:1: B:18:0x0078->B:26:0x00a9], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.crypto.tink.shaded.protobuf.q0
    public final void h(T t10, byte[] bArr, int i10, int i11, c.b bVar) throws IOException {
        e0<T> e0Var = this;
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) t10;
        UnknownFieldSetLite unknownFieldSetLite = generatedMessageLite.unknownFields;
        if (unknownFieldSetLite == UnknownFieldSetLite.getDefaultInstance()) {
            unknownFieldSetLite = new UnknownFieldSetLite();
            generatedMessageLite.unknownFields = unknownFieldSetLite;
        }
        UnknownFieldSetLite unknownFieldSetLite2 = unknownFieldSetLite;
        FieldSet<GeneratedMessageLite.b> fieldSetP = ((GeneratedMessageLite.ExtendableMessage) t10).p();
        int iG = i10;
        GeneratedMessageLite.GeneratedExtension generatedExtensionB = null;
        while (iG < i11) {
            int I = c.I(bArr, iG, bVar);
            int i12 = bVar.f47182a;
            MessageLite messageLite = e0Var.f47214a;
            i<?> iVar = e0Var.f47217d;
            int i13 = 2;
            ExtensionRegistryLite extensionRegistryLite = bVar.f47185d;
            if (i12 == 11) {
                int i14 = 0;
                ByteString byteString = null;
                while (I < i11) {
                    I = c.I(bArr, I, bVar);
                    int i15 = bVar.f47182a;
                    int tagFieldNumber = WireFormat.getTagFieldNumber(i15);
                    int tagWireType = WireFormat.getTagWireType(i15);
                    if (tagFieldNumber != i13) {
                        if (tagFieldNumber == 3) {
                            if (generatedExtensionB != null) {
                                I = c.p(l0.f47234c.a(generatedExtensionB.getMessageDefaultInstance().getClass()), bArr, I, i11, bVar);
                                fieldSetP.q(generatedExtensionB.f47094d, bVar.f47184c);
                            } else if (tagWireType == 2) {
                                I = c.b(bArr, I, bVar);
                                byteString = (ByteString) bVar.f47184c;
                            } else if (i15 == 12) {
                                break;
                            } else {
                                I = c.O(i15, bArr, I, i11, bVar);
                            }
                        } else {
                            if (i15 == 12) {
                                break;
                                break;
                            }
                            I = c.O(i15, bArr, I, i11, bVar);
                        }
                    } else if (tagWireType == 0) {
                        I = c.I(bArr, I, bVar);
                        i14 = bVar.f47182a;
                        generatedExtensionB = iVar.b(extensionRegistryLite, messageLite, i14);
                    } else {
                        if (i15 == 12) {
                            break;
                            break;
                        }
                        I = c.O(i15, bArr, I, i11, bVar);
                    }
                    i13 = 2;
                }
                if (byteString != null) {
                    unknownFieldSetLite2.e((i14 << 3) | 2, byteString);
                }
                e0Var = this;
                iG = I;
            } else if (WireFormat.getTagWireType(i12) == 2) {
                GeneratedMessageLite.GeneratedExtension generatedExtensionB2 = iVar.b(extensionRegistryLite, messageLite, WireFormat.getTagFieldNumber(i12));
                if (generatedExtensionB2 != null) {
                    iG = c.p(l0.f47234c.a(generatedExtensionB2.getMessageDefaultInstance().getClass()), bArr, I, i11, bVar);
                    fieldSetP.q(generatedExtensionB2.f47094d, bVar.f47184c);
                } else {
                    iG = c.G(i12, bArr, I, i11, unknownFieldSetLite2, bVar);
                }
                generatedExtensionB = generatedExtensionB2;
            } else {
                iG = c.O(i12, bArr, I, i11, bVar);
            }
        }
        if (iG != i11) {
            throw InvalidProtocolBufferException.g();
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.google.crypto.tink.shaded.protobuf.q0
    public final void i(T t10, o0 o0Var, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        e eVar;
        v0<?, ?> v0Var = this.f47215b;
        UnknownFieldSetLite unknownFieldSetLiteF = v0Var.f(t10);
        i<?> iVar = this.f47217d;
        FieldSet fieldSetD = iVar.d(t10);
        do {
            try {
                eVar = (e) o0Var;
                if (eVar.a() == Integer.MAX_VALUE) {
                    break;
                }
            } finally {
                v0Var.n(t10, unknownFieldSetLiteF);
            }
        } while (j(eVar, extensionRegistryLite, iVar, fieldSetD, v0Var, unknownFieldSetLiteF));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <UT, UB, ET extends FieldSet.FieldDescriptorLite<ET>> boolean j(o0 o0Var, ExtensionRegistryLite extensionRegistryLite, i<ET> iVar, FieldSet<ET> fieldSet, v0<UT, UB> v0Var, UB ub2) throws IOException {
        e eVar = (e) o0Var;
        int i10 = eVar.f47210b;
        MessageLite messageLite = this.f47214a;
        if (i10 != 11) {
            if (WireFormat.getTagWireType(i10) != 2) {
                return eVar.y();
            }
            GeneratedMessageLite.GeneratedExtension generatedExtensionB = iVar.b(extensionRegistryLite, messageLite, WireFormat.getTagFieldNumber(i10));
            if (generatedExtensionB == null) {
                return v0Var.l(ub2, o0Var);
            }
            iVar.h(o0Var, generatedExtensionB, extensionRegistryLite, fieldSet);
            return true;
        }
        GeneratedMessageLite.GeneratedExtension generatedExtensionB2 = null;
        int uInt32 = 0;
        ByteString byteStringE = null;
        while (eVar.a() != Integer.MAX_VALUE) {
            int i11 = eVar.f47210b;
            if (i11 == 16) {
                eVar.x(0);
                uInt32 = eVar.f47209a.readUInt32();
                generatedExtensionB2 = iVar.b(extensionRegistryLite, messageLite, uInt32);
            } else if (i11 == 26) {
                if (generatedExtensionB2 != null) {
                    iVar.h(o0Var, generatedExtensionB2, extensionRegistryLite, fieldSet);
                } else {
                    byteStringE = eVar.e();
                }
            } else if (!eVar.y()) {
                break;
            }
        }
        if (eVar.f47210b != 12) {
            throw InvalidProtocolBufferException.a();
        }
        if (byteStringE != null) {
            if (generatedExtensionB2 != null) {
                iVar.i(byteStringE, generatedExtensionB2, extensionRegistryLite, fieldSet);
            } else {
                v0Var.d(ub2, uInt32, byteStringE);
            }
        }
        return true;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q0
    public final T newInstance() {
        MessageLite messageLite = this.f47214a;
        return messageLite instanceof GeneratedMessageLite ? (T) ((GeneratedMessageLite) messageLite).l() : (T) messageLite.newBuilderForType().buildPartial();
    }
}
