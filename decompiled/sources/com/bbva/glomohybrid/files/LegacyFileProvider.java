package com.bbva.glomohybrid.files;

import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.CancellationSignal;
import androidx.core.content.FileProvider;
import com.bbva.glomohybrid.files.strategy.ComposedStrategy;
import com.google.android.gms.actions.SearchIntents;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LegacyFileProvider.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016JY\u0010\u0013\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\b2\u0010\u0010\f\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u000b\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0010\u0010\u000e\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u000b\u0018\u00010\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/bbva/glomohybrid/files/LegacyFileProvider;", "Landroidx/core/content/FileProvider;", "Landroid/content/Context;", "context", "Landroid/content/pm/ProviderInfo;", "info", "", "attachInfo", "Landroid/net/Uri;", "uri", "", "", "projection", "selection", "selectionArgs", "sortOrder", "Landroid/os/CancellationSignal;", "cancellationSignal", "Landroid/database/Cursor;", SearchIntents.EXTRA_QUERY, "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Landroid/os/CancellationSignal;)Landroid/database/Cursor;", "<init>", "()V", "Companion", "app_mexicoProdGoogleRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nLegacyFileProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LegacyFileProvider.kt\ncom/bbva/glomohybrid/files/LegacyFileProvider\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,95:1\n13374#2,3:96\n1#3:99\n*S KotlinDebug\n*F\n+ 1 LegacyFileProvider.kt\ncom/bbva/glomohybrid/files/LegacyFileProvider\n*L\n38#1:96,3\n*E\n"})
public final class LegacyFileProvider extends FileProvider {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public static final String[] f32165q0 = {"_display_name", "_size", "mime_type", "_data"};

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ComposedStrategy f32166p0;

    @Override // androidx.core.content.FileProvider, android.content.ContentProvider
    public void attachInfo(@NotNull Context context, @NotNull ProviderInfo info) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(info, "info");
        super.attachInfo(context, info);
        String authority = info.authority;
        Intrinsics.checkNotNullExpressionValue(authority, "authority");
        ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider(authority, 128);
        if (providerInfoResolveContentProvider == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        XmlResourceParser xmlResourceParserLoadXmlMetaData = providerInfoResolveContentProvider.loadXmlMetaData(context.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
        if (xmlResourceParserLoadXmlMetaData == null) {
            throw new IllegalArgumentException("meta-data not provided".toString());
        }
        this.f32166p0 = ComposedStrategy.INSTANCE.from(context, xmlResourceParserLoadXmlMetaData);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.content.ContentProvider
    @NotNull
    public Cursor query(@NotNull Uri uri, @Nullable String[] projection, @Nullable String selection, @Nullable String[] selectionArgs, @Nullable String sortOrder, @Nullable CancellationSignal cancellationSignal) {
        Object name;
        Intrinsics.checkNotNullParameter(uri, "uri");
        if (projection == null) {
            projection = f32165q0;
        }
        int length = projection.length;
        String[] strArr = new String[length];
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            strArr[i11] = "";
        }
        int length2 = projection.length;
        Object[] objArr = new Object[length2];
        int i12 = 0;
        while (true) {
            name = null;
            if (i12 >= length2) {
                break;
            }
            objArr[i12] = null;
            i12++;
        }
        int length3 = projection.length;
        int i13 = 0;
        while (i10 < length3) {
            String str = projection[i10];
            int i14 = i13 + 1;
            strArr[i13] = str;
            switch (str.hashCode()) {
                case -488395321:
                    if (str.equals("_display_name")) {
                        ComposedStrategy composedStrategy = this.f32166p0;
                        if (composedStrategy == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("strategy");
                            composedStrategy = null;
                        }
                        name = composedStrategy.getName(uri);
                    }
                    break;
                case -196041627:
                    if (str.equals("mime_type")) {
                        name = getType(uri);
                    }
                    break;
                case 90810505:
                    if (str.equals("_data")) {
                        name = uri.toString();
                    }
                    break;
                case 91265248:
                    if (str.equals("_size")) {
                        ComposedStrategy composedStrategy2 = this.f32166p0;
                        if (composedStrategy2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("strategy");
                            composedStrategy2 = null;
                        }
                        name = composedStrategy2.getLength(uri);
                    }
                    break;
                default:
                    break;
            }
            objArr[i13] = name;
            i10++;
            i13 = i14;
        }
        MatrixCursor matrixCursor = new MatrixCursor(strArr, 1);
        matrixCursor.addRow(objArr);
        return matrixCursor;
    }
}
