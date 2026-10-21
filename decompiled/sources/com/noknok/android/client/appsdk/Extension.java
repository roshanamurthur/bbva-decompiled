package com.noknok.android.client.appsdk;

import com.google.gson.annotations.Expose;
import com.noknok.android.client.extension.IExtension;

/* JADX INFO: loaded from: classes11.dex */
public class Extension implements IExtension {

    @Expose
    public String data;

    @Expose
    public Boolean fail_if_unknown;

    @Expose
    public String id;

    @Override // com.noknok.android.client.extension.IExtension
    public String getData() {
        return this.data;
    }

    @Override // com.noknok.android.client.extension.IExtension
    public String getId() {
        return this.id;
    }

    @Override // com.noknok.android.client.extension.IExtension
    public boolean isFailIfUnknown() {
        return this.fail_if_unknown.booleanValue();
    }
}
