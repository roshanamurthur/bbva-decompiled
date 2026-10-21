package com.google.i18n.phonenumbers.metadata.source;

import androidx.camera.camera2.internal.compat.u;
import com.google.i18n.phonenumbers.MetadataLoader;
import com.google.i18n.phonenumbers.Phonemetadata;
import com.google.i18n.phonenumbers.internal.GeoEntityUtility;
import com.google.i18n.phonenumbers.metadata.init.MetadataParser;
import qg.a;
import qg.c;
import qg.e;

/* JADX INFO: loaded from: classes10.dex */
public final class RegionMetadataSourceImpl implements RegionMetadataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PhoneMetadataFileNameProvider f49363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MetadataBootstrappingGuard<e<String>> f49364b;

    public RegionMetadataSourceImpl(PhoneMetadataFileNameProvider phoneMetadataFileNameProvider, MetadataBootstrappingGuard<e<String>> metadataBootstrappingGuard) {
        this.f49363a = phoneMetadataFileNameProvider;
        this.f49364b = metadataBootstrappingGuard;
    }

    @Override // com.google.i18n.phonenumbers.metadata.source.RegionMetadataSource
    public Phonemetadata.PhoneMetadata getMetadataForRegion(String str) {
        if (!GeoEntityUtility.isGeoEntity(str)) {
            throw new IllegalArgumentException(u.f(str, " region code is a non-geo entity"));
        }
        return ((e) this.f49364b.getOrBootstrap(this.f49363a.getFor(str))).b(str);
    }

    public RegionMetadataSourceImpl(PhoneMetadataFileNameProvider phoneMetadataFileNameProvider, MetadataLoader metadataLoader, MetadataParser metadataParser) {
        this(phoneMetadataFileNameProvider, new a(metadataLoader, metadataParser, new e(new c())));
    }
}
