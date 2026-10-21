package qg;

import com.google.i18n.phonenumbers.Phonemetadata;

/* JADX INFO: compiled from: MapBackedMetadataContainer.java */
/* JADX INFO: loaded from: classes10.dex */
public final class d implements e.a<Integer> {
    @Override // qg.e.a
    public final Integer a(Phonemetadata.PhoneMetadata phoneMetadata) {
        return Integer.valueOf(phoneMetadata.getCountryCode());
    }
}
