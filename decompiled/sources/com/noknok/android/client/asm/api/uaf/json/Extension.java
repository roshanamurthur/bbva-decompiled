package com.noknok.android.client.asm.api.uaf.json;

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

    public Extension() {
    }

    public Extension(String str, String str2, boolean z10) {
        this.id = str;
        this.data = str2;
        this.fail_if_unknown = Boolean.valueOf(z10);
    }

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

    public boolean isValid() {
        String str = this.id;
        return (str == null || str.isEmpty() || this.id.length() > 32 || this.data == null || this.fail_if_unknown == null) ? false : true;
    }
}
