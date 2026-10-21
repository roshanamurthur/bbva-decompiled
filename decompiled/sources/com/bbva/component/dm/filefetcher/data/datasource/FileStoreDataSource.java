package com.bbva.component.dm.filefetcher.data.datasource;

import android.content.Context;
import com.bbva.component.dm.filefetcher.data.model.FileRequest;
import com.bbva.component.dm.filefetcher.data.model.StoreParams;
import com.bbva.component.dm.filefetcher.domain.exceptions.EmptyResponseException;
import com.bbva.io.file.FileIOKt;
import com.bbva.io.file.Source;
import com.bbva.library.digipassmanager.constants.DigipassManagerConstants;
import com.bbva.network.model.response.NetworkResponse;
import java.io.File;
import java.io.InputStream;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FileStoreDataSource.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\u000e"}, d2 = {"Lcom/bbva/component/dm/filefetcher/data/datasource/FileStoreDataSource;", "", "Lcom/bbva/network/model/response/NetworkResponse;", DigipassManagerConstants.KEY_RESPONSE, "Lcom/bbva/component/dm/filefetcher/data/model/FileRequest;", "fileRequest", "Ljava/io/File;", "generateFile", "Landroid/content/Context;", "context", "Lcom/bbva/component/dm/filefetcher/data/model/StoreParams;", "storeParams", "<init>", "(Landroid/content/Context;Lcom/bbva/component/dm/filefetcher/data/model/StoreParams;)V", "component-dm-filefetcher_release"}, k = 1, mv = {1, 4, 0})
public final class FileStoreDataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f27615a;

    public FileStoreDataSource(@NotNull Context context, @NotNull StoreParams storeParams) {
        this.f27615a = new File(context.getFilesDir(), storeParams.getFolderName());
    }

    @NotNull
    public final File generateFile(@NotNull NetworkResponse response, @NotNull FileRequest fileRequest) throws EmptyResponseException {
        InputStream inputStream = response.getBody().inputStream();
        if (inputStream == null) {
            throw new EmptyResponseException();
        }
        File file = new File(this.f27615a, fileRequest.getFileName() + '.' + fileRequest.getFileType().getExtension());
        FileIOKt.write(file, new Source.InputStreamSource(inputStream));
        return file;
    }
}
