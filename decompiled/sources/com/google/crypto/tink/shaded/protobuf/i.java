package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: compiled from: ExtensionSchema.java */
/* JADX INFO: loaded from: classes10.dex */
public abstract class i<T extends FieldSet.FieldDescriptorLite<T>> {
    public abstract int a(Map.Entry<?, ?> entry);

    public abstract GeneratedMessageLite.GeneratedExtension b(ExtensionRegistryLite extensionRegistryLite, MessageLite messageLite, int i10);

    public abstract FieldSet<T> c(Object obj);

    public abstract FieldSet<T> d(Object obj);

    public abstract boolean e(MessageLite messageLite);

    public abstract void f(Object obj);

    public abstract <UT, UB> UB g(Object obj, o0 o0Var, Object obj2, ExtensionRegistryLite extensionRegistryLite, FieldSet<T> fieldSet, UB ub2, v0<UT, UB> v0Var) throws IOException;

    public abstract void h(o0 o0Var, Object obj, ExtensionRegistryLite extensionRegistryLite, FieldSet<T> fieldSet) throws IOException;

    public abstract void i(ByteString byteString, Object obj, ExtensionRegistryLite extensionRegistryLite, FieldSet<T> fieldSet) throws IOException;

    public abstract void j(f fVar, Map.Entry entry) throws IOException;
}
