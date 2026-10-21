package com.salesforce.marketingcloud.sfmcsdk.components.storage;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.salesforce.marketingcloud.sfmcsdk.SFMCSdkComponents;
import com.salesforce.marketingcloud.sfmcsdk.util.FileUtilsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SFMCSdkSQLiteOpenHelper.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lcom/salesforce/marketingcloud/sfmcsdk/components/storage/SFMCSdkSQLiteOpenHelper;", "Landroid/database/sqlite/SQLiteOpenHelper;", "databaseName", "", "version", "", "components", "Lcom/salesforce/marketingcloud/sfmcsdk/SFMCSdkComponents;", "(Ljava/lang/String;ILcom/salesforce/marketingcloud/sfmcsdk/SFMCSdkComponents;)V", "sfmcsdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public abstract class SFMCSdkSQLiteOpenHelper extends SQLiteOpenHelper {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SFMCSdkSQLiteOpenHelper(@NotNull String databaseName, int i10, @NotNull SFMCSdkComponents components) {
        super(components.getContext(), FileUtilsKt.getFilenameForModuleInstallation(databaseName, components.getModuleApplicationId(), components.getRegistrationId()), (SQLiteDatabase.CursorFactory) null, i10);
        Intrinsics.checkNotNullParameter(databaseName, "databaseName");
        Intrinsics.checkNotNullParameter(components, "components");
    }
}
