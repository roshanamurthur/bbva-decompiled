package com.fido.uaf.ver0100.types;

import com.google.gson.annotations.Expose;
import com.noknok.android.client.asm.api.uaf.json.Version;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class TrustedFacets {

    @Expose
    public List<String> ids;

    @Expose
    public Version version;

    public boolean isValid() {
        Version version;
        return (this.ids == null || (version = this.version) == null || !version.isValid()) ? false : true;
    }
}
