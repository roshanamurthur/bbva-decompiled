package qg;

import com.google.i18n.phonenumbers.Phonemetadata;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: MapBackedMetadataContainer.java */
/* JADX INFO: loaded from: classes10.dex */
public final class e<T> implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f92870a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a<T> f92871b;

    /* JADX INFO: compiled from: MapBackedMetadataContainer.java */
    public interface a<T> {
        T a(Phonemetadata.PhoneMetadata phoneMetadata);
    }

    public e(a<T> aVar) {
        this.f92871b = aVar;
    }

    @Override // qg.f
    public final void a(Phonemetadata.PhoneMetadata phoneMetadata) {
        this.f92870a.put(this.f92871b.a(phoneMetadata), phoneMetadata);
    }

    public final Phonemetadata.PhoneMetadata b(T t10) {
        if (t10 != null) {
            return (Phonemetadata.PhoneMetadata) this.f92870a.get(t10);
        }
        return null;
    }
}
