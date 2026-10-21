package com.google.android.play.core.splitinstall.internal;

import android.content.res.AssetManager;
import android.content.res.XmlResourceParser;
import androidx.annotation.Nullable;
import com.google.android.play.core.splitcompat.zza;
import java.io.File;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzal {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public XmlResourceParser f46302a;

    public zzal(zza zzaVar) {
    }

    public final long zza() throws XmlPullParserException, IOException {
        int next;
        if (this.f46302a == null) {
            throw new XmlPullParserException("Manifest file needs to be loaded before parsing.");
        }
        do {
            next = this.f46302a.next();
            if (next == 2) {
                if (!this.f46302a.getName().equals("manifest")) {
                    break;
                }
                String attributeValue = this.f46302a.getAttributeValue("http://schemas.android.com/apk/res/android", "versionCode");
                String attributeValue2 = this.f46302a.getAttributeValue("http://schemas.android.com/apk/res/android", "versionCodeMajor");
                if (attributeValue == null) {
                    throw new XmlPullParserException("Manifest entry doesn't contain 'versionCode' attribute.");
                }
                try {
                    int i10 = Integer.parseInt(attributeValue);
                    if (attributeValue2 == null) {
                        return i10;
                    }
                    try {
                        return (((long) Integer.parseInt(attributeValue2)) << 32) | (((long) i10) & 4294967295L);
                    } catch (NumberFormatException e5) {
                        throw new XmlPullParserException(String.format("Couldn't parse versionCodeMajor to int: %s", e5.getMessage()));
                    }
                } catch (NumberFormatException e7) {
                    throw new XmlPullParserException(String.format("Couldn't parse versionCode to int: %s", e7.getMessage()));
                }
            }
        } while (next != 1);
        throw new XmlPullParserException("Couldn't find manifest entry at top-level.");
    }

    public final void zzb(AssetManager assetManager, File file) throws IOException {
        this.f46302a = assetManager.openXmlResourceParser(zza.zzc(assetManager, file), "AndroidManifest.xml");
    }
}
