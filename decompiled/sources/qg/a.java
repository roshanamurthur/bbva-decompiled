package qg;

import com.google.i18n.phonenumbers.MetadataLoader;
import com.google.i18n.phonenumbers.Phonemetadata;
import com.google.i18n.phonenumbers.metadata.init.MetadataParser;
import com.google.i18n.phonenumbers.metadata.source.MetadataBootstrappingGuard;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import qg.f;

/* JADX INFO: compiled from: BlockingMetadataBootstrappingGuard.java */
/* JADX INFO: loaded from: classes10.dex */
public final class a<T extends f> implements MetadataBootstrappingGuard<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MetadataLoader f92864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MetadataParser f92865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final T f92866c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ConcurrentHashMap f92867d = new ConcurrentHashMap();

    public a(MetadataLoader metadataLoader, MetadataParser metadataParser, T t10) {
        this.f92864a = metadataLoader;
        this.f92865b = metadataParser;
        this.f92866c = t10;
    }

    @Override // com.google.i18n.phonenumbers.metadata.source.MetadataBootstrappingGuard
    public final T getOrBootstrap(String str) {
        if (!this.f92867d.containsKey(str)) {
            synchronized (this) {
                try {
                    if (!this.f92867d.containsKey(str)) {
                        try {
                            Iterator<Phonemetadata.PhoneMetadata> it = this.f92865b.parse(this.f92864a.loadMetadata(str)).iterator();
                            while (it.hasNext()) {
                                this.f92866c.a(it.next());
                            }
                            this.f92867d.put(str, str);
                        } catch (IllegalArgumentException | IllegalStateException e5) {
                            throw new IllegalStateException("Failed to read file " + str, e5);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f92866c;
    }
}
