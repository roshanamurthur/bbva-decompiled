package com.mastercard.mpsdk.mcbp.mcmlite.cvm;

/* JADX INFO: loaded from: classes10.dex */
public interface CdCvmValidatorInformation {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class UmdValidity {
        private static final /* synthetic */ UmdValidity[] $VALUES;
        public static final UmdValidity ALWAYS;
        public static final UmdValidity CONDITIONAL_TO_CD_CVM;
        public static final UmdValidity NEVER;

        static {
            UmdValidity umdValidity = new UmdValidity("ALWAYS", 0);
            ALWAYS = umdValidity;
            UmdValidity umdValidity2 = new UmdValidity("CONDITIONAL_TO_CD_CVM", 1);
            CONDITIONAL_TO_CD_CVM = umdValidity2;
            UmdValidity umdValidity3 = new UmdValidity("NEVER", 2);
            NEVER = umdValidity3;
            $VALUES = new UmdValidity[]{umdValidity, umdValidity2, umdValidity3};
        }

        public UmdValidity() {
            throw null;
        }

        public static UmdValidity valueOf(String str) {
            return (UmdValidity) Enum.valueOf(UmdValidity.class, str);
        }

        public static UmdValidity[] values() {
            return (UmdValidity[]) $VALUES.clone();
        }
    }

    String getDescription();

    long getLastSuccessfulAuthenticationTimeInMilliseconds();

    UmdValidity getUmdValidity();

    boolean isAuthenticated();

    boolean isOnDeviceCvmEnabled();
}
