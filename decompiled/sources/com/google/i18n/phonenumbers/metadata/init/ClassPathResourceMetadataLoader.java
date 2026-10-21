package com.google.i18n.phonenumbers.metadata.init;

import com.google.i18n.phonenumbers.MetadataLoader;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes10.dex */
public final class ClassPathResourceMetadataLoader implements MetadataLoader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f49354a = Logger.getLogger(ClassPathResourceMetadataLoader.class.getName());

    @Override // com.google.i18n.phonenumbers.MetadataLoader
    public InputStream loadMetadata(String str) {
        InputStream resourceAsStream = ClassPathResourceMetadataLoader.class.getResourceAsStream(str);
        if (resourceAsStream == null) {
            f49354a.log(Level.WARNING, String.format("File %s not found", str));
        }
        return resourceAsStream;
    }
}
