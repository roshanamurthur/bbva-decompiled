package com.bbva.glomohybrid.base.file.constants;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FileConstants.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/bbva/glomohybrid/base/file/constants/FileConstants;", "", "()V", "FILE_PROVIDER_SHARED_FOLDER_NAME", "", "FILE_PROVIDER_SUFFIX", "REMOVE_FILE_DELAY_IN_SECONDS", "", "Base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class FileConstants {

    @NotNull
    public static final String FILE_PROVIDER_SHARED_FOLDER_NAME = "glomo_storage";

    @NotNull
    public static final String FILE_PROVIDER_SUFFIX = ".fileprovider";

    @NotNull
    public static final FileConstants INSTANCE = new FileConstants();
    public static final long REMOVE_FILE_DELAY_IN_SECONDS = 1;
}
