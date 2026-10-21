package com.google.i18n.phonenumbers.metadata;

import com.google.i18n.phonenumbers.MetadataLoader;
import com.google.i18n.phonenumbers.metadata.init.ClassPathResourceMetadataLoader;
import com.google.i18n.phonenumbers.metadata.init.MetadataParser;
import com.google.i18n.phonenumbers.metadata.source.FormattingMetadataSource;
import com.google.i18n.phonenumbers.metadata.source.FormattingMetadataSourceImpl;
import com.google.i18n.phonenumbers.metadata.source.MetadataSource;
import com.google.i18n.phonenumbers.metadata.source.MetadataSourceImpl;
import com.google.i18n.phonenumbers.metadata.source.MultiFileModeFileNameProvider;
import com.google.i18n.phonenumbers.metadata.source.PhoneMetadataFileNameProvider;
import com.google.i18n.phonenumbers.metadata.source.RegionMetadataSource;
import com.google.i18n.phonenumbers.metadata.source.RegionMetadataSourceImpl;

/* JADX INFO: loaded from: classes10.dex */
public final class DefaultMetadataDependenciesProvider {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final DefaultMetadataDependenciesProvider f49345i = new DefaultMetadataDependenciesProvider();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MetadataParser f49346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ClassPathResourceMetadataLoader f49347b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MultiFileModeFileNameProvider f49348c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MetadataSourceImpl f49349d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final MultiFileModeFileNameProvider f49350e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final RegionMetadataSourceImpl f49351f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final MultiFileModeFileNameProvider f49352g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final FormattingMetadataSourceImpl f49353h;

    public DefaultMetadataDependenciesProvider() {
        MetadataParser metadataParserNewLenientParser = MetadataParser.newLenientParser();
        this.f49346a = metadataParserNewLenientParser;
        ClassPathResourceMetadataLoader classPathResourceMetadataLoader = new ClassPathResourceMetadataLoader();
        this.f49347b = classPathResourceMetadataLoader;
        MultiFileModeFileNameProvider multiFileModeFileNameProvider = new MultiFileModeFileNameProvider("/com/google/i18n/phonenumbers/data/PhoneNumberMetadataProto");
        this.f49348c = multiFileModeFileNameProvider;
        this.f49349d = new MetadataSourceImpl(multiFileModeFileNameProvider, classPathResourceMetadataLoader, metadataParserNewLenientParser);
        MultiFileModeFileNameProvider multiFileModeFileNameProvider2 = new MultiFileModeFileNameProvider("/com/google/i18n/phonenumbers/data/ShortNumberMetadataProto");
        this.f49350e = multiFileModeFileNameProvider2;
        this.f49351f = new RegionMetadataSourceImpl(multiFileModeFileNameProvider2, classPathResourceMetadataLoader, metadataParserNewLenientParser);
        MultiFileModeFileNameProvider multiFileModeFileNameProvider3 = new MultiFileModeFileNameProvider("/com/google/i18n/phonenumbers/data/PhoneNumberAlternateFormatsProto");
        this.f49352g = multiFileModeFileNameProvider3;
        this.f49353h = new FormattingMetadataSourceImpl(multiFileModeFileNameProvider3, classPathResourceMetadataLoader, metadataParserNewLenientParser);
    }

    public static DefaultMetadataDependenciesProvider getInstance() {
        return f49345i;
    }

    public PhoneMetadataFileNameProvider getAlternateFormatsMetadataFileNameProvider() {
        return this.f49352g;
    }

    public FormattingMetadataSource getAlternateFormatsMetadataSource() {
        return this.f49353h;
    }

    public String getCarrierDataDirectory() {
        return "/com/google/i18n/phonenumbers/carrier/data/";
    }

    public String getGeocodingDataDirectory() {
        return "/com/google/i18n/phonenumbers/geocoding/data/";
    }

    public MetadataLoader getMetadataLoader() {
        return this.f49347b;
    }

    public MetadataParser getMetadataParser() {
        return this.f49346a;
    }

    public PhoneMetadataFileNameProvider getPhoneNumberMetadataFileNameProvider() {
        return this.f49348c;
    }

    public MetadataSource getPhoneNumberMetadataSource() {
        return this.f49349d;
    }

    public PhoneMetadataFileNameProvider getShortNumberMetadataFileNameProvider() {
        return this.f49350e;
    }

    public RegionMetadataSource getShortNumberMetadataSource() {
        return this.f49351f;
    }
}
