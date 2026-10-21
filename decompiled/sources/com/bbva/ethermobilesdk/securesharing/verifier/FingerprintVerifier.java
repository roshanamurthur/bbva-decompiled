package com.bbva.ethermobilesdk.securesharing.verifier;

import android.content.Context;
import android.content.pm.Signature;
import androidx.datastore.preferences.protobuf.q;
import com.bbva.ethermobilesdk.cipher.utils.EncodingUtilsKt;
import com.bbva.ethermobilesdk.securesharing.extension.ExceptionKt;
import com.bbva.ethermobilesdk.securesharing.model.Fingerprint;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FingerprintVerifier.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¨\u0006\r"}, d2 = {"Lcom/bbva/ethermobilesdk/securesharing/verifier/FingerprintVerifier;", "", "Landroid/content/Context;", "context", "", "packageName", "", "Lcom/bbva/ethermobilesdk/securesharing/model/Fingerprint;", "fingerprints", "", "verify", "<init>", "()V", "securesharing_release"}, k = 1, mv = {1, 5, 1})
public final class FingerprintVerifier {

    @NotNull
    public static final FingerprintVerifier INSTANCE = new FingerprintVerifier();

    public final void verify(@NotNull Context context, @NotNull String packageName, @NotNull List<Fingerprint> fingerprints) throws Exception {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(fingerprints, "fingerprints");
        if (fingerprints.isEmpty()) {
            throw q.d("The list of valid fingerprints is empty: Did you add the configuration file?", null, 2, null);
        }
        List<Fingerprint> list = fingerprints;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Fingerprint) it.next()).getAlgorithm());
        }
        Set set = CollectionsKt___CollectionsKt.toSet(arrayList);
        try {
            Signature[] signatureArr = context.getPackageManager().getPackageInfo(packageName, 64).signatures;
            if (signatureArr.length != 1) {
                ExceptionKt.throwError$default("The API can not handle multiple application signatures", null, 2, null);
                throw new KotlinNothingValueException();
            }
            Intrinsics.checkNotNullExpressionValue(signatureArr, "packageInfo.signatures");
            byte[] byteArray = ((Signature) ArraysKt___ArraysKt.first(signatureArr)).toByteArray();
            Intrinsics.checkNotNullExpressionValue(byteArray, "packageInfo.signatures.first().toByteArray()");
            Set<String> set2 = set;
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(set2, 10));
            for (String str : set2) {
                INSTANCE.getClass();
                try {
                    byte[] bArrDigest = MessageDigest.getInstance(str).digest(byteArray);
                    Intrinsics.checkNotNullExpressionValue(bArrDigest, "getInstance(algorithm).digest(certificate)");
                    arrayList2.add(new Fingerprint(str, EncodingUtilsKt.toHex$default(bArrDigest, null, 1, null)));
                } catch (Exception e5) {
                    ExceptionKt.throwError("Could not execute hash operation", e5);
                    throw new KotlinNothingValueException();
                }
            }
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it2 = list.iterator();
                while (it2.hasNext()) {
                    if (arrayList2.contains((Fingerprint) it2.next())) {
                        return;
                    }
                }
            }
            throw q.d("The application does not have permission to share data", null, 2, null);
        } catch (Exception e7) {
            ExceptionKt.throwError("Could not get the application info or its signature", e7);
            throw new KotlinNothingValueException();
        }
    }
}
