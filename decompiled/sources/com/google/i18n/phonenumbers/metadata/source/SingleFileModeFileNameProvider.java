package com.google.i18n.phonenumbers.metadata.source;

/* JADX INFO: loaded from: classes10.dex */
public final class SingleFileModeFileNameProvider implements PhoneMetadataFileNameProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f49365a;

    public SingleFileModeFileNameProvider(String str) {
        this.f49365a = str;
    }

    @Override // com.google.i18n.phonenumbers.metadata.source.PhoneMetadataFileNameProvider
    public String getFor(Object obj) {
        return this.f49365a;
    }
}
