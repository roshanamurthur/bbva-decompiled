package kotlinx.serialization.json.internal;

import com.bbva.ethermobilesdk.tokencompat.storage.local.SharedPrefsStorage;
import com.bbva.nativesettings.common.Constants;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.UShort;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Composers.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0005\n\u0002\u0010\b\n\u0002\u0010\t\n\u0002\u0010\n\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u000bH\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\fH\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\rH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lkotlinx/serialization/json/internal/ComposerForUnsignedNumbers;", "Lkotlinx/serialization/json/internal/Composer;", "writer", "Lkotlinx/serialization/json/internal/InternalJsonWriter;", "forceQuoting", "", "(Lkotlinx/serialization/json/internal/InternalJsonWriter;Z)V", Constants.PRINT, "", SharedPrefsStorage.VERSION_KEY, "", "", "", "", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressAnimalSniffer
public final class ComposerForUnsignedNumbers extends Composer {
    private final boolean forceQuoting;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposerForUnsignedNumbers(@NotNull InternalJsonWriter writer, boolean z10) {
        super(writer);
        Intrinsics.checkNotNullParameter(writer, "writer");
        this.forceQuoting = z10;
    }

    @Override // kotlinx.serialization.json.internal.Composer
    public void print(int v3) {
        boolean z10 = this.forceQuoting;
        String string = Long.toString(4294967295L & ((long) UInt.m5570constructorimpl(v3)), 10);
        if (z10) {
            printQuoted(string);
        } else {
            print(string);
        }
    }

    @Override // kotlinx.serialization.json.internal.Composer
    public void print(long v3) {
        boolean z10 = this.forceQuoting;
        int i10 = 63;
        String str = "0";
        long jM5595constructorimpl = ULong.m5595constructorimpl(v3);
        if (z10) {
            if (jM5595constructorimpl != 0) {
                if (jM5595constructorimpl > 0) {
                    str = Long.toString(jM5595constructorimpl, 10);
                } else {
                    char[] cArr = new char[64];
                    long j10 = (jM5595constructorimpl >>> 1) / ((long) 5);
                    long j11 = 10;
                    cArr[63] = Character.forDigit((int) (jM5595constructorimpl - (j10 * j11)), 10);
                    while (j10 > 0) {
                        i10--;
                        cArr[i10] = Character.forDigit((int) (j10 % j11), 10);
                        j10 /= j11;
                    }
                    str = new String(cArr, i10, 64 - i10);
                }
            }
            printQuoted(str);
            return;
        }
        if (jM5595constructorimpl != 0) {
            if (jM5595constructorimpl > 0) {
                str = Long.toString(jM5595constructorimpl, 10);
            } else {
                char[] cArr2 = new char[64];
                long j12 = (jM5595constructorimpl >>> 1) / ((long) 5);
                long j13 = 10;
                cArr2[63] = Character.forDigit((int) (jM5595constructorimpl - (j12 * j13)), 10);
                while (j12 > 0) {
                    i10--;
                    cArr2[i10] = Character.forDigit((int) (j12 % j13), 10);
                    j12 /= j13;
                }
                str = new String(cArr2, i10, 64 - i10);
            }
        }
        print(str);
    }

    @Override // kotlinx.serialization.json.internal.Composer
    public void print(byte v3) {
        boolean z10 = this.forceQuoting;
        String strM5549toStringimpl = UByte.m5549toStringimpl(UByte.m5545constructorimpl(v3));
        if (z10) {
            printQuoted(strM5549toStringimpl);
        } else {
            print(strM5549toStringimpl);
        }
    }

    @Override // kotlinx.serialization.json.internal.Composer
    public void print(short v3) {
        boolean z10 = this.forceQuoting;
        String strM5624toStringimpl = UShort.m5624toStringimpl(UShort.m5620constructorimpl(v3));
        if (z10) {
            printQuoted(strM5624toStringimpl);
        } else {
            print(strM5624toStringimpl);
        }
    }
}
