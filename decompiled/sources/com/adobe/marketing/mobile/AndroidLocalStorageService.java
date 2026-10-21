package com.adobe.marketing.mobile;

/* JADX INFO: loaded from: classes2.dex */
class AndroidLocalStorageService implements LocalStorageService {
    @Override // com.adobe.marketing.mobile.LocalStorageService
    public LocalStorageService.DataStore getDataStore(String str) {
        return AndroidDataStore.createDataStore(str);
    }
}
