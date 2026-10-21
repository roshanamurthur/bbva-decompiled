package org.junit.runner;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public final class JUnitCommandLineParseResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f91973a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f91974b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f91975c = new ArrayList();

    public static class CommandLineParserError extends Exception {
        public CommandLineParserError(String str) {
            super(str);
        }
    }
}
