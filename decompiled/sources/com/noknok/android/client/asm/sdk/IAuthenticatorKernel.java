package com.noknok.android.client.asm.sdk;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public interface IAuthenticatorKernel {

    public enum AKDataKeys {
        AAID,
        APPID,
        MATCHER_IN_PARAMS,
        DESCRIPTOR,
        KSATTESTATIONCHALLENGE,
        KSATTESTATIONX509,
        AUTH_VALIDITY_DURATION,
        AUTH_FP_SILENTLY
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'ATTACHMENT_HINT_INTERNAL' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class AttachmentHint {
        private static final /* synthetic */ AttachmentHint[] $VALUES;
        public static final AttachmentHint ATTACHMENT_HINT_BLUETOOTH;
        public static final AttachmentHint ATTACHMENT_HINT_EXTERNAL;
        public static final AttachmentHint ATTACHMENT_HINT_INTERNAL;
        public static final AttachmentHint ATTACHMENT_HINT_NETWORK;
        public static final AttachmentHint ATTACHMENT_HINT_NFC;
        public static final AttachmentHint ATTACHMENT_HINT_READY;
        public static final AttachmentHint ATTACHMENT_HINT_WIRED;
        public static final AttachmentHint ATTACHMENT_HINT_WIRELESS;
        private final Values mValues;

        public static class Values {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private long f63298a;

            private Values() {
            }

            public /* synthetic */ Values(int i10) {
                this();
            }
        }

        private static /* synthetic */ AttachmentHint[] $values() {
            return new AttachmentHint[]{ATTACHMENT_HINT_INTERNAL, ATTACHMENT_HINT_EXTERNAL, ATTACHMENT_HINT_WIRED, ATTACHMENT_HINT_WIRELESS, ATTACHMENT_HINT_NFC, ATTACHMENT_HINT_BLUETOOTH, ATTACHMENT_HINT_NETWORK, ATTACHMENT_HINT_READY};
        }

        static {
            int i10 = 0;
            Values values = new Values(i10);
            values.f63298a = 1L;
            ATTACHMENT_HINT_INTERNAL = new AttachmentHint("ATTACHMENT_HINT_INTERNAL", 0, values);
            Values values2 = new Values(i10);
            values2.f63298a = 2L;
            ATTACHMENT_HINT_EXTERNAL = new AttachmentHint("ATTACHMENT_HINT_EXTERNAL", 1, values2);
            Values values3 = new Values(i10);
            values3.f63298a = 4L;
            ATTACHMENT_HINT_WIRED = new AttachmentHint("ATTACHMENT_HINT_WIRED", 2, values3);
            Values values4 = new Values(i10);
            values4.f63298a = 8L;
            ATTACHMENT_HINT_WIRELESS = new AttachmentHint("ATTACHMENT_HINT_WIRELESS", 3, values4);
            Values values5 = new Values(i10);
            values5.f63298a = 16L;
            ATTACHMENT_HINT_NFC = new AttachmentHint("ATTACHMENT_HINT_NFC", 4, values5);
            Values values6 = new Values(i10);
            values6.f63298a = 32L;
            ATTACHMENT_HINT_BLUETOOTH = new AttachmentHint("ATTACHMENT_HINT_BLUETOOTH", 5, values6);
            Values values7 = new Values(i10);
            values7.f63298a = 64L;
            ATTACHMENT_HINT_NETWORK = new AttachmentHint("ATTACHMENT_HINT_NETWORK", 6, values7);
            Values values8 = new Values(i10);
            values8.f63298a = 128L;
            ATTACHMENT_HINT_READY = new AttachmentHint("ATTACHMENT_HINT_READY", 7, values8);
            $VALUES = $values();
        }

        private AttachmentHint(String str, int i10, Values values) {
            super(str, i10);
            this.mValues = values;
        }

        public static AttachmentHint valueOf(String str) {
            return (AttachmentHint) Enum.valueOf(AttachmentHint.class, str);
        }

        public static AttachmentHint[] values() {
            return (AttachmentHint[]) $VALUES.clone();
        }

        public long getUafValue() {
            return this.mValues.f63298a;
        }

        public static long getUafValue(EnumSet<AttachmentHint> enumSet) {
            Iterator<AttachmentHint> it = enumSet.iterator();
            long uafValue = 0;
            while (it.hasNext()) {
                uafValue |= it.next().getUafValue();
            }
            return uafValue;
        }
    }

    EnumSet<AttachmentHint> getAttachmentHint();

    IAKDigestMethod getDigestMethod();

    boolean postProcess();

    byte[] processRequest(byte[] bArr, Map<AKDataKeys, Object> map) throws AuthenticatorException;

    boolean requiresKeyHandleForDereg();
}
