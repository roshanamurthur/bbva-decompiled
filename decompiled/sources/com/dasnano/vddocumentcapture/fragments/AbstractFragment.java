package com.dasnano.vddocumentcapture.fragments;

import com.dasnano.vddocumentcapture.config.VDDocumentConfiguration;
import com.dasnano.vddocumentcapture.model.DocumentClassificationViewModel;
import com.veridas.fragment.DasFragment;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AbstractFragment.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0014J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006H\u0014¨\u0006\b"}, d2 = {"Lcom/dasnano/vddocumentcapture/fragments/AbstractFragment;", "Lcom/veridas/fragment/DasFragment;", "Lcom/dasnano/vddocumentcapture/config/VDDocumentConfiguration;", "Lcom/dasnano/vddocumentcapture/model/DocumentClassificationViewModel;", "()V", "getConfigurationClass", "Ljava/lang/Class;", "getViewModelClass", "document-capture_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class AbstractFragment extends DasFragment<VDDocumentConfiguration, DocumentClassificationViewModel> {
    @Override // com.veridas.fragment.DasFragment
    @NotNull
    public Class<VDDocumentConfiguration> getConfigurationClass() {
        return VDDocumentConfiguration.class;
    }

    @Override // com.veridas.fragment.DasFragment
    @NotNull
    public Class<DocumentClassificationViewModel> getViewModelClass() {
        return DocumentClassificationViewModel.class;
    }
}
