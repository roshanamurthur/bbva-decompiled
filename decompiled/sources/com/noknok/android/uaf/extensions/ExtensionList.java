package com.noknok.android.uaf.extensions;

import android.util.Base64;
import com.noknok.android.client.asm.api.uaf.json.Extension;
import com.noknok.android.client.extension.IExtensionList;
import com.noknok.android.client.utils.Charsets;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class ExtensionList implements IExtensionList {
    public static final String FALLBACK_ID = "noknok.fallback";
    public static final String SHOWWHENLOCKED_ID = "noknok.showWhenLocked";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<Extension> f63538a;

    public ExtensionList() {
        this.f63538a = new ArrayList();
    }

    @Override // com.noknok.android.client.extension.IExtensionList
    public void addExtension(String str, String str2, boolean z10) {
        removeExtension(str);
        this.f63538a.add(new Extension(str, str2, z10));
    }

    public ExtensionList addFallbackExtension(String str) {
        Charset charset = Charsets.utf8Charset;
        addExtension(FALLBACK_ID, new String(Base64.encode(str.getBytes(charset), 11), charset), false);
        return this;
    }

    public ExtensionList addShowWhenLockedExtension() {
        addExtension(SHOWWHENLOCKED_ID, "", false);
        return this;
    }

    @Override // com.noknok.android.client.extension.IExtensionList
    public List<Extension> getExtensions() {
        return this.f63538a;
    }

    @Override // com.noknok.android.client.extension.IExtensionList
    public void removeExtension(String str) {
        List<Extension> list = this.f63538a;
        if (list != null) {
            for (Extension extension : list) {
                if (extension.getId().equals(str)) {
                    this.f63538a.remove(extension);
                    return;
                }
            }
        }
    }

    @Override // com.noknok.android.client.extension.IExtensionList
    public Extension getExtension(String str) {
        List<Extension> list = this.f63538a;
        if (list == null) {
            return null;
        }
        for (Extension extension : list) {
            if (extension.getId().equals(str)) {
                return extension;
            }
        }
        return null;
    }

    public ExtensionList(List<Extension> list) {
        this.f63538a = list;
    }
}
