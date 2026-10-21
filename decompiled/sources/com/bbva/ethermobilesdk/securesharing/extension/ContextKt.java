package com.bbva.ethermobilesdk.securesharing.extension;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.database.Cursor;
import android.os.Bundle;
import android.os.Process;
import androidx.camera.core.impl.utils.c;
import com.bbva.ethermobile.help.kit.result.ResultKt;
import com.bbva.ethermobilesdk.cipher.factory.HashFactoryKt;
import com.bbva.ethermobilesdk.cipher.utils.EncodingUtilsKt;
import com.bbva.ethermobilesdk.securesharing.config.Configuration;
import com.bbva.ethermobilesdk.securesharing.config.SecurityLevel;
import com.bbva.ethermobilesdk.securesharing.database.InfoTable;
import com.bbva.ethermobilesdk.securesharing.model.Fingerprint;
import com.bbva.ethermobilesdk.securesharing.model.ProviderStatus;
import com.bbva.ethermobilesdk.securesharing.provider.ProviderManager;
import com.bbva.ethermobilesdk.securesharing.verifier.FingerprintVerifier;
import com.bbva.ethermobilesdk.securesharing.verifier.SignatureVerifier;
import com.bbva.sl.ar.android.storage.pss.provider.SharedProvider;
import java.security.ProviderException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.l;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Context.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0000\u001a\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0000\u001a\u0016\u0010\u0005\u001a\u00020\u0006*\u00020\u00022\b\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\u0000\u001a\u001e\u0010\u0007\u001a\u0004\u0018\u00010\b*\u00020\u00022\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\u0000\u001a\u00020\u0001H\u0000\u001a\u001a\u0010\n\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0000\u001a\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\r*\u00020\u00022\u0006\u0010\u0000\u001a\u00020\u0001H\u0000\u001a\u0016\u0010\u000e\u001a\u00020\u000f*\u0004\u0018\u00010\u00022\u0006\u0010\u0000\u001a\u00020\u0001H\u0000\u001a\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\r*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0001H\u0000\u001a\u0014\u0010\u0013\u001a\u00020\u0014*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0001H\u0000\u001a\"\u0010\u0016\u001a\u00020\u0017*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\rH\u0000\u001a \u0010\u001b\u001a\u00020\u0006*\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u00012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u0000\u001a\u0014\u0010\u001d\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0000\u001a\u00020\u0001H\u0000¨\u0006\u001e"}, d2 = {"authority", "", "Landroid/content/Context;", "authorityFromPackageName", "callingPackage", "exists", "", "gerProviderFromAuthority", "Lcom/bbva/ethermobilesdk/securesharing/model/ProviderInfo;", "destinationAuthority", "hashedSignature", "appPackageName", "partnerProviders", "", "providerStatus", "Lcom/bbva/ethermobilesdk/securesharing/model/ProviderStatus;", "providers", "Landroid/content/pm/ProviderInfo;", "excludedAuthority", "readMetadata", "Landroid/os/Bundle;", InfoTable.AUTHORITY, "verifyApp", "", "packageName", "fingerprints", "Lcom/bbva/ethermobilesdk/securesharing/model/Fingerprint;", "verifyAppSignature", "signature", "verifyAuthority", "securesharing_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class ContextKt {

    /* JADX INFO: compiled from: Context.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SecurityLevel.values().length];
            iArr[SecurityLevel.Signature.ordinal()] = 1;
            iArr[SecurityLevel.Fingerprint.ordinal()] = 2;
            iArr[SecurityLevel.SignatureFingerprint.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Nullable
    public static final String authority(@NotNull Context context) {
        Object next;
        Intrinsics.checkNotNullParameter(context, "<this>");
        List<ProviderInfo> listQueryContentProviders = context.getPackageManager().queryContentProviders(context.getPackageName(), Process.myUid(), 0);
        Intrinsics.checkNotNullExpressionValue(listQueryContentProviders, "packageManager.queryContentProviders(\n        packageName,\n        android.os.Process.myUid(), 0\n    )");
        Iterator<T> it = listQueryContentProviders.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(SharedProvider.class.getCanonicalName(), ((ProviderInfo) next).name));
        ProviderInfo providerInfo = (ProviderInfo) next;
        if (providerInfo == null) {
            return null;
        }
        return providerInfo.authority;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0035  */
    /* JADX WARN: Code duplicated, block: B:12:0x0036 A[Catch: Exception -> 0x0039, TRY_LEAVE, TryCatch #0 {Exception -> 0x0039, blocks: (B:3:0x0006, B:5:0x001e, B:12:0x0036, B:8:0x002f), top: B:16:0x0006 }] */
    @Nullable
    public static final String authorityFromPackageName(@NotNull Context context, @Nullable String str) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        try {
            PackageManager packageManager = context.getPackageManager();
            Intrinsics.checkNotNull(str);
            ProviderInfo[] providerInfoArr = packageManager.getPackageInfo(str, 8).providers;
            Intrinsics.checkNotNullExpressionValue(providerInfoArr, "packageInfo.providers");
            for (ProviderInfo providerInfo : providerInfoArr) {
                if (Intrinsics.areEqual(providerInfo.name, SharedProvider.class.getCanonicalName())) {
                    if (providerInfo == null) {
                        return null;
                    }
                    return providerInfo.authority;
                }
            }
            providerInfo = null;
            if (providerInfo == null) {
                return null;
            }
            return providerInfo.authority;
        } catch (Exception unused) {
            LoggerKt.log(Intrinsics.stringPlus("Can not find package name: ", context.getPackageName()));
            return null;
        }
    }

    public static final boolean exists(@NotNull Context context, @Nullable String str) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return (str == null || context.getPackageManager().resolveContentProvider(str, 0) == null) ? false : true;
    }

    @Nullable
    public static final com.bbva.ethermobilesdk.securesharing.model.ProviderInfo gerProviderFromAuthority(@NotNull Context context, @NotNull String destinationAuthority, @NotNull String authority) throws Exception {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(destinationAuthority, "destinationAuthority");
        Intrinsics.checkNotNullParameter(authority, "authority");
        try {
            Cursor cursorQuery = context.getContentResolver().query(UriKt.contentUri(destinationAuthority, InfoTable.PATH), null, "providerName=?", new String[]{authority}, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.getCount() != 0 && cursorQuery.moveToFirst()) {
                        com.bbva.ethermobilesdk.securesharing.model.ProviderInfo providerInfo = CursorKt.toProviderInfo(cursorQuery);
                        CloseableKt.closeFinally(cursorQuery, null);
                        return providerInfo;
                    }
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        CloseableKt.closeFinally(cursorQuery, th2);
                        throw th3;
                    }
                }
            }
            CloseableKt.closeFinally(cursorQuery, null);
            return null;
        } catch (ProviderException e5) {
            String message = e5.getMessage();
            if (message == null) {
                message = c.a("Error parsing Provider Info entry with authority: ", authority, ", destination: ", destinationAuthority);
            }
            ExceptionKt.throwError(message, e5);
            throw new KotlinNothingValueException();
        }
    }

    @Nullable
    public static final String hashedSignature(@NotNull Context context, @Nullable String str) {
        Signature[] signatureArr;
        Intrinsics.checkNotNullParameter(context, "<this>");
        try {
            PackageManager packageManager = context.getPackageManager();
            if (str == null) {
                str = context.getPackageName();
            }
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 64);
            if (packageInfo != null && (signatureArr = packageInfo.signatures) != null && signatureArr.length == 1) {
                Intrinsics.checkNotNullExpressionValue(signatureArr, "packageInfo.signatures");
                String signature = ((Signature) ArraysKt___ArraysKt.first(signatureArr)).toCharsString();
                Intrinsics.checkNotNullExpressionValue(signature, "signature");
                return EncodingUtilsKt.toHex$default((byte[]) ResultKt.getOrThrow(HashFactoryKt.sha256Of(signature)), null, 1, null);
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public static /* synthetic */ String hashedSignature$default(Context context, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        return hashedSignature(context, str);
    }

    @NotNull
    public static final List<com.bbva.ethermobilesdk.securesharing.model.ProviderInfo> partnerProviders(@NotNull Context context, @NotNull String authority) {
        Object objM5535constructorimpl;
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(authority, "authority");
        List<ProviderInfo> listProviders = providers(context, authority);
        ArrayList<ProviderInfo> arrayList = new ArrayList();
        for (Object obj : listProviders) {
            String str = ((ProviderInfo) obj).authority;
            Intrinsics.checkNotNullExpressionValue(str, "it.authority");
            if (verifyAuthority(context, str)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (ProviderInfo providerInfo : arrayList) {
            try {
                Result.Companion companion = Result.INSTANCE;
                String str2 = providerInfo.authority;
                Intrinsics.checkNotNullExpressionValue(str2, "it.authority");
                String str3 = providerInfo.authority;
                Intrinsics.checkNotNullExpressionValue(str3, "it.authority");
                objM5535constructorimpl = Result.m5535constructorimpl(gerProviderFromAuthority(context, str2, str3));
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM5535constructorimpl = Result.m5535constructorimpl(kotlin.ResultKt.createFailure(th2));
            }
            if (Result.m5540isFailureimpl(objM5535constructorimpl)) {
                objM5535constructorimpl = null;
            }
            com.bbva.ethermobilesdk.securesharing.model.ProviderInfo providerInfo2 = (com.bbva.ethermobilesdk.securesharing.model.ProviderInfo) objM5535constructorimpl;
            if (providerInfo2 != null) {
                arrayList2.add(providerInfo2);
            }
        }
        return arrayList2;
    }

    @NotNull
    public static final ProviderStatus providerStatus(@Nullable Context context, @NotNull String authority) {
        Intrinsics.checkNotNullParameter(authority, "authority");
        if (context == null || !exists(context, authority)) {
            return ProviderStatus.UNINSTALLED;
        }
        try {
            verifyAuthority(context, authority);
            return gerProviderFromAuthority(context, authority, authority) == null ? ProviderStatus.DISABLED : ProviderStatus.OK;
        } catch (Exception unused) {
            LoggerKt.log("Access blocked: Perform read to unsafe Provider [" + authority + AbstractJsonLexerKt.END_LIST);
            return ProviderStatus.UNSAFE;
        }
    }

    @NotNull
    public static final List<ProviderInfo> providers(@NotNull Context context, @NotNull String excludedAuthority) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(excludedAuthority, "excludedAuthority");
        List<ProviderInfo> list = ProviderManager.INSTANCE.get(context);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (Intrinsics.areEqual(((ProviderInfo) obj).name, SharedProvider.class.getCanonicalName())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (!Intrinsics.areEqual(((ProviderInfo) obj2).authority, excludedAuthority)) {
                arrayList2.add(obj2);
            }
        }
        return arrayList2;
    }

    @NotNull
    public static final Bundle readMetadata(@NotNull Context context, @NotNull String providerName) throws Exception {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(providerName, "providerName");
        try {
            ComponentName componentName = new ComponentName(context.getPackageName(), providerName);
            Bundle bundle = context.getPackageManager().getProviderInfo(componentName, 128).metaData;
            if (bundle != null) {
                return bundle;
            }
            ExceptionKt.throwError$default(Intrinsics.stringPlus("No metadata associated with provider: ", componentName.getClassName()), null, 2, null);
            throw new KotlinNothingValueException();
        } catch (Exception e5) {
            ExceptionKt.throwError("Could not find defined provider", e5);
            throw new KotlinNothingValueException();
        }
    }

    public static final void verifyApp(@NotNull Context context, @NotNull String packageName, @NotNull List<Fingerprint> fingerprints) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(fingerprints, "fingerprints");
        int i10 = WhenMappings.$EnumSwitchMapping$0[Configuration.INSTANCE.getSecurityLevel().ordinal()];
        if (i10 == 1) {
            SignatureVerifier.INSTANCE.verify(context, packageName);
            return;
        }
        if (i10 == 2) {
            FingerprintVerifier.INSTANCE.verify(context, packageName, fingerprints);
        } else {
            if (i10 != 3) {
                return;
            }
            SignatureVerifier.INSTANCE.verify(context, packageName);
            FingerprintVerifier.INSTANCE.verify(context, packageName, fingerprints);
        }
    }

    public static final boolean verifyAppSignature(@NotNull Context context, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        if (str2 == null) {
            return false;
        }
        return Intrinsics.areEqual(l.replace$default(str2, " ", "", false, 4, (Object) null), hashedSignature(context, str));
    }

    public static final boolean verifyAuthority(@NotNull Context context, @NotNull String authority) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(authority, "authority");
        try {
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider(authority, 0);
            if (providerInfoResolveContentProvider == null) {
                return false;
            }
            String str = providerInfoResolveContentProvider.packageName;
            Intrinsics.checkNotNullExpressionValue(str, "provider.packageName");
            verifyApp(context, str, Configuration.INSTANCE.getSharedConfiguration().getFingerprints());
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
