package com.caverock.androidsvg;

import android.util.Log;
import androidx.webkit.ProxyConfig;
import com.bbva.cellswidgets.MaskTextWatcher;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.nativesettings.common.Constants;
import com.bbva.ui.component.menu.model.BaseMenuItem;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.dynamiclinks.DynamicLink;
import com.mastercard.sonic.androidsvg.SVGParser;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.text.Typography;
import kotlin.time.DurationKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: compiled from: CSSParser.java */
/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f39101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f39102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f39103c = false;

    /* JADX INFO: renamed from: com.caverock.androidsvg.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CSSParser.java */
    public static /* synthetic */ class C0180a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f39104a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f39105b;

        static {
            int[] iArr = new int[j.values().length];
            f39105b = iArr;
            try {
                iArr[j.first_child.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f39105b[j.last_child.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f39105b[j.only_child.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f39105b[j.first_of_type.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f39105b[j.last_of_type.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f39105b[j.only_of_type.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f39105b[j.root.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f39105b[j.empty.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f39105b[j.nth_child.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f39105b[j.nth_last_child.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f39105b[j.nth_of_type.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f39105b[j.nth_last_of_type.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f39105b[j.not.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f39105b[j.target.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f39105b[j.lang.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f39105b[j.link.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f39105b[j.visited.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f39105b[j.hover.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f39105b[j.active.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f39105b[j.focus.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f39105b[j.enabled.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f39105b[j.disabled.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f39105b[j.checked.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f39105b[j.indeterminate.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            int[] iArr2 = new int[c.values().length];
            f39104a = iArr2;
            try {
                iArr2[c.EQUALS.ordinal()] = 1;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f39104a[c.INCLUDES.ordinal()] = 2;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f39104a[c.DASHMATCH.ordinal()] = 3;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* JADX INFO: compiled from: CSSParser.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f39106a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c f39107b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f39108c;

        public b(String str, c cVar, String str2) {
            this.f39106a = str;
            this.f39107b = cVar;
            this.f39108c = str2;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: CSSParser.java */
    public static final class c {
        private static final /* synthetic */ c[] $VALUES;
        public static final c DASHMATCH;
        public static final c EQUALS;
        public static final c EXISTS;
        public static final c INCLUDES;

        static {
            c cVar = new c("EXISTS", 0);
            EXISTS = cVar;
            c cVar2 = new c("EQUALS", 1);
            EQUALS = cVar2;
            c cVar3 = new c("INCLUDES", 2);
            INCLUDES = cVar3;
            c cVar4 = new c("DASHMATCH", 3);
            DASHMATCH = cVar4;
            $VALUES = new c[]{cVar, cVar2, cVar3, cVar4};
        }

        public c() {
            throw null;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) $VALUES.clone();
        }
    }

    /* JADX INFO: compiled from: CSSParser.java */
    public static class d extends com.caverock.androidsvg.c.i {

        /* JADX INFO: renamed from: com.caverock.androidsvg.a$d$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: CSSParser.java */
        public static class C0181a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f39109a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final int f39110b;

            public C0181a(int i10, int i11) {
                this.f39109a = i10;
                this.f39110b = i11;
            }
        }

        public d(String str) {
            super(str.replaceAll("(?s)/\\*.*?\\*/", ""));
        }

        public static int r(int i10) {
            if (i10 >= 48 && i10 <= 57) {
                return i10 - 48;
            }
            if (i10 >= 65 && i10 <= 70) {
                return i10 - 55;
            }
            if (i10 < 97 || i10 > 102) {
                return -1;
            }
            return i10 - 87;
        }

        public final String s() {
            int iR;
            if (f()) {
                return null;
            }
            char cCharAt = this.f39208a.charAt(this.f39209b);
            if (cCharAt != '\'' && cCharAt != '\"') {
                return null;
            }
            StringBuilder sb2 = new StringBuilder();
            this.f39209b++;
            int iIntValue = h().intValue();
            while (iIntValue != -1 && iIntValue != cCharAt) {
                if (iIntValue == 92) {
                    iIntValue = h().intValue();
                    if (iIntValue != -1) {
                        if (iIntValue == 10 || iIntValue == 13 || iIntValue == 12) {
                            iIntValue = h().intValue();
                        } else {
                            int iR2 = r(iIntValue);
                            if (iR2 != -1) {
                                for (int i10 = 1; i10 <= 5 && (iR = r((iIntValue = h().intValue()))) != -1; i10++) {
                                    iR2 = (iR2 * 16) + iR;
                                }
                                sb2.append((char) iR2);
                            }
                        }
                    }
                }
                sb2.append((char) iIntValue);
                iIntValue = h().intValue();
            }
            return sb2.toString();
        }

        public final String t() {
            int i10;
            int i11;
            boolean zF = f();
            String str = this.f39208a;
            if (zF) {
                i11 = this.f39209b;
            } else {
                int i12 = this.f39209b;
                int iCharAt = str.charAt(i12);
                if (iCharAt == 45) {
                    iCharAt = a();
                }
                if ((iCharAt < 65 || iCharAt > 90) && ((iCharAt < 97 || iCharAt > 122) && iCharAt != 95)) {
                    i10 = i12;
                } else {
                    int iA = a();
                    while (true) {
                        if ((iA < 65 || iA > 90) && ((iA < 97 || iA > 122) && !((iA >= 48 && iA <= 57) || iA == 45 || iA == 95))) {
                            break;
                        }
                        iA = a();
                    }
                    i10 = this.f39209b;
                }
                this.f39209b = i12;
                i11 = i10;
            }
            int i13 = this.f39209b;
            if (i11 == i13) {
                return null;
            }
            String strSubstring = str.substring(i13, i11);
            this.f39209b = i11;
            return strSubstring;
        }

        /* JADX WARN: Code duplicated, block: B:125:0x01e6  */
        /* JADX WARN: Code duplicated, block: B:181:0x029f  */
        /* JADX WARN: Code duplicated, block: B:235:0x036d  */
        /* JADX WARN: Code duplicated, block: B:253:0x041c  */
        /* JADX WARN: Code duplicated, block: B:258:0x0434  */
        /* JADX WARN: Code duplicated, block: B:260:0x0438  */
        /* JADX WARN: Code duplicated, block: B:268:0x045c  */
        /* JADX WARN: Code duplicated, block: B:26:0x0052  */
        /* JADX WARN: Code duplicated, block: B:284:0x0456 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:285:0x044c A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:287:0x0015 A[SYNTHETIC] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r12v12, types: [com.caverock.androidsvg.a$c] */
        /* JADX WARN: Type inference failed for: r12v35 */
        /* JADX WARN: Type inference failed for: r12v36 */
        /* JADX WARN: Type inference failed for: r12v37, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r12v40 */
        /* JADX WARN: Type inference failed for: r12v41 */
        /* JADX WARN: Type inference failed for: r12v45 */
        /* JADX WARN: Type inference failed for: r12v46 */
        /* JADX WARN: Type inference failed for: r22v2 */
        /* JADX WARN: Type inference failed for: r22v3, types: [boolean] */
        /* JADX WARN: Type inference failed for: r22v4 */
        /* JADX WARN: Type inference failed for: r23v2 */
        /* JADX WARN: Type inference failed for: r23v3, types: [boolean] */
        /* JADX WARN: Type inference failed for: r23v4 */
        /* JADX WARN: Type inference failed for: r25v10 */
        /* JADX WARN: Type inference failed for: r25v11 */
        /* JADX WARN: Type inference failed for: r25v12 */
        /* JADX WARN: Type inference failed for: r25v13 */
        /* JADX WARN: Type inference failed for: r25v14 */
        /* JADX WARN: Type inference failed for: r25v4 */
        /* JADX WARN: Type inference failed for: r25v5 */
        /* JADX WARN: Type inference failed for: r25v6 */
        /* JADX WARN: Type inference failed for: r25v7 */
        /* JADX WARN: Type inference failed for: r25v8 */
        /* JADX WARN: Type inference failed for: r25v9 */
        /* JADX WARN: Type inference failed for: r6v12 */
        /* JADX WARN: Type inference failed for: r6v13 */
        /* JADX WARN: Type inference failed for: r6v3 */
        /* JADX WARN: Type inference failed for: r6v4, types: [com.caverock.androidsvg.a$e] */
        /* JADX WARN: Type inference failed for: r9v10, types: [com.caverock.androidsvg.a$t] */
        /* JADX WARN: Type inference failed for: r9v11 */
        /* JADX WARN: Type inference failed for: r9v12, types: [com.caverock.androidsvg.a$t] */
        /* JADX WARN: Type inference failed for: r9v13, types: [com.caverock.androidsvg.a$t] */
        /* JADX WARN: Type inference failed for: r9v14, types: [com.caverock.androidsvg.a$t] */
        /* JADX WARN: Type inference failed for: r9v15, types: [com.caverock.androidsvg.a$t] */
        /* JADX WARN: Type inference failed for: r9v16, types: [com.caverock.androidsvg.a$t] */
        /* JADX WARN: Type inference failed for: r9v17 */
        /* JADX WARN: Type inference failed for: r9v18 */
        /* JADX WARN: Type inference failed for: r9v25, types: [com.caverock.androidsvg.a$t] */
        /* JADX WARN: Type inference failed for: r9v26, types: [com.caverock.androidsvg.a$t] */
        /* JADX WARN: Type inference failed for: r9v29 */
        /* JADX WARN: Type inference failed for: r9v3 */
        /* JADX WARN: Type inference failed for: r9v30 */
        /* JADX WARN: Type inference failed for: r9v31 */
        /* JADX WARN: Type inference failed for: r9v32 */
        /* JADX WARN: Type inference failed for: r9v33 */
        /* JADX WARN: Type inference failed for: r9v34 */
        /* JADX WARN: Type inference failed for: r9v35 */
        /* JADX WARN: Type inference failed for: r9v36 */
        /* JADX WARN: Type inference failed for: r9v37 */
        /* JADX WARN: Type inference failed for: r9v38 */
        /* JADX WARN: Type inference failed for: r9v39 */
        /* JADX WARN: Type inference failed for: r9v40 */
        /* JADX WARN: Type inference failed for: r9v41 */
        /* JADX WARN: Type inference failed for: r9v42 */
        /* JADX WARN: Type inference failed for: r9v43 */
        /* JADX WARN: Type inference failed for: r9v44 */
        /* JADX WARN: Type inference failed for: r9v45 */
        /* JADX WARN: Type inference failed for: r9v46 */
        /* JADX WARN: Type inference failed for: r9v47 */
        /* JADX WARN: Type inference failed for: r9v6 */
        /* JADX WARN: Type inference failed for: r9v7 */
        /* JADX WARN: Type inference failed for: r9v8, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r9v9, types: [com.caverock.androidsvg.a$t] */
        public final ArrayList u() throws ad.a {
            ArrayList arrayList;
            ?? r10;
            ?? tVar;
            Object obj;
            c cVar;
            c cVar2;
            String strK;
            c cVar3;
            Object obj2;
            Object obj3;
            ?? r11;
            Object obj4;
            ?? r12;
            int i10;
            ad.b bVarA;
            ?? r25;
            C0181a c0181a;
            ?? r26;
            ?? r27;
            ?? r28;
            ArrayList arrayListU;
            ArrayList arrayList2;
            ArrayList arrayList3;
            Object obj5;
            String str = null;
            if (f()) {
                return null;
            }
            int i11 = 1;
            ArrayList arrayList4 = new ArrayList(1);
            s sVar = new s();
            while (!f() && !f()) {
                int i12 = this.f39209b;
                ArrayList arrayList5 = sVar.f39125a;
                int i13 = 0;
                char c10 = '+';
                if (((arrayList5 == null || arrayList5.isEmpty()) ? i11 : 0) != 0) {
                    r10 = str;
                } else if (d(Typography.greater)) {
                    e eVar = e.CHILD;
                    q();
                    r10 = eVar;
                } else if (d('+')) {
                    e eVar2 = e.FOLLOWS;
                    q();
                    r10 = eVar2;
                } else {
                    r10 = str;
                }
                if (d('*')) {
                    tVar = new t(r10, str);
                } else {
                    String strT = t();
                    if (strT != null) {
                        t tVar2 = new t(r10, strT);
                        sVar.f39126b += i11;
                        tVar = tVar2;
                    } else {
                        tVar = str;
                    }
                }
                while (!f()) {
                    if (d('.')) {
                        if (tVar == 0) {
                            tVar = new t(r10, str);
                        }
                        String strT2 = t();
                        if (strT2 == null) {
                            throw new ad.a("Invalid \".class\" simpleSelectors");
                        }
                        tVar.a(Name.LABEL, c.EQUALS, strT2);
                        sVar.a();
                    } else if (d(MaskTextWatcher.WILDCARD)) {
                        if (tVar == 0) {
                            tVar = new t(r10, str);
                        }
                        String strT3 = t();
                        if (strT3 == null) {
                            throw new ad.a("Invalid \"#id\" simpleSelectors");
                        }
                        tVar.a("id", c.EQUALS, strT3);
                        sVar.f39126b += DurationKt.NANOS_IN_MILLIS;
                    } else if (d(AbstractJsonLexerKt.BEGIN_LIST)) {
                        if (tVar == 0) {
                            tVar = new t(r10, str);
                        }
                        q();
                        String strT4 = t();
                        if (strT4 == null) {
                            throw new ad.a("Invalid attribute simpleSelectors");
                        }
                        q();
                        if (d('=')) {
                            cVar3 = c.EQUALS;
                        } else if (e("~=")) {
                            cVar2 = c.INCLUDES;
                        } else if (e("|=")) {
                            cVar = c.DASHMATCH;
                        } else {
                            obj = str;
                        }
                        if (obj != null) {
                            obj = cVar;
                            obj = cVar2;
                            q();
                            if (f()) {
                                strK = str;
                            } else {
                                strK = k();
                                if (strK == null) {
                                    obj = cVar3;
                                    strK = t();
                                }
                            }
                            if (strK == null) {
                                obj = cVar3;
                                throw new ad.a("Invalid attribute simpleSelectors");
                            }
                            obj = cVar3;
                            q();
                        } else {
                            obj = cVar;
                            obj = cVar2;
                            obj = cVar3;
                            strK = str;
                        }
                        ?? r13 = obj;
                        if (!d(AbstractJsonLexerKt.END_LIST)) {
                            throw new ad.a("Invalid attribute simpleSelectors");
                        }
                        if (obj == null) {
                            r13 = c.EXISTS;
                        }
                        tVar.a(strT4, r13, strK);
                        sVar.a();
                    } else {
                        ?? tVar3 = tVar;
                        if (d(AbstractJsonLexerKt.COLON)) {
                            if (tVar == 0) {
                                tVar3 = new t(r10, str);
                            }
                            String strT5 = t();
                            if (strT5 == null) {
                                throw new ad.a("Invalid pseudo class");
                            }
                            j jVarA = j.a(strT5);
                            switch (C0180a.f39105b[jVarA.ordinal()]) {
                                case 1:
                                    h hVar = new h(null, 0, 1, true, false);
                                    sVar.a();
                                    tVar = tVar3;
                                    obj5 = hVar;
                                    if (tVar.f39130d == null) {
                                        tVar.f39130d = new ArrayList();
                                    }
                                    tVar.f39130d.add(obj5);
                                    break;
                                case 2:
                                    h hVar2 = new h(null, 0, 1, false, false);
                                    sVar.a();
                                    tVar = tVar3;
                                    obj5 = hVar2;
                                    if (tVar.f39130d == null) {
                                        tVar.f39130d = new ArrayList();
                                    }
                                    tVar.f39130d.add(obj5);
                                    break;
                                case 3:
                                    str = null;
                                    i13 = 0;
                                    m mVar = new m(false, null);
                                    sVar.a();
                                    tVar = tVar3;
                                    obj5 = mVar;
                                    if (tVar.f39130d == null) {
                                        tVar.f39130d = new ArrayList();
                                    }
                                    tVar.f39130d.add(obj5);
                                    break;
                                case 4:
                                    h hVar3 = new h(tVar3.f39128b, 0, 1, true, true);
                                    sVar.a();
                                    obj2 = hVar3;
                                    str = null;
                                    r11 = tVar3;
                                    obj3 = obj2;
                                    i13 = 0;
                                    tVar = r11;
                                    obj5 = obj3;
                                    if (tVar.f39130d == null) {
                                        tVar.f39130d = new ArrayList();
                                    }
                                    tVar.f39130d.add(obj5);
                                    break;
                                case 5:
                                    h hVar4 = new h(tVar3.f39128b, 0, 1, false, true);
                                    sVar.a();
                                    obj2 = hVar4;
                                    str = null;
                                    r11 = tVar3;
                                    obj3 = obj2;
                                    i13 = 0;
                                    tVar = r11;
                                    obj5 = obj3;
                                    if (tVar.f39130d == null) {
                                        tVar.f39130d = new ArrayList();
                                    }
                                    tVar.f39130d.add(obj5);
                                    break;
                                case 6:
                                    i11 = 1;
                                    m mVar2 = new m(true, tVar3.f39128b);
                                    sVar.a();
                                    obj2 = mVar2;
                                    str = null;
                                    r11 = tVar3;
                                    obj3 = obj2;
                                    i13 = 0;
                                    tVar = r11;
                                    obj5 = obj3;
                                    if (tVar.f39130d == null) {
                                        tVar.f39130d = new ArrayList();
                                    }
                                    tVar.f39130d.add(obj5);
                                    break;
                                case 7:
                                    n nVar = new n();
                                    sVar.a();
                                    r12 = tVar3;
                                    obj4 = nVar;
                                    str = null;
                                    i11 = 1;
                                    r11 = r12;
                                    obj3 = obj4;
                                    i13 = 0;
                                    tVar = r11;
                                    obj5 = obj3;
                                    if (tVar.f39130d == null) {
                                        tVar.f39130d = new ArrayList();
                                    }
                                    tVar.f39130d.add(obj5);
                                    break;
                                case 8:
                                    i iVar = new i();
                                    sVar.a();
                                    r12 = tVar3;
                                    obj4 = iVar;
                                    str = null;
                                    i11 = 1;
                                    r11 = r12;
                                    obj3 = obj4;
                                    i13 = 0;
                                    tVar = r11;
                                    obj5 = obj3;
                                    if (tVar.f39130d == null) {
                                        tVar.f39130d = new ArrayList();
                                    }
                                    tVar.f39130d.add(obj5);
                                    break;
                                case 9:
                                case 10:
                                case 11:
                                case 12:
                                    ?? r22 = (jVarA == j.nth_child || jVarA == j.nth_of_type) ? i11 : i13;
                                    ?? r23 = (jVarA == j.nth_of_type || jVarA == j.nth_last_of_type) ? i11 : i13;
                                    if (f()) {
                                        r28 = tVar3;
                                        c0181a = null;
                                        r27 = r28;
                                    } else {
                                        int i14 = this.f39209b;
                                        if (d(RootService.OPEN_BRACKET)) {
                                            q();
                                            if (e("odd")) {
                                                c0181a = new C0181a(2, i11);
                                            } else if (e("even")) {
                                                c0181a = new C0181a(2, i13);
                                            } else {
                                                int i15 = (!d(c10) && d('-')) ? -1 : i11;
                                                int i16 = this.f39209b;
                                                String str2 = this.f39208a;
                                                int i17 = this.f39210c;
                                                ad.b bVarA2 = ad.b.a(str2, i16, i17);
                                                if (bVarA2 != null) {
                                                    this.f39209b = bVarA2.f217a;
                                                }
                                                if (d('n') || d('N')) {
                                                    if (bVarA2 == null) {
                                                        bVarA2 = new ad.b(1L, this.f39209b);
                                                    }
                                                    q();
                                                    c10 = '+';
                                                    boolean zD = d('+');
                                                    i10 = (zD || !(zD = d('-'))) ? 1 : -1;
                                                    if (zD) {
                                                        q();
                                                        bVarA = ad.b.a(str2, this.f39209b, i17);
                                                        if (bVarA != null) {
                                                            this.f39209b = bVarA.f217a;
                                                            r25 = tVar3;
                                                        } else {
                                                            this.f39209b = i14;
                                                            r28 = tVar3;
                                                        }
                                                    } else {
                                                        bVarA = null;
                                                        r25 = tVar3;
                                                    }
                                                } else {
                                                    r25 = tVar3;
                                                    i10 = i15;
                                                    bVarA = bVarA2;
                                                    i15 = 1;
                                                    bVarA2 = null;
                                                }
                                                c0181a = new C0181a(bVarA2 == null ? 0 : i15 * ((int) bVarA2.f218b), bVarA == null ? 0 : i10 * ((int) bVarA.f218b));
                                                r26 = r25;
                                                q();
                                                r27 = r26;
                                                if (!d(RootService.CLOSE_BRACKET)) {
                                                    this.f39209b = i14;
                                                    r28 = r26;
                                                }
                                            }
                                            r26 = tVar3;
                                            q();
                                            r27 = r26;
                                            if (!d(RootService.CLOSE_BRACKET)) {
                                                this.f39209b = i14;
                                                r28 = r26;
                                            }
                                        } else {
                                            r28 = tVar3;
                                        }
                                        c0181a = null;
                                        r27 = r28;
                                    }
                                    if (c0181a == null) {
                                        throw new ad.a("Invalid or missing parameter section for pseudo class: ".concat(strT5));
                                    }
                                    ?? r14 = r27;
                                    h hVar5 = new h(r14.f39128b, c0181a.f39109a, c0181a.f39110b, r22, r23);
                                    sVar.a();
                                    obj4 = hVar5;
                                    r12 = r14;
                                    str = null;
                                    i11 = 1;
                                    r11 = r12;
                                    obj3 = obj4;
                                    i13 = 0;
                                    tVar = r11;
                                    obj5 = obj3;
                                    if (tVar.f39130d == null) {
                                        tVar.f39130d = new ArrayList();
                                    }
                                    tVar.f39130d.add(obj5);
                                    break;
                                    break;
                                case 13:
                                    if (f()) {
                                        arrayListU = str;
                                    } else {
                                        int i18 = this.f39209b;
                                        if (d(RootService.OPEN_BRACKET)) {
                                            q();
                                            arrayListU = u();
                                            if (arrayListU != null && d(RootService.CLOSE_BRACKET)) {
                                                Iterator it = arrayListU.iterator();
                                                while (it.hasNext() && (arrayList2 = ((s) it.next()).f39125a) != null) {
                                                    Iterator it2 = arrayList2.iterator();
                                                    while (true) {
                                                        if (it2.hasNext() && (arrayList3 = ((t) it2.next()).f39130d) != null) {
                                                            Iterator it3 = arrayList3.iterator();
                                                            while (true) {
                                                                if (it3.hasNext()) {
                                                                    if (((g) it3.next()) instanceof k) {
                                                                        arrayListU = null;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                this.f39209b = i18;
                                                arrayListU = str;
                                            }
                                        } else {
                                            arrayListU = str;
                                        }
                                    }
                                    if (arrayListU == null) {
                                        throw new ad.a("Invalid or missing parameter section for pseudo class: ".concat(strT5));
                                    }
                                    k kVar = new k();
                                    kVar.f39116a = arrayListU;
                                    Iterator it4 = arrayListU.iterator();
                                    int i19 = Integer.MIN_VALUE;
                                    while (it4.hasNext()) {
                                        int i20 = ((s) it4.next()).f39126b;
                                        if (i20 > i19) {
                                            i19 = i20;
                                        }
                                    }
                                    sVar.f39126b = i19;
                                    str = null;
                                    tVar = tVar3;
                                    obj5 = kVar;
                                    if (tVar.f39130d == null) {
                                        tVar.f39130d = new ArrayList();
                                    }
                                    tVar.f39130d.add(obj5);
                                    break;
                                    break;
                                case 14:
                                    o oVar = new o();
                                    sVar.a();
                                    tVar = tVar3;
                                    obj5 = oVar;
                                    if (tVar.f39130d == null) {
                                        tVar.f39130d = new ArrayList();
                                    }
                                    tVar.f39130d.add(obj5);
                                    break;
                                case 15:
                                    if (!f()) {
                                        int i21 = this.f39209b;
                                        if (d(RootService.OPEN_BRACKET)) {
                                            q();
                                            ?? arrayList6 = str;
                                            while (true) {
                                                String strT6 = t();
                                                arrayList6 = arrayList6;
                                                if (strT6 == null) {
                                                    this.f39209b = i21;
                                                } else {
                                                    if (arrayList6 == 0) {
                                                        arrayList6 = new ArrayList();
                                                    }
                                                    arrayList6.add(strT6);
                                                    q();
                                                    if (!p()) {
                                                        if (!d(RootService.CLOSE_BRACKET)) {
                                                            this.f39209b = i21;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    l lVar = new l(strT5);
                                    sVar.a();
                                    tVar = tVar3;
                                    obj5 = lVar;
                                    if (tVar.f39130d == null) {
                                        tVar.f39130d = new ArrayList();
                                    }
                                    tVar.f39130d.add(obj5);
                                    break;
                                case 16:
                                case 17:
                                case 18:
                                case 19:
                                case 20:
                                case 21:
                                case 22:
                                case 23:
                                case 24:
                                    l lVar2 = new l(strT5);
                                    sVar.a();
                                    tVar = tVar3;
                                    obj5 = lVar2;
                                    if (tVar.f39130d == null) {
                                        tVar.f39130d = new ArrayList();
                                    }
                                    tVar.f39130d.add(obj5);
                                    break;
                                default:
                                    throw new ad.a("Unsupported pseudo class: ".concat(strT5));
                            }
                        } else {
                            if (tVar != 0) {
                                this.f39209b = i12;
                                arrayList = sVar.f39125a;
                                if (arrayList != null && !arrayList.isEmpty()) {
                                    arrayList4.add(sVar);
                                }
                                return arrayList4;
                            }
                            if (sVar.f39125a == null) {
                                sVar.f39125a = new ArrayList();
                            }
                            sVar.f39125a.add(tVar);
                            if (!p()) {
                                arrayList4.add(sVar);
                                sVar = new s();
                            }
                        }
                    }
                }
                if (tVar != 0) {
                    this.f39209b = i12;
                    arrayList = sVar.f39125a;
                    if (arrayList != null) {
                        arrayList4.add(sVar);
                    }
                    return arrayList4;
                }
                if (sVar.f39125a == null) {
                    sVar.f39125a = new ArrayList();
                }
                sVar.f39125a.add(tVar);
                if (!p()) {
                    arrayList4.add(sVar);
                    sVar = new s();
                }
            }
            arrayList = sVar.f39125a;
            if (arrayList != null) {
                arrayList4.add(sVar);
            }
            return arrayList4;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: CSSParser.java */
    public static final class e {
        private static final /* synthetic */ e[] $VALUES;
        public static final e CHILD;
        public static final e DESCENDANT;
        public static final e FOLLOWS;

        static {
            e eVar = new e("DESCENDANT", 0);
            DESCENDANT = eVar;
            e eVar2 = new e("CHILD", 1);
            CHILD = eVar2;
            e eVar3 = new e("FOLLOWS", 2);
            FOLLOWS = eVar3;
            $VALUES = new e[]{eVar, eVar2, eVar3};
        }

        public e() {
            throw null;
        }

        public static e valueOf(String str) {
            return (e) Enum.valueOf(e.class, str);
        }

        public static e[] values() {
            return (e[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: CSSParser.java */
    public static final class f {
        private static final /* synthetic */ f[] $VALUES;
        public static final f all;
        public static final f aural;
        public static final f braille;
        public static final f embossed;
        public static final f handheld;
        public static final f print;
        public static final f projection;
        public static final f screen;
        public static final f speech;
        public static final f tty;
        public static final f tv;

        static {
            f fVar = new f(SVGParser.XML_STYLESHEET_ATTR_MEDIA_ALL, 0);
            all = fVar;
            f fVar2 = new f("aural", 1);
            aural = fVar2;
            f fVar3 = new f("braille", 2);
            braille = fVar3;
            f fVar4 = new f("embossed", 3);
            embossed = fVar4;
            f fVar5 = new f("handheld", 4);
            handheld = fVar5;
            f fVar6 = new f(Constants.PRINT, 5);
            print = fVar6;
            f fVar7 = new f("projection", 6);
            projection = fVar7;
            f fVar8 = new f("screen", 7);
            screen = fVar8;
            f fVar9 = new f("speech", 8);
            speech = fVar9;
            f fVar10 = new f("tty", 9);
            tty = fVar10;
            f fVar11 = new f("tv", 10);
            tv = fVar11;
            $VALUES = new f[]{fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9, fVar10, fVar11};
        }

        public f() {
            throw null;
        }

        public static f valueOf(String str) {
            return (f) Enum.valueOf(f.class, str);
        }

        public static f[] values() {
            return (f[]) $VALUES.clone();
        }
    }

    /* JADX INFO: compiled from: CSSParser.java */
    public interface g {
        boolean a(q qVar, SVG.k0 k0Var);
    }

    /* JADX INFO: compiled from: CSSParser.java */
    public static class h implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f39111a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f39112b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f39113c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f39114d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f39115e;

        public h(String str, int i10, int i11, boolean z10, boolean z11) {
            this.f39111a = i10;
            this.f39112b = i11;
            this.f39113c = z10;
            this.f39114d = z11;
            this.f39115e = str;
        }

        @Override // com.caverock.androidsvg.a.g
        public final boolean a(q qVar, SVG.k0 k0Var) {
            int i10;
            int i11;
            boolean z10 = this.f39114d;
            String strF = this.f39115e;
            if (z10 && strF == null) {
                strF = k0Var.f();
            }
            SVG.i0 i0Var = k0Var.f39036b;
            if (i0Var != null) {
                Iterator<SVG.m0> it = i0Var.getChildren().iterator();
                i11 = 0;
                i10 = 0;
                while (it.hasNext()) {
                    SVG.k0 k0Var2 = (SVG.k0) it.next();
                    if (k0Var2 == k0Var) {
                        i11 = i10;
                    }
                    if (strF == null || k0Var2.f().equals(strF)) {
                        i10++;
                    }
                }
            } else {
                i10 = 1;
                i11 = 0;
            }
            int i12 = this.f39113c ? i11 + 1 : i10 - i11;
            int i13 = this.f39111a;
            int i14 = this.f39112b;
            if (i13 == 0) {
                return i12 == i14;
            }
            int i15 = i12 - i14;
            return i15 % i13 == 0 && (Integer.signum(i15) == 0 || Integer.signum(i15) == Integer.signum(i13));
        }

        public final String toString() {
            String str = this.f39113c ? "" : "last-";
            boolean z10 = this.f39114d;
            int i10 = this.f39112b;
            int i11 = this.f39111a;
            return z10 ? String.format("nth-%schild(%dn%+d of type <%s>)", str, Integer.valueOf(i11), Integer.valueOf(i10), this.f39115e) : String.format("nth-%schild(%dn%+d)", str, Integer.valueOf(i11), Integer.valueOf(i10));
        }
    }

    /* JADX INFO: compiled from: CSSParser.java */
    public static class i implements g {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.caverock.androidsvg.a.g
        public final boolean a(q qVar, SVG.k0 k0Var) {
            return !(k0Var instanceof SVG.i0) || ((SVG.i0) k0Var).getChildren().size() == 0;
        }

        public final String toString() {
            return "empty";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: CSSParser.java */
    public static final class j {
        private static final /* synthetic */ j[] $VALUES;
        public static final j UNSUPPORTED;
        public static final j active;
        private static final Map<String, j> cache;
        public static final j checked;
        public static final j disabled;
        public static final j empty;
        public static final j enabled;
        public static final j first_child;
        public static final j first_of_type;
        public static final j focus;
        public static final j hover;
        public static final j indeterminate;
        public static final j lang;
        public static final j last_child;
        public static final j last_of_type;
        public static final j link;
        public static final j not;
        public static final j nth_child;
        public static final j nth_last_child;
        public static final j nth_last_of_type;
        public static final j nth_of_type;
        public static final j only_child;
        public static final j only_of_type;
        public static final j root;
        public static final j target;
        public static final j visited;

        static {
            j jVar = new j("target", 0);
            target = jVar;
            j jVar2 = new j("root", 1);
            root = jVar2;
            j jVar3 = new j("nth_child", 2);
            nth_child = jVar3;
            j jVar4 = new j("nth_last_child", 3);
            nth_last_child = jVar4;
            j jVar5 = new j("nth_of_type", 4);
            nth_of_type = jVar5;
            j jVar6 = new j("nth_last_of_type", 5);
            nth_last_of_type = jVar6;
            j jVar7 = new j("first_child", 6);
            first_child = jVar7;
            j jVar8 = new j("last_child", 7);
            last_child = jVar8;
            j jVar9 = new j("first_of_type", 8);
            first_of_type = jVar9;
            j jVar10 = new j("last_of_type", 9);
            last_of_type = jVar10;
            j jVar11 = new j("only_child", 10);
            only_child = jVar11;
            j jVar12 = new j("only_of_type", 11);
            only_of_type = jVar12;
            j jVar13 = new j("empty", 12);
            empty = jVar13;
            j jVar14 = new j("not", 13);
            not = jVar14;
            j jVar15 = new j("lang", 14);
            lang = jVar15;
            j jVar16 = new j(DynamicLink.Builder.KEY_LINK, 15);
            link = jVar16;
            j jVar17 = new j("visited", 16);
            visited = jVar17;
            j jVar18 = new j("hover", 17);
            hover = jVar18;
            j jVar19 = new j(AppMeasurementSdk.ConditionalUserProperty.ACTIVE, 18);
            active = jVar19;
            j jVar20 = new j("focus", 19);
            focus = jVar20;
            j jVar21 = new j("enabled", 20);
            enabled = jVar21;
            j jVar22 = new j(BaseMenuItem.STATE_DISABLED, 21);
            disabled = jVar22;
            j jVar23 = new j("checked", 22);
            checked = jVar23;
            j jVar24 = new j("indeterminate", 23);
            indeterminate = jVar24;
            j jVar25 = new j("UNSUPPORTED", 24);
            UNSUPPORTED = jVar25;
            $VALUES = new j[]{jVar, jVar2, jVar3, jVar4, jVar5, jVar6, jVar7, jVar8, jVar9, jVar10, jVar11, jVar12, jVar13, jVar14, jVar15, jVar16, jVar17, jVar18, jVar19, jVar20, jVar21, jVar22, jVar23, jVar24, jVar25};
            cache = new HashMap();
            for (j jVar26 : values()) {
                if (jVar26 != UNSUPPORTED) {
                    cache.put(jVar26.name().replace('_', '-'), jVar26);
                }
            }
        }

        public j() {
            throw null;
        }

        public static j a(String str) {
            j jVar = cache.get(str);
            return jVar != null ? jVar : UNSUPPORTED;
        }

        public static j valueOf(String str) {
            return (j) Enum.valueOf(j.class, str);
        }

        public static j[] values() {
            return (j[]) $VALUES.clone();
        }
    }

    /* JADX INFO: compiled from: CSSParser.java */
    public static class k implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public List<s> f39116a;

        @Override // com.caverock.androidsvg.a.g
        public final boolean a(q qVar, SVG.k0 k0Var) {
            Iterator<s> it = this.f39116a.iterator();
            while (it.hasNext()) {
                if (a.i(qVar, it.next(), k0Var)) {
                    return false;
                }
            }
            return true;
        }

        public final String toString() {
            return androidx.camera.core.imagecapture.a.c(new StringBuilder("not("), this.f39116a, ")");
        }
    }

    /* JADX INFO: compiled from: CSSParser.java */
    public static class l implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f39117a;

        public l(String str) {
            this.f39117a = str;
        }

        @Override // com.caverock.androidsvg.a.g
        public final boolean a(q qVar, SVG.k0 k0Var) {
            return false;
        }

        public final String toString() {
            return this.f39117a;
        }
    }

    /* JADX INFO: compiled from: CSSParser.java */
    public static class m implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f39118a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f39119b;

        public m(boolean z10, String str) {
            this.f39118a = z10;
            this.f39119b = str;
        }

        @Override // com.caverock.androidsvg.a.g
        public final boolean a(q qVar, SVG.k0 k0Var) {
            boolean z10 = this.f39118a;
            String strF = this.f39119b;
            if (z10 && strF == null) {
                strF = k0Var.f();
            }
            SVG.i0 i0Var = k0Var.f39036b;
            if (i0Var == null) {
                return true;
            }
            Iterator<SVG.m0> it = i0Var.getChildren().iterator();
            int i10 = 0;
            while (it.hasNext()) {
                SVG.k0 k0Var2 = (SVG.k0) it.next();
                if (strF == null || k0Var2.f().equals(strF)) {
                    i10++;
                }
            }
            return i10 == 1;
        }

        public final String toString() {
            return this.f39118a ? String.format("only-of-type <%s>", this.f39119b) : String.format("only-child", new Object[0]);
        }
    }

    /* JADX INFO: compiled from: CSSParser.java */
    public static class n implements g {
        @Override // com.caverock.androidsvg.a.g
        public final boolean a(q qVar, SVG.k0 k0Var) {
            return k0Var.f39036b == null;
        }

        public final String toString() {
            return "root";
        }
    }

    /* JADX INFO: compiled from: CSSParser.java */
    public static class o implements g {
        @Override // com.caverock.androidsvg.a.g
        public final boolean a(q qVar, SVG.k0 k0Var) {
            return qVar != null && k0Var == qVar.f39123a;
        }

        public final String toString() {
            return "target";
        }
    }

    /* JADX INFO: compiled from: CSSParser.java */
    public static class p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public s f39120a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public SVG.Style f39121b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public u f39122c;

        public final String toString() {
            return String.valueOf(this.f39120a) + " {...} (src=" + this.f39122c + ")";
        }
    }

    /* JADX INFO: compiled from: CSSParser.java */
    public static class q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public SVG.k0 f39123a;

        public final String toString() {
            SVG.k0 k0Var = this.f39123a;
            return k0Var != null ? String.format("<%s id=\"%s\">", k0Var.f(), this.f39123a.f39025c) : "";
        }
    }

    /* JADX INFO: compiled from: CSSParser.java */
    public static class r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ArrayList f39124a = null;

        public final void a(p pVar) {
            if (this.f39124a == null) {
                this.f39124a = new ArrayList();
            }
            for (int i10 = 0; i10 < this.f39124a.size(); i10++) {
                if (((p) this.f39124a.get(i10)).f39120a.f39126b > pVar.f39120a.f39126b) {
                    this.f39124a.add(i10, pVar);
                    return;
                }
            }
            this.f39124a.add(pVar);
        }

        public final void b(r rVar) {
            if (rVar.f39124a == null) {
                return;
            }
            if (this.f39124a == null) {
                this.f39124a = new ArrayList(rVar.f39124a.size());
            }
            Iterator it = rVar.f39124a.iterator();
            while (it.hasNext()) {
                a((p) it.next());
            }
        }

        public final String toString() {
            if (this.f39124a == null) {
                return "";
            }
            StringBuilder sb2 = new StringBuilder();
            Iterator it = this.f39124a.iterator();
            while (it.hasNext()) {
                sb2.append(((p) it.next()).toString());
                sb2.append('\n');
            }
            return sb2.toString();
        }
    }

    /* JADX INFO: compiled from: CSSParser.java */
    public static class s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ArrayList f39125a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f39126b = 0;

        public final void a() {
            this.f39126b += 1000;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder();
            Iterator it = this.f39125a.iterator();
            while (it.hasNext()) {
                sb2.append((t) it.next());
                sb2.append(' ');
            }
            sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
            return androidx.activity.a.d(sb2, this.f39126b, AbstractJsonLexerKt.END_LIST);
        }
    }

    /* JADX INFO: compiled from: CSSParser.java */
    public static class t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e f39127a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f39128b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ArrayList f39129c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ArrayList f39130d = null;

        public t(e eVar, String str) {
            this.f39127a = null;
            this.f39128b = null;
            this.f39127a = eVar == null ? e.DESCENDANT : eVar;
            this.f39128b = str;
        }

        public final void a(String str, c cVar, String str2) {
            if (this.f39129c == null) {
                this.f39129c = new ArrayList();
            }
            this.f39129c.add(new b(str, cVar, str2));
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder();
            e eVar = e.CHILD;
            e eVar2 = this.f39127a;
            if (eVar2 == eVar) {
                sb2.append("> ");
            } else if (eVar2 == e.FOLLOWS) {
                sb2.append("+ ");
            }
            String str = this.f39128b;
            if (str == null) {
                str = ProxyConfig.MATCH_ALL_SCHEMES;
            }
            sb2.append(str);
            ArrayList<b> arrayList = this.f39129c;
            if (arrayList != null) {
                for (b bVar : arrayList) {
                    sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
                    sb2.append(bVar.f39106a);
                    int i10 = C0180a.f39104a[bVar.f39107b.ordinal()];
                    String str2 = bVar.f39108c;
                    if (i10 == 1) {
                        sb2.append('=');
                        sb2.append(str2);
                    } else if (i10 == 2) {
                        sb2.append("~=");
                        sb2.append(str2);
                    } else if (i10 == 3) {
                        sb2.append("|=");
                        sb2.append(str2);
                    }
                    sb2.append(AbstractJsonLexerKt.END_LIST);
                }
            }
            ArrayList<g> arrayList2 = this.f39130d;
            if (arrayList2 != null) {
                for (g gVar : arrayList2) {
                    sb2.append(AbstractJsonLexerKt.COLON);
                    sb2.append(gVar);
                }
            }
            return sb2.toString();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: CSSParser.java */
    public static final class u {
        private static final /* synthetic */ u[] $VALUES;
        public static final u Document;
        public static final u RenderOptions;

        static {
            u uVar = new u("Document", 0);
            Document = uVar;
            u uVar2 = new u("RenderOptions", 1);
            RenderOptions = uVar2;
            $VALUES = new u[]{uVar, uVar2};
        }

        public u() {
            throw null;
        }

        public static u valueOf(String str) {
            return (u) Enum.valueOf(u.class, str);
        }

        public static u[] values() {
            return (u[]) $VALUES.clone();
        }
    }

    public a(f fVar, u uVar) {
        this.f39101a = fVar;
        this.f39102b = uVar;
    }

    public static int a(ArrayList arrayList, int i10, SVG.k0 k0Var) {
        int i11 = 0;
        if (i10 < 0) {
            return 0;
        }
        Object obj = arrayList.get(i10);
        SVG.i0 i0Var = k0Var.f39036b;
        if (obj != i0Var) {
            return -1;
        }
        Iterator<SVG.m0> it = i0Var.getChildren().iterator();
        while (it.hasNext()) {
            if (it.next() == k0Var) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    public static boolean b(ArrayList arrayList, f fVar) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            f fVar2 = (f) it.next();
            if (fVar2 == f.all || fVar2 == fVar) {
                return true;
            }
        }
        return false;
    }

    public static ArrayList e(d dVar) {
        ArrayList arrayList = new ArrayList();
        while (!dVar.f()) {
            String strSubstring = null;
            if (!dVar.f()) {
                int i10 = dVar.f39209b;
                String str = dVar.f39208a;
                char cCharAt = str.charAt(i10);
                if ((cCharAt < 'A' || cCharAt > 'Z') && (cCharAt < 'a' || cCharAt > 'z')) {
                    dVar.f39209b = i10;
                } else {
                    int iA = dVar.a();
                    while (true) {
                        if ((iA < 65 || iA > 90) && (iA < 97 || iA > 122)) {
                            break;
                        }
                        iA = dVar.a();
                    }
                    strSubstring = str.substring(i10, dVar.f39209b);
                }
            }
            if (strSubstring == null) {
                break;
            }
            try {
                arrayList.add(f.valueOf(strSubstring));
            } catch (IllegalArgumentException unused) {
            }
            if (!dVar.p()) {
                break;
            }
        }
        return arrayList;
    }

    public static boolean h(q qVar, s sVar, int i10, ArrayList arrayList, int i11, SVG.k0 k0Var) {
        t tVar = (t) sVar.f39125a.get(i10);
        if (!k(qVar, tVar, k0Var)) {
            return false;
        }
        e eVar = e.DESCENDANT;
        e eVar2 = tVar.f39127a;
        if (eVar2 == eVar) {
            if (i10 == 0) {
                return true;
            }
            while (i11 >= 0) {
                if (j(qVar, sVar, i10 - 1, arrayList, i11)) {
                    return true;
                }
                i11--;
            }
            return false;
        }
        if (eVar2 == e.CHILD) {
            return j(qVar, sVar, i10 - 1, arrayList, i11);
        }
        int iA = a(arrayList, i11, k0Var);
        if (iA <= 0) {
            return false;
        }
        return h(qVar, sVar, i10 - 1, arrayList, i11, (SVG.k0) k0Var.f39036b.getChildren().get(iA - 1));
    }

    public static boolean i(q qVar, s sVar, SVG.k0 k0Var) {
        ArrayList arrayList = new ArrayList();
        Object obj = k0Var.f39036b;
        while (true) {
            if (obj == null) {
                break;
            }
            arrayList.add(0, obj);
            obj = ((SVG.m0) obj).f39036b;
        }
        int size = arrayList.size() - 1;
        ArrayList arrayList2 = sVar.f39125a;
        if (arrayList2 != null && arrayList2.size() == 1) {
            return k(qVar, (t) sVar.f39125a.get(0), k0Var);
        }
        ArrayList arrayList3 = sVar.f39125a;
        return h(qVar, sVar, (arrayList3 != null ? arrayList3.size() : 0) - 1, arrayList, size, k0Var);
    }

    public static boolean j(q qVar, s sVar, int i10, ArrayList arrayList, int i11) {
        t tVar = (t) sVar.f39125a.get(i10);
        SVG.k0 k0Var = (SVG.k0) arrayList.get(i11);
        if (!k(qVar, tVar, k0Var)) {
            return false;
        }
        e eVar = e.DESCENDANT;
        e eVar2 = tVar.f39127a;
        if (eVar2 == eVar) {
            if (i10 == 0) {
                return true;
            }
            while (i11 > 0) {
                i11--;
                if (j(qVar, sVar, i10 - 1, arrayList, i11)) {
                    return true;
                }
            }
            return false;
        }
        if (eVar2 == e.CHILD) {
            return j(qVar, sVar, i10 - 1, arrayList, i11 - 1);
        }
        int iA = a(arrayList, i11, k0Var);
        if (iA <= 0) {
            return false;
        }
        return h(qVar, sVar, i10 - 1, arrayList, i11, (SVG.k0) k0Var.f39036b.getChildren().get(iA - 1));
    }

    public static boolean k(q qVar, t tVar, SVG.k0 k0Var) {
        ArrayList arrayList;
        String str = tVar.f39128b;
        if (str != null && !str.equals(k0Var.f().toLowerCase(Locale.US))) {
            return false;
        }
        ArrayList<b> arrayList2 = tVar.f39129c;
        if (arrayList2 != null) {
            for (b bVar : arrayList2) {
                String str2 = bVar.f39106a;
                str2.getClass();
                boolean zEquals = str2.equals("id");
                String str3 = bVar.f39108c;
                if (zEquals) {
                    if (!str3.equals(k0Var.f39025c)) {
                        return false;
                    }
                } else if (!str2.equals(Name.LABEL) || (arrayList = k0Var.f39029g) == null || !arrayList.contains(str3)) {
                    return false;
                }
            }
        }
        ArrayList arrayList3 = tVar.f39130d;
        if (arrayList3 == null) {
            return true;
        }
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            if (!((g) it.next()).a(qVar, k0Var)) {
                return false;
            }
        }
        return true;
    }

    public final r c(String str) {
        d dVar = new d(str);
        dVar.q();
        return g(dVar);
    }

    public final void d(r rVar, d dVar) throws ad.a {
        int iIntValue;
        int iR;
        String strT = dVar.t();
        dVar.q();
        if (strT == null) {
            throw new ad.a("Invalid '@' rule");
        }
        boolean z10 = this.f39103c;
        f fVar = this.f39101a;
        int i10 = 0;
        if (!z10 && strT.equals(SVGParser.XML_STYLESHEET_ATTR_MEDIA)) {
            ArrayList arrayListE = e(dVar);
            if (!dVar.d(AbstractJsonLexerKt.BEGIN_OBJ)) {
                throw new ad.a("Invalid @media rule: missing rule set");
            }
            dVar.q();
            if (b(arrayListE, fVar)) {
                this.f39103c = true;
                rVar.b(g(dVar));
                this.f39103c = false;
            } else {
                g(dVar);
            }
            if (!dVar.f() && !dVar.d(AbstractJsonLexerKt.END_OBJ)) {
                throw new ad.a("Invalid @media rule: expected '}' at end of rule set");
            }
        } else if (this.f39103c || !strT.equals("import")) {
            Log.w("CSSParser", String.format("Ignoring @%s rule", strT));
            while (!dVar.f() && ((iIntValue = dVar.h().intValue()) != 59 || i10 != 0)) {
                if (iIntValue != 123) {
                    if (iIntValue == 125 && i10 > 0 && (i10 = i10 - 1) == 0) {
                        break;
                    }
                } else {
                    i10++;
                }
            }
        } else {
            String strS = null;
            if (!dVar.f()) {
                int i11 = dVar.f39209b;
                if (dVar.e("url(")) {
                    dVar.q();
                    String strS2 = dVar.s();
                    if (strS2 == null) {
                        StringBuilder sb2 = new StringBuilder();
                        while (!dVar.f()) {
                            int i12 = dVar.f39209b;
                            String str = dVar.f39208a;
                            char cCharAt = str.charAt(i12);
                            if (cCharAt == '\'' || cCharAt == '\"' || cCharAt == '(' || cCharAt == ')' || com.caverock.androidsvg.c.i.g(cCharAt) || Character.isISOControl((int) cCharAt)) {
                                break;
                            }
                            dVar.f39209b++;
                            if (cCharAt == '\\') {
                                if (!dVar.f()) {
                                    int i13 = dVar.f39209b;
                                    dVar.f39209b = i13 + 1;
                                    cCharAt = str.charAt(i13);
                                    if (cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\f') {
                                        int iR2 = d.r(cCharAt);
                                        if (iR2 != -1) {
                                            for (int i14 = 1; i14 <= 5 && !dVar.f() && (iR = d.r(str.charAt(dVar.f39209b))) != -1; i14++) {
                                                dVar.f39209b++;
                                                iR2 = (iR2 * 16) + iR;
                                            }
                                            sb2.append((char) iR2);
                                        }
                                    }
                                }
                            }
                            sb2.append(cCharAt);
                        }
                        strS2 = sb2.length() == 0 ? null : sb2.toString();
                    }
                    if (strS2 == null) {
                        dVar.f39209b = i11;
                    } else {
                        dVar.q();
                        if (dVar.f() || dVar.e(")")) {
                            strS = strS2;
                        } else {
                            dVar.f39209b = i11;
                        }
                    }
                }
            }
            if (strS == null) {
                strS = dVar.s();
            }
            if (strS == null) {
                throw new ad.a("Invalid @import rule: expected string or url()");
            }
            dVar.q();
            ArrayList arrayListE2 = e(dVar);
            if (!dVar.f() && !dVar.d(';')) {
                throw new ad.a("Invalid @media rule: expected '}' at end of rule set");
            }
            if (SVG.f38942g != null && b(arrayListE2, fVar)) {
                String strResolveCSSStyleSheet = SVG.f38942g.resolveCSSStyleSheet(strS);
                if (strResolveCSSStyleSheet == null) {
                    return;
                } else {
                    rVar.b(c(strResolveCSSStyleSheet));
                }
            }
        }
        dVar.q();
    }

    public final boolean f(r rVar, d dVar) throws ad.a {
        ArrayList<s> arrayListU = dVar.u();
        if (arrayListU == null || arrayListU.isEmpty()) {
            return false;
        }
        if (!dVar.d(AbstractJsonLexerKt.BEGIN_OBJ)) {
            throw new ad.a("Malformed rule block: expected '{'");
        }
        dVar.q();
        SVG.Style style = new SVG.Style();
        do {
            String strT = dVar.t();
            dVar.q();
            if (!dVar.d(AbstractJsonLexerKt.COLON)) {
                throw new ad.a("Expected ':'");
            }
            dVar.q();
            String strSubstring = null;
            if (!dVar.f()) {
                int i10 = dVar.f39209b;
                String str = dVar.f39208a;
                int iCharAt = str.charAt(i10);
                int i11 = i10;
                while (iCharAt != -1 && iCharAt != 59 && iCharAt != 125 && iCharAt != 33 && iCharAt != 10 && iCharAt != 13) {
                    if (!com.caverock.androidsvg.c.i.g(iCharAt)) {
                        i11 = dVar.f39209b + 1;
                    }
                    iCharAt = dVar.a();
                }
                if (dVar.f39209b > i10) {
                    strSubstring = str.substring(i10, i11);
                } else {
                    dVar.f39209b = i10;
                }
            }
            if (strSubstring == null) {
                throw new ad.a("Expected property value");
            }
            dVar.q();
            if (dVar.d('!')) {
                dVar.q();
                if (!dVar.e("important")) {
                    throw new ad.a("Malformed rule set: found unexpected '!'");
                }
                dVar.q();
            }
            dVar.d(';');
            com.caverock.androidsvg.c.H(style, strT, strSubstring);
            dVar.q();
            if (dVar.f()) {
                break;
            }
        } while (!dVar.d(AbstractJsonLexerKt.END_OBJ));
        dVar.q();
        for (s sVar : arrayListU) {
            p pVar = new p();
            pVar.f39120a = sVar;
            pVar.f39121b = style;
            pVar.f39122c = this.f39102b;
            rVar.a(pVar);
        }
        return true;
    }

    public final r g(d dVar) {
        r rVar = new r();
        while (!dVar.f()) {
            try {
                if (!dVar.e("<!--") && !dVar.e("-->")) {
                    if (!dVar.d('@')) {
                        if (!f(rVar, dVar)) {
                            break;
                        }
                    } else {
                        d(rVar, dVar);
                    }
                }
            } catch (ad.a e5) {
                e5.getMessage();
            }
        }
        return rVar;
    }
}
