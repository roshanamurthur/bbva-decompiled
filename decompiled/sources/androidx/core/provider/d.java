package androidx.core.provider;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.core.content.res.FontResourcesParserCompat;
import com.bbva.ethermobilesdk.sharedstorage.extension.CustomCursor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: FontProvider.java */
/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k2.b f20052a = new k2.b();

    /* JADX INFO: compiled from: FontProvider.java */
    @RequiresApi(16)
    public static class a {
        @DoNotInline
        public static Cursor a(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, Object obj) {
            return contentResolver.query(uri, strArr, str, strArr2, str2, (CancellationSignal) obj);
        }
    }

    @NonNull
    public static FontsContractCompat.FontFamilyResult a(@NonNull Context context, @Nullable CancellationSignal cancellationSignal, @NonNull FontRequest fontRequest) throws PackageManager.NameNotFoundException {
        ProviderInfo providerInfoB = b(context.getPackageManager(), fontRequest, context.getResources());
        Cursor cursorA = null;
        if (providerInfoB == null) {
            return new FontsContractCompat.FontFamilyResult(1, null);
        }
        String str = providerInfoB.authority;
        ArrayList arrayList = new ArrayList();
        Uri uriBuild = new Uri.Builder().scheme("content").authority(str).build();
        Uri uriBuild2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
        try {
            cursorA = a.a(context.getContentResolver(), uriBuild, new String[]{CustomCursor.ID, FontsContractCompat.Columns.FILE_ID, FontsContractCompat.Columns.TTC_INDEX, FontsContractCompat.Columns.VARIATION_SETTINGS, FontsContractCompat.Columns.WEIGHT, FontsContractCompat.Columns.ITALIC, FontsContractCompat.Columns.RESULT_CODE}, "query = ?", new String[]{fontRequest.getQuery()}, null, cancellationSignal);
            if (cursorA != null && cursorA.getCount() > 0) {
                int columnIndex = cursorA.getColumnIndex(FontsContractCompat.Columns.RESULT_CODE);
                arrayList = new ArrayList();
                int columnIndex2 = cursorA.getColumnIndex(CustomCursor.ID);
                int columnIndex3 = cursorA.getColumnIndex(FontsContractCompat.Columns.FILE_ID);
                int columnIndex4 = cursorA.getColumnIndex(FontsContractCompat.Columns.TTC_INDEX);
                int columnIndex5 = cursorA.getColumnIndex(FontsContractCompat.Columns.WEIGHT);
                int columnIndex6 = cursorA.getColumnIndex(FontsContractCompat.Columns.ITALIC);
                while (cursorA.moveToNext()) {
                    int i10 = columnIndex != -1 ? cursorA.getInt(columnIndex) : 0;
                    arrayList.add(new FontsContractCompat.FontInfo(columnIndex3 == -1 ? ContentUris.withAppendedId(uriBuild, cursorA.getLong(columnIndex2)) : ContentUris.withAppendedId(uriBuild2, cursorA.getLong(columnIndex3)), columnIndex4 != -1 ? cursorA.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursorA.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursorA.getInt(columnIndex6) == 1, i10));
                }
            }
            return new FontsContractCompat.FontFamilyResult(0, (FontsContractCompat.FontInfo[]) arrayList.toArray(new FontsContractCompat.FontInfo[0]));
        } finally {
            if (cursorA != null) {
                cursorA.close();
            }
        }
    }

    @Nullable
    @VisibleForTesting
    public static ProviderInfo b(@NonNull PackageManager packageManager, @NonNull FontRequest fontRequest, @Nullable Resources resources) throws PackageManager.NameNotFoundException {
        String providerAuthority = fontRequest.getProviderAuthority();
        ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(providerAuthority, 0);
        if (providerInfoResolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException(androidx.camera.core.processing.f.d("No package found for authority: ", providerAuthority));
        }
        if (!providerInfoResolveContentProvider.packageName.equals(fontRequest.getProviderPackage())) {
            StringBuilder sbD = ci.a.d("Found content provider ", providerAuthority, ", but package was not ");
            sbD.append(fontRequest.getProviderPackage());
            throw new PackageManager.NameNotFoundException(sbD.toString());
        }
        Signature[] signatureArr = packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures;
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        k2.b bVar = f20052a;
        Collections.sort(arrayList, bVar);
        List<List<byte[]>> certificates = fontRequest.getCertificates() != null ? fontRequest.getCertificates() : FontResourcesParserCompat.readCerts(resources, fontRequest.getCertificatesArrayResId());
        for (int i10 = 0; i10 < certificates.size(); i10++) {
            ArrayList arrayList2 = new ArrayList(certificates.get(i10));
            Collections.sort(arrayList2, bVar);
            if (arrayList.size() == arrayList2.size()) {
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    if (Arrays.equals((byte[]) arrayList.get(i11), (byte[]) arrayList2.get(i11))) {
                    }
                }
                return providerInfoResolveContentProvider;
            }
        }
        return null;
    }
}
