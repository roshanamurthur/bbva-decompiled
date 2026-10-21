package com.google.i18n.phonenumbers.metadata.source;

import com.google.i18n.phonenumbers.MetadataLoader;
import com.google.i18n.phonenumbers.Phonemetadata;
import com.google.i18n.phonenumbers.metadata.init.MetadataParser;
import qg.a;
import qg.d;
import qg.e;

/* JADX INFO: loaded from: classes10.dex */
public final class FormattingMetadataSourceImpl implements FormattingMetadataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PhoneMetadataFileNameProvider f49357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MetadataBootstrappingGuard<e<Integer>> f49358b;

    public FormattingMetadataSourceImpl(PhoneMetadataFileNameProvider phoneMetadataFileNameProvider, MetadataBootstrappingGuard<e<Integer>> metadataBootstrappingGuard) {
        this.f49357a = phoneMetadataFileNameProvider;
        this.f49358b = metadataBootstrappingGuard;
    }

    @Override // com.google.i18n.phonenumbers.metadata.source.FormattingMetadataSource
    public Phonemetadata.PhoneMetadata getFormattingMetadataForCountryCallingCode(int i10) {
        return ((e) this.f49358b.getOrBootstrap(this.f49357a.getFor(Integer.valueOf(i10)))).b(Integer.valueOf(i10));
    }

    public FormattingMetadataSourceImpl(PhoneMetadataFileNameProvider phoneMetadataFileNameProvider, MetadataLoader metadataLoader, MetadataParser metadataParser) {
        this(phoneMetadataFileNameProvider, new a(metadataLoader, metadataParser, new e(new d())));
    }
}
