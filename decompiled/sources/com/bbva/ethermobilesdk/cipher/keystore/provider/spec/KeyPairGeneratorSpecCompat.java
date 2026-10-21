package com.bbva.ethermobilesdk.cipher.keystore.provider.spec;

import android.content.Context;
import android.security.KeyPairGeneratorSpec;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateOtpCommand;
import com.bbva.google.pay.GoogleTapAndPay;
import java.math.BigInteger;
import java.security.spec.RSAKeyGenParameterSpec;
import java.util.Calendar;
import javax.security.auth.x500.X500Principal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: KeyPairGeneratorSpecCompat.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¨\u0006\u000e"}, d2 = {"Lcom/bbva/ethermobilesdk/cipher/keystore/provider/spec/KeyPairGeneratorSpecCompat;", "", "", GoogleTapAndPay.KEY_ALIAS, "", "keySize", "Ljava/util/Calendar;", GenerateOtpCommand.VALID_UNTIL, "Landroid/security/KeyPairGeneratorSpec;", "getSpec", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "cipher_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nKeyPairGeneratorSpecCompat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KeyPairGeneratorSpecCompat.kt\ncom/bbva/ethermobilesdk/cipher/keystore/provider/spec/KeyPairGeneratorSpecCompat\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,35:1\n1#2:36\n*E\n"})
public final class KeyPairGeneratorSpecCompat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f29338a;

    public KeyPairGeneratorSpecCompat(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f29338a = context;
    }

    public static /* synthetic */ KeyPairGeneratorSpec getSpec$default(KeyPairGeneratorSpecCompat keyPairGeneratorSpecCompat, String str, int i10, Calendar calendar, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            calendar = null;
        }
        return keyPairGeneratorSpecCompat.getSpec(str, i10, calendar);
    }

    @NotNull
    public final KeyPairGeneratorSpec getSpec(@NotNull String alias, int keySize, @Nullable Calendar validUntil) {
        Intrinsics.checkNotNullParameter(alias, "alias");
        Calendar calendar = Calendar.getInstance();
        if (validUntil == null) {
            validUntil = Calendar.getInstance();
            validUntil.add(1, 10);
        }
        KeyPairGeneratorSpec keyPairGeneratorSpecBuild = new KeyPairGeneratorSpec.Builder(this.f29338a).setAlias(alias).setAlgorithmParameterSpec(new RSAKeyGenParameterSpec(keySize, RSAKeyGenParameterSpec.F4)).setSubject(new X500Principal("CN=com.bbva.ethermobilesdk.cipher.keystore, O=BBVA")).setSerialNumber(BigInteger.ONE).setStartDate(calendar.getTime()).setEndDate(validUntil.getTime()).build();
        Intrinsics.checkNotNullExpressionValue(keyPairGeneratorSpecBuild, "Builder(context)\n       …ime)\n            .build()");
        return keyPairGeneratorSpecBuild;
    }
}
