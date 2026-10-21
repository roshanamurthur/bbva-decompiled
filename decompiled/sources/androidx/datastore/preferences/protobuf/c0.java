package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: MessageSetSchema.java */
/* JADX INFO: loaded from: classes2.dex */
public final class c0<T> implements o0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MessageLite f21041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t0<?, ?> f21042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f21043c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k<?> f21044d;

    public c0(t0<?, ?> t0Var, k<?> kVar, MessageLite messageLite) {
        this.f21042b = t0Var;
        this.f21043c = kVar.e(messageLite);
        this.f21044d = kVar;
        this.f21041a = messageLite;
    }

    @Override // androidx.datastore.preferences.protobuf.o0
    public final void a(T t10, T t11) {
        Class<?> cls = p0.f21106a;
        t0<?, ?> t0Var = this.f21042b;
        t0Var.o(t10, t0Var.k(t0Var.g(t10), t0Var.g(t11)));
        if (this.f21043c) {
            k<?> kVar = this.f21044d;
            FieldSet<T> fieldSetC = kVar.c(t11);
            if (fieldSetC.f20914a.isEmpty()) {
                return;
            }
            kVar.d(t10).o(fieldSetC);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.o0
    public final void b(T t10) {
        this.f21042b.j(t10);
        this.f21044d.f(t10);
    }

    @Override // androidx.datastore.preferences.protobuf.o0
    public final boolean c(T t10) {
        return this.f21044d.c(t10).k();
    }

    @Override // androidx.datastore.preferences.protobuf.o0
    public final int d(T t10) {
        t0<?, ?> t0Var = this.f21042b;
        int i10 = t0Var.i(t0Var.g(t10));
        return this.f21043c ? i10 + this.f21044d.c(t10).g() : i10;
    }

    @Override // androidx.datastore.preferences.protobuf.o0
    public final int e(T t10) {
        int iHashCode = this.f21042b.g(t10).hashCode();
        return this.f21043c ? (iHashCode * 53) + this.f21044d.c(t10).f20914a.hashCode() : iHashCode;
    }

    @Override // androidx.datastore.preferences.protobuf.o0
    public final boolean f(T t10, T t11) {
        t0<?, ?> t0Var = this.f21042b;
        if (!t0Var.g(t10).equals(t0Var.g(t11))) {
            return false;
        }
        if (!this.f21043c) {
            return true;
        }
        k<?> kVar = this.f21044d;
        return kVar.c(t10).equals(kVar.c(t11));
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // androidx.datastore.preferences.protobuf.o0
    public final void g(T t10, m0 m0Var, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        t0<?, ?> t0Var = this.f21042b;
        UnknownFieldSetLite unknownFieldSetLiteF = t0Var.f(t10);
        k<?> kVar = this.f21044d;
        FieldSet fieldSetD = kVar.d(t10);
        while (m0Var.F() != Integer.MAX_VALUE && j(m0Var, extensionRegistryLite, kVar, fieldSetD, t0Var, unknownFieldSetLiteF)) {
            try {
            } finally {
                t0Var.n(t10, unknownFieldSetLiteF);
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.o0
    public final void h(Object obj, h hVar) throws IOException {
        Iterator itM = this.f21044d.c(obj).m();
        while (itM.hasNext()) {
            Map.Entry entry = (Map.Entry) itM.next();
            FieldSet.FieldDescriptorLite fieldDescriptorLite = (FieldSet.FieldDescriptorLite) entry.getKey();
            if (fieldDescriptorLite.getLiteJavaType() != WireFormat.JavaType.MESSAGE || fieldDescriptorLite.isRepeated() || fieldDescriptorLite.isPacked()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof LazyField.a) {
                hVar.l(fieldDescriptorLite.getNumber(), ((LazyField.a) entry).f20959p0.getValue().toByteString());
            } else {
                hVar.l(fieldDescriptorLite.getNumber(), entry.getValue());
            }
        }
        t0<?, ?> t0Var = this.f21042b;
        t0Var.r(t0Var.g(obj), hVar);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:35:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d1 A[EDGE_INSN: B:52:0x00d1->B:36:0x00d1 BREAK  A[LOOP:1: B:18:0x0078->B:26:0x00a9], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.protobuf.o0
    public final void i(T t10, byte[] bArr, int i10, int i11, c.b bVar) throws IOException {
        c0<T> c0Var = this;
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) t10;
        UnknownFieldSetLite unknownFieldSetLite = generatedMessageLite.unknownFields;
        if (unknownFieldSetLite == UnknownFieldSetLite.getDefaultInstance()) {
            unknownFieldSetLite = new UnknownFieldSetLite();
            generatedMessageLite.unknownFields = unknownFieldSetLite;
        }
        UnknownFieldSetLite unknownFieldSetLite2 = unknownFieldSetLite;
        FieldSet<GeneratedMessageLite.b> fieldSetK = ((GeneratedMessageLite.ExtendableMessage) t10).k();
        int iG = i10;
        GeneratedMessageLite.GeneratedExtension generatedExtensionB = null;
        while (iG < i11) {
            int I = c.I(bArr, iG, bVar);
            int i12 = bVar.f21037a;
            MessageLite messageLite = c0Var.f21041a;
            k<?> kVar = c0Var.f21044d;
            int i13 = 2;
            ExtensionRegistryLite extensionRegistryLite = bVar.f21040d;
            if (i12 == 11) {
                int i14 = 0;
                ByteString byteString = null;
                while (I < i11) {
                    I = c.I(bArr, I, bVar);
                    int i15 = bVar.f21037a;
                    int tagFieldNumber = WireFormat.getTagFieldNumber(i15);
                    int tagWireType = WireFormat.getTagWireType(i15);
                    if (tagFieldNumber != i13) {
                        if (tagFieldNumber == 3) {
                            if (generatedExtensionB != null) {
                                I = c.p(j0.f21070c.a(generatedExtensionB.getMessageDefaultInstance().getClass()), bArr, I, i11, bVar);
                                fieldSetK.q(generatedExtensionB.f20931d, bVar.f21039c);
                            } else if (tagWireType == 2) {
                                I = c.b(bArr, I, bVar);
                                byteString = (ByteString) bVar.f21039c;
                            } else if (i15 == 12) {
                                break;
                            } else {
                                I = c.M(i15, bArr, I, i11, bVar);
                            }
                        } else {
                            if (i15 == 12) {
                                break;
                                break;
                            }
                            I = c.M(i15, bArr, I, i11, bVar);
                        }
                    } else if (tagWireType == 0) {
                        I = c.I(bArr, I, bVar);
                        i14 = bVar.f21037a;
                        generatedExtensionB = kVar.b(extensionRegistryLite, messageLite, i14);
                    } else {
                        if (i15 == 12) {
                            break;
                            break;
                        }
                        I = c.M(i15, bArr, I, i11, bVar);
                    }
                    i13 = 2;
                }
                if (byteString != null) {
                    unknownFieldSetLite2.c((i14 << 3) | 2, byteString);
                }
                c0Var = this;
                iG = I;
            } else if (WireFormat.getTagWireType(i12) == 2) {
                GeneratedMessageLite.GeneratedExtension generatedExtensionB2 = kVar.b(extensionRegistryLite, messageLite, WireFormat.getTagFieldNumber(i12));
                if (generatedExtensionB2 != null) {
                    iG = c.p(j0.f21070c.a(generatedExtensionB2.getMessageDefaultInstance().getClass()), bArr, I, i11, bVar);
                    fieldSetK.q(generatedExtensionB2.f20931d, bVar.f21039c);
                } else {
                    iG = c.G(i12, bArr, I, i11, unknownFieldSetLite2, bVar);
                }
                generatedExtensionB = generatedExtensionB2;
            } else {
                iG = c.M(i12, bArr, I, i11, bVar);
            }
        }
        if (iG != i11) {
            throw InvalidProtocolBufferException.g();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <UT, UB, ET extends FieldSet.FieldDescriptorLite<ET>> boolean j(m0 m0Var, ExtensionRegistryLite extensionRegistryLite, k<ET> kVar, FieldSet<ET> fieldSet, t0<UT, UB> t0Var, UB ub2) throws IOException {
        int tag = m0Var.getTag();
        MessageLite messageLite = this.f21041a;
        if (tag != 11) {
            if (WireFormat.getTagWireType(tag) != 2) {
                return m0Var.J();
            }
            GeneratedMessageLite.GeneratedExtension generatedExtensionB = kVar.b(extensionRegistryLite, messageLite, WireFormat.getTagFieldNumber(tag));
            if (generatedExtensionB == null) {
                return t0Var.l(ub2, m0Var);
            }
            kVar.h(m0Var, generatedExtensionB, extensionRegistryLite, fieldSet);
            return true;
        }
        GeneratedMessageLite.GeneratedExtension generatedExtensionB2 = null;
        int iH = 0;
        ByteString byteStringO = null;
        while (m0Var.F() != Integer.MAX_VALUE) {
            int tag2 = m0Var.getTag();
            if (tag2 == 16) {
                iH = m0Var.h();
                generatedExtensionB2 = kVar.b(extensionRegistryLite, messageLite, iH);
            } else if (tag2 == 26) {
                if (generatedExtensionB2 != null) {
                    kVar.h(m0Var, generatedExtensionB2, extensionRegistryLite, fieldSet);
                } else {
                    byteStringO = m0Var.o();
                }
            } else if (!m0Var.J()) {
                break;
            }
        }
        if (m0Var.getTag() != 12) {
            throw InvalidProtocolBufferException.a();
        }
        if (byteStringO != null) {
            if (generatedExtensionB2 != null) {
                kVar.i(byteStringO, generatedExtensionB2, extensionRegistryLite, fieldSet);
            } else {
                t0Var.d(ub2, iH, byteStringO);
            }
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.o0
    public final T newInstance() {
        return (T) this.f21041a.newBuilderForType().buildPartial();
    }
}
