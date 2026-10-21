package qg;

import com.google.i18n.phonenumbers.Phonemetadata;
import com.google.i18n.phonenumbers.internal.GeoEntityUtility;

/* JADX INFO: compiled from: CompositeMetadataContainer.java */
/* JADX INFO: loaded from: classes10.dex */
public final class b implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e<Integer> f92868a = new e<>(new d());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e<String> f92869b = new e<>(new c());

    @Override // qg.f
    public final void a(Phonemetadata.PhoneMetadata phoneMetadata) {
        e<String> eVar = this.f92869b;
        if (GeoEntityUtility.isGeoEntity(eVar.f92871b.a(phoneMetadata))) {
            eVar.a(phoneMetadata);
        } else {
            this.f92868a.a(phoneMetadata);
        }
    }
}
