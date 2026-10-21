package com.mastercard.mpsdk.mcbp.mcmlite.apdu;

import com.mastercard.mpsdk.mcbp.mcmlite.exceptions.contactlesslogic.commandapdu.InvalidCla;
import com.mastercard.mpsdk.mcbp.mcmlite.exceptions.contactlesslogic.commandapdu.InvalidCommandApdu;
import com.mastercard.mpsdk.mcbp.mcmlite.exceptions.contactlesslogic.commandapdu.InvalidIns;

/* JADX INFO: loaded from: classes10.dex */
public class CommandApdu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f50765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Type f50766b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Type {
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type COMPUTE_CRYPTOGRAPHIC_CHECKSUM;
        public static final Type GENERATE_AC;
        public static final Type GET_PROCESSING_OPTIONS;
        public static final Type READ_RECORD;
        public static final Type SELECT;
        public static final Type UNDEFINED;

        static {
            Type type = new Type("UNDEFINED", 0);
            UNDEFINED = type;
            Type type2 = new Type("SELECT", 1);
            SELECT = type2;
            Type type3 = new Type("GET_PROCESSING_OPTIONS", 2);
            GET_PROCESSING_OPTIONS = type3;
            Type type4 = new Type("READ_RECORD", 3);
            READ_RECORD = type4;
            Type type5 = new Type("GENERATE_AC", 4);
            GENERATE_AC = type5;
            Type type6 = new Type("COMPUTE_CRYPTOGRAPHIC_CHECKSUM", 5);
            COMPUTE_CRYPTOGRAPHIC_CHECKSUM = type6;
            $VALUES = new Type[]{type, type2, type3, type4, type5, type6};
        }

        public Type() {
            throw null;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public CommandApdu() {
        this.f50765a = null;
        this.f50766b = Type.UNDEFINED;
    }

    public static Type determineApduType(byte[] bArr) {
        if (bArr == null || bArr.length < 4) {
            throw new InvalidCommandApdu("Invalid C-APDU");
        }
        byte b10 = bArr[Iso7816.CLA_OFFSET];
        byte b11 = bArr[Iso7816.INS_OFFSET];
        if (b11 == -92) {
            if (b10 == 0) {
                return Type.SELECT;
            }
            throw new InvalidCla("C-APDU - Class not supported");
        }
        if (b11 == -88) {
            if (b10 == -128) {
                return Type.GET_PROCESSING_OPTIONS;
            }
            throw new InvalidCla("C-APDU - Class not supported");
        }
        if (b11 == -82) {
            if (b10 == -128) {
                return Type.GENERATE_AC;
            }
            throw new InvalidCla("C-APDU - Class not supported");
        }
        if (b11 == -78) {
            if (b10 == 0) {
                return Type.READ_RECORD;
            }
            throw new InvalidCla("C-APDU - Class not supported");
        }
        if (b11 != 42) {
            throw new InvalidIns("C-APDU - Instruction Code not supported");
        }
        if (b10 == -128) {
            return Type.COMPUTE_CRYPTOGRAPHIC_CHECKSUM;
        }
        throw new InvalidCla("C-APDU - Class not supported");
    }

    public final byte getCla() {
        return this.f50765a[Iso7816.CLA_OFFSET];
    }

    public final byte getIns() {
        return this.f50765a[Iso7816.INS_OFFSET];
    }

    public final int getLength() {
        return this.f50765a.length;
    }

    public final byte getP1() {
        return this.f50765a[Iso7816.P1_OFFSET];
    }

    public final byte getP2() {
        return this.f50765a[Iso7816.P2_OFFSET];
    }

    public final Type getType() {
        return this.f50766b;
    }

    public CommandApdu(byte[] bArr) {
        this.f50766b = determineApduType(bArr);
        this.f50765a = bArr;
    }
}
