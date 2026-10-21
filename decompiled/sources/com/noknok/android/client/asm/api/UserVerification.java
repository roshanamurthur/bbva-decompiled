package com.noknok.android.client.asm.api;

import java.util.EnumSet;
import java.util.Iterator;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'USER_VERIFY_PRESENCE' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes11.dex */
public final class UserVerification {
    public static final UserVerification USER_VERIFY_ALL;
    public static final UserVerification USER_VERIFY_EYEPRINT;
    public static final UserVerification USER_VERIFY_FACEPRINT;
    public static final UserVerification USER_VERIFY_FINGERPRINT;
    public static final UserVerification USER_VERIFY_HANDPRINT;
    public static final UserVerification USER_VERIFY_LOCATION;
    public static final UserVerification USER_VERIFY_NONE;
    public static final UserVerification USER_VERIFY_PASSCODE;
    public static final UserVerification USER_VERIFY_PATTERN;
    public static final UserVerification USER_VERIFY_PRESENCE;
    public static final UserVerification USER_VERIFY_VOICEPRINT;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ UserVerification[] f63115b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Values f63116a;

    public static class Values {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f63117a;

        private Values() {
        }

        public /* synthetic */ Values(int i10) {
            this();
        }
    }

    static {
        int i10 = 0;
        Values values = new Values(i10);
        values.f63117a = 1L;
        UserVerification userVerification = new UserVerification("USER_VERIFY_PRESENCE", 0, values);
        USER_VERIFY_PRESENCE = userVerification;
        Values values2 = new Values(i10);
        values2.f63117a = 2L;
        UserVerification userVerification2 = new UserVerification("USER_VERIFY_FINGERPRINT", 1, values2);
        USER_VERIFY_FINGERPRINT = userVerification2;
        Values values3 = new Values(i10);
        values3.f63117a = 4L;
        UserVerification userVerification3 = new UserVerification("USER_VERIFY_PASSCODE", 2, values3);
        USER_VERIFY_PASSCODE = userVerification3;
        Values values4 = new Values(i10);
        values4.f63117a = 8L;
        UserVerification userVerification4 = new UserVerification("USER_VERIFY_VOICEPRINT", 3, values4);
        USER_VERIFY_VOICEPRINT = userVerification4;
        Values values5 = new Values(i10);
        values5.f63117a = 16L;
        UserVerification userVerification5 = new UserVerification("USER_VERIFY_FACEPRINT", 4, values5);
        USER_VERIFY_FACEPRINT = userVerification5;
        Values values6 = new Values(i10);
        values6.f63117a = 32L;
        UserVerification userVerification6 = new UserVerification("USER_VERIFY_LOCATION", 5, values6);
        USER_VERIFY_LOCATION = userVerification6;
        Values values7 = new Values(i10);
        values7.f63117a = 64L;
        UserVerification userVerification7 = new UserVerification("USER_VERIFY_EYEPRINT", 6, values7);
        USER_VERIFY_EYEPRINT = userVerification7;
        Values values8 = new Values(i10);
        values8.f63117a = 128L;
        UserVerification userVerification8 = new UserVerification("USER_VERIFY_PATTERN", 7, values8);
        USER_VERIFY_PATTERN = userVerification8;
        Values values9 = new Values(i10);
        values9.f63117a = 256L;
        UserVerification userVerification9 = new UserVerification("USER_VERIFY_HANDPRINT", 8, values9);
        USER_VERIFY_HANDPRINT = userVerification9;
        Values values10 = new Values(i10);
        values10.f63117a = 512L;
        UserVerification userVerification10 = new UserVerification("USER_VERIFY_NONE", 9, values10);
        USER_VERIFY_NONE = userVerification10;
        Values values11 = new Values(i10);
        values11.f63117a = 1024L;
        UserVerification userVerification11 = new UserVerification("USER_VERIFY_ALL", 10, values11);
        USER_VERIFY_ALL = userVerification11;
        f63115b = new UserVerification[]{userVerification, userVerification2, userVerification3, userVerification4, userVerification5, userVerification6, userVerification7, userVerification8, userVerification9, userVerification10, userVerification11};
    }

    private UserVerification(String str, int i10, Values values) {
        super(str, i10);
        this.f63116a = values;
    }

    public static UserVerification valueOf(String str) {
        return (UserVerification) Enum.valueOf(UserVerification.class, str);
    }

    public static UserVerification[] values() {
        return (UserVerification[]) f63115b.clone();
    }

    public long getUafValue() {
        return this.f63116a.f63117a;
    }

    public static long getUafValue(EnumSet<UserVerification> enumSet) {
        Iterator<UserVerification> it = enumSet.iterator();
        long uafValue = 0;
        while (it.hasNext()) {
            uafValue |= it.next().getUafValue();
        }
        return uafValue;
    }
}
