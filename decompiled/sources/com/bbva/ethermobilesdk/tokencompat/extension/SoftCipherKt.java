package com.bbva.ethermobilesdk.tokencompat.extension;

import com.bbva.ethermobilesdk.cipher.softcipher.SoftCipher;
import com.bbva.ethermobilesdk.tokencompat.TokenCompatError;
import com.vasco.digipass.sdk.utils.utilities.UtilitiesSDKConstants;
import com.vierge.pinpadsdk.message.base.MessageUtils;
import java.util.ArrayList;
import java.util.Iterator;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.random.Random;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SoftCipher.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\u001a$\u0010\u0006\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000\u001a\u0018\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0000\u001a$\u0010\f\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000¨\u0006\r"}, d2 = {"Lcom/bbva/ethermobilesdk/cipher/softcipher/SoftCipher;", "", "seed", "", "pin", "deviceInfo", "encryptTokenSeed", "", "seedSize", "blockSize", "ensureCapacity", "encryptedSeed", "decryptTokenSeed", "ethertoken-compat_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSoftCipher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SoftCipher.kt\ncom/bbva/ethermobilesdk/tokencompat/extension/SoftCipherKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,75:1\n11065#2:76\n11400#2,3:77\n11065#2:82\n11400#2,3:83\n1855#3,2:80\n1855#3,2:86\n*S KotlinDebug\n*F\n+ 1 SoftCipher.kt\ncom/bbva/ethermobilesdk/tokencompat/extension/SoftCipherKt\n*L\n43#1:76\n43#1:77,3\n67#1:82\n67#1:83,3\n46#1:80,2\n70#1:86,2\n*E\n"})
public final class SoftCipherKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final byte[] f30473a = {-77, MessageUtils.MESSAGE_26_SUB, -124, -115, -27, 20, -18, -24, 50, -112, -90, -76, -50, -119, UtilitiesSDKConstants.SRP_LABEL_MAC, -43};

    /* JADX INFO: compiled from: SoftCipher.kt */
    public static final class a extends Lambda implements Function1<Integer, Byte> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f30474p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Byte invoke(Integer num) {
            num.intValue();
            return Byte.valueOf(RandomExtensionKt.nextByte(Random.INSTANCE));
        }
    }

    @NotNull
    public static final byte[] decryptTokenSeed(@NotNull SoftCipher softCipher, @NotNull byte[] encryptedSeed, @NotNull String pin, @NotNull String deviceInfo) throws TokenCompatError.IllegalState {
        Intrinsics.checkNotNullParameter(softCipher, "<this>");
        Intrinsics.checkNotNullParameter(encryptedSeed, "encryptedSeed");
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        String[] strArr = {deviceInfo, pin};
        ArrayList arrayList = new ArrayList(2);
        for (int i10 = 0; i10 < 2; i10++) {
            byte[] bytes = strArr[i10].getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            arrayList.add(new SecretKeySpec(ByteArrayKt.resized$default(bytes, 16, null, 2, null), "AES"));
        }
        Iterator it = arrayList.iterator();
        Object objValueOrThrow = encryptedSeed;
        while (it.hasNext()) {
            objValueOrThrow = CipherKt.valueOrThrow(softCipher.decrypt((byte[]) objValueOrThrow, (SecretKeySpec) it.next(), "AES/CBC/NoPadding", f30473a));
        }
        return (byte[]) objValueOrThrow;
    }

    @NotNull
    public static final byte[] encryptTokenSeed(@NotNull SoftCipher softCipher, @NotNull byte[] seed, @NotNull String pin, @NotNull String deviceInfo) throws TokenCompatError.IllegalState {
        Intrinsics.checkNotNullParameter(softCipher, "<this>");
        Intrinsics.checkNotNullParameter(seed, "seed");
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        Object objResized = ByteArrayKt.resized(seed, ensureCapacity(seed.length, 16), a.f30474p0);
        String[] strArr = {pin, deviceInfo};
        ArrayList arrayList = new ArrayList(2);
        for (int i10 = 0; i10 < 2; i10++) {
            byte[] bytes = strArr[i10].getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            arrayList.add(new SecretKeySpec(ByteArrayKt.resized$default(bytes, 16, null, 2, null), "AES"));
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            objResized = CipherKt.valueOrThrow(softCipher.encrypt((byte[]) objResized, (SecretKeySpec) it.next(), "AES/CBC/NoPadding", f30473a));
        }
        return (byte[]) objResized;
    }

    public static final int ensureCapacity(int i10, int i11) {
        int i12 = i10 / i11;
        return i10 % i11 == 0 ? i11 * i12 : i11 * (i12 + 1);
    }
}
