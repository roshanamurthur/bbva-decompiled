package net.lingala.zip4j.model;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class ZipModel implements Cloneable {
    public boolean F0;
    public long G0;
    public long H0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public boolean f85075w0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public File f85077y0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public List<LocalFileHeader> f85069p0 = new ArrayList();

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public List<DataDescriptor> f85070q0 = new ArrayList();

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public ArchiveExtraDataRecord f85071r0 = new ArchiveExtraDataRecord();

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public CentralDirectory f85072s0 = new CentralDirectory();

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public EndOfCentralDirectoryRecord f85073t0 = new EndOfCentralDirectoryRecord();

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public Zip64EndOfCentralDirectoryLocator f85074u0 = new Zip64EndOfCentralDirectoryLocator();
    public Zip64EndOfCentralDirectoryRecord v0 = new Zip64EndOfCentralDirectoryRecord();
    public boolean E0 = false;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public long f85076x0 = -1;

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public ArchiveExtraDataRecord getArchiveExtraDataRecord() {
        return this.f85071r0;
    }

    public CentralDirectory getCentralDirectory() {
        return this.f85072s0;
    }

    public List<DataDescriptor> getDataDescriptors() {
        return this.f85070q0;
    }

    public long getEnd() {
        return this.H0;
    }

    public EndOfCentralDirectoryRecord getEndOfCentralDirectoryRecord() {
        return this.f85073t0;
    }

    public List<LocalFileHeader> getLocalFileHeaders() {
        return this.f85069p0;
    }

    public long getSplitLength() {
        return this.f85076x0;
    }

    public long getStart() {
        return this.G0;
    }

    public Zip64EndOfCentralDirectoryLocator getZip64EndOfCentralDirectoryLocator() {
        return this.f85074u0;
    }

    public Zip64EndOfCentralDirectoryRecord getZip64EndOfCentralDirectoryRecord() {
        return this.v0;
    }

    public File getZipFile() {
        return this.f85077y0;
    }

    public boolean isNestedZipFile() {
        return this.F0;
    }

    public boolean isSplitArchive() {
        return this.f85075w0;
    }

    public boolean isZip64Format() {
        return this.E0;
    }

    public void setArchiveExtraDataRecord(ArchiveExtraDataRecord archiveExtraDataRecord) {
        this.f85071r0 = archiveExtraDataRecord;
    }

    public void setCentralDirectory(CentralDirectory centralDirectory) {
        this.f85072s0 = centralDirectory;
    }

    public void setDataDescriptors(List<DataDescriptor> list) {
        this.f85070q0 = list;
    }

    public void setEnd(long j10) {
        this.H0 = j10;
    }

    public void setEndOfCentralDirectoryRecord(EndOfCentralDirectoryRecord endOfCentralDirectoryRecord) {
        this.f85073t0 = endOfCentralDirectoryRecord;
    }

    public void setLocalFileHeaders(List<LocalFileHeader> list) {
        this.f85069p0 = list;
    }

    public void setNestedZipFile(boolean z10) {
        this.F0 = z10;
    }

    public void setSplitArchive(boolean z10) {
        this.f85075w0 = z10;
    }

    public void setSplitLength(long j10) {
        this.f85076x0 = j10;
    }

    public void setStart(long j10) {
        this.G0 = j10;
    }

    public void setZip64EndOfCentralDirectoryLocator(Zip64EndOfCentralDirectoryLocator zip64EndOfCentralDirectoryLocator) {
        this.f85074u0 = zip64EndOfCentralDirectoryLocator;
    }

    public void setZip64EndOfCentralDirectoryRecord(Zip64EndOfCentralDirectoryRecord zip64EndOfCentralDirectoryRecord) {
        this.v0 = zip64EndOfCentralDirectoryRecord;
    }

    public void setZip64Format(boolean z10) {
        this.E0 = z10;
    }

    public void setZipFile(File file) {
        this.f85077y0 = file;
    }
}
