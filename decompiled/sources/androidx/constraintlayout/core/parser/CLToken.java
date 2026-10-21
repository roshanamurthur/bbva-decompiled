package androidx.constraintlayout.core.parser;

import com.dasnano.vdvideoselfiecapture.config.VDVideoSelfieConfiguration;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
public class CLToken extends CLElement {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f18975r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public a f18976s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final char[] f18977t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final char[] f18978u0;
    public final char[] v0;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ a[] $VALUES;
        public static final a FALSE;
        public static final a NULL;
        public static final a TRUE;
        public static final a UNKNOWN;

        static {
            a aVar = new a("UNKNOWN", 0);
            UNKNOWN = aVar;
            a aVar2 = new a("TRUE", 1);
            TRUE = aVar2;
            a aVar3 = new a("FALSE", 2);
            FALSE = aVar3;
            a aVar4 = new a(VDVideoSelfieConfiguration.NULL, 3);
            NULL = aVar4;
            $VALUES = new a[]{aVar, aVar2, aVar3, aVar4};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    public CLToken(char[] cArr) {
        super(cArr);
        this.f18975r0 = 0;
        this.f18976s0 = a.UNKNOWN;
        this.f18977t0 = "true".toCharArray();
        this.f18978u0 = "false".toCharArray();
        this.v0 = AbstractJsonLexerKt.NULL.toCharArray();
    }

    public static CLElement allocate(char[] cArr) {
        return new CLToken(cArr);
    }

    public boolean getBoolean() throws CLParsingException {
        a aVar = this.f18976s0;
        if (aVar == a.TRUE) {
            return true;
        }
        if (aVar == a.FALSE) {
            return false;
        }
        throw new CLParsingException("this token is not a boolean: <" + content() + ">", this);
    }

    public a getType() {
        return this.f18976s0;
    }

    public boolean isNull() throws CLParsingException {
        if (this.f18976s0 == a.NULL) {
            return true;
        }
        throw new CLParsingException("this token is not a null: <" + content() + ">", this);
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public String toFormattedJSON(int i10, int i11) {
        StringBuilder sb2 = new StringBuilder();
        addIndent(sb2, i10);
        sb2.append(content());
        return sb2.toString();
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public String toJSON() {
        return content();
    }

    public boolean validate(char c10, long j10) {
        int iOrdinal = this.f18976s0.ordinal();
        char[] cArr = this.f18977t0;
        char[] cArr2 = this.f18978u0;
        char[] cArr3 = this.v0;
        boolean z10 = false;
        if (iOrdinal == 0) {
            int i10 = this.f18975r0;
            if (cArr[i10] == c10) {
                this.f18976s0 = a.TRUE;
            } else if (cArr2[i10] == c10) {
                this.f18976s0 = a.FALSE;
            } else if (cArr3[i10] == c10) {
                this.f18976s0 = a.NULL;
            }
            z10 = true;
        } else if (iOrdinal == 1) {
            int i11 = this.f18975r0;
            z10 = cArr[i11] == c10;
            if (z10 && i11 + 1 == cArr.length) {
                setEnd(j10);
            }
        } else if (iOrdinal == 2) {
            int i12 = this.f18975r0;
            z10 = cArr2[i12] == c10;
            if (z10 && i12 + 1 == cArr2.length) {
                setEnd(j10);
            }
        } else if (iOrdinal == 3) {
            int i13 = this.f18975r0;
            z10 = cArr3[i13] == c10;
            if (z10 && i13 + 1 == cArr3.length) {
                setEnd(j10);
            }
        }
        this.f18975r0++;
        return z10;
    }
}
