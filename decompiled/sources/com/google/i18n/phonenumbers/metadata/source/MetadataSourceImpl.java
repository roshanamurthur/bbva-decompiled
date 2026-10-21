package com.google.i18n.phonenumbers.metadata.source;

import androidx.camera.camera2.internal.compat.u;
import com.google.i18n.phonenumbers.MetadataLoader;
import com.google.i18n.phonenumbers.Phonemetadata;
import com.google.i18n.phonenumbers.internal.GeoEntityUtility;
import com.google.i18n.phonenumbers.metadata.init.MetadataParser;
import qg.a;
import qg.b;

/* JADX INFO: loaded from: classes10.dex */
public final class MetadataSourceImpl implements MetadataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PhoneMetadataFileNameProvider f49359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MetadataBootstrappingGuard<b> f49360b;

    public MetadataSourceImpl(PhoneMetadataFileNameProvider phoneMetadataFileNameProvider, MetadataBootstrappingGuard<b> metadataBootstrappingGuard) {
        this.f49359a = phoneMetadataFileNameProvider;
        this.f49360b = metadataBootstrappingGuard;
    }

    @Override // com.google.i18n.phonenumbers.metadata.source.NonGeographicalEntityMetadataSource
    public Phonemetadata.PhoneMetadata getMetadataForNonGeographicalRegion(int i10) {
        if (!GeoEntityUtility.isGeoEntity(i10)) {
            return ((b) this.f49360b.getOrBootstrap(this.f49359a.getFor(Integer.valueOf(i10)))).f92868a.b(Integer.valueOf(i10));
        }
        throw new IllegalArgumentException(i10 + " calling code belongs to a geo entity");
    }

    @Override // com.google.i18n.phonenumbers.metadata.source.RegionMetadataSource
    public Phonemetadata.PhoneMetadata getMetadataForRegion(String str) {
        if (!GeoEntityUtility.isGeoEntity(str)) {
            throw new IllegalArgumentException(u.f(str, " region code is a non-geo entity"));
        }
        return ((b) this.f49360b.getOrBootstrap(this.f49359a.getFor(str))).f92869b.b(str);
    }

    public MetadataSourceImpl(PhoneMetadataFileNameProvider phoneMetadataFileNameProvider, MetadataLoader metadataLoader, MetadataParser metadataParser) {
        this(phoneMetadataFileNameProvider, new a(metadataLoader, metadataParser, new b()));
    }
}
