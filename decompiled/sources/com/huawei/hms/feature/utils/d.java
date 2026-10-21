package com.huawei.hms.feature.utils;

/* JADX INFO: loaded from: classes10.dex */
public class d {
    public static int a(int i10) {
        if (i10 != -2) {
            if (i10 != -1) {
                if (i10 == 0) {
                    return 0;
                }
                if (i10 == 100) {
                    return -2;
                }
                if (i10 == 101) {
                    return -7;
                }
                if (i10 == 200) {
                    return 904;
                }
                switch (i10) {
                    case 2:
                    case 3:
                        return -3;
                    case 4:
                        return -5;
                    case 5:
                        break;
                    case 6:
                        break;
                    case 7:
                        return -4;
                    case 8:
                        return 903;
                    case 9:
                        return -6;
                    case 10:
                        return 10;
                    default:
                        return -100;
                }
            }
            return 901;
        }
        return 902;
    }

    public static int a(int i10, int i11) {
        if (1 != i11) {
            if (2 != i11) {
                return 0;
            }
            if (i10 == 1 || i10 == 2) {
                return 4;
            }
            return i10 != 3 ? 0 : 5;
        }
        switch (i10) {
            case -1:
            case 0:
            case 1:
                return 1;
            case 2:
            case 6:
            case 7:
            case 10:
                return 2;
            case 3:
                return 7;
            case 4:
                return 3;
            case 5:
            case 8:
                return 6;
            case 9:
            default:
                return 0;
        }
    }
}
