package net.lingala.zip4j.model.enums;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;

/* JADX INFO: loaded from: classes12.dex */
public enum RandomAccessFileMode {
    READ("r"),
    WRITE(RootService.RW);

    private String value;

    RandomAccessFileMode(String str) {
        this.value = str;
    }

    public String getValue() {
        return this.value;
    }
}
