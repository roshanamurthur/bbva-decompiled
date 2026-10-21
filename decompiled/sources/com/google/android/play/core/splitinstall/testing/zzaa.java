package com.google.android.play.core.splitinstall.testing;

import com.google.android.play.core.splitinstall.internal.zzu;
import com.google.android.play.core.splitinstall.model.zza;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import ye.a;
import ye.b;
import ye.e;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzaa {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final zzu f46342c = new zzu("LocalTestingConfigParser");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final XmlPullParser f46343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f46344b;

    public zzaa(XmlPullParser xmlPullParser) {
        this.f46343a = xmlPullParser;
        zzv zzvVar = zzv.zza;
        a aVar = new a();
        aVar.f94787b = new HashMap();
        this.f46344b = aVar;
    }

    public static zzv zza(File file) {
        File file2 = new File(file, "local_testing_config.xml");
        if (!file2.exists()) {
            return zzv.zza;
        }
        try {
            FileReader fileReader = new FileReader(file2);
            try {
                XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
                xmlPullParserNewPullParser.setInput(fileReader);
                final zzaa zzaaVar = new zzaa(xmlPullParserNewPullParser);
                zzaaVar.a("local-testing-config", new e() { // from class: com.google.android.play.core.splitinstall.testing.zzy
                    @Override // ye.e
                    public final void zza() throws XmlPullParserException, IOException {
                        final zzaa zzaaVar2 = this.zza;
                        zzaaVar2.getClass();
                        zzaaVar2.a("split-install-errors", new e() { // from class: com.google.android.play.core.splitinstall.testing.zzx
                            @Override // ye.e
                            public final void zza() throws XmlPullParserException, IOException {
                                zzaa.zzb(zzaaVar2);
                            }
                        });
                    }
                });
                b bVarC = zzaaVar.f46344b.c();
                fileReader.close();
                return bVarC;
            } catch (Throwable th2) {
                try {
                    fileReader.close();
                } catch (Throwable th3) {
                    try {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                    } catch (Exception unused) {
                    }
                }
                throw th2;
            }
        } catch (IOException | RuntimeException | XmlPullParserException e5) {
            f46342c.zze("%s can not be parsed, using default. Error: %s", "local_testing_config.xml", e5.getMessage());
            return zzv.zza;
        }
    }

    public static void zzb(final zzaa zzaaVar) throws XmlPullParserException, IOException {
        for (int i10 = 0; i10 < zzaaVar.f46343a.getAttributeCount(); i10++) {
            XmlPullParser xmlPullParser = zzaaVar.f46343a;
            if ("defaultErrorCode".equals(xmlPullParser.getAttributeName(i10))) {
                zzaaVar.f46344b.f94786a = Integer.valueOf(zza.zza(xmlPullParser.getAttributeValue(i10)));
            }
        }
        zzaaVar.a("split-install-error", new e() { // from class: com.google.android.play.core.splitinstall.testing.zzw
            @Override // ye.e
            public final void zza() throws XmlPullParserException {
                zzaa.zzc(this.zza);
            }
        });
    }

    public static void zzc(zzaa zzaaVar) throws XmlPullParserException {
        XmlPullParser xmlPullParser;
        int i10 = 0;
        String attributeValue = null;
        String attributeValue2 = null;
        while (true) {
            int attributeCount = zzaaVar.f46343a.getAttributeCount();
            xmlPullParser = zzaaVar.f46343a;
            if (i10 >= attributeCount) {
                break;
            }
            if ("module".equals(xmlPullParser.getAttributeName(i10))) {
                attributeValue = xmlPullParser.getAttributeValue(i10);
            }
            if ("errorCode".equals(xmlPullParser.getAttributeName(i10))) {
                attributeValue2 = xmlPullParser.getAttributeValue(i10);
            }
            i10++;
        }
        if (attributeValue == null || attributeValue2 == null) {
            throw new XmlPullParserException(String.format("'%s' element does not contain 'module'/'errorCode' attributes.", "split-install-error"), xmlPullParser, null);
        }
        int iZza = zza.zza(attributeValue2);
        Map map = zzaaVar.f46344b.f94787b;
        if (map == null) {
            throw new IllegalStateException("Property \"splitInstallErrorCodeByModule\" has not been set");
        }
        map.put(attributeValue, Integer.valueOf(iZza));
        while (xmlPullParser.next() != 3) {
        }
    }

    public final void a(String str, e eVar) throws XmlPullParserException, IOException {
        while (true) {
            XmlPullParser xmlPullParser = this.f46343a;
            int next = xmlPullParser.next();
            if (next == 3 || next == 1) {
                return;
            }
            if (xmlPullParser.getEventType() == 2) {
                if (!xmlPullParser.getName().equals(str)) {
                    throw new XmlPullParserException(String.format("Expected '%s' tag but found '%s'.", str, xmlPullParser.getName()), xmlPullParser, null);
                }
                eVar.zza();
            }
        }
    }
}
