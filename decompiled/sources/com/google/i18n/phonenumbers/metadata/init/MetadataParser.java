package com.google.i18n.phonenumbers.metadata.init;

import com.google.i18n.phonenumbers.Phonemetadata;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes10.dex */
public final class MetadataParser {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f49355b = Logger.getLogger(MetadataParser.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f49356a;

    public MetadataParser(boolean z10) {
        this.f49356a = z10;
    }

    public static MetadataParser newLenientParser() {
        return new MetadataParser(false);
    }

    public static MetadataParser newStrictParser() {
        return new MetadataParser(true);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x005d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x0068 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public Collection<Phonemetadata.PhoneMetadata> parse(InputStream inputStream) throws Throwable {
        Throwable th2;
        IOException e5;
        Logger logger = f49355b;
        if (inputStream == null) {
            if (this.f49356a) {
                throw new IllegalArgumentException("Source cannot be null");
            }
            return Collections.emptyList();
        }
        InputStream inputStream2 = null;
        try {
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
                try {
                    Phonemetadata.PhoneMetadataCollection phoneMetadataCollection = new Phonemetadata.PhoneMetadataCollection();
                    phoneMetadataCollection.readExternal(objectInputStream);
                    if (phoneMetadataCollection.getMetadataList().isEmpty()) {
                        throw new IllegalStateException("Empty metadata");
                    }
                    List<Phonemetadata.PhoneMetadata> metadataList = phoneMetadataCollection.getMetadataList();
                    try {
                        objectInputStream.close();
                    } catch (IOException e7) {
                        logger.log(Level.WARNING, "Error closing input stream (ignored)", (Throwable) e7);
                    }
                    return metadataList;
                } catch (IOException e10) {
                    e5 = e10;
                    throw new IllegalStateException("Unable to parse metadata file", e5);
                }
            } catch (Throwable th3) {
                th2 = th3;
                if (0 != 0) {
                    try {
                        inputStream2.close();
                    } catch (IOException e11) {
                        logger.log(Level.WARNING, "Error closing input stream (ignored)", (Throwable) e11);
                    }
                } else {
                    try {
                        inputStream.close();
                    } catch (IOException e12) {
                        logger.log(Level.WARNING, "Error closing input stream (ignored)", (Throwable) e12);
                    }
                }
                throw th2;
            }
        } catch (IOException e13) {
            e5 = e13;
        } catch (Throwable th4) {
            th2 = th4;
            if (0 != 0) {
                inputStream2.close();
            } else {
                inputStream.close();
            }
            throw th2;
        }
    }
}
