package com.google.i18n.phonenumbers.metadata.source;

import androidx.camera.camera2.internal.compat.u;
import androidx.camera.core.processing.f;
import com.bbva.notifications.constants.PushConstants;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes10.dex */
public final class MultiFileModeFileNameProvider implements PhoneMetadataFileNameProvider {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f49361b = Pattern.compile("^[\\p{L}\\p{N}]+$");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f49362a;

    public MultiFileModeFileNameProvider(String str) {
        this.f49362a = u.f(str, PushConstants.GE_PARAMS_SEPARATOR);
    }

    @Override // com.google.i18n.phonenumbers.metadata.source.PhoneMetadataFileNameProvider
    public String getFor(Object obj) {
        String string = obj.toString();
        if (!f49361b.matcher(string).matches()) {
            throw new IllegalArgumentException(f.d("Invalid key: ", string));
        }
        return this.f49362a + obj;
    }
}
