package com.noknok.android.client.appsdk;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public enum ProtocolType {
    UAF("uaf"),
    FIDO2("web"),
    BOTH("both"),
    NEITHER("");

    private final String mProtocolName;

    /* JADX INFO: renamed from: com.noknok.android.client.appsdk.ProtocolType$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f62871a;

        static {
            int[] iArr = new int[ProtocolType.values().length];
            f62871a = iArr;
            try {
                iArr[ProtocolType.UAF.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f62871a[ProtocolType.FIDO2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f62871a[ProtocolType.BOTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f62871a[ProtocolType.NEITHER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static class Exception extends java.lang.Exception {
    }

    ProtocolType(String str) {
        this.mProtocolName = str;
    }

    public static ProtocolType getByName(String str) {
        if (str == null || str.contains(UAF.mProtocolName)) {
            return UAF;
        }
        ProtocolType protocolType = FIDO2;
        if (str.contains(protocolType.mProtocolName)) {
            return protocolType;
        }
        ProtocolType protocolType2 = BOTH;
        if (str.contains(protocolType2.mProtocolName)) {
            return protocolType2;
        }
        ProtocolType protocolType3 = NEITHER;
        if (str.contains(protocolType3.mProtocolName)) {
            return protocolType3;
        }
        return null;
    }

    public List<ProtocolType> getList() {
        ArrayList arrayList = new ArrayList();
        int i10 = AnonymousClass1.f62871a[ordinal()];
        if (i10 == 1) {
            arrayList.add(UAF);
        } else if (i10 == 2) {
            arrayList.add(FIDO2);
        } else if (i10 == 3) {
            arrayList.add(UAF);
            arrayList.add(FIDO2);
        } else if (i10 == 4) {
            arrayList.add(NEITHER);
        }
        return arrayList;
    }

    public String protocolName() {
        return this.mProtocolName;
    }
}
