package com.bbva.ethermobilesdk.cipher.keystore.provider.spec;

import android.security.keystore.KeyGenParameterSpec;
import androidx.annotation.RequiresApi;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateOtpCommand;
import com.bbva.google.pay.GoogleTapAndPay;
import java.math.BigInteger;
import java.util.Calendar;
import javax.security.auth.x500.X500Principal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AESKeyGeneratorSpec.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006J$\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\r"}, d2 = {"Lcom/bbva/ethermobilesdk/cipher/keystore/provider/spec/AESKeyGeneratorSpec;", "", "", GoogleTapAndPay.KEY_ALIAS, "", "keySize", "Ljava/util/Calendar;", GenerateOtpCommand.VALID_UNTIL, "Landroid/security/keystore/KeyGenParameterSpec;", "getSpec", "getSpecInvalidated", "<init>", "()V", "cipher_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAESKeyGeneratorSpec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AESKeyGeneratorSpec.kt\ncom/bbva/ethermobilesdk/cipher/keystore/provider/spec/AESKeyGeneratorSpec\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,54:1\n1#2:55\n*E\n"})
public final class AESKeyGeneratorSpec {
    public static KeyGenParameterSpec.Builder a(String str, int i10, Calendar calendar) {
        if (calendar == null) {
            calendar = Calendar.getInstance();
            calendar.add(1, 10);
        }
        KeyGenParameterSpec.Builder keyValidityEnd = new KeyGenParameterSpec.Builder(str, 3).setKeySize(i10).setBlockModes("CBC").setEncryptionPaddings("PKCS7Padding").setCertificateSubject(new X500Principal("CN=com.bbva.ethermobilesdk.cipher.keystore, O=BBVA")).setCertificateSerialNumber(BigInteger.ONE).setKeyValidityEnd(calendar.getTime());
        Intrinsics.checkNotNullExpressionValue(keyValidityEnd, "Builder(alias, purposes)…ValidityEnd(expires.time)");
        return keyValidityEnd;
    }

    public static /* synthetic */ KeyGenParameterSpec getSpec$default(AESKeyGeneratorSpec aESKeyGeneratorSpec, String str, int i10, Calendar calendar, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            calendar = null;
        }
        return aESKeyGeneratorSpec.getSpec(str, i10, calendar);
    }

    public static /* synthetic */ KeyGenParameterSpec getSpecInvalidated$default(AESKeyGeneratorSpec aESKeyGeneratorSpec, String str, int i10, Calendar calendar, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            calendar = null;
        }
        return aESKeyGeneratorSpec.getSpecInvalidated(str, i10, calendar);
    }

    @NotNull
    public final KeyGenParameterSpec getSpec(@NotNull String alias, int keySize, @Nullable Calendar validUntil) {
        Intrinsics.checkNotNullParameter(alias, "alias");
        KeyGenParameterSpec keyGenParameterSpecBuild = a(alias, keySize, validUntil).build();
        Intrinsics.checkNotNullExpressionValue(keyGenParameterSpecBuild, "getDefaultSpec(alias, keySize, validUntil).build()");
        return keyGenParameterSpecBuild;
    }

    @RequiresApi(24)
    @NotNull
    public final KeyGenParameterSpec getSpecInvalidated(@NotNull String alias, int keySize, @Nullable Calendar validUntil) {
        Intrinsics.checkNotNullParameter(alias, "alias");
        KeyGenParameterSpec keyGenParameterSpecBuild = a(alias, keySize, validUntil).setUserAuthenticationRequired(true).setInvalidatedByBiometricEnrollment(true).build();
        Intrinsics.checkNotNullExpressionValue(keyGenParameterSpecBuild, "getDefaultSpec(alias, ke…rue)\n            .build()");
        return keyGenParameterSpecBuild;
    }
}
