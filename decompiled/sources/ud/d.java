package ud;

import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.Transformer;
import com.google.android.datatransport.Transport;
import com.google.android.datatransport.TransportFactory;
import com.google.android.datatransport.runtime.TransportContext;
import java.util.Set;

/* JADX INFO: compiled from: TransportFactoryImpl.java */
/* JADX INFO: loaded from: classes9.dex */
public final class d implements TransportFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set<Encoding> f93790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TransportContext f93791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f93792c;

    public d(Set<Encoding> set, TransportContext transportContext, e eVar) {
        this.f93790a = set;
        this.f93791b = transportContext;
        this.f93792c = eVar;
    }

    @Override // com.google.android.datatransport.TransportFactory
    public final <T> Transport<T> getTransport(String str, Class<T> cls, Transformer<T, byte[]> transformer) {
        return getTransport(str, cls, Encoding.of("proto"), transformer);
    }

    @Override // com.google.android.datatransport.TransportFactory
    public final <T> Transport<T> getTransport(String str, Class<T> cls, Encoding encoding, Transformer<T, byte[]> transformer) {
        Set<Encoding> set = this.f93790a;
        if (set.contains(encoding)) {
            return new com.google.android.datatransport.runtime.d(this.f93791b, str, encoding, transformer, this.f93792c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", encoding, set));
    }
}
