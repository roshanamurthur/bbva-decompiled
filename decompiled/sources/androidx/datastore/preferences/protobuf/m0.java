package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: Reader.java */
/* JADX INFO: loaded from: classes2.dex */
public interface m0 {
    void A(List<Integer> list) throws IOException;

    <K, V> void B(Map<K, V> map, MapEntryLite.b<K, V> bVar, ExtensionRegistryLite extensionRegistryLite) throws IOException;

    void C(List<Integer> list) throws IOException;

    long D() throws IOException;

    String E() throws IOException;

    int F() throws IOException;

    void G(List<String> list) throws IOException;

    void H(List<Float> list) throws IOException;

    @Deprecated
    <T> void I(List<T> list, o0<T> o0Var, ExtensionRegistryLite extensionRegistryLite) throws IOException;

    boolean J() throws IOException;

    int K() throws IOException;

    void L(List<ByteString> list) throws IOException;

    void M(List<Double> list) throws IOException;

    long N() throws IOException;

    String O() throws IOException;

    <T> T a(o0<T> o0Var, ExtensionRegistryLite extensionRegistryLite) throws IOException;

    long b() throws IOException;

    void c(List<Integer> list) throws IOException;

    void d(List<Long> list) throws IOException;

    boolean e() throws IOException;

    long f() throws IOException;

    void g(List<Long> list) throws IOException;

    int getTag();

    int h() throws IOException;

    void i(List<Long> list) throws IOException;

    void j(List<Integer> list) throws IOException;

    int k() throws IOException;

    int l() throws IOException;

    void m(List<Boolean> list) throws IOException;

    void n(List<String> list) throws IOException;

    ByteString o() throws IOException;

    int p() throws IOException;

    <T> void q(List<T> list, o0<T> o0Var, ExtensionRegistryLite extensionRegistryLite) throws IOException;

    void r(List<Long> list) throws IOException;

    double readDouble() throws IOException;

    float readFloat() throws IOException;

    @Deprecated
    <T> T s(o0<T> o0Var, ExtensionRegistryLite extensionRegistryLite) throws IOException;

    void t(List<Integer> list) throws IOException;

    long u() throws IOException;

    <T> T v(Class<T> cls, ExtensionRegistryLite extensionRegistryLite) throws IOException;

    void w(List<Integer> list) throws IOException;

    int x() throws IOException;

    @Deprecated
    <T> T y(Class<T> cls, ExtensionRegistryLite extensionRegistryLite) throws IOException;

    void z(List<Long> list) throws IOException;
}
