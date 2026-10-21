package com.bea.xml.stream.reader;

/* JADX INFO: loaded from: classes9.dex */
public class XmlChars {
    public static boolean a(char c10) {
        int i10 = (c10 >> '\b') & 255;
        if (i10 == 0) {
            return c10 == 170 || c10 == 181 || c10 == 186;
        }
        if (i10 == 1) {
            return (c10 >= 306 && c10 <= 307) || (c10 >= 319 && c10 <= 320) || c10 == 329 || c10 == 383 || ((c10 >= 452 && c10 <= 460) || (c10 >= 497 && c10 <= 499));
        }
        if (i10 == 2) {
            return (c10 >= 688 && c10 <= 696) || (c10 >= 736 && c10 <= 740);
        }
        if (i10 == 3) {
            return c10 == 890;
        }
        if (i10 == 5) {
            return c10 == 1415;
        }
        if (i10 == 14) {
            return c10 >= 3804 && c10 <= 3805;
        }
        if (i10 == 17) {
            return c10 == 4353 || c10 == 4356 || c10 == 4360 || c10 == 4362 || c10 == 4365 || (c10 >= 4371 && c10 <= 4411) || c10 == 4413 || c10 == 4415 || ((c10 >= 4417 && c10 <= 4427) || c10 == 4429 || c10 == 4431 || ((c10 >= 4433 && c10 <= 4435) || ((c10 >= 4438 && c10 <= 4440) || c10 == 4450 || c10 == 4452 || c10 == 4454 || c10 == 4456 || ((c10 >= 4458 && c10 <= 4460) || ((c10 >= 4463 && c10 <= 4465) || c10 == 4468 || ((c10 >= 4470 && c10 <= 4509) || ((c10 >= 4511 && c10 <= 4514) || ((c10 >= 4521 && c10 <= 4522) || ((c10 >= 4524 && c10 <= 4525) || ((c10 >= 4528 && c10 <= 4534) || c10 == 4537 || c10 == 4539 || ((c10 >= 4547 && c10 <= 4586) || ((c10 >= 4588 && c10 <= 4591) || (c10 >= 4593 && c10 <= 4600)))))))))))));
        }
        if (i10 == 32) {
            return c10 == 8319;
        }
        if (i10 == 33) {
            return c10 == 8450 || c10 == 8455 || (c10 >= 8458 && c10 <= 8467) || c10 == 8469 || ((c10 >= 8472 && c10 <= 8477) || c10 == 8484 || c10 == 8488 || ((c10 >= 8492 && c10 <= 8493) || ((c10 >= 8495 && c10 <= 8504) || (c10 >= 8544 && c10 <= 8575))));
        }
        if (i10 == 48) {
            return c10 >= 12443 && c10 <= 12444;
        }
        if (i10 == 49) {
            return c10 >= 12593 && c10 <= 12686;
        }
        switch (i10) {
            case 249:
            case 250:
            case 251:
            case 252:
            case 253:
            case 254:
            case 255:
                return true;
            default:
                return false;
        }
    }

    public static boolean isChar(int i10) {
        return (i10 >= 32 && i10 <= 55295) || i10 == 10 || i10 == 9 || i10 == 13 || (i10 >= 57344 && i10 <= 65533) || (i10 >= 65536 && i10 <= 1114111);
    }

    public static boolean isLetter(char c10) {
        if (c10 >= 'a' && c10 <= 'z') {
            return true;
        }
        if (c10 == '/') {
            return false;
        }
        if (c10 >= 'A' && c10 <= 'Z') {
            return true;
        }
        int type = Character.getType(c10);
        if (type == 1 || type == 2 || type == 3 || type == 5 || type == 10) {
            return !a(c10) && (c10 < 8413 || c10 > 8416);
        }
        return (c10 >= 699 && c10 <= 705) || c10 == 1369 || c10 == 1765 || c10 == 1766;
    }

    public static boolean isNCNameChar(char c10) {
        return c10 != ':' && isNameChar(c10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0021, code lost:
    
        if (r4 == 903) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0030, code lost:
    
        if (r4 > 8416) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean isNameChar(char r4) {
        /*
            r0 = 97
            r1 = 1
            if (r4 < r0) goto La
            r0 = 122(0x7a, float:1.71E-43)
            if (r4 > r0) goto La
            goto L32
        La:
            r0 = 903(0x387, float:1.265E-42)
            r2 = 62
            if (r4 != r2) goto L11
            goto L33
        L11:
            r3 = 65
            if (r4 < r3) goto L1a
            r3 = 90
            if (r4 > r3) goto L1a
            goto L32
        L1a:
            int r3 = java.lang.Character.getType(r4)
            switch(r3) {
                case 1: goto L24;
                case 2: goto L24;
                case 3: goto L24;
                case 4: goto L24;
                case 5: goto L24;
                case 6: goto L24;
                case 7: goto L24;
                case 8: goto L24;
                case 9: goto L24;
                case 10: goto L24;
                default: goto L21;
            }
        L21:
            if (r4 != r0) goto L33
            goto L32
        L24:
            boolean r3 = a(r4)
            if (r3 != 0) goto L33
            r3 = 8413(0x20dd, float:1.1789E-41)
            if (r4 < r3) goto L32
            r3 = 8416(0x20e0, float:1.1793E-41)
            if (r4 <= r3) goto L33
        L32:
            return r1
        L33:
            r3 = 0
            if (r4 != r2) goto L37
            return r3
        L37:
            r2 = 46
            if (r4 == r2) goto L7f
            r2 = 45
            if (r4 == r2) goto L7f
            r2 = 95
            if (r4 == r2) goto L7f
            r2 = 58
            if (r4 == r2) goto L7f
            r2 = 183(0xb7, float:2.56E-43)
            if (r4 == r2) goto L7f
            r2 = 720(0x2d0, float:1.009E-42)
            if (r4 == r2) goto L7f
            r2 = 721(0x2d1, float:1.01E-42)
            if (r4 == r2) goto L7f
            if (r4 == r0) goto L7f
            r0 = 1600(0x640, float:2.242E-42)
            if (r4 == r0) goto L7f
            r0 = 3654(0xe46, float:5.12E-42)
            if (r4 == r0) goto L7f
            r0 = 3782(0xec6, float:5.3E-42)
            if (r4 == r0) goto L7f
            r0 = 12293(0x3005, float:1.7226E-41)
            if (r4 == r0) goto L7f
            r0 = 12337(0x3031, float:1.7288E-41)
            if (r4 < r0) goto L6d
            r0 = 12341(0x3035, float:1.7293E-41)
            if (r4 <= r0) goto L7f
        L6d:
            r0 = 12445(0x309d, float:1.7439E-41)
            if (r4 < r0) goto L75
            r0 = 12446(0x309e, float:1.744E-41)
            if (r4 <= r0) goto L7f
        L75:
            r0 = 12540(0x30fc, float:1.7572E-41)
            if (r4 < r0) goto L7e
            r0 = 12542(0x30fe, float:1.7575E-41)
            if (r4 > r0) goto L7e
            goto L7f
        L7e:
            return r3
        L7f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bea.xml.stream.reader.XmlChars.isNameChar(char):boolean");
    }

    public static boolean isSpace(char c10) {
        return c10 == ' ' || c10 == '\t' || c10 == '\n' || c10 == '\r';
    }
}
